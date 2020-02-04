package es.unirioja.uml2prov.xtend;

import com.google.common.base.Objects;
import es.unirioja.uml2prov.xtend.prov.Activity;
import es.unirioja.uml2prov.xtend.prov.Agent;
import es.unirioja.uml2prov.xtend.prov.Association;
import es.unirioja.uml2prov.xtend.prov.Attribution;
import es.unirioja.uml2prov.xtend.prov.Communication;
import es.unirioja.uml2prov.xtend.prov.Derivation;
import es.unirioja.uml2prov.xtend.prov.Document;
import es.unirioja.uml2prov.xtend.prov.Entity;
import es.unirioja.uml2prov.xtend.prov.Generation;
import es.unirioja.uml2prov.xtend.prov.IDRef;
import es.unirioja.uml2prov.xtend.prov.Invalidation;
import es.unirioja.uml2prov.xtend.prov.Membership;
import es.unirioja.uml2prov.xtend.prov.PAttribute;
import es.unirioja.uml2prov.xtend.prov.ProvPackage;
import es.unirioja.uml2prov.xtend.prov.Specialization;
import es.unirioja.uml2prov.xtend.prov.Start;
import es.unirioja.uml2prov.xtend.prov.Usage;
import java.io.File;
import java.io.PrintStream;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class PROVNGenerator {
  public void manageDocument(final Document doc, final PrintStream o) {
    o.println("\r\n\t\t\t\tdocument\r\n\t\t\t\t\tprefix prov <http://www.w3.org/ns/prov#>\r\n\t\t\t\t\tprefix tmpl <http://openprovenance.org/tmpl#>\r\n\t\t\t\t\tprefix var <http://openprovenance.org/var#>\r\n\t\t\t\t\tprefix exe <http://example.org/>\r\n\t\t\t\t\tprefix u2p <http://uml2prov.org/>\r\n\t\t\t\t\t\r\n\t\t\t\t\tbundle exe:bundle1\r\n\t\t");
    EList<Entity> _entity = doc.getEntity();
    for (final Entity entity : _entity) {
      o.println(this.manageEntity(entity));
    }
    EList<Agent> _agent = doc.getAgent();
    for (final Agent agent : _agent) {
      o.println(this.manageAgent(agent));
    }
    EList<Activity> _activity = doc.getActivity();
    for (final Activity activity : _activity) {
      o.println(this.manageActivity(activity));
    }
    EList<Start> _wasStartedBy = doc.getWasStartedBy();
    for (final Start wsb : _wasStartedBy) {
      o.println(this.wStartedByTemplate(wsb));
    }
    EList<Generation> _wasGeneratedBy = doc.getWasGeneratedBy();
    for (final Generation wgb : _wasGeneratedBy) {
      o.println(this.wgbTemplate(wgb));
    }
    EList<Usage> _used = doc.getUsed();
    for (final Usage u : _used) {
      o.println(this.usedTemplate(u));
    }
    EList<Communication> _wasInformedBy = doc.getWasInformedBy();
    for (final Communication wInfB : _wasInformedBy) {
      o.println(this.wInfByTemplate(wInfB));
    }
    EList<Invalidation> _wasInvalidatedBy = doc.getWasInvalidatedBy();
    for (final Invalidation wInvB : _wasInvalidatedBy) {
      o.println(this.wibTemplate(wInvB));
    }
    EList<Derivation> _wasDerivedFrom = doc.getWasDerivedFrom();
    for (final Derivation wdf : _wasDerivedFrom) {
      o.println(this.wdfTemplate(wdf));
    }
    EList<Membership> _hadMember = doc.getHadMember();
    for (final Membership hm : _hadMember) {
      o.println(this.hmTemplate(hm));
    }
    EList<Specialization> _specializationOf = doc.getSpecializationOf();
    for (final Specialization so : _specializationOf) {
      o.println(this.spOTemplate(so));
    }
    EList<Attribution> _wasAttributedTo = doc.getWasAttributedTo();
    for (final Attribution wat : _wasAttributedTo) {
      o.println(this.watTemplate(wat));
    }
    EList<Association> _wasAssociatedWith = doc.getWasAssociatedWith();
    for (final Association waw : _wasAssociatedWith) {
      o.println(this.wawTemplate(waw));
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("endBundle");
    _builder.newLine();
    _builder.append("endDocument");
    o.println(_builder);
  }
  
  public CharSequence manageEntity(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entity(");
    String _id = entity.getId();
    _builder.append(_id);
    _builder.append(", ");
    CharSequence _entityAttributeTemplate = this.entityAttributeTemplate(entity);
    _builder.append(_entityAttributeTemplate);
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence manageAgent(final Agent agent) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("agent(");
    String _id = agent.getId();
    _builder.append(_id);
    _builder.append(", ");
    CharSequence _agentAttributeTemplate = this.agentAttributeTemplate(agent);
    _builder.append(_agentAttributeTemplate);
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence manageActivity(final Activity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("activity(");
    String _id = activity.getId();
    _builder.append(_id);
    _builder.append(", ");
    CharSequence _activityAttributeTemplate = this.activityAttributeTemplate(activity);
    _builder.append(_activityAttributeTemplate);
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence entityAttributeTemplate(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[");
    {
      Object _value = e.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        _builder.append("prov:value=\'");
        String _string = e.getValue().toString();
        _builder.append(_string);
        _builder.append("\'");
        {
          boolean _isEmpty = e.getType().isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            _builder.append(",");
          }
        }
      }
    }
    {
      boolean _isEmpty_1 = e.getType().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        {
          EList<Object> _type = e.getType();
          for(final Object ty : _type) {
            _builder.append("prov:type=\'");
            String _string_1 = ty.toString();
            _builder.append(_string_1);
            _builder.append("\'");
            {
              Object _last = IterableExtensions.<Object>last(e.getType());
              boolean _notEquals_1 = (!Objects.equal(ty, _last));
              if (_notEquals_1) {
                _builder.append(",");
              }
            }
          }
        }
        {
          boolean _isEmpty_2 = e.getAnyAttribute().isEmpty();
          boolean _not_2 = (!_isEmpty_2);
          if (_not_2) {
            _builder.append(",");
            CharSequence _manageAttributeTemplate = this.manageAttributeTemplate(e.getAnyAttribute());
            _builder.append(_manageAttributeTemplate);
          }
        }
      }
    }
    _builder.append("]");
    return _builder;
  }
  
  public CharSequence agentAttributeTemplate(final Agent a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[");
    {
      boolean _isEmpty = a.getType().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        {
          EList<Object> _type = a.getType();
          for(final Object ty : _type) {
            _builder.append("prov:type=\'");
            String _string = ty.toString();
            _builder.append(_string);
            _builder.append("\'");
            {
              Object _last = IterableExtensions.<Object>last(a.getType());
              boolean _notEquals = (!Objects.equal(ty, _last));
              if (_notEquals) {
                _builder.append(",");
              }
            }
          }
        }
        {
          boolean _isEmpty_1 = a.getAnyAttribute().isEmpty();
          boolean _not_1 = (!_isEmpty_1);
          if (_not_1) {
            _builder.append(",");
            CharSequence _manageAttributeTemplate = this.manageAttributeTemplate(a.getAnyAttribute());
            _builder.append(_manageAttributeTemplate);
          }
        }
      }
    }
    _builder.append("]");
    return _builder;
  }
  
  public CharSequence activityAttributeTemplate(final Activity a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(",[tmpl:startTime=\'");
    String _id = a.getId();
    _builder.append(_id);
    _builder.append("StartTime\', tmpl:endTime=\'");
    String _id_1 = a.getId();
    _builder.append(_id_1);
    _builder.append("EndTime\' ");
    {
      if (((!a.getType().isEmpty()) || (!a.getAnyAttribute().isEmpty()))) {
        _builder.append(",");
      }
    }
    {
      boolean _isEmpty = a.getType().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        {
          EList<Object> _type = a.getType();
          for(final Object ty : _type) {
            _builder.append("prov:type=\'");
            String _string = ty.toString();
            _builder.append(_string);
            _builder.append("\'");
            {
              Object _last = IterableExtensions.<Object>last(a.getType());
              boolean _notEquals = (!Objects.equal(ty, _last));
              if (_notEquals) {
                _builder.append(",");
              }
            }
          }
        }
        _builder.append("\t");
        {
          boolean _isEmpty_1 = a.getAnyAttribute().isEmpty();
          boolean _not_1 = (!_isEmpty_1);
          if (_not_1) {
            _builder.append(",");
          }
        }
      }
    }
    {
      boolean _isEmpty_2 = a.getAnyAttribute().isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\t");
        {
          EList<PAttribute> _anyAttribute = a.getAnyAttribute();
          for(final PAttribute attr : _anyAttribute) {
            String _key = attr.getKey();
            _builder.append(_key);
            _builder.append("=\'");
            String _value = attr.getValue();
            _builder.append(_value);
            _builder.append("\'");
            {
              PAttribute _last_1 = IterableExtensions.<PAttribute>last(a.getAnyAttribute());
              boolean _notEquals_1 = (!Objects.equal(attr, _last_1));
              if (_notEquals_1) {
                _builder.append(",");
              }
            }
          }
        }
      }
    }
    _builder.append("]");
    return _builder;
  }
  
  public CharSequence wStartedByTemplate(final Start s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wasStartedBy(");
    String _ref = s.getActivity().getRef();
    _builder.append(_ref);
    _builder.append(", ");
    {
      IDRef _starter = s.getStarter();
      boolean _equals = Objects.equal(_starter, null);
      if (_equals) {
        _builder.append("-");
      }
    }
    _builder.append(" ");
    {
      IDRef _starter_1 = s.getStarter();
      boolean _notEquals = (!Objects.equal(_starter_1, null));
      if (_notEquals) {
        _builder.append(" ");
        String _ref_1 = s.getStarter().getRef();
        _builder.append(_ref_1);
      }
    }
    _builder.append(", ");
    {
      IDRef _trigger = s.getTrigger();
      boolean _equals_1 = Objects.equal(_trigger, null);
      if (_equals_1) {
        _builder.append("-");
      }
    }
    _builder.append(" ");
    {
      IDRef _trigger_1 = s.getTrigger();
      boolean _notEquals_1 = (!Objects.equal(_trigger_1, null));
      if (_notEquals_1) {
        _builder.append(" ");
        String _ref_2 = s.getTrigger().getRef();
        _builder.append(_ref_2);
      }
    }
    _builder.append(",- ");
    {
      boolean _isEmpty = s.getAnyAttribute().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        CharSequence _manageAttributeTemplate = this.manageAttributeTemplate(s.getAnyAttribute());
        _builder.append(_manageAttributeTemplate);
      }
    }
    _builder.append(")   ");
    return _builder;
  }
  
  public CharSequence wgbTemplate(final Generation s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wasGeneratedBy(");
    String _ref = s.getEntity().getRef();
    _builder.append(_ref);
    _builder.append(",");
    String _ref_1 = s.getActivity().getRef();
    _builder.append(_ref_1);
    _builder.append(",- ");
    {
      boolean _isEmpty = s.getAnyAttribute().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        CharSequence _manageAttributeTemplate = this.manageAttributeTemplate(s.getAnyAttribute());
        _builder.append(_manageAttributeTemplate);
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence usedTemplate(final Usage u) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("used(");
    String _ref = u.getActivity().getRef();
    _builder.append(_ref);
    _builder.append(", ");
    String _ref_1 = u.getEntity().getRef();
    _builder.append(_ref_1);
    _builder.append(",- ");
    CharSequence _usageAttributeTemplate = this.usageAttributeTemplate(u);
    _builder.append(_usageAttributeTemplate);
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence usageAttributeTemplate(final Usage u) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(", [");
    {
      EList<Object> _type = u.getType();
      boolean _notEquals = (!Objects.equal(_type, null));
      if (_notEquals) {
        {
          EList<Object> _type_1 = u.getType();
          for(final Object ty : _type_1) {
            _builder.append("prov:type=\'");
            String _string = ty.toString();
            _builder.append(_string);
            _builder.append("\'");
            {
              Object _last = IterableExtensions.<Object>last(u.getType());
              boolean _notEquals_1 = (!Objects.equal(ty, _last));
              if (_notEquals_1) {
                _builder.append(",");
              }
            }
          }
        }
        {
          boolean _isEmpty = u.getAnyAttribute().isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            _builder.append(",");
          }
        }
      }
    }
    {
      boolean _isEmpty_1 = u.getAnyAttribute().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        {
          EList<PAttribute> _anyAttribute = u.getAnyAttribute();
          for(final PAttribute attr : _anyAttribute) {
            String _key = attr.getKey();
            _builder.append(_key);
            _builder.append("=\'");
            String _value = attr.getValue();
            _builder.append(_value);
            _builder.append("\'");
            {
              PAttribute _last_1 = IterableExtensions.<PAttribute>last(u.getAnyAttribute());
              boolean _notEquals_2 = (!Objects.equal(attr, _last_1));
              if (_notEquals_2) {
                _builder.append(",");
              }
            }
          }
        }
      }
    }
    _builder.append("]");
    return _builder;
  }
  
  public CharSequence wInfByTemplate(final Communication i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wasInformedBy(");
    String _ref = i.getInformed().getRef();
    _builder.append(_ref);
    _builder.append(", ");
    String _ref_1 = i.getInformant().getRef();
    _builder.append(_ref_1);
    {
      boolean _isEmpty = i.getAnyAttribute().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(", ");
        CharSequence _manageAttributeTemplate = this.manageAttributeTemplate(i.getAnyAttribute());
        _builder.append(_manageAttributeTemplate);
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence wibTemplate(final Invalidation i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wasInvalidatedBy(");
    String _ref = i.getEntity().getRef();
    _builder.append(_ref);
    _builder.append(", ");
    String _ref_1 = i.getActivity().getRef();
    _builder.append(_ref_1);
    _builder.append(", - ");
    {
      boolean _isEmpty = i.getAnyAttribute().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        CharSequence _manageAttributeTemplate = this.manageAttributeTemplate(i.getAnyAttribute());
        _builder.append(_manageAttributeTemplate);
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence wdfTemplate(final Derivation d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wasDerivedFrom(");
    String _ref = d.getGeneratedEntity().getRef();
    _builder.append(_ref);
    _builder.append(", ");
    String _ref_1 = d.getUsedEntity().getRef();
    _builder.append(_ref_1);
    _builder.append(" ");
    CharSequence _derivationAttributeTemplate = this.derivationAttributeTemplate(d);
    _builder.append(_derivationAttributeTemplate);
    _builder.append(")   ");
    return _builder;
  }
  
  public CharSequence derivationAttributeTemplate(final Derivation d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(",[");
    {
      EList<Object> _type = d.getType();
      boolean _notEquals = (!Objects.equal(_type, null));
      if (_notEquals) {
        {
          EList<Object> _type_1 = d.getType();
          for(final Object ty : _type_1) {
            _builder.append("prov:type=\'");
            String _string = ty.toString();
            _builder.append(_string);
            _builder.append("\'");
            {
              Object _last = IterableExtensions.<Object>last(d.getType());
              boolean _notEquals_1 = (!Objects.equal(ty, _last));
              if (_notEquals_1) {
                _builder.append(",");
              }
            }
          }
        }
        {
          boolean _isEmpty = d.getAnyAttribute().isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            _builder.append(",");
          }
        }
      }
    }
    {
      boolean _isEmpty_1 = d.getAnyAttribute().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        {
          EList<PAttribute> _anyAttribute = d.getAnyAttribute();
          for(final PAttribute attr : _anyAttribute) {
            String _key = attr.getKey();
            _builder.append(_key);
            String _key_1 = attr.getKey();
            _builder.append(_key_1);
            _builder.append("=\'");
            String _value = attr.getValue();
            _builder.append(_value);
            _builder.append("\'");
            {
              PAttribute _last_1 = IterableExtensions.<PAttribute>last(d.getAnyAttribute());
              boolean _notEquals_2 = (!Objects.equal(attr, _last_1));
              if (_notEquals_2) {
                _builder.append(",");
              }
            }
          }
        }
      }
    }
    _builder.append("]");
    return _builder;
  }
  
  public CharSequence hmTemplate(final Membership m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<IDRef> _entity = m.getEntity();
      for(final IDRef e : _entity) {
        _builder.append("hadMember(");
        String _ref = m.getCollection().getRef();
        _builder.append(_ref);
        _builder.append(",");
        String _ref_1 = e.getRef();
        _builder.append(_ref_1);
        _builder.append(")");
      }
    }
    return _builder;
  }
  
  public CharSequence spOTemplate(final Specialization s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("specializationOf(");
    String _ref = s.getSpecificEntity().getRef();
    _builder.append(_ref);
    _builder.append(", ");
    String _ref_1 = s.getGeneralEntity().getRef();
    _builder.append(_ref_1);
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence watTemplate(final Attribution a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wasAttributedTo(");
    String _ref = a.getEntity().getRef();
    _builder.append(_ref);
    _builder.append(", ");
    String _ref_1 = a.getAgent().getRef();
    _builder.append(_ref_1);
    _builder.append(" ");
    {
      boolean _isEmpty = a.getAnyAttribute().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        CharSequence _watAttributes = this.watAttributes(a);
        _builder.append(_watAttributes);
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence watAttributes(final Attribution a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(",[");
    {
      boolean _isEmpty = a.getType().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        {
          EList<Object> _type = a.getType();
          for(final Object ty : _type) {
            _builder.append("prov:type=\'");
            String _string = ty.toString();
            _builder.append(_string);
            _builder.append("\'");
            {
              Object _last = IterableExtensions.<Object>last(a.getType());
              boolean _notEquals = (!Objects.equal(ty, _last));
              if (_notEquals) {
                _builder.append(",");
              }
            }
          }
        }
        {
          boolean _isEmpty_1 = a.getAnyAttribute().isEmpty();
          boolean _not_1 = (!_isEmpty_1);
          if (_not_1) {
            _builder.append(",");
            CharSequence _manageAttributeTemplate = this.manageAttributeTemplate(a.getAnyAttribute());
            _builder.append(_manageAttributeTemplate);
          }
        }
      }
    }
    _builder.append("]");
    return _builder;
  }
  
  public CharSequence wawTemplate(final Association a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wasAssociatedWith(");
    String _ref = a.getActivity().getRef();
    _builder.append(_ref);
    _builder.append(", ");
    String _ref_1 = a.getAgent().getRef();
    _builder.append(_ref_1);
    _builder.append(", - ");
    {
      boolean _isEmpty = a.getAnyAttribute().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        CharSequence _wawAttributes = this.wawAttributes(a);
        _builder.append(_wawAttributes);
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence wawAttributes(final Association a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(",[");
    {
      boolean _isEmpty = a.getType().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        {
          EList<Object> _type = a.getType();
          for(final Object ty : _type) {
            _builder.append("prov:type=\'");
            String _string = ty.toString();
            _builder.append(_string);
            _builder.append("\'");
            {
              Object _last = IterableExtensions.<Object>last(a.getType());
              boolean _notEquals = (!Objects.equal(ty, _last));
              if (_notEquals) {
                _builder.append(",");
              }
            }
          }
        }
        {
          boolean _isEmpty_1 = a.getAnyAttribute().isEmpty();
          boolean _not_1 = (!_isEmpty_1);
          if (_not_1) {
            _builder.append(",");
            CharSequence _manageAttributeTemplate = this.manageAttributeTemplate(a.getAnyAttribute());
            _builder.append(_manageAttributeTemplate);
          }
        }
      }
    }
    _builder.append("]");
    return _builder;
  }
  
  public CharSequence manageAttributeTemplate(final EList<PAttribute> atts) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final PAttribute attr : atts) {
        String _key = attr.getKey();
        _builder.append(_key);
        _builder.append("=\'");
        String _value = attr.getValue();
        _builder.append(_value);
        _builder.append("\'");
        {
          PAttribute _last = IterableExtensions.<PAttribute>last(atts);
          boolean _notEquals = (!Objects.equal(attr, _last));
          if (_notEquals) {
            _builder.append(",");
          }
        }
      }
    }
    return _builder;
  }
  
  public static void main(final String[] args) {
    new PROVNGenerator().generate("provModelClass.xmi", "templates/class");
    new PROVNGenerator().generate("provModelSm.xmi", "templates/state");
    new PROVNGenerator().generate("provModelSeq.xmi", "templates/sequence");
  }
  
  public void generate(final String file, final String folder) {
    try {
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
      final ResourceSetImpl resourceSet = new ResourceSetImpl();
      resourceSet.getPackageRegistry().put("http://www.w3.org/ns/prov", ProvPackage.eINSTANCE);
      final Resource resource = resourceSet.getResource(URI.createURI(file), true);
      boolean _exists = new File(folder).exists();
      if (_exists) {
        File _file = new File(folder);
        FileUtils.deleteDirectory(_file);
      }
      new File(folder).mkdirs();
      EList<EObject> _contents = resource.getContents();
      for (final EObject documents : _contents) {
        EList<EObject> _eContents = documents.eContents();
        for (final EObject document : _eContents) {
          if ((document instanceof Document)) {
            String _id = ((Document)document).getId();
            String _plus = ((folder + "/") + _id);
            String _plus_1 = (_plus + ".provn");
            File _file_1 = new File(_plus_1);
            PrintStream fos = new PrintStream(_file_1);
            this.manageDocument(((Document)document), fos);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
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
