package es.unirioja.uml2prov.xtend

import es.unirioja.uml2prov.xtend.prov.Activity
import es.unirioja.uml2prov.xtend.prov.Agent
import es.unirioja.uml2prov.xtend.prov.Association
import es.unirioja.uml2prov.xtend.prov.Attribution
import es.unirioja.uml2prov.xtend.prov.Communication
import es.unirioja.uml2prov.xtend.prov.Derivation
import es.unirioja.uml2prov.xtend.prov.Document
import es.unirioja.uml2prov.xtend.prov.Entity
import es.unirioja.uml2prov.xtend.prov.Generation
import es.unirioja.uml2prov.xtend.prov.Invalidation
import es.unirioja.uml2prov.xtend.prov.Membership
import es.unirioja.uml2prov.xtend.prov.PAttribute
import es.unirioja.uml2prov.xtend.prov.ProvPackage
import es.unirioja.uml2prov.xtend.prov.Specialization
import es.unirioja.uml2prov.xtend.prov.Start
import es.unirioja.uml2prov.xtend.prov.Usage
import java.io.File
import java.io.PrintStream
import org.apache.commons.io.FileUtils
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class PROVNGenerator {


	
  	def manageDocument(Document doc, PrintStream o) {
  		o.println('
				document
					prefix prov <http://www.w3.org/ns/prov#>
					prefix tmpl <http://openprovenance.org/tmpl#>
					prefix var <http://openprovenance.org/var#>
					prefix exe <http://example.org/>
					prefix u2p <http://uml2prov.org/>
					
					bundle exe:bundle1
		')
 
		  			for (entity : doc.entity)			 	{o.println(manageEntity(entity))}
			  		for (agent : doc.agent) 				{o.println(manageAgent(agent))}
			  		for (activity : doc.activity) 			{o.println(manageActivity(activity))}
			  		for (wsb : doc.wasStartedBy) 			{o.println(wStartedByTemplate(wsb))}
			  		for (wgb : doc.wasGeneratedBy) 			{o.println(wgbTemplate(wgb))}
			  		for (u : doc.used) 						{o.println(usedTemplate(u))}
			  		for (wInfB : doc.wasInformedBy) 		{o.println(wInfByTemplate(wInfB))}
			  		for (wInvB : doc.wasInvalidatedBy) 		{o.println(wibTemplate(wInvB))}
			  		for (wdf : doc.wasDerivedFrom) 			{o.println(wdfTemplate(wdf))}
			  		for (hm : doc.hadMember) 				{o.println(hmTemplate(hm))} //
			  		for (so : doc.specializationOf) 		{o.println(spOTemplate(so))} //
			  		for (wat : doc.wasAttributedTo) 		{o.println(watTemplate(wat))}
			  		for (waw : doc.wasAssociatedWith) 		{o.println(wawTemplate(waw))}
	  		
	  	o.println('''		
				endBundle
				endDocument''');
  	}
  	
  	
	def manageEntity(Entity entity) {
		'''entity(«entity.id», «entityAttributeTemplate(entity)»)'''
	}

	
	def manageAgent(Agent agent)
	 			'''agent(«agent.id», «agentAttributeTemplate(agent)»)'''
	def manageActivity(Activity activity)
	 	'''activity(«activity.id», «activityAttributeTemplate(activity)»)'''
	def entityAttributeTemplate(Entity e)
	 '''[«IF e.value!=null»prov:value='«e.value.toString()»'«IF !e.type.isEmpty»,«ENDIF»«ENDIF»«IF !e.type.isEmpty»«FOR ty : e.type»prov:type='«ty.toString»'«IF ty != e.type.last()»,«ENDIF»«ENDFOR»«IF !e.anyAttribute.isEmpty»,«manageAttributeTemplate(e.anyAttribute)»«ENDIF»«ENDIF»]'''		
	def agentAttributeTemplate(Agent a)
	 '''[«IF !a.type.isEmpty»«FOR ty : a.type»prov:type='«ty.toString()»'«IF ty != a.type.last()»,«ENDIF»«ENDFOR»«IF !a.anyAttribute.isEmpty»,«manageAttributeTemplate(a.anyAttribute)»«ENDIF»«ENDIF»]'''
	def activityAttributeTemplate(Activity a)
	 ''',[tmpl:startTime='«a.id»StartTime', tmpl:endTime='«a.id»EndTime' «IF !a.type.isEmpty || !a.anyAttribute.isEmpty »,«ENDIF»«IF !a.type.isEmpty»«FOR ty : a.type»prov:type='«ty.toString()»'«IF ty != a.type.last()»,«ENDIF»«ENDFOR»	«IF !a.anyAttribute.isEmpty»,«ENDIF»«ENDIF»«IF !a.anyAttribute.isEmpty»	«FOR attr : a.anyAttribute»«attr.key»='«attr.value»'«IF attr != a.anyAttribute.last()»,«ENDIF»«ENDFOR»«ENDIF»]'''
	def wStartedByTemplate(Start s)
	 '''wasStartedBy(«s.activity.ref», «IF s.starter==null»-«ENDIF» «IF s.starter!=null» «s.starter.ref»«ENDIF», «IF s.trigger==null»-«ENDIF» «IF s.trigger!=null» «s.trigger.ref»«ENDIF»,- «IF !s.anyAttribute.isEmpty»«manageAttributeTemplate(s.anyAttribute)»«ENDIF»)   '''				
	def wgbTemplate(Generation s)
	 '''wasGeneratedBy(«s.entity.ref»,«s.activity.ref»,- «IF !s.anyAttribute.isEmpty»«manageAttributeTemplate(s.anyAttribute)»«ENDIF»)'''				
	def usedTemplate(Usage u)
	 '''used(«u.activity.ref», «u.entity.ref»,- «usageAttributeTemplate(u)»)'''
	def usageAttributeTemplate(Usage u)
	 ''', [«IF u.type!=null»«FOR ty : u.type»prov:type='«ty.toString()»'«IF ty != u.type.last()»,«ENDIF»«ENDFOR»«IF !u.anyAttribute.isEmpty»,«ENDIF»«ENDIF»«IF !u.anyAttribute.isEmpty»«FOR attr : u.anyAttribute»«attr.key»='«attr.value»'«IF attr != u.anyAttribute.last()»,«ENDIF»«ENDFOR»«ENDIF»]'''
	def wInfByTemplate(Communication i)
	 '''wasInformedBy(«i.informed.ref», «i.informant.ref»«IF !i.anyAttribute.isEmpty», «manageAttributeTemplate(i.anyAttribute)»«ENDIF»)'''
	def wibTemplate(Invalidation i)
	 '''wasInvalidatedBy(«i.entity.ref», «i.activity.ref», - «IF !i.anyAttribute.isEmpty»«manageAttributeTemplate(i.anyAttribute)»«ENDIF»)'''
	def wdfTemplate(Derivation d)
	 '''wasDerivedFrom(«d.generatedEntity.ref», «d.usedEntity.ref» «derivationAttributeTemplate(d)»)   '''
	def derivationAttributeTemplate(Derivation d)
	 ''',[«IF d.type!=null»«FOR ty : d.type»prov:type='«ty.toString()»'«IF ty != d.type.last()»,«ENDIF»«ENDFOR»«IF !d.anyAttribute.isEmpty»,«ENDIF»«ENDIF»«IF !d.anyAttribute.isEmpty»«FOR attr : d.anyAttribute»«attr.key»«attr.key»='«attr.value»'«IF attr != d.anyAttribute.last()»,«ENDIF»«ENDFOR»«ENDIF»]'''
	def hmTemplate(Membership m)
	'''«FOR e : m.entity»hadMember(«m.collection.ref»,«e.ref»)«ENDFOR»'''
	def spOTemplate(Specialization s)
	'''specializationOf(«s.specificEntity.ref», «s.generalEntity.ref»)'''
	def watTemplate(Attribution a)
	'''wasAttributedTo(«a.entity.ref», «a.agent.ref» «IF !a.anyAttribute.isEmpty»«watAttributes(a)»«ENDIF»)'''
	def watAttributes(Attribution a)
	''',[«IF !a.type.isEmpty»«FOR ty : a.type»prov:type='«ty.toString()»'«IF ty != a.type.last()»,«ENDIF»«ENDFOR»«IF !a.anyAttribute.isEmpty»,«manageAttributeTemplate(a.anyAttribute)»«ENDIF»«ENDIF»]'''
	def wawTemplate(Association a)
	'''wasAssociatedWith(«a.activity.ref», «a.agent.ref», - «IF !a.anyAttribute.isEmpty»«wawAttributes(a)»«ENDIF»)'''
	def wawAttributes(Association a)
	 ''',[«IF !a.type.isEmpty»«FOR ty : a.type»prov:type='«ty.toString()»'«IF ty != a.type.last()»,«ENDIF»«ENDFOR»«IF !a.anyAttribute.isEmpty»,«manageAttributeTemplate(a.anyAttribute)»«ENDIF»«ENDIF»]'''	
	def manageAttributeTemplate(EList<PAttribute> atts)
	 '''«FOR attr : atts»«attr.key»='«attr.value»'«IF attr != atts.last()»,«ENDIF»«ENDFOR»'''




	
	def static void main(String[] args) {
		new PROVNGenerator().generate("provModelClass.xmi", "templates/class");
		new PROVNGenerator().generate("provModelSm.xmi", "templates/state");
		new PROVNGenerator().generate("provModelSeq.xmi", "templates/sequence");	
	}

	def generate(String file, String folder) {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
		val resourceSet = new ResourceSetImpl
		resourceSet.getPackageRegistry().put("http://www.w3.org/ns/prov", ProvPackage.eINSTANCE);
		val resource = resourceSet.getResource(URI.createURI(file), true)

		//vacio y creo de nuevo la ruta
		if(new File(folder).exists)	FileUtils.deleteDirectory(new File(folder));
		new File(folder).mkdirs;


		for (documents : resource.contents) {
			// nuevo fichero
			for (document : documents.eContents) {			
				if (document instanceof Document) {
					var fos = new PrintStream(new File(folder+"/"+document.id+".provn"));
					manageDocument(document, fos)
				}

			}
		}
	}
	
	def header()'''
		document
			prefix prov <http://www.w3.org/ns/prov#>
			prefix tmpl <http://openprovenance.org/tmpl#>
			prefix var <http://openprovenance.org/var#>
			prefix exe <http://example.org/>
			prefix u2p <http://uml2prov.org/>
			
			bundle exe:bundle1
	'''
	
	def footnote()'''
		endBundle
		endDocument
	'''
	

}
	