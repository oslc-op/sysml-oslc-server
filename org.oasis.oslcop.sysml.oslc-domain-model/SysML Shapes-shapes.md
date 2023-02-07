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

## Table of Contents
TODO

## Scope
## Background
## Constraints
Note: In the constraints below, 'definition of vocabulary class' &  'definition of Vocabulary Property' values correspond to the rdfs:comment values in the vocabularies. 

### ConcernUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ConcernUsage

type: Shape

target class: [sysml_vocab:ConcernUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConcernUsage)

definition of vocabulary class : <p>A ConcernUsage is a Usage of a ConcernDefinition.</p><br><br><p>A ConcernUsage must subset, directly or indirectly, the base ConcernUsage <em><code>concernChecks</code></em> from the Systems model library. The <code>ownedStakeholder</code> features of the ConcernUsage shall all subset the <em><code>ConcernCheck::concernedStakeholders</code> </em>feature. If the ConcernUsage is an <code>ownedFeature</code> of a StakeholderDefinition or StakeholderUsage, then the ConcernUsage shall have an <code>ownedStakeholder</code> feature that is bound to the <em><code>self</code></em> feature of its owner.</p><br>

description: <p>A ConcernUsage is a Usage of a ConcernDefinition.</p><br><br><p>A ConcernUsage must subset, directly or indirectly, the base ConcernUsage <em><code>concernChecks</code></em> from the Systems model library. The <code>ownedStakeholder</code> features of the ConcernUsage shall all subset the <em><code>ConcernCheck::concernedStakeholders</code> </em>feature. If the ConcernUsage is an <code>ownedFeature</code> of a StakeholderDefinition or StakeholderUsage, then the ConcernUsage shall have an <code>ownedStakeholder</code> feature that is bound to the <em><code>self</code></em> feature of its owner.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:concernDefinition](https://www.omg.org/spec/SysML/20230201/vocab#concernDefinition)| [0..1]| [sysml_vocab:ConcernDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ConcernDefinition)| <p>The ConcernDefinition that is the single type of this ConcernUsage.</p>| <p>The ConcernDefinition that is the single type of this ConcernUsage.</p>|



### Interaction

URI: https://www.omg.org/spec/SysML/20230201/shapes#Interaction

type: Shape

target class: [sysml_vocab:Interaction](https://www.omg.org/spec/SysML/20230201/vocab#Interaction)

definition of vocabulary class : <p>An Interaction is a Behavior that is also an Association, providing a context for multiple objects that have behaviors that impact one another.</p><br>

description: <p>An Interaction is a Behavior that is also an Association, providing a context for multiple objects that have behaviors that impact one another.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### FlowConnectionDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#FlowConnectionDefinition

type: Shape

target class: [sysml_vocab:FlowConnectionDefinition](https://www.omg.org/spec/SysML/20230201/vocab#FlowConnectionDefinition)

definition of vocabulary class : <p>A FlowConnectionDefinition is a ConnectionDefinition and ActionDefinition that is also an Interaction representing flows between Usages.</p><br>specializesFromLibrary("Connections::MessageConnection")

description: <p>A FlowConnectionDefinition is a ConnectionDefinition and ActionDefinition that is also an Interaction representing flows between Usages.</p><br>specializesFromLibrary("Connections::MessageConnection")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Subsetting

URI: https://www.omg.org/spec/SysML/20230201/shapes#Subsetting

type: Shape

target class: [sysml_vocab:Subsetting](https://www.omg.org/spec/SysML/20230201/vocab#Subsetting)

definition of vocabulary class : <p>Subsetting is Generalization in which the <code>specific</code> and <code>general</code> Types that are Features. This means all values of the <code>subsettingFeature</code> (on instances of its domain, i.e., the intersection of its <code>featuringTypes</code>) are values of the <code>subsettedFeature</code> on instances of its domain.&nbsp; To support this,&nbsp;the domain&nbsp;of the <code>subsettingFeature</code> must be the same or specialize (at least indirectly) the&nbsp;domain&nbsp;of the <code>subsettedFeature</code> (via Generalization), and the range (intersection of a Feature&#39;s <code>types</code>) of the <code>subsettingFeature</code> must specialize the range of the <code>subsettedFeature</code>.&nbsp;The <code>subsettedFeature</code> is imported into the <code>owningNamespace</code> of the <code>subsettingFeature</code> (if it is not already in that namespace), requiring the names of the <code>subsettingFeature</code> and <code>subsettedFeature</code> to be different.</p><br>

description: <p>Subsetting is Generalization in which the <code>specific</code> and <code>general</code> Types that are Features. This means all values of the <code>subsettingFeature</code> (on instances of its domain, i.e., the intersection of its <code>featuringTypes</code>) are values of the <code>subsettedFeature</code> on instances of its domain.&nbsp; To support this,&nbsp;the domain&nbsp;of the <code>subsettingFeature</code> must be the same or specialize (at least indirectly) the&nbsp;domain&nbsp;of the <code>subsettedFeature</code> (via Generalization), and the range (intersection of a Feature&#39;s <code>types</code>) of the <code>subsettingFeature</code> must specialize the range of the <code>subsettedFeature</code>.&nbsp;The <code>subsettedFeature</code> is imported into the <code>owningNamespace</code> of the <code>subsettingFeature</code> (if it is not already in that namespace), requiring the names of the <code>subsettingFeature</code> and <code>subsettedFeature</code> to be different.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:subsettedFeature](https://www.omg.org/spec/SysML/20230201/vocab#subsettedFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Feature that is subsetted by the <code>subsettingFeature</code> of this Subsetting.</p><br>| <p>The Feature that is subsetted by the <code>subsettingFeature</code> of this Subsetting.</p><br>|
| [sysml_vocab:subsettingFeature](https://www.omg.org/spec/SysML/20230201/vocab#subsettingFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Feature that is a subset of the <code>subsettedFeature</code> of this Subsetting.</p><br>| <p>The Feature that is a subset of the <code>subsettedFeature</code> of this Subsetting.</p><br>|
| [sysml_vocab:owningFeature](https://www.omg.org/spec/SysML/20230201/vocab#owningFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>A <code>featureInverted</code> that is also an <code>owningRelatedElement<code>.</p>| <p>The Feature that owns this Subsetting relationship, which must also be its <code>subsettingFeature</code>.</p><br>|



### LiteralRational

URI: https://www.omg.org/spec/SysML/20230201/shapes#LiteralRational

type: Shape

target class: [sysml_vocab:LiteralRational](https://www.omg.org/spec/SysML/20230201/vocab#LiteralRational)

definition of vocabulary class : <p>A LiteralRational is a LiteralExpression that provides a <code><em>Rational</em></code> value as a result. Its <code>result</code> parameter must have the type <code><em>Rational</em></code>.</p><br>

description: <p>A LiteralRational is a LiteralExpression that provides a <code><em>Rational</em></code> value as a result. Its <code>result</code> parameter must have the type <code><em>Rational</em></code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:value](https://www.omg.org/spec/SysML/20230201/vocab#value)| [1]| Float| <p>The Expression that provides the value of the <code>featureWithValue</code> as its <code>result</code>.</p><br><br><p>The Expression that provides the value as a result.</p>| <p>The value whose rational approximation is the result of evaluating this Expression.</p><br><br><p>The Real value that is the result of evaluating this Expression.</p>|



### Intersecting

URI: https://www.omg.org/spec/SysML/20230201/shapes#Intersecting

type: Shape

target class: [sysml_vocab:Intersecting](https://www.omg.org/spec/SysML/20230201/vocab#Intersecting)

definition of vocabulary class : <p>Intersecting is a Relationship that makes its <code>intersectingType</code> one of the <code>intersectingTypes</code> of its <code>typeIntersected</code>.</p>

description: <p>Intersecting is a Relationship that makes its <code>intersectingType</code> one of the <code>intersectingTypes</code> of its <code>typeIntersected</code>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:intersectingType](https://www.omg.org/spec/SysML/20230201/vocab#intersectingType)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>Type that partly determines interpretations of <code>typeIntersected</code>, as described in <code>Type::intersectingType</code>.</p>| <p>Type that partly determines interpretations of <code>typeIntersected</code>, as described in <code>Type::intersectingType</code>.</p>|
| [sysml_vocab:typeIntersected](https://www.omg.org/spec/SysML/20230201/vocab#typeIntersected)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>Type with interpretations partly determined by <code>intersectingType</code>, as described in <code>Type::intersectingType</code>.</p>| <p>Type with interpretations partly determined by <code>intersectingType</code>, as described in <code>Type::intersectingType</code>.</p>|



### CaseDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#CaseDefinition

type: Shape

target class: [sysml_vocab:CaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#CaseDefinition)

definition of vocabulary class : <p>A CaseDefinition is a CalculationDefinition for a process, often involving collecting evidence or data, relative to a subject, possibly involving the collaboration of one or more other actors, producing a result that meets an objective.</p><br><br><p>A CaseDefinition must subclass, directly or indirectly, the base CaseDefinition <em>Case</em> from the Systems model library.</p>

description: <p>A CaseDefinition is a CalculationDefinition for a process, often involving collecting evidence or data, relative to a subject, possibly involving the collaboration of one or more other actors, producing a result that meets an objective.</p><br><br><p>A CaseDefinition must subclass, directly or indirectly, the base CaseDefinition <em>Case</em> from the Systems model library.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:objectiveRequirement](https://www.omg.org/spec/SysML/20230201/vocab#objectiveRequirement)| [0..1]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The <code>ownedFeature</code> of this CaseDefinition that is owned via an ObjectiveMembership, and that must redefine, directly or indirectly, the <code>objective</code> RequirementUsage of the base CaseDefinition Case from the Systems model library.</p> <br>| <p>The <code>ownedFeature</code> of this CaseDefinition that is owned via an ObjectiveMembership, and that must redefine, directly or indirectly, the <code>objective</code> RequirementUsage of the base CaseDefinition Case from the Systems model library.</p> <br>|
| [sysml_vocab:subjectParameter](https://www.omg.org/spec/SysML/20230201/vocab#subjectParameter)| [1]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>parameter</code> of this RequirementUsage that is owned via a SubjectMembership, which must redefine, directly or indirectly, the <code>subject</code> parameter of the base RequirementDefinition RequirementCheck from the Systems model library.</p>| <p>The <code>parameter</code> of this CaseDefinition that is owned via a SubjectMembership, which must redefine, directly or indirectly, the <code>subject</code> parameter of the base CaseDefinition Case from the Systems model library.</p>|
| [sysml_vocab:actorParameter](https://www.omg.org/spec/SysML/20230201/vocab#actorParameter)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The <code>parameters</code> of this RequirementUsage that are owned via ActorMemberships, which must subset, directly or indirectly, the PartUsage <em><code>actors</code></em> of the base RequirementDefinition <em>RequirementCheck</em> from the Systems model library.</p>| <p>The <code>parameters</code> of this CaseDefinition that are owned via ActorMemberships, which must subset, directly or indirectly, the PartUsage <em><code>actors</code></em> of the base CaseDefinition <em>Case</em> from the Systems model library.</p>|



### Differencing

URI: https://www.omg.org/spec/SysML/20230201/shapes#Differencing

type: Shape

target class: [sysml_vocab:Differencing](https://www.omg.org/spec/SysML/20230201/vocab#Differencing)

definition of vocabulary class : <p>Differencing is a Relationship that makes its <code>differencingType</code> one of the <code>differencingTypes</code> of its <code>typeDifferenced</code>.</p>

description: <p>Differencing is a Relationship that makes its <code>differencingType</code> one of the <code>differencingTypes</code> of its <code>typeDifferenced</code>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:differencingType](https://www.omg.org/spec/SysML/20230201/vocab#differencingType)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The interpretations of a Type with <code>differencingTypes</code> are asserted to be those of the first of those Types, but not including those of the remaining types. For example, a Classifier might be the difference of a Classifier for people and another for people of a particular nationality, leaving people who are not of that nationality. Similarly, a feature of people might be the difference between a feature for their children and a Classifier for people of a particular sex, identifying their children not of that sex (because the interpretations of the children feature that identify those of that sex are also interpretations of the Classifier for that sex).<p>| <p>Type that partly determines interpretations of <code>typeDifferenced</code>, as described in <code>Type::differencingType</code>.</p>|
| [sysml_vocab:typeDifferenced](https://www.omg.org/spec/SysML/20230201/vocab#typeDifferenced)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>Type with interpretations partly determined by <code>differencingType</code>, as described in <code>Type::differencingType</code>.</p>| <p>Type with interpretations partly determined by <code>differencingType</code>, as described in <code>Type::differencingType</code>.</p>|



### ItemDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#ItemDefinition

type: Shape

target class: [sysml_vocab:ItemDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ItemDefinition)

definition of vocabulary class : <p>An <code>ItemDefinition</code> is an <code>OccurrenceDefinition</code> of the <code>Structure</code> of things that may themselves be systems or parts of systems, but may also be things that are acted on by a system or parts of a system, but which do not necessarily perform actions themselves. This includes items that can be exchanged between parts of a system, such as water or electrical signals.</p><br><br><p>An <code>ItemDefinition</code> must specialize, directly or indirectly, the base <code>ItemDefinition</code> <em><code>Items::Item</code></em> from the Systems Model Library.</p><br><br>specializesFromLibrary("Items::Item")

description: <p>An <code>ItemDefinition</code> is an <code>OccurrenceDefinition</code> of the <code>Structure</code> of things that may themselves be systems or parts of systems, but may also be things that are acted on by a system or parts of a system, but which do not necessarily perform actions themselves. This includes items that can be exchanged between parts of a system, such as water or electrical signals.</p><br><br><p>An <code>ItemDefinition</code> must specialize, directly or indirectly, the base <code>ItemDefinition</code> <em><code>Items::Item</code></em> from the Systems Model Library.</p><br><br>specializesFromLibrary("Items::Item")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### ResultExpressionMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#ResultExpressionMembership

type: Shape

target class: [sysml_vocab:ResultExpressionMembership](https://www.omg.org/spec/SysML/20230201/vocab#ResultExpressionMembership)

definition of vocabulary class : <p>A ResultExpressionMembership is a FeatureMembership that indicates that the <code>ownedResultExpression</code> provides the result values for the Function or Expression that owns it. The owning Function or Expression must contain a BindingConnector between the <code>result</code> parameter of the <code>ownedResultExpression</code> and the <code>result</code> parameter of the Function or Expression.</p><br>

description: <p>A ResultExpressionMembership is a FeatureMembership that indicates that the <code>ownedResultExpression</code> provides the result values for the Function or Expression that owns it. The owning Function or Expression must contain a BindingConnector between the <code>result</code> parameter of the <code>ownedResultExpression</code> and the <code>result</code> parameter of the Function or Expression.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:ownedResultExpression](https://www.omg.org/spec/SysML/20230201/vocab#ownedResultExpression)| [1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The Expression that provides the result for the owner of the ResultExpressionMembership.</p>| <p>The Expression that provides the result for the owner of the ResultExpressionMembership.</p>|



### FramedConcernMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#FramedConcernMembership

type: Shape

target class: [sysml_vocab:FramedConcernMembership](https://www.omg.org/spec/SysML/20230201/vocab#FramedConcernMembership)

definition of vocabulary class : <p>A FramedConcernMembership is a RequirementConstraintMembership for a framed ConcernUsage of a RequirementDefinition or RequirementUsage. The <code>ownedConstraint</code> of a FramedConcernMembership must be a ConcernUsage.</p>

description: <p>A FramedConcernMembership is a RequirementConstraintMembership for a framed ConcernUsage of a RequirementDefinition or RequirementUsage. The <code>ownedConstraint</code> of a FramedConcernMembership must be a ConcernUsage.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:ownedConcern](https://www.omg.org/spec/SysML/20230201/vocab#ownedConcern)| [1]| [sysml_vocab:ConcernUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConcernUsage)| <p>The ConcernUsages that are <code>ownedUsages</code> of this Definition.</p>| <p>The ConcernUsage that is the <code>ownedConstraint</code> of this AddressedConcernMembership.</p>|
| [sysml_vocab:referencedConcern](https://www.omg.org/spec/SysML/20230201/vocab#referencedConcern)| [1]| [sysml_vocab:ConcernUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConcernUsage)| <p> The ConcernUsage that is referenced through this AddressedConcernMembership. It is the <code>referencedConstraint</code> of the FramedConcernMembership considered as a RequirementConstraintMembership, which must be a ConcernUsage.</p>| <p> The ConcernUsage that is referenced through this AddressedConcernMembership. It is the <code>referencedConstraint</code> of the FramedConcernMembership considered as a RequirementConstraintMembership, which must be a ConcernUsage.</p>|



### Subclassification

URI: https://www.omg.org/spec/SysML/20230201/shapes#Subclassification

type: Shape

target class: [sysml_vocab:Subclassification](https://www.omg.org/spec/SysML/20230201/vocab#Subclassification)

definition of vocabulary class : <p>Subclassification is Specialization in which both the <code>specific</code> and <code>general</code> Types are Classifiers. This means all instances of the specific Classifier are also instances of the general Classifier.</p><br>

description: <p>Subclassification is Specialization in which both the <code>specific</code> and <code>general</code> Types are Classifiers. This means all instances of the specific Classifier are also instances of the general Classifier.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:superclassifier](https://www.omg.org/spec/SysML/20230201/vocab#superclassifier)| [1]| [sysml_vocab:Classifier](https://www.omg.org/spec/SysML/20230201/vocab#Classifier)| <p>The more general Classifier in this Subclassification.</p>| <p>The more general Classifier in this Subclassification.</p>|
| [sysml_vocab:subclassifier](https://www.omg.org/spec/SysML/20230201/vocab#subclassifier)| [1]| [sysml_vocab:Classifier](https://www.omg.org/spec/SysML/20230201/vocab#Classifier)| <p>The more specific Classifier in this Subclassification.</p>| <p>The more specific Classifier in this Subclassification.</p>|
| [sysml_vocab:owningClassifier](https://www.omg.org/spec/SysML/20230201/vocab#owningClassifier)| [0..1]| [sysml_vocab:Classifier](https://www.omg.org/spec/SysML/20230201/vocab#Classifier)| <p>The Classfier that owns this Subclassification relationship, which must also be its <code>subclassifier</code>.</p>| <p>The Classfier that owns this Subclassification relationship, which must also be its <code>subclassifier</code>.</p>|



### BindingConnector

URI: https://www.omg.org/spec/SysML/20230201/shapes#BindingConnector

type: Shape

target class: [sysml_vocab:BindingConnector](https://www.omg.org/spec/SysML/20230201/vocab#BindingConnector)

definition of vocabulary class : <p>A Binding Connector is a binary Connector that requires its <code>relatedFeatures</code> to identify the same things (have the same values). <br><br><p> A BindingConnector must be directly or indirectly typed by the <em><code>SelfLink</code></em> Association from the <em><code>Links</code</em> library model. Both end multiplicities must be 1..1 when the <code>relatedFeatures</code> have unique values.</p><br><br>specializesFromLibrary("Links::selfLinks")

description: <p>A Binding Connector is a binary Connector that requires its <code>relatedFeatures</code> to identify the same things (have the same values). <br><br><p> A BindingConnector must be directly or indirectly typed by the <em><code>SelfLink</code></em> Association from the <em><code>Links</code</em> library model. Both end multiplicities must be 1..1 when the <code>relatedFeatures</code> have unique values.</p><br><br>specializesFromLibrary("Links::selfLinks")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### ForLoopActionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ForLoopActionUsage

type: Shape

target class: [sysml_vocab:ForLoopActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ForLoopActionUsage)

definition of vocabulary class : <p>A <code>ForLoopActionUsage</code> is a <code>LoopActionUsage</code> that specifies that its <code>bodyClause</code> <code>ActionUsage</code> should be performed once for each value, in order, from the sequence of values obtained as the result of the <code>seqArgument</code> <code>Expression</code>, with the <code>loopVariable</code> set to the value for each iteration.</p><br>seqArgument =<br>    let parameter : Feature = inputParameter(1) in<br>    if parameter <> null and parameter.oclIsKindOf(Expression) then<br>        parameter.oclAsType(Expression)<br>    else<br>        null<br>    endif<br><br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::forLoops')<br>loopVariable <> null and<br>loopVariable.redefinesFromLibrary('Actions::ForLoopAction::var')<br>specializesFromLibrary('Actions::forLoopActions')<br>loopVariable =<br>    if ownedFeature->isEmpty() or <br>        not ownedFeature->first().oclIsKindOf(ReferenceUsage) then <br>        null<br>    else <br>        ownedFeature->first().oclAsType(ReferenceUsage)<br>    endif

description: <p>A <code>ForLoopActionUsage</code> is a <code>LoopActionUsage</code> that specifies that its <code>bodyClause</code> <code>ActionUsage</code> should be performed once for each value, in order, from the sequence of values obtained as the result of the <code>seqArgument</code> <code>Expression</code>, with the <code>loopVariable</code> set to the value for each iteration.</p><br>seqArgument =<br>    let parameter : Feature = inputParameter(1) in<br>    if parameter <> null and parameter.oclIsKindOf(Expression) then<br>        parameter.oclAsType(Expression)<br>    else<br>        null<br>    endif<br><br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::forLoops')<br>loopVariable <> null and<br>loopVariable.redefinesFromLibrary('Actions::ForLoopAction::var')<br>specializesFromLibrary('Actions::forLoopActions')<br>loopVariable =<br>    if ownedFeature->isEmpty() or <br>        not ownedFeature->first().oclIsKindOf(ReferenceUsage) then <br>        null<br>    else <br>        ownedFeature->first().oclAsType(ReferenceUsage)<br>    endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:seqArgument](https://www.omg.org/spec/SysML/20230201/vocab#seqArgument)| [1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>Expression</code> whose result provides the sequence of values to which the <code>loopVariable</code> is set for each iterative performance of the <code>bodyAction</code>. It is the owned <code>parameter</code> that redefines <em><code>ForLoopAction::body</code></em>.</p><br>| <p>The <code>Expression</code> whose result provides the sequence of values to which the <code>loopVariable</code> is set for each iterative performance of the <code>bodyAction</code>. It is the owned <code>parameter</code> that redefines <em><code>ForLoopAction::body</code></em>.</p><br>|
| [sysml_vocab:loopVariable](https://www.omg.org/spec/SysML/20230201/vocab#loopVariable)| [1]| [sysml_vocab:ReferenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#ReferenceUsage)| <p>The <code>ownedFeature</code> of this <co>ForLoopActionUsage</code> that acts as the loop variable, which is assigned the successive values of the input sequence on each iteration. It is the <code>ownedFeature</code> that redefines <em><code>ForLoopAction::var</code></em>.</p> | <p>The <code>ownedFeature</code> of this <co>ForLoopActionUsage</code> that acts as the loop variable, which is assigned the successive values of the input sequence on each iteration. It is the <code>ownedFeature</code> that redefines <em><code>ForLoopAction::var</code></em>.</p> |



### SuccessionAsUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#SuccessionAsUsage

type: Shape

target class: [sysml_vocab:SuccessionAsUsage](https://www.omg.org/spec/SysML/20230201/vocab#SuccessionAsUsage)

definition of vocabulary class : <p>A SuccessionAsUsage is both a ConnectorAsUsage and a Succession.<p>

description: <p>A SuccessionAsUsage is both a ConnectorAsUsage and a Succession.<p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### CalculationDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#CalculationDefinition

type: Shape

target class: [sysml_vocab:CalculationDefinition](https://www.omg.org/spec/SysML/20230201/vocab#CalculationDefinition)

definition of vocabulary class : <p>A <code>CalculationDefinition</code> is an <coed>ActionDefinition</code> that also defines a <code>Function</code> producing a <code>result</code>.</p><br>specializesFromLibrary('Calculations::Calculation')<br>calculation = action->selectByKind(CalculationUsage)

description: <p>A <code>CalculationDefinition</code> is an <coed>ActionDefinition</code> that also defines a <code>Function</code> producing a <code>result</code>.</p><br>specializesFromLibrary('Calculations::Calculation')<br>calculation = action->selectByKind(CalculationUsage)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:calculation](https://www.omg.org/spec/SysML/20230201/vocab#calculation)| [0..*]| [sysml_vocab:CalculationUsage](https://www.omg.org/spec/SysML/20230201/vocab#CalculationUsage)| <p>The <code>actions</code> of this <code>CalculationDefinition</code> that are <code>CalculationUsages</code>.</p>| <p>The <code>actions</code> of this <code>CalculationDefinition</code> that are <code>CalculationUsages</code>.</p>|



### PartUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#PartUsage

type: Shape

target class: [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)

definition of vocabulary class : <p>A <code>PartUsage</code> is a usage of a <code>PartDefinition</code> to represent a system or a part of a system. At least one of the <code>itemDefinitions</code> of the <code>PartUsage</code> must be a <code>PartDefinition</code>.</p><br><br><p>A <code>PartUsage</code> must subset, directly or indirectly, the base <code>PartUsage</code> <em><code>parts</code></em> from the Systems Model Library.</p><br>itemDefinition->selectByKind(PartDefinition)<br>partDefinition->notEmpty()<br>specializesFromLibrary("Parts::parts")<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(ItemDefinition) or<br> owningType.oclIsKindOf(ItemUsage)) implies<br>    specializesFromLibrary("Items::Item::subparts")

description: <p>A <code>PartUsage</code> is a usage of a <code>PartDefinition</code> to represent a system or a part of a system. At least one of the <code>itemDefinitions</code> of the <code>PartUsage</code> must be a <code>PartDefinition</code>.</p><br><br><p>A <code>PartUsage</code> must subset, directly or indirectly, the base <code>PartUsage</code> <em><code>parts</code></em> from the Systems Model Library.</p><br>itemDefinition->selectByKind(PartDefinition)<br>partDefinition->notEmpty()<br>specializesFromLibrary("Parts::parts")<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(ItemDefinition) or<br> owningType.oclIsKindOf(ItemUsage)) implies<br>    specializesFromLibrary("Items::Item::subparts")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:partDefinition](https://www.omg.org/spec/SysML/20230201/vocab#partDefinition)| [0..*]| [sysml_vocab:PartDefinition](https://www.omg.org/spec/SysML/20230201/vocab#PartDefinition)| <p>The <code>itemDefinitions</code> of this PartUsage that are PartDefinitions.</p>| <p>The <code>itemDefinitions</code> of this PartUsage that are PartDefinitions.</p>|



### MembershipExpose

URI: https://www.omg.org/spec/SysML/20230201/shapes#MembershipExpose

type: Shape

target class: [sysml_vocab:MembershipExpose](https://www.omg.org/spec/SysML/20230201/vocab#MembershipExpose)

definition of vocabulary class : <p>A MembershipExpose is an Expose relationship that exposes a specific <code>importedMembership</code> and, if <code>isRecursive = true</code>, additional Memberships recursively.</p>

description: <p>A MembershipExpose is an Expose relationship that exposes a specific <code>importedMembership</code> and, if <code>isRecursive = true</code>, additional Memberships recursively.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Expose

URI: https://www.omg.org/spec/SysML/20230201/shapes#Expose

type: Shape

target class: [sysml_vocab:Expose](https://www.omg.org/spec/SysML/20230201/vocab#Expose)

definition of vocabulary class : <p>An Expose is an Import of Memberships into a ViewUsage that provide the Elements to be included in a view. Visibility is always ignored for an Expose (i.e., <code>isImportAll = true</code>).</p><br>isImportAll

description: <p>An Expose is an Import of Memberships into a ViewUsage that provide the Elements to be included in a view. Visibility is always ignored for an Expose (i.e., <code>isImportAll = true</code>).</p><br>isImportAll

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### ItemFlow

URI: https://www.omg.org/spec/SysML/20230201/shapes#ItemFlow

type: Shape

target class: [sysml_vocab:ItemFlow](https://www.omg.org/spec/SysML/20230201/vocab#ItemFlow)

definition of vocabulary class : <p>An ItemFlow is a Step that represents the transfer of objects or values from one Feature to another. ItemFlows can take non-zero time to complete.</p><br><br><p>An ItemFlow must be typed by the Interaction <em><code>Transfer</code></em> from the Kernel Semantic Library, or a specialization of it.</p><br><br>if itemFlowEnds->isEmpty() then<br>    specializesFromLibrary("Transfers::transfers")<br>else<br>    specializesFromLibrary("Transfers::flowTransfers")<br>endif

description: <p>An ItemFlow is a Step that represents the transfer of objects or values from one Feature to another. ItemFlows can take non-zero time to complete.</p><br><br><p>An ItemFlow must be typed by the Interaction <em><code>Transfer</code></em> from the Kernel Semantic Library, or a specialization of it.</p><br><br>if itemFlowEnds->isEmpty() then<br>    specializesFromLibrary("Transfers::transfers")<br>else<br>    specializesFromLibrary("Transfers::flowTransfers")<br>endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:itemType](https://www.omg.org/spec/SysML/20230201/vocab#itemType)| [0..*]| [sysml_vocab:Classifier](https://www.omg.org/spec/SysML/20230201/vocab#Classifier)| <p>The type of  items transferred, derived as the <code>type</code> of the <code>itemFeature</code> of the ItemFlow.</p><br><br>| <p>The type of  items transferred, derived as the <code>type</code> of the <code>itemFeature</code> of the ItemFlow.</p><br><br>|
| [sysml_vocab:targetInputFeature](https://www.omg.org/spec/SysML/20230201/vocab#targetInputFeature)| [0..1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Feature that receives the items carried by the ItemFlow. It must be an owned <code>output</code> of the target participant of the ItemFlow.</p>| <p>The Feature that receives the items carried by the ItemFlow. It must be an owned <code>output</code> of the target participant of the ItemFlow.</p>|
| [sysml_vocab:sourceOutputFeature](https://www.omg.org/spec/SysML/20230201/vocab#sourceOutputFeature)| [0..1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Feature that provides the items carried by the ItemFlow. It must be an owned <code>output</code> of the <code>source</code> of the ItemFlow.</p><br>| <p>The Feature that provides the items carried by the ItemFlow. It must be an owned <code>output</code> of the <code>source</code> of the ItemFlow.</p><br>|
| [sysml_vocab:itemFlowEnd](https://www.omg.org/spec/SysML/20230201/vocab#itemFlowEnd)| [0..*]| [sysml_vocab:ItemFlowEnd](https://www.omg.org/spec/SysML/20230201/vocab#ItemFlowEnd)| <p>The <code>connectorEnds</code> of this ItemFlow that are ItemFlowEnds.</p><br>| <p>The <code>connectorEnds</code> of this ItemFlow that are ItemFlowEnds.</p><br>|
| [sysml_vocab:itemFeature](https://www.omg.org/spec/SysML/20230201/vocab#itemFeature)| [0..1]| [sysml_vocab:ItemFeature](https://www.omg.org/spec/SysML/20230201/vocab#ItemFeature)| <p>The Feature of the ItemFlow that is an ItemFeature.</p><br>| <p>The Feature of the ItemFlow that is an ItemFeature.</p><br>|
| [sysml_vocab:interaction](https://www.omg.org/spec/SysML/20230201/vocab#interaction)| [0..*]| [sysml_vocab:Interaction](https://www.omg.org/spec/SysML/20230201/vocab#Interaction)| <p>The Interactions that type this ItemFlow. Interactions are both Associations and Behaviors, which can type Connectors and Steps, respectively.</p>| <p>The Interactions that type this ItemFlow. Interactions are both Associations and Behaviors, which can type Connectors and Steps, respectively.</p>|



### Dependency

URI: https://www.omg.org/spec/SysML/20230201/shapes#Dependency

type: Shape

target class: [sysml_vocab:Dependency](https://www.omg.org/spec/SysML/20230201/vocab#Dependency)

definition of vocabulary class : <p>A <code>Dependency</code> is a <code>Relationship</code> that indicates that one or more <code>client</code> <code>Elements</code> require one more <code>supplier</code> <code>Elements</code> for their complete specification. In general, this means that a change to one of the <code>supplier</code> <code>Elements</code> may necessitate a change to, or re-specification of, the <code>client</code> <code>Elements</code>.</p><br><br><p>Note that a <code>Dependency</code> is entirely a model-level <code>Relationship</code>, without instance-level semantics.</p>

description: <p>A <code>Dependency</code> is a <code>Relationship</code> that indicates that one or more <code>client</code> <code>Elements</code> require one more <code>supplier</code> <code>Elements</code> for their complete specification. In general, this means that a change to one of the <code>supplier</code> <code>Elements</code> may necessitate a change to, or re-specification of, the <code>client</code> <code>Elements</code>.</p><br><br><p>Note that a <code>Dependency</code> is entirely a model-level <code>Relationship</code>, without instance-level semantics.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:client](https://www.omg.org/spec/SysML/20230201/vocab#client)| [1..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <code>Element</code> or <code>Elements</code> dependent on the <code>supplier</code> <code>Elements</code>.</p>| <p>The <code>Element</code> or <code>Elements</code> dependent on the <code>supplier</code> <code>Elements</code>.</p>|
| [sysml_vocab:supplier](https://www.omg.org/spec/SysML/20230201/vocab#supplier)| [1..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <code>Element</code> or <code>Elements</code> on which the <code>client</code> <code>Elements</code> depend in some respect.</p>| <p>The <code>Element</code> or <code>Elements</code> on which the <code>client</code> <code>Elements</code> depend in some respect.</p>|



### PerformActionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#PerformActionUsage

type: Shape

target class: [sysml_vocab:PerformActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#PerformActionUsage)

definition of vocabulary class : <p>A <code>PerformActionUsage</code> is an <code>ActionUsage</code> that represents the performance of an <code>ActionUsage</code>. Unless it is the <code>PerformActionUsage</code> itself, the <code>ActionUsage</code> to be performed is related to the <code>PerformActionUsage</code> by a <code>ReferenceSubsetting</code> relationship. A <code>PerformActionUsage</code> is also an <code>EventOccurrenceUsage</code>, with its <code>performedAction</code> as the <code>eventOccurrence</code>.</p><br>ownedReferenceSubsetting <> null implies<br>    ownedReferenceSubsetting.referencedFeature.oclIsKindOf(ActionUsage)<br>owningType <> null and<br>(owningType.oclIsKindOf(PartDefinition) or<br> owningType.oclIsKindOf(PartUsage)) implies<br>    specializesFromLibrary('Parts::Part::performedActions')

description: <p>A <code>PerformActionUsage</code> is an <code>ActionUsage</code> that represents the performance of an <code>ActionUsage</code>. Unless it is the <code>PerformActionUsage</code> itself, the <code>ActionUsage</code> to be performed is related to the <code>PerformActionUsage</code> by a <code>ReferenceSubsetting</code> relationship. A <code>PerformActionUsage</code> is also an <code>EventOccurrenceUsage</code>, with its <code>performedAction</code> as the <code>eventOccurrence</code>.</p><br>ownedReferenceSubsetting <> null implies<br>    ownedReferenceSubsetting.referencedFeature.oclIsKindOf(ActionUsage)<br>owningType <> null and<br>(owningType.oclIsKindOf(PartDefinition) or<br> owningType.oclIsKindOf(PartUsage)) implies<br>    specializesFromLibrary('Parts::Part::performedActions')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:performedAction](https://www.omg.org/spec/SysML/20230201/vocab#performedAction)| [1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> to be performed by this <code>PerformedActionUsage</code>. It is the <code>eventOccurrence</code> of the <code>PerformActionUsage</code> considered as an <code>EventOccurrenceUsage</code>, which must be an <code>ActionUsage</code>.</p> <br>| <p>The <code>ActionUsage</code> to be performed by this <code>PerformedActionUsage</code>. It is the <code>eventOccurrence</code> of the <code>PerformActionUsage</code> considered as an <code>EventOccurrenceUsage</code>, which must be an <code>ActionUsage</code>.</p> <br>|



### MultiplicityRange

URI: https://www.omg.org/spec/SysML/20230201/shapes#MultiplicityRange

type: Shape

target class: [sysml_vocab:MultiplicityRange](https://www.omg.org/spec/SysML/20230201/vocab#MultiplicityRange)

definition of vocabulary class : <p>A MultiplicityRange is a Multiplicity whose value is defined to be the (inclusive) range of natural numbers given by the result of a <code>lowerBound</code> Expression and the result of an <code>upperBound</code> Expression. The result of the <code>lowerBound</code> Expression shall be of type <em>Natural</em>, while the result of the <code>upperBound</code> Expression shall be of type <em>UnlimitedNatural</em>. If the result of the <code>upperBound</code> Expression is the unbounded value <code>*</code>, then the specified range includes all natural numbers greater than or equal to the <code>lowerBound</code> value.</p><br><br>bound->forAll(b | b.featuringType = self.featuringType)

description: <p>A MultiplicityRange is a Multiplicity whose value is defined to be the (inclusive) range of natural numbers given by the result of a <code>lowerBound</code> Expression and the result of an <code>upperBound</code> Expression. The result of the <code>lowerBound</code> Expression shall be of type <em>Natural</em>, while the result of the <code>upperBound</code> Expression shall be of type <em>UnlimitedNatural</em>. If the result of the <code>upperBound</code> Expression is the unbounded value <code>*</code>, then the specified range includes all natural numbers greater than or equal to the <code>lowerBound</code> value.</p><br><br>bound->forAll(b | b.featuringType = self.featuringType)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:lowerBound](https://www.omg.org/spec/SysML/20230201/vocab#lowerBound)| [0..1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The Expression whose result provides the lower bound of MultiplicityRange. If no <code>lowerBound</code> Expression is given, then the lower bound shall have the same value as the upper bound, unless the upper bound is unbounded (<code>*</code>), in which case the lower bound shall be 0.</p><br>| <p>The Expression whose result provides the lower bound of MultiplicityRange. If no <code>lowerBound</code> Expression is given, then the lower bound shall have the same value as the upper bound, unless the upper bound is unbounded (<code>*</code>), in which case the lower bound shall be 0.</p><br>|
| [sysml_vocab:upperBound](https://www.omg.org/spec/SysML/20230201/vocab#upperBound)| [1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| The Expression whose result is the upper bound of the MultiplicityRange.| The Expression whose result is the upper bound of the MultiplicityRange.|
| [sysml_vocab:bound](https://www.omg.org/spec/SysML/20230201/vocab#bound)| [1..*]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The bound Expressions of the MultiplicityRange. These shall be the only <code>ownedMembers</code> of the MultiplicityRange.</p>| <p>The bound Expressions of the MultiplicityRange. These shall be the only <code>ownedMembers</code> of the MultiplicityRange.</p>|



### ItemUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ItemUsage

type: Shape

target class: [sysml_vocab:ItemUsage](https://www.omg.org/spec/SysML/20230201/vocab#ItemUsage)

definition of vocabulary class : <p>An <code>ItemUsage</code> is a <code>ItemUsage</code> whose <code>definition</code> is a <code>Structure</code>. Nominally, if the <code>definition</code> is an <code>ItemDefinition</code>, an <code>ItemUsage</code> is a <code>ItemUsage</code> of that <code>ItemDefinition</code> within a system. However, other kinds of Kernel <code>Structures</code> are also allowed, to permit use of <code>Structures</code> from the Kernel Model Libraries.</p><br><br><p>An <code>ItemUsage</code> must specialize, directly or indirectly, the base <code>ItemUsage</code> <em><code>items</code></em> from the Systems Model Library.</p><br>itemDefinition = occurrenceDefinition->selectByKind(ItemDefinition)<br>specializesFromLibrary("Items::items")<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(ItemDefinition) or<br> owningType.oclIsKindOf(ItemUsage)) implies<br>    specializesFromLibrary("Items::Item::subitem")

description: <p>An <code>ItemUsage</code> is a <code>ItemUsage</code> whose <code>definition</code> is a <code>Structure</code>. Nominally, if the <code>definition</code> is an <code>ItemDefinition</code>, an <code>ItemUsage</code> is a <code>ItemUsage</code> of that <code>ItemDefinition</code> within a system. However, other kinds of Kernel <code>Structures</code> are also allowed, to permit use of <code>Structures</code> from the Kernel Model Libraries.</p><br><br><p>An <code>ItemUsage</code> must specialize, directly or indirectly, the base <code>ItemUsage</code> <em><code>items</code></em> from the Systems Model Library.</p><br>itemDefinition = occurrenceDefinition->selectByKind(ItemDefinition)<br>specializesFromLibrary("Items::items")<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(ItemDefinition) or<br> owningType.oclIsKindOf(ItemUsage)) implies<br>    specializesFromLibrary("Items::Item::subitem")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:itemDefinition](https://www.omg.org/spec/SysML/20230201/vocab#itemDefinition)| [0..*]| [sysml_vocab:Structure](https://www.omg.org/spec/SysML/20230201/vocab#Structure)| <p>The Structures that are the <code>definitions</code> of this ItemUsage. Nominally, these are ItemDefinitions, but other kinds of Kernel Structures are also allowed, to permit use of Structures from the Kernel Library.</p>| <p>The Structures that are the <code>definitions</code> of this ItemUsage. Nominally, these are ItemDefinitions, but other kinds of Kernel Structures are also allowed, to permit use of Structures from the Kernel Library.</p>|



### Structure

URI: https://www.omg.org/spec/SysML/20230201/shapes#Structure

type: Shape

target class: [sysml_vocab:Structure](https://www.omg.org/spec/SysML/20230201/vocab#Structure)

definition of vocabulary class : <p>A Structure is a Class of objects in the modeled universe that are primarily structural in nature. While an Object is not itself behavioral, it may be involved in and acted on by Behaviors, and it may be the performer of some of them.</p><br><br>specializesFromLibrary('Objects::Object')

description: <p>A Structure is a Class of objects in the modeled universe that are primarily structural in nature. While an Object is not itself behavioral, it may be involved in and acted on by Behaviors, and it may be the performer of some of them.</p><br><br>specializesFromLibrary('Objects::Object')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### FeatureReferenceExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#FeatureReferenceExpression

type: Shape

target class: [sysml_vocab:FeatureReferenceExpression](https://www.omg.org/spec/SysML/20230201/vocab#FeatureReferenceExpression)

definition of vocabulary class : <p>A FeatureReferenceExpression is an Expression whose <code>result</code> is bound a <code>referent</code> Feature. The only <code>members</code> allowed for a FeatureReferenceExpression are the <code>referent</code>, the <code>result</code> and the BindingConnector between them.</p>

description: <p>A FeatureReferenceExpression is an Expression whose <code>result</code> is bound a <code>referent</code> Feature. The only <code>members</code> allowed for a FeatureReferenceExpression are the <code>referent</code>, the <code>result</code> and the BindingConnector between them.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:referent](https://www.omg.org/spec/SysML/20230201/vocab#referent)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> whose value is to be set.</p>| <p>The Feature that is referenced by this FeatureReferenceExpression, derived as its first <code>member</code> Feature.</p>|



### AnalysisCaseUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#AnalysisCaseUsage

type: Shape

target class: [sysml_vocab:AnalysisCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#AnalysisCaseUsage)

definition of vocabulary class : <p>An AnalysisCaseUsage is a Usage of an AnalysisCaseDefinition.</p><br><br><p>An AnalysisCaseUsage must subset, directly or indirectly, either the base AnalysisCaseUsage <code>analysisCases</code> from the Systems model library, if it is not owned by an AnalysisCaseDefinition or AnalysisCaseUsage, or the AnalysisCaseUsage <code>subAnalysisCases</code> inherited from its owner, otherwise.</p>

description: <p>An AnalysisCaseUsage is a Usage of an AnalysisCaseDefinition.</p><br><br><p>An AnalysisCaseUsage must subset, directly or indirectly, either the base AnalysisCaseUsage <code>analysisCases</code> from the Systems model library, if it is not owned by an AnalysisCaseDefinition or AnalysisCaseUsage, or the AnalysisCaseUsage <code>subAnalysisCases</code> inherited from its owner, otherwise.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:analysisAction](https://www.omg.org/spec/SysML/20230201/vocab#analysisAction)| [0..*]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>features</code> of the AnalysisCaseUsage that are typed as AnalysisActions. Each <code>analysisAction</code> ActionUsage must subset the <code>analysisSteps</code> ActionUsage of the base AnalysisCaseDefinition AnalysisCase from the Systems model library.</p><br>| <p>The <code>features</code> of the AnalysisCaseUsage that are typed as AnalysisActions. Each <code>analysisAction</code> ActionUsage must subset the <code>analysisSteps</code> ActionUsage of the base AnalysisCaseDefinition AnalysisCase from the Systems model library.</p><br>|
| [sysml_vocab:analysisCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#analysisCaseDefinition)| [0..1]| [sysml_vocab:AnalysisCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#AnalysisCaseDefinition)| <p>The AnalysisCaseDefinition that is the type of this AnalysisCaseUsage.</p>| <p>The AnalysisCaseDefinition that is the type of this AnalysisCaseUsage.</p>|
| [sysml_vocab:resultExpression](https://www.omg.org/spec/SysML/20230201/vocab#resultExpression)| [0..1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The Expression used to compute the <code>result</code> of the AnalysisCaseUsage, derived as the Expression owned via a ResultExpressionMembership. The <code>resultExpression</code> must redefine directly or indirectly, the <code>resultEvaluation</code> Expression of the base AnalysisCaseDefinition AnalysisCase from the Systems model library.</p><br>| <p>The Expression used to compute the <code>result</code> of the AnalysisCaseUsage, derived as the Expression owned via a ResultExpressionMembership. The <code>resultExpression</code> must redefine directly or indirectly, the <code>resultEvaluation</code> Expression of the base AnalysisCaseDefinition AnalysisCase from the Systems model library.</p><br>|



### Classifier

URI: https://www.omg.org/spec/SysML/20230201/shapes#Classifier

type: Shape

target class: [sysml_vocab:Classifier](https://www.omg.org/spec/SysML/20230201/vocab#Classifier)

definition of vocabulary class : <p>A Classifier is a Type for model elements that classify:</p><br><br><ul><br>	<li>Things&nbsp;(in the universe) regardless of how Features relate them.&nbsp; These are&nbsp;sequences of exactly one&nbsp;thing (sequence of length 1).</li><br>	<li>How the above&nbsp;things are related by Features. These are sequences of multiple things (length &gt; 1).</li><br></ul><br><br><p>Classifiers that classify relationships (sequence length &gt; 1) must also classify the things at the end of those&nbsp;sequences (sequence length =1).&nbsp; Because of this, Classifiers specializing Features cannot classify anything (any sequences).</p><br><br>ownedSubclassification = <br>    ownedSpecialization->selectByKind(Superclassification)<br>multiplicity <> null implies multiplicity.featuringType->isEmpty()

description: <p>A Classifier is a Type for model elements that classify:</p><br><br><ul><br>	<li>Things&nbsp;(in the universe) regardless of how Features relate them.&nbsp; These are&nbsp;sequences of exactly one&nbsp;thing (sequence of length 1).</li><br>	<li>How the above&nbsp;things are related by Features. These are sequences of multiple things (length &gt; 1).</li><br></ul><br><br><p>Classifiers that classify relationships (sequence length &gt; 1) must also classify the things at the end of those&nbsp;sequences (sequence length =1).&nbsp; Because of this, Classifiers specializing Features cannot classify anything (any sequences).</p><br><br>ownedSubclassification = <br>    ownedSpecialization->selectByKind(Superclassification)<br>multiplicity <> null implies multiplicity.featuringType->isEmpty()

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:ownedSubclassification](https://www.omg.org/spec/SysML/20230201/vocab#ownedSubclassification)| [0..*]| [sysml_vocab:Subclassification](https://www.omg.org/spec/SysML/20230201/vocab#Subclassification)| <p>The <code>ownedSpecializations</code> of this Classifier that are Subclassifications, for which this Classifier is the <code>subclassifier</code>.</p><br>| <p>The <code>ownedSpecializations</code> of this Classifier that are Subclassifications, for which this Classifier is the <code>subclassifier</code>.</p><br>|



### Membership

URI: https://www.omg.org/spec/SysML/20230201/shapes#Membership

type: Shape

target class: [sysml_vocab:Membership](https://www.omg.org/spec/SysML/20230201/vocab#Membership)

definition of vocabulary class : <p>Membership is a Relationship between a Namespace and an Element that indicates the Element is a <code>member</code> of (i.e., is contained in) the Namespace. Any <code>memberNames</code> specify how the <code>memberElement</code> is identified in the Namespace and the <code>visibility</code> specifies whether or not the <code>memberElement</code> is publicly visible from outside the Namespace.</p><br><br><p>If a Membership is an OwningMembership, then it owns its <code>memberElement</code>, which becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code>. Otherwise, the <code>memberNames</code> of a Membership are effectively aliases within the <code>membershipOwningNamespace</code> for an Element with a separate OwningMembership in the same or a different Namespace.<p><br>

description: <p>Membership is a Relationship between a Namespace and an Element that indicates the Element is a <code>member</code> of (i.e., is contained in) the Namespace. Any <code>memberNames</code> specify how the <code>memberElement</code> is identified in the Namespace and the <code>visibility</code> specifies whether or not the <code>memberElement</code> is publicly visible from outside the Namespace.</p><br><br><p>If a Membership is an OwningMembership, then it owns its <code>memberElement</code>, which becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code>. Otherwise, the <code>memberNames</code> of a Membership are effectively aliases within the <code>membershipOwningNamespace</code> for an Element with a separate OwningMembership in the same or a different Namespace.<p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:memberElementId](https://www.omg.org/spec/SysML/20230201/vocab#memberElementId)| [1]| String| <p>The <code>elementId</code> of the <code>memberElement</code>.</p>| <p>The <code>elementId</code> of the <code>memberElement</code>.</p>|
| [sysml_vocab:memberShortName](https://www.omg.org/spec/SysML/20230201/vocab#memberShortName)| [0..1]| String| <p>The short name of the <code>memberElement</code> relative to the <code>membershipOwningNamespace</code>.</p>| <p>The short name of the <code>memberElement</code> relative to the <code>membershipOwningNamespace</code>.</p>|
| [sysml_vocab:memberName](https://www.omg.org/spec/SysML/20230201/vocab#memberName)| [0..1]| String| <p>The name of the <code>memberElement</code> relative to the <code>membershipOwningNamespace</code>.</p><br>| <p>The name of the <code>memberElement</code> relative to the <code>membershipOwningNamespace</code>.</p><br>|
| [sysml_vocab:visibility](https://www.omg.org/spec/SysML/20230201/vocab#visibility)| [1]| String| <p>The visibility level of the imported <code>members</code> from this Import relative to the <code>importOwningNamespace</code>.</p><br>| <p>Whether or not the Membership of the <code>memberElement</code> in the <code>membershipOwningNamespace</code> is publicly visible outside that Namespace.</p><br>|
| [sysml_vocab:membershipOwningNamespace](https://www.omg.org/spec/SysML/20230201/vocab#membershipOwningNamespace)| [1]| [sysml_vocab:Namespace](https://www.omg.org/spec/SysML/20230201/vocab#Namespace)| <p>The Namespace of which the <code>memberElement</code> becomes a <cpde>member</code> due to this Membership.</p><br>| <p>The Namespace of which the <code>memberElement</code> becomes a <cpde>member</code> due to this Membership.</p><br>|
| [sysml_vocab:memberElement](https://www.omg.org/spec/SysML/20230201/vocab#memberElement)| [1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The Element that becomes a <code>member</code> of the <code>membershipOwningNamespace</code> due to this Membership.</p><br>| <p>The Element that becomes a <code>member</code> of the <code>membershipOwningNamespace</code> due to this Membership.</p><br>|



### Annotation

URI: https://www.omg.org/spec/SysML/20230201/shapes#Annotation

type: Shape

target class: [sysml_vocab:Annotation](https://www.omg.org/spec/SysML/20230201/vocab#Annotation)

definition of vocabulary class : <p>An Annotation is a Relationship between an AnnotatingElement and the Element that is annotated by that AnnotatingElement.</p><br>

description: <p>An Annotation is a Relationship between an AnnotatingElement and the Element that is annotated by that AnnotatingElement.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:annotatedElement](https://www.omg.org/spec/SysML/20230201/vocab#annotatedElement)| [1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The Elements that are annotated by this AnnotatingElement. If <code>annotation</code<> is not empty, this is derived as the <code>annotatedElements</code> of the <code>annotations</code>. If <code>annotation</code>, then it is derived as the <code>owningNamespace</code> of the AnnotatingElement.</p><br>| <p>The Element that is annotated by the <code>annotatingElement</code> of this Annotation.</p>|
| [sysml_vocab:owningAnnotatedElement](https://www.omg.org/spec/SysML/20230201/vocab#owningAnnotatedElement)| [0..1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <code>annotatedElement</code> of this Annotation, when it is also its <code>owningRelatedElement</code>.| <p>The <code>annotatedElement</code> of this Annotation, when it is also its <code>owningRelatedElement</code>.|
| [sysml_vocab:annotatingElement](https://www.omg.org/spec/SysML/20230201/vocab#annotatingElement)| [1]| [sysml_vocab:AnnotatingElement](https://www.omg.org/spec/SysML/20230201/vocab#AnnotatingElement)| <p>The AnnotatingElement that annotates the <code>annotatedElement</code> of this Annotation.</p><br>| <p>The AnnotatingElement that annotates the <code>annotatedElement</code> of this Annotation.</p><br>|



### Specialization

URI: https://www.omg.org/spec/SysML/20230201/shapes#Specialization

type: Shape

target class: [sysml_vocab:Specialization](https://www.omg.org/spec/SysML/20230201/vocab#Specialization)

definition of vocabulary class : <p>Specialization is a Relationship between two Types that requires all instances of the <code>specific</code> type to also be instances of the <code>general</code> Type (i.e., the set of instances of the <code>specific</code> Type is a <em>subset</em> of those of the <code>general</code> Type, which might be the same set).</p><br><br>not specific.isConjugated

description: <p>Specialization is a Relationship between two Types that requires all instances of the <code>specific</code> type to also be instances of the <code>general</code> Type (i.e., the set of instances of the <code>specific</code> Type is a <em>subset</em> of those of the <code>general</code> Type, which might be the same set).</p><br><br>not specific.isConjugated

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:general](https://www.omg.org/spec/SysML/20230201/vocab#general)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>A Type with a superset of all instances of the <code>specific</code> Type, which might be the same set.</p><br>| <p>A Type with a superset of all instances of the <code>specific</code> Type, which might be the same set.</p><br>|
| [sysml_vocab:specific](https://www.omg.org/spec/SysML/20230201/vocab#specific)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>A Type with a subset of all instances of the <code>general</code> Type, which might be the same set.</p><br>| <p>A Type with a subset of all instances of the <code>general</code> Type, which might be the same set.</p><br>|
| [sysml_vocab:owningType](https://www.omg.org/spec/SysML/20230201/vocab#owningType)| [0..1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The Type that is the <code>specific</code> Type of this Specialization and owns it as its <code>owningRelatedElement</code>.</p>| <p>The Type that is the <code>specific</code> Type of this Specialization and owns it as its <code>owningRelatedElement</code>.</p>|



### RequirementUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#RequirementUsage

type: Shape

target class: [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)

definition of vocabulary class : <p>A RequirementUsage is a Usage of a RequirementDefinition.</p><br><br><p>A RequirementUsage must subset, directly or indirectly, the base RequirementUsage <em><code>requirementChecks</code></em> from the Systems model library.</p>

description: <p>A RequirementUsage is a Usage of a RequirementDefinition.</p><br><br><p>A RequirementUsage must subset, directly or indirectly, the base RequirementUsage <em><code>requirementChecks</code></em> from the Systems model library.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:reqId](https://www.omg.org/spec/SysML/20230201/vocab#reqId)| [0..1]| String| <p>An optional modeler-specified identifier for this RequirementUsage (used, e.g., to link it to an original requirement text in some source document), derived as the <code>modeledId</code> for the RequirementUsage.</p>| <p>An optional modeler-specified identifier for this RequirementUsage (used, e.g., to link it to an original requirement text in some source document), derived as the <code>modeledId</code> for the RequirementUsage.</p>|
| [sysml_vocab:text](https://www.omg.org/spec/SysML/20230201/vocab#text)| [0..*]| String| <p>An optional textual statement of the requirement represented by this RequirementUsage, derived as the <code>bodies<code> of the <code>documentaryComments</code> of the RequirementDefinition.</p>| <p>An optional textual statement of the requirement represented by this RequirementUsage, derived as the <code>bodies<code> of the <code>documentaryComments</code> of the RequirementDefinition.</p>|
| [sysml_vocab:requirementDefinition](https://www.omg.org/spec/SysML/20230201/vocab#requirementDefinition)| [0..1]| [sysml_vocab:RequirementDefinition](https://www.omg.org/spec/SysML/20230201/vocab#RequirementDefinition)| <p>The RequirementDefinition that is the single type of this RequirementUsage.</p>| <p>The RequirementDefinition that is the single type of this RequirementUsage.</p>|
| [sysml_vocab:requiredConstraint](https://www.omg.org/spec/SysML/20230201/vocab#requiredConstraint)| [0..*]| [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)| <p>The owned ConstraintUsages that represent requirements of this RequirementUsage, derived as the <code>ownedConstraints</code> of the <code>RequirementConstraintMemberships</code> of the RequirementUsage with <code>kind</code> = <code>requirement</code>.</p>| <p>The owned ConstraintUsages that represent requirements of this RequirementUsage, derived as the <code>ownedConstraints</code> of the <code>RequirementConstraintMemberships</code> of the RequirementUsage with <code>kind</code> = <code>requirement</code>.</p>|
| [sysml_vocab:assumedConstraint](https://www.omg.org/spec/SysML/20230201/vocab#assumedConstraint)| [0..*]| [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)| <p>The owned ConstraintUsages that represent assumptions of this RequirementUsage, derived as the <code>ownedConstraints</code> of the <code>RequirementConstraintMemberships</code> of the RequirementUsage with <code>kind</code> = <code>assumption</code>.</p>| <p>The owned ConstraintUsages that represent assumptions of this RequirementUsage, derived as the <code>ownedConstraints</code> of the <code>RequirementConstraintMemberships</code> of the RequirementUsage with <code>kind</code> = <code>assumption</code>.</p>|
| [sysml_vocab:subjectParameter](https://www.omg.org/spec/SysML/20230201/vocab#subjectParameter)| [1]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>parameter</code> of this RequirementUsage that is owned via a SubjectMembership, which must redefine, directly or indirectly, the <code>subject</code> parameter of the base RequirementDefinition RequirementCheck from the Systems model library.</p>| <p>The <code>parameter</code> of this RequirementUsage that is owned via a SubjectMembership, which must redefine, directly or indirectly, the <code>subject</code> parameter of the base RequirementDefinition RequirementCheck from the Systems model library.</p>|
| [sysml_vocab:framedConcern](https://www.omg.org/spec/SysML/20230201/vocab#framedConcern)| [0..*]| [sysml_vocab:ConcernUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConcernUsage)| <p>The Concerns framed by this RequirementUsage, derived as the <code>ownedConcerns</code> of all <code>FramedConcernMemberships</code> of the RequirementUsage.</p>| <p>The Concerns framed by this RequirementUsage, derived as the <code>ownedConcerns</code> of all <code>FramedConcernMemberships</code> of the RequirementUsage.</p>|
| [sysml_vocab:actorParameter](https://www.omg.org/spec/SysML/20230201/vocab#actorParameter)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The <code>parameters</code> of this RequirementUsage that are owned via ActorMemberships, which must subset, directly or indirectly, the PartUsage <em><code>actors</code></em> of the base RequirementDefinition <em>RequirementCheck</em> from the Systems model library.</p>| <p>The <code>parameters</code> of this RequirementUsage that are owned via ActorMemberships, which must subset, directly or indirectly, the PartUsage <em><code>actors</code></em> of the base RequirementDefinition <em>RequirementCheck</em> from the Systems model library.</p>|
| [sysml_vocab:stakeholderParameter](https://www.omg.org/spec/SysML/20230201/vocab#stakeholderParameter)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The <code>parameters</code> of this RequirementUsage that are owned via StakeholderMemberships, which must subset, directly or indirectly, the PartUsage <em><code>stakeholders</code></em> of the base RequirementDefinition <em>RequirementCheck</em> from the Systems model library.</p>| <p>The <code>parameters</code> of this RequirementUsage that are owned via StakeholderMemberships, which must subset, directly or indirectly, the PartUsage <em><code>stakeholders</code></em> of the base RequirementDefinition <em>RequirementCheck</em> from the Systems model library.</p>|



### TransitionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#TransitionUsage

type: Shape

target class: [sysml_vocab:TransitionUsage](https://www.omg.org/spec/SysML/20230201/vocab#TransitionUsage)

definition of vocabulary class : <p>A <code>TransitionUsage</code> is an <code>ActionUsage<code> representing a triggered transition between <code>ActionUsages</code> or <code>StateUsages</code>. When triggered by a <code>triggerAction</code>, when its <code>guardExpression</code> is true, the <code>TransitionUsage</code> asserts that its <code>source</code> is exited, then its <code>effectAction</code> (if any) is performed, and then its <code>target</code> is entered.</p><br><br><p>A <code>TransitionUsage<code> can be related to some of its <code>ownedFeatures</code> using <code>TransitionFeatureMembership</code> <code>Relationships</code>, corresponding to the <code>triggerAction</code>, <code>guardExpression</code> and <code>effectAction</code> of the <code>TransitionUsage</code>.</p><br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(ActionDefinition) or <br> owningType.oclIsKindOf(ActionUsage)) and<br>not (owningType.oclIsKindOf(StateDefinition) or<br>     owningType.oclIsKindOf(StateUsage)) implies<br>    specializesFromLibrary("Actions::Action::decisionTransitionActions")<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(StateDefinition) or<br> owningType.oclIsKindOf(StateUsage)) implies<br>    specializesFromLibrary("States::State::stateTransitions")<br>specializesFromLibrary("Actions::actions::transitionActions")<br>source =<br>    if ownedMembership->isEmpty() then null<br>    else<br>        let member : Element = <br>            ownedMembership->at(1).memberElement in <br>        if not member.oclIsKindOf(ActionUsage) then null<br>        else member.oclAsKindOf(ActionUsage)<br>        endif<br>    endif<br>target =<br>    if succession.targetFeature->isEmpty() then null<br>    else<br>        let targetFeature : Feature = <br>            succession.targetFeature->at(1) in<br>        if not targetFeature.oclIsKindOf(ActionUsage) then null<br>        else targetFeature.oclAsType(ActionUsage)<br>        endif<br>    endif<br>triggerAction = ownedFeatureMembership-><br>    selectByKind(TransitionFeatureMembership)-><br>    select(kind = TransitionFeatureKind::trigger).transitionFeature-><br>    selectByKind(AcceptActionUsage)<br>let successions : Sequence(Successions) = <br>    ownedMember->selectByKind(Succession) in<br>successions->notEmpty() and<br>successions->at(1).targetFeature-><br>    forAll(oclIsKindOf(ActionUsage))<br>guardExpression = ownedFeatureMembership-><br>    selectByKind(TransitionFeatureMembership)-><br>    select(kind = TransitionFeatureKind::trigger).transitionFeature-><br>    selectByKind(Expression)<br>triggerAction->forAll(specializesFromLibrary('Actions::TransitionAction::accepter') and<br>guardExpression->forAll(specializesFromLibrary('Actions::TransitionAction::guard') and<br>effectAction->forAll(specializesFromLibrary('Actions::TransitionAction::effect'))<br>triggerAction = ownedFeatureMembership-><br>    selectByKind(TransitionFeatureMembership)-><br>    select(kind = TransitionFeatureKind::trigger).transitionFeatures-><br>    selectByKind(AcceptActionUsage)<br>succession.sourceFeature = source<br>ownedMember->selectByKind(BindingConnector)->exists(b |<br>    b.relatedFeatures->includes(source) and<br>    b.relatedFeatures->includes(inputParameter(2)))<br>triggerAction->notEmpty() implies<br>    let payloadParameter : Feature = inputParameter(2) in<br>    payloadParameter <> null and<br>    payloadParameter.subsetsChain(triggerAction->at(1), triggerPayloadParameter())<br>ownedMember->selectByKind(BindingConnector)->exists(b |<br>    b.relatedFeatures->includes(succession) and<br>    b.relatedFeatures->includes(resolveGlobal(<br>        'TransitionPerformances::TransitionPerformance::transitionLink')))<br>if triggerAction->isEmpty() then<br>    inputParameters()->size() >= 1<br>else<br>    inputParameters()->size() >= 2<br>endif<br>    <br>succession = ownedMember->selectByKind(Succession)->at(1)

description: <p>A <code>TransitionUsage</code> is an <code>ActionUsage<code> representing a triggered transition between <code>ActionUsages</code> or <code>StateUsages</code>. When triggered by a <code>triggerAction</code>, when its <code>guardExpression</code> is true, the <code>TransitionUsage</code> asserts that its <code>source</code> is exited, then its <code>effectAction</code> (if any) is performed, and then its <code>target</code> is entered.</p><br><br><p>A <code>TransitionUsage<code> can be related to some of its <code>ownedFeatures</code> using <code>TransitionFeatureMembership</code> <code>Relationships</code>, corresponding to the <code>triggerAction</code>, <code>guardExpression</code> and <code>effectAction</code> of the <code>TransitionUsage</code>.</p><br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(ActionDefinition) or <br> owningType.oclIsKindOf(ActionUsage)) and<br>not (owningType.oclIsKindOf(StateDefinition) or<br>     owningType.oclIsKindOf(StateUsage)) implies<br>    specializesFromLibrary("Actions::Action::decisionTransitionActions")<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(StateDefinition) or<br> owningType.oclIsKindOf(StateUsage)) implies<br>    specializesFromLibrary("States::State::stateTransitions")<br>specializesFromLibrary("Actions::actions::transitionActions")<br>source =<br>    if ownedMembership->isEmpty() then null<br>    else<br>        let member : Element = <br>            ownedMembership->at(1).memberElement in <br>        if not member.oclIsKindOf(ActionUsage) then null<br>        else member.oclAsKindOf(ActionUsage)<br>        endif<br>    endif<br>target =<br>    if succession.targetFeature->isEmpty() then null<br>    else<br>        let targetFeature : Feature = <br>            succession.targetFeature->at(1) in<br>        if not targetFeature.oclIsKindOf(ActionUsage) then null<br>        else targetFeature.oclAsType(ActionUsage)<br>        endif<br>    endif<br>triggerAction = ownedFeatureMembership-><br>    selectByKind(TransitionFeatureMembership)-><br>    select(kind = TransitionFeatureKind::trigger).transitionFeature-><br>    selectByKind(AcceptActionUsage)<br>let successions : Sequence(Successions) = <br>    ownedMember->selectByKind(Succession) in<br>successions->notEmpty() and<br>successions->at(1).targetFeature-><br>    forAll(oclIsKindOf(ActionUsage))<br>guardExpression = ownedFeatureMembership-><br>    selectByKind(TransitionFeatureMembership)-><br>    select(kind = TransitionFeatureKind::trigger).transitionFeature-><br>    selectByKind(Expression)<br>triggerAction->forAll(specializesFromLibrary('Actions::TransitionAction::accepter') and<br>guardExpression->forAll(specializesFromLibrary('Actions::TransitionAction::guard') and<br>effectAction->forAll(specializesFromLibrary('Actions::TransitionAction::effect'))<br>triggerAction = ownedFeatureMembership-><br>    selectByKind(TransitionFeatureMembership)-><br>    select(kind = TransitionFeatureKind::trigger).transitionFeatures-><br>    selectByKind(AcceptActionUsage)<br>succession.sourceFeature = source<br>ownedMember->selectByKind(BindingConnector)->exists(b |<br>    b.relatedFeatures->includes(source) and<br>    b.relatedFeatures->includes(inputParameter(2)))<br>triggerAction->notEmpty() implies<br>    let payloadParameter : Feature = inputParameter(2) in<br>    payloadParameter <> null and<br>    payloadParameter.subsetsChain(triggerAction->at(1), triggerPayloadParameter())<br>ownedMember->selectByKind(BindingConnector)->exists(b |<br>    b.relatedFeatures->includes(succession) and<br>    b.relatedFeatures->includes(resolveGlobal(<br>        'TransitionPerformances::TransitionPerformance::transitionLink')))<br>if triggerAction->isEmpty() then<br>    inputParameters()->size() >= 1<br>else<br>    inputParameters()->size() >= 2<br>endif<br>    <br>succession = ownedMember->selectByKind(Succession)->at(1)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:source](https://www.omg.org/spec/SysML/20230201/vocab#source)| [1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>relatedElements</c ode> from which this Relationship is considered to be directed.</p>| <p>The source <code>ActionUsage</code> of this <code>TransitionUsage</code>, which becomes the <code>source</code> of the <code>succession</code> for the <code>TransitionUsage</code>.</p>|
| [sysml_vocab:target](https://www.omg.org/spec/SysML/20230201/vocab#target)| [1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>relatedElements</code> to which this Relationship is considered to be directed.</p><br>| <p>The target <code>ActionUsage</code> of this <code>TransitionUsage<code>, which is the <code>targetFeature</code> of the <code>succession</code> for the <code>TransitionUsage</code>.</p>|
| [sysml_vocab:triggerAction](https://www.omg.org/spec/SysML/20230201/vocab#triggerAction)| [0..*]| [sysml_vocab:AcceptActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#AcceptActionUsage)| <p>The <code>AcceptActionUsages</code> that define the triggers of this <code>TransitionUsage</code>, which are the <code>ownedFeatures</code> of the <code>TransitionUsage</code> related to it by <code>TransitionFeatureMemberships</code> with <code>kind = trigger</code>, which must all be <code>AcceptActionUsages</code>.</p>| <p>The <code>AcceptActionUsages</code> that define the triggers of this <code>TransitionUsage</code>, which are the <code>ownedFeatures</code> of the <code>TransitionUsage</code> related to it by <code>TransitionFeatureMemberships</code> with <code>kind = trigger</code>, which must all be <code>AcceptActionUsages</code>.</p>|
| [sysml_vocab:guardExpression](https://www.omg.org/spec/SysML/20230201/vocab#guardExpression)| [0..*]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>Expressions that must evaluate to true before the <code>transitionStep</code> can occur.</p><br>| <p>The <code>Expressions</code> that define the guards of this <code>TransitionUsage</code>, which are the <code>ownedFeatures</code> of the <code>TransitionUsage</code> related to it by <code>TransitionFeatureMemberships</code> with <code>kind = guard</code>, which must all be <code>Expressions</code>.</p>|
| [sysml_vocab:effectAction](https://www.omg.org/spec/SysML/20230201/vocab#effectAction)| [0..*]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsages</code> that define the effects of this <code>TransitionUsage</code>, which are the <code>ownedFeatures</code> of the <code>TransitionUsage</code> related to it by <code>TransitionFeatureMemberships</code> with <code>kind = effect</code>, which must all be <code>Expressions</code>.</p>| <p>The <code>ActionUsages</code> that define the effects of this <code>TransitionUsage</code>, which are the <code>ownedFeatures</code> of the <code>TransitionUsage</code> related to it by <code>TransitionFeatureMemberships</code> with <code>kind = effect</code>, which must all be <code>Expressions</code>.</p>|
| [sysml_vocab:succession](https://www.omg.org/spec/SysML/20230201/vocab#succession)| [1]| [sysml_vocab:Succession](https://www.omg.org/spec/SysML/20230201/vocab#Succession)| <p>The <code>Succession</code> that is the <code>ownedFeature</code> of this <code>TransitionUsage</code>, which, if the <code>TransitionUsage</code> is triggered, asserts the temporal ordering of the <code>source</code> and <code>target</code>.</p>| <p>The <code>Succession</code> that is the <code>ownedFeature</code> of this <code>TransitionUsage</code>, which, if the <code>TransitionUsage</code> is triggered, asserts the temporal ordering of the <code>source</code> and <code>target</code>.</p>|



### FeatureChainExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#FeatureChainExpression

type: Shape

target class: [sysml_vocab:FeatureChainExpression](https://www.omg.org/spec/SysML/20230201/vocab#FeatureChainExpression)

definition of vocabulary class : <p>A FeatureChainExpression is an OperatorExpression whose operator is <code>"."</code>, which resolves to the library Function <em><code>ControlFunctions::'.'</code></em>. It evaluates to the result of chaining the <code>result</code> Feature of its single <code>argument</code> Expression with its <code>targetFeature</code>.</p><br><br><p>The first two <code>members</code> of a FeatureChainExpression must be its single <code>argument</code> Expression and its <code>targetFeature</code>. Its only other <code>members</code> shall be those necessary to complete it as an InvocationExpression.</p>

description: <p>A FeatureChainExpression is an OperatorExpression whose operator is <code>"."</code>, which resolves to the library Function <em><code>ControlFunctions::'.'</code></em>. It evaluates to the result of chaining the <code>result</code> Feature of its single <code>argument</code> Expression with its <code>targetFeature</code>.</p><br><br><p>The first two <code>members</code> of a FeatureChainExpression must be its single <code>argument</code> Expression and its <code>targetFeature</code>. Its only other <code>members</code> shall be those necessary to complete it as an InvocationExpression.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:targetFeature](https://www.omg.org/spec/SysML/20230201/vocab#targetFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The target <code>relatedFeatures</code> for this Connector. This includes all the <code>relatedFeatures</code> other than the <code>sourceFeature</code>.</p>| <p>The Feature that is accessed by this FeatureChainExpression, derived as its second <code>member</code> Feature (the first being its one <code>argument</code> Expression). This Feature must redefine the <em><code>target</code> Feature of the Function <em><code>ControlFunctions::'.'</code></em>.</p>|



### LifeClass

URI: https://www.omg.org/spec/SysML/20230201/shapes#LifeClass

type: Shape

target class: [sysml_vocab:LifeClass](https://www.omg.org/spec/SysML/20230201/vocab#LifeClass)

definition of vocabulary class : <p>A LifeClass is a Class that specializes both the <em>Base::Life Class</em> from the Kernel Library and a single OccurrenceDefinition, and has a multiplicity of 0..1. This constrains the OccurrenceDefinition to have at most one instance that is a complete Life.</p><br><br>specializesFromLibrary("Occurrences::Life")<br>multiplicity <> null and<br>multiplicity.specializesFromLibrary("Base::zeroOrOne")<br>specializes(individualDefinition)<br>isSufficient

description: <p>A LifeClass is a Class that specializes both the <em>Base::Life Class</em> from the Kernel Library and a single OccurrenceDefinition, and has a multiplicity of 0..1. This constrains the OccurrenceDefinition to have at most one instance that is a complete Life.</p><br><br>specializesFromLibrary("Occurrences::Life")<br>multiplicity <> null and<br>multiplicity.specializesFromLibrary("Base::zeroOrOne")<br>specializes(individualDefinition)<br>isSufficient

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Succession

URI: https://www.omg.org/spec/SysML/20230201/shapes#Succession

type: Shape

target class: [sysml_vocab:Succession](https://www.omg.org/spec/SysML/20230201/vocab#Succession)

definition of vocabulary class : <p>A Succession is a binary&nbsp;Connector that requires its <code>relatedFeatures</code> to happen separately in time. A Succession must be typed by the Association <em>HappensBefore</em> from the Kernel Model Library (or a specialization of it).</p><br><br>specializesFromLibrary("Occurences::happensBeforeLinks")

description: <p>A Succession is a binary&nbsp;Connector that requires its <code>relatedFeatures</code> to happen separately in time. A Succession must be typed by the Association <em>HappensBefore</em> from the Kernel Model Library (or a specialization of it).</p><br><br>specializesFromLibrary("Occurences::happensBeforeLinks")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:transitionStep](https://www.omg.org/spec/SysML/20230201/vocab#transitionStep)| [0..1]| [sysml_vocab:Step](https://www.omg.org/spec/SysML/20230201/vocab#Step)| <p>A Step that is typed by the Behavior <em>TransitionPerformance</em> (from the Model Library) that has this Succession as its <em><code>transitionLink</code></em>.</p><br>| <p>A Step that is typed by the Behavior <em>TransitionPerformance</em> (from the Model Library) that has this Succession as its <em><code>transitionLink</code></em>.</p><br>|
| [sysml_vocab:triggerStep](https://www.omg.org/spec/SysML/20230201/vocab#triggerStep)| [0..*]| [sysml_vocab:Step](https://www.omg.org/spec/SysML/20230201/vocab#Step)| <p>Steps that map incoming events to the timing of occurrences of the <code>transitionStep</code>. The values of <code>triggerStep</code> subset the list of acceptable events to be received by a Behavior or the object that performs it.</p><br>| <p>Steps that map incoming events to the timing of occurrences of the <code>transitionStep</code>. The values of <code>triggerStep</code> subset the list of acceptable events to be received by a Behavior or the object that performs it.</p><br>|
| [sysml_vocab:effectStep](https://www.omg.org/spec/SysML/20230201/vocab#effectStep)| [0..*]| [sysml_vocab:Step](https://www.omg.org/spec/SysML/20230201/vocab#Step)| <p>Steps that represent occurrences that are side effects of the <code>transitionStep</code> occurring.</p><br>| <p>Steps that represent occurrences that are side effects of the <code>transitionStep</code> occurring.</p><br>|
| [sysml_vocab:guardExpression](https://www.omg.org/spec/SysML/20230201/vocab#guardExpression)| [0..*]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>Expressions that must evaluate to true before the <code>transitionStep</code> can occur.</p><br>| <p>Expressions that must evaluate to true before the <code>transitionStep</code> can occur.</p><br>|



### Package

URI: https://www.omg.org/spec/SysML/20230201/shapes#Package

type: Shape

target class: [sysml_vocab:Package](https://www.omg.org/spec/SysML/20230201/vocab#Package)

definition of vocabulary class : <p>A Package is a Namespace used to group Elements, without any instance-level semantics. It may have one or more model-level evaluable <code>filterCondition</code> Expressions used to filter its <code>importedMemberships</code>. Any imported <code>member</code> must meet all of the <code>filterConditions</code>.</p>

description: <p>A Package is a Namespace used to group Elements, without any instance-level semantics. It may have one or more model-level evaluable <code>filterCondition</code> Expressions used to filter its <code>importedMemberships</code>. Any imported <code>member</code> must meet all of the <code>filterConditions</code>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:filterCondition](https://www.omg.org/spec/SysML/20230201/vocab#filterCondition)| [0..*]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The model-level evaluable Boolean Expressions used to filter the <code>members</code> of this Package, derived as those <code>ownedMembers</code> of the Package that are owned via ElementFilterMembership.</p>| <p>The model-level evaluable Boolean Expressions used to filter the <code>members</code> of this Package, derived as those <code>ownedMembers</code> of the Package that are owned via ElementFilterMembership.</p>|



### TransitionFeatureMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#TransitionFeatureMembership

type: Shape

target class: [sysml_vocab:TransitionFeatureMembership](https://www.omg.org/spec/SysML/20230201/vocab#TransitionFeatureMembership)

definition of vocabulary class : <p>A <code>TransitionFeatureMembership</code> is a <code>FeatureMembership<code> for a trigger, guard or effect of a <code>TransitionUsage</code>, whose <code>transitionFeature</code> is a <code>AcceptActionUsage</code>, <em><code>Boolean</code></em>-valued <code>Expression</code> or <code>ActionUsage</code>, depending on its <code>kind</code>. </p><br>kind = TransitionFeatureKind::trigger implies<br>    transitionFeature.oclIsKindOf(AcceptActionUsage)<br>owningType.oclIsKindOf(TransitionUsage)<br>kind = TransitionFeatureKind::guard implies<br>    transitionFeature.oclIsKindOf(Expression) and<br>    let guard : Expression = transitionFeature.oclIsKindOf(Expression) in<br>    guard.result.specializesFromLibrary('ScalarValues::Boolean') and<br>    guard.result.multiplicity <> null and<br>    guard.result.multiplicity.hasBounds(1,1)<br>kind = TransitionFeatureKind::effect implies<br>    transitionFeature.oclIsKindOf(ActionUsage)

description: <p>A <code>TransitionFeatureMembership</code> is a <code>FeatureMembership<code> for a trigger, guard or effect of a <code>TransitionUsage</code>, whose <code>transitionFeature</code> is a <code>AcceptActionUsage</code>, <em><code>Boolean</code></em>-valued <code>Expression</code> or <code>ActionUsage</code>, depending on its <code>kind</code>. </p><br>kind = TransitionFeatureKind::trigger implies<br>    transitionFeature.oclIsKindOf(AcceptActionUsage)<br>owningType.oclIsKindOf(TransitionUsage)<br>kind = TransitionFeatureKind::guard implies<br>    transitionFeature.oclIsKindOf(Expression) and<br>    let guard : Expression = transitionFeature.oclIsKindOf(Expression) in<br>    guard.result.specializesFromLibrary('ScalarValues::Boolean') and<br>    guard.result.multiplicity <> null and<br>    guard.result.multiplicity.hasBounds(1,1)<br>kind = TransitionFeatureKind::effect implies<br>    transitionFeature.oclIsKindOf(ActionUsage)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:kind](https://www.omg.org/spec/SysML/20230201/vocab#kind)| [1]| String| <p>Whether the RequirementConstraintMembership is for an assumed or required ConstraintUsage.</p>| <p>Whether this <code>TransitionFeatureMembership </code> is for a trigger, guard or effect.</p>|
| [sysml_vocab:transitionFeature](https://www.omg.org/spec/SysML/20230201/vocab#transitionFeature)| [1]| [sysml_vocab:Step](https://www.omg.org/spec/SysML/20230201/vocab#Step)| <p>The <codeStep</code> that is the <cpde>ownedMemberFeature</code> of this <code>TransitionFeatureMembership</code>.</p>| <p>The <codeStep</code> that is the <cpde>ownedMemberFeature</code> of this <code>TransitionFeatureMembership</code>.</p>|



### AttributeUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#AttributeUsage

type: Shape

target class: [sysml_vocab:AttributeUsage](https://www.omg.org/spec/SysML/20230201/vocab#AttributeUsage)

definition of vocabulary class : <p>An <code>AttributeUsage<code> is a <code>Usage</code> whose type is a <code>DataType</code>. Nominally, if the type is an <code>AttributeDefinition</code>, an <code>AttributeUsage<code> is a usage of a <code>AttributeDefinition</code> to represent the value of some system quality or characteristic. However, other kinds of kernel <code>DataTypes</code> are also allowed, to permit use of <code>DataTypes</code> from the Kernel Model Libraries. An <code>AttributeUsage<code> itself as well as all its nested <code>features</code> must be referential (non-composite).</p><br><br><p>An <code>AttributeUsage<code> must specialize, directly or indirectly, the base <code>Feature<code> <code><em>Base::dataValues</code> from the Kernel Semantic Library.</p><br>isReference<br>feature->forAll(not isComposite)<br>specializesFromLibrary("Base::dataValues")

description: <p>An <code>AttributeUsage<code> is a <code>Usage</code> whose type is a <code>DataType</code>. Nominally, if the type is an <code>AttributeDefinition</code>, an <code>AttributeUsage<code> is a usage of a <code>AttributeDefinition</code> to represent the value of some system quality or characteristic. However, other kinds of kernel <code>DataTypes</code> are also allowed, to permit use of <code>DataTypes</code> from the Kernel Model Libraries. An <code>AttributeUsage<code> itself as well as all its nested <code>features</code> must be referential (non-composite).</p><br><br><p>An <code>AttributeUsage<code> must specialize, directly or indirectly, the base <code>Feature<code> <code><em>Base::dataValues</code> from the Kernel Semantic Library.</p><br>isReference<br>feature->forAll(not isComposite)<br>specializesFromLibrary("Base::dataValues")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:attributeDefinition](https://www.omg.org/spec/SysML/20230201/vocab#attributeDefinition)| [0..*]| [sysml_vocab:DataType](https://www.omg.org/spec/SysML/20230201/vocab#DataType)| <p>The DataTypes that are the types of this AttributeUsage. Nominally, these are AttributeDefinitions, but other kinds of kernel DataTypes are also allowed, to permit use of DataTypes from the Kernel Library.</p>| <p>The DataTypes that are the types of this AttributeUsage. Nominally, these are AttributeDefinitions, but other kinds of kernel DataTypes are also allowed, to permit use of DataTypes from the Kernel Library.</p>|



### ElementFilterMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#ElementFilterMembership

type: Shape

target class: [sysml_vocab:ElementFilterMembership](https://www.omg.org/spec/SysML/20230201/vocab#ElementFilterMembership)

definition of vocabulary class : <p>ElementFilterMembership is a Mambership between a Namespace and a model-level evaluable Boolean Expression, asserting that imported <code>members</code> of the Namespace should be filtered using the <code>condition</code> Expression. A general Namespace does not define any specific filtering behavior, but such behavior may be defined for various specialized kinds of Namespaces.</p><br>condition.isModelLevelEvaluable<br>condition.result.specializesFromLibrary('ScalarValues::Boolean')

description: <p>ElementFilterMembership is a Mambership between a Namespace and a model-level evaluable Boolean Expression, asserting that imported <code>members</code> of the Namespace should be filtered using the <code>condition</code> Expression. A general Namespace does not define any specific filtering behavior, but such behavior may be defined for various specialized kinds of Namespaces.</p><br>condition.isModelLevelEvaluable<br>condition.result.specializesFromLibrary('ScalarValues::Boolean')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:condition](https://www.omg.org/spec/SysML/20230201/vocab#condition)| [1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The model-level evaluable Boolean Expression used to filter the <code>members</code> of the <code>membershipOwningNamespace</code> of this ElementFilterMembership.</p>| <p>The model-level evaluable Boolean Expression used to filter the <code>members</code> of the <code>membershipOwningNamespace</code> of this ElementFilterMembership.</p>|



### OccurrenceDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#OccurrenceDefinition

type: Shape

target class: [sysml_vocab:OccurrenceDefinition](https://www.omg.org/spec/SysML/20230201/vocab#OccurrenceDefinition)

definition of vocabulary class : <p>An <code>OccurrenceDefinition</code> is a <code>Definition</code> of a <code>Class</code> of individuals that have an independent life over time and potentially an extent over space. This includes both structural things and behaviors that act on such structures.</p><br><br><p>If <code>isIndividual</code> is true, then the <code>OccurrenceDefinition</code> is constrained to represent an individual thing. The instances of such an <code>OccurrenceDefinition</code> include all spatial and temporal portions of the individual being represented, but only one of these can be the complete <code>Life</code> of the individual. All other instances must be portions of the &quot;maximal portion&quot; that is single <code>Life</code> instance, capturing the conception that all of the instances represent one individual with a single &quot;identity&quot;.</p><br><br><p>An <code>OccurrenceDefinition</code> must specialize, directly or indirectly, the base <code>Class</code> <code><em>Occurrence</em></code> from the Kernel Semantic Library.</p><br><br>(lifeClass <> null) = isIndividual<br>lifeClass =<br>    let lifeClasses: Sequence(LifeClass) = <br>        ownedMember->selectByKind(LifeClass) in<br>    if lifeClasses->isEmpty() then null<br>    else lifeClasses->at(1)<br>    endif

description: <p>An <code>OccurrenceDefinition</code> is a <code>Definition</code> of a <code>Class</code> of individuals that have an independent life over time and potentially an extent over space. This includes both structural things and behaviors that act on such structures.</p><br><br><p>If <code>isIndividual</code> is true, then the <code>OccurrenceDefinition</code> is constrained to represent an individual thing. The instances of such an <code>OccurrenceDefinition</code> include all spatial and temporal portions of the individual being represented, but only one of these can be the complete <code>Life</code> of the individual. All other instances must be portions of the &quot;maximal portion&quot; that is single <code>Life</code> instance, capturing the conception that all of the instances represent one individual with a single &quot;identity&quot;.</p><br><br><p>An <code>OccurrenceDefinition</code> must specialize, directly or indirectly, the base <code>Class</code> <code><em>Occurrence</em></code> from the Kernel Semantic Library.</p><br><br>(lifeClass <> null) = isIndividual<br>lifeClass =<br>    let lifeClasses: Sequence(LifeClass) = <br>        ownedMember->selectByKind(LifeClass) in<br>    if lifeClasses->isEmpty() then null<br>    else lifeClasses->at(1)<br>    endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:isIndividual](https://www.omg.org/spec/SysML/20230201/vocab#isIndividual)| [1]| Boolean| <p>Whether this <code>OccurrenceUsage</code> represents the usage of the specific individual (or portion of it) represented by its <code>individualDefinition</code>.</p>| <p>Whether this OccurrenceDefinition is constrained to represent single individual.</p>|
| [sysml_vocab:lifeClass](https://www.omg.org/spec/SysML/20230201/vocab#lifeClass)| [0..1]| [sysml_vocab:LifeClass](https://www.omg.org/spec/SysML/20230201/vocab#LifeClass)| <p>If <code>isIndividual</code> is true, a LifeClass that specializes this OccurrenceDefinition, restricting it to represent an individual.</p>| <p>If <code>isIndividual</code> is true, a LifeClass that specializes this OccurrenceDefinition, restricting it to represent an individual.</p>|



### AssertConstraintUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#AssertConstraintUsage

type: Shape

target class: [sysml_vocab:AssertConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#AssertConstraintUsage)

definition of vocabulary class : <p>An AssertConstraintUsage is a ConstraintUsage that is also an Invariant and, so, is asserted to be true (by default). Unless it is the AssertConstraintUsage itself, the asserted ConstraintUsage is related to the AssertConstraintUsage by a ReferenceSubsetting relationship.</p><br><br><p>If the AssertConstraintUsage is owned by a PartDefinition or PartUsage, then it also subsets the <em><code>assertedConstraints</code></em> feature of the PartDefinition <em><code>Part</code></em> from the System Library model <em><code>Parts</code></em>.</p><br>assertedConstraint =<br>    if ownedReferenceSubsetting = null then self<br>    else ownedReferenceSubsetting.referencedFeature.oclAsType(ConstraintUsage)<br>    endif

description: <p>An AssertConstraintUsage is a ConstraintUsage that is also an Invariant and, so, is asserted to be true (by default). Unless it is the AssertConstraintUsage itself, the asserted ConstraintUsage is related to the AssertConstraintUsage by a ReferenceSubsetting relationship.</p><br><br><p>If the AssertConstraintUsage is owned by a PartDefinition or PartUsage, then it also subsets the <em><code>assertedConstraints</code></em> feature of the PartDefinition <em><code>Part</code></em> from the System Library model <em><code>Parts</code></em>.</p><br>assertedConstraint =<br>    if ownedReferenceSubsetting = null then self<br>    else ownedReferenceSubsetting.referencedFeature.oclAsType(ConstraintUsage)<br>    endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:assertedConstraint](https://www.omg.org/spec/SysML/20230201/vocab#assertedConstraint)| [1]| [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)| <p>The ConstraintUsage to be performed by the AssertConstraintUsage. It is the <code>referenceFeature</code> of the <code>ownedReferenceSubsetting</code> for the AssertConstraintUsage, if there is one, and, otherwise, the AssertConstraintUsage itself.</p>| <p>The ConstraintUsage to be performed by the AssertConstraintUsage. It is the <code>referenceFeature</code> of the <code>ownedReferenceSubsetting</code> for the AssertConstraintUsage, if there is one, and, otherwise, the AssertConstraintUsage itself.</p>|



### LiteralInteger

URI: https://www.omg.org/spec/SysML/20230201/shapes#LiteralInteger

type: Shape

target class: [sysml_vocab:LiteralInteger](https://www.omg.org/spec/SysML/20230201/vocab#LiteralInteger)

definition of vocabulary class : <p>A LiteralInteger is a LiteralExpression that provides an <code><em>Integer</em></code> value as a result. Its <code>result</code> parameter must have the type <code><em>Integer</em></code>.</p><br>

description: <p>A LiteralInteger is a LiteralExpression that provides an <code><em>Integer</em></code> value as a result. Its <code>result</code> parameter must have the type <code><em>Integer</em></code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:value](https://www.omg.org/spec/SysML/20230201/vocab#value)| [1]| Integer| <p>The Expression that provides the value of the <code>featureWithValue</code> as its <code>result</code>.</p><br><br><p>The Expression that provides the value as a result.</p>| <p>The Integer value that is the result of evaluating this Expression.</p><br><p>The Integer value that is the result of evaluating this Expression.</p><br>|



### MetadataAccessExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#MetadataAccessExpression

type: Shape

target class: [sysml_vocab:MetadataAccessExpression](https://www.omg.org/spec/SysML/20230201/vocab#MetadataAccessExpression)

definition of vocabulary class : <p>A MetadataAccessExpression is an Expression whose <code>result</code> is a sequence of instances of Metaclasses representing all the MetadataFeature annotations of the <code>referencedElement</code>. In addition, the sequence includes an instance of the reflective Metaclass corresponding to the MOF class of the <code>referencedElement</code>, with values for all the abstract syntax properties of the Element.</p><br>specializesFromLibrary("Performances::metadataAccessEvaluations")

description: <p>A MetadataAccessExpression is an Expression whose <code>result</code> is a sequence of instances of Metaclasses representing all the MetadataFeature annotations of the <code>referencedElement</code>. In addition, the sequence includes an instance of the reflective Metaclass corresponding to the MOF class of the <code>referencedElement</code>, with values for all the abstract syntax properties of the Element.</p><br>specializesFromLibrary("Performances::metadataAccessEvaluations")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:referencedElement](https://www.omg.org/spec/SysML/20230201/vocab#referencedElement)| [1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p> The Element whose metadata is being accessed.</p>| <p> The Element whose metadata is being accessed.</p>|



### Conjugation

URI: https://www.omg.org/spec/SysML/20230201/shapes#Conjugation

type: Shape

target class: [sysml_vocab:Conjugation](https://www.omg.org/spec/SysML/20230201/vocab#Conjugation)

definition of vocabulary class : <p>Conjugation is a Relationship between two types in which the <code>conjugatedType</code> inherits all the Features of the <code>originalType</code>, but with all <code>input</code> and <code>output</code> Features reversed. That is, any Features with a FeatureMembership with <code>direction</code> <em>in</em> relative to the <code>originalType</code> are considered to have an effective <code>direction</code> of <em>out</em> relative to the <code>conjugatedType</code> and, similarly, Features with <code>direction</code> <em>out</em> in the <code>originalType</code> are considered to have an effective <code>direction</code> of <em>in</em> in the <code>originalType</code>. Features with <code>direction</code> <em>inout</em>, or with no <code>direction</code>, in the <code>originalType</code>, are inherited without change.</p><br><br><p>A Type may participate as a <code>conjugatedType</code> in at most one Conjugation relationship, and such a Type may not also be the <code>specific</code> Type in any Generalization relationship.</p><br>

description: <p>Conjugation is a Relationship between two types in which the <code>conjugatedType</code> inherits all the Features of the <code>originalType</code>, but with all <code>input</code> and <code>output</code> Features reversed. That is, any Features with a FeatureMembership with <code>direction</code> <em>in</em> relative to the <code>originalType</code> are considered to have an effective <code>direction</code> of <em>out</em> relative to the <code>conjugatedType</code> and, similarly, Features with <code>direction</code> <em>out</em> in the <code>originalType</code> are considered to have an effective <code>direction</code> of <em>in</em> in the <code>originalType</code>. Features with <code>direction</code> <em>inout</em>, or with no <code>direction</code>, in the <code>originalType</code>, are inherited without change.</p><br><br><p>A Type may participate as a <code>conjugatedType</code> in at most one Conjugation relationship, and such a Type may not also be the <code>specific</code> Type in any Generalization relationship.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:originalType](https://www.omg.org/spec/SysML/20230201/vocab#originalType)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The Type to be conjugated.</P>| <p>The Type to be conjugated.</P>|
| [sysml_vocab:conjugatedType](https://www.omg.org/spec/SysML/20230201/vocab#conjugatedType)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The Type that is the result of applying Conjugation to the <code>originalType</code>.</p>| <p>The Type that is the result of applying Conjugation to the <code>originalType</code>.</p>|
| [sysml_vocab:owningType](https://www.omg.org/spec/SysML/20230201/vocab#owningType)| [0..1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The Type that is the <code>specific</code> Type of this Specialization and owns it as its <code>owningRelatedElement</code>.</p>| <p>The <code>conjugatedType</code> of this Type that is also its <code>owningRelatedElement</code>.</p><br>|



### Predicate

URI: https://www.omg.org/spec/SysML/20230201/shapes#Predicate

type: Shape

target class: [sysml_vocab:Predicate](https://www.omg.org/spec/SysML/20230201/vocab#Predicate)

definition of vocabulary class : <p>A Predicate is a Function whose <code>result</code> Parameter has type <em>Boolean</em> and multiplicity 1..1.</p><br><br>specializesFromLibrary("Performances::BooleanEvaluation")

description: <p>A Predicate is a Function whose <code>result</code> Parameter has type <em>Boolean</em> and multiplicity 1..1.</p><br><br>specializesFromLibrary("Performances::BooleanEvaluation")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Documentation

URI: https://www.omg.org/spec/SysML/20230201/shapes#Documentation

type: Shape

target class: [sysml_vocab:Documentation](https://www.omg.org/spec/SysML/20230201/vocab#Documentation)

definition of vocabulary class : <p>Documentation is a Comment that specifically documents a <code>documentedElement</code>, which must be its <code>owner</code>.</p>

description: <p>Documentation is a Comment that specifically documents a <code>documentedElement</code>, which must be its <code>owner</code>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:documentedElement](https://www.omg.org/spec/SysML/20230201/vocab#documentedElement)| [1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The Element that is documented by this Documentation.</p>| <p>The Element that is documented by this Documentation.</p>|



### Namespace

URI: https://www.omg.org/spec/SysML/20230201/shapes#Namespace

type: Shape

target class: [sysml_vocab:Namespace](https://www.omg.org/spec/SysML/20230201/vocab#Namespace)

definition of vocabulary class : <p>A <code>Namespace</code> is an <code>Element</code> that contains other <code>Element</code>, known as its <code>members</code>, via <code>Membership</code> <code>Relationships</code> with those <code>Elements</code>. The <code>members</code> of a <code>Namespace</code> may be owned by the <code>Namespace</code>, aliased in the <code>Namespace</code>, or imported into the <code>Namespace</code> via <code>Import</code> <code>Relationships</code> with other <code>Namespace</code>.</p><br><br><p>A <code>Namespace</code> can provide names for its <code>members</code> via the <code>memberNames</code> and <code>memberShortNames</code> specified by the <code>Memberships</code> in the <code>Namespace</code>. If a <code>Membership</code> specifies a <code>memberName</code> and/or <code>memberShortName</code>, then that those are names of the corresponding <code>memberElement</code> relative to the <code>Namespace</code>. For an <code>OwningMembership</code>, the <code>owningMemberName</code> and <code>owningMemberShortName</code> are given by the <code>Element</code> <code>name</code> and <code>shortName</code>. Note that the same <code>Element</code> may be the <code>memberElement</code> of multiple <code>Memberships</code> in a <code>Namespace</code> (though it may be owned at most once), each of which may define a separate alias for the <code>Element</code> relative to the <code>Namespace</code>.</p><br><br>membership->forAll(m1 | <br>    membership->forAll(m2 | <br>        m1 <> m2 implies m1.isDistinguishableFrom(m2)))<br>member = membership.memberElement<br>ownedMember = ownedMembership->selectByKind(OwningMembership).ownedMemberElement<br>importedMembership = importedMemberships(Set{})<br>ownedImport = ownedRelationship->selectByKind(Import)<br>ownedMembership = ownedRelationship->selectByKind(Membership)

description: <p>A <code>Namespace</code> is an <code>Element</code> that contains other <code>Element</code>, known as its <code>members</code>, via <code>Membership</code> <code>Relationships</code> with those <code>Elements</code>. The <code>members</code> of a <code>Namespace</code> may be owned by the <code>Namespace</code>, aliased in the <code>Namespace</code>, or imported into the <code>Namespace</code> via <code>Import</code> <code>Relationships</code> with other <code>Namespace</code>.</p><br><br><p>A <code>Namespace</code> can provide names for its <code>members</code> via the <code>memberNames</code> and <code>memberShortNames</code> specified by the <code>Memberships</code> in the <code>Namespace</code>. If a <code>Membership</code> specifies a <code>memberName</code> and/or <code>memberShortName</code>, then that those are names of the corresponding <code>memberElement</code> relative to the <code>Namespace</code>. For an <code>OwningMembership</code>, the <code>owningMemberName</code> and <code>owningMemberShortName</code> are given by the <code>Element</code> <code>name</code> and <code>shortName</code>. Note that the same <code>Element</code> may be the <code>memberElement</code> of multiple <code>Memberships</code> in a <code>Namespace</code> (though it may be owned at most once), each of which may define a separate alias for the <code>Element</code> relative to the <code>Namespace</code>.</p><br><br>membership->forAll(m1 | <br>    membership->forAll(m2 | <br>        m1 <> m2 implies m1.isDistinguishableFrom(m2)))<br>member = membership.memberElement<br>ownedMember = ownedMembership->selectByKind(OwningMembership).ownedMemberElement<br>importedMembership = importedMemberships(Set{})<br>ownedImport = ownedRelationship->selectByKind(Import)<br>ownedMembership = ownedRelationship->selectByKind(Membership)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:ownedMembership](https://www.omg.org/spec/SysML/20230201/vocab#ownedMembership)| [0..*]| [sysml_vocab:Membership](https://www.omg.org/spec/SysML/20230201/vocab#Membership)| <p>The <code>ownedRelationships</code> of this Namespace that are Memberships, for which the Namespace is the <code>membershipOwningNamespace</code>.</p><br>| <p>The <code>ownedRelationships</code> of this Namespace that are Memberships, for which the Namespace is the <code>membershipOwningNamespace</code>.</p><br>|
| [sysml_vocab:ownedMember](https://www.omg.org/spec/SysML/20230201/vocab#ownedMember)| [0..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The owned <code>members</code> of this Namespace, derived as the <cpde>ownedMemberElements</code> of the <code>ownedMemberships</code> of the Namespace.</p><br>| <p>The owned <code>members</code> of this Namespace, derived as the <cpde>ownedMemberElements</code> of the <code>ownedMemberships</code> of the Namespace.</p><br>|
| [sysml_vocab:membership](https://www.omg.org/spec/SysML/20230201/vocab#membership)| [0..*]| [sysml_vocab:Membership](https://www.omg.org/spec/SysML/20230201/vocab#Membership)| <p>All Memberships in this Namespace, including (at least) the union of <code>ownedMemberships</code> and <code>importedMemberships</code>.</p><br>| <p>All Memberships in this Namespace, including (at least) the union of <code>ownedMemberships</code> and <code>importedMemberships</code>.</p><br>|
| [sysml_vocab:ownedImport](https://www.omg.org/spec/SysML/20230201/vocab#ownedImport)| [0..*]| [sysml_vocab:Import](https://www.omg.org/spec/SysML/20230201/vocab#Import)| <p>The <code>ownedRelationships</code> of this Namespace that are Imports, for which the Namespace is the <code>importOwningNamespace</code>.</p><br>| <p>The <code>ownedRelationships</code> of this Namespace that are Imports, for which the Namespace is the <code>importOwningNamespace</code>.</p><br>|
| [sysml_vocab:member](https://www.omg.org/spec/SysML/20230201/vocab#member)| [0..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The set of all member Elements of this Namespace, derived as the <code>memberElements</code> of all <code>memberships</code> of the Namespace.</p><br>| <p>The set of all member Elements of this Namespace, derived as the <code>memberElements</code> of all <code>memberships</code> of the Namespace.</p><br>|
| [sysml_vocab:importedMembership](https://www.omg.org/spec/SysML/20230201/vocab#importedMembership)| [0..*]| [sysml_vocab:Membership](https://www.omg.org/spec/SysML/20230201/vocab#Membership)| <p>The Membership to be imported.</p>| <p>The Memberships in this Namespace that result from Import Relationships between the Namespace and other Namespaces.</p><br>|



### StakeholderMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#StakeholderMembership

type: Shape

target class: [sysml_vocab:StakeholderMembership](https://www.omg.org/spec/SysML/20230201/vocab#StakeholderMembership)

definition of vocabulary class : <p>A StakeholderMembership is a ParameterMembership that identifies a PartUsage as a stakeholder parameter, which specifies a role played by an entity with Concerns framed by the parametered requirement.</p>

description: <p>A StakeholderMembership is a ParameterMembership that identifies a PartUsage as a stakeholder parameter, which specifies a role played by an entity with Concerns framed by the parametered requirement.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:ownedStakeholderParameter](https://www.omg.org/spec/SysML/20230201/vocab#ownedStakeholderParameter)| [1]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The PartUsage specifying the stakeholder.</p>| <p>The PartUsage specifying the stakeholder.</p>|



### DataType

URI: https://www.omg.org/spec/SysML/20230201/shapes#DataType

type: Shape

target class: [sysml_vocab:DataType](https://www.omg.org/spec/SysML/20230201/vocab#DataType)

definition of vocabulary class : <p>A DataType is a Classifier of things (in the universe) that can only be distinguished by how they are related to other things (via Features). This means multiple things classified by the same DataType</p><br><br><ul><br>	<li>Cannot be distinguished when they are related to other things in exactly the same way, even when they are intended to be about different things.</li><br>	<li>Can be distinguished when they are related to other things in different ways, even when they are intended to be about the same thing.</li><br></ul><br><br>specializesFromLibrary('Base::DataValue')<br>ownedGeneralization.general-><br>    forAll(not oclIsKindOf(Class))

description: <p>A DataType is a Classifier of things (in the universe) that can only be distinguished by how they are related to other things (via Features). This means multiple things classified by the same DataType</p><br><br><ul><br>	<li>Cannot be distinguished when they are related to other things in exactly the same way, even when they are intended to be about different things.</li><br>	<li>Can be distinguished when they are related to other things in different ways, even when they are intended to be about the same thing.</li><br></ul><br><br>specializesFromLibrary('Base::DataValue')<br>ownedGeneralization.general-><br>    forAll(not oclIsKindOf(Class))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### ViewpointUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ViewpointUsage

type: Shape

target class: [sysml_vocab:ViewpointUsage](https://www.omg.org/spec/SysML/20230201/vocab#ViewpointUsage)

definition of vocabulary class : <p>A ViewpointUsage is a usage of a ViewpointDefinition.</p><br><br><p>A ViewpointUsage must subset, directly or indirectly, the base ViewpointUsage <code>viewpoints</code> from the Systems model library.</p>

description: <p>A ViewpointUsage is a usage of a ViewpointDefinition.</p><br><br><p>A ViewpointUsage must subset, directly or indirectly, the base ViewpointUsage <code>viewpoints</code> from the Systems model library.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:viewpointDefinition](https://www.omg.org/spec/SysML/20230201/vocab#viewpointDefinition)| [0..1]| [sysml_vocab:ViewpointDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ViewpointDefinition)| <p>The ViewpointDefinition that defines this ViewUsage.</p>| <p>The ViewpointDefinition that defines this ViewUsage.</p>|
| [sysml_vocab:viewpointStakeholder](https://www.omg.org/spec/SysML/20230201/vocab#viewpointStakeholder)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The features that identify the stakeholders with concerns framed by this ViewpointDefinition, derived as the owned and inherited <code>stakeholderParameters</code> of the <code>framedConcerns</code> of this ViewpointDefinition.</p>| <p>The features that identify the stakeholders with concerns addressed by this ViewpointUsage, derived as the owned and inherited <code>stakeholderParameters</code> of the <code>framedConcerns</code> of this ViewpointUsage.</p>|



### DecisionNode

URI: https://www.omg.org/spec/SysML/20230201/shapes#DecisionNode

type: Shape

target class: [sysml_vocab:DecisionNode](https://www.omg.org/spec/SysML/20230201/vocab#DecisionNode)

definition of vocabulary class : <p>A <code>DecisionNode</code> is a <code>ControlNode</code> that makes a selection from its outgoing <code>Successions</code>.</p><br>targetConnector->selectByKind(Succession)->size() <= 1<br>sourceConnector->selectAsKind(Succession)-><br>    collect(connectorEnd->at(2))-><br>    forAll(targetMult |<br>        multiplicityHasBounds(targetMult, 0, 1))<br>specializesFromLibrary("Actions::Action::decisions")<br>sourceConnector->selectByKind(Succession)-><br>    forAll(subsetsChain(this, <br>        resolveGlobal("ControlPerformances::MergePerformance::outgoingHBLink")))

description: <p>A <code>DecisionNode</code> is a <code>ControlNode</code> that makes a selection from its outgoing <code>Successions</code>.</p><br>targetConnector->selectByKind(Succession)->size() <= 1<br>sourceConnector->selectAsKind(Succession)-><br>    collect(connectorEnd->at(2))-><br>    forAll(targetMult |<br>        multiplicityHasBounds(targetMult, 0, 1))<br>specializesFromLibrary("Actions::Action::decisions")<br>sourceConnector->selectByKind(Succession)-><br>    forAll(subsetsChain(this, <br>        resolveGlobal("ControlPerformances::MergePerformance::outgoingHBLink")))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### TextualRepresentation

URI: https://www.omg.org/spec/SysML/20230201/shapes#TextualRepresentation

type: Shape

target class: [sysml_vocab:TextualRepresentation](https://www.omg.org/spec/SysML/20230201/vocab#TextualRepresentation)

definition of vocabulary class : <p>A TextualRepresentation is an AnnotatingElement whose <code>body</code> represents the <code>representedElement</code> in a given <code>language</code>. The <code>representedElement</code> must be the <code>owner</code> of the TextualRepresentation. The named <code>language</code> can be a natural language, in which case the <code>body</code> is an informal representation, or an artifical language, in which case the <code>body</code> is expected to be a formal, machine-parsable representation.</p><br><br><p>If the named <code>language</code> of a TextualRepresentation is machine-parsable, then the <code>body</code> text should be legal input text as defined for that <code>language</code>. The interpretation of the named language string shall be case insensitive. The following <code>language</code> names are defined to correspond to the given standard languages:</p><br><br><table border="1" cellpadding="1" cellspacing="1" width="498"><br>	<thead><br>	</thead><br>	<tbody><br>		<tr><br>			<td style="text-align: center; width: 154px;"><code>kerml</code></td><br>			<td style="width: 332px;">Kernel Modeling Language</td><br>		</tr><br>		<tr><br>			<td style="text-align: center; width: 154px;"><code>ocl</code></td><br>			<td style="width: 332px;">Object Constraint Language</td><br>		</tr><br>		<tr><br>			<td style="text-align: center; width: 154px;"><code>alf</code></td><br>			<td style="width: 332px;">Action Language for fUML</td><br>		</tr><br>	</tbody><br></table><br><br><p>Other specifications may define specific <code>language</code> strings, other than those shown in&nbsp;<mms-view-link mms-doc-id="_19_0_4_12e503d9_1655498859928_646482_53332" mms-element-id="MMS_1656305537944_6a3ca48e-424a-4a4d-8ce2-56df128ebabe" mms-pe-id="_hidden_MMS_1656305558930_8d3925ff-003f-4024-a594-14317550f480_pei">[cf:Standard Language Names.vlink]</mms-view-link>, to be used to indicate the use of languages from those specifications in KerML TextualRepresentations.</p><br><br><p>If the <code>language</code> of a TextualRepresentation is &quot;<code>kerml</code>&quot;, then the <code>body</code> text shall be a legal representation of the <code>representedElement</code> in the KerML textual concrete syntax. A conforming tool can use such a TextualRepresentation Annotation to record the original KerML concrete syntax text from which an Element was parsed. In this case, it is a tool responsibility to ensure that the <code>body</code> of the TextualRepresentation remains correct (or the Annotation is removed) if the annotated Element changes other than by re-parsing the <code>body</code> text.</p><br><br><p>An Element with a TextualRepresentation in a language other than KerML is essentially a semantically &quot;opaque&quot; Element specified in the other language. However, a conforming KerML tool may interpret such an element consistently with the specification of the named language.</p><br>

description: <p>A TextualRepresentation is an AnnotatingElement whose <code>body</code> represents the <code>representedElement</code> in a given <code>language</code>. The <code>representedElement</code> must be the <code>owner</code> of the TextualRepresentation. The named <code>language</code> can be a natural language, in which case the <code>body</code> is an informal representation, or an artifical language, in which case the <code>body</code> is expected to be a formal, machine-parsable representation.</p><br><br><p>If the named <code>language</code> of a TextualRepresentation is machine-parsable, then the <code>body</code> text should be legal input text as defined for that <code>language</code>. The interpretation of the named language string shall be case insensitive. The following <code>language</code> names are defined to correspond to the given standard languages:</p><br><br><table border="1" cellpadding="1" cellspacing="1" width="498"><br>	<thead><br>	</thead><br>	<tbody><br>		<tr><br>			<td style="text-align: center; width: 154px;"><code>kerml</code></td><br>			<td style="width: 332px;">Kernel Modeling Language</td><br>		</tr><br>		<tr><br>			<td style="text-align: center; width: 154px;"><code>ocl</code></td><br>			<td style="width: 332px;">Object Constraint Language</td><br>		</tr><br>		<tr><br>			<td style="text-align: center; width: 154px;"><code>alf</code></td><br>			<td style="width: 332px;">Action Language for fUML</td><br>		</tr><br>	</tbody><br></table><br><br><p>Other specifications may define specific <code>language</code> strings, other than those shown in&nbsp;<mms-view-link mms-doc-id="_19_0_4_12e503d9_1655498859928_646482_53332" mms-element-id="MMS_1656305537944_6a3ca48e-424a-4a4d-8ce2-56df128ebabe" mms-pe-id="_hidden_MMS_1656305558930_8d3925ff-003f-4024-a594-14317550f480_pei">[cf:Standard Language Names.vlink]</mms-view-link>, to be used to indicate the use of languages from those specifications in KerML TextualRepresentations.</p><br><br><p>If the <code>language</code> of a TextualRepresentation is &quot;<code>kerml</code>&quot;, then the <code>body</code> text shall be a legal representation of the <code>representedElement</code> in the KerML textual concrete syntax. A conforming tool can use such a TextualRepresentation Annotation to record the original KerML concrete syntax text from which an Element was parsed. In this case, it is a tool responsibility to ensure that the <code>body</code> of the TextualRepresentation remains correct (or the Annotation is removed) if the annotated Element changes other than by re-parsing the <code>body</code> text.</p><br><br><p>An Element with a TextualRepresentation in a language other than KerML is essentially a semantically &quot;opaque&quot; Element specified in the other language. However, a conforming KerML tool may interpret such an element consistently with the specification of the named language.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:language](https://www.omg.org/spec/SysML/20230201/vocab#language)| [1]| String| <p>The natural or artifical language in which the <code>body</code> text is written.</p><br>| <p>The natural or artifical language in which the <code>body</code> text is written.</p><br>|
| [sysml_vocab:body](https://www.omg.org/spec/SysML/20230201/vocab#body)| [1]| String| <p>The annotation text for the Comment.</p><br>| <p>The textual representation of the <code>representedElement</code> in the given <code>language</code>.</p><br>|
| [sysml_vocab:representedElement](https://www.omg.org/spec/SysML/20230201/vocab#representedElement)| [1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The Element that is represented by this TextualRepresentation.</p>| <p>The Element that is represented by this TextualRepresentation.</p>|



### ConstraintDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#ConstraintDefinition

type: Shape

target class: [sysml_vocab:ConstraintDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintDefinition)

definition of vocabulary class : <p>A <code>ConstraintDefinition</code> is an <code>OccurrenceDefinition</code> that is also a <code>Predicate</code> that defines a constraint that may be asserted to hold on a system or part of a system.</p><br><br><br>specializesFromLibrary('Constraints::ConstraintCheck')

description: <p>A <code>ConstraintDefinition</code> is an <code>OccurrenceDefinition</code> that is also a <code>Predicate</code> that defines a constraint that may be asserted to hold on a system or part of a system.</p><br><br><br>specializesFromLibrary('Constraints::ConstraintCheck')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### LiteralBoolean

URI: https://www.omg.org/spec/SysML/20230201/shapes#LiteralBoolean

type: Shape

target class: [sysml_vocab:LiteralBoolean](https://www.omg.org/spec/SysML/20230201/vocab#LiteralBoolean)

definition of vocabulary class : <p>LiteralBoolean is a LiteralExpression that provides a <code><em>Boolean</em></code> value as a result. Its <code>result</code> parameter must have type <code><em>Boolean</em></code>.</p><br>

description: <p>LiteralBoolean is a LiteralExpression that provides a <code><em>Boolean</em></code> value as a result. Its <code>result</code> parameter must have type <code><em>Boolean</em></code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:value](https://www.omg.org/spec/SysML/20230201/vocab#value)| [1]| Boolean| <p>The Expression that provides the value of the <code>featureWithValue</code> as its <code>result</code>.</p><br><br><p>The Expression that provides the value as a result.</p>| <p>The Boolean value that is the result of evaluating this Expression.</p><br><p>The Boolean value that is the result of evaluating this Expression.</p><br>|



### EventOccurrenceUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#EventOccurrenceUsage

type: Shape

target class: [sysml_vocab:EventOccurrenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#EventOccurrenceUsage)

definition of vocabulary class : <p>An <code>EventOccurrenceUsage</code> is an <code>OccurrenceUsage</code> that represents another <code>OccurrenceUsage<code> occurring as a <code><em>suboccurrence<em></code> of the containing occurrence of the <code>EventOccurrenceUsage</code>. Unless it is the <code>EventOccurrenceUsage</code> itself, the referenced <code>OccurrenceUsage</code> is related to the <code>EventOccurrenceUsage<code> by a <code>ReferenceSubsetting</code> <code>Relationship</code>.</p><br><br><p>If the <code>EventOccurrenceUsage</code> is owned by an <code>OccurrenceDefinition</code> or <code>OccurrenceUsage</code>, then it also subsets the <em><code>timeEnclosedOccurrences</code></em> property of the <code>Class</code> <em><code>Occurrence</code></em> from the Kernel Semantic Library model <em><code>Occurrences</code></em>.</p><br>eventOccurrence =<br>    if ownedReferenceSubsetting = null then self<br>    else if ownedReferenceSubsetting.referencedFeature.oclIsKindOf(OccurrenceUsage) then <br>        ownedReferenceSubsetting.referencedFeature.oclAsType(OccurrenceUsage)<br>    else null<br>    endif endif<br>ownedReferenceSubsetting <> null implies<br>    ownedReferenceSubsetting.referencedFeature.oclIsKindOf(OccurrenceUsage)<br>owningType <> null and<br>(owningType.oclIsKindOf(OccurrenceDefinition) or<br> owningType.oclIsKindOf(OccurrenceUsage)) implies<br>    specializesFromLibrary("Occurrences::Occurrence::timeEnclosedOccurrences")<br>isReference

description: <p>An <code>EventOccurrenceUsage</code> is an <code>OccurrenceUsage</code> that represents another <code>OccurrenceUsage<code> occurring as a <code><em>suboccurrence<em></code> of the containing occurrence of the <code>EventOccurrenceUsage</code>. Unless it is the <code>EventOccurrenceUsage</code> itself, the referenced <code>OccurrenceUsage</code> is related to the <code>EventOccurrenceUsage<code> by a <code>ReferenceSubsetting</code> <code>Relationship</code>.</p><br><br><p>If the <code>EventOccurrenceUsage</code> is owned by an <code>OccurrenceDefinition</code> or <code>OccurrenceUsage</code>, then it also subsets the <em><code>timeEnclosedOccurrences</code></em> property of the <code>Class</code> <em><code>Occurrence</code></em> from the Kernel Semantic Library model <em><code>Occurrences</code></em>.</p><br>eventOccurrence =<br>    if ownedReferenceSubsetting = null then self<br>    else if ownedReferenceSubsetting.referencedFeature.oclIsKindOf(OccurrenceUsage) then <br>        ownedReferenceSubsetting.referencedFeature.oclAsType(OccurrenceUsage)<br>    else null<br>    endif endif<br>ownedReferenceSubsetting <> null implies<br>    ownedReferenceSubsetting.referencedFeature.oclIsKindOf(OccurrenceUsage)<br>owningType <> null and<br>(owningType.oclIsKindOf(OccurrenceDefinition) or<br> owningType.oclIsKindOf(OccurrenceUsage)) implies<br>    specializesFromLibrary("Occurrences::Occurrence::timeEnclosedOccurrences")<br>isReference

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:eventOccurrence](https://www.omg.org/spec/SysML/20230201/vocab#eventOccurrence)| [1]| [sysml_vocab:OccurrenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#OccurrenceUsage)| <p>The OccurrenceUsage referenced as an event by this EventOccurrenceUsage. It is the <code>referenceFeature</code> of the <code>ownedReferenceSubsetting</code> for the EventOccurrenceUsage, if there is one, and, otherwise, the EventOccurrenceUsage itself.</p>| <p>The OccurrenceUsage referenced as an event by this EventOccurrenceUsage. It is the <code>referenceFeature</code> of the <code>ownedReferenceSubsetting</code> for the EventOccurrenceUsage, if there is one, and, otherwise, the EventOccurrenceUsage itself.</p>|



### NamespaceImport

URI: https://www.omg.org/spec/SysML/20230201/shapes#NamespaceImport

type: Shape

target class: [sysml_vocab:NamespaceImport](https://www.omg.org/spec/SysML/20230201/vocab#NamespaceImport)

definition of vocabulary class : <p>A NamespaceImport is an Import that imports Memberships from its <code>importedNamespace</code> into the <code>importOwningNamespace</code>. If <code> isRecursive = false</code>, then only the visible Memberships of the <code>importOwningNamespace</code> are imported. If <code> isRecursive = true</code>, then, in addition, Memberships are recursively imported from any <code>ownedMembers</code> of the <code>importedNamespace</code> that are Namespaces.</p><br>importedElement = importedNamespace

description: <p>A NamespaceImport is an Import that imports Memberships from its <code>importedNamespace</code> into the <code>importOwningNamespace</code>. If <code> isRecursive = false</code>, then only the visible Memberships of the <code>importOwningNamespace</code> are imported. If <code> isRecursive = true</code>, then, in addition, Memberships are recursively imported from any <code>ownedMembers</code> of the <code>importedNamespace</code> that are Namespaces.</p><br>importedElement = importedNamespace

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:importedNamespace](https://www.omg.org/spec/SysML/20230201/vocab#importedNamespace)| [1]| [sysml_vocab:Namespace](https://www.omg.org/spec/SysML/20230201/vocab#Namespace)| <p>The Namespace whose visible Memberships are imported by this NamespaceImport.</p><br>| <p>The Namespace whose visible Memberships are imported by this NamespaceImport.</p><br>|



### Type

URI: https://www.omg.org/spec/SysML/20230201/shapes#Type

type: Shape

target class: [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)

definition of vocabulary class : <p>A Type is a Namespace that is the most general kind of Element supporting the semantics of classification. A Type may be a Classifier or a Feature, defining conditions on what is classified by the Type (see also the description of <code>isSufficient</code>).</p><br><br>ownedSpecialization = ownedRelationship->selectByKind(Specialization)-><br>    select(g | g.special = self)<br>    <br>multiplicity = <br>    let ownedMultiplicities: Sequence(Multiplicity) =<br>        ownedMember->selectByKind(Multiplicity) in<br>    if ownedMultiplicities->isEmpty() then null<br>    else ownedMultiplicities->first()<br>    endif<br>ownedFeatureMembership = ownedRelationship->selectByKind(FeatureMembership)<br>let ownedConjugators: Sequence(Conjugator) = <br>    ownedRelationship->selectByKind(Conjugation) in<br>    ownedConjugator = <br>        if ownedConjugators->isEmpty() then null <br>        else ownedConjugators->at(1) endif<br>output =<br>    if isConjugated then <br>        conjugator.originalType.input<br>    else <br>        feature->select(direction = out or direction = inout)<br>    endif<br>input = <br>    if isConjugated then <br>        conjugator.originalType.output<br>    else <br>        feature->select(direction = _'in' or direction = inout)<br>    endif<br>inheritedMembership = inheritedMemberships(Set{})<br>specializesFromLibrary('Base::Anything')<br>directedFeature = feature->select(direction <> null)<br>feature = featureMembership.ownedMemberFeature<br>featureMembership = ownedMembership->union(<br>    inheritedMembership->selectByKind(FeatureMembership))<br>ownedFeature = ownedFeatureMembership.ownedMemberFeature<br>differencingType = ownedDifferencing.differencingType<br>intersectingType->excludes(self)<br>differencingType->excludes(self)<br>unioningType = ownedUnioning.unioningType<br>unioningType->excludes(self)<br>intersectingType = ownedIntersecting.intersectingType<br>ownedRelationship->selectByKind(Conjugator)->size() <= 1<br>ownedMember->selectByKind(Multiplicity)->size() <= 1<br>endFeature = feature->select(isEnd)<br>ownedRelationship->selectByKind(Disjoining)<br>ownedRelationship->selectByKind(Unioning)<br>ownedRelationship->selectByKind(Intersecting)<br>ownedRelationship->selectByKind(Differencing)

description: <p>A Type is a Namespace that is the most general kind of Element supporting the semantics of classification. A Type may be a Classifier or a Feature, defining conditions on what is classified by the Type (see also the description of <code>isSufficient</code>).</p><br><br>ownedSpecialization = ownedRelationship->selectByKind(Specialization)-><br>    select(g | g.special = self)<br>    <br>multiplicity = <br>    let ownedMultiplicities: Sequence(Multiplicity) =<br>        ownedMember->selectByKind(Multiplicity) in<br>    if ownedMultiplicities->isEmpty() then null<br>    else ownedMultiplicities->first()<br>    endif<br>ownedFeatureMembership = ownedRelationship->selectByKind(FeatureMembership)<br>let ownedConjugators: Sequence(Conjugator) = <br>    ownedRelationship->selectByKind(Conjugation) in<br>    ownedConjugator = <br>        if ownedConjugators->isEmpty() then null <br>        else ownedConjugators->at(1) endif<br>output =<br>    if isConjugated then <br>        conjugator.originalType.input<br>    else <br>        feature->select(direction = out or direction = inout)<br>    endif<br>input = <br>    if isConjugated then <br>        conjugator.originalType.output<br>    else <br>        feature->select(direction = _'in' or direction = inout)<br>    endif<br>inheritedMembership = inheritedMemberships(Set{})<br>specializesFromLibrary('Base::Anything')<br>directedFeature = feature->select(direction <> null)<br>feature = featureMembership.ownedMemberFeature<br>featureMembership = ownedMembership->union(<br>    inheritedMembership->selectByKind(FeatureMembership))<br>ownedFeature = ownedFeatureMembership.ownedMemberFeature<br>differencingType = ownedDifferencing.differencingType<br>intersectingType->excludes(self)<br>differencingType->excludes(self)<br>unioningType = ownedUnioning.unioningType<br>unioningType->excludes(self)<br>intersectingType = ownedIntersecting.intersectingType<br>ownedRelationship->selectByKind(Conjugator)->size() <= 1<br>ownedMember->selectByKind(Multiplicity)->size() <= 1<br>endFeature = feature->select(isEnd)<br>ownedRelationship->selectByKind(Disjoining)<br>ownedRelationship->selectByKind(Unioning)<br>ownedRelationship->selectByKind(Intersecting)<br>ownedRelationship->selectByKind(Differencing)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:isAbstract](https://www.omg.org/spec/SysML/20230201/vocab#isAbstract)| [1]| Boolean| <p>Indicates whether instances of this Type must also be instances of at least one of its specialized Types.</p><br>| <p>Indicates whether instances of this Type must also be instances of at least one of its specialized Types.</p><br>|
| [sysml_vocab:isSufficient](https://www.omg.org/spec/SysML/20230201/vocab#isSufficient)| [1]| Boolean| <p>Whether all things that meet the classification conditions of this Type must be classified by the Type.</p><br><br><p>(A Type&nbsp;gives conditions that must be met by whatever it classifies, but when <code>isSufficient</code> is false, things may meet those conditions but still not be classified by the Type. For example, a Type <code><em>Car</em></code> that is not sufficient could require everything it classifies to have four wheels, but not all four wheeled things would need to be cars. However, if the type <code><em>Car</em></code> were sufficient, it would classify all four-wheeled things.)</p><br>| <p>Whether all things that meet the classification conditions of this Type must be classified by the Type.</p><br><br><p>(A Type&nbsp;gives conditions that must be met by whatever it classifies, but when <code>isSufficient</code> is false, things may meet those conditions but still not be classified by the Type. For example, a Type <code><em>Car</em></code> that is not sufficient could require everything it classifies to have four wheels, but not all four wheeled things would need to be cars. However, if the type <code><em>Car</em></code> were sufficient, it would classify all four-wheeled things.)</p><br>|
| [sysml_vocab:isConjugated](https://www.omg.org/spec/SysML/20230201/vocab#isConjugated)| [1]| Boolean| <p>Indicates whether this Type has an <code>ownedConjugator</code>. (See Conjugation.)</p><br>| <p>Indicates whether this Type has an <code>ownedConjugator</code>. (See Conjugation.)</p><br>|
| [sysml_vocab:ownedSpecialization](https://www.omg.org/spec/SysML/20230201/vocab#ownedSpecialization)| [0..*]| [sysml_vocab:Specialization](https://www.omg.org/spec/SysML/20230201/vocab#Specialization)| <p>The <code>ownedRelationships</code> of this Type that are Specializations, for which the Type is the <code>specific</code> Type.</p><br>| <p>The <code>ownedRelationships</code> of this Type that are Specializations, for which the Type is the <code>specific</code> Type.</p><br>|
| [sysml_vocab:ownedFeatureMembership](https://www.omg.org/spec/SysML/20230201/vocab#ownedFeatureMembership)| [0..*]| [sysml_vocab:FeatureMembership](https://www.omg.org/spec/SysML/20230201/vocab#FeatureMembership)| <p>The <code>ownedMemberships</code> of this Type that are FeatureMemberships, for which the Type is the <code>owningType</code>. Each such FeatureMembership identifies an <code>ownedFeature</code> of the Type.</p><br>| <p>The <code>ownedMemberships</code> of this Type that are FeatureMemberships, for which the Type is the <code>owningType</code>. Each such FeatureMembership identifies an <code>ownedFeature</code> of the Type.</p><br>|
| [sysml_vocab:feature](https://www.omg.org/spec/SysML/20230201/vocab#feature)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>ownedMemberFeatures</code> of the <code>featureMemberships</code> of this Type.</p><br>| <p>The <code>ownedMemberFeatures</code> of the <code>featureMemberships</code> of this Type.</p><br>|
| [sysml_vocab:ownedFeature](https://www.omg.org/spec/SysML/20230201/vocab#ownedFeature)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>ownedMemberFeatures</code> of the <code>ownedFeatureMemberships</code> of this Type.</code><br>| <p>The <code>ownedMemberFeatures</code> of the <code>ownedFeatureMemberships</code> of this Type.</code><br>|
| [sysml_vocab:input](https://www.omg.org/spec/SysML/20230201/vocab#input)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>All <code>features</code> related to this Type by FeatureMemberships that have <code>direction</code> <code>in<code> or <code>inout<code>.</p><br>| <p>All <code>features</code> related to this Type by FeatureMemberships that have <code>direction</code> <code>in<code> or <code>inout<code>.</p><br>|
| [sysml_vocab:output](https://www.omg.org/spec/SysML/20230201/vocab#output)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>All <code>features</code> related to this Type by FeatureMemberships that have <code>direction</code> <code>out<code> or <code>inout<code>.</p><br>| <p>All <code>features</code> related to this Type by FeatureMemberships that have <code>direction</code> <code>out<code> or <code>inout<code>.</p><br>|
| [sysml_vocab:inheritedMembership](https://www.omg.org/spec/SysML/20230201/vocab#inheritedMembership)| [0..*]| [sysml_vocab:Membership](https://www.omg.org/spec/SysML/20230201/vocab#Membership)| <p>All Memberships inherited by this Type via Generalization or Conjugation. These are included in the derived union for the <code>memberships</code> of the Type.</p>| <p>All Memberships inherited by this Type via Generalization or Conjugation. These are included in the derived union for the <code>memberships</code> of the Type.</p>|
| [sysml_vocab:endFeature](https://www.omg.org/spec/SysML/20230201/vocab#endFeature)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>All <code>features</code> of this <code>Type</code> with <code>isEnd = true</code>.</p>| <p>All <code>features</code> of this <code>Type</code> with <code>isEnd = true</code>.</p>|
| [sysml_vocab:ownedEndFeature](https://www.omg.org/spec/SysML/20230201/vocab#ownedEndFeature)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>All <code>endFeatures</code> of this Type that are <code>ownedFeatures</code>.</p><br>| <p>All <code>endFeatures</code> of this Type that are <code>ownedFeatures</code>.</p><br>|
| [sysml_vocab:ownedConjugator](https://www.omg.org/spec/SysML/20230201/vocab#ownedConjugator)| [0..1]| [sysml_vocab:Conjugation](https://www.omg.org/spec/SysML/20230201/vocab#Conjugation)| <p>A Conjugation owned by this Type for which the Type is the <code>originalType</code>.</p><br>| <p>A Conjugation owned by this Type for which the Type is the <code>originalType</code>.</p><br>|
| [sysml_vocab:inheritedFeature](https://www.omg.org/spec/SysML/20230201/vocab#inheritedFeature)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>All the <code>memberFeatures</code> of the <code>inheritedMemberships</code> of this Type.</p><br>| <p>All the <code>memberFeatures</code> of the <code>inheritedMemberships</code> of this Type.</p><br>|
| [sysml_vocab:multiplicity](https://www.omg.org/spec/SysML/20230201/vocab#multiplicity)| [0..1]| [sysml_vocab:Multiplicity](https://www.omg.org/spec/SysML/20230201/vocab#Multiplicity)| <p>An <code>ownedMember</code> of this <code>Type</code> that is a <code>Multiplicity</code>, which constraints the cardinality of the <code>Type</code>. If there is no such <code>ownedMember</p>, then the cardinality of this <code>Type</code> is constrained by all the <code>Multiplicity</code> constraints applicable to any direct supertypes.</p>| <p>An <code>ownedMember</code> of this <code>Type</code> that is a <code>Multiplicity</code>, which constraints the cardinality of the <code>Type</code>. If there is no such <code>ownedMember</p>, then the cardinality of this <code>Type</code> is constrained by all the <code>Multiplicity</code> constraints applicable to any direct supertypes.</p>|
| [sysml_vocab:unioningType](https://www.omg.org/spec/SysML/20230201/vocab#unioningType)| [0..*]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>Type that partly determines interpretations of <code>typeUnioned</code>, as described in <code>Type::unioningType</code>.</p>| <p>The interpretations of a Type with code>unioningTypes</code> are asserted to be the same as those of all the <code>unioningTypes</code> together, which are the Types  derived from the <code>unioningType</code> of the <code>ownedUnionings</code> of this Type.  For example, a Classifier for people might be the union of Classifiers for all the sexes. Similarly, a feature for people's children might be the union of features dividing them in the same ways as people in general.</p>|
| [sysml_vocab:ownedIntersecting](https://www.omg.org/spec/SysML/20230201/vocab#ownedIntersecting)| [0..*]| [sysml_vocab:Intersecting](https://www.omg.org/spec/SysML/20230201/vocab#Intersecting)| <p>The <code>ownedRelationships</code> of this Type that are Intersectings, have the Type as their <code>typeIntersected</code>.</p>| <p>The <code>ownedRelationships</code> of this Type that are Intersectings, have the Type as their <code>typeIntersected</code>.</p>|
| [sysml_vocab:intersectingType](https://www.omg.org/spec/SysML/20230201/vocab#intersectingType)| [0..*]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>Type that partly determines interpretations of <code>typeIntersected</code>, as described in <code>Type::intersectingType</code>.</p>| <p>The interpretations of a Type with code>intersectingTypes</code> are asserted to be those in common among the <code>intersectingTypes</code>, which are the Types derived from the <code>intersectingType</code> of the <code>ownedIntersectings</code> of this Type.  For example, a Classifier might be an intersection of Classifiers for people of a particular sex and of a particular nationality.  Similarly, a feature for people's children of a particular sex might be the intersection of a feature for their children and a Classifier for people of that sex (because the interpretations of the children feature that identify those of that sex are also interpretations of the Classifier for that sex).<p>|
| [sysml_vocab:ownedUnioning](https://www.omg.org/spec/SysML/20230201/vocab#ownedUnioning)| [0..*]| [sysml_vocab:Unioning](https://www.omg.org/spec/SysML/20230201/vocab#Unioning)| <p>The <code>ownedRelationships</code> of this Type that are Unionings, having the Type as their <code>typeUnioned</code>.</p>| <p>The <code>ownedRelationships</code> of this Type that are Unionings, having the Type as their <code>typeUnioned</code>.</p>|
| [sysml_vocab:ownedDisjoining](https://www.omg.org/spec/SysML/20230201/vocab#ownedDisjoining)| [0..*]| [sysml_vocab:Disjoining](https://www.omg.org/spec/SysML/20230201/vocab#Disjoining)| <p>The <code>ownedRelationships</code> of this Type that are Disjoinings, for which the Type is the <code>typeDisjoined</code> Type.</p>| <p>The <code>ownedRelationships</code> of this Type that are Disjoinings, for which the Type is the <code>typeDisjoined</code> Type.</p>|
| [sysml_vocab:featureMembership](https://www.omg.org/spec/SysML/20230201/vocab#featureMembership)| [0..*]| [sysml_vocab:FeatureMembership](https://www.omg.org/spec/SysML/20230201/vocab#FeatureMembership)| <p>The FeatureMemberships for <code>features</code> of this Type, which include all <code>ownedFeatureMemberships</code> and those <code>inheritedMemberships</code> that are FeatureMemberships (but does <em>not</em> include any <code>importedMemberships</code>).</p>| <p>The FeatureMemberships for <code>features</code> of this Type, which include all <code>ownedFeatureMemberships</code> and those <code>inheritedMemberships</code> that are FeatureMemberships (but does <em>not</em> include any <code>importedMemberships</code>).</p>|
| [sysml_vocab:differencingType](https://www.omg.org/spec/SysML/20230201/vocab#differencingType)| [0..*]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The interpretations of a Type with <code>differencingTypes</code> are asserted to be those of the first of those Types, but not including those of the remaining types. For example, a Classifier might be the difference of a Classifier for people and another for people of a particular nationality, leaving people who are not of that nationality. Similarly, a feature of people might be the difference between a feature for their children and a Classifier for people of a particular sex, identifying their children not of that sex (because the interpretations of the children feature that identify those of that sex are also interpretations of the Classifier for that sex).<p>| <p>The interpretations of a Type with <code>differencingTypes</code> are asserted to be those of the first of those Types, but not including those of the remaining types. For example, a Classifier might be the difference of a Classifier for people and another for people of a particular nationality, leaving people who are not of that nationality. Similarly, a feature of people might be the difference between a feature for their children and a Classifier for people of a particular sex, identifying their children not of that sex (because the interpretations of the children feature that identify those of that sex are also interpretations of the Classifier for that sex).<p>|
| [sysml_vocab:ownedDifferencing](https://www.omg.org/spec/SysML/20230201/vocab#ownedDifferencing)| [0..*]| [sysml_vocab:Differencing](https://www.omg.org/spec/SysML/20230201/vocab#Differencing)| <p>The <code>ownedRelationships</code> of this Type that are Differencings, having this Type as their <code>typeDifferenced</code>.</p>| <p>The <code>ownedRelationships</code> of this Type that are Differencings, having this Type as their <code>typeDifferenced</code>.</p>|
| [sysml_vocab:directedFeature](https://www.omg.org/spec/SysML/20230201/vocab#directedFeature)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>features</code> of this Type that have a non-null <code>direction</code>.</p>| <p>The <code>features</code> of this Type that have a non-null <code>direction</code>.</p>|



### ActionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ActionUsage

type: Shape

target class: [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)

definition of vocabulary class : <p>An <code>ActionUsage</code> is a <code>Usage</code> that is also a <code>Step</code>, and, so, is typed by a <code>Behavior</code>. Nominally, if the type is an <code>ActionDefinition</code>, an <code>ActionUsage</code> is a <code>Usage</code> of that <code>ActionDefinition</code> within a system. However, other kinds of kernel <code>Behaviors</code> are also allowed, to permit use of <code>Behavior</code> from the Kernel Model Libraries.</p><br><br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::subactions')<br>specializesFromLibrary('Actions::actions')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(PartDefinition) or<br> owningType.oclIsKindOf(PartUsage)) implies<br>    specializesFromLibrary('Parts::Part::ownedActions')<br>owningFeatureMembership <> null and<br>owningFeatureMembership.oclIsKindOf(StateSubactionMembership) implies<br>    let kind : StateSubactionKind = <br>        owningFeatureMembership.oclAsType(StateSubactionMembership).kind in<br>    if kind = StateSubactionKind::entry then<br>        redefinesFromLibrary('States::StateAction::entryAction')<br>    else if kind = StateSubactionKind::do then<br>        redefinesFromLibrary('States::StateAction::doAction')<br>    else<br>        redefinesFromLibrary('States::StateAction::exitAction')<br>    endif endif

description: <p>An <code>ActionUsage</code> is a <code>Usage</code> that is also a <code>Step</code>, and, so, is typed by a <code>Behavior</code>. Nominally, if the type is an <code>ActionDefinition</code>, an <code>ActionUsage</code> is a <code>Usage</code> of that <code>ActionDefinition</code> within a system. However, other kinds of kernel <code>Behaviors</code> are also allowed, to permit use of <code>Behavior</code> from the Kernel Model Libraries.</p><br><br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::subactions')<br>specializesFromLibrary('Actions::actions')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(PartDefinition) or<br> owningType.oclIsKindOf(PartUsage)) implies<br>    specializesFromLibrary('Parts::Part::ownedActions')<br>owningFeatureMembership <> null and<br>owningFeatureMembership.oclIsKindOf(StateSubactionMembership) implies<br>    let kind : StateSubactionKind = <br>        owningFeatureMembership.oclAsType(StateSubactionMembership).kind in<br>    if kind = StateSubactionKind::entry then<br>        redefinesFromLibrary('States::StateAction::entryAction')<br>    else if kind = StateSubactionKind::do then<br>        redefinesFromLibrary('States::StateAction::doAction')<br>    else<br>        redefinesFromLibrary('States::StateAction::exitAction')<br>    endif endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:actionDefinition](https://www.omg.org/spec/SysML/20230201/vocab#actionDefinition)| [0..*]| [sysml_vocab:Behavior](https://www.omg.org/spec/SysML/20230201/vocab#Behavior)| <p>The Behaviors that are the types of this ActionUsage. Nominally, these would be ActionDefinitions, but other kinds of Kernel Behaviors are also allowed, to permit use of Behaviors from the Kernel Library.</p> <br>| <p>The Behaviors that are the types of this ActionUsage. Nominally, these would be ActionDefinitions, but other kinds of Kernel Behaviors are also allowed, to permit use of Behaviors from the Kernel Library.</p> <br>|



### ActionDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#ActionDefinition

type: Shape

target class: [sysml_vocab:ActionDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ActionDefinition)

definition of vocabulary class : <p>An <code>ActionDefinition</code> is a <code>Definition</code> that is also a <code>Behavior</code> that defines an <em><code>Action</code></em> performed by a system or part of a system.</p><br>specializesFromLibrary('Actions::Action')<br>action = usage->selectByKind(ActionUsage)

description: <p>An <code>ActionDefinition</code> is a <code>Definition</code> that is also a <code>Behavior</code> that defines an <em><code>Action</code></em> performed by a system or part of a system.</p><br>specializesFromLibrary('Actions::Action')<br>action = usage->selectByKind(ActionUsage)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:action](https://www.omg.org/spec/SysML/20230201/vocab#action)| [0..*]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsages</code> that are <code>steps</code> in this <code>ActionDefinition</code>, which define the actions that specify the behavior of the <code>ActionDefinition</code>.</p> <br>| <p>The <code>ActionUsages</code> that are <code>steps</code> in this <code>ActionDefinition</code>, which define the actions that specify the behavior of the <code>ActionDefinition</code>.</p> <br>|



### Disjoining

URI: https://www.omg.org/spec/SysML/20230201/shapes#Disjoining

type: Shape

target class: [sysml_vocab:Disjoining](https://www.omg.org/spec/SysML/20230201/vocab#Disjoining)

definition of vocabulary class : <p>A Disjoining is a Relationship between Types asserted to have interpretations that are not shared (disjoint) between them, identified as <code>typeDisjoined</code> and <code>disjoiningType</code>. For example, a Classifier for mammals is disjoint from a Classifier for minerals, and a Feature for people&#39;s parents is disjoint from a Feature for their children. </code></p><br>

description: <p>A Disjoining is a Relationship between Types asserted to have interpretations that are not shared (disjoint) between them, identified as <code>typeDisjoined</code> and <code>disjoiningType</code>. For example, a Classifier for mammals is disjoint from a Classifier for minerals, and a Feature for people&#39;s parents is disjoint from a Feature for their children. </code></p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:typeDisjoined](https://www.omg.org/spec/SysML/20230201/vocab#typeDisjoined)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>Type asserted to be disjoint with the <code>disjoiningType</code>.<p>| <p>Type asserted to be disjoint with the <code>disjoiningType</code>.<p>|
| [sysml_vocab:disjoiningType](https://www.omg.org/spec/SysML/20230201/vocab#disjoiningType)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>Type asserted to be disjoint with the <code>typeDisjoined</code>.<p>| <p>Type asserted to be disjoint with the <code>typeDisjoined</code>.<p>|
| [sysml_vocab:owningType](https://www.omg.org/spec/SysML/20230201/vocab#owningType)| [0..1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The Type that is the <code>specific</code> Type of this Specialization and owns it as its <code>owningRelatedElement</code>.</p>| <p>A <code>typeDisjoined</code> that is also an <code>owningRelatedElement</code>.</p>|



### Definition

URI: https://www.omg.org/spec/SysML/20230201/shapes#Definition

type: Shape

target class: [sysml_vocab:Definition](https://www.omg.org/spec/SysML/20230201/vocab#Definition)

definition of vocabulary class : <p>A Definition is a Classifier of Usages. The actual kinds of Definitions that may appear in a model are given by the subclasses of Definition (possibly as extended with user-defined <em><code>SemanticMetadata</code></em>).</p><br><br><p>Normally, a Definition has owned Usages that model <code>features</code> of the thing being defined. A Definition may also have other Definitions nested in it, but this has no semantic significance, other than the nested scoping resulting from the Definition being considered as a Namespace for any nested Definitions.</p><br><br><p>However, if a Definition has <code>isVariation</code> = <code>true</code>, then it represents a <em>variation point</em> Definition. In this case, all of its <code>members</code> must be <code>variant</code> Usages, related to the Definition by VariantMembership Relationships. Rather than being <code>features</code> of the Definition, <code>variant</code> Usages model different concrete alternatives that can be chosen to fill in for an abstract Usage of the variation point Definition.</p><br><br>isVariation implies variantMembership = ownedMembership<br>variant = variantMembership.ownedVariantUsage<br>variantMembership = ownedMembership->selectByKind(VariantMembership)<br>not isVariation implies variantMembership->isEmpty()<br>isVariation implies<br>    not ownedSpecialization.specific->exists(isVariation)

description: <p>A Definition is a Classifier of Usages. The actual kinds of Definitions that may appear in a model are given by the subclasses of Definition (possibly as extended with user-defined <em><code>SemanticMetadata</code></em>).</p><br><br><p>Normally, a Definition has owned Usages that model <code>features</code> of the thing being defined. A Definition may also have other Definitions nested in it, but this has no semantic significance, other than the nested scoping resulting from the Definition being considered as a Namespace for any nested Definitions.</p><br><br><p>However, if a Definition has <code>isVariation</code> = <code>true</code>, then it represents a <em>variation point</em> Definition. In this case, all of its <code>members</code> must be <code>variant</code> Usages, related to the Definition by VariantMembership Relationships. Rather than being <code>features</code> of the Definition, <code>variant</code> Usages model different concrete alternatives that can be chosen to fill in for an abstract Usage of the variation point Definition.</p><br><br>isVariation implies variantMembership = ownedMembership<br>variant = variantMembership.ownedVariantUsage<br>variantMembership = ownedMembership->selectByKind(VariantMembership)<br>not isVariation implies variantMembership->isEmpty()<br>isVariation implies<br>    not ownedSpecialization.specific->exists(isVariation)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:isVariation](https://www.omg.org/spec/SysML/20230201/vocab#isVariation)| [1]| Boolean| <p>Whether this Definition is for a variation point or not. If true, then all the <code>memberships</code> of the Definition must be VariantMemberships.</p>| <p>Whether this Definition is for a variation point or not. If true, then all the <code>memberships</code> of the Definition must be VariantMemberships.</p>|
| [sysml_vocab:ownedPort](https://www.omg.org/spec/SysML/20230201/vocab#ownedPort)| [0..*]| [sysml_vocab:PortUsage](https://www.omg.org/spec/SysML/20230201/vocab#PortUsage)| <p>The PortUsages that are <code>ownedUsages</code> of this Definition.</p>| <p>The PortUsages that are <code>ownedUsages</code> of this Definition.</p>|
| [sysml_vocab:directedUsage](https://www.omg.org/spec/SysML/20230201/vocab#directedUsage)| [0..*]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>usages</code> of this Definition that are <code>directedFeatures</code>.</p><br>| <p>The <code>usages</code> of this Definition that are <code>directedFeatures</code>.</p><br>|
| [sysml_vocab:usage](https://www.omg.org/spec/SysML/20230201/vocab#usage)| [0..*]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The Usages that are <code>features</code> of this Definition (not necessarily owned).</p>| <p>The Usages that are <code>features</code> of this Definition (not necessarily owned).</p>|
| [sysml_vocab:ownedState](https://www.omg.org/spec/SysML/20230201/vocab#ownedState)| [0..*]| [sysml_vocab:StateUsage](https://www.omg.org/spec/SysML/20230201/vocab#StateUsage)| <p>The StateUsages that are <tt>ownedUsages</tt> of this Definition.</p>| <p>The StateUsages that are <tt>ownedUsages</tt> of this Definition.</p>|
| [sysml_vocab:ownedConstraint](https://www.omg.org/spec/SysML/20230201/vocab#ownedConstraint)| [0..*]| [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)| <p>The ConstraintUsages that are <code>ownedUsages</code> of this Definition.</p> <br>| <p>The ConstraintUsages that are <code>ownedUsages</code> of this Definition.</p> <br>|
| [sysml_vocab:ownedTransition](https://www.omg.org/spec/SysML/20230201/vocab#ownedTransition)| [0..*]| [sysml_vocab:TransitionUsage](https://www.omg.org/spec/SysML/20230201/vocab#TransitionUsage)| <p>The TransitionUsages that are <tt>ownedUsages</tt> of this Definition.</p>| <p>The TransitionUsages that are <tt>ownedUsages</tt> of this Definition.</p>|
| [sysml_vocab:ownedRequirement](https://www.omg.org/spec/SysML/20230201/vocab#ownedRequirement)| [0..*]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The RequirementUsages that are <code>ownedUsages</code> of this Definition.</p>| <p>The RequirementUsages that are <code>ownedUsages</code> of this Definition.</p>|
| [sysml_vocab:ownedCalculation](https://www.omg.org/spec/SysML/20230201/vocab#ownedCalculation)| [0..*]| [sysml_vocab:CalculationUsage](https://www.omg.org/spec/SysML/20230201/vocab#CalculationUsage)| <p>The CalculationUsages that are <code>ownedUsages</code> of this Definition.</p>| <p>The CalculationUsages that are <code>ownedUsages</code> of this Definition.</p>|
| [sysml_vocab:variantMembership](https://www.omg.org/spec/SysML/20230201/vocab#variantMembership)| [0..*]| [sysml_vocab:VariantMembership](https://www.omg.org/spec/SysML/20230201/vocab#VariantMembership)| <p>The <code>ownedMemberships</code> of this Definition that are VariantMemberships. If <code>isVariation</code> = true, then this must be all <code>ownedMemberships</code> of the Definition. If <code>isVariation</code> = false, then <code>variantMembership</code>must be empty.</p>| <p>The <code>ownedMemberships</code> of this Definition that are VariantMemberships. If <code>isVariation</code> = true, then this must be all <code>ownedMemberships</code> of the Definition. If <code>isVariation</code> = false, then <code>variantMembership</code>must be empty.</p>|
| [sysml_vocab:ownedAnalysisCase](https://www.omg.org/spec/SysML/20230201/vocab#ownedAnalysisCase)| [0..*]| [sysml_vocab:AnalysisCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#AnalysisCaseUsage)| <p>The AnalysisCaseUsages that are <code>ownedUsages</code> of this Definition.</p>| <p>The AnalysisCaseUsages that are <code>ownedUsages</code> of this Definition.</p>|
| [sysml_vocab:variant](https://www.omg.org/spec/SysML/20230201/vocab#variant)| [0..*]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The Usages which represent the variants of this Definition as a variation point Definition, if <code>isVariation</code> = true. If <code>isVariation</code> = false, the there must be no <code>variants</code>.</p>| <p>The Usages which represent the variants of this Definition as a variation point Definition, if <code>isVariation</code> = true. If <code>isVariation</code> = false, the there must be no <code>variants</code>.</p>|
| [sysml_vocab:ownedCase](https://www.omg.org/spec/SysML/20230201/vocab#ownedCase)| [0..*]| [sysml_vocab:CaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#CaseUsage)| <p>The CaseUsages that are <code>ownedUsages</code> of this Definition.</p>| <p>The CaseUsages that are <code>ownedUsages</code> of this Definition.</p>|
| [sysml_vocab:ownedReference](https://www.omg.org/spec/SysML/20230201/vocab#ownedReference)| [0..*]| [sysml_vocab:ReferenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#ReferenceUsage)| <p>The ReferenceUsages that are <code>ownedUsages</code> of this Definition.</p>| <p>The ReferenceUsages that are <code>ownedUsages</code> of this Definition.</p>|
| [sysml_vocab:ownedAction](https://www.omg.org/spec/SysML/20230201/vocab#ownedAction)| [0..*]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The ActionUsages that are <code>ownedUsages</code> of this Definition.</code>| <p>The ActionUsages that are <code>ownedUsages</code> of this Definition.</code>|
| [sysml_vocab:ownedConnection](https://www.omg.org/spec/SysML/20230201/vocab#ownedConnection)| [0..*]| [sysml_vocab:ConnectorAsUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConnectorAsUsage)| <p>The ConnectorAsUsages that are <code>ownedUsages</code> of this Definition. Note that this list includes BindingConnectorAsUsages and SuccessionAsUsages, even though these are ConnectorAsUsages but not ConnectionUsages.</p>| <p>The ConnectorAsUsages that are <code>ownedUsages</code> of this Definition. Note that this list includes BindingConnectorAsUsages and SuccessionAsUsages, even though these are ConnectorAsUsages but not ConnectionUsages.</p>|
| [sysml_vocab:ownedItem](https://www.omg.org/spec/SysML/20230201/vocab#ownedItem)| [0..*]| [sysml_vocab:ItemUsage](https://www.omg.org/spec/SysML/20230201/vocab#ItemUsage)| <p>The ItemUsages that are <code>ownedUsages</code> of this Definition.</p>| <p>The ItemUsages that are <code>ownedUsages</code> of this Definition.</p>|
| [sysml_vocab:ownedPart](https://www.omg.org/spec/SysML/20230201/vocab#ownedPart)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The PartUsages that are <code>ownedUsages</code> of this Definition.</p>| <p>The PartUsages that are <code>ownedUsages</code> of this Definition.</p>|
| [sysml_vocab:ownedInterface](https://www.omg.org/spec/SysML/20230201/vocab#ownedInterface)| [0..*]| [sysml_vocab:InterfaceUsage](https://www.omg.org/spec/SysML/20230201/vocab#InterfaceUsage)| <p>The InterfaceUsages that are <code>ownedUsages</code> of this Definition.</p>| <p>The InterfaceUsages that are <code>ownedUsages</code> of this Definition.</p>|
| [sysml_vocab:ownedAttribute](https://www.omg.org/spec/SysML/20230201/vocab#ownedAttribute)| [0..*]| [sysml_vocab:AttributeUsage](https://www.omg.org/spec/SysML/20230201/vocab#AttributeUsage)| <p>The AttributeUsages that are <code>ownedUsages</code> of this Definition.<p>| <p>The AttributeUsages that are <code>ownedUsages</code> of this Definition.<p>|
| [sysml_vocab:ownedView](https://www.omg.org/spec/SysML/20230201/vocab#ownedView)| [0..*]| [sysml_vocab:ViewUsage](https://www.omg.org/spec/SysML/20230201/vocab#ViewUsage)| <p> The <code>ownedUsages</code> of this Definition that are ViewUsages.</p>| <p> The <code>ownedUsages</code> of this Definition that are ViewUsages.</p>|
| [sysml_vocab:ownedViewpoint](https://www.omg.org/spec/SysML/20230201/vocab#ownedViewpoint)| [0..*]| [sysml_vocab:ViewpointUsage](https://www.omg.org/spec/SysML/20230201/vocab#ViewpointUsage)| <p>The <code>ownedUsages</code> of this Definition that are ViewpointUsages.</p>| <p>The <code>ownedUsages</code> of this Definition that are ViewpointUsages.</p>|
| [sysml_vocab:ownedRendering](https://www.omg.org/spec/SysML/20230201/vocab#ownedRendering)| [0..*]| [sysml_vocab:RenderingUsage](https://www.omg.org/spec/SysML/20230201/vocab#RenderingUsage)| <p>The <code>usages</code> of this Definition that are RenderingUsages.</p>| <p>The <code>usages</code> of this Definition that are RenderingUsages.</p>|
| [sysml_vocab:ownedVerificationCase](https://www.omg.org/spec/SysML/20230201/vocab#ownedVerificationCase)| [0..*]| [sysml_vocab:VerificationCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#VerificationCaseUsage)| <p>The <code>ownedUsages</code> of this Definition that are VerificationCaseUsages.</p>| <p>The <code>ownedUsages</code> of this Definition that are VerificationCaseUsages.</p>|
| [sysml_vocab:ownedEnumeration](https://www.omg.org/spec/SysML/20230201/vocab#ownedEnumeration)| [0..*]| [sysml_vocab:EnumerationUsage](https://www.omg.org/spec/SysML/20230201/vocab#EnumerationUsage)| <p>The EnumerationUsages that are <code>ownedUsages</code> of this Definition.<p>| <p>The EnumerationUsages that are <code>ownedUsages</code> of this Definition.<p>|
| [sysml_vocab:ownedAllocation](https://www.omg.org/spec/SysML/20230201/vocab#ownedAllocation)| [0..*]| [sysml_vocab:AllocationUsage](https://www.omg.org/spec/SysML/20230201/vocab#AllocationUsage)| <p>The AllocationUsages that are <code>ownedUsages</code> of this Definition.</p>| <p>The AllocationUsages that are <code>ownedUsages</code> of this Definition.</p>|
| [sysml_vocab:ownedConcern](https://www.omg.org/spec/SysML/20230201/vocab#ownedConcern)| [0..*]| [sysml_vocab:ConcernUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConcernUsage)| <p>The ConcernUsages that are <code>ownedUsages</code> of this Definition.</p>| <p>The ConcernUsages that are <code>ownedUsages</code> of this Definition.</p>|
| [sysml_vocab:ownedOccurrence](https://www.omg.org/spec/SysML/20230201/vocab#ownedOccurrence)| [0..*]| [sysml_vocab:OccurrenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#OccurrenceUsage)| <p>The OccurrenceUsages that are <code>ownedUsages</code> of this Definition.</p>| <p>The OccurrenceUsages that are <code>ownedUsages</code> of this Definition.</p>|
| [sysml_vocab:ownedUseCase](https://www.omg.org/spec/SysML/20230201/vocab#ownedUseCase)| [0..*]| [sysml_vocab:UseCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#UseCaseUsage)| <p>The UseCaseUsages that are <code>ownedUsages</code> of this Definition.</p>| <p>The UseCaseUsages that are <code>ownedUsages</code> of this Definition.</p>|
| [sysml_vocab:ownedFlow](https://www.omg.org/spec/SysML/20230201/vocab#ownedFlow)| [0..*]| [sysml_vocab:FlowConnectionUsage](https://www.omg.org/spec/SysML/20230201/vocab#FlowConnectionUsage)| <p>The FlowConnectionUsages that are <code>ownedUsages</code> of this Definition.</p>| <p>The FlowConnectionUsages that are <code>ownedUsages</code> of this Definition.</p>|
| [sysml_vocab:ownedMetadata](https://www.omg.org/spec/SysML/20230201/vocab#ownedMetadata)| [0..*]| [sysml_vocab:MetadataUsage](https://www.omg.org/spec/SysML/20230201/vocab#MetadataUsage)| <p>The MetadataUsages that are <code>ownedUsages</code> of this Definition.</p>| <p>The MetadataUsages that are <code>ownedUsages</code> of this Definition.</p>|
| [sysml_vocab:ownedUsage](https://www.omg.org/spec/SysML/20230201/vocab#ownedUsage)| [0..*]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The Usages that are <code>ownedFeatures</code> of this Definition.</p>| <p>The Usages that are <code>ownedFeatures</code> of this Definition.</p>|



### TriggerInvocationExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#TriggerInvocationExpression

type: Shape

target class: [sysml_vocab:TriggerInvocationExpression](https://www.omg.org/spec/SysML/20230201/vocab#TriggerInvocationExpression)

definition of vocabulary class : <p>A <code>TriggerInvocationExpression<code> is an <code>InvocationExpression</code> that invokes one of the trigger <code>Functions</code> from the Kernel Semantic Library <code><em>Triggers<em></code> package, as indicated by its <code>kind</code>.</p><br>specializesFromLibrary(<br>    if kind = TriggerKind::when then<br>        'Triggers::TriggerWhen'<br>    else if kind = TriggerKind::at then<br>        'Triggers::TriggerAt'<br>    else <br>        'Triggers::TriggerAfter'<br>    endif endif<br>)

description: <p>A <code>TriggerInvocationExpression<code> is an <code>InvocationExpression</code> that invokes one of the trigger <code>Functions</code> from the Kernel Semantic Library <code><em>Triggers<em></code> package, as indicated by its <code>kind</code>.</p><br>specializesFromLibrary(<br>    if kind = TriggerKind::when then<br>        'Triggers::TriggerWhen'<br>    else if kind = TriggerKind::at then<br>        'Triggers::TriggerAt'<br>    else <br>        'Triggers::TriggerAfter'<br>    endif endif<br>)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:kind](https://www.omg.org/spec/SysML/20230201/vocab#kind)| [1]| String| <p>Whether the RequirementConstraintMembership is for an assumed or required ConstraintUsage.</p>| <p>Indicates which of the Functions from the Kernel <em>Triggers</em> package is to be invoked by this TriggerInvocationExpression.</p>|



### OwningMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#OwningMembership

type: Shape

target class: [sysml_vocab:OwningMembership](https://www.omg.org/spec/SysML/20230201/vocab#OwningMembership)

definition of vocabulary class : <p>An OwningMembership is a Membership that owns its <code>memberElement</code> as a <code>ownedRelatedElement</code>. The <code>ownedMemberElementM</code> becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code>.<br>ownedMemberName = ownedMemberElement.name<br>ownedMemberShortName = ownedMemberElement.shortName

description: <p>An OwningMembership is a Membership that owns its <code>memberElement</code> as a <code>ownedRelatedElement</code>. The <code>ownedMemberElementM</code> becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code>.<br>ownedMemberName = ownedMemberElement.name<br>ownedMemberShortName = ownedMemberElement.shortName

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:ownedMemberElementId](https://www.omg.org/spec/SysML/20230201/vocab#ownedMemberElementId)| [1]| String| <p>The <code>elementId</code> of the <code>ownedMemberElement</code>.</p>| <p>The <code>elementId</code> of the <code>ownedMemberElement</code>.</p>|
| [sysml_vocab:ownedMemberShortName](https://www.omg.org/spec/SysML/20230201/vocab#ownedMemberShortName)| [0..1]| String| <p>The <code>shortName</code> of the <code>ownedMemberElement</code>.</p>| <p>The <code>shortName</code> of the <code>ownedMemberElement</code>.</p>|
| [sysml_vocab:ownedMemberName](https://www.omg.org/spec/SysML/20230201/vocab#ownedMemberName)| [0..1]| String| <p>The <code>name</code> of the <code>ownedMemberElement</code>.</p><br>| <p>The <code>name</code> of the <code>ownedMemberElement</code>.</p><br>|
| [sysml_vocab:ownedMemberElement](https://www.omg.org/spec/SysML/20230201/vocab#ownedMemberElement)| [1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The Element that becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code> due to this OwningMembership. Derived as the first <code>ownedRelatedElement</code> of the OwningRelationship.</p><br><br>| <p>The Element that becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code> due to this OwningMembership. Derived as the first <code>ownedRelatedElement</code> of the OwningRelationship.</p><br><br>|



### InterfaceDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#InterfaceDefinition

type: Shape

target class: [sysml_vocab:InterfaceDefinition](https://www.omg.org/spec/SysML/20230201/vocab#InterfaceDefinition)

definition of vocabulary class : <p>An InterfaceDefinition is a ConnectionDefinition all of whose ends are PortUsages, defining an interface between elements that interact through such ports.</p><br><br><p>An InterfaceDefinition must subclass, directly or indirectly, the base InterfaceDefinition Interface from the Systems model library.</p><br>specializesFromLibrary("Interfaces::Interface")<br>ownedEndFeature->size() = 2 implies<br>    specializesFromLibrary("Interfaces::BinaryInterface")

description: <p>An InterfaceDefinition is a ConnectionDefinition all of whose ends are PortUsages, defining an interface between elements that interact through such ports.</p><br><br><p>An InterfaceDefinition must subclass, directly or indirectly, the base InterfaceDefinition Interface from the Systems model library.</p><br>specializesFromLibrary("Interfaces::Interface")<br>ownedEndFeature->size() = 2 implies<br>    specializesFromLibrary("Interfaces::BinaryInterface")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:interfaceEnd](https://www.omg.org/spec/SysML/20230201/vocab#interfaceEnd)| [0..*]| [sysml_vocab:PortUsage](https://www.omg.org/spec/SysML/20230201/vocab#PortUsage)| <p>The PortUsages that are the <code>associationEnds</code> of this InterfaceDefinition.<br><br>| <p>The PortUsages that are the <code>associationEnds</code> of this InterfaceDefinition.<br><br>|



### CollectExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#CollectExpression

type: Shape

target class: [sysml_vocab:CollectExpression](https://www.omg.org/spec/SysML/20230201/vocab#CollectExpression)

definition of vocabulary class : <p>A CollectExpression is an OperatorExpression whose operator is <code>"collect"</code>, which resolves to the library Function <em><code>ControlFunctions::collect</code></em>.</p>

description: <p>A CollectExpression is an OperatorExpression whose operator is <code>"collect"</code>, which resolves to the library Function <em><code>ControlFunctions::collect</code></em>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Behavior

URI: https://www.omg.org/spec/SysML/20230201/shapes#Behavior

type: Shape

target class: [sysml_vocab:Behavior](https://www.omg.org/spec/SysML/20230201/vocab#Behavior)

definition of vocabulary class : <p>A Behavior coordinates occurrences of other Behaviors, as well as&nbsp;changes in objects. Behaviors can be decomposed into Steps and be characterized by <code>parameters</code>.</p><br><br>specializesFromLibrary("Performances::Performance")

description: <p>A Behavior coordinates occurrences of other Behaviors, as well as&nbsp;changes in objects. Behaviors can be decomposed into Steps and be characterized by <code>parameters</code>.</p><br><br>specializesFromLibrary("Performances::Performance")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:step](https://www.omg.org/spec/SysML/20230201/vocab#step)| [0..*]| [sysml_vocab:Step](https://www.omg.org/spec/SysML/20230201/vocab#Step)| <p>The Steps that make up this Behavior.</p><br>| <p>The Steps that make up this Behavior.</p><br>|
| [sysml_vocab:parameter](https://www.omg.org/spec/SysML/20230201/vocab#parameter)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The parameters of this Behavior, which are all its <code>directedFeatures</code>, whose values are passed into and/or out of a performance of the Behavior.</p><br>| <p>The parameters of this Behavior, which are all its <code>directedFeatures</code>, whose values are passed into and/or out of a performance of the Behavior.</p><br>|



### ReferenceUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ReferenceUsage

type: Shape

target class: [sysml_vocab:ReferenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#ReferenceUsage)

definition of vocabulary class : <p>A ReferenceUsage is a Usage that specifies a non-compositional (<code>isComposite</code> = <code>false</code>) reference to something. The type of a ReferenceUsage can be any kind of Classifier, with the default being the top-level Classifier Anything from the Kernel library. This allows the specification of a generic reference without distinguishing if the thing referenced is an attribute value, item, action, etc. All <code>features</code> of a ReferenceUsage must also have <code>isComposite</code> = <code>false</code>.</p><br>isReference

description: <p>A ReferenceUsage is a Usage that specifies a non-compositional (<code>isComposite</code> = <code>false</code>) reference to something. The type of a ReferenceUsage can be any kind of Classifier, with the default being the top-level Classifier Anything from the Kernel library. This allows the specification of a generic reference without distinguishing if the thing referenced is an attribute value, item, action, etc. All <code>features</code> of a ReferenceUsage must also have <code>isComposite</code> = <code>false</code>.</p><br>isReference

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### RenderingDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#RenderingDefinition

type: Shape

target class: [sysml_vocab:RenderingDefinition](https://www.omg.org/spec/SysML/20230201/vocab#RenderingDefinition)

definition of vocabulary class : <p>A RenderingDefinition is a PartDefinition that defines a specific rendering of the content of a model view (e.g., symbols, style, layout, etc.).</p><br><br><p>A RenderingDefinition must subclass, directly or indirectly, the base RenderingDefinition Rendering from the Systems model library.</p>

description: <p>A RenderingDefinition is a PartDefinition that defines a specific rendering of the content of a model view (e.g., symbols, style, layout, etc.).</p><br><br><p>A RenderingDefinition must subclass, directly or indirectly, the base RenderingDefinition Rendering from the Systems model library.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:rendering](https://www.omg.org/spec/SysML/20230201/vocab#rendering)| [0..*]| [sysml_vocab:RenderingUsage](https://www.omg.org/spec/SysML/20230201/vocab#RenderingUsage)| <p>The <code>usages</code> of a RenderingDefinition that are RenderingUsages.</p>| <p>The <code>usages</code> of a RenderingDefinition that are RenderingUsages.</p>|



### StateSubactionMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#StateSubactionMembership

type: Shape

target class: [sysml_vocab:StateSubactionMembership](https://www.omg.org/spec/SysML/20230201/vocab#StateSubactionMembership)

definition of vocabulary class : <p>A <code>StateSubactionMembership</code> is a <code>FeatureMembership</code> for an entry, do or exit <code>ActionUsage<code> of a <code>StateDefinition</code> or <code>StateUsage</code>.</p><br>owningType.oclIsKindOf(StateDefinition) or<br>owningType.oclIsKindOf(StateUsage)

description: <p>A <code>StateSubactionMembership</code> is a <code>FeatureMembership</code> for an entry, do or exit <code>ActionUsage<code> of a <code>StateDefinition</code> or <code>StateUsage</code>.</p><br>owningType.oclIsKindOf(StateDefinition) or<br>owningType.oclIsKindOf(StateUsage)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:kind](https://www.omg.org/spec/SysML/20230201/vocab#kind)| [1]| String| <p>Whether the RequirementConstraintMembership is for an assumed or required ConstraintUsage.</p>| <p>Whether this <code>StateSubactionMembership</code> is for an <code>entry<code>, <code>do</code> or <code>exit</code> <code>ActionUsage</code>.</p>|
| [sysml_vocab:action](https://www.omg.org/spec/SysML/20230201/vocab#action)| [1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsages</code> that are <code>steps</code> in this <code>ActionDefinition</code>, which define the actions that specify the behavior of the <code>ActionDefinition</code>.</p> <br>| <p>The <code>ActionUsage</code> that is the <code>ownedMemberFeature</code> of this <code>StateSubactionMembership</code>.</p>|



### IfActionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#IfActionUsage

type: Shape

target class: [sysml_vocab:IfActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#IfActionUsage)

definition of vocabulary class : <p>An <code>IfActionUsage</code> is an <code>ActionUsage</code> that specifies that the <code>thenAction</code> <code>ActionUsage</code> should be performed if the result of the <code>ifArgument</code> <code>Expression</code> is true. It may also optionally specify an <code>elseAction</code> <code>ActionUsage</code> that is performed if the result of the <code>ifArgument</code> is false.</p><br>thenAction = <br>    let parameter : Feature = inputParameter(2) in<br>    if parameter <> null and parameter.oclIsKindOf(ActionUsage) then<br>        parameter.oclAsType(ActionUsage)<br>    else<br>        null<br>    endif<br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::ifSubactions')<br>if elseAction = null then<br>    specifiesFromLibrary('Actions::ifThenActions')<br>else<br>    specifiesFromLibrary('Actions::ifThenElseActions')<br>endif<br>ifArgument = <br>    let parameter : Feature = inputParameter(1) in<br>    if parameter <> null and parameter.oclIsKindOf(Expression) then<br>        parameter.oclAsType(Expression)<br>    else<br>        null<br>    endif<br>elseAction = <br>    let parameter : Feature = inputParameter(3) in<br>    if parameter <> null and parameter.oclIsKindOf(ActionUsage) then<br>        parameter.oclAsType(ActionUsage)<br>    else<br>        null<br>    endif

description: <p>An <code>IfActionUsage</code> is an <code>ActionUsage</code> that specifies that the <code>thenAction</code> <code>ActionUsage</code> should be performed if the result of the <code>ifArgument</code> <code>Expression</code> is true. It may also optionally specify an <code>elseAction</code> <code>ActionUsage</code> that is performed if the result of the <code>ifArgument</code> is false.</p><br>thenAction = <br>    let parameter : Feature = inputParameter(2) in<br>    if parameter <> null and parameter.oclIsKindOf(ActionUsage) then<br>        parameter.oclAsType(ActionUsage)<br>    else<br>        null<br>    endif<br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::ifSubactions')<br>if elseAction = null then<br>    specifiesFromLibrary('Actions::ifThenActions')<br>else<br>    specifiesFromLibrary('Actions::ifThenElseActions')<br>endif<br>ifArgument = <br>    let parameter : Feature = inputParameter(1) in<br>    if parameter <> null and parameter.oclIsKindOf(Expression) then<br>        parameter.oclAsType(Expression)<br>    else<br>        null<br>    endif<br>elseAction = <br>    let parameter : Feature = inputParameter(3) in<br>    if parameter <> null and parameter.oclIsKindOf(ActionUsage) then<br>        parameter.oclAsType(ActionUsage)<br>    else<br>        null<br>    endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:elseAction](https://www.omg.org/spec/SysML/20230201/vocab#elseAction)| [0..1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> that is to be performed if the result of the <code>ifArgument</code> is false. It an the owned <code>ActionUsage</code> that redefines the <em><code>elseClause</code></em> <code>parameter</code> of the <code>IfActionUsage</code>.</p> <br>| <p>The <code>ActionUsage</code> that is to be performed if the result of the <code>ifArgument</code> is false. It an the owned <code>ActionUsage</code> that redefines the <em><code>elseClause</code></em> <code>parameter</code> of the <code>IfActionUsage</code>.</p> <br>|
| [sysml_vocab:thenAction](https://www.omg.org/spec/SysML/20230201/vocab#thenAction)| [1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> that is to be performed if the result of the <code>ifArgument</code> is true. It is an owned <code>ActionUsage</code> that redefines the <em><code>thenClause</code></em> <code>parameter<code> of the <code>IfActionUsage</code>.</p> <br>| <p>The <code>ActionUsage</code> that is to be performed if the result of the <code>ifArgument</code> is true. It is an owned <code>ActionUsage</code> that redefines the <em><code>thenClause</code></em> <code>parameter<code> of the <code>IfActionUsage</code>.</p> <br>|
| [sysml_vocab:ifArgument](https://www.omg.org/spec/SysML/20230201/vocab#ifArgument)| [1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The Expression whose result determines whether the <code>thenAction</code> or (optionally) the <code>elseAction</code> is performed. Derived as the <code>value</code> Expression of the FeatureValue for the redefined <em><code>ifTest</code></em> parameter of the IfActionUsage.</p> <br>| <p>The Expression whose result determines whether the <code>thenAction</code> or (optionally) the <code>elseAction</code> is performed. Derived as the <code>value</code> Expression of the FeatureValue for the redefined <em><code>ifTest</code></em> parameter of the IfActionUsage.</p> <br>|



### JoinNode

URI: https://www.omg.org/spec/SysML/20230201/shapes#JoinNode

type: Shape

target class: [sysml_vocab:JoinNode](https://www.omg.org/spec/SysML/20230201/vocab#JoinNode)

definition of vocabulary class : <p>A <code>JoinNode</code> is a <code>ControlNode</code> that waits for the completion of all the predecessor <code>Actions</code> given by incoming <code>Successions</code>.</p><br>sourceConnector->selectByKind(Succession)->size() <= 1<br>specializesFromLibrary("Actions::Action::join")

description: <p>A <code>JoinNode</code> is a <code>ControlNode</code> that waits for the completion of all the predecessor <code>Actions</code> given by incoming <code>Successions</code>.</p><br>sourceConnector->selectByKind(Succession)->size() <= 1<br>specializesFromLibrary("Actions::Action::join")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### ItemFlowEnd

URI: https://www.omg.org/spec/SysML/20230201/shapes#ItemFlowEnd

type: Shape

target class: [sysml_vocab:ItemFlowEnd](https://www.omg.org/spec/SysML/20230201/vocab#ItemFlowEnd)

definition of vocabulary class : <p>An ItemFlowEnd is a Feature that is one of the <code>endFeatures</code> giving the <code><em>source</em></code> or <code><em>target</em></code> of an ItemFlow. For ItemFlows typed by FlowTransfer or its specializations, ItemFlowEnds must have exactly one <code>ownedFeature</code>, which redefines <code><em>Transfer::source::sourceOutput</em></code> or <code><em>Transfer::target::targetInput</em></code> and redefines the corresponding feature of the <code>relatedElement</code> for its end.</p>

description: <p>An ItemFlowEnd is a Feature that is one of the <code>endFeatures</code> giving the <code><em>source</em></code> or <code><em>target</em></code> of an ItemFlow. For ItemFlows typed by FlowTransfer or its specializations, ItemFlowEnds must have exactly one <code>ownedFeature</code>, which redefines <code><em>Transfer::source::sourceOutput</em></code> or <code><em>Transfer::target::targetInput</em></code> and redefines the corresponding feature of the <code>relatedElement</code> for its end.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### RequirementConstraintMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#RequirementConstraintMembership

type: Shape

target class: [sysml_vocab:RequirementConstraintMembership](https://www.omg.org/spec/SysML/20230201/vocab#RequirementConstraintMembership)

definition of vocabulary class : <p>A RequirementConstraintMembership is a FeatureMembership for an assumed or required ConstraintUsage of a RequirementDefinition or RequirementUsage. The <code>ownedMemberFeature</code> of a RequirementConstraintMembership must be a ConstraintUsage.</p>

description: <p>A RequirementConstraintMembership is a FeatureMembership for an assumed or required ConstraintUsage of a RequirementDefinition or RequirementUsage. The <code>ownedMemberFeature</code> of a RequirementConstraintMembership must be a ConstraintUsage.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:kind](https://www.omg.org/spec/SysML/20230201/vocab#kind)| [1]| String| <p>Whether the RequirementConstraintMembership is for an assumed or required ConstraintUsage.</p>| <p>Whether the RequirementConstraintMembership is for an assumed or required ConstraintUsage.</p>|
| [sysml_vocab:ownedConstraint](https://www.omg.org/spec/SysML/20230201/vocab#ownedConstraint)| [1]| [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)| <p>The ConstraintUsages that are <code>ownedUsages</code> of this Definition.</p> <br>| <p>The ConstraintUsage that is the <code>ownedMemberFeature</code> of this RequirementConstraintMembership.</p>|
| [sysml_vocab:referencedConstraint](https://www.omg.org/spec/SysML/20230201/vocab#referencedConstraint)| [1]| [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)| <p> The ConstraintUsage that is referenced through this RequirementConstraintMembership. This is derived as <code>referencedFeature</code> of the <code>ownedReferenceSubsetting</code> of the <code>ownedConstraint</code>, if there is one, and, otherwise, the <code>ownedConstraint</code> itself.</p>| <p> The ConstraintUsage that is referenced through this RequirementConstraintMembership. This is derived as <code>referencedFeature</code> of the <code>ownedReferenceSubsetting</code> of the <code>ownedConstraint</code>, if there is one, and, otherwise, the <code>ownedConstraint</code> itself.</p>|



### FeatureInverting

URI: https://www.omg.org/spec/SysML/20230201/shapes#FeatureInverting

type: Shape

target class: [sysml_vocab:FeatureInverting](https://www.omg.org/spec/SysML/20230201/vocab#FeatureInverting)

definition of vocabulary class : <p>A FeatureInverting is a Relationship between Features asserting that their interpretations (sequences) are the reverse of each other, identified as <code>featureInverted</code> and <code>invertingFeature</code>. For example, a Feature identifying each person's parents is the inverse of a Feature identifying each person's children.  A person identified as a parent of another will identify that other as one of their children.</p><br>if owningRelatedElement.oclIsKindOf(Feature) then<br>    owningRelatedElement.oclAsType(Feature)<br>else <br>    null<br>endif

description: <p>A FeatureInverting is a Relationship between Features asserting that their interpretations (sequences) are the reverse of each other, identified as <code>featureInverted</code> and <code>invertingFeature</code>. For example, a Feature identifying each person's parents is the inverse of a Feature identifying each person's children.  A person identified as a parent of another will identify that other as one of their children.</p><br>if owningRelatedElement.oclIsKindOf(Feature) then<br>    owningRelatedElement.oclAsType(Feature)<br>else <br>    null<br>endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:featureInverted](https://www.omg.org/spec/SysML/20230201/vocab#featureInverted)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>Feature that is an the inverse of <code>invertingFeature</code>.</p>| <p>Feature that is an the inverse of <code>invertingFeature</code>.</p>|
| [sysml_vocab:invertingFeature](https://www.omg.org/spec/SysML/20230201/vocab#invertingFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>Feature that is an inverse of <code>invertedFeature</code>.</p>| <p>Feature that is an inverse of <code>invertedFeature</code>.</p>|
| [sysml_vocab:owningFeature](https://www.omg.org/spec/SysML/20230201/vocab#owningFeature)| [0..1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>A <code>featureInverted</code> that is also an <code>owningRelatedElement<code>.</p>| <p>A <code>featureInverted</code> that is also an <code>owningRelatedElement<code>.</p>|



### ViewRenderingMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#ViewRenderingMembership

type: Shape

target class: [sysml_vocab:ViewRenderingMembership](https://www.omg.org/spec/SysML/20230201/vocab#ViewRenderingMembership)

definition of vocabulary class : <p>A ViewRenderingMembership is a FeatureMembership that identifies the <code>viewRendering</code> of a View. The <code>ownedMemberFeature</code> of a RequirementConstraintMembership must be a RenderingUsage.</p>

description: <p>A ViewRenderingMembership is a FeatureMembership that identifies the <code>viewRendering</code> of a View. The <code>ownedMemberFeature</code> of a RequirementConstraintMembership must be a RenderingUsage.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:ownedRendering](https://www.omg.org/spec/SysML/20230201/vocab#ownedRendering)| [1]| [sysml_vocab:RenderingUsage](https://www.omg.org/spec/SysML/20230201/vocab#RenderingUsage)| <p>The <code>usages</code> of this Definition that are RenderingUsages.</p>| n/a|
| [sysml_vocab:referencedRendering](https://www.omg.org/spec/SysML/20230201/vocab#referencedRendering)| [1]| [sysml_vocab:RenderingUsage](https://www.omg.org/spec/SysML/20230201/vocab#RenderingUsage)| <p> The RenderingUsage that is referenced through this ViewRenderingMembership. It is the <code>referenceFeature</code> of the <code>ownedReferenceSubsetting</code> for the <code>ownedRendering</code>, if there is one, and, otherwise, the <code>ownedRendering</code> itself.</p>| <p> The RenderingUsage that is referenced through this ViewRenderingMembership. It is the <code>referenceFeature</code> of the <code>ownedReferenceSubsetting</code> for the <code>ownedRendering</code>, if there is one, and, otherwise, the <code>ownedRendering</code> itself.</p>|



### ConjugatedPortDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#ConjugatedPortDefinition

type: Shape

target class: [sysml_vocab:ConjugatedPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ConjugatedPortDefinition)

definition of vocabulary class : <p>A ConjugatedPortDefinition is a PortDefinition that is a PortConjugation of its original PortDefinition. That is, a ConjugatedPortDefinition inherits all the <code>features</code> of the original PortDefinition, but input <code>flows</code> of the original PortDefinition become outputs on the ConjugatedPortDefinition and output <code>flows</code> of the original PortDefinition become inputs on the ConjugatedPortDefinition. Every PortDefinition (that is not itself a ConjugatedPortDefinition) has exactly one corresponding ConjugatedPortDefinition, whose effective name is the name of the <code>originalPortDefinition</code>, with the character <code>~</code> prepended.</p><br>originalPortDefinition = ownedPortConjugator.originalPortDefinition<br>conjugatedPortDefinition = null

description: <p>A ConjugatedPortDefinition is a PortDefinition that is a PortConjugation of its original PortDefinition. That is, a ConjugatedPortDefinition inherits all the <code>features</code> of the original PortDefinition, but input <code>flows</code> of the original PortDefinition become outputs on the ConjugatedPortDefinition and output <code>flows</code> of the original PortDefinition become inputs on the ConjugatedPortDefinition. Every PortDefinition (that is not itself a ConjugatedPortDefinition) has exactly one corresponding ConjugatedPortDefinition, whose effective name is the name of the <code>originalPortDefinition</code>, with the character <code>~</code> prepended.</p><br>originalPortDefinition = ownedPortConjugator.originalPortDefinition<br>conjugatedPortDefinition = null

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:ownedPortConjugator](https://www.omg.org/spec/SysML/20230201/vocab#ownedPortConjugator)| [1]| [sysml_vocab:PortConjugation](https://www.omg.org/spec/SysML/20230201/vocab#PortConjugation)| <p>The PortConjugation that is the <code>ownedConjugator</code> of this ConjugatedPortDefinition, linking it its <code>originalPortDefinition</code>.</p>| <p>The PortConjugation that is the <code>ownedConjugator</code> of this ConjugatedPortDefinition, linking it its <code>originalPortDefinition</code>.</p>|
| [sysml_vocab:originalPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#originalPortDefinition)| [1]| [sysml_vocab:PortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#PortDefinition)| <p>The original PortDefinition for this ConjugatedPortDefinition.</p>| <p>The original PortDefinition for this ConjugatedPortDefinition.</p>|



### LoopActionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#LoopActionUsage

type: Shape

target class: [sysml_vocab:LoopActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#LoopActionUsage)

definition of vocabulary class : <p>A <code>LoopActionUsage</code> is an <code>ActionUsage</code> that specifies that its <code>bodyAction</code> should be performed repeatedly. Its subclasses <code>WhileLoopActionUsage</code> and <code>ForLoopActionUsage</code> provide different ways to determine how many times the <code>bodyAction</code> should be performed.</p><br>bodyAction =<br>    let parameter : Feature = inputParameter(2) in<br>    if parameter <> null and parameter.oclIsKindOf(Action) then<br>        parameter.oclAsType(Action)<br>    else<br>        null<br>    endif<br>

description: <p>A <code>LoopActionUsage</code> is an <code>ActionUsage</code> that specifies that its <code>bodyAction</code> should be performed repeatedly. Its subclasses <code>WhileLoopActionUsage</code> and <code>ForLoopActionUsage</code> provide different ways to determine how many times the <code>bodyAction</code> should be performed.</p><br>bodyAction =<br>    let parameter : Feature = inputParameter(2) in<br>    if parameter <> null and parameter.oclIsKindOf(Action) then<br>        parameter.oclAsType(Action)<br>    else<br>        null<br>    endif<br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:bodyAction](https://www.omg.org/spec/SysML/20230201/vocab#bodyAction)| [1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The ActionUsage to be performed repeatedly by the LoopActionUsage. Derived as the owned ActionUsage that redefines the <em><code>body</code><em> </em></em>parameter of the LoopActionUsage.</p> <br>| <p>The ActionUsage to be performed repeatedly by the LoopActionUsage. Derived as the owned ActionUsage that redefines the <em><code>body</code><em> </em></em>parameter of the LoopActionUsage.</p> <br>|



### BooleanExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#BooleanExpression

type: Shape

target class: [sysml_vocab:BooleanExpression](https://www.omg.org/spec/SysML/20230201/vocab#BooleanExpression)

definition of vocabulary class : <p>A BooleanExpression is a Boolean-valued Expression whose type is a Predicate. It represents a logical condition resulting from the evaluation of the Predicate.</p><br><br><p>A BooleanExpression must subset, directly or indirectly, the Expression <em>booleanEvaluations</em> from the Base model library, which is typed by the base Predicate <em>BooleanEvaluation</em>. As a result, a BooleanExpression must always be typed by BooleanEvaluation or a subclass of BooleanEvaluation.</p><br><br>specializesFromLibrary("Performances::booleanEvaluations")

description: <p>A BooleanExpression is a Boolean-valued Expression whose type is a Predicate. It represents a logical condition resulting from the evaluation of the Predicate.</p><br><br><p>A BooleanExpression must subset, directly or indirectly, the Expression <em>booleanEvaluations</em> from the Base model library, which is typed by the base Predicate <em>BooleanEvaluation</em>. As a result, a BooleanExpression must always be typed by BooleanEvaluation or a subclass of BooleanEvaluation.</p><br><br>specializesFromLibrary("Performances::booleanEvaluations")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:predicate](https://www.omg.org/spec/SysML/20230201/vocab#predicate)| [0..1]| [sysml_vocab:Predicate](https://www.omg.org/spec/SysML/20230201/vocab#Predicate)| <p>The Predicate that types the Expression.</p><br><p>The Predicate that types the Expression.</p><br>| <p>The Predicate that types the Expression.</p><br><p>The Predicate that types the Expression.</p><br>|



### UseCaseDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#UseCaseDefinition

type: Shape

target class: [sysml_vocab:UseCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#UseCaseDefinition)

definition of vocabulary class : <p>A UseCaseDefinition is a CaseDefinition that specifies a set of actions performed by its subject, in interaction with one or more actors external to the subject. The objective is to yield an observable result that is of value for one or more of the actors.</p><br><br><p>A UseCaseDefinition must subclass, directly or indirectly, the base UseCaseDefinition <em>UseCase</em> from the Systems model library.</p><br>

description: <p>A UseCaseDefinition is a CaseDefinition that specifies a set of actions performed by its subject, in interaction with one or more actors external to the subject. The objective is to yield an observable result that is of value for one or more of the actors.</p><br><br><p>A UseCaseDefinition must subclass, directly or indirectly, the base UseCaseDefinition <em>UseCase</em> from the Systems model library.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:includedUseCase](https://www.omg.org/spec/SysML/20230201/vocab#includedUseCase)| [0..*]| [sysml_vocab:UseCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#UseCaseUsage)| <p>The UseCaseUsages that are included by this UseCaseDefinition. Derived as the <code>includedUseCase</code> of the IncludeUseCaseUsages owned by this UseCaseDefinition.</p>| <p>The UseCaseUsages that are included by this UseCaseDefinition. Derived as the <code>includedUseCase</code> of the IncludeUseCaseUsages owned by this UseCaseDefinition.</p>|



### AllocationUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#AllocationUsage

type: Shape

target class: [sysml_vocab:AllocationUsage](https://www.omg.org/spec/SysML/20230201/vocab#AllocationUsage)

definition of vocabulary class : <p>An AllocationUsage is a usage of an AllocationDefinition asserting the allocation of the <code>source</code> feature to the <code>target</code> feature.</p><br><br><p>An AllocationUsage must subset, directly or indirectly, the base AllocatopnUsage <code>allocations</code> from the Systems model library.</p><br>specializesFromLibrary("Allocations::allocations")

description: <p>An AllocationUsage is a usage of an AllocationDefinition asserting the allocation of the <code>source</code> feature to the <code>target</code> feature.</p><br><br><p>An AllocationUsage must subset, directly or indirectly, the base AllocatopnUsage <code>allocations</code> from the Systems model library.</p><br>specializesFromLibrary("Allocations::allocations")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:allocationDefinition](https://www.omg.org/spec/SysML/20230201/vocab#allocationDefinition)| [0..*]| [sysml_vocab:AllocationDefinition](https://www.omg.org/spec/SysML/20230201/vocab#AllocationDefinition)| <p>The AllocationDefinitions that are the types of this AllocationUsage.</p>| <p>The AllocationDefinitions that are the types of this AllocationUsage.</p>|



### EnumerationUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#EnumerationUsage

type: Shape

target class: [sysml_vocab:EnumerationUsage](https://www.omg.org/spec/SysML/20230201/vocab#EnumerationUsage)

definition of vocabulary class : <p>An EnumerationUsage is an AttributeUsage whose <code>attributeDefinition</code> is an EnumerationDefinition.</p><br><br><p>An EnumerationUsage must subset, directly or indirectly, the base EnumerationUsage <code>enumerationValues</code> from the Systems model library.</p>

description: <p>An EnumerationUsage is an AttributeUsage whose <code>attributeDefinition</code> is an EnumerationDefinition.</p><br><br><p>An EnumerationUsage must subset, directly or indirectly, the base EnumerationUsage <code>enumerationValues</code> from the Systems model library.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:enumerationDefinition](https://www.omg.org/spec/SysML/20230201/vocab#enumerationDefinition)| [1]| [sysml_vocab:EnumerationDefinition](https://www.omg.org/spec/SysML/20230201/vocab#EnumerationDefinition)| <p>The single EnumerationDefinition that is the type of this EnumerationUsage.</p>| <p>The single EnumerationDefinition that is the type of this EnumerationUsage.</p>|



### BindingConnectorAsUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#BindingConnectorAsUsage

type: Shape

target class: [sysml_vocab:BindingConnectorAsUsage](https://www.omg.org/spec/SysML/20230201/vocab#BindingConnectorAsUsage)

definition of vocabulary class : <p>A BindingConnectorAsUsage is both a BindingConnector and a ConnectorAsUsage.</p>

description: <p>A BindingConnectorAsUsage is both a BindingConnector and a ConnectorAsUsage.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### InterfaceUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#InterfaceUsage

type: Shape

target class: [sysml_vocab:InterfaceUsage](https://www.omg.org/spec/SysML/20230201/vocab#InterfaceUsage)

definition of vocabulary class : <p>An InterfaceUsage is a Usage of an InterfaceDefinition to represent an interface connecting parts of a system through specific ports.</p><br><br><p>An InterfaceUsage must subset, directly or indirectly, the base InterfaceUsage <code>interfaces</code> from the Systems model libary.</p><br>ownedEndFeature->size() = 2 implies<br>    specializesFromLibrary("Interfaces::binaryInterfaces")<br>specializesFromLibrary("Interfaces::interfaces")

description: <p>An InterfaceUsage is a Usage of an InterfaceDefinition to represent an interface connecting parts of a system through specific ports.</p><br><br><p>An InterfaceUsage must subset, directly or indirectly, the base InterfaceUsage <code>interfaces</code> from the Systems model libary.</p><br>ownedEndFeature->size() = 2 implies<br>    specializesFromLibrary("Interfaces::binaryInterfaces")<br>specializesFromLibrary("Interfaces::interfaces")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:interfaceDefinition](https://www.omg.org/spec/SysML/20230201/vocab#interfaceDefinition)| [0..*]| [sysml_vocab:InterfaceDefinition](https://www.omg.org/spec/SysML/20230201/vocab#InterfaceDefinition)| <p>The InterfaceDefinitions that type this InterfaceUsage.</p>| <p>The InterfaceDefinitions that type this InterfaceUsage.</p>|



### IncludeUseCaseUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#IncludeUseCaseUsage

type: Shape

target class: [sysml_vocab:IncludeUseCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#IncludeUseCaseUsage)

definition of vocabulary class : <p>An IncludeUseCaseUsage is a UseCaseUsage that represents the inclusion of a UseCaseUsage by a UseCaseDefinition or UseCaseUsage. Unless it is the IncludeUseCaseUsage itself, the UseCaseUsage to be included is related to the <code>includedUseCase</code> by a ReferenceSubsetting Relationship. An IncludeUseCaseUsage is also a PerformActionUsage, with its <code>includedUseCase</code> as the <code>performedAction</code>.</p><br><br><p>If the IncludeUseCaseUsage is owned by a UseCaseDefinition or UseCaseUsage, then it also subsets the UseCaseUsage <em><code>UseCase::includedUseCases</code></em> from the Systems model library.</p><br>

description: <p>An IncludeUseCaseUsage is a UseCaseUsage that represents the inclusion of a UseCaseUsage by a UseCaseDefinition or UseCaseUsage. Unless it is the IncludeUseCaseUsage itself, the UseCaseUsage to be included is related to the <code>includedUseCase</code> by a ReferenceSubsetting Relationship. An IncludeUseCaseUsage is also a PerformActionUsage, with its <code>includedUseCase</code> as the <code>performedAction</code>.</p><br><br><p>If the IncludeUseCaseUsage is owned by a UseCaseDefinition or UseCaseUsage, then it also subsets the UseCaseUsage <em><code>UseCase::includedUseCases</code></em> from the Systems model library.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:useCaseIncluded](https://www.omg.org/spec/SysML/20230201/vocab#useCaseIncluded)| [1]| [sysml_vocab:UseCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#UseCaseUsage)| <p>The UseCaseUsage to be included by this IncludeUseCaseUsage. It is the <code>subsettedFeature</code> of the first owned Subsetting Relationship of the IncludeUseCaseUsage.</p> <br>| <p>The UseCaseUsage to be included by this IncludeUseCaseUsage. It is the <code>subsettedFeature</code> of the first owned Subsetting Relationship of the IncludeUseCaseUsage.</p> <br>|



### ItemFeature

URI: https://www.omg.org/spec/SysML/20230201/shapes#ItemFeature

type: Shape

target class: [sysml_vocab:ItemFeature](https://www.omg.org/spec/SysML/20230201/vocab#ItemFeature)

definition of vocabulary class : <p>An ItemFeature is the <code>ownedFeature</code> of an ItemFlow that identifies the things carried by the kinds of transfers that are instances of the ItemFlow. It must redefine <code><em>Transfer::item</em></code>.</p><br>ownedRedefinition.redefinedFeature-><br>    redefinesFromLibrary("Transfers::Transfer::item")

description: <p>An ItemFeature is the <code>ownedFeature</code> of an ItemFlow that identifies the things carried by the kinds of transfers that are instances of the ItemFlow. It must redefine <code><em>Transfer::item</em></code>.</p><br>ownedRedefinition.redefinedFeature-><br>    redefinesFromLibrary("Transfers::Transfer::item")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### SendActionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#SendActionUsage

type: Shape

target class: [sysml_vocab:SendActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#SendActionUsage)

definition of vocabulary class : <p>A <code>SendActionUsage</code> is an <code>ActionUsage</code> that specifies the sending of a payload given by the result of its <code>payloadArgument</code> <code>Expression</code> via a <em><code>MessageTransfer</code></em> whose <em><code>source</code></em> is given by the result of the <code>senderArgument</code> <code>Expression</code> and whose <code>target</code> is given by the result of the <code>receiverArgument</code> <code>Expression</code>. If no <code>senderArgument</code> is provided, the default is the <em><code>this</code></em> context for the action. If no <code>receiverArgument</code> is given, then the receiver is to be determined by, e.g., outgoing <em><code>Connections</code></em> from the sender.</p> <br><br>senderArgument = argument(2)<br>payloadArgument = argument(1)<br>inputParameters()->size() >= 3<br>receiverArgument = argument(3)<br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::acceptSubactions')<br>specializesFromLibrary("Actions::sendActions")

description: <p>A <code>SendActionUsage</code> is an <code>ActionUsage</code> that specifies the sending of a payload given by the result of its <code>payloadArgument</code> <code>Expression</code> via a <em><code>MessageTransfer</code></em> whose <em><code>source</code></em> is given by the result of the <code>senderArgument</code> <code>Expression</code> and whose <code>target</code> is given by the result of the <code>receiverArgument</code> <code>Expression</code>. If no <code>senderArgument</code> is provided, the default is the <em><code>this</code></em> context for the action. If no <code>receiverArgument</code> is given, then the receiver is to be determined by, e.g., outgoing <em><code>Connections</code></em> from the sender.</p> <br><br>senderArgument = argument(2)<br>payloadArgument = argument(1)<br>inputParameters()->size() >= 3<br>receiverArgument = argument(3)<br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::acceptSubactions')<br>specializesFromLibrary("Actions::sendActions")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:receiverArgument](https://www.omg.org/spec/SysML/20230201/vocab#receiverArgument)| [0..1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>An <code>Expression<code> whose <code>result</code> is bound to the <em><code>receiver</code></em> input <code>parameter</code> of this <code>AcceptActionUsage</code>.</p> <br>| <p>An <code>Expression</code> whose result is bound to the <em><code>receiver</code></em> input parameter of this <code>SendActionUsage</code>.</p> <br>|
| [sysml_vocab:payloadArgument](https://www.omg.org/spec/SysML/20230201/vocab#payloadArgument)| [1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>An <code>Expression<code> whose <code>result</code> is bound to the <code><em>payload</em></code> <code>parameter </code> of this <code>AcceptActionUsage</code>. If provided, the <code>AcceptActionUsage</code> will only accept a <code><em>Transfer</em></code> with exactly this <code><em>payload</em></code>.</p> <br>| <p>An <code>Expression</code> whose result is bound to the <code><em>payload</em></code> input parameter of this <code>SendActionUsage</code>.</p> <br>|
| [sysml_vocab:senderArgument](https://www.omg.org/spec/SysML/20230201/vocab#senderArgument)| [0..1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>An <code>Expression</code> whose result is bound to the <em><code>sender</code></em> input parameter of this <code>SendActionUsage</code>.</p> <br>| <p>An <code>Expression</code> whose result is bound to the <em><code>sender</code></em> input parameter of this <code>SendActionUsage</code>.</p> <br>|



### MembershipImport

URI: https://www.omg.org/spec/SysML/20230201/shapes#MembershipImport

type: Shape

target class: [sysml_vocab:MembershipImport](https://www.omg.org/spec/SysML/20230201/vocab#MembershipImport)

definition of vocabulary class : <p>A MembershipImport is an Import that imports its <code>importedMembership</code> into the <code>importOwningNamespace</code>. If <code>isRecursive = true</code> and the <code>memberElement</code> of the <code>importedMembership</code> is a Namespace, then the equivalent of a recursive NamespaceImport is also performed on that Namespace.</p><br>importedElement = importedMembership.memberElement

description: <p>A MembershipImport is an Import that imports its <code>importedMembership</code> into the <code>importOwningNamespace</code>. If <code>isRecursive = true</code> and the <code>memberElement</code> of the <code>importedMembership</code> is a Namespace, then the equivalent of a recursive NamespaceImport is also performed on that Namespace.</p><br>importedElement = importedMembership.memberElement

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:importedMembership](https://www.omg.org/spec/SysML/20230201/vocab#importedMembership)| [1]| [sysml_vocab:Membership](https://www.omg.org/spec/SysML/20230201/vocab#Membership)| <p>The Membership to be imported.</p>| <p>The Membership to be imported.</p>|



### ConcernDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#ConcernDefinition

type: Shape

target class: [sysml_vocab:ConcernDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ConcernDefinition)

definition of vocabulary class : <p>A ConcernDefinition is a RequirementDefinition that one or more stakeholders may be interested in having addressed. These stakeholders are identified by the <code>ownedStakeholders</code>of the ConcernDefinition.</p><br><br><p>A ConcernDefinition must subclass, directly or indirectly, the base ConcernDefinition <em>ConcernCheck</em> from the Systems model library. The <code>ownedStakeholder</code> features of a ConcernDefinition shall all subset the <em><code>ConcernCheck::concernedStakeholders</code></em> feature.</p><br>

description: <p>A ConcernDefinition is a RequirementDefinition that one or more stakeholders may be interested in having addressed. These stakeholders are identified by the <code>ownedStakeholders</code>of the ConcernDefinition.</p><br><br><p>A ConcernDefinition must subclass, directly or indirectly, the base ConcernDefinition <em>ConcernCheck</em> from the Systems model library. The <code>ownedStakeholder</code> features of a ConcernDefinition shall all subset the <em><code>ConcernCheck::concernedStakeholders</code></em> feature.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### CalculationUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#CalculationUsage

type: Shape

target class: [sysml_vocab:CalculationUsage](https://www.omg.org/spec/SysML/20230201/vocab#CalculationUsage)

definition of vocabulary class : <p>A <code>CalculationUsage</code> is an <code>ActionUsage<code> that is also an <code>Expression</code>, and, so, is typed by a <code>Function</code>. Nominally, if the <code>type</code> is a <code>CalculationDefinition</code>, a <code>CalculationUsage</code> is a <code>Usage</code> of that <code>CalculationDefinition</code> within a system. However, other kinds of kernel <code>Functions</code> are also allowed, to permit use of <code>Functions</code> from the Kernel Model Libraries.</p><br>specializesFromLibrary('Calculations::calculations')<br>owningType <> null and<br>(owningType.oclIsKindOf(CalculationDefinition) or<br> owningType.oclIsKindOf(CalculationUsage)) implies<br>    specializesFromLibrary('Calculations::Calculation::subcalculations')

description: <p>A <code>CalculationUsage</code> is an <code>ActionUsage<code> that is also an <code>Expression</code>, and, so, is typed by a <code>Function</code>. Nominally, if the <code>type</code> is a <code>CalculationDefinition</code>, a <code>CalculationUsage</code> is a <code>Usage</code> of that <code>CalculationDefinition</code> within a system. However, other kinds of kernel <code>Functions</code> are also allowed, to permit use of <code>Functions</code> from the Kernel Model Libraries.</p><br>specializesFromLibrary('Calculations::calculations')<br>owningType <> null and<br>(owningType.oclIsKindOf(CalculationDefinition) or<br> owningType.oclIsKindOf(CalculationUsage)) implies<br>    specializesFromLibrary('Calculations::Calculation::subcalculations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:calculationDefinition](https://www.omg.org/spec/SysML/20230201/vocab#calculationDefinition)| [0..1]| [sysml_vocab:Function](https://www.omg.org/spec/SysML/20230201/vocab#Function)| <p>The <ode>Function</code> that is the <code>type</code> of this <code>CalculationUsage</code>. Nominally, this would be a <code>CalculationDefinition</code>, but a kernel <code>Function</code> is also allowed, to permit use of <code>Functions</code> from the Kernel Model Libraries.</p>| <p>The <ode>Function</code> that is the <code>type</code> of this <code>CalculationUsage</code>. Nominally, this would be a <code>CalculationDefinition</code>, but a kernel <code>Function</code> is also allowed, to permit use of <code>Functions</code> from the Kernel Model Libraries.</p>|



### Invariant

URI: https://www.omg.org/spec/SysML/20230201/shapes#Invariant

type: Shape

target class: [sysml_vocab:Invariant](https://www.omg.org/spec/SysML/20230201/vocab#Invariant)

definition of vocabulary class : <p>An Invariant is a BooleanExpression that is asserted to have a specific Boolean result value. If <code>isNegated = false</code>, then the Invariant must subset, directly or indirectly, the BooleanExpression <em>trueEvaluations</em> from the Kernel library, meaning that the result is asserted to be true. If <code>isNegated = true</code>, then the Invariant must subset, directly or indirectly, the BooleanExpression <em>falseEvaluations</em> from the Kernel library, meaning that the result is asserted to be false.</p><br><br>if isNegated then<br>    specializesFromLibrary("Performances::falseEvaluations")<br>else<br>    specializesFromLibrary("Performances::trueEvaluations")<br>endif

description: <p>An Invariant is a BooleanExpression that is asserted to have a specific Boolean result value. If <code>isNegated = false</code>, then the Invariant must subset, directly or indirectly, the BooleanExpression <em>trueEvaluations</em> from the Kernel library, meaning that the result is asserted to be true. If <code>isNegated = true</code>, then the Invariant must subset, directly or indirectly, the BooleanExpression <em>falseEvaluations</em> from the Kernel library, meaning that the result is asserted to be false.</p><br><br>if isNegated then<br>    specializesFromLibrary("Performances::falseEvaluations")<br>else<br>    specializesFromLibrary("Performances::trueEvaluations")<br>endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:isNegated](https://www.omg.org/spec/SysML/20230201/vocab#isNegated)| [1]| Boolean| <p>Whether this Invariant is asserted to be false rather than true.</p>| <p>Whether this Invariant is asserted to be false rather than true.</p>|



### ForkNode

URI: https://www.omg.org/spec/SysML/20230201/shapes#ForkNode

type: Shape

target class: [sysml_vocab:ForkNode](https://www.omg.org/spec/SysML/20230201/vocab#ForkNode)

definition of vocabulary class : <p>A <code>ForkNode</code> is a <code>ControlNode</code> that must be followed by successor <code>Actions</code> as given by all its outgoing <code>Successions</code>.</p><br>targetConnector->selectByKind(Succession)->size() <= 1<br>specializesFromLibrary("Actions::Action::forks")

description: <p>A <code>ForkNode</code> is a <code>ControlNode</code> that must be followed by successor <code>Actions</code> as given by all its outgoing <code>Successions</code>.</p><br>targetConnector->selectByKind(Succession)->size() <= 1<br>specializesFromLibrary("Actions::Action::forks")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### MetadataUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#MetadataUsage

type: Shape

target class: [sysml_vocab:MetadataUsage](https://www.omg.org/spec/SysML/20230201/vocab#MetadataUsage)

definition of vocabulary class : <p>An MetadataUsage is a Usage and a MetadataFeature, used to annotate other Elements in a system model with metadata. As a MetadataFeature, its type must be a Metaclass, which will nominally be a MetadataDefinition. However, any Kernel Metaclass is also allowed, to permit use of Metaclasses from the Kernel Library.</p><br><br><p>A MetadataUsage must subset, directly or indirectly, the base MetadataUsage <code>metadataItems</code> from the Systems model library.</p>

description: <p>An MetadataUsage is a Usage and a MetadataFeature, used to annotate other Elements in a system model with metadata. As a MetadataFeature, its type must be a Metaclass, which will nominally be a MetadataDefinition. However, any Kernel Metaclass is also allowed, to permit use of Metaclasses from the Kernel Library.</p><br><br><p>A MetadataUsage must subset, directly or indirectly, the base MetadataUsage <code>metadataItems</code> from the Systems model library.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:metadataDefinition](https://www.omg.org/spec/SysML/20230201/vocab#metadataDefinition)| [0..1]| [sysml_vocab:Metaclass](https://www.omg.org/spec/SysML/20230201/vocab#Metaclass)| n/a| n/a|



### SuccessionItemFlow

URI: https://www.omg.org/spec/SysML/20230201/shapes#SuccessionItemFlow

type: Shape

target class: [sysml_vocab:SuccessionItemFlow](https://www.omg.org/spec/SysML/20230201/vocab#SuccessionItemFlow)

definition of vocabulary class : <p>A SuccessionItemFlow is an ItemFlow that also provides temporal ordering. It classifies <em>Transfers</em> that cannot start until the source <em>Occurrence</em> has completed and that must complete before the target <em>Occurrence</em> can start.</p><br><br><p>A SuccessionItemFlow must be typed by the Interaction <em>TransferBefore</em> from the Kernel Library, or a specialization of it.</p><br><br>specializesFromLibrary("Transfers::flowTransfersBefore")

description: <p>A SuccessionItemFlow is an ItemFlow that also provides temporal ordering. It classifies <em>Transfers</em> that cannot start until the source <em>Occurrence</em> has completed and that must complete before the target <em>Occurrence</em> can start.</p><br><br><p>A SuccessionItemFlow must be typed by the Interaction <em>TransferBefore</em> from the Kernel Library, or a specialization of it.</p><br><br>specializesFromLibrary("Transfers::flowTransfersBefore")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Association

URI: https://www.omg.org/spec/SysML/20230201/shapes#Association

type: Shape

target class: [sysml_vocab:Association](https://www.omg.org/spec/SysML/20230201/vocab#Association)

definition of vocabulary class : <p>An Association is a Relationship and a Classifier to enable classification of links between things (in the universe). The co-domains (<code>types</code>) of the <code>associationEnd</code> Features are the <code>relatedTypes</code>, as co-domain and participants (linked things) of an Association identify each other.</p><br><br>relatedTypes = associationEnd.type<br>specializesFromLibrary("Links::Link")<br>oclIsKindOf(Structure) = oclIsKindOf(AssociationStructure)<br>ownedEndFeature->size() = 2 implies<br>    specializesFromLibrary("Links::BinaryLink)<br>not isAbstract implies relatedType->size() >= 2<br>associationEnds->size() > 2 implies<br>    not specializesFromLibrary("Links::BinaryLink")

description: <p>An Association is a Relationship and a Classifier to enable classification of links between things (in the universe). The co-domains (<code>types</code>) of the <code>associationEnd</code> Features are the <code>relatedTypes</code>, as co-domain and participants (linked things) of an Association identify each other.</p><br><br>relatedTypes = associationEnd.type<br>specializesFromLibrary("Links::Link")<br>oclIsKindOf(Structure) = oclIsKindOf(AssociationStructure)<br>ownedEndFeature->size() = 2 implies<br>    specializesFromLibrary("Links::BinaryLink)<br>not isAbstract implies relatedType->size() >= 2<br>associationEnds->size() > 2 implies<br>    not specializesFromLibrary("Links::BinaryLink")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:relatedType](https://www.omg.org/spec/SysML/20230201/vocab#relatedType)| [0..*]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The <code>types</code> of the <code>associationEnds</code> of the Association, which are the <code>relatedElements</code> of the Association considered as a Relationship.</p><br>| <p>The <code>types</code> of the <code>associationEnds</code> of the Association, which are the <code>relatedElements</code> of the Association considered as a Relationship.</p><br>|
| [sysml_vocab:sourceType](https://www.omg.org/spec/SysML/20230201/vocab#sourceType)| [0..1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The source <code>relatedType</code> for this Association. It is the first <code>relatedType</code> of the Association.</p><br>| <p>The source <code>relatedType</code> for this Association. It is the first <code>relatedType</code> of the Association.</p><br>|
| [sysml_vocab:targetType](https://www.omg.org/spec/SysML/20230201/vocab#targetType)| [0..*]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The target <code>relatedTypes</code> for this Association. This includes all the <code>relatedTypes</code> other than the <code>sourceType</code>.</p> <br>| <p>The target <code>relatedTypes</code> for this Association. This includes all the <code>relatedTypes</code> other than the <code>sourceType</code>.</p> <br>|
| [sysml_vocab:associationEnd](https://www.omg.org/spec/SysML/20230201/vocab#associationEnd)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>features</code> of the Association that identify the things that can be related by it. A concrete Association must have at least two <code>associationEnds</code>. When it has exactly two, the Association is called a <em>binary</em> Association.</p> <br><br><p>The ends of the Association determine which elements are eligible to be related by instances of the Association.</p><br>| <p>The <code>features</code> of the Association that identify the things that can be related by it. A concrete Association must have at least two <code>associationEnds</code>. When it has exactly two, the Association is called a <em>binary</em> Association.</p> <br><br><p>The ends of the Association determine which elements are eligible to be related by instances of the Association.</p><br>|



### Feature

URI: https://www.omg.org/spec/SysML/20230201/shapes#Feature

type: Shape

target class: [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)

definition of vocabulary class : <p>A Feature is a Type that classifies sequences of multiple things (in the universe). These must concatenate a sequence drawn from the intersection of the Feature&#39;s <code>featuringTypes</code> (<em>domain</em>) with a sequence drawn from the intersection of its <code>types</code> (<em>co-domain</em>), treating (co)domains as sets of sequences. The domain of Features that do not have any <code>featuringTypes</code> is the same as if it were the library Type Anything. A Feature&#39;s <code>types</code> include at least Anything, which can be narrowed to other Classifiers by Redefinition.</p><br><br><p>In the simplest cases, a Feature&#39;s <code>featuringTypes</code> and <code>types</code> are Classifiers, its sequences being pairs (length = 2), with the first element drawn from the Feature&#39;s domain and the second element from its co-domain (the Feature &quot;value&quot;). Examples include cars paired with wheels, people paired with other people, and cars paired with numbers&nbsp;representing the car length.</p><br><br><p>Since Features are Types, their <code>featuringTypes</code> and <code>types</code> can be Features. When both are, Features classify sequences of at least four elements (length &gt; 3), otherwise at least three (length &gt; 2). The <code>featuringTypes</code> of <em>nested</em> Features are Features.</p><br><br><p>The values of a Feature with <code>chainingFeatures</code> are the same as values of the last Feature in the chain, which can be found by starting with values of the first Feature, then from those values to values of the second feature, and so on, to values of the last feature.</p><br><br>ownedRedefinition = ownedSubsetting->selectByKind(Redefinition)<br>ownedTypeFeaturing = ownedRelationship->selectByKind(TypeFeaturing)-><br>    select(tf | tf.featureOfType = self)<br>ownedSubsetting = ownedGeneralization->selectByKind(Subsetting)<br>isComposite = owningFeatureMembership <> null and owningFeatureMembership.isComposite<br>ownedTyping = ownedGeneralization->selectByKind(FeatureTyping)<br>type =<br>    if chainingFeature->notEmpty() then<br>        chainingFeature->last().type<br>    else<br>        ownedTyping.type-><br>            union(ownedSubsetting.subsettedFeature.type)-><br>            asOrderedSet()<br>    endif<br>isEnd = owningFeatureMembership <> null and owningFeatureMembership.oclIsKindOf(EndFeatureMembership)<br>multiplicity <> null implies multiplicity.featuringType = featuringType <br>specializesFromLibrary("Base::things")<br>chainingFeatures->excludes(self)<br>ownedFeatureChaining = ownedRelationship->selectByKind(FeatureChaining)<br>chainingFeature = ownedFeatureChaining.chainingFeature<br>chainingFeatures->size() <> 1<br>isEnd and owningType <> null implies<br>    let i : Integer = <br>        owningType.ownedFeature->select(isEnd) in<br>    owningType.ownedSpecialization.general-><br>        forAll(supertype |<br>            let ownedEndFeatures : Sequence(Feature) = <br>                supertype.ownedFeature->select(isEnd) in<br>            ownedEndFeatures->size() >= i implies<br>                redefines(ownedEndFeatures->at(i))<br>ownedMembership-><br>    selectByKind(FeatureValue)-><br>    forAll(fv | specializes(fv.value.result))<br>isEnd and owningType <> null and<br>owningType.oclIsKindOf(Association) implies<br>    specializesFromLibrary("Links::Link::participants")<br>isComposite and<br>ownedTyping.type->includes(oclIsKindOf(Structure)) and<br>owningType <> null and<br>(owningType.oclIsKindOf(Structure) or<br> owningType.type->includes(oclIsKindOf(Structure))) implies<br>    specializesFromLibrary("Occurrence::Occurrence::suboccurrences")<br>owningType <> null and<br>(owningType.oclIsKindOf(LiteralExpression) or<br> owningType.oclIsKindOf(FeatureReferenceExpression)) implies<br>    if owningType.oclIsKindOf(LiteralString) then<br>        specializesFromLibrary("ScalarValues::String")<br>    else if owningType.oclIsKindOf(LiteralBoolean) then<br>        specializesFromLibrary("ScalarValues::Boolean")<br>    else if owningType.oclIsKindOf(LiteralInteger) then<br>        specializesFromLibrary("ScalarValues::Rational")<br>    else if owningType.oclIsKindOf(LiteralBoolean) then<br>        specializesFromLibrary("ScalarValues::Rational")<br>    else if owningType.oclIsKindOf(LiteralBoolean) then<br>        specializesFromLibrary("ScalarValues::Real")<br>    else specializes(<br>        owningType.oclAsType(FeatureReferenceExpression).referent)<br>    endif endif endif endif endif<br><br>ownedTyping.type->exists(selectByKind(Class)) implies<br>    specializesFromLibrary("Occurrences::occurrences")<br>isComposite and<br>ownedTyping.type->includes(oclIsKindOf(Class)) and<br>owningType <> null and<br>(owningType.oclIsKindOf(Class) or<br> owningType.oclIsKindOf(Feature) and<br>    owningType.oclAsType(Feature).type-><br>        exists(oclIsKindOf(Class))) implies<br>    specializesFromLibrary("Occurrence::Occurrence::suboccurrences")<br>ownedTyping.type->exists(selectByKind(DataType)) implies<br>    specializesFromLibary("Base::dataValues")<br>owningType <> null and<br>owningType.oclIsKindOf(ItemFlowEnd) and<br>owningType.ownedFeature->at(1) = self implies<br>    let flowType : Type = owningType.owningType in<br>    flowType <> null implies<br>        let i : Integer = <br>            flowType.ownedFeature.indexOf(owningType) in<br>        (i = 1 implies <br>            redefinesFromLibrary("Transfers::Transfer::source::sourceOutput")) and<br>        (i = 2 implies<br>            redefinesFromLibrary("Transfers::Transfer::source::targetInput"))<br>                 <br>owningType <> null and<br>(owningType.oclIsKindOf(Behavior) or<br> owningType.oclIsKindOf(Step)) implies<br>    let i : Integer = <br>        owningType.ownedFeature->select(direction <> null) in<br>    owningType.ownedSpecialization.general-><br>        forAll(supertype |<br>            let ownedParameters : Sequence(Feature) = <br>                supertype.ownedFeature->select(direction <> null) in<br>            ownedParameters->size() >= i implies<br>                redefines(ownedParameters->at(i))<br>ownedTyping.type->exists(selectByKind(Structure)) implies<br>    specializesFromLibary("Objects::objects")<br>owningType <> null and<br>(owningType.oclIsKindOf(Function) and<br>    self = owningType.oclAsType(Function).result or<br> owningType.oclIsKindOf(Expression) and<br>    self = owningType.oclAsType(Expression).result) implies<br>    owningType.ownedSpecialization.general-><br>        select(oclIsKindOf(Function) or oclIsKindOf(Expression))-><br>        forAll(supertype |<br>            redefines(<br>                if superType.oclIsKindOf(Function) then<br>                    superType.oclAsType(Function).result<br>                else<br>                    superType.oclAsType(Expression).result<br>                endif)<br>ownedRelationship->selectByKind(FeatureInverting)

description: <p>A Feature is a Type that classifies sequences of multiple things (in the universe). These must concatenate a sequence drawn from the intersection of the Feature&#39;s <code>featuringTypes</code> (<em>domain</em>) with a sequence drawn from the intersection of its <code>types</code> (<em>co-domain</em>), treating (co)domains as sets of sequences. The domain of Features that do not have any <code>featuringTypes</code> is the same as if it were the library Type Anything. A Feature&#39;s <code>types</code> include at least Anything, which can be narrowed to other Classifiers by Redefinition.</p><br><br><p>In the simplest cases, a Feature&#39;s <code>featuringTypes</code> and <code>types</code> are Classifiers, its sequences being pairs (length = 2), with the first element drawn from the Feature&#39;s domain and the second element from its co-domain (the Feature &quot;value&quot;). Examples include cars paired with wheels, people paired with other people, and cars paired with numbers&nbsp;representing the car length.</p><br><br><p>Since Features are Types, their <code>featuringTypes</code> and <code>types</code> can be Features. When both are, Features classify sequences of at least four elements (length &gt; 3), otherwise at least three (length &gt; 2). The <code>featuringTypes</code> of <em>nested</em> Features are Features.</p><br><br><p>The values of a Feature with <code>chainingFeatures</code> are the same as values of the last Feature in the chain, which can be found by starting with values of the first Feature, then from those values to values of the second feature, and so on, to values of the last feature.</p><br><br>ownedRedefinition = ownedSubsetting->selectByKind(Redefinition)<br>ownedTypeFeaturing = ownedRelationship->selectByKind(TypeFeaturing)-><br>    select(tf | tf.featureOfType = self)<br>ownedSubsetting = ownedGeneralization->selectByKind(Subsetting)<br>isComposite = owningFeatureMembership <> null and owningFeatureMembership.isComposite<br>ownedTyping = ownedGeneralization->selectByKind(FeatureTyping)<br>type =<br>    if chainingFeature->notEmpty() then<br>        chainingFeature->last().type<br>    else<br>        ownedTyping.type-><br>            union(ownedSubsetting.subsettedFeature.type)-><br>            asOrderedSet()<br>    endif<br>isEnd = owningFeatureMembership <> null and owningFeatureMembership.oclIsKindOf(EndFeatureMembership)<br>multiplicity <> null implies multiplicity.featuringType = featuringType <br>specializesFromLibrary("Base::things")<br>chainingFeatures->excludes(self)<br>ownedFeatureChaining = ownedRelationship->selectByKind(FeatureChaining)<br>chainingFeature = ownedFeatureChaining.chainingFeature<br>chainingFeatures->size() <> 1<br>isEnd and owningType <> null implies<br>    let i : Integer = <br>        owningType.ownedFeature->select(isEnd) in<br>    owningType.ownedSpecialization.general-><br>        forAll(supertype |<br>            let ownedEndFeatures : Sequence(Feature) = <br>                supertype.ownedFeature->select(isEnd) in<br>            ownedEndFeatures->size() >= i implies<br>                redefines(ownedEndFeatures->at(i))<br>ownedMembership-><br>    selectByKind(FeatureValue)-><br>    forAll(fv | specializes(fv.value.result))<br>isEnd and owningType <> null and<br>owningType.oclIsKindOf(Association) implies<br>    specializesFromLibrary("Links::Link::participants")<br>isComposite and<br>ownedTyping.type->includes(oclIsKindOf(Structure)) and<br>owningType <> null and<br>(owningType.oclIsKindOf(Structure) or<br> owningType.type->includes(oclIsKindOf(Structure))) implies<br>    specializesFromLibrary("Occurrence::Occurrence::suboccurrences")<br>owningType <> null and<br>(owningType.oclIsKindOf(LiteralExpression) or<br> owningType.oclIsKindOf(FeatureReferenceExpression)) implies<br>    if owningType.oclIsKindOf(LiteralString) then<br>        specializesFromLibrary("ScalarValues::String")<br>    else if owningType.oclIsKindOf(LiteralBoolean) then<br>        specializesFromLibrary("ScalarValues::Boolean")<br>    else if owningType.oclIsKindOf(LiteralInteger) then<br>        specializesFromLibrary("ScalarValues::Rational")<br>    else if owningType.oclIsKindOf(LiteralBoolean) then<br>        specializesFromLibrary("ScalarValues::Rational")<br>    else if owningType.oclIsKindOf(LiteralBoolean) then<br>        specializesFromLibrary("ScalarValues::Real")<br>    else specializes(<br>        owningType.oclAsType(FeatureReferenceExpression).referent)<br>    endif endif endif endif endif<br><br>ownedTyping.type->exists(selectByKind(Class)) implies<br>    specializesFromLibrary("Occurrences::occurrences")<br>isComposite and<br>ownedTyping.type->includes(oclIsKindOf(Class)) and<br>owningType <> null and<br>(owningType.oclIsKindOf(Class) or<br> owningType.oclIsKindOf(Feature) and<br>    owningType.oclAsType(Feature).type-><br>        exists(oclIsKindOf(Class))) implies<br>    specializesFromLibrary("Occurrence::Occurrence::suboccurrences")<br>ownedTyping.type->exists(selectByKind(DataType)) implies<br>    specializesFromLibary("Base::dataValues")<br>owningType <> null and<br>owningType.oclIsKindOf(ItemFlowEnd) and<br>owningType.ownedFeature->at(1) = self implies<br>    let flowType : Type = owningType.owningType in<br>    flowType <> null implies<br>        let i : Integer = <br>            flowType.ownedFeature.indexOf(owningType) in<br>        (i = 1 implies <br>            redefinesFromLibrary("Transfers::Transfer::source::sourceOutput")) and<br>        (i = 2 implies<br>            redefinesFromLibrary("Transfers::Transfer::source::targetInput"))<br>                 <br>owningType <> null and<br>(owningType.oclIsKindOf(Behavior) or<br> owningType.oclIsKindOf(Step)) implies<br>    let i : Integer = <br>        owningType.ownedFeature->select(direction <> null) in<br>    owningType.ownedSpecialization.general-><br>        forAll(supertype |<br>            let ownedParameters : Sequence(Feature) = <br>                supertype.ownedFeature->select(direction <> null) in<br>            ownedParameters->size() >= i implies<br>                redefines(ownedParameters->at(i))<br>ownedTyping.type->exists(selectByKind(Structure)) implies<br>    specializesFromLibary("Objects::objects")<br>owningType <> null and<br>(owningType.oclIsKindOf(Function) and<br>    self = owningType.oclAsType(Function).result or<br> owningType.oclIsKindOf(Expression) and<br>    self = owningType.oclAsType(Expression).result) implies<br>    owningType.ownedSpecialization.general-><br>        select(oclIsKindOf(Function) or oclIsKindOf(Expression))-><br>        forAll(supertype |<br>            redefines(<br>                if superType.oclIsKindOf(Function) then<br>                    superType.oclAsType(Function).result<br>                else<br>                    superType.oclAsType(Expression).result<br>                endif)<br>ownedRelationship->selectByKind(FeatureInverting)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:isUnique](https://www.omg.org/spec/SysML/20230201/vocab#isUnique)| [1]| Boolean| <p>Whether or not values for this Feature must have no duplicates or not.</p><br>| <p>Whether or not values for this Feature must have no duplicates or not.</p><br>|
| [sysml_vocab:isOrdered](https://www.omg.org/spec/SysML/20230201/vocab#isOrdered)| [1]| Boolean| <p>Whether an order exists for the values of this Feature or not.</p>| <p>Whether an order exists for the values of this Feature or not.</p>|
| [sysml_vocab:isComposite](https://www.omg.org/spec/SysML/20230201/vocab#isComposite)| [1]| Boolean| <p>Whether the Feature is a composite <code>feature</code> of its <code>featuringType</code>. If so, the values of the Feature cannot exist after the instance of the <code>featuringType</code> no longer does.</p><br>| <p>Whether the Feature is a composite <code>feature</code> of its <code>featuringType</code>. If so, the values of the Feature cannot exist after the instance of the <code>featuringType</code> no longer does.</p><br>|
| [sysml_vocab:isEnd](https://www.omg.org/spec/SysML/20230201/vocab#isEnd)| [1]| Boolean| <p>Whether or not the this Feature is an end Feature, requiring a different interpretation of the <code>multiplicity</code> of the Feature.</p><br><br><p>An end Feature is always considered to map each domain entity to a single co-domain entity, whether or not a Multiplicity is given for it. If a Multiplicity is given for an end Feature, rather than giving the co-domain cardinality for the Feature as usual, it specifies a cardinality constraint for <em>navigating</em> across the <code>endFeatures</code> of the <code>featuringType</code> of the end Feature. That is, if a Type has <em>n</em> <code>endFeatures</code>, then the Multiplicity of any one of those end Features constrains the cardinality of the set of values of that Feature when the values of the other <em>n-1</em> end Features are held fixed.</p><br>| <p>Whether or not the this Feature is an end Feature, requiring a different interpretation of the <code>multiplicity</code> of the Feature.</p><br><br><p>An end Feature is always considered to map each domain entity to a single co-domain entity, whether or not a Multiplicity is given for it. If a Multiplicity is given for an end Feature, rather than giving the co-domain cardinality for the Feature as usual, it specifies a cardinality constraint for <em>navigating</em> across the <code>endFeatures</code> of the <code>featuringType</code> of the end Feature. That is, if a Type has <em>n</em> <code>endFeatures</code>, then the Multiplicity of any one of those end Features constrains the cardinality of the set of values of that Feature when the values of the other <em>n-1</em> end Features are held fixed.</p><br>|
| [sysml_vocab:isDerived](https://www.omg.org/spec/SysML/20230201/vocab#isDerived)| [1]| Boolean| <p>Whether the values of this Feature&nbsp;can always be computed from the values of other Features.</p><br>| <p>Whether the values of this Feature&nbsp;can always be computed from the values of other Features.</p><br>|
| [sysml_vocab:isReadOnly](https://www.omg.org/spec/SysML/20230201/vocab#isReadOnly)| [1]| Boolean| <p>Whether the values of this Feature can change over the lifetime of an instance of the domain.</p><br>| <p>Whether the values of this Feature can change over the lifetime of an instance of the domain.</p><br>|
| [sysml_vocab:isPortion](https://www.omg.org/spec/SysML/20230201/vocab#isPortion)| [1]| Boolean| <p>Whether the values of this Feature are contained in the space and time of instances of the Feature&#39;s domain.</p><br>| <p>Whether the values of this Feature are contained in the space and time of instances of the Feature&#39;s domain.</p><br>|
| [sysml_vocab:direction](https://www.omg.org/spec/SysML/20230201/vocab#direction)| [0..1]| String| <p>Determines how values of this Feature are determined or used (see FeatureDirectionKind).</p><br>| <p>Determines how values of this Feature are determined or used (see FeatureDirectionKind).</p><br>|
| [sysml_vocab:isNonunique](https://www.omg.org/spec/SysML/20230201/vocab#isNonunique)| [1]| Boolean| n/a| n/a|
| [sysml_vocab:owningFeatureMembership](https://www.omg.org/spec/SysML/20230201/vocab#owningFeatureMembership)| [0..1]| [sysml_vocab:FeatureMembership](https://www.omg.org/spec/SysML/20230201/vocab#FeatureMembership)| <p>The FeatureMembership that owns this Feature as an <code>ownedMemberFeature</code>, determining its <code>owningType</code>.</p>| <p>The FeatureMembership that owns this Feature as an <code>ownedMemberFeature</code>, determining its <code>owningType</code>.</p>|
| [sysml_vocab:owningType](https://www.omg.org/spec/SysML/20230201/vocab#owningType)| [0..1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The Type that is the <code>specific</code> Type of this Specialization and owns it as its <code>owningRelatedElement</code>.</p>| <p>The Type that is the <code>owningType</code> of the <code>owningFeatureMembership</code> of this Type.</p>|
| [sysml_vocab:endOwningType](https://www.omg.org/spec/SysML/20230201/vocab#endOwningType)| [0..1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The Type that is related to this Feature by an EndFeatureMembership in which the Feature is an <code>ownedMemberFeature</code>.</p>| <p>The Type that is related to this Feature by an EndFeatureMembership in which the Feature is an <code>ownedMemberFeature</code>.</p>|
| [sysml_vocab:type](https://www.omg.org/spec/SysML/20230201/vocab#type)| [0..*]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The Type that is being applied by this FeatureTyping.</p><br>| <p>Types that restrict the values of this Feature, such that the values must be instances of all the types. The types of a Feature are derived from its <code>ownedFeatureTypings</code> and the <code>types</code> of its <code>ownedSubsettings</code>.</p><br>|
| [sysml_vocab:ownedRedefinition](https://www.omg.org/spec/SysML/20230201/vocab#ownedRedefinition)| [0..*]| [sysml_vocab:Redefinition](https://www.omg.org/spec/SysML/20230201/vocab#Redefinition)| <p>The <code>ownedSubsettings</code> of this Feature that are Redefinitions, for which the Feature is the <code>redefiningFeature</code>.</p><br><br>| <p>The <code>ownedSubsettings</code> of this Feature that are Redefinitions, for which the Feature is the <code>redefiningFeature</code>.</p><br><br>|
| [sysml_vocab:ownedSubsetting](https://www.omg.org/spec/SysML/20230201/vocab#ownedSubsetting)| [0..*]| [sysml_vocab:Subsetting](https://www.omg.org/spec/SysML/20230201/vocab#Subsetting)| <p>The <code>ownedGeneralizations</code> of this Feature that are Subsettings, for which the Feature is the <code>subsettingFeature</code>.</p><br>| <p>The <code>ownedGeneralizations</code> of this Feature that are Subsettings, for which the Feature is the <code>subsettingFeature</code>.</p><br>|
| [sysml_vocab:ownedTyping](https://www.omg.org/spec/SysML/20230201/vocab#ownedTyping)| [0..*]| [sysml_vocab:FeatureTyping](https://www.omg.org/spec/SysML/20230201/vocab#FeatureTyping)| <p>The <code>ownedGeneralizations</code> of this Feature that are FeatureTypings, for which the Feature is the <code>typedFeature</code>.</p>| <p>The <code>ownedGeneralizations</code> of this Feature that are FeatureTypings, for which the Feature is the <code>typedFeature</code>.</p>|
| [sysml_vocab:featuringType](https://www.omg.org/spec/SysML/20230201/vocab#featuringType)| [0..*]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The Type that features the <code>featureOfType</code>. It is the <code>target</code> of the Relationship.</p>| <p>Types that feature this Feature, such that any instance in the domain of the Feature must be classified by all of these Types, including at least all the <code>featuringTypes</code> of its <code>ownedTypeFeaturings</code>.</p>|
| [sysml_vocab:ownedTypeFeaturing](https://www.omg.org/spec/SysML/20230201/vocab#ownedTypeFeaturing)| [0..*]| [sysml_vocab:TypeFeaturing](https://www.omg.org/spec/SysML/20230201/vocab#TypeFeaturing)| <p>The <code>ownedRelationships</code> of this Feature that are TypeFeaturings, for which the Feature is the <code>featureOfType</code>.</p>| <p>The <code>ownedRelationships</code> of this Feature that are TypeFeaturings, for which the Feature is the <code>featureOfType</code>.</p>|
| [sysml_vocab:chainingFeature](https://www.omg.org/spec/SysML/20230201/vocab#chainingFeature)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Feature whose values partly determine values of <code>featureChained</code>, as described in <code>Feature::chainingFeature</code>.</p>| <p>The Features that are chained together to determine the values of this Feature, derived from the <code>chainingFeatures</code> of the <code>ownedFeatureChainings</code> of this Feature, in the same order. The values of a Feature with chainingFeatures are the same as values of the last Feature in the chain, which can be found by starting with the values of the first Feature (for each instance of the original Feature's domain), then on each of those to the values of the second Feature in chainingFeatures, and so on, to values of the last Feature. The Features related to a Feature by a FeatureChaining are identified as its chainingFeatures.</p>|
| [sysml_vocab:ownedFeatureInverting](https://www.omg.org/spec/SysML/20230201/vocab#ownedFeatureInverting)| [0..*]| [sysml_vocab:FeatureInverting](https://www.omg.org/spec/SysML/20230201/vocab#FeatureInverting)| <p>The <code>ownedRelationships</code> of this Feature that are FeatureInvertings, for which the Feature is the <code>featureInverted</code>.</p>| <p>The <code>ownedRelationships</code> of this Feature that are FeatureInvertings, for which the Feature is the <code>featureInverted</code>.</p>|
| [sysml_vocab:ownedFeatureChaining](https://www.omg.org/spec/SysML/20230201/vocab#ownedFeatureChaining)| [0..*]| [sysml_vocab:FeatureChaining](https://www.omg.org/spec/SysML/20230201/vocab#FeatureChaining)| <p>The FeatureChainings that are among the <code>ownedRelationships</owned> of this Feature (identify their <code>featureChained</code> also as an <code>owningRelatedElement</code>).</p>| <p>The FeatureChainings that are among the <code>ownedRelationships</owned> of this Feature (identify their <code>featureChained</code> also as an <code>owningRelatedElement</code>).</p>|
| [sysml_vocab:ownedReferenceSubsetting](https://www.omg.org/spec/SysML/20230201/vocab#ownedReferenceSubsetting)| [0..1]| [sysml_vocab:ReferenceSubsetting](https://www.omg.org/spec/SysML/20230201/vocab#ReferenceSubsetting)| <p>The one <code>ownedSubsetting</code> of this Feature, if any, that is a ReferenceSubsetting, for which the Feature is the <code>referencingFeature</code>.</p>| <p>The one <code>ownedSubsetting</code> of this Feature, if any, that is a ReferenceSubsetting, for which the Feature is the <code>referencingFeature</code>.</p>|



### CaseUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#CaseUsage

type: Shape

target class: [sysml_vocab:CaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#CaseUsage)

definition of vocabulary class : <p>A CaseUsage is a Usage of a CaseDefinition.</p><br><br><p>A CaseUsage must subset, directly or indirectly, the base CaseUsage <em><code>cases</code></em> from the Systems model library. If it is owned by a CaseDefinition or CaseUsage, it must subset the CaseUsage <em><code>Cases::subcases</code></em>.</p>

description: <p>A CaseUsage is a Usage of a CaseDefinition.</p><br><br><p>A CaseUsage must subset, directly or indirectly, the base CaseUsage <em><code>cases</code></em> from the Systems model library. If it is owned by a CaseDefinition or CaseUsage, it must subset the CaseUsage <em><code>Cases::subcases</code></em>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:objectiveRequirement](https://www.omg.org/spec/SysML/20230201/vocab#objectiveRequirement)| [0..1]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The <code>ownedFeature</code> of this CaseDefinition that is owned via an ObjectiveMembership, and that must redefine, directly or indirectly, the <code>objective</code> RequirementUsage of the base CaseDefinition Case from the Systems model library.</p> <br>| <p>The <code>ownedFeature</code> of this CaseUsage that is owned via an ObjectiveMembership, and that must redefine, directly or indirectly, the <code>objective</code> RequirementUsage of the base CaseDefinition Case from the Systems model library.</p> <br>|
| [sysml_vocab:caseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#caseDefinition)| [0..1]| [sysml_vocab:CaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#CaseDefinition)| <p>The CaseDefinition that is the type of this CaseUsage.</p>| <p>The CaseDefinition that is the type of this CaseUsage.</p>|
| [sysml_vocab:subjectParameter](https://www.omg.org/spec/SysML/20230201/vocab#subjectParameter)| [1]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>parameter</code> of this RequirementUsage that is owned via a SubjectMembership, which must redefine, directly or indirectly, the <code>subject</code> parameter of the base RequirementDefinition RequirementCheck from the Systems model library.</p>| <p>The <code>parameter</code> of this CaseUsage that is owned via a SubjectMembership, which must redefine, directly or indirectly, the <code>subject</code> parameter of the base CaseDefinition Case from the Systems model library.</p><br>|
| [sysml_vocab:actorParameter](https://www.omg.org/spec/SysML/20230201/vocab#actorParameter)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The <code>parameters</code> of this RequirementUsage that are owned via ActorMemberships, which must subset, directly or indirectly, the PartUsage <em><code>actors</code></em> of the base RequirementDefinition <em>RequirementCheck</em> from the Systems model library.</p>| <p>The <code>parameters</code> of this CaseUsage that are owned via ActorMemberships, which must subset, directly or indirectly, the PartUsage <em><code>actors</code></em> of the base CaseDefinition <em>Case</em> from the Systems model library.</p>|



### OperatorExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#OperatorExpression

type: Shape

target class: [sysml_vocab:OperatorExpression](https://www.omg.org/spec/SysML/20230201/vocab#OperatorExpression)

definition of vocabulary class : <p>An OperatorExpression is an InvocationExpression whose <code>function</code> is determined by resolving its <code>operator</code> in the context of one of the standard Function packages from the Kernel Model Library.</p><br>let libFunctions : Sequence(Element) = <br>    Sequence{"BaseFunctions", "DataFunctions", "ControlFunctions"}-><br>    collect(ns | resolveGlobal(ns + "::'" + operator + "'")) in<br>libFunctions->includes(function)<br>    <br>

description: <p>An OperatorExpression is an InvocationExpression whose <code>function</code> is determined by resolving its <code>operator</code> in the context of one of the standard Function packages from the Kernel Model Library.</p><br>let libFunctions : Sequence(Element) = <br>    Sequence{"BaseFunctions", "DataFunctions", "ControlFunctions"}-><br>    collect(ns | resolveGlobal(ns + "::'" + operator + "'")) in<br>libFunctions->includes(function)<br>    <br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:operator](https://www.omg.org/spec/SysML/20230201/vocab#operator)| [1]| String| <p>An operator symbol that names a corresponding Function from one of the standard Function packages from the Kernel Model Library .</p>| <p>An operator symbol that names a corresponding Function from one of the standard Function packages from the Kernel Model Library .</p>|
| [sysml_vocab:operand](https://www.omg.org/spec/SysML/20230201/vocab#operand)| [0..*]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| n/a| n/a|



### FeatureMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#FeatureMembership

type: Shape

target class: [sysml_vocab:FeatureMembership](https://www.omg.org/spec/SysML/20230201/vocab#FeatureMembership)

definition of vocabulary class : <p>FeatureMembership is an OwningMembership for a Feature in a Type that is also a Featuring Relationship between the Feature and the Type, in which the <code>featuringType</code> is the <code>source</code> and the <code>featureOfType</code> is the <code>target</code>. A FeatureMembership is always owned by its <code>owningType</code>, which is the <code>featuringType</code> for the FeatureMembership considered as a Featuring.</p><br>

description: <p>FeatureMembership is an OwningMembership for a Feature in a Type that is also a Featuring Relationship between the Feature and the Type, in which the <code>featuringType</code> is the <code>source</code> and the <code>featureOfType</code> is the <code>target</code>. A FeatureMembership is always owned by its <code>owningType</code>, which is the <code>featuringType</code> for the FeatureMembership considered as a Featuring.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:ownedMemberFeature](https://www.omg.org/spec/SysML/20230201/vocab#ownedMemberFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Feature that this FeatureMembership relates to its <code>owningType</code>, making it an <code>ownedFeature</code> of the <code>owningType</code>.</p>| <p>The Feature that this FeatureMembership relates to its <code>owningType</code>, making it an <code>ownedFeature</code> of the <code>owningType</code>.</p>|
| [sysml_vocab:owningType](https://www.omg.org/spec/SysML/20230201/vocab#owningType)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The Type that is the <code>specific</code> Type of this Specialization and owns it as its <code>owningRelatedElement</code>.</p>| <p>The Type that owns this FeatureMembership.</p>|



### Multiplicity

URI: https://www.omg.org/spec/SysML/20230201/shapes#Multiplicity

type: Shape

target class: [sysml_vocab:Multiplicity](https://www.omg.org/spec/SysML/20230201/vocab#Multiplicity)

definition of vocabulary class : <p>A <code>Multiplicity</code> is a <code>Feature>/code> whose co-domain is a set of natural numbers giving the allowed cardinalities of each <code>typeWithMultiplicity</code>. The <em>cardinality</em> of a <code>Type</code> is defined as follows, depending on whether the <code>Type</code> is a <code>Classifier</code> or <code>Feature</code>.<br><ul><br><li><code>Classifier/code> – The number of basic instances of the <code>Classifier</code>, that is, those instances representing things, which are not instances of any subtypes of the <code>Classifier</code> that are <code>Features</code>.<br><li><code>Features</code> – The number of instances with the same featuring instances. In the case of a <code>Feature</code> with a <code>Classifier</code> as its <code>featuringType</code>, this is the number of values of <code>Feature</code> for each basic instance of the <code>Classifier</code>. Note that, for non-unique <code>Features</code>, all duplicate values are included in this count.</li><br></ul><br><br><p><code>Multiplicity</code> co-domains (in models) can be specified by <code>Expression</code> that might vary in their results. If the <code>typeWithMultiplicity</code> is a <code>Classifier</code>, the domain of the <code>Multiplicity</code> shall be <em><code>Base::Anything</code></em>.  If the <code>typeWithMultiplicity</code> is a <code>Feature</code>,  the <code>Multiplicity</code> shall have the same domain as the <code>typeWithMultiplicity</code>.</p><br><br>if owningType <> null and owningType.oclIsKindOf(Feature) then<br>    featuringType = <br>        owningType.oclAsType(Feature).featuringType<br>else<br>    featuringType->isEmpty()<br>endif<br>specializesFromLibrary("Base::naturals")

description: <p>A <code>Multiplicity</code> is a <code>Feature>/code> whose co-domain is a set of natural numbers giving the allowed cardinalities of each <code>typeWithMultiplicity</code>. The <em>cardinality</em> of a <code>Type</code> is defined as follows, depending on whether the <code>Type</code> is a <code>Classifier</code> or <code>Feature</code>.<br><ul><br><li><code>Classifier/code> – The number of basic instances of the <code>Classifier</code>, that is, those instances representing things, which are not instances of any subtypes of the <code>Classifier</code> that are <code>Features</code>.<br><li><code>Features</code> – The number of instances with the same featuring instances. In the case of a <code>Feature</code> with a <code>Classifier</code> as its <code>featuringType</code>, this is the number of values of <code>Feature</code> for each basic instance of the <code>Classifier</code>. Note that, for non-unique <code>Features</code>, all duplicate values are included in this count.</li><br></ul><br><br><p><code>Multiplicity</code> co-domains (in models) can be specified by <code>Expression</code> that might vary in their results. If the <code>typeWithMultiplicity</code> is a <code>Classifier</code>, the domain of the <code>Multiplicity</code> shall be <em><code>Base::Anything</code></em>.  If the <code>typeWithMultiplicity</code> is a <code>Feature</code>,  the <code>Multiplicity</code> shall have the same domain as the <code>typeWithMultiplicity</code>.</p><br><br>if owningType <> null and owningType.oclIsKindOf(Feature) then<br>    featuringType = <br>        owningType.oclAsType(Feature).featuringType<br>else<br>    featuringType->isEmpty()<br>endif<br>specializesFromLibrary("Base::naturals")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### FeatureChaining

URI: https://www.omg.org/spec/SysML/20230201/shapes#FeatureChaining

type: Shape

target class: [sysml_vocab:FeatureChaining](https://www.omg.org/spec/SysML/20230201/vocab#FeatureChaining)

definition of vocabulary class : <p>FeatureChaining is a Relationship that makes its target Feature one of the <code>chainingFeatures</code> of its owning Feature.</p>

description: <p>FeatureChaining is a Relationship that makes its target Feature one of the <code>chainingFeatures</code> of its owning Feature.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:chainingFeature](https://www.omg.org/spec/SysML/20230201/vocab#chainingFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Feature whose values partly determine values of <code>featureChained</code>, as described in <code>Feature::chainingFeature</code>.</p>| <p>The Feature whose values partly determine values of <code>featureChained</code>, as described in <code>Feature::chainingFeature</code>.</p>|
| [sysml_vocab:featureChained](https://www.omg.org/spec/SysML/20230201/vocab#featureChained)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Feature whose values are partly determined by values of the <code>chainingFeature</code>, as described in <code>Feature::chainingFeature</code>.</p>| <p>The Feature whose values are partly determined by values of the <code>chainingFeature</code>, as described in <code>Feature::chainingFeature</code>.</p>|



### PortUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#PortUsage

type: Shape

target class: [sysml_vocab:PortUsage](https://www.omg.org/spec/SysML/20230201/vocab#PortUsage)

definition of vocabulary class : <p>A <code>PortUsage</code> is a usage of a <code>PortDefinition</code>. A <code>PortUsage<code> itself as well as all its <code>nestedUsages</code> must be referential (non-composite).</p><br><br><p>A <code>PortUsage</code> must specialize, directly or indirectly, the <code>PortUsage</code> <code><em>Ports::ports</em></code> from the Systems Model Library.</p><br>nestedUsage-><br>    select(not oclIsKindOf(PortUsage))-><br>    forAll(not isComposite)<br>specializesFromLibrary('Ports::ports')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(PortDefinition) or<br> owningType.oclIsKindOf(PortUsage)) implies<br>    specializesFromLibrary('Ports::Port::subport')<br>owningType = null or<br>not owningType.oclIsKindOf(PortDefinition) and<br>not owningType.oclIsKindOf(PortUsage) implies<br>    isReference

description: <p>A <code>PortUsage</code> is a usage of a <code>PortDefinition</code>. A <code>PortUsage<code> itself as well as all its <code>nestedUsages</code> must be referential (non-composite).</p><br><br><p>A <code>PortUsage</code> must specialize, directly or indirectly, the <code>PortUsage</code> <code><em>Ports::ports</em></code> from the Systems Model Library.</p><br>nestedUsage-><br>    select(not oclIsKindOf(PortUsage))-><br>    forAll(not isComposite)<br>specializesFromLibrary('Ports::ports')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(PortDefinition) or<br> owningType.oclIsKindOf(PortUsage)) implies<br>    specializesFromLibrary('Ports::Port::subport')<br>owningType = null or<br>not owningType.oclIsKindOf(PortDefinition) and<br>not owningType.oclIsKindOf(PortUsage) implies<br>    isReference

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:portDefinition](https://www.omg.org/spec/SysML/20230201/vocab#portDefinition)| [0..*]| [sysml_vocab:PortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#PortDefinition)| <p>The <code>originalPortDefinition</code> of the <code>conjugatedPortDefinition</code> of this ConjugatedPortTyping.</p>| <p>The <code>types</code> of this PortUsage, which must all be PortDefinitions.</p>|



### FeatureValue

URI: https://www.omg.org/spec/SysML/20230201/shapes#FeatureValue

type: Shape

target class: [sysml_vocab:FeatureValue](https://www.omg.org/spec/SysML/20230201/vocab#FeatureValue)

definition of vocabulary class : <p>A FeatureValue is a Membership that identifies a particular member Expression that provides the value of the Feature that owns the FeatureValue. The value is specified as either a bound value or an initial value, and as either a concrete or default value. A Feature can have at most one FeatureValue.</p><br><br><p>The result of the <code>value</code> expression is bound to the <code>featureWithValue</code> using a BindingConnector. If <code>isInitial = false</code>, then the <code>featuringType</code> of the BindingConnector is the same as the <code>featuringType</code> of the <code>featureWithValue</code>. If <code>isInitial = true</code>, then the <code>featuringType</code> of the BindingConnector is restricted to its <code>startShot</code>.<br><br><p>If <code>isDefault = false</code>, then the above semantics of the FeatureValue are realized for the given <code>featureWithValue</code>. Otherwise, the semantics are realized for any individual of the <code>featuringType</code> of the <code>featureWithValue</code>, unless another value is explicitly given for the <code>featureWithValue</code> for that individual.</p><br><br>not isDefault implies<br>    featureWithValue.ownedMember-><br>        selectByKind(BindingConnector)->exists(b |<br>            b.relatedFeature->includes(featureWithValue) and<br>            b.relatedFeature->includes(value.result) and<br>            if not isInitial then <br>                b.featuringType = featureWithValue.featuringType<br>            else <br>                b.featuringType->exists(t |<br>                    t.oclIsKindOf(Feature) and<br>                    t.oclAsType(Feature).chainingFeature =<br>                        Sequence{<br>                            resolveGlobal("Base::things::that"),<br>                            resolveGlobal("Occurrences::Occurrence::startShot")<br>                        }<br>                )<br>            endif)

description: <p>A FeatureValue is a Membership that identifies a particular member Expression that provides the value of the Feature that owns the FeatureValue. The value is specified as either a bound value or an initial value, and as either a concrete or default value. A Feature can have at most one FeatureValue.</p><br><br><p>The result of the <code>value</code> expression is bound to the <code>featureWithValue</code> using a BindingConnector. If <code>isInitial = false</code>, then the <code>featuringType</code> of the BindingConnector is the same as the <code>featuringType</code> of the <code>featureWithValue</code>. If <code>isInitial = true</code>, then the <code>featuringType</code> of the BindingConnector is restricted to its <code>startShot</code>.<br><br><p>If <code>isDefault = false</code>, then the above semantics of the FeatureValue are realized for the given <code>featureWithValue</code>. Otherwise, the semantics are realized for any individual of the <code>featuringType</code> of the <code>featureWithValue</code>, unless another value is explicitly given for the <code>featureWithValue</code> for that individual.</p><br><br>not isDefault implies<br>    featureWithValue.ownedMember-><br>        selectByKind(BindingConnector)->exists(b |<br>            b.relatedFeature->includes(featureWithValue) and<br>            b.relatedFeature->includes(value.result) and<br>            if not isInitial then <br>                b.featuringType = featureWithValue.featuringType<br>            else <br>                b.featuringType->exists(t |<br>                    t.oclIsKindOf(Feature) and<br>                    t.oclAsType(Feature).chainingFeature =<br>                        Sequence{<br>                            resolveGlobal("Base::things::that"),<br>                            resolveGlobal("Occurrences::Occurrence::startShot")<br>                        }<br>                )<br>            endif)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:isInitial](https://www.omg.org/spec/SysML/20230201/vocab#isInitial)| [1]| Boolean| <p>Whether this FeatureValue specifies a bound value or an initial value for the <code>featureWithValue</code>.</p>| <p>Whether this FeatureValue specifies a bound value or an initial value for the <code>featureWithValue</code>.</p>|
| [sysml_vocab:isDefault](https://www.omg.org/spec/SysML/20230201/vocab#isDefault)| [1]| Boolean| <p>Whether this FeatureValue is a concrete specification of the bound of initial value of the <code>featureWithValue</code>, or just a default value that may be overridden.</p>| <p>Whether this FeatureValue is a concrete specification of the bound of initial value of the <code>featureWithValue</code>, or just a default value that may be overridden.</p>|
| [sysml_vocab:featureWithValue](https://www.omg.org/spec/SysML/20230201/vocab#featureWithValue)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Feature to be provided a value.</p><br><br><p>The Feature to be provided a value.</p>| <p>The Feature to be provided a value.</p><br><br><p>The Feature to be provided a value.</p>|
| [sysml_vocab:value](https://www.omg.org/spec/SysML/20230201/vocab#value)| [1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The Expression that provides the value of the <code>featureWithValue</code> as its <code>result</code>.</p><br><br><p>The Expression that provides the value as a result.</p>| <p>The Expression that provides the value of the <code>featureWithValue</code> as its <code>result</code>.</p><br><br><p>The Expression that provides the value as a result.</p>|



### ActorMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#ActorMembership

type: Shape

target class: [sysml_vocab:ActorMembership](https://www.omg.org/spec/SysML/20230201/vocab#ActorMembership)

definition of vocabulary class : <p>An ActorMembership is a ParameterMembership that identifies a PartUsage as an actor parameter, which specifies a role played by an entity external in interaction with the parametered element.</p>

description: <p>An ActorMembership is a ParameterMembership that identifies a PartUsage as an actor parameter, which specifies a role played by an entity external in interaction with the parametered element.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:ownedActorParameter](https://www.omg.org/spec/SysML/20230201/vocab#ownedActorParameter)| [1]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The PartUsage specifying the actor.</p>| <p>The PartUsage specifying the actor.</p>|



### Class

URI: https://www.omg.org/spec/SysML/20230201/shapes#Class

type: Shape

target class: [sysml_vocab:Class](https://www.omg.org/spec/SysML/20230201/vocab#Class)

definition of vocabulary class : <p>A Class is a Classifier of things (in the universe) that can be distinguished without regard to how they are related to other things (via Features). This means multiple things classified by the same Class can be distinguished, even&nbsp;when they are related&nbsp;other things in exactly the same way.</p><br><br>specializesFromLibrary('Occurrences::Occurrence')<br>ownedGeneralization.general-><br>    forAll(not oclIsKindOf(DataType) and <br>           not oclIsKindOf(Association))

description: <p>A Class is a Classifier of things (in the universe) that can be distinguished without regard to how they are related to other things (via Features). This means multiple things classified by the same Class can be distinguished, even&nbsp;when they are related&nbsp;other things in exactly the same way.</p><br><br>specializesFromLibrary('Occurrences::Occurrence')<br>ownedGeneralization.general-><br>    forAll(not oclIsKindOf(DataType) and <br>           not oclIsKindOf(Association))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### VerificationCaseDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#VerificationCaseDefinition

type: Shape

target class: [sysml_vocab:VerificationCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#VerificationCaseDefinition)

definition of vocabulary class : <p>A VerificationCaseDefinition is a CaseDefinition for the purpose of verification of the subect of the case against its requirements.</p><br><br><p>A VerificationCaseDefinition must subclass, directly or indirectly, the base VerificationCaseDefinition VerificationCase from the Systems model library.</p>

description: <p>A VerificationCaseDefinition is a CaseDefinition for the purpose of verification of the subect of the case against its requirements.</p><br><br><p>A VerificationCaseDefinition must subclass, directly or indirectly, the base VerificationCaseDefinition VerificationCase from the Systems model library.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:verifiedRequirement](https://www.omg.org/spec/SysML/20230201/vocab#verifiedRequirement)| [0..*]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The RequirementUsages verified by this VerificationCaseUsage, derived as the <code>verifiedRequirements</code> of all RequirementVerificationMemberships of the <code>objectiveRequirement</code>.</p>| <p>The RequirementUsages verified by this VerificationCaseDefinition, derived as the <code>verifiedRequirements</code> of all RequirementVerificationMemberships of the <code>objectiveRequirement</code>.</p>|



### AttributeDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#AttributeDefinition

type: Shape

target class: [sysml_vocab:AttributeDefinition](https://www.omg.org/spec/SysML/20230201/vocab#AttributeDefinition)

definition of vocabulary class : <p>An <code>AttributeDefinition</code> is a <code>Definition</code> and a <code>DataType</code> of information about a quality or characteristic of a system or part of a system that has no independent identity other than its value. All <code>features</code> of an <code>AttributeDefinition</code>AttributeDefinition must be referential (non-composite).</p><br><br><p>As a <code>DataType</code>, an <code>AttributeDefinition</code> must specialize, directly or indirectly, the base <code>DataType</code> <code><em>Base::DataValue</em></code> from the Kernel Semantic Library.</p><br>feature->forAll(not isComposite)

description: <p>An <code>AttributeDefinition</code> is a <code>Definition</code> and a <code>DataType</code> of information about a quality or characteristic of a system or part of a system that has no independent identity other than its value. All <code>features</code> of an <code>AttributeDefinition</code>AttributeDefinition must be referential (non-composite).</p><br><br><p>As a <code>DataType</code>, an <code>AttributeDefinition</code> must specialize, directly or indirectly, the base <code>DataType</code> <code><em>Base::DataValue</em></code> from the Kernel Semantic Library.</p><br>feature->forAll(not isComposite)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### NamespaceExpose

URI: https://www.omg.org/spec/SysML/20230201/shapes#NamespaceExpose

type: Shape

target class: [sysml_vocab:NamespaceExpose](https://www.omg.org/spec/SysML/20230201/vocab#NamespaceExpose)

definition of vocabulary class : <p>A NamespaceExpose is an Expose relationship that exposes a;; the Memberships of a specific <code>importedNamespace</code> and, if <code>isRecursive = true</code>, additional Memberships recursively.</p>

description: <p>A NamespaceExpose is an Expose relationship that exposes a;; the Memberships of a specific <code>importedNamespace</code> and, if <code>isRecursive = true</code>, additional Memberships recursively.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Step

URI: https://www.omg.org/spec/SysML/20230201/shapes#Step

type: Shape

target class: [sysml_vocab:Step](https://www.omg.org/spec/SysML/20230201/vocab#Step)

definition of vocabulary class : <p>A Step is a Feature that is typed by one or more Behaviors. Steps may be used by one Behavior to coordinate the performance of other Behaviors, supporting the steady refinement of behavioral descriptions. Steps can be ordered in time and can be connected using ItemFlows to specify things flowing between their parameters.</p><br><br>allSupertypes()->includes(resolveGlobal("Performances::performances"))<br>owningType <> null and<br>    (owningType.oclIsKindOf(Behavior) or<br>     owningType.oclIsKindOf(Step)) implies<br>    specializesFromLibrary('Performances::Performance::enclosedPerformance')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(Structure) or<br> owningType.oclIsKindOf(Feature) and<br> owningType.oclAsType(Feature).type-><br>    exists(oclIsKindOf(Structure)) implies<br>    specializesFromLibrary('Objects::Object::ownedPerformance')<br>owningType <> null and<br>    (owningType.oclIsKindOf(Behavior) or<br>     owningType.oclIsKindOf(Step)) and<br>    self.isComposite implies<br>    specializesFromLibrary('Performances::Performance::subperformance')

description: <p>A Step is a Feature that is typed by one or more Behaviors. Steps may be used by one Behavior to coordinate the performance of other Behaviors, supporting the steady refinement of behavioral descriptions. Steps can be ordered in time and can be connected using ItemFlows to specify things flowing between their parameters.</p><br><br>allSupertypes()->includes(resolveGlobal("Performances::performances"))<br>owningType <> null and<br>    (owningType.oclIsKindOf(Behavior) or<br>     owningType.oclIsKindOf(Step)) implies<br>    specializesFromLibrary('Performances::Performance::enclosedPerformance')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(Structure) or<br> owningType.oclIsKindOf(Feature) and<br> owningType.oclAsType(Feature).type-><br>    exists(oclIsKindOf(Structure)) implies<br>    specializesFromLibrary('Objects::Object::ownedPerformance')<br>owningType <> null and<br>    (owningType.oclIsKindOf(Behavior) or<br>     owningType.oclIsKindOf(Step)) and<br>    self.isComposite implies<br>    specializesFromLibrary('Performances::Performance::subperformance')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:behavior](https://www.omg.org/spec/SysML/20230201/vocab#behavior)| [0..*]| [sysml_vocab:Behavior](https://www.omg.org/spec/SysML/20230201/vocab#Behavior)| <p>The Behaviors that type this Step.</p><br>| <p>The Behaviors that type this Step.</p><br>|
| [sysml_vocab:parameter](https://www.omg.org/spec/SysML/20230201/vocab#parameter)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The parameters of this Behavior, which are all its <code>directedFeatures</code>, whose values are passed into and/or out of a performance of the Behavior.</p><br>| <p>The parameters of this Expression, which are all its <code>directedFeatures</code>, whose values are passed into and/or out of a performance of the Behavior.</p><br>|



### RequirementVerificationMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#RequirementVerificationMembership

type: Shape

target class: [sysml_vocab:RequirementVerificationMembership](https://www.omg.org/spec/SysML/20230201/vocab#RequirementVerificationMembership)

definition of vocabulary class : <p>A RequirementVerificationMembership is a RequirementConstraintMembership used in the objective of a VerificationCase to identify a Requirement that is verified by the VerificationCase.</p>

description: <p>A RequirementVerificationMembership is a RequirementConstraintMembership used in the objective of a VerificationCase to identify a Requirement that is verified by the VerificationCase.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:ownedRequirement](https://www.omg.org/spec/SysML/20230201/vocab#ownedRequirement)| [1]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The RequirementUsages that are <code>ownedUsages</code> of this Definition.</p>| <p>The owned Requirement that acts as the <code>constraint</code> for this RequirementVerificationMembership. This will either be the <code>verifiedRequirement</code>, or it will subset the <code>verifiedRequirement</code>.</p>|
| [sysml_vocab:verifiedRequirement](https://www.omg.org/spec/SysML/20230201/vocab#verifiedRequirement)| [1]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The RequirementUsages verified by this VerificationCaseUsage, derived as the <code>verifiedRequirements</code> of all RequirementVerificationMemberships of the <code>objectiveRequirement</code>.</p>| <p> The RequirementUsage that is identified as being verified. It is the <code>referencedConstraint</code> of the RequirementVerificationMembership considered as a RequirementConstraintMembership, which must be a RequirementUsage.</p>|



### InvocationExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#InvocationExpression

type: Shape

target class: [sysml_vocab:InvocationExpression](https://www.omg.org/spec/SysML/20230201/vocab#InvocationExpression)

definition of vocabulary class : <p>An InvocationExpression is an Expression each of whose input <code>parameters</code> are bound to the <code>result</code> of an owned <code>argument</code> Expression. Each input <code>parameter</code> may be bound to the <code>result</code> of at most one <code>argument</code>.</p><br><br>not ownedTyping->exists(oclIsKindOf(Behavior)) and<br>not ownedSubsetting.subsettedFeature.type->exists(oclIsKindOf(Behavior)) implies<br>    ownedFeature.selectByKind(BindingConnector)->exists(<br>        relatedFeature->includes(self) and<br>        relatedFeature->includes(result))<br>            <br>TBD

description: <p>An InvocationExpression is an Expression each of whose input <code>parameters</code> are bound to the <code>result</code> of an owned <code>argument</code> Expression. Each input <code>parameter</code> may be bound to the <code>result</code> of at most one <code>argument</code>.</p><br><br>not ownedTyping->exists(oclIsKindOf(Behavior)) and<br>not ownedSubsetting.subsettedFeature.type->exists(oclIsKindOf(Behavior)) implies<br>    ownedFeature.selectByKind(BindingConnector)->exists(<br>        relatedFeature->includes(self) and<br>        relatedFeature->includes(result))<br>            <br>TBD

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:argument](https://www.omg.org/spec/SysML/20230201/vocab#argument)| [0..*]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>value</code> <code>Expressions</code> of the <code>FeatureValues</code> of the input <code>parameters</code> of the <code>InvocationExpression</code>.| <p>The <code>value</code> <code>Expressions</code> of the <code>FeatureValues</code> of the input <code>parameters</code> of the <code>InvocationExpression</code>.|



### AllocationDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#AllocationDefinition

type: Shape

target class: [sysml_vocab:AllocationDefinition](https://www.omg.org/spec/SysML/20230201/vocab#AllocationDefinition)

definition of vocabulary class : <p>An AllocationDefinition is a ConnectionDefinition that specifies that some or all of the responsibility to realize the intent of the <code>source</code> is allocated to the <code>target</code> instances. Such allocations define mappings across the various structures and hierarchies of a system model, perhaps as a precursor to more rigorous specifications and implementations. An AllocationDefinition can itself be refined using nested <code>allocations</code> that give a finer-grained decomposition of the containing allocation mapping.</p><br><br><p>An AllocationDefinition must subclass, directly or indirectly, the base AllocationDefinition Allocation from the Systems model library.</p><br>allocation = usage->selectAsKind(AllocationUsage)<br>specializesFromLibrary("Allocations::Allocation")

description: <p>An AllocationDefinition is a ConnectionDefinition that specifies that some or all of the responsibility to realize the intent of the <code>source</code> is allocated to the <code>target</code> instances. Such allocations define mappings across the various structures and hierarchies of a system model, perhaps as a precursor to more rigorous specifications and implementations. An AllocationDefinition can itself be refined using nested <code>allocations</code> that give a finer-grained decomposition of the containing allocation mapping.</p><br><br><p>An AllocationDefinition must subclass, directly or indirectly, the base AllocationDefinition Allocation from the Systems model library.</p><br>allocation = usage->selectAsKind(AllocationUsage)<br>specializesFromLibrary("Allocations::Allocation")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:allocation](https://www.omg.org/spec/SysML/20230201/vocab#allocation)| [0..*]| [sysml_vocab:AllocationUsage](https://www.omg.org/spec/SysML/20230201/vocab#AllocationUsage)| <p>The ActionUsages that refine the allocation mapping defined by this AllocationDefinition.</p>| <p>The ActionUsages that refine the allocation mapping defined by this AllocationDefinition.</p>|



### MetadataFeature

URI: https://www.omg.org/spec/SysML/20230201/shapes#MetadataFeature

type: Shape

target class: [sysml_vocab:MetadataFeature](https://www.omg.org/spec/SysML/20230201/vocab#MetadataFeature)

definition of vocabulary class : <p>A MetadataFeature is a Feature that is an AnnotatingElement used to annotate another Element with metadata. It is typed by a Metaclass. All its <code>ownedFeatures</code> must redefine <code>features</code> of its <code>metaclass</code> and any feature bindings must be model-level evaluable.</p><br><br><p>A MetadataFeature must subset, directly or indirectly, the base MetadataFeature <em><code>metadata</code></em> from the Kernel Library.</p><br><br><br>specializesFromLibrary("Metaobjects::metaobjects")<br>isSemantic() implies<br>    let annotatedTypes : Sequence(Type) = <br>        annotatedElement->selectAsKind(Type) in<br>    let baseTypes : Sequence(MetadataFeature) = <br>        evaluateFeature(resolveGlobal(<br>            'Metaobjects::SemanticMetadata::baseType').<br>            oclAsType(Feature))-><br>        selectAsKind(MetadataFeature) in<br>    annotatedTypes->notEmpty() and <br>    baseTypes()->notEmpty() and <br>    baseTypes()->first().isSyntactic() implies<br>        let annotatedType : Type = annotatedTypes->first() in<br>        let baseType : Element = baseTypes->first().syntaxElement() in<br>        if annotatedType.oclIsKindOf(Classifier) and <br>            baseType.oclIsKindOf(Feature) then<br>            baseType.oclAsType(Feature).type-><br>                forAll(t | annotatedType.specializes(t))<br>        else if baseType.oclIsKindOf(Type) then<br>            annotatedType.specializes(baseType.oclAsType(Type))<br>        else<br>            true<br>        endif

description: <p>A MetadataFeature is a Feature that is an AnnotatingElement used to annotate another Element with metadata. It is typed by a Metaclass. All its <code>ownedFeatures</code> must redefine <code>features</code> of its <code>metaclass</code> and any feature bindings must be model-level evaluable.</p><br><br><p>A MetadataFeature must subset, directly or indirectly, the base MetadataFeature <em><code>metadata</code></em> from the Kernel Library.</p><br><br><br>specializesFromLibrary("Metaobjects::metaobjects")<br>isSemantic() implies<br>    let annotatedTypes : Sequence(Type) = <br>        annotatedElement->selectAsKind(Type) in<br>    let baseTypes : Sequence(MetadataFeature) = <br>        evaluateFeature(resolveGlobal(<br>            'Metaobjects::SemanticMetadata::baseType').<br>            oclAsType(Feature))-><br>        selectAsKind(MetadataFeature) in<br>    annotatedTypes->notEmpty() and <br>    baseTypes()->notEmpty() and <br>    baseTypes()->first().isSyntactic() implies<br>        let annotatedType : Type = annotatedTypes->first() in<br>        let baseType : Element = baseTypes->first().syntaxElement() in<br>        if annotatedType.oclIsKindOf(Classifier) and <br>            baseType.oclIsKindOf(Feature) then<br>            baseType.oclAsType(Feature).type-><br>                forAll(t | annotatedType.specializes(t))<br>        else if baseType.oclIsKindOf(Type) then<br>            annotatedType.specializes(baseType.oclAsType(Type))<br>        else<br>            true<br>        endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:metaclass](https://www.omg.org/spec/SysML/20230201/vocab#metaclass)| [0..1]| [sysml_vocab:Metaclass](https://www.omg.org/spec/SysML/20230201/vocab#Metaclass)| <p>The <code>type</code> of this AnnotatingFeature, which must be a DataType.</p>| <p>The <code>type</code> of this AnnotatingFeature, which must be a DataType.</p>|



### AssignmentActionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#AssignmentActionUsage

type: Shape

target class: [sysml_vocab:AssignmentActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#AssignmentActionUsage)

definition of vocabulary class : <p>An <code>AssignmentActionUsage</code> is an <code>ActionUsage</code> that is defined, directly or indirectly, by the <code>ActionDefinition</code> <em><code>AssignmentAction</code></em> from the Systems Model Library. It specifies that the value of the <code>referent</code> <code>Feature</code>, relative to the target given by the result of the <code>targetArgument</code> <code>Expression</code>, should be set to the result of the <code>valueExpression</code>.</p><br><br>specializesFromLibrary('Actions::assignmentActions')<br>let targetParameter : Feature = inputParameter(1) in<br>targetParameter <> null and<br>targetParameter.ownedFeature->notEmpty() and<br>targetParameter.ownedFeature->first().<br>    redefines('AssignmentAction::target::startingAt')<br>valueExpression = argument(2)<br>targetArgument = argument(1)<br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::assignments')<br>let targetParameter : Feature = inputParameter(1) in<br>targetParameter <> null and<br>targetParameter.ownedFeature->notEmpty() and<br>targetParameter->first().ownedFeature->notEmpty() and<br>targetParameter->first().ownedFeature->first().<br>    redefines('AssigmentAction::target::startingAt::accessedFeature')<br>let targetParameter : Feature = inputParameter(1) in<br>targetParameter <> null and<br>targetParameter.ownedFeature->notEmpty() and<br>targetParameter->first().ownedFeature->notEmpty() and<br>targetParameter->first().ownedFeature->first().redefines(referent)<br>referent =<br>    let unownedFeatures : Sequence(Feature) = ownedMembership-><br>        reject(oclIsKindOf(OwningMembership)).memberElement-><br>        selectByKind(Feature) in<br>    if unownedFeatures->isEmpty() then null<br>    else unownedFeatures->first().oclAsType(Feature)<br>    endif

description: <p>An <code>AssignmentActionUsage</code> is an <code>ActionUsage</code> that is defined, directly or indirectly, by the <code>ActionDefinition</code> <em><code>AssignmentAction</code></em> from the Systems Model Library. It specifies that the value of the <code>referent</code> <code>Feature</code>, relative to the target given by the result of the <code>targetArgument</code> <code>Expression</code>, should be set to the result of the <code>valueExpression</code>.</p><br><br>specializesFromLibrary('Actions::assignmentActions')<br>let targetParameter : Feature = inputParameter(1) in<br>targetParameter <> null and<br>targetParameter.ownedFeature->notEmpty() and<br>targetParameter.ownedFeature->first().<br>    redefines('AssignmentAction::target::startingAt')<br>valueExpression = argument(2)<br>targetArgument = argument(1)<br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::assignments')<br>let targetParameter : Feature = inputParameter(1) in<br>targetParameter <> null and<br>targetParameter.ownedFeature->notEmpty() and<br>targetParameter->first().ownedFeature->notEmpty() and<br>targetParameter->first().ownedFeature->first().<br>    redefines('AssigmentAction::target::startingAt::accessedFeature')<br>let targetParameter : Feature = inputParameter(1) in<br>targetParameter <> null and<br>targetParameter.ownedFeature->notEmpty() and<br>targetParameter->first().ownedFeature->notEmpty() and<br>targetParameter->first().ownedFeature->first().redefines(referent)<br>referent =<br>    let unownedFeatures : Sequence(Feature) = ownedMembership-><br>        reject(oclIsKindOf(OwningMembership)).memberElement-><br>        selectByKind(Feature) in<br>    if unownedFeatures->isEmpty() then null<br>    else unownedFeatures->first().oclAsType(Feature)<br>    endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:targetArgument](https://www.omg.org/spec/SysML/20230201/vocab#targetArgument)| [1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>Expression</code> whose value is an occurrence in the domain of the <code>referent</code> <code>Feature</code>, for which the value of the <code>referent</code> will be set to the result of the <code>valueExpression</code> by this <code>AssignmentActionUsage</code>.</p>| <p>The <code>Expression</code> whose value is an occurrence in the domain of the <code>referent</code> <code>Feature</code>, for which the value of the <code>referent</code> will be set to the result of the <code>valueExpression</code> by this <code>AssignmentActionUsage</code>.</p>|
| [sysml_vocab:valueExpression](https://www.omg.org/spec/SysML/20230201/vocab#valueExpression)| [1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>Expression</code> whose result is to be assigned to the <code>referent</code> <code>Feature</code>.</p>| <p>The <code>Expression</code> whose result is to be assigned to the <code>referent</code> <code>Feature</code>.</p>|
| [sysml_vocab:referent](https://www.omg.org/spec/SysML/20230201/vocab#referent)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>Feature</code> whose value is to be set.</p>| <p>The <code>Feature</code> whose value is to be set.</p>|



### MetadataDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#MetadataDefinition

type: Shape

target class: [sysml_vocab:MetadataDefinition](https://www.omg.org/spec/SysML/20230201/vocab#MetadataDefinition)

definition of vocabulary class : <p>A MetadataDefinition is an ItemDefinition that is also a Metaclass.</p><br><br><p>A MetadataDefinition must subclassofy, directly or indirectly, the base MetadataDefinition MetadataItem from the Systems model library.</p>

description: <p>A MetadataDefinition is an ItemDefinition that is also a Metaclass.</p><br><br><p>A MetadataDefinition must subclassofy, directly or indirectly, the base MetadataDefinition MetadataItem from the Systems model library.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### AssociationStructure

URI: https://www.omg.org/spec/SysML/20230201/shapes#AssociationStructure

type: Shape

target class: [sysml_vocab:AssociationStructure](https://www.omg.org/spec/SysML/20230201/vocab#AssociationStructure)

definition of vocabulary class : specializesFromLibrary("Objects::ObjectLink")<br>endFeature->size() = 2 implies<br>    specializesFromLibrary("Objects::BinaryLinkObject")

description: specializesFromLibrary("Objects::ObjectLink")<br>endFeature->size() = 2 implies<br>    specializesFromLibrary("Objects::BinaryLinkObject")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### ExhibitStateUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ExhibitStateUsage

type: Shape

target class: [sysml_vocab:ExhibitStateUsage](https://www.omg.org/spec/SysML/20230201/vocab#ExhibitStateUsage)

definition of vocabulary class : <p>An ExhibitStateUsage is a StateUsage that represents the exhibiting of a StateUsage. Unless it is the StateUsage itself, the StateUsage to be exhibited is related to the ExhibitStateUsage by a ReferenceSubsetting Relationship. An ExhibitStateUsage is also a PerformActionUsage, with its <code>exhibitedState</code> as the <code>performedAction</code>.</p><br><br><p>If the ExhibitStateUsage is owned by a PartDefinition or PartUsage, then it also subsets the StateUsage <em><code>Part::exhibitedStates</code></em> from the Systems model library.</p><br>

description: <p>An ExhibitStateUsage is a StateUsage that represents the exhibiting of a StateUsage. Unless it is the StateUsage itself, the StateUsage to be exhibited is related to the ExhibitStateUsage by a ReferenceSubsetting Relationship. An ExhibitStateUsage is also a PerformActionUsage, with its <code>exhibitedState</code> as the <code>performedAction</code>.</p><br><br><p>If the ExhibitStateUsage is owned by a PartDefinition or PartUsage, then it also subsets the StateUsage <em><code>Part::exhibitedStates</code></em> from the Systems model library.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:exhibitedState](https://www.omg.org/spec/SysML/20230201/vocab#exhibitedState)| [1]| [sysml_vocab:StateUsage](https://www.omg.org/spec/SysML/20230201/vocab#StateUsage)| <p>The StateUsage to be exhibited by the ExhibitStateUsage. It is the <code>performedAction</code> of the ExhibitStateUsage considered as an PerformActionUsage, which must be an StateUsage.</p>| <p>The StateUsage to be exhibited by the ExhibitStateUsage. It is the <code>performedAction</code> of the ExhibitStateUsage considered as an PerformActionUsage, which must be an StateUsage.</p>|



### FlowConnectionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#FlowConnectionUsage

type: Shape

target class: [sysml_vocab:FlowConnectionUsage](https://www.omg.org/spec/SysML/20230201/vocab#FlowConnectionUsage)

definition of vocabulary class : <p>A FlowConnectionUsage is a ConnectionUsage that is also an ItemFlow.</p><br>if itemFlowEnds->isEmpty() then<br>    specializesFromLibrary("Connections::messageConnections")<br>else<br>    specializesFromLibrary("Connections::flowConnections"<br>endif

description: <p>A FlowConnectionUsage is a ConnectionUsage that is also an ItemFlow.</p><br>if itemFlowEnds->isEmpty() then<br>    specializesFromLibrary("Connections::messageConnections")<br>else<br>    specializesFromLibrary("Connections::flowConnections"<br>endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:flowConnectionDefinition](https://www.omg.org/spec/SysML/20230201/vocab#flowConnectionDefinition)| [0..*]| [sysml_vocab:Interaction](https://www.omg.org/spec/SysML/20230201/vocab#Interaction)| <p>The Interactions that are the types of this FlowConnectionUsage. Nominally, these are FlowConnectionDefinitions, but other kinds of Kernel Interactions are also allowed, to permit use of Interactions from the Kernel Library.</p>| <p>The Interactions that are the types of this FlowConnectionUsage. Nominally, these are FlowConnectionDefinitions, but other kinds of Kernel Interactions are also allowed, to permit use of Interactions from the Kernel Library.</p>|



### Comment

URI: https://www.omg.org/spec/SysML/20230201/shapes#Comment

type: Shape

target class: [sysml_vocab:Comment](https://www.omg.org/spec/SysML/20230201/vocab#Comment)

definition of vocabulary class : <p>A Comment is an AnnotatingElement whose <code>body</code> in some way describes its <code>annotatedElements</code>.</p><br>

description: <p>A Comment is an AnnotatingElement whose <code>body</code> in some way describes its <code>annotatedElements</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:locale](https://www.omg.org/spec/SysML/20230201/vocab#locale)| [0..1]| String| <p>Identification of the language of the <code>body</code> text and, optionally, the region and/or encoding. The format shall be a POSIX locale conformant to ISO/IEC 15897, with the format <code>[language[_territory][.codeset][@modifier]]</code>.</p>| <p>Identification of the language of the <code>body</code> text and, optionally, the region and/or encoding. The format shall be a POSIX locale conformant to ISO/IEC 15897, with the format <code>[language[_territory][.codeset][@modifier]]</code>.</p>|
| [sysml_vocab:body](https://www.omg.org/spec/SysML/20230201/vocab#body)| [1]| String| <p>The annotation text for the Comment.</p><br>| <p>The annotation text for the Comment.</p><br>|



### SelectExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#SelectExpression

type: Shape

target class: [sysml_vocab:SelectExpression](https://www.omg.org/spec/SysML/20230201/vocab#SelectExpression)

definition of vocabulary class : <p>A SelectExpression is an OperatorExpression whose operator is <code>"select"</code>, which resolves to the library Function <em><code>ControlFunctions::select</code></em>.</p>

description: <p>A SelectExpression is an OperatorExpression whose operator is <code>"select"</code>, which resolves to the library Function <em><code>ControlFunctions::select</code></em>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### ControlNode

URI: https://www.omg.org/spec/SysML/20230201/shapes#ControlNode

type: Shape

target class: [sysml_vocab:ControlNode](https://www.omg.org/spec/SysML/20230201/vocab#ControlNode)

definition of vocabulary class : <p>A <code>ControlNode</code> is an <code>ActionUsage</code> that does not have any inherent behavior but provides constraints on incoming and outgoing <code>Successions</code> that are used to control other <code>Actions</code>. A <code>ControlNode</code> must be a composite owned <code>usage</code> of an <code>ActionDefinition</code> or <code>ActionUsage</code>.</p><br><br>sourceConnector->selectByKind(Succession)-><br>    collect(connectorEnd->at(1).multiplicity)-><br>    forAll(sourceMult | <br>        multiplicityHasBounds(sourceMult, 1, 1))<br>owningType <> null and <br>(owningType.oclIsKindOf(ActionDefinition) or<br> owningType.oclIsKindOf(ActionUsage))<br>targetConnector->selectByKind(Succession)-><br>    collect(connectorEnd->at(2).multiplicity)-><br>    forAll(targetMult | <br>        multiplicityHasBounds(targetMult, 1, 1))<br>specializesFromLibrary('Action::Action::controls')

description: <p>A <code>ControlNode</code> is an <code>ActionUsage</code> that does not have any inherent behavior but provides constraints on incoming and outgoing <code>Successions</code> that are used to control other <code>Actions</code>. A <code>ControlNode</code> must be a composite owned <code>usage</code> of an <code>ActionDefinition</code> or <code>ActionUsage</code>.</p><br><br>sourceConnector->selectByKind(Succession)-><br>    collect(connectorEnd->at(1).multiplicity)-><br>    forAll(sourceMult | <br>        multiplicityHasBounds(sourceMult, 1, 1))<br>owningType <> null and <br>(owningType.oclIsKindOf(ActionDefinition) or<br> owningType.oclIsKindOf(ActionUsage))<br>targetConnector->selectByKind(Succession)-><br>    collect(connectorEnd->at(2).multiplicity)-><br>    forAll(targetMult | <br>        multiplicityHasBounds(targetMult, 1, 1))<br>specializesFromLibrary('Action::Action::controls')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Expression

URI: https://www.omg.org/spec/SysML/20230201/shapes#Expression

type: Shape

target class: [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)

definition of vocabulary class : <p>An Expression is a Step that is typed by a Function. An Expression that also has a Function as its <code>featuringType</code> is a computational step within that Function. An Expression always has a single <code>result</code> parameter, which redefines the <code>result</code> parameter of its defining <code>function</code>. This allows Expressions to be interconnected in tree structures, in which inputs to each Expression in the tree are determined as the results of other Expressions in the tree.</p><br><br>isModelLevelEvaluable = modelLevelEvaluable(Set(Element){})<br>specializesFromLibrary("Performances::evaluations")<br>owningMembership <> null and <br>owningMembership.oclIsKindOf(FeatureValue) implies<br>    let featureWithValue : Feature = <br>        owningMembership.oclAsType(FeatureValue).featureWithValue in<br>    featuringType = featureWithValue.featuringType<br>ownedMembership.selectByKind(ResultExpressionMembership)-><br>    forAll(mem | ownedFeature.selectByKind(BindingConnector)-><br>        exists(binding |<br>            binding.relatedFeature->includes(result) and<br>            binding.relatedFeature->includes(mem.ownedResultExpression.result)))

description: <p>An Expression is a Step that is typed by a Function. An Expression that also has a Function as its <code>featuringType</code> is a computational step within that Function. An Expression always has a single <code>result</code> parameter, which redefines the <code>result</code> parameter of its defining <code>function</code>. This allows Expressions to be interconnected in tree structures, in which inputs to each Expression in the tree are determined as the results of other Expressions in the tree.</p><br><br>isModelLevelEvaluable = modelLevelEvaluable(Set(Element){})<br>specializesFromLibrary("Performances::evaluations")<br>owningMembership <> null and <br>owningMembership.oclIsKindOf(FeatureValue) implies<br>    let featureWithValue : Feature = <br>        owningMembership.oclAsType(FeatureValue).featureWithValue in<br>    featuringType = featureWithValue.featuringType<br>ownedMembership.selectByKind(ResultExpressionMembership)-><br>    forAll(mem | ownedFeature.selectByKind(BindingConnector)-><br>        exists(binding |<br>            binding.relatedFeature->includes(result) and<br>            binding.relatedFeature->includes(mem.ownedResultExpression.result)))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:isModelLevelEvaluable](https://www.omg.org/spec/SysML/20230201/vocab#isModelLevelEvaluable)| [1]| Boolean| <p>Whether this Function can be used as the <code>function</code> of a model-level evaluable InvocationExpression.</p>| <p>Whether this Expression meets the constraints necessary to be evaluated at <em>model level</em>, that is, using metadata within the model.</p>|
| [sysml_vocab:function](https://www.omg.org/spec/SysML/20230201/vocab#function)| [0..1]| [sysml_vocab:Function](https://www.omg.org/spec/SysML/20230201/vocab#Function)| <p>The Function that types this Expression.</p><br><br><p>This is the Function that types the Expression.</p><br>| <p>The Function that types this Expression.</p><br><br><p>This is the Function that types the Expression.</p><br>|
| [sysml_vocab:result](https://www.omg.org/spec/SysML/20230201/vocab#result)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>result</code> parameter of the Function, derived as the single <code>parameter</code> of the Function with direction <code>out</code>.</p><br><br><p>The object or value that is the result of evaluating the Function.</p>| <p><p>The <code>result</code> parameter of the Expression, derived as the single <code>parameter</code> of the Expression with direction <code>out</code>. The result of an Expression must either be inherited from its <code>function</code> or (directly or indirectly) redefine the <code>result</code> parameter of its <code>function</code>.</p><br>|



### Redefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#Redefinition

type: Shape

target class: [sysml_vocab:Redefinition](https://www.omg.org/spec/SysML/20230201/vocab#Redefinition)

definition of vocabulary class : <p>Redefinition specializes&nbsp;Subsetting to require&nbsp;the <code>redefinedFeature</code> and the&nbsp;<code>redefiningFeature</code> to have the same values (on each instance of the domain of the <code>redefiningFeature</code>). This means any restrictions on the <code>redefiningFeature</code>, such as <code>type</code> or <code>multiplicity</code>, also apply to the <code>redefinedFeature</code> (on each instance of the <code>owningType</code> of the redefining Feature), and vice versa. The <code>redefinedFeature</code> might have&nbsp;values for instances of the <code>owningType</code> of the <code>redefiningFeature</code>, but only as instances of the <code>owningType</code> of the <code>redefinedFeature</code> that happen to also be instances of the <code>owningType</code> of the <code>redefiningFeature</code>. This is supported by the constraints inherited from&nbsp;Subsetting on the domains of the <code>redefiningFeature</code> and <code>redefinedFeature</code>. However, these constraints are narrowed for Redefinition to require the <code>owningTypes</code> of the <code>redefiningFeature</code> and <code>redefinedFeature</code> to be different and the <code>redefinedFeature</code> to&nbsp;not be imported into the <code>owningNamespace</code> of the <code>redefiningFeature</code>.&nbsp;This&nbsp;enables&nbsp;the <code>redefiningFeature</code> to have the same name as the <code>redefinedFeature</code> if desired.</p><br>

description: <p>Redefinition specializes&nbsp;Subsetting to require&nbsp;the <code>redefinedFeature</code> and the&nbsp;<code>redefiningFeature</code> to have the same values (on each instance of the domain of the <code>redefiningFeature</code>). This means any restrictions on the <code>redefiningFeature</code>, such as <code>type</code> or <code>multiplicity</code>, also apply to the <code>redefinedFeature</code> (on each instance of the <code>owningType</code> of the redefining Feature), and vice versa. The <code>redefinedFeature</code> might have&nbsp;values for instances of the <code>owningType</code> of the <code>redefiningFeature</code>, but only as instances of the <code>owningType</code> of the <code>redefinedFeature</code> that happen to also be instances of the <code>owningType</code> of the <code>redefiningFeature</code>. This is supported by the constraints inherited from&nbsp;Subsetting on the domains of the <code>redefiningFeature</code> and <code>redefinedFeature</code>. However, these constraints are narrowed for Redefinition to require the <code>owningTypes</code> of the <code>redefiningFeature</code> and <code>redefinedFeature</code> to be different and the <code>redefinedFeature</code> to&nbsp;not be imported into the <code>owningNamespace</code> of the <code>redefiningFeature</code>.&nbsp;This&nbsp;enables&nbsp;the <code>redefiningFeature</code> to have the same name as the <code>redefinedFeature</code> if desired.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:redefiningFeature](https://www.omg.org/spec/SysML/20230201/vocab#redefiningFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Feature that is redefining the <code>redefinedFeature</code> of this Redefinition.</p><br>| <p>The Feature that is redefining the <code>redefinedFeature</code> of this Redefinition.</p><br>|
| [sysml_vocab:redefinedFeature](https://www.omg.org/spec/SysML/20230201/vocab#redefinedFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Feature that is redefined by the <code>redefiningFeature</code> of this Redefinition.</p><br>| <p>The Feature that is redefined by the <code>redefiningFeature</code> of this Redefinition.</p><br>|



### TypeFeaturing

URI: https://www.omg.org/spec/SysML/20230201/shapes#TypeFeaturing

type: Shape

target class: [sysml_vocab:TypeFeaturing](https://www.omg.org/spec/SysML/20230201/vocab#TypeFeaturing)

definition of vocabulary class : <p>A TypeFeaturing is a Featuring Relationship in which the <code>featureOfType</code> is the <code>source</code> and the <code>featuringType</code> is the target. A TypeFeaturing may be owned by its <code>featureOfType</code>.</p>

description: <p>A TypeFeaturing is a Featuring Relationship in which the <code>featureOfType</code> is the <code>source</code> and the <code>featuringType</code> is the target. A TypeFeaturing may be owned by its <code>featureOfType</code>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:featureOfType](https://www.omg.org/spec/SysML/20230201/vocab#featureOfType)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Feature that is featured by the <code>featuringType</code>. It is the <code>source</code> of the Relationship.</p>| <p>The Feature that is featured by the <code>featuringType</code>. It is the <code>source</code> of the Relationship.</p>|
| [sysml_vocab:featuringType](https://www.omg.org/spec/SysML/20230201/vocab#featuringType)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The Type that features the <code>featureOfType</code>. It is the <code>target</code> of the Relationship.</p>| <p>The Type that features the <code>featureOfType</code>. It is the <code>target</code> of the Relationship.</p>|
| [sysml_vocab:owningFeatureOfType](https://www.omg.org/spec/SysML/20230201/vocab#owningFeatureOfType)| [0..1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Feature that owns this TypeFeaturing and is also the <code>featureOfType</code>.</p>| <p>The Feature that owns this TypeFeaturing and is also the <code>featureOfType</code>.</p>|



### ConnectorAsUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ConnectorAsUsage

type: Shape

target class: [sysml_vocab:ConnectorAsUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConnectorAsUsage)

definition of vocabulary class : <p>A ConnectorAsUsage is both a Connector and a Usage. ConnectorAsUsage cannot itself be instantiated in a SysML model, but it is the base class for the concrete classes BindingConnectorAsUsage, SuccessionAsUsage and ConnectionUsage.</p>

description: <p>A ConnectorAsUsage is both a Connector and a Usage. ConnectorAsUsage cannot itself be instantiated in a SysML model, but it is the base class for the concrete classes BindingConnectorAsUsage, SuccessionAsUsage and ConnectionUsage.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### SatisfyRequirementUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#SatisfyRequirementUsage

type: Shape

target class: [sysml_vocab:SatisfyRequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#SatisfyRequirementUsage)

definition of vocabulary class : <p>A SatisfyRequirementUsage is an AssertConstraintUsage that asserts, by default, that a satisfied RequirementUsage is true for a specific <code>satisfyingSubject</code>, or, if <code>isNegated = true</code>, that the RequirementUsage is false. The satisfied RequirementUsage is related to the SatisfyRequirementUsage by a Subsetting relationship.</p>

description: <p>A SatisfyRequirementUsage is an AssertConstraintUsage that asserts, by default, that a satisfied RequirementUsage is true for a specific <code>satisfyingSubject</code>, or, if <code>isNegated = true</code>, that the RequirementUsage is false. The satisfied RequirementUsage is related to the SatisfyRequirementUsage by a Subsetting relationship.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:satisfiedRequirement](https://www.omg.org/spec/SysML/20230201/vocab#satisfiedRequirement)| [1]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The RequirementUsage that is satisfied by the <code>satisfyingSubject</code> of this SatisfyRequirementUsage. It is the <code>assertedConstraint</code> of the SatisfyRequirementUsage considered as an AssertConstraintUsage, which must be a RequirementUsage.</p>| <p>The RequirementUsage that is satisfied by the <code>satisfyingSubject</code> of this SatisfyRequirementUsage. It is the <code>assertedConstraint</code> of the SatisfyRequirementUsage considered as an AssertConstraintUsage, which must be a RequirementUsage.</p>|
| [sysml_vocab:satisfyingFeature](https://www.omg.org/spec/SysML/20230201/vocab#satisfyingFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Feature that represents the actual subject that is asserted to satisfy the <tt>satisfiedRequirement</tt>. The <tt>satisfyingFeature</tt> must be the target of a BindingConnector from the <tt>subjectParameter</tt> of the <tt>satisfiedRequirement</tt>.</p>| <p>The Feature that represents the actual subject that is asserted to satisfy the <tt>satisfiedRequirement</tt>. The <tt>satisfyingFeature</tt> must be the target of a BindingConnector from the <tt>subjectParameter</tt> of the <tt>satisfiedRequirement</tt>.</p>|



### ViewDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#ViewDefinition

type: Shape

target class: [sysml_vocab:ViewDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ViewDefinition)

definition of vocabulary class : <p>A ViewDefinition is a PartDefinition that specifies how a view artifact is constructed to satisfy a <code>viewpoint</code>. It specifies a <code>viewConditions</code> to define the model content to be presented and a <code>rendering</code> to define how the model content is presented.</p><br><br></p>A ViewDefinition must subclass, directly or indirectly, the base ViewDefinition View from the Systems model library.</p>

description: <p>A ViewDefinition is a PartDefinition that specifies how a view artifact is constructed to satisfy a <code>viewpoint</code>. It specifies a <code>viewConditions</code> to define the model content to be presented and a <code>rendering</code> to define how the model content is presented.</p><br><br></p>A ViewDefinition must subclass, directly or indirectly, the base ViewDefinition View from the Systems model library.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:view](https://www.omg.org/spec/SysML/20230201/vocab#view)| [0..*]| [sysml_vocab:ViewUsage](https://www.omg.org/spec/SysML/20230201/vocab#ViewUsage)| <p>The <code>usages</code> of this ViewDefinition that are ViewUsages.</p>| <p>The <code>usages</code> of this ViewDefinition that are ViewUsages.</p>|
| [sysml_vocab:satisfiedViewpoint](https://www.omg.org/spec/SysML/20230201/vocab#satisfiedViewpoint)| [0..*]| [sysml_vocab:ViewpointUsage](https://www.omg.org/spec/SysML/20230201/vocab#ViewpointUsage)| <p>The <code>nestedUsages</code> of this ViewUsage that are ViewpointUsages for (additional) viewpoints satisfied by the ViewUsage.</p>| <p>The <code>ownedUsages</code> of this ViewDefinition that are ViewpointUsages for viewpoints satisfied by the ViewDefinition.</p>|
| [sysml_vocab:viewRendering](https://www.omg.org/spec/SysML/20230201/vocab#viewRendering)| [0..1]| [sysml_vocab:RenderingUsage](https://www.omg.org/spec/SysML/20230201/vocab#RenderingUsage)| <p>The RenderingUsage to be used to render views defined by this ViewUsage. Derived as the <code>referencedRendering</code> of the ViewRenderingMembership of the ViewUsage. A ViewUsage may have at most one.<p>| <p>The RenderingUsage to be used to render views defined by this ViewDefinition. Derived as the <code>referencedRendering</code> of the ViewRenderingMembership of the ViewDefinition. A ViewDefinition may have at most one.<p>|
| [sysml_vocab:viewCondition](https://www.omg.org/spec/SysML/20230201/vocab#viewCondition)| [0..*]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The Expressions related to this ViewUsage by ElementFilterMemberships, which specify conditions on Elements to be rendered in a view.</p>| <p>The Expressions related to this ViewDefinition by ElementFilterMemberships, which specify conditions on Elements to be rendered in a view.</p>|



### SubjectMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#SubjectMembership

type: Shape

target class: [sysml_vocab:SubjectMembership](https://www.omg.org/spec/SysML/20230201/vocab#SubjectMembership)

definition of vocabulary class : <p>A SubjectMembership is a ParameterMembership that indicates that its <code>ownedSubjectParameter</code> is the subject Parameter for its <code>owningType</code>. The <code>owningType</code> of a SubjectMembership must be a CaseDefinition, CaseUsage, RequirementDefinition or RequirementUsage.</p>

description: <p>A SubjectMembership is a ParameterMembership that indicates that its <code>ownedSubjectParameter</code> is the subject Parameter for its <code>owningType</code>. The <code>owningType</code> of a SubjectMembership must be a CaseDefinition, CaseUsage, RequirementDefinition or RequirementUsage.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:ownedSubjectParameter](https://www.omg.org/spec/SysML/20230201/vocab#ownedSubjectParameter)| [1]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The Usage that is the <code>ownedMemberParameter</code> of this SubjectMembership.</p>| <p>The Usage that is the <code>ownedMemberParameter</code> of this SubjectMembership.</p>|



### Unioning

URI: https://www.omg.org/spec/SysML/20230201/shapes#Unioning

type: Shape

target class: [sysml_vocab:Unioning](https://www.omg.org/spec/SysML/20230201/vocab#Unioning)

definition of vocabulary class : <p>Unioning is a Relationship that makes its <code>unioningType</code> one of the <code>unioningTypes</code> of its <code>typeUnioned</code>.</p>

description: <p>Unioning is a Relationship that makes its <code>unioningType</code> one of the <code>unioningTypes</code> of its <code>typeUnioned</code>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:unioningType](https://www.omg.org/spec/SysML/20230201/vocab#unioningType)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>Type that partly determines interpretations of <code>typeUnioned</code>, as described in <code>Type::unioningType</code>.</p>| <p>Type that partly determines interpretations of <code>typeUnioned</code>, as described in <code>Type::unioningType</code>.</p>|
| [sysml_vocab:typeUnioned](https://www.omg.org/spec/SysML/20230201/vocab#typeUnioned)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>Type with interpretations partly determined by <code>unioningType</code>, as described in <code>Type::unioningType</code>.</p>| <p>Type with interpretations partly determined by <code>unioningType</code>, as described in <code>Type::unioningType</code>.</p>|



### ReferenceSubsetting

URI: https://www.omg.org/spec/SysML/20230201/shapes#ReferenceSubsetting

type: Shape

target class: [sysml_vocab:ReferenceSubsetting](https://www.omg.org/spec/SysML/20230201/vocab#ReferenceSubsetting)

definition of vocabulary class : <p>ReferenceSubsetting is a kind of Subsetting in which the <code>referencedFeature</code> is syntactically distinguished from other Features subsetted by the <code>referencingFeature</code>. ReferenceSubsetting has the same semantics as Subsetting, but the <code>referenceFeature</code> may have a special purpose relative to the <code>referencingFeature</code>. For instance, ReferenceSubsetting is used to identify the <code>relatedFeatures</code> of a Connector.</p><br><br><p>ReferenceSubsetting is always an <code>ownedRelationship</code> of its <code>referencingFeature</code>. A Feature can have at most one <code>ownedReferenceSubsetting</code>.<p><br>

description: <p>ReferenceSubsetting is a kind of Subsetting in which the <code>referencedFeature</code> is syntactically distinguished from other Features subsetted by the <code>referencingFeature</code>. ReferenceSubsetting has the same semantics as Subsetting, but the <code>referenceFeature</code> may have a special purpose relative to the <code>referencingFeature</code>. For instance, ReferenceSubsetting is used to identify the <code>relatedFeatures</code> of a Connector.</p><br><br><p>ReferenceSubsetting is always an <code>ownedRelationship</code> of its <code>referencingFeature</code>. A Feature can have at most one <code>ownedReferenceSubsetting</code>.<p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:referencedFeature](https://www.omg.org/spec/SysML/20230201/vocab#referencedFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Feature that is referenced by the <code>referencingFeature</code> of this ReferenceSubsetting.</p>| <p>The Feature that is referenced by the <code>referencingFeature</code> of this ReferenceSubsetting.</p>|
| [sysml_vocab:referencingFeature](https://www.omg.org/spec/SysML/20230201/vocab#referencingFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Feature that owns this ReferenceSubsetting relationship, which is also its <code>subsettingFeature</code>.</p>| <p>The Feature that owns this ReferenceSubsetting relationship, which is also its <code>subsettingFeature</code>.</p>|



### Connector

URI: https://www.omg.org/spec/SysML/20230201/shapes#Connector

type: Shape

target class: [sysml_vocab:Connector](https://www.omg.org/spec/SysML/20230201/vocab#Connector)

definition of vocabulary class : <p>A Connector is a usage of Associations, with links restricted according to instances of the Type in which they are used (domain of the Connector). Associations restrict what kinds of things might be linked. The Connector further restricts these links to between values of two Features on instances of its domain.</p><br><br>relatedFeature = connectorEnd.ownedReferenceSubsetting.subsettedFeature<br>relatedFeature->forAll(f | <br>    if featuringType->isEmpty() then f.isFeaturedWithin(null)<br>    else featuringType->exists(t | f.isFeaturedWithin(t))<br>    endif)<br>sourceFeature = <br>    if relatedFeature->size() = 2 then relatedFeature->at(1) <br>    else null <br>    endif<br>targetFeature =<br>    if sourceFeature = null then relatedFeature<br>    else relatedFeature->excluding(sourceFeature)<br>    endif<br>connectorEnd = feature->select(isEnd)<br>not isAbstract implies relatedFeature->size() >= 2<br>specializesFromLibrary("Links::links")<br>association->exists(oclIsKindOf(AssociationStructure)) implies<br>    specializesFromLibrary("Objects::linkObjects")<br>connectorEnds->size() = 2 and<br>association->exists(oclIsKindOf(AssocationStructure)) implies<br>    specializesFromLibrary("Objects::binaryLinkObjects")<br>connectorEnd->size() = 2 implies<br>    specializesFromLibrary('Links::binaryLinks')<br>connectorEnds->size() > 2 implies<br>    not specializesFromLibrary("Links::BinaryLink")

description: <p>A Connector is a usage of Associations, with links restricted according to instances of the Type in which they are used (domain of the Connector). Associations restrict what kinds of things might be linked. The Connector further restricts these links to between values of two Features on instances of its domain.</p><br><br>relatedFeature = connectorEnd.ownedReferenceSubsetting.subsettedFeature<br>relatedFeature->forAll(f | <br>    if featuringType->isEmpty() then f.isFeaturedWithin(null)<br>    else featuringType->exists(t | f.isFeaturedWithin(t))<br>    endif)<br>sourceFeature = <br>    if relatedFeature->size() = 2 then relatedFeature->at(1) <br>    else null <br>    endif<br>targetFeature =<br>    if sourceFeature = null then relatedFeature<br>    else relatedFeature->excluding(sourceFeature)<br>    endif<br>connectorEnd = feature->select(isEnd)<br>not isAbstract implies relatedFeature->size() >= 2<br>specializesFromLibrary("Links::links")<br>association->exists(oclIsKindOf(AssociationStructure)) implies<br>    specializesFromLibrary("Objects::linkObjects")<br>connectorEnds->size() = 2 and<br>association->exists(oclIsKindOf(AssocationStructure)) implies<br>    specializesFromLibrary("Objects::binaryLinkObjects")<br>connectorEnd->size() = 2 implies<br>    specializesFromLibrary('Links::binaryLinks')<br>connectorEnds->size() > 2 implies<br>    not specializesFromLibrary("Links::BinaryLink")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:isDirected](https://www.omg.org/spec/SysML/20230201/vocab#isDirected)| [1]| Boolean| <p>For a binary Connector, whether or not the Connector should be considered to have a direction from <code>source</code> to <code>target</code>.</p><br>| <p>For a binary Connector, whether or not the Connector should be considered to have a direction from <code>source</code> to <code>target</code>.</p><br>|
| [sysml_vocab:relatedFeature](https://www.omg.org/spec/SysML/20230201/vocab#relatedFeature)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Features that are related by this Connector considered as a Relationship and restrict the links it identifies, derived as the referenced Features of the <code>connectorEnds</code> of the Connector.</p><br>| <p>The Features that are related by this Connector considered as a Relationship and restrict the links it identifies, derived as the referenced Features of the <code>connectorEnds</code> of the Connector.</p><br>|
| [sysml_vocab:association](https://www.omg.org/spec/SysML/20230201/vocab#association)| [0..*]| [sysml_vocab:Association](https://www.omg.org/spec/SysML/20230201/vocab#Association)| <p>The Associations that type the Connector.</p><br>| <p>The Associations that type the Connector.</p><br>|
| [sysml_vocab:connectorEnd](https://www.omg.org/spec/SysML/20230201/vocab#connectorEnd)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>endFeatures</code> of a Connector, which redefine the <code>endFeatures<code> of the <code>associations</code> of the Connector. The <code>connectorEnds</code> determine via ReferenceSubsetting Relationships which Features are related by the Connector.</p>| <p>The <code>endFeatures</code> of a Connector, which redefine the <code>endFeatures<code> of the <code>associations</code> of the Connector. The <code>connectorEnds</code> determine via ReferenceSubsetting Relationships which Features are related by the Connector.</p>|
| [sysml_vocab:sourceFeature](https://www.omg.org/spec/SysML/20230201/vocab#sourceFeature)| [0..1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The source <code>relatedFeature</code> for this Connector. It is  derived as the first <code>relatedFeature</code>.</p>| <p>The source <code>relatedFeature</code> for this Connector. It is  derived as the first <code>relatedFeature</code>.</p>|
| [sysml_vocab:targetFeature](https://www.omg.org/spec/SysML/20230201/vocab#targetFeature)| [0..*]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The target <code>relatedFeatures</code> for this Connector. This includes all the <code>relatedFeatures</code> other than the <code>sourceFeature</code>.</p>| <p>The target <code>relatedFeatures</code> for this Connector. This includes all the <code>relatedFeatures</code> other than the <code>sourceFeature</code>.</p>|



### PortDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#PortDefinition

type: Shape

target class: [sysml_vocab:PortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#PortDefinition)

definition of vocabulary class : <p>A PortDefinition defines a point at which external entities can connect to and interact with a system or part of a system. Any <code>ownedUsages</code> of a PortDefinition, other than PortUsages, must not be composite.</p><br><br><p>A PortDefinition must subclass, directly or indirectly, the base Class <em>Port</em> from the Systems model library.</p><br><br>conjugatedPortDefinition = <br>let conjugatedPortDefinitions : Sequence(ConjugatedPortDefinition) =<br>    ownedMember->selectByKind(ConjugatedPortDefinition) in<br>if conjugatedPortDefinitions->isEmpty() then null<br>else conjugatedPortDefinitions->first()<br>endif<br>ownedUsage-><br>    select(not oclIsKindOf(PortUsage))-><br>    forAll(not isComposite)<br>ownedFeature-><br>    selectByKind(ConjugatedPortDefinition)-><br>    size() <= 1<br>specializeFromLibrary('Ports::Port')

description: <p>A PortDefinition defines a point at which external entities can connect to and interact with a system or part of a system. Any <code>ownedUsages</code> of a PortDefinition, other than PortUsages, must not be composite.</p><br><br><p>A PortDefinition must subclass, directly or indirectly, the base Class <em>Port</em> from the Systems model library.</p><br><br>conjugatedPortDefinition = <br>let conjugatedPortDefinitions : Sequence(ConjugatedPortDefinition) =<br>    ownedMember->selectByKind(ConjugatedPortDefinition) in<br>if conjugatedPortDefinitions->isEmpty() then null<br>else conjugatedPortDefinitions->first()<br>endif<br>ownedUsage-><br>    select(not oclIsKindOf(PortUsage))-><br>    forAll(not isComposite)<br>ownedFeature-><br>    selectByKind(ConjugatedPortDefinition)-><br>    size() <= 1<br>specializeFromLibrary('Ports::Port')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:conjugatedPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#conjugatedPortDefinition)| [0..1]| [sysml_vocab:ConjugatedPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ConjugatedPortDefinition)| <p>The <code>type</code> of this ConjugatedPortTyping considered as a FeatureTyping, which must be a ConjugatedPortDefinition.</p><br>| <p>The ConjugatedPortDefinition that is conjugate to this PortDefinition.</p>|



### LiteralString

URI: https://www.omg.org/spec/SysML/20230201/shapes#LiteralString

type: Shape

target class: [sysml_vocab:LiteralString](https://www.omg.org/spec/SysML/20230201/vocab#LiteralString)

definition of vocabulary class : <p>A LiteralString is a LiteralExpression that provides a <code><em>String</em></code> value as a result. Its <code>result</code> parameter must have the type <code><em>String</em></code>.</p><br>

description: <p>A LiteralString is a LiteralExpression that provides a <code><em>String</em></code> value as a result. Its <code>result</code> parameter must have the type <code><em>String</em></code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:value](https://www.omg.org/spec/SysML/20230201/vocab#value)| [1]| String| <p>The Expression that provides the value of the <code>featureWithValue</code> as its <code>result</code>.</p><br><br><p>The Expression that provides the value as a result.</p>| <p>The String value that is the result of evaluating this Expression.</p><br><br><p>The String value that is the result of evaluating this Expression.</p>|



### PortConjugation

URI: https://www.omg.org/spec/SysML/20230201/shapes#PortConjugation

type: Shape

target class: [sysml_vocab:PortConjugation](https://www.omg.org/spec/SysML/20230201/vocab#PortConjugation)

definition of vocabulary class : <p>A PortConjugation is a Conjugation Relationship between a PortDefinition and its corresponding ConjugatedPortDefinition. As a result of this Relationship, the ConjugatedPortDefinition inherits all the <code>features</code> of the original PortDefinition, but input <code>flows</code> of the original PortDefinition become outputs on the ConjugatedPortDefinition and output <code>flows</code> of the original PortDefinition become inputs on the ConjugatedPortDefinition.</code></p><br>

description: <p>A PortConjugation is a Conjugation Relationship between a PortDefinition and its corresponding ConjugatedPortDefinition. As a result of this Relationship, the ConjugatedPortDefinition inherits all the <code>features</code> of the original PortDefinition, but input <code>flows</code> of the original PortDefinition become outputs on the ConjugatedPortDefinition and output <code>flows</code> of the original PortDefinition become inputs on the ConjugatedPortDefinition.</code></p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:originalPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#originalPortDefinition)| [1]| [sysml_vocab:PortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#PortDefinition)| <p>The original PortDefinition for this ConjugatedPortDefinition.</p>| <p>The PortDefinition being conjugated.</p>|
| [sysml_vocab:conjugatedPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#conjugatedPortDefinition)| [1]| [sysml_vocab:ConjugatedPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ConjugatedPortDefinition)| <p>The <code>type</code> of this ConjugatedPortTyping considered as a FeatureTyping, which must be a ConjugatedPortDefinition.</p><br>| <p>The ConjugatedPortDefinition that is conjugate to the <tt>originalPortDefinition</tt>.</p>|



### ConnectionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ConnectionUsage

type: Shape

target class: [sysml_vocab:ConnectionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConnectionUsage)

definition of vocabulary class : <p>A ConnectionUsage is a ConnectorAsUsage that is also a PartUsage. Nominally, if its type is a ConnectionDefinition, then a ConnectionUsage is a Usage of that ConnectionDefinition, representing a connection between parts of a system. However, other kinds of kernel AssociationStructures are also allowed, to permit use of AssociationStructures from the Kernel Library (such as the default BinaryLinkObject).</p><br>specializesFromLibrary("Connections::connections")<br>ownedEndFeature->size() = 2 implies<br>    specializesFromLibrary("Connections::binaryConnections")

description: <p>A ConnectionUsage is a ConnectorAsUsage that is also a PartUsage. Nominally, if its type is a ConnectionDefinition, then a ConnectionUsage is a Usage of that ConnectionDefinition, representing a connection between parts of a system. However, other kinds of kernel AssociationStructures are also allowed, to permit use of AssociationStructures from the Kernel Library (such as the default BinaryLinkObject).</p><br>specializesFromLibrary("Connections::connections")<br>ownedEndFeature->size() = 2 implies<br>    specializesFromLibrary("Connections::binaryConnections")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:connectionDefinition](https://www.omg.org/spec/SysML/20230201/vocab#connectionDefinition)| [0..*]| [sysml_vocab:AssociationStructure](https://www.omg.org/spec/SysML/20230201/vocab#AssociationStructure)| <p>The AssociationStructures that are the types of this ConnectionUsage. Nominally, these are ConnectionDefinitions, but other kinds of Kernel AssociationStructures are also allowed, to permit use of AssociationStructures from the Kernel Library.</p>| <p>The AssociationStructures that are the types of this ConnectionUsage. Nominally, these are ConnectionDefinitions, but other kinds of Kernel AssociationStructures are also allowed, to permit use of AssociationStructures from the Kernel Library.</p>|



### StateUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#StateUsage

type: Shape

target class: [sysml_vocab:StateUsage](https://www.omg.org/spec/SysML/20230201/vocab#StateUsage)

definition of vocabulary class : <p>A <code>StateUsage</code> is an <code>ActionUsage</code> that is nominally the <code>Usage</code> of a <code>StateDefinition</code>. However, other kinds of kernel <code>Behaviors</code> are also allowed as <code>types</code>, to permit use of <code>Behaviors</code from the Kernel Model Libraries.</p><br><br><p>A <code>StateUsage</code> may be related to up to three of its <code>ownedFeatures</code> by <code>StateSubactionMembership</code> <code>Relationships<code>, all of different <code>kinds</code>, corresponding to the entry, do and exit actions of the <code>StateUsage</code>.</p><br><br>let general : Sequence(Type) = ownedGeneralization.general in<br>general->selectByKind(StateDefinition)-><br>    forAll(g | g.isParallel = isParallel) and<br>general->selectByKind(StateUsage)-><br>    forAll(g | g.parallel = isParallel)<br>entryAction <> null implies<br>    entryAction.specializesFromLibrary('StateAction::entryAction')<br>doAction =<br>    let doMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::do) in<br>    if doMemberships->isEmpty() then null<br>    else doMemberships->at(1)<br>    endif<br>entryAction =<br>    let entryMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::entry) in<br>    if entryMemberships->isEmpty() then null<br>    else entryMemberships->at(1)<br>    endif<br>isParallel implies<br>    nestedAction.incomingTransition->isEmpty() and<br>    nestedAction.outgoingTransition->isEmpty()<br>isSubstateUsage(false) implies<br>    specializesFromLibrary('States::State::substates')<br>exitAction =<br>    let exitMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::exit) in<br>    if exitMemberships->isEmpty() then null<br>    else exitMemberships->at(1)<br>    endif<br>specializesFromLibrary('States::StateAction')<br>ownedMembership-><br>    selectByKind(StateSubactionMembership)-><br>    isUnique(kind)

description: <p>A <code>StateUsage</code> is an <code>ActionUsage</code> that is nominally the <code>Usage</code> of a <code>StateDefinition</code>. However, other kinds of kernel <code>Behaviors</code> are also allowed as <code>types</code>, to permit use of <code>Behaviors</code from the Kernel Model Libraries.</p><br><br><p>A <code>StateUsage</code> may be related to up to three of its <code>ownedFeatures</code> by <code>StateSubactionMembership</code> <code>Relationships<code>, all of different <code>kinds</code>, corresponding to the entry, do and exit actions of the <code>StateUsage</code>.</p><br><br>let general : Sequence(Type) = ownedGeneralization.general in<br>general->selectByKind(StateDefinition)-><br>    forAll(g | g.isParallel = isParallel) and<br>general->selectByKind(StateUsage)-><br>    forAll(g | g.parallel = isParallel)<br>entryAction <> null implies<br>    entryAction.specializesFromLibrary('StateAction::entryAction')<br>doAction =<br>    let doMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::do) in<br>    if doMemberships->isEmpty() then null<br>    else doMemberships->at(1)<br>    endif<br>entryAction =<br>    let entryMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::entry) in<br>    if entryMemberships->isEmpty() then null<br>    else entryMemberships->at(1)<br>    endif<br>isParallel implies<br>    nestedAction.incomingTransition->isEmpty() and<br>    nestedAction.outgoingTransition->isEmpty()<br>isSubstateUsage(false) implies<br>    specializesFromLibrary('States::State::substates')<br>exitAction =<br>    let exitMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::exit) in<br>    if exitMemberships->isEmpty() then null<br>    else exitMemberships->at(1)<br>    endif<br>specializesFromLibrary('States::StateAction')<br>ownedMembership-><br>    selectByKind(StateSubactionMembership)-><br>    isUnique(kind)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:isParallel](https://www.omg.org/spec/SysML/20230201/vocab#isParallel)| [1]| Boolean| <p>Whether the <code>nestedStates</code> of this <code>StateUsage</code> are to all be performed in parallel. If true, none of the <code>nestedActions</code> (which include <code>nestedStates</code>) may have any incoming or outgoing <code>Transitions</code>. If false, only one <code>nestedState</code> may be performed at a time.</p><br>| <p>Whether the <code>nestedStates</code> of this <code>StateUsage</code> are to all be performed in parallel. If true, none of the <code>nestedActions</code> (which include <code>nestedStates</code>) may have any incoming or outgoing <code>Transitions</code>. If false, only one <code>nestedState</code> may be performed at a time.</p><br>|
| [sysml_vocab:stateDefinition](https://www.omg.org/spec/SysML/20230201/vocab#stateDefinition)| [0..*]| [sysml_vocab:Behavior](https://www.omg.org/spec/SysML/20230201/vocab#Behavior)| <p>The <code>Behaviors<code> that are the <code>types</code> of this <code>StateUsage<code>. Nominally, these would be <code>StateDefinitions</code>, but kernel <code>Behaviors</code> are also allowed, to permit use of <code>Behaviors</code> from the Kernel Model Libraries.</p>| <p>The <code>Behaviors<code> that are the <code>types</code> of this <code>StateUsage<code>. Nominally, these would be <code>StateDefinitions</code>, but kernel <code>Behaviors</code> are also allowed, to permit use of <code>Behaviors</code> from the Kernel Model Libraries.</p>|
| [sysml_vocab:entryAction](https://www.omg.org/spec/SysML/20230201/vocab#entryAction)| [0..1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> of this <code>StateUsage</code> to be performed on entry to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateUsage</code> by a <code>StateSubactionMembership</code>  with <code>kind = entry</code>.</p>| <p>The <code>ActionUsage</code> of this <code>StateUsage</code> to be performed on entry to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateUsage</code> by a <code>StateSubactionMembership</code>  with <code>kind = entry</code>.</p>|
| [sysml_vocab:doAction](https://www.omg.org/spec/SysML/20230201/vocab#doAction)| [0..1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> of this <code>StateUsage</code> to be performed while in the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateUsage</code> by a <code>StateSubactionMembership</code>  with <code>kind = do</code>.</p>| <p>The <code>ActionUsage</code> of this <code>StateUsage</code> to be performed while in the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateUsage</code> by a <code>StateSubactionMembership</code>  with <code>kind = do</code>.</p>|
| [sysml_vocab:exitAction](https://www.omg.org/spec/SysML/20230201/vocab#exitAction)| [0..1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> of this <code>StateUsage</code> to be performed on exit to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateUsage</code> by a <code>StateSubactionMembership</code>  with <code>kind = exit</code>.</p>| <p>The <code>ActionUsage</code> of this <code>StateUsage</code> to be performed on exit to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateUsage</code> by a <code>StateSubactionMembership</code>  with <code>kind = exit</code>.</p>|



### RenderingUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#RenderingUsage

type: Shape

target class: [sysml_vocab:RenderingUsage](https://www.omg.org/spec/SysML/20230201/vocab#RenderingUsage)

definition of vocabulary class : <p>A RenderingUsage is the usage of a RenderingDefinition to specify the rendering of a specific model view to produce a physical view artifact.</p><br><br><p>A RenderingUsage must subset, directly or indirectly, the base RenderingUsage <code>renderings</code> from the Systems model library.</p>

description: <p>A RenderingUsage is the usage of a RenderingDefinition to specify the rendering of a specific model view to produce a physical view artifact.</p><br><br><p>A RenderingUsage must subset, directly or indirectly, the base RenderingUsage <code>renderings</code> from the Systems model library.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:renderingDefinition](https://www.omg.org/spec/SysML/20230201/vocab#renderingDefinition)| [0..1]| [sysml_vocab:RenderingDefinition](https://www.omg.org/spec/SysML/20230201/vocab#RenderingDefinition)| <p>The RenderingDefinition that defines this RenderingUsage.</p>| <p>The RenderingDefinition that defines this RenderingUsage.</p>|



### UseCaseUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#UseCaseUsage

type: Shape

target class: [sysml_vocab:UseCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#UseCaseUsage)

definition of vocabulary class : <p>A UseCaseUsage is a Usage of a UseCaseDefinition.</p><br><br><p>A UseCaseUsage must subset, directly or indirectly, either the base UseCaseUsage <em><code>useCases</code></em> from the Systems model library. If it is owned by a UseCaseDefinition or UseCaseUsage then it must subset the UseCaseUsage <em><code>UseCase::subUseCases</code></em>.</p>

description: <p>A UseCaseUsage is a Usage of a UseCaseDefinition.</p><br><br><p>A UseCaseUsage must subset, directly or indirectly, either the base UseCaseUsage <em><code>useCases</code></em> from the Systems model library. If it is owned by a UseCaseDefinition or UseCaseUsage then it must subset the UseCaseUsage <em><code>UseCase::subUseCases</code></em>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:useCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#useCaseDefinition)| [0..1]| [sysml_vocab:UseCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#UseCaseDefinition)| <p>The UseCaseDefinition that is the type of this UseCaseUsage.</p>| <p>The UseCaseDefinition that is the type of this UseCaseUsage.</p>|
| [sysml_vocab:includedUseCase](https://www.omg.org/spec/SysML/20230201/vocab#includedUseCase)| [0..*]| [sysml_vocab:UseCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#UseCaseUsage)| <p>The UseCaseUsages that are included by this UseCaseDefinition. Derived as the <code>includedUseCase</code> of the IncludeUseCaseUsages owned by this UseCaseDefinition.</p>| <p>The UseCaseUsages that are included by this UseCaseUsage. Derived as the <code>includedUseCase</code> of the IncludeUseCaseUsages owned by this UseCaseUsage.</p>|



### ViewUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ViewUsage

type: Shape

target class: [sysml_vocab:ViewUsage](https://www.omg.org/spec/SysML/20230201/vocab#ViewUsage)

definition of vocabulary class : <p>A ViewUsage is a usage of a ViewDefinition to specify the generation of a view of the <code>members</code> of a collection of <code>exposedNamespaces</code>. The ViewDefinition can satisfy more <code>viewpoints</code> than its definition, and it can specialize the <code>rendering</code> specified by its definition.<p><br><br><p>A ViewUsage must subset, directly or indirectly, the base ViewUsage <code>views</code> from the Systems model library.</p><br>exposedElement = ownedImport->selectByKind(Expose).<br>    importedMemberships(Set{}).memberElement-><br>    select(elm | includeAsExposed(elm))-><br>    asOrderedSet()

description: <p>A ViewUsage is a usage of a ViewDefinition to specify the generation of a view of the <code>members</code> of a collection of <code>exposedNamespaces</code>. The ViewDefinition can satisfy more <code>viewpoints</code> than its definition, and it can specialize the <code>rendering</code> specified by its definition.<p><br><br><p>A ViewUsage must subset, directly or indirectly, the base ViewUsage <code>views</code> from the Systems model library.</p><br>exposedElement = ownedImport->selectByKind(Expose).<br>    importedMemberships(Set{}).memberElement-><br>    select(elm | includeAsExposed(elm))-><br>    asOrderedSet()

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:viewDefinition](https://www.omg.org/spec/SysML/20230201/vocab#viewDefinition)| [0..1]| [sysml_vocab:ViewDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ViewDefinition)| <p>The definition of this ViewUsage.</p>| <p>The definition of this ViewUsage.</p>|
| [sysml_vocab:satisfiedViewpoint](https://www.omg.org/spec/SysML/20230201/vocab#satisfiedViewpoint)| [0..*]| [sysml_vocab:ViewpointUsage](https://www.omg.org/spec/SysML/20230201/vocab#ViewpointUsage)| <p>The <code>nestedUsages</code> of this ViewUsage that are ViewpointUsages for (additional) viewpoints satisfied by the ViewUsage.</p>| <p>The <code>nestedUsages</code> of this ViewUsage that are ViewpointUsages for (additional) viewpoints satisfied by the ViewUsage.</p>|
| [sysml_vocab:exposedElement](https://www.omg.org/spec/SysML/20230201/vocab#exposedElement)| [0..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The Elements that are exposed by this ViewUsage, derived as those <code>memberElements</code> of the imported Memberships from all the Expose Relationships that meet all the owned and inherited <code>viewConditions</code>.</p>| <p>The Elements that are exposed by this ViewUsage, derived as those <code>memberElements</code> of the imported Memberships from all the Expose Relationships that meet all the owned and inherited <code>viewConditions</code>.</p>|
| [sysml_vocab:viewRendering](https://www.omg.org/spec/SysML/20230201/vocab#viewRendering)| [0..1]| [sysml_vocab:RenderingUsage](https://www.omg.org/spec/SysML/20230201/vocab#RenderingUsage)| <p>The RenderingUsage to be used to render views defined by this ViewUsage. Derived as the <code>referencedRendering</code> of the ViewRenderingMembership of the ViewUsage. A ViewUsage may have at most one.<p>| <p>The RenderingUsage to be used to render views defined by this ViewUsage. Derived as the <code>referencedRendering</code> of the ViewRenderingMembership of the ViewUsage. A ViewUsage may have at most one.<p>|
| [sysml_vocab:viewCondition](https://www.omg.org/spec/SysML/20230201/vocab#viewCondition)| [0..*]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The Expressions related to this ViewUsage by ElementFilterMemberships, which specify conditions on Elements to be rendered in a view.</p>| <p>The Expressions related to this ViewUsage by ElementFilterMemberships, which specify conditions on Elements to be rendered in a view.</p>|



### OccurrenceUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#OccurrenceUsage

type: Shape

target class: [sysml_vocab:OccurrenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#OccurrenceUsage)

definition of vocabulary class : <p>An <code>OccurrenceUsage</code> is a <code>Usage</code> whose <code>types</code> are all <code>Classes</code>. Nominally, if a <code>type</code> is an <code>OccurrenceDefinition</code>, an <code>OccurrenceUsage</code> is a <code>Usage</code> of that <code>OccurrenceDefinition</code> within a system. However, other types of Kernel <code>Classes</code> are also allowed, to permit use of <code>Classes</code> from the Kernel Model Libraries.</p><br><br><p>An <code>OccurrenceUsage</code> must subset, directly or indirectly, the base <code>Feature</code> <em><code>occurrences</code></em> from the Kernel Semantic Library.</p><br><br>let individualDefinitions : Sequence(OccurrenceDefinition) = <br>    occurrenceDefinition-><br>        selectByKind(OccurrenceDefinition)-><br>        select(isIndividual) in<br>if individualDefinitions->isEmpty() then null<br>else individualDefinitions->at(1) endif<br>isIndividual implies individualDefinition <> null<br>specializesFromLibrary("Occurrences::occurrences")<br>isComposite and<br>owningType <> null and<br>(owningType.oclIsKindOf(Class) or<br> owningType.oclIsKindOf(OccurrenceUsage) or<br> owningType.oclIsKindOf(Feature) and<br>    owningType.oclAsType(Feature).type-><br>        exists(oclIsKind(Class))) implies<br>    specializesFromLibrary("Occurrences::Occurrence::suboccurrences")<br>occurrenceDefinition->select(isIndividual).size() <= 1<br>portionKind <> null implies<br>    occurrenceDefinition->forAll(occ | <br>        featuringType->exists(specializes(occ)))

description: <p>An <code>OccurrenceUsage</code> is a <code>Usage</code> whose <code>types</code> are all <code>Classes</code>. Nominally, if a <code>type</code> is an <code>OccurrenceDefinition</code>, an <code>OccurrenceUsage</code> is a <code>Usage</code> of that <code>OccurrenceDefinition</code> within a system. However, other types of Kernel <code>Classes</code> are also allowed, to permit use of <code>Classes</code> from the Kernel Model Libraries.</p><br><br><p>An <code>OccurrenceUsage</code> must subset, directly or indirectly, the base <code>Feature</code> <em><code>occurrences</code></em> from the Kernel Semantic Library.</p><br><br>let individualDefinitions : Sequence(OccurrenceDefinition) = <br>    occurrenceDefinition-><br>        selectByKind(OccurrenceDefinition)-><br>        select(isIndividual) in<br>if individualDefinitions->isEmpty() then null<br>else individualDefinitions->at(1) endif<br>isIndividual implies individualDefinition <> null<br>specializesFromLibrary("Occurrences::occurrences")<br>isComposite and<br>owningType <> null and<br>(owningType.oclIsKindOf(Class) or<br> owningType.oclIsKindOf(OccurrenceUsage) or<br> owningType.oclIsKindOf(Feature) and<br>    owningType.oclAsType(Feature).type-><br>        exists(oclIsKind(Class))) implies<br>    specializesFromLibrary("Occurrences::Occurrence::suboccurrences")<br>occurrenceDefinition->select(isIndividual).size() <= 1<br>portionKind <> null implies<br>    occurrenceDefinition->forAll(occ | <br>        featuringType->exists(specializes(occ)))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:isIndividual](https://www.omg.org/spec/SysML/20230201/vocab#isIndividual)| [1]| Boolean| <p>Whether this <code>OccurrenceUsage</code> represents the usage of the specific individual (or portion of it) represented by its <code>individualDefinition</code>.</p>| <p>Whether this <code>OccurrenceUsage</code> represents the usage of the specific individual (or portion of it) represented by its <code>individualDefinition</code>.</p>|
| [sysml_vocab:portionKind](https://www.omg.org/spec/SysML/20230201/vocab#portionKind)| [0..1]| String| <p>The kind of (temporal) portion of the life of the <code>occurrenceDefinition</code> represented by this <code>OccurrenceUsage</code>, if it is so restricted.</p>| <p>The kind of (temporal) portion of the life of the <code>occurrenceDefinition</code> represented by this <code>OccurrenceUsage</code>, if it is so restricted.</p>|
| [sysml_vocab:occurrenceDefinition](https://www.omg.org/spec/SysML/20230201/vocab#occurrenceDefinition)| [0..*]| [sysml_vocab:Class](https://www.omg.org/spec/SysML/20230201/vocab#Class)| <p>The <code>Classes</code> that are the types of this <code>OccurrenceUsage</code>. Nominally, these are <code>OccurrenceDefinitions</code>, but other kinds of kernel <code>Classes</code> are also allowed, to permit use of <code>Classes</code> from the Kernel Model Libraries.</p>| <p>The <code>Classes</code> that are the types of this <code>OccurrenceUsage</code>. Nominally, these are <code>OccurrenceDefinitions</code>, but other kinds of kernel <code>Classes</code> are also allowed, to permit use of <code>Classes</code> from the Kernel Model Libraries.</p>|
| [sysml_vocab:individualDefinition](https://www.omg.org/spec/SysML/20230201/vocab#individualDefinition)| [0..1]| [sysml_vocab:OccurrenceDefinition](https://www.omg.org/spec/SysML/20230201/vocab#OccurrenceDefinition)| <p>The at most one <code>occurrenceDefinition</code> that has <code>isIndividual = true</code>.</p>| <p>The at most one <code>occurrenceDefinition</code> that has <code>isIndividual = true</code>.</p>|



### Usage

URI: https://www.omg.org/spec/SysML/20230201/shapes#Usage

type: Shape

target class: [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)

definition of vocabulary class : <p>A Usage is a usage of a Definition. A Usage may only be an <code>ownedFeature</code> of a Definition or another Usage.</p><br><br><p>A Usage may have <code>nestedUsages</code> that model <code>features</code> that apply in the context of the <code>owningUsage</code>. A Usage may also have Definitions nested in it, but this has no semantic significance, other than the nested scoping resulting from the Usage being considered as a Namespace for any nested Definitions.</p><br><br><p>However, if a Usage has <code>isVariation</code> = true, then it represents a <em>variation point</em> Usage. In this case, all of its <code>members</code> must be <code>variant</code> Usages, related to the Usage by VariantMembership Relationships. Rather than being <code>features</code> of the Usage, <code>variant</code> Usages model different concrete alternatives that can be chosen to fill in for the variation point Usage.</p><br>variant = variantMembership.ownedVariantUsage<br>variantMembership = ownedMembership->selectByKind(VariantMembership)<br>not isVariation implies variantMembership->isEmpty()<br>isVariation implies variantMembership = ownedMembership<br>isReference = not isComposite<br>owningVariationUsage <> null implies<br>    specializes(owningVariationUsage)<br>isVariation implies<br>    not ownedSpecialization.specific->exists(isVariation)<br>owningVariationDefinition <> null implies<br>    specializes(owningVariationDefinition)

description: <p>A Usage is a usage of a Definition. A Usage may only be an <code>ownedFeature</code> of a Definition or another Usage.</p><br><br><p>A Usage may have <code>nestedUsages</code> that model <code>features</code> that apply in the context of the <code>owningUsage</code>. A Usage may also have Definitions nested in it, but this has no semantic significance, other than the nested scoping resulting from the Usage being considered as a Namespace for any nested Definitions.</p><br><br><p>However, if a Usage has <code>isVariation</code> = true, then it represents a <em>variation point</em> Usage. In this case, all of its <code>members</code> must be <code>variant</code> Usages, related to the Usage by VariantMembership Relationships. Rather than being <code>features</code> of the Usage, <code>variant</code> Usages model different concrete alternatives that can be chosen to fill in for the variation point Usage.</p><br>variant = variantMembership.ownedVariantUsage<br>variantMembership = ownedMembership->selectByKind(VariantMembership)<br>not isVariation implies variantMembership->isEmpty()<br>isVariation implies variantMembership = ownedMembership<br>isReference = not isComposite<br>owningVariationUsage <> null implies<br>    specializes(owningVariationUsage)<br>isVariation implies<br>    not ownedSpecialization.specific->exists(isVariation)<br>owningVariationDefinition <> null implies<br>    specializes(owningVariationDefinition)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:isVariation](https://www.omg.org/spec/SysML/20230201/vocab#isVariation)| [1]| Boolean| <p>Whether this Definition is for a variation point or not. If true, then all the <code>memberships</code> of the Definition must be VariantMemberships.</p>| <p>Whether this Usage is for a variation point or not. If true, then all the <code>memberships</code> of the Usage must be VariantMemberships.</p>|
| [sysml_vocab:isReference](https://www.omg.org/spec/SysML/20230201/vocab#isReference)| [1]| Boolean| <p>Whether this Usage is a reference Usage, derived as the negation of <code>isComposite</code>.<p>| <p>Whether this Usage is a reference Usage, derived as the negation of <code>isComposite</code>.<p>|
| [sysml_vocab:nestedUsage](https://www.omg.org/spec/SysML/20230201/vocab#nestedUsage)| [0..*]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The Usages that are <code>ownedFeatures</code> of this Usage.</p>| <p>The Usages that are <code>ownedFeatures</code> of this Usage.</p>|
| [sysml_vocab:owningUsage](https://www.omg.org/spec/SysML/20230201/vocab#owningUsage)| [0..1]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The Usage in which this Usage is nested (if any).</p>| <p>The Usage in which this Usage is nested (if any).</p>|
| [sysml_vocab:owningDefinition](https://www.omg.org/spec/SysML/20230201/vocab#owningDefinition)| [0..1]| [sysml_vocab:Definition](https://www.omg.org/spec/SysML/20230201/vocab#Definition)| <p>The Definition that owns this Usage (if any).</p>| <p>The Definition that owns this Usage (if any).</p>|
| [sysml_vocab:nestedPort](https://www.omg.org/spec/SysML/20230201/vocab#nestedPort)| [0..*]| [sysml_vocab:PortUsage](https://www.omg.org/spec/SysML/20230201/vocab#PortUsage)| <p>The PortUsages that are <code>nestedUsages</code> of this Usage.</p>| <p>The PortUsages that are <code>nestedUsages</code> of this Usage.</p>|
| [sysml_vocab:nestedAction](https://www.omg.org/spec/SysML/20230201/vocab#nestedAction)| [0..*]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The ActionUsages that are <code>nestedUsages</code> of this Usage.</p><br>| <p>The ActionUsages that are <code>nestedUsages</code> of this Usage.</p><br>|
| [sysml_vocab:nestedState](https://www.omg.org/spec/SysML/20230201/vocab#nestedState)| [0..*]| [sysml_vocab:StateUsage](https://www.omg.org/spec/SysML/20230201/vocab#StateUsage)| <p>The StateUsages that are <code>nestedUsages</code> of this Usage.</p><br>| <p>The StateUsages that are <code>nestedUsages</code> of this Usage.</p><br>|
| [sysml_vocab:nestedConstraint](https://www.omg.org/spec/SysML/20230201/vocab#nestedConstraint)| [0..*]| [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)| <p>The ConstraintUsages that are <code>nestedUsages</code> of this Usage.</p><br>| <p>The ConstraintUsages that are <code>nestedUsages</code> of this Usage.</p><br>|
| [sysml_vocab:nestedTransition](https://www.omg.org/spec/SysML/20230201/vocab#nestedTransition)| [0..*]| [sysml_vocab:TransitionUsage](https://www.omg.org/spec/SysML/20230201/vocab#TransitionUsage)| <p>The TransitionUsages that are <code>nestedUsages</code> of this Usage.</p><br>| <p>The TransitionUsages that are <code>nestedUsages</code> of this Usage.</p><br>|
| [sysml_vocab:nestedRequirement](https://www.omg.org/spec/SysML/20230201/vocab#nestedRequirement)| [0..*]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The RequirementUsages that are <code>nestedUsages</code> of this Usage.</p><br>| <p>The RequirementUsages that are <code>nestedUsages</code> of this Usage.</p><br>|
| [sysml_vocab:nestedCalculation](https://www.omg.org/spec/SysML/20230201/vocab#nestedCalculation)| [0..*]| [sysml_vocab:CalculationUsage](https://www.omg.org/spec/SysML/20230201/vocab#CalculationUsage)| <p>The CalculationUsage that are <code>nestedUsages</code> of this Usage.</p><br>| <p>The CalculationUsage that are <code>nestedUsages</code> of this Usage.</p><br>|
| [sysml_vocab:directedUsage](https://www.omg.org/spec/SysML/20230201/vocab#directedUsage)| [0..*]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>usages</code> of this Definition that are <code>directedFeatures</code>.</p><br>| <p>The <code>usages</code> of this Usage that are <code>directedFeatures</code>.</p><br>|
| [sysml_vocab:nestedCase](https://www.omg.org/spec/SysML/20230201/vocab#nestedCase)| [0..*]| [sysml_vocab:CaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#CaseUsage)| <p>The CaseUsages that are <code>nestedUsages</code> of this Usage.</p><br>| <p>The CaseUsages that are <code>nestedUsages</code> of this Usage.</p><br>|
| [sysml_vocab:nestedAnalysisCase](https://www.omg.org/spec/SysML/20230201/vocab#nestedAnalysisCase)| [0..*]| [sysml_vocab:AnalysisCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#AnalysisCaseUsage)| <p>The AnalysisCaseUsages that are <code>nestedUsages</code> of this Usage.</p><br>| <p>The AnalysisCaseUsages that are <code>nestedUsages</code> of this Usage.</p><br>|
| [sysml_vocab:variantMembership](https://www.omg.org/spec/SysML/20230201/vocab#variantMembership)| [0..*]| [sysml_vocab:VariantMembership](https://www.omg.org/spec/SysML/20230201/vocab#VariantMembership)| <p>The <code>ownedMemberships</code> of this Definition that are VariantMemberships. If <code>isVariation</code> = true, then this must be all <code>ownedMemberships</code> of the Definition. If <code>isVariation</code> = false, then <code>variantMembership</code>must be empty.</p>| <p>The <code>ownedMemberships</code> of this Usage that are VariantMemberships. If <code>isVariation</code> = true, then this must be all <code>memberships</code> of the Usages. If <code>isVariation</code> = false, then <code>variantMembership</code>must be empty.</p>|
| [sysml_vocab:usage](https://www.omg.org/spec/SysML/20230201/vocab#usage)| [0..*]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The Usages that are <code>features</code> of this Definition (not necessarily owned).</p>| <p>The Usages that are <code>features</code> of this Usage (not necessarily owned).</p>|
| [sysml_vocab:variant](https://www.omg.org/spec/SysML/20230201/vocab#variant)| [0..*]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The Usages which represent the variants of this Definition as a variation point Definition, if <code>isVariation</code> = true. If <code>isVariation</code> = false, the there must be no <code>variants</code>.</p>| <p>The Usages which represent the variants of this Usage as a variation point Usage, if <code>isVariation</code> = true. If <code>isVariation</code> = false, the there must be no <code>variants</code>.</p>|
| [sysml_vocab:nestedReference](https://www.omg.org/spec/SysML/20230201/vocab#nestedReference)| [0..*]| [sysml_vocab:ReferenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#ReferenceUsage)| <p>The ReferenceUsages that are <code>nestedUsages</code> of this Usage.</p> <br>| <p>The ReferenceUsages that are <code>nestedUsages</code> of this Usage.</p> <br>|
| [sysml_vocab:nestedConnection](https://www.omg.org/spec/SysML/20230201/vocab#nestedConnection)| [0..*]| [sysml_vocab:ConnectorAsUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConnectorAsUsage)| <p>The ConnectorAsUsages that are <code>nestedUsages</code> of this Usage. Note that this list includes BindingConnectorAsUsages and SuccessionAsUsages, even though these are ConnectorAsUsages but not ConnectionUsages.</p>| <p>The ConnectorAsUsages that are <code>nestedUsages</code> of this Usage. Note that this list includes BindingConnectorAsUsages and SuccessionAsUsages, even though these are ConnectorAsUsages but not ConnectionUsages.</p>|
| [sysml_vocab:nestedItem](https://www.omg.org/spec/SysML/20230201/vocab#nestedItem)| [0..*]| [sysml_vocab:ItemUsage](https://www.omg.org/spec/SysML/20230201/vocab#ItemUsage)| <p>The ItemUsages that are <code>nestedUsages</code> of this Usage.</p>| <p>The ItemUsages that are <code>nestedUsages</code> of this Usage.</p>|
| [sysml_vocab:nestedPart](https://www.omg.org/spec/SysML/20230201/vocab#nestedPart)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The PartUsages that are <code>nestedUsages</code> of this Usage.</p>| <p>The PartUsages that are <code>nestedUsages</code> of this Usage.</p>|
| [sysml_vocab:nestedInterface](https://www.omg.org/spec/SysML/20230201/vocab#nestedInterface)| [0..*]| [sysml_vocab:InterfaceUsage](https://www.omg.org/spec/SysML/20230201/vocab#InterfaceUsage)| <p>The InterfaceUsages that are <code>nestedUsages</code> of this Usage.</p>| <p>The InterfaceUsages that are <code>nestedUsages</code> of this Usage.</p>|
| [sysml_vocab:nestedAttribute](https://www.omg.org/spec/SysML/20230201/vocab#nestedAttribute)| [0..*]| [sysml_vocab:AttributeUsage](https://www.omg.org/spec/SysML/20230201/vocab#AttributeUsage)| <p>The AttributeUsages that are <code>nestedUsages</code> of this Usage.</p><br>| <p>The AttributeUsages that are <code>nestedUsages</code> of this Usage.</p><br>|
| [sysml_vocab:nestedView](https://www.omg.org/spec/SysML/20230201/vocab#nestedView)| [0..*]| [sysml_vocab:ViewUsage](https://www.omg.org/spec/SysML/20230201/vocab#ViewUsage)| <p>The ViewUsages that are <code>nestedUsages</code> of this Usage.</p> <br>| <p>The ViewUsages that are <code>nestedUsages</code> of this Usage.</p> <br>|
| [sysml_vocab:nestedViewpoint](https://www.omg.org/spec/SysML/20230201/vocab#nestedViewpoint)| [0..*]| [sysml_vocab:ViewpointUsage](https://www.omg.org/spec/SysML/20230201/vocab#ViewpointUsage)| <p>The ViewpointUsages of this Usage that are <code>nestedUsages</code>.</p> <br>| <p>The ViewpointUsages of this Usage that are <code>nestedUsages</code>.</p> <br>|
| [sysml_vocab:nestedRendering](https://www.omg.org/spec/SysML/20230201/vocab#nestedRendering)| [0..*]| [sysml_vocab:RenderingUsage](https://www.omg.org/spec/SysML/20230201/vocab#RenderingUsage)| <p>The RenderingUsages that are <code>nestedUsages</code> of this Usage.</p> <br>| <p>The RenderingUsages that are <code>nestedUsages</code> of this Usage.</p> <br>|
| [sysml_vocab:nestedVerificationCase](https://www.omg.org/spec/SysML/20230201/vocab#nestedVerificationCase)| [0..*]| [sysml_vocab:VerificationCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#VerificationCaseUsage)| <p>The VerificationCaseUsages that are <code>nestedUsages</code> of this Usage.</p> <br>| <p>The VerificationCaseUsages that are <code>nestedUsages</code> of this Usage.</p> <br>|
| [sysml_vocab:nestedEnumeration](https://www.omg.org/spec/SysML/20230201/vocab#nestedEnumeration)| [0..*]| [sysml_vocab:EnumerationUsage](https://www.omg.org/spec/SysML/20230201/vocab#EnumerationUsage)| <p>The EnumerationUsages that are <code>nestedUsages</code> of this Usage.<p>| <p>The EnumerationUsages that are <code>nestedUsages</code> of this Usage.<p>|
| [sysml_vocab:nestedAllocation](https://www.omg.org/spec/SysML/20230201/vocab#nestedAllocation)| [0..*]| [sysml_vocab:AllocationUsage](https://www.omg.org/spec/SysML/20230201/vocab#AllocationUsage)| <p>The AllocationUsages that are <code>nestedUsages</code> of this Usage.</p>| <p>The AllocationUsages that are <code>nestedUsages</code> of this Usage.</p>|
| [sysml_vocab:nestedConcern](https://www.omg.org/spec/SysML/20230201/vocab#nestedConcern)| [0..*]| [sysml_vocab:ConcernUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConcernUsage)| <p>The ConcernUsages that are <code>nestedUsages</code> of this Usage.</p><br>| <p>The ConcernUsages that are <code>nestedUsages</code> of this Usage.</p><br>|
| [sysml_vocab:nestedOccurrence](https://www.omg.org/spec/SysML/20230201/vocab#nestedOccurrence)| [0..*]| [sysml_vocab:OccurrenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#OccurrenceUsage)| <p>The OccurrenceUsages that are <code>nestedUsages</code> of this Usage.</p>| <p>The OccurrenceUsages that are <code>nestedUsages</code> of this Usage.</p>|
| [sysml_vocab:definition](https://www.omg.org/spec/SysML/20230201/vocab#definition)| [0..*]| [sysml_vocab:Classifier](https://www.omg.org/spec/SysML/20230201/vocab#Classifier)| <p>The Classifiers that are the types of this Usage. Nominally, these are Definitions, but other kinds of Kernel Classifiers are also allowed, to permit use of Classifiers from the Kernel Library.</p>| <p>The Classifiers that are the types of this Usage. Nominally, these are Definitions, but other kinds of Kernel Classifiers are also allowed, to permit use of Classifiers from the Kernel Library.</p>|
| [sysml_vocab:nestedUseCase](https://www.omg.org/spec/SysML/20230201/vocab#nestedUseCase)| [0..*]| [sysml_vocab:UseCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#UseCaseUsage)| <p>The UseCaseUsages that are <code>nestedUsages</code> of this Usage.</p><br>| <p>The UseCaseUsages that are <code>nestedUsages</code> of this Usage.</p><br>|
| [sysml_vocab:nestedFlow](https://www.omg.org/spec/SysML/20230201/vocab#nestedFlow)| [0..*]| [sysml_vocab:FlowConnectionUsage](https://www.omg.org/spec/SysML/20230201/vocab#FlowConnectionUsage)| <p>The FlowConnectionUsages that are <code>nestedUsages</code> of this Usage.</p>| <p>The FlowConnectionUsages that are <code>nestedUsages</code> of this Usage.</p>|
| [sysml_vocab:nestedMetadata](https://www.omg.org/spec/SysML/20230201/vocab#nestedMetadata)| [0..*]| [sysml_vocab:MetadataUsage](https://www.omg.org/spec/SysML/20230201/vocab#MetadataUsage)| <p>The MetadataUsages that are <code>nestedUsages</code> of this Usage.</p>| <p>The MetadataUsages that are <code>nestedUsages</code> of this Usage.</p>|



### EndFeatureMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#EndFeatureMembership

type: Shape

target class: [sysml_vocab:EndFeatureMembership](https://www.omg.org/spec/SysML/20230201/vocab#EndFeatureMembership)

definition of vocabulary class : <p>EndFeatureMembership is a FeatureMembership that requires its <code>memberFeature</code> be owned and have <code>isEnd = true</code>.</p><br>ownedMemberFeature.isEnd

description: <p>EndFeatureMembership is a FeatureMembership that requires its <code>memberFeature</code> be owned and have <code>isEnd = true</code>.</p><br>ownedMemberFeature.isEnd

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### LibraryPackage

URI: https://www.omg.org/spec/SysML/20230201/shapes#LibraryPackage

type: Shape

target class: [sysml_vocab:LibraryPackage](https://www.omg.org/spec/SysML/20230201/vocab#LibraryPackage)

definition of vocabulary class : <p>A LibraryPackage is a Package that is the container for a model library. A LibraryPackage is itself a library Element as are all Elements that are directly or indirectly contained in it.</p>

description: <p>A LibraryPackage is a Package that is the container for a model library. A LibraryPackage is itself a library Element as are all Elements that are directly or indirectly contained in it.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:isStandard](https://www.omg.org/spec/SysML/20230201/vocab#isStandard)| [1]| Boolean| <p>Whether this LibraryPackage contains a standard library model. This should only be set to true for LibraryPackage in the standard Kernel Libraries or in normative model libraries for a language built on KerML.</p>| <p>Whether this LibraryPackage contains a standard library model. This should only be set to true for LibraryPackage in the standard Kernel Libraries or in normative model libraries for a language built on KerML.</p>|



### Function

URI: https://www.omg.org/spec/SysML/20230201/shapes#Function

type: Shape

target class: [sysml_vocab:Function](https://www.omg.org/spec/SysML/20230201/vocab#Function)

definition of vocabulary class : <p>A Function is a Behavior that has a single <code>out</code> <code>parameter</code> that is identified as its <code>result</code>. Any other <code>parameters</code> of a Function than the <code>result</code> must have direction <code>in</code>. A Function represents the performance of a calculation that produces the values of its <code>result</code> parameter. This calculation may be decomposed into Expressions that are <code>steps</code> of the Function.</p><br><br>ownedMembership.selectByKind(ResultExpressionMembership)-><br>    forAll(mem | ownedFeature.selectByKind(BindingConnector)-><br>        exists(binding |<br>            binding.relatedFeature->includes(result) and<br>            binding.relatedFeature->includes(mem.ownedResultExpression.result)))<br>specializesFromLibrary("Performances::Evaluation")

description: <p>A Function is a Behavior that has a single <code>out</code> <code>parameter</code> that is identified as its <code>result</code>. Any other <code>parameters</code> of a Function than the <code>result</code> must have direction <code>in</code>. A Function represents the performance of a calculation that produces the values of its <code>result</code> parameter. This calculation may be decomposed into Expressions that are <code>steps</code> of the Function.</p><br><br>ownedMembership.selectByKind(ResultExpressionMembership)-><br>    forAll(mem | ownedFeature.selectByKind(BindingConnector)-><br>        exists(binding |<br>            binding.relatedFeature->includes(result) and<br>            binding.relatedFeature->includes(mem.ownedResultExpression.result)))<br>specializesFromLibrary("Performances::Evaluation")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:isModelLevelEvaluable](https://www.omg.org/spec/SysML/20230201/vocab#isModelLevelEvaluable)| [1]| Boolean| <p>Whether this Function can be used as the <code>function</code> of a model-level evaluable InvocationExpression.</p>| <p>Whether this Function can be used as the <code>function</code> of a model-level evaluable InvocationExpression.</p>|
| [sysml_vocab:expression](https://www.omg.org/spec/SysML/20230201/vocab#expression)| [0..*]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The Expressions that are steps in the calculation of the <code>result</code> of this Function.</p><br><br><p>The set of expressions that represent computational steps or parts of a system of equations within the Function.</p><br>| <p>The Expressions that are steps in the calculation of the <code>result</code> of this Function.</p><br><br><p>The set of expressions that represent computational steps or parts of a system of equations within the Function.</p><br>|
| [sysml_vocab:result](https://www.omg.org/spec/SysML/20230201/vocab#result)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>result</code> parameter of the Function, derived as the single <code>parameter</code> of the Function with direction <code>out</code>.</p><br><br><p>The object or value that is the result of evaluating the Function.</p>| <p>The <code>result</code> parameter of the Function, derived as the single <code>parameter</code> of the Function with direction <code>out</code>.</p><br><br><p>The object or value that is the result of evaluating the Function.</p>|



### ConstraintUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#ConstraintUsage

type: Shape

target class: [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)

definition of vocabulary class : <p>A <code>ConstraintUsage</code> is an <code>OccurrenceUsage</code> that is also a <code>BooleanExpression<code>, and, so, is typed by a <code>Predicate</code>. Nominally, if the type is a <code>ConstraintDefinition<code>, a <code>ConstraintUsage</code> is a <code>Usage</code> of that <code>ConstraintDefinition<code>. However, other kinds of kernel <code>Predicates</code> are also allowed, to permit use of <code>Predicates</code> from the Kernel Model Libraries.</p><br>owningFeatureMembership <> null and<br>owningFeatureMembership.oclIsKindOf(RequirementConstraintMembership) implies<br>    if owningFeatureMembership.oclAsType(RequirementConstraintMembership).kind = <br>        RequirementConstraintKind::assumption then<br>        specializesFromLibrary('Requirements::RequirementCheck::assumptions')<br>    else<br>        specializesFromLibrary('Requirements::RequirementCheck::constraints')<br>    endif<br>specializesFromLibrary('Constraints::constraintChecks')<br>owningType <> null and<br>(owningType.oclIsKindOf(ItemDefinition) or<br> owningType.oclIsKindOf(ItemUsage)) implies<br>    specializesFromLibrary('Items::Item::checkedConstraints')

description: <p>A <code>ConstraintUsage</code> is an <code>OccurrenceUsage</code> that is also a <code>BooleanExpression<code>, and, so, is typed by a <code>Predicate</code>. Nominally, if the type is a <code>ConstraintDefinition<code>, a <code>ConstraintUsage</code> is a <code>Usage</code> of that <code>ConstraintDefinition<code>. However, other kinds of kernel <code>Predicates</code> are also allowed, to permit use of <code>Predicates</code> from the Kernel Model Libraries.</p><br>owningFeatureMembership <> null and<br>owningFeatureMembership.oclIsKindOf(RequirementConstraintMembership) implies<br>    if owningFeatureMembership.oclAsType(RequirementConstraintMembership).kind = <br>        RequirementConstraintKind::assumption then<br>        specializesFromLibrary('Requirements::RequirementCheck::assumptions')<br>    else<br>        specializesFromLibrary('Requirements::RequirementCheck::constraints')<br>    endif<br>specializesFromLibrary('Constraints::constraintChecks')<br>owningType <> null and<br>(owningType.oclIsKindOf(ItemDefinition) or<br> owningType.oclIsKindOf(ItemUsage)) implies<br>    specializesFromLibrary('Items::Item::checkedConstraints')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:constraintDefinition](https://www.omg.org/spec/SysML/20230201/vocab#constraintDefinition)| [0..1]| [sysml_vocab:Predicate](https://www.omg.org/spec/SysML/20230201/vocab#Predicate)| <p>The (single) <code>Predicate</code> that is the type of this <code>ConstraintUsage</code>. Nominally, this will be a <code>ConstraintDefinition</code>, but other kinds of <code>Predicates</code> are also allowed, to permit use of <code>Predicates</code> from the Kernel Model Libraries.</p>| <p>The (single) <code>Predicate</code> that is the type of this <code>ConstraintUsage</code>. Nominally, this will be a <code>ConstraintDefinition</code>, but other kinds of <code>Predicates</code> are also allowed, to permit use of <code>Predicates</code> from the Kernel Model Libraries.</p>|



### VerificationCaseUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#VerificationCaseUsage

type: Shape

target class: [sysml_vocab:VerificationCaseUsage](https://www.omg.org/spec/SysML/20230201/vocab#VerificationCaseUsage)

definition of vocabulary class : <p>A VerificationCaseUsage is a Usage of a VerificationCaseDefinition.</p><br><br><p>A VerificationCaseUsage must subset, directly or indirectly, either the base VerificationCaseUsage <code>verificationCases</code> from the Systems model library, if it is not owned by a VerificationCaseDefinition or VerificationCaseUsage, or the VerificationCaseUsage <code>subVerificationCases</code> inherited from its owner, otherwise.</p>

description: <p>A VerificationCaseUsage is a Usage of a VerificationCaseDefinition.</p><br><br><p>A VerificationCaseUsage must subset, directly or indirectly, either the base VerificationCaseUsage <code>verificationCases</code> from the Systems model library, if it is not owned by a VerificationCaseDefinition or VerificationCaseUsage, or the VerificationCaseUsage <code>subVerificationCases</code> inherited from its owner, otherwise.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:verificationCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#verificationCaseDefinition)| [0..1]| [sysml_vocab:VerificationCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#VerificationCaseDefinition)| <p>The VerificationCase that defines this VerificationCaseUsage.</p>| <p>The VerificationCase that defines this VerificationCaseUsage.</p>|
| [sysml_vocab:verifiedRequirement](https://www.omg.org/spec/SysML/20230201/vocab#verifiedRequirement)| [0..*]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The RequirementUsages verified by this VerificationCaseUsage, derived as the <code>verifiedRequirements</code> of all RequirementVerificationMemberships of the <code>objectiveRequirement</code>.</p>| <p>The RequirementUsages verified by this VerificationCaseUsage, derived as the <code>verifiedRequirements</code> of all RequirementVerificationMemberships of the <code>objectiveRequirement</code>.</p>|



### EnumerationDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#EnumerationDefinition

type: Shape

target class: [sysml_vocab:EnumerationDefinition](https://www.omg.org/spec/SysML/20230201/vocab#EnumerationDefinition)

definition of vocabulary class : <p>An <code>EnumerationDefinition</code> is an <code>AttributeDefinition</code> all of whose instances are given by an explicit list of <code>enumeratedValues</code>. This is realized by requiring that the <code>EnumerationDefinition</code> have <code>isVariation = true</code>, with the <code>enumeratedValues</code> being its variants.</p> <br>isVariation

description: <p>An <code>EnumerationDefinition</code> is an <code>AttributeDefinition</code> all of whose instances are given by an explicit list of <code>enumeratedValues</code>. This is realized by requiring that the <code>EnumerationDefinition</code> have <code>isVariation = true</code>, with the <code>enumeratedValues</code> being its variants.</p> <br>isVariation

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:enumeratedValue](https://www.omg.org/spec/SysML/20230201/vocab#enumeratedValue)| [0..*]| [sysml_vocab:EnumerationUsage](https://www.omg.org/spec/SysML/20230201/vocab#EnumerationUsage)| <p>An EnumerationUsage of this EnumerationDefinition with a fixed value, distinct from the value of all other <code>enumerationValues</code>, which specifies one of the allowed instances of the EnumerationDefinition.</p>| <p>An EnumerationUsage of this EnumerationDefinition with a fixed value, distinct from the value of all other <code>enumerationValues</code>, which specifies one of the allowed instances of the EnumerationDefinition.</p>|



### MergeNode

URI: https://www.omg.org/spec/SysML/20230201/shapes#MergeNode

type: Shape

target class: [sysml_vocab:MergeNode](https://www.omg.org/spec/SysML/20230201/vocab#MergeNode)

definition of vocabulary class : <p>A <code>MergeNode</code> is a <code>ControlNode</code> that asserts the merging of its incoming <code>Successions</code>. A <code>MergeNode</code> may have at most one outgoing <code>Successions</code>.</p><br>sourceConnector->selectAsKind(Succession)->size() <= 1<br>targetConnector->selectByKind(Succession)-><br>    collect(connectorEnd->at(1))-><br>    forAll(sourceMult |<br>        multiplicityHasBounds(sourceMult, 0, 1))<br>targetConnector->selectByKind(Succession)-><br>    forAll(subsetsChain(this, <br>        resolveGlobal("ControlPerformances::MergePerformance::incomingHBLink")))<br>specializesFromLibrary("Actions::Action::merges")

description: <p>A <code>MergeNode</code> is a <code>ControlNode</code> that asserts the merging of its incoming <code>Successions</code>. A <code>MergeNode</code> may have at most one outgoing <code>Successions</code>.</p><br>sourceConnector->selectAsKind(Succession)->size() <= 1<br>targetConnector->selectByKind(Succession)-><br>    collect(connectorEnd->at(1))-><br>    forAll(sourceMult |<br>        multiplicityHasBounds(sourceMult, 0, 1))<br>targetConnector->selectByKind(Succession)-><br>    forAll(subsetsChain(this, <br>        resolveGlobal("ControlPerformances::MergePerformance::incomingHBLink")))<br>specializesFromLibrary("Actions::Action::merges")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### WhileLoopActionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#WhileLoopActionUsage

type: Shape

target class: [sysml_vocab:WhileLoopActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#WhileLoopActionUsage)

definition of vocabulary class : <p>A <code>WhileLoopActionUsage</code> is a <code>LoopActionUsage</code> that specifies that the <code>bodyClause</code> <code>ActionUsage</code> should be performed repeatedly while the result of the <code>whileArgument</code> <code>Expression</code> is true or until the result of the <code>untilArgument</code> <code>Expression</code> (if provided) is true. The <code>whileArgument</code> <code>Expression</code> is evaluated before each (possible) performance of the <code>bodyClause</code>, and the <code>untilArgument</code> <code>Expression</code> is evaluated after each performance of the <code>bodyClause</code>.</p><br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::whileLoops')<br>untilArgument =<br>    let parameter : Feature = inputParameter(3) in<br>    if parameter <> null and parameter.oclIsKindOf(Expression) then<br>        parameter.oclAsType(Expression)<br>    else<br>        null<br>    endif<br><br>specializesFromLibrary('Actions::whileLoopActions')<br>whileArgument =<br>    let parameter : Feature = inputParameter(1) in<br>    if parameter <> null and parameter.oclIsKindOf(Expression) then<br>        parameter.oclAsType(Expression)<br>    else<br>        null<br>    endif<br>

description: <p>A <code>WhileLoopActionUsage</code> is a <code>LoopActionUsage</code> that specifies that the <code>bodyClause</code> <code>ActionUsage</code> should be performed repeatedly while the result of the <code>whileArgument</code> <code>Expression</code> is true or until the result of the <code>untilArgument</code> <code>Expression</code> (if provided) is true. The <code>whileArgument</code> <code>Expression</code> is evaluated before each (possible) performance of the <code>bodyClause</code>, and the <code>untilArgument</code> <code>Expression</code> is evaluated after each performance of the <code>bodyClause</code>.</p><br>isSubactionUsage() implies<br>    specializesFromLibrary('Actions::Action::whileLoops')<br>untilArgument =<br>    let parameter : Feature = inputParameter(3) in<br>    if parameter <> null and parameter.oclIsKindOf(Expression) then<br>        parameter.oclAsType(Expression)<br>    else<br>        null<br>    endif<br><br>specializesFromLibrary('Actions::whileLoopActions')<br>whileArgument =<br>    let parameter : Feature = inputParameter(1) in<br>    if parameter <> null and parameter.oclIsKindOf(Expression) then<br>        parameter.oclAsType(Expression)<br>    else<br>        null<br>    endif<br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:whileArgument](https://www.omg.org/spec/SysML/20230201/vocab#whileArgument)| [1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>Expression</code> whose result, if true, determines that the <code>bodyAction</code> should continue to be performed. It the owned <code>parameter</code> that redefines <em><code>WhileLoopAction::whileTest</code></em>.</p> <br>| <p>The <code>Expression</code> whose result, if true, determines that the <code>bodyAction</code> should continue to be performed. It the owned <code>parameter</code> that redefines <em><code>WhileLoopAction::whileTest</code></em>.</p> <br>|
| [sysml_vocab:untilArgument](https://www.omg.org/spec/SysML/20230201/vocab#untilArgument)| [0..1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The <code>Expression</code> whose result, if false, determines that the <code>bodyAction</code> should continue to be performed. It is the owned <code>parameter</code> that redefines <em><code>WhileLoopAction::untilTest</code><em>.</p> <br>| <p>The <code>Expression</code> whose result, if false, determines that the <code>bodyAction</code> should continue to be performed. It is the owned <code>parameter</code> that redefines <em><code>WhileLoopAction::untilTest</code><em>.</p> <br>|



### ViewpointDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#ViewpointDefinition

type: Shape

target class: [sysml_vocab:ViewpointDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ViewpointDefinition)

definition of vocabulary class : <p>A ViewpointDefinition is a RequirementDefinition that specifies one or more stakeholder concerns that to be satisfied by created a view of a model.</p><br><br><p>A ViewpointDefinition must subclass, directly or indirectly, the base ViewpointDefinition Viewpoint from the Systems model library.</p>

description: <p>A ViewpointDefinition is a RequirementDefinition that specifies one or more stakeholder concerns that to be satisfied by created a view of a model.</p><br><br><p>A ViewpointDefinition must subclass, directly or indirectly, the base ViewpointDefinition Viewpoint from the Systems model library.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:viewpointStakeholder](https://www.omg.org/spec/SysML/20230201/vocab#viewpointStakeholder)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The features that identify the stakeholders with concerns framed by this ViewpointDefinition, derived as the owned and inherited <code>stakeholderParameters</code> of the <code>framedConcerns</code> of this ViewpointDefinition.</p>| <p>The features that identify the stakeholders with concerns framed by this ViewpointDefinition, derived as the owned and inherited <code>stakeholderParameters</code> of the <code>framedConcerns</code> of this ViewpointDefinition.</p>|



### ObjectiveMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#ObjectiveMembership

type: Shape

target class: [sysml_vocab:ObjectiveMembership](https://www.omg.org/spec/SysML/20230201/vocab#ObjectiveMembership)

definition of vocabulary class : <p>An ObjectiveMembership is a FeatureMembership that indicates that its <code>ownedObjectiveRequirement</code> is the objective RequirementUsage for its <code>owningType</code>. The <code>owningType</code> of an ObjectiveMembership must be a CaseDefinition or CaseUsage.</p>

description: <p>An ObjectiveMembership is a FeatureMembership that indicates that its <code>ownedObjectiveRequirement</code> is the objective RequirementUsage for its <code>owningType</code>. The <code>owningType</code> of an ObjectiveMembership must be a CaseDefinition or CaseUsage.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:ownedObjectiveRequirement](https://www.omg.org/spec/SysML/20230201/vocab#ownedObjectiveRequirement)| [1]| [sysml_vocab:RequirementUsage](https://www.omg.org/spec/SysML/20230201/vocab#RequirementUsage)| <p>The RequirementUsage that is the <code>ownedMemberFeature</code> of this RequirementUsage.</p> <br>| <p>The RequirementUsage that is the <code>ownedMemberFeature</code> of this RequirementUsage.</p> <br>|



### Metaclass

URI: https://www.omg.org/spec/SysML/20230201/shapes#Metaclass

type: Shape

target class: [sysml_vocab:Metaclass](https://www.omg.org/spec/SysML/20230201/vocab#Metaclass)

definition of vocabulary class : <p>A Metaclass is a Structure used to type MetadataFeatures. It must subclassify, directly or indirectly, the base type <em><code>Metadata</code></em> from the Kernel Library.</p><br>specializesFromLibrary("Metaobjects::Metaobject")

description: <p>A Metaclass is a Structure used to type MetadataFeatures. It must subclassify, directly or indirectly, the base type <em><code>Metadata</code></em> from the Kernel Library.</p><br>specializesFromLibrary("Metaobjects::Metaobject")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### AcceptActionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#AcceptActionUsage

type: Shape

target class: [sysml_vocab:AcceptActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#AcceptActionUsage)

definition of vocabulary class : <p>An <code>AcceptActionUsage</code> is an <code>ActionUsage</code> that specifies the acceptance of an <em><code>incomingTransfer</code></em> from the <code><em>Occurrence</em></code> given by the result of its <code>receiverArgument</code> Expression. (If no <code>receiverArgument</code> is provided, the default is the <em><code>this</code></em> context of the AcceptActionUsage.) The payload of the accepted <em><code>Transfer</em></code> is output on its <code>payloadParameter</code>. Which <em><code>Transfers</em></code> may be accepted is determined by conformance to the typing and (potentially) binding of the <code>payloadParameter</code>.</p><br><br>inputParameters()->size() >= 2<br>receiverArgument = argument(2)<br>payloadArgument = argument(1)<br>payloadParameter = <br> if parameter->isEmpty() then null<br> else parameter->at(1) endif<br>not isTriggerAction() implies<br>    specializesFromLibrary('Actions::acceptActions')<br>isSubactionUsage() and not isTriggerAction() implies<br>    specializesFromLibrary('Actions::Action::acceptSubactions')<br>isTriggerAction() implies<br>    specializesFromLibrary('Actions::TransitionAction::accepter')<br>payloadArgument <> null and<br>payloadArgument.oclIsKindOf(TriggerInvocationExpression) implies<br>    let invocation : Expression =<br>        payloadArgument.oclAsType(Expression) in<br>    parameter->size() >= 2 and<br>    invocation.parameter->size() >= 2 and        <br>    ownedFeature->selectByKind(BindingConnector)->exists(b |<br>        b.relatedFeatures->includes(parameter->at(2)) and<br>        b.relatedFeatures->includes(invocation.parameter->at(2)))

description: <p>An <code>AcceptActionUsage</code> is an <code>ActionUsage</code> that specifies the acceptance of an <em><code>incomingTransfer</code></em> from the <code><em>Occurrence</em></code> given by the result of its <code>receiverArgument</code> Expression. (If no <code>receiverArgument</code> is provided, the default is the <em><code>this</code></em> context of the AcceptActionUsage.) The payload of the accepted <em><code>Transfer</em></code> is output on its <code>payloadParameter</code>. Which <em><code>Transfers</em></code> may be accepted is determined by conformance to the typing and (potentially) binding of the <code>payloadParameter</code>.</p><br><br>inputParameters()->size() >= 2<br>receiverArgument = argument(2)<br>payloadArgument = argument(1)<br>payloadParameter = <br> if parameter->isEmpty() then null<br> else parameter->at(1) endif<br>not isTriggerAction() implies<br>    specializesFromLibrary('Actions::acceptActions')<br>isSubactionUsage() and not isTriggerAction() implies<br>    specializesFromLibrary('Actions::Action::acceptSubactions')<br>isTriggerAction() implies<br>    specializesFromLibrary('Actions::TransitionAction::accepter')<br>payloadArgument <> null and<br>payloadArgument.oclIsKindOf(TriggerInvocationExpression) implies<br>    let invocation : Expression =<br>        payloadArgument.oclAsType(Expression) in<br>    parameter->size() >= 2 and<br>    invocation.parameter->size() >= 2 and        <br>    ownedFeature->selectByKind(BindingConnector)->exists(b |<br>        b.relatedFeatures->includes(parameter->at(2)) and<br>        b.relatedFeatures->includes(invocation.parameter->at(2)))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:receiverArgument](https://www.omg.org/spec/SysML/20230201/vocab#receiverArgument)| [0..1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>An <code>Expression<code> whose <code>result</code> is bound to the <em><code>receiver</code></em> input <code>parameter</code> of this <code>AcceptActionUsage</code>.</p> <br>| <p>An <code>Expression<code> whose <code>result</code> is bound to the <em><code>receiver</code></em> input <code>parameter</code> of this <code>AcceptActionUsage</code>.</p> <br>|
| [sysml_vocab:payloadParameter](https://www.omg.org/spec/SysML/20230201/vocab#payloadParameter)| [1]| [sysml_vocab:ReferenceUsage](https://www.omg.org/spec/SysML/20230201/vocab#ReferenceUsage)| <p>The <code>nestedReference</code> of this <code>AcceptActionUsage</code> that redefines the <code>payload</code> output <code>parameter</code> of the base <code>AcceptActionUsage</code> <em><code>AcceptAction</code></em> from the Systems Model Library.</p>| <p>The <code>nestedReference</code> of this <code>AcceptActionUsage</code> that redefines the <code>payload</code> output <code>parameter</code> of the base <code>AcceptActionUsage</code> <em><code>AcceptAction</code></em> from the Systems Model Library.</p>|
| [sysml_vocab:payloadArgument](https://www.omg.org/spec/SysML/20230201/vocab#payloadArgument)| [0..1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>An <code>Expression<code> whose <code>result</code> is bound to the <code><em>payload</em></code> <code>parameter </code> of this <code>AcceptActionUsage</code>. If provided, the <code>AcceptActionUsage</code> will only accept a <code><em>Transfer</em></code> with exactly this <code><em>payload</em></code>.</p> <br>| <p>An <code>Expression<code> whose <code>result</code> is bound to the <code><em>payload</em></code> <code>parameter </code> of this <code>AcceptActionUsage</code>. If provided, the <code>AcceptActionUsage</code> will only accept a <code><em>Transfer</em></code> with exactly this <code><em>payload</em></code>.</p> <br>|



### ConjugatedPortTyping

URI: https://www.omg.org/spec/SysML/20230201/shapes#ConjugatedPortTyping

type: Shape

target class: [sysml_vocab:ConjugatedPortTyping](https://www.omg.org/spec/SysML/20230201/vocab#ConjugatedPortTyping)

definition of vocabulary class : <p>A ConjugatedPortTyping is a FeatureTyping whose <code>type</code> is a ConjugatedPortDefinition. (This relationship is intended to be an abstract syntax marker for a special surface notation for conjugated typing of ports.)</p><br>conjugatedPortDefinition = portDefinition.conjugatedPortDefinition

description: <p>A ConjugatedPortTyping is a FeatureTyping whose <code>type</code> is a ConjugatedPortDefinition. (This relationship is intended to be an abstract syntax marker for a special surface notation for conjugated typing of ports.)</p><br>conjugatedPortDefinition = portDefinition.conjugatedPortDefinition

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:portDefinition](https://www.omg.org/spec/SysML/20230201/vocab#portDefinition)| [1]| [sysml_vocab:PortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#PortDefinition)| <p>The <code>originalPortDefinition</code> of the <code>conjugatedPortDefinition</code> of this ConjugatedPortTyping.</p>| <p>The <code>originalPortDefinition</code> of the <code>conjugatedPortDefinition</code> of this ConjugatedPortTyping.</p>|
| [sysml_vocab:conjugatedPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#conjugatedPortDefinition)| [1]| [sysml_vocab:ConjugatedPortDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ConjugatedPortDefinition)| <p>The <code>type</code> of this ConjugatedPortTyping considered as a FeatureTyping, which must be a ConjugatedPortDefinition.</p><br>| <p>The <code>type</code> of this ConjugatedPortTyping considered as a FeatureTyping, which must be a ConjugatedPortDefinition.</p><br>|



### RequirementDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#RequirementDefinition

type: Shape

target class: [sysml_vocab:RequirementDefinition](https://www.omg.org/spec/SysML/20230201/vocab#RequirementDefinition)

definition of vocabulary class : <p>A RequirementDefinition is a ConstraintDefinition that defines a requirement as a constraint that is used in the context of a specification of a that a valid solution must satisfy. The specification is relative to a specified subject, possibly in collaboration with one or more external actors.</p><br><br><p>A RequirementDefinition must subclass, directly or indirectly, the base RequirementDefinition <em><code>RequirementCheck</code></em> from the Systems model library.</p>

description: <p>A RequirementDefinition is a ConstraintDefinition that defines a requirement as a constraint that is used in the context of a specification of a that a valid solution must satisfy. The specification is relative to a specified subject, possibly in collaboration with one or more external actors.</p><br><br><p>A RequirementDefinition must subclass, directly or indirectly, the base RequirementDefinition <em><code>RequirementCheck</code></em> from the Systems model library.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:reqId](https://www.omg.org/spec/SysML/20230201/vocab#reqId)| [0..1]| String| <p>An optional modeler-specified identifier for this RequirementUsage (used, e.g., to link it to an original requirement text in some source document), derived as the <code>modeledId</code> for the RequirementUsage.</p>| <p>An optional modeler-specified identifier for this RequirementDefinition (used, e.g., to link it to an original requirement text in some source document), derived as the <code>modeledId</code> for the RequirementDefinition.</p>|
| [sysml_vocab:text](https://www.omg.org/spec/SysML/20230201/vocab#text)| [0..*]| String| <p>An optional textual statement of the requirement represented by this RequirementUsage, derived as the <code>bodies<code> of the <code>documentaryComments</code> of the RequirementDefinition.</p>| <p>An optional textual statement of the requirement represented by this RequirementDefinition, derived as the <code>bodies</code> of the <code>documentaryComments</code> of the RequirementDefinition.</p><br>|
| [sysml_vocab:assumedConstraint](https://www.omg.org/spec/SysML/20230201/vocab#assumedConstraint)| [0..*]| [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)| <p>The owned ConstraintUsages that represent assumptions of this RequirementUsage, derived as the <code>ownedConstraints</code> of the <code>RequirementConstraintMemberships</code> of the RequirementUsage with <code>kind</code> = <code>assumption</code>.</p>| <p>The owned ConstraintUsages that represent assumptions of this RequirementDefinition, derived as the <code>ownedConstraints</code> of the <code>RequirementConstraintMemberships</code> of the RequirementDefinition with <code>kind</code> = <code>assumption</code>.</p>|
| [sysml_vocab:requiredConstraint](https://www.omg.org/spec/SysML/20230201/vocab#requiredConstraint)| [0..*]| [sysml_vocab:ConstraintUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConstraintUsage)| <p>The owned ConstraintUsages that represent requirements of this RequirementUsage, derived as the <code>ownedConstraints</code> of the <code>RequirementConstraintMemberships</code> of the RequirementUsage with <code>kind</code> = <code>requirement</code>.</p>| <p>The owned ConstraintUsages that represent requirements of this RequirementDefinition, derived as the <code>ownedConstraints</code> of the <code>RequirementConstraintMemberships</code> of the RequirementDefinition with <code>kind</code> = <code>requirement</code>.</p>|
| [sysml_vocab:subjectParameter](https://www.omg.org/spec/SysML/20230201/vocab#subjectParameter)| [1]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The <code>parameter</code> of this RequirementUsage that is owned via a SubjectMembership, which must redefine, directly or indirectly, the <code>subject</code> parameter of the base RequirementDefinition RequirementCheck from the Systems model library.</p>| <p>The <code>parameter</code> of this RequirementDefinition that is owned via a SubjectMembership, which must redefine, directly or indirectly, the <code>subject</code> parameter of the base RequirementDefinition RequirementCheck from the Systems model library.</p>|
| [sysml_vocab:framedConcern](https://www.omg.org/spec/SysML/20230201/vocab#framedConcern)| [0..*]| [sysml_vocab:ConcernUsage](https://www.omg.org/spec/SysML/20230201/vocab#ConcernUsage)| <p>The Concerns framed by this RequirementUsage, derived as the <code>ownedConcerns</code> of all <code>FramedConcernMemberships</code> of the RequirementUsage.</p>| <p>The Concerns framed by this RequirementDefinition, derived as the <code>ownedConcerns</code> of all <code>FramedConcernMemberships</code> of the RequirementDefinition.</p>|
| [sysml_vocab:actorParameter](https://www.omg.org/spec/SysML/20230201/vocab#actorParameter)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The <code>parameters</code> of this RequirementUsage that are owned via ActorMemberships, which must subset, directly or indirectly, the PartUsage <em><code>actors</code></em> of the base RequirementDefinition <em>RequirementCheck</em> from the Systems model library.</p>| <p>The <code>parameters</code> of this RequirementDefinition that are owned via ActorMemberships, which must subset, directly or indirectly, the PartUsage <em><code>actors</code></em> of the base RequirementDefinition <em>RequirementCheck</em> from the Systems model library.</p>|
| [sysml_vocab:stakeholderParameter](https://www.omg.org/spec/SysML/20230201/vocab#stakeholderParameter)| [0..*]| [sysml_vocab:PartUsage](https://www.omg.org/spec/SysML/20230201/vocab#PartUsage)| <p>The <code>parameters</code> of this RequirementUsage that are owned via StakeholderMemberships, which must subset, directly or indirectly, the PartUsage <em><code>stakeholders</code></em> of the base RequirementDefinition <em>RequirementCheck</em> from the Systems model library.</p>| <p>The <code>parameters</code> of this RequirementDefinition that are owned via StakeholderMemberships, which must subset, directly or indirectly, the PartUsage <em><code>stakeholders</code></em> of the base RequirementDefinition <em>RequirementCheck</em> from the Systems model library.</p>|



### VariantMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#VariantMembership

type: Shape

target class: [sysml_vocab:VariantMembership](https://www.omg.org/spec/SysML/20230201/vocab#VariantMembership)

definition of vocabulary class : <p>A VariantMembership is a Membership between a variation point Definition or Usage and a Usage that represents a variant in the context of that variation. The <code>membershipOwningNamespace</code> for the VariantMembership must be either a Definition or a Usage with <code>isVariation</code> = <code>true</code>.</p>

description: <p>A VariantMembership is a Membership between a variation point Definition or Usage and a Usage that represents a variant in the context of that variation. The <code>membershipOwningNamespace</code> for the VariantMembership must be either a Definition or a Usage with <code>isVariation</code> = <code>true</code>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:ownedVariantUsage](https://www.omg.org/spec/SysML/20230201/vocab#ownedVariantUsage)| [1]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The Usage that represents a variant in the context of the <code>owningVariationDefinition</code> or <code>owningVariationUsage</code>.</p>| <p>The Usage that represents a variant in the context of the <code>owningVariationDefinition</code> or <code>owningVariationUsage</code>.</p>|



### ParameterMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#ParameterMembership

type: Shape

target class: [sysml_vocab:ParameterMembership](https://www.omg.org/spec/SysML/20230201/vocab#ParameterMembership)

definition of vocabulary class : <p>A ParameterMembership is a FeatureMembership that identifies its <code>memberFeature</code> as a parameter, which is always owned, and must have a <code>direction</code>. A ParameterMembership must be owned by a Behavior or a Step.</p>

description: <p>A ParameterMembership is a FeatureMembership that identifies its <code>memberFeature</code> as a parameter, which is always owned, and must have a <code>direction</code>. A ParameterMembership must be owned by a Behavior or a Step.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:ownedMemberParameter](https://www.omg.org/spec/SysML/20230201/vocab#ownedMemberParameter)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Feature that is identified as a parameter by this ParameterMembership, which is always owned by the ParameterMembership.</p><br>| <p>The Feature that is identified as a parameter by this ParameterMembership, which is always owned by the ParameterMembership.</p><br>|



### LiteralInfinity

URI: https://www.omg.org/spec/SysML/20230201/shapes#LiteralInfinity

type: Shape

target class: [sysml_vocab:LiteralInfinity](https://www.omg.org/spec/SysML/20230201/vocab#LiteralInfinity)

definition of vocabulary class : <p>A LiteralInfinity is a LiteralExpression that provides the positive infinity value (<code>*</code>). It's <code>result</code> must have the type <code><em>Positive</em></code>.</p><br>

description: <p>A LiteralInfinity is a LiteralExpression that provides the positive infinity value (<code>*</code>). It's <code>result</code> must have the type <code><em>Positive</em></code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### AnalysisCaseDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#AnalysisCaseDefinition

type: Shape

target class: [sysml_vocab:AnalysisCaseDefinition](https://www.omg.org/spec/SysML/20230201/vocab#AnalysisCaseDefinition)

definition of vocabulary class : <p>An AnalysisCaseDefinition is a CaseDefinition for the case of carrying out an analysis.</p><br><br><p>An AnalysisCaseDefinition must subclass, directly or indirectly, the base AnalysisCaseDefinition AnalysisCase from the Systems model library.</p>

description: <p>An AnalysisCaseDefinition is a CaseDefinition for the case of carrying out an analysis.</p><br><br><p>An AnalysisCaseDefinition must subclass, directly or indirectly, the base AnalysisCaseDefinition AnalysisCase from the Systems model library.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:analysisAction](https://www.omg.org/spec/SysML/20230201/vocab#analysisAction)| [0..*]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>features</code> of the AnalysisCaseUsage that are typed as AnalysisActions. Each <code>analysisAction</code> ActionUsage must subset the <code>analysisSteps</code> ActionUsage of the base AnalysisCaseDefinition AnalysisCase from the Systems model library.</p><br>| <p>The <code>actions</code> of the AnalysisCaseDefinitions that are typed as AnalysisActions. Each <code>analysisAction</code> ActionUsage must subset the <code<>analysisSteps</code> ActionUsage of the base AnalysisCaseDefinition AnalysisCase from the Systems model library.</p>|
| [sysml_vocab:resultExpression](https://www.omg.org/spec/SysML/20230201/vocab#resultExpression)| [0..1]| [sysml_vocab:Expression](https://www.omg.org/spec/SysML/20230201/vocab#Expression)| <p>The Expression used to compute the <code>result</code> of the AnalysisCaseUsage, derived as the Expression owned via a ResultExpressionMembership. The <code>resultExpression</code> must redefine directly or indirectly, the <code>resultEvaluation</code> Expression of the base AnalysisCaseDefinition AnalysisCase from the Systems model library.</p><br>| <p>The Expression used to compute the <code>result</code> of the AnalysisCaseDefinition, derived as the Expression own via a ResultExpressionMembership. The <code>resultExpression</code> must redefine directly or indirectly, the <code>resultEvaluation</code> Expression of the base AnalysisCaseDefinition AnalysisCase from the Systems model library.</p><br>|



### Featuring

URI: https://www.omg.org/spec/SysML/20230201/shapes#Featuring

type: Shape

target class: [sysml_vocab:Featuring](https://www.omg.org/spec/SysML/20230201/vocab#Featuring)

definition of vocabulary class : <p>Featuring is a Relationship between a Type and a Feature that is featured by that Type. Every instance in the domain of the <code>feature</code> must be classified by the <code>type</code>. This means that sequences that are classified by the <code>feature</code> must have a prefix subsequence that is classified by the <code>type</code>.</p><br><br><p>Featuring is abstract and does not commit to which of <code>feature</code> or <code>type</code> are the source or target. This commitment is made in the subclasses of Featuring, TypeFeaturing and FeatureMembership, which are directed differently.</p>

description: <p>Featuring is a Relationship between a Type and a Feature that is featured by that Type. Every instance in the domain of the <code>feature</code> must be classified by the <code>type</code>. This means that sequences that are classified by the <code>feature</code> must have a prefix subsequence that is classified by the <code>type</code>.</p><br><br><p>Featuring is abstract and does not commit to which of <code>feature</code> or <code>type</code> are the source or target. This commitment is made in the subclasses of Featuring, TypeFeaturing and FeatureMembership, which are directed differently.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:type](https://www.omg.org/spec/SysML/20230201/vocab#type)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The Type that is being applied by this FeatureTyping.</p><br>| <p>The Type that features the <code>featureOfType</code>.</p>|
| [sysml_vocab:feature](https://www.omg.org/spec/SysML/20230201/vocab#feature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The <code>ownedMemberFeatures</code> of the <code>featureMemberships</code> of this Type.</p><br>| <p>The Feature that is featured by the <code>featuringType</code>.</p>|



### FeatureTyping

URI: https://www.omg.org/spec/SysML/20230201/shapes#FeatureTyping

type: Shape

target class: [sysml_vocab:FeatureTyping](https://www.omg.org/spec/SysML/20230201/vocab#FeatureTyping)

definition of vocabulary class : <p>FeatureTyping is Specialization in which the <code>specific</code> Type is a Feature. This means the set of instances of the (specific) <code>typedFeature</code> is a subset of the set of instances of the (general) <code>type</code>. In the simplest case, the <code>type</code> is a Classifier, whereupon the <code>typedFeature</code> subset has instances interpreted as sequences ending in things (in the modeled universe) that are instances of the Classifier.</p><br>

description: <p>FeatureTyping is Specialization in which the <code>specific</code> Type is a Feature. This means the set of instances of the (specific) <code>typedFeature</code> is a subset of the set of instances of the (general) <code>type</code>. In the simplest case, the <code>type</code> is a Classifier, whereupon the <code>typedFeature</code> subset has instances interpreted as sequences ending in things (in the modeled universe) that are instances of the Classifier.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:typedFeature](https://www.omg.org/spec/SysML/20230201/vocab#typedFeature)| [1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>The Feature that has its Type determined by this FeatureTyping.</p>| <p>The Feature that has its Type determined by this FeatureTyping.</p>|
| [sysml_vocab:type](https://www.omg.org/spec/SysML/20230201/vocab#type)| [1]| [sysml_vocab:Type](https://www.omg.org/spec/SysML/20230201/vocab#Type)| <p>The Type that is being applied by this FeatureTyping.</p><br>| <p>The Type that is being applied by this FeatureTyping.</p><br>|
| [sysml_vocab:owningFeature](https://www.omg.org/spec/SysML/20230201/vocab#owningFeature)| [0..1]| [sysml_vocab:Feature](https://www.omg.org/spec/SysML/20230201/vocab#Feature)| <p>A <code>featureInverted</code> that is also an <code>owningRelatedElement<code>.</p>| <p>The Feature that owns this FeatureTyping (which must also be the <code>typedFeature</code>).</p>|



### SuccessionFlowConnectionUsage

URI: https://www.omg.org/spec/SysML/20230201/shapes#SuccessionFlowConnectionUsage

type: Shape

target class: [sysml_vocab:SuccessionFlowConnectionUsage](https://www.omg.org/spec/SysML/20230201/vocab#SuccessionFlowConnectionUsage)

definition of vocabulary class : <p>A SuccessionFlowConnectionUsage is a FlowConnectionUsage that is also a SuccessionItemFlow.</p><br>specializesFromLibrary("Connections::successionFlowConnections")

description: <p>A SuccessionFlowConnectionUsage is a FlowConnectionUsage that is also a SuccessionItemFlow.</p><br>specializesFromLibrary("Connections::successionFlowConnections")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### ConnectionDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#ConnectionDefinition

type: Shape

target class: [sysml_vocab:ConnectionDefinition](https://www.omg.org/spec/SysML/20230201/vocab#ConnectionDefinition)

definition of vocabulary class : <p>A ConnectionDefinition is a PartDefinition that is also an AssociationStructure, with two or more end features. The <code>associationEnds</code> of a ConnectionDefinition must be Usages.</p><br>specializesFromLibrary("Connections::Connection")<br>ownedEndFeature->size() = 2 implies<br>    specializesFromLibrary("Connections::BinaryConnections")

description: <p>A ConnectionDefinition is a PartDefinition that is also an AssociationStructure, with two or more end features. The <code>associationEnds</code> of a ConnectionDefinition must be Usages.</p><br>specializesFromLibrary("Connections::Connection")<br>ownedEndFeature->size() = 2 implies<br>    specializesFromLibrary("Connections::BinaryConnections")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:connectionEnd](https://www.omg.org/spec/SysML/20230201/vocab#connectionEnd)| [0..*]| [sysml_vocab:Usage](https://www.omg.org/spec/SysML/20230201/vocab#Usage)| <p>The Usages that define the things related by the ConnectionDefinition.</p>| <p>The Usages that define the things related by the ConnectionDefinition.</p>|



### LiteralExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#LiteralExpression

type: Shape

target class: [sysml_vocab:LiteralExpression](https://www.omg.org/spec/SysML/20230201/vocab#LiteralExpression)

definition of vocabulary class : <p>A LiteralExpression is an Expression that provides a basic value as a result. It must directly or indirectly specialize the Function <code><em>LiteralEvaluation</em></code> from the <code><em>Base</em></code> model library, which has no parameters other than its result, which is a single <code><em>DataValue</em></code>.</p><br><br>isModelLevelEvaluable = true<br>specializesFromLibrary("Performances::literalEvaluations")

description: <p>A LiteralExpression is an Expression that provides a basic value as a result. It must directly or indirectly specialize the Function <code><em>LiteralEvaluation</em></code> from the <code><em>Base</em></code> model library, which has no parameters other than its result, which is a single <code><em>DataValue</em></code>.</p><br><br>isModelLevelEvaluable = true<br>specializesFromLibrary("Performances::literalEvaluations")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### StateDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#StateDefinition

type: Shape

target class: [sysml_vocab:StateDefinition](https://www.omg.org/spec/SysML/20230201/vocab#StateDefinition)

definition of vocabulary class : <p>A <code>StateDefinition</code> is the <code>Definition</code> of the </code>Behavior</code> of a system or part of a system in a certain state condition.</p><br><br><p>A <code>StateDefinition</code> may be related to up to three of its <code>ownedFeatures</code> by <code>StateBehaviorMembership</cod> <code>Relationships</code>, all of different <code>kinds</code>, corresponding to the entry, do and exit actions of the <code>StateDefinition</code>.</p><br>ownedGeneralization.general->selectByKind(StateDefinition)-><br>    forAll(g | g.isParallel = isParallel)<br>specializesFromLibrary('States::StateAction')<br>ownedMembership-><br>    selectByKind(StateSubactionMembership)-><br>    isUnique(kind)<br>state = action->selectByKind(StateUsage)<br>doAction =<br>    let doMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::do) in<br>    if doMemberships->isEmpty() then null<br>    else doMemberships->at(1)<br>    endif<br>entryAction =<br>    let entryMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::entry) in<br>    if entryMemberships->isEmpty() then null<br>    else entryMemberships->at(1)<br>    endif<br>isParallel implies<br>    ownedAction.incomingTransition->isEmpty() and<br>    ownedAction.outgoingTransition->isEmpty()<br>exitAction = <br>    let exitMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::exit) in<br>    if exitMemberships->isEmpty() then null<br>    else exitMemberships->at(1)<br>    endif

description: <p>A <code>StateDefinition</code> is the <code>Definition</code> of the </code>Behavior</code> of a system or part of a system in a certain state condition.</p><br><br><p>A <code>StateDefinition</code> may be related to up to three of its <code>ownedFeatures</code> by <code>StateBehaviorMembership</cod> <code>Relationships</code>, all of different <code>kinds</code>, corresponding to the entry, do and exit actions of the <code>StateDefinition</code>.</p><br>ownedGeneralization.general->selectByKind(StateDefinition)-><br>    forAll(g | g.isParallel = isParallel)<br>specializesFromLibrary('States::StateAction')<br>ownedMembership-><br>    selectByKind(StateSubactionMembership)-><br>    isUnique(kind)<br>state = action->selectByKind(StateUsage)<br>doAction =<br>    let doMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::do) in<br>    if doMemberships->isEmpty() then null<br>    else doMemberships->at(1)<br>    endif<br>entryAction =<br>    let entryMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::entry) in<br>    if entryMemberships->isEmpty() then null<br>    else entryMemberships->at(1)<br>    endif<br>isParallel implies<br>    ownedAction.incomingTransition->isEmpty() and<br>    ownedAction.outgoingTransition->isEmpty()<br>exitAction = <br>    let exitMemberships : Sequence(StateSubactionMembership) =<br>        ownedMembership-><br>            selectByKind(StateSubactionMembership)-><br>            select(kind = StateSubactionKind::exit) in<br>    if exitMemberships->isEmpty() then null<br>    else exitMemberships->at(1)<br>    endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:isParallel](https://www.omg.org/spec/SysML/20230201/vocab#isParallel)| [1]| Boolean| <p>Whether the <code>nestedStates</code> of this <code>StateUsage</code> are to all be performed in parallel. If true, none of the <code>nestedActions</code> (which include <code>nestedStates</code>) may have any incoming or outgoing <code>Transitions</code>. If false, only one <code>nestedState</code> may be performed at a time.</p><br>| <p>Whether the <code>ownedStates</code> of this <code>StateDefinition</code> are to all be performed in parallel. If true, none of the <code>ownedActions</code> (which includes <code>ownedStates</code>) may have any incoming or outgoing <code>Transitions</code>. If false, only one <code>ownedState</code> may be performed at a time.</p><br>|
| [sysml_vocab:state](https://www.omg.org/spec/SysML/20230201/vocab#state)| [0..*]| [sysml_vocab:StateUsage](https://www.omg.org/spec/SysML/20230201/vocab#StateUsage)| <p>The <code>StateUsages</code> that are the <code>actions</code> of the <code>StateDefinition</code>, which specify the discrete states in the behavior defined by the <code>StateDefinition</code>.</p>| <p>The <code>StateUsages</code> that are the <code>actions</code> of the <code>StateDefinition</code>, which specify the discrete states in the behavior defined by the <code>StateDefinition</code>.</p>|
| [sysml_vocab:entryAction](https://www.omg.org/spec/SysML/20230201/vocab#entryAction)| [0..1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> of this <code>StateUsage</code> to be performed on entry to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateUsage</code> by a <code>StateSubactionMembership</code>  with <code>kind = entry</code>.</p>| <p>The <code>ActionUsage</code> of this <code>StateDefinition</code> to be performed on entry to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateDefinition</code> by a <code>StateSubactionMembership</code>  with <code>kind = entry</code>.</p>|
| [sysml_vocab:doAction](https://www.omg.org/spec/SysML/20230201/vocab#doAction)| [0..1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> of this <code>StateUsage</code> to be performed while in the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateUsage</code> by a <code>StateSubactionMembership</code>  with <code>kind = do</code>.</p>| <p>The <code>ActionUsage</code> of this <code>StateDefinition</code> to be performed while in the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateDefinition</code> by a <code>StateSubactionMembership</code>  with <code>kind = do</code>.</p>|
| [sysml_vocab:exitAction](https://www.omg.org/spec/SysML/20230201/vocab#exitAction)| [0..1]| [sysml_vocab:ActionUsage](https://www.omg.org/spec/SysML/20230201/vocab#ActionUsage)| <p>The <code>ActionUsage</code> of this <code>StateUsage</code> to be performed on exit to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateUsage</code> by a <code>StateSubactionMembership</code>  with <code>kind = exit</code>.</p>| <p>The <code>ActionUsage</code> of this <code>StateDefinition</code> to be performed on exit to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateDefinition</code> by a <code>StateSubactionMembership</code>  with <code>kind = exit</code>.</p>|



### ReturnParameterMembership

URI: https://www.omg.org/spec/SysML/20230201/shapes#ReturnParameterMembership

type: Shape

target class: [sysml_vocab:ReturnParameterMembership](https://www.omg.org/spec/SysML/20230201/vocab#ReturnParameterMembership)

definition of vocabulary class : <p>A ReturnParameterMembership is a ParameterMembership that indicates that the <code>memberParameter</code> is the <code>result</code> parameter of a Function or Expression. The <code>direction</code> of the <code>memberParameter</code> must be <code>out</code>.</p>

description: <p>A ReturnParameterMembership is a ParameterMembership that indicates that the <code>memberParameter</code> is the <code>result</code> parameter of a Function or Expression. The <code>direction</code> of the <code>memberParameter</code> must be <code>out</code>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Element

URI: https://www.omg.org/spec/SysML/20230201/shapes#Element

type: Shape

target class: [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)

definition of vocabulary class : <p>An <code>Element</code> is a constituent of a model that is uniquely identified relative to all other <code>Elements</code>. It can have <code>Relationships</code> with other <code>Elements</code>. Some of these <code>Relationships</code> might imply ownership of other <code>Elements</code>, which means that if an <code>Element</code> is deleted from a model, then so are all the <code>Elements</code> that it owns.</p><br><br>ownedElement = ownedRelationship.ownedRelatedElement<br>owner = owningRelationship.owningRelatedElement<br>qualifiedName =<br>    if owningNamespace = null then null<br>    else if owningNamespace.owner = null then escapedName()<br>    else if owningNamespace.qualifiedName = null then null<br>    else owningNamespace.qualifiedName + '::' + escapedName()<br>    endif endif endif<br>documentation = ownedElement->selectByKind(Documentation)<br>ownedAnnotation = ownedRelationship->selectByKind(Annotation)-><br>    select(a | a.annotatedElement = self)<br>name = effectiveName()<br>ownedRelationship->exists(isImplied) implies isImpliedIncluded<br>isLibraryElement = libraryNamespace() <>null<br><br>shortName = effectiveShortName()

description: <p>An <code>Element</code> is a constituent of a model that is uniquely identified relative to all other <code>Elements</code>. It can have <code>Relationships</code> with other <code>Elements</code>. Some of these <code>Relationships</code> might imply ownership of other <code>Elements</code>, which means that if an <code>Element</code> is deleted from a model, then so are all the <code>Elements</code> that it owns.</p><br><br>ownedElement = ownedRelationship.ownedRelatedElement<br>owner = owningRelationship.owningRelatedElement<br>qualifiedName =<br>    if owningNamespace = null then null<br>    else if owningNamespace.owner = null then escapedName()<br>    else if owningNamespace.qualifiedName = null then null<br>    else owningNamespace.qualifiedName + '::' + escapedName()<br>    endif endif endif<br>documentation = ownedElement->selectByKind(Documentation)<br>ownedAnnotation = ownedRelationship->selectByKind(Annotation)-><br>    select(a | a.annotatedElement = self)<br>name = effectiveName()<br>ownedRelationship->exists(isImplied) implies isImpliedIncluded<br>isLibraryElement = libraryNamespace() <>null<br><br>shortName = effectiveShortName()

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:elementId](https://www.omg.org/spec/SysML/20230201/vocab#elementId)| [1]| String| <p>The globally unique identifier for this Element. This is intended to be set by tooling, and it must not change during the lifetime of the Element.</p>| <p>The globally unique identifier for this Element. This is intended to be set by tooling, and it must not change during the lifetime of the Element.</p>|
| [sysml_vocab:aliasIds](https://www.omg.org/spec/SysML/20230201/vocab#aliasIds)| [0..*]| String| <p>Various alternative identifiers for this Element. Generally, these will be set by tools.</p>| <p>Various alternative identifiers for this Element. Generally, these will be set by tools.</p>|
| [sysml_vocab:declaredShortName](https://www.omg.org/spec/SysML/20230201/vocab#declaredShortName)| [0..1]| String| <p>An optional alternative name for the <code>Element</code> that is intended to be shorter or in some way more succinct than its primary <code>name</code>. It may act as a modeler-specified identifier for the <code>Element</code>, though it is then the responsibility of the modeler to maintain the uniqueness of this identifier within a model or relative to some other context.</p> <br>| <p>An optional alternative name for the <code>Element</code> that is intended to be shorter or in some way more succinct than its primary <code>name</code>. It may act as a modeler-specified identifier for the <code>Element</code>, though it is then the responsibility of the modeler to maintain the uniqueness of this identifier within a model or relative to some other context.</p> <br>|
| [sysml_vocab:declaredName](https://www.omg.org/spec/SysML/20230201/vocab#declaredName)| [0..1]| String| <p>The declared name of this <code>Element</code>.</p><br>| <p>The declared name of this <code>Element</code>.</p><br>|
| [sysml_vocab:shortName](https://www.omg.org/spec/SysML/20230201/vocab#shortName)| [0..1]| String| <p>The short name to be used for this <code>Element</code> during name resolution within its <code>owningNamespace</code>. This is derived using the <code>effectiveShortName()</code> operation. By default, it is the same as the <code>declaredShortName</code>, but this is overridden for certain kinds of <code>Elements</code> to compute a <code>shortName</code> even when the <code>declaredName</code> is null.</p>| <p>The short name to be used for this <code>Element</code> during name resolution within its <code>owningNamespace</code>. This is derived using the <code>effectiveShortName()</code> operation. By default, it is the same as the <code>declaredShortName</code>, but this is overridden for certain kinds of <code>Elements</code> to compute a <code>shortName</code> even when the <code>declaredName</code> is null.</p>|
| [sysml_vocab:name](https://www.omg.org/spec/SysML/20230201/vocab#name)| [0..1]| String| <p>The name to be used for this <code>Element</code> during name resolution within its <code>owningNamespace</code>. This is derived using the <code>effectiveName()</code> operation. By default, it is the same as the <code>declaredName</code>, but this is overridden for certain kinds of <code>Elements</code> to compute a <code>name</code> even when the <code>declaredName</code> is null.</p>| <p>The name to be used for this <code>Element</code> during name resolution within its <code>owningNamespace</code>. This is derived using the <code>effectiveName()</code> operation. By default, it is the same as the <code>declaredName</code>, but this is overridden for certain kinds of <code>Elements</code> to compute a <code>name</code> even when the <code>declaredName</code> is null.</p>|
| [sysml_vocab:qualifiedName](https://www.omg.org/spec/SysML/20230201/vocab#qualifiedName)| [0..1]| String| <p>The full ownership-qualified name of this <code>Element</code>, represented in a form that is valid according to the KerML textual concrete syntax for qualified names (including use of unrestricted name notation and escaped characters, as necessary). The <code>qualifiedName</code> is null if this <code>Element</code> has no <code>owningNamespace</code> or if there is not a complete ownership chain of named <code>Namespaces</code> from a root <code>Namespace</code> to this <code>Element</code>.</p>| <p>The full ownership-qualified name of this <code>Element</code>, represented in a form that is valid according to the KerML textual concrete syntax for qualified names (including use of unrestricted name notation and escaped characters, as necessary). The <code>qualifiedName</code> is null if this <code>Element</code> has no <code>owningNamespace</code> or if there is not a complete ownership chain of named <code>Namespaces</code> from a root <code>Namespace</code> to this <code>Element</code>.</p>|
| [sysml_vocab:isImpliedIncluded](https://www.omg.org/spec/SysML/20230201/vocab#isImpliedIncluded)| [1]| Boolean| <p>Whether all necessary implied Relationships have been included in the <code>ownedRelationships</code> of this Element. This property may be true, even if there are not actually any <code>ownedRelationships</code> with <code>isImplied = true</code>, meaning that no such Relationships are actually implied for this Element. However, if it is false, then <code>ownedRelationships</code> may <em>not</em> contain any implied Relationships. That is, either <em>all</em> required implied Relationships must be included, or none of them.</p>| <p>Whether all necessary implied Relationships have been included in the <code>ownedRelationships</code> of this Element. This property may be true, even if there are not actually any <code>ownedRelationships</code> with <code>isImplied = true</code>, meaning that no such Relationships are actually implied for this Element. However, if it is false, then <code>ownedRelationships</code> may <em>not</em> contain any implied Relationships. That is, either <em>all</em> required implied Relationships must be included, or none of them.</p>|
| [sysml_vocab:isLibraryElement](https://www.omg.org/spec/SysML/20230201/vocab#isLibraryElement)| [1]| Boolean| <p>Whether this Element is contained in the ownership tree of a library model.</p>| <p>Whether this Element is contained in the ownership tree of a library model.</p>|
| [sysml_vocab:owningMembership](https://www.omg.org/spec/SysML/20230201/vocab#owningMembership)| [0..1]| [sysml_vocab:OwningMembership](https://www.omg.org/spec/SysML/20230201/vocab#OwningMembership)| <p>The <code>owningRelationship</code> of this Element, if that Relationship is a Membership.</p><br>| <p>The <code>owningRelationship</code> of this Element, if that Relationship is a Membership.</p><br>|
| [sysml_vocab:ownedRelationship](https://www.omg.org/spec/SysML/20230201/vocab#ownedRelationship)| [0..*]| [sysml_vocab:Relationship](https://www.omg.org/spec/SysML/20230201/vocab#Relationship)| <p>The Relationships for which this Element is the <tt>owningRelatedElement</tt>.</p>| <p>The Relationships for which this Element is the <tt>owningRelatedElement</tt>.</p>|
| [sysml_vocab:owningRelationship](https://www.omg.org/spec/SysML/20230201/vocab#owningRelationship)| [0..1]| [sysml_vocab:Relationship](https://www.omg.org/spec/SysML/20230201/vocab#Relationship)| <p>The Relationship for which this Element is an <tt>ownedRelatedElement</tt>, if any.</p><br>| <p>The Relationship for which this Element is an <tt>ownedRelatedElement</tt>, if any.</p><br>|
| [sysml_vocab:owningNamespace](https://www.omg.org/spec/SysML/20230201/vocab#owningNamespace)| [0..1]| [sysml_vocab:Namespace](https://www.omg.org/spec/SysML/20230201/vocab#Namespace)| <p>The Namespace that owns this Element, derived as the <code>membershipOwningNamespace</code> of the <code>owningMembership</code> of this Element, if any.</p><br>| <p>The Namespace that owns this Element, derived as the <code>membershipOwningNamespace</code> of the <code>owningMembership</code> of this Element, if any.</p><br>|
| [sysml_vocab:owner](https://www.omg.org/spec/SysML/20230201/vocab#owner)| [0..1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The owner of this Element, derived as the <code>owningRelatedElement</code> of the <code>owningRelationship</code> of this Element, if any.</p>| <p>The owner of this Element, derived as the <code>owningRelatedElement</code> of the <code>owningRelationship</code> of this Element, if any.</p>|
| [sysml_vocab:ownedElement](https://www.omg.org/spec/SysML/20230201/vocab#ownedElement)| [0..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The Elements owned by this Element, derived as the <tt>ownedRelatedElements</tt> of the <tt>ownedRelationships</tt> of this Element.</p><br>| <p>The Elements owned by this Element, derived as the <tt>ownedRelatedElements</tt> of the <tt>ownedRelationships</tt> of this Element.</p><br>|
| [sysml_vocab:documentation](https://www.omg.org/spec/SysML/20230201/vocab#documentation)| [0..*]| [sysml_vocab:Documentation](https://www.omg.org/spec/SysML/20230201/vocab#Documentation)| <p>The Documentation owned by this Element.</p>| <p>The Documentation owned by this Element.</p>|
| [sysml_vocab:ownedAnnotation](https://www.omg.org/spec/SysML/20230201/vocab#ownedAnnotation)| [0..*]| [sysml_vocab:Annotation](https://www.omg.org/spec/SysML/20230201/vocab#Annotation)| <p>The <code>ownedRelationships</code> of this Element that are Annotations, for which this Element is the <code>annotatedElement</code>.</code>| <p>The <code>ownedRelationships</code> of this Element that are Annotations, for which this Element is the <code>annotatedElement</code>.</code>|
| [sysml_vocab:textualRepresentation](https://www.omg.org/spec/SysML/20230201/vocab#textualRepresentation)| [0..*]| [sysml_vocab:TextualRepresentation](https://www.omg.org/spec/SysML/20230201/vocab#TextualRepresentation)| <p>The <code>textualRepresentations</code> that annotate this Element.</p>| <p>The <code>textualRepresentations</code> that annotate this Element.</p>|



### Import

URI: https://www.omg.org/spec/SysML/20230201/shapes#Import

type: Shape

target class: [sysml_vocab:Import](https://www.omg.org/spec/SysML/20230201/vocab#Import)

definition of vocabulary class : <p>An Import is an Relationship between its <code>importOwningNamespace</code> and either a Membership (for a MembershipImport) or another Namespace (for a NamespaceImport), which determines a set of Memberships that become <code>importedMemberships</code> of the <code>importOwningNamespace</code>. If <code>isImportAll = false</code> (the default), then only public Memberships are considered &quot;visible&quot;. If <code>isImportAll = true</code>, then all Memberships are considered &quot;visible&quot;, regardless of their declared <code>visibility</code>. If <code>isRecursive = true</code>, then visible Memberships are also recursively imported from owned sub-Namespaces.</p><br><br>

description: <p>An Import is an Relationship between its <code>importOwningNamespace</code> and either a Membership (for a MembershipImport) or another Namespace (for a NamespaceImport), which determines a set of Memberships that become <code>importedMemberships</code> of the <code>importOwningNamespace</code>. If <code>isImportAll = false</code> (the default), then only public Memberships are considered &quot;visible&quot;. If <code>isImportAll = true</code>, then all Memberships are considered &quot;visible&quot;, regardless of their declared <code>visibility</code>. If <code>isRecursive = true</code>, then visible Memberships are also recursively imported from owned sub-Namespaces.</p><br><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:visibility](https://www.omg.org/spec/SysML/20230201/vocab#visibility)| [1]| String| <p>The visibility level of the imported <code>members</code> from this Import relative to the <code>importOwningNamespace</code>.</p><br>| <p>The visibility level of the imported <code>members</code> from this Import relative to the <code>importOwningNamespace</code>.</p><br>|
| [sysml_vocab:isRecursive](https://www.omg.org/spec/SysML/20230201/vocab#isRecursive)| [1]| Boolean| <p>Whether to recursively import Memberships from visible, owned sub-Namespaces.</p>| <p>Whether to recursively import Memberships from visible, owned sub-Namespaces.</p>|
| [sysml_vocab:isImportAll](https://www.omg.org/spec/SysML/20230201/vocab#isImportAll)| [1]| Boolean| <p>Whether to import memberships without regard to declared visibility.</p><br>| <p>Whether to import memberships without regard to declared visibility.</p><br>|
| [sysml_vocab:importedElement](https://www.omg.org/spec/SysML/20230201/vocab#importedElement)| [1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The effectively imported Element for this Import. For a MembershipImport, this is the <code>memberElement</code> of the <code>importedMembership</code>. For a NamespaceImport, it is the <code>importedNamespace</code>.</p>| <p>The effectively imported Element for this Import. For a MembershipImport, this is the <code>memberElement</code> of the <code>importedMembership</code>. For a NamespaceImport, it is the <code>importedNamespace</code>.</p>|
| [sysml_vocab:importOwningNamespace](https://www.omg.org/spec/SysML/20230201/vocab#importOwningNamespace)| [1]| [sysml_vocab:Namespace](https://www.omg.org/spec/SysML/20230201/vocab#Namespace)| <p>The Namespace into which Memberships are imported by this Import, which must be the <code>owningRelatedElement</code> of the Import.</p> <br>| <p>The Namespace into which Memberships are imported by this Import, which must be the <code>owningRelatedElement</code> of the Import.</p> <br>|



### PartDefinition

URI: https://www.omg.org/spec/SysML/20230201/shapes#PartDefinition

type: Shape

target class: [sysml_vocab:PartDefinition](https://www.omg.org/spec/SysML/20230201/vocab#PartDefinition)

definition of vocabulary class : <p>A <code>PartDefinition</code> is an <code>ItemDefinition</code> of a <code>Class</code> of systems or parts of systems. Note that all parts may be considered items for certain purposes, but not all items are parts that can perform actions within a system.</p><br><br></p>A <code>PartDefinition</code> must specialize, directly or indirectly, the base <code>PartDefinition<code> <em><code>Part</code></em> from the Systems Model Library.</p><br><br>specializesFromLibrary("Parts::Part")

description: <p>A <code>PartDefinition</code> is an <code>ItemDefinition</code> of a <code>Class</code> of systems or parts of systems. Note that all parts may be considered items for certain purposes, but not all items are parts that can perform actions within a system.</p><br><br></p>A <code>PartDefinition</code> must specialize, directly or indirectly, the base <code>PartDefinition<code> <em><code>Part</code></em> from the Systems Model Library.</p><br><br>specializesFromLibrary("Parts::Part")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### NullExpression

URI: https://www.omg.org/spec/SysML/20230201/shapes#NullExpression

type: Shape

target class: [sysml_vocab:NullExpression](https://www.omg.org/spec/SysML/20230201/vocab#NullExpression)

definition of vocabulary class : <p>A NullExpression is an Expression that results in a null value. It must be typed by a <code><em>NullEvaluation</em></code> that results in an empty value.</p><br><br>specializesFromLibrary("Performances::nullEvaluations")

description: <p>A NullExpression is an Expression that results in a null value. It must be typed by a <code><em>NullEvaluation</em></code> that results in an empty value.</p><br><br>specializesFromLibrary("Performances::nullEvaluations")

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Relationship

URI: https://www.omg.org/spec/SysML/20230201/shapes#Relationship

type: Shape

target class: [sysml_vocab:Relationship](https://www.omg.org/spec/SysML/20230201/vocab#Relationship)

definition of vocabulary class : <p>A <code>Relationship</code> is an <code>Element</code> that relates other <code>Element<s/code>. Some of its <code>relatedElements</code> may be owned, in which case those <code>ownedRelatedElements</code> will be deleted from a model if their <code>owningRelationship</code> is. A <code>Relationship</code> may also be owned by another <code>Element</code>, in which case the <code>ownedRelatedElements</code> of the <code>Relationship</code> are also considered to be transitively owned by the <code>owningRelatedElement</code> of the Relationship.</p><br><br><p>The <code>relatedElements</code> of a Relationship are divided into <code>source</code> and <code>target</code> <code>Elements</code>. The <code>Relationship</code> is considered to be directed from the <code>source</code> to the <code>target</code> <code>Elements</code>. An undirected <code>Relationship</code> may have either all <code>source</code> or all <code>target</code> <code>Elements</code>.</p><br><br><p>A &quot;relationship <code>Element</code>&quot; in the abstract syntax is generically any <code>Element</code> that is an instance of either <code>Relationship</code> or a direct or indirect specialization of <code>Relationship</code>. Any other kind of <code>Element</code> is a &quot;non-relationship <code>Element</code>&quot;. It is a convention of that non-relationship <code>Elements</code> are <em>only</em> related via reified relationship <code>Elements</code>. Any meta-associations directly between non-relationship <code>Elements</code> must be derived from underlying reified <code>Relationship</code>.</p><br><br>relatedElement = source->union(target)

description: <p>A <code>Relationship</code> is an <code>Element</code> that relates other <code>Element<s/code>. Some of its <code>relatedElements</code> may be owned, in which case those <code>ownedRelatedElements</code> will be deleted from a model if their <code>owningRelationship</code> is. A <code>Relationship</code> may also be owned by another <code>Element</code>, in which case the <code>ownedRelatedElements</code> of the <code>Relationship</code> are also considered to be transitively owned by the <code>owningRelatedElement</code> of the Relationship.</p><br><br><p>The <code>relatedElements</code> of a Relationship are divided into <code>source</code> and <code>target</code> <code>Elements</code>. The <code>Relationship</code> is considered to be directed from the <code>source</code> to the <code>target</code> <code>Elements</code>. An undirected <code>Relationship</code> may have either all <code>source</code> or all <code>target</code> <code>Elements</code>.</p><br><br><p>A &quot;relationship <code>Element</code>&quot; in the abstract syntax is generically any <code>Element</code> that is an instance of either <code>Relationship</code> or a direct or indirect specialization of <code>Relationship</code>. Any other kind of <code>Element</code> is a &quot;non-relationship <code>Element</code>&quot;. It is a convention of that non-relationship <code>Elements</code> are <em>only</em> related via reified relationship <code>Elements</code>. Any meta-associations directly between non-relationship <code>Elements</code> must be derived from underlying reified <code>Relationship</code>.</p><br><br>relatedElement = source->union(target)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:isImplied](https://www.omg.org/spec/SysML/20230201/vocab#isImplied)| [1]| Boolean| <p>Whether this Relationship was generated by tooling to meet semantic rules, rather than being directly created by a modeler.</p>| <p>Whether this Relationship was generated by tooling to meet semantic rules, rather than being directly created by a modeler.</p>|
| [sysml_vocab:relatedElement](https://www.omg.org/spec/SysML/20230201/vocab#relatedElement)| [0..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The Elements that are related by this Relationship, derived as the union of the <code>source</code> and <code>target</code> Elements of the Relationship.</p>| <p>The Elements that are related by this Relationship, derived as the union of the <code>source</code> and <code>target</code> Elements of the Relationship.</p>|
| [sysml_vocab:target](https://www.omg.org/spec/SysML/20230201/vocab#target)| [0..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <code>relatedElements</code> to which this Relationship is considered to be directed.</p><br>| <p>The <code>relatedElements</code> to which this Relationship is considered to be directed.</p><br>|
| [sysml_vocab:source](https://www.omg.org/spec/SysML/20230201/vocab#source)| [0..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <code>relatedElements</c ode> from which this Relationship is considered to be directed.</p>| <p>The <code>relatedElements</c ode> from which this Relationship is considered to be directed.</p>|
| [sysml_vocab:owningRelatedElement](https://www.omg.org/spec/SysML/20230201/vocab#owningRelatedElement)| [0..1]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <tt>relatedElement</tt> of this Relationship that owns the Relationship, if any.</p>| <p>The <tt>relatedElement</tt> of this Relationship that owns the Relationship, if any.</p>|
| [sysml_vocab:ownedRelatedElement](https://www.omg.org/spec/SysML/20230201/vocab#ownedRelatedElement)| [0..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The <tt>relatedElements</tt> of this Relationship that are owned by the Relationship.</p>| <p>The <tt>relatedElements</tt> of this Relationship that are owned by the Relationship.</p>|



### AnnotatingElement

URI: https://www.omg.org/spec/SysML/20230201/shapes#AnnotatingElement

type: Shape

target class: [sysml_vocab:AnnotatingElement](https://www.omg.org/spec/SysML/20230201/vocab#AnnotatingElement)

definition of vocabulary class : <p>An AnnotatingElement is an Element that provides additional description of or metadata on some other Element. An AnnotatingElement is attached to its <code>annotatedElement</code> by an Annotation Relationship.</p><br><br>annotatedElement = <br> if annotation->notEmpty() then annotation.annotatedElement<br> else owningNamespace endif

description: <p>An AnnotatingElement is an Element that provides additional description of or metadata on some other Element. An AnnotatingElement is attached to its <code>annotatedElement</code> by an Annotation Relationship.</p><br><br>annotatedElement = <br> if annotation->notEmpty() then annotation.annotatedElement<br> else owningNamespace endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [sysml_vocab:annotation](https://www.omg.org/spec/SysML/20230201/vocab#annotation)| [0..*]| [sysml_vocab:Annotation](https://www.omg.org/spec/SysML/20230201/vocab#Annotation)| <p>The Annotations that relate this AnnotatingElement to its <code>annotatedElements</code>.</p>| <p>The Annotations that relate this AnnotatingElement to its <code>annotatedElements</code>.</p>|
| [sysml_vocab:annotatedElement](https://www.omg.org/spec/SysML/20230201/vocab#annotatedElement)| [1..*]| [sysml_vocab:Element](https://www.omg.org/spec/SysML/20230201/vocab#Element)| <p>The Elements that are annotated by this AnnotatingElement. If <code>annotation</code<> is not empty, this is derived as the <code>annotatedElements</code> of the <code>annotations</code>. If <code>annotation</code>, then it is derived as the <code>owningNamespace</code> of the AnnotatingElement.</p><br>| <p>The Elements that are annotated by this AnnotatingElement. If <code>annotation</code<> is not empty, this is derived as the <code>annotatedElements</code> of the <code>annotations</code>. If <code>annotation</code>, then it is derived as the <code>owningNamespace</code> of the AnnotatingElement.</p><br>|




