# About

**ollabaca-on** is an [Xtext](http://www.eclipse.org/Xtext/) based editor 
for [EMF](http://www.eclipse.org/modeling/emf/) models. 
It offers a generic syntax similar to JSON.

Beside the benefits of Xtext, **ollabaca-on** provides the following features:
Support any EMF meta-model
*  Instance naming
*  Split models in several files
*  Project references
*  Generation of one model per project


#Support of any EMF meta-model

Internally, **ollabaca-on** uses the reflection API of EMF for content assist facilities and for object instantiations.
Therefore, any kind of EMF meta-model which exists in the Eclipse installation directory can be used, even UML (cf. [Samples](https://github.com/LaurentLegrand/ollabaca-on/wiki/Samples)).


 
# Instance naming

Any instane declared can be named and can therefore be referenced in other declarations.

Qualified name syntax is similar to hierarchical URI (eg. /fully/qualified/name).


# Split models in several files

Models are declared in regular Eclipse Project. And instances of a model can be declared in any number of files 
with any folder structure.
Instances will be created at the root of the resource or within its container (cf. Container directive).

# Project references

Thanks to Xtext, an instance declaration can reference other instance declared in other projects. 
Cross reference mechanism is classpath based. 

# Generation of one EMF resource per project 

The generator generates one EMF resource per project containing
* All instances declared in the project
* Instances of other projects referenced in the project





