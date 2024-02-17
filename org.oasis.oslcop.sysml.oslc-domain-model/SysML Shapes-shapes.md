# Domain: SysML Shapes
Date of creation: 

Version number: 

Revision number: 

Approved By: 

Date of approval: 

Issued by: 

Referenced Vocabularies: TODO

**NamespaceURI**: https://www.omg.org/spec/SysML/20230201/shapes#

**NamespacePrefix**: sysml_sh

**Other NamespacePrefixes**: 

* sysml_vocab: https://www.omg.org/spec/SysML/20230201/vocab#

* dcterms: http://purl.org/dc/terms/

## Table of Contents
TODO

## Scope
## Background
## Constraints
Note: In the constraints below, 'definition of vocabulary class' &  'definition of Vocabulary Property' values correspond to the rdfs:comment values in the vocabularies. 

### MetadataDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#MetadataDefinition

type: Shape

target class: [sysml_vocab:MetadataDefinition](https://www.omg.org/spec/SysML/20230201/vocab#MetadataDefinition)

definition of vocabulary class : <p>A <code>MetadataDefinition</code> is an <code>ItemDefinition</code> that is also a <code>Metaclass</code>.</p><br>specializesFromLibrary('Metadata::MetadataItem')

description: <p>A <code>MetadataDefinition</code> is an <code>ItemDefinition</code> that is also a <code>Metaclass</code>.</p><br>specializesFromLibrary('Metadata::MetadataItem')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### RenderingDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#RenderingDefinition

type: Shape

target class: [sysml_vocab:RenderingDefinition](https://www.omg.org/spec/SysML/20230201/vocab#RenderingDefinition)

definition of vocabulary class : <p>A <code>RenderingDefinition</code> is a <code>PartDefinition</code> that defines a specific rendering of the content of a model view (e.g., symbols, style, layout, etc.).</p><br>rendering = usages->selectByKind(RenderingUsage)<br>specializesFromLibrary('Views::Rendering')

description: <p>A <code>RenderingDefinition</code> is a <code>PartDefinition</code> that defines a specific rendering of the content of a model view (e.g., symbols, style, layout, etc.).</p><br>rendering = usages->selectByKind(RenderingUsage)<br>specializesFromLibrary('Views::Rendering')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:renderingDefinitionRendering](https://www.omg.org/spec/SysML/20230201/vocab#renderingDefinitionRendering)| [0..*]| [sysml_vocab:RenderingUsage](https://www.omg.org/spec/SysML/20230201/vocab#RenderingUsage)| <p>The <code>usages</code> of a <code>RenderingDefinition</code> that are <code>RenderingUsages</code>.</p>| <p>The <code>usages</code> of a <code>RenderingDefinition</code> that are <code>RenderingUsages</code>.</p>|



### Feature

URI: https://www.omg.org/spec/SysML/20230201/shapes#Feature

type: Shape

target class: [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)

definition of vocabulary class : <p>A <code>Feature</code> is a <code>Type</code> that classifies relations between multiple things (in the universe). The domain of the relation is the intersection of the <code>featuringTypes</code> of the <code>Feature</code>. (The domain of a <code>Feature</code> with no <code>featuringTyps</code> is implicitly the most general <code>Type</code> <em><code>Base::Anything</code></em> from the Kernel Semantic Library.) The co-domain of the relation is the intersection of the <code>types</code> of the <code>Feature</code>.<br><br><p>In the simplest cases, the <code>featuringTypes</code> and <code>types</code> are <code>Classifiers</code> and the <code>Feature</code> relates two things, one from the domain and one from the range. Examples include cars paired with wheels, people paired with other people, and cars paired with numbers representing the car length.</p><br><br><p>Since <code>Features</code> are <code>Types</code>, their <code>featuringTypes</code> and <code>types</code> can be <code>Features</code>. In this case, the <code>Feature</code> effectively classifies relations between relations, which can be interpreted as the sequence of things related by the domain <code>Feature</code> concatenated with the sequence of things related by the co-domain <code>Feature</code>.</p><br><br><p>The <em>values</em> of a <code>Feature</code> for a given instance of its domain are all the instances of its co-domain that are related to that domain instance by the <code>Feature</code>. The values of a <code>Feature</code> with <code>chainingFeatures</code> are the same as values of the last <code>Feature</code> in the chain, which can be found by starting with values of the first <code>Feature</code>, then using those values as domain instances to obtain valus of the second <code>Feature</code>, and so on, to values of the last <code>Feature</code>.</p><br><br>ownedRedefinition = ownedSubsetting->selectByKind(Redefinition)<br>ownedTypeFeaturing = ownedRelationship->selectByKind(TypeFeaturing)-><br>    select(tf | tf.featureOfType = self)<br>ownedSubsetting = ownedSpecialization->selectByKind(Subsetting)<br>ownedTyping = ownedGeneralization->selectByKind(FeatureTyping)<br>type = <br>    let types : OrderedSet(Types) = OrderedSet{self}-><br>        -- Note: The closure operation automatically handles circular relationships.<br>        closure(typingFeatures()).typing.type->asOrderedSet() in<br>    types->reject(t1 | types->exist(t2 | t2 <> t1 and t2.specializes(t1)))<br>multiplicity <> null implies multiplicity.featuringType = featuringType <br>specializesFromLibrary('Base::things')<br>chainingFeature->excludes(self)<br>ownedFeatureChaining = ownedRelationship->selectByKind(FeatureChaining)<br>chainingFeature = ownedFeatureChaining.chainingFeature<br>chainingFeature->size() <> 1<br>isEnd and owningType <> null implies<br>    let i : Integer = <br>        owningType.ownedEndFeature->indexOf(self) in<br>    owningType.ownedSpecialization.general-><br>        forAll(supertype |<br>             supertype.endFeature->size() >= i implies<br>                redefines(supertype.endFeature->at(i))<br>direction = null and<br>ownedSpecializations->forAll(isImplied) implies<br>    ownedMembership-><br>        selectByKind(FeatureValue)-><br>        forAll(fv | specializes(fv.value.result))<br>isEnd and owningType <> null and<br>(owningType.oclIsKindOf(Association) or<br> owningType.oclIsKindOf(Connector)) implies<br>    specializesFromLibrary('Links::Link::participant')<br>isComposite and<br>ownedTyping.type->includes(oclIsKindOf(Structure)) and<br>owningType <> null and<br>(owningType.oclIsKindOf(Structure) or<br> owningType.type->includes(oclIsKindOf(Structure))) implies<br>    specializesFromLibrary('Occurrence::Occurrence::suboccurrences')<br>owningType <> null and<br>owningType.oclIsKindOf(FeatureReferenceExpression) and<br>self = owningType.oclAsType(FeatureReferenceExpression).result implies<br>    specializes(owningType.oclAsType(FeatureReferenceExpression).referent)<br><br>ownedTyping.type->exists(selectByKind(Class)) implies<br>    specializesFromLibrary('Occurrences::occurrences')<br>isComposite and<br>ownedTyping.type->includes(oclIsKindOf(Class)) and<br>owningType <> null and<br>(owningType.oclIsKindOf(Class) or<br> owningType.oclIsKindOf(Feature) and<br>    owningType.oclAsType(Feature).type-><br>        exists(oclIsKindOf(Class))) implies<br>    specializesFromLibrary('Occurrence::Occurrence::suboccurrences')<br>ownedTyping.type->exists(selectByKind(DataType)) implies<br>    specializesFromLibrary('Base::dataValues')<br>owningType <> null and<br>owningType.oclIsKindOf(ItemFlowEnd) and<br>owningType.ownedFeature->at(1) = self implies<br>    let flowType : Type = owningType.owningType in<br>    flowType <> null implies<br>        let i : Integer = <br>            flowType.ownedFeature.indexOf(owningType) in<br>        (i = 1 implies <br>            redefinesFromLibrary('Transfers::Transfer::source::sourceOutput')) and<br>        (i = 2 implies<br>            redefinesFromLibrary('Transfers::Transfer::source::targetInput'))<br>                 <br>owningType <> null and<br>(owningType.oclIsKindOf(Behavior) or<br> owningType.oclIsKindOf(Step)) implies<br>    let i : Integer = <br>        owningType.ownedFeature->select(direction <> null) in<br>    owningType.ownedSpecialization.general-><br>        forAll(supertype |<br>            let ownedParameters : Sequence(Feature) = <br>                supertype.ownedFeature->select(direction <> null) in<br>            ownedParameters->size() >= i implies<br>                redefines(ownedParameters->at(i))<br>ownedTyping.type->exists(selectByKind(Structure)) implies<br>    specializesFromLibary('Objects::objects')<br>owningType <> null and<br>(owningType.oclIsKindOf(Function) and<br>    self = owningType.oclAsType(Function).result or<br> owningType.oclIsKindOf(Expression) and<br>    self = owningType.oclAsType(Expression).result) implies<br>    owningType.ownedSpecialization.general-><br>        select(oclIsKindOf(Function) or oclIsKindOf(Expression))-><br>        forAll(supertype |<br>            redefines(<br>                if superType.oclIsKindOf(Function) then<br>                    superType.oclAsType(Function).result<br>                else<br>                    superType.oclAsType(Expression).result<br>                endif)<br>ownedFeatureInverting = ownedRelationship->selectByKind(FeatureInverting)-><br>    select(fi | fi.featureInverted = self)<br>featuringType =<br>    let featuringTypes : OrderedSet(Type) = <br>        featuring.type->asOrderedSet() in<br>    if chainingFeature->isEmpty() then featuringTypes<br>    else<br>        featuringTypes-><br>            union(chainingFeature->first().featuringType)-><br>            asOrderedSet()<br>    endif<br>ownedReferenceSubsetting =<br>    let referenceSubsettings : OrderedSet(ReferenceSubsetting) =<br>        ownedSubsetting->selectByKind(ReferenceSubsetting) in<br>    if referenceSubsettings->isEmpty() then null<br>    else referenceSubsettings->first() endif<br>ownedSubsetting->selectByKind(ReferenceSubsetting)->size() <= 1<br>Sequence{1..chainingFeature->size() - 1}->forAll(i |<br>    chainingFeature->at(i + 1).featuringType->forAll(t | <br>        chainingFeature->at(i).specializes(t)))<br><br>isPortion and<br>ownedTyping.type->includes(oclIsKindOf(Class)) and<br>owningType <> null and<br>(owningType.oclIsKindOf(Class) or<br> owningType.oclIsKindOf(Feature) and<br>    owningType.oclAsType(Feature).type-><br>        exists(oclIsKindOf(Class))) implies<br>    specializesFromLibrary('Occurrence::Occurrence::portions')

description: <p>A <code>Feature</code> is a <code>Type</code> that classifies relations between multiple things (in the universe). The domain of the relation is the intersection of the <code>featuringTypes</code> of the <code>Feature</code>. (The domain of a <code>Feature</code> with no <code>featuringTyps</code> is implicitly the most general <code>Type</code> <em><code>Base::Anything</code></em> from the Kernel Semantic Library.) The co-domain of the relation is the intersection of the <code>types</code> of the <code>Feature</code>.<br><br><p>In the simplest cases, the <code>featuringTypes</code> and <code>types</code> are <code>Classifiers</code> and the <code>Feature</code> relates two things, one from the domain and one from the range. Examples include cars paired with wheels, people paired with other people, and cars paired with numbers representing the car length.</p><br><br><p>Since <code>Features</code> are <code>Types</code>, their <code>featuringTypes</code> and <code>types</code> can be <code>Features</code>. In this case, the <code>Feature</code> effectively classifies relations between relations, which can be interpreted as the sequence of things related by the domain <code>Feature</code> concatenated with the sequence of things related by the co-domain <code>Feature</code>.</p><br><br><p>The <em>values</em> of a <code>Feature</code> for a given instance of its domain are all the instances of its co-domain that are related to that domain instance by the <code>Feature</code>. The values of a <code>Feature</code> with <code>chainingFeatures</code> are the same as values of the last <code>Feature</code> in the chain, which can be found by starting with values of the first <code>Feature</code>, then using those values as domain instances to obtain valus of the second <code>Feature</code>, and so on, to values of the last <code>Feature</code>.</p><br><br>ownedRedefinition = ownedSubsetting->selectByKind(Redefinition)<br>ownedTypeFeaturing = ownedRelationship->selectByKind(TypeFeaturing)-><br>    select(tf | tf.featureOfType = self)<br>ownedSubsetting = ownedSpecialization->selectByKind(Subsetting)<br>ownedTyping = ownedGeneralization->selectByKind(FeatureTyping)<br>type = <br>    let types : OrderedSet(Types) = OrderedSet{self}-><br>        -- Note: The closure operation automatically handles circular relationships.<br>        closure(typingFeatures()).typing.type->asOrderedSet() in<br>    types->reject(t1 | types->exist(t2 | t2 <> t1 and t2.specializes(t1)))<br>multiplicity <> null implies multiplicity.featuringType = featuringType <br>specializesFromLibrary('Base::things')<br>chainingFeature->excludes(self)<br>ownedFeatureChaining = ownedRelationship->selectByKind(FeatureChaining)<br>chainingFeature = ownedFeatureChaining.chainingFeature<br>chainingFeature->size() <> 1<br>isEnd and owningType <> null implies<br>    let i : Integer = <br>        owningType.ownedEndFeature->indexOf(self) in<br>    owningType.ownedSpecialization.general-><br>        forAll(supertype |<br>             supertype.endFeature->size() >= i implies<br>                redefines(supertype.endFeature->at(i))<br>direction = null and<br>ownedSpecializations->forAll(isImplied) implies<br>    ownedMembership-><br>        selectByKind(FeatureValue)-><br>        forAll(fv | specializes(fv.value.result))<br>isEnd and owningType <> null and<br>(owningType.oclIsKindOf(Association) or<br> owningType.oclIsKindOf(Connector)) implies<br>    specializesFromLibrary('Links::Link::participant')<br>isComposite and<br>ownedTyping.type->includes(oclIsKindOf(Structure)) and<br>owningType <> null and<br>(owningType.oclIsKindOf(Structure) or<br> owningType.type->includes(oclIsKindOf(Structure))) implies<br>    specializesFromLibrary('Occurrence::Occurrence::suboccurrences')<br>owningType <> null and<br>owningType.oclIsKindOf(FeatureReferenceExpression) and<br>self = owningType.oclAsType(FeatureReferenceExpression).result implies<br>    specializes(owningType.oclAsType(FeatureReferenceExpression).referent)<br><br>ownedTyping.type->exists(selectByKind(Class)) implies<br>    specializesFromLibrary('Occurrences::occurrences')<br>isComposite and<br>ownedTyping.type->includes(oclIsKindOf(Class)) and<br>owningType <> null and<br>(owningType.oclIsKindOf(Class) or<br> owningType.oclIsKindOf(Feature) and<br>    owningType.oclAsType(Feature).type-><br>        exists(oclIsKindOf(Class))) implies<br>    specializesFromLibrary('Occurrence::Occurrence::suboccurrences')<br>ownedTyping.type->exists(selectByKind(DataType)) implies<br>    specializesFromLibrary('Base::dataValues')<br>owningType <> null and<br>owningType.oclIsKindOf(ItemFlowEnd) and<br>owningType.ownedFeature->at(1) = self implies<br>    let flowType : Type = owningType.owningType in<br>    flowType <> null implies<br>        let i : Integer = <br>            flowType.ownedFeature.indexOf(owningType) in<br>        (i = 1 implies <br>            redefinesFromLibrary('Transfers::Transfer::source::sourceOutput')) and<br>        (i = 2 implies<br>            redefinesFromLibrary('Transfers::Transfer::source::targetInput'))<br>                 <br>owningType <> null and<br>(owningType.oclIsKindOf(Behavior) or<br> owningType.oclIsKindOf(Step)) implies<br>    let i : Integer = <br>        owningType.ownedFeature->select(direction <> null) in<br>    owningType.ownedSpecialization.general-><br>        forAll(supertype |<br>            let ownedParameters : Sequence(Feature) = <br>                supertype.ownedFeature->select(direction <> null) in<br>            ownedParameters->size() >= i implies<br>                redefines(ownedParameters->at(i))<br>ownedTyping.type->exists(selectByKind(Structure)) implies<br>    specializesFromLibary('Objects::objects')<br>owningType <> null and<br>(owningType.oclIsKindOf(Function) and<br>    self = owningType.oclAsType(Function).result or<br> owningType.oclIsKindOf(Expression) and<br>    self = owningType.oclAsType(Expression).result) implies<br>    owningType.ownedSpecialization.general-><br>        select(oclIsKindOf(Function) or oclIsKindOf(Expression))-><br>        forAll(supertype |<br>            redefines(<br>                if superType.oclIsKindOf(Function) then<br>                    superType.oclAsType(Function).result<br>                else<br>                    superType.oclAsType(Expression).result<br>                endif)<br>ownedFeatureInverting = ownedRelationship->selectByKind(FeatureInverting)-><br>    select(fi | fi.featureInverted = self)<br>featuringType =<br>    let featuringTypes : OrderedSet(Type) = <br>        featuring.type->asOrderedSet() in<br>    if chainingFeature->isEmpty() then featuringTypes<br>    else<br>        featuringTypes-><br>            union(chainingFeature->first().featuringType)-><br>            asOrderedSet()<br>    endif<br>ownedReferenceSubsetting =<br>    let referenceSubsettings : OrderedSet(ReferenceSubsetting) =<br>        ownedSubsetting->selectByKind(ReferenceSubsetting) in<br>    if referenceSubsettings->isEmpty() then null<br>    else referenceSubsettings->first() endif<br>ownedSubsetting->selectByKind(ReferenceSubsetting)->size() <= 1<br>Sequence{1..chainingFeature->size() - 1}->forAll(i |<br>    chainingFeature->at(i + 1).featuringType->forAll(t | <br>        chainingFeature->at(i).specializes(t)))<br><br>isPortion and<br>ownedTyping.type->includes(oclIsKindOf(Class)) and<br>owningType <> null and<br>(owningType.oclIsKindOf(Class) or<br> owningType.oclIsKindOf(Feature) and<br>    owningType.oclAsType(Feature).type-><br>        exists(oclIsKindOf(Class))) implies<br>    specializesFromLibrary('Occurrence::Occurrence::portions')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:featureIsUnique](https://www.omg.org/spec/SysML/20230201/vocab#featureIsUnique)| [1]| Boolean| <p>Whether or not values for this <code>Feature</code> must have no duplicates or not.</p><br>| <p>Whether or not values for this <code>Feature</code> must have no duplicates or not.</p><br>|
| [sysml_vocab:featureIsOrdered](https://www.omg.org/spec/SysML/20230201/vocab#featureIsOrdered)| [1]| Boolean| <p>Whether an order exists for the values of this <code>Feature</code> or not.</p>| <p>Whether an order exists for the values of this <code>Feature</code> or not.</p>|
| [sysml_vocab:featureIsComposite](https://www.omg.org/spec/SysML/20230201/vocab#featureIsComposite)| [1]| Boolean| <p>Whether the <code>Feature</code> is a composite <code>feature</code> of its <code>featuringType</code>. If so, the values of the <code>Feature</code> cannot exist after its featuring instance no longer does.</p><br>| <p>Whether the <code>Feature</code> is a composite <code>feature</code> of its <code>featuringType</code>. If so, the values of the <code>Feature</code> cannot exist after its featuring instance no longer does.</p><br>|
| [sysml_vocab:featureIsEnd](https://www.omg.org/spec/SysML/20230201/vocab#featureIsEnd)| [1]| Boolean| <p>Whether or not the this <code>Feature</code> is an end <code>Feature</code>, requiring a different interpretation of the <code>multiplicity</code> of the <code>Feature</code>.</p><br><br><p>An end <code>Feature</code> is always considered to map each domain instance to a single co-domain instance, whether or not a <code>Multiplicity</code> is given for it. If a <code>Multiplicity</code> is given for an end <code>Feature</code>, rather than giving the co-domain cardinality for the <code>Feature</code> as usual, it specifies a cardinality constraint for <em>navigating</em> across the <code>endFeatures</code> of the <code>featuringType</code> of the end <code>Feature</code>. That is, if a <code>Type</code> has <em>n</em> <code>endFeatures</code>, then the <code>Multiplicity</code> of any one of those end <code>Features</code> constrains the cardinality of the set of values of that <code>Feature</code> when the values of the other <em>n-1</em> end <code>Features</code> are held fixed.</p><br>| <p>Whether or not the this <code>Feature</code> is an end <code>Feature</code>, requiring a different interpretation of the <code>multiplicity</code> of the <code>Feature</code>.</p><br><br><p>An end <code>Feature</code> is always considered to map each domain instance to a single co-domain instance, whether or not a <code>Multiplicity</code> is given for it. If a <code>Multiplicity</code> is given for an end <code>Feature</code>, rather than giving the co-domain cardinality for the <code>Feature</code> as usual, it specifies a cardinality constraint for <em>navigating</em> across the <code>endFeatures</code> of the <code>featuringType</code> of the end <code>Feature</code>. That is, if a <code>Type</code> has <em>n</em> <code>endFeatures</code>, then the <code>Multiplicity</code> of any one of those end <code>Features</code> constrains the cardinality of the set of values of that <code>Feature</code> when the values of the other <em>n-1</em> end <code>Features</code> are held fixed.</p><br>|
| [sysml_vocab:featureIsDerived](https://www.omg.org/spec/SysML/20230201/vocab#featureIsDerived)| [1]| Boolean| <p>Whether the values of this <code>Feature</code> can always be computed from the values of other <code>Features</code>.</p><br>| <p>Whether the values of this <code>Feature</code> can always be computed from the values of other <code>Features</code>.</p><br>|
| [sysml_vocab:featureIsReadOnly](https://www.omg.org/spec/SysML/20230201/vocab#featureIsReadOnly)| [1]| Boolean| <p>Whether the values of this <code>Feature</code> can change over the lifetime of an instance of the domain.</p><br>| <p>Whether the values of this <code>Feature</code> can change over the lifetime of an instance of the domain.</p><br>|
| [sysml_vocab:featureIsPortion](https://www.omg.org/spec/SysML/20230201/vocab#featureIsPortion)| [1]| Boolean| <p>Whether the values of this <code>Feature</code> are contained in the space and time of instances of the domain of the <code>Feature</code> and represent the same thing as those instances.</p><br>| <p>Whether the values of this <code>Feature</code> are contained in the space and time of instances of the domain of the <code>Feature</code> and represent the same thing as those instances.</p><br>|
| [sysml_vocab:featureDirection](https://www.omg.org/spec/SysML/20230201/vocab#featureDirection)| [0..1]| String| <p>Indicates how values of this <code>Feature</code> are determined or used (as specified for the <code>FeatureDirectionKind</code>).</p><br>| <p>Indicates how values of this <code>Feature</code> are determined or used (as specified for the <code>FeatureDirectionKind</code>).</p><br>|
| [sysml_vocab:featureIsNonunique](https://www.omg.org/spec/SysML/20230201/vocab#featureIsNonunique)| [1]| Boolean| n/a| n/a|
| [sysml_vocab:featureOwningType](https://www.omg.org/spec/SysML/20230201/vocab#featureOwningType)| [0..1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The <code>Type</code> that is the <code>owningType</code> of the <code>owningFeatureMembership</code> of this <code>Feature</code>.</p>| <p>The <code>Type</code> that is the <code>owningType</code> of the <code>owningFeatureMembership</code> of this <code>Feature</code>.</p>|
| [sysml_vocab:featureType](https://www.omg.org/spec/SysML/20230201/vocab#featureType)| [0..*]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p><code>Types</code> that restrict the values of this <code>Feature</code>, such that the values must be instances of all the <code>types</code>. The types of a <code>Feature</code> are derived from its <code>typings</code> and the <code>types</code> of its <code>subsettings</code>. If the <code>Feature</code> is chained, then the <code>types</code> of the last <code>Feature</code> in the chain are also <code>types</code> of the chained <code>Feature</code>.</p><br>| <p><code>Types</code> that restrict the values of this <code>Feature</code>, such that the values must be instances of all the <code>types</code>. The types of a <code>Feature</code> are derived from its <code>typings</code> and the <code>types</code> of its <code>subsettings</code>. If the <code>Feature</code> is chained, then the <code>types</code> of the last <code>Feature</code> in the chain are also <code>types</code> of the chained <code>Feature</code>.</p><br>|
| [sysml_vocab:featureOwnedRedefinition](https://www.omg.org/spec/SysML/20230201/vocab#featureOwnedRedefinition)| [0..*]| [sysml_vocab:Redefinition](https://www.omg.org/spec/SysML/20230201/vocab#Redefinition)| <p>The <code>ownedSubsettings</code> of this <code>Feature</code> that are <code>Redefinitions</code>, for which the <code>Feature</code> is the <code>redefiningFeature</code>.</p><br><br>| <p>The <code>ownedSubsettings</code> of this <code>Feature</code> that are <code>Redefinitions</code>, for which the <code>Feature</code> is the <code>redefiningFeature</code>.</p><br><br>|
| [sysml_vocab:featureOwnedSubsetting](https://www.omg.org/spec/SysML/20230201/vocab#featureOwnedSubsetting)| [0..*]| [sysml_vocab:Subsetting](https://www.omg.org/spec/SysML/20230201/vocab#Subsetting)| <p>The <code>ownedSpecializations</code> of this <code>Feature</code> that are <code>Subsettings</code>, for which the <code>Feature</code> is the <code>subsettingFeature</code>.</p><br>| <p>The <code>ownedSpecializations</code> of this <code>Feature</code> that are <code>Subsettings</code>, for which the <code>Feature</code> is the <code>subsettingFeature</code>.</p><br>|
| [sysml_vocab:featureOwningFeatureMembership](https://www.omg.org/spec/SysML/20230201/vocab#featureOwningFeatureMembership)| [0..1]| [sysml_vocab:FeatureMembership](https://www.omg.org/spec/SysML/20230201/vocab#FeatureMembership)| <p>The <code>FeatureMembership</code> that owns this <code>Feature</code> as an <code>ownedMemberFeature</code>, determining its <code>owningType</code>.</p>| <p>The <code>FeatureMembership</code> that owns this <code>Feature</code> as an <code>ownedMemberFeature</code>, determining its <code>owningType</code>.</p>|
| [sysml_vocab:featureEndOwningType](https://www.omg.org/spec/SysML/20230201/vocab#featureEndOwningType)| [0..1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The <code>Type</code> that is related to this <code>Feature</code> by an <code>EndFeatureMembership</code> in which the <code>Feature</code> is an <code>ownedMemberFeature</code>.</p>| <p>The <code>Type</code> that is related to this <code>Feature</code> by an <code>EndFeatureMembership</code> in which the <code>Feature</code> is an <code>ownedMemberFeature</code>.</p>|
| [sysml_vocab:featureOwnedTyping](https://www.omg.org/spec/SysML/20230201/vocab#featureOwnedTyping)| [0..*]| [sysml_vocab:FeatureTyping](https://www.omg.org/spec/SysML/20230201/vocab#FeatureTyping)| <p>The <code>ownedSpecializations</code> of this <code>Feature</code> that are <code>FeatureTypings</code>, for which the <code>Feature</code> is the <code>typedFeature</code>.</p>| <p>The <code>ownedSpecializations</code> of this <code>Feature</code> that are <code>FeatureTypings</code>, for which the <code>Feature</code> is the <code>typedFeature</code>.</p>|
| [sysml_vocab:featureFeaturingType](https://www.omg.org/spec/SysML/20230201/vocab#featureFeaturingType)| [0..*]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p><code>Types</code> that feature this <code>Feature</code>, such that any instance in the domain of the <code>Feature</code> must be classified by all of these <code>Types</code>, including at least all the <code>featuringTypes</code> of its <code>typeFeaturings</code>.  If the <code>Feature</code> is chained, then the <code>featuringTypes</code> of the first <code>Feature</code> in the chain are also <code>featuringTypes</code> of the chained <code>Feature</code>.</p>| <p><code>Types</code> that feature this <code>Feature</code>, such that any instance in the domain of the <code>Feature</code> must be classified by all of these <code>Types</code>, including at least all the <code>featuringTypes</code> of its <code>typeFeaturings</code>.  If the <code>Feature</code> is chained, then the <code>featuringTypes</code> of the first <code>Feature</code> in the chain are also <code>featuringTypes</code> of the chained <code>Feature</code>.</p>|
| [sysml_vocab:featureOwnedTypeFeaturing](https://www.omg.org/spec/SysML/20230201/vocab#featureOwnedTypeFeaturing)| [0..*]| [sysml_vocab:TypeFeaturing](https://www.omg.org/spec/SysML/20230201/vocab#TypeFeaturing)| <p>The <code>ownedRelationships</code> of this <code>Feature</code> that are <code>TypeFeaturings</code> and for which the <code>Feature</code> is the <code>featureOfType</code>.</p>| <p>The <code>ownedRelationships</code> of this <code>Feature</code> that are <code>TypeFeaturings</code> and for which the <code>Feature</code> is the <code>featureOfType</code>.</p>|
| [sysml_vocab:featureChainingFeature](https://www.omg.org/spec/SysML/20230201/vocab#featureChainingFeature)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that are chained together to determine the values of this <code>Feature</code>, derived from the <code>chainingFeatures</code> of the <code>ownedFeatureChainings</code> of this <code>Feature</code>, in the same order. The values of a <code>Feature</code> with <code>chainingFeatures</code> are the same as values of the last <code>Feature</code> in the chain, which can be found by starting with the values of the first <code>Feature</code> (for each instance of the domain of the original <code>Feature</code>), then using each of those as domain instances to find the values of the second <code>Feature</code> in chainingFeatures, and so on, to values of the last <code>Feature</code>.</p>| <p>The <code>Feature</code> that are chained together to determine the values of this <code>Feature</code>, derived from the <code>chainingFeatures</code> of the <code>ownedFeatureChainings</code> of this <code>Feature</code>, in the same order. The values of a <code>Feature</code> with <code>chainingFeatures</code> are the same as values of the last <code>Feature</code> in the chain, which can be found by starting with the values of the first <code>Feature</code> (for each instance of the domain of the original <code>Feature</code>), then using each of those as domain instances to find the values of the second <code>Feature</code> in chainingFeatures, and so on, to values of the last <code>Feature</code>.</p>|
| [sysml_vocab:featureOwnedFeatureInverting](https://www.omg.org/spec/SysML/20230201/vocab#featureOwnedFeatureInverting)| [0..*]| [sysml_vocab:FeatureInverting](https://www.omg.org/spec/SysML/20230201/vocab#FeatureInverting)| <p>The <code>ownedRelationships</code> of this <code>Feature</code> that are <code>FeatureInvertings</code> and for which the <code>Feature</code> is the <code>featureInverted</code>.</p>| <p>The <code>ownedRelationships</code> of this <code>Feature</code> that are <code>FeatureInvertings</code> and for which the <code>Feature</code> is the <code>featureInverted</code>.</p>|
| [sysml_vocab:featureOwnedFeatureChaining](https://www.omg.org/spec/SysML/20230201/vocab#featureOwnedFeatureChaining)| [0..*]| [sysml_vocab:FeatureChaining](https://www.omg.org/spec/SysML/20230201/vocab#FeatureChaining)| <p>The <code>ownedRelationships</code> of this <code>Feature</code> that are <code>FeatureChainings</code>, for which the <code>Feature</code> will be the <code>featureChained</code>.</p>| <p>The <code>ownedRelationships</code> of this <code>Feature</code> that are <code>FeatureChainings</code>, for which the <code>Feature</code> will be the <code>featureChained</code>.</p>|
| [sysml_vocab:featureOwnedReferenceSubsetting](https://www.omg.org/spec/SysML/20230201/vocab#featureOwnedReferenceSubsetting)| [0..1]| [sysml_vocab:ReferenceSubsetting](https://www.omg.org/spec/SysML/20230201/vocab#ReferenceSubsetting)| <p>The one <code>ownedSubsetting</code> of this <code>Feature</code>, if any, that is a <code>ReferenceSubsetting</code>, for which the <code>Feature</code> is the <code>referencingFeature</code>.</p>| <p>The one <code>ownedSubsetting</code> of this <code>Feature</code>, if any, that is a <code>ReferenceSubsetting</code>, for which the <code>Feature</code> is the <code>referencingFeature</code>.</p>|



### ConjugatedPortDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#ConjugatedPortDefinition

type: Shape

target class: [sysml_vocab:ConjugatedPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ConjugatedPortDefinition)

definition of vocabulary class : <p>A <code>ConjugatedPortDefinition</code> is a <code>PortDefinition</code> that is a <code>PortDefinition</code> of its original <code>PortDefinition</code>. That is, a <code>ConjugatedPortDefinition</code> inherits all the <code>features</code> of the original <code>PortDefinition</code>, but input <code>flows</code> of the original <code>PortDefinition</code> become outputs on the <code>ConjugatedPortDefinition</code> and output <code>flows</code> of the original <code>PortDefinition</code> become inputs on the <code>ConjugatedPortDefinition</code>. Every <code>PortDefinition</code> (that is not itself a <code><code>ConjugatedPortDefinition</code></code>) has exactly one corresponding <code>ConjugatedPortDefinition</code>, whose effective name is the name of the <code>originalPortDefinition</code>, with the character <code>~</code> prepended.</p><br>ownedPortConjugator.originalPortDefinition = originalPortDefinition<br>conjugatedPortDefinition = null

description: <p>A <code>ConjugatedPortDefinition</code> is a <code>PortDefinition</code> that is a <code>PortDefinition</code> of its original <code>PortDefinition</code>. That is, a <code>ConjugatedPortDefinition</code> inherits all the <code>features</code> of the original <code>PortDefinition</code>, but input <code>flows</code> of the original <code>PortDefinition</code> become outputs on the <code>ConjugatedPortDefinition</code> and output <code>flows</code> of the original <code>PortDefinition</code> become inputs on the <code>ConjugatedPortDefinition</code>. Every <code>PortDefinition</code> (that is not itself a <code><code>ConjugatedPortDefinition</code></code>) has exactly one corresponding <code>ConjugatedPortDefinition</code>, whose effective name is the name of the <code>originalPortDefinition</code>, with the character <code>~</code> prepended.</p><br>ownedPortConjugator.originalPortDefinition = originalPortDefinition<br>conjugatedPortDefinition = null

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:conjugatedPortDefinitionOwnedPortConjugator](https://www.omg.org/spec/SysML/20230201/vocab#conjugatedPortDefinitionOwnedPortConjugator)| [1]| [sysml_vocab:PortConjugation](https://www.omg.org/spec/SysML/20230201/vocab#PortConjugation)| <p>The <code>PortConjugation</code> that is the <code>ownedConjugator</code> of this <code>ConjugatedPortDefinition</code>, linking it to its <code>originalPortDefinition</code>.</p>| <p>The <code>PortConjugation</code> that is the <code>ownedConjugator</code> of this <code>ConjugatedPortDefinition</code>, linking it to its <code>originalPortDefinition</code>.</p>|
| [sysml_vocab:conjugatedPortDefinitionOriginalPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#conjugatedPortDefinitionOriginalPortDefinition)| [1]| [sysml_vocab:PortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#PortDefinition)| <p>The original <code>PortDefinition</code> for this <code>ConjugatedPortDefinition</code>, which is the <code>owningNamespace</code> of the <code>ConjugatedPortDefinition</code>.</p>| <p>The original <code>PortDefinition</code> for this <code>ConjugatedPortDefinition</code>, which is the <code>owningNamespace</code> of the <code>ConjugatedPortDefinition</code>.</p>|



### FlowConnectionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#FlowConnectionUsage

type: Shape

target class: [sysml_vocab:FlowConnectionUsage](https://www.omg.org/spec/SysML/20230201/vocab#FlowConnectionUsage)

definition of vocabulary class : <p>A <code>FlowConnectionUsage</code> is a <code>ConnectionUsage</code> that is also an <code>ItemFlow</code>.</p><br>if ownedEndFeatures->isEmpty() then<br>    specializesFromLibrary('Connections::messageConnections')<br>else<br>    specializesFromLibrary('Connections::flowConnections')<br>endif

description: <p>A <code>FlowConnectionUsage</code> is a <code>ConnectionUsage</code> that is also an <code>ItemFlow</code>.</p><br>if ownedEndFeatures->isEmpty() then<br>    specializesFromLibrary('Connections::messageConnections')<br>else<br>    specializesFromLibrary('Connections::flowConnections')<br>endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:flowConnectionUsageFlowConnectionDefinition](https://www.omg.org/spec/SysML/20230201/vocab#flowConnectionUsageFlowConnectionDefinition)| [0..*]| [sysml_vocab:Interaction](https://www.omg.org/spec/SysML/20230201/vocab#Interaction)| <p>The <code>Interactions</code> that are the <code>types</code> of this <code>FlowConnectionUsage</code>. Nominally, these are <code>FlowConnectionDefinitions</code>, but other kinds of Kernel <code>Interactions</code> are also allowed, to permit use of Interactions from the Kernel Model Libraries.</p>| <p>The <code>Interactions</code> that are the <code>types</code> of this <code>FlowConnectionUsage</code>. Nominally, these are <code>FlowConnectionDefinitions</code>, but other kinds of Kernel <code>Interactions</code> are also allowed, to permit use of Interactions from the Kernel Model Libraries.</p>|



### ActionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ActionUsage

type: Shape

target class: [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)

definition of vocabulary class : <p>An <code>ActionUsage</code> is a <code>Usage</code> that is also a <code>Step</code>, and, so, is typed by a <code>Behavior</code>. Nominally, if the type is an <code>ActionDefinition</code>, an <code>ActionUsage</code> is a <code>Usage</code> of that <code>ActionDefinition</code> within a system. However, other kinds of kernel <code>Behaviors</code> are also allowed, to permit use of <code>Behaviors</code> from the Kernel Model Libraries.</p><br><br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::subactions')<br>specializesFromLibrary('Actions::actions')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(PartDefinition) or<br> owningType.oclIsKindOf(PartUsage)) implies<br>    specializesFromLibrary('Parts::Part::ownedActions')<br>owningFeatureMembership <> null and<br>owningFeatureMembership.oclIsKindOf(StateSubactionMembership) implies<br>    let kind : StateSubactionKind = <br>        owningFeatureMembership.oclAsType(StateSubactionMembership).kind in<br>    if kind = StateSubactionKind::entry then<br>        redefinesFromLibrary('States::StateAction::entryAction')<br>    else if kind = StateSubactionKind::do then<br>        redefinesFromLibrary('States::StateAction::doAction')<br>    else<br>        redefinesFromLibrary('States::StateAction::exitAction')<br>    endif endif<br>owningType <> null and<br>    (owningType.oclIsKindOf(AnalysisCaseDefinition) and<br>        owningType.oclAsType(AnalysisCaseDefinition).analysisAction-><br>            includes(self) or<br>     owningType.oclIsKindOf(AnalysisCaseUsage) and<br>        owningType.oclAsType(AnalysisCaseUsage).analysisAction-><br>            includes(self)) implies<br>    specializesFromLibrary('AnalysisCases::AnalysisCase::analysisSteps')

description: <p>An <code>ActionUsage</code> is a <code>Usage</code> that is also a <code>Step</code>, and, so, is typed by a <code>Behavior</code>. Nominally, if the type is an <code>ActionDefinition</code>, an <code>ActionUsage</code> is a <code>Usage</code> of that <code>ActionDefinition</code> within a system. However, other kinds of kernel <code>Behaviors</code> are also allowed, to permit use of <code>Behaviors</code> from the Kernel Model Libraries.</p><br><br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::subactions')<br>specializesFromLibrary('Actions::actions')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(PartDefinition) or<br> owningType.oclIsKindOf(PartUsage)) implies<br>    specializesFromLibrary('Parts::Part::ownedActions')<br>owningFeatureMembership <> null and<br>owningFeatureMembership.oclIsKindOf(StateSubactionMembership) implies<br>    let kind : StateSubactionKind = <br>        owningFeatureMembership.oclAsType(StateSubactionMembership).kind in<br>    if kind = StateSubactionKind::entry then<br>        redefinesFromLibrary('States::StateAction::entryAction')<br>    else if kind = StateSubactionKind::do then<br>        redefinesFromLibrary('States::StateAction::doAction')<br>    else<br>        redefinesFromLibrary('States::StateAction::exitAction')<br>    endif endif<br>owningType <> null and<br>    (owningType.oclIsKindOf(AnalysisCaseDefinition) and<br>        owningType.oclAsType(AnalysisCaseDefinition).analysisAction-><br>            includes(self) or<br>     owningType.oclIsKindOf(AnalysisCaseUsage) and<br>        owningType.oclAsType(AnalysisCaseUsage).analysisAction-><br>            includes(self)) implies<br>    specializesFromLibrary('AnalysisCases::AnalysisCase::analysisSteps')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:actionUsageActionDefinition](https://www.omg.org/spec/SysML/20230201/vocab#actionUsageActionDefinition)| [0..*]| [sysml_vocab:Behavior](https://www.omg.org/spec/SysML/20230201/vocab#Behavior)| <p>The <code>Behaviors</code> that are the <code>types</code> of this <code>ActionUsage</code>. Nominally, these would be <code>ActionDefinitions</code>, but other kinds of Kernel <code>Behaviors</code> are also allowed, to permit use of <code>Behaviors</code> from the Kernel Model Libraries.</p> <br>| <p>The <code>Behaviors</code> that are the <code>types</code> of this <code>ActionUsage</code>. Nominally, these would be <code>ActionDefinitions</code>, but other kinds of Kernel <code>Behaviors</code> are also allowed, to permit use of <code>Behaviors</code> from the Kernel Model Libraries.</p> <br>|



### VerificationCaseUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#VerificationCaseUsage

type: Shape

target class: [sysml_vocab:VerificationCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#VerificationCaseUsage)

definition of vocabulary class : <p>A <code>VerificationCaseUsage</code> is a </code>Usage</code> of a <code>VerificationCaseDefinition</code>.</p><br>verifiedRequirement =<br>    if objectiveRequirement = null then OrderedSet{}<br>    else <br>        objectiveRequirement.featureMembership-><br>            selectByKind(RequirementVerificationMembership).<br>            verifiedRequirement->asOrderedSet()<br>    endif<br>specializesFromLibrary('VerificationCases::verificationCases')<br>isComposite and owningType <> null and<br>    (owningType.oclIsKindOf(VerificationCaseDefinition) or<br>     owningType.oclIsKindOf(VerificationCaseUsage)) implies <br>    specializesFromLibrary('VerificationCases::VerificationCase::subVerificationCases')

description: <p>A <code>VerificationCaseUsage</code> is a </code>Usage</code> of a <code>VerificationCaseDefinition</code>.</p><br>verifiedRequirement =<br>    if objectiveRequirement = null then OrderedSet{}<br>    else <br>        objectiveRequirement.featureMembership-><br>            selectByKind(RequirementVerificationMembership).<br>            verifiedRequirement->asOrderedSet()<br>    endif<br>specializesFromLibrary('VerificationCases::verificationCases')<br>isComposite and owningType <> null and<br>    (owningType.oclIsKindOf(VerificationCaseDefinition) or<br>     owningType.oclIsKindOf(VerificationCaseUsage)) implies <br>    specializesFromLibrary('VerificationCases::VerificationCase::subVerificationCases')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:verificationCaseUsageVerificationCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#verificationCaseUsageVerificationCaseDefinition)| [0..1]| [sysml_vocab:VerificationCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#VerificationCaseDefinition)| <p>The <code>VerificationCase</code> that is the <code>definition</code> of this <code>VerificationCaseUsage</code>.</p>| <p>The <code>VerificationCase</code> that is the <code>definition</code> of this <code>VerificationCaseUsage</code>.</p>|
| [sysml_vocab:verificationCaseUsageVerifiedRequirement](https://www.omg.org/spec/SysML/20230201/vocab#verificationCaseUsageVerifiedRequirement)| [0..*]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The <code>RequirementUsages</code> verified by this <code>VerificationCaseUsage</code>, which are the <code>verifiedRequirements</code> of all <code>RequirementVerificationMemberships</code> of the <code>objectiveRequirement</code>.</p>| <p>The <code>RequirementUsages</code> verified by this <code>VerificationCaseUsage</code>, which are the <code>verifiedRequirements</code> of all <code>RequirementVerificationMemberships</code> of the <code>objectiveRequirement</code>.</p>|



### CaseDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#CaseDefinition

type: Shape

target class: [sysml_vocab:CaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#CaseDefinition)

definition of vocabulary class : <p>A <code>CaseDefinition</code> is a <code>CalculationDefinition</code> for a process, often involving collecting evidence or data, relative to a subject, possibly involving the collaboration of one or more other actors, producing a result that meets an objective.</p><br>objectiveRequirement = <br>    let objectives: OrderedSet(RequirementUsage) = <br>        featureMembership-><br>            selectByKind(ObjectiveMembership).<br>            ownedRequirement in<br>    if objectives->isEmpty() then null<br>    else objectives->first().ownedObjectiveRequirement<br>    endif<br>featureMembership-><br>    selectByKind(ObjectiveMembership)-><br>    size() <= 1<br>subjectParameter =<br>    let subjectMems : OrderedSet(SubjectMembership) = <br>        featureMembership->selectByKind(SubjectMembership) in<br>    if subjectMems->isEmpty() then null<br>    else subjectMems->first().ownedSubjectParameter<br>    endif<br>actorParameter = featureMembership-><br>    selectByKind(ActorMembership).<br>    ownedActorParameter<br>featureMembership->selectByKind(SubjectMembership)->size() <= 1<br>input->notEmpty() and input->first() = subjectParameter<br>specializesFromLibrary('Cases::Case')

description: <p>A <code>CaseDefinition</code> is a <code>CalculationDefinition</code> for a process, often involving collecting evidence or data, relative to a subject, possibly involving the collaboration of one or more other actors, producing a result that meets an objective.</p><br>objectiveRequirement = <br>    let objectives: OrderedSet(RequirementUsage) = <br>        featureMembership-><br>            selectByKind(ObjectiveMembership).<br>            ownedRequirement in<br>    if objectives->isEmpty() then null<br>    else objectives->first().ownedObjectiveRequirement<br>    endif<br>featureMembership-><br>    selectByKind(ObjectiveMembership)-><br>    size() <= 1<br>subjectParameter =<br>    let subjectMems : OrderedSet(SubjectMembership) = <br>        featureMembership->selectByKind(SubjectMembership) in<br>    if subjectMems->isEmpty() then null<br>    else subjectMems->first().ownedSubjectParameter<br>    endif<br>actorParameter = featureMembership-><br>    selectByKind(ActorMembership).<br>    ownedActorParameter<br>featureMembership->selectByKind(SubjectMembership)->size() <= 1<br>input->notEmpty() and input->first() = subjectParameter<br>specializesFromLibrary('Cases::Case')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:caseDefinitionObjectiveRequirement](https://www.omg.org/spec/SysML/20230201/vocab#caseDefinitionObjectiveRequirement)| [0..1]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The <code>RequirementUsage</code> representing the objective of this <code>CaseDefinition</code>.</p> <br>| <p>The <code>RequirementUsage</code> representing the objective of this <code>CaseDefinition</code>.</p> <br>|
| [sysml_vocab:caseDefinitionSubjectParameter](https://www.omg.org/spec/SysML/20230201/vocab#caseDefinitionSubjectParameter)| [1]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>parameter</code> of this <code>CaseDefinition</code> that represents its subject.</p>| <p>The <code>parameter</code> of this <code>CaseDefinition</code> that represents its subject.</p>|
| [sysml_vocab:caseDefinitionActorParameter](https://www.omg.org/spec/SysML/20230201/vocab#caseDefinitionActorParameter)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The <code>parameters</code> of this <code>CaseDefinition</code> that represent actors involved in the case.</p>| <p>The <code>parameters</code> of this <code>CaseDefinition</code> that represent actors involved in the case.</p>|



### AnalysisCaseUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#AnalysisCaseUsage

type: Shape

target class: [sysml_vocab:AnalysisCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#AnalysisCaseUsage)

definition of vocabulary class : <p>An <code>AnalysisCaseUsage</code> is a <code>Usage</code> of an <code>AnalysisCaseDefinition</code>.</p><br>analysisAction = usage->select(<br>    isComposite and<br>    specializes('AnalysisCases::AnalysisAction'))<br>resultExpression =<br>    let results : OrderedSet(ResultExpressionMembership) =<br>        featureMembersip-><br>            selectByKind(ResultExpressionMembership) in<br>    if results->isEmpty() then null<br>    else results->first().ownedResultExpression<br>    endif<br>specializesFromLibrary('AnalysisCases::analysisCases')<br>isComposite and owningType <> null and<br>    (owningType.oclIsKindOf(AnalysisCaseDefinition) or<br>     owningType.oclIsKindOf(AnalysisCaseUsage)) implies<br>    specializesFromLibrary('AnalysisCases::AnalysisCase::subAnalysisCases')

description: <p>An <code>AnalysisCaseUsage</code> is a <code>Usage</code> of an <code>AnalysisCaseDefinition</code>.</p><br>analysisAction = usage->select(<br>    isComposite and<br>    specializes('AnalysisCases::AnalysisAction'))<br>resultExpression =<br>    let results : OrderedSet(ResultExpressionMembership) =<br>        featureMembersip-><br>            selectByKind(ResultExpressionMembership) in<br>    if results->isEmpty() then null<br>    else results->first().ownedResultExpression<br>    endif<br>specializesFromLibrary('AnalysisCases::analysisCases')<br>isComposite and owningType <> null and<br>    (owningType.oclIsKindOf(AnalysisCaseDefinition) or<br>     owningType.oclIsKindOf(AnalysisCaseUsage)) implies<br>    specializesFromLibrary('AnalysisCases::AnalysisCase::subAnalysisCases')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:analysisCaseUsageAnalysisAction](https://www.omg.org/spec/SysML/20230201/vocab#analysisCaseUsageAnalysisAction)| [0..*]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The composite <code>usages</code> of the <code>AnalysisCaseUsage</code> that are defined as <code>AnalysisActions</code>.</p><br>| <p>The composite <code>usages</code> of the <code>AnalysisCaseUsage</code> that are defined as <code>AnalysisActions</code>.</p><br>|
| [sysml_vocab:analysisCaseUsageAnalysisCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#analysisCaseUsageAnalysisCaseDefinition)| [0..1]| [sysml_vocab:AnalysisCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#AnalysisCaseDefinition)| <p>The <code>AnalysisCaseDefinition</code> that is the <code>definition</code> of this <code>AnalysisCaseUsage</code>.</p>| <p>The <code>AnalysisCaseDefinition</code> that is the <code>definition</code> of this <code>AnalysisCaseUsage</code>.</p>|
| [sysml_vocab:analysisCaseUsageResultExpression](https://www.omg.org/spec/SysML/20230201/vocab#analysisCaseUsageResultExpression)| [0..1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>An <code>Expression</code> used to compute the <code>result</code> of the <code>AnalysisCaseUsage</code>, owned via a <code>ResultExpressionMembership</code>.</p>| <p>An <code>Expression</code> used to compute the <code>result</code> of the <code>AnalysisCaseUsage</code>, owned via a <code>ResultExpressionMembership</code>.</p>|



### EventOccurrenceUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#EventOccurrenceUsage

type: Shape

target class: [sysml_vocab:EventOccurrenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#EventOccurrenceUsage)

definition of vocabulary class : <p>An <code>EventOccurrenceUsage</code> is an <code>OccurrenceUsage</code> that represents another <code>OccurrenceUsage</code> occurring as a <code><em>suboccurrence</em></code> of the containing occurrence of the <code>EventOccurrenceUsage</code>. Unless it is the <code>EventOccurrenceUsage</code> itself, the referenced <code>OccurrenceUsage</code> is related to the <code>EventOccurrenceUsage</code> by a <code>ReferenceSubsetting</code> <code>Relationship</code>.</p><br><br><p>If the <code>EventOccurrenceUsage</code> is owned by an <code>OccurrenceDefinition</code> or <code>OccurrenceUsage</code>, then it also subsets the <em><code>timeEnclosedOccurrences</code></em> property of the <code>Class</code> <em><code>Occurrence</code></em> from the Kernel Semantic Library model <em><code>Occurrences</code></em>.</p><br>eventOccurrence =<br>    if ownedReferenceSubsetting = null then self<br>    else if ownedReferenceSubsetting.referencedFeature.oclIsKindOf(OccurrenceUsage) then <br>        ownedReferenceSubsetting.referencedFeature.oclAsType(OccurrenceUsage)<br>    else null<br>    endif endif<br>ownedReferenceSubsetting <> null implies<br>    ownedReferenceSubsetting.referencedFeature.oclIsKindOf(OccurrenceUsage)<br>owningType <> null and<br>(owningType.oclIsKindOf(OccurrenceDefinition) or<br> owningType.oclIsKindOf(OccurrenceUsage)) implies<br>    specializesFromLibrary('Occurrences::Occurrence::timeEnclosedOccurrences')<br>isReference

description: <p>An <code>EventOccurrenceUsage</code> is an <code>OccurrenceUsage</code> that represents another <code>OccurrenceUsage</code> occurring as a <code><em>suboccurrence</em></code> of the containing occurrence of the <code>EventOccurrenceUsage</code>. Unless it is the <code>EventOccurrenceUsage</code> itself, the referenced <code>OccurrenceUsage</code> is related to the <code>EventOccurrenceUsage</code> by a <code>ReferenceSubsetting</code> <code>Relationship</code>.</p><br><br><p>If the <code>EventOccurrenceUsage</code> is owned by an <code>OccurrenceDefinition</code> or <code>OccurrenceUsage</code>, then it also subsets the <em><code>timeEnclosedOccurrences</code></em> property of the <code>Class</code> <em><code>Occurrence</code></em> from the Kernel Semantic Library model <em><code>Occurrences</code></em>.</p><br>eventOccurrence =<br>    if ownedReferenceSubsetting = null then self<br>    else if ownedReferenceSubsetting.referencedFeature.oclIsKindOf(OccurrenceUsage) then <br>        ownedReferenceSubsetting.referencedFeature.oclAsType(OccurrenceUsage)<br>    else null<br>    endif endif<br>ownedReferenceSubsetting <> null implies<br>    ownedReferenceSubsetting.referencedFeature.oclIsKindOf(OccurrenceUsage)<br>owningType <> null and<br>(owningType.oclIsKindOf(OccurrenceDefinition) or<br> owningType.oclIsKindOf(OccurrenceUsage)) implies<br>    specializesFromLibrary('Occurrences::Occurrence::timeEnclosedOccurrences')<br>isReference

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:eventOccurrenceUsageEventOccurrence](https://www.omg.org/spec/SysML/20230201/vocab#eventOccurrenceUsageEventOccurrence)| [1]| [sysml_vocab:OccurrenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#OccurrenceUsage)| <p>The <code>OccurrenceUsage</code> referenced as an event by this <code>EventOccurrenceUsage</code>. It is the <code>referenceFeature</code> of the <code>ownedReferenceSubsetting</code> for the <code>EventOccurrenceUsage</code>, if there is one, and, otherwise, the <code>EventOccurrenceUsage</code> itself.</p>| <p>The <code>OccurrenceUsage</code> referenced as an event by this <code>EventOccurrenceUsage</code>. It is the <code>referenceFeature</code> of the <code>ownedReferenceSubsetting</code> for the <code>EventOccurrenceUsage</code>, if there is one, and, otherwise, the <code>EventOccurrenceUsage</code> itself.</p>|



### LoopActionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#LoopActionUsage

type: Shape

target class: [sysml_vocab:LoopActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#LoopActionUsage)

definition of vocabulary class : <p>A <code>LoopActionUsage</code> is an <code>ActionUsage</code> that specifies that its <code>bodyAction</code> should be performed repeatedly. Its subclasses <code>WhileLoopActionUsage</code> and <code>ForLoopActionUsage</code> provide different ways to determine how many times the <code>bodyAction</code> should be performed.</p><br>bodyAction =<br>    let parameter : Feature = inputParameter(2) in<br>    if parameter <> null and parameter.oclIsKindOf(Action) then<br>        parameter.oclAsType(Action)<br>    else<br>        null<br>    endif<br>

description: <p>A <code>LoopActionUsage</code> is an <code>ActionUsage</code> that specifies that its <code>bodyAction</code> should be performed repeatedly. Its subclasses <code>WhileLoopActionUsage</code> and <code>ForLoopActionUsage</code> provide different ways to determine how many times the <code>bodyAction</code> should be performed.</p><br>bodyAction =<br>    let parameter : Feature = inputParameter(2) in<br>    if parameter <> null and parameter.oclIsKindOf(Action) then<br>        parameter.oclAsType(Action)<br>    else<br>        null<br>    endif<br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:loopActionUsageBodyAction](https://www.omg.org/spec/SysML/20230201/vocab#loopActionUsageBodyAction)| [1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> to be performed repeatedly by the <code>LoopActionUsage</code>. It is the second <code>parameter</code> of the <code>LoopActionUsage</code>.</p> <br>| <p>The <code>ActionUsage</code> to be performed repeatedly by the <code>LoopActionUsage</code>. It is the second <code>parameter</code> of the <code>LoopActionUsage</code>.</p> <br>|



### ViewRenderingMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#ViewRenderingMembership

type: Shape

target class: [sysml_vocab:ViewRenderingMembership](https://www.omg.org/spec/SysML/20230201/vocab#ViewRenderingMembership)

definition of vocabulary class : <p>A <code>ViewRenderingMembership</code> is a <coed>FeatureMembership</code> that identifies the <code>viewRendering</code> of a <code>ViewDefinition</code> or <code>ViewUsage</code>.</p><br>referencedRendering =<br>    let reference: ReferenceSubsetting = <br>        ownedRendering.ownedReferenceSubsetting in<br>    if reference = null then ownedRendering<br>    else if not reference.referencedFeature.oclIsKindOf(RenderingUsage) then null<br>    else reference.referencedFeature.oclAsType(RenderingUsage)<br>    endif<br>owningType.oclIsKindOf(ViewDefinition) or<br>owningType.oclIsKindOf(ViewUsage)

description: <p>A <code>ViewRenderingMembership</code> is a <coed>FeatureMembership</code> that identifies the <code>viewRendering</code> of a <code>ViewDefinition</code> or <code>ViewUsage</code>.</p><br>referencedRendering =<br>    let reference: ReferenceSubsetting = <br>        ownedRendering.ownedReferenceSubsetting in<br>    if reference = null then ownedRendering<br>    else if not reference.referencedFeature.oclIsKindOf(RenderingUsage) then null<br>    else reference.referencedFeature.oclAsType(RenderingUsage)<br>    endif<br>owningType.oclIsKindOf(ViewDefinition) or<br>owningType.oclIsKindOf(ViewUsage)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:viewRenderingMembershipOwnedRendering](https://www.omg.org/spec/SysML/20230201/vocab#viewRenderingMembershipOwnedRendering)| [1]| [sysml_vocab:RenderingUsage](https://www.omg.org/spec/SysML/20230201/vocab#RenderingUsage)| <p>The owned <code>RenderingUsage</code> that is either itself the <code>referencedRendering</code> or subsets the <code>referencedRendering</code>.| <p>The owned <code>RenderingUsage</code> that is either itself the <code>referencedRendering</code> or subsets the <code>referencedRendering</code>.|
| [sysml_vocab:viewRenderingMembershipReferencedRendering](https://www.omg.org/spec/SysML/20230201/vocab#viewRenderingMembershipReferencedRendering)| [1]| [sysml_vocab:RenderingUsage](https://www.omg.org/spec/SysML/20230201/vocab#RenderingUsage)| <p> The <code>RenderingUsage</code> that is referenced through this <code>ViewRenderingMembership</code>. It is the <code>referencedFeature</code> of the <code>ownedReferenceSubsetting</code> for the <code>ownedRendering</code>, if there is one, and, otherwise, the <code>ownedRendering</code> itself.</p>| <p> The <code>RenderingUsage</code> that is referenced through this <code>ViewRenderingMembership</code>. It is the <code>referencedFeature</code> of the <code>ownedReferenceSubsetting</code> for the <code>ownedRendering</code>, if there is one, and, otherwise, the <code>ownedRendering</code> itself.</p>|



### Conjugation

URI: https://www.omg.org/spec/SysML/20230201/shapes#Conjugation

type: Shape

target class: [sysml_vocab:Conjugation](https://www.omg.org/spec/SysML/20230201/vocab#Conjugation)

definition of vocabulary class : <p><code>Conjugation</code> is a <code>Relationship</code> between two types in which the <code>conjugatedType</code> inherits all the <code>Features</code> of the <code>originalType</code>, but with all <code>input</code> and <code>output</code> <code>Features</code> reversed. That is, any <code>Features</code> with a <code>direction</code> <em>in</em> relative to the <code>originalType</code> are considered to have an effective <code>direction</code> of <em>out</em> relative to the <code>conjugatedType</code> and, similarly, <code>Features</code> with <code>direction</code> <em>out</em> in the <code>originalType</code> are considered to have an effective <code>direction</code> of <em>in</em> in the <code>conjugatedType</code>. <code>Features</code> with <code>direction</code> <em>inout</em>, or with no <code>direction</code>, in the <code>originalType</code>, are inherited without change.</p><br><br><p>A <code>Type</code> may participate as a <code>conjugatedType</code> in at most one <code>Conjugation</code> relationship, and such a <code>Type</code> may not also be the <code>specific</code> <code>Type</code> in any <code>Specialization</code> relationship.</p><br>

description: <p><code>Conjugation</code> is a <code>Relationship</code> between two types in which the <code>conjugatedType</code> inherits all the <code>Features</code> of the <code>originalType</code>, but with all <code>input</code> and <code>output</code> <code>Features</code> reversed. That is, any <code>Features</code> with a <code>direction</code> <em>in</em> relative to the <code>originalType</code> are considered to have an effective <code>direction</code> of <em>out</em> relative to the <code>conjugatedType</code> and, similarly, <code>Features</code> with <code>direction</code> <em>out</em> in the <code>originalType</code> are considered to have an effective <code>direction</code> of <em>in</em> in the <code>conjugatedType</code>. <code>Features</code> with <code>direction</code> <em>inout</em>, or with no <code>direction</code>, in the <code>originalType</code>, are inherited without change.</p><br><br><p>A <code>Type</code> may participate as a <code>conjugatedType</code> in at most one <code>Conjugation</code> relationship, and such a <code>Type</code> may not also be the <code>specific</code> <code>Type</code> in any <code>Specialization</code> relationship.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:conjugationOriginalType](https://www.omg.org/spec/SysML/20230201/vocab#conjugationOriginalType)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The <code>Type</code> to be conjugated.</p><br>| <p>The <code>Type</code> to be conjugated.</p><br>|
| [sysml_vocab:conjugationConjugatedType](https://www.omg.org/spec/SysML/20230201/vocab#conjugationConjugatedType)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The <code>Type</code> that is the result of applying <code>Conjugation</code> to the <code>originalType</code>.</p><br>| <p>The <code>Type</code> that is the result of applying <code>Conjugation</code> to the <code>originalType</code>.</p><br>|
| [sysml_vocab:conjugationOwningType](https://www.omg.org/spec/SysML/20230201/vocab#conjugationOwningType)| [0..1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The <code>conjugatedType</code> of this <code>Conjugation</code> that is also its <code>owningRelatedElement</code>.</p><br>| <p>The <code>conjugatedType</code> of this <code>Conjugation</code> that is also its <code>owningRelatedElement</code>.</p><br>|



### FeatureInverting

URI: https://www.omg.org/spec/SysML/20230201/shapes#FeatureInverting

type: Shape

target class: [sysml_vocab:FeatureInverting](https://www.omg.org/spec/SysML/20230201/vocab#FeatureInverting)

definition of vocabulary class : <p>A <code>FeatureInverting</code> is a <code>Relationship</code> between <code>Features</code> asserting that their interpretations (sequences) are the reverse of each other, identified as <code>featureInverted</code> and <code>invertingFeature</code>. For example, a <code>Feature</code> identifying each person&#39;s parents is the inverse of a <code>Feature</code> identifying each person&#39;s children. A person identified as a parent of another will identify that other as one of their children.</p><br>

description: <p>A <code>FeatureInverting</code> is a <code>Relationship</code> between <code>Features</code> asserting that their interpretations (sequences) are the reverse of each other, identified as <code>featureInverted</code> and <code>invertingFeature</code>. For example, a <code>Feature</code> identifying each person&#39;s parents is the inverse of a <code>Feature</code> identifying each person&#39;s children. A person identified as a parent of another will identify that other as one of their children.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:featureInvertingFeatureInverted](https://www.omg.org/spec/SysML/20230201/vocab#featureInvertingFeatureInverted)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is an inverse of the <code>invertingFeature</code>.</p>| <p>The <code>Feature</code> that is an inverse of the <code>invertingFeature</code>.</p>|
| [sysml_vocab:featureInvertingInvertingFeature](https://www.omg.org/spec/SysML/20230201/vocab#featureInvertingInvertingFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is an inverse of the <code>invertedFeature</code>.</p>| <p>The <code>Feature</code> that is an inverse of the <code>invertedFeature</code>.</p>|
| [sysml_vocab:featureInvertingOwningFeature](https://www.omg.org/spec/SysML/20230201/vocab#featureInvertingOwningFeature)| [0..1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>A <code>featureInverted</code> that is also the <code>owningRelatedElement</code> of this <code>FeatureInverting</code>.</p><br>| <p>A <code>featureInverted</code> that is also the <code>owningRelatedElement</code> of this <code>FeatureInverting</code>.</p><br>|



### Unioning

URI: https://www.omg.org/spec/SysML/20230201/shapes#Unioning

type: Shape

target class: [sysml_vocab:Unioning](https://www.omg.org/spec/SysML/20230201/vocab#Unioning)

definition of vocabulary class : <p><code>Unioning</code> is a <code>Relationship</code> that makes its <code>unioningType</code> one of the <code>unioningTypes</code> of its <code>typeUnioned</code>.</p><br>

description: <p><code>Unioning</code> is a <code>Relationship</code> that makes its <code>unioningType</code> one of the <code>unioningTypes</code> of its <code>typeUnioned</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:unioningUnioningType](https://www.omg.org/spec/SysML/20230201/vocab#unioningUnioningType)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p><code>Type</code> that partly determines interpretations of <code>typeUnioned</code>, as described in <code>Type::unioningType</code>.</p><br>| <p><code>Type</code> that partly determines interpretations of <code>typeUnioned</code>, as described in <code>Type::unioningType</code>.</p><br>|
| [sysml_vocab:unioningTypeUnioned](https://www.omg.org/spec/SysML/20230201/vocab#unioningTypeUnioned)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p><code>Type</code> with interpretations partly determined by <code>unioningType</code>, as described in <code>Type::unioningType</code>.</p><br>| <p><code>Type</code> with interpretations partly determined by <code>unioningType</code>, as described in <code>Type::unioningType</code>.</p><br>|



### Subsetting

URI: https://www.omg.org/spec/SysML/20230201/shapes#Subsetting

type: Shape

target class: [sysml_vocab:Subsetting](https://www.omg.org/spec/SysML/20230201/vocab#Subsetting)

definition of vocabulary class : <p><code>Subsetting</code> is <code>Specialization</code> in which the <code>specific</code> and <code>general</code> <code>Types</code> are <code>Features</code>. This means all values of the <code>subsettingFeature</code> (on instances of its domain, i.e., the intersection of its <code>featuringTypes</code>) are values of the <code>subsettedFeature</code> on instances of its domain. To support this the domain of the <code>subsettingFeature</code> must be the same or specialize (at least indirectly) the domain of the <code>subsettedFeature</code> (via <code>Specialization</code>), and the co-domain (intersection of the <code>types</code>) of the <code>subsettingFeature</code> must specialize the co-domain of the <code>subsettedFeature</code>.</p><br><br>let subsettingFeaturingTypes: OrderedSet(Type) =<br>    subsettingFeature.featuringTypes in<br>let subsettedFeaturingTypes: OrderedSet(Type) =<br>    subsettedFeature.featuringTypes in<br>let anythingType: Element =<br>    subsettingFeature.resolveGlobal('Base::Anything').memberElement in <br>subsettedFeaturingTypes->forAll(t |<br>    subsettingFeaturingTypes->isEmpty() and t = anythingType or<br>    subsettingFeaturingTypes->exists(specializes(t))<br>subsettedFeature.isUnique implies subsettingFeature.isUnique

description: <p><code>Subsetting</code> is <code>Specialization</code> in which the <code>specific</code> and <code>general</code> <code>Types</code> are <code>Features</code>. This means all values of the <code>subsettingFeature</code> (on instances of its domain, i.e., the intersection of its <code>featuringTypes</code>) are values of the <code>subsettedFeature</code> on instances of its domain. To support this the domain of the <code>subsettingFeature</code> must be the same or specialize (at least indirectly) the domain of the <code>subsettedFeature</code> (via <code>Specialization</code>), and the co-domain (intersection of the <code>types</code>) of the <code>subsettingFeature</code> must specialize the co-domain of the <code>subsettedFeature</code>.</p><br><br>let subsettingFeaturingTypes: OrderedSet(Type) =<br>    subsettingFeature.featuringTypes in<br>let subsettedFeaturingTypes: OrderedSet(Type) =<br>    subsettedFeature.featuringTypes in<br>let anythingType: Element =<br>    subsettingFeature.resolveGlobal('Base::Anything').memberElement in <br>subsettedFeaturingTypes->forAll(t |<br>    subsettingFeaturingTypes->isEmpty() and t = anythingType or<br>    subsettingFeaturingTypes->exists(specializes(t))<br>subsettedFeature.isUnique implies subsettingFeature.isUnique

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:subsettingSubsettedFeature](https://www.omg.org/spec/SysML/20230201/vocab#subsettingSubsettedFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is subsetted by the <code>subsettingFeature</code> of this <code>Subsetting</code>.</p><br>| <p>The <code>Feature</code> that is subsetted by the <code>subsettingFeature</code> of this <code>Subsetting</code>.</p><br>|
| [sysml_vocab:subsettingSubsettingFeature](https://www.omg.org/spec/SysML/20230201/vocab#subsettingSubsettingFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is a subset of the <code>subsettedFeature</code> of this <code>Subsetting</code>.</p><br>| <p>The <code>Feature</code> that is a subset of the <code>subsettedFeature</code> of this <code>Subsetting</code>.</p><br>|
| [sysml_vocab:subsettingOwningFeature](https://www.omg.org/spec/SysML/20230201/vocab#subsettingOwningFeature)| [0..1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>A <code>subsettingFeature</code> that is also the <code>owningRelatedElement</code> of this <code>Subsetting</code>.</p><br><br>| <p>A <code>subsettingFeature</code> that is also the <code>owningRelatedElement</code> of this <code>Subsetting</code>.</p><br><br>|



### Classifier

URI: https://www.omg.org/spec/SysML/20230201/shapes#Classifier

type: Shape

target class: [sysml_vocab:Classifier](https://www.omg.org/spec/SysML/20230201/vocab#Classifier)

definition of vocabulary class : <p>A <code>Classifier</code> is a <code>Type</code> that classifies:</p><br><br><ul><br>	<li>Things (in the universe) regardless of how <code>Features</code> relate them. (These are interpreted semantically as sequences of exactly one thing.)</li><br>	<li>How the above things are related by <code>Features.</code> (These are interpreted semantically as sequences of multiple things, such that the last thing in the sequence is also classified by the <code>Classifier</code>. Note that this means that a <code>Classifier</code> modeled as specializing a <code>Feature</code> cannot classify anything.)</li><br></ul><br><br><br>ownedSubclassification = <br>    ownedSpecialization->selectByKind(Subclassification)<br>multiplicity <> null implies multiplicity.featuringType->isEmpty()

description: <p>A <code>Classifier</code> is a <code>Type</code> that classifies:</p><br><br><ul><br>	<li>Things (in the universe) regardless of how <code>Features</code> relate them. (These are interpreted semantically as sequences of exactly one thing.)</li><br>	<li>How the above things are related by <code>Features.</code> (These are interpreted semantically as sequences of multiple things, such that the last thing in the sequence is also classified by the <code>Classifier</code>. Note that this means that a <code>Classifier</code> modeled as specializing a <code>Feature</code> cannot classify anything.)</li><br></ul><br><br><br>ownedSubclassification = <br>    ownedSpecialization->selectByKind(Subclassification)<br>multiplicity <> null implies multiplicity.featuringType->isEmpty()

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:classifierOwnedSubclassification](https://www.omg.org/spec/SysML/20230201/vocab#classifierOwnedSubclassification)| [0..*]| [sysml_vocab:Subclassification](https://www.omg.org/spec/SysML/20230201/vocab#Subclassification)| <p>The <code>ownedSpecializations</code> of this <code>Classifier</code> that are <code>Subclassifications</code>, for which this <code>Classifier</code> is the <code>subclassifier</code>.</p><br>| <p>The <code>ownedSpecializations</code> of this <code>Classifier</code> that are <code>Subclassifications</code>, for which this <code>Classifier</code> is the <code>subclassifier</code>.</p><br>|



### SelectExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#SelectExpression

type: Shape

target class: [sysml_vocab:SelectExpression](https://www.omg.org/spec/SysML/20230201/vocab#SelectExpression)

definition of vocabulary class : <p>A <code>SelectExpression</code> is an <code>OperatorExpression</code> whose operator is <code>"select"</code>, which resolves to the <code>Function</code> <em><code>ControlFunctions::select</code></em> from the Kernel Functions Library.</p><br>operator = 'select'

description: <p>A <code>SelectExpression</code> is an <code>OperatorExpression</code> whose operator is <code>"select"</code>, which resolves to the <code>Function</code> <em><code>ControlFunctions::select</code></em> from the Kernel Functions Library.</p><br>operator = 'select'

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### BooleanExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#BooleanExpression

type: Shape

target class: [sysml_vocab:BooleanExpression](https://www.omg.org/spec/SysML/20230201/vocab#BooleanExpression)

definition of vocabulary class : <p>A <code>BooleanExpression</code> is a <em><code>Boolean</code></em>-valued <code>Expression</code> whose type is a <code>Predicate</code>. It represents a logical condition resulting from the evaluation of the <code>Predicate</code>.</p><br><br>specializesFromLibrary('Performances::booleanEvaluations')

description: <p>A <code>BooleanExpression</code> is a <em><code>Boolean</code></em>-valued <code>Expression</code> whose type is a <code>Predicate</code>. It represents a logical condition resulting from the evaluation of the <code>Predicate</code>.</p><br><br>specializesFromLibrary('Performances::booleanEvaluations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:booleanExpressionPredicate](https://www.omg.org/spec/SysML/20230201/vocab#booleanExpressionPredicate)| [0..1]| [sysml_vocab:Predicate](https://www.omg.org/spec/SysML/20230201/vocab#Predicate)| <p>The <code>Predicate</code> that types this <code>BooleanExpression</code>.</p><br><p>The Predicate that types the Expression.</p><br>| <p>The <code>Predicate</code> that types this <code>BooleanExpression</code>.</p><br><p>The Predicate that types the Expression.</p><br>|



### FeatureChainExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#FeatureChainExpression

type: Shape

target class: [sysml_vocab:FeatureChainExpression](https://www.omg.org/spec/SysML/20230201/vocab#FeatureChainExpression)

definition of vocabulary class : <p>A <code>FeatureChainExpression</code> is an <code>OperatorExpression</code> whose operator is <code>"."</code>, which resolves to the <code>Function</code> <em><code>ControlFunctions::'.'</code></em> from the Kernel Functions Library. It evaluates to the result of chaining the <code>result</code> <code>Feature</code> of its single <code>argument</code> <code>Expression</code> with its <code>targetFeature</code>.</p><br>let sourceParameter : Feature = sourceTargetFeature() in<br>sourceTargetFeature <> null and<br>sourceTargetFeature.redefinesFromLibrary('ControlFunctions::'.'::source::target')<br>let sourceParameter : Feature = sourceTargetFeature() in<br>sourceTargetFeature <> null and<br>sourceTargetFeature.redefines(targetFeature)<br>targetFeature =<br>    let nonParameterMemberships : Sequence(Membership) = ownedMembership-><br>        reject(oclIsKindOf(ParameterMembership)) in<br>    if nonParameterMemberships->isEmpty() or<br>       not nonParameterMemberships->first().memberElement.oclIsKindOf(Feature)<br>    then null<br>    else nonParameterMemberships->first().memberElement.oclAsType(Feature)<br>    endif<br>argument->notEmpty() implies<br>    targetFeature.featuringType->forAll(t | <br>        t.specializes(argument->at(1).result))

description: <p>A <code>FeatureChainExpression</code> is an <code>OperatorExpression</code> whose operator is <code>"."</code>, which resolves to the <code>Function</code> <em><code>ControlFunctions::'.'</code></em> from the Kernel Functions Library. It evaluates to the result of chaining the <code>result</code> <code>Feature</code> of its single <code>argument</code> <code>Expression</code> with its <code>targetFeature</code>.</p><br>let sourceParameter : Feature = sourceTargetFeature() in<br>sourceTargetFeature <> null and<br>sourceTargetFeature.redefinesFromLibrary('ControlFunctions::'.'::source::target')<br>let sourceParameter : Feature = sourceTargetFeature() in<br>sourceTargetFeature <> null and<br>sourceTargetFeature.redefines(targetFeature)<br>targetFeature =<br>    let nonParameterMemberships : Sequence(Membership) = ownedMembership-><br>        reject(oclIsKindOf(ParameterMembership)) in<br>    if nonParameterMemberships->isEmpty() or<br>       not nonParameterMemberships->first().memberElement.oclIsKindOf(Feature)<br>    then null<br>    else nonParameterMemberships->first().memberElement.oclAsType(Feature)<br>    endif<br>argument->notEmpty() implies<br>    targetFeature.featuringType->forAll(t | <br>        t.specializes(argument->at(1).result))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:featureChainExpressionTargetFeature](https://www.omg.org/spec/SysML/20230201/vocab#featureChainExpressionTargetFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is accessed by this <code>FeatureChainExpression<code>, which is its first non-<code>parameter</code> <code>member</code>.<p>| <p>The <code>Feature</code> that is accessed by this <code>FeatureChainExpression<code>, which is its first non-<code>parameter</code> <code>member</code>.<p>|



### ConcernUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ConcernUsage

type: Shape

target class: [sysml_vocab:ConcernUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConcernUsage)

definition of vocabulary class : <p>A <code>ConcernUsage</code> is a <code>Usage</code> of a <code>ConcernDefinition</code>.</p><br><br> The <code>ownedStakeholder</code> features of the ConcernUsage shall all subset the <em><code>ConcernCheck::concernedStakeholders</code> </em>feature. If the ConcernUsage is an <code>ownedFeature</code> of a StakeholderDefinition or StakeholderUsage, then the ConcernUsage shall have an <code>ownedStakeholder</code> feature that is bound to the <em><code>self</code></em> feature of its owner.</p><br><br>specializesFromLibrary('Requirements::concernChecks')<br>owningFeatureMembership <> null and<br>owningFeatureMembership.oclIsKindOf(FramedConcernMembership) implies<br>    specializesFromLibrary('Requirements::RequirementCheck::concerns')

description: <p>A <code>ConcernUsage</code> is a <code>Usage</code> of a <code>ConcernDefinition</code>.</p><br><br> The <code>ownedStakeholder</code> features of the ConcernUsage shall all subset the <em><code>ConcernCheck::concernedStakeholders</code> </em>feature. If the ConcernUsage is an <code>ownedFeature</code> of a StakeholderDefinition or StakeholderUsage, then the ConcernUsage shall have an <code>ownedStakeholder</code> feature that is bound to the <em><code>self</code></em> feature of its owner.</p><br><br>specializesFromLibrary('Requirements::concernChecks')<br>owningFeatureMembership <> null and<br>owningFeatureMembership.oclIsKindOf(FramedConcernMembership) implies<br>    specializesFromLibrary('Requirements::RequirementCheck::concerns')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:concernUsageConcernDefinition](https://www.omg.org/spec/SysML/20230201/vocab#concernUsageConcernDefinition)| [0..1]| [sysml_vocab:ConcernDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ConcernDefinition)| <p>The ConcernDefinition that is the single type of this ConcernUsage.</p>| <p>The ConcernDefinition that is the single type of this ConcernUsage.</p>|



### JoinNode

URI: https://www.omg.org/spec/SysML/20230201/shapes#JoinNode

type: Shape

target class: [sysml_vocab:JoinNode](https://www.omg.org/spec/SysML/20230201/vocab#JoinNode)

definition of vocabulary class : <p>A <code>JoinNode</code> is a <code>ControlNode</code> that waits for the completion of all the predecessor <code>Actions</code> given by incoming <code>Successions</code>.</p><br>sourceConnector->selectByKind(Succession)->size() <= 1<br>specializesFromLibrary('Actions::Action::join')

description: <p>A <code>JoinNode</code> is a <code>ControlNode</code> that waits for the completion of all the predecessor <code>Actions</code> given by incoming <code>Successions</code>.</p><br>sourceConnector->selectByKind(Succession)->size() <= 1<br>specializesFromLibrary('Actions::Action::join')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Package

URI: https://www.omg.org/spec/SysML/20230201/shapes#Package

type: Shape

target class: [sysml_vocab:Package](https://www.omg.org/spec/SysML/20230201/vocab#Package)

definition of vocabulary class : <p>A <code>Package</code> is a <code>Namespace</code> used to group <code>Elements</code>, without any instance-level semantics. It may have one or more model-level evaluable <code>filterCondition</code> <code>Expressions</code> used to filter its <code>importedMemberships</code>. Any imported <code>member</code> must meet all of the <code>filterConditions</code>.</p><br>filterCondition = ownedMembership-><br>    selectByKind(ElementFilterMembership).condition

description: <p>A <code>Package</code> is a <code>Namespace</code> used to group <code>Elements</code>, without any instance-level semantics. It may have one or more model-level evaluable <code>filterCondition</code> <code>Expressions</code> used to filter its <code>importedMemberships</code>. Any imported <code>member</code> must meet all of the <code>filterConditions</code>.</p><br>filterCondition = ownedMembership-><br>    selectByKind(ElementFilterMembership).condition

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:packageFilterCondition](https://www.omg.org/spec/SysML/20230201/vocab#packageFilterCondition)| [0..*]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The model-level evaluable <code><em>Boolean</em></code>-valued <code>Expression</code> used to filter the <code>members</code> of this <code>Package</code>, which are owned by the <code>Package</code> are via <code>ElementFilterMemberships</code>.</p><br>| <p>The model-level evaluable <code><em>Boolean</em></code>-valued <code>Expression</code> used to filter the <code>members</code> of this <code>Package</code>, which are owned by the <code>Package</code> are via <code>ElementFilterMemberships</code>.</p><br>|



### ItemFlow

URI: https://www.omg.org/spec/SysML/20230201/shapes#ItemFlow

type: Shape

target class: [sysml_vocab:ItemFlow](https://www.omg.org/spec/SysML/20230201/vocab#ItemFlow)

definition of vocabulary class : <p>An <code>ItemFlow</code> is a <code>Step</code> that represents the transfer of objects or data values from one <code>Feature</code> to another. <code>ItemFlows</code> can take non-zero time to complete.</p><br><br>if itemFlowEnds->isEmpty() then<br>    specializesFromLibrary('Transfers::transfers')<br>else<br>    specializesFromLibrary('Transfers::flowTransfers')<br>endif<br>itemType =<br>    if itemFeature = null then Sequence{}<br>    else itemFeature.type<br>    endif<br>sourceOutputFeature =<br>    if connectorEnd->isEmpty() or <br>        connectorEnd.ownedFeature->isEmpty()<br>    then null<br>    else connectorEnd.ownedFeature->first()<br>    endif<br>targetInputFeature =<br>    if connectorEnd->size() < 2 or <br>        connectorEnd->at(2).ownedFeature->isEmpty()<br>    then null<br>    else connectorEnd->at(2).ownedFeature->first()<br>    endif<br>itemFlowEnd = connectorEnd->selectByKind(ItemFlowEnd)<br>itemFeature =<br>    let itemFeatures : Sequence(ItemFeature) = <br>        ownedFeature->selectByKind(ItemFeature) in<br>    if itemFeatures->isEmpty() then null<br>    else itemFeatures->first()<br>    endif<br>ownedFeature->selectByKind(ItemFeature)->size() <= 1

description: <p>An <code>ItemFlow</code> is a <code>Step</code> that represents the transfer of objects or data values from one <code>Feature</code> to another. <code>ItemFlows</code> can take non-zero time to complete.</p><br><br>if itemFlowEnds->isEmpty() then<br>    specializesFromLibrary('Transfers::transfers')<br>else<br>    specializesFromLibrary('Transfers::flowTransfers')<br>endif<br>itemType =<br>    if itemFeature = null then Sequence{}<br>    else itemFeature.type<br>    endif<br>sourceOutputFeature =<br>    if connectorEnd->isEmpty() or <br>        connectorEnd.ownedFeature->isEmpty()<br>    then null<br>    else connectorEnd.ownedFeature->first()<br>    endif<br>targetInputFeature =<br>    if connectorEnd->size() < 2 or <br>        connectorEnd->at(2).ownedFeature->isEmpty()<br>    then null<br>    else connectorEnd->at(2).ownedFeature->first()<br>    endif<br>itemFlowEnd = connectorEnd->selectByKind(ItemFlowEnd)<br>itemFeature =<br>    let itemFeatures : Sequence(ItemFeature) = <br>        ownedFeature->selectByKind(ItemFeature) in<br>    if itemFeatures->isEmpty() then null<br>    else itemFeatures->first()<br>    endif<br>ownedFeature->selectByKind(ItemFeature)->size() <= 1

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:itemFlowItemType](https://www.omg.org/spec/SysML/20230201/vocab#itemFlowItemType)| [0..*]| [sysml_vocab:Classifier](https://www.omg.org/spec/SysML/20230201/vocab#Classifier)| <p>The type of values transferred, which is the <code>type</code> of the <code>itemFeature</code> of the <code>ItemFlow</code>.</p><br><br>| <p>The type of values transferred, which is the <code>type</code> of the <code>itemFeature</code> of the <code>ItemFlow</code>.</p><br><br>|
| [sysml_vocab:itemFlowTargetInputFeature](https://www.omg.org/spec/SysML/20230201/vocab#itemFlowTargetInputFeature)| [0..1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that receives the values carried by the <code>ItemFlow</code>. It must be an owned <code>output</code> of the target participant of the <code>ItemFlow</code>.</p>| <p>The <code>Feature</code> that receives the values carried by the <code>ItemFlow</code>. It must be an owned <code>output</code> of the target participant of the <code>ItemFlow</code>.</p>|
| [sysml_vocab:itemFlowSourceOutputFeature](https://www.omg.org/spec/SysML/20230201/vocab#itemFlowSourceOutputFeature)| [0..1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that provides the items carried by the <code>ItemFlow</code>. It must be an owned <code>output</code> of the <code>source</code> of the <code>ItemFlow</code>.</p><br>| <p>The <code>Feature</code> that provides the items carried by the <code>ItemFlow</code>. It must be an owned <code>output</code> of the <code>source</code> of the <code>ItemFlow</code>.</p><br>|
| [sysml_vocab:itemFlowItemFlowEnd](https://www.omg.org/spec/SysML/20230201/vocab#itemFlowItemFlowEnd)| [0..*]| [sysml_vocab:ItemFlowEnd](https://www.omg.org/spec/SysML/20230201/vocab#ItemFlowEnd)| <p>The <code>connectorEnds</code> of this <code>ItemFlow</code> that are <code>ItemFlowEnds</code>.</p><br>| <p>The <code>connectorEnds</code> of this <code>ItemFlow</code> that are <code>ItemFlowEnds</code>.</p><br>|
| [sysml_vocab:itemFlowItemFeature](https://www.omg.org/spec/SysML/20230201/vocab#itemFlowItemFeature)| [0..1]| [sysml_vocab:ItemFeature](https://www.omg.org/spec/SysML/20230201/vocab#ItemFeature)| <p>The <code>ownedFeature</code> of the <code>ItemFlow</code> that is an <code>ItemFeature</code> (if any).</p><br>| <p>The <code>ownedFeature</code> of the <code>ItemFlow</code> that is an <code>ItemFeature</code> (if any).</p><br>|
| [sysml_vocab:itemFlowInteraction](https://www.omg.org/spec/SysML/20230201/vocab#itemFlowInteraction)| [0..*]| [sysml_vocab:Interaction](https://www.omg.org/spec/SysML/20230201/vocab#Interaction)| <p>The <code>Interactions</code> that type this <code>ItemFlow</code>. <code>Interactions</code> are both <code>Associations</code> and <code>Behaviors</code>, which can type <code>Connectors</code> and <code>Steps</code>, respectively.</p>| <p>The <code>Interactions</code> that type this <code>ItemFlow</code>. <code>Interactions</code> are both <code>Associations</code> and <code>Behaviors</code>, which can type <code>Connectors</code> and <code>Steps</code>, respectively.</p>|



### Interaction

URI: https://www.omg.org/spec/SysML/20230201/shapes#Interaction

type: Shape

target class: [sysml_vocab:Interaction](https://www.omg.org/spec/SysML/20230201/vocab#Interaction)

definition of vocabulary class : <p>An <code>Interaction</code> is a <code>Behavior</code> that is also an <code>Association</code>, providing a context for multiple objects that have behaviors that impact one another.</p><br>

description: <p>An <code>Interaction</code> is a <code>Behavior</code> that is also an <code>Association</code>, providing a context for multiple objects that have behaviors that impact one another.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### StateUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#StateUsage

type: Shape

target class: [sysml_vocab:StateUsage](https://www.omg.org/spec/SysML/20230201/vocab#StateUsage)

definition of vocabulary class : <p>A <code>StateUsage</code> is an <code>ActionUsage</code> that is nominally the <code>Usage</code> of a <code>StateDefinition</code>. However, other kinds of kernel <code>Behaviors</code> are also allowed as <code>types</code>, to permit use of <code>Behaviors</code from the Kernel Model Libraries.</p><br><br><p>A <code>StateUsage</code> may be related to up to three of its <code>ownedFeatures</code> by <code>StateSubactionMembership</code> <code>Relationships</code>, all of different <code>kinds</code>, corresponding to the entry, do and exit actions of the <code>StateUsage</code>.</p><br><br>doAction =<br>    let doMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::do) in<br>    if doMemberships->isEmpty() then null<br>    else doMemberships->at(1)<br>    endif<br>entryAction =<br>    let entryMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::entry) in<br>    if entryMemberships->isEmpty() then null<br>    else entryMemberships->at(1)<br>    endif<br>isParallel implies<br>    nestedAction.incomingTransition->isEmpty() and<br>    nestedAction.outgoingTransition->isEmpty()<br>isSubstateUsage(true) implies<br>    specializesFromLibrary('States::State::substates')<br>exitAction =<br>    let exitMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::exit) in<br>    if exitMemberships->isEmpty() then null<br>    else exitMemberships->at(1)<br>    endif<br>specializesFromLibrary('States::stateActions')<br>ownedMembership-><br>    selectByKind(StateSubactionMembership)-><br>    isUnique(kind)<br>isSubstateUsage(false) implies<br>    specializesFromLibrary('States::State::substates')

description: <p>A <code>StateUsage</code> is an <code>ActionUsage</code> that is nominally the <code>Usage</code> of a <code>StateDefinition</code>. However, other kinds of kernel <code>Behaviors</code> are also allowed as <code>types</code>, to permit use of <code>Behaviors</code from the Kernel Model Libraries.</p><br><br><p>A <code>StateUsage</code> may be related to up to three of its <code>ownedFeatures</code> by <code>StateSubactionMembership</code> <code>Relationships</code>, all of different <code>kinds</code>, corresponding to the entry, do and exit actions of the <code>StateUsage</code>.</p><br><br>doAction =<br>    let doMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::do) in<br>    if doMemberships->isEmpty() then null<br>    else doMemberships->at(1)<br>    endif<br>entryAction =<br>    let entryMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::entry) in<br>    if entryMemberships->isEmpty() then null<br>    else entryMemberships->at(1)<br>    endif<br>isParallel implies<br>    nestedAction.incomingTransition->isEmpty() and<br>    nestedAction.outgoingTransition->isEmpty()<br>isSubstateUsage(true) implies<br>    specializesFromLibrary('States::State::substates')<br>exitAction =<br>    let exitMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::exit) in<br>    if exitMemberships->isEmpty() then null<br>    else exitMemberships->at(1)<br>    endif<br>specializesFromLibrary('States::stateActions')<br>ownedMembership-><br>    selectByKind(StateSubactionMembership)-><br>    isUnique(kind)<br>isSubstateUsage(false) implies<br>    specializesFromLibrary('States::State::substates')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:stateUsageIsParallel](https://www.omg.org/spec/SysML/20230201/vocab#stateUsageIsParallel)| [1]| Boolean| <p>Whether the <code>nestedStates</code> of this <code>StateUsage</code> are to all be performed in parallel. If true, none of the <code>nestedActions</code> (which include <code>nestedStates</code>) may have any incoming or outgoing <code>Transitions</code>. If false, only one <code>nestedState</code> may be performed at a time.</p><br>| <p>Whether the <code>nestedStates</code> of this <code>StateUsage</code> are to all be performed in parallel. If true, none of the <code>nestedActions</code> (which include <code>nestedStates</code>) may have any incoming or outgoing <code>Transitions</code>. If false, only one <code>nestedState</code> may be performed at a time.</p><br>|
| [sysml_vocab:stateUsageStateDefinition](https://www.omg.org/spec/SysML/20230201/vocab#stateUsageStateDefinition)| [0..*]| [sysml_vocab:Behavior](https://www.omg.org/spec/SysML/20230201/vocab#Behavior)| <p>The <code>Behaviors</code> that are the <code>types</code> of this <code>StateUsage</code>. Nominally, these would be <code>StateDefinitions</code>, but kernel <code>Behaviors</code> are also allowed, to permit use of <code>Behaviors</code> from the Kernel Model Libraries.</p>| <p>The <code>Behaviors</code> that are the <code>types</code> of this <code>StateUsage</code>. Nominally, these would be <code>StateDefinitions</code>, but kernel <code>Behaviors</code> are also allowed, to permit use of <code>Behaviors</code> from the Kernel Model Libraries.</p>|
| [sysml_vocab:stateUsageEntryAction](https://www.omg.org/spec/SysML/20230201/vocab#stateUsageEntryAction)| [0..1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> of this <code>StateUsage</code> to be performed on entry to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateUsage</code> by a <code>StateSubactionMembership</code>  with <code>kind = entry</code>.</p>| <p>The <code>ActionUsage</code> of this <code>StateUsage</code> to be performed on entry to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateUsage</code> by a <code>StateSubactionMembership</code>  with <code>kind = entry</code>.</p>|
| [sysml_vocab:stateUsageDoAction](https://www.omg.org/spec/SysML/20230201/vocab#stateUsageDoAction)| [0..1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> of this <code>StateUsage</code> to be performed while in the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateUsage</code> by a <code>StateSubactionMembership</code>  with <code>kind = do</code>.</p>| <p>The <code>ActionUsage</code> of this <code>StateUsage</code> to be performed while in the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateUsage</code> by a <code>StateSubactionMembership</code>  with <code>kind = do</code>.</p>|
| [sysml_vocab:stateUsageExitAction](https://www.omg.org/spec/SysML/20230201/vocab#stateUsageExitAction)| [0..1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> of this <code>StateUsage</code> to be performed on exit to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateUsage</code> by a <code>StateSubactionMembership</code>  with <code>kind = exit</code>.</p>| <p>The <code>ActionUsage</code> of this <code>StateUsage</code> to be performed on exit to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateUsage</code> by a <code>StateSubactionMembership</code>  with <code>kind = exit</code>.</p>|



### ControlNode

URI: https://www.omg.org/spec/SysML/20230201/shapes#ControlNode

type: Shape

target class: [sysml_vocab:ControlNode](https://www.omg.org/spec/SysML/20230201/vocab#ControlNode)

definition of vocabulary class : <p>A <code>ControlNode</code> is an <code>ActionUsage</code> that does not have any inherent behavior but provides constraints on incoming and outgoing <code>Successions</code> that are used to control other <code>Actions</code>. A <code>ControlNode</code> must be a composite owned <code>usage</code> of an <code>ActionDefinition</code> or <code>ActionUsage</code>.</p><br><br>sourceConnector->selectByKind(Succession)-><br>    collect(connectorEnd->at(1).multiplicity)-><br>    forAll(sourceMult | <br>        multiplicityHasBounds(sourceMult, 1, 1))<br>owningType <> null and <br>(owningType.oclIsKindOf(ActionDefinition) or<br> owningType.oclIsKindOf(ActionUsage))<br>targetConnector->selectByKind(Succession)-><br>    collect(connectorEnd->at(2).multiplicity)-><br>    forAll(targetMult | <br>        multiplicityHasBounds(targetMult, 1, 1))<br>specializesFromLibrary('Action::Action::controls')

description: <p>A <code>ControlNode</code> is an <code>ActionUsage</code> that does not have any inherent behavior but provides constraints on incoming and outgoing <code>Successions</code> that are used to control other <code>Actions</code>. A <code>ControlNode</code> must be a composite owned <code>usage</code> of an <code>ActionDefinition</code> or <code>ActionUsage</code>.</p><br><br>sourceConnector->selectByKind(Succession)-><br>    collect(connectorEnd->at(1).multiplicity)-><br>    forAll(sourceMult | <br>        multiplicityHasBounds(sourceMult, 1, 1))<br>owningType <> null and <br>(owningType.oclIsKindOf(ActionDefinition) or<br> owningType.oclIsKindOf(ActionUsage))<br>targetConnector->selectByKind(Succession)-><br>    collect(connectorEnd->at(2).multiplicity)-><br>    forAll(targetMult | <br>        multiplicityHasBounds(targetMult, 1, 1))<br>specializesFromLibrary('Action::Action::controls')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### VerificationCaseDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#VerificationCaseDefinition

type: Shape

target class: [sysml_vocab:VerificationCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#VerificationCaseDefinition)

definition of vocabulary class : <p>A <code>VerificationCaseDefinition</code> is a <code>CaseDefinition</code> for the purpose of verification of the subject of the case against its requirements.</p><br>verifiedRequirement =<br>    if objectiveRequirement = null then OrderedSet{}<br>    else <br>        objectiveRequirement.featureMembership-><br>            selectByKind(RequirementVerificationMembership).<br>            verifiedRequirement->asOrderedSet()<br>    endif<br>specializesFromLibrary('VerificationCases::VerificationCase')

description: <p>A <code>VerificationCaseDefinition</code> is a <code>CaseDefinition</code> for the purpose of verification of the subject of the case against its requirements.</p><br>verifiedRequirement =<br>    if objectiveRequirement = null then OrderedSet{}<br>    else <br>        objectiveRequirement.featureMembership-><br>            selectByKind(RequirementVerificationMembership).<br>            verifiedRequirement->asOrderedSet()<br>    endif<br>specializesFromLibrary('VerificationCases::VerificationCase')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:verificationCaseDefinitionVerifiedRequirement](https://www.omg.org/spec/SysML/20230201/vocab#verificationCaseDefinitionVerifiedRequirement)| [0..*]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The <code>RequirementUsages</code> verified by this <code>VerificationCaseDefinition</code>, which are the <code>verifiedRequirements</code> of all <code>RequirementVerificationMemberships</code> of the <code>objectiveRequirement</code>.</p>| <p>The <code>RequirementUsages</code> verified by this <code>VerificationCaseDefinition</code>, which are the <code>verifiedRequirements</code> of all <code>RequirementVerificationMemberships</code> of the <code>objectiveRequirement</code>.</p>|



### SuccessionFlowConnectionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#SuccessionFlowConnectionUsage

type: Shape

target class: [sysml_vocab:SuccessionFlowConnectionUsage](https://www.omg.org/spec/SysML/20230201/vocab#SuccessionFlowConnectionUsage)

definition of vocabulary class : <p>A <code>SuccessionFlowConnectionUsage</code> is a <code>FlowConnectionUsage</code> that is also a <code>SuccessionItemFlow</code>.</p><br>specializesFromLibrary('Connections::successionFlowConnections')

description: <p>A <code>SuccessionFlowConnectionUsage</code> is a <code>FlowConnectionUsage</code> that is also a <code>SuccessionItemFlow</code>.</p><br>specializesFromLibrary('Connections::successionFlowConnections')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### RequirementDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#RequirementDefinition

type: Shape

target class: [sysml_vocab:RequirementDefinition](https://www.omg.org/spec/SysML/20230201/vocab#RequirementDefinition)

definition of vocabulary class : <p>A <code>RequirementDefinition</code> is a <code>ConstraintDefinition</code> that defines a requirement used in the context of a specification as a constraint that a valid solution must satisfy. The specification is relative to a specified subject, possibly in collaboration with one or more external actors.</p><br>text = documentation.body<br>assumedConstraint = ownedFeatureMembership-><br>    selectByKind(RequirementConstraintMembership)-><br>    select(kind = RequirementConstraintKind::assumption).<br>    ownedConstraint<br>requiredConstraint = ownedFeatureMembership-><br>    selectByKind(RequirementConstraintMembership)-><br>    select(kind = RequirementConstraintKind::requirement).<br>    ownedConstraint<br>subjectParameter =<br>    let subjects : OrderedSet(SubjectMembership) = <br>        featureMembership->selectByKind(SubjectMembership) in<br>    if subjects->isEmpty() then null<br>    else subjects->first().ownedSubjectParameter<br>    endif<br>framedConcern = featureMembership-><br>    selectByKind(FramedConcernMembership).<br>    ownedConcern<br>actorParameter = featureMembership-><br>    selectByKind(ActorMembership).<br>    ownedActorParameter<br>stakeholderParameter = featureMembership-><br>    selectByKind(StakholderMembership).<br>    ownedStakeholderParameter<br>featureMembership->	<br>    selectByKind(SubjectMembership)-><br>    size() <= 1<br>input->notEmpty() and input->first() = subjectParameter<br>specializesFromLibrary('Requirements::RequirementCheck')

description: <p>A <code>RequirementDefinition</code> is a <code>ConstraintDefinition</code> that defines a requirement used in the context of a specification as a constraint that a valid solution must satisfy. The specification is relative to a specified subject, possibly in collaboration with one or more external actors.</p><br>text = documentation.body<br>assumedConstraint = ownedFeatureMembership-><br>    selectByKind(RequirementConstraintMembership)-><br>    select(kind = RequirementConstraintKind::assumption).<br>    ownedConstraint<br>requiredConstraint = ownedFeatureMembership-><br>    selectByKind(RequirementConstraintMembership)-><br>    select(kind = RequirementConstraintKind::requirement).<br>    ownedConstraint<br>subjectParameter =<br>    let subjects : OrderedSet(SubjectMembership) = <br>        featureMembership->selectByKind(SubjectMembership) in<br>    if subjects->isEmpty() then null<br>    else subjects->first().ownedSubjectParameter<br>    endif<br>framedConcern = featureMembership-><br>    selectByKind(FramedConcernMembership).<br>    ownedConcern<br>actorParameter = featureMembership-><br>    selectByKind(ActorMembership).<br>    ownedActorParameter<br>stakeholderParameter = featureMembership-><br>    selectByKind(StakholderMembership).<br>    ownedStakeholderParameter<br>featureMembership->	<br>    selectByKind(SubjectMembership)-><br>    size() <= 1<br>input->notEmpty() and input->first() = subjectParameter<br>specializesFromLibrary('Requirements::RequirementCheck')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:requirementDefinitionReqId](https://www.omg.org/spec/SysML/20230201/vocab#requirementDefinitionReqId)| [0..1]| String| <p>An optional modeler-specified identifier for this <code>RequirementDefinition</code> (used, e.g., to link it to an original requirement text in some source document), which is the <code>declaredShortName</code> for the <code>RequirementDefinition</code>.</p>| <p>An optional modeler-specified identifier for this <code>RequirementDefinition</code> (used, e.g., to link it to an original requirement text in some source document), which is the <code>declaredShortName</code> for the <code>RequirementDefinition</code>.</p>|
| [sysml_vocab:requirementDefinitionText](https://www.omg.org/spec/SysML/20230201/vocab#requirementDefinitionText)| [0..*]| String| <p>An optional textual statement of the requirement represented by this <code>RequirementDefinition</code>, derived from the <code>bodies</code> of the <code>documentation</code> of the <code>RequirementDefinition</code>.</p><br>| <p>An optional textual statement of the requirement represented by this <code>RequirementDefinition</code>, derived from the <code>bodies</code> of the <code>documentation</code> of the <code>RequirementDefinition</code>.</p><br>|
| [sysml_vocab:requirementDefinitionSubjectParameter](https://www.omg.org/spec/SysML/20230201/vocab#requirementDefinitionSubjectParameter)| [1]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>parameter</code> of this <code>RequirementDefinition</code> that represents its subject.</p>| <p>The <code>parameter</code> of this <code>RequirementDefinition</code> that represents its subject.</p>|
| [sysml_vocab:requirementDefinitionActorParameter](https://www.omg.org/spec/SysML/20230201/vocab#requirementDefinitionActorParameter)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The <code>parameters</code> of this <code>RequirementDefinition</code> that represent actors involved in the requirement.</p>| <p>The <code>parameters</code> of this <code>RequirementDefinition</code> that represent actors involved in the requirement.</p>|
| [sysml_vocab:requirementDefinitionStakeholderParameter](https://www.omg.org/spec/SysML/20230201/vocab#requirementDefinitionStakeholderParameter)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The <code>parameters</code> of this <code>RequirementDefinition</code> that represent stakeholders for th requirement.</p>| <p>The <code>parameters</code> of this <code>RequirementDefinition</code> that represent stakeholders for th requirement.</p>|
| [sysml_vocab:requirementDefinitionAssumedConstraint](https://www.omg.org/spec/SysML/20230201/vocab#requirementDefinitionAssumedConstraint)| [0..*]| [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)| <p>The owned <code>ConstraintUsages</code> that represent assumptions of this <code>RequirementDefinition</code>, which are the <code>ownedConstraints</code> of the <code>RequirementConstraintMemberships</code> of the <code>RequirementDefinition</code> with <code>kind = assumption</code>.</p>| <p>The owned <code>ConstraintUsages</code> that represent assumptions of this <code>RequirementDefinition</code>, which are the <code>ownedConstraints</code> of the <code>RequirementConstraintMemberships</code> of the <code>RequirementDefinition</code> with <code>kind = assumption</code>.</p>|
| [sysml_vocab:requirementDefinitionRequiredConstraint](https://www.omg.org/spec/SysML/20230201/vocab#requirementDefinitionRequiredConstraint)| [0..*]| [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)| <p>The owned <code>ConstraintUsages</code> that represent requirements of this <code>RequirementDefinition</code>, derived as the <code>ownedConstraints</code> of the <code>RequirementConstraintMemberships</code> of the <code>RequirementDefinition</code> with <code>kind</code> = <code>requirement</code>.</p>| <p>The owned <code>ConstraintUsages</code> that represent requirements of this <code>RequirementDefinition</code>, derived as the <code>ownedConstraints</code> of the <code>RequirementConstraintMemberships</code> of the <code>RequirementDefinition</code> with <code>kind</code> = <code>requirement</code>.</p>|
| [sysml_vocab:requirementDefinitionFramedConcern](https://www.omg.org/spec/SysML/20230201/vocab#requirementDefinitionFramedConcern)| [0..*]| [sysml_vocab:ConcernUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConcernUsage)| <p>The <code>ConcernUsages</code> framed by this <code>RequirementDefinition</code>, which are the <code>ownedConcerns</code> of all <code>FramedConcernMemberships</code> of the <code>RequirementDefinition</code>.</p>| <p>The <code>ConcernUsages</code> framed by this <code>RequirementDefinition</code>, which are the <code>ownedConcerns</code> of all <code>FramedConcernMemberships</code> of the <code>RequirementDefinition</code>.</p>|



### Specialization

URI: https://www.omg.org/spec/SysML/20230201/shapes#Specialization

type: Shape

target class: [sysml_vocab:Specialization](https://www.omg.org/spec/SysML/20230201/vocab#Specialization)

definition of vocabulary class : <p><code>Specialization</code> is a <code>Relationship</code> between two <code>Types</code> that requires all instances of the <code>specific</code> type to also be instances of the <code>general</code> Type (i.e., the set of instances of the <code>specific</code> Type is a <em>subset</em> of those of the <code>general</code> Type, which might be the same set).</p><br><br>not specific.isConjugated

description: <p><code>Specialization</code> is a <code>Relationship</code> between two <code>Types</code> that requires all instances of the <code>specific</code> type to also be instances of the <code>general</code> Type (i.e., the set of instances of the <code>specific</code> Type is a <em>subset</em> of those of the <code>general</code> Type, which might be the same set).</p><br><br>not specific.isConjugated

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:specializationGeneral](https://www.omg.org/spec/SysML/20230201/vocab#specializationGeneral)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>A <code>Type</code> with a superset of all instances of the <code>specific</code> <code>Type</code>, which might be the same set.</p><br>| <p>A <code>Type</code> with a superset of all instances of the <code>specific</code> <code>Type</code>, which might be the same set.</p><br>|
| [sysml_vocab:specializationSpecific](https://www.omg.org/spec/SysML/20230201/vocab#specializationSpecific)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>A <code>Type</code> with a subset of all instances of the <code>general</code> <code>Type</code>, which might be the same set.</p><br>| <p>A <code>Type</code> with a subset of all instances of the <code>general</code> <code>Type</code>, which might be the same set.</p><br>|
| [sysml_vocab:specializationOwningType](https://www.omg.org/spec/SysML/20230201/vocab#specializationOwningType)| [0..1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The <code>Type</code> that is the <code>specific</code> <code>Type</code> of this <code>Specialization</code> and owns it as its <code>owningRelatedElement</code>.</p><br>| <p>The <code>Type</code> that is the <code>specific</code> <code>Type</code> of this <code>Specialization</code> and owns it as its <code>owningRelatedElement</code>.</p><br>|



### StateDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#StateDefinition

type: Shape

target class: [sysml_vocab:StateDefinition](https://www.omg.org/spec/SysML/20230201/vocab#StateDefinition)

definition of vocabulary class : <p>A <code>StateDefinition</code> is the <code>Definition</code> of the </code>Behavior</code> of a system or part of a system in a certain state condition.</p><br><br><p>A <code>StateDefinition</code> may be related to up to three of its <code>ownedFeatures</code> by <code>StateBehaviorMembership</code> <code>Relationships</code>, all of different <code>kinds</code>, corresponding to the entry, do and exit actions of the <code>StateDefinition</code>.</p><br>specializesFromLibrary('States::StateAction')<br>ownedMembership-><br>    selectByKind(StateSubactionMembership)-><br>    isUnique(kind)<br>state = action->selectByKind(StateUsage)<br>doAction =<br>    let doMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::do) in<br>    if doMemberships->isEmpty() then null<br>    else doMemberships->at(1)<br>    endif<br>entryAction =<br>    let entryMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::entry) in<br>    if entryMemberships->isEmpty() then null<br>    else entryMemberships->at(1)<br>    endif<br>isParallel implies<br>    ownedAction.incomingTransition->isEmpty() and<br>    ownedAction.outgoingTransition->isEmpty()<br>exitAction = <br>    let exitMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::exit) in<br>    if exitMemberships->isEmpty() then null<br>    else exitMemberships->at(1)<br>    endif

description: <p>A <code>StateDefinition</code> is the <code>Definition</code> of the </code>Behavior</code> of a system or part of a system in a certain state condition.</p><br><br><p>A <code>StateDefinition</code> may be related to up to three of its <code>ownedFeatures</code> by <code>StateBehaviorMembership</code> <code>Relationships</code>, all of different <code>kinds</code>, corresponding to the entry, do and exit actions of the <code>StateDefinition</code>.</p><br>specializesFromLibrary('States::StateAction')<br>ownedMembership-><br>    selectByKind(StateSubactionMembership)-><br>    isUnique(kind)<br>state = action->selectByKind(StateUsage)<br>doAction =<br>    let doMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::do) in<br>    if doMemberships->isEmpty() then null<br>    else doMemberships->at(1)<br>    endif<br>entryAction =<br>    let entryMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::entry) in<br>    if entryMemberships->isEmpty() then null<br>    else entryMemberships->at(1)<br>    endif<br>isParallel implies<br>    ownedAction.incomingTransition->isEmpty() and<br>    ownedAction.outgoingTransition->isEmpty()<br>exitAction = <br>    let exitMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::exit) in<br>    if exitMemberships->isEmpty() then null<br>    else exitMemberships->at(1)<br>    endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:stateDefinitionIsParallel](https://www.omg.org/spec/SysML/20230201/vocab#stateDefinitionIsParallel)| [1]| Boolean| <p>Whether the <code>ownedStates</code> of this <code>StateDefinition</code> are to all be performed in parallel. If true, none of the <code>ownedActions</code> (which includes <code>ownedStates</code>) may have any incoming or outgoing <code>Transitions</code>. If false, only one <code>ownedState</code> may be performed at a time.</p><br>| <p>Whether the <code>ownedStates</code> of this <code>StateDefinition</code> are to all be performed in parallel. If true, none of the <code>ownedActions</code> (which includes <code>ownedStates</code>) may have any incoming or outgoing <code>Transitions</code>. If false, only one <code>ownedState</code> may be performed at a time.</p><br>|
| [sysml_vocab:stateDefinitionState](https://www.omg.org/spec/SysML/20230201/vocab#stateDefinitionState)| [0..*]| [sysml_vocab:StateUsage](https://www.omg.org/spec/SysML/20230201/vocab#StateUsage)| <p>The <code>StateUsages</code>, which are <code>actions</code> in the <code>StateDefinition</code>, that specify the discrete states in the behavior defined by the <code>StateDefinition</code>.</p>| <p>The <code>StateUsages</code>, which are <code>actions</code> in the <code>StateDefinition</code>, that specify the discrete states in the behavior defined by the <code>StateDefinition</code>.</p>|
| [sysml_vocab:stateDefinitionEntryAction](https://www.omg.org/spec/SysML/20230201/vocab#stateDefinitionEntryAction)| [0..1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> of this <code>StateDefinition</code> to be performed on entry to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateDefinition</code> by a <code>StateSubactionMembership</code>  with <code>kind = entry</code>.</p>| <p>The <code>ActionUsage</code> of this <code>StateDefinition</code> to be performed on entry to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateDefinition</code> by a <code>StateSubactionMembership</code>  with <code>kind = entry</code>.</p>|
| [sysml_vocab:stateDefinitionDoAction](https://www.omg.org/spec/SysML/20230201/vocab#stateDefinitionDoAction)| [0..1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> of this <code>StateDefinition</code> to be performed while in the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateDefinition</code> by a <code>StateSubactionMembership</code>  with <code>kind = do</code>.</p>| <p>The <code>ActionUsage</code> of this <code>StateDefinition</code> to be performed while in the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateDefinition</code> by a <code>StateSubactionMembership</code>  with <code>kind = do</code>.</p>|
| [sysml_vocab:stateDefinitionExitAction](https://www.omg.org/spec/SysML/20230201/vocab#stateDefinitionExitAction)| [0..1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> of this <code>StateDefinition</code> to be performed on exit to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateDefinition</code> by a <code>StateSubactionMembership</code>  with <code>kind = exit</code>.</p>| <p>The <code>ActionUsage</code> of this <code>StateDefinition</code> to be performed on exit to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateDefinition</code> by a <code>StateSubactionMembership</code>  with <code>kind = exit</code>.</p>|



### DecisionNode

URI: https://www.omg.org/spec/SysML/20230201/shapes#DecisionNode

type: Shape

target class: [sysml_vocab:DecisionNode](https://www.omg.org/spec/SysML/20230201/vocab#DecisionNode)

definition of vocabulary class : <p>A <code>DecisionNode</code> is a <code>ControlNode</code> that makes a selection from its outgoing <code>Successions</code>.</p><br>targetConnector->selectByKind(Succession)->size() <= 1<br>sourceConnector->selectAsKind(Succession)-><br>    collect(connectorEnd->at(2))-><br>    forAll(targetMult |<br>        multiplicityHasBounds(targetMult, 0, 1))<br>specializesFromLibrary('Actions::Action::decisions')<br>sourceConnector->selectByKind(Succession)-><br>    forAll(subsetsChain(self, <br>        resolveGlobal('ControlPerformances::MergePerformance::outgoingHBLink')))

description: <p>A <code>DecisionNode</code> is a <code>ControlNode</code> that makes a selection from its outgoing <code>Successions</code>.</p><br>targetConnector->selectByKind(Succession)->size() <= 1<br>sourceConnector->selectAsKind(Succession)-><br>    collect(connectorEnd->at(2))-><br>    forAll(targetMult |<br>        multiplicityHasBounds(targetMult, 0, 1))<br>specializesFromLibrary('Actions::Action::decisions')<br>sourceConnector->selectByKind(Succession)-><br>    forAll(subsetsChain(self, <br>        resolveGlobal('ControlPerformances::MergePerformance::outgoingHBLink')))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### RequirementVerificationMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#RequirementVerificationMembership

type: Shape

target class: [sysml_vocab:RequirementVerificationMembership](https://www.omg.org/spec/SysML/20230201/vocab#RequirementVerificationMembership)

definition of vocabulary class : <p>A <code>RequirementVerificationMembership</code> is a <code>RequirementConstraintMembership </code> used in the objective of a <code>VerificationCase</code> to identify a <code>RequirementUsage</code> that is verified by the <code>VerificationCase</code>.</p><br>kind = RequirementConstraintKind::requirement<br>owningType.oclIsKindOf(RequirementUsage) and<br>owningType.owningFeatureMembership <> null and<br>owningType.owningFeatureMembership.oclIsKindOf(ObjectiveMembership)

description: <p>A <code>RequirementVerificationMembership</code> is a <code>RequirementConstraintMembership </code> used in the objective of a <code>VerificationCase</code> to identify a <code>RequirementUsage</code> that is verified by the <code>VerificationCase</code>.</p><br>kind = RequirementConstraintKind::requirement<br>owningType.oclIsKindOf(RequirementUsage) and<br>owningType.owningFeatureMembership <> null and<br>owningType.owningFeatureMembership.oclIsKindOf(ObjectiveMembership)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:requirementVerificationMembershipOwnedRequirement](https://www.omg.org/spec/SysML/20230201/vocab#requirementVerificationMembershipOwnedRequirement)| [1]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The owned <code>RequirementUsage</code> that acts as the <code>ownedConstraint</code> for this <code>RequirementVerificationMembership</code>. This will either be the <code>verifiedRequirement</code>, or it will subset the <code>verifiedRequirement</code>.</p>| <p>The owned <code>RequirementUsage</code> that acts as the <code>ownedConstraint</code> for this <code>RequirementVerificationMembership</code>. This will either be the <code>verifiedRequirement</code>, or it will subset the <code>verifiedRequirement</code>.</p>|
| [sysml_vocab:requirementVerificationMembershipVerifiedRequirement](https://www.omg.org/spec/SysML/20230201/vocab#requirementVerificationMembershipVerifiedRequirement)| [1]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p> The <code>RequirementUsage</code> that is identified as being verified. It is the <code>referencedConstraint</code> of the <code>RequirementVerificationMembership</code> considered as a <code>RequirementConstraintMembership</code>, which must be a <code>RequirementUsage</code>.</p>| <p> The <code>RequirementUsage</code> that is identified as being verified. It is the <code>referencedConstraint</code> of the <code>RequirementVerificationMembership</code> considered as a <code>RequirementConstraintMembership</code>, which must be a <code>RequirementUsage</code>.</p>|



### Function

URI: https://www.omg.org/spec/SysML/20230201/shapes#Function

type: Shape

target class: [sysml_vocab:Function](https://www.omg.org/spec/SysML/20230201/vocab#Function)

definition of vocabulary class : <p>A <code>Function</code> is a <code>Behavior</code> that has an <code>out</code> <code>parameter</code> that is identified as its <code>result</code>. A <code>Function</code> represents the performance of a calculation that produces the values of its <code>result</code> <code>parameter</code>. This calculation may be decomposed into <code>Expressions</code> that are <code>steps</code> of the <code>Function</code>.</p><br><br>ownedMembership.selectByKind(ResultExpressionMembership)-><br>    forAll(mem | ownedFeature.selectByKind(BindingConnector)-><br>        exists(binding |<br>            binding.relatedFeature->includes(result) and<br>            binding.relatedFeature->includes(mem.ownedResultExpression.result)))<br>specializesFromLibrary('Performances::Evaluation')<br>result =<br>    let resultParams : Sequence(Feature) =<br>        ownedFeatureMemberships-><br>            selectByKind(ReturnParameterMembership).<br>            ownedParameterMember in<br>    if resultParams->notEmpty() then resultParams->first()<br>    else null<br>    endif<br>ownedFeatureMembership-><br>    selectByKind(ReturnParameterMembership)-><br>    size() <= 1<br>membership->selectByKind(ResultExpressionMembership)->size() <= 1

description: <p>A <code>Function</code> is a <code>Behavior</code> that has an <code>out</code> <code>parameter</code> that is identified as its <code>result</code>. A <code>Function</code> represents the performance of a calculation that produces the values of its <code>result</code> <code>parameter</code>. This calculation may be decomposed into <code>Expressions</code> that are <code>steps</code> of the <code>Function</code>.</p><br><br>ownedMembership.selectByKind(ResultExpressionMembership)-><br>    forAll(mem | ownedFeature.selectByKind(BindingConnector)-><br>        exists(binding |<br>            binding.relatedFeature->includes(result) and<br>            binding.relatedFeature->includes(mem.ownedResultExpression.result)))<br>specializesFromLibrary('Performances::Evaluation')<br>result =<br>    let resultParams : Sequence(Feature) =<br>        ownedFeatureMemberships-><br>            selectByKind(ReturnParameterMembership).<br>            ownedParameterMember in<br>    if resultParams->notEmpty() then resultParams->first()<br>    else null<br>    endif<br>ownedFeatureMembership-><br>    selectByKind(ReturnParameterMembership)-><br>    size() <= 1<br>membership->selectByKind(ResultExpressionMembership)->size() <= 1

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:functionIsModelLevelEvaluable](https://www.omg.org/spec/SysML/20230201/vocab#functionIsModelLevelEvaluable)| [1]| Boolean| <p>Whether this <code>Function</code> can be used as the <code>function</code> of a model-level evaluable <code>InvocationExpression</code>. Certain <code>Functions</code> from the Kernel Functions Library are considered to have <code>isModelLevelEvaluable = true</code>. For all other <code>Functions</code> it is <code>false</code>.</p><br><br><p><strong>Note:</strong> See the specification of the KerML concrete syntax notation for <code>Expressions</code> for an identification of which library <code>Functions</code> are model-level evaluable.</p>| <p>Whether this <code>Function</code> can be used as the <code>function</code> of a model-level evaluable <code>InvocationExpression</code>. Certain <code>Functions</code> from the Kernel Functions Library are considered to have <code>isModelLevelEvaluable = true</code>. For all other <code>Functions</code> it is <code>false</code>.</p><br><br><p><strong>Note:</strong> See the specification of the KerML concrete syntax notation for <code>Expressions</code> for an identification of which library <code>Functions</code> are model-level evaluable.</p>|
| [sysml_vocab:functionExpression](https://www.omg.org/spec/SysML/20230201/vocab#functionExpression)| [0..*]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>Expressions</code> that are <code>steps</code> in the calculation of the <code>result</code> of this <code>Function</code>.</p><br><br><p>The set of expressions that represent computational steps or parts of a system of equations within the Function.</p><br>| <p>The <code>Expressions</code> that are <code>steps</code> in the calculation of the <code>result</code> of this <code>Function</code>.</p><br><br><p>The set of expressions that represent computational steps or parts of a system of equations within the Function.</p><br>|
| [sysml_vocab:functionResult](https://www.omg.org/spec/SysML/20230201/vocab#functionResult)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>result</code> <code>parameter</code> of the <code>Function</code>, which is owned by the <code>Function</code> via a <code>ReturnParameterMembership</code>.</p><br><br><p>The object or value that is the result of evaluating the Function.</p>| <p>The <code>result</code> <code>parameter</code> of the <code>Function</code>, which is owned by the <code>Function</code> via a <code>ReturnParameterMembership</code>.</p><br><br><p>The object or value that is the result of evaluating the Function.</p>|



### FeatureReferenceExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#FeatureReferenceExpression

type: Shape

target class: [sysml_vocab:FeatureReferenceExpression](https://www.omg.org/spec/SysML/20230201/vocab#FeatureReferenceExpression)

definition of vocabulary class : <p>A <code>FeatureReferenceExpression</code> is an <code>Expression</code> whose <code>result</code> is bound to a <code>referent</code> <code>Feature</code>.</p><br>referent =<br>    let nonParameterMemberships : Sequence(Membership) = ownedMembership-><br>        reject(oclIsKindOf(ParameterMembership)) in<br>    if nonParameterMemberships->isEmpty() or<br>       not nonParameterMemberships->first().memberElement.oclIsKindOf(Feature)<br>    then null<br>    else nonParameterMemberships->first().memberElement.oclAsType(Feature)<br>    endif<br>ownedMember->selectByKind(BindingConnector)->exists(b |<br>    b.relatedFeatures->includes(targetFeature) and<br>    b.relatedFeatures->includes(result))<br>let membership : Membership = <br>    ownedMembership->reject(m | m.oclIsKindOf(ParameterMembership)) in<br>membership->notEmpty() and<br>membership->at(1).memberElement.oclIsKindOf(Feature)

description: <p>A <code>FeatureReferenceExpression</code> is an <code>Expression</code> whose <code>result</code> is bound to a <code>referent</code> <code>Feature</code>.</p><br>referent =<br>    let nonParameterMemberships : Sequence(Membership) = ownedMembership-><br>        reject(oclIsKindOf(ParameterMembership)) in<br>    if nonParameterMemberships->isEmpty() or<br>       not nonParameterMemberships->first().memberElement.oclIsKindOf(Feature)<br>    then null<br>    else nonParameterMemberships->first().memberElement.oclAsType(Feature)<br>    endif<br>ownedMember->selectByKind(BindingConnector)->exists(b |<br>    b.relatedFeatures->includes(targetFeature) and<br>    b.relatedFeatures->includes(result))<br>let membership : Membership = <br>    ownedMembership->reject(m | m.oclIsKindOf(ParameterMembership)) in<br>membership->notEmpty() and<br>membership->at(1).memberElement.oclIsKindOf(Feature)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:featureReferenceExpressionReferent](https://www.omg.org/spec/SysML/20230201/vocab#featureReferenceExpressionReferent)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is referenced by this <code>FeatureReferenceExpression</code>, which is its first non-<code>parameter</code> <code>member</code>.<p>| <p>The <code>Feature</code> that is referenced by this <code>FeatureReferenceExpression</code>, which is its first non-<code>parameter</code> <code>member</code>.<p>|



### EndFeatureMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#EndFeatureMembership

type: Shape

target class: [sysml_vocab:EndFeatureMembership](https://www.omg.org/spec/SysML/20230201/vocab#EndFeatureMembership)

definition of vocabulary class : <p><code>EndFeatureMembership</code> is a <code>FeatureMembership</code> that requires its <code>memberFeature</code> be owned and have <code>isEnd = true</code>.</p><br><br>ownedMemberFeature.isEnd

description: <p><code>EndFeatureMembership</code> is a <code>FeatureMembership</code> that requires its <code>memberFeature</code> be owned and have <code>isEnd = true</code>.</p><br><br>ownedMemberFeature.isEnd

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### ResultExpressionMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#ResultExpressionMembership

type: Shape

target class: [sysml_vocab:ResultExpressionMembership](https://www.omg.org/spec/SysML/20230201/vocab#ResultExpressionMembership)

definition of vocabulary class : <p>A <code>ResultExpressionMembership</code> is a <code>FeatureMembership</code> that indicates that the <code>ownedResultExpression</code> provides the result values for the <code>Function</code> or <code>Expression</code> that owns it. The owning <code>Function</code> or <code>Expression</code> must contain a <code>BindingConnector</code> between the <code>result</code> <code>parameter</code> of the <code>ownedResultExpression</code> and the <code>result</code> <code>parameter</code> of the owning <code>Function</code> or <code>Expression</code>.</p><br><br>owningType.oclIsKindOf(Function) or owningType.oclIsKindOf(Expression)

description: <p>A <code>ResultExpressionMembership</code> is a <code>FeatureMembership</code> that indicates that the <code>ownedResultExpression</code> provides the result values for the <code>Function</code> or <code>Expression</code> that owns it. The owning <code>Function</code> or <code>Expression</code> must contain a <code>BindingConnector</code> between the <code>result</code> <code>parameter</code> of the <code>ownedResultExpression</code> and the <code>result</code> <code>parameter</code> of the owning <code>Function</code> or <code>Expression</code>.</p><br><br>owningType.oclIsKindOf(Function) or owningType.oclIsKindOf(Expression)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:resultExpressionMembershipOwnedResultExpression](https://www.omg.org/spec/SysML/20230201/vocab#resultExpressionMembershipOwnedResultExpression)| [1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>Expression</code> that provides the result for the owner of the <code>ResultExpressionMembership</code>.</p><br>| <p>The <code>Expression</code> that provides the result for the owner of the <code>ResultExpressionMembership</code>.</p><br>|



### FeatureTyping

URI: https://www.omg.org/spec/SysML/20230201/shapes#FeatureTyping

type: Shape

target class: [sysml_vocab:FeatureTyping](https://www.omg.org/spec/SysML/20230201/vocab#FeatureTyping)

definition of vocabulary class : <p><code>FeatureTyping</code> is <code>Specialization</code> in which the <code>specific</code> <code>Type</code> is a <code>Feature</code>. This means the set of instances of the (specific) <code>typedFeature</code> is a subset of the set of instances of the (general) <code>type</code>. In the simplest case, the <code>type</code> is a <code>Classifier</code>, whereupon the <code>typedFeature</code> has values that are instances of the <code>Classifier</code>.</p><br>

description: <p><code>FeatureTyping</code> is <code>Specialization</code> in which the <code>specific</code> <code>Type</code> is a <code>Feature</code>. This means the set of instances of the (specific) <code>typedFeature</code> is a subset of the set of instances of the (general) <code>type</code>. In the simplest case, the <code>type</code> is a <code>Classifier</code>, whereupon the <code>typedFeature</code> has values that are instances of the <code>Classifier</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:featureTypingTypedFeature](https://www.omg.org/spec/SysML/20230201/vocab#featureTypingTypedFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that has a <code>type</code> determined by this <code>FeatureTyping</code>.</p>| <p>The <code>Feature</code> that has a <code>type</code> determined by this <code>FeatureTyping</code>.</p>|
| [sysml_vocab:featureTypingType](https://www.omg.org/spec/SysML/20230201/vocab#featureTypingType)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The <code>Type</code> that is being applied by this <code>FeatureTyping</code>.</p><br>| <p>The <code>Type</code> that is being applied by this <code>FeatureTyping</code>.</p><br>|
| [sysml_vocab:featureTypingOwningFeature](https://www.omg.org/spec/SysML/20230201/vocab#featureTypingOwningFeature)| [0..1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>A <code>typedFeature</code> that is also the <code>owningRelatedElement</code> of this <code>FeatureTyping</code>.</p>| <p>A <code>typedFeature</code> that is also the <code>owningRelatedElement</code> of this <code>FeatureTyping</code>.</p>|



### LiteralInteger

URI: https://www.omg.org/spec/SysML/20230201/shapes#LiteralInteger

type: Shape

target class: [sysml_vocab:LiteralInteger](https://www.omg.org/spec/SysML/20230201/vocab#LiteralInteger)

definition of vocabulary class : <p>A <code>LiteralInteger</code> is a <code>LiteralExpression</code> that provides an <code><em>Integer</em></code> value as a result. Its <code>result</code> <code>parameter</code> must have the type <code><em>Integer</em></code>.</p><br><br>specializesFromLibrary('Performances::literalIntegerEvaluations')

description: <p>A <code>LiteralInteger</code> is a <code>LiteralExpression</code> that provides an <code><em>Integer</em></code> value as a result. Its <code>result</code> <code>parameter</code> must have the type <code><em>Integer</em></code>.</p><br><br>specializesFromLibrary('Performances::literalIntegerEvaluations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:literalIntegerValue](https://www.omg.org/spec/SysML/20230201/vocab#literalIntegerValue)| [1]| Integer| <p>The <code><em>Integer</em></code> value that is the result of evaluating this <code>LiteralInteger</code>.</p><br><p>The Integer value that is the result of evaluating this Expression.</p><br>| <p>The <code><em>Integer</em></code> value that is the result of evaluating this <code>LiteralInteger</code>.</p><br><p>The Integer value that is the result of evaluating this Expression.</p><br>|



### MembershipImport

URI: https://www.omg.org/spec/SysML/20230201/shapes#MembershipImport

type: Shape

target class: [sysml_vocab:MembershipImport](https://www.omg.org/spec/SysML/20230201/vocab#MembershipImport)

definition of vocabulary class : <p>A <code>MembershipImport</code> is an <code>Import</code> that imports its <code>importedMembership</code> into the <code>importOwningNamespace</code>. If <code>isRecursive = true</code> and the <code>memberElement</code> of the <code>importedMembership</code> is a <code>Namespace</code>, then the equivalent of a recursive <code>NamespaceImport</code> is also performed on that <code>Namespace</code>.</p><br><br>importedElement = importedMembership.memberElement

description: <p>A <code>MembershipImport</code> is an <code>Import</code> that imports its <code>importedMembership</code> into the <code>importOwningNamespace</code>. If <code>isRecursive = true</code> and the <code>memberElement</code> of the <code>importedMembership</code> is a <code>Namespace</code>, then the equivalent of a recursive <code>NamespaceImport</code> is also performed on that <code>Namespace</code>.</p><br><br>importedElement = importedMembership.memberElement

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:membershipImportImportedMembership](https://www.omg.org/spec/SysML/20230201/vocab#membershipImportImportedMembership)| [1]| [sysml_vocab:Membership](https://www.omg.org/spec/SysML/20230201/vocab#Membership)| <p>The <code>Membership</code> to be imported.</p><br>| <p>The <code>Membership</code> to be imported.</p><br>|



### ItemUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ItemUsage

type: Shape

target class: [sysml_vocab:ItemUsage](https://www.omg.org/spec/SysML/20230201/vocab#ItemUsage)

definition of vocabulary class : <p>An <code>ItemUsage</code> is a <code>ItemUsage</code> whose <code>definition</code> is a <code>Structure</code>. Nominally, if the <code>definition</code> is an <code>ItemDefinition</code>, an <code>ItemUsage</code> is a <code>ItemUsage</code> of that <code>ItemDefinition</code> within a system. However, other kinds of Kernel <code>Structures</code> are also allowed, to permit use of <code>Structures</code> from the Kernel Model Libraries.</p><br>itemDefinition = occurrenceDefinition->selectByKind(ItemDefinition)<br>specializesFromLibrary('Items::items')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(ItemDefinition) or<br> owningType.oclIsKindOf(ItemUsage)) implies<br>    specializesFromLibrary('Items::Item::subitem')

description: <p>An <code>ItemUsage</code> is a <code>ItemUsage</code> whose <code>definition</code> is a <code>Structure</code>. Nominally, if the <code>definition</code> is an <code>ItemDefinition</code>, an <code>ItemUsage</code> is a <code>ItemUsage</code> of that <code>ItemDefinition</code> within a system. However, other kinds of Kernel <code>Structures</code> are also allowed, to permit use of <code>Structures</code> from the Kernel Model Libraries.</p><br>itemDefinition = occurrenceDefinition->selectByKind(ItemDefinition)<br>specializesFromLibrary('Items::items')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(ItemDefinition) or<br> owningType.oclIsKindOf(ItemUsage)) implies<br>    specializesFromLibrary('Items::Item::subitem')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:itemUsageItemDefinition](https://www.omg.org/spec/SysML/20230201/vocab#itemUsageItemDefinition)| [0..*]| [sysml_vocab:Structure](https://www.omg.org/spec/SysML/20230201/vocab#Structure)| <p>The Structures that are the <code>definitions</code> of this ItemUsage. Nominally, these are ItemDefinitions, but other kinds of Kernel Structures are also allowed, to permit use of Structures from the Kernel Library.</p>| <p>The Structures that are the <code>definitions</code> of this ItemUsage. Nominally, these are ItemDefinitions, but other kinds of Kernel Structures are also allowed, to permit use of Structures from the Kernel Library.</p>|



### RequirementConstraintMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#RequirementConstraintMembership

type: Shape

target class: [sysml_vocab:RequirementConstraintMembership](https://www.omg.org/spec/SysML/20230201/vocab#RequirementConstraintMembership)

definition of vocabulary class : <p>A <code>RequirementConstraintMembership</code> is a <code>FeatureMembership</code> for an assumed or required <code>ConstraintUsage</code> of a <code>RequirementDefinition</code> or <code>RequirementUsage<code>.</p><br>referencedConstraint =<br>    let reference : ReferenceSubsetting = <br>        ownedConstraint.ownedReferenceSubsetting in<br>    if reference = null then ownedConstraint<br>    else if not reference.referencedFeature.oclIsKindOf(ConstraintUsage) then null <br>    else reference.referencedFeature.oclAsType(ConstraintUsage)<br>    endif endif<br>owningType.oclIsKindOf(RequirementDefinition) or<br>owningType.oclIsKindOf(RequirementUsage)<br>ownedConstraint.isComposite

description: <p>A <code>RequirementConstraintMembership</code> is a <code>FeatureMembership</code> for an assumed or required <code>ConstraintUsage</code> of a <code>RequirementDefinition</code> or <code>RequirementUsage<code>.</p><br>referencedConstraint =<br>    let reference : ReferenceSubsetting = <br>        ownedConstraint.ownedReferenceSubsetting in<br>    if reference = null then ownedConstraint<br>    else if not reference.referencedFeature.oclIsKindOf(ConstraintUsage) then null <br>    else reference.referencedFeature.oclAsType(ConstraintUsage)<br>    endif endif<br>owningType.oclIsKindOf(RequirementDefinition) or<br>owningType.oclIsKindOf(RequirementUsage)<br>ownedConstraint.isComposite

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:requirementConstraintMembershipKind](https://www.omg.org/spec/SysML/20230201/vocab#requirementConstraintMembershipKind)| [1]| String| <p>Whether the <code>RequirementConstraintMembership</code> is for an assumed or required <code>ConstraintUsage</code>.</p>| <p>Whether the <code>RequirementConstraintMembership</code> is for an assumed or required <code>ConstraintUsage</code>.</p>|
| [sysml_vocab:requirementConstraintMembershipOwnedConstraint](https://www.omg.org/spec/SysML/20230201/vocab#requirementConstraintMembershipOwnedConstraint)| [1]| [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)| <p>The <code>ConstraintUsage</code> that is the <code>ownedMemberFeature</code> of this <code>RequirementConstraintMembership</code>.</p>| <p>The <code>ConstraintUsage</code> that is the <code>ownedMemberFeature</code> of this <code>RequirementConstraintMembership</code>.</p>|
| [sysml_vocab:requirementConstraintMembershipReferencedConstraint](https://www.omg.org/spec/SysML/20230201/vocab#requirementConstraintMembershipReferencedConstraint)| [1]| [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)| <p> The <code>ConstraintUsage</code> that is referenced through this <code>RequirementConstraintMembership</code>. It is the <code>referencedFeature</code> of the <code>ownedReferenceSubsetting</code> of the <code>ownedConstraint</code>, if there is one, and, otherwise, the <code>ownedConstraint</code> itself.</p>| <p> The <code>ConstraintUsage</code> that is referenced through this <code>RequirementConstraintMembership</code>. It is the <code>referencedFeature</code> of the <code>ownedReferenceSubsetting</code> of the <code>ownedConstraint</code>, if there is one, and, otherwise, the <code>ownedConstraint</code> itself.</p>|



### AllocationUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#AllocationUsage

type: Shape

target class: [sysml_vocab:AllocationUsage](https://www.omg.org/spec/SysML/20230201/vocab#AllocationUsage)

definition of vocabulary class : <p>An <code>AllocationUsage</code> is a usage of an <code>AllocationDefinition</code> asserting the allocation of the <code>source</code> feature to the <code>target</code> feature.</p><br>specializesFromLibrary('Allocations::allocations')

description: <p>An <code>AllocationUsage</code> is a usage of an <code>AllocationDefinition</code> asserting the allocation of the <code>source</code> feature to the <code>target</code> feature.</p><br>specializesFromLibrary('Allocations::allocations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:allocationUsageAllocationDefinition](https://www.omg.org/spec/SysML/20230201/vocab#allocationUsageAllocationDefinition)| [0..*]| [sysml_vocab:AllocationDefinition](https://www.omg.org/spec/SysML/20230201/vocab#AllocationDefinition)| <p>The <code>AllocationDefinitions</code> that are the types of this <code>AllocationUsage</code>.</p>| <p>The <code>AllocationDefinitions</code> that are the types of this <code>AllocationUsage</code>.</p>|



### BindingConnector

URI: https://www.omg.org/spec/SysML/20230201/shapes#BindingConnector

type: Shape

target class: [sysml_vocab:BindingConnector](https://www.omg.org/spec/SysML/20230201/vocab#BindingConnector)

definition of vocabulary class : <p>A <code>BindingConnector</code> is a binary <code>Connector</code> that requires its <code>relatedFeatures</code> to identify the same things (have the same values).</p><br><br>specializesFromLibrary('Links::selfLinks')<br>relatedFeature->size() = 2

description: <p>A <code>BindingConnector</code> is a binary <code>Connector</code> that requires its <code>relatedFeatures</code> to identify the same things (have the same values).</p><br><br>specializesFromLibrary('Links::selfLinks')<br>relatedFeature->size() = 2

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### ActorMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#ActorMembership

type: Shape

target class: [sysml_vocab:ActorMembership](https://www.omg.org/spec/SysML/20230201/vocab#ActorMembership)

definition of vocabulary class : <p>An <code>ActorMembership</code> is a <code>ParameterMembership</code> that identifies a <code>PartUsage</code> as an <em>actor</em> <code>parameter</code>, which specifies a role played by an external entity in interaction with the <code>owningType</code> of the <code>ActorMembership</code>.</p><br>owningType.oclIsKindOf(RequirementUsage) or<br>owningType.oclIsKindOf(RequirementDefinition) or<br>owningType.oclIsKindOf(CaseDefinition) or<br>owningType.oclIsKindOf(CaseUsage)<br>

description: <p>An <code>ActorMembership</code> is a <code>ParameterMembership</code> that identifies a <code>PartUsage</code> as an <em>actor</em> <code>parameter</code>, which specifies a role played by an external entity in interaction with the <code>owningType</code> of the <code>ActorMembership</code>.</p><br>owningType.oclIsKindOf(RequirementUsage) or<br>owningType.oclIsKindOf(RequirementDefinition) or<br>owningType.oclIsKindOf(CaseDefinition) or<br>owningType.oclIsKindOf(CaseUsage)<br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:actorMembershipOwnedActorParameter](https://www.omg.org/spec/SysML/20230201/vocab#actorMembershipOwnedActorParameter)| [1]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The <code>PartUsage</code> specifying the actor.</p>| <p>The <code>PartUsage</code> specifying the actor.</p>|



### EnumerationUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#EnumerationUsage

type: Shape

target class: [sysml_vocab:EnumerationUsage](https://www.omg.org/spec/SysML/20230201/vocab#EnumerationUsage)

definition of vocabulary class : <p>An <code>EnumerationUsage</code> is an <code>AttributeUsage</code> whose <code>attributeDefinition</code> is an <code>EnumerationDefinition</code>.</p>

description: <p>An <code>EnumerationUsage</code> is an <code>AttributeUsage</code> whose <code>attributeDefinition</code> is an <code>EnumerationDefinition</code>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:enumerationUsageEnumerationDefinition](https://www.omg.org/spec/SysML/20230201/vocab#enumerationUsageEnumerationDefinition)| [1]| [sysml_vocab:EnumerationDefinition](https://www.omg.org/spec/SysML/20230201/vocab#EnumerationDefinition)| <p>The single EnumerationDefinition that is the type of this EnumerationUsage.</p>| <p>The single EnumerationDefinition that is the type of this EnumerationUsage.</p>|



### CalculationUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#CalculationUsage

type: Shape

target class: [sysml_vocab:CalculationUsage](https://www.omg.org/spec/SysML/20230201/vocab#CalculationUsage)

definition of vocabulary class : <p>A <code>CalculationUsage</code> is an <code>ActionUsage</code> that is also an <code>Expression</code>, and, so, is typed by a <code>Function</code>. Nominally, if the <code>type</code> is a <code>CalculationDefinition</code>, a <code>CalculationUsage</code> is a <code>Usage</code> of that <code>CalculationDefinition</code> within a system. However, other kinds of kernel <code>Functions</code> are also allowed, to permit use of <code>Functions</code> from the Kernel Model Libraries.</p><br>specializesFromLibrary('Calculations::calculations')<br>owningType <> null and<br>(owningType.oclIsKindOf(CalculationDefinition) or<br> owningType.oclIsKindOf(CalculationUsage)) implies<br>    specializesFromLibrary('Calculations::Calculation::subcalculations')

description: <p>A <code>CalculationUsage</code> is an <code>ActionUsage</code> that is also an <code>Expression</code>, and, so, is typed by a <code>Function</code>. Nominally, if the <code>type</code> is a <code>CalculationDefinition</code>, a <code>CalculationUsage</code> is a <code>Usage</code> of that <code>CalculationDefinition</code> within a system. However, other kinds of kernel <code>Functions</code> are also allowed, to permit use of <code>Functions</code> from the Kernel Model Libraries.</p><br>specializesFromLibrary('Calculations::calculations')<br>owningType <> null and<br>(owningType.oclIsKindOf(CalculationDefinition) or<br> owningType.oclIsKindOf(CalculationUsage)) implies<br>    specializesFromLibrary('Calculations::Calculation::subcalculations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:calculationUsageCalculationDefinition](https://www.omg.org/spec/SysML/20230201/vocab#calculationUsageCalculationDefinition)| [0..1]| [sysml_vocab:Function](https://www.omg.org/spec/SysML/20230201/vocab#Function)| <p>The <ode>Function</code> that is the <code>type</code> of this <code>CalculationUsage</code>. Nominally, this would be a <code>CalculationDefinition</code>, but a kernel <code>Function</code> is also allowed, to permit use of <code>Functions</code> from the Kernel Model Libraries.</p>| <p>The <ode>Function</code> that is the <code>type</code> of this <code>CalculationUsage</code>. Nominally, this would be a <code>CalculationDefinition</code>, but a kernel <code>Function</code> is also allowed, to permit use of <code>Functions</code> from the Kernel Model Libraries.</p>|



### ItemFlowEnd

URI: https://www.omg.org/spec/SysML/20230201/shapes#ItemFlowEnd

type: Shape

target class: [sysml_vocab:ItemFlowEnd](https://www.omg.org/spec/SysML/20230201/vocab#ItemFlowEnd)

definition of vocabulary class : <p>An <code>ItemFlowEnd</code> is a <code>Feature</code> that is one of the <code>connectorEnds</code> giving the <code><em>source</em></code> or <code><em>target</em></code> of an <code>ItemFlow</code>. For <code>ItemFlows</code> typed by <code><em>FlowTransfer</em></code> or its specializations, <code>ItemFlowEnds</code> must have exactly one <code>ownedFeature</code>, which redefines <code><em>Transfer::source::sourceOutput</em></code> or <code><em>Transfer::target::targetInput</em></code> and redefines the corresponding feature of the <code>relatedElement</code> for its end.</p><br>isEnd<br>ownedFeature->size() = 1<br>owningType <> null and owningType.oclIsKindOf(ItemFlow)

description: <p>An <code>ItemFlowEnd</code> is a <code>Feature</code> that is one of the <code>connectorEnds</code> giving the <code><em>source</em></code> or <code><em>target</em></code> of an <code>ItemFlow</code>. For <code>ItemFlows</code> typed by <code><em>FlowTransfer</em></code> or its specializations, <code>ItemFlowEnds</code> must have exactly one <code>ownedFeature</code>, which redefines <code><em>Transfer::source::sourceOutput</em></code> or <code><em>Transfer::target::targetInput</em></code> and redefines the corresponding feature of the <code>relatedElement</code> for its end.</p><br>isEnd<br>ownedFeature->size() = 1<br>owningType <> null and owningType.oclIsKindOf(ItemFlow)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### BindingConnectorAsUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#BindingConnectorAsUsage

type: Shape

target class: [sysml_vocab:BindingConnectorAsUsage](https://www.omg.org/spec/SysML/20230201/vocab#BindingConnectorAsUsage)

definition of vocabulary class : <p>A <code>BindingConnectorAsUsage</code> is both a <code>BindingConnector</code> and a <code>ConnectorAsUsage</code>.</p>

description: <p>A <code>BindingConnectorAsUsage</code> is both a <code>BindingConnector</code> and a <code>ConnectorAsUsage</code>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### OccurrenceUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#OccurrenceUsage

type: Shape

target class: [sysml_vocab:OccurrenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#OccurrenceUsage)

definition of vocabulary class : <p>An <code>OccurrenceUsage</code> is a <code>Usage</code> whose <code>types</code> are all <code>Classes</code>. Nominally, if a <code>type</code> is an <code>OccurrenceDefinition</code>, an <code>OccurrenceUsage</code> is a <code>Usage</code> of that <code>OccurrenceDefinition</code> within a system. However, other types of Kernel <code>Classes</code> are also allowed, to permit use of <code>Classes</code> from the Kernel Model Libraries.</p><br><br>individualDefinition =<br>    let individualDefinitions : OrderedSet(OccurrenceDefinition) = <br>        occurrenceDefinition-><br>            selectByKind(OccurrenceDefinition)-><br>            select(isIndividual) in<br>    if individualDefinitions->isEmpty() then null<br>    else individualDefinitions->first() endif<br>isIndividual implies individualDefinition <> null<br>specializesFromLibrary('Occurrences::occurrences')<br>isComposite and<br>owningType <> null and<br>(owningType.oclIsKindOf(Class) or<br> owningType.oclIsKindOf(OccurrenceUsage) or<br> owningType.oclIsKindOf(Feature) and<br>    owningType.oclAsType(Feature).type-><br>        exists(oclIsKind(Class))) implies<br>    specializesFromLibrary('Occurrences::Occurrence::suboccurrences')<br>occurrenceDefinition-><br>    selectByKind(OccurrenceDefinition)-><br>    select(isIndividual).size() <= 1<br>portionKind <> null implies<br>    occurrenceDefinition->forAll(occ | <br>        featuringType->exists(specializes(occ)))

description: <p>An <code>OccurrenceUsage</code> is a <code>Usage</code> whose <code>types</code> are all <code>Classes</code>. Nominally, if a <code>type</code> is an <code>OccurrenceDefinition</code>, an <code>OccurrenceUsage</code> is a <code>Usage</code> of that <code>OccurrenceDefinition</code> within a system. However, other types of Kernel <code>Classes</code> are also allowed, to permit use of <code>Classes</code> from the Kernel Model Libraries.</p><br><br>individualDefinition =<br>    let individualDefinitions : OrderedSet(OccurrenceDefinition) = <br>        occurrenceDefinition-><br>            selectByKind(OccurrenceDefinition)-><br>            select(isIndividual) in<br>    if individualDefinitions->isEmpty() then null<br>    else individualDefinitions->first() endif<br>isIndividual implies individualDefinition <> null<br>specializesFromLibrary('Occurrences::occurrences')<br>isComposite and<br>owningType <> null and<br>(owningType.oclIsKindOf(Class) or<br> owningType.oclIsKindOf(OccurrenceUsage) or<br> owningType.oclIsKindOf(Feature) and<br>    owningType.oclAsType(Feature).type-><br>        exists(oclIsKind(Class))) implies<br>    specializesFromLibrary('Occurrences::Occurrence::suboccurrences')<br>occurrenceDefinition-><br>    selectByKind(OccurrenceDefinition)-><br>    select(isIndividual).size() <= 1<br>portionKind <> null implies<br>    occurrenceDefinition->forAll(occ | <br>        featuringType->exists(specializes(occ)))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:occurrenceUsageIsIndividual](https://www.omg.org/spec/SysML/20230201/vocab#occurrenceUsageIsIndividual)| [1]| Boolean| <p>Whether this <code>OccurrenceUsage</code> represents the usage of the specific individual (or portion of it) represented by its <code>individualDefinition</code>.</p>| <p>Whether this <code>OccurrenceUsage</code> represents the usage of the specific individual (or portion of it) represented by its <code>individualDefinition</code>.</p>|
| [sysml_vocab:occurrenceUsagePortionKind](https://www.omg.org/spec/SysML/20230201/vocab#occurrenceUsagePortionKind)| [0..1]| String| <p>The kind of (temporal) portion of the life of the <code>occurrenceDefinition</code> represented by this <code>OccurrenceUsage</code>, if it is so restricted.</p>| <p>The kind of (temporal) portion of the life of the <code>occurrenceDefinition</code> represented by this <code>OccurrenceUsage</code>, if it is so restricted.</p>|
| [sysml_vocab:occurrenceUsageOccurrenceDefinition](https://www.omg.org/spec/SysML/20230201/vocab#occurrenceUsageOccurrenceDefinition)| [0..*]| [sysml_vocab:Class](https://www.omg.org/spec/SysML/20230201/vocab#Class)| <p>The <code>Classes</code> that are the types of this <code>OccurrenceUsage</code>. Nominally, these are <code>OccurrenceDefinitions</code>, but other kinds of kernel <code>Classes</code> are also allowed, to permit use of <code>Classes</code> from the Kernel Model Libraries.</p>| <p>The <code>Classes</code> that are the types of this <code>OccurrenceUsage</code>. Nominally, these are <code>OccurrenceDefinitions</code>, but other kinds of kernel <code>Classes</code> are also allowed, to permit use of <code>Classes</code> from the Kernel Model Libraries.</p>|
| [sysml_vocab:occurrenceUsageIndividualDefinition](https://www.omg.org/spec/SysML/20230201/vocab#occurrenceUsageIndividualDefinition)| [0..1]| [sysml_vocab:OccurrenceDefinition](https://www.omg.org/spec/SysML/20230201/vocab#OccurrenceDefinition)| <p>The at most one <code>occurrenceDefinition</code> that has <code>isIndividual = true</code>.</p>| <p>The at most one <code>occurrenceDefinition</code> that has <code>isIndividual = true</code>.</p>|



### InterfaceUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#InterfaceUsage

type: Shape

target class: [sysml_vocab:InterfaceUsage](https://www.omg.org/spec/SysML/20230201/vocab#InterfaceUsage)

definition of vocabulary class : <p>An <code>InterfaceUsage</code> is a Usage of an <code>InterfaceDefinition</code> to represent an interface connecting parts of a system through specific ports.</p><br>ownedEndFeature->size() = 2 implies<br>    specializesFromLibrary('Interfaces::binaryInterfaces')<br>specializesFromLibrary('Interfaces::interfaces')

description: <p>An <code>InterfaceUsage</code> is a Usage of an <code>InterfaceDefinition</code> to represent an interface connecting parts of a system through specific ports.</p><br>ownedEndFeature->size() = 2 implies<br>    specializesFromLibrary('Interfaces::binaryInterfaces')<br>specializesFromLibrary('Interfaces::interfaces')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:interfaceUsageInterfaceDefinition](https://www.omg.org/spec/SysML/20230201/vocab#interfaceUsageInterfaceDefinition)| [0..*]| [sysml_vocab:InterfaceDefinition](https://www.omg.org/spec/SysML/20230201/vocab#InterfaceDefinition)| <p>The <code>InterfaceDefinitions</code> that type this <code>InterfaceUsage</code>.</p>| <p>The <code>InterfaceDefinitions</code> that type this <code>InterfaceUsage</code>.</p>|



### TransitionFeatureMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#TransitionFeatureMembership

type: Shape

target class: [sysml_vocab:TransitionFeatureMembership](https://www.omg.org/spec/SysML/20230201/vocab#TransitionFeatureMembership)

definition of vocabulary class : <p>A <code>TransitionFeatureMembership</code> is a <code>FeatureMembership</code> for a trigger, guard or effect of a <code>TransitionUsage</code>, whose <code>transitionFeature</code> is a <code>AcceptActionUsage</code>, <em><code>Boolean</code></em>-valued <code>Expression</code> or <code>ActionUsage</code>, depending on its <code>kind</code>. </p><br>kind = TransitionFeatureKind::trigger implies<br>    transitionFeature.oclIsKindOf(AcceptActionUsage)<br>owningType.oclIsKindOf(TransitionUsage)<br>kind = TransitionFeatureKind::guard implies<br>    transitionFeature.oclIsKindOf(Expression) and<br>    let guard : Expression = transitionFeature.oclIsKindOf(Expression) in<br>    guard.result.specializesFromLibrary('ScalarValues::Boolean') and<br>    guard.result.multiplicity <> null and<br>    guard.result.multiplicity.hasBounds(1,1)<br>kind = TransitionFeatureKind::effect implies<br>    transitionFeature.oclIsKindOf(ActionUsage)

description: <p>A <code>TransitionFeatureMembership</code> is a <code>FeatureMembership</code> for a trigger, guard or effect of a <code>TransitionUsage</code>, whose <code>transitionFeature</code> is a <code>AcceptActionUsage</code>, <em><code>Boolean</code></em>-valued <code>Expression</code> or <code>ActionUsage</code>, depending on its <code>kind</code>. </p><br>kind = TransitionFeatureKind::trigger implies<br>    transitionFeature.oclIsKindOf(AcceptActionUsage)<br>owningType.oclIsKindOf(TransitionUsage)<br>kind = TransitionFeatureKind::guard implies<br>    transitionFeature.oclIsKindOf(Expression) and<br>    let guard : Expression = transitionFeature.oclIsKindOf(Expression) in<br>    guard.result.specializesFromLibrary('ScalarValues::Boolean') and<br>    guard.result.multiplicity <> null and<br>    guard.result.multiplicity.hasBounds(1,1)<br>kind = TransitionFeatureKind::effect implies<br>    transitionFeature.oclIsKindOf(ActionUsage)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:transitionFeatureMembershipKind](https://www.omg.org/spec/SysML/20230201/vocab#transitionFeatureMembershipKind)| [1]| String| <p>Whether this <code>TransitionFeatureMembership </code> is for a <code>trigger</code>, <code>guard</code> or <code>effect</code>.</p>| <p>Whether this <code>TransitionFeatureMembership </code> is for a <code>trigger</code>, <code>guard</code> or <code>effect</code>.</p>|
| [sysml_vocab:transitionFeatureMembershipTransitionFeature](https://www.omg.org/spec/SysML/20230201/vocab#transitionFeatureMembershipTransitionFeature)| [1]| [sysml_vocab:Step](https://www.omg.org/spec/SysML/20230201/vocab#Step)| <p>The <code>Step</code> that is the <code>ownedMemberFeature</code> of this <code>TransitionFeatureMembership</code>.</p>| <p>The <code>Step</code> that is the <code>ownedMemberFeature</code> of this <code>TransitionFeatureMembership</code>.</p>|



### Invariant

URI: https://www.omg.org/spec/SysML/20230201/shapes#Invariant

type: Shape

target class: [sysml_vocab:Invariant](https://www.omg.org/spec/SysML/20230201/vocab#Invariant)

definition of vocabulary class : <p>An <code>Invariant</code> is a <code>BooleanExpression</code> that is asserted to have a specific <code><em>Boolean</em></code> result value. If <code>isNegated = false</code>, then the result is asserted to be true. If <code>isNegated = true</code>, then the result is asserted to be false.</p><br><br>if isNegated then<br>    specializesFromLibrary('Performances::falseEvaluations')<br>else<br>    specializesFromLibrary('Performances::trueEvaluations')<br>endif

description: <p>An <code>Invariant</code> is a <code>BooleanExpression</code> that is asserted to have a specific <code><em>Boolean</em></code> result value. If <code>isNegated = false</code>, then the result is asserted to be true. If <code>isNegated = true</code>, then the result is asserted to be false.</p><br><br>if isNegated then<br>    specializesFromLibrary('Performances::falseEvaluations')<br>else<br>    specializesFromLibrary('Performances::trueEvaluations')<br>endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:invariantIsNegated](https://www.omg.org/spec/SysML/20230201/vocab#invariantIsNegated)| [1]| Boolean| <p>Whether this <code>Invariant</code> is asserted to be false rather than true.</p><br>| <p>Whether this <code>Invariant</code> is asserted to be false rather than true.</p><br>|



### FeatureValue

URI: https://www.omg.org/spec/SysML/20230201/shapes#FeatureValue

type: Shape

target class: [sysml_vocab:FeatureValue](https://www.omg.org/spec/SysML/20230201/vocab#FeatureValue)

definition of vocabulary class : <p>A <code>FeatureValue</code> is a <code>Membership</code> that identifies a particular member <code>Expression</code> that provides the value of the <code>Feature</code> that owns the <code>FeatureValue</code>. The value is specified as either a bound value or an initial value, and as either a concrete or default value. A <code>Feature</code> can have at most one <code>FeatureValue</code>.</p><br><br><p>The result of the <code>value</code> <code>Expression</code> is bound to the <code>featureWithValue</code> using a <code>BindingConnector</code>. If <code>isInitial = false</code>, then the <code>featuringType</code> of the <code>BindingConnector</code> is the same as the <code>featuringType</code> of the <code>featureWithValue</code>. If <code>isInitial = true</code>, then the <code>featuringType</code> of the <code>BindingConnector</code> is restricted to its <code>startShot</code>.<br><br><p>If <code>isDefault = false</code>, then the above semantics of the <code>FeatureValue</code> are realized for the given <code>featureWithValue</code>. Otherwise, the semantics are realized for any individual of the <code>featuringType</code> of the <code>featureWithValue</code>, unless another value is explicitly given for the <code>featureWithValue</code> for that individual.</p><br><br>not isDefault implies<br>    featureWithValue.ownedMember-><br>        selectByKind(BindingConnector)->exists(b |<br>            b.relatedFeature->includes(featureWithValue) and<br>            b.relatedFeature->includes(value.result) and<br>            if not isInitial then <br>                b.featuringType = featureWithValue.featuringType<br>            else <br>                b.featuringType->exists(t |<br>                    t.oclIsKindOf(Feature) and<br>                    t.oclAsType(Feature).chainingFeature =<br>                        Sequence{<br>                            resolveGlobal('Base::things::that').<br>                                memberElement,<br>                            resolveGlobal('Occurrences::Occurrence::startShot').<br>                                memberElement<br>                        }<br>                )<br>            endif)<br>featureWithValue.redefinition.redefinedFeature-><br>    closure(redefinition.redefinedFeature).valuation-><br>    forAll(isDefault)

description: <p>A <code>FeatureValue</code> is a <code>Membership</code> that identifies a particular member <code>Expression</code> that provides the value of the <code>Feature</code> that owns the <code>FeatureValue</code>. The value is specified as either a bound value or an initial value, and as either a concrete or default value. A <code>Feature</code> can have at most one <code>FeatureValue</code>.</p><br><br><p>The result of the <code>value</code> <code>Expression</code> is bound to the <code>featureWithValue</code> using a <code>BindingConnector</code>. If <code>isInitial = false</code>, then the <code>featuringType</code> of the <code>BindingConnector</code> is the same as the <code>featuringType</code> of the <code>featureWithValue</code>. If <code>isInitial = true</code>, then the <code>featuringType</code> of the <code>BindingConnector</code> is restricted to its <code>startShot</code>.<br><br><p>If <code>isDefault = false</code>, then the above semantics of the <code>FeatureValue</code> are realized for the given <code>featureWithValue</code>. Otherwise, the semantics are realized for any individual of the <code>featuringType</code> of the <code>featureWithValue</code>, unless another value is explicitly given for the <code>featureWithValue</code> for that individual.</p><br><br>not isDefault implies<br>    featureWithValue.ownedMember-><br>        selectByKind(BindingConnector)->exists(b |<br>            b.relatedFeature->includes(featureWithValue) and<br>            b.relatedFeature->includes(value.result) and<br>            if not isInitial then <br>                b.featuringType = featureWithValue.featuringType<br>            else <br>                b.featuringType->exists(t |<br>                    t.oclIsKindOf(Feature) and<br>                    t.oclAsType(Feature).chainingFeature =<br>                        Sequence{<br>                            resolveGlobal('Base::things::that').<br>                                memberElement,<br>                            resolveGlobal('Occurrences::Occurrence::startShot').<br>                                memberElement<br>                        }<br>                )<br>            endif)<br>featureWithValue.redefinition.redefinedFeature-><br>    closure(redefinition.redefinedFeature).valuation-><br>    forAll(isDefault)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:featureValueIsInitial](https://www.omg.org/spec/SysML/20230201/vocab#featureValueIsInitial)| [1]| Boolean| <p>Whether this <code>FeatureValue</code> specifies a bound value or an initial value for the <code>featureWithValue</code>.</p>| <p>Whether this <code>FeatureValue</code> specifies a bound value or an initial value for the <code>featureWithValue</code>.</p>|
| [sysml_vocab:featureValueIsDefault](https://www.omg.org/spec/SysML/20230201/vocab#featureValueIsDefault)| [1]| Boolean| <p>Whether this <code>FeatureValue</code> is a concrete specification of the bound or initial value of the <code>featureWithValue</code>, or just a default value that may be overridden.</p>| <p>Whether this <code>FeatureValue</code> is a concrete specification of the bound or initial value of the <code>featureWithValue</code>, or just a default value that may be overridden.</p>|
| [sysml_vocab:featureValueFeatureWithValue](https://www.omg.org/spec/SysML/20230201/vocab#featureValueFeatureWithValue)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> to be provided a value.</p><br><br><p>The Feature to be provided a value.</p>| <p>The <code>Feature</code> to be provided a value.</p><br><br><p>The Feature to be provided a value.</p>|
| [sysml_vocab:featureValueValue](https://www.omg.org/spec/SysML/20230201/vocab#featureValueValue)| [1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>Expression</code> that provides the value of the <code>featureWithValue</code> as its <code>result</code>.</p><br><br><p>The Expression that provides the value as a result.</p>| <p>The <code>Expression</code> that provides the value of the <code>featureWithValue</code> as its <code>result</code>.</p><br><br><p>The Expression that provides the value as a result.</p>|



### SuccessionAsUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#SuccessionAsUsage

type: Shape

target class: [sysml_vocab:SuccessionAsUsage](https://www.omg.org/spec/SysML/20230201/vocab#SuccessionAsUsage)

definition of vocabulary class : <p>A <code>SuccessionAsUsage</code> is both a <code>ConnectorAsUsage</code> and a <code>Succession</code>.<p>

description: <p>A <code>SuccessionAsUsage</code> is both a <code>ConnectorAsUsage</code> and a <code>Succession</code>.<p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### SubjectMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#SubjectMembership

type: Shape

target class: [sysml_vocab:SubjectMembership](https://www.omg.org/spec/SysML/20230201/vocab#SubjectMembership)

definition of vocabulary class : <p>A <code>SubjectMembership</code> is a <code>ParameterMembership</code> that indicates that its <code>ownedSubjectParameter</code> is the subject of its <code>owningType</code>. The <code>owningType</code> of a <code>SubjectMembership</code> must be a <code>RequirementDefinition</code>, <code>RequirementUsage</code>, <code>CaseDefinition</code>, or <code>CaseUsage</code>.</p><br>owningType.oclIsType(RequirementDefinition) or<br>owningType.oclIsType(RequiremenCaseRequirementDefinition) or<br>owningType.oclIsType(CaseDefinition) or<br>owningType.oclIsType(CaseUsage)<br>

description: <p>A <code>SubjectMembership</code> is a <code>ParameterMembership</code> that indicates that its <code>ownedSubjectParameter</code> is the subject of its <code>owningType</code>. The <code>owningType</code> of a <code>SubjectMembership</code> must be a <code>RequirementDefinition</code>, <code>RequirementUsage</code>, <code>CaseDefinition</code>, or <code>CaseUsage</code>.</p><br>owningType.oclIsType(RequirementDefinition) or<br>owningType.oclIsType(RequiremenCaseRequirementDefinition) or<br>owningType.oclIsType(CaseDefinition) or<br>owningType.oclIsType(CaseUsage)<br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:subjectMembershipOwnedSubjectParameter](https://www.omg.org/spec/SysML/20230201/vocab#subjectMembershipOwnedSubjectParameter)| [1]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>Usage</code< that is the <code>ownedMemberParameter</code> of this <code>SubjectMembership</code>.</p>| <p>The <code>Usage</code< that is the <code>ownedMemberParameter</code> of this <code>SubjectMembership</code>.</p>|



### Metaclass

URI: https://www.omg.org/spec/SysML/20230201/shapes#Metaclass

type: Shape

target class: [sysml_vocab:Metaclass](https://www.omg.org/spec/SysML/20230201/vocab#Metaclass)

definition of vocabulary class : <p>A <code>Metaclass</code> is a <code>Structure</code> used to type <code>MetadataFeatures</code>.</p><br>specializesFromLibrary('Metaobjects::Metaobject')

description: <p>A <code>Metaclass</code> is a <code>Structure</code> used to type <code>MetadataFeatures</code>.</p><br>specializesFromLibrary('Metaobjects::Metaobject')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Namespace

URI: https://www.omg.org/spec/SysML/20230201/shapes#Namespace

type: Shape

target class: [sysml_vocab:Namespace](https://www.omg.org/spec/SysML/20230201/vocab#Namespace)

definition of vocabulary class : <p>A <code>Namespace</code> is an <code>Element</code> that contains other <code>Elements</code>, known as its <code>members</code>, via <code>Membership</code> <code>Relationships</code> with those <code>Elements</code>. The <code>members</code> of a <code>Namespace</code> may be owned by the <code>Namespace</code>, aliased in the <code>Namespace</code>, or imported into the <code>Namespace</code> via <code>Import</code> <code>Relationships</code>.</p><br><br><p>A <code>Namespace</code> can provide names for its <code>members</code> via the <code>memberNames</code> and <code>memberShortNames</code> specified by the <code>Memberships</code> in the <code>Namespace</code>. If a <code>Membership</code> specifies a <code>memberName</code> and/or <code>memberShortName</code>, then those are names of the corresponding <code>memberElement</code> relative to the <code>Namespace</code>. For an <code>OwningMembership</code>, the <code>owningMemberName</code> and <code>owningMemberShortName</code> are given by the <code>Element</code> <code>name</code> and <code>shortName</code>. Note that the same <code>Element</code> may be the <code>memberElement</code> of multiple <code>Memberships</code> in a <code>Namespace</code> (though it may be owned at most once), each of which may define a separate alias for the <code>Element</code> relative to the <code>Namespace</code>.</p><br><br>membership->forAll(m1 | <br>    membership->forAll(m2 | <br>        m1 <> m2 implies m1.isDistinguishableFrom(m2)))<br>member = membership.memberElement<br>ownedMember = ownedMembership->selectByKind(OwningMembership).ownedMemberElement<br>importedMembership = importedMemberships(Set{})<br>ownedImport = ownedRelationship->selectByKind(Import)<br>ownedMembership = ownedRelationship->selectByKind(Membership)

description: <p>A <code>Namespace</code> is an <code>Element</code> that contains other <code>Elements</code>, known as its <code>members</code>, via <code>Membership</code> <code>Relationships</code> with those <code>Elements</code>. The <code>members</code> of a <code>Namespace</code> may be owned by the <code>Namespace</code>, aliased in the <code>Namespace</code>, or imported into the <code>Namespace</code> via <code>Import</code> <code>Relationships</code>.</p><br><br><p>A <code>Namespace</code> can provide names for its <code>members</code> via the <code>memberNames</code> and <code>memberShortNames</code> specified by the <code>Memberships</code> in the <code>Namespace</code>. If a <code>Membership</code> specifies a <code>memberName</code> and/or <code>memberShortName</code>, then those are names of the corresponding <code>memberElement</code> relative to the <code>Namespace</code>. For an <code>OwningMembership</code>, the <code>owningMemberName</code> and <code>owningMemberShortName</code> are given by the <code>Element</code> <code>name</code> and <code>shortName</code>. Note that the same <code>Element</code> may be the <code>memberElement</code> of multiple <code>Memberships</code> in a <code>Namespace</code> (though it may be owned at most once), each of which may define a separate alias for the <code>Element</code> relative to the <code>Namespace</code>.</p><br><br>membership->forAll(m1 | <br>    membership->forAll(m2 | <br>        m1 <> m2 implies m1.isDistinguishableFrom(m2)))<br>member = membership.memberElement<br>ownedMember = ownedMembership->selectByKind(OwningMembership).ownedMemberElement<br>importedMembership = importedMemberships(Set{})<br>ownedImport = ownedRelationship->selectByKind(Import)<br>ownedMembership = ownedRelationship->selectByKind(Membership)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:namespaceOwnedMembership](https://www.omg.org/spec/SysML/20230201/vocab#namespaceOwnedMembership)| [0..*]| [sysml_vocab:Membership](https://www.omg.org/spec/SysML/20230201/vocab#Membership)| <p>The <code>ownedRelationships</code> of this <code>Namespace</code> that are <code>Memberships</code>, for which the <code>Namespace</code> is the <code>membershipOwningNamespace</code>.</p><br>| <p>The <code>ownedRelationships</code> of this <code>Namespace</code> that are <code>Memberships</code>, for which the <code>Namespace</code> is the <code>membershipOwningNamespace</code>.</p><br>|
| [sysml_vocab:namespaceOwnedMember](https://www.omg.org/spec/SysML/20230201/vocab#namespaceOwnedMember)| [0..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The owned <code>members</code> of this <code>Namespace</code>, which are the <cpde><code>ownedMemberElements</code> of the <code>ownedMemberships</code> of the .</cpde></p><br>| <p>The owned <code>members</code> of this <code>Namespace</code>, which are the <cpde><code>ownedMemberElements</code> of the <code>ownedMemberships</code> of the .</cpde></p><br>|
| [sysml_vocab:namespaceMembership](https://www.omg.org/spec/SysML/20230201/vocab#namespaceMembership)| [0..*]| [sysml_vocab:Membership](https://www.omg.org/spec/SysML/20230201/vocab#Membership)| <p>All <code>Memberships</code> in this <code>Namespace</code>, including (at least) the union of <code>ownedMemberships</code> and <code>importedMemberships</code>.</p><br>| <p>All <code>Memberships</code> in this <code>Namespace</code>, including (at least) the union of <code>ownedMemberships</code> and <code>importedMemberships</code>.</p><br>|
| [sysml_vocab:namespaceOwnedImport](https://www.omg.org/spec/SysML/20230201/vocab#namespaceOwnedImport)| [0..*]| [sysml_vocab:Import](https://www.omg.org/spec/SysML/20230201/vocab#Import)| <p>The <code>ownedRelationships</code> of this <code>Namespace</code> that are <code>Imports</code>, for which the <code>Namespace</code> is the <code>importOwningNamespace</code>.</p><br>| <p>The <code>ownedRelationships</code> of this <code>Namespace</code> that are <code>Imports</code>, for which the <code>Namespace</code> is the <code>importOwningNamespace</code>.</p><br>|
| [sysml_vocab:namespaceMember](https://www.omg.org/spec/SysML/20230201/vocab#namespaceMember)| [0..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The set of all member <code>Elements</code> of this <code>Namespace</code>, which are the <code>memberElements</code> of all <code>memberships</code> of the <code>Namespace</code>.</p><br>| <p>The set of all member <code>Elements</code> of this <code>Namespace</code>, which are the <code>memberElements</code> of all <code>memberships</code> of the <code>Namespace</code>.</p><br>|
| [sysml_vocab:namespaceImportedMembership](https://www.omg.org/spec/SysML/20230201/vocab#namespaceImportedMembership)| [0..*]| [sysml_vocab:Membership](https://www.omg.org/spec/SysML/20230201/vocab#Membership)| <p>The <code>Memberships</code> in this <code>Namespace</code> that result from the <code>ownedImports</code> of this <code>Namespace</code>.</p><br>| <p>The <code>Memberships</code> in this <code>Namespace</code> that result from the <code>ownedImports</code> of this <code>Namespace</code>.</p><br>|



### Differencing

URI: https://www.omg.org/spec/SysML/20230201/shapes#Differencing

type: Shape

target class: [sysml_vocab:Differencing](https://www.omg.org/spec/SysML/20230201/vocab#Differencing)

definition of vocabulary class : <p><code>Differencing</code> is a <code>Relationship</code> that makes its <code>differencingType</code> one of the <code>differencingTypes</code> of its <code>typeDifferenced</code>.</p><br>

description: <p><code>Differencing</code> is a <code>Relationship</code> that makes its <code>differencingType</code> one of the <code>differencingTypes</code> of its <code>typeDifferenced</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:differencingDifferencingType](https://www.omg.org/spec/SysML/20230201/vocab#differencingDifferencingType)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p><code>Type</code> that partly determines interpretations of <code>typeDifferenced</code>, as described in <code>Type::differencingType</code>.</p><br>| <p><code>Type</code> that partly determines interpretations of <code>typeDifferenced</code>, as described in <code>Type::differencingType</code>.</p><br>|
| [sysml_vocab:differencingTypeDifferenced](https://www.omg.org/spec/SysML/20230201/vocab#differencingTypeDifferenced)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p><code>Type</code> with interpretations partly determined by <code>differencingType</code>, as described in <code>Type::differencingType</code>.</p><br>| <p><code>Type</code> with interpretations partly determined by <code>differencingType</code>, as described in <code>Type::differencingType</code>.</p><br>|



### WhileLoopActionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#WhileLoopActionUsage

type: Shape

target class: [sysml_vocab:WhileLoopActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#WhileLoopActionUsage)

definition of vocabulary class : <p>A <code>WhileLoopActionUsage</code> is a <code>LoopActionUsage</code> that specifies that the <code>bodyAction</code> <code>ActionUsage</code> should be performed repeatedly while the result of the <code>whileArgument</code> <code>Expression</code> is true or until the result of the <code>untilArgument</code> <code>Expression</code> (if provided) is true. The <code>whileArgument</code> <code>Expression</code> is evaluated before each (possible) performance of the <code>bodyAction</code>, and the <code>untilArgument</code> <code>Expression</code> is evaluated after each performance of the <code>bodyAction</code>.</p><br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::whileLoops')<br>untilArgument =<br>    let parameter : Feature = inputParameter(3) in<br>    if parameter <> null and parameter.oclIsKindOf(Expression) then<br>        parameter.oclAsType(Expression)<br>    else<br>        null<br>    endif<br><br>specializesFromLibrary('Actions::whileLoopActions')<br>whileArgument =<br>    let parameter : Feature = inputParameter(1) in<br>    if parameter <> null and parameter.oclIsKindOf(Expression) then<br>        parameter.oclAsType(Expression)<br>    else<br>        null<br>    endif<br><br>inputParameters()->size() >= 2

description: <p>A <code>WhileLoopActionUsage</code> is a <code>LoopActionUsage</code> that specifies that the <code>bodyAction</code> <code>ActionUsage</code> should be performed repeatedly while the result of the <code>whileArgument</code> <code>Expression</code> is true or until the result of the <code>untilArgument</code> <code>Expression</code> (if provided) is true. The <code>whileArgument</code> <code>Expression</code> is evaluated before each (possible) performance of the <code>bodyAction</code>, and the <code>untilArgument</code> <code>Expression</code> is evaluated after each performance of the <code>bodyAction</code>.</p><br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::whileLoops')<br>untilArgument =<br>    let parameter : Feature = inputParameter(3) in<br>    if parameter <> null and parameter.oclIsKindOf(Expression) then<br>        parameter.oclAsType(Expression)<br>    else<br>        null<br>    endif<br><br>specializesFromLibrary('Actions::whileLoopActions')<br>whileArgument =<br>    let parameter : Feature = inputParameter(1) in<br>    if parameter <> null and parameter.oclIsKindOf(Expression) then<br>        parameter.oclAsType(Expression)<br>    else<br>        null<br>    endif<br><br>inputParameters()->size() >= 2

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:whileLoopActionUsageWhileArgument](https://www.omg.org/spec/SysML/20230201/vocab#whileLoopActionUsageWhileArgument)| [1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>Expression</code> whose result, if true, determines that the <code>bodyAction</code> should continue to be performed. It is the first owned <code>parameter</code> of the <code>WhileLoopActionUsage</code>.</p> <br>| <p>The <code>Expression</code> whose result, if true, determines that the <code>bodyAction</code> should continue to be performed. It is the first owned <code>parameter</code> of the <code>WhileLoopActionUsage</code>.</p> <br>|
| [sysml_vocab:whileLoopActionUsageUntilArgument](https://www.omg.org/spec/SysML/20230201/vocab#whileLoopActionUsageUntilArgument)| [0..1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>Expression</code> whose result, if false, determines that the <code>bodyAction</code> should continue to be performed. It is the (optional) third owned <code>parameter</code> of the <code>WhileLoopActionUsage</code>.</p> <br>| <p>The <code>Expression</code> whose result, if false, determines that the <code>bodyAction</code> should continue to be performed. It is the (optional) third owned <code>parameter</code> of the <code>WhileLoopActionUsage</code>.</p> <br>|



### PartDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#PartDefinition

type: Shape

target class: [sysml_vocab:PartDefinition](https://www.omg.org/spec/SysML/20230201/vocab#PartDefinition)

definition of vocabulary class : <p>A <code>PartDefinition</code> is an <code>ItemDefinition</code> of a <code>Class</code> of systems or parts of systems. Note that all parts may be considered items for certain purposes, but not all items are parts that can perform actions within a system.</p><br><br>specializesFromLibrary('Parts::Part')

description: <p>A <code>PartDefinition</code> is an <code>ItemDefinition</code> of a <code>Class</code> of systems or parts of systems. Note that all parts may be considered items for certain purposes, but not all items are parts that can perform actions within a system.</p><br><br>specializesFromLibrary('Parts::Part')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Comment

URI: https://www.omg.org/spec/SysML/20230201/shapes#Comment

type: Shape

target class: [sysml_vocab:Comment](https://www.omg.org/spec/SysML/20230201/vocab#Comment)

definition of vocabulary class : <p>A <code>Comment</code> is an <code>AnnotatingElement</code> whose <code>body</code> in some way describes its <code>annotatedElements</code>.</p><br>

description: <p>A <code>Comment</code> is an <code>AnnotatingElement</code> whose <code>body</code> in some way describes its <code>annotatedElements</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:commentLocale](https://www.omg.org/spec/SysML/20230201/vocab#commentLocale)| [0..1]| String| <p>Identification of the language of the <code>body</code> text and, optionally, the region and/or encoding. The format shall be a POSIX locale conformant to ISO/IEC 15897, with the format <code>[language[_territory][.codeset][@modifier]]</code>.</p>| <p>Identification of the language of the <code>body</code> text and, optionally, the region and/or encoding. The format shall be a POSIX locale conformant to ISO/IEC 15897, with the format <code>[language[_territory][.codeset][@modifier]]</code>.</p>|
| [sysml_vocab:commentBody](https://www.omg.org/spec/SysML/20230201/vocab#commentBody)| [1]| String| <p>The annotation text for the <code>Comment</code>.</p><br>| <p>The annotation text for the <code>Comment</code>.</p><br>|



### MultiplicityRange

URI: https://www.omg.org/spec/SysML/20230201/shapes#MultiplicityRange

type: Shape

target class: [sysml_vocab:MultiplicityRange](https://www.omg.org/spec/SysML/20230201/vocab#MultiplicityRange)

definition of vocabulary class : <p>A <code>MultiplicityRange</code> is a <code>Multiplicity</code> whose value is defined to be the (inclusive) range of natural numbers given by the result of a <code>lowerBound</code> <code>Expression</code> and the result of an <code>upperBound</code> <code>Expression</code>. The result of these <code>Expressions</code> shall be of type <code><em>Natural</em></code>. If the result of the <code>upperBound</code> <code>Expression</code> is the unbounded value <code>*</code>, then the specified range includes all natural numbers greater than or equal to the <code>lowerBound</code> value. If no <code>lowerBound</code> <code>Expression</code>, then the default is that the lower bound has the same value as the upper bound, except if the <code>upperBound</code> evaluates to <code>*</code>, in which case the default for the lower bound is 0.</p><br><br>bound->forAll(b | b.featuringType = self.featuringType)<br>bound->forAll(b |<br>    b.result.specializesFromLibrary('ScalarValues::Integer') and<br>    let value : UnlimitedNatural = valueOf(b) in<br>    value <> null implies value >= 0<br>)<br>lowerBound =<br>    let ownedMembers : Sequence(Element) = <br>        ownedMembership->selectByKind(OwningMembership).ownedMember in<br>    if ownedMembers->size() < 2 or <br>        not ownedMembers->first().oclIsKindOf(Expression) then null<br>    else ownedMembers->first().oclAsType(Expression)<br>    endif<br>upperBound =<br>    let ownedMembers : Sequence(Element) = <br>        ownedMembership->selectByKind(OwningMembership).ownedMember in<br>    if ownedMembers->isEmpty() or <br>       not ownedMembers->last().oclIsKindOf(Expression) <br>    then null<br>    else ownedMembers->last().oclAsType(Expression)<br>    endif 

description: <p>A <code>MultiplicityRange</code> is a <code>Multiplicity</code> whose value is defined to be the (inclusive) range of natural numbers given by the result of a <code>lowerBound</code> <code>Expression</code> and the result of an <code>upperBound</code> <code>Expression</code>. The result of these <code>Expressions</code> shall be of type <code><em>Natural</em></code>. If the result of the <code>upperBound</code> <code>Expression</code> is the unbounded value <code>*</code>, then the specified range includes all natural numbers greater than or equal to the <code>lowerBound</code> value. If no <code>lowerBound</code> <code>Expression</code>, then the default is that the lower bound has the same value as the upper bound, except if the <code>upperBound</code> evaluates to <code>*</code>, in which case the default for the lower bound is 0.</p><br><br>bound->forAll(b | b.featuringType = self.featuringType)<br>bound->forAll(b |<br>    b.result.specializesFromLibrary('ScalarValues::Integer') and<br>    let value : UnlimitedNatural = valueOf(b) in<br>    value <> null implies value >= 0<br>)<br>lowerBound =<br>    let ownedMembers : Sequence(Element) = <br>        ownedMembership->selectByKind(OwningMembership).ownedMember in<br>    if ownedMembers->size() < 2 or <br>        not ownedMembers->first().oclIsKindOf(Expression) then null<br>    else ownedMembers->first().oclAsType(Expression)<br>    endif<br>upperBound =<br>    let ownedMembers : Sequence(Element) = <br>        ownedMembership->selectByKind(OwningMembership).ownedMember in<br>    if ownedMembers->isEmpty() or <br>       not ownedMembers->last().oclIsKindOf(Expression) <br>    then null<br>    else ownedMembers->last().oclAsType(Expression)<br>    endif 

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:multiplicityRangeLowerBound](https://www.omg.org/spec/SysML/20230201/vocab#multiplicityRangeLowerBound)| [0..1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>Expression</code> whose result provides the lower bound of the <code>MultiplicityRange</code>. If no <code>lowerBound</code> <code>Expression</code> is given, then the lower bound shall have the same value as the upper bound, unless the upper bound is unbounded (<code>*</code>), in which case the lower bound shall be 0.</p><br>| <p>The <code>Expression</code> whose result provides the lower bound of the <code>MultiplicityRange</code>. If no <code>lowerBound</code> <code>Expression</code> is given, then the lower bound shall have the same value as the upper bound, unless the upper bound is unbounded (<code>*</code>), in which case the lower bound shall be 0.</p><br>|
| [sysml_vocab:multiplicityRangeUpperBound](https://www.omg.org/spec/SysML/20230201/vocab#multiplicityRangeUpperBound)| [1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| The <code>Expression</code> whose result is the upper bound of the <code>MultiplicityRange</code>.| The <code>Expression</code> whose result is the upper bound of the <code>MultiplicityRange</code>.|
| [sysml_vocab:multiplicityRangeBound](https://www.omg.org/spec/SysML/20230201/vocab#multiplicityRangeBound)| [1..*]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The owned <code>Expressions</code> of the <code>MultiplicityRange</code> whose results provide its bounds. These must be the only <code>ownedMembers</code> of the <code>MultiplicityRange</code>.</p>| <p>The owned <code>Expressions</code> of the <code>MultiplicityRange</code> whose results provide its bounds. These must be the only <code>ownedMembers</code> of the <code>MultiplicityRange</code>.</p>|



### LiteralInfinity

URI: https://www.omg.org/spec/SysML/20230201/shapes#LiteralInfinity

type: Shape

target class: [sysml_vocab:LiteralInfinity](https://www.omg.org/spec/SysML/20230201/vocab#LiteralInfinity)

definition of vocabulary class : <p>A <code>LiteralInfinity</code> is a <code>LiteralExpression</code> that provides the positive infinity value (<code>*</code>). It's <code>result</code> must have the type <code><em>Positive</em></code>.</p><br><br>specializesFromLibrary('Performances::literalIntegerEvaluations')

description: <p>A <code>LiteralInfinity</code> is a <code>LiteralExpression</code> that provides the positive infinity value (<code>*</code>). It's <code>result</code> must have the type <code><em>Positive</em></code>.</p><br><br>specializesFromLibrary('Performances::literalIntegerEvaluations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### TransitionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#TransitionUsage

type: Shape

target class: [sysml_vocab:TransitionUsage](https://www.omg.org/spec/SysML/20230201/vocab#TransitionUsage)

definition of vocabulary class : <p>A <code>TransitionUsage</code> is an <code>ActionUsage</code> representing a triggered transition between <code>ActionUsages</code> or <code>StateUsages</code>. When triggered by a <code>triggerAction</code>, when its <code>guardExpression</code> is true, the <code>TransitionUsage</code> asserts that its <code>source</code> is exited, then its <code>effectAction</code> (if any) is performed, and then its <code>target</code> is entered.</p><br><br><p>A <code>TransitionUsage</code> can be related to some of its <code>ownedFeatures</code> using <code>TransitionFeatureMembership</code> <code>Relationships</code>, corresponding to the <code>triggerAction</code>, <code>guardExpression</code> and <code>effectAction</code> of the <code>TransitionUsage</code>.</p><br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(ActionDefinition) or <br> owningType.oclIsKindOf(ActionUsage)) and<br>not (owningType.oclIsKindOf(StateDefinition) or<br>     owningType.oclIsKindOf(StateUsage)) implies<br>    specializesFromLibrary('Actions::Action::decisionTransitions')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(StateDefinition) or<br> owningType.oclIsKindOf(StateUsage)) implies<br>    specializesFromLibrary("States::State::stateTransitions")<br>specializesFromLibrary('Actions::transitionActions')<br>source =<br>    if ownedMembership->isEmpty() then null<br>    else<br>        let member : Element = <br>            ownedMembership->at(1).memberElement in <br>        if not member.oclIsKindOf(ActionUsage) then null<br>        else member.oclAsKindOf(ActionUsage)<br>        endif<br>    endif<br>target =<br>    if succession.targetFeature->isEmpty() then null<br>    else<br>        let targetFeature : Feature = <br>            succession.targetFeature->at(1) in<br>        if not targetFeature.oclIsKindOf(ActionUsage) then null<br>        else targetFeature.oclAsType(ActionUsage)<br>        endif<br>    endif<br>triggerAction = ownedFeatureMembership-><br>    selectByKind(TransitionFeatureMembership)-><br>    select(kind = TransitionFeatureKind::trigger).transitionFeature-><br>    selectByKind(AcceptActionUsage)<br>let successions : Sequence(Successions) = <br>    ownedMember->selectByKind(Succession) in<br>successions->notEmpty() and<br>successions->at(1).targetFeature-><br>    forAll(oclIsKindOf(ActionUsage))<br>guardExpression = ownedFeatureMembership-><br>    selectByKind(TransitionFeatureMembership)-><br>    select(kind = TransitionFeatureKind::trigger).transitionFeature-><br>    selectByKind(Expression)<br>triggerAction->forAll(specializesFromLibrary('Actions::TransitionAction::accepter') and<br>guardExpression->forAll(specializesFromLibrary('Actions::TransitionAction::guard') and<br>effectAction->forAll(specializesFromLibrary('Actions::TransitionAction::effect'))<br>triggerAction = ownedFeatureMembership-><br>    selectByKind(TransitionFeatureMembership)-><br>    select(kind = TransitionFeatureKind::trigger).transitionFeatures-><br>    selectByKind(AcceptActionUsage)<br>succession.sourceFeature = source<br>ownedMember->selectByKind(BindingConnector)->exists(b |<br>    b.relatedFeatures->includes(source) and<br>    b.relatedFeatures->includes(inputParameter(1)))<br>triggerAction->notEmpty() implies<br>    let payloadParameter : Feature = inputParameter(2) in<br>    payloadParameter <> null and<br>    payloadParameter.subsetsChain(triggerAction->at(1), triggerPayloadParameter())<br>ownedMember->selectByKind(BindingConnector)->exists(b |<br>    b.relatedFeatures->includes(succession) and<br>    b.relatedFeatures->includes(resolveGlobal(<br>        'TransitionPerformances::TransitionPerformance::transitionLink')))<br>if triggerAction->isEmpty() then<br>    inputParameters()->size() >= 1<br>else<br>    inputParameters()->size() >= 2<br>endif<br>    <br>succession = ownedMember->selectByKind(Succession)->at(1)

description: <p>A <code>TransitionUsage</code> is an <code>ActionUsage</code> representing a triggered transition between <code>ActionUsages</code> or <code>StateUsages</code>. When triggered by a <code>triggerAction</code>, when its <code>guardExpression</code> is true, the <code>TransitionUsage</code> asserts that its <code>source</code> is exited, then its <code>effectAction</code> (if any) is performed, and then its <code>target</code> is entered.</p><br><br><p>A <code>TransitionUsage</code> can be related to some of its <code>ownedFeatures</code> using <code>TransitionFeatureMembership</code> <code>Relationships</code>, corresponding to the <code>triggerAction</code>, <code>guardExpression</code> and <code>effectAction</code> of the <code>TransitionUsage</code>.</p><br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(ActionDefinition) or <br> owningType.oclIsKindOf(ActionUsage)) and<br>not (owningType.oclIsKindOf(StateDefinition) or<br>     owningType.oclIsKindOf(StateUsage)) implies<br>    specializesFromLibrary('Actions::Action::decisionTransitions')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(StateDefinition) or<br> owningType.oclIsKindOf(StateUsage)) implies<br>    specializesFromLibrary("States::State::stateTransitions")<br>specializesFromLibrary('Actions::transitionActions')<br>source =<br>    if ownedMembership->isEmpty() then null<br>    else<br>        let member : Element = <br>            ownedMembership->at(1).memberElement in <br>        if not member.oclIsKindOf(ActionUsage) then null<br>        else member.oclAsKindOf(ActionUsage)<br>        endif<br>    endif<br>target =<br>    if succession.targetFeature->isEmpty() then null<br>    else<br>        let targetFeature : Feature = <br>            succession.targetFeature->at(1) in<br>        if not targetFeature.oclIsKindOf(ActionUsage) then null<br>        else targetFeature.oclAsType(ActionUsage)<br>        endif<br>    endif<br>triggerAction = ownedFeatureMembership-><br>    selectByKind(TransitionFeatureMembership)-><br>    select(kind = TransitionFeatureKind::trigger).transitionFeature-><br>    selectByKind(AcceptActionUsage)<br>let successions : Sequence(Successions) = <br>    ownedMember->selectByKind(Succession) in<br>successions->notEmpty() and<br>successions->at(1).targetFeature-><br>    forAll(oclIsKindOf(ActionUsage))<br>guardExpression = ownedFeatureMembership-><br>    selectByKind(TransitionFeatureMembership)-><br>    select(kind = TransitionFeatureKind::trigger).transitionFeature-><br>    selectByKind(Expression)<br>triggerAction->forAll(specializesFromLibrary('Actions::TransitionAction::accepter') and<br>guardExpression->forAll(specializesFromLibrary('Actions::TransitionAction::guard') and<br>effectAction->forAll(specializesFromLibrary('Actions::TransitionAction::effect'))<br>triggerAction = ownedFeatureMembership-><br>    selectByKind(TransitionFeatureMembership)-><br>    select(kind = TransitionFeatureKind::trigger).transitionFeatures-><br>    selectByKind(AcceptActionUsage)<br>succession.sourceFeature = source<br>ownedMember->selectByKind(BindingConnector)->exists(b |<br>    b.relatedFeatures->includes(source) and<br>    b.relatedFeatures->includes(inputParameter(1)))<br>triggerAction->notEmpty() implies<br>    let payloadParameter : Feature = inputParameter(2) in<br>    payloadParameter <> null and<br>    payloadParameter.subsetsChain(triggerAction->at(1), triggerPayloadParameter())<br>ownedMember->selectByKind(BindingConnector)->exists(b |<br>    b.relatedFeatures->includes(succession) and<br>    b.relatedFeatures->includes(resolveGlobal(<br>        'TransitionPerformances::TransitionPerformance::transitionLink')))<br>if triggerAction->isEmpty() then<br>    inputParameters()->size() >= 1<br>else<br>    inputParameters()->size() >= 2<br>endif<br>    <br>succession = ownedMember->selectByKind(Succession)->at(1)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:transitionUsageSource](https://www.omg.org/spec/SysML/20230201/vocab#transitionUsageSource)| [1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The source <code>ActionUsage</code> of this <code>TransitionUsage</code>, which becomes the <code>source</code> of the <code>succession</code> for the <code>TransitionUsage</code>.</p>| <p>The source <code>ActionUsage</code> of this <code>TransitionUsage</code>, which becomes the <code>source</code> of the <code>succession</code> for the <code>TransitionUsage</code>.</p>|
| [sysml_vocab:transitionUsageTarget](https://www.omg.org/spec/SysML/20230201/vocab#transitionUsageTarget)| [1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The target <code>ActionUsage</code> of this <code>TransitionUsage<code>, which is the <code>targetFeature</code> of the <code>succession</code> for the <code>TransitionUsage</code>.</p>| <p>The target <code>ActionUsage</code> of this <code>TransitionUsage<code>, which is the <code>targetFeature</code> of the <code>succession</code> for the <code>TransitionUsage</code>.</p>|
| [sysml_vocab:transitionUsageTriggerAction](https://www.omg.org/spec/SysML/20230201/vocab#transitionUsageTriggerAction)| [0..*]| [sysml_vocab:AcceptActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#AcceptActionUsage)| <p>The <code>AcceptActionUsages</code> that define the triggers of this <code>TransitionUsage</code>, which are the <code>ownedFeatures</code> of the <code>TransitionUsage</code> related to it by <code>TransitionFeatureMemberships</code> with <code>kind = trigger</code>, which must all be <code>AcceptActionUsages</code>.</p>| <p>The <code>AcceptActionUsages</code> that define the triggers of this <code>TransitionUsage</code>, which are the <code>ownedFeatures</code> of the <code>TransitionUsage</code> related to it by <code>TransitionFeatureMemberships</code> with <code>kind = trigger</code>, which must all be <code>AcceptActionUsages</code>.</p>|
| [sysml_vocab:transitionUsageGuardExpression](https://www.omg.org/spec/SysML/20230201/vocab#transitionUsageGuardExpression)| [0..*]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>Expressions</code> that define the guards of this <code>TransitionUsage</code>, which are the <code>ownedFeatures</code> of the <code>TransitionUsage</code> related to it by <code>TransitionFeatureMemberships</code> with <code>kind = guard</code>, which must all be <code>Expressions</code>.</p>| <p>The <code>Expressions</code> that define the guards of this <code>TransitionUsage</code>, which are the <code>ownedFeatures</code> of the <code>TransitionUsage</code> related to it by <code>TransitionFeatureMemberships</code> with <code>kind = guard</code>, which must all be <code>Expressions</code>.</p>|
| [sysml_vocab:transitionUsageEffectAction](https://www.omg.org/spec/SysML/20230201/vocab#transitionUsageEffectAction)| [0..*]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsages</code> that define the effects of this <code>TransitionUsage</code>, which are the <code>ownedFeatures</code> of the <code>TransitionUsage</code> related to it by <code>TransitionFeatureMemberships</code> with <code>kind = effect</code>, which must all be <code>ActionUsages</code>.</p>| <p>The <code>ActionUsages</code> that define the effects of this <code>TransitionUsage</code>, which are the <code>ownedFeatures</code> of the <code>TransitionUsage</code> related to it by <code>TransitionFeatureMemberships</code> with <code>kind = effect</code>, which must all be <code>ActionUsages</code>.</p>|
| [sysml_vocab:transitionUsageSuccession](https://www.omg.org/spec/SysML/20230201/vocab#transitionUsageSuccession)| [1]| [sysml_vocab:Succession](https://www.omg.org/spec/SysML/20230201/vocab#Succession)| <p>The <code>Succession</code> that is the <code>ownedFeature</code> of this <code>TransitionUsage</code>, which, if the <code>TransitionUsage</code> is triggered, asserts the temporal ordering of the <code>source</code> and <code>target</code>.</p>| <p>The <code>Succession</code> that is the <code>ownedFeature</code> of this <code>TransitionUsage</code>, which, if the <code>TransitionUsage</code> is triggered, asserts the temporal ordering of the <code>source</code> and <code>target</code>.</p>|



### UseCaseDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#UseCaseDefinition

type: Shape

target class: [sysml_vocab:UseCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#UseCaseDefinition)

definition of vocabulary class : <p>A <code>UseCaseDefinition</code> is a <code>CaseDefinition</code> that specifies a set of actions performed by its subject, in interaction with one or more actors external to the subject. The objective is to yield an observable result that is of value to one or more of the actors.</p><br><br>includedUseCase = ownedUseCase-><br>    selectByKind(IncludeUseCaseUsage).<br>    useCaseIncluded<br>specializesFromLibrary('UseCases::UseCase')

description: <p>A <code>UseCaseDefinition</code> is a <code>CaseDefinition</code> that specifies a set of actions performed by its subject, in interaction with one or more actors external to the subject. The objective is to yield an observable result that is of value to one or more of the actors.</p><br><br>includedUseCase = ownedUseCase-><br>    selectByKind(IncludeUseCaseUsage).<br>    useCaseIncluded<br>specializesFromLibrary('UseCases::UseCase')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:useCaseDefinitionIncludedUseCase](https://www.omg.org/spec/SysML/20230201/vocab#useCaseDefinitionIncludedUseCase)| [0..*]| [sysml_vocab:UseCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#UseCaseUsage)| <p>The <code>UseCaseUsages</code> that are included by this <code>UseCaseDefinition</code>, which are the <code>useCaseIncludeds</code> of the <code>IncludeUseCaseUsages</code> owned by this <code>UseCaseDefinition<code>.</p>| <p>The <code>UseCaseUsages</code> that are included by this <code>UseCaseDefinition</code>, which are the <code>useCaseIncludeds</code> of the <code>IncludeUseCaseUsages</code> owned by this <code>UseCaseDefinition<code>.</p>|



### ViewpointUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ViewpointUsage

type: Shape

target class: [sysml_vocab:ViewpointUsage](https://www.omg.org/spec/SysML/20230201/vocab#ViewpointUsage)

definition of vocabulary class : <p>A <code>ViewpointUsage</code> is a <code>Usage</code> of a <code>ViewpointDefinition</code>.</p><br><br><br>viewpointStakeholder = framedConcern.featureMemberhsip-><br>    selectByKind(StakeholderMembership).<br>    ownedStakeholderParameter<br>specializesFromLibrary('Views::viewpoints')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(ViewDefinition) or<br> owningType.oclIsKindOf(ViewUsage)) implies<br>    specializesFromLibrary('Views::View::viewpointSatisfactions')

description: <p>A <code>ViewpointUsage</code> is a <code>Usage</code> of a <code>ViewpointDefinition</code>.</p><br><br><br>viewpointStakeholder = framedConcern.featureMemberhsip-><br>    selectByKind(StakeholderMembership).<br>    ownedStakeholderParameter<br>specializesFromLibrary('Views::viewpoints')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(ViewDefinition) or<br> owningType.oclIsKindOf(ViewUsage)) implies<br>    specializesFromLibrary('Views::View::viewpointSatisfactions')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:viewpointUsageViewpointDefinition](https://www.omg.org/spec/SysML/20230201/vocab#viewpointUsageViewpointDefinition)| [0..1]| [sysml_vocab:ViewpointDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ViewpointDefinition)| <p>The <code>ViewpointDefinition</code> that is the <code>definition</code> of this <code>ViewpointUsage<code>.</p>| <p>The <code>ViewpointDefinition</code> that is the <code>definition</code> of this <code>ViewpointUsage<code>.</p>|
| [sysml_vocab:viewpointUsageViewpointStakeholder](https://www.omg.org/spec/SysML/20230201/vocab#viewpointUsageViewpointStakeholder)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The <code>PartUsages</code> that identify the stakeholders with concerns framed by this <code>ViewpointUsage</code>, which are the owned and inherited <code>stakeholderParameters</code> of the <code>framedConcerns</code> of this <code>ViewpointUsage</code>.</p>| <p>The <code>PartUsages</code> that identify the stakeholders with concerns framed by this <code>ViewpointUsage</code>, which are the owned and inherited <code>stakeholderParameters</code> of the <code>framedConcerns</code> of this <code>ViewpointUsage</code>.</p>|



### CollectExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#CollectExpression

type: Shape

target class: [sysml_vocab:CollectExpression](https://www.omg.org/spec/SysML/20230201/vocab#CollectExpression)

definition of vocabulary class : <p>A <code>CollectExpression</code> is an <code>OperatorExpression</code> whose <code>operator</code> is <code>"collect"</code>, which resolves to the <code>Function</code> <em><code>ControlFunctions::collect</code></em> from the Kernel Functions Library.</p><br>operator = "collect"

description: <p>A <code>CollectExpression</code> is an <code>OperatorExpression</code> whose <code>operator</code> is <code>"collect"</code>, which resolves to the <code>Function</code> <em><code>ControlFunctions::collect</code></em> from the Kernel Functions Library.</p><br>operator = "collect"

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### FeatureMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#FeatureMembership

type: Shape

target class: [sysml_vocab:FeatureMembership](https://www.omg.org/spec/SysML/20230201/vocab#FeatureMembership)

definition of vocabulary class : <p>A <code>FeatureMembership</code> is an <code>OwningMembership</code> between a <code>Feature</code> in an <code>owningType</code> that is also a <code>Featuring</code> <code>Relationship<code> between the <code>Feature</code> and the <code>Type</code>, in which the <code>featuringType</code> is the <code>source</code> and the <code>featureOfType</code> is the <code>target</code>. A <code>FeatureMembership</code> is always owned by its <code>owningType</code>, which is the <code>featuringType</code> for the <code>FeatureMembership</code> considered as a <code>Featuring</code>.</p><br>

description: <p>A <code>FeatureMembership</code> is an <code>OwningMembership</code> between a <code>Feature</code> in an <code>owningType</code> that is also a <code>Featuring</code> <code>Relationship<code> between the <code>Feature</code> and the <code>Type</code>, in which the <code>featuringType</code> is the <code>source</code> and the <code>featureOfType</code> is the <code>target</code>. A <code>FeatureMembership</code> is always owned by its <code>owningType</code>, which is the <code>featuringType</code> for the <code>FeatureMembership</code> considered as a <code>Featuring</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:featureMembershipOwnedMemberFeature](https://www.omg.org/spec/SysML/20230201/vocab#featureMembershipOwnedMemberFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that this <code>FeatureMembership</code> relates to its <code>owningType</code>, making it an <code>ownedFeature</code> of the <code>owningType</code>.</p><br>| <p>The <code>Feature</code> that this <code>FeatureMembership</code> relates to its <code>owningType</code>, making it an <code>ownedFeature</code> of the <code>owningType</code>.</p><br>|
| [sysml_vocab:featureMembershipOwningType](https://www.omg.org/spec/SysML/20230201/vocab#featureMembershipOwningType)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The <code>Type</code> that owns this <code>FeatureMembership</code>.</p><br>| <p>The <code>Type</code> that owns this <code>FeatureMembership</code>.</p><br>|



### ReferenceSubsetting

URI: https://www.omg.org/spec/SysML/20230201/shapes#ReferenceSubsetting

type: Shape

target class: [sysml_vocab:ReferenceSubsetting](https://www.omg.org/spec/SysML/20230201/vocab#ReferenceSubsetting)

definition of vocabulary class : <p><code>ReferenceSubsetting</code> is a kind of <code>Subsetting</code> in which the <code>referencedFeature</code> is syntactically distinguished from other <code>Features</code> subsetted by the <code>referencingFeature</code>. <code>ReferenceSubsetting</code> has the same semantics as <code>Subsetting</code>, but the <code>referenceFeature</code> may have a special purpose relative to the <code>referencingFeature</code>. For instance, <code>ReferenceSubsetting</code> is used to identify the <code>relatedFeatures</code> of a <code>Connector</code>.</p><br><br><p><code>ReferenceSubsetting</code> is always an <code>ownedRelationship</code> of its <code>referencingFeature</code>. A <code>Feature</code> can have at most one <code>ownedReferenceSubsetting</code>.</p><br>

description: <p><code>ReferenceSubsetting</code> is a kind of <code>Subsetting</code> in which the <code>referencedFeature</code> is syntactically distinguished from other <code>Features</code> subsetted by the <code>referencingFeature</code>. <code>ReferenceSubsetting</code> has the same semantics as <code>Subsetting</code>, but the <code>referenceFeature</code> may have a special purpose relative to the <code>referencingFeature</code>. For instance, <code>ReferenceSubsetting</code> is used to identify the <code>relatedFeatures</code> of a <code>Connector</code>.</p><br><br><p><code>ReferenceSubsetting</code> is always an <code>ownedRelationship</code> of its <code>referencingFeature</code>. A <code>Feature</code> can have at most one <code>ownedReferenceSubsetting</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:referenceSubsettingReferencedFeature](https://www.omg.org/spec/SysML/20230201/vocab#referenceSubsettingReferencedFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is referenced by the <code>referencingFeature</code> of this <code>ReferenceSubsetting</code>.</p><br>| <p>The <code>Feature</code> that is referenced by the <code>referencingFeature</code> of this <code>ReferenceSubsetting</code>.</p><br>|
| [sysml_vocab:referenceSubsettingReferencingFeature](https://www.omg.org/spec/SysML/20230201/vocab#referenceSubsettingReferencingFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that owns this <code>ReferenceSubsetting</code> relationship, which is also its <code>subsettingFeature</code>.</p><br>| <p>The <code>Feature</code> that owns this <code>ReferenceSubsetting</code> relationship, which is also its <code>subsettingFeature</code>.</p><br>|



### NamespaceImport

URI: https://www.omg.org/spec/SysML/20230201/shapes#NamespaceImport

type: Shape

target class: [sysml_vocab:NamespaceImport](https://www.omg.org/spec/SysML/20230201/vocab#NamespaceImport)

definition of vocabulary class : <p>A <code>NamespaceImport</code> is an Import that imports <code>Memberships</code> from its <code>importedNamespace</code> into the <code>importOwningNamespace</code>. If <code> isRecursive = false</code>, then only the visible <code>Memberships</code> of the <code>importedNamespace</code> are imported. If <code> isRecursive = true</code>, then, in addition, <code>Memberships</code> are recursively imported from any <code>ownedMembers</code> of the <code>importedNamespace</code> that are <code>Namespaces</code>.</p><br><br>importedElement = importedNamespace

description: <p>A <code>NamespaceImport</code> is an Import that imports <code>Memberships</code> from its <code>importedNamespace</code> into the <code>importOwningNamespace</code>. If <code> isRecursive = false</code>, then only the visible <code>Memberships</code> of the <code>importedNamespace</code> are imported. If <code> isRecursive = true</code>, then, in addition, <code>Memberships</code> are recursively imported from any <code>ownedMembers</code> of the <code>importedNamespace</code> that are <code>Namespaces</code>.</p><br><br>importedElement = importedNamespace

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:namespaceImportImportedNamespace](https://www.omg.org/spec/SysML/20230201/vocab#namespaceImportImportedNamespace)| [1]| [sysml_vocab:Namespace](https://www.omg.org/spec/SysML/20230201/vocab#Namespace)| <p>The <code>Namespace</code> whose visible <code>Memberships</code> are imported by this <code>NamespaceImport</code>.</p><br>| <p>The <code>Namespace</code> whose visible <code>Memberships</code> are imported by this <code>NamespaceImport</code>.</p><br>|



### ReferenceUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ReferenceUsage

type: Shape

target class: [sysml_vocab:ReferenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#ReferenceUsage)

definition of vocabulary class : <p>A <code>ReferenceUsage</code> is a <code>Usage</code> that specifies a non-compositional (<code>isComposite = false</code>) reference to something. The <code>definition</code> of a <code>ReferenceUsage</code> can be any kind of <code>Classifier</code>, with the default being the top-level <code>Classifier</code> <code><em>Base::Anything</em></code> from the Kernel Semantic Library. This allows the specification of a generic reference without distinguishing if the thing referenced is an attribute value, item, action, etc.</p><br>isReference

description: <p>A <code>ReferenceUsage</code> is a <code>Usage</code> that specifies a non-compositional (<code>isComposite = false</code>) reference to something. The <code>definition</code> of a <code>ReferenceUsage</code> can be any kind of <code>Classifier</code>, with the default being the top-level <code>Classifier</code> <code><em>Base::Anything</em></code> from the Kernel Semantic Library. This allows the specification of a generic reference without distinguishing if the thing referenced is an attribute value, item, action, etc.</p><br>isReference

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Predicate

URI: https://www.omg.org/spec/SysML/20230201/shapes#Predicate

type: Shape

target class: [sysml_vocab:Predicate](https://www.omg.org/spec/SysML/20230201/vocab#Predicate)

definition of vocabulary class : <p>A <code>Predicate</code> is a <code>Function</code> whose <code>result</code> <code>parameter</code> has type <code><em>Boolean</em></code> and multiplicity <code>1..1</code>.</p><br><br>specializesFromLibrary('Performances::BooleanEvaluation')

description: <p>A <code>Predicate</code> is a <code>Function</code> whose <code>result</code> <code>parameter</code> has type <code><em>Boolean</em></code> and multiplicity <code>1..1</code>.</p><br><br>specializesFromLibrary('Performances::BooleanEvaluation')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### ElementFilterMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#ElementFilterMembership

type: Shape

target class: [sysml_vocab:ElementFilterMembership](https://www.omg.org/spec/SysML/20230201/vocab#ElementFilterMembership)

definition of vocabulary class : <p><code>ElementFilterMembership</code> is a <code>Membership</code> between a <code>Namespace</code> and a model-level evaluable <code><em>Boolean</em></code>-valued <code>Expression</code>, asserting that imported <code>members</code> of the <code>Namespace</code> should be filtered using the <code>condition</code> <code>Expression</code>. A general <code>Namespace</code> does not define any specific filtering behavior, but such behavior may be defined for various specialized kinds of <code>Namespaces</code>.</p><br><br>condition.isModelLevelEvaluable<br>condition.result.specializesFromLibrary('ScalarValues::Boolean')

description: <p><code>ElementFilterMembership</code> is a <code>Membership</code> between a <code>Namespace</code> and a model-level evaluable <code><em>Boolean</em></code>-valued <code>Expression</code>, asserting that imported <code>members</code> of the <code>Namespace</code> should be filtered using the <code>condition</code> <code>Expression</code>. A general <code>Namespace</code> does not define any specific filtering behavior, but such behavior may be defined for various specialized kinds of <code>Namespaces</code>.</p><br><br>condition.isModelLevelEvaluable<br>condition.result.specializesFromLibrary('ScalarValues::Boolean')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:elementFilterMembershipCondition](https://www.omg.org/spec/SysML/20230201/vocab#elementFilterMembershipCondition)| [1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The model-level evaluable <code>Boolean</code>-valued <code>Expression</code> used to filter the imported <code>members</code> of the <code>membershipOwningNamespace</code> of this <code>ElementFilterMembership</code>.</p><br>| <p>The model-level evaluable <code>Boolean</code>-valued <code>Expression</code> used to filter the imported <code>members</code> of the <code>membershipOwningNamespace</code> of this <code>ElementFilterMembership</code>.</p><br>|



### TypeFeaturing

URI: https://www.omg.org/spec/SysML/20230201/shapes#TypeFeaturing

type: Shape

target class: [sysml_vocab:TypeFeaturing](https://www.omg.org/spec/SysML/20230201/vocab#TypeFeaturing)

definition of vocabulary class : <p>A <code>TypeFeaturing</code> is a <code>Featuring</code> <code>Relationship</code> in which the <code>featureOfType</code> is the <code>source</code> and the <code>featuringType</code> is the <code>target</code>.</p>

description: <p>A <code>TypeFeaturing</code> is a <code>Featuring</code> <code>Relationship</code> in which the <code>featureOfType</code> is the <code>source</code> and the <code>featuringType</code> is the <code>target</code>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:typeFeaturingFeatureOfType](https://www.omg.org/spec/SysML/20230201/vocab#typeFeaturingFeatureOfType)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is featured by the <code>featuringType</code>. It is the <code>source</code> of the <code>TypeFeaturing</code>.</p>| <p>The <code>Feature</code> that is featured by the <code>featuringType</code>. It is the <code>source</code> of the <code>TypeFeaturing</code>.</p>|
| [sysml_vocab:typeFeaturingFeaturingType](https://www.omg.org/spec/SysML/20230201/vocab#typeFeaturingFeaturingType)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The <code>Type</code> that features the <code>featureOfType</code>. It is the <code>target</code> of the <code>TypeFeaturing</code>.</p>| <p>The <code>Type</code> that features the <code>featureOfType</code>. It is the <code>target</code> of the <code>TypeFeaturing</code>.</p>|
| [sysml_vocab:typeFeaturingOwningFeatureOfType](https://www.omg.org/spec/SysML/20230201/vocab#typeFeaturingOwningFeatureOfType)| [0..1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>A <code>featureOfType</code> that is also the <code>owningRelatedElement</code> of this <code>TypeFeaturing</code>.</p>| <p>A <code>featureOfType</code> that is also the <code>owningRelatedElement</code> of this <code>TypeFeaturing</code>.</p>|



### Definition

URI: https://www.omg.org/spec/SysML/20230201/shapes#Definition

type: Shape

target class: [sysml_vocab:Definition](https://www.omg.org/spec/SysML/20230201/vocab#Definition)

definition of vocabulary class : <p>A <code>Definition</code> is a <code>Classifier</code> of <code>Usages</code>. The actual kinds of <code>Definition</code> that may appear in a model are given by the subclasses of <code>Definition</code> (possibly as extended with user-defined <em><code>SemanticMetadata</code></em>).</p><br><br><p>Normally, a <code>Definition</code> has owned Usages that model <code>features</code> of the thing being defined. A <code>Definition</code> may also have other <code>Definitions</code> nested in it, but this has no semantic significance, other than the nested scoping resulting from the <code>Definition</code> being considered as a <code>Namespace</code> for any nested <code>Definitions</code>.</p><br><br><p>However, if a <code>Definition</code> has <code>isVariation</code> = <code>true</code>, then it represents a <em>variation point</em> <code>Definition</code>. In this case, all of its <code>members</code> must be <code>variant</code> <code>Usages</code>, related to the <code>Definition</code> by <code>VariantMembership</code> <code>Relationships</code>. Rather than being <code>features</code> of the <code>Definition</code>, <code>variant</code> <code>Usages</code> model different concrete alternatives that can be chosen to fill in for an abstract <code>Usage</code> of the variation point <code>Definition</code>.</p><br><br>isVariation implies ownedFeatureMembership->isEmpty()<br>variant = variantMembership.ownedVariantUsage<br>variantMembership = ownedMembership->selectByKind(VariantMembership)<br>isVariation implies<br>    not ownedSpecialization.specific->exists(<br>        oclIsKindOf(Definition) and<br>        oclAsType(Definition).isVariation)<br>usage = feature->selectByKind(Usage)<br>directedUsage = directedFeature->selectByKind(Usage)<br>ownedUsage = ownedFeature->selectByKind(Usage)<br>ownedAttribute = ownedUsage->selectByKind(AttributeUsage)<br>ownedReference = ownedUsage->selectByKind(ReferenceUsage)<br>ownedEnumeration = ownedUsage->selectByKind(EnumerationUsage)<br>ownedOccurrence = ownedUsage->selectByKind(OccurrenceUsage)<br>ownedItem = ownedUsage->selectByKind(ItemUsage)<br>ownedPart = ownedUsage->selectByKind(PartUsage)<br>ownedPort = ownedUsage->selectByKind(PortUsage)<br>ownedConnection = ownedUsage->selectByKind(ConnectorAsUsage)<br>ownedFlow = ownedUsage->selectByKind(FlowConnectionUsage)<br>ownedInterface = ownedUsage->selectByKind(ReferenceUsage)<br>ownedAllocation = ownedUsage->selectByKind(AllocationUsage)<br>ownedAction = ownedUsage->selectByKind(ActionUsage)<br>ownedState = ownedUsage->selectByKind(StateUsage)<br>ownedTransition = ownedUsage->selectByKind(TransitionUsage)<br>ownedCalculation = ownedUsage->selectByKind(CalculationUsage)<br>ownedConstraint = ownedUsage->selectByKind(ConstraintUsage)<br>ownedRequirement = ownedUsage->selectByKind(RequirementUsage)<br>ownedConcern = ownedUsage->selectByKind(ConcernUsage)<br>ownedCase = ownedUsage->selectByKind(CaseUsage)<br>ownedAnalysisCase = ownedUsage->selectByKind(AnalysisCaseUsage)<br>ownedVerificationCase = ownedUsage->selectByKind(VerificationCaseUsage)<br>ownedUseCase = ownedUsage->selectByKind(UseCaseUsage)<br>ownedView = ownedUsage->selectByKind(ViewUsage)<br>ownedViewpoint = ownedUsage->selectByKind(ViewpointUsage)<br>ownedRendering = ownedUsage->selectByKind(RenderingUsage)<br>ownedMetadata = ownedUsage->selectByKind(MetadataUsage)<br>isVariation implies isAbstract

description: <p>A <code>Definition</code> is a <code>Classifier</code> of <code>Usages</code>. The actual kinds of <code>Definition</code> that may appear in a model are given by the subclasses of <code>Definition</code> (possibly as extended with user-defined <em><code>SemanticMetadata</code></em>).</p><br><br><p>Normally, a <code>Definition</code> has owned Usages that model <code>features</code> of the thing being defined. A <code>Definition</code> may also have other <code>Definitions</code> nested in it, but this has no semantic significance, other than the nested scoping resulting from the <code>Definition</code> being considered as a <code>Namespace</code> for any nested <code>Definitions</code>.</p><br><br><p>However, if a <code>Definition</code> has <code>isVariation</code> = <code>true</code>, then it represents a <em>variation point</em> <code>Definition</code>. In this case, all of its <code>members</code> must be <code>variant</code> <code>Usages</code>, related to the <code>Definition</code> by <code>VariantMembership</code> <code>Relationships</code>. Rather than being <code>features</code> of the <code>Definition</code>, <code>variant</code> <code>Usages</code> model different concrete alternatives that can be chosen to fill in for an abstract <code>Usage</code> of the variation point <code>Definition</code>.</p><br><br>isVariation implies ownedFeatureMembership->isEmpty()<br>variant = variantMembership.ownedVariantUsage<br>variantMembership = ownedMembership->selectByKind(VariantMembership)<br>isVariation implies<br>    not ownedSpecialization.specific->exists(<br>        oclIsKindOf(Definition) and<br>        oclAsType(Definition).isVariation)<br>usage = feature->selectByKind(Usage)<br>directedUsage = directedFeature->selectByKind(Usage)<br>ownedUsage = ownedFeature->selectByKind(Usage)<br>ownedAttribute = ownedUsage->selectByKind(AttributeUsage)<br>ownedReference = ownedUsage->selectByKind(ReferenceUsage)<br>ownedEnumeration = ownedUsage->selectByKind(EnumerationUsage)<br>ownedOccurrence = ownedUsage->selectByKind(OccurrenceUsage)<br>ownedItem = ownedUsage->selectByKind(ItemUsage)<br>ownedPart = ownedUsage->selectByKind(PartUsage)<br>ownedPort = ownedUsage->selectByKind(PortUsage)<br>ownedConnection = ownedUsage->selectByKind(ConnectorAsUsage)<br>ownedFlow = ownedUsage->selectByKind(FlowConnectionUsage)<br>ownedInterface = ownedUsage->selectByKind(ReferenceUsage)<br>ownedAllocation = ownedUsage->selectByKind(AllocationUsage)<br>ownedAction = ownedUsage->selectByKind(ActionUsage)<br>ownedState = ownedUsage->selectByKind(StateUsage)<br>ownedTransition = ownedUsage->selectByKind(TransitionUsage)<br>ownedCalculation = ownedUsage->selectByKind(CalculationUsage)<br>ownedConstraint = ownedUsage->selectByKind(ConstraintUsage)<br>ownedRequirement = ownedUsage->selectByKind(RequirementUsage)<br>ownedConcern = ownedUsage->selectByKind(ConcernUsage)<br>ownedCase = ownedUsage->selectByKind(CaseUsage)<br>ownedAnalysisCase = ownedUsage->selectByKind(AnalysisCaseUsage)<br>ownedVerificationCase = ownedUsage->selectByKind(VerificationCaseUsage)<br>ownedUseCase = ownedUsage->selectByKind(UseCaseUsage)<br>ownedView = ownedUsage->selectByKind(ViewUsage)<br>ownedViewpoint = ownedUsage->selectByKind(ViewpointUsage)<br>ownedRendering = ownedUsage->selectByKind(RenderingUsage)<br>ownedMetadata = ownedUsage->selectByKind(MetadataUsage)<br>isVariation implies isAbstract

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:definitionIsVariation](https://www.omg.org/spec/SysML/20230201/vocab#definitionIsVariation)| [1]| Boolean| <p>Whether this <code>Definition</code> is for a variation point or not. If true, then all the <code>memberships</code> of the <code>Definition</code> must be <code>VariantMemberships</code>.</p>| <p>Whether this <code>Definition</code> is for a variation point or not. If true, then all the <code>memberships</code> of the <code>Definition</code> must be <code>VariantMemberships</code>.</p>|
| [sysml_vocab:definitionVariant](https://www.omg.org/spec/SysML/20230201/vocab#definitionVariant)| [0..*]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>Usages</code> which represent the variants of this <code>Definition</code> as a variation point <code>Definition</code>, if <code>isVariation</code> = true. If <code>isVariation = false</code>, the there must be no <code>variants</code>.</p>| <p>The <code>Usages</code> which represent the variants of this <code>Definition</code> as a variation point <code>Definition</code>, if <code>isVariation</code> = true. If <code>isVariation = false</code>, the there must be no <code>variants</code>.</p>|
| [sysml_vocab:definitionOwnedUsage](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedUsage)| [0..*]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>Usages</code> that are <code>ownedFeatures</code> of this <code>Definition</code>.</p>| <p>The <code>Usages</code> that are <code>ownedFeatures</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionVariantMembership](https://www.omg.org/spec/SysML/20230201/vocab#definitionVariantMembership)| [0..*]| [sysml_vocab:VariantMembership](https://www.omg.org/spec/SysML/20230201/vocab#VariantMembership)| <p>The <code>ownedMemberships</code> of this <code>Definition</code> that are <code>VariantMemberships</code>. If <code>isVariation</code> = true, then this must be all <code>ownedMemberships</code> of the <code>Definition</code>. If <code>isVariation</code> = false, then <code>variantMembership</code>must be empty.</p>| <p>The <code>ownedMemberships</code> of this <code>Definition</code> that are <code>VariantMemberships</code>. If <code>isVariation</code> = true, then this must be all <code>ownedMemberships</code> of the <code>Definition</code>. If <code>isVariation</code> = false, then <code>variantMembership</code>must be empty.</p>|
| [sysml_vocab:definitionUsage](https://www.omg.org/spec/SysML/20230201/vocab#definitionUsage)| [0..*]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>Usages</code> that are <code>features</code> of this <code>Definition</code> (not necessarily owned).</p>| <p>The <code>Usages</code> that are <code>features</code> of this <code>Definition</code> (not necessarily owned).</p>|
| [sysml_vocab:definitionDirectedUsage](https://www.omg.org/spec/SysML/20230201/vocab#definitionDirectedUsage)| [0..*]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>usages</code> of this <code>Definition</code> that are <code>directedFeatures</code>.</p><br>| <p>The <code>usages</code> of this <code>Definition</code> that are <code>directedFeatures</code>.</p><br>|
| [sysml_vocab:definitionOwnedReference](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedReference)| [0..*]| [sysml_vocab:ReferenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#ReferenceUsage)| <p>The <code>ReferenceUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>ReferenceUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedAttribute](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedAttribute)| [0..*]| [sysml_vocab:AttributeUsage](https://www.omg.org/spec/SysML/20230201/vocab#AttributeUsage)| <p>The <code>AttributeUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.<p>| <p>The <code>AttributeUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.<p>|
| [sysml_vocab:definitionOwnedEnumeration](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedEnumeration)| [0..*]| [sysml_vocab:EnumerationUsage](https://www.omg.org/spec/SysML/20230201/vocab#EnumerationUsage)| <p>The <code>EnumerationUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.<p>| <p>The <code>EnumerationUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.<p>|
| [sysml_vocab:definitionOwnedOccurrence](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedOccurrence)| [0..*]| [sysml_vocab:OccurrenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#OccurrenceUsage)| <p>The <code>OccurrenceUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>OccurrenceUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedItem](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedItem)| [0..*]| [sysml_vocab:ItemUsage](https://www.omg.org/spec/SysML/20230201/vocab#ItemUsage)| <p>The <code>ItemUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>ItemUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedPart](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedPart)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The <code>PartUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>PartUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedPort](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedPort)| [0..*]| [sysml_vocab:PortUsage](https://www.omg.org/spec/SysML/20230201/vocab#PortUsage)| <p>The <code>PortUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>PortUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedConnection](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedConnection)| [0..*]| [sysml_vocab:ConnectorAsUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConnectorAsUsage)| <p>The <code>ConnectorAsUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>. Note that this list includes <code>BindingConnectorAsUsages</code> and <code>SuccessionAsUsages</code>, even though these are <code>ConnectorAsUsages</code> but not <code>ConnectionUsages</code>.</p>| <p>The <code>ConnectorAsUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>. Note that this list includes <code>BindingConnectorAsUsages</code> and <code>SuccessionAsUsages</code>, even though these are <code>ConnectorAsUsages</code> but not <code>ConnectionUsages</code>.</p>|
| [sysml_vocab:definitionOwnedFlow](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedFlow)| [0..*]| [sysml_vocab:FlowConnectionUsage](https://www.omg.org/spec/SysML/20230201/vocab#FlowConnectionUsage)| <p>The <code>FlowConnectionUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>FlowConnectionUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedInterface](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedInterface)| [0..*]| [sysml_vocab:InterfaceUsage](https://www.omg.org/spec/SysML/20230201/vocab#InterfaceUsage)| <p>The <code>InterfaceUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>InterfaceUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedAllocation](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedAllocation)| [0..*]| [sysml_vocab:AllocationUsage](https://www.omg.org/spec/SysML/20230201/vocab#AllocationUsage)| <p>The <code>AllocationUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>AllocationUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedAction](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedAction)| [0..*]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>ActionUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedState](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedState)| [0..*]| [sysml_vocab:StateUsage](https://www.omg.org/spec/SysML/20230201/vocab#StateUsage)| <p>The <code>StateUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>StateUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedTransition](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedTransition)| [0..*]| [sysml_vocab:TransitionUsage](https://www.omg.org/spec/SysML/20230201/vocab#TransitionUsage)| <p>The <code>TransitionUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>TransitionUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedCalculation](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedCalculation)| [0..*]| [sysml_vocab:CalculationUsage](https://www.omg.org/spec/SysML/20230201/vocab#CalculationUsage)| <p>The <code>CalculationUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>CalculationUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedConstraint](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedConstraint)| [0..*]| [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)| <p>The <code>ConstraintUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p> <br>| <p>The <code>ConstraintUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p> <br>|
| [sysml_vocab:definitionOwnedRequirement](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedRequirement)| [0..*]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The <code>RequirementUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>RequirementUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedConcern](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedConcern)| [0..*]| [sysml_vocab:ConcernUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConcernUsage)| <p>The <code>ConcernUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>ConcernUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedCase](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedCase)| [0..*]| [sysml_vocab:CaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#CaseUsage)| <p>The code>CaseUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The code>CaseUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedAnalysisCase](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedAnalysisCase)| [0..*]| [sysml_vocab:AnalysisCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#AnalysisCaseUsage)| <p>The <code>AnalysisCaseUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>AnalysisCaseUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedVerificationCase](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedVerificationCase)| [0..*]| [sysml_vocab:VerificationCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#VerificationCaseUsage)| <p>The <code>VerificationCaseUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>VerificationCaseUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedUseCase](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedUseCase)| [0..*]| [sysml_vocab:UseCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#UseCaseUsage)| <p>The <code>UseCaseUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>UseCaseUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedView](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedView)| [0..*]| [sysml_vocab:ViewUsage](https://www.omg.org/spec/SysML/20230201/vocab#ViewUsage)| <p>The <code>ViewUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>ViewUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedViewpoint](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedViewpoint)| [0..*]| [sysml_vocab:ViewpointUsage](https://www.omg.org/spec/SysML/20230201/vocab#ViewpointUsage)| <p>The <code>ViewpointUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>ViewpointUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedRendering](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedRendering)| [0..*]| [sysml_vocab:RenderingUsage](https://www.omg.org/spec/SysML/20230201/vocab#RenderingUsage)| <p>The <code>RenderingUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>RenderingUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|
| [sysml_vocab:definitionOwnedMetadata](https://www.omg.org/spec/SysML/20230201/vocab#definitionOwnedMetadata)| [0..*]| [sysml_vocab:MetadataUsage](https://www.omg.org/spec/SysML/20230201/vocab#MetadataUsage)| <p>The <code>MetadataUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>| <p>The <code>MetadataUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>|



### LiteralRational

URI: https://www.omg.org/spec/SysML/20230201/shapes#LiteralRational

type: Shape

target class: [sysml_vocab:LiteralRational](https://www.omg.org/spec/SysML/20230201/vocab#LiteralRational)

definition of vocabulary class : <p>A <code>LiteralRational</code> is a <code>LiteralExpression</code> that provides a <code><em>Rational</em></code> value as a result. Its <code>result</code> <code>parameter</code> must have the type <code><em>Rational</em></code>.</p><br><br>specializesFromLibrary('Performances::literalRationalEvaluations')

description: <p>A <code>LiteralRational</code> is a <code>LiteralExpression</code> that provides a <code><em>Rational</em></code> value as a result. Its <code>result</code> <code>parameter</code> must have the type <code><em>Rational</em></code>.</p><br><br>specializesFromLibrary('Performances::literalRationalEvaluations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:literalRationalValue](https://www.omg.org/spec/SysML/20230201/vocab#literalRationalValue)| [1]| Float| <p>The value whose rational approximation is the result of evaluating this <code>LiteralRational</code>.</p><br><br><p>The Real value that is the result of evaluating this Expression.</p>| <p>The value whose rational approximation is the result of evaluating this <code>LiteralRational</code>.</p><br><br><p>The Real value that is the result of evaluating this Expression.</p>|



### MergeNode

URI: https://www.omg.org/spec/SysML/20230201/shapes#MergeNode

type: Shape

target class: [sysml_vocab:MergeNode](https://www.omg.org/spec/SysML/20230201/vocab#MergeNode)

definition of vocabulary class : <p>A <code>MergeNode</code> is a <code>ControlNode</code> that asserts the merging of its incoming <code>Successions</code>. A <code>MergeNode</code> may have at most one outgoing <code>Successions</code>.</p><br>sourceConnector->selectAsKind(Succession)->size() <= 1<br>targetConnector->selectByKind(Succession)-><br>    collect(connectorEnd->at(1))-><br>    forAll(sourceMult |<br>        multiplicityHasBounds(sourceMult, 0, 1))<br>targetConnector->selectByKind(Succession)-><br>    forAll(subsetsChain(self, <br>        resolveGlobal('ControlPerformances::MergePerformance::incomingHBLink')))<br>specializesFromLibrary('Actions::Action::merges')

description: <p>A <code>MergeNode</code> is a <code>ControlNode</code> that asserts the merging of its incoming <code>Successions</code>. A <code>MergeNode</code> may have at most one outgoing <code>Successions</code>.</p><br>sourceConnector->selectAsKind(Succession)->size() <= 1<br>targetConnector->selectByKind(Succession)-><br>    collect(connectorEnd->at(1))-><br>    forAll(sourceMult |<br>        multiplicityHasBounds(sourceMult, 0, 1))<br>targetConnector->selectByKind(Succession)-><br>    forAll(subsetsChain(self, <br>        resolveGlobal('ControlPerformances::MergePerformance::incomingHBLink')))<br>specializesFromLibrary('Actions::Action::merges')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Intersecting

URI: https://www.omg.org/spec/SysML/20230201/shapes#Intersecting

type: Shape

target class: [sysml_vocab:Intersecting](https://www.omg.org/spec/SysML/20230201/vocab#Intersecting)

definition of vocabulary class : <p><code>Intersecting</code> is a <code>Relationship</code> that makes its <code>intersectingType</code> one of the <code>intersectingTypes</code> of its <code>typeIntersected</code>.</p><br>

description: <p><code>Intersecting</code> is a <code>Relationship</code> that makes its <code>intersectingType</code> one of the <code>intersectingTypes</code> of its <code>typeIntersected</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:intersectingIntersectingType](https://www.omg.org/spec/SysML/20230201/vocab#intersectingIntersectingType)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p><code>Type</code> that partly determines interpretations of <code>typeIntersected</code>, as described in <code>Type::intersectingType</code>.</p><br>| <p><code>Type</code> that partly determines interpretations of <code>typeIntersected</code>, as described in <code>Type::intersectingType</code>.</p><br>|
| [sysml_vocab:intersectingTypeIntersected](https://www.omg.org/spec/SysML/20230201/vocab#intersectingTypeIntersected)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p><code>Type</code> with interpretations partly determined by <code>intersectingType</code>, as described in <code>Type::intersectingType</code>.</p><br>| <p><code>Type</code> with interpretations partly determined by <code>intersectingType</code>, as described in <code>Type::intersectingType</code>.</p><br>|



### ForLoopActionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ForLoopActionUsage

type: Shape

target class: [sysml_vocab:ForLoopActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ForLoopActionUsage)

definition of vocabulary class : <p>A <code>ForLoopActionUsage</code> is a <code>LoopActionUsage</code> that specifies that its <code>bodyAction</code> <code>ActionUsage</code> should be performed once for each value, in order, from the sequence of values obtained as the result of the <code>seqArgument</code> <code>Expression</code>, with the <code>loopVariable</code> set to the value for each iteration.</p><br>seqArgument = argument(1)<br><br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::forLoops')<br>loopVariable <> null and<br>loopVariable.redefinesFromLibrary('Actions::ForLoopAction::var')<br>specializesFromLibrary('Actions::forLoopActions')<br>loopVariable =<br>    if ownedFeature->isEmpty() or <br>        not ownedFeature->first().oclIsKindOf(ReferenceUsage) then <br>        null<br>    else <br>        ownedFeature->first().oclAsType(ReferenceUsage)<br>    endif<br>ownedFeature->notEmpty() and<br>ownedFeature->at(1).oclIsKindOf(ReferenceUsage)<br><br>inputParameters()->size() = 2

description: <p>A <code>ForLoopActionUsage</code> is a <code>LoopActionUsage</code> that specifies that its <code>bodyAction</code> <code>ActionUsage</code> should be performed once for each value, in order, from the sequence of values obtained as the result of the <code>seqArgument</code> <code>Expression</code>, with the <code>loopVariable</code> set to the value for each iteration.</p><br>seqArgument = argument(1)<br><br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::forLoops')<br>loopVariable <> null and<br>loopVariable.redefinesFromLibrary('Actions::ForLoopAction::var')<br>specializesFromLibrary('Actions::forLoopActions')<br>loopVariable =<br>    if ownedFeature->isEmpty() or <br>        not ownedFeature->first().oclIsKindOf(ReferenceUsage) then <br>        null<br>    else <br>        ownedFeature->first().oclAsType(ReferenceUsage)<br>    endif<br>ownedFeature->notEmpty() and<br>ownedFeature->at(1).oclIsKindOf(ReferenceUsage)<br><br>inputParameters()->size() = 2

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:forLoopActionUsageSeqArgument](https://www.omg.org/spec/SysML/20230201/vocab#forLoopActionUsageSeqArgument)| [1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>Expression</code> whose result provides the sequence of values to which the <code>loopVariable</code> is set for each iterative performance of the <code>bodyAction</code>. It is the <code>Expression</code> whose <code>result</code> is bound to the <em><code>seq</code></em> <code>input</code> <code>parameter</code> of this <code>ForLoopActionUsage</code>.</p><br>| <p>The <code>Expression</code> whose result provides the sequence of values to which the <code>loopVariable</code> is set for each iterative performance of the <code>bodyAction</code>. It is the <code>Expression</code> whose <code>result</code> is bound to the <em><code>seq</code></em> <code>input</code> <code>parameter</code> of this <code>ForLoopActionUsage</code>.</p><br>|
| [sysml_vocab:forLoopActionUsageLoopVariable](https://www.omg.org/spec/SysML/20230201/vocab#forLoopActionUsageLoopVariable)| [1]| [sysml_vocab:ReferenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#ReferenceUsage)| <p>The <code>ownedFeature</code> of this <co>ForLoopActionUsage</code> that acts as the loop variable, which is assigned the successive values of the input sequence on each iteration. It is the <code>ownedFeature</code> that redefines <em><code>ForLoopAction::var</code></em>.</p> | <p>The <code>ownedFeature</code> of this <co>ForLoopActionUsage</code> that acts as the loop variable, which is assigned the successive values of the input sequence on each iteration. It is the <code>ownedFeature</code> that redefines <em><code>ForLoopAction::var</code></em>.</p> |



### ActionDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#ActionDefinition

type: Shape

target class: [sysml_vocab:ActionDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ActionDefinition)

definition of vocabulary class : <p>An <code>ActionDefinition</code> is a <code>Definition</code> that is also a <code>Behavior</code> that defines an <em><code>Action</code></em> performed by a system or part of a system.</p><br>specializesFromLibrary('Actions::Action')<br>action = usage->selectByKind(ActionUsage)

description: <p>An <code>ActionDefinition</code> is a <code>Definition</code> that is also a <code>Behavior</code> that defines an <em><code>Action</code></em> performed by a system or part of a system.</p><br>specializesFromLibrary('Actions::Action')<br>action = usage->selectByKind(ActionUsage)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:actionDefinitionAction](https://www.omg.org/spec/SysML/20230201/vocab#actionDefinitionAction)| [0..*]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsages</code> that are <code>steps</code> in this <code>ActionDefinition</code>, which define the actions that specify the behavior of the <code>ActionDefinition</code>.</p> <br>| <p>The <code>ActionUsages</code> that are <code>steps</code> in this <code>ActionDefinition</code>, which define the actions that specify the behavior of the <code>ActionDefinition</code>.</p> <br>|



### ItemDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#ItemDefinition

type: Shape

target class: [sysml_vocab:ItemDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ItemDefinition)

definition of vocabulary class : <p>An <code>ItemDefinition</code> is an <code>OccurrenceDefinition</code> of the <code>Structure</code> of things that may themselves be systems or parts of systems, but may also be things that are acted on by a system or parts of a system, but which do not necessarily perform actions themselves. This includes items that can be exchanged between parts of a system, such as water or electrical signals.</p><br><br>specializesFromLibrary('Items::Item')

description: <p>An <code>ItemDefinition</code> is an <code>OccurrenceDefinition</code> of the <code>Structure</code> of things that may themselves be systems or parts of systems, but may also be things that are acted on by a system or parts of a system, but which do not necessarily perform actions themselves. This includes items that can be exchanged between parts of a system, such as water or electrical signals.</p><br><br>specializesFromLibrary('Items::Item')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### TextualRepresentation

URI: https://www.omg.org/spec/SysML/20230201/shapes#TextualRepresentation

type: Shape

target class: [sysml_vocab:TextualRepresentation](https://www.omg.org/spec/SysML/20230201/vocab#TextualRepresentation)

definition of vocabulary class : <p>A <code>TextualRepresentation</code> is an <code>AnnotatingElement</code> whose <code>body</code> represents the <code>representedElement</code> in a given <code>language</code>. The <code>representedElement</code> must be the <code>owner</code> of the <code>TextualRepresentation</code>. The named <code>language</code> can be a natural language, in which case the <code>body</code> is an informal representation, or an artificial language, in which case the <code>body</code> is expected to be a formal, machine-parsable representation.</p><br><br><p>If the named <code>language</code> of a <code>TextualRepresentation</code> is machine-parsable, then the <code>body</code> text should be legal input text as defined for that <code>language</code>. The interpretation of the named language string shall be case insensitive. The following <code>language</code> names are defined to correspond to the given standard languages:</p><br><br><table border="1" cellpadding="1" cellspacing="1" width="498"><br>	<thead><br>	</thead><br>	<tbody><br>		<tr><br>			<td style="text-align: center; width: 154px;"><code>kerml</code></td><br>			<td style="width: 332px;">Kernel Modeling Language</td><br>		</tr><br>		<tr><br>			<td style="text-align: center; width: 154px;"><code>ocl</code></td><br>			<td style="width: 332px;">Object Constraint Language</td><br>		</tr><br>		<tr><br>			<td style="text-align: center; width: 154px;"><code>alf</code></td><br>			<td style="width: 332px;">Action Language for fUML</td><br>		</tr><br>	</tbody><br></table><br><br><p>Other specifications may define specific <code>language</code> strings, other than those shown above, to be used to indicate the use of languages from those specifications in KerML <code>TextualRepresentation</code>.</p><br><br><p>If the <code>language</code> of a <code>TextualRepresentation</code> is &quot;<code>kerml</code>&quot;, then the <code>body</code> text shall be a legal representation of the <code>representedElement</code> in the KerML textual concrete syntax. A conforming tool can use such a <code>TextualRepresentation</code> <code>Annotation</code> to record the original KerML concrete syntax text from which an <code>Element</code> was parsed. In this case, it is a tool responsibility to ensure that the <code>body</code> of the <code>TextualRepresentation</code> remains correct (or the Annotation is removed) if the annotated <code>Element</code> changes other than by re-parsing the <code>body</code> text.</p><br><br><p>An <code>Element</code> with a <code>TextualRepresentation</code> in a language other than KerML is essentially a semantically &quot;opaque&quot; <code>Element</code> specified in the other language. However, a conforming KerML tool may interpret such an element consistently with the specification of the named language.</p><br>

description: <p>A <code>TextualRepresentation</code> is an <code>AnnotatingElement</code> whose <code>body</code> represents the <code>representedElement</code> in a given <code>language</code>. The <code>representedElement</code> must be the <code>owner</code> of the <code>TextualRepresentation</code>. The named <code>language</code> can be a natural language, in which case the <code>body</code> is an informal representation, or an artificial language, in which case the <code>body</code> is expected to be a formal, machine-parsable representation.</p><br><br><p>If the named <code>language</code> of a <code>TextualRepresentation</code> is machine-parsable, then the <code>body</code> text should be legal input text as defined for that <code>language</code>. The interpretation of the named language string shall be case insensitive. The following <code>language</code> names are defined to correspond to the given standard languages:</p><br><br><table border="1" cellpadding="1" cellspacing="1" width="498"><br>	<thead><br>	</thead><br>	<tbody><br>		<tr><br>			<td style="text-align: center; width: 154px;"><code>kerml</code></td><br>			<td style="width: 332px;">Kernel Modeling Language</td><br>		</tr><br>		<tr><br>			<td style="text-align: center; width: 154px;"><code>ocl</code></td><br>			<td style="width: 332px;">Object Constraint Language</td><br>		</tr><br>		<tr><br>			<td style="text-align: center; width: 154px;"><code>alf</code></td><br>			<td style="width: 332px;">Action Language for fUML</td><br>		</tr><br>	</tbody><br></table><br><br><p>Other specifications may define specific <code>language</code> strings, other than those shown above, to be used to indicate the use of languages from those specifications in KerML <code>TextualRepresentation</code>.</p><br><br><p>If the <code>language</code> of a <code>TextualRepresentation</code> is &quot;<code>kerml</code>&quot;, then the <code>body</code> text shall be a legal representation of the <code>representedElement</code> in the KerML textual concrete syntax. A conforming tool can use such a <code>TextualRepresentation</code> <code>Annotation</code> to record the original KerML concrete syntax text from which an <code>Element</code> was parsed. In this case, it is a tool responsibility to ensure that the <code>body</code> of the <code>TextualRepresentation</code> remains correct (or the Annotation is removed) if the annotated <code>Element</code> changes other than by re-parsing the <code>body</code> text.</p><br><br><p>An <code>Element</code> with a <code>TextualRepresentation</code> in a language other than KerML is essentially a semantically &quot;opaque&quot; <code>Element</code> specified in the other language. However, a conforming KerML tool may interpret such an element consistently with the specification of the named language.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:textualRepresentationLanguage](https://www.omg.org/spec/SysML/20230201/vocab#textualRepresentationLanguage)| [1]| String| <p>The natural or artifical language in which the <code>body</code> text is written.</p><br>| <p>The natural or artifical language in which the <code>body</code> text is written.</p><br>|
| [sysml_vocab:textualRepresentationBody](https://www.omg.org/spec/SysML/20230201/vocab#textualRepresentationBody)| [1]| String| <p>The textual representation of the <code>representedElement</code> in the given <code>language</code>.</p><br>| <p>The textual representation of the <code>representedElement</code> in the given <code>language</code>.</p><br>|
| [sysml_vocab:textualRepresentationRepresentedElement](https://www.omg.org/spec/SysML/20230201/vocab#textualRepresentationRepresentedElement)| [1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <code>Element</code> that is represented by this <code>TextualRepresentation</code>.</p><br>| <p>The <code>Element</code> that is represented by this <code>TextualRepresentation</code>.</p><br>|



### ConstraintDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#ConstraintDefinition

type: Shape

target class: [sysml_vocab:ConstraintDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintDefinition)

definition of vocabulary class : <p>A <code>ConstraintDefinition</code> is an <code>OccurrenceDefinition</code> that is also a <code>Predicate</code> that defines a constraint that may be asserted to hold on a system or part of a system.</p><br><br><br>specializesFromLibrary('Constraints::ConstraintCheck')

description: <p>A <code>ConstraintDefinition</code> is an <code>OccurrenceDefinition</code> that is also a <code>Predicate</code> that defines a constraint that may be asserted to hold on a system or part of a system.</p><br><br><br>specializesFromLibrary('Constraints::ConstraintCheck')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Membership

URI: https://www.omg.org/spec/SysML/20230201/shapes#Membership

type: Shape

target class: [sysml_vocab:Membership](https://www.omg.org/spec/SysML/20230201/vocab#Membership)

definition of vocabulary class : <p>A <code>Membership</code> is a <code>Relationship</code> between a <code>Namespace</code> and an <code>Element</code> that indicates the <code>Element</code> is a <code>member</code> of (i.e., is contained in) the Namespace. Any <code>memberNames</code> specify how the <code>memberElement</code> is identified in the <code>Namespace</code> and the <code>visibility</code> specifies whether or not the <code>memberElement</code> is publicly visible from outside the <code>Namespace</code>.</p><br><br><p>If a <code>Membership</code> is an <code>OwningMembership</code>, then it owns its <code>memberElement</code>, which becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code>. Otherwise, the <code>memberNames</code> of a <code>Membership</code> are effectively aliases within the <code>membershipOwningNamespace</code> for an <code>Element</code> with a separate <code>OwningMembership</code> in the same or a different <code>Namespace</code>.</p><br><br><p>&nbsp;</p><br><br>memberElementId = memberElement.elementId

description: <p>A <code>Membership</code> is a <code>Relationship</code> between a <code>Namespace</code> and an <code>Element</code> that indicates the <code>Element</code> is a <code>member</code> of (i.e., is contained in) the Namespace. Any <code>memberNames</code> specify how the <code>memberElement</code> is identified in the <code>Namespace</code> and the <code>visibility</code> specifies whether or not the <code>memberElement</code> is publicly visible from outside the <code>Namespace</code>.</p><br><br><p>If a <code>Membership</code> is an <code>OwningMembership</code>, then it owns its <code>memberElement</code>, which becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code>. Otherwise, the <code>memberNames</code> of a <code>Membership</code> are effectively aliases within the <code>membershipOwningNamespace</code> for an <code>Element</code> with a separate <code>OwningMembership</code> in the same or a different <code>Namespace</code>.</p><br><br><p>&nbsp;</p><br><br>memberElementId = memberElement.elementId

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:membershipMemberElementId](https://www.omg.org/spec/SysML/20230201/vocab#membershipMemberElementId)| [1]| String| <p>The <code>elementId</code> of the <code>memberElement</code>.</p>| <p>The <code>elementId</code> of the <code>memberElement</code>.</p>|
| [sysml_vocab:membershipMemberShortName](https://www.omg.org/spec/SysML/20230201/vocab#membershipMemberShortName)| [0..1]| String| <p>The short name of the <code>memberElement</code> relative to the <code>membershipOwningNamespace</code>.</p>| <p>The short name of the <code>memberElement</code> relative to the <code>membershipOwningNamespace</code>.</p>|
| [sysml_vocab:membershipMemberName](https://www.omg.org/spec/SysML/20230201/vocab#membershipMemberName)| [0..1]| String| <p>The name of the <code>memberElement</code> relative to the <code>membershipOwningNamespace</code>.</p><br>| <p>The name of the <code>memberElement</code> relative to the <code>membershipOwningNamespace</code>.</p><br>|
| [sysml_vocab:membershipVisibility](https://www.omg.org/spec/SysML/20230201/vocab#membershipVisibility)| [1]| String| <p>Whether or not the <code>Membership</code> of the <code>memberElement</code> in the <code>membershipOwningNamespace</code> is publicly visible outside that <code>Namespace</code>.</p><br>| <p>Whether or not the <code>Membership</code> of the <code>memberElement</code> in the <code>membershipOwningNamespace</code> is publicly visible outside that <code>Namespace</code>.</p><br>|
| [sysml_vocab:membershipMembershipOwningNamespace](https://www.omg.org/spec/SysML/20230201/vocab#membershipMembershipOwningNamespace)| [1]| [sysml_vocab:Namespace](https://www.omg.org/spec/SysML/20230201/vocab#Namespace)| <p>The <code>Namespace</code> of which the <code>memberElement</code> becomes a <cpde>member due to this <code>Membership</code>.</cpde></p><br>| <p>The <code>Namespace</code> of which the <code>memberElement</code> becomes a <cpde>member due to this <code>Membership</code>.</cpde></p><br>|
| [sysml_vocab:membershipMemberElement](https://www.omg.org/spec/SysML/20230201/vocab#membershipMemberElement)| [1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <code>Element</code> that becomes a <code>member</code> of the <code>membershipOwningNamespace</code> due to this <code>Membership</code>.</p><br>| <p>The <code>Element</code> that becomes a <code>member</code> of the <code>membershipOwningNamespace</code> due to this <code>Membership</code>.</p><br>|



### CaseUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#CaseUsage

type: Shape

target class: [sysml_vocab:CaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#CaseUsage)

definition of vocabulary class : <p>A <code>CaseUsage</code> is a <code>Usage</code> of a <code>CaseDefinition</code>.</p><br>objectiveRequirement = <br>    let objectives: OrderedSet(RequirementUsage) = <br>        featureMembership-><br>            selectByKind(ObjectiveMembership).<br>            ownedRequirement in<br>    if objectives->isEmpty() then null<br>    else objectives->first().ownedObjectiveRequirement<br>    endif<br>featureMembership-><br>    selectByKind(ObjectiveMembership)-><br>    size() <= 1<br>featureMembership-><br>	selectByKind(SubjectMembership)-><br>	size() <= 1<br>actorParameter = featureMembership-><br>    selectByKind(ActorMembership).<br>    ownedActorParameter<br>subjectParameter =<br>    let subjects : OrderedSet(SubjectMembership) = <br>        featureMembership->selectByKind(SubjectMembership) in<br>    if subjects->isEmpty() then null<br>    else subjects->first().ownedSubjectParameter<br>    endif<br>input->notEmpty() and input->first() = subjectParameter<br>specializesFromLibrary('Cases::cases')<br>isComposite and owningType <> null and <br>    (owningType.oclIsKindOf(CaseDefinition) or<br>     owningType.oclIsKindOf(CaseUsage)) implies<br>    specializesFromLibrary('Cases::Case::subcases')

description: <p>A <code>CaseUsage</code> is a <code>Usage</code> of a <code>CaseDefinition</code>.</p><br>objectiveRequirement = <br>    let objectives: OrderedSet(RequirementUsage) = <br>        featureMembership-><br>            selectByKind(ObjectiveMembership).<br>            ownedRequirement in<br>    if objectives->isEmpty() then null<br>    else objectives->first().ownedObjectiveRequirement<br>    endif<br>featureMembership-><br>    selectByKind(ObjectiveMembership)-><br>    size() <= 1<br>featureMembership-><br>	selectByKind(SubjectMembership)-><br>	size() <= 1<br>actorParameter = featureMembership-><br>    selectByKind(ActorMembership).<br>    ownedActorParameter<br>subjectParameter =<br>    let subjects : OrderedSet(SubjectMembership) = <br>        featureMembership->selectByKind(SubjectMembership) in<br>    if subjects->isEmpty() then null<br>    else subjects->first().ownedSubjectParameter<br>    endif<br>input->notEmpty() and input->first() = subjectParameter<br>specializesFromLibrary('Cases::cases')<br>isComposite and owningType <> null and <br>    (owningType.oclIsKindOf(CaseDefinition) or<br>     owningType.oclIsKindOf(CaseUsage)) implies<br>    specializesFromLibrary('Cases::Case::subcases')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:caseUsageObjectiveRequirement](https://www.omg.org/spec/SysML/20230201/vocab#caseUsageObjectiveRequirement)| [0..1]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The <code>RequirementUsage</code> representing the objective of this <code>CaseUsage</code>.</p> <br>| <p>The <code>RequirementUsage</code> representing the objective of this <code>CaseUsage</code>.</p> <br>|
| [sysml_vocab:caseUsageCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#caseUsageCaseDefinition)| [0..1]| [sysml_vocab:CaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#CaseDefinition)| <p>The CaseDefinition that is the type of this CaseUsage.</p>| <p>The CaseDefinition that is the type of this CaseUsage.</p>|
| [sysml_vocab:caseUsageSubjectParameter](https://www.omg.org/spec/SysML/20230201/vocab#caseUsageSubjectParameter)| [1]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>parameter</code> of this <code>CaseUsage</code> that represents its subject.</p><br>| <p>The <code>parameter</code> of this <code>CaseUsage</code> that represents its subject.</p><br>|
| [sysml_vocab:caseUsageActorParameter](https://www.omg.org/spec/SysML/20230201/vocab#caseUsageActorParameter)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The <code>parameters</code> of this <code>CaseUsage</code> that represent actors involved in the case.</p>| <p>The <code>parameters</code> of this <code>CaseUsage</code> that represent actors involved in the case.</p>|



### OwningMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#OwningMembership

type: Shape

target class: [sysml_vocab:OwningMembership](https://www.omg.org/spec/SysML/20230201/vocab#OwningMembership)

definition of vocabulary class : <p>An <code>OwningMembership</code> is a <code>Membership</code> that owns its <code>memberElement</code> as a <code>ownedRelatedElement</code>. The <code>ownedMemberElement</code> becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code>.</p><br><br>ownedMemberName = ownedMemberElement.name<br>ownedMemberShortName = ownedMemberElement.shortName

description: <p>An <code>OwningMembership</code> is a <code>Membership</code> that owns its <code>memberElement</code> as a <code>ownedRelatedElement</code>. The <code>ownedMemberElement</code> becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code>.</p><br><br>ownedMemberName = ownedMemberElement.name<br>ownedMemberShortName = ownedMemberElement.shortName

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:owningMembershipOwnedMemberElementId](https://www.omg.org/spec/SysML/20230201/vocab#owningMembershipOwnedMemberElementId)| [1]| String| <p>The <code>elementId</code> of the <code>ownedMemberElement</code>.</p>| <p>The <code>elementId</code> of the <code>ownedMemberElement</code>.</p>|
| [sysml_vocab:owningMembershipOwnedMemberShortName](https://www.omg.org/spec/SysML/20230201/vocab#owningMembershipOwnedMemberShortName)| [0..1]| String| <p>The <code>shortName</code> of the <code>ownedMemberElement</code>.</p>| <p>The <code>shortName</code> of the <code>ownedMemberElement</code>.</p>|
| [sysml_vocab:owningMembershipOwnedMemberName](https://www.omg.org/spec/SysML/20230201/vocab#owningMembershipOwnedMemberName)| [0..1]| String| <p>The <code>name</code> of the <code>ownedMemberElement</code>.</p><br>| <p>The <code>name</code> of the <code>ownedMemberElement</code>.</p><br>|
| [sysml_vocab:owningMembershipOwnedMemberElement](https://www.omg.org/spec/SysML/20230201/vocab#owningMembershipOwnedMemberElement)| [1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <code>Element</code> that becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code> due to this <code>OwningMembership</code>.</p><br>| <p>The <code>Element</code> that becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code> due to this <code>OwningMembership</code>.</p><br>|



### OccurrenceDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#OccurrenceDefinition

type: Shape

target class: [sysml_vocab:OccurrenceDefinition](https://www.omg.org/spec/SysML/20230201/vocab#OccurrenceDefinition)

definition of vocabulary class : <p>An <code>OccurrenceDefinition</code> is a <code>Definition</code> of a <code>Class</code> of individuals that have an independent life over time and potentially an extent over space. This includes both structural things and behaviors that act on such structures.</p><br><br><p>If <code>isIndividual</code> is true, then the <code>OccurrenceDefinition</code> is constrained to represent an individual thing. The instances of such an <code>OccurrenceDefinition</code> include all spatial and temporal portions of the individual being represented, but only one of these can be the complete <code>Life</code> of the individual. All other instances must be portions of the &quot;maximal portion&quot; that is single <code>Life</code> instance, capturing the conception that all of the instances represent one individual with a single &quot;identity&quot;.</p><br><br><p>An <code>OccurrenceDefinition</code> must specialize, directly or indirectly, the base <code>Class</code> <code><em>Occurrence</em></code> from the Kernel Semantic Library.</p><br><br>let n : Integer = ownedMember->selectByKind(LifeClass) in<br>if isIndividual then n = 1 else n = 0 endif<br>lifeClass =<br>    let lifeClasses: OrderedSet(LifeClass) = <br>        ownedMember->selectByKind(LifeClass) in<br>    if lifeClasses->isEmpty() then null<br>    else lifeClasses->first()<br>    endif

description: <p>An <code>OccurrenceDefinition</code> is a <code>Definition</code> of a <code>Class</code> of individuals that have an independent life over time and potentially an extent over space. This includes both structural things and behaviors that act on such structures.</p><br><br><p>If <code>isIndividual</code> is true, then the <code>OccurrenceDefinition</code> is constrained to represent an individual thing. The instances of such an <code>OccurrenceDefinition</code> include all spatial and temporal portions of the individual being represented, but only one of these can be the complete <code>Life</code> of the individual. All other instances must be portions of the &quot;maximal portion&quot; that is single <code>Life</code> instance, capturing the conception that all of the instances represent one individual with a single &quot;identity&quot;.</p><br><br><p>An <code>OccurrenceDefinition</code> must specialize, directly or indirectly, the base <code>Class</code> <code><em>Occurrence</em></code> from the Kernel Semantic Library.</p><br><br>let n : Integer = ownedMember->selectByKind(LifeClass) in<br>if isIndividual then n = 1 else n = 0 endif<br>lifeClass =<br>    let lifeClasses: OrderedSet(LifeClass) = <br>        ownedMember->selectByKind(LifeClass) in<br>    if lifeClasses->isEmpty() then null<br>    else lifeClasses->first()<br>    endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:occurrenceDefinitionIsIndividual](https://www.omg.org/spec/SysML/20230201/vocab#occurrenceDefinitionIsIndividual)| [1]| Boolean| <p>Whether this OccurrenceDefinition is constrained to represent single individual.</p>| <p>Whether this OccurrenceDefinition is constrained to represent single individual.</p>|
| [sysml_vocab:occurrenceDefinitionLifeClass](https://www.omg.org/spec/SysML/20230201/vocab#occurrenceDefinitionLifeClass)| [0..1]| [sysml_vocab:LifeClass](https://www.omg.org/spec/SysML/20230201/vocab#LifeClass)| <p>If <code>isIndividual</code> is true, a <code>LifeClass</code> that specializes this <code>OccurrenceDefinition</code>, restricting it to represent an individual.</p>| <p>If <code>isIndividual</code> is true, a <code>LifeClass</code> that specializes this <code>OccurrenceDefinition</code>, restricting it to represent an individual.</p>|



### SendActionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#SendActionUsage

type: Shape

target class: [sysml_vocab:SendActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#SendActionUsage)

definition of vocabulary class : <p>A <code>SendActionUsage</code> is an <code>ActionUsage</code> that specifies the sending of a payload given by the result of its <code>payloadArgument</code> <code>Expression</code> via a <em><code>MessageTransfer</code></em> whose <em><code>source</code></em> is given by the result of the <code>senderArgument</code> <code>Expression</code> and whose <code>target</code> is given by the result of the <code>receiverArgument</code> <code>Expression</code>. If no <code>senderArgument</code> is provided, the default is the <em><code>this</code></em> context for the action. If no <code>receiverArgument</code> is given, then the receiver is to be determined by, e.g., outgoing <em><code>Connections</code></em> from the sender.</p> <br><br>senderArgument = argument(2)<br>payloadArgument = argument(1)<br>inputParameters()->size() >= 3<br>receiverArgument = argument(3)<br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::acceptSubactions')<br>specializesFromLibrary('Actions::sendActions')

description: <p>A <code>SendActionUsage</code> is an <code>ActionUsage</code> that specifies the sending of a payload given by the result of its <code>payloadArgument</code> <code>Expression</code> via a <em><code>MessageTransfer</code></em> whose <em><code>source</code></em> is given by the result of the <code>senderArgument</code> <code>Expression</code> and whose <code>target</code> is given by the result of the <code>receiverArgument</code> <code>Expression</code>. If no <code>senderArgument</code> is provided, the default is the <em><code>this</code></em> context for the action. If no <code>receiverArgument</code> is given, then the receiver is to be determined by, e.g., outgoing <em><code>Connections</code></em> from the sender.</p> <br><br>senderArgument = argument(2)<br>payloadArgument = argument(1)<br>inputParameters()->size() >= 3<br>receiverArgument = argument(3)<br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::acceptSubactions')<br>specializesFromLibrary('Actions::sendActions')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:sendActionUsageReceiverArgument](https://www.omg.org/spec/SysML/20230201/vocab#sendActionUsageReceiverArgument)| [0..1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>An <code>Expression</code> whose result is bound to the <em><code>receiver</code></em> input parameter of this <code>SendActionUsage</code>.</p> <br>| <p>An <code>Expression</code> whose result is bound to the <em><code>receiver</code></em> input parameter of this <code>SendActionUsage</code>.</p> <br>|
| [sysml_vocab:sendActionUsagePayloadArgument](https://www.omg.org/spec/SysML/20230201/vocab#sendActionUsagePayloadArgument)| [1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>An <code>Expression</code> whose result is bound to the <code><em>payload</em></code> input parameter of this <code>SendActionUsage</code>.</p> <br>| <p>An <code>Expression</code> whose result is bound to the <code><em>payload</em></code> input parameter of this <code>SendActionUsage</code>.</p> <br>|
| [sysml_vocab:sendActionUsageSenderArgument](https://www.omg.org/spec/SysML/20230201/vocab#sendActionUsageSenderArgument)| [0..1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>An <code>Expression</code> whose result is bound to the <em><code>sender</code></em> input parameter of this <code>SendActionUsage</code>.</p> <br>| <p>An <code>Expression</code> whose result is bound to the <em><code>sender</code></em> input parameter of this <code>SendActionUsage</code>.</p> <br>|



### Behavior

URI: https://www.omg.org/spec/SysML/20230201/shapes#Behavior

type: Shape

target class: [sysml_vocab:Behavior](https://www.omg.org/spec/SysML/20230201/vocab#Behavior)

definition of vocabulary class : <p>A <code>Behavior </code>coordinates occurrences of other <code>Behaviors</code>, as well as changes in objects. <code>Behaviors</code> can be decomposed into <code>Steps</code> and be characterized by <code>parameters</code>.</p><br><br>specializesFromLibrary('Performances::Performance')<br>step = feature->selectByKind(Step)<br>ownedSpecialization.general->forAll(not oclIsKindOf(Structure))

description: <p>A <code>Behavior </code>coordinates occurrences of other <code>Behaviors</code>, as well as changes in objects. <code>Behaviors</code> can be decomposed into <code>Steps</code> and be characterized by <code>parameters</code>.</p><br><br>specializesFromLibrary('Performances::Performance')<br>step = feature->selectByKind(Step)<br>ownedSpecialization.general->forAll(not oclIsKindOf(Structure))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:behaviorStep](https://www.omg.org/spec/SysML/20230201/vocab#behaviorStep)| [0..*]| [sysml_vocab:Step](https://www.omg.org/spec/SysML/20230201/vocab#Step)| <p>The <code>Steps</code> that make up this <code>Behavior</code>.</p><br>| <p>The <code>Steps</code> that make up this <code>Behavior</code>.</p><br>|
| [sysml_vocab:behaviorParameter](https://www.omg.org/spec/SysML/20230201/vocab#behaviorParameter)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The parameters of this <code>Behavior</code>, which are defined as its <code>directedFeatures</code>, whose values are passed into and/or out of a performance of the <code>Behavior</code>.</p><br>| <p>The parameters of this <code>Behavior</code>, which are defined as its <code>directedFeatures</code>, whose values are passed into and/or out of a performance of the <code>Behavior</code>.</p><br>|



### TriggerInvocationExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#TriggerInvocationExpression

type: Shape

target class: [sysml_vocab:TriggerInvocationExpression](https://www.omg.org/spec/SysML/20230201/vocab#TriggerInvocationExpression)

definition of vocabulary class : <p>A <code>TriggerInvocationExpression</code> is an <code>InvocationExpression</code> that invokes one of the trigger <code>Functions</code> from the Kernel Semantic Library <code><em>Triggers<em></code> package, as indicated by its <code>kind</code>.</p><br>specializesFromLibrary(<br>    if kind = TriggerKind::when then<br>        'Triggers::TriggerWhen'<br>    else if kind = TriggerKind::at then<br>        'Triggers::TriggerAt'<br>    else <br>        'Triggers::TriggerAfter'<br>    endif endif<br>)<br>kind = TriggerKind::after implies<br>    argument->notEmpty() and<br>    argument->at(1).result.specializesFromLibrary('Quantities::ScalarQuantityValue') and<br>    let mRef : Element = <br>        resolveGlobal('Quantities::TensorQuantityValue::mRef').ownedMemberElement in<br>    argument->at(1).result.feature-><br>        select(ownedRedefinition.redefinedFeature-><br>           closure(ownedRedefinition.redefinedFeature)-><br>           includes(mRef))-><br>        exists(specializesFromLibrary('ISQBase::DurationUnit'))<br>kind = TriggerKind::at implies<br>    argument->notEmpty() and<br>    argument->at(1).result.specializesFromLibrary('Time::TimeInstantValue')<br>kind = TriggerKind::when implies<br>    argument->notEmpty() and<br>    argument->at(1).oclIsKindOf(FeatureReferenceExpression) and<br>    let referent : Feature = <br>        argument->at(1).oclAsType(FeatureReferenceExpression).referent in<br>    referent.oclIsKindOf(Expression) and<br>    referent.oclAsType(Expression).result.specializesFromLibrary('ScalarValues::Boolean')

description: <p>A <code>TriggerInvocationExpression</code> is an <code>InvocationExpression</code> that invokes one of the trigger <code>Functions</code> from the Kernel Semantic Library <code><em>Triggers<em></code> package, as indicated by its <code>kind</code>.</p><br>specializesFromLibrary(<br>    if kind = TriggerKind::when then<br>        'Triggers::TriggerWhen'<br>    else if kind = TriggerKind::at then<br>        'Triggers::TriggerAt'<br>    else <br>        'Triggers::TriggerAfter'<br>    endif endif<br>)<br>kind = TriggerKind::after implies<br>    argument->notEmpty() and<br>    argument->at(1).result.specializesFromLibrary('Quantities::ScalarQuantityValue') and<br>    let mRef : Element = <br>        resolveGlobal('Quantities::TensorQuantityValue::mRef').ownedMemberElement in<br>    argument->at(1).result.feature-><br>        select(ownedRedefinition.redefinedFeature-><br>           closure(ownedRedefinition.redefinedFeature)-><br>           includes(mRef))-><br>        exists(specializesFromLibrary('ISQBase::DurationUnit'))<br>kind = TriggerKind::at implies<br>    argument->notEmpty() and<br>    argument->at(1).result.specializesFromLibrary('Time::TimeInstantValue')<br>kind = TriggerKind::when implies<br>    argument->notEmpty() and<br>    argument->at(1).oclIsKindOf(FeatureReferenceExpression) and<br>    let referent : Feature = <br>        argument->at(1).oclAsType(FeatureReferenceExpression).referent in<br>    referent.oclIsKindOf(Expression) and<br>    referent.oclAsType(Expression).result.specializesFromLibrary('ScalarValues::Boolean')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:triggerInvocationExpressionKind](https://www.omg.org/spec/SysML/20230201/vocab#triggerInvocationExpressionKind)| [1]| String| <p>Indicates which of the <code>Functions</code> from the <code><em>Triggers</em></code> model in the Kernel Semantic Library is to be invoked by this <code>TriggerInvocationExpression</code>.</p>| <p>Indicates which of the <code>Functions</code> from the <code><em>Triggers</em></code> model in the Kernel Semantic Library is to be invoked by this <code>TriggerInvocationExpression</code>.</p>|



### PortDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#PortDefinition

type: Shape

target class: [sysml_vocab:PortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#PortDefinition)

definition of vocabulary class : <p>A <code>PortDefinition</code> defines a point at which external entities can connect to and interact with a system or part of a system. Any <code>ownedUsages</code> of a <code>PortDefinition</code>, other than <code>PortUsages</code>, must not be composite.</p><br><br><br><br>conjugatedPortDefinition = <br>let conjugatedPortDefinitions : OrderedSet(ConjugatedPortDefinition) =<br>    ownedMember->selectByKind(ConjugatedPortDefinition) in<br>if conjugatedPortDefinitions->isEmpty() then null<br>else conjugatedPortDefinitions->first()<br>endif<br>ownedUsage-><br>    reject(oclIsKindOf(PortUsage))-><br>    forAll(not isComposite)<br>not oclIsKindOf(ConjugatedPortDefinition) implies<br>    ownedMember-><br>        selectByKind(ConjugatedPortDefinition)-><br>        size() = 1<br>specializesFromLibrary('Ports::Port')

description: <p>A <code>PortDefinition</code> defines a point at which external entities can connect to and interact with a system or part of a system. Any <code>ownedUsages</code> of a <code>PortDefinition</code>, other than <code>PortUsages</code>, must not be composite.</p><br><br><br><br>conjugatedPortDefinition = <br>let conjugatedPortDefinitions : OrderedSet(ConjugatedPortDefinition) =<br>    ownedMember->selectByKind(ConjugatedPortDefinition) in<br>if conjugatedPortDefinitions->isEmpty() then null<br>else conjugatedPortDefinitions->first()<br>endif<br>ownedUsage-><br>    reject(oclIsKindOf(PortUsage))-><br>    forAll(not isComposite)<br>not oclIsKindOf(ConjugatedPortDefinition) implies<br>    ownedMember-><br>        selectByKind(ConjugatedPortDefinition)-><br>        size() = 1<br>specializesFromLibrary('Ports::Port')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:portDefinitionConjugatedPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#portDefinitionConjugatedPortDefinition)| [0..1]| [sysml_vocab:ConjugatedPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ConjugatedPortDefinition)| <p>The <codeConjugatedPortDefinition</code> that is conjugate to this <code>PortDefinition</code>.</p>| <p>The <codeConjugatedPortDefinition</code> that is conjugate to this <code>PortDefinition</code>.</p>|



### StateSubactionMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#StateSubactionMembership

type: Shape

target class: [sysml_vocab:StateSubactionMembership](https://www.omg.org/spec/SysML/20230201/vocab#StateSubactionMembership)

definition of vocabulary class : <p>A <code>StateSubactionMembership</code> is a <code>FeatureMembership</code> for an entry, do or exit <code>ActionUsage<code> of a <code>StateDefinition</code> or <code>StateUsage</code>.</p><br>owningType.oclIsKindOf(StateDefinition) or<br>owningType.oclIsKindOf(StateUsage)

description: <p>A <code>StateSubactionMembership</code> is a <code>FeatureMembership</code> for an entry, do or exit <code>ActionUsage<code> of a <code>StateDefinition</code> or <code>StateUsage</code>.</p><br>owningType.oclIsKindOf(StateDefinition) or<br>owningType.oclIsKindOf(StateUsage)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:stateSubactionMembershipKind](https://www.omg.org/spec/SysML/20230201/vocab#stateSubactionMembershipKind)| [1]| String| <p>Whether this <code>StateSubactionMembership</code> is for an <code>entry<code>, <code>do</code> or <code>exit</code> <code>ActionUsage</code>.</p>| <p>Whether this <code>StateSubactionMembership</code> is for an <code>entry<code>, <code>do</code> or <code>exit</code> <code>ActionUsage</code>.</p>|
| [sysml_vocab:stateSubactionMembershipAction](https://www.omg.org/spec/SysML/20230201/vocab#stateSubactionMembershipAction)| [1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> that is the <code>ownedMemberFeature</code> of this <code>StateSubactionMembership</code>.</p>| <p>The <code>ActionUsage</code> that is the <code>ownedMemberFeature</code> of this <code>StateSubactionMembership</code>.</p>|



### Redefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#Redefinition

type: Shape

target class: [sysml_vocab:Redefinition](https://www.omg.org/spec/SysML/20230201/vocab#Redefinition)

definition of vocabulary class : <p><code>Redefinition</code> is a kind of <code>Subsetting</code> that requires the <code>redefinedFeature</code> and the <code>redefiningFeature</code> to have the same values (on each instance of the domain of the <code>redefiningFeature</code>). This means any restrictions on the <code>redefiningFeature</code>, such as <code>type</code> or <code>multiplicity</code>, also apply to the <code>redefinedFeature</code> (on each instance of the domain of the <code>redefiningFeature</code>), and vice versa. The <code>redefinedFeature</code> might have values for instances of the domain of the <code>redefiningFeature</code>, but only as instances of the domain of the <code>redefinedFeature</code> that happen to also be instances of the domain of the <code>redefiningFeature</code>. This is supported by the constraints inherited from <code>Subsetting</code> on the domains of the <code>redefiningFeature</code> and <code>redefinedFeature</code>. However, these constraints are narrowed for <code>Redefinition</code> to require the <code>owningTypes</code> of the <code>redefiningFeature</code> and <code>redefinedFeature</code> to be different and the <code>redefinedFeature</code> to not be inherited into the <code>owningNamespace</code> of the <code>redefiningFeature</code>.This enables the <code>redefiningFeature</code> to have the same name as the <code>redefinedFeature</code>, if desired.</p><br><br>let anythingType: Type =<br>    redefiningFeature.resolveGlobal('Base::Anything').modelElement.oclAsType(Type) in <br>-- Including "Anything" accounts for implicit featuringType of Features<br>-- with no explicit featuringType.<br>let redefiningFeaturingTypes: Set(Type) =<br>    redefiningFeature.featuringTypes->asSet()->including(anythingType) in<br>let redefinedFeaturingTypes: Set(Type) =<br>    redefinedFeature.featuringTypes->asSet()->including(anythingType) in<br>redefiningFeaturingTypes <> redefinedFeaturingType<br>featuringType->forAll(t |<br>    let direction : FeatureDirectionKind = t.directionOf(redefinedFeature) in<br>    ((direction = FeatureDirectionKind::_'in' or <br>      direction = FeatureDirectionKind::out) implies<br>         redefiningFeature.direction = direction)<br>    and <br>    (direction = FeatureDirectionKind::inout implies<br>        redefiningFeature.direction <> null))

description: <p><code>Redefinition</code> is a kind of <code>Subsetting</code> that requires the <code>redefinedFeature</code> and the <code>redefiningFeature</code> to have the same values (on each instance of the domain of the <code>redefiningFeature</code>). This means any restrictions on the <code>redefiningFeature</code>, such as <code>type</code> or <code>multiplicity</code>, also apply to the <code>redefinedFeature</code> (on each instance of the domain of the <code>redefiningFeature</code>), and vice versa. The <code>redefinedFeature</code> might have values for instances of the domain of the <code>redefiningFeature</code>, but only as instances of the domain of the <code>redefinedFeature</code> that happen to also be instances of the domain of the <code>redefiningFeature</code>. This is supported by the constraints inherited from <code>Subsetting</code> on the domains of the <code>redefiningFeature</code> and <code>redefinedFeature</code>. However, these constraints are narrowed for <code>Redefinition</code> to require the <code>owningTypes</code> of the <code>redefiningFeature</code> and <code>redefinedFeature</code> to be different and the <code>redefinedFeature</code> to not be inherited into the <code>owningNamespace</code> of the <code>redefiningFeature</code>.This enables the <code>redefiningFeature</code> to have the same name as the <code>redefinedFeature</code>, if desired.</p><br><br>let anythingType: Type =<br>    redefiningFeature.resolveGlobal('Base::Anything').modelElement.oclAsType(Type) in <br>-- Including "Anything" accounts for implicit featuringType of Features<br>-- with no explicit featuringType.<br>let redefiningFeaturingTypes: Set(Type) =<br>    redefiningFeature.featuringTypes->asSet()->including(anythingType) in<br>let redefinedFeaturingTypes: Set(Type) =<br>    redefinedFeature.featuringTypes->asSet()->including(anythingType) in<br>redefiningFeaturingTypes <> redefinedFeaturingType<br>featuringType->forAll(t |<br>    let direction : FeatureDirectionKind = t.directionOf(redefinedFeature) in<br>    ((direction = FeatureDirectionKind::_'in' or <br>      direction = FeatureDirectionKind::out) implies<br>         redefiningFeature.direction = direction)<br>    and <br>    (direction = FeatureDirectionKind::inout implies<br>        redefiningFeature.direction <> null))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:redefinitionRedefiningFeature](https://www.omg.org/spec/SysML/20230201/vocab#redefinitionRedefiningFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is redefining the <code>redefinedFeature</code> of this <code>Redefinition</code>.</p><br>| <p>The <code>Feature</code> that is redefining the <code>redefinedFeature</code> of this <code>Redefinition</code>.</p><br>|
| [sysml_vocab:redefinitionRedefinedFeature](https://www.omg.org/spec/SysML/20230201/vocab#redefinitionRedefinedFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is redefined by the <code>redefiningFeature</code> of this <code>Redefinition</code>.</p><br>| <p>The <code>Feature</code> that is redefined by the <code>redefiningFeature</code> of this <code>Redefinition</code>.</p><br>|



### FeatureChaining

URI: https://www.omg.org/spec/SysML/20230201/shapes#FeatureChaining

type: Shape

target class: [sysml_vocab:FeatureChaining](https://www.omg.org/spec/SysML/20230201/vocab#FeatureChaining)

definition of vocabulary class : <p><code>FeatureChaining</code> is a <code>Relationship</code> that makes its target <code>Feature</code> one of the <code>chainingFeatures</code> of its owning <code>Feature</code>.</p>

description: <p><code>FeatureChaining</code> is a <code>Relationship</code> that makes its target <code>Feature</code> one of the <code>chainingFeatures</code> of its owning <code>Feature</code>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:featureChainingChainingFeature](https://www.omg.org/spec/SysML/20230201/vocab#featureChainingChainingFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> whose values partly determine values of <code>featureChained</code>, as described in <code>Feature::chainingFeature</code>.</p><br>| <p>The <code>Feature</code> whose values partly determine values of <code>featureChained</code>, as described in <code>Feature::chainingFeature</code>.</p><br>|
| [sysml_vocab:featureChainingFeatureChained](https://www.omg.org/spec/SysML/20230201/vocab#featureChainingFeatureChained)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> whose values are partly determined by values of the <code>chainingFeature</code>, as described in <code>Feature::chainingFeature</code>.</p><br>| <p>The <code>Feature</code> whose values are partly determined by values of the <code>chainingFeature</code>, as described in <code>Feature::chainingFeature</code>.</p><br>|



### Relationship

URI: https://www.omg.org/spec/SysML/20230201/shapes#Relationship

type: Shape

target class: [sysml_vocab:Relationship](https://www.omg.org/spec/SysML/20230201/vocab#Relationship)

definition of vocabulary class : <p>A <code>Relationship</code> is an <code>Element</code> that relates other <code>Element</code>. Some of its <code>relatedElements</code> may be owned, in which case those <code>ownedRelatedElements</code> will be deleted from a model if their <code>owningRelationship</code> is. A <code>Relationship</code> may also be owned by another <code>Element</code>, in which case the <code>ownedRelatedElements</code> of the <code>Relationship</code> are also considered to be transitively owned by the <code>owningRelatedElement</code> of the <code>Relationship</code>.</p><br><br><p>The <code>relatedElements</code> of a <code>Relationship</code> are divided into <code>source</code> and <code>target</code> <code>Elements</code>. The <code>Relationship</code> is considered to be directed from the <code>source</code> to the <code>target</code> <code>Elements</code>. An undirected <code>Relationship</code> may have either all <code>source</code> or all <code>target</code> <code>Elements</code>.</p><br><br><p>A &quot;relationship <code>Element</code>&quot; in the abstract syntax is generically any <code>Element</code> that is an instance of either <code>Relationship</code> or a direct or indirect specialization of <code>Relationship</code>. Any other kind of <code>Element</code> is a &quot;non-relationship <code>Element</code>&quot;. It is a convention of that non-relationship <code>Elements</code> are <em>only</em> related via reified relationship <code>Elements</code>. Any meta-associations directly between non-relationship <code>Elements</code> must be derived from underlying reified <code>Relationship</code>.</p><br><br>relatedElement = source->union(target)

description: <p>A <code>Relationship</code> is an <code>Element</code> that relates other <code>Element</code>. Some of its <code>relatedElements</code> may be owned, in which case those <code>ownedRelatedElements</code> will be deleted from a model if their <code>owningRelationship</code> is. A <code>Relationship</code> may also be owned by another <code>Element</code>, in which case the <code>ownedRelatedElements</code> of the <code>Relationship</code> are also considered to be transitively owned by the <code>owningRelatedElement</code> of the <code>Relationship</code>.</p><br><br><p>The <code>relatedElements</code> of a <code>Relationship</code> are divided into <code>source</code> and <code>target</code> <code>Elements</code>. The <code>Relationship</code> is considered to be directed from the <code>source</code> to the <code>target</code> <code>Elements</code>. An undirected <code>Relationship</code> may have either all <code>source</code> or all <code>target</code> <code>Elements</code>.</p><br><br><p>A &quot;relationship <code>Element</code>&quot; in the abstract syntax is generically any <code>Element</code> that is an instance of either <code>Relationship</code> or a direct or indirect specialization of <code>Relationship</code>. Any other kind of <code>Element</code> is a &quot;non-relationship <code>Element</code>&quot;. It is a convention of that non-relationship <code>Elements</code> are <em>only</em> related via reified relationship <code>Elements</code>. Any meta-associations directly between non-relationship <code>Elements</code> must be derived from underlying reified <code>Relationship</code>.</p><br><br>relatedElement = source->union(target)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:relationshipIsImplied](https://www.omg.org/spec/SysML/20230201/vocab#relationshipIsImplied)| [1]| Boolean| <p>Whether this Relationship was generated by tooling to meet semantic rules, rather than being directly created by a modeler.</p>| <p>Whether this Relationship was generated by tooling to meet semantic rules, rather than being directly created by a modeler.</p>|
| [sysml_vocab:relationshipRelatedElement](https://www.omg.org/spec/SysML/20230201/vocab#relationshipRelatedElement)| [0..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The Elements that are related by this Relationship, derived as the union of the <code>source</code> and <code>target</code> Elements of the Relationship.</p>| <p>The Elements that are related by this Relationship, derived as the union of the <code>source</code> and <code>target</code> Elements of the Relationship.</p>|
| [sysml_vocab:relationshipTarget](https://www.omg.org/spec/SysML/20230201/vocab#relationshipTarget)| [0..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <code>relatedElements</code> to which this Relationship is considered to be directed.</p><br>| <p>The <code>relatedElements</code> to which this Relationship is considered to be directed.</p><br>|
| [sysml_vocab:relationshipSource](https://www.omg.org/spec/SysML/20230201/vocab#relationshipSource)| [0..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <code>relatedElements</c ode> from which this Relationship is considered to be directed.</p>| <p>The <code>relatedElements</c ode> from which this Relationship is considered to be directed.</p>|
| [sysml_vocab:relationshipOwningRelatedElement](https://www.omg.org/spec/SysML/20230201/vocab#relationshipOwningRelatedElement)| [0..1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <tt>relatedElement</tt> of this Relationship that owns the Relationship, if any.</p>| <p>The <tt>relatedElement</tt> of this Relationship that owns the Relationship, if any.</p>|
| [sysml_vocab:relationshipOwnedRelatedElement](https://www.omg.org/spec/SysML/20230201/vocab#relationshipOwnedRelatedElement)| [0..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <tt>relatedElements</tt> of this Relationship that are owned by the Relationship.</p>| <p>The <tt>relatedElements</tt> of this Relationship that are owned by the Relationship.</p>|



### ViewDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#ViewDefinition

type: Shape

target class: [sysml_vocab:ViewDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ViewDefinition)

definition of vocabulary class : <p>A <code>ViewDefinition</code> is a <code>PartDefinition</code> that specifies how a view artifact is constructed to satisfy a <code>viewpoint</code>. It specifies a <code>viewConditions</code> to define the model content to be presented and a <code>viewRendering</code> to define how the model content is presented.</p><br>view = usage->selectByKind(ViewUsage)<br>satisfiedViewpoint = ownedRequirement-><br>    selectByKind(ViewpointUsage)-><br>    select(isComposite)<br>viewRendering =<br>    let renderings: OrderedSet(ViewRenderingMembership) =<br>        featureMembership->selectByKind(ViewRenderingMembership) in<br>    if renderings->isEmpty() then null<br>    else renderings->first().referencedRendering<br>    endif<br>viewCondition = ownedMembership-><br>    selectByKind(ElementFilterMembership).<br>    condition<br>featureMembership-><br>    selectByKind(ViewRenderingMembership)-><br>    size() <= 1<br>specializesFromLibrary('Views::View')

description: <p>A <code>ViewDefinition</code> is a <code>PartDefinition</code> that specifies how a view artifact is constructed to satisfy a <code>viewpoint</code>. It specifies a <code>viewConditions</code> to define the model content to be presented and a <code>viewRendering</code> to define how the model content is presented.</p><br>view = usage->selectByKind(ViewUsage)<br>satisfiedViewpoint = ownedRequirement-><br>    selectByKind(ViewpointUsage)-><br>    select(isComposite)<br>viewRendering =<br>    let renderings: OrderedSet(ViewRenderingMembership) =<br>        featureMembership->selectByKind(ViewRenderingMembership) in<br>    if renderings->isEmpty() then null<br>    else renderings->first().referencedRendering<br>    endif<br>viewCondition = ownedMembership-><br>    selectByKind(ElementFilterMembership).<br>    condition<br>featureMembership-><br>    selectByKind(ViewRenderingMembership)-><br>    size() <= 1<br>specializesFromLibrary('Views::View')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:viewDefinitionView](https://www.omg.org/spec/SysML/20230201/vocab#viewDefinitionView)| [0..*]| [sysml_vocab:ViewUsage](https://www.omg.org/spec/SysML/20230201/vocab#ViewUsage)| <p>The <code>usages</code> of this <code>ViewDefinition</code> that are <code>ViewUsages</code>.</p>| <p>The <code>usages</code> of this <code>ViewDefinition</code> that are <code>ViewUsages</code>.</p>|
| [sysml_vocab:viewDefinitionSatisfiedViewpoint](https://www.omg.org/spec/SysML/20230201/vocab#viewDefinitionSatisfiedViewpoint)| [0..*]| [sysml_vocab:ViewpointUsage](https://www.omg.org/spec/SysML/20230201/vocab#ViewpointUsage)| <p>The composite <code>ownedRequirements</code> of this <code>ViewDefinition</code> that are <code>ViewpointUsages</code> for viewpoints satisfied by the <code>ViewDefinition</code>.</p>| <p>The composite <code>ownedRequirements</code> of this <code>ViewDefinition</code> that are <code>ViewpointUsages</code> for viewpoints satisfied by the <code>ViewDefinition</code>.</p>|
| [sysml_vocab:viewDefinitionViewRendering](https://www.omg.org/spec/SysML/20230201/vocab#viewDefinitionViewRendering)| [0..1]| [sysml_vocab:RenderingUsage](https://www.omg.org/spec/SysML/20230201/vocab#RenderingUsage)| <p>The <code>RenderingUsage</code> to be used to render views defined by this <code>ViewDefinition</code>, which is the <code>referencedRendering</code> of the <code>ViewRenderingMembership</code> of the <code>ViewDefinition</code>.<p>| <p>The <code>RenderingUsage</code> to be used to render views defined by this <code>ViewDefinition</code>, which is the <code>referencedRendering</code> of the <code>ViewRenderingMembership</code> of the <code>ViewDefinition</code>.<p>|
| [sysml_vocab:viewDefinitionViewCondition](https://www.omg.org/spec/SysML/20230201/vocab#viewDefinitionViewCondition)| [0..*]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>Expressions</code> related to this <code>ViewDefinition</code> by <code>ElementFilterMemberships</code>, which specify conditions on <code>Elements</code> to be rendered in a view.</p>| <p>The <code>Expressions</code> related to this <code>ViewDefinition</code> by <code>ElementFilterMemberships</code>, which specify conditions on <code>Elements</code> to be rendered in a view.</p>|



### Import

URI: https://www.omg.org/spec/SysML/20230201/shapes#Import

type: Shape

target class: [sysml_vocab:Import](https://www.omg.org/spec/SysML/20230201/vocab#Import)

definition of vocabulary class : <p>An <code>Import</code> is an <code>Relationship</code> between its <code>importOwningNamespace</code> and either a <code>Membership</code> (for a <code>MembershipImport</code>) or another <code>Namespace</code> (for a <code>NamespaceImport</code>), which determines a set of <code>Memberships</code> that become <code>importedMemberships</code> of the <code>importOwningNamespace</code>. If <code>isImportAll = false</code> (the default), then only public <code>Memberships</code> are considered &quot;visible&quot;. If <code>isImportAll = true</code>, then all <code>Memberships</code> are considered &quot;visible&quot;, regardless of their declared <code>visibility</code>. If <code>isRecursive = true</code>, then visible <code>Memberships</code> are also recursively imported from owned sub-<code>Namespaces</code>.</p><br><br>

description: <p>An <code>Import</code> is an <code>Relationship</code> between its <code>importOwningNamespace</code> and either a <code>Membership</code> (for a <code>MembershipImport</code>) or another <code>Namespace</code> (for a <code>NamespaceImport</code>), which determines a set of <code>Memberships</code> that become <code>importedMemberships</code> of the <code>importOwningNamespace</code>. If <code>isImportAll = false</code> (the default), then only public <code>Memberships</code> are considered &quot;visible&quot;. If <code>isImportAll = true</code>, then all <code>Memberships</code> are considered &quot;visible&quot;, regardless of their declared <code>visibility</code>. If <code>isRecursive = true</code>, then visible <code>Memberships</code> are also recursively imported from owned sub-<code>Namespaces</code>.</p><br><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:importVisibility](https://www.omg.org/spec/SysML/20230201/vocab#importVisibility)| [1]| String| <p>The visibility level of the imported <code>members</code> from this Import relative to the <code>importOwningNamespace</code>.</p><br>| <p>The visibility level of the imported <code>members</code> from this Import relative to the <code>importOwningNamespace</code>.</p><br>|
| [sysml_vocab:importIsRecursive](https://www.omg.org/spec/SysML/20230201/vocab#importIsRecursive)| [1]| Boolean| <p>Whether to recursively import Memberships from visible, owned sub-Namespaces.</p>| <p>Whether to recursively import Memberships from visible, owned sub-Namespaces.</p>|
| [sysml_vocab:importIsImportAll](https://www.omg.org/spec/SysML/20230201/vocab#importIsImportAll)| [1]| Boolean| <p>Whether to import memberships without regard to declared visibility.</p><br>| <p>Whether to import memberships without regard to declared visibility.</p><br>|
| [sysml_vocab:importImportedElement](https://www.omg.org/spec/SysML/20230201/vocab#importImportedElement)| [1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The effectively imported <code>Element</code> for this </code>Import</code>. For a <code>MembershipImport</code>, this is the <code>memberElement</code> of the <code>importedMembership</code>. For a <code>NamespaceImport</code>, it is the <code>importedNamespace</code>.</p>| <p>The effectively imported <code>Element</code> for this </code>Import</code>. For a <code>MembershipImport</code>, this is the <code>memberElement</code> of the <code>importedMembership</code>. For a <code>NamespaceImport</code>, it is the <code>importedNamespace</code>.</p>|
| [sysml_vocab:importImportOwningNamespace](https://www.omg.org/spec/SysML/20230201/vocab#importImportOwningNamespace)| [1]| [sysml_vocab:Namespace](https://www.omg.org/spec/SysML/20230201/vocab#Namespace)| <p>The Namespace into which Memberships are imported by this Import, which must be the <code>owningRelatedElement</code> of the Import.</p> <br>| <p>The Namespace into which Memberships are imported by this Import, which must be the <code>owningRelatedElement</code> of the Import.</p> <br>|



### ExhibitStateUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ExhibitStateUsage

type: Shape

target class: [sysml_vocab:ExhibitStateUsage](https://www.omg.org/spec/SysML/20230201/vocab#ExhibitStateUsage)

definition of vocabulary class : <p>An <code>ExhibitStateUsage</code> is a <code>StateUsage</code> that represents the exhibiting of a <code>StateUsage</code>. Unless it is the <code>StateUsage</code> itself, the <code>StateUsage</code> to be exhibited is related to the <code>ExhibitStateUsage</code> by a <code>ReferenceSubsetting</code> <code>Relationship</code>. An <code>ExhibitStateUsage</code> is also a <code>PerformActionUsage</code>, with its <code>exhibitedState</code> as the <code>performedAction</code>.</p><br><br>owningType <> null and<br>(owningType.oclIsKindOf(PartDefinition) or<br> owningType.oclIsKindOf(PartUsage)) implies<br>    specializesFromLibrary('Parts::Part::exhibitedStates')<br>ownedReferenceSubsetting <> null implies<br>    ownedReferenceSubsetting.referencedFeature.oclIsKindOf(StateUsage)

description: <p>An <code>ExhibitStateUsage</code> is a <code>StateUsage</code> that represents the exhibiting of a <code>StateUsage</code>. Unless it is the <code>StateUsage</code> itself, the <code>StateUsage</code> to be exhibited is related to the <code>ExhibitStateUsage</code> by a <code>ReferenceSubsetting</code> <code>Relationship</code>. An <code>ExhibitStateUsage</code> is also a <code>PerformActionUsage</code>, with its <code>exhibitedState</code> as the <code>performedAction</code>.</p><br><br>owningType <> null and<br>(owningType.oclIsKindOf(PartDefinition) or<br> owningType.oclIsKindOf(PartUsage)) implies<br>    specializesFromLibrary('Parts::Part::exhibitedStates')<br>ownedReferenceSubsetting <> null implies<br>    ownedReferenceSubsetting.referencedFeature.oclIsKindOf(StateUsage)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:exhibitStateUsageExhibitedState](https://www.omg.org/spec/SysML/20230201/vocab#exhibitStateUsageExhibitedState)| [1]| [sysml_vocab:StateUsage](https://www.omg.org/spec/SysML/20230201/vocab#StateUsage)| <p>The <code>StateUsage</code> to be exhibited by the <code>ExhibitStateUsage</code>. It is the <code>performedAction</code> of the <code>ExhibitStateUsage</code> considered as a <code>PerformActionUsage</code>, which must be a <code>StateUsage</code>.</p>| <p>The <code>StateUsage</code> to be exhibited by the <code>ExhibitStateUsage</code>. It is the <code>performedAction</code> of the <code>ExhibitStateUsage</code> considered as a <code>PerformActionUsage</code>, which must be a <code>StateUsage</code>.</p>|



### Association

URI: https://www.omg.org/spec/SysML/20230201/shapes#Association

type: Shape

target class: [sysml_vocab:Association](https://www.omg.org/spec/SysML/20230201/vocab#Association)

definition of vocabulary class : <p>An <code>Association</code> is a <code>Relationship</code> and a <code>Classifier</code> to enable classification of links between things (in the universe). The co-domains (<code>types</code>) of the <code>associationEnd</code> <code>Features</code> are the <code>relatedTypes</code>, as co-domain and participants (linked things) of an <code>Association</code> identify each other.</p><br><br>relatedType = associationEnd.type<br>specializesFromLibrary('Links::Link')<br>oclIsKindOf(Structure) = oclIsKindOf(AssociationStructure)<br>associationEnd->size() = 2 implies<br>    specializesFromLibrary('Links::BinaryLink')<br>not isAbstract implies relatedType->size() >= 2<br>associationEnds->size() > 2 implies<br>    not specializesFromLibrary('Links::BinaryLink')<br>sourceType =<br>    if relatedType->isEmpty() then null<br>    else relatedType->first() endif<br>targetType =<br>    if relatedType->size() < 2 then OrderedSet{}<br>    else <br>        relatedType-><br>            subSequence(2, relatedType->size())-><br>            asOrderedSet() <br>    endif

description: <p>An <code>Association</code> is a <code>Relationship</code> and a <code>Classifier</code> to enable classification of links between things (in the universe). The co-domains (<code>types</code>) of the <code>associationEnd</code> <code>Features</code> are the <code>relatedTypes</code>, as co-domain and participants (linked things) of an <code>Association</code> identify each other.</p><br><br>relatedType = associationEnd.type<br>specializesFromLibrary('Links::Link')<br>oclIsKindOf(Structure) = oclIsKindOf(AssociationStructure)<br>associationEnd->size() = 2 implies<br>    specializesFromLibrary('Links::BinaryLink')<br>not isAbstract implies relatedType->size() >= 2<br>associationEnds->size() > 2 implies<br>    not specializesFromLibrary('Links::BinaryLink')<br>sourceType =<br>    if relatedType->isEmpty() then null<br>    else relatedType->first() endif<br>targetType =<br>    if relatedType->size() < 2 then OrderedSet{}<br>    else <br>        relatedType-><br>            subSequence(2, relatedType->size())-><br>            asOrderedSet() <br>    endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:associationRelatedType](https://www.omg.org/spec/SysML/20230201/vocab#associationRelatedType)| [0..*]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The <code>types</code> of the <code>associationEnds</code> of the <code>Association</code>, which are the <code>relatedElements</code> of the <code>Association</code> considered as a <code>Relationship</code>.</p><br>| <p>The <code>types</code> of the <code>associationEnds</code> of the <code>Association</code>, which are the <code>relatedElements</code> of the <code>Association</code> considered as a <code>Relationship</code>.</p><br>|
| [sysml_vocab:associationSourceType](https://www.omg.org/spec/SysML/20230201/vocab#associationSourceType)| [0..1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The source <code>relatedType</code> for this <code>Association</code>. It is the first <code>relatedType</code> of the <code>Association</code>.</p><br>| <p>The source <code>relatedType</code> for this <code>Association</code>. It is the first <code>relatedType</code> of the <code>Association</code>.</p><br>|
| [sysml_vocab:associationTargetType](https://www.omg.org/spec/SysML/20230201/vocab#associationTargetType)| [0..*]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The target <code>relatedTypes</code> for this <code>Association</code>. This includes all the <code>relatedTypes</code> other than the <code>sourceType</code>.</p> <br>| <p>The target <code>relatedTypes</code> for this <code>Association</code>. This includes all the <code>relatedTypes</code> other than the <code>sourceType</code>.</p> <br>|
| [sysml_vocab:associationAssociationEnd](https://www.omg.org/spec/SysML/20230201/vocab#associationAssociationEnd)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>features</code> of the <code>Association</code> that identify the things that can be related by it. A concrete <code>Association</code> must have at least two <code>associationEnds</code>. When it has exactly two, the <code>Association</code> is called a <em>binary</em> <code>Association</code>.</p> <br><br><p>The ends of the Association determine which elements are eligible to be related by instances of the Association.</p><br>| <p>The <code>features</code> of the <code>Association</code> that identify the things that can be related by it. A concrete <code>Association</code> must have at least two <code>associationEnds</code>. When it has exactly two, the <code>Association</code> is called a <em>binary</em> <code>Association</code>.</p> <br><br><p>The ends of the Association determine which elements are eligible to be related by instances of the Association.</p><br>|



### IfActionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#IfActionUsage

type: Shape

target class: [sysml_vocab:IfActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#IfActionUsage)

definition of vocabulary class : <p>An <code>IfActionUsage</code> is an <code>ActionUsage</code> that specifies that the <code>thenAction</code> <code>ActionUsage</code> should be performed if the result of the <code>ifArgument</code> <code>Expression</code> is true. It may also optionally specify an <code>elseAction</code> <code>ActionUsage</code> that is performed if the result of the <code>ifArgument</code> is false.</p><br>thenAction = <br>    let parameter : Feature = inputParameter(2) in<br>    if parameter <> null and parameter.oclIsKindOf(ActionUsage) then<br>        parameter.oclAsType(ActionUsage)<br>    else<br>        null<br>    endif<br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::ifSubactions')<br>if elseAction = null then<br>    specializesFromLibrary('Actions::ifThenActions')<br>else<br>    specializesFromLibrary('Actions::ifThenElseActions')<br>endif<br>ifArgument = <br>    let parameter : Feature = inputParameter(1) in<br>    if parameter <> null and parameter.oclIsKindOf(Expression) then<br>        parameter.oclAsType(Expression)<br>    else<br>        null<br>    endif<br>elseAction = <br>    let parameter : Feature = inputParameter(3) in<br>    if parameter <> null and parameter.oclIsKindOf(ActionUsage) then<br>        parameter.oclAsType(ActionUsage)<br>    else<br>        null<br>    endif<br>inputParameters()->size() >= 2

description: <p>An <code>IfActionUsage</code> is an <code>ActionUsage</code> that specifies that the <code>thenAction</code> <code>ActionUsage</code> should be performed if the result of the <code>ifArgument</code> <code>Expression</code> is true. It may also optionally specify an <code>elseAction</code> <code>ActionUsage</code> that is performed if the result of the <code>ifArgument</code> is false.</p><br>thenAction = <br>    let parameter : Feature = inputParameter(2) in<br>    if parameter <> null and parameter.oclIsKindOf(ActionUsage) then<br>        parameter.oclAsType(ActionUsage)<br>    else<br>        null<br>    endif<br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::ifSubactions')<br>if elseAction = null then<br>    specializesFromLibrary('Actions::ifThenActions')<br>else<br>    specializesFromLibrary('Actions::ifThenElseActions')<br>endif<br>ifArgument = <br>    let parameter : Feature = inputParameter(1) in<br>    if parameter <> null and parameter.oclIsKindOf(Expression) then<br>        parameter.oclAsType(Expression)<br>    else<br>        null<br>    endif<br>elseAction = <br>    let parameter : Feature = inputParameter(3) in<br>    if parameter <> null and parameter.oclIsKindOf(ActionUsage) then<br>        parameter.oclAsType(ActionUsage)<br>    else<br>        null<br>    endif<br>inputParameters()->size() >= 2

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:ifActionUsageElseAction](https://www.omg.org/spec/SysML/20230201/vocab#ifActionUsageElseAction)| [0..1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> that is to be performed if the result of the <code>ifArgument</code> is false. It is the (optional) third <code>parameter</code> of the <code>IfActionUsage</code>.</p> <br>| <p>The <code>ActionUsage</code> that is to be performed if the result of the <code>ifArgument</code> is false. It is the (optional) third <code>parameter</code> of the <code>IfActionUsage</code>.</p> <br>|
| [sysml_vocab:ifActionUsageThenAction](https://www.omg.org/spec/SysML/20230201/vocab#ifActionUsageThenAction)| [1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> that is to be performed if the result of the <code>ifArgument</code> is true. It is the second <code>parameter<code> of the <code>IfActionUsage</code>.</p> <br>| <p>The <code>ActionUsage</code> that is to be performed if the result of the <code>ifArgument</code> is true. It is the second <code>parameter<code> of the <code>IfActionUsage</code>.</p> <br>|
| [sysml_vocab:ifActionUsageIfArgument](https://www.omg.org/spec/SysML/20230201/vocab#ifActionUsageIfArgument)| [1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>Expression</code> whose result determines whether the <code>thenAction</code> or (optionally) the <code>elseAction</code> is performed. It is the first <code>parameter<code> of the <code>IfActionUsage</code>.</p> <br>| <p>The <code>Expression</code> whose result determines whether the <code>thenAction</code> or (optionally) the <code>elseAction</code> is performed. It is the first <code>parameter<code> of the <code>IfActionUsage</code>.</p> <br>|



### UseCaseUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#UseCaseUsage

type: Shape

target class: [sysml_vocab:UseCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#UseCaseUsage)

definition of vocabulary class : <p>A <code>UseCaseUsage</code> is a <code>Usage</code> of a <code>UseCaseDefinition</code>.</p><br>includedUseCase = ownedUseCase-><br>    selectByKind(IncludeUseCaseUsage).<br>    useCaseIncluded<br>specializesFromLibrary('UseCases::useCases')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(UseCaseDefinition) or<br> owningType.oclIsKindOf(UseCaseUsage)) implies<br>    specializesFromLibrary('UseCases::UseCase::subUseCases')

description: <p>A <code>UseCaseUsage</code> is a <code>Usage</code> of a <code>UseCaseDefinition</code>.</p><br>includedUseCase = ownedUseCase-><br>    selectByKind(IncludeUseCaseUsage).<br>    useCaseIncluded<br>specializesFromLibrary('UseCases::useCases')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(UseCaseDefinition) or<br> owningType.oclIsKindOf(UseCaseUsage)) implies<br>    specializesFromLibrary('UseCases::UseCase::subUseCases')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:useCaseUsageUseCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#useCaseUsageUseCaseDefinition)| [0..1]| [sysml_vocab:UseCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#UseCaseDefinition)| <p>The <code>UseCaseDefinition</code> that is the <code>definition</code> of this <code>UseCaseUsage</code>.</p>| <p>The <code>UseCaseDefinition</code> that is the <code>definition</code> of this <code>UseCaseUsage</code>.</p>|
| [sysml_vocab:useCaseUsageIncludedUseCase](https://www.omg.org/spec/SysML/20230201/vocab#useCaseUsageIncludedUseCase)| [0..*]| [sysml_vocab:UseCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#UseCaseUsage)| <p>The <code>UseCaseUsages</code> that are included by this <code>UseCaseUse</code>, which are the <code>useCaseIncludeds</code> of the <code>IncludeUseCaseUsages</code> owned by this <code>UseCaseUsage<code>.</p>| <p>The <code>UseCaseUsages</code> that are included by this <code>UseCaseUse</code>, which are the <code>useCaseIncludeds</code> of the <code>IncludeUseCaseUsages</code> owned by this <code>UseCaseUsage<code>.</p>|



### PortConjugation

URI: https://www.omg.org/spec/SysML/20230201/shapes#PortConjugation

type: Shape

target class: [sysml_vocab:PortConjugation](https://www.omg.org/spec/SysML/20230201/vocab#PortConjugation)

definition of vocabulary class : <p>A <code>PortConjugation</code> is a <code>Conjugation</code> <code>Relationship</code> between a <code>PortDefinition</code> and its corresponding <code>ConjugatedPortDefinition</code>. As a result of this <code>Relationship</code>, the <code>ConjugatedPortDefinition</code> inherits all the <code>features</code> of the original <code>PortDefinition</code>, but input <code>flows</code> of the original <code>PortDefinition</code> become outputs on the <code>ConjugatedPortDefinition</code> and output <code>flows</code> of the original <code>PortDefinition</code> become inputs on the <code>ConjugatedPortDefinition</code>.</code></p><br>

description: <p>A <code>PortConjugation</code> is a <code>Conjugation</code> <code>Relationship</code> between a <code>PortDefinition</code> and its corresponding <code>ConjugatedPortDefinition</code>. As a result of this <code>Relationship</code>, the <code>ConjugatedPortDefinition</code> inherits all the <code>features</code> of the original <code>PortDefinition</code>, but input <code>flows</code> of the original <code>PortDefinition</code> become outputs on the <code>ConjugatedPortDefinition</code> and output <code>flows</code> of the original <code>PortDefinition</code> become inputs on the <code>ConjugatedPortDefinition</code>.</code></p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:portConjugationOriginalPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#portConjugationOriginalPortDefinition)| [1]| [sysml_vocab:PortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#PortDefinition)| <p>The <code>PortDefinition</code> being conjugated.</p>| <p>The <code>PortDefinition</code> being conjugated.</p>|
| [sysml_vocab:portConjugationConjugatedPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#portConjugationConjugatedPortDefinition)| [1]| [sysml_vocab:ConjugatedPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ConjugatedPortDefinition)| <p>The <code>ConjugatedPortDefinition</code> that is conjugate to the <code>originalPortDefinition</code>.</p>| <p>The <code>ConjugatedPortDefinition</code> that is conjugate to the <code>originalPortDefinition</code>.</p>|



### CalculationDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#CalculationDefinition

type: Shape

target class: [sysml_vocab:CalculationDefinition](https://www.omg.org/spec/SysML/20230201/vocab#CalculationDefinition)

definition of vocabulary class : <p>A <code>CalculationDefinition</code> is an <coed>ActionDefinition</code> that also defines a <code>Function</code> producing a <code>result</code>.</p><br>specializesFromLibrary('Calculations::Calculation')<br>calculation = action->selectByKind(CalculationUsage)

description: <p>A <code>CalculationDefinition</code> is an <coed>ActionDefinition</code> that also defines a <code>Function</code> producing a <code>result</code>.</p><br>specializesFromLibrary('Calculations::Calculation')<br>calculation = action->selectByKind(CalculationUsage)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:calculationDefinitionCalculation](https://www.omg.org/spec/SysML/20230201/vocab#calculationDefinitionCalculation)| [0..*]| [sysml_vocab:CalculationUsage](https://www.omg.org/spec/SysML/20230201/vocab#CalculationUsage)| <p>The <code>actions</code> of this <code>CalculationDefinition</code> that are <code>CalculationUsages</code>.</p>| <p>The <code>actions</code> of this <code>CalculationDefinition</code> that are <code>CalculationUsages</code>.</p>|



### ConstraintUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ConstraintUsage

type: Shape

target class: [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)

definition of vocabulary class : <p>A <code>ConstraintUsage</code> is an <code>OccurrenceUsage</code> that is also a <code>BooleanExpression</code>, and, so, is typed by a <code>Predicate</code>. Nominally, if the type is a <code>ConstraintDefinition</code>, a <code>ConstraintUsage</code> is a <code>Usage</code> of that <code>ConstraintDefinition</code>. However, other kinds of kernel <code>Predicates</code> are also allowed, to permit use of <code>Predicates</code> from the Kernel Model Libraries.</p><br>owningFeatureMembership <> null and<br>owningFeatureMembership.oclIsKindOf(RequirementConstraintMembership) implies<br>    if owningFeatureMembership.oclAsType(RequirementConstraintMembership).kind = <br>        RequirementConstraintKind::assumption then<br>        specializesFromLibrary('Requirements::RequirementCheck::assumptions')<br>    else<br>        specializesFromLibrary('Requirements::RequirementCheck::constraints')<br>    endif<br>specializesFromLibrary('Constraints::constraintChecks')<br>owningType <> null and<br>(owningType.oclIsKindOf(ItemDefinition) or<br> owningType.oclIsKindOf(ItemUsage)) implies<br>    specializesFromLibrary('Items::Item::checkedConstraints')

description: <p>A <code>ConstraintUsage</code> is an <code>OccurrenceUsage</code> that is also a <code>BooleanExpression</code>, and, so, is typed by a <code>Predicate</code>. Nominally, if the type is a <code>ConstraintDefinition</code>, a <code>ConstraintUsage</code> is a <code>Usage</code> of that <code>ConstraintDefinition</code>. However, other kinds of kernel <code>Predicates</code> are also allowed, to permit use of <code>Predicates</code> from the Kernel Model Libraries.</p><br>owningFeatureMembership <> null and<br>owningFeatureMembership.oclIsKindOf(RequirementConstraintMembership) implies<br>    if owningFeatureMembership.oclAsType(RequirementConstraintMembership).kind = <br>        RequirementConstraintKind::assumption then<br>        specializesFromLibrary('Requirements::RequirementCheck::assumptions')<br>    else<br>        specializesFromLibrary('Requirements::RequirementCheck::constraints')<br>    endif<br>specializesFromLibrary('Constraints::constraintChecks')<br>owningType <> null and<br>(owningType.oclIsKindOf(ItemDefinition) or<br> owningType.oclIsKindOf(ItemUsage)) implies<br>    specializesFromLibrary('Items::Item::checkedConstraints')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:constraintUsageConstraintDefinition](https://www.omg.org/spec/SysML/20230201/vocab#constraintUsageConstraintDefinition)| [0..1]| [sysml_vocab:Predicate](https://www.omg.org/spec/SysML/20230201/vocab#Predicate)| <p>The (single) <code>Predicate</code> that is the type of this <code>ConstraintUsage</code>. Nominally, this will be a <code>ConstraintDefinition</code>, but other kinds of <code>Predicates</code> are also allowed, to permit use of <code>Predicates</code> from the Kernel Model Libraries.</p>| <p>The (single) <code>Predicate</code> that is the type of this <code>ConstraintUsage</code>. Nominally, this will be a <code>ConstraintDefinition</code>, but other kinds of <code>Predicates</code> are also allowed, to permit use of <code>Predicates</code> from the Kernel Model Libraries.</p>|



### AnalysisCaseDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#AnalysisCaseDefinition

type: Shape

target class: [sysml_vocab:AnalysisCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#AnalysisCaseDefinition)

definition of vocabulary class : <p>An <code>AnalysisCaseDefinition</code> is a <code>CaseDefinition</code> for the case of carrying out an analysis.</p><br>analysisAction = action->select(<br>    isComposite and <br>    specializes('AnalysisCases::AnalysisAction'))<br>resultExpression =<br>    let results : OrderedSet(ResultExpressionMembership) =<br>        featureMembersip-><br>            selectByKind(ResultExpressionMembership) in<br>    if results->isEmpty() then null<br>    else results->first().ownedResultExpression<br>    endif<br>specializesFromLibrary('AnalysisCases::AnalysisCase')

description: <p>An <code>AnalysisCaseDefinition</code> is a <code>CaseDefinition</code> for the case of carrying out an analysis.</p><br>analysisAction = action->select(<br>    isComposite and <br>    specializes('AnalysisCases::AnalysisAction'))<br>resultExpression =<br>    let results : OrderedSet(ResultExpressionMembership) =<br>        featureMembersip-><br>            selectByKind(ResultExpressionMembership) in<br>    if results->isEmpty() then null<br>    else results->first().ownedResultExpression<br>    endif<br>specializesFromLibrary('AnalysisCases::AnalysisCase')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:analysisCaseDefinitionAnalysisAction](https://www.omg.org/spec/SysML/20230201/vocab#analysisCaseDefinitionAnalysisAction)| [0..*]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The composite <code>actions</code> of the <code>AnalysisCaseDefinition</code> that are defined as <code>AnalysisActions</code>.</p>| <p>The composite <code>actions</code> of the <code>AnalysisCaseDefinition</code> that are defined as <code>AnalysisActions</code>.</p>|
| [sysml_vocab:analysisCaseDefinitionResultExpression](https://www.omg.org/spec/SysML/20230201/vocab#analysisCaseDefinitionResultExpression)| [0..1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>An <code>Expression</code> used to compute the <code>result</code> of the <code>AnalysisCaseDefinition</code>, owned via a <code>ResultExpressionMembership</code>.</p><br>| <p>An <code>Expression</code> used to compute the <code>result</code> of the <code>AnalysisCaseDefinition</code>, owned via a <code>ResultExpressionMembership</code>.</p><br>|



### AnnotatingElement

URI: https://www.omg.org/spec/SysML/20230201/shapes#AnnotatingElement

type: Shape

target class: [sysml_vocab:AnnotatingElement](https://www.omg.org/spec/SysML/20230201/vocab#AnnotatingElement)

definition of vocabulary class : <p>An <code>AnnotatingElement</code> is an <code>Element</code> that provides additional description of or metadata on some other <code>Element</code>. An <code>AnnotatingElement</code> is either attached to its <code>annotatedElements</code> by <code>Annotation</code> <code>Relationships</code>, or it implicitly annotates its <code>owningNamespace</code>.</p><br><br>annotatedElement = <br> if annotation->notEmpty() then annotation.annotatedElement<br> else Sequence{owningNamespace} endif<br>ownedAnnotatingRelationship = ownedRelationship-><br>    selectByKind(Annotation)-><br>    select(a | a.annotatingElement = self)

description: <p>An <code>AnnotatingElement</code> is an <code>Element</code> that provides additional description of or metadata on some other <code>Element</code>. An <code>AnnotatingElement</code> is either attached to its <code>annotatedElements</code> by <code>Annotation</code> <code>Relationships</code>, or it implicitly annotates its <code>owningNamespace</code>.</p><br><br>annotatedElement = <br> if annotation->notEmpty() then annotation.annotatedElement<br> else Sequence{owningNamespace} endif<br>ownedAnnotatingRelationship = ownedRelationship-><br>    selectByKind(Annotation)-><br>    select(a | a.annotatingElement = self)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:annotatingElementAnnotatedElement](https://www.omg.org/spec/SysML/20230201/vocab#annotatingElementAnnotatedElement)| [1..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <code>Elements</code> that are annotated by this <code>AnnotatingElement</code>. If <code>annotation</code> is not empty, these are the <code>annotatedElements</code> of the <code>annotations</code>. If <code>annotation</code> is empty, then it is the <code>owningNamespace</code> of the <code>AnnotatingElement</code>.</p><br>| <p>The <code>Elements</code> that are annotated by this <code>AnnotatingElement</code>. If <code>annotation</code> is not empty, these are the <code>annotatedElements</code> of the <code>annotations</code>. If <code>annotation</code> is empty, then it is the <code>owningNamespace</code> of the <code>AnnotatingElement</code>.</p><br>|
| [sysml_vocab:annotatingElementOwnedAnnotatingRelationship](https://www.omg.org/spec/SysML/20230201/vocab#annotatingElementOwnedAnnotatingRelationship)| [0..*]| [sysml_vocab:Annotation](https://www.omg.org/spec/SysML/20230201/vocab#Annotation)| <p>The <code>ownedRelationships</code> of this <code>AnnotatingElement</code> that are <code>Annotations</code>, for which this <code>AnnotatingElement</code> is the <code>annotatingElement</code>.</p>| <p>The <code>ownedRelationships</code> of this <code>AnnotatingElement</code> that are <code>Annotations</code>, for which this <code>AnnotatingElement</code> is the <code>annotatingElement</code>.</p>|
| [sysml_vocab:annotatingElementAnnotation](https://www.omg.org/spec/SysML/20230201/vocab#annotatingElementAnnotation)| [0..*]| [sysml_vocab:Annotation](https://www.omg.org/spec/SysML/20230201/vocab#Annotation)| <p>The <code>Annotations</code> that relate this <code>AnnotatingElement</code> to its <code>annotatedElements</code>.</p><br>| <p>The <code>Annotations</code> that relate this <code>AnnotatingElement</code> to its <code>annotatedElements</code>.</p><br>|



### AssociationStructure

URI: https://www.omg.org/spec/SysML/20230201/shapes#AssociationStructure

type: Shape

target class: [sysml_vocab:AssociationStructure](https://www.omg.org/spec/SysML/20230201/vocab#AssociationStructure)

definition of vocabulary class : <p>An <code>AssociationStructure</code> is an <code>Association</code> that is also a <code>Structure</code>, classifying link objects that are both links and objects. As objects, link objects can be created and destroyed, and their non-end <code>Features</code> can change over time. However, the values of the end <code>Features</code> of a link object are fixed and cannot change over its lifetime.</p><br>specializesFromLibrary('Objects::LinkObject')<br>endFeature->size() = 2 implies<br>    specializesFromLibrary('Objects::BinaryLinkObject')

description: <p>An <code>AssociationStructure</code> is an <code>Association</code> that is also a <code>Structure</code>, classifying link objects that are both links and objects. As objects, link objects can be created and destroyed, and their non-end <code>Features</code> can change over time. However, the values of the end <code>Features</code> of a link object are fixed and cannot change over its lifetime.</p><br>specializesFromLibrary('Objects::LinkObject')<br>endFeature->size() = 2 implies<br>    specializesFromLibrary('Objects::BinaryLinkObject')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### ViewpointDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#ViewpointDefinition

type: Shape

target class: [sysml_vocab:ViewpointDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ViewpointDefinition)

definition of vocabulary class : <p>A <code>ViewpointDefinition</code> is a <code>RequirementDefinition</code> that specifies one or more stakeholder concerns that are to be satisfied by creating a view of a model.</p><br>viewpointStakeholder = framedConcern.featureMemberhsip-><br>    selectByKind(StakeholderMembership).<br>    ownedStakeholderParameter<br>specializesFromLibrary('Views::Viewpoint')

description: <p>A <code>ViewpointDefinition</code> is a <code>RequirementDefinition</code> that specifies one or more stakeholder concerns that are to be satisfied by creating a view of a model.</p><br>viewpointStakeholder = framedConcern.featureMemberhsip-><br>    selectByKind(StakeholderMembership).<br>    ownedStakeholderParameter<br>specializesFromLibrary('Views::Viewpoint')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:viewpointDefinitionViewpointStakeholder](https://www.omg.org/spec/SysML/20230201/vocab#viewpointDefinitionViewpointStakeholder)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The <code>PartUsages</code> that identify the stakeholders with concerns framed by this <code>ViewpointDefinition</code>, which are the owned and inherited <code>stakeholderParameters</code> of the <code>framedConcerns</code> of this <code>ViewpointDefinition</code>.</p>| <p>The <code>PartUsages</code> that identify the stakeholders with concerns framed by this <code>ViewpointDefinition</code>, which are the owned and inherited <code>stakeholderParameters</code> of the <code>framedConcerns</code> of this <code>ViewpointDefinition</code>.</p>|



### ConnectorAsUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ConnectorAsUsage

type: Shape

target class: [sysml_vocab:ConnectorAsUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConnectorAsUsage)

definition of vocabulary class : <p>A <code>ConnectorAsUsage</code> is both a <code>Connector</code> and a <code>Usage</code>. <code>ConnectorAsUsage</code> cannot itself be instantiated in a SysML model, but it is the base class for the concrete classes <code>BindingConnectorAsUsage</code>, <code>SuccessionAsUsage</code> and <code>ConnectionUsage</code>.</p>

description: <p>A <code>ConnectorAsUsage</code> is both a <code>Connector</code> and a <code>Usage</code>. <code>ConnectorAsUsage</code> cannot itself be instantiated in a SysML model, but it is the base class for the concrete classes <code>BindingConnectorAsUsage</code>, <code>SuccessionAsUsage</code> and <code>ConnectionUsage</code>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### NamespaceExpose

URI: https://www.omg.org/spec/SysML/20230201/shapes#NamespaceExpose

type: Shape

target class: [sysml_vocab:NamespaceExpose](https://www.omg.org/spec/SysML/20230201/vocab#NamespaceExpose)

definition of vocabulary class : <p>A <code>NamespaceExpose</code> is an <code>Expose</code> <code>Relationship</code> that exposes the <code>Memberships</code> of a specific <code>importedNamespace</code> and, if <code>isRecursive = true</code>, additional <code>Memberships</code> recursively.</p>

description: <p>A <code>NamespaceExpose</code> is an <code>Expose</code> <code>Relationship</code> that exposes the <code>Memberships</code> of a specific <code>importedNamespace</code> and, if <code>isRecursive = true</code>, additional <code>Memberships</code> recursively.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### AssertConstraintUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#AssertConstraintUsage

type: Shape

target class: [sysml_vocab:AssertConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#AssertConstraintUsage)

definition of vocabulary class : <p>An <code>AssertConstraintUsage</code> is a <code>ConstraintUsage</code> that is also an <code>Invariant</code> and, so, is asserted to be true (by default). Unless it is the <code>AssertConstraintUsage</code> itself, the asserted <code>ConstraintUsage</code> is related to the <code>AssertConstraintUsage</code> by a ReferenceSubsetting <code>Relationship</code>.</p><br>assertedConstraint =<br>    if ownedReferenceSubsetting = null then self<br>    else ownedReferenceSubsetting.referencedFeature.oclAsType(ConstraintUsage)<br>    endif<br>if isNegated then<br>    specializesFromLibrary('Constraints::negatedConstraints')<br>else<br>    specializesFromLibrary('Constraints::assertedConstraints')<br>endif<br>ownedReferenceSubsetting <> null implies<br>    ownedReferenceSubsetting.referencedFeature.oclIsKindOf(ConstraintUsage)

description: <p>An <code>AssertConstraintUsage</code> is a <code>ConstraintUsage</code> that is also an <code>Invariant</code> and, so, is asserted to be true (by default). Unless it is the <code>AssertConstraintUsage</code> itself, the asserted <code>ConstraintUsage</code> is related to the <code>AssertConstraintUsage</code> by a ReferenceSubsetting <code>Relationship</code>.</p><br>assertedConstraint =<br>    if ownedReferenceSubsetting = null then self<br>    else ownedReferenceSubsetting.referencedFeature.oclAsType(ConstraintUsage)<br>    endif<br>if isNegated then<br>    specializesFromLibrary('Constraints::negatedConstraints')<br>else<br>    specializesFromLibrary('Constraints::assertedConstraints')<br>endif<br>ownedReferenceSubsetting <> null implies<br>    ownedReferenceSubsetting.referencedFeature.oclIsKindOf(ConstraintUsage)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:assertConstraintUsageAssertedConstraint](https://www.omg.org/spec/SysML/20230201/vocab#assertConstraintUsageAssertedConstraint)| [1]| [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)| <p>The <code>ConstraintUsage</code> to be performed by the <code>AssertConstraintUsage</code>. It is the <code>referenceFeature</code> of the <code>ownedReferenceSubsetting</code> for the <code>AssertConstraintUsage</code>, if there is one, and, otherwise, the <code>AssertConstraintUsage</code> itself.</p>| <p>The <code>ConstraintUsage</code> to be performed by the <code>AssertConstraintUsage</code>. It is the <code>referenceFeature</code> of the <code>ownedReferenceSubsetting</code> for the <code>AssertConstraintUsage</code>, if there is one, and, otherwise, the <code>AssertConstraintUsage</code> itself.</p>|



### LibraryPackage

URI: https://www.omg.org/spec/SysML/20230201/shapes#LibraryPackage

type: Shape

target class: [sysml_vocab:LibraryPackage](https://www.omg.org/spec/SysML/20230201/vocab#LibraryPackage)

definition of vocabulary class : <p>A <code>LibraryPackage</code> is a <code>Package</code> that is the container for a model library. A <code>LibraryPackage</code> is itself a library <code>Element</code> as are all <code>Elements</code> that are directly or indirectly contained in it.</p><br>

description: <p>A <code>LibraryPackage</code> is a <code>Package</code> that is the container for a model library. A <code>LibraryPackage</code> is itself a library <code>Element</code> as are all <code>Elements</code> that are directly or indirectly contained in it.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:libraryPackageIsStandard](https://www.omg.org/spec/SysML/20230201/vocab#libraryPackageIsStandard)| [1]| Boolean| <p>Whether this <code>LibraryPackage</code> contains a standard library model. This should only be set to true for <code>LibraryPackages</code> in the standard Kernel Model Libraries or in normative model libraries for a language built on KerML.</p>| <p>Whether this <code>LibraryPackage</code> contains a standard library model. This should only be set to true for <code>LibraryPackages</code> in the standard Kernel Model Libraries or in normative model libraries for a language built on KerML.</p>|



### PortUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#PortUsage

type: Shape

target class: [sysml_vocab:PortUsage](https://www.omg.org/spec/SysML/20230201/vocab#PortUsage)

definition of vocabulary class : <p>A <code>PortUsage</code> is a usage of a <code>PortDefinition</code>. A <code>PortUsage</code> itself as well as all its <code>nestedUsages</code> must be referential (non-composite).</p><br>nestedUsage-><br>    reject(oclIsKindOf(PortUsage))-><br>    forAll(not isComposite)<br>specializesFromLibrary('Ports::ports')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(PortDefinition) or<br> owningType.oclIsKindOf(PortUsage)) implies<br>    specializesFromLibrary('Ports::Port::subports')<br>owningType = null or<br>not owningType.oclIsKindOf(PortDefinition) and<br>not owningType.oclIsKindOf(PortUsage) implies<br>    isReference

description: <p>A <code>PortUsage</code> is a usage of a <code>PortDefinition</code>. A <code>PortUsage</code> itself as well as all its <code>nestedUsages</code> must be referential (non-composite).</p><br>nestedUsage-><br>    reject(oclIsKindOf(PortUsage))-><br>    forAll(not isComposite)<br>specializesFromLibrary('Ports::ports')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(PortDefinition) or<br> owningType.oclIsKindOf(PortUsage)) implies<br>    specializesFromLibrary('Ports::Port::subports')<br>owningType = null or<br>not owningType.oclIsKindOf(PortDefinition) and<br>not owningType.oclIsKindOf(PortUsage) implies<br>    isReference

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:portUsagePortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#portUsagePortDefinition)| [0..*]| [sysml_vocab:PortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#PortDefinition)| <p>The <code>occurrenceDefinitions</code> of this <code>PortUsage</code>, which must all be <code>PortDefinitions<code>.</p>| <p>The <code>occurrenceDefinitions</code> of this <code>PortUsage</code>, which must all be <code>PortDefinitions<code>.</p>|



### Disjoining

URI: https://www.omg.org/spec/SysML/20230201/shapes#Disjoining

type: Shape

target class: [sysml_vocab:Disjoining](https://www.omg.org/spec/SysML/20230201/vocab#Disjoining)

definition of vocabulary class : <p>A <code>Disjoining</code> is a <code>Relationship</code> between <code>Types</code> asserted to have interpretations that are not shared (disjoint) between them, identified as <code>typeDisjoined</code> and <code>disjoiningType</code>. For example, a <code>Classifier</code> for mammals is disjoint from a <code>Classifier</code> for minerals, and a <code>Feature</code> for people&#39;s parents is disjoint from a <code>Feature</code> for their children.</p><br>

description: <p>A <code>Disjoining</code> is a <code>Relationship</code> between <code>Types</code> asserted to have interpretations that are not shared (disjoint) between them, identified as <code>typeDisjoined</code> and <code>disjoiningType</code>. For example, a <code>Classifier</code> for mammals is disjoint from a <code>Classifier</code> for minerals, and a <code>Feature</code> for people&#39;s parents is disjoint from a <code>Feature</code> for their children.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:disjoiningTypeDisjoined](https://www.omg.org/spec/SysML/20230201/vocab#disjoiningTypeDisjoined)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p><code>Type</code> asserted to be disjoint with the <code>disjoiningType</code>.</p><br>| <p><code>Type</code> asserted to be disjoint with the <code>disjoiningType</code>.</p><br>|
| [sysml_vocab:disjoiningDisjoiningType](https://www.omg.org/spec/SysML/20230201/vocab#disjoiningDisjoiningType)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p><code>Type</code> asserted to be disjoint with the <code>typeDisjoined</code>.</p><br>| <p><code>Type</code> asserted to be disjoint with the <code>typeDisjoined</code>.</p><br>|
| [sysml_vocab:disjoiningOwningType](https://www.omg.org/spec/SysML/20230201/vocab#disjoiningOwningType)| [0..1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>A <code>typeDisjoined</code> that is also an <code>owningRelatedElement</code>.</p>| <p>A <code>typeDisjoined</code> that is also an <code>owningRelatedElement</code>.</p>|



### ParameterMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#ParameterMembership

type: Shape

target class: [sysml_vocab:ParameterMembership](https://www.omg.org/spec/SysML/20230201/vocab#ParameterMembership)

definition of vocabulary class : <p>A <code>ParameterMembership</code> is a <code>FeatureMembership</code> that identifies its <code>memberFeature</code> as a parameter, which is always owned, and must have a <code>direction</code>. A <code>ParameterMembership</code> must be owned by a <code>Behavior</code> or a <code>Step</code>.</p><br>ownedMemberParameter.direction = parameterDirection()<br>owningType.oclIsKindOf(Behavior) or owningType.oclIsKindOf(Step)

description: <p>A <code>ParameterMembership</code> is a <code>FeatureMembership</code> that identifies its <code>memberFeature</code> as a parameter, which is always owned, and must have a <code>direction</code>. A <code>ParameterMembership</code> must be owned by a <code>Behavior</code> or a <code>Step</code>.</p><br>ownedMemberParameter.direction = parameterDirection()<br>owningType.oclIsKindOf(Behavior) or owningType.oclIsKindOf(Step)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:parameterMembershipOwnedMemberParameter](https://www.omg.org/spec/SysML/20230201/vocab#parameterMembershipOwnedMemberParameter)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is identified as a <code>parameter</code> by this <code>ParameterMembership</code>.</p><br>| <p>The <code>Feature</code> that is identified as a <code>parameter</code> by this <code>ParameterMembership</code>.</p><br>|



### Documentation

URI: https://www.omg.org/spec/SysML/20230201/shapes#Documentation

type: Shape

target class: [sysml_vocab:Documentation](https://www.omg.org/spec/SysML/20230201/vocab#Documentation)

definition of vocabulary class : <p><code>Documentation</code> is a <code>Comment</code> that specifically documents a <code>documentedElement</code>, which must be its <code>owner</code>.</p><br>

description: <p><code>Documentation</code> is a <code>Comment</code> that specifically documents a <code>documentedElement</code>, which must be its <code>owner</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:documentationDocumentedElement](https://www.omg.org/spec/SysML/20230201/vocab#documentationDocumentedElement)| [1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <code>Element</code> that is documented by this <code>Documentation</code>.</p><br>| <p>The <code>Element</code> that is documented by this <code>Documentation</code>.</p><br>|



### Multiplicity

URI: https://www.omg.org/spec/SysML/20230201/shapes#Multiplicity

type: Shape

target class: [sysml_vocab:Multiplicity](https://www.omg.org/spec/SysML/20230201/vocab#Multiplicity)

definition of vocabulary class : <p>A <code>Multiplicity</code> is a <code>Feature</code> whose co-domain is a set of natural numbers giving the allowed cardinalities of each <code>typeWithMultiplicity</code>. The <em>cardinality</em> of a <code>Type</code> is defined as follows, depending on whether the <code>Type</code> is a <code>Classifier</code> or <code>Feature</code>.<br><ul><br><li><code>Classifier</code> – The number of basic instances of the <code>Classifier</code>, that is, those instances representing things, which are not instances of any subtypes of the <code>Classifier</code> that are <code>Features</code>.<br><li><code>Features</code> – The number of instances with the same featuring instances. In the case of a <code>Feature</code> with a <code>Classifier</code> as its <code>featuringType</code>, this is the number of values of <code>Feature</code> for each basic instance of the <code>Classifier</code>. Note that, for non-unique <code>Features</code>, all duplicate values are included in this count.</li><br></ul><br><br><p><code>Multiplicity</code> co-domains (in models) can be specified by <code>Expression</code> that might vary in their results. If the <code>typeWithMultiplicity</code> is a <code>Classifier</code>, the domain of the <code>Multiplicity</code> shall be <em><code>Base::Anything</code></em>.  If the <code>typeWithMultiplicity</code> is a <code>Feature</code>,  the <code>Multiplicity</code> shall have the same domain as the <code>typeWithMultiplicity</code>.</p><br><br>if owningType <> null and owningType.oclIsKindOf(Feature) then<br>    featuringType = <br>        owningType.oclAsType(Feature).featuringType<br>else<br>    featuringType->isEmpty()<br>endif<br>specializesFromLibrary('Base::naturals')

description: <p>A <code>Multiplicity</code> is a <code>Feature</code> whose co-domain is a set of natural numbers giving the allowed cardinalities of each <code>typeWithMultiplicity</code>. The <em>cardinality</em> of a <code>Type</code> is defined as follows, depending on whether the <code>Type</code> is a <code>Classifier</code> or <code>Feature</code>.<br><ul><br><li><code>Classifier</code> – The number of basic instances of the <code>Classifier</code>, that is, those instances representing things, which are not instances of any subtypes of the <code>Classifier</code> that are <code>Features</code>.<br><li><code>Features</code> – The number of instances with the same featuring instances. In the case of a <code>Feature</code> with a <code>Classifier</code> as its <code>featuringType</code>, this is the number of values of <code>Feature</code> for each basic instance of the <code>Classifier</code>. Note that, for non-unique <code>Features</code>, all duplicate values are included in this count.</li><br></ul><br><br><p><code>Multiplicity</code> co-domains (in models) can be specified by <code>Expression</code> that might vary in their results. If the <code>typeWithMultiplicity</code> is a <code>Classifier</code>, the domain of the <code>Multiplicity</code> shall be <em><code>Base::Anything</code></em>.  If the <code>typeWithMultiplicity</code> is a <code>Feature</code>,  the <code>Multiplicity</code> shall have the same domain as the <code>typeWithMultiplicity</code>.</p><br><br>if owningType <> null and owningType.oclIsKindOf(Feature) then<br>    featuringType = <br>        owningType.oclAsType(Feature).featuringType<br>else<br>    featuringType->isEmpty()<br>endif<br>specializesFromLibrary('Base::naturals')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Subclassification

URI: https://www.omg.org/spec/SysML/20230201/shapes#Subclassification

type: Shape

target class: [sysml_vocab:Subclassification](https://www.omg.org/spec/SysML/20230201/vocab#Subclassification)

definition of vocabulary class : <p><code>Subclassification</code> is <code>Specialization</code> in which both the <code>specific</code> and <code>general</code> <code>Types</code> are <code>Classifier</code>. This means all instances of the specific <code>Classifier</code> are also instances of the general <code>Classifier</code>.</p><br>

description: <p><code>Subclassification</code> is <code>Specialization</code> in which both the <code>specific</code> and <code>general</code> <code>Types</code> are <code>Classifier</code>. This means all instances of the specific <code>Classifier</code> are also instances of the general <code>Classifier</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:subclassificationSuperclassifier](https://www.omg.org/spec/SysML/20230201/vocab#subclassificationSuperclassifier)| [1]| [sysml_vocab:Classifier](https://www.omg.org/spec/SysML/20230201/vocab#Classifier)| <p>The more <code>general</code> Classifier in this <code>Subclassification</code>.</p><br>| <p>The more <code>general</code> Classifier in this <code>Subclassification</code>.</p><br>|
| [sysml_vocab:subclassificationSubclassifier](https://www.omg.org/spec/SysML/20230201/vocab#subclassificationSubclassifier)| [1]| [sysml_vocab:Classifier](https://www.omg.org/spec/SysML/20230201/vocab#Classifier)| <p>The more specific <code>Classifier</code> in this <code>Subclassification</code>.</p><br>| <p>The more specific <code>Classifier</code> in this <code>Subclassification</code>.</p><br>|
| [sysml_vocab:subclassificationOwningClassifier](https://www.omg.org/spec/SysML/20230201/vocab#subclassificationOwningClassifier)| [0..1]| [sysml_vocab:Classifier](https://www.omg.org/spec/SysML/20230201/vocab#Classifier)| <p>The <code>Classifier</code> that owns this <code>Subclassification</code> relationship, which must also be its <code>subclassifier</code>.</p><br>| <p>The <code>Classifier</code> that owns this <code>Subclassification</code> relationship, which must also be its <code>subclassifier</code>.</p><br>|



### EnumerationDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#EnumerationDefinition

type: Shape

target class: [sysml_vocab:EnumerationDefinition](https://www.omg.org/spec/SysML/20230201/vocab#EnumerationDefinition)

definition of vocabulary class : <p>An <code>EnumerationDefinition</code> is an <code>AttributeDefinition</code> all of whose instances are given by an explicit list of <code>enumeratedValues</code>. This is realized by requiring that the <code>EnumerationDefinition</code> have <code>isVariation = true</code>, with the <code>enumeratedValues</code> being its <code>variants</code>.</p> <br>isVariation

description: <p>An <code>EnumerationDefinition</code> is an <code>AttributeDefinition</code> all of whose instances are given by an explicit list of <code>enumeratedValues</code>. This is realized by requiring that the <code>EnumerationDefinition</code> have <code>isVariation = true</code>, with the <code>enumeratedValues</code> being its <code>variants</code>.</p> <br>isVariation

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:enumerationDefinitionEnumeratedValue](https://www.omg.org/spec/SysML/20230201/vocab#enumerationDefinitionEnumeratedValue)| [0..*]| [sysml_vocab:EnumerationUsage](https://www.omg.org/spec/SysML/20230201/vocab#EnumerationUsage)| <p><code>EnumerationUsages</code> of this <code>EnumerationDefinition</code>that have distinct, fixed values. Each <code>enumeratedValue</code> specifies one of the allowed instances of the <code>EnumerationDefinition</code>.</p>| <p><code>EnumerationUsages</code> of this <code>EnumerationDefinition</code>that have distinct, fixed values. Each <code>enumeratedValue</code> specifies one of the allowed instances of the <code>EnumerationDefinition</code>.</p>|



### Type

URI: https://www.omg.org/spec/SysML/20230201/shapes#Type

type: Shape

target class: [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)

definition of vocabulary class : <p>A <code>Type</code> is a <code>Namespace</code> that is the most general kind of <code>Element</code> supporting the semantics of classification. A <code>Type</code> may be a <code>Classifier</code> or a <code>Feature</code>, defining conditions on what is classified by the <code>Type</code> (see also the description of <code>isSufficient</code>).</p><br><br>ownedSpecialization = ownedRelationship->selectByKind(Specialization)-><br>    select(s | s.special = self)<br>    <br>multiplicity = <br>    let ownedMultiplicities: Sequence(Multiplicity) =<br>        ownedMember->selectByKind(Multiplicity) in<br>    if ownedMultiplicities->isEmpty() then null<br>    else ownedMultiplicities->first()<br>    endif<br>ownedFeatureMembership = ownedRelationship->selectByKind(FeatureMembership)<br>ownedConjugator =<br>    let ownedConjugators: Sequence(Conjugator) = <br>        ownedRelationship->selectByKind(Conjugation) in<br>    if ownedConjugators->isEmpty() then null <br>    else ownedConjugators->at(1) endif<br>output = feature->select(f | <br>    let direction: FeatureDirectionKind = directionOf(f) in<br>    direction = FeatureDirectionKind::out or<br>    direction = FeatureDirectionKind::inout)<br>input = feature->select(f | <br>    let direction: FeatureDirectionKind = directionOf(f) in<br>    direction = FeatureDirectionKind::_'in' or<br>    direction = FeatureDirectionKind::inout)<br>inheritedMembership = inheritedMemberships(Set{})<br>specializesFromLibrary('Base::Anything')<br>directedFeature = feature->select(f | directionOf(f) <> null)<br>feature = featureMembership.ownedMemberFeature<br>featureMembership = ownedFeatureMembership->union(<br>    inheritedMembership->selectByKind(FeatureMembership))<br>ownedFeature = ownedFeatureMembership.ownedMemberFeature<br>differencingType = ownedDifferencing.differencingType<br>intersectingType->excludes(self)<br>differencingType->excludes(self)<br>unioningType = ownedUnioning.unioningType<br>unioningType->excludes(self)<br>intersectingType = ownedIntersecting.intersectingType<br>ownedRelationship->selectByKind(Conjugation)->size() <= 1<br>ownedMember->selectByKind(Multiplicity)->size() <= 1<br>endFeature = feature->select(isEnd)<br>ownedDisjoining =<br>    ownedRelationship->selectByKind(Disjoining)<br>ownedUnioning =<br>    ownedRelationship->selectByKind(Unioning)<br>ownedRelationship->selectByKind(Intersecting)<br>ownedDifferencing =<br>    ownedRelationship->selectByKind(Differencing)<br>ownedEndFeature = ownedFeature->select(isEnd)<br>inheritedFeature = inheritedMemberships-><br>    selectByKind(FeatureMembership).memberFeature<br>ownedUnioning->size() <> 1<br>ownedIntersecting->size() <> 1<br>ownedDifferencing->size() <> 1

description: <p>A <code>Type</code> is a <code>Namespace</code> that is the most general kind of <code>Element</code> supporting the semantics of classification. A <code>Type</code> may be a <code>Classifier</code> or a <code>Feature</code>, defining conditions on what is classified by the <code>Type</code> (see also the description of <code>isSufficient</code>).</p><br><br>ownedSpecialization = ownedRelationship->selectByKind(Specialization)-><br>    select(s | s.special = self)<br>    <br>multiplicity = <br>    let ownedMultiplicities: Sequence(Multiplicity) =<br>        ownedMember->selectByKind(Multiplicity) in<br>    if ownedMultiplicities->isEmpty() then null<br>    else ownedMultiplicities->first()<br>    endif<br>ownedFeatureMembership = ownedRelationship->selectByKind(FeatureMembership)<br>ownedConjugator =<br>    let ownedConjugators: Sequence(Conjugator) = <br>        ownedRelationship->selectByKind(Conjugation) in<br>    if ownedConjugators->isEmpty() then null <br>    else ownedConjugators->at(1) endif<br>output = feature->select(f | <br>    let direction: FeatureDirectionKind = directionOf(f) in<br>    direction = FeatureDirectionKind::out or<br>    direction = FeatureDirectionKind::inout)<br>input = feature->select(f | <br>    let direction: FeatureDirectionKind = directionOf(f) in<br>    direction = FeatureDirectionKind::_'in' or<br>    direction = FeatureDirectionKind::inout)<br>inheritedMembership = inheritedMemberships(Set{})<br>specializesFromLibrary('Base::Anything')<br>directedFeature = feature->select(f | directionOf(f) <> null)<br>feature = featureMembership.ownedMemberFeature<br>featureMembership = ownedFeatureMembership->union(<br>    inheritedMembership->selectByKind(FeatureMembership))<br>ownedFeature = ownedFeatureMembership.ownedMemberFeature<br>differencingType = ownedDifferencing.differencingType<br>intersectingType->excludes(self)<br>differencingType->excludes(self)<br>unioningType = ownedUnioning.unioningType<br>unioningType->excludes(self)<br>intersectingType = ownedIntersecting.intersectingType<br>ownedRelationship->selectByKind(Conjugation)->size() <= 1<br>ownedMember->selectByKind(Multiplicity)->size() <= 1<br>endFeature = feature->select(isEnd)<br>ownedDisjoining =<br>    ownedRelationship->selectByKind(Disjoining)<br>ownedUnioning =<br>    ownedRelationship->selectByKind(Unioning)<br>ownedRelationship->selectByKind(Intersecting)<br>ownedDifferencing =<br>    ownedRelationship->selectByKind(Differencing)<br>ownedEndFeature = ownedFeature->select(isEnd)<br>inheritedFeature = inheritedMemberships-><br>    selectByKind(FeatureMembership).memberFeature<br>ownedUnioning->size() <> 1<br>ownedIntersecting->size() <> 1<br>ownedDifferencing->size() <> 1

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:typeIsAbstract](https://www.omg.org/spec/SysML/20230201/vocab#typeIsAbstract)| [1]| Boolean| <p>Indicates whether instances of this <code>Type</code> must also be instances of at least one of its specialized <code>Types</code>.</p><br>| <p>Indicates whether instances of this <code>Type</code> must also be instances of at least one of its specialized <code>Types</code>.</p><br>|
| [sysml_vocab:typeIsSufficient](https://www.omg.org/spec/SysML/20230201/vocab#typeIsSufficient)| [1]| Boolean| <p>Whether all things that meet the classification conditions of this <code>Type</code> must be classified by the <code>Type</code>.</p><br><br><p>(A <code>Type</code>&nbsp;gives conditions that must be met by whatever it classifies, but when <code>isSufficient</code> is false, things may meet those conditions but still not be classified by the <code>Type</code>. For example, a Type <code><em>Car</em></code> that is not sufficient could require everything it classifies to have four wheels, but not all four wheeled things would classify as cars. However, if the <code>Type</code> <code><em>Car</em></code> were sufficient, it would classify all four-wheeled things.)</p><br>| <p>Whether all things that meet the classification conditions of this <code>Type</code> must be classified by the <code>Type</code>.</p><br><br><p>(A <code>Type</code>&nbsp;gives conditions that must be met by whatever it classifies, but when <code>isSufficient</code> is false, things may meet those conditions but still not be classified by the <code>Type</code>. For example, a Type <code><em>Car</em></code> that is not sufficient could require everything it classifies to have four wheels, but not all four wheeled things would classify as cars. However, if the <code>Type</code> <code><em>Car</em></code> were sufficient, it would classify all four-wheeled things.)</p><br>|
| [sysml_vocab:typeIsConjugated](https://www.omg.org/spec/SysML/20230201/vocab#typeIsConjugated)| [1]| Boolean| <p>Indicates whether this <code>Type</code> has an <code>ownedConjugator</code>.</p><br>| <p>Indicates whether this <code>Type</code> has an <code>ownedConjugator</code>.</p><br>|
| [sysml_vocab:typeOwnedSpecialization](https://www.omg.org/spec/SysML/20230201/vocab#typeOwnedSpecialization)| [0..*]| [sysml_vocab:Specialization](https://www.omg.org/spec/SysML/20230201/vocab#Specialization)| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Specializations</code>, for which the <code>Type</code> is the <code>specific</code> <code>Type</code>.</p><br>| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Specializations</code>, for which the <code>Type</code> is the <code>specific</code> <code>Type</code>.</p><br>|
| [sysml_vocab:typeOwnedFeatureMembership](https://www.omg.org/spec/SysML/20230201/vocab#typeOwnedFeatureMembership)| [0..*]| [sysml_vocab:FeatureMembership](https://www.omg.org/spec/SysML/20230201/vocab#FeatureMembership)| <p>The <code>ownedMemberships</code> of this <code>Type</code> that are <code>FeatureMemberships</code>, for which the <code>Type</code> is the <code>owningType</code>. Each such <code>FeatureMembership</code> identifies an <code>ownedFeature</code> of the <code>Type</code>.</p><br>| <p>The <code>ownedMemberships</code> of this <code>Type</code> that are <code>FeatureMemberships</code>, for which the <code>Type</code> is the <code>owningType</code>. Each such <code>FeatureMembership</code> identifies an <code>ownedFeature</code> of the <code>Type</code>.</p><br>|
| [sysml_vocab:typeOwnedFeature](https://www.omg.org/spec/SysML/20230201/vocab#typeOwnedFeature)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>ownedMemberFeatures</code> of the <code>ownedFeatureMemberships</code> of this <code>Type</code>.</p><br>| <p>The <code>ownedMemberFeatures</code> of the <code>ownedFeatureMemberships</code> of this <code>Type</code>.</p><br>|
| [sysml_vocab:typeOwnedEndFeature](https://www.omg.org/spec/SysML/20230201/vocab#typeOwnedEndFeature)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>All <code>endFeatures</code> of this <code>Type</code> that are <code>ownedFeatures</code>.</p><br>| <p>All <code>endFeatures</code> of this <code>Type</code> that are <code>ownedFeatures</code>.</p><br>|
| [sysml_vocab:typeFeature](https://www.omg.org/spec/SysML/20230201/vocab#typeFeature)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>ownedMemberFeatures</code> of the <code>featureMemberships</code> of this <code>Type</code>.</p><br>| <p>The <code>ownedMemberFeatures</code> of the <code>featureMemberships</code> of this <code>Type</code>.</p><br>|
| [sysml_vocab:typeInput](https://www.omg.org/spec/SysML/20230201/vocab#typeInput)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>All <code>features</code> related to this <code>Type</code> by <code>FeatureMemberships</code> that have <code>direction</code> <code>in<code> or <code>inout<code>.</code></code></code></code></p><br>| <p>All <code>features</code> related to this <code>Type</code> by <code>FeatureMemberships</code> that have <code>direction</code> <code>in<code> or <code>inout<code>.</code></code></code></code></p><br>|
| [sysml_vocab:typeOutput](https://www.omg.org/spec/SysML/20230201/vocab#typeOutput)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>All <code>features</code> related to this <code>Type</code> by <code>FeatureMemberships</code> that have <code>direction</code> <code>out<code> or <code>inout<code>.</code></code></code></code></p><br>| <p>All <code>features</code> related to this <code>Type</code> by <code>FeatureMemberships</code> that have <code>direction</code> <code>out<code> or <code>inout<code>.</code></code></code></code></p><br>|
| [sysml_vocab:typeInheritedMembership](https://www.omg.org/spec/SysML/20230201/vocab#typeInheritedMembership)| [0..*]| [sysml_vocab:Membership](https://www.omg.org/spec/SysML/20230201/vocab#Membership)| <p>All <code>Memberships</code> inherited by this <code>Type</code> via <code>Specialization</code> or <code>Conjugation</code>. These are included in the derived union for the <code>memberships</code> of the <code>Type</code>.</p><br>| <p>All <code>Memberships</code> inherited by this <code>Type</code> via <code>Specialization</code> or <code>Conjugation</code>. These are included in the derived union for the <code>memberships</code> of the <code>Type</code>.</p><br>|
| [sysml_vocab:typeEndFeature](https://www.omg.org/spec/SysML/20230201/vocab#typeEndFeature)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>All <code>features</code> of this <code>Type</code> with <code>isEnd = true</code>.</p>| <p>All <code>features</code> of this <code>Type</code> with <code>isEnd = true</code>.</p>|
| [sysml_vocab:typeOwnedConjugator](https://www.omg.org/spec/SysML/20230201/vocab#typeOwnedConjugator)| [0..1]| [sysml_vocab:Conjugation](https://www.omg.org/spec/SysML/20230201/vocab#Conjugation)| <p>A <code>Conjugation</code> owned by this <code>Type</code> for which the <code>Type</code> is the <code>originalType</code>.</p><br>| <p>A <code>Conjugation</code> owned by this <code>Type</code> for which the <code>Type</code> is the <code>originalType</code>.</p><br>|
| [sysml_vocab:typeInheritedFeature](https://www.omg.org/spec/SysML/20230201/vocab#typeInheritedFeature)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>All the <code>memberFeatures</code> of the <code>inheritedMemberships</code> of this <code>Type</code> that are <code>FeatureMemberships</code>.</p><br>| <p>All the <code>memberFeatures</code> of the <code>inheritedMemberships</code> of this <code>Type</code> that are <code>FeatureMemberships</code>.</p><br>|
| [sysml_vocab:typeMultiplicity](https://www.omg.org/spec/SysML/20230201/vocab#typeMultiplicity)| [0..1]| [sysml_vocab:Multiplicity](https://www.omg.org/spec/SysML/20230201/vocab#Multiplicity)| <p>An <code>ownedMember</code> of this <code>Type</code> that is a <code>Multiplicity</code>, which constraints the cardinality of the <code>Type</code>. If there is no such <code>ownedMember</code>, then the cardinality of this <code>Type</code> is constrained by all the <code>Multiplicity</code> constraints applicable to any direct supertypes.</p><br><br><p>&nbsp;</p><br>| <p>An <code>ownedMember</code> of this <code>Type</code> that is a <code>Multiplicity</code>, which constraints the cardinality of the <code>Type</code>. If there is no such <code>ownedMember</code>, then the cardinality of this <code>Type</code> is constrained by all the <code>Multiplicity</code> constraints applicable to any direct supertypes.</p><br><br><p>&nbsp;</p><br>|
| [sysml_vocab:typeUnioningType](https://www.omg.org/spec/SysML/20230201/vocab#typeUnioningType)| [0..*]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The interpretations of a <code>Type</code> with <code>unioningTypes</code> are asserted to be the same as those of all the <code>unioningTypes</code> together, which are the <code>Types</code> derived from the <code>unioningType</code> of the <code>ownedUnionings</code> of this <code>Type</code>. For example, a <code>Classifier</code> for people might be the union of <code>Classifiers</code> for all the sexes. Similarly, a feature for people&#39;s children might be the union of features dividing them in the same ways as people in general.</p><br>| <p>The interpretations of a <code>Type</code> with <code>unioningTypes</code> are asserted to be the same as those of all the <code>unioningTypes</code> together, which are the <code>Types</code> derived from the <code>unioningType</code> of the <code>ownedUnionings</code> of this <code>Type</code>. For example, a <code>Classifier</code> for people might be the union of <code>Classifiers</code> for all the sexes. Similarly, a feature for people&#39;s children might be the union of features dividing them in the same ways as people in general.</p><br>|
| [sysml_vocab:typeOwnedIntersecting](https://www.omg.org/spec/SysML/20230201/vocab#typeOwnedIntersecting)| [0..*]| [sysml_vocab:Intersecting](https://www.omg.org/spec/SysML/20230201/vocab#Intersecting)| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Intersectings</code>, have the <code>Type</code> as their <code>typeIntersected</code>.</p><br>| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Intersectings</code>, have the <code>Type</code> as their <code>typeIntersected</code>.</p><br>|
| [sysml_vocab:typeIntersectingType](https://www.omg.org/spec/SysML/20230201/vocab#typeIntersectingType)| [0..*]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The interpretations of a <code>Type</code> with <code>intersectingTypes</code> are asserted to be those in common among the <code>intersectingTypes</code>, which are the <code>Types</code> derived from the <code>intersectingType</code> of the <code>ownedIntersectings</code> of this <code>Type</code>. For example, a <code>Classifier</code> might be an intersection of <code>Classifiers</code> for people of a particular sex and of a particular nationality. Similarly, a feature for people&#39;s children of a particular sex might be the intersection of a <code>Feature</code> for their children and a <code>Classifier</code> for people of that sex (because the interpretations of the children <code>Feature</code> that identify those of that sex are also interpretations of the Classifier for that sex).</p><br>| <p>The interpretations of a <code>Type</code> with <code>intersectingTypes</code> are asserted to be those in common among the <code>intersectingTypes</code>, which are the <code>Types</code> derived from the <code>intersectingType</code> of the <code>ownedIntersectings</code> of this <code>Type</code>. For example, a <code>Classifier</code> might be an intersection of <code>Classifiers</code> for people of a particular sex and of a particular nationality. Similarly, a feature for people&#39;s children of a particular sex might be the intersection of a <code>Feature</code> for their children and a <code>Classifier</code> for people of that sex (because the interpretations of the children <code>Feature</code> that identify those of that sex are also interpretations of the Classifier for that sex).</p><br>|
| [sysml_vocab:typeOwnedUnioning](https://www.omg.org/spec/SysML/20230201/vocab#typeOwnedUnioning)| [0..*]| [sysml_vocab:Unioning](https://www.omg.org/spec/SysML/20230201/vocab#Unioning)| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Unionings</code>, having the <code>Type</code> as their <code>typeUnioned</code>.</p><br>| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Unionings</code>, having the <code>Type</code> as their <code>typeUnioned</code>.</p><br>|
| [sysml_vocab:typeOwnedDisjoining](https://www.omg.org/spec/SysML/20230201/vocab#typeOwnedDisjoining)| [0..*]| [sysml_vocab:Disjoining](https://www.omg.org/spec/SysML/20230201/vocab#Disjoining)| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Disjoinings</code>, for which the <code>Type</code> is the <code>typeDisjoined</code> <code>Type</code>.</p><br>| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Disjoinings</code>, for which the <code>Type</code> is the <code>typeDisjoined</code> <code>Type</code>.</p><br>|
| [sysml_vocab:typeFeatureMembership](https://www.omg.org/spec/SysML/20230201/vocab#typeFeatureMembership)| [0..*]| [sysml_vocab:FeatureMembership](https://www.omg.org/spec/SysML/20230201/vocab#FeatureMembership)| <p>The <code>FeatureMemberships</code> for <code>features</code> of this <code>Type</code>, which include all <code>ownedFeatureMemberships</code> and those <code>inheritedMemberships</code> that are <code>FeatureMemberships</code> (but does <em>not</em> include any <code>importedMemberships</code>).</p><br>| <p>The <code>FeatureMemberships</code> for <code>features</code> of this <code>Type</code>, which include all <code>ownedFeatureMemberships</code> and those <code>inheritedMemberships</code> that are <code>FeatureMemberships</code> (but does <em>not</em> include any <code>importedMemberships</code>).</p><br>|
| [sysml_vocab:typeDifferencingType](https://www.omg.org/spec/SysML/20230201/vocab#typeDifferencingType)| [0..*]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The interpretations of a <code>Type</code> with <code>differencingTypes</code> are asserted to be those of the first of those <code>Types</code>, but not including those of the remaining <code>Types</code>. For example, a <code>Classifier</code> might be the difference of a <code>Classifier</code> for people and another for people of a particular nationality, leaving people who are not of that nationality. Similarly, a feature of people might be the difference between a feature for their children and a <code>Classifier</code> for people of a particular sex, identifying their children not of that sex (because the interpretations of the children <code>Feature</code> that identify those of that sex are also interpretations of the <code>Classifier</code> for that sex).</p><br>| <p>The interpretations of a <code>Type</code> with <code>differencingTypes</code> are asserted to be those of the first of those <code>Types</code>, but not including those of the remaining <code>Types</code>. For example, a <code>Classifier</code> might be the difference of a <code>Classifier</code> for people and another for people of a particular nationality, leaving people who are not of that nationality. Similarly, a feature of people might be the difference between a feature for their children and a <code>Classifier</code> for people of a particular sex, identifying their children not of that sex (because the interpretations of the children <code>Feature</code> that identify those of that sex are also interpretations of the <code>Classifier</code> for that sex).</p><br>|
| [sysml_vocab:typeOwnedDifferencing](https://www.omg.org/spec/SysML/20230201/vocab#typeOwnedDifferencing)| [0..*]| [sysml_vocab:Differencing](https://www.omg.org/spec/SysML/20230201/vocab#Differencing)| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Differencings</code>, having this <code>Type</code> as their <code>typeDifferenced</code>.</p><br>| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Differencings</code>, having this <code>Type</code> as their <code>typeDifferenced</code>.</p><br>|
| [sysml_vocab:typeDirectedFeature](https://www.omg.org/spec/SysML/20230201/vocab#typeDirectedFeature)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>features</code> of this <code>Type</code> that have a non-null <code>direction</code>.</p><br>| <p>The <code>features</code> of this <code>Type</code> that have a non-null <code>direction</code>.</p><br>|



### Usage

URI: https://www.omg.org/spec/SysML/20230201/shapes#Usage

type: Shape

target class: [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)

definition of vocabulary class : <p>A <code>Usage</code> is a usage of a <code>Definition</code>. A <code>Usage</code> may only be an <code>ownedFeature</code> of a <code>Definition</code> or another <code>Usage</code>.</p><br><br><p>A <code>Usage</code> may have <code>nestedUsages</code> that model <code>features</code> that apply in the context of the <code>owningUsage</code>. A <code>Usage</code> may also have <code>Definitions</code> nested in it, but this has no semantic significance, other than the nested scoping resulting from the <code>Usage</code> being considered as a <code>Namespace</code> for any nested <code>Definitions</code>.</p><br><br><p>However, if a <code>Usage</code> has <code>isVariation = true</code>, then it represents a <em>variation point</em> <code>Usage</code>. In this case, all of its <code>members</code> must be <code>variant</code> <code>Usages</code>, related to the <code>Usage</code> by <code>VariantMembership</code> <code>Relationships</code>. Rather than being <code>features</code> of the <code>Usage</code>, <code>variant</code> <code>Usages</code> model different concrete alternatives that can be chosen to fill in for the variation point <code>Usage</code>.</p><br>variant = variantMembership.ownedVariantUsage<br>variantMembership = ownedMembership->selectByKind(VariantMembership)<br>isVariation implies ownedFeatureMembership->isEmpty()<br>isReference = not isComposite<br>owningVariationUsage <> null implies<br>    specializes(owningVariationUsage)<br>isVariation implies<br>    not ownedSpecialization.specific->exists(<br>        oclIsKindOf(Definition) and<br>        oclAsType(Definition).isVariation or<br>        oclIsKindOf(Usage) and<br>        oclAsType(Usage).isVariation)<br>owningVariationDefinition <> null implies<br>    specializes(owningVariationDefinition)<br>directedUsage = directedFeature->selectByKind(Usage)<br>nestedAction = nestedUsage->selectByKind(ActionUsage)<br>nestedAllocation = nestedUsage->selectByKind(AllocationUsage)<br>nestedAnalysisCase = nestedUsage->selectByKind(AnalysisCaseUsage)<br>nestedAttribute = nestedUsage->selectByKind(AttributeUsage)<br>nestedCalculation = nestedUsage->selectByKind(CalculationUsage)<br>nestedCase = nestedUsage->selectByKind(CaseUsage)<br>nestedConcern = nestedUsage->selectByKind(ConcernUsage)<br>nestedConnection = nestedUsage->selectByKind(ConnectorAsUsage)<br>nestedConstraint = nestedUsage->selectByKind(ConstraintUsage)<br>ownedNested = nestedUsage->selectByKind(EnumerationUsage)<br>nestedFlow = nestedUsage->selectByKind(FlowConnectionUsage)<br>nestedInterface = nestedUsage->selectByKind(ReferenceUsage)<br>nestedItem = nestedUsage->selectByKind(ItemUsage)<br>nestedMetadata = nestedUsage->selectByKind(MetadataUsage)<br>nestedOccurrence = nestedUsage->selectByKind(OccurrenceUsage)<br>nestedPart = nestedUsage->selectByKind(PartUsage)<br>nestedPort = nestedUsage->selectByKind(PortUsage)<br>nestedReference = nestedUsage->selectByKind(ReferenceUsage)<br>nestedRendering = nestedUsage->selectByKind(RenderingUsage)<br>nestedRequirement = nestedUsage->selectByKind(RequirementUsage)<br>nestedState = nestedUsage->selectByKind(StateUsage)<br>nestedTransition = nestedUsage->selectByKind(TransitionUsage)<br>nestedUsage = ownedFeature->selectByKind(Usage)<br>nestedUseCase = nestedUsage->selectByKind(UseCaseUsage)<br>nestedVerificationCase = nestedUsage->selectByKind(VerificationCaseUsage)<br>nestedView = nestedUsage->selectByKind(ViewUsage)<br>nestedViewpoint = nestedUsage->selectByKind(ViewpointUsage)<br>usage = feature->selectByKind(Usage)<br>direction <> null or isEnd or featuringType->isEmpty() implies<br>    isReference<br>isVariation implies isAbstract

description: <p>A <code>Usage</code> is a usage of a <code>Definition</code>. A <code>Usage</code> may only be an <code>ownedFeature</code> of a <code>Definition</code> or another <code>Usage</code>.</p><br><br><p>A <code>Usage</code> may have <code>nestedUsages</code> that model <code>features</code> that apply in the context of the <code>owningUsage</code>. A <code>Usage</code> may also have <code>Definitions</code> nested in it, but this has no semantic significance, other than the nested scoping resulting from the <code>Usage</code> being considered as a <code>Namespace</code> for any nested <code>Definitions</code>.</p><br><br><p>However, if a <code>Usage</code> has <code>isVariation = true</code>, then it represents a <em>variation point</em> <code>Usage</code>. In this case, all of its <code>members</code> must be <code>variant</code> <code>Usages</code>, related to the <code>Usage</code> by <code>VariantMembership</code> <code>Relationships</code>. Rather than being <code>features</code> of the <code>Usage</code>, <code>variant</code> <code>Usages</code> model different concrete alternatives that can be chosen to fill in for the variation point <code>Usage</code>.</p><br>variant = variantMembership.ownedVariantUsage<br>variantMembership = ownedMembership->selectByKind(VariantMembership)<br>isVariation implies ownedFeatureMembership->isEmpty()<br>isReference = not isComposite<br>owningVariationUsage <> null implies<br>    specializes(owningVariationUsage)<br>isVariation implies<br>    not ownedSpecialization.specific->exists(<br>        oclIsKindOf(Definition) and<br>        oclAsType(Definition).isVariation or<br>        oclIsKindOf(Usage) and<br>        oclAsType(Usage).isVariation)<br>owningVariationDefinition <> null implies<br>    specializes(owningVariationDefinition)<br>directedUsage = directedFeature->selectByKind(Usage)<br>nestedAction = nestedUsage->selectByKind(ActionUsage)<br>nestedAllocation = nestedUsage->selectByKind(AllocationUsage)<br>nestedAnalysisCase = nestedUsage->selectByKind(AnalysisCaseUsage)<br>nestedAttribute = nestedUsage->selectByKind(AttributeUsage)<br>nestedCalculation = nestedUsage->selectByKind(CalculationUsage)<br>nestedCase = nestedUsage->selectByKind(CaseUsage)<br>nestedConcern = nestedUsage->selectByKind(ConcernUsage)<br>nestedConnection = nestedUsage->selectByKind(ConnectorAsUsage)<br>nestedConstraint = nestedUsage->selectByKind(ConstraintUsage)<br>ownedNested = nestedUsage->selectByKind(EnumerationUsage)<br>nestedFlow = nestedUsage->selectByKind(FlowConnectionUsage)<br>nestedInterface = nestedUsage->selectByKind(ReferenceUsage)<br>nestedItem = nestedUsage->selectByKind(ItemUsage)<br>nestedMetadata = nestedUsage->selectByKind(MetadataUsage)<br>nestedOccurrence = nestedUsage->selectByKind(OccurrenceUsage)<br>nestedPart = nestedUsage->selectByKind(PartUsage)<br>nestedPort = nestedUsage->selectByKind(PortUsage)<br>nestedReference = nestedUsage->selectByKind(ReferenceUsage)<br>nestedRendering = nestedUsage->selectByKind(RenderingUsage)<br>nestedRequirement = nestedUsage->selectByKind(RequirementUsage)<br>nestedState = nestedUsage->selectByKind(StateUsage)<br>nestedTransition = nestedUsage->selectByKind(TransitionUsage)<br>nestedUsage = ownedFeature->selectByKind(Usage)<br>nestedUseCase = nestedUsage->selectByKind(UseCaseUsage)<br>nestedVerificationCase = nestedUsage->selectByKind(VerificationCaseUsage)<br>nestedView = nestedUsage->selectByKind(ViewUsage)<br>nestedViewpoint = nestedUsage->selectByKind(ViewpointUsage)<br>usage = feature->selectByKind(Usage)<br>direction <> null or isEnd or featuringType->isEmpty() implies<br>    isReference<br>isVariation implies isAbstract

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:usageIsReference](https://www.omg.org/spec/SysML/20230201/vocab#usageIsReference)| [1]| Boolean| <p>Whether this <code>Usage</code> is a referential <code>Usage</code>, that is, it has <code>isComposite = false</code>.<p>| <p>Whether this <code>Usage</code> is a referential <code>Usage</code>, that is, it has <code>isComposite = false</code>.<p>|
| [sysml_vocab:usageIsVariation](https://www.omg.org/spec/SysML/20230201/vocab#usageIsVariation)| [1]| Boolean| <p>Whether this <code>Usage</code> is for a variation point or not. If true, then all the <code>memberships</code> of the <code>Usage</code> must be <code>VariantMemberships</code>.</p>| <p>Whether this <code>Usage</code> is for a variation point or not. If true, then all the <code>memberships</code> of the <code>Usage</code> must be <code>VariantMemberships</code>.</p>|
| [sysml_vocab:usageVariant](https://www.omg.org/spec/SysML/20230201/vocab#usageVariant)| [0..*]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>Usages</code> which represent the variants of this <code>Usage</code> as a variation point <code>Usage</code>, if <code>isVariation = true</code>. If <code>isVariation = false</code>, then there must be no <code>variants</code>.</p>| <p>The <code>Usages</code> which represent the variants of this <code>Usage</code> as a variation point <code>Usage</code>, if <code>isVariation = true</code>. If <code>isVariation = false</code>, then there must be no <code>variants</code>.</p>|
| [sysml_vocab:usageVariantMembership](https://www.omg.org/spec/SysML/20230201/vocab#usageVariantMembership)| [0..*]| [sysml_vocab:VariantMembership](https://www.omg.org/spec/SysML/20230201/vocab#VariantMembership)| <p>The <code>ownedMemberships</code> of this <code>Usage</code> that are <code>VariantMemberships</code>. If <code>isVariation = true</code>, then this must be all <code>memberships</code> of the <code>Usage</code>. If <code>isVariation = false</code>, then <code>variantMembership</code>must be empty.</p>| <p>The <code>ownedMemberships</code> of this <code>Usage</code> that are <code>VariantMemberships</code>. If <code>isVariation = true</code>, then this must be all <code>memberships</code> of the <code>Usage</code>. If <code>isVariation = false</code>, then <code>variantMembership</code>must be empty.</p>|
| [sysml_vocab:usageOwningDefinition](https://www.omg.org/spec/SysML/20230201/vocab#usageOwningDefinition)| [0..1]| [sysml_vocab:Definition](https://www.omg.org/spec/SysML/20230201/vocab#Definition)| <p>The <code>Definition</code> that owns this <code>Usage</code> (if any).</p>| <p>The <code>Definition</code> that owns this <code>Usage</code> (if any).</p>|
| [sysml_vocab:usageOwningUsage](https://www.omg.org/spec/SysML/20230201/vocab#usageOwningUsage)| [0..1]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>Usage</code> in which this <code>Usage</code> is nested (if any).</p>| <p>The <code>Usage</code> in which this <code>Usage</code> is nested (if any).</p>|
| [sysml_vocab:usageNestedUsage](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedUsage)| [0..*]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>Usages</code> that are <code>ownedFeatures</code> of this <code>Usage</code>.</p>| <p>The <code>Usages</code> that are <code>ownedFeatures</code> of this <code>Usage</code>.</p>|
| [sysml_vocab:usageDefinition](https://www.omg.org/spec/SysML/20230201/vocab#usageDefinition)| [0..*]| [sysml_vocab:Classifier](https://www.omg.org/spec/SysML/20230201/vocab#Classifier)| <p>The <code>Classifiers</code> that are the types of this <code>Usage</code>. Nominally, these are <code>Definitions</code>, but other kinds of Kernel <code>Classifiers</code> are also allowed, to permit use of <code>Classifiers</code> from the Kernel Model Libraries.</p>| <p>The <code>Classifiers</code> that are the types of this <code>Usage</code>. Nominally, these are <code>Definitions</code>, but other kinds of Kernel <code>Classifiers</code> are also allowed, to permit use of <code>Classifiers</code> from the Kernel Model Libraries.</p>|
| [sysml_vocab:usageUsage](https://www.omg.org/spec/SysML/20230201/vocab#usageUsage)| [0..*]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>Usages</code> that are <code>features</code> of this <code>Usage</code> (not necessarily owned).</p>| <p>The <code>Usages</code> that are <code>features</code> of this <code>Usage</code> (not necessarily owned).</p>|
| [sysml_vocab:usageDirectedUsage](https://www.omg.org/spec/SysML/20230201/vocab#usageDirectedUsage)| [0..*]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>usages</code> of this <code>Usage</code> that are <code>directedFeatures</code>.</p><br>| <p>The <code>usages</code> of this <code>Usage</code> that are <code>directedFeatures</code>.</p><br>|
| [sysml_vocab:usageNestedReference](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedReference)| [0..*]| [sysml_vocab:ReferenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#ReferenceUsage)| <p>The <code>ReferenceUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p> <br>| <p>The <code>ReferenceUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p> <br>|
| [sysml_vocab:usageNestedAttribute](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedAttribute)| [0..*]| [sysml_vocab:AttributeUsage](https://www.omg.org/spec/SysML/20230201/vocab#AttributeUsage)| <p>The code>AttributeUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>| <p>The code>AttributeUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>|
| [sysml_vocab:usageNestedEnumeration](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedEnumeration)| [0..*]| [sysml_vocab:EnumerationUsage](https://www.omg.org/spec/SysML/20230201/vocab#EnumerationUsage)| <p>The code>EnumerationUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.<p>| <p>The code>EnumerationUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.<p>|
| [sysml_vocab:usageNestedOccurrence](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedOccurrence)| [0..*]| [sysml_vocab:OccurrenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#OccurrenceUsage)| <p>The <code>OccurrenceUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>| <p>The <code>OccurrenceUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>|
| [sysml_vocab:usageNestedItem](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedItem)| [0..*]| [sysml_vocab:ItemUsage](https://www.omg.org/spec/SysML/20230201/vocab#ItemUsage)| <p>The <code>ItemUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>| <p>The <code>ItemUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>|
| [sysml_vocab:usageNestedPart](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedPart)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The <code>PartUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>| <p>The <code>PartUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>|
| [sysml_vocab:usageNestedPort](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedPort)| [0..*]| [sysml_vocab:PortUsage](https://www.omg.org/spec/SysML/20230201/vocab#PortUsage)| <p>The <code>PortUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>| <p>The <code>PortUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>|
| [sysml_vocab:usageNestedConnection](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedConnection)| [0..*]| [sysml_vocab:ConnectorAsUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConnectorAsUsage)| <p>The <code>ConnectorAsUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>. Note that this list includes <code>BindingConnectorAsUsages</code> and <code>SuccessionAsUsages</code>, even though these are <code>ConnectorAsUsages</code> but not <code>ConnectionUsages</code>.</p>| <p>The <code>ConnectorAsUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>. Note that this list includes <code>BindingConnectorAsUsages</code> and <code>SuccessionAsUsages</code>, even though these are <code>ConnectorAsUsages</code> but not <code>ConnectionUsages</code>.</p>|
| [sysml_vocab:usageNestedFlow](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedFlow)| [0..*]| [sysml_vocab:FlowConnectionUsage](https://www.omg.org/spec/SysML/20230201/vocab#FlowConnectionUsage)| <p>The code>FlowConnectionUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>| <p>The code>FlowConnectionUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>|
| [sysml_vocab:usageNestedInterface](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedInterface)| [0..*]| [sysml_vocab:InterfaceUsage](https://www.omg.org/spec/SysML/20230201/vocab#InterfaceUsage)| <p>The <code>InterfaceUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>| <p>The <code>InterfaceUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>|
| [sysml_vocab:usageNestedAllocation](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedAllocation)| [0..*]| [sysml_vocab:AllocationUsage](https://www.omg.org/spec/SysML/20230201/vocab#AllocationUsage)| <p>The <code>AllocationUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>| <p>The <code>AllocationUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>|
| [sysml_vocab:usageNestedAction](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedAction)| [0..*]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>| <p>The <code>ActionUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>|
| [sysml_vocab:usageNestedState](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedState)| [0..*]| [sysml_vocab:StateUsage](https://www.omg.org/spec/SysML/20230201/vocab#StateUsage)| <p>The <code>StateUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>| <p>The <code>StateUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>|
| [sysml_vocab:usageNestedTransition](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedTransition)| [0..*]| [sysml_vocab:TransitionUsage](https://www.omg.org/spec/SysML/20230201/vocab#TransitionUsage)| <p>The <code>TransitionUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>| <p>The <code>TransitionUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>|
| [sysml_vocab:usageNestedCalculation](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedCalculation)| [0..*]| [sysml_vocab:CalculationUsage](https://www.omg.org/spec/SysML/20230201/vocab#CalculationUsage)| <p>The <code>CalculationUsage</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>| <p>The <code>CalculationUsage</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>|
| [sysml_vocab:usageNestedConstraint](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedConstraint)| [0..*]| [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)| <p>The <code>ConstraintUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>| <p>The <code>ConstraintUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>|
| [sysml_vocab:usageNestedRequirement](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedRequirement)| [0..*]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The <code>RequirementUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>| <p>The <code>RequirementUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>|
| [sysml_vocab:usageNestedConcern](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedConcern)| [0..*]| [sysml_vocab:ConcernUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConcernUsage)| <p>The <code>ConcernUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>| <p>The <code>ConcernUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>|
| [sysml_vocab:usageNestedCase](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedCase)| [0..*]| [sysml_vocab:CaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#CaseUsage)| <p>The <code>CaseUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>| <p>The <code>CaseUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>|
| [sysml_vocab:usageNestedAnalysisCase](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedAnalysisCase)| [0..*]| [sysml_vocab:AnalysisCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#AnalysisCaseUsage)| <p>The <code>AnalysisCaseUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>| <p>The <code>AnalysisCaseUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>|
| [sysml_vocab:usageNestedVerificationCase](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedVerificationCase)| [0..*]| [sysml_vocab:VerificationCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#VerificationCaseUsage)| <p>The <code>VerificationCaseUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p> <br>| <p>The <code>VerificationCaseUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p> <br>|
| [sysml_vocab:usageNestedUseCase](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedUseCase)| [0..*]| [sysml_vocab:UseCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#UseCaseUsage)| <p>The <code>UseCaseUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>| <p>The <code>UseCaseUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p><br>|
| [sysml_vocab:usageNestedView](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedView)| [0..*]| [sysml_vocab:ViewUsage](https://www.omg.org/spec/SysML/20230201/vocab#ViewUsage)| <p>The <code>ViewUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p> <br>| <p>The <code>ViewUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p> <br>|
| [sysml_vocab:usageNestedViewpoint](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedViewpoint)| [0..*]| [sysml_vocab:ViewpointUsage](https://www.omg.org/spec/SysML/20230201/vocab#ViewpointUsage)| <p>The <code>ViewpointUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p> <br>| <p>The <code>ViewpointUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p> <br>|
| [sysml_vocab:usageNestedRendering](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedRendering)| [0..*]| [sysml_vocab:RenderingUsage](https://www.omg.org/spec/SysML/20230201/vocab#RenderingUsage)| <p>The <code>RenderingUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p> <br>| <p>The <code>RenderingUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p> <br>|
| [sysml_vocab:usageNestedMetadata](https://www.omg.org/spec/SysML/20230201/vocab#usageNestedMetadata)| [0..*]| [sysml_vocab:MetadataUsage](https://www.omg.org/spec/SysML/20230201/vocab#MetadataUsage)| <p>The <code>MetadataUsages</code> that are <code>nestedUsages</code> of this of this <code>Usage</code>.</p>| <p>The <code>MetadataUsages</code> that are <code>nestedUsages</code> of this of this <code>Usage</code>.</p>|



### Expose

URI: https://www.omg.org/spec/SysML/20230201/shapes#Expose

type: Shape

target class: [sysml_vocab:Expose](https://www.omg.org/spec/SysML/20230201/vocab#Expose)

definition of vocabulary class : <p>An <code>Expose</code> is an <code>Import</code> of <code>Memberships</code> into a <code>ViewUsage</code> that provide the <code>Elements</code> to be included in a view. Visibility is always ignored for an <code>Expose</code> (i.e., <code>isImportAll = true</code>).</p><br>isImportAll<br>importOwningNamespace.oclIsType(ViewUsage)

description: <p>An <code>Expose</code> is an <code>Import</code> of <code>Memberships</code> into a <code>ViewUsage</code> that provide the <code>Elements</code> to be included in a view. Visibility is always ignored for an <code>Expose</code> (i.e., <code>isImportAll = true</code>).</p><br>isImportAll<br>importOwningNamespace.oclIsType(ViewUsage)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### MetadataUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#MetadataUsage

type: Shape

target class: [sysml_vocab:MetadataUsage](https://www.omg.org/spec/SysML/20230201/vocab#MetadataUsage)

definition of vocabulary class : <p>A  <code>MetadataUsage</code> is a <code>Usage</code> and a <code>MetadataFeature</code>, used to annotate other <code>Elements</code> in a system model with metadata. As a <code>MetadataFeature</code>, its type must be a <code>Metaclass</code>, which will nominally be a <code>MetadataDefinition</code>. However, any kernel <code>Metaclass</code> is also allowed, to permit use of <code>Metaclasses</code> from the Kernel Model Libraries.</p><br>specializesFromLibrary('Metadata::metadataItems')

description: <p>A  <code>MetadataUsage</code> is a <code>Usage</code> and a <code>MetadataFeature</code>, used to annotate other <code>Elements</code> in a system model with metadata. As a <code>MetadataFeature</code>, its type must be a <code>Metaclass</code>, which will nominally be a <code>MetadataDefinition</code>. However, any kernel <code>Metaclass</code> is also allowed, to permit use of <code>Metaclasses</code> from the Kernel Model Libraries.</p><br>specializesFromLibrary('Metadata::metadataItems')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:metadataUsageMetadataDefinition](https://www.omg.org/spec/SysML/20230201/vocab#metadataUsageMetadataDefinition)| [0..1]| [sysml_vocab:Metaclass](https://www.omg.org/spec/SysML/20230201/vocab#Metaclass)| <p>The <code>MetadataDefinition</code> that is the <code>definition</code> of this <code>MetadataUsage</code>.</p>| <p>The <code>MetadataDefinition</code> that is the <code>definition</code> of this <code>MetadataUsage</code>.</p>|



### PerformActionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#PerformActionUsage

type: Shape

target class: [sysml_vocab:PerformActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#PerformActionUsage)

definition of vocabulary class : <p>A <code>PerformActionUsage</code> is an <code>ActionUsage</code> that represents the performance of an <code>ActionUsage</code>. Unless it is the <code>PerformActionUsage</code> itself, the <code>ActionUsage</code> to be performed is related to the <code>PerformActionUsage</code> by a <code>ReferenceSubsetting</code> relationship. A <code>PerformActionUsage</code> is also an <code>EventOccurrenceUsage</code>, with its <code>performedAction</code> as the <code>eventOccurrence</code>.</p><br>ownedReferenceSubsetting <> null implies<br>    ownedReferenceSubsetting.referencedFeature.oclIsKindOf(ActionUsage)<br>owningType <> null and<br>(owningType.oclIsKindOf(PartDefinition) or<br> owningType.oclIsKindOf(PartUsage)) implies<br>    specializesFromLibrary('Parts::Part::performedActions')

description: <p>A <code>PerformActionUsage</code> is an <code>ActionUsage</code> that represents the performance of an <code>ActionUsage</code>. Unless it is the <code>PerformActionUsage</code> itself, the <code>ActionUsage</code> to be performed is related to the <code>PerformActionUsage</code> by a <code>ReferenceSubsetting</code> relationship. A <code>PerformActionUsage</code> is also an <code>EventOccurrenceUsage</code>, with its <code>performedAction</code> as the <code>eventOccurrence</code>.</p><br>ownedReferenceSubsetting <> null implies<br>    ownedReferenceSubsetting.referencedFeature.oclIsKindOf(ActionUsage)<br>owningType <> null and<br>(owningType.oclIsKindOf(PartDefinition) or<br> owningType.oclIsKindOf(PartUsage)) implies<br>    specializesFromLibrary('Parts::Part::performedActions')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:performActionUsagePerformedAction](https://www.omg.org/spec/SysML/20230201/vocab#performActionUsagePerformedAction)| [1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> to be performed by this <code>PerformedActionUsage</code>. It is the <code>eventOccurrence</code> of the <code>PerformActionUsage</code> considered as an <code>EventOccurrenceUsage</code>, which must be an <code>ActionUsage</code>.</p> <br>| <p>The <code>ActionUsage</code> to be performed by this <code>PerformedActionUsage</code>. It is the <code>eventOccurrence</code> of the <code>PerformActionUsage</code> considered as an <code>EventOccurrenceUsage</code>, which must be an <code>ActionUsage</code>.</p> <br>|



### ObjectiveMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#ObjectiveMembership

type: Shape

target class: [sysml_vocab:ObjectiveMembership](https://www.omg.org/spec/SysML/20230201/vocab#ObjectiveMembership)

definition of vocabulary class : <p>An <code>ObjectiveMembership</code> is a <code>FeatureMembership</code> that indicates that its <code>ownedObjectiveRequirement</code> is the objective <code>RequirementUsage</code> for its <code>owningType</code>, which must be a <code>CaseDefinition</code> or <code>CaseUsage</code>.</p><br>owningType.oclIsType(CaseDefinition) or<br>owningType.oclIsType(CaseUsage)<br><br>ownedObjectiveRequirement.isComposite

description: <p>An <code>ObjectiveMembership</code> is a <code>FeatureMembership</code> that indicates that its <code>ownedObjectiveRequirement</code> is the objective <code>RequirementUsage</code> for its <code>owningType</code>, which must be a <code>CaseDefinition</code> or <code>CaseUsage</code>.</p><br>owningType.oclIsType(CaseDefinition) or<br>owningType.oclIsType(CaseUsage)<br><br>ownedObjectiveRequirement.isComposite

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:objectiveMembershipOwnedObjectiveRequirement](https://www.omg.org/spec/SysML/20230201/vocab#objectiveMembershipOwnedObjectiveRequirement)| [1]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The RequirementUsage that is the <code>ownedMemberFeature</code> of this RequirementUsage.</p> <br>| <p>The RequirementUsage that is the <code>ownedMemberFeature</code> of this RequirementUsage.</p> <br>|



### ConnectionDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#ConnectionDefinition

type: Shape

target class: [sysml_vocab:ConnectionDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ConnectionDefinition)

definition of vocabulary class : <p>A <code>ConnectionDefinition</code> is a <code>PartDefinition</code> that is also an <code>AssociationStructure</code>. The end <code>Features</code> of a <code>ConnectionDefinition</code> must be <code>Usages</code>.</p><br>specializesFromLibrary('Connections::Connection')<br>ownedEndFeature->size() = 2 implies<br>    specializesFromLibrary('Connections::BinaryConnections')

description: <p>A <code>ConnectionDefinition</code> is a <code>PartDefinition</code> that is also an <code>AssociationStructure</code>. The end <code>Features</code> of a <code>ConnectionDefinition</code> must be <code>Usages</code>.</p><br>specializesFromLibrary('Connections::Connection')<br>ownedEndFeature->size() = 2 implies<br>    specializesFromLibrary('Connections::BinaryConnections')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:connectionDefinitionConnectionEnd](https://www.omg.org/spec/SysML/20230201/vocab#connectionDefinitionConnectionEnd)| [0..*]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>Usages</code> that define the things related by the <code>ConnectionDefinition</code>.</p>| <p>The <code>Usages</code> that define the things related by the <code>ConnectionDefinition</code>.</p>|



### LifeClass

URI: https://www.omg.org/spec/SysML/20230201/shapes#LifeClass

type: Shape

target class: [sysml_vocab:LifeClass](https://www.omg.org/spec/SysML/20230201/vocab#LifeClass)

definition of vocabulary class : <p>A <code>LifeClass</code> is a <code>Class</code> that specializes both the <code>Class</code> <code><em>Occurrences::Life</em></code> from the Kernel Semantic Library and a single <code>OccurrenceDefinition</code>, and has a multiplicity of 0..1. This constrains the <code>OccurrenceDefinition</code> being specialized to have at most one instance that is a complete <code>Life</code>.</p><br><br>specializesFromLibrary('Occurrences::Life')<br>multiplicity <> null and<br>multiplicity.specializesFromLibrary('Base::zeroOrOne')<br>specializes(individualDefinition)<br>isSufficient

description: <p>A <code>LifeClass</code> is a <code>Class</code> that specializes both the <code>Class</code> <code><em>Occurrences::Life</em></code> from the Kernel Semantic Library and a single <code>OccurrenceDefinition</code>, and has a multiplicity of 0..1. This constrains the <code>OccurrenceDefinition</code> being specialized to have at most one instance that is a complete <code>Life</code>.</p><br><br>specializesFromLibrary('Occurrences::Life')<br>multiplicity <> null and<br>multiplicity.specializesFromLibrary('Base::zeroOrOne')<br>specializes(individualDefinition)<br>isSufficient

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### ViewUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ViewUsage

type: Shape

target class: [sysml_vocab:ViewUsage](https://www.omg.org/spec/SysML/20230201/vocab#ViewUsage)

definition of vocabulary class : <p>A <code>ViewUsage</code> is a usage of a <code>ViewDefinition</code> to specify the generation of a view of the <code>members</code> of a collection of <code>exposedNamespaces</code>. The <code>ViewUsage</code> can satisfy more <code>viewpoints</code> than its definition, and it can specialize the <code>viewRendering</code> specified by its definition.<p><br>exposedElement = ownedImport->selectByKind(Expose).<br>    importedMemberships(Set{}).memberElement-><br>    select(elm | includeAsExposed(elm))-><br>    asOrderedSet()<br>satisfiedViewpoint = ownedRequirement-><br>    selectByKind(ViewpointUsage)-><br>    select(isComposite)<br>viewCondition = ownedMembership-><br>    selectByKind(ElementFilterMembership).<br>    condition<br>viewRendering =<br>    let renderings: OrderedSet(ViewRenderingMembership) =<br>        featureMembership->selectByKind(ViewRenderingMembership) in<br>    if renderings->isEmpty() then null<br>    else renderings->first().referencedRendering<br>    endif<br>featureMembership-><br>    selectByKind(ViewRenderingMembership)-><br>    size() <= 1<br>specializesFromLibrary('Views::views')<br>owningType <> null and<br>(owningType.oclIsKindOf(ViewDefinition) or<br> owningType.oclIsKindOf(ViewUsage)) implies<br>    specializesFromLibrary('Views::View::subviews')

description: <p>A <code>ViewUsage</code> is a usage of a <code>ViewDefinition</code> to specify the generation of a view of the <code>members</code> of a collection of <code>exposedNamespaces</code>. The <code>ViewUsage</code> can satisfy more <code>viewpoints</code> than its definition, and it can specialize the <code>viewRendering</code> specified by its definition.<p><br>exposedElement = ownedImport->selectByKind(Expose).<br>    importedMemberships(Set{}).memberElement-><br>    select(elm | includeAsExposed(elm))-><br>    asOrderedSet()<br>satisfiedViewpoint = ownedRequirement-><br>    selectByKind(ViewpointUsage)-><br>    select(isComposite)<br>viewCondition = ownedMembership-><br>    selectByKind(ElementFilterMembership).<br>    condition<br>viewRendering =<br>    let renderings: OrderedSet(ViewRenderingMembership) =<br>        featureMembership->selectByKind(ViewRenderingMembership) in<br>    if renderings->isEmpty() then null<br>    else renderings->first().referencedRendering<br>    endif<br>featureMembership-><br>    selectByKind(ViewRenderingMembership)-><br>    size() <= 1<br>specializesFromLibrary('Views::views')<br>owningType <> null and<br>(owningType.oclIsKindOf(ViewDefinition) or<br> owningType.oclIsKindOf(ViewUsage)) implies<br>    specializesFromLibrary('Views::View::subviews')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:viewUsageViewDefinition](https://www.omg.org/spec/SysML/20230201/vocab#viewUsageViewDefinition)| [0..1]| [sysml_vocab:ViewDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ViewDefinition)| <p>The <code>ViewDefinition</code> that is the <code>definition</code> of this <code>ViewUsage</code>.</p>| <p>The <code>ViewDefinition</code> that is the <code>definition</code> of this <code>ViewUsage</code>.</p>|
| [sysml_vocab:viewUsageSatisfiedViewpoint](https://www.omg.org/spec/SysML/20230201/vocab#viewUsageSatisfiedViewpoint)| [0..*]| [sysml_vocab:ViewpointUsage](https://www.omg.org/spec/SysML/20230201/vocab#ViewpointUsage)| <p>The <code>nestedRequirements</code> of this <code>ViewUsage</code> that are <code>ViewpointUsages</code> for (additional) viewpoints satisfied by the <code>ViewUsage</code>.</p>| <p>The <code>nestedRequirements</code> of this <code>ViewUsage</code> that are <code>ViewpointUsages</code> for (additional) viewpoints satisfied by the <code>ViewUsage</code>.</p>|
| [sysml_vocab:viewUsageExposedElement](https://www.omg.org/spec/SysML/20230201/vocab#viewUsageExposedElement)| [0..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <code>Elements</code> that are exposed by this <code>ViewUsage</code>, which are those <code>memberElements</code> of the imported <code>Memberships</code> from all the <code>Expose</code> <code>Relationships</code> that meet all the owned and inherited <code>viewConditions</code>.</p>| <p>The <code>Elements</code> that are exposed by this <code>ViewUsage</code>, which are those <code>memberElements</code> of the imported <code>Memberships</code> from all the <code>Expose</code> <code>Relationships</code> that meet all the owned and inherited <code>viewConditions</code>.</p>|
| [sysml_vocab:viewUsageViewRendering](https://www.omg.org/spec/SysML/20230201/vocab#viewUsageViewRendering)| [0..1]| [sysml_vocab:RenderingUsage](https://www.omg.org/spec/SysML/20230201/vocab#RenderingUsage)| <p>The <code>RenderingUsage</code> to be used to render views defined by this <code>ViewUsage</code>, which is the <code>referencedRendering</code> of the <code>ViewRenderingMembership</code> of the <code>ViewUsage</code>.<p>| <p>The <code>RenderingUsage</code> to be used to render views defined by this <code>ViewUsage</code>, which is the <code>referencedRendering</code> of the <code>ViewRenderingMembership</code> of the <code>ViewUsage</code>.<p>|
| [sysml_vocab:viewUsageViewCondition](https://www.omg.org/spec/SysML/20230201/vocab#viewUsageViewCondition)| [0..*]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>Expressions</code> related to this <code>ViewUsage</code> by <code>ElementFilterMemberships</code>, which specify conditions on <code>Elements</code> to be rendered in a view.</p>| <p>The <code>Expressions</code> related to this <code>ViewUsage</code> by <code>ElementFilterMemberships</code>, which specify conditions on <code>Elements</code> to be rendered in a view.</p>|



### FramedConcernMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#FramedConcernMembership

type: Shape

target class: [sysml_vocab:FramedConcernMembership](https://www.omg.org/spec/SysML/20230201/vocab#FramedConcernMembership)

definition of vocabulary class : <p>A <code>FramedConcernMembership</code> is a <code>RequirementConstraintMembership</code> for a framed <code>ConcernUsage</code> of a <code>RequirementDefinition</code> or <code>RequirementUsage</code>.</p><br>kind = RequirementConstraintKind::requirement

description: <p>A <code>FramedConcernMembership</code> is a <code>RequirementConstraintMembership</code> for a framed <code>ConcernUsage</code> of a <code>RequirementDefinition</code> or <code>RequirementUsage</code>.</p><br>kind = RequirementConstraintKind::requirement

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:framedConcernMembershipOwnedConcern](https://www.omg.org/spec/SysML/20230201/vocab#framedConcernMembershipOwnedConcern)| [1]| [sysml_vocab:ConcernUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConcernUsage)| <p>The <code>ConcernUsage</code> that is the <code>ownedConstraint</code> of this <code>FramedConcernMembership</code>.</p>| <p>The <code>ConcernUsage</code> that is the <code>ownedConstraint</code> of this <code>FramedConcernMembership</code>.</p>|
| [sysml_vocab:framedConcernMembershipReferencedConcern](https://www.omg.org/spec/SysML/20230201/vocab#framedConcernMembershipReferencedConcern)| [1]| [sysml_vocab:ConcernUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConcernUsage)| <p> The <code>ConcernUsage</code> that is referenced through this <code>FramedConcernMembership</code>. It is the <code>referencedConstraint</code> of the <code>FramedConcernMembership</code> considered as a <code>RequirementConstraintMembership</code>, which must be a <code>ConcernUsage</code>.</p>| <p> The <code>ConcernUsage</code> that is referenced through this <code>FramedConcernMembership</code>. It is the <code>referencedConstraint</code> of the <code>FramedConcernMembership</code> considered as a <code>RequirementConstraintMembership</code>, which must be a <code>ConcernUsage</code>.</p>|



### MembershipExpose

URI: https://www.omg.org/spec/SysML/20230201/shapes#MembershipExpose

type: Shape

target class: [sysml_vocab:MembershipExpose](https://www.omg.org/spec/SysML/20230201/vocab#MembershipExpose)

definition of vocabulary class : <p>A <code>MembershipExpose</code> is an <code>Expose</code> <code.Relationship</code> that exposes a specific <code>importedMembership</code> and, if <code>isRecursive = true</code>, additional <code>Memberships</code> recursively.</p>

description: <p>A <code>MembershipExpose</code> is an <code>Expose</code> <code.Relationship</code> that exposes a specific <code>importedMembership</code> and, if <code>isRecursive = true</code>, additional <code>Memberships</code> recursively.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Dependency

URI: https://www.omg.org/spec/SysML/20230201/shapes#Dependency

type: Shape

target class: [sysml_vocab:Dependency](https://www.omg.org/spec/SysML/20230201/vocab#Dependency)

definition of vocabulary class : <p>A <code>Dependency</code> is a <code>Relationship</code> that indicates that one or more <code>client</code> <code>Elements</code> require one more <code>supplier</code> <code>Elements</code> for their complete specification. In general, this means that a change to one of the <code>supplier</code> <code>Elements</code> may necessitate a change to, or re-specification of, the <code>client</code> <code>Elements</code>.</p><br><br><p>Note that a <code>Dependency</code> is entirely a model-level <code>Relationship</code>, without instance-level semantics.</p>

description: <p>A <code>Dependency</code> is a <code>Relationship</code> that indicates that one or more <code>client</code> <code>Elements</code> require one more <code>supplier</code> <code>Elements</code> for their complete specification. In general, this means that a change to one of the <code>supplier</code> <code>Elements</code> may necessitate a change to, or re-specification of, the <code>client</code> <code>Elements</code>.</p><br><br><p>Note that a <code>Dependency</code> is entirely a model-level <code>Relationship</code>, without instance-level semantics.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:dependencyClient](https://www.omg.org/spec/SysML/20230201/vocab#dependencyClient)| [1..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <code>Element</code> or <code>Elements</code> dependent on the <code>supplier</code> <code>Elements</code>.</p>| <p>The <code>Element</code> or <code>Elements</code> dependent on the <code>supplier</code> <code>Elements</code>.</p>|
| [sysml_vocab:dependencySupplier](https://www.omg.org/spec/SysML/20230201/vocab#dependencySupplier)| [1..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <code>Element</code> or <code>Elements</code> on which the <code>client</code> <code>Elements</code> depend in some respect.</p>| <p>The <code>Element</code> or <code>Elements</code> on which the <code>client</code> <code>Elements</code> depend in some respect.</p>|



### Structure

URI: https://www.omg.org/spec/SysML/20230201/shapes#Structure

type: Shape

target class: [sysml_vocab:Structure](https://www.omg.org/spec/SysML/20230201/vocab#Structure)

definition of vocabulary class : <p>A <code>Structure</code> is a <code>Class</code> of objects in the modeled universe that are primarily structural in nature. While such an object is not itself behavioral, it may be involved in and acted on by <code>Behaviors</code>, and it may be the performer of some of them.</p><br><br>specializesFromLibrary('Objects::Object')<br>ownedSpecialization.general->forAll(not oclIsKindOf(Behavior))

description: <p>A <code>Structure</code> is a <code>Class</code> of objects in the modeled universe that are primarily structural in nature. While such an object is not itself behavioral, it may be involved in and acted on by <code>Behaviors</code>, and it may be the performer of some of them.</p><br><br>specializesFromLibrary('Objects::Object')<br>ownedSpecialization.general->forAll(not oclIsKindOf(Behavior))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### ConjugatedPortTyping

URI: https://www.omg.org/spec/SysML/20230201/shapes#ConjugatedPortTyping

type: Shape

target class: [sysml_vocab:ConjugatedPortTyping](https://www.omg.org/spec/SysML/20230201/vocab#ConjugatedPortTyping)

definition of vocabulary class : <p>A <code>ConjugatedPortTyping</code> is a <code>FeatureTyping</code> whose <code>type</code> is a <code>ConjugatedPortDefinition</code>. (This relationship is intended to be an abstract-syntax marker for a special surface notation for conjugated typing of ports.)</p><br>portDefinition = conjugatedPortDefinition.originalPortDefinition

description: <p>A <code>ConjugatedPortTyping</code> is a <code>FeatureTyping</code> whose <code>type</code> is a <code>ConjugatedPortDefinition</code>. (This relationship is intended to be an abstract-syntax marker for a special surface notation for conjugated typing of ports.)</p><br>portDefinition = conjugatedPortDefinition.originalPortDefinition

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:conjugatedPortTypingPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#conjugatedPortTypingPortDefinition)| [1]| [sysml_vocab:PortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#PortDefinition)| <p>The <code>originalPortDefinition</code> of the <code>conjugatedPortDefinition</code> of this <code>ConjugatedPortTyping</code>.</p>| <p>The <code>originalPortDefinition</code> of the <code>conjugatedPortDefinition</code> of this <code>ConjugatedPortTyping</code>.</p>|
| [sysml_vocab:conjugatedPortTypingConjugatedPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#conjugatedPortTypingConjugatedPortDefinition)| [1]| [sysml_vocab:ConjugatedPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ConjugatedPortDefinition)| <p>The <code>type</code> of this <code>ConjugatedPortTyping</code> considered as a <code>FeatureTyping</code>, which must be a <code>ConjugatedPortDefinition</code>.</p><br>| <p>The <code>type</code> of this <code>ConjugatedPortTyping</code> considered as a <code>FeatureTyping</code>, which must be a <code>ConjugatedPortDefinition</code>.</p><br>|



### LiteralBoolean

URI: https://www.omg.org/spec/SysML/20230201/shapes#LiteralBoolean

type: Shape

target class: [sysml_vocab:LiteralBoolean](https://www.omg.org/spec/SysML/20230201/vocab#LiteralBoolean)

definition of vocabulary class : <p><code>LiteralBoolean</code> is a <code>LiteralExpression</code> that provides a <code><em>Boolean</em></code> value as a result. Its <code>result</code> <code>parameter</code> must have type <code><em>Boolean</em></code>.</p><br><br>specializesFromLibrary('Performances::literalBooleanEvaluations')

description: <p><code>LiteralBoolean</code> is a <code>LiteralExpression</code> that provides a <code><em>Boolean</em></code> value as a result. Its <code>result</code> <code>parameter</code> must have type <code><em>Boolean</em></code>.</p><br><br>specializesFromLibrary('Performances::literalBooleanEvaluations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:literalBooleanValue](https://www.omg.org/spec/SysML/20230201/vocab#literalBooleanValue)| [1]| Boolean| <p>The <code><em>Boolean</em></code> value that is the result of evaluating this <code>LiteralBoolean</code>.</p><br><p>The Boolean value that is the result of evaluating this Expression.</p><br>| <p>The <code><em>Boolean</em></code> value that is the result of evaluating this <code>LiteralBoolean</code>.</p><br><p>The Boolean value that is the result of evaluating this Expression.</p><br>|



### Succession

URI: https://www.omg.org/spec/SysML/20230201/shapes#Succession

type: Shape

target class: [sysml_vocab:Succession](https://www.omg.org/spec/SysML/20230201/vocab#Succession)

definition of vocabulary class : <p>A <code>Succession</code> is a binary <code>Connector</code> that requires its <code>relatedFeatures</code> to happen separately in time.</p><br><br>specializesFromLibrary('Occurences::happensBeforeLinks')<br>transitionStep =<br>    if owningNamespace.oclIsKindOf(Step) and <br>        owningNamespace.oclAsType(Step).<br>            specializesFromLibrary('TransitionPerformances::TransitionPerformance') then<br>        owningNamespace.oclAsType(Step)<br>    else null<br>    endif<br>triggerStep =<br>    if transitionStep = null or <br>       transitionStep.ownedFeature.size() < 2 or<br>       not transitionStep.ownedFeature->at(2).oclIsKindOf(Step) <br>    then Set{}<br>    else Set{transitionStep.ownedFeature->at(2).oclAsType(Step)}<br>    endif<br>effectStep =<br>    if transitionStep = null or <br>       transitionStep.ownedFeature.size() < 4 or<br>       not transitionStep.ownedFeature->at(4).oclIsKindOf(Step) <br>    then Set{}<br>    else Set{transitionStep.ownedFeature->at(4).oclAsType(Step)}<br>    endif<br>guardExpression =<br>    if transitionStep = null or <br>       transitionStep.ownedFeature.size() < 3 or<br>       not transitionStep.ownedFeature->at(3).oclIsKindOf(Expression) <br>    then Set{}<br>    else Set{transitionStep.ownedFeature->at(3).oclAsType(Expression)}<br>    endif

description: <p>A <code>Succession</code> is a binary <code>Connector</code> that requires its <code>relatedFeatures</code> to happen separately in time.</p><br><br>specializesFromLibrary('Occurences::happensBeforeLinks')<br>transitionStep =<br>    if owningNamespace.oclIsKindOf(Step) and <br>        owningNamespace.oclAsType(Step).<br>            specializesFromLibrary('TransitionPerformances::TransitionPerformance') then<br>        owningNamespace.oclAsType(Step)<br>    else null<br>    endif<br>triggerStep =<br>    if transitionStep = null or <br>       transitionStep.ownedFeature.size() < 2 or<br>       not transitionStep.ownedFeature->at(2).oclIsKindOf(Step) <br>    then Set{}<br>    else Set{transitionStep.ownedFeature->at(2).oclAsType(Step)}<br>    endif<br>effectStep =<br>    if transitionStep = null or <br>       transitionStep.ownedFeature.size() < 4 or<br>       not transitionStep.ownedFeature->at(4).oclIsKindOf(Step) <br>    then Set{}<br>    else Set{transitionStep.ownedFeature->at(4).oclAsType(Step)}<br>    endif<br>guardExpression =<br>    if transitionStep = null or <br>       transitionStep.ownedFeature.size() < 3 or<br>       not transitionStep.ownedFeature->at(3).oclIsKindOf(Expression) <br>    then Set{}<br>    else Set{transitionStep.ownedFeature->at(3).oclAsType(Expression)}<br>    endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:successionTransitionStep](https://www.omg.org/spec/SysML/20230201/vocab#successionTransitionStep)| [0..1]| [sysml_vocab:Step](https://www.omg.org/spec/SysML/20230201/vocab#Step)| <p>A <code>Step</code> that is typed by the <code>Behavior</code> <code><em>TransitionPerformances::TransitionPerformance</em></code> (from the Kernel Semantic Library) that has this <code>Succession</code> as its <em><code>transitionLink</code></em>.</p><br>| <p>A <code>Step</code> that is typed by the <code>Behavior</code> <code><em>TransitionPerformances::TransitionPerformance</em></code> (from the Kernel Semantic Library) that has this <code>Succession</code> as its <em><code>transitionLink</code></em>.</p><br>|
| [sysml_vocab:successionTriggerStep](https://www.omg.org/spec/SysML/20230201/vocab#successionTriggerStep)| [0..*]| [sysml_vocab:Step](https://www.omg.org/spec/SysML/20230201/vocab#Step)| <p><code>Steps</code> that map incoming events to the timing of occurrences of the <code>transitionStep</code>. The values of <code>triggerStep</code> subset the list of acceptable events to be received by a <code>Behavior</code> or the object that performs it.</p><br>| <p><code>Steps</code> that map incoming events to the timing of occurrences of the <code>transitionStep</code>. The values of <code>triggerStep</code> subset the list of acceptable events to be received by a <code>Behavior</code> or the object that performs it.</p><br>|
| [sysml_vocab:successionEffectStep](https://www.omg.org/spec/SysML/20230201/vocab#successionEffectStep)| [0..*]| [sysml_vocab:Step](https://www.omg.org/spec/SysML/20230201/vocab#Step)| <p><code>Steps</code> that represent occurrences that are side effects of the <code>transitionStep</code> occurring.</p><br>| <p><code>Steps</code> that represent occurrences that are side effects of the <code>transitionStep</code> occurring.</p><br>|
| [sysml_vocab:successionGuardExpression](https://www.omg.org/spec/SysML/20230201/vocab#successionGuardExpression)| [0..*]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p><code>Expressions</code> that must evaluate to true before the <code>transitionStep</code> can occur.</p><br>| <p><code>Expressions</code> that must evaluate to true before the <code>transitionStep</code> can occur.</p><br>|



### RequirementUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#RequirementUsage

type: Shape

target class: [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)

definition of vocabulary class : <p>A <code>RequirementUsage</code> is a <code>Usage</code> of a <code>RequirementDefinition</code>.</p><br>actorParameter = featureMembership-><br>    selectByKind(ActorMembership).<br>    ownedActorParameter<br>assumedConstraint = ownedFeatureMembership-><br>    selectByKind(RequirementConstraintMembership)-><br>    select(kind = RequirementConstraintKind::assumption).<br>    ownedConstraint<br>framedConcern = featureMembership-><br>    selectByKind(FramedConcernMembership).<br>    ownedConcern<br>requiredConstraint = ownedFeatureMembership-><br>    selectByKind(RequirementConstraintMembership)-><br>    select(kind = RequirementConstraintKind::requirement).<br>    ownedConstraint<br>stakeholderParameter = featureMembership-><br>    selectByKind(AStakholderMembership).<br>    ownedStakeholderParameter<br>subjectParameter =<br>    let subjects : OrderedSet(SubjectMembership) = <br>        featureMembership->selectByKind(SubjectMembership) in<br>    if subjects->isEmpty() then null<br>    else subjects->first().ownedSubjectParameter<br>    endif<br>text = documentation.body<br>featureMembership-><br>    selectByKind(SubjectMembership)-><br>    size() <= 1<br>input->notEmpty() and input->first() = subjectParameter<br>specializesFromLibrary('Requirements::requirementChecks')<br>isComposite and owningType <> null and<br>    (owningType.oclIsKindOf(RequirementDefinition) or<br>     owningType.oclIsKindOf(RequirementUsage)) implies<br>    specializesFromLibrary('Requirements::RequirementCheck::subrequirements')<br>owningfeatureMembership <> null and<br>owningfeatureMembership.oclIsKindOf(ObjectiveMembership) implies<br>    owningType.ownedSpecialization.general->forAll(gen |<br>        (gen.oclIsKindOf(CaseDefinition) implies<br>            redefines(gen.oclAsType(CaseDefinition).objectiveRequirement)) and<br>        (gen.oclIsKindOf(CaseUsage) implies<br>            redefines(gen.oclAsType(CaseUsage).objectiveRequirement))<br>owningFeatureMembership <> null and<br>owningFeatureMembership.oclIsKindOf(RequirementVerificationMembership) implies<br>    specializesFromLibrary('VerificationCases::VerificationCase::obj::requirementVerifications')

description: <p>A <code>RequirementUsage</code> is a <code>Usage</code> of a <code>RequirementDefinition</code>.</p><br>actorParameter = featureMembership-><br>    selectByKind(ActorMembership).<br>    ownedActorParameter<br>assumedConstraint = ownedFeatureMembership-><br>    selectByKind(RequirementConstraintMembership)-><br>    select(kind = RequirementConstraintKind::assumption).<br>    ownedConstraint<br>framedConcern = featureMembership-><br>    selectByKind(FramedConcernMembership).<br>    ownedConcern<br>requiredConstraint = ownedFeatureMembership-><br>    selectByKind(RequirementConstraintMembership)-><br>    select(kind = RequirementConstraintKind::requirement).<br>    ownedConstraint<br>stakeholderParameter = featureMembership-><br>    selectByKind(AStakholderMembership).<br>    ownedStakeholderParameter<br>subjectParameter =<br>    let subjects : OrderedSet(SubjectMembership) = <br>        featureMembership->selectByKind(SubjectMembership) in<br>    if subjects->isEmpty() then null<br>    else subjects->first().ownedSubjectParameter<br>    endif<br>text = documentation.body<br>featureMembership-><br>    selectByKind(SubjectMembership)-><br>    size() <= 1<br>input->notEmpty() and input->first() = subjectParameter<br>specializesFromLibrary('Requirements::requirementChecks')<br>isComposite and owningType <> null and<br>    (owningType.oclIsKindOf(RequirementDefinition) or<br>     owningType.oclIsKindOf(RequirementUsage)) implies<br>    specializesFromLibrary('Requirements::RequirementCheck::subrequirements')<br>owningfeatureMembership <> null and<br>owningfeatureMembership.oclIsKindOf(ObjectiveMembership) implies<br>    owningType.ownedSpecialization.general->forAll(gen |<br>        (gen.oclIsKindOf(CaseDefinition) implies<br>            redefines(gen.oclAsType(CaseDefinition).objectiveRequirement)) and<br>        (gen.oclIsKindOf(CaseUsage) implies<br>            redefines(gen.oclAsType(CaseUsage).objectiveRequirement))<br>owningFeatureMembership <> null and<br>owningFeatureMembership.oclIsKindOf(RequirementVerificationMembership) implies<br>    specializesFromLibrary('VerificationCases::VerificationCase::obj::requirementVerifications')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:requirementUsageReqId](https://www.omg.org/spec/SysML/20230201/vocab#requirementUsageReqId)| [0..1]| String| <p>An optional modeler-specified identifier for this <code>RequirementUsage</code> (used, e.g., to link it to an original requirement text in some source document), which is the <code>declaredShortName</code> for the <code>RequirementUsage</code>.</p>| <p>An optional modeler-specified identifier for this <code>RequirementUsage</code> (used, e.g., to link it to an original requirement text in some source document), which is the <code>declaredShortName</code> for the <code>RequirementUsage</code>.</p>|
| [sysml_vocab:requirementUsageText](https://www.omg.org/spec/SysML/20230201/vocab#requirementUsageText)| [0..*]| String| <p>An optional textual statement of the requirement represented by this <code>RequirementUsage</code>, derived from the <code>bodies<code> of the <code>documentation</code> of the <code>RequirementUsage</code>.</p>| <p>An optional textual statement of the requirement represented by this <code>RequirementUsage</code>, derived from the <code>bodies<code> of the <code>documentation</code> of the <code>RequirementUsage</code>.</p>|
| [sysml_vocab:requirementUsageRequirementDefinition](https://www.omg.org/spec/SysML/20230201/vocab#requirementUsageRequirementDefinition)| [0..1]| [sysml_vocab:RequirementDefinition](https://www.omg.org/spec/SysML/20230201/vocab#RequirementDefinition)| <p>The <code>RequirementDefinition</code> that is the single <code>definition</code> of this <code>RequirementUsage</code>.</p>| <p>The <code>RequirementDefinition</code> that is the single <code>definition</code> of this <code>RequirementUsage</code>.</p>|
| [sysml_vocab:requirementUsageRequiredConstraint](https://www.omg.org/spec/SysML/20230201/vocab#requirementUsageRequiredConstraint)| [0..*]| [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)| <p>The owned <code>ConstraintUsages</code> that represent requirements of this <code>RequirementUsage</code>, which are the <code>ownedConstraints</code> of the <code>RequirementConstraintMemberships</code> of the <code>RequirementUsage</code> with <code>kind</code> = <code>requirement</code>.</p>| <p>The owned <code>ConstraintUsages</code> that represent requirements of this <code>RequirementUsage</code>, which are the <code>ownedConstraints</code> of the <code>RequirementConstraintMemberships</code> of the <code>RequirementUsage</code> with <code>kind</code> = <code>requirement</code>.</p>|
| [sysml_vocab:requirementUsageAssumedConstraint](https://www.omg.org/spec/SysML/20230201/vocab#requirementUsageAssumedConstraint)| [0..*]| [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)| <p>The owned <code>ConstraintUsages</code> that represent assumptions of this <code>RequirementUsage</code>, derived as the <code>ownedConstraints</code> of the <code>RequirementConstraintMemberships</code> of the <code>RequirementUsage</code> with <code>kind</code> = <code>assumption</code>.</p>| <p>The owned <code>ConstraintUsages</code> that represent assumptions of this <code>RequirementUsage</code>, derived as the <code>ownedConstraints</code> of the <code>RequirementConstraintMemberships</code> of the <code>RequirementUsage</code> with <code>kind</code> = <code>assumption</code>.</p>|
| [sysml_vocab:requirementUsageSubjectParameter](https://www.omg.org/spec/SysML/20230201/vocab#requirementUsageSubjectParameter)| [1]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>parameter</code> of this <code>RequirementUsage</code> that represents its subject.</p>| <p>The <code>parameter</code> of this <code>RequirementUsage</code> that represents its subject.</p>|
| [sysml_vocab:requirementUsageFramedConcern](https://www.omg.org/spec/SysML/20230201/vocab#requirementUsageFramedConcern)| [0..*]| [sysml_vocab:ConcernUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConcernUsage)| <p>The <code>ConcernUsages</code> framed by this <code>RequirementUsage</code>, which are the <code>ownedConcerns</code> of all <code>FramedConcernMemberships</code> of the <code>RequirementUsage</code>.</p>| <p>The <code>ConcernUsages</code> framed by this <code>RequirementUsage</code>, which are the <code>ownedConcerns</code> of all <code>FramedConcernMemberships</code> of the <code>RequirementUsage</code>.</p>|
| [sysml_vocab:requirementUsageActorParameter](https://www.omg.org/spec/SysML/20230201/vocab#requirementUsageActorParameter)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The <code>parameters</code> of this <code>RequirementUsage</code> that represent actors involved in the requirement.</p>| <p>The <code>parameters</code> of this <code>RequirementUsage</code> that represent actors involved in the requirement.</p>|
| [sysml_vocab:requirementUsageStakeholderParameter](https://www.omg.org/spec/SysML/20230201/vocab#requirementUsageStakeholderParameter)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The <code>parameters</code> of this <code>RequirementUsage</code> that represent stakeholders for the requirement.</p>| <p>The <code>parameters</code> of this <code>RequirementUsage</code> that represent stakeholders for the requirement.</p>|



### LiteralString

URI: https://www.omg.org/spec/SysML/20230201/shapes#LiteralString

type: Shape

target class: [sysml_vocab:LiteralString](https://www.omg.org/spec/SysML/20230201/vocab#LiteralString)

definition of vocabulary class : <p>A <code>LiteralString</code> is a <code>LiteralExpression</code> that provides a <code><em>String</em></code> value as a result. Its <code>result</code> <code>parameter</code> must have the type <code><em>String</em></code>.</p><br><br>specializesFromLibrary('Performances::literalStringEvaluations')

description: <p>A <code>LiteralString</code> is a <code>LiteralExpression</code> that provides a <code><em>String</em></code> value as a result. Its <code>result</code> <code>parameter</code> must have the type <code><em>String</em></code>.</p><br><br>specializesFromLibrary('Performances::literalStringEvaluations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:literalStringValue](https://www.omg.org/spec/SysML/20230201/vocab#literalStringValue)| [1]| String| <p>The <code><em>String</em></code> value that is the result of evaluating this <code>LiteralString</code>.</p><br><br><p>The String value that is the result of evaluating this Expression.</p>| <p>The <code><em>String</em></code> value that is the result of evaluating this <code>LiteralString</code>.</p><br><br><p>The String value that is the result of evaluating this Expression.</p>|



### DataType

URI: https://www.omg.org/spec/SysML/20230201/shapes#DataType

type: Shape

target class: [sysml_vocab:DataType](https://www.omg.org/spec/SysML/20230201/vocab#DataType)

definition of vocabulary class : <p>A <code>DataType</code> is a <code>Classifier</code> of things (in the universe) that can only be distinguished by how they are related to other things (via Features). This means multiple things classified by the same <code>DataType</code></p><br><br><ul><br>	<li>Cannot be distinguished when they are related to other things in exactly the same way, even when they are intended to be about different things.</li><br>	<li>Can be distinguished when they are related to other things in different ways, even when they are intended to be about the same thing.</li><br></ul><br><br>specializesFromLibrary('Base::DataValue')<br>ownedSpecialization.general-><br>    forAll(not oclIsKindOf(Class) and <br>           not oclIsKindOf(Association))

description: <p>A <code>DataType</code> is a <code>Classifier</code> of things (in the universe) that can only be distinguished by how they are related to other things (via Features). This means multiple things classified by the same <code>DataType</code></p><br><br><ul><br>	<li>Cannot be distinguished when they are related to other things in exactly the same way, even when they are intended to be about different things.</li><br>	<li>Can be distinguished when they are related to other things in different ways, even when they are intended to be about the same thing.</li><br></ul><br><br>specializesFromLibrary('Base::DataValue')<br>ownedSpecialization.general-><br>    forAll(not oclIsKindOf(Class) and <br>           not oclIsKindOf(Association))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### AttributeUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#AttributeUsage

type: Shape

target class: [sysml_vocab:AttributeUsage](https://www.omg.org/spec/SysML/20230201/vocab#AttributeUsage)

definition of vocabulary class : <p>An <code>AttributeUsage</code> is a <code>Usage</code> whose type is a <code>DataType</code>. Nominally, if the type is an <code>AttributeDefinition</code>, an <code>AttributeUsage</code> is a usage of a <code>AttributeDefinition</code> to represent the value of some system quality or characteristic. However, other kinds of kernel <code>DataTypes</code> are also allowed, to permit use of <code>DataTypes</code> from the Kernel Model Libraries. An <code>AttributeUsage</code> itself as well as all its nested <code>features</code> must be referential (non-composite).</p><br><br><p>An <code>AttributeUsage</code> must specialize, directly or indirectly, the base <code>Feature</code> <code><em>Base::dataValues</em></code> from the Kernel Semantic Library.</p><br>isReference<br>feature->forAll(not isComposite)<br>specializesFromLibrary('Base::dataValues')

description: <p>An <code>AttributeUsage</code> is a <code>Usage</code> whose type is a <code>DataType</code>. Nominally, if the type is an <code>AttributeDefinition</code>, an <code>AttributeUsage</code> is a usage of a <code>AttributeDefinition</code> to represent the value of some system quality or characteristic. However, other kinds of kernel <code>DataTypes</code> are also allowed, to permit use of <code>DataTypes</code> from the Kernel Model Libraries. An <code>AttributeUsage</code> itself as well as all its nested <code>features</code> must be referential (non-composite).</p><br><br><p>An <code>AttributeUsage</code> must specialize, directly or indirectly, the base <code>Feature</code> <code><em>Base::dataValues</em></code> from the Kernel Semantic Library.</p><br>isReference<br>feature->forAll(not isComposite)<br>specializesFromLibrary('Base::dataValues')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:attributeUsageAttributeDefinition](https://www.omg.org/spec/SysML/20230201/vocab#attributeUsageAttributeDefinition)| [0..*]| [sysml_vocab:DataType](https://www.omg.org/spec/SysML/20230201/vocab#DataType)| <p>The <code>DataTypes</code> that are the types of this <code>AttributeUsage</code>. Nominally, these are <code>AttributeDefinitions</code>, but other kinds of kernel <code>DataTypes</code> are also allowed, to permit use of <code>DataTypes</code> from the Kernel Model Libraries.</p>| <p>The <code>DataTypes</code> that are the types of this <code>AttributeUsage</code>. Nominally, these are <code>AttributeDefinitions</code>, but other kinds of kernel <code>DataTypes</code> are also allowed, to permit use of <code>DataTypes</code> from the Kernel Model Libraries.</p>|



### OperatorExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#OperatorExpression

type: Shape

target class: [sysml_vocab:OperatorExpression](https://www.omg.org/spec/SysML/20230201/vocab#OperatorExpression)

definition of vocabulary class : <p>An <code>OperatorExpression</code> is an <code>InvocationExpression</code> whose <code>function</code> is determined by resolving its <code>operator</code> in the context of one of the standard packages from the Kernel Function Library.</p><br>let libFunctions : Sequence(Element) = <br>    Sequence{'BaseFunctions', 'DataFunctions', 'ControlFunctions'}-><br>    collect(ns | resolveGlobal(ns + "::'" + operator + "'").<br>    memberElement) in<br>libFunctions->includes(function)<br>    <br>

description: <p>An <code>OperatorExpression</code> is an <code>InvocationExpression</code> whose <code>function</code> is determined by resolving its <code>operator</code> in the context of one of the standard packages from the Kernel Function Library.</p><br>let libFunctions : Sequence(Element) = <br>    Sequence{'BaseFunctions', 'DataFunctions', 'ControlFunctions'}-><br>    collect(ns | resolveGlobal(ns + "::'" + operator + "'").<br>    memberElement) in<br>libFunctions->includes(function)<br>    <br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:operatorExpressionOperator](https://www.omg.org/spec/SysML/20230201/vocab#operatorExpressionOperator)| [1]| String| <p>An <code>operator</code> symbol that names a corresponding <code>Function</code> from one of the standard packages from the Kernel Function Library .</p>| <p>An <code>operator</code> symbol that names a corresponding <code>Function</code> from one of the standard packages from the Kernel Function Library .</p>|



### ConcernDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#ConcernDefinition

type: Shape

target class: [sysml_vocab:ConcernDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ConcernDefinition)

definition of vocabulary class : <p>A <code>ConcernDefinition</code> is a <code>RequirementDefinition</code> that one or more stakeholders may be interested in having addressed. These stakeholders are identified by the <code>ownedStakeholders</code>of the <code>ConcernDefinition</code>.</p><br><br>specializesFromLibrary('Requirements::ConcernCheck')

description: <p>A <code>ConcernDefinition</code> is a <code>RequirementDefinition</code> that one or more stakeholders may be interested in having addressed. These stakeholders are identified by the <code>ownedStakeholders</code>of the <code>ConcernDefinition</code>.</p><br><br>specializesFromLibrary('Requirements::ConcernCheck')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Expression

URI: https://www.omg.org/spec/SysML/20230201/shapes#Expression

type: Shape

target class: [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)

definition of vocabulary class : <p>An <code>Expression</code> is a <code>Step</code> that is typed by a <code>Function</code>. An <code>Expression</code> that also has a <code>Function</code> as its <code>featuringType</code> is a computational step within that <code>Function</code>. An <code>Expression</code> always has a single <code>result</code> parameter, which redefines the <code>result</code> parameter of its defining <code>function</code>. This allows <code>Expressions</code> to be interconnected in tree structures, in which inputs to each <code>Expression</code> in the tree are determined as the results of other <code>Expression</code> in the tree.</p><br><br>isModelLevelEvaluable = modelLevelEvaluable(Set(Element){})<br>specializesFromLibrary('Performances::evaluations')<br>owningMembership <> null and <br>owningMembership.oclIsKindOf(FeatureValue) implies<br>    let featureWithValue : Feature = <br>        owningMembership.oclAsType(FeatureValue).featureWithValue in<br>    featuringType = featureWithValue.featuringType<br>ownedMembership.selectByKind(ResultExpressionMembership)-><br>    forAll(mem | ownedFeature.selectByKind(BindingConnector)-><br>        exists(binding |<br>            binding.relatedFeature->includes(result) and<br>            binding.relatedFeature->includes(mem.ownedResultExpression.result)))<br>result =<br>    let resultParams : Sequence(Feature) =<br>        ownedFeatureMemberships-><br>            selectByKind(ReturnParameterMembership).<br>            ownedParameterMember in<br>    if resultParams->notEmpty() then resultParams->first()<br>    else if function <> null then function.result<br>    else null<br>    endif endif<br>ownedFeatureMembership-><br>    selectByKind(ReturnParameterMembership)-><br>    size() <= 1<br>membership->selectByKind(ResultExpressionMembership)->size() <= 1

description: <p>An <code>Expression</code> is a <code>Step</code> that is typed by a <code>Function</code>. An <code>Expression</code> that also has a <code>Function</code> as its <code>featuringType</code> is a computational step within that <code>Function</code>. An <code>Expression</code> always has a single <code>result</code> parameter, which redefines the <code>result</code> parameter of its defining <code>function</code>. This allows <code>Expressions</code> to be interconnected in tree structures, in which inputs to each <code>Expression</code> in the tree are determined as the results of other <code>Expression</code> in the tree.</p><br><br>isModelLevelEvaluable = modelLevelEvaluable(Set(Element){})<br>specializesFromLibrary('Performances::evaluations')<br>owningMembership <> null and <br>owningMembership.oclIsKindOf(FeatureValue) implies<br>    let featureWithValue : Feature = <br>        owningMembership.oclAsType(FeatureValue).featureWithValue in<br>    featuringType = featureWithValue.featuringType<br>ownedMembership.selectByKind(ResultExpressionMembership)-><br>    forAll(mem | ownedFeature.selectByKind(BindingConnector)-><br>        exists(binding |<br>            binding.relatedFeature->includes(result) and<br>            binding.relatedFeature->includes(mem.ownedResultExpression.result)))<br>result =<br>    let resultParams : Sequence(Feature) =<br>        ownedFeatureMemberships-><br>            selectByKind(ReturnParameterMembership).<br>            ownedParameterMember in<br>    if resultParams->notEmpty() then resultParams->first()<br>    else if function <> null then function.result<br>    else null<br>    endif endif<br>ownedFeatureMembership-><br>    selectByKind(ReturnParameterMembership)-><br>    size() <= 1<br>membership->selectByKind(ResultExpressionMembership)->size() <= 1

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:expressionIsModelLevelEvaluable](https://www.omg.org/spec/SysML/20230201/vocab#expressionIsModelLevelEvaluable)| [1]| Boolean| <p>Whether this <code>Expression</code> meets the constraints necessary to be evaluated at <em>model level</em>, that is, using metadata within the model.</p>| <p>Whether this <code>Expression</code> meets the constraints necessary to be evaluated at <em>model level</em>, that is, using metadata within the model.</p>|
| [sysml_vocab:expressionFunction](https://www.omg.org/spec/SysML/20230201/vocab#expressionFunction)| [0..1]| [sysml_vocab:Function](https://www.omg.org/spec/SysML/20230201/vocab#Function)| <p>The <code>Function</code> that types this <code>Expression</code>.</p><br><br><p>This is the Function that types the Expression.</p><br>| <p>The <code>Function</code> that types this <code>Expression</code>.</p><br><br><p>This is the Function that types the Expression.</p><br>|
| [sysml_vocab:expressionResult](https://www.omg.org/spec/SysML/20230201/vocab#expressionResult)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p><p>An <code>output</code> <code>parameter</code> of the <code>Expression</code> whose value is the result of the <code>Expression</code>. The result of an <code>Expression</code> is either inherited from its <code>function</code> or it is related to the <code>Expression</code> via a <code>ReturnParameterMembership</code>, in which case it redefines the <code>result</code> <code>parameter</code> of its <code>function</code>.</p><br>| <p><p>An <code>output</code> <code>parameter</code> of the <code>Expression</code> whose value is the result of the <code>Expression</code>. The result of an <code>Expression</code> is either inherited from its <code>function</code> or it is related to the <code>Expression</code> via a <code>ReturnParameterMembership</code>, in which case it redefines the <code>result</code> <code>parameter</code> of its <code>function</code>.</p><br>|



### InvocationExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#InvocationExpression

type: Shape

target class: [sysml_vocab:InvocationExpression](https://www.omg.org/spec/SysML/20230201/vocab#InvocationExpression)

definition of vocabulary class : <p>An <code>InvocationExpression</code> is an <code>Expression</code> each of whose input <code>parameters</code> are bound to the <code>result</code> of an <code>argument</code> Expression.</p><br><br>not ownedTyping->exists(oclIsKindOf(Behavior)) and<br>not ownedSubsetting.subsettedFeature.type->exists(oclIsKindOf(Behavior)) implies<br>    ownedFeature.selectByKind(BindingConnector)->exists(<br>        relatedFeature->includes(self) and<br>        relatedFeature->includes(result))<br>            <br>TBD<br>ownedFeature-><br>    select(direction = _'in').valuation-><br>    select(v | v <> null).value<br>let features : Set(Feature) = type.feature->asSet() in<br>input->forAll(inp | <br>    inp.ownedRedefinition.redefinedFeature-><br>        intersection(features)->size() = 1)<br>let features : Set(Feature) = type.feature->asSet() in<br>input->forAll(inp1 | input->forAll(inp2 |<br>    inp1 <> inp2 implies<br>        inp1.ownedRedefinition.redefinedFeature-><br>            intersection(inp2.ownedRedefinition.redefinedFeature)-><br>            intersection(features)->isEmpty()))

description: <p>An <code>InvocationExpression</code> is an <code>Expression</code> each of whose input <code>parameters</code> are bound to the <code>result</code> of an <code>argument</code> Expression.</p><br><br>not ownedTyping->exists(oclIsKindOf(Behavior)) and<br>not ownedSubsetting.subsettedFeature.type->exists(oclIsKindOf(Behavior)) implies<br>    ownedFeature.selectByKind(BindingConnector)->exists(<br>        relatedFeature->includes(self) and<br>        relatedFeature->includes(result))<br>            <br>TBD<br>ownedFeature-><br>    select(direction = _'in').valuation-><br>    select(v | v <> null).value<br>let features : Set(Feature) = type.feature->asSet() in<br>input->forAll(inp | <br>    inp.ownedRedefinition.redefinedFeature-><br>        intersection(features)->size() = 1)<br>let features : Set(Feature) = type.feature->asSet() in<br>input->forAll(inp1 | input->forAll(inp2 |<br>    inp1 <> inp2 implies<br>        inp1.ownedRedefinition.redefinedFeature-><br>            intersection(inp2.ownedRedefinition.redefinedFeature)-><br>            intersection(features)->isEmpty()))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:invocationExpressionArgument](https://www.omg.org/spec/SysML/20230201/vocab#invocationExpressionArgument)| [0..*]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>value</code> <code>Expressions</code> of the <code>FeatureValues</code> of the owned input <code>parameters</code> of the <code>InvocationExpression</code>.| <p>The <code>value</code> <code>Expressions</code> of the <code>FeatureValues</code> of the owned input <code>parameters</code> of the <code>InvocationExpression</code>.|
| [sysml_vocab:invocationExpressionOperand](https://www.omg.org/spec/SysML/20230201/vocab#invocationExpressionOperand)| [0..*]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| n/a| n/a|



### Featuring

URI: https://www.omg.org/spec/SysML/20230201/shapes#Featuring

type: Shape

target class: [sysml_vocab:Featuring](https://www.omg.org/spec/SysML/20230201/vocab#Featuring)

definition of vocabulary class : <p><code>Featuring</code> is a <code>Relationship</code> between a <code>Type</code> and a <code>Feature</code> that is featured by that <code>Type</code>. It asserts that every instance in the domain of the <code>feature</code> must be classified by the <code>type</code>.</p><br><br><p><code>Featuring</code> is abstract and does not commit to which of <code>feature</code> or <code>type</code> are the <code>source</code> or <code>target</code> of the <code>Relationship</code>. This commitment is made in the subclasses of <code>Featuring</code>, <code>TypeFeaturing</code> and <code>FeatureMembership</code>, which have opposite directions.</p>

description: <p><code>Featuring</code> is a <code>Relationship</code> between a <code>Type</code> and a <code>Feature</code> that is featured by that <code>Type</code>. It asserts that every instance in the domain of the <code>feature</code> must be classified by the <code>type</code>.</p><br><br><p><code>Featuring</code> is abstract and does not commit to which of <code>feature</code> or <code>type</code> are the <code>source</code> or <code>target</code> of the <code>Relationship</code>. This commitment is made in the subclasses of <code>Featuring</code>, <code>TypeFeaturing</code> and <code>FeatureMembership</code>, which have opposite directions.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:featuringType](https://www.omg.org/spec/SysML/20230201/vocab#featuringType)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The <code>Type<code> that features the <code>featureOfType</code>.</p>| <p>The <code>Type<code> that features the <code>featureOfType</code>.</p>|
| [sysml_vocab:featuringFeature](https://www.omg.org/spec/SysML/20230201/vocab#featuringFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is featured by the <code>featuringType</code>.</p>| <p>The <code>Feature</code> that is featured by the <code>featuringType</code>.</p>|



### MetadataAccessExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#MetadataAccessExpression

type: Shape

target class: [sysml_vocab:MetadataAccessExpression](https://www.omg.org/spec/SysML/20230201/vocab#MetadataAccessExpression)

definition of vocabulary class : <p>A <code>MetadataAccessExpression</code> is an <code>Expression</code> whose <code>result</code> is a sequence of instances of <code>Metaclasses</code> representing all the <code>MetadataFeature</code> annotations of the <code>referencedElement</code>. In addition, the sequence includes an instance of the reflective <code>Metaclass</code> corresponding to the MOF class of the <code>referencedElement</code>, with values for all the abstract syntax properties of the <code>referencedElement</code>.</p><br>specializesFromLibrary('Performances::metadataAccessEvaluations')

description: <p>A <code>MetadataAccessExpression</code> is an <code>Expression</code> whose <code>result</code> is a sequence of instances of <code>Metaclasses</code> representing all the <code>MetadataFeature</code> annotations of the <code>referencedElement</code>. In addition, the sequence includes an instance of the reflective <code>Metaclass</code> corresponding to the MOF class of the <code>referencedElement</code>, with values for all the abstract syntax properties of the <code>referencedElement</code>.</p><br>specializesFromLibrary('Performances::metadataAccessEvaluations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:metadataAccessExpressionReferencedElement](https://www.omg.org/spec/SysML/20230201/vocab#metadataAccessExpressionReferencedElement)| [1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p> The <code>Element</code> whose metadata is being accessed.</p>| <p> The <code>Element</code> whose metadata is being accessed.</p>|



### AssignmentActionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#AssignmentActionUsage

type: Shape

target class: [sysml_vocab:AssignmentActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#AssignmentActionUsage)

definition of vocabulary class : <p>An <code>AssignmentActionUsage</code> is an <code>ActionUsage</code> that is defined, directly or indirectly, by the <code>ActionDefinition</code> <em><code>AssignmentAction</code></em> from the Systems Model Library. It specifies that the value of the <code>referent</code> <code>Feature</code>, relative to the target given by the result of the <code>targetArgument</code> <code>Expression</code>, should be set to the result of the <code>valueExpression</code>.</p><br><br>specializesFromLibrary('Actions::assignmentActions')<br>let targetParameter : Feature = inputParameter(1) in<br>targetParameter <> null and<br>targetParameter.ownedFeature->notEmpty() and<br>targetParameter.ownedFeature->first().<br>    redefines('AssignmentAction::target::startingAt')<br>valueExpression = argument(2)<br>targetArgument = argument(1)<br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::assignments')<br>let targetParameter : Feature = inputParameter(1) in<br>targetParameter <> null and<br>targetParameter.ownedFeature->notEmpty() and<br>targetParameter->first().ownedFeature->notEmpty() and<br>targetParameter->first().ownedFeature->first().<br>    redefines('AssigmentAction::target::startingAt::accessedFeature')<br>let targetParameter : Feature = inputParameter(1) in<br>targetParameter <> null and<br>targetParameter.ownedFeature->notEmpty() and<br>targetParameter->first().ownedFeature->notEmpty() and<br>targetParameter->first().ownedFeature->first().redefines(referent)<br>referent =<br>    let unownedFeatures : Sequence(Feature) = ownedMembership-><br>        reject(oclIsKindOf(FeatureMembership)).memberElement-><br>        selectByKind(Feature) in<br>    if unownedFeatures->isEmpty() then null<br>    else unownedFeatures->first().oclAsType(Feature)<br>    endif<br>ownedMembership->exists(<br>    not oclIsKindOf(OwningMembership) and <br>    memberElement.oclIsKindOf(Feature))

description: <p>An <code>AssignmentActionUsage</code> is an <code>ActionUsage</code> that is defined, directly or indirectly, by the <code>ActionDefinition</code> <em><code>AssignmentAction</code></em> from the Systems Model Library. It specifies that the value of the <code>referent</code> <code>Feature</code>, relative to the target given by the result of the <code>targetArgument</code> <code>Expression</code>, should be set to the result of the <code>valueExpression</code>.</p><br><br>specializesFromLibrary('Actions::assignmentActions')<br>let targetParameter : Feature = inputParameter(1) in<br>targetParameter <> null and<br>targetParameter.ownedFeature->notEmpty() and<br>targetParameter.ownedFeature->first().<br>    redefines('AssignmentAction::target::startingAt')<br>valueExpression = argument(2)<br>targetArgument = argument(1)<br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::assignments')<br>let targetParameter : Feature = inputParameter(1) in<br>targetParameter <> null and<br>targetParameter.ownedFeature->notEmpty() and<br>targetParameter->first().ownedFeature->notEmpty() and<br>targetParameter->first().ownedFeature->first().<br>    redefines('AssigmentAction::target::startingAt::accessedFeature')<br>let targetParameter : Feature = inputParameter(1) in<br>targetParameter <> null and<br>targetParameter.ownedFeature->notEmpty() and<br>targetParameter->first().ownedFeature->notEmpty() and<br>targetParameter->first().ownedFeature->first().redefines(referent)<br>referent =<br>    let unownedFeatures : Sequence(Feature) = ownedMembership-><br>        reject(oclIsKindOf(FeatureMembership)).memberElement-><br>        selectByKind(Feature) in<br>    if unownedFeatures->isEmpty() then null<br>    else unownedFeatures->first().oclAsType(Feature)<br>    endif<br>ownedMembership->exists(<br>    not oclIsKindOf(OwningMembership) and <br>    memberElement.oclIsKindOf(Feature))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:assignmentActionUsageTargetArgument](https://www.omg.org/spec/SysML/20230201/vocab#assignmentActionUsageTargetArgument)| [0..1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>Expression</code> whose value is an occurrence in the domain of the <code>referent</code> <code>Feature</code>, for which the value of the <code>referent</code> will be set to the result of the <code>valueExpression</code> by this <code>AssignmentActionUsage</code>.</p>| <p>The <code>Expression</code> whose value is an occurrence in the domain of the <code>referent</code> <code>Feature</code>, for which the value of the <code>referent</code> will be set to the result of the <code>valueExpression</code> by this <code>AssignmentActionUsage</code>.</p>|
| [sysml_vocab:assignmentActionUsageValueExpression](https://www.omg.org/spec/SysML/20230201/vocab#assignmentActionUsageValueExpression)| [0..1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>Expression</code> whose result is to be assigned to the <code>referent</code> <code>Feature</code>.</p>| <p>The <code>Expression</code> whose result is to be assigned to the <code>referent</code> <code>Feature</code>.</p>|
| [sysml_vocab:assignmentActionUsageReferent](https://www.omg.org/spec/SysML/20230201/vocab#assignmentActionUsageReferent)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> whose value is to be set.</p>| <p>The <code>Feature</code> whose value is to be set.</p>|



### Element

URI: https://www.omg.org/spec/SysML/20230201/shapes#Element

type: Shape

target class: [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)

definition of vocabulary class : <p>An <code>Element</code> is a constituent of a model that is uniquely identified relative to all other <code>Elements</code>. It can have <code>Relationships</code> with other <code>Elements</code>. Some of these <code>Relationships</code> might imply ownership of other <code>Elements</code>, which means that if an <code>Element</code> is deleted from a model, then so are all the <code>Elements</code> that it owns.</p><br><br>ownedElement = ownedRelationship.ownedRelatedElement<br>owner = owningRelationship.owningRelatedElement<br>qualifiedName =<br>    if owningNamespace = null then null<br>    else if owningNamespace.owner = null then escapedName()<br>    else if owningNamespace.qualifiedName = null or <br>            escapedName() = null then null<br>    else owningNamespace.qualifiedName + '::' + escapedName()<br>    endif endif endif<br>documentation = ownedElement->selectByKind(Documentation)<br>ownedAnnotation = ownedRelationship-><br>    selectByKind(Annotation)-><br>    select(a | a.annotatedElement = self)<br>name = effectiveName()<br>ownedRelationship->exists(isImplied) implies isImpliedIncluded<br>isLibraryElement = libraryNamespace() <> null<br><br>shortName = effectiveShortName()<br>owningNamespace =<br>    if owningMembership = null then null<br>    else owningMembership.membershipOwningNamespace<br>    endif<br>textualRepresentation = ownedElement->selectByKind(TextualRepresentation)

description: <p>An <code>Element</code> is a constituent of a model that is uniquely identified relative to all other <code>Elements</code>. It can have <code>Relationships</code> with other <code>Elements</code>. Some of these <code>Relationships</code> might imply ownership of other <code>Elements</code>, which means that if an <code>Element</code> is deleted from a model, then so are all the <code>Elements</code> that it owns.</p><br><br>ownedElement = ownedRelationship.ownedRelatedElement<br>owner = owningRelationship.owningRelatedElement<br>qualifiedName =<br>    if owningNamespace = null then null<br>    else if owningNamespace.owner = null then escapedName()<br>    else if owningNamespace.qualifiedName = null or <br>            escapedName() = null then null<br>    else owningNamespace.qualifiedName + '::' + escapedName()<br>    endif endif endif<br>documentation = ownedElement->selectByKind(Documentation)<br>ownedAnnotation = ownedRelationship-><br>    selectByKind(Annotation)-><br>    select(a | a.annotatedElement = self)<br>name = effectiveName()<br>ownedRelationship->exists(isImplied) implies isImpliedIncluded<br>isLibraryElement = libraryNamespace() <> null<br><br>shortName = effectiveShortName()<br>owningNamespace =<br>    if owningMembership = null then null<br>    else owningMembership.membershipOwningNamespace<br>    endif<br>textualRepresentation = ownedElement->selectByKind(TextualRepresentation)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [dcterms:identifier](http://purl.org/dc/terms/identifier)| [1]| String| n/a| <p>The globally unique identifier for this Element. This is intended to be set by tooling, and it must not change during the lifetime of the Element.</p>|
| [sysml_vocab:elementAliasIds](https://www.omg.org/spec/SysML/20230201/vocab#elementAliasIds)| [0..*]| String| <p>Various alternative identifiers for this Element. Generally, these will be set by tools.</p>| <p>Various alternative identifiers for this Element. Generally, these will be set by tools.</p>|
| [sysml_vocab:elementDeclaredShortName](https://www.omg.org/spec/SysML/20230201/vocab#elementDeclaredShortName)| [0..1]| String| <p>An optional alternative name for the <code>Element</code> that is intended to be shorter or in some way more succinct than its primary <code>name</code>. It may act as a modeler-specified identifier for the <code>Element</code>, though it is then the responsibility of the modeler to maintain the uniqueness of this identifier within a model or relative to some other context.</p> <br>| <p>An optional alternative name for the <code>Element</code> that is intended to be shorter or in some way more succinct than its primary <code>name</code>. It may act as a modeler-specified identifier for the <code>Element</code>, though it is then the responsibility of the modeler to maintain the uniqueness of this identifier within a model or relative to some other context.</p> <br>|
| [sysml_vocab:elementDeclaredName](https://www.omg.org/spec/SysML/20230201/vocab#elementDeclaredName)| [0..1]| String| <p>The declared name of this <code>Element</code>.</p><br>| <p>The declared name of this <code>Element</code>.</p><br>|
| [sysml_vocab:elementShortName](https://www.omg.org/spec/SysML/20230201/vocab#elementShortName)| [0..1]| String| <p>The short name to be used for this <code>Element</code> during name resolution within its <code>owningNamespace</code>. This is derived using the <code>effectiveShortName()</code> operation. By default, it is the same as the <code>declaredShortName</code>, but this is overridden for certain kinds of <code>Elements</code> to compute a <code>shortName</code> even when the <code>declaredName</code> is null.</p>| <p>The short name to be used for this <code>Element</code> during name resolution within its <code>owningNamespace</code>. This is derived using the <code>effectiveShortName()</code> operation. By default, it is the same as the <code>declaredShortName</code>, but this is overridden for certain kinds of <code>Elements</code> to compute a <code>shortName</code> even when the <code>declaredName</code> is null.</p>|
| [dcterms:title](http://purl.org/dc/terms/title)| [0..1]| String| n/a| <p>The name to be used for this <code>Element</code> during name resolution within its <code>owningNamespace</code>. This is derived using the <code>effectiveName()</code> operation. By default, it is the same as the <code>declaredName</code>, but this is overridden for certain kinds of <code>Elements</code> to compute a <code>name</code> even when the <code>declaredName</code> is null.</p>|
| [sysml_vocab:elementQualifiedName](https://www.omg.org/spec/SysML/20230201/vocab#elementQualifiedName)| [0..1]| String| <p>The full ownership-qualified name of this <code>Element</code>, represented in a form that is valid according to the KerML textual concrete syntax for qualified names (including use of unrestricted name notation and escaped characters, as necessary). The <code>qualifiedName</code> is null if this <code>Element</code> has no <code>owningNamespace</code> or if there is not a complete ownership chain of named <code>Namespaces</code> from a root <code>Namespace</code> to this <code>Element</code>.</p>| <p>The full ownership-qualified name of this <code>Element</code>, represented in a form that is valid according to the KerML textual concrete syntax for qualified names (including use of unrestricted name notation and escaped characters, as necessary). The <code>qualifiedName</code> is null if this <code>Element</code> has no <code>owningNamespace</code> or if there is not a complete ownership chain of named <code>Namespaces</code> from a root <code>Namespace</code> to this <code>Element</code>.</p>|
| [sysml_vocab:elementIsImpliedIncluded](https://www.omg.org/spec/SysML/20230201/vocab#elementIsImpliedIncluded)| [1]| Boolean| <p>Whether all necessary implied Relationships have been included in the <code>ownedRelationships</code> of this Element. This property may be true, even if there are not actually any <code>ownedRelationships</code> with <code>isImplied = true</code>, meaning that no such Relationships are actually implied for this Element. However, if it is false, then <code>ownedRelationships</code> may <em>not</em> contain any implied Relationships. That is, either <em>all</em> required implied Relationships must be included, or none of them.</p>| <p>Whether all necessary implied Relationships have been included in the <code>ownedRelationships</code> of this Element. This property may be true, even if there are not actually any <code>ownedRelationships</code> with <code>isImplied = true</code>, meaning that no such Relationships are actually implied for this Element. However, if it is false, then <code>ownedRelationships</code> may <em>not</em> contain any implied Relationships. That is, either <em>all</em> required implied Relationships must be included, or none of them.</p>|
| [sysml_vocab:elementIsLibraryElement](https://www.omg.org/spec/SysML/20230201/vocab#elementIsLibraryElement)| [1]| Boolean| <p>Whether this Element is contained in the ownership tree of a library model.</p>| <p>Whether this Element is contained in the ownership tree of a library model.</p>|
| [sysml_vocab:elementOwningMembership](https://www.omg.org/spec/SysML/20230201/vocab#elementOwningMembership)| [0..1]| [sysml_vocab:OwningMembership](https://www.omg.org/spec/SysML/20230201/vocab#OwningMembership)| <p>The <code>owningRelationship</code> of this <code>Element</code>, if that <code>Relationship</code> is a <code>Membership</code>.</p><br>| <p>The <code>owningRelationship</code> of this <code>Element</code>, if that <code>Relationship</code> is a <code>Membership</code>.</p><br>|
| [sysml_vocab:elementOwnedRelationship](https://www.omg.org/spec/SysML/20230201/vocab#elementOwnedRelationship)| [0..*]| [sysml_vocab:Relationship](https://www.omg.org/spec/SysML/20230201/vocab#Relationship)| <p>The Relationships for which this Element is the <tt>owningRelatedElement</tt>.</p>| <p>The Relationships for which this Element is the <tt>owningRelatedElement</tt>.</p>|
| [sysml_vocab:elementOwningRelationship](https://www.omg.org/spec/SysML/20230201/vocab#elementOwningRelationship)| [0..1]| [sysml_vocab:Relationship](https://www.omg.org/spec/SysML/20230201/vocab#Relationship)| <p>The Relationship for which this Element is an <tt>ownedRelatedElement</tt>, if any.</p><br>| <p>The Relationship for which this Element is an <tt>ownedRelatedElement</tt>, if any.</p><br>|
| [sysml_vocab:elementOwningNamespace](https://www.omg.org/spec/SysML/20230201/vocab#elementOwningNamespace)| [0..1]| [sysml_vocab:Namespace](https://www.omg.org/spec/SysML/20230201/vocab#Namespace)| <p>The <code>Namespace</code> that owns this <code>Element</code>, which is the <code>membershipOwningNamespace</code> of the <code>owningMembership</code> of this <code>Element</code>, if any.</p><br>| <p>The <code>Namespace</code> that owns this <code>Element</code>, which is the <code>membershipOwningNamespace</code> of the <code>owningMembership</code> of this <code>Element</code>, if any.</p><br>|
| [sysml_vocab:elementOwner](https://www.omg.org/spec/SysML/20230201/vocab#elementOwner)| [0..1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The owner of this Element, derived as the <code>owningRelatedElement</code> of the <code>owningRelationship</code> of this Element, if any.</p>| <p>The owner of this Element, derived as the <code>owningRelatedElement</code> of the <code>owningRelationship</code> of this Element, if any.</p>|
| [sysml_vocab:elementOwnedElement](https://www.omg.org/spec/SysML/20230201/vocab#elementOwnedElement)| [0..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The Elements owned by this Element, derived as the <tt>ownedRelatedElements</tt> of the <tt>ownedRelationships</tt> of this Element.</p><br>| <p>The Elements owned by this Element, derived as the <tt>ownedRelatedElements</tt> of the <tt>ownedRelationships</tt> of this Element.</p><br>|
| [sysml_vocab:elementDocumentation](https://www.omg.org/spec/SysML/20230201/vocab#elementDocumentation)| [0..*]| [sysml_vocab:Documentation](https://www.omg.org/spec/SysML/20230201/vocab#Documentation)| <p>The Documentation owned by this Element.</p>| <p>The Documentation owned by this Element.</p>|
| [sysml_vocab:elementOwnedAnnotation](https://www.omg.org/spec/SysML/20230201/vocab#elementOwnedAnnotation)| [0..*]| [sysml_vocab:Annotation](https://www.omg.org/spec/SysML/20230201/vocab#Annotation)| <p>The <code>ownedRelationships</code> of this <code>Element</code> that are <code>Annotations</code>, for which this <code>Element</code> is the <code>annotatedElement</code>.</code>| <p>The <code>ownedRelationships</code> of this <code>Element</code> that are <code>Annotations</code>, for which this <code>Element</code> is the <code>annotatedElement</code>.</code>|
| [sysml_vocab:elementTextualRepresentation](https://www.omg.org/spec/SysML/20230201/vocab#elementTextualRepresentation)| [0..*]| [sysml_vocab:TextualRepresentation](https://www.omg.org/spec/SysML/20230201/vocab#TextualRepresentation)| <p>The <code>TextualRepresentations</code> that annotate this <code>Element</code>.</p>| <p>The <code>TextualRepresentations</code> that annotate this <code>Element</code>.</p>|



### Annotation

URI: https://www.omg.org/spec/SysML/20230201/shapes#Annotation

type: Shape

target class: [sysml_vocab:Annotation](https://www.omg.org/spec/SysML/20230201/vocab#Annotation)

definition of vocabulary class : <p>An <code>Annotation</code> is a Relationship between an <code>AnnotatingElement</code> and the <code>Element</code> that is annotated by that <code>AnnotatingElement</code>.</p><br>

description: <p>An <code>Annotation</code> is a Relationship between an <code>AnnotatingElement</code> and the <code>Element</code> that is annotated by that <code>AnnotatingElement</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:annotationAnnotatingElement](https://www.omg.org/spec/SysML/20230201/vocab#annotationAnnotatingElement)| [1]| [sysml_vocab:AnnotatingElement](https://www.omg.org/spec/SysML/20230201/vocab#AnnotatingElement)| <p>The <code>AnnotatingElement</code> that annotates the <code>annotatedElement</code> of this <code>Annotation</code>.</p><br>| <p>The <code>AnnotatingElement</code> that annotates the <code>annotatedElement</code> of this <code>Annotation</code>.</p><br>|
| [sysml_vocab:annotationAnnotatedElement](https://www.omg.org/spec/SysML/20230201/vocab#annotationAnnotatedElement)| [1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <code>Element</code> that is annotated by the <code>annotatingElement</code> of this Annotation.</p><br>| <p>The <code>Element</code> that is annotated by the <code>annotatingElement</code> of this Annotation.</p><br>|
| [sysml_vocab:annotationOwningAnnotatedElement](https://www.omg.org/spec/SysML/20230201/vocab#annotationOwningAnnotatedElement)| [0..1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <code>annotatedElement</code> of this <code>Annotation</code>, when it is also its <code>owningRelatedElement</code>.</p><br>| <p>The <code>annotatedElement</code> of this <code>Annotation</code>, when it is also its <code>owningRelatedElement</code>.</p><br>|
| [sysml_vocab:annotationOwningAnnotatingElement](https://www.omg.org/spec/SysML/20230201/vocab#annotationOwningAnnotatingElement)| [0..1]| [sysml_vocab:AnnotatingElement](https://www.omg.org/spec/SysML/20230201/vocab#AnnotatingElement)| <p>The <code>annotatingElement</code> of this <code>Annotation</code>, when it is also its <code>owningRelatedElement</code>.</p>| <p>The <code>annotatingElement</code> of this <code>Annotation</code>, when it is also its <code>owningRelatedElement</code>.</p>|



### AcceptActionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#AcceptActionUsage

type: Shape

target class: [sysml_vocab:AcceptActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#AcceptActionUsage)

definition of vocabulary class : <p>An <code>AcceptActionUsage</code> is an <code>ActionUsage</code> that specifies the acceptance of an <em><code>incomingTransfer</code></em> from the <code><em>Occurrence</em></code> given by the result of its <code>receiverArgument</code> Expression. (If no <code>receiverArgument</code> is provided, the default is the <em><code>this</code></em> context of the AcceptActionUsage.) The payload of the accepted <em><code>Transfer</em></code> is output on its <code>payloadParameter</code>. Which <em><code>Transfers</em></code> may be accepted is determined by conformance to the typing and (potentially) binding of the <code>payloadParameter</code>.</p><br><br>inputParameters()->size() >= 2<br>receiverArgument = argument(2)<br>payloadArgument = argument(1)<br>payloadParameter = <br> if parameter->isEmpty() then null<br> else parameter->first() endif<br>not isTriggerAction() implies<br>    specializesFromLibrary('Actions::acceptActions')<br>isSubactionUsage() and not isTriggerAction() implies<br>    specializesFromLibrary('Actions::Action::acceptSubactions')<br>isTriggerAction() implies<br>    specializesFromLibrary('Actions::TransitionAction::accepter')<br>payloadArgument <> null and<br>payloadArgument.oclIsKindOf(TriggerInvocationExpression) implies<br>    let invocation : Expression =<br>        payloadArgument.oclAsType(Expression) in<br>    parameter->size() >= 2 and<br>    invocation.parameter->size() >= 2 and        <br>    ownedFeature->selectByKind(BindingConnector)->exists(b |<br>        b.relatedFeatures->includes(parameter->at(2)) and<br>        b.relatedFeatures->includes(invocation.parameter->at(2)))

description: <p>An <code>AcceptActionUsage</code> is an <code>ActionUsage</code> that specifies the acceptance of an <em><code>incomingTransfer</code></em> from the <code><em>Occurrence</em></code> given by the result of its <code>receiverArgument</code> Expression. (If no <code>receiverArgument</code> is provided, the default is the <em><code>this</code></em> context of the AcceptActionUsage.) The payload of the accepted <em><code>Transfer</em></code> is output on its <code>payloadParameter</code>. Which <em><code>Transfers</em></code> may be accepted is determined by conformance to the typing and (potentially) binding of the <code>payloadParameter</code>.</p><br><br>inputParameters()->size() >= 2<br>receiverArgument = argument(2)<br>payloadArgument = argument(1)<br>payloadParameter = <br> if parameter->isEmpty() then null<br> else parameter->first() endif<br>not isTriggerAction() implies<br>    specializesFromLibrary('Actions::acceptActions')<br>isSubactionUsage() and not isTriggerAction() implies<br>    specializesFromLibrary('Actions::Action::acceptSubactions')<br>isTriggerAction() implies<br>    specializesFromLibrary('Actions::TransitionAction::accepter')<br>payloadArgument <> null and<br>payloadArgument.oclIsKindOf(TriggerInvocationExpression) implies<br>    let invocation : Expression =<br>        payloadArgument.oclAsType(Expression) in<br>    parameter->size() >= 2 and<br>    invocation.parameter->size() >= 2 and        <br>    ownedFeature->selectByKind(BindingConnector)->exists(b |<br>        b.relatedFeatures->includes(parameter->at(2)) and<br>        b.relatedFeatures->includes(invocation.parameter->at(2)))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:acceptActionUsageReceiverArgument](https://www.omg.org/spec/SysML/20230201/vocab#acceptActionUsageReceiverArgument)| [0..1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>An <code>Expression</code> whose <code>result</code> is bound to the <em><code>receiver</code></em> input <code>parameter</code> of this <code>AcceptActionUsage</code>.</p> <br>| <p>An <code>Expression</code> whose <code>result</code> is bound to the <em><code>receiver</code></em> input <code>parameter</code> of this <code>AcceptActionUsage</code>.</p> <br>|
| [sysml_vocab:acceptActionUsagePayloadParameter](https://www.omg.org/spec/SysML/20230201/vocab#acceptActionUsagePayloadParameter)| [1]| [sysml_vocab:ReferenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#ReferenceUsage)| <p>The <code>nestedReference</code> of this <code>AcceptActionUsage</code> that redefines the <code>payload</code> output <code>parameter</code> of the base <code>AcceptActionUsage</code> <em><code>AcceptAction</code></em> from the Systems Model Library.</p>| <p>The <code>nestedReference</code> of this <code>AcceptActionUsage</code> that redefines the <code>payload</code> output <code>parameter</code> of the base <code>AcceptActionUsage</code> <em><code>AcceptAction</code></em> from the Systems Model Library.</p>|
| [sysml_vocab:acceptActionUsagePayloadArgument](https://www.omg.org/spec/SysML/20230201/vocab#acceptActionUsagePayloadArgument)| [0..1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>An <code>Expression</code> whose <code>result</code> is bound to the <code><em>payload</em></code> <code>parameter</code> of this <code>AcceptActionUsage</code>. If provided, the <code>AcceptActionUsage</code> will only accept a <code><em>Transfer</em></code> with exactly this <code><em>payload</em></code>.</p> <br>| <p>An <code>Expression</code> whose <code>result</code> is bound to the <code><em>payload</em></code> <code>parameter</code> of this <code>AcceptActionUsage</code>. If provided, the <code>AcceptActionUsage</code> will only accept a <code><em>Transfer</em></code> with exactly this <code><em>payload</em></code>.</p> <br>|



### Class

URI: https://www.omg.org/spec/SysML/20230201/shapes#Class

type: Shape

target class: [sysml_vocab:Class](https://www.omg.org/spec/SysML/20230201/vocab#Class)

definition of vocabulary class : <p>A <code>Class</code> is a <code>Classifier</code> of things (in the universe) that can be distinguished without regard to how they are related to other things (via <code>Features</code>). This means multiple things classified by the same <code>Class</code> can be distinguished, even when they are related other things in exactly the same way.</p><br><br>specializesFromLibrary('Occurrences::Occurrence')<br>ownedSpecialization.general-><br>    forAll(not oclIsKindOf(DataType)) and<br>not oclIsKindOf(Association) implies<br>    ownedSpecialization.general-><br>        forAll(not oclIsKindOf(Association))

description: <p>A <code>Class</code> is a <code>Classifier</code> of things (in the universe) that can be distinguished without regard to how they are related to other things (via <code>Features</code>). This means multiple things classified by the same <code>Class</code> can be distinguished, even when they are related other things in exactly the same way.</p><br><br>specializesFromLibrary('Occurrences::Occurrence')<br>ownedSpecialization.general-><br>    forAll(not oclIsKindOf(DataType)) and<br>not oclIsKindOf(Association) implies<br>    ownedSpecialization.general-><br>        forAll(not oclIsKindOf(Association))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### AttributeDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#AttributeDefinition

type: Shape

target class: [sysml_vocab:AttributeDefinition](https://www.omg.org/spec/SysML/20230201/vocab#AttributeDefinition)

definition of vocabulary class : <p>An <code>AttributeDefinition</code> is a <code>Definition</code> and a <code>DataType</code> of information about a quality or characteristic of a system or part of a system that has no independent identity other than its value. All <code>features</code> of an <code>AttributeDefinition</code> must be referential (non-composite).</p><br><br><p>As a <code>DataType</code>, an <code>AttributeDefinition</code> must specialize, directly or indirectly, the base <code>DataType</code> <code><em>Base::DataValue</em></code> from the Kernel Semantic Library.</p><br>feature->forAll(not isComposite)

description: <p>An <code>AttributeDefinition</code> is a <code>Definition</code> and a <code>DataType</code> of information about a quality or characteristic of a system or part of a system that has no independent identity other than its value. All <code>features</code> of an <code>AttributeDefinition</code> must be referential (non-composite).</p><br><br><p>As a <code>DataType</code>, an <code>AttributeDefinition</code> must specialize, directly or indirectly, the base <code>DataType</code> <code><em>Base::DataValue</em></code> from the Kernel Semantic Library.</p><br>feature->forAll(not isComposite)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### PartUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#PartUsage

type: Shape

target class: [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)

definition of vocabulary class : <p>A <code>PartUsage</code> is a usage of a <code>PartDefinition</code> to represent a system or a part of a system. At least one of the <code>itemDefinitions</code> of the <code>PartUsage</code> must be a <code>PartDefinition</code>.</p><br><br><p>A <code>PartUsage</code> must subset, directly or indirectly, the base <code>PartUsage</code> <em><code>parts</code></em> from the Systems Model Library.</p><br>itemDefinition->selectByKind(PartDefinition)<br>partDefinition->notEmpty()<br>specializesFromLibrary('Parts::parts')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(ItemDefinition) or<br> owningType.oclIsKindOf(ItemUsage)) implies<br>    specializesFromLibrary('Items::Item::subparts')<br>owningFeatureMembership <> null and<br>owningFeatureMembership.oclIsKindOf(ActorMembership) implies<br>    if owningType.oclIsKindOf(RequirementDefinition) or <br>       owningType.oclIsKindOf(RequirementUsage)<br>    then specializesFromLibrary('Requirements::RequirementCheck::actors')<br>    else specializesFromLibrary('Cases::Case::actors')<br>owningFeatureMembership <> null and<br>owningFeatureMembership.oclIsKindOf(StakeholderMembership) implies<br>    specializesFromLibrary('Requirements::RequirementCheck::stakeholders')

description: <p>A <code>PartUsage</code> is a usage of a <code>PartDefinition</code> to represent a system or a part of a system. At least one of the <code>itemDefinitions</code> of the <code>PartUsage</code> must be a <code>PartDefinition</code>.</p><br><br><p>A <code>PartUsage</code> must subset, directly or indirectly, the base <code>PartUsage</code> <em><code>parts</code></em> from the Systems Model Library.</p><br>itemDefinition->selectByKind(PartDefinition)<br>partDefinition->notEmpty()<br>specializesFromLibrary('Parts::parts')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(ItemDefinition) or<br> owningType.oclIsKindOf(ItemUsage)) implies<br>    specializesFromLibrary('Items::Item::subparts')<br>owningFeatureMembership <> null and<br>owningFeatureMembership.oclIsKindOf(ActorMembership) implies<br>    if owningType.oclIsKindOf(RequirementDefinition) or <br>       owningType.oclIsKindOf(RequirementUsage)<br>    then specializesFromLibrary('Requirements::RequirementCheck::actors')<br>    else specializesFromLibrary('Cases::Case::actors')<br>owningFeatureMembership <> null and<br>owningFeatureMembership.oclIsKindOf(StakeholderMembership) implies<br>    specializesFromLibrary('Requirements::RequirementCheck::stakeholders')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:partUsagePartDefinition](https://www.omg.org/spec/SysML/20230201/vocab#partUsagePartDefinition)| [0..*]| [sysml_vocab:PartDefinition](https://www.omg.org/spec/SysML/20230201/vocab#PartDefinition)| <p>The <code>itemDefinitions</code> of this PartUsage that are PartDefinitions.</p>| <p>The <code>itemDefinitions</code> of this PartUsage that are PartDefinitions.</p>|



### AllocationDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#AllocationDefinition

type: Shape

target class: [sysml_vocab:AllocationDefinition](https://www.omg.org/spec/SysML/20230201/vocab#AllocationDefinition)

definition of vocabulary class : <p>An <code>AllocationDefinition</code> is a <code>ConnectionDefinition</code> that specifies that some or all of the responsibility to realize the intent of the <code>source</code> is allocated to the <code>target</code> instances. Such allocations define mappings across the various structures and hierarchies of a system model, perhaps as a precursor to more rigorous specifications and implementations. An <code>AllocationDefinition</code> can itself be refined using nested <code>allocations</code> that give a finer-grained decomposition of the containing allocation mapping.</p><br>allocation = usage->selectAsKind(AllocationUsage)<br>specializesFromLibrary('Allocations::Allocation')

description: <p>An <code>AllocationDefinition</code> is a <code>ConnectionDefinition</code> that specifies that some or all of the responsibility to realize the intent of the <code>source</code> is allocated to the <code>target</code> instances. Such allocations define mappings across the various structures and hierarchies of a system model, perhaps as a precursor to more rigorous specifications and implementations. An <code>AllocationDefinition</code> can itself be refined using nested <code>allocations</code> that give a finer-grained decomposition of the containing allocation mapping.</p><br>allocation = usage->selectAsKind(AllocationUsage)<br>specializesFromLibrary('Allocations::Allocation')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:allocationDefinitionAllocation](https://www.omg.org/spec/SysML/20230201/vocab#allocationDefinitionAllocation)| [0..*]| [sysml_vocab:AllocationUsage](https://www.omg.org/spec/SysML/20230201/vocab#AllocationUsage)| <p>The <code>AllocationUsages</code> that refine the allocation mapping defined by this <code>AllocationDefinition</code>.</p>| <p>The <code>AllocationUsages</code> that refine the allocation mapping defined by this <code>AllocationDefinition</code>.</p>|



### NullExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#NullExpression

type: Shape

target class: [sysml_vocab:NullExpression](https://www.omg.org/spec/SysML/20230201/vocab#NullExpression)

definition of vocabulary class : <p>A <code>NullExpression</code> is an <code>Expression</code> that results in a null value.</p><br><br>specializesFromLibrary('Performances::nullEvaluations')

description: <p>A <code>NullExpression</code> is an <code>Expression</code> that results in a null value.</p><br><br>specializesFromLibrary('Performances::nullEvaluations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### IncludeUseCaseUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#IncludeUseCaseUsage

type: Shape

target class: [sysml_vocab:IncludeUseCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#IncludeUseCaseUsage)

definition of vocabulary class : <p>An <code>IncludeUseCaseUsage</code> is a <code>UseCaseUsage</code> that represents the inclusion of a <code>UseCaseUsage</code> by a <code>UseCaseDefinition</code> or <code>UseCaseUsage</code>. Unless it is the <code>IncludeUseCaseUsage</code> itself, the <code>UseCaseUsage</code> to be included is related to the <code>includedUseCase</code> by a <code>ReferenceSubsetting</code> <code>Relationship</code>. An <code>IncludeUseCaseUsage</code> is also a PerformActionUsage, with its <code>useCaseIncluded</code> as the <code>performedAction</code>.</p><br><br>owningType <> null and<br>(owningType.oclIsKindOf(UseCaseDefinition) or<br> owningType.oclIsKindOf(UseCaseUsage) implies<br>    specializesFromLibrary('UseCases::UseCase::includedUseCases')<br>ownedReferenceSubsetting <> null implies<br>    ownedReferenceSubsetting.referencedFeature.oclIsKindOf(UseCaseUsage)

description: <p>An <code>IncludeUseCaseUsage</code> is a <code>UseCaseUsage</code> that represents the inclusion of a <code>UseCaseUsage</code> by a <code>UseCaseDefinition</code> or <code>UseCaseUsage</code>. Unless it is the <code>IncludeUseCaseUsage</code> itself, the <code>UseCaseUsage</code> to be included is related to the <code>includedUseCase</code> by a <code>ReferenceSubsetting</code> <code>Relationship</code>. An <code>IncludeUseCaseUsage</code> is also a PerformActionUsage, with its <code>useCaseIncluded</code> as the <code>performedAction</code>.</p><br><br>owningType <> null and<br>(owningType.oclIsKindOf(UseCaseDefinition) or<br> owningType.oclIsKindOf(UseCaseUsage) implies<br>    specializesFromLibrary('UseCases::UseCase::includedUseCases')<br>ownedReferenceSubsetting <> null implies<br>    ownedReferenceSubsetting.referencedFeature.oclIsKindOf(UseCaseUsage)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:includeUseCaseUsageUseCaseIncluded](https://www.omg.org/spec/SysML/20230201/vocab#includeUseCaseUsageUseCaseIncluded)| [1]| [sysml_vocab:UseCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#UseCaseUsage)| <p>The <code>UseCaseUsage</code> to be included by this <code>IncludeUseCaseUsage</code>. It is the <code>performedAction</code> of the <code>IncludeUseCaseUsage</code> considered as a <code>PerformActionUsage</code>, which must be a <code>UseCaseUsage</code>.</p> <br>| <p>The <code>UseCaseUsage</code> to be included by this <code>IncludeUseCaseUsage</code>. It is the <code>performedAction</code> of the <code>IncludeUseCaseUsage</code> considered as a <code>PerformActionUsage</code>, which must be a <code>UseCaseUsage</code>.</p> <br>|



### VariantMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#VariantMembership

type: Shape

target class: [sysml_vocab:VariantMembership](https://www.omg.org/spec/SysML/20230201/vocab#VariantMembership)

definition of vocabulary class : <p>A <code>VariantMembership</code> is a <code>Membership</code> between a variation point <code>Definition</code> or <code>Usage</code> and a <code>Usage</code> that represents a variant in the context of that variation. The <code>membershipOwningNamespace</code> for the <code>VariantMembership</code> must be either a Definition or a <code>Usage</code> with <code>isVariation = true</code>.</p><br>membershipOwningNamespace.oclIsKindOf(Definition) and<br>    membershipOwningNamespace.oclAsType(Definition).isVariation or<br>membershipOwningNamespace.oclIsKindOf(Usage) and<br>    membershipOwningNamespace.oclAsType(Usage).isVariation<br>

description: <p>A <code>VariantMembership</code> is a <code>Membership</code> between a variation point <code>Definition</code> or <code>Usage</code> and a <code>Usage</code> that represents a variant in the context of that variation. The <code>membershipOwningNamespace</code> for the <code>VariantMembership</code> must be either a Definition or a <code>Usage</code> with <code>isVariation = true</code>.</p><br>membershipOwningNamespace.oclIsKindOf(Definition) and<br>    membershipOwningNamespace.oclAsType(Definition).isVariation or<br>membershipOwningNamespace.oclIsKindOf(Usage) and<br>    membershipOwningNamespace.oclAsType(Usage).isVariation<br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:variantMembershipOwnedVariantUsage](https://www.omg.org/spec/SysML/20230201/vocab#variantMembershipOwnedVariantUsage)| [1]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>Usage</code> that represents a variant in the context of the <code>owningVariationDefinition</code> or <code>owningVariationUsage</code>.</p>| <p>The <code>Usage</code> that represents a variant in the context of the <code>owningVariationDefinition</code> or <code>owningVariationUsage</code>.</p>|



### SatisfyRequirementUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#SatisfyRequirementUsage

type: Shape

target class: [sysml_vocab:SatisfyRequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#SatisfyRequirementUsage)

definition of vocabulary class : <p>A <code>SatisfyRequirementUsage</code> is an <code>AssertConstraintUsage</code> that asserts, by default, that a satisfied <code>RequirementUsage</code> is true for a specific <code>satisfyingFeature</code>, or, if <code>isNegated = true</code>, that the <code>RequirementUsage</code> is false. The satisfied <code>RequirementUsage</code> is related to the <code>SatisfyRequirementUsage</code> by a <code>ReferenceSubsetting</code> <code>Relationship</code>.</p><br>satisfyingFeature =<br>    let bindings: BindingConnector = ownedMember-><br>        selectByKind(BindingConnector)-><br>        select(b | b.relatedElement->includes(subjectParameter)) in<br>    if bindings->isEmpty() or <br>       bindings->first().relatedElement->exits(r | r <> subjectParameter) <br>    then null<br>    else bindings->first().relatedElement->any(r | r <> subjectParameter)<br>    endif<br>ownedMember->selectByKind(BindingConnector)-><br>    select(b |<br>        b.relatedElement->includes(subjectParameter) and<br>        b.relatedElement->exists(r | r <> subjectParameter))-><br>    size() = 1<br>ownedReferenceSubsetting <> null implies<br>    ownedReferenceSubsetting.referencedFeature.oclIsKindOf(RequirementUsage)

description: <p>A <code>SatisfyRequirementUsage</code> is an <code>AssertConstraintUsage</code> that asserts, by default, that a satisfied <code>RequirementUsage</code> is true for a specific <code>satisfyingFeature</code>, or, if <code>isNegated = true</code>, that the <code>RequirementUsage</code> is false. The satisfied <code>RequirementUsage</code> is related to the <code>SatisfyRequirementUsage</code> by a <code>ReferenceSubsetting</code> <code>Relationship</code>.</p><br>satisfyingFeature =<br>    let bindings: BindingConnector = ownedMember-><br>        selectByKind(BindingConnector)-><br>        select(b | b.relatedElement->includes(subjectParameter)) in<br>    if bindings->isEmpty() or <br>       bindings->first().relatedElement->exits(r | r <> subjectParameter) <br>    then null<br>    else bindings->first().relatedElement->any(r | r <> subjectParameter)<br>    endif<br>ownedMember->selectByKind(BindingConnector)-><br>    select(b |<br>        b.relatedElement->includes(subjectParameter) and<br>        b.relatedElement->exists(r | r <> subjectParameter))-><br>    size() = 1<br>ownedReferenceSubsetting <> null implies<br>    ownedReferenceSubsetting.referencedFeature.oclIsKindOf(RequirementUsage)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:satisfyRequirementUsageSatisfiedRequirement](https://www.omg.org/spec/SysML/20230201/vocab#satisfyRequirementUsageSatisfiedRequirement)| [1]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The <code>RequirementUsage</code> that is satisfied by the <code>satisfyingSubject</code> of this <code>SatisfyRequirementUsage</code>. It is the <code>assertedConstraint</code> of the <code>SatisfyRequirementUsage</code> considered as an <code>AssertConstraintUsage</code>, which must be a <code>RequirementUsage</code>.</p>| <p>The <code>RequirementUsage</code> that is satisfied by the <code>satisfyingSubject</code> of this <code>SatisfyRequirementUsage</code>. It is the <code>assertedConstraint</code> of the <code>SatisfyRequirementUsage</code> considered as an <code>AssertConstraintUsage</code>, which must be a <code>RequirementUsage</code>.</p>|
| [sysml_vocab:satisfyRequirementUsageSatisfyingFeature](https://www.omg.org/spec/SysML/20230201/vocab#satisfyRequirementUsageSatisfyingFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> that represents the actual subject that is asserted to satisfy the <code>satisfiedRequirement</code>. The <code>satisfyingFeature</code> is bound to the <code>subjectParameter</code> of the <code>SatisfyRequirementUsage</code>.</p>| <p>The <code>Feature</code> that represents the actual subject that is asserted to satisfy the <code>satisfiedRequirement</code>. The <code>satisfyingFeature</code> is bound to the <code>subjectParameter</code> of the <code>SatisfyRequirementUsage</code>.</p>|



### ForkNode

URI: https://www.omg.org/spec/SysML/20230201/shapes#ForkNode

type: Shape

target class: [sysml_vocab:ForkNode](https://www.omg.org/spec/SysML/20230201/vocab#ForkNode)

definition of vocabulary class : <p>A <code>ForkNode</code> is a <code>ControlNode</code> that must be followed by successor <code>Actions</code> as given by all its outgoing <code>Successions</code>.</p><br>targetConnector->selectByKind(Succession)->size() <= 1<br>specializesFromLibrary('Actions::Action::forks')

description: <p>A <code>ForkNode</code> is a <code>ControlNode</code> that must be followed by successor <code>Actions</code> as given by all its outgoing <code>Successions</code>.</p><br>targetConnector->selectByKind(Succession)->size() <= 1<br>specializesFromLibrary('Actions::Action::forks')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### ReturnParameterMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#ReturnParameterMembership

type: Shape

target class: [sysml_vocab:ReturnParameterMembership](https://www.omg.org/spec/SysML/20230201/vocab#ReturnParameterMembership)

definition of vocabulary class : <p>A <code>ReturnParameterMembership</code> is a <code>ParameterMembership</code> that indicates that the <code>ownedMemberParameter</code> is the <code>result</code> <code>parameter</code> of a <code>Function</code> or <code>Expression</code>. The <code>direction</code> of the <code>ownedMemberParameter</code> must be <code>out</code>.</p><br><br>owningType.oclIsKindOf(Function) or owningType.oclIsKindOf(Expression)

description: <p>A <code>ReturnParameterMembership</code> is a <code>ParameterMembership</code> that indicates that the <code>ownedMemberParameter</code> is the <code>result</code> <code>parameter</code> of a <code>Function</code> or <code>Expression</code>. The <code>direction</code> of the <code>ownedMemberParameter</code> must be <code>out</code>.</p><br><br>owningType.oclIsKindOf(Function) or owningType.oclIsKindOf(Expression)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### LiteralExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#LiteralExpression

type: Shape

target class: [sysml_vocab:LiteralExpression](https://www.omg.org/spec/SysML/20230201/vocab#LiteralExpression)

definition of vocabulary class : <p>A <code>LiteralExpression</code> is an <code>Expression</code> that provides a basic <code><em>DataValue</em></code> as a result.</p><br><br>isModelLevelEvaluable = true<br>specializesFromLibrary('Performances::literalEvaluations')

description: <p>A <code>LiteralExpression</code> is an <code>Expression</code> that provides a basic <code><em>DataValue</em></code> as a result.</p><br><br>isModelLevelEvaluable = true<br>specializesFromLibrary('Performances::literalEvaluations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### RenderingUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#RenderingUsage

type: Shape

target class: [sysml_vocab:RenderingUsage](https://www.omg.org/spec/SysML/20230201/vocab#RenderingUsage)

definition of vocabulary class : <p>A <code>RenderingUsage</code> is the usage of a <code>RenderingDefinition</code> to specify the rendering of a specific model view to produce a physical view artifact.</p><br><br><br>specializesFromLibrary('Views::renderings')<br>owningType <> null and<br>(owningType.oclIsKindOf(RenderingDefinition) or<br> owningType.oclIsKindOf(RenderingUsage)) implies<br>    specializesFromLibrary('Views::Rendering::subrenderings')<br>owningFeatureMembership <> null and<br>owningFeatureMembership.oclIsKindOf(ViewRenderingMembership) implies<br>    redefinesFromLibrary('Views::View::viewRendering')

description: <p>A <code>RenderingUsage</code> is the usage of a <code>RenderingDefinition</code> to specify the rendering of a specific model view to produce a physical view artifact.</p><br><br><br>specializesFromLibrary('Views::renderings')<br>owningType <> null and<br>(owningType.oclIsKindOf(RenderingDefinition) or<br> owningType.oclIsKindOf(RenderingUsage)) implies<br>    specializesFromLibrary('Views::Rendering::subrenderings')<br>owningFeatureMembership <> null and<br>owningFeatureMembership.oclIsKindOf(ViewRenderingMembership) implies<br>    redefinesFromLibrary('Views::View::viewRendering')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:renderingUsageRenderingDefinition](https://www.omg.org/spec/SysML/20230201/vocab#renderingUsageRenderingDefinition)| [0..1]| [sysml_vocab:RenderingDefinition](https://www.omg.org/spec/SysML/20230201/vocab#RenderingDefinition)| <p>The <code>RenderingDefinition</code> that is the <code>definition</code> of this <code>RenderingUsage</code>.</p>| <p>The <code>RenderingDefinition</code> that is the <code>definition</code> of this <code>RenderingUsage</code>.</p>|



### SuccessionItemFlow

URI: https://www.omg.org/spec/SysML/20230201/shapes#SuccessionItemFlow

type: Shape

target class: [sysml_vocab:SuccessionItemFlow](https://www.omg.org/spec/SysML/20230201/vocab#SuccessionItemFlow)

definition of vocabulary class : <p>A <code>SuccessionItemFlow</code> is an <code>ItemFlow</code> that also provides temporal ordering. It classifies <code><em>Transfers</em></code> that cannot start until the source <code><em>Occurrence</em></code> has completed and that must complete before the target <code><em>Occurrence</em></code> can start.</p><br>specializesFromLibrary('Transfers::flowTransfersBefore')

description: <p>A <code>SuccessionItemFlow</code> is an <code>ItemFlow</code> that also provides temporal ordering. It classifies <code><em>Transfers</em></code> that cannot start until the source <code><em>Occurrence</em></code> has completed and that must complete before the target <code><em>Occurrence</em></code> can start.</p><br>specializesFromLibrary('Transfers::flowTransfersBefore')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Step

URI: https://www.omg.org/spec/SysML/20230201/shapes#Step

type: Shape

target class: [sysml_vocab:Step](https://www.omg.org/spec/SysML/20230201/vocab#Step)

definition of vocabulary class : <p>A <code>Step</code> is a <code>Feature</code> that is typed by one or more <code>Behaviors</code>. <code>Steps</code> may be used by one <code>Behavior</code> to coordinate the performance of other <code>Behaviors</code>, supporting a steady refinement of behavioral descriptions. <code>Steps</code> can be ordered in time and can be connected using <code>ItemFlows</code> to specify things flowing between their <code>parameters</code>.</p><br><br>specializesFromLibrary('Performances::performances')<br>owningType <> null and<br>    (owningType.oclIsKindOf(Behavior) or<br>     owningType.oclIsKindOf(Step)) implies<br>    specializesFromLibrary('Performances::Performance::enclosedPerformance')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(Structure) or<br> owningType.oclIsKindOf(Feature) and<br> owningType.oclAsType(Feature).type-><br>    exists(oclIsKindOf(Structure)) implies<br>    specializesFromLibrary('Objects::Object::ownedPerformance')<br>owningType <> null and<br>    (owningType.oclIsKindOf(Behavior) or<br>     owningType.oclIsKindOf(Step)) and<br>    self.isComposite implies<br>    specializesFromLibrary('Performances::Performance::subperformance')<br>behavior = type->selectByKind(Behavior)

description: <p>A <code>Step</code> is a <code>Feature</code> that is typed by one or more <code>Behaviors</code>. <code>Steps</code> may be used by one <code>Behavior</code> to coordinate the performance of other <code>Behaviors</code>, supporting a steady refinement of behavioral descriptions. <code>Steps</code> can be ordered in time and can be connected using <code>ItemFlows</code> to specify things flowing between their <code>parameters</code>.</p><br><br>specializesFromLibrary('Performances::performances')<br>owningType <> null and<br>    (owningType.oclIsKindOf(Behavior) or<br>     owningType.oclIsKindOf(Step)) implies<br>    specializesFromLibrary('Performances::Performance::enclosedPerformance')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(Structure) or<br> owningType.oclIsKindOf(Feature) and<br> owningType.oclAsType(Feature).type-><br>    exists(oclIsKindOf(Structure)) implies<br>    specializesFromLibrary('Objects::Object::ownedPerformance')<br>owningType <> null and<br>    (owningType.oclIsKindOf(Behavior) or<br>     owningType.oclIsKindOf(Step)) and<br>    self.isComposite implies<br>    specializesFromLibrary('Performances::Performance::subperformance')<br>behavior = type->selectByKind(Behavior)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:stepBehavior](https://www.omg.org/spec/SysML/20230201/vocab#stepBehavior)| [0..*]| [sysml_vocab:Behavior](https://www.omg.org/spec/SysML/20230201/vocab#Behavior)| <p>The <code>Behaviors</code> that type this <code>Step</code>.</p><br>| <p>The <code>Behaviors</code> that type this <code>Step</code>.</p><br>|
| [sysml_vocab:stepParameter](https://www.omg.org/spec/SysML/20230201/vocab#stepParameter)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>parameters</code> of this <code>Step</code>, which are defined as its <code>directedFeatures</code>, whose values are passed into and/or out of a performance of the <code>Step</code>.</p><br>| <p>The <code>parameters</code> of this <code>Step</code>, which are defined as its <code>directedFeatures</code>, whose values are passed into and/or out of a performance of the <code>Step</code>.</p><br>|



### ConnectionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ConnectionUsage

type: Shape

target class: [sysml_vocab:ConnectionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConnectionUsage)

definition of vocabulary class : <p>A <code>ConnectionUsage</code> is a <code>ConnectorAsUsage</code> that is also a <code>PartUsage</code>. Nominally, if its type is a <code>ConnectionDefinition</code>, then a <code>ConnectionUsage</code> is a Usage of that <code>ConnectionDefinition</code>, representing a connection between parts of a system. However, other kinds of kernel <code>AssociationStructures</code> are also allowed, to permit use of <code>AssociationStructures</code> from the Kernel Model Libraries.</p><br>specializesFromLibrary('Connections::connections')<br>ownedEndFeature->size() = 2 implies<br>    specializesFromLibrary('Connections::binaryConnections')

description: <p>A <code>ConnectionUsage</code> is a <code>ConnectorAsUsage</code> that is also a <code>PartUsage</code>. Nominally, if its type is a <code>ConnectionDefinition</code>, then a <code>ConnectionUsage</code> is a Usage of that <code>ConnectionDefinition</code>, representing a connection between parts of a system. However, other kinds of kernel <code>AssociationStructures</code> are also allowed, to permit use of <code>AssociationStructures</code> from the Kernel Model Libraries.</p><br>specializesFromLibrary('Connections::connections')<br>ownedEndFeature->size() = 2 implies<br>    specializesFromLibrary('Connections::binaryConnections')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:connectionUsageConnectionDefinition](https://www.omg.org/spec/SysML/20230201/vocab#connectionUsageConnectionDefinition)| [0..*]| [sysml_vocab:AssociationStructure](https://www.omg.org/spec/SysML/20230201/vocab#AssociationStructure)| <p>The <code>AssociationStructures</code> that are the types of this <code>ConnectionUsage</code>. Nominally, these are , but other kinds of Kernel <code>AssociationStructures</code> are also allowed, to permit use of <code>AssociationStructures</code> from the Kernel Model Libraries</p>| <p>The <code>AssociationStructures</code> that are the types of this <code>ConnectionUsage</code>. Nominally, these are , but other kinds of Kernel <code>AssociationStructures</code> are also allowed, to permit use of <code>AssociationStructures</code> from the Kernel Model Libraries</p>|



### MetadataFeature

URI: https://www.omg.org/spec/SysML/20230201/shapes#MetadataFeature

type: Shape

target class: [sysml_vocab:MetadataFeature](https://www.omg.org/spec/SysML/20230201/vocab#MetadataFeature)

definition of vocabulary class : <p>A <code>MetadataFeature</code> is a <code>Feature</code> that is an <code>AnnotatingElement</code> used to annotate another <code>Element</code> with metadata. It is typed by a <code>Metaclass</code>. All its <code>ownedFeatures</code> must redefine <code>features</code> of its <code>metaclass</code> and any feature bindings must be model-level evaluable.</p><br><br><br>specializesFromLibrary('Metaobjects::metaobjects')<br>isSemantic() implies<br>    let annotatedTypes : Sequence(Type) = <br>        annotatedElement->selectAsKind(Type) in<br>    let baseTypes : Sequence(MetadataFeature) = <br>        evaluateFeature(resolveGlobal(<br>            'Metaobjects::SemanticMetadata::baseType').<br>            memberElement.<br>            oclAsType(Feature))-><br>        selectAsKind(MetadataFeature) in<br>    annotatedTypes->notEmpty() and <br>    baseTypes()->notEmpty() and <br>    baseTypes()->first().isSyntactic() implies<br>        let annotatedType : Type = annotatedTypes->first() in<br>        let baseType : Element = baseTypes->first().syntaxElement() in<br>        if annotatedType.oclIsKindOf(Classifier) and <br>            baseType.oclIsKindOf(Feature) then<br>            baseType.oclAsType(Feature).type-><br>                forAll(t | annotatedType.specializes(t))<br>        else if baseType.oclIsKindOf(Type) then<br>            annotatedType.specializes(baseType.oclAsType(Type))<br>        else<br>            true<br>        endif<br>not metaclass.isAbstract<br>let baseAnnotatedElementFeature : Feature =<br>    resolveGlobal('Metaobjects::Metaobject::annotatedElement').memberElement.<br>    oclAsType(Feature) in<br>let annotatedElementFeatures : OrderedSet(Feature) = feature-><br>    select(specializes(baseAnnotatedElementFeature))-><br>    excluding(baseAnnotatedElementFeature) in<br>annotatedElementFeatures->notEmpty() implies<br>    let annotatedElementTypes : Set(Feature) =<br>        annotatedElementFeatures.typing.type->asSet() in<br>    let metaclasses : Set(Metaclass) =<br>        annotatedElement.oclType().qualifiedName->collect(qn | <br>            resolveGlobal(qn).memberElement.oclAsType(Metaclass)) in<br>   metaclasses->forAll(m | annotatedElementTypes->exists(t | m.specializes(t)))<br>ownedFeature->closure(ownedFeature)->forAll(f |<br>    f.declaredName = null and f.declaredShortName = null and<br>    f.valuation <> null implies f.valuation.value.isModelLevelEvaluable and<br>    f.redefinition.redefinedFeature->size() = 1)<br>metaclass = <br>    let metaclassTypes : Sequence(Type) = type->selectByKind(Metaclass) in<br>    if metaclassTypes->isEmpty() then null<br>    else metaClassTypes->first()<br>    endif<br>type->selectByKind(Metaclass).size() = 1

description: <p>A <code>MetadataFeature</code> is a <code>Feature</code> that is an <code>AnnotatingElement</code> used to annotate another <code>Element</code> with metadata. It is typed by a <code>Metaclass</code>. All its <code>ownedFeatures</code> must redefine <code>features</code> of its <code>metaclass</code> and any feature bindings must be model-level evaluable.</p><br><br><br>specializesFromLibrary('Metaobjects::metaobjects')<br>isSemantic() implies<br>    let annotatedTypes : Sequence(Type) = <br>        annotatedElement->selectAsKind(Type) in<br>    let baseTypes : Sequence(MetadataFeature) = <br>        evaluateFeature(resolveGlobal(<br>            'Metaobjects::SemanticMetadata::baseType').<br>            memberElement.<br>            oclAsType(Feature))-><br>        selectAsKind(MetadataFeature) in<br>    annotatedTypes->notEmpty() and <br>    baseTypes()->notEmpty() and <br>    baseTypes()->first().isSyntactic() implies<br>        let annotatedType : Type = annotatedTypes->first() in<br>        let baseType : Element = baseTypes->first().syntaxElement() in<br>        if annotatedType.oclIsKindOf(Classifier) and <br>            baseType.oclIsKindOf(Feature) then<br>            baseType.oclAsType(Feature).type-><br>                forAll(t | annotatedType.specializes(t))<br>        else if baseType.oclIsKindOf(Type) then<br>            annotatedType.specializes(baseType.oclAsType(Type))<br>        else<br>            true<br>        endif<br>not metaclass.isAbstract<br>let baseAnnotatedElementFeature : Feature =<br>    resolveGlobal('Metaobjects::Metaobject::annotatedElement').memberElement.<br>    oclAsType(Feature) in<br>let annotatedElementFeatures : OrderedSet(Feature) = feature-><br>    select(specializes(baseAnnotatedElementFeature))-><br>    excluding(baseAnnotatedElementFeature) in<br>annotatedElementFeatures->notEmpty() implies<br>    let annotatedElementTypes : Set(Feature) =<br>        annotatedElementFeatures.typing.type->asSet() in<br>    let metaclasses : Set(Metaclass) =<br>        annotatedElement.oclType().qualifiedName->collect(qn | <br>            resolveGlobal(qn).memberElement.oclAsType(Metaclass)) in<br>   metaclasses->forAll(m | annotatedElementTypes->exists(t | m.specializes(t)))<br>ownedFeature->closure(ownedFeature)->forAll(f |<br>    f.declaredName = null and f.declaredShortName = null and<br>    f.valuation <> null implies f.valuation.value.isModelLevelEvaluable and<br>    f.redefinition.redefinedFeature->size() = 1)<br>metaclass = <br>    let metaclassTypes : Sequence(Type) = type->selectByKind(Metaclass) in<br>    if metaclassTypes->isEmpty() then null<br>    else metaClassTypes->first()<br>    endif<br>type->selectByKind(Metaclass).size() = 1

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:metadataFeatureMetaclass](https://www.omg.org/spec/SysML/20230201/vocab#metadataFeatureMetaclass)| [0..1]| [sysml_vocab:Metaclass](https://www.omg.org/spec/SysML/20230201/vocab#Metaclass)| <p>The <code>type</code> of this <code>MetadataFeature</code>, which must be a <code>Metaclass</code>.</p>| <p>The <code>type</code> of this <code>MetadataFeature</code>, which must be a <code>Metaclass</code>.</p>|



### Connector

URI: https://www.omg.org/spec/SysML/20230201/shapes#Connector

type: Shape

target class: [sysml_vocab:Connector](https://www.omg.org/spec/SysML/20230201/vocab#Connector)

definition of vocabulary class : <p>A <code>Connector</code> is a usage of <code>Associations</code>, with links restricted according to instances of the <code>Type</code> in which they are used (domain of the <code>Connector</code>). The <code>associations</code> of the <code>Connector</code> restrict what kinds of things might be linked. The <code>Connector</code> further restricts these links to be between values of <code>Features</code> on instances of its domain.</p><br><br>relatedFeature = connectorEnd.ownedReferenceSubsetting-><br>    select(s | s <> null).subsettedFeature<br>relatedFeature->forAll(f | <br>    if featuringType->isEmpty() then f.isFeaturedWithin(null)<br>    else featuringType->forAll(t | f.isFeaturedWithin(t))<br>    endif)<br>sourceFeature = <br>    if relatedFeature->isEmpty() then null <br>    else relatedFeature->first() <br>    endif<br>targetFeature =<br>    if relatedFeature->size() < 2 then OrderedSet{}<br>    else <br>        relatedFeature-><br>            subSequence(2, relatedFeature->size())-><br>            asOrderedSet()<br>    endif<br>not isAbstract implies relatedFeature->size() >= 2<br>specializesFromLibrary('Links::links')<br>association->exists(oclIsKindOf(AssociationStructure)) implies<br>    specializesFromLibrary('Objects::linkObjects')<br>connectorEnds->size() = 2 and<br>association->exists(oclIsKindOf(AssocationStructure)) implies<br>    specializesFromLibrary('Objects::binaryLinkObjects')<br>connectorEnd->size() = 2 implies<br>    specializesFromLibrary('Links::binaryLinks')<br>connectorEnds->size() > 2 implies<br>    not specializesFromLibrary('Links::BinaryLink')

description: <p>A <code>Connector</code> is a usage of <code>Associations</code>, with links restricted according to instances of the <code>Type</code> in which they are used (domain of the <code>Connector</code>). The <code>associations</code> of the <code>Connector</code> restrict what kinds of things might be linked. The <code>Connector</code> further restricts these links to be between values of <code>Features</code> on instances of its domain.</p><br><br>relatedFeature = connectorEnd.ownedReferenceSubsetting-><br>    select(s | s <> null).subsettedFeature<br>relatedFeature->forAll(f | <br>    if featuringType->isEmpty() then f.isFeaturedWithin(null)<br>    else featuringType->forAll(t | f.isFeaturedWithin(t))<br>    endif)<br>sourceFeature = <br>    if relatedFeature->isEmpty() then null <br>    else relatedFeature->first() <br>    endif<br>targetFeature =<br>    if relatedFeature->size() < 2 then OrderedSet{}<br>    else <br>        relatedFeature-><br>            subSequence(2, relatedFeature->size())-><br>            asOrderedSet()<br>    endif<br>not isAbstract implies relatedFeature->size() >= 2<br>specializesFromLibrary('Links::links')<br>association->exists(oclIsKindOf(AssociationStructure)) implies<br>    specializesFromLibrary('Objects::linkObjects')<br>connectorEnds->size() = 2 and<br>association->exists(oclIsKindOf(AssocationStructure)) implies<br>    specializesFromLibrary('Objects::binaryLinkObjects')<br>connectorEnd->size() = 2 implies<br>    specializesFromLibrary('Links::binaryLinks')<br>connectorEnds->size() > 2 implies<br>    not specializesFromLibrary('Links::BinaryLink')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:connectorRelatedFeature](https://www.omg.org/spec/SysML/20230201/vocab#connectorRelatedFeature)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Features</code> that are related by this <code>Connector</code> considered as a <code>Relationship</code> and that restrict the links it identifies, given by the referenced <code>Features</code> of the <code>connectorEnds</code> of the <code>Connector</code>.</p><br>| <p>The <code>Features</code> that are related by this <code>Connector</code> considered as a <code>Relationship</code> and that restrict the links it identifies, given by the referenced <code>Features</code> of the <code>connectorEnds</code> of the <code>Connector</code>.</p><br>|
| [sysml_vocab:connectorAssociation](https://www.omg.org/spec/SysML/20230201/vocab#connectorAssociation)| [0..*]| [sysml_vocab:Association](https://www.omg.org/spec/SysML/20230201/vocab#Association)| <p>The <code>Associations</code> that type the <code>Connector</code>.</p><br>| <p>The <code>Associations</code> that type the <code>Connector</code>.</p><br>|
| [sysml_vocab:connectorConnectorEnd](https://www.omg.org/spec/SysML/20230201/vocab#connectorConnectorEnd)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>endFeatures</code> of a <code>Connector</code>, which redefine the <code>endFeatures</code> of the <code>associations</code> of the <code>Connector</code>. The <code>connectorEnds</code> determine via <code>ReferenceSubsetting</code> <code>Relationships</code> which <code>Features</code> are related by the <code>Connector</code>.</p>| <p>The <code>endFeatures</code> of a <code>Connector</code>, which redefine the <code>endFeatures</code> of the <code>associations</code> of the <code>Connector</code>. The <code>connectorEnds</code> determine via <code>ReferenceSubsetting</code> <code>Relationships</code> which <code>Features</code> are related by the <code>Connector</code>.</p>|
| [sysml_vocab:connectorSourceFeature](https://www.omg.org/spec/SysML/20230201/vocab#connectorSourceFeature)| [0..1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The source <code>relatedFeature</code> for this <code>Connector</code>. It is the first <code>relatedFeature</code>.</p>| <p>The source <code>relatedFeature</code> for this <code>Connector</code>. It is the first <code>relatedFeature</code>.</p>|
| [sysml_vocab:connectorTargetFeature](https://www.omg.org/spec/SysML/20230201/vocab#connectorTargetFeature)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The target <code>relatedFeatures</code> for this <code>Connector</code>. This includes all the <code>relatedFeatures</code> other than the <code>sourceFeature</code>.</p>| <p>The target <code>relatedFeatures</code> for this <code>Connector</code>. This includes all the <code>relatedFeatures</code> other than the <code>sourceFeature</code>.</p>|



### ItemFeature

URI: https://www.omg.org/spec/SysML/20230201/shapes#ItemFeature

type: Shape

target class: [sysml_vocab:ItemFeature](https://www.omg.org/spec/SysML/20230201/vocab#ItemFeature)

definition of vocabulary class : <p>An <code>ItemFeature</code> is the <code>ownedFeature</code> of an <code>ItemFlow</code> that identifies the things carried by the kinds of transfers that are instances of the <code>ItemFlow</code>.</p><br>ownedRedefinition.redefinedFeature-><br>    redefinesFromLibrary('Transfers::Transfer::item')

description: <p>An <code>ItemFeature</code> is the <code>ownedFeature</code> of an <code>ItemFlow</code> that identifies the things carried by the kinds of transfers that are instances of the <code>ItemFlow</code>.</p><br>ownedRedefinition.redefinedFeature-><br>    redefinesFromLibrary('Transfers::Transfer::item')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### InterfaceDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#InterfaceDefinition

type: Shape

target class: [sysml_vocab:InterfaceDefinition](https://www.omg.org/spec/SysML/20230201/vocab#InterfaceDefinition)

definition of vocabulary class : <p>An <code>InterfaceDefinition</code> is a <code>ConnectionDefinition</code> all of whose ends are <code>PortUsages</code>, defining an interface between elements that interact through such ports.</p><br>specializesFromLibrary('Interfaces::Interface')<br>ownedEndFeature->size() = 2 implies<br>    specializesFromLibrary('Interfaces::BinaryInterface')

description: <p>An <code>InterfaceDefinition</code> is a <code>ConnectionDefinition</code> all of whose ends are <code>PortUsages</code>, defining an interface between elements that interact through such ports.</p><br>specializesFromLibrary('Interfaces::Interface')<br>ownedEndFeature->size() = 2 implies<br>    specializesFromLibrary('Interfaces::BinaryInterface')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:interfaceDefinitionInterfaceEnd](https://www.omg.org/spec/SysML/20230201/vocab#interfaceDefinitionInterfaceEnd)| [0..*]| [sysml_vocab:PortUsage](https://www.omg.org/spec/SysML/20230201/vocab#PortUsage)| <p>The <code>PortUsages</code> that are the <code>connectionEnds</code> of this <code>InterfaceDefinition</code>.<br><br>| <p>The <code>PortUsages</code> that are the <code>connectionEnds</code> of this <code>InterfaceDefinition</code>.<br><br>|



### StakeholderMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#StakeholderMembership

type: Shape

target class: [sysml_vocab:StakeholderMembership](https://www.omg.org/spec/SysML/20230201/vocab#StakeholderMembership)

definition of vocabulary class : <p>A <code>StakeholderMembership</code> is a <code>ParameterMembership</code> that identifies a <code>PartUsage</code> as a <code>stakeholderParameter</code> of a <code>RequirementDefinition</code> or <code>RequirementUsage</code>, which specifies a role played by an entity with concerns framed by the <code>owningType</code>.</p><br>owningType.oclIsKindOf(RequirementUsage) or<br>owningType.oclIsKindOf(RequirementDefinition)

description: <p>A <code>StakeholderMembership</code> is a <code>ParameterMembership</code> that identifies a <code>PartUsage</code> as a <code>stakeholderParameter</code> of a <code>RequirementDefinition</code> or <code>RequirementUsage</code>, which specifies a role played by an entity with concerns framed by the <code>owningType</code>.</p><br>owningType.oclIsKindOf(RequirementUsage) or<br>owningType.oclIsKindOf(RequirementDefinition)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:stakeholderMembershipOwnedStakeholderParameter](https://www.omg.org/spec/SysML/20230201/vocab#stakeholderMembershipOwnedStakeholderParameter)| [1]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The <code>PartUsage</code> specifying the stakeholder.</p>| <p>The <code>PartUsage</code> specifying the stakeholder.</p>|



### FlowConnectionDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#FlowConnectionDefinition

type: Shape

target class: [sysml_vocab:FlowConnectionDefinition](https://www.omg.org/spec/SysML/20230201/vocab#FlowConnectionDefinition)

definition of vocabulary class : <p>A <code>FlowConnectionDefinition</code> is a <code>ConnectionDefinition</code> and <code>ActionDefinition</code> that is also an <code>Interaction</code> representing flows between <code>Usages</code>.</p><br>specializesFromLibrary('Connections::MessageConnection')

description: <p>A <code>FlowConnectionDefinition</code> is a <code>ConnectionDefinition</code> and <code>ActionDefinition</code> that is also an <code>Interaction</code> representing flows between <code>Usages</code>.</p><br>specializesFromLibrary('Connections::MessageConnection')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|




