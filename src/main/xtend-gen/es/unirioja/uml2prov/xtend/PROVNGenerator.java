package es.unirioja.uml2prov.xtend;

import es.unirioja.uml2prov.xtend.prov.Activity;
import es.unirioja.uml2prov.xtend.prov.Agent;
import es.unirioja.uml2prov.xtend.prov.Association;
import es.unirioja.uml2prov.xtend.prov.Attribution;
import es.unirioja.uml2prov.xtend.prov.Communication;
import es.unirioja.uml2prov.xtend.prov.Derivation;
import es.unirioja.uml2prov.xtend.prov.Document;
import es.unirioja.uml2prov.xtend.prov.Entity;
import es.unirioja.uml2prov.xtend.prov.Generation;
import es.unirioja.uml2prov.xtend.prov.Invalidation;
import es.unirioja.uml2prov.xtend.prov.Membership;
import es.unirioja.uml2prov.xtend.prov.PAttribute;
import es.unirioja.uml2prov.xtend.prov.Specialization;
import es.unirioja.uml2prov.xtend.prov.Start;
import es.unirioja.uml2prov.xtend.prov.Usage;
import java.io.PrintStream;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PROVNGenerator {
  public void manageDocument(final Document doc, final PrintStream o) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field entity is undefined for the type Document"
      + "\nThe method or field agent is undefined for the type Document"
      + "\nThe method or field activity is undefined for the type Document"
      + "\nThe method or field wasStartedBy is undefined for the type Document"
      + "\nThe method or field wasGeneratedBy is undefined for the type Document"
      + "\nThe method or field used is undefined for the type Document"
      + "\nThe method or field wasInformedBy is undefined for the type Document"
      + "\nThe method or field wasInvalidatedBy is undefined for the type Document"
      + "\nThe method or field wasDerivedFrom is undefined for the type Document"
      + "\nThe method or field hadMember is undefined for the type Document"
      + "\nThe method or field specializationOf is undefined for the type Document"
      + "\nThe method or field wasAttributedTo is undefined for the type Document"
      + "\nThe method or field wasAssociatedWith is undefined for the type Document");
  }
  
  public CharSequence manageEntity(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entity(�entity.id�, �entityAttributeTemplate(entity)�)");
    return _builder;
  }
  
  public CharSequence manageAgent(final Agent agent) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("agent(�agent.id�, �agentAttributeTemplate(agent)�)");
    return _builder;
  }
  
  public CharSequence manageActivity(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("activity(�activity.id�, �activityAttributeTemplate(activity)�)");
    return _builder;
  }
  
  public CharSequence entityAttributeTemplate(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[�IF e.value!=null�prov:value=\'�e.value.toString()�\'�IF !e.type.isEmpty�,�ENDIF��ENDIF��IF !e.type.isEmpty��FOR ty : e.type�prov:type=\'�ty.toString�\'�IF ty != e.type.last()�,�ENDIF��ENDFOR��IF !e.anyAttribute.isEmpty�,�manageAttributeTemplate(e.anyAttribute)��ENDIF��ENDIF�]");
    return _builder;
  }
  
  public CharSequence agentAttributeTemplate(final Agent a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[�IF !a.type.isEmpty��FOR ty : a.type�prov:type=\'�ty.toString()�\'�IF ty != a.type.last()�,�ENDIF��ENDFOR��IF !a.anyAttribute.isEmpty�,�manageAttributeTemplate(a.anyAttribute)��ENDIF��ENDIF�]");
    return _builder;
  }
  
  public CharSequence activityAttributeTemplate(final Activity a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(",[tmpl:startTime=\'�a.id�StartTime\', tmpl:endTime=\'�a.id�EndTime\' �IF !a.type.isEmpty || !a.anyAttribute.isEmpty �,�ENDIF��IF !a.type.isEmpty��FOR ty : a.type�prov:type=\'�ty.toString()�\'�IF ty != a.type.last()�,�ENDIF��ENDFOR�\t�IF !a.anyAttribute.isEmpty�,�ENDIF��ENDIF��IF !a.anyAttribute.isEmpty�\t�FOR attr : a.anyAttribute��attr.key�=\'�attr.value�\'�IF attr != a.anyAttribute.last()�,�ENDIF��ENDFOR��ENDIF�]");
    return _builder;
  }
  
  public CharSequence wStartedByTemplate(final Start s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wasStartedBy(�s.activity.ref�, �IF s.starter==null�-�ENDIF� �IF s.starter!=null� �s.starter.ref��ENDIF�, �IF s.trigger==null�-�ENDIF� �IF s.trigger!=null� �s.trigger.ref��ENDIF�,- �IF !s.anyAttribute.isEmpty��manageAttributeTemplate(s.anyAttribute)��ENDIF�)   ");
    return _builder;
  }
  
  public CharSequence wgbTemplate(final Generation s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wasGeneratedBy(�s.entity.ref�,�s.activity.ref�,- �IF !s.anyAttribute.isEmpty��manageAttributeTemplate(s.anyAttribute)��ENDIF�)");
    return _builder;
  }
  
  public CharSequence usedTemplate(final Usage u) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("used(�u.activity.ref�, �u.entity.ref�,- �usageAttributeTemplate(u)�)");
    return _builder;
  }
  
  public CharSequence usageAttributeTemplate(final Usage u) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(", [�IF u.type!=null��FOR ty : u.type�prov:type=\'�ty.toString()�\'�IF ty != u.type.last()�,�ENDIF��ENDFOR��IF !u.anyAttribute.isEmpty�,�ENDIF��ENDIF��IF !u.anyAttribute.isEmpty��FOR attr : u.anyAttribute��attr.key�=\'�attr.value�\'�IF attr != u.anyAttribute.last()�,�ENDIF��ENDFOR��ENDIF�]");
    return _builder;
  }
  
  public CharSequence wInfByTemplate(final Communication i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wasInformedBy(�i.informed.ref�, �i.informant.ref��IF !i.anyAttribute.isEmpty�, �manageAttributeTemplate(i.anyAttribute)��ENDIF�)");
    return _builder;
  }
  
  public CharSequence wibTemplate(final Invalidation i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wasInvalidatedBy(�i.entity.ref�, �i.activity.ref�, - �IF !i.anyAttribute.isEmpty��manageAttributeTemplate(i.anyAttribute)��ENDIF�)");
    return _builder;
  }
  
  public CharSequence wdfTemplate(final Derivation d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wasDerivedFrom(�d.generatedEntity.ref�, �d.usedEntity.ref� �derivationAttributeTemplate(d)�)   ");
    return _builder;
  }
  
  public CharSequence derivationAttributeTemplate(final Derivation d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(",[�IF d.type!=null��FOR ty : d.type�prov:type=\'�ty.toString()�\'�IF ty != d.type.last()�,�ENDIF��ENDFOR��IF !d.anyAttribute.isEmpty�,�ENDIF��ENDIF��IF !d.anyAttribute.isEmpty��FOR attr : d.anyAttribute��attr.key��attr.key�=\'�attr.value�\'�IF attr != d.anyAttribute.last()�,�ENDIF��ENDFOR��ENDIF�]");
    return _builder;
  }
  
  public CharSequence hmTemplate(final Membership m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("�FOR e : m.entity�hadMember(�m.collection.ref�,�e.ref�)�ENDFOR�");
    return _builder;
  }
  
  public CharSequence spOTemplate(final Specialization s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("specializationOf(�s.specificEntity.ref�, �s.generalEntity.ref�)");
    return _builder;
  }
  
  public CharSequence watTemplate(final Attribution a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wasAttributedTo(�a.entity.ref�, �a.agent.ref� �IF !a.anyAttribute.isEmpty��watAttributes(a)��ENDIF�)");
    return _builder;
  }
  
  public CharSequence watAttributes(final Attribution a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(",[�IF !a.type.isEmpty��FOR ty : a.type�prov:type=\'�ty.toString()�\'�IF ty != a.type.last()�,�ENDIF��ENDFOR��IF !a.anyAttribute.isEmpty�,�manageAttributeTemplate(a.anyAttribute)��ENDIF��ENDIF�]");
    return _builder;
  }
  
  public CharSequence wawTemplate(final Association a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wasAssociatedWith(�a.activity.ref�, �a.agent.ref�, - �IF !a.anyAttribute.isEmpty��wawAttributes(a)��ENDIF�)");
    return _builder;
  }
  
  public CharSequence wawAttributes(final Association a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(",[�IF !a.type.isEmpty��FOR ty : a.type�prov:type=\'�ty.toString()�\'�IF ty != a.type.last()�,�ENDIF��ENDFOR��IF !a.anyAttribute.isEmpty�,�manageAttributeTemplate(a.anyAttribute)��ENDIF��ENDIF�]");
    return _builder;
  }
  
  public CharSequence manageAttributeTemplate(final /* EList<PAttribute> */Object atts) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("�FOR attr : atts��attr.key�=\'�attr.value�\'�IF attr != atts.last()�,�ENDIF��ENDFOR�");
    return _builder;
  }
  
  public static void main(final String[] args) {
    new PROVNGenerator().generate("provModelClass.xmi", "templates/class");
    new PROVNGenerator().generate("provModelSm.xmi", "templates/state");
    new PROVNGenerator().generate("provModelSeq.xmi", "templates/sequence");
  }
  
  public void generate(final String file, final String folder) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Resource is undefined"
      + "\nXMIResourceFactoryImpl cannot be resolved."
      + "\nResourceSetImpl cannot be resolved."
      + "\nThe method or field URI is undefined"
      + "\nThe method or field FileUtils is undefined"
      + "\n+ cannot be resolved."
      + "\nFactory cannot be resolved"
      + "\nRegistry cannot be resolved"
      + "\nINSTANCE cannot be resolved"
      + "\nextensionToFactoryMap cannot be resolved"
      + "\nput cannot be resolved"
      + "\ngetPackageRegistry cannot be resolved"
      + "\nput cannot be resolved"
      + "\ngetResource cannot be resolved"
      + "\ncreateURI cannot be resolved"
      + "\ndeleteDirectory cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\neContents cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nid cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  public CharSequence header() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("document");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("prefix prov <http://www.w3.org/ns/prov#>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("prefix tmpl <http://openprovenance.org/tmpl#>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("prefix var <http://openprovenance.org/var#>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("prefix exe <http://example.org/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("prefix u2p <http://uml2prov.org/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("bundle exe:bundle1");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence footnote() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("endBundle");
    _builder.newLine();
    _builder.append("endDocument");
    _builder.newLine();
    return _builder;
  }
}
