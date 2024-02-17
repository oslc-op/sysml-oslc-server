# Domain: KerML Shapes
Date of creation: 

Version number: 

Revision number: 

Approved By: 

Date of approval: 

Issued by: 

Referenced Vocabularies: TODO

**NamespaceURI**: https://www.omg.org/spec/KerML/20230201/shapes#

**NamespacePrefix**: kerml_sh

**Other NamespacePrefixes**: 

* dcterms: http://purl.org/dc/terms/

* kerml_vocab: https://www.omg.org/spec/KerML/20230201/vocab#

## Table of Contents
TODO

## Scope
## Background
## Constraints
Note: In the constraints below, 'definition of vocabulary class' &  'definition of Vocabulary Property' values correspond to the rdfs:comment values in the vocabularies. 

### LiteralRational

URI: https://www.omg.org/spec/KerML/20230201/shapes#LiteralRational

type: Shape

target class: [kerml_vocab:LiteralRational](https://www.omg.org/spec/KerML/20230201/vocab#LiteralRational)

definition of vocabulary class : <p>A <code>LiteralRational</code> is a <code>LiteralExpression</code> that provides a <code><em>Rational</em></code> value as a result. Its <code>result</code> <code>parameter</code> must have the type <code><em>Rational</em></code>.</p><br><br>specializesFromLibrary('Performances::literalRationalEvaluations')

description: <p>A <code>LiteralRational</code> is a <code>LiteralExpression</code> that provides a <code><em>Rational</em></code> value as a result. Its <code>result</code> <code>parameter</code> must have the type <code><em>Rational</em></code>.</p><br><br>specializesFromLibrary('Performances::literalRationalEvaluations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:literalRationalValue](https://www.omg.org/spec/KerML/20230201/vocab#literalRationalValue)| [1]| Float| <p>The value whose rational approximation is the result of evaluating this <code>LiteralRational</code>.</p><br><br><p>The Real value that is the result of evaluating this Expression.</p>| <p>The value whose rational approximation is the result of evaluating this <code>LiteralRational</code>.</p><br><br><p>The Real value that is the result of evaluating this Expression.</p>|



### MultiplicityRange

URI: https://www.omg.org/spec/KerML/20230201/shapes#MultiplicityRange

type: Shape

target class: [kerml_vocab:MultiplicityRange](https://www.omg.org/spec/KerML/20230201/vocab#MultiplicityRange)

definition of vocabulary class : <p>A <code>MultiplicityRange</code> is a <code>Multiplicity</code> whose value is defined to be the (inclusive) range of natural numbers given by the result of a <code>lowerBound</code> <code>Expression</code> and the result of an <code>upperBound</code> <code>Expression</code>. The result of these <code>Expressions</code> shall be of type <code><em>Natural</em></code>. If the result of the <code>upperBound</code> <code>Expression</code> is the unbounded value <code>*</code>, then the specified range includes all natural numbers greater than or equal to the <code>lowerBound</code> value. If no <code>lowerBound</code> <code>Expression</code>, then the default is that the lower bound has the same value as the upper bound, except if the <code>upperBound</code> evaluates to <code>*</code>, in which case the default for the lower bound is 0.</p><br><br>bound->forAll(b | b.featuringType = self.featuringType)<br>bound->forAll(b |<br>    b.result.specializesFromLibrary('ScalarValues::Integer') and<br>    let value : UnlimitedNatural = valueOf(b) in<br>    value <> null implies value >= 0<br>)<br>lowerBound =<br>    let ownedMembers : Sequence(Element) = <br>        ownedMembership->selectByKind(OwningMembership).ownedMember in<br>    if ownedMembers->size() < 2 or <br>        not ownedMembers->first().oclIsKindOf(Expression) then null<br>    else ownedMembers->first().oclAsType(Expression)<br>    endif<br>upperBound =<br>    let ownedMembers : Sequence(Element) = <br>        ownedMembership->selectByKind(OwningMembership).ownedMember in<br>    if ownedMembers->isEmpty() or <br>       not ownedMembers->last().oclIsKindOf(Expression) <br>    then null<br>    else ownedMembers->last().oclAsType(Expression)<br>    endif 

description: <p>A <code>MultiplicityRange</code> is a <code>Multiplicity</code> whose value is defined to be the (inclusive) range of natural numbers given by the result of a <code>lowerBound</code> <code>Expression</code> and the result of an <code>upperBound</code> <code>Expression</code>. The result of these <code>Expressions</code> shall be of type <code><em>Natural</em></code>. If the result of the <code>upperBound</code> <code>Expression</code> is the unbounded value <code>*</code>, then the specified range includes all natural numbers greater than or equal to the <code>lowerBound</code> value. If no <code>lowerBound</code> <code>Expression</code>, then the default is that the lower bound has the same value as the upper bound, except if the <code>upperBound</code> evaluates to <code>*</code>, in which case the default for the lower bound is 0.</p><br><br>bound->forAll(b | b.featuringType = self.featuringType)<br>bound->forAll(b |<br>    b.result.specializesFromLibrary('ScalarValues::Integer') and<br>    let value : UnlimitedNatural = valueOf(b) in<br>    value <> null implies value >= 0<br>)<br>lowerBound =<br>    let ownedMembers : Sequence(Element) = <br>        ownedMembership->selectByKind(OwningMembership).ownedMember in<br>    if ownedMembers->size() < 2 or <br>        not ownedMembers->first().oclIsKindOf(Expression) then null<br>    else ownedMembers->first().oclAsType(Expression)<br>    endif<br>upperBound =<br>    let ownedMembers : Sequence(Element) = <br>        ownedMembership->selectByKind(OwningMembership).ownedMember in<br>    if ownedMembers->isEmpty() or <br>       not ownedMembers->last().oclIsKindOf(Expression) <br>    then null<br>    else ownedMembers->last().oclAsType(Expression)<br>    endif 

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:multiplicityRangeLowerBound](https://www.omg.org/spec/KerML/20230201/vocab#multiplicityRangeLowerBound)| [0..1]| [kerml_vocab:Expression](https://www.omg.org/spec/KerML/20230201/vocab#Expression)| <p>The <code>Expression</code> whose result provides the lower bound of the <code>MultiplicityRange</code>. If no <code>lowerBound</code> <code>Expression</code> is given, then the lower bound shall have the same value as the upper bound, unless the upper bound is unbounded (<code>*</code>), in which case the lower bound shall be 0.</p><br>| <p>The <code>Expression</code> whose result provides the lower bound of the <code>MultiplicityRange</code>. If no <code>lowerBound</code> <code>Expression</code> is given, then the lower bound shall have the same value as the upper bound, unless the upper bound is unbounded (<code>*</code>), in which case the lower bound shall be 0.</p><br>|
| [kerml_vocab:multiplicityRangeUpperBound](https://www.omg.org/spec/KerML/20230201/vocab#multiplicityRangeUpperBound)| [1]| [kerml_vocab:Expression](https://www.omg.org/spec/KerML/20230201/vocab#Expression)| The <code>Expression</code> whose result is the upper bound of the <code>MultiplicityRange</code>.| The <code>Expression</code> whose result is the upper bound of the <code>MultiplicityRange</code>.|
| [kerml_vocab:multiplicityRangeBound](https://www.omg.org/spec/KerML/20230201/vocab#multiplicityRangeBound)| [1..*]| [kerml_vocab:Expression](https://www.omg.org/spec/KerML/20230201/vocab#Expression)| <p>The owned <code>Expressions</code> of the <code>MultiplicityRange</code> whose results provide its bounds. These must be the only <code>ownedMembers</code> of the <code>MultiplicityRange</code>.</p>| <p>The owned <code>Expressions</code> of the <code>MultiplicityRange</code> whose results provide its bounds. These must be the only <code>ownedMembers</code> of the <code>MultiplicityRange</code>.</p>|



### DataType

URI: https://www.omg.org/spec/KerML/20230201/shapes#DataType

type: Shape

target class: [kerml_vocab:DataType](https://www.omg.org/spec/KerML/20230201/vocab#DataType)

definition of vocabulary class : <p>A <code>DataType</code> is a <code>Classifier</code> of things (in the universe) that can only be distinguished by how they are related to other things (via Features). This means multiple things classified by the same <code>DataType</code></p><br><br><ul><br>	<li>Cannot be distinguished when they are related to other things in exactly the same way, even when they are intended to be about different things.</li><br>	<li>Can be distinguished when they are related to other things in different ways, even when they are intended to be about the same thing.</li><br></ul><br><br>specializesFromLibrary('Base::DataValue')<br>ownedSpecialization.general-><br>    forAll(not oclIsKindOf(Class) and <br>           not oclIsKindOf(Association))

description: <p>A <code>DataType</code> is a <code>Classifier</code> of things (in the universe) that can only be distinguished by how they are related to other things (via Features). This means multiple things classified by the same <code>DataType</code></p><br><br><ul><br>	<li>Cannot be distinguished when they are related to other things in exactly the same way, even when they are intended to be about different things.</li><br>	<li>Can be distinguished when they are related to other things in different ways, even when they are intended to be about the same thing.</li><br></ul><br><br>specializesFromLibrary('Base::DataValue')<br>ownedSpecialization.general-><br>    forAll(not oclIsKindOf(Class) and <br>           not oclIsKindOf(Association))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### ItemFlowEnd

URI: https://www.omg.org/spec/KerML/20230201/shapes#ItemFlowEnd

type: Shape

target class: [kerml_vocab:ItemFlowEnd](https://www.omg.org/spec/KerML/20230201/vocab#ItemFlowEnd)

definition of vocabulary class : <p>An <code>ItemFlowEnd</code> is a <code>Feature</code> that is one of the <code>connectorEnds</code> giving the <code><em>source</em></code> or <code><em>target</em></code> of an <code>ItemFlow</code>. For <code>ItemFlows</code> typed by <code><em>FlowTransfer</em></code> or its specializations, <code>ItemFlowEnds</code> must have exactly one <code>ownedFeature</code>, which redefines <code><em>Transfer::source::sourceOutput</em></code> or <code><em>Transfer::target::targetInput</em></code> and redefines the corresponding feature of the <code>relatedElement</code> for its end.</p><br>isEnd<br>ownedFeature->size() = 1<br>owningType <> null and owningType.oclIsKindOf(ItemFlow)

description: <p>An <code>ItemFlowEnd</code> is a <code>Feature</code> that is one of the <code>connectorEnds</code> giving the <code><em>source</em></code> or <code><em>target</em></code> of an <code>ItemFlow</code>. For <code>ItemFlows</code> typed by <code><em>FlowTransfer</em></code> or its specializations, <code>ItemFlowEnds</code> must have exactly one <code>ownedFeature</code>, which redefines <code><em>Transfer::source::sourceOutput</em></code> or <code><em>Transfer::target::targetInput</em></code> and redefines the corresponding feature of the <code>relatedElement</code> for its end.</p><br>isEnd<br>ownedFeature->size() = 1<br>owningType <> null and owningType.oclIsKindOf(ItemFlow)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Structure

URI: https://www.omg.org/spec/KerML/20230201/shapes#Structure

type: Shape

target class: [kerml_vocab:Structure](https://www.omg.org/spec/KerML/20230201/vocab#Structure)

definition of vocabulary class : <p>A <code>Structure</code> is a <code>Class</code> of objects in the modeled universe that are primarily structural in nature. While such an object is not itself behavioral, it may be involved in and acted on by <code>Behaviors</code>, and it may be the performer of some of them.</p><br><br>specializesFromLibrary('Objects::Object')<br>ownedSpecialization.general->forAll(not oclIsKindOf(Behavior))

description: <p>A <code>Structure</code> is a <code>Class</code> of objects in the modeled universe that are primarily structural in nature. While such an object is not itself behavioral, it may be involved in and acted on by <code>Behaviors</code>, and it may be the performer of some of them.</p><br><br>specializesFromLibrary('Objects::Object')<br>ownedSpecialization.general->forAll(not oclIsKindOf(Behavior))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### LiteralInfinity

URI: https://www.omg.org/spec/KerML/20230201/shapes#LiteralInfinity

type: Shape

target class: [kerml_vocab:LiteralInfinity](https://www.omg.org/spec/KerML/20230201/vocab#LiteralInfinity)

definition of vocabulary class : <p>A <code>LiteralInfinity</code> is a <code>LiteralExpression</code> that provides the positive infinity value (<code>*</code>). It's <code>result</code> must have the type <code><em>Positive</em></code>.</p><br><br>specializesFromLibrary('Performances::literalIntegerEvaluations')

description: <p>A <code>LiteralInfinity</code> is a <code>LiteralExpression</code> that provides the positive infinity value (<code>*</code>). It's <code>result</code> must have the type <code><em>Positive</em></code>.</p><br><br>specializesFromLibrary('Performances::literalIntegerEvaluations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Metaclass

URI: https://www.omg.org/spec/KerML/20230201/shapes#Metaclass

type: Shape

target class: [kerml_vocab:Metaclass](https://www.omg.org/spec/KerML/20230201/vocab#Metaclass)

definition of vocabulary class : <p>A <code>Metaclass</code> is a <code>Structure</code> used to type <code>MetadataFeatures</code>.</p><br>specializesFromLibrary('Metaobjects::Metaobject')

description: <p>A <code>Metaclass</code> is a <code>Structure</code> used to type <code>MetadataFeatures</code>.</p><br>specializesFromLibrary('Metaobjects::Metaobject')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Expression

URI: https://www.omg.org/spec/KerML/20230201/shapes#Expression

type: Shape

target class: [kerml_vocab:Expression](https://www.omg.org/spec/KerML/20230201/vocab#Expression)

definition of vocabulary class : <p>An <code>Expression</code> is a <code>Step</code> that is typed by a <code>Function</code>. An <code>Expression</code> that also has a <code>Function</code> as its <code>featuringType</code> is a computational step within that <code>Function</code>. An <code>Expression</code> always has a single <code>result</code> parameter, which redefines the <code>result</code> parameter of its defining <code>function</code>. This allows <code>Expressions</code> to be interconnected in tree structures, in which inputs to each <code>Expression</code> in the tree are determined as the results of other <code>Expression</code> in the tree.</p><br><br>isModelLevelEvaluable = modelLevelEvaluable(Set(Element){})<br>specializesFromLibrary('Performances::evaluations')<br>owningMembership <> null and <br>owningMembership.oclIsKindOf(FeatureValue) implies<br>    let featureWithValue : Feature = <br>        owningMembership.oclAsType(FeatureValue).featureWithValue in<br>    featuringType = featureWithValue.featuringType<br>ownedMembership.selectByKind(ResultExpressionMembership)-><br>    forAll(mem | ownedFeature.selectByKind(BindingConnector)-><br>        exists(binding |<br>            binding.relatedFeature->includes(result) and<br>            binding.relatedFeature->includes(mem.ownedResultExpression.result)))<br>result =<br>    let resultParams : Sequence(Feature) =<br>        ownedFeatureMemberships-><br>            selectByKind(ReturnParameterMembership).<br>            ownedParameterMember in<br>    if resultParams->notEmpty() then resultParams->first()<br>    else if function <> null then function.result<br>    else null<br>    endif endif<br>ownedFeatureMembership-><br>    selectByKind(ReturnParameterMembership)-><br>    size() <= 1<br>membership->selectByKind(ResultExpressionMembership)->size() <= 1

description: <p>An <code>Expression</code> is a <code>Step</code> that is typed by a <code>Function</code>. An <code>Expression</code> that also has a <code>Function</code> as its <code>featuringType</code> is a computational step within that <code>Function</code>. An <code>Expression</code> always has a single <code>result</code> parameter, which redefines the <code>result</code> parameter of its defining <code>function</code>. This allows <code>Expressions</code> to be interconnected in tree structures, in which inputs to each <code>Expression</code> in the tree are determined as the results of other <code>Expression</code> in the tree.</p><br><br>isModelLevelEvaluable = modelLevelEvaluable(Set(Element){})<br>specializesFromLibrary('Performances::evaluations')<br>owningMembership <> null and <br>owningMembership.oclIsKindOf(FeatureValue) implies<br>    let featureWithValue : Feature = <br>        owningMembership.oclAsType(FeatureValue).featureWithValue in<br>    featuringType = featureWithValue.featuringType<br>ownedMembership.selectByKind(ResultExpressionMembership)-><br>    forAll(mem | ownedFeature.selectByKind(BindingConnector)-><br>        exists(binding |<br>            binding.relatedFeature->includes(result) and<br>            binding.relatedFeature->includes(mem.ownedResultExpression.result)))<br>result =<br>    let resultParams : Sequence(Feature) =<br>        ownedFeatureMemberships-><br>            selectByKind(ReturnParameterMembership).<br>            ownedParameterMember in<br>    if resultParams->notEmpty() then resultParams->first()<br>    else if function <> null then function.result<br>    else null<br>    endif endif<br>ownedFeatureMembership-><br>    selectByKind(ReturnParameterMembership)-><br>    size() <= 1<br>membership->selectByKind(ResultExpressionMembership)->size() <= 1

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:expressionIsModelLevelEvaluable](https://www.omg.org/spec/KerML/20230201/vocab#expressionIsModelLevelEvaluable)| [1]| Boolean| <p>Whether this <code>Expression</code> meets the constraints necessary to be evaluated at <em>model level</em>, that is, using metadata within the model.</p>| <p>Whether this <code>Expression</code> meets the constraints necessary to be evaluated at <em>model level</em>, that is, using metadata within the model.</p>|
| [kerml_vocab:expressionFunction](https://www.omg.org/spec/KerML/20230201/vocab#expressionFunction)| [0..1]| [kerml_vocab:Function](https://www.omg.org/spec/KerML/20230201/vocab#Function)| <p>The <code>Function</code> that types this <code>Expression</code>.</p><br><br><p>This is the Function that types the Expression.</p><br>| <p>The <code>Function</code> that types this <code>Expression</code>.</p><br><br><p>This is the Function that types the Expression.</p><br>|
| [kerml_vocab:expressionResult](https://www.omg.org/spec/KerML/20230201/vocab#expressionResult)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p><p>An <code>output</code> <code>parameter</code> of the <code>Expression</code> whose value is the result of the <code>Expression</code>. The result of an <code>Expression</code> is either inherited from its <code>function</code> or it is related to the <code>Expression</code> via a <code>ReturnParameterMembership</code>, in which case it redefines the <code>result</code> <code>parameter</code> of its <code>function</code>.</p><br>| <p><p>An <code>output</code> <code>parameter</code> of the <code>Expression</code> whose value is the result of the <code>Expression</code>. The result of an <code>Expression</code> is either inherited from its <code>function</code> or it is related to the <code>Expression</code> via a <code>ReturnParameterMembership</code>, in which case it redefines the <code>result</code> <code>parameter</code> of its <code>function</code>.</p><br>|



### Specialization

URI: https://www.omg.org/spec/KerML/20230201/shapes#Specialization

type: Shape

target class: [kerml_vocab:Specialization](https://www.omg.org/spec/KerML/20230201/vocab#Specialization)

definition of vocabulary class : <p><code>Specialization</code> is a <code>Relationship</code> between two <code>Types</code> that requires all instances of the <code>specific</code> type to also be instances of the <code>general</code> Type (i.e., the set of instances of the <code>specific</code> Type is a <em>subset</em> of those of the <code>general</code> Type, which might be the same set).</p><br><br>not specific.isConjugated

description: <p><code>Specialization</code> is a <code>Relationship</code> between two <code>Types</code> that requires all instances of the <code>specific</code> type to also be instances of the <code>general</code> Type (i.e., the set of instances of the <code>specific</code> Type is a <em>subset</em> of those of the <code>general</code> Type, which might be the same set).</p><br><br>not specific.isConjugated

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:specializationOwningType](https://www.omg.org/spec/KerML/20230201/vocab#specializationOwningType)| [0..1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>The <code>Type</code> that is the <code>specific</code> <code>Type</code> of this <code>Specialization</code> and owns it as its <code>owningRelatedElement</code>.</p><br>| <p>The <code>Type</code> that is the <code>specific</code> <code>Type</code> of this <code>Specialization</code> and owns it as its <code>owningRelatedElement</code>.</p><br>|
| [kerml_vocab:specializationGeneral](https://www.omg.org/spec/KerML/20230201/vocab#specializationGeneral)| [1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>A <code>Type</code> with a superset of all instances of the <code>specific</code> <code>Type</code>, which might be the same set.</p><br>| <p>A <code>Type</code> with a superset of all instances of the <code>specific</code> <code>Type</code>, which might be the same set.</p><br>|
| [kerml_vocab:specializationSpecific](https://www.omg.org/spec/KerML/20230201/vocab#specializationSpecific)| [1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>A <code>Type</code> with a subset of all instances of the <code>general</code> <code>Type</code>, which might be the same set.</p><br>| <p>A <code>Type</code> with a subset of all instances of the <code>general</code> <code>Type</code>, which might be the same set.</p><br>|



### Import

URI: https://www.omg.org/spec/KerML/20230201/shapes#Import

type: Shape

target class: [kerml_vocab:Import](https://www.omg.org/spec/KerML/20230201/vocab#Import)

definition of vocabulary class : <p>An <code>Import</code> is an <code>Relationship</code> between its <code>importOwningNamespace</code> and either a <code>Membership</code> (for a <code>MembershipImport</code>) or another <code>Namespace</code> (for a <code>NamespaceImport</code>), which determines a set of <code>Memberships</code> that become <code>importedMemberships</code> of the <code>importOwningNamespace</code>. If <code>isImportAll = false</code> (the default), then only public <code>Memberships</code> are considered &quot;visible&quot;. If <code>isImportAll = true</code>, then all <code>Memberships</code> are considered &quot;visible&quot;, regardless of their declared <code>visibility</code>. If <code>isRecursive = true</code>, then visible <code>Memberships</code> are also recursively imported from owned sub-<code>Namespaces</code>.</p><br><br>

description: <p>An <code>Import</code> is an <code>Relationship</code> between its <code>importOwningNamespace</code> and either a <code>Membership</code> (for a <code>MembershipImport</code>) or another <code>Namespace</code> (for a <code>NamespaceImport</code>), which determines a set of <code>Memberships</code> that become <code>importedMemberships</code> of the <code>importOwningNamespace</code>. If <code>isImportAll = false</code> (the default), then only public <code>Memberships</code> are considered &quot;visible&quot;. If <code>isImportAll = true</code>, then all <code>Memberships</code> are considered &quot;visible&quot;, regardless of their declared <code>visibility</code>. If <code>isRecursive = true</code>, then visible <code>Memberships</code> are also recursively imported from owned sub-<code>Namespaces</code>.</p><br><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:importVisibility](https://www.omg.org/spec/KerML/20230201/vocab#importVisibility)| [1]| String| <p>The visibility level of the imported <code>members</code> from this Import relative to the <code>importOwningNamespace</code>.</p><br>| <p>The visibility level of the imported <code>members</code> from this Import relative to the <code>importOwningNamespace</code>.</p><br>|
| [kerml_vocab:importIsRecursive](https://www.omg.org/spec/KerML/20230201/vocab#importIsRecursive)| [1]| Boolean| <p>Whether to recursively import Memberships from visible, owned sub-Namespaces.</p>| <p>Whether to recursively import Memberships from visible, owned sub-Namespaces.</p>|
| [kerml_vocab:importIsImportAll](https://www.omg.org/spec/KerML/20230201/vocab#importIsImportAll)| [1]| Boolean| <p>Whether to import memberships without regard to declared visibility.</p><br>| <p>Whether to import memberships without regard to declared visibility.</p><br>|
| [kerml_vocab:importImportOwningNamespace](https://www.omg.org/spec/KerML/20230201/vocab#importImportOwningNamespace)| [1]| [kerml_vocab:Namespace](https://www.omg.org/spec/KerML/20230201/vocab#Namespace)| <p>The Namespace into which Memberships are imported by this Import, which must be the <code>owningRelatedElement</code> of the Import.</p> <br>| <p>The Namespace into which Memberships are imported by this Import, which must be the <code>owningRelatedElement</code> of the Import.</p> <br>|
| [kerml_vocab:importImportedElement](https://www.omg.org/spec/KerML/20230201/vocab#importImportedElement)| [1]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The effectively imported <code>Element</code> for this </code>Import</code>. For a <code>MembershipImport</code>, this is the <code>memberElement</code> of the <code>importedMembership</code>. For a <code>NamespaceImport</code>, it is the <code>importedNamespace</code>.</p>| <p>The effectively imported <code>Element</code> for this </code>Import</code>. For a <code>MembershipImport</code>, this is the <code>memberElement</code> of the <code>importedMembership</code>. For a <code>NamespaceImport</code>, it is the <code>importedNamespace</code>.</p>|



### Namespace

URI: https://www.omg.org/spec/KerML/20230201/shapes#Namespace

type: Shape

target class: [kerml_vocab:Namespace](https://www.omg.org/spec/KerML/20230201/vocab#Namespace)

definition of vocabulary class : <p>A <code>Namespace</code> is an <code>Element</code> that contains other <code>Elements</code>, known as its <code>members</code>, via <code>Membership</code> <code>Relationships</code> with those <code>Elements</code>. The <code>members</code> of a <code>Namespace</code> may be owned by the <code>Namespace</code>, aliased in the <code>Namespace</code>, or imported into the <code>Namespace</code> via <code>Import</code> <code>Relationships</code>.</p><br><br><p>A <code>Namespace</code> can provide names for its <code>members</code> via the <code>memberNames</code> and <code>memberShortNames</code> specified by the <code>Memberships</code> in the <code>Namespace</code>. If a <code>Membership</code> specifies a <code>memberName</code> and/or <code>memberShortName</code>, then those are names of the corresponding <code>memberElement</code> relative to the <code>Namespace</code>. For an <code>OwningMembership</code>, the <code>owningMemberName</code> and <code>owningMemberShortName</code> are given by the <code>Element</code> <code>name</code> and <code>shortName</code>. Note that the same <code>Element</code> may be the <code>memberElement</code> of multiple <code>Memberships</code> in a <code>Namespace</code> (though it may be owned at most once), each of which may define a separate alias for the <code>Element</code> relative to the <code>Namespace</code>.</p><br><br>membership->forAll(m1 | <br>    membership->forAll(m2 | <br>        m1 <> m2 implies m1.isDistinguishableFrom(m2)))<br>member = membership.memberElement<br>ownedMember = ownedMembership->selectByKind(OwningMembership).ownedMemberElement<br>importedMembership = importedMemberships(Set{})<br>ownedImport = ownedRelationship->selectByKind(Import)<br>ownedMembership = ownedRelationship->selectByKind(Membership)

description: <p>A <code>Namespace</code> is an <code>Element</code> that contains other <code>Elements</code>, known as its <code>members</code>, via <code>Membership</code> <code>Relationships</code> with those <code>Elements</code>. The <code>members</code> of a <code>Namespace</code> may be owned by the <code>Namespace</code>, aliased in the <code>Namespace</code>, or imported into the <code>Namespace</code> via <code>Import</code> <code>Relationships</code>.</p><br><br><p>A <code>Namespace</code> can provide names for its <code>members</code> via the <code>memberNames</code> and <code>memberShortNames</code> specified by the <code>Memberships</code> in the <code>Namespace</code>. If a <code>Membership</code> specifies a <code>memberName</code> and/or <code>memberShortName</code>, then those are names of the corresponding <code>memberElement</code> relative to the <code>Namespace</code>. For an <code>OwningMembership</code>, the <code>owningMemberName</code> and <code>owningMemberShortName</code> are given by the <code>Element</code> <code>name</code> and <code>shortName</code>. Note that the same <code>Element</code> may be the <code>memberElement</code> of multiple <code>Memberships</code> in a <code>Namespace</code> (though it may be owned at most once), each of which may define a separate alias for the <code>Element</code> relative to the <code>Namespace</code>.</p><br><br>membership->forAll(m1 | <br>    membership->forAll(m2 | <br>        m1 <> m2 implies m1.isDistinguishableFrom(m2)))<br>member = membership.memberElement<br>ownedMember = ownedMembership->selectByKind(OwningMembership).ownedMemberElement<br>importedMembership = importedMemberships(Set{})<br>ownedImport = ownedRelationship->selectByKind(Import)<br>ownedMembership = ownedRelationship->selectByKind(Membership)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:namespaceMembership](https://www.omg.org/spec/KerML/20230201/vocab#namespaceMembership)| [0..*]| [kerml_vocab:Membership](https://www.omg.org/spec/KerML/20230201/vocab#Membership)| <p>All <code>Memberships</code> in this <code>Namespace</code>, including (at least) the union of <code>ownedMemberships</code> and <code>importedMemberships</code>.</p><br>| <p>All <code>Memberships</code> in this <code>Namespace</code>, including (at least) the union of <code>ownedMemberships</code> and <code>importedMemberships</code>.</p><br>|
| [kerml_vocab:namespaceOwnedImport](https://www.omg.org/spec/KerML/20230201/vocab#namespaceOwnedImport)| [0..*]| [kerml_vocab:Import](https://www.omg.org/spec/KerML/20230201/vocab#Import)| <p>The <code>ownedRelationships</code> of this <code>Namespace</code> that are <code>Imports</code>, for which the <code>Namespace</code> is the <code>importOwningNamespace</code>.</p><br>| <p>The <code>ownedRelationships</code> of this <code>Namespace</code> that are <code>Imports</code>, for which the <code>Namespace</code> is the <code>importOwningNamespace</code>.</p><br>|
| [kerml_vocab:namespaceMember](https://www.omg.org/spec/KerML/20230201/vocab#namespaceMember)| [0..*]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The set of all member <code>Elements</code> of this <code>Namespace</code>, which are the <code>memberElements</code> of all <code>memberships</code> of the <code>Namespace</code>.</p><br>| <p>The set of all member <code>Elements</code> of this <code>Namespace</code>, which are the <code>memberElements</code> of all <code>memberships</code> of the <code>Namespace</code>.</p><br>|
| [kerml_vocab:namespaceOwnedMember](https://www.omg.org/spec/KerML/20230201/vocab#namespaceOwnedMember)| [0..*]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The owned <code>members</code> of this <code>Namespace</code>, which are the <cpde><code>ownedMemberElements</code> of the <code>ownedMemberships</code> of the .</cpde></p><br>| <p>The owned <code>members</code> of this <code>Namespace</code>, which are the <cpde><code>ownedMemberElements</code> of the <code>ownedMemberships</code> of the .</cpde></p><br>|
| [kerml_vocab:namespaceImportedMembership](https://www.omg.org/spec/KerML/20230201/vocab#namespaceImportedMembership)| [0..*]| [kerml_vocab:Membership](https://www.omg.org/spec/KerML/20230201/vocab#Membership)| <p>The <code>Memberships</code> in this <code>Namespace</code> that result from the <code>ownedImports</code> of this <code>Namespace</code>.</p><br>| <p>The <code>Memberships</code> in this <code>Namespace</code> that result from the <code>ownedImports</code> of this <code>Namespace</code>.</p><br>|
| [kerml_vocab:namespaceOwnedMembership](https://www.omg.org/spec/KerML/20230201/vocab#namespaceOwnedMembership)| [0..*]| [kerml_vocab:Membership](https://www.omg.org/spec/KerML/20230201/vocab#Membership)| <p>The <code>ownedRelationships</code> of this <code>Namespace</code> that are <code>Memberships</code>, for which the <code>Namespace</code> is the <code>membershipOwningNamespace</code>.</p><br>| <p>The <code>ownedRelationships</code> of this <code>Namespace</code> that are <code>Memberships</code>, for which the <code>Namespace</code> is the <code>membershipOwningNamespace</code>.</p><br>|



### ItemFeature

URI: https://www.omg.org/spec/KerML/20230201/shapes#ItemFeature

type: Shape

target class: [kerml_vocab:ItemFeature](https://www.omg.org/spec/KerML/20230201/vocab#ItemFeature)

definition of vocabulary class : <p>An <code>ItemFeature</code> is the <code>ownedFeature</code> of an <code>ItemFlow</code> that identifies the things carried by the kinds of transfers that are instances of the <code>ItemFlow</code>.</p><br>ownedRedefinition.redefinedFeature-><br>    redefinesFromLibrary('Transfers::Transfer::item')

description: <p>An <code>ItemFeature</code> is the <code>ownedFeature</code> of an <code>ItemFlow</code> that identifies the things carried by the kinds of transfers that are instances of the <code>ItemFlow</code>.</p><br>ownedRedefinition.redefinedFeature-><br>    redefinesFromLibrary('Transfers::Transfer::item')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Documentation

URI: https://www.omg.org/spec/KerML/20230201/shapes#Documentation

type: Shape

target class: [kerml_vocab:Documentation](https://www.omg.org/spec/KerML/20230201/vocab#Documentation)

definition of vocabulary class : <p><code>Documentation</code> is a <code>Comment</code> that specifically documents a <code>documentedElement</code>, which must be its <code>owner</code>.</p><br>

description: <p><code>Documentation</code> is a <code>Comment</code> that specifically documents a <code>documentedElement</code>, which must be its <code>owner</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:documentationDocumentedElement](https://www.omg.org/spec/KerML/20230201/vocab#documentationDocumentedElement)| [1]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The <code>Element</code> that is documented by this <code>Documentation</code>.</p><br>| <p>The <code>Element</code> that is documented by this <code>Documentation</code>.</p><br>|



### SelectExpression

URI: https://www.omg.org/spec/KerML/20230201/shapes#SelectExpression

type: Shape

target class: [kerml_vocab:SelectExpression](https://www.omg.org/spec/KerML/20230201/vocab#SelectExpression)

definition of vocabulary class : <p>A <code>SelectExpression</code> is an <code>OperatorExpression</code> whose operator is <code>"select"</code>, which resolves to the <code>Function</code> <em><code>ControlFunctions::select</code></em> from the Kernel Functions Library.</p><br>operator = 'select'

description: <p>A <code>SelectExpression</code> is an <code>OperatorExpression</code> whose operator is <code>"select"</code>, which resolves to the <code>Function</code> <em><code>ControlFunctions::select</code></em> from the Kernel Functions Library.</p><br>operator = 'select'

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Connector

URI: https://www.omg.org/spec/KerML/20230201/shapes#Connector

type: Shape

target class: [kerml_vocab:Connector](https://www.omg.org/spec/KerML/20230201/vocab#Connector)

definition of vocabulary class : <p>A <code>Connector</code> is a usage of <code>Associations</code>, with links restricted according to instances of the <code>Type</code> in which they are used (domain of the <code>Connector</code>). The <code>associations</code> of the <code>Connector</code> restrict what kinds of things might be linked. The <code>Connector</code> further restricts these links to be between values of <code>Features</code> on instances of its domain.</p><br><br>relatedFeature = connectorEnd.ownedReferenceSubsetting-><br>    select(s | s <> null).subsettedFeature<br>relatedFeature->forAll(f | <br>    if featuringType->isEmpty() then f.isFeaturedWithin(null)<br>    else featuringType->forAll(t | f.isFeaturedWithin(t))<br>    endif)<br>sourceFeature = <br>    if relatedFeature->isEmpty() then null <br>    else relatedFeature->first() <br>    endif<br>targetFeature =<br>    if relatedFeature->size() < 2 then OrderedSet{}<br>    else <br>        relatedFeature-><br>            subSequence(2, relatedFeature->size())-><br>            asOrderedSet()<br>    endif<br>not isAbstract implies relatedFeature->size() >= 2<br>specializesFromLibrary('Links::links')<br>association->exists(oclIsKindOf(AssociationStructure)) implies<br>    specializesFromLibrary('Objects::linkObjects')<br>connectorEnds->size() = 2 and<br>association->exists(oclIsKindOf(AssocationStructure)) implies<br>    specializesFromLibrary('Objects::binaryLinkObjects')<br>connectorEnd->size() = 2 implies<br>    specializesFromLibrary('Links::binaryLinks')<br>connectorEnds->size() > 2 implies<br>    not specializesFromLibrary('Links::BinaryLink')

description: <p>A <code>Connector</code> is a usage of <code>Associations</code>, with links restricted according to instances of the <code>Type</code> in which they are used (domain of the <code>Connector</code>). The <code>associations</code> of the <code>Connector</code> restrict what kinds of things might be linked. The <code>Connector</code> further restricts these links to be between values of <code>Features</code> on instances of its domain.</p><br><br>relatedFeature = connectorEnd.ownedReferenceSubsetting-><br>    select(s | s <> null).subsettedFeature<br>relatedFeature->forAll(f | <br>    if featuringType->isEmpty() then f.isFeaturedWithin(null)<br>    else featuringType->forAll(t | f.isFeaturedWithin(t))<br>    endif)<br>sourceFeature = <br>    if relatedFeature->isEmpty() then null <br>    else relatedFeature->first() <br>    endif<br>targetFeature =<br>    if relatedFeature->size() < 2 then OrderedSet{}<br>    else <br>        relatedFeature-><br>            subSequence(2, relatedFeature->size())-><br>            asOrderedSet()<br>    endif<br>not isAbstract implies relatedFeature->size() >= 2<br>specializesFromLibrary('Links::links')<br>association->exists(oclIsKindOf(AssociationStructure)) implies<br>    specializesFromLibrary('Objects::linkObjects')<br>connectorEnds->size() = 2 and<br>association->exists(oclIsKindOf(AssocationStructure)) implies<br>    specializesFromLibrary('Objects::binaryLinkObjects')<br>connectorEnd->size() = 2 implies<br>    specializesFromLibrary('Links::binaryLinks')<br>connectorEnds->size() > 2 implies<br>    not specializesFromLibrary('Links::BinaryLink')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:connectorRelatedFeature](https://www.omg.org/spec/KerML/20230201/vocab#connectorRelatedFeature)| [0..*]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Features</code> that are related by this <code>Connector</code> considered as a <code>Relationship</code> and that restrict the links it identifies, given by the referenced <code>Features</code> of the <code>connectorEnds</code> of the <code>Connector</code>.</p><br>| <p>The <code>Features</code> that are related by this <code>Connector</code> considered as a <code>Relationship</code> and that restrict the links it identifies, given by the referenced <code>Features</code> of the <code>connectorEnds</code> of the <code>Connector</code>.</p><br>|
| [kerml_vocab:connectorAssociation](https://www.omg.org/spec/KerML/20230201/vocab#connectorAssociation)| [0..*]| [kerml_vocab:Association](https://www.omg.org/spec/KerML/20230201/vocab#Association)| <p>The <code>Associations</code> that type the <code>Connector</code>.</p><br>| <p>The <code>Associations</code> that type the <code>Connector</code>.</p><br>|
| [kerml_vocab:connectorConnectorEnd](https://www.omg.org/spec/KerML/20230201/vocab#connectorConnectorEnd)| [0..*]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>endFeatures</code> of a <code>Connector</code>, which redefine the <code>endFeatures</code> of the <code>associations</code> of the <code>Connector</code>. The <code>connectorEnds</code> determine via <code>ReferenceSubsetting</code> <code>Relationships</code> which <code>Features</code> are related by the <code>Connector</code>.</p>| <p>The <code>endFeatures</code> of a <code>Connector</code>, which redefine the <code>endFeatures</code> of the <code>associations</code> of the <code>Connector</code>. The <code>connectorEnds</code> determine via <code>ReferenceSubsetting</code> <code>Relationships</code> which <code>Features</code> are related by the <code>Connector</code>.</p>|
| [kerml_vocab:connectorSourceFeature](https://www.omg.org/spec/KerML/20230201/vocab#connectorSourceFeature)| [0..1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The source <code>relatedFeature</code> for this <code>Connector</code>. It is the first <code>relatedFeature</code>.</p>| <p>The source <code>relatedFeature</code> for this <code>Connector</code>. It is the first <code>relatedFeature</code>.</p>|
| [kerml_vocab:connectorTargetFeature](https://www.omg.org/spec/KerML/20230201/vocab#connectorTargetFeature)| [0..*]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The target <code>relatedFeatures</code> for this <code>Connector</code>. This includes all the <code>relatedFeatures</code> other than the <code>sourceFeature</code>.</p>| <p>The target <code>relatedFeatures</code> for this <code>Connector</code>. This includes all the <code>relatedFeatures</code> other than the <code>sourceFeature</code>.</p>|



### Class

URI: https://www.omg.org/spec/KerML/20230201/shapes#Class

type: Shape

target class: [kerml_vocab:Class](https://www.omg.org/spec/KerML/20230201/vocab#Class)

definition of vocabulary class : <p>A <code>Class</code> is a <code>Classifier</code> of things (in the universe) that can be distinguished without regard to how they are related to other things (via <code>Features</code>). This means multiple things classified by the same <code>Class</code> can be distinguished, even when they are related other things in exactly the same way.</p><br><br>specializesFromLibrary('Occurrences::Occurrence')<br>ownedSpecialization.general-><br>    forAll(not oclIsKindOf(DataType)) and<br>not oclIsKindOf(Association) implies<br>    ownedSpecialization.general-><br>        forAll(not oclIsKindOf(Association))

description: <p>A <code>Class</code> is a <code>Classifier</code> of things (in the universe) that can be distinguished without regard to how they are related to other things (via <code>Features</code>). This means multiple things classified by the same <code>Class</code> can be distinguished, even when they are related other things in exactly the same way.</p><br><br>specializesFromLibrary('Occurrences::Occurrence')<br>ownedSpecialization.general-><br>    forAll(not oclIsKindOf(DataType)) and<br>not oclIsKindOf(Association) implies<br>    ownedSpecialization.general-><br>        forAll(not oclIsKindOf(Association))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### LiteralExpression

URI: https://www.omg.org/spec/KerML/20230201/shapes#LiteralExpression

type: Shape

target class: [kerml_vocab:LiteralExpression](https://www.omg.org/spec/KerML/20230201/vocab#LiteralExpression)

definition of vocabulary class : <p>A <code>LiteralExpression</code> is an <code>Expression</code> that provides a basic <code><em>DataValue</em></code> as a result.</p><br><br>isModelLevelEvaluable = true<br>specializesFromLibrary('Performances::literalEvaluations')

description: <p>A <code>LiteralExpression</code> is an <code>Expression</code> that provides a basic <code><em>DataValue</em></code> as a result.</p><br><br>isModelLevelEvaluable = true<br>specializesFromLibrary('Performances::literalEvaluations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### LibraryPackage

URI: https://www.omg.org/spec/KerML/20230201/shapes#LibraryPackage

type: Shape

target class: [kerml_vocab:LibraryPackage](https://www.omg.org/spec/KerML/20230201/vocab#LibraryPackage)

definition of vocabulary class : <p>A <code>LibraryPackage</code> is a <code>Package</code> that is the container for a model library. A <code>LibraryPackage</code> is itself a library <code>Element</code> as are all <code>Elements</code> that are directly or indirectly contained in it.</p><br>

description: <p>A <code>LibraryPackage</code> is a <code>Package</code> that is the container for a model library. A <code>LibraryPackage</code> is itself a library <code>Element</code> as are all <code>Elements</code> that are directly or indirectly contained in it.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:libraryPackageIsStandard](https://www.omg.org/spec/KerML/20230201/vocab#libraryPackageIsStandard)| [1]| Boolean| <p>Whether this <code>LibraryPackage</code> contains a standard library model. This should only be set to true for <code>LibraryPackages</code> in the standard Kernel Model Libraries or in normative model libraries for a language built on KerML.</p>| <p>Whether this <code>LibraryPackage</code> contains a standard library model. This should only be set to true for <code>LibraryPackages</code> in the standard Kernel Model Libraries or in normative model libraries for a language built on KerML.</p>|



### MetadataAccessExpression

URI: https://www.omg.org/spec/KerML/20230201/shapes#MetadataAccessExpression

type: Shape

target class: [kerml_vocab:MetadataAccessExpression](https://www.omg.org/spec/KerML/20230201/vocab#MetadataAccessExpression)

definition of vocabulary class : <p>A <code>MetadataAccessExpression</code> is an <code>Expression</code> whose <code>result</code> is a sequence of instances of <code>Metaclasses</code> representing all the <code>MetadataFeature</code> annotations of the <code>referencedElement</code>. In addition, the sequence includes an instance of the reflective <code>Metaclass</code> corresponding to the MOF class of the <code>referencedElement</code>, with values for all the abstract syntax properties of the <code>referencedElement</code>.</p><br>specializesFromLibrary('Performances::metadataAccessEvaluations')

description: <p>A <code>MetadataAccessExpression</code> is an <code>Expression</code> whose <code>result</code> is a sequence of instances of <code>Metaclasses</code> representing all the <code>MetadataFeature</code> annotations of the <code>referencedElement</code>. In addition, the sequence includes an instance of the reflective <code>Metaclass</code> corresponding to the MOF class of the <code>referencedElement</code>, with values for all the abstract syntax properties of the <code>referencedElement</code>.</p><br>specializesFromLibrary('Performances::metadataAccessEvaluations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:metadataAccessExpressionReferencedElement](https://www.omg.org/spec/KerML/20230201/vocab#metadataAccessExpressionReferencedElement)| [1]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p> The <code>Element</code> whose metadata is being accessed.</p>| <p> The <code>Element</code> whose metadata is being accessed.</p>|



### Function

URI: https://www.omg.org/spec/KerML/20230201/shapes#Function

type: Shape

target class: [kerml_vocab:Function](https://www.omg.org/spec/KerML/20230201/vocab#Function)

definition of vocabulary class : <p>A <code>Function</code> is a <code>Behavior</code> that has an <code>out</code> <code>parameter</code> that is identified as its <code>result</code>. A <code>Function</code> represents the performance of a calculation that produces the values of its <code>result</code> <code>parameter</code>. This calculation may be decomposed into <code>Expressions</code> that are <code>steps</code> of the <code>Function</code>.</p><br><br>ownedMembership.selectByKind(ResultExpressionMembership)-><br>    forAll(mem | ownedFeature.selectByKind(BindingConnector)-><br>        exists(binding |<br>            binding.relatedFeature->includes(result) and<br>            binding.relatedFeature->includes(mem.ownedResultExpression.result)))<br>specializesFromLibrary('Performances::Evaluation')<br>result =<br>    let resultParams : Sequence(Feature) =<br>        ownedFeatureMemberships-><br>            selectByKind(ReturnParameterMembership).<br>            ownedParameterMember in<br>    if resultParams->notEmpty() then resultParams->first()<br>    else null<br>    endif<br>ownedFeatureMembership-><br>    selectByKind(ReturnParameterMembership)-><br>    size() <= 1<br>membership->selectByKind(ResultExpressionMembership)->size() <= 1

description: <p>A <code>Function</code> is a <code>Behavior</code> that has an <code>out</code> <code>parameter</code> that is identified as its <code>result</code>. A <code>Function</code> represents the performance of a calculation that produces the values of its <code>result</code> <code>parameter</code>. This calculation may be decomposed into <code>Expressions</code> that are <code>steps</code> of the <code>Function</code>.</p><br><br>ownedMembership.selectByKind(ResultExpressionMembership)-><br>    forAll(mem | ownedFeature.selectByKind(BindingConnector)-><br>        exists(binding |<br>            binding.relatedFeature->includes(result) and<br>            binding.relatedFeature->includes(mem.ownedResultExpression.result)))<br>specializesFromLibrary('Performances::Evaluation')<br>result =<br>    let resultParams : Sequence(Feature) =<br>        ownedFeatureMemberships-><br>            selectByKind(ReturnParameterMembership).<br>            ownedParameterMember in<br>    if resultParams->notEmpty() then resultParams->first()<br>    else null<br>    endif<br>ownedFeatureMembership-><br>    selectByKind(ReturnParameterMembership)-><br>    size() <= 1<br>membership->selectByKind(ResultExpressionMembership)->size() <= 1

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:functionIsModelLevelEvaluable](https://www.omg.org/spec/KerML/20230201/vocab#functionIsModelLevelEvaluable)| [1]| Boolean| <p>Whether this <code>Function</code> can be used as the <code>function</code> of a model-level evaluable <code>InvocationExpression</code>. Certain <code>Functions</code> from the Kernel Functions Library are considered to have <code>isModelLevelEvaluable = true</code>. For all other <code>Functions</code> it is <code>false</code>.</p><br><br><p><strong>Note:</strong> See the specification of the KerML concrete syntax notation for <code>Expressions</code> for an identification of which library <code>Functions</code> are model-level evaluable.</p>| <p>Whether this <code>Function</code> can be used as the <code>function</code> of a model-level evaluable <code>InvocationExpression</code>. Certain <code>Functions</code> from the Kernel Functions Library are considered to have <code>isModelLevelEvaluable = true</code>. For all other <code>Functions</code> it is <code>false</code>.</p><br><br><p><strong>Note:</strong> See the specification of the KerML concrete syntax notation for <code>Expressions</code> for an identification of which library <code>Functions</code> are model-level evaluable.</p>|
| [kerml_vocab:functionExpression](https://www.omg.org/spec/KerML/20230201/vocab#functionExpression)| [0..*]| [kerml_vocab:Expression](https://www.omg.org/spec/KerML/20230201/vocab#Expression)| <p>The <code>Expressions</code> that are <code>steps</code> in the calculation of the <code>result</code> of this <code>Function</code>.</p><br><br><p>The set of expressions that represent computational steps or parts of a system of equations within the Function.</p><br>| <p>The <code>Expressions</code> that are <code>steps</code> in the calculation of the <code>result</code> of this <code>Function</code>.</p><br><br><p>The set of expressions that represent computational steps or parts of a system of equations within the Function.</p><br>|
| [kerml_vocab:functionResult](https://www.omg.org/spec/KerML/20230201/vocab#functionResult)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>result</code> <code>parameter</code> of the <code>Function</code>, which is owned by the <code>Function</code> via a <code>ReturnParameterMembership</code>.</p><br><br><p>The object or value that is the result of evaluating the Function.</p>| <p>The <code>result</code> <code>parameter</code> of the <code>Function</code>, which is owned by the <code>Function</code> via a <code>ReturnParameterMembership</code>.</p><br><br><p>The object or value that is the result of evaluating the Function.</p>|



### Relationship

URI: https://www.omg.org/spec/KerML/20230201/shapes#Relationship

type: Shape

target class: [kerml_vocab:Relationship](https://www.omg.org/spec/KerML/20230201/vocab#Relationship)

definition of vocabulary class : <p>A <code>Relationship</code> is an <code>Element</code> that relates other <code>Element</code>. Some of its <code>relatedElements</code> may be owned, in which case those <code>ownedRelatedElements</code> will be deleted from a model if their <code>owningRelationship</code> is. A <code>Relationship</code> may also be owned by another <code>Element</code>, in which case the <code>ownedRelatedElements</code> of the <code>Relationship</code> are also considered to be transitively owned by the <code>owningRelatedElement</code> of the <code>Relationship</code>.</p><br><br><p>The <code>relatedElements</code> of a <code>Relationship</code> are divided into <code>source</code> and <code>target</code> <code>Elements</code>. The <code>Relationship</code> is considered to be directed from the <code>source</code> to the <code>target</code> <code>Elements</code>. An undirected <code>Relationship</code> may have either all <code>source</code> or all <code>target</code> <code>Elements</code>.</p><br><br><p>A &quot;relationship <code>Element</code>&quot; in the abstract syntax is generically any <code>Element</code> that is an instance of either <code>Relationship</code> or a direct or indirect specialization of <code>Relationship</code>. Any other kind of <code>Element</code> is a &quot;non-relationship <code>Element</code>&quot;. It is a convention of that non-relationship <code>Elements</code> are <em>only</em> related via reified relationship <code>Elements</code>. Any meta-associations directly between non-relationship <code>Elements</code> must be derived from underlying reified <code>Relationship</code>.</p><br><br>relatedElement = source->union(target)

description: <p>A <code>Relationship</code> is an <code>Element</code> that relates other <code>Element</code>. Some of its <code>relatedElements</code> may be owned, in which case those <code>ownedRelatedElements</code> will be deleted from a model if their <code>owningRelationship</code> is. A <code>Relationship</code> may also be owned by another <code>Element</code>, in which case the <code>ownedRelatedElements</code> of the <code>Relationship</code> are also considered to be transitively owned by the <code>owningRelatedElement</code> of the <code>Relationship</code>.</p><br><br><p>The <code>relatedElements</code> of a <code>Relationship</code> are divided into <code>source</code> and <code>target</code> <code>Elements</code>. The <code>Relationship</code> is considered to be directed from the <code>source</code> to the <code>target</code> <code>Elements</code>. An undirected <code>Relationship</code> may have either all <code>source</code> or all <code>target</code> <code>Elements</code>.</p><br><br><p>A &quot;relationship <code>Element</code>&quot; in the abstract syntax is generically any <code>Element</code> that is an instance of either <code>Relationship</code> or a direct or indirect specialization of <code>Relationship</code>. Any other kind of <code>Element</code> is a &quot;non-relationship <code>Element</code>&quot;. It is a convention of that non-relationship <code>Elements</code> are <em>only</em> related via reified relationship <code>Elements</code>. Any meta-associations directly between non-relationship <code>Elements</code> must be derived from underlying reified <code>Relationship</code>.</p><br><br>relatedElement = source->union(target)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:relationshipIsImplied](https://www.omg.org/spec/KerML/20230201/vocab#relationshipIsImplied)| [1]| Boolean| <p>Whether this Relationship was generated by tooling to meet semantic rules, rather than being directly created by a modeler.</p>| <p>Whether this Relationship was generated by tooling to meet semantic rules, rather than being directly created by a modeler.</p>|
| [kerml_vocab:relationshipOwnedRelatedElement](https://www.omg.org/spec/KerML/20230201/vocab#relationshipOwnedRelatedElement)| [0..*]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The <tt>relatedElements</tt> of this Relationship that are owned by the Relationship.</p>| <p>The <tt>relatedElements</tt> of this Relationship that are owned by the Relationship.</p>|
| [kerml_vocab:relationshipOwningRelatedElement](https://www.omg.org/spec/KerML/20230201/vocab#relationshipOwningRelatedElement)| [0..1]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The <tt>relatedElement</tt> of this Relationship that owns the Relationship, if any.</p>| <p>The <tt>relatedElement</tt> of this Relationship that owns the Relationship, if any.</p>|
| [kerml_vocab:relationshipRelatedElement](https://www.omg.org/spec/KerML/20230201/vocab#relationshipRelatedElement)| [0..*]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The Elements that are related by this Relationship, derived as the union of the <code>source</code> and <code>target</code> Elements of the Relationship.</p>| <p>The Elements that are related by this Relationship, derived as the union of the <code>source</code> and <code>target</code> Elements of the Relationship.</p>|
| [kerml_vocab:relationshipTarget](https://www.omg.org/spec/KerML/20230201/vocab#relationshipTarget)| [0..*]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The <code>relatedElements</code> to which this Relationship is considered to be directed.</p><br>| <p>The <code>relatedElements</code> to which this Relationship is considered to be directed.</p><br>|
| [kerml_vocab:relationshipSource](https://www.omg.org/spec/KerML/20230201/vocab#relationshipSource)| [0..*]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The <code>relatedElements</c ode> from which this Relationship is considered to be directed.</p>| <p>The <code>relatedElements</c ode> from which this Relationship is considered to be directed.</p>|



### Association

URI: https://www.omg.org/spec/KerML/20230201/shapes#Association

type: Shape

target class: [kerml_vocab:Association](https://www.omg.org/spec/KerML/20230201/vocab#Association)

definition of vocabulary class : <p>An <code>Association</code> is a <code>Relationship</code> and a <code>Classifier</code> to enable classification of links between things (in the universe). The co-domains (<code>types</code>) of the <code>associationEnd</code> <code>Features</code> are the <code>relatedTypes</code>, as co-domain and participants (linked things) of an <code>Association</code> identify each other.</p><br><br>relatedType = associationEnd.type<br>specializesFromLibrary('Links::Link')<br>oclIsKindOf(Structure) = oclIsKindOf(AssociationStructure)<br>associationEnd->size() = 2 implies<br>    specializesFromLibrary('Links::BinaryLink')<br>not isAbstract implies relatedType->size() >= 2<br>associationEnds->size() > 2 implies<br>    not specializesFromLibrary('Links::BinaryLink')<br>sourceType =<br>    if relatedType->isEmpty() then null<br>    else relatedType->first() endif<br>targetType =<br>    if relatedType->size() < 2 then OrderedSet{}<br>    else <br>        relatedType-><br>            subSequence(2, relatedType->size())-><br>            asOrderedSet() <br>    endif

description: <p>An <code>Association</code> is a <code>Relationship</code> and a <code>Classifier</code> to enable classification of links between things (in the universe). The co-domains (<code>types</code>) of the <code>associationEnd</code> <code>Features</code> are the <code>relatedTypes</code>, as co-domain and participants (linked things) of an <code>Association</code> identify each other.</p><br><br>relatedType = associationEnd.type<br>specializesFromLibrary('Links::Link')<br>oclIsKindOf(Structure) = oclIsKindOf(AssociationStructure)<br>associationEnd->size() = 2 implies<br>    specializesFromLibrary('Links::BinaryLink')<br>not isAbstract implies relatedType->size() >= 2<br>associationEnds->size() > 2 implies<br>    not specializesFromLibrary('Links::BinaryLink')<br>sourceType =<br>    if relatedType->isEmpty() then null<br>    else relatedType->first() endif<br>targetType =<br>    if relatedType->size() < 2 then OrderedSet{}<br>    else <br>        relatedType-><br>            subSequence(2, relatedType->size())-><br>            asOrderedSet() <br>    endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:associationRelatedType](https://www.omg.org/spec/KerML/20230201/vocab#associationRelatedType)| [0..*]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>The <code>types</code> of the <code>associationEnds</code> of the <code>Association</code>, which are the <code>relatedElements</code> of the <code>Association</code> considered as a <code>Relationship</code>.</p><br>| <p>The <code>types</code> of the <code>associationEnds</code> of the <code>Association</code>, which are the <code>relatedElements</code> of the <code>Association</code> considered as a <code>Relationship</code>.</p><br>|
| [kerml_vocab:associationSourceType](https://www.omg.org/spec/KerML/20230201/vocab#associationSourceType)| [0..1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>The source <code>relatedType</code> for this <code>Association</code>. It is the first <code>relatedType</code> of the <code>Association</code>.</p><br>| <p>The source <code>relatedType</code> for this <code>Association</code>. It is the first <code>relatedType</code> of the <code>Association</code>.</p><br>|
| [kerml_vocab:associationTargetType](https://www.omg.org/spec/KerML/20230201/vocab#associationTargetType)| [0..*]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>The target <code>relatedTypes</code> for this <code>Association</code>. This includes all the <code>relatedTypes</code> other than the <code>sourceType</code>.</p> <br>| <p>The target <code>relatedTypes</code> for this <code>Association</code>. This includes all the <code>relatedTypes</code> other than the <code>sourceType</code>.</p> <br>|
| [kerml_vocab:associationAssociationEnd](https://www.omg.org/spec/KerML/20230201/vocab#associationAssociationEnd)| [0..*]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>features</code> of the <code>Association</code> that identify the things that can be related by it. A concrete <code>Association</code> must have at least two <code>associationEnds</code>. When it has exactly two, the <code>Association</code> is called a <em>binary</em> <code>Association</code>.</p> <br><br><p>The ends of the Association determine which elements are eligible to be related by instances of the Association.</p><br>| <p>The <code>features</code> of the <code>Association</code> that identify the things that can be related by it. A concrete <code>Association</code> must have at least two <code>associationEnds</code>. When it has exactly two, the <code>Association</code> is called a <em>binary</em> <code>Association</code>.</p> <br><br><p>The ends of the Association determine which elements are eligible to be related by instances of the Association.</p><br>|



### TextualRepresentation

URI: https://www.omg.org/spec/KerML/20230201/shapes#TextualRepresentation

type: Shape

target class: [kerml_vocab:TextualRepresentation](https://www.omg.org/spec/KerML/20230201/vocab#TextualRepresentation)

definition of vocabulary class : <p>A <code>TextualRepresentation</code> is an <code>AnnotatingElement</code> whose <code>body</code> represents the <code>representedElement</code> in a given <code>language</code>. The <code>representedElement</code> must be the <code>owner</code> of the <code>TextualRepresentation</code>. The named <code>language</code> can be a natural language, in which case the <code>body</code> is an informal representation, or an artificial language, in which case the <code>body</code> is expected to be a formal, machine-parsable representation.</p><br><br><p>If the named <code>language</code> of a <code>TextualRepresentation</code> is machine-parsable, then the <code>body</code> text should be legal input text as defined for that <code>language</code>. The interpretation of the named language string shall be case insensitive. The following <code>language</code> names are defined to correspond to the given standard languages:</p><br><br><table border="1" cellpadding="1" cellspacing="1" width="498"><br>	<thead><br>	</thead><br>	<tbody><br>		<tr><br>			<td style="text-align: center; width: 154px;"><code>kerml</code></td><br>			<td style="width: 332px;">Kernel Modeling Language</td><br>		</tr><br>		<tr><br>			<td style="text-align: center; width: 154px;"><code>ocl</code></td><br>			<td style="width: 332px;">Object Constraint Language</td><br>		</tr><br>		<tr><br>			<td style="text-align: center; width: 154px;"><code>alf</code></td><br>			<td style="width: 332px;">Action Language for fUML</td><br>		</tr><br>	</tbody><br></table><br><br><p>Other specifications may define specific <code>language</code> strings, other than those shown above, to be used to indicate the use of languages from those specifications in KerML <code>TextualRepresentation</code>.</p><br><br><p>If the <code>language</code> of a <code>TextualRepresentation</code> is &quot;<code>kerml</code>&quot;, then the <code>body</code> text shall be a legal representation of the <code>representedElement</code> in the KerML textual concrete syntax. A conforming tool can use such a <code>TextualRepresentation</code> <code>Annotation</code> to record the original KerML concrete syntax text from which an <code>Element</code> was parsed. In this case, it is a tool responsibility to ensure that the <code>body</code> of the <code>TextualRepresentation</code> remains correct (or the Annotation is removed) if the annotated <code>Element</code> changes other than by re-parsing the <code>body</code> text.</p><br><br><p>An <code>Element</code> with a <code>TextualRepresentation</code> in a language other than KerML is essentially a semantically &quot;opaque&quot; <code>Element</code> specified in the other language. However, a conforming KerML tool may interpret such an element consistently with the specification of the named language.</p><br>

description: <p>A <code>TextualRepresentation</code> is an <code>AnnotatingElement</code> whose <code>body</code> represents the <code>representedElement</code> in a given <code>language</code>. The <code>representedElement</code> must be the <code>owner</code> of the <code>TextualRepresentation</code>. The named <code>language</code> can be a natural language, in which case the <code>body</code> is an informal representation, or an artificial language, in which case the <code>body</code> is expected to be a formal, machine-parsable representation.</p><br><br><p>If the named <code>language</code> of a <code>TextualRepresentation</code> is machine-parsable, then the <code>body</code> text should be legal input text as defined for that <code>language</code>. The interpretation of the named language string shall be case insensitive. The following <code>language</code> names are defined to correspond to the given standard languages:</p><br><br><table border="1" cellpadding="1" cellspacing="1" width="498"><br>	<thead><br>	</thead><br>	<tbody><br>		<tr><br>			<td style="text-align: center; width: 154px;"><code>kerml</code></td><br>			<td style="width: 332px;">Kernel Modeling Language</td><br>		</tr><br>		<tr><br>			<td style="text-align: center; width: 154px;"><code>ocl</code></td><br>			<td style="width: 332px;">Object Constraint Language</td><br>		</tr><br>		<tr><br>			<td style="text-align: center; width: 154px;"><code>alf</code></td><br>			<td style="width: 332px;">Action Language for fUML</td><br>		</tr><br>	</tbody><br></table><br><br><p>Other specifications may define specific <code>language</code> strings, other than those shown above, to be used to indicate the use of languages from those specifications in KerML <code>TextualRepresentation</code>.</p><br><br><p>If the <code>language</code> of a <code>TextualRepresentation</code> is &quot;<code>kerml</code>&quot;, then the <code>body</code> text shall be a legal representation of the <code>representedElement</code> in the KerML textual concrete syntax. A conforming tool can use such a <code>TextualRepresentation</code> <code>Annotation</code> to record the original KerML concrete syntax text from which an <code>Element</code> was parsed. In this case, it is a tool responsibility to ensure that the <code>body</code> of the <code>TextualRepresentation</code> remains correct (or the Annotation is removed) if the annotated <code>Element</code> changes other than by re-parsing the <code>body</code> text.</p><br><br><p>An <code>Element</code> with a <code>TextualRepresentation</code> in a language other than KerML is essentially a semantically &quot;opaque&quot; <code>Element</code> specified in the other language. However, a conforming KerML tool may interpret such an element consistently with the specification of the named language.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:textualRepresentationLanguage](https://www.omg.org/spec/KerML/20230201/vocab#textualRepresentationLanguage)| [1]| String| <p>The natural or artifical language in which the <code>body</code> text is written.</p><br>| <p>The natural or artifical language in which the <code>body</code> text is written.</p><br>|
| [kerml_vocab:textualRepresentationBody](https://www.omg.org/spec/KerML/20230201/vocab#textualRepresentationBody)| [1]| String| <p>The textual representation of the <code>representedElement</code> in the given <code>language</code>.</p><br>| <p>The textual representation of the <code>representedElement</code> in the given <code>language</code>.</p><br>|
| [kerml_vocab:textualRepresentationRepresentedElement](https://www.omg.org/spec/KerML/20230201/vocab#textualRepresentationRepresentedElement)| [1]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The <code>Element</code> that is represented by this <code>TextualRepresentation</code>.</p><br>| <p>The <code>Element</code> that is represented by this <code>TextualRepresentation</code>.</p><br>|



### SuccessionItemFlow

URI: https://www.omg.org/spec/KerML/20230201/shapes#SuccessionItemFlow

type: Shape

target class: [kerml_vocab:SuccessionItemFlow](https://www.omg.org/spec/KerML/20230201/vocab#SuccessionItemFlow)

definition of vocabulary class : <p>A <code>SuccessionItemFlow</code> is an <code>ItemFlow</code> that also provides temporal ordering. It classifies <code><em>Transfers</em></code> that cannot start until the source <code><em>Occurrence</em></code> has completed and that must complete before the target <code><em>Occurrence</em></code> can start.</p><br>specializesFromLibrary('Transfers::flowTransfersBefore')

description: <p>A <code>SuccessionItemFlow</code> is an <code>ItemFlow</code> that also provides temporal ordering. It classifies <code><em>Transfers</em></code> that cannot start until the source <code><em>Occurrence</em></code> has completed and that must complete before the target <code><em>Occurrence</em></code> can start.</p><br>specializesFromLibrary('Transfers::flowTransfersBefore')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Membership

URI: https://www.omg.org/spec/KerML/20230201/shapes#Membership

type: Shape

target class: [kerml_vocab:Membership](https://www.omg.org/spec/KerML/20230201/vocab#Membership)

definition of vocabulary class : <p>A <code>Membership</code> is a <code>Relationship</code> between a <code>Namespace</code> and an <code>Element</code> that indicates the <code>Element</code> is a <code>member</code> of (i.e., is contained in) the Namespace. Any <code>memberNames</code> specify how the <code>memberElement</code> is identified in the <code>Namespace</code> and the <code>visibility</code> specifies whether or not the <code>memberElement</code> is publicly visible from outside the <code>Namespace</code>.</p><br><br><p>If a <code>Membership</code> is an <code>OwningMembership</code>, then it owns its <code>memberElement</code>, which becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code>. Otherwise, the <code>memberNames</code> of a <code>Membership</code> are effectively aliases within the <code>membershipOwningNamespace</code> for an <code>Element</code> with a separate <code>OwningMembership</code> in the same or a different <code>Namespace</code>.</p><br><br><p>&nbsp;</p><br><br>memberElementId = memberElement.elementId

description: <p>A <code>Membership</code> is a <code>Relationship</code> between a <code>Namespace</code> and an <code>Element</code> that indicates the <code>Element</code> is a <code>member</code> of (i.e., is contained in) the Namespace. Any <code>memberNames</code> specify how the <code>memberElement</code> is identified in the <code>Namespace</code> and the <code>visibility</code> specifies whether or not the <code>memberElement</code> is publicly visible from outside the <code>Namespace</code>.</p><br><br><p>If a <code>Membership</code> is an <code>OwningMembership</code>, then it owns its <code>memberElement</code>, which becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code>. Otherwise, the <code>memberNames</code> of a <code>Membership</code> are effectively aliases within the <code>membershipOwningNamespace</code> for an <code>Element</code> with a separate <code>OwningMembership</code> in the same or a different <code>Namespace</code>.</p><br><br><p>&nbsp;</p><br><br>memberElementId = memberElement.elementId

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:membershipMemberElementId](https://www.omg.org/spec/KerML/20230201/vocab#membershipMemberElementId)| [1]| String| <p>The <code>elementId</code> of the <code>memberElement</code>.</p>| <p>The <code>elementId</code> of the <code>memberElement</code>.</p>|
| [kerml_vocab:membershipMemberShortName](https://www.omg.org/spec/KerML/20230201/vocab#membershipMemberShortName)| [0..1]| String| <p>The short name of the <code>memberElement</code> relative to the <code>membershipOwningNamespace</code>.</p>| <p>The short name of the <code>memberElement</code> relative to the <code>membershipOwningNamespace</code>.</p>|
| [kerml_vocab:membershipMemberName](https://www.omg.org/spec/KerML/20230201/vocab#membershipMemberName)| [0..1]| String| <p>The name of the <code>memberElement</code> relative to the <code>membershipOwningNamespace</code>.</p><br>| <p>The name of the <code>memberElement</code> relative to the <code>membershipOwningNamespace</code>.</p><br>|
| [kerml_vocab:membershipVisibility](https://www.omg.org/spec/KerML/20230201/vocab#membershipVisibility)| [1]| String| <p>Whether or not the <code>Membership</code> of the <code>memberElement</code> in the <code>membershipOwningNamespace</code> is publicly visible outside that <code>Namespace</code>.</p><br>| <p>Whether or not the <code>Membership</code> of the <code>memberElement</code> in the <code>membershipOwningNamespace</code> is publicly visible outside that <code>Namespace</code>.</p><br>|
| [kerml_vocab:membershipMembershipOwningNamespace](https://www.omg.org/spec/KerML/20230201/vocab#membershipMembershipOwningNamespace)| [1]| [kerml_vocab:Namespace](https://www.omg.org/spec/KerML/20230201/vocab#Namespace)| <p>The <code>Namespace</code> of which the <code>memberElement</code> becomes a <cpde>member due to this <code>Membership</code>.</cpde></p><br>| <p>The <code>Namespace</code> of which the <code>memberElement</code> becomes a <cpde>member due to this <code>Membership</code>.</cpde></p><br>|
| [kerml_vocab:membershipMemberElement](https://www.omg.org/spec/KerML/20230201/vocab#membershipMemberElement)| [1]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The <code>Element</code> that becomes a <code>member</code> of the <code>membershipOwningNamespace</code> due to this <code>Membership</code>.</p><br>| <p>The <code>Element</code> that becomes a <code>member</code> of the <code>membershipOwningNamespace</code> due to this <code>Membership</code>.</p><br>|



### OperatorExpression

URI: https://www.omg.org/spec/KerML/20230201/shapes#OperatorExpression

type: Shape

target class: [kerml_vocab:OperatorExpression](https://www.omg.org/spec/KerML/20230201/vocab#OperatorExpression)

definition of vocabulary class : <p>An <code>OperatorExpression</code> is an <code>InvocationExpression</code> whose <code>function</code> is determined by resolving its <code>operator</code> in the context of one of the standard packages from the Kernel Function Library.</p><br>let libFunctions : Sequence(Element) = <br>    Sequence{'BaseFunctions', 'DataFunctions', 'ControlFunctions'}-><br>    collect(ns | resolveGlobal(ns + "::'" + operator + "'").<br>    memberElement) in<br>libFunctions->includes(function)<br>    <br>

description: <p>An <code>OperatorExpression</code> is an <code>InvocationExpression</code> whose <code>function</code> is determined by resolving its <code>operator</code> in the context of one of the standard packages from the Kernel Function Library.</p><br>let libFunctions : Sequence(Element) = <br>    Sequence{'BaseFunctions', 'DataFunctions', 'ControlFunctions'}-><br>    collect(ns | resolveGlobal(ns + "::'" + operator + "'").<br>    memberElement) in<br>libFunctions->includes(function)<br>    <br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:operatorExpressionOperator](https://www.omg.org/spec/KerML/20230201/vocab#operatorExpressionOperator)| [1]| String| <p>An <code>operator</code> symbol that names a corresponding <code>Function</code> from one of the standard packages from the Kernel Function Library .</p>| <p>An <code>operator</code> symbol that names a corresponding <code>Function</code> from one of the standard packages from the Kernel Function Library .</p>|



### Intersecting

URI: https://www.omg.org/spec/KerML/20230201/shapes#Intersecting

type: Shape

target class: [kerml_vocab:Intersecting](https://www.omg.org/spec/KerML/20230201/vocab#Intersecting)

definition of vocabulary class : <p><code>Intersecting</code> is a <code>Relationship</code> that makes its <code>intersectingType</code> one of the <code>intersectingTypes</code> of its <code>typeIntersected</code>.</p><br>

description: <p><code>Intersecting</code> is a <code>Relationship</code> that makes its <code>intersectingType</code> one of the <code>intersectingTypes</code> of its <code>typeIntersected</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:intersectingIntersectingType](https://www.omg.org/spec/KerML/20230201/vocab#intersectingIntersectingType)| [1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p><code>Type</code> that partly determines interpretations of <code>typeIntersected</code>, as described in <code>Type::intersectingType</code>.</p><br>| <p><code>Type</code> that partly determines interpretations of <code>typeIntersected</code>, as described in <code>Type::intersectingType</code>.</p><br>|
| [kerml_vocab:intersectingTypeIntersected](https://www.omg.org/spec/KerML/20230201/vocab#intersectingTypeIntersected)| [1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p><code>Type</code> with interpretations partly determined by <code>intersectingType</code>, as described in <code>Type::intersectingType</code>.</p><br>| <p><code>Type</code> with interpretations partly determined by <code>intersectingType</code>, as described in <code>Type::intersectingType</code>.</p><br>|



### FeatureValue

URI: https://www.omg.org/spec/KerML/20230201/shapes#FeatureValue

type: Shape

target class: [kerml_vocab:FeatureValue](https://www.omg.org/spec/KerML/20230201/vocab#FeatureValue)

definition of vocabulary class : <p>A <code>FeatureValue</code> is a <code>Membership</code> that identifies a particular member <code>Expression</code> that provides the value of the <code>Feature</code> that owns the <code>FeatureValue</code>. The value is specified as either a bound value or an initial value, and as either a concrete or default value. A <code>Feature</code> can have at most one <code>FeatureValue</code>.</p><br><br><p>The result of the <code>value</code> <code>Expression</code> is bound to the <code>featureWithValue</code> using a <code>BindingConnector</code>. If <code>isInitial = false</code>, then the <code>featuringType</code> of the <code>BindingConnector</code> is the same as the <code>featuringType</code> of the <code>featureWithValue</code>. If <code>isInitial = true</code>, then the <code>featuringType</code> of the <code>BindingConnector</code> is restricted to its <code>startShot</code>.<br><br><p>If <code>isDefault = false</code>, then the above semantics of the <code>FeatureValue</code> are realized for the given <code>featureWithValue</code>. Otherwise, the semantics are realized for any individual of the <code>featuringType</code> of the <code>featureWithValue</code>, unless another value is explicitly given for the <code>featureWithValue</code> for that individual.</p><br><br>not isDefault implies<br>    featureWithValue.ownedMember-><br>        selectByKind(BindingConnector)->exists(b |<br>            b.relatedFeature->includes(featureWithValue) and<br>            b.relatedFeature->includes(value.result) and<br>            if not isInitial then <br>                b.featuringType = featureWithValue.featuringType<br>            else <br>                b.featuringType->exists(t |<br>                    t.oclIsKindOf(Feature) and<br>                    t.oclAsType(Feature).chainingFeature =<br>                        Sequence{<br>                            resolveGlobal('Base::things::that').<br>                                memberElement,<br>                            resolveGlobal('Occurrences::Occurrence::startShot').<br>                                memberElement<br>                        }<br>                )<br>            endif)<br>featureWithValue.redefinition.redefinedFeature-><br>    closure(redefinition.redefinedFeature).valuation-><br>    forAll(isDefault)

description: <p>A <code>FeatureValue</code> is a <code>Membership</code> that identifies a particular member <code>Expression</code> that provides the value of the <code>Feature</code> that owns the <code>FeatureValue</code>. The value is specified as either a bound value or an initial value, and as either a concrete or default value. A <code>Feature</code> can have at most one <code>FeatureValue</code>.</p><br><br><p>The result of the <code>value</code> <code>Expression</code> is bound to the <code>featureWithValue</code> using a <code>BindingConnector</code>. If <code>isInitial = false</code>, then the <code>featuringType</code> of the <code>BindingConnector</code> is the same as the <code>featuringType</code> of the <code>featureWithValue</code>. If <code>isInitial = true</code>, then the <code>featuringType</code> of the <code>BindingConnector</code> is restricted to its <code>startShot</code>.<br><br><p>If <code>isDefault = false</code>, then the above semantics of the <code>FeatureValue</code> are realized for the given <code>featureWithValue</code>. Otherwise, the semantics are realized for any individual of the <code>featuringType</code> of the <code>featureWithValue</code>, unless another value is explicitly given for the <code>featureWithValue</code> for that individual.</p><br><br>not isDefault implies<br>    featureWithValue.ownedMember-><br>        selectByKind(BindingConnector)->exists(b |<br>            b.relatedFeature->includes(featureWithValue) and<br>            b.relatedFeature->includes(value.result) and<br>            if not isInitial then <br>                b.featuringType = featureWithValue.featuringType<br>            else <br>                b.featuringType->exists(t |<br>                    t.oclIsKindOf(Feature) and<br>                    t.oclAsType(Feature).chainingFeature =<br>                        Sequence{<br>                            resolveGlobal('Base::things::that').<br>                                memberElement,<br>                            resolveGlobal('Occurrences::Occurrence::startShot').<br>                                memberElement<br>                        }<br>                )<br>            endif)<br>featureWithValue.redefinition.redefinedFeature-><br>    closure(redefinition.redefinedFeature).valuation-><br>    forAll(isDefault)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:featureValueIsInitial](https://www.omg.org/spec/KerML/20230201/vocab#featureValueIsInitial)| [1]| Boolean| <p>Whether this <code>FeatureValue</code> specifies a bound value or an initial value for the <code>featureWithValue</code>.</p>| <p>Whether this <code>FeatureValue</code> specifies a bound value or an initial value for the <code>featureWithValue</code>.</p>|
| [kerml_vocab:featureValueIsDefault](https://www.omg.org/spec/KerML/20230201/vocab#featureValueIsDefault)| [1]| Boolean| <p>Whether this <code>FeatureValue</code> is a concrete specification of the bound or initial value of the <code>featureWithValue</code>, or just a default value that may be overridden.</p>| <p>Whether this <code>FeatureValue</code> is a concrete specification of the bound or initial value of the <code>featureWithValue</code>, or just a default value that may be overridden.</p>|
| [kerml_vocab:featureValueFeatureWithValue](https://www.omg.org/spec/KerML/20230201/vocab#featureValueFeatureWithValue)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> to be provided a value.</p><br><br><p>The Feature to be provided a value.</p>| <p>The <code>Feature</code> to be provided a value.</p><br><br><p>The Feature to be provided a value.</p>|
| [kerml_vocab:featureValueValue](https://www.omg.org/spec/KerML/20230201/vocab#featureValueValue)| [1]| [kerml_vocab:Expression](https://www.omg.org/spec/KerML/20230201/vocab#Expression)| <p>The <code>Expression</code> that provides the value of the <code>featureWithValue</code> as its <code>result</code>.</p><br><br><p>The Expression that provides the value as a result.</p>| <p>The <code>Expression</code> that provides the value of the <code>featureWithValue</code> as its <code>result</code>.</p><br><br><p>The Expression that provides the value as a result.</p>|



### CollectExpression

URI: https://www.omg.org/spec/KerML/20230201/shapes#CollectExpression

type: Shape

target class: [kerml_vocab:CollectExpression](https://www.omg.org/spec/KerML/20230201/vocab#CollectExpression)

definition of vocabulary class : <p>A <code>CollectExpression</code> is an <code>OperatorExpression</code> whose <code>operator</code> is <code>"collect"</code>, which resolves to the <code>Function</code> <em><code>ControlFunctions::collect</code></em> from the Kernel Functions Library.</p><br>operator = "collect"

description: <p>A <code>CollectExpression</code> is an <code>OperatorExpression</code> whose <code>operator</code> is <code>"collect"</code>, which resolves to the <code>Function</code> <em><code>ControlFunctions::collect</code></em> from the Kernel Functions Library.</p><br>operator = "collect"

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### ParameterMembership

URI: https://www.omg.org/spec/KerML/20230201/shapes#ParameterMembership

type: Shape

target class: [kerml_vocab:ParameterMembership](https://www.omg.org/spec/KerML/20230201/vocab#ParameterMembership)

definition of vocabulary class : <p>A <code>ParameterMembership</code> is a <code>FeatureMembership</code> that identifies its <code>memberFeature</code> as a parameter, which is always owned, and must have a <code>direction</code>. A <code>ParameterMembership</code> must be owned by a <code>Behavior</code> or a <code>Step</code>.</p><br>ownedMemberParameter.direction = parameterDirection()<br>owningType.oclIsKindOf(Behavior) or owningType.oclIsKindOf(Step)

description: <p>A <code>ParameterMembership</code> is a <code>FeatureMembership</code> that identifies its <code>memberFeature</code> as a parameter, which is always owned, and must have a <code>direction</code>. A <code>ParameterMembership</code> must be owned by a <code>Behavior</code> or a <code>Step</code>.</p><br>ownedMemberParameter.direction = parameterDirection()<br>owningType.oclIsKindOf(Behavior) or owningType.oclIsKindOf(Step)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:parameterMembershipOwnedMemberParameter](https://www.omg.org/spec/KerML/20230201/vocab#parameterMembershipOwnedMemberParameter)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is identified as a <code>parameter</code> by this <code>ParameterMembership</code>.</p><br>| <p>The <code>Feature</code> that is identified as a <code>parameter</code> by this <code>ParameterMembership</code>.</p><br>|



### ItemFlow

URI: https://www.omg.org/spec/KerML/20230201/shapes#ItemFlow

type: Shape

target class: [kerml_vocab:ItemFlow](https://www.omg.org/spec/KerML/20230201/vocab#ItemFlow)

definition of vocabulary class : <p>An <code>ItemFlow</code> is a <code>Step</code> that represents the transfer of objects or data values from one <code>Feature</code> to another. <code>ItemFlows</code> can take non-zero time to complete.</p><br><br>if itemFlowEnds->isEmpty() then<br>    specializesFromLibrary('Transfers::transfers')<br>else<br>    specializesFromLibrary('Transfers::flowTransfers')<br>endif<br>itemType =<br>    if itemFeature = null then Sequence{}<br>    else itemFeature.type<br>    endif<br>sourceOutputFeature =<br>    if connectorEnd->isEmpty() or <br>        connectorEnd.ownedFeature->isEmpty()<br>    then null<br>    else connectorEnd.ownedFeature->first()<br>    endif<br>targetInputFeature =<br>    if connectorEnd->size() < 2 or <br>        connectorEnd->at(2).ownedFeature->isEmpty()<br>    then null<br>    else connectorEnd->at(2).ownedFeature->first()<br>    endif<br>itemFlowEnd = connectorEnd->selectByKind(ItemFlowEnd)<br>itemFeature =<br>    let itemFeatures : Sequence(ItemFeature) = <br>        ownedFeature->selectByKind(ItemFeature) in<br>    if itemFeatures->isEmpty() then null<br>    else itemFeatures->first()<br>    endif<br>ownedFeature->selectByKind(ItemFeature)->size() <= 1

description: <p>An <code>ItemFlow</code> is a <code>Step</code> that represents the transfer of objects or data values from one <code>Feature</code> to another. <code>ItemFlows</code> can take non-zero time to complete.</p><br><br>if itemFlowEnds->isEmpty() then<br>    specializesFromLibrary('Transfers::transfers')<br>else<br>    specializesFromLibrary('Transfers::flowTransfers')<br>endif<br>itemType =<br>    if itemFeature = null then Sequence{}<br>    else itemFeature.type<br>    endif<br>sourceOutputFeature =<br>    if connectorEnd->isEmpty() or <br>        connectorEnd.ownedFeature->isEmpty()<br>    then null<br>    else connectorEnd.ownedFeature->first()<br>    endif<br>targetInputFeature =<br>    if connectorEnd->size() < 2 or <br>        connectorEnd->at(2).ownedFeature->isEmpty()<br>    then null<br>    else connectorEnd->at(2).ownedFeature->first()<br>    endif<br>itemFlowEnd = connectorEnd->selectByKind(ItemFlowEnd)<br>itemFeature =<br>    let itemFeatures : Sequence(ItemFeature) = <br>        ownedFeature->selectByKind(ItemFeature) in<br>    if itemFeatures->isEmpty() then null<br>    else itemFeatures->first()<br>    endif<br>ownedFeature->selectByKind(ItemFeature)->size() <= 1

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:itemFlowItemType](https://www.omg.org/spec/KerML/20230201/vocab#itemFlowItemType)| [0..*]| [kerml_vocab:Classifier](https://www.omg.org/spec/KerML/20230201/vocab#Classifier)| <p>The type of values transferred, which is the <code>type</code> of the <code>itemFeature</code> of the <code>ItemFlow</code>.</p><br><br>| <p>The type of values transferred, which is the <code>type</code> of the <code>itemFeature</code> of the <code>ItemFlow</code>.</p><br><br>|
| [kerml_vocab:itemFlowTargetInputFeature](https://www.omg.org/spec/KerML/20230201/vocab#itemFlowTargetInputFeature)| [0..1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> that receives the values carried by the <code>ItemFlow</code>. It must be an owned <code>output</code> of the target participant of the <code>ItemFlow</code>.</p>| <p>The <code>Feature</code> that receives the values carried by the <code>ItemFlow</code>. It must be an owned <code>output</code> of the target participant of the <code>ItemFlow</code>.</p>|
| [kerml_vocab:itemFlowSourceOutputFeature](https://www.omg.org/spec/KerML/20230201/vocab#itemFlowSourceOutputFeature)| [0..1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> that provides the items carried by the <code>ItemFlow</code>. It must be an owned <code>output</code> of the <code>source</code> of the <code>ItemFlow</code>.</p><br>| <p>The <code>Feature</code> that provides the items carried by the <code>ItemFlow</code>. It must be an owned <code>output</code> of the <code>source</code> of the <code>ItemFlow</code>.</p><br>|
| [kerml_vocab:itemFlowItemFlowEnd](https://www.omg.org/spec/KerML/20230201/vocab#itemFlowItemFlowEnd)| [0..*]| [kerml_vocab:ItemFlowEnd](https://www.omg.org/spec/KerML/20230201/vocab#ItemFlowEnd)| <p>The <code>connectorEnds</code> of this <code>ItemFlow</code> that are <code>ItemFlowEnds</code>.</p><br>| <p>The <code>connectorEnds</code> of this <code>ItemFlow</code> that are <code>ItemFlowEnds</code>.</p><br>|
| [kerml_vocab:itemFlowItemFeature](https://www.omg.org/spec/KerML/20230201/vocab#itemFlowItemFeature)| [0..1]| [kerml_vocab:ItemFeature](https://www.omg.org/spec/KerML/20230201/vocab#ItemFeature)| <p>The <code>ownedFeature</code> of the <code>ItemFlow</code> that is an <code>ItemFeature</code> (if any).</p><br>| <p>The <code>ownedFeature</code> of the <code>ItemFlow</code> that is an <code>ItemFeature</code> (if any).</p><br>|
| [kerml_vocab:itemFlowInteraction](https://www.omg.org/spec/KerML/20230201/vocab#itemFlowInteraction)| [0..*]| [kerml_vocab:Interaction](https://www.omg.org/spec/KerML/20230201/vocab#Interaction)| <p>The <code>Interactions</code> that type this <code>ItemFlow</code>. <code>Interactions</code> are both <code>Associations</code> and <code>Behaviors</code>, which can type <code>Connectors</code> and <code>Steps</code>, respectively.</p>| <p>The <code>Interactions</code> that type this <code>ItemFlow</code>. <code>Interactions</code> are both <code>Associations</code> and <code>Behaviors</code>, which can type <code>Connectors</code> and <code>Steps</code>, respectively.</p>|



### Succession

URI: https://www.omg.org/spec/KerML/20230201/shapes#Succession

type: Shape

target class: [kerml_vocab:Succession](https://www.omg.org/spec/KerML/20230201/vocab#Succession)

definition of vocabulary class : <p>A <code>Succession</code> is a binary <code>Connector</code> that requires its <code>relatedFeatures</code> to happen separately in time.</p><br><br>specializesFromLibrary('Occurences::happensBeforeLinks')<br>transitionStep =<br>    if owningNamespace.oclIsKindOf(Step) and <br>        owningNamespace.oclAsType(Step).<br>            specializesFromLibrary('TransitionPerformances::TransitionPerformance') then<br>        owningNamespace.oclAsType(Step)<br>    else null<br>    endif<br>triggerStep =<br>    if transitionStep = null or <br>       transitionStep.ownedFeature.size() < 2 or<br>       not transitionStep.ownedFeature->at(2).oclIsKindOf(Step) <br>    then Set{}<br>    else Set{transitionStep.ownedFeature->at(2).oclAsType(Step)}<br>    endif<br>effectStep =<br>    if transitionStep = null or <br>       transitionStep.ownedFeature.size() < 4 or<br>       not transitionStep.ownedFeature->at(4).oclIsKindOf(Step) <br>    then Set{}<br>    else Set{transitionStep.ownedFeature->at(4).oclAsType(Step)}<br>    endif<br>guardExpression =<br>    if transitionStep = null or <br>       transitionStep.ownedFeature.size() < 3 or<br>       not transitionStep.ownedFeature->at(3).oclIsKindOf(Expression) <br>    then Set{}<br>    else Set{transitionStep.ownedFeature->at(3).oclAsType(Expression)}<br>    endif

description: <p>A <code>Succession</code> is a binary <code>Connector</code> that requires its <code>relatedFeatures</code> to happen separately in time.</p><br><br>specializesFromLibrary('Occurences::happensBeforeLinks')<br>transitionStep =<br>    if owningNamespace.oclIsKindOf(Step) and <br>        owningNamespace.oclAsType(Step).<br>            specializesFromLibrary('TransitionPerformances::TransitionPerformance') then<br>        owningNamespace.oclAsType(Step)<br>    else null<br>    endif<br>triggerStep =<br>    if transitionStep = null or <br>       transitionStep.ownedFeature.size() < 2 or<br>       not transitionStep.ownedFeature->at(2).oclIsKindOf(Step) <br>    then Set{}<br>    else Set{transitionStep.ownedFeature->at(2).oclAsType(Step)}<br>    endif<br>effectStep =<br>    if transitionStep = null or <br>       transitionStep.ownedFeature.size() < 4 or<br>       not transitionStep.ownedFeature->at(4).oclIsKindOf(Step) <br>    then Set{}<br>    else Set{transitionStep.ownedFeature->at(4).oclAsType(Step)}<br>    endif<br>guardExpression =<br>    if transitionStep = null or <br>       transitionStep.ownedFeature.size() < 3 or<br>       not transitionStep.ownedFeature->at(3).oclIsKindOf(Expression) <br>    then Set{}<br>    else Set{transitionStep.ownedFeature->at(3).oclAsType(Expression)}<br>    endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:successionTransitionStep](https://www.omg.org/spec/KerML/20230201/vocab#successionTransitionStep)| [0..1]| [kerml_vocab:Step](https://www.omg.org/spec/KerML/20230201/vocab#Step)| <p>A <code>Step</code> that is typed by the <code>Behavior</code> <code><em>TransitionPerformances::TransitionPerformance</em></code> (from the Kernel Semantic Library) that has this <code>Succession</code> as its <em><code>transitionLink</code></em>.</p><br>| <p>A <code>Step</code> that is typed by the <code>Behavior</code> <code><em>TransitionPerformances::TransitionPerformance</em></code> (from the Kernel Semantic Library) that has this <code>Succession</code> as its <em><code>transitionLink</code></em>.</p><br>|
| [kerml_vocab:successionTriggerStep](https://www.omg.org/spec/KerML/20230201/vocab#successionTriggerStep)| [0..*]| [kerml_vocab:Step](https://www.omg.org/spec/KerML/20230201/vocab#Step)| <p><code>Steps</code> that map incoming events to the timing of occurrences of the <code>transitionStep</code>. The values of <code>triggerStep</code> subset the list of acceptable events to be received by a <code>Behavior</code> or the object that performs it.</p><br>| <p><code>Steps</code> that map incoming events to the timing of occurrences of the <code>transitionStep</code>. The values of <code>triggerStep</code> subset the list of acceptable events to be received by a <code>Behavior</code> or the object that performs it.</p><br>|
| [kerml_vocab:successionEffectStep](https://www.omg.org/spec/KerML/20230201/vocab#successionEffectStep)| [0..*]| [kerml_vocab:Step](https://www.omg.org/spec/KerML/20230201/vocab#Step)| <p><code>Steps</code> that represent occurrences that are side effects of the <code>transitionStep</code> occurring.</p><br>| <p><code>Steps</code> that represent occurrences that are side effects of the <code>transitionStep</code> occurring.</p><br>|
| [kerml_vocab:successionGuardExpression](https://www.omg.org/spec/KerML/20230201/vocab#successionGuardExpression)| [0..*]| [kerml_vocab:Expression](https://www.omg.org/spec/KerML/20230201/vocab#Expression)| <p><code>Expressions</code> that must evaluate to true before the <code>transitionStep</code> can occur.</p><br>| <p><code>Expressions</code> that must evaluate to true before the <code>transitionStep</code> can occur.</p><br>|



### ElementFilterMembership

URI: https://www.omg.org/spec/KerML/20230201/shapes#ElementFilterMembership

type: Shape

target class: [kerml_vocab:ElementFilterMembership](https://www.omg.org/spec/KerML/20230201/vocab#ElementFilterMembership)

definition of vocabulary class : <p><code>ElementFilterMembership</code> is a <code>Membership</code> between a <code>Namespace</code> and a model-level evaluable <code><em>Boolean</em></code>-valued <code>Expression</code>, asserting that imported <code>members</code> of the <code>Namespace</code> should be filtered using the <code>condition</code> <code>Expression</code>. A general <code>Namespace</code> does not define any specific filtering behavior, but such behavior may be defined for various specialized kinds of <code>Namespaces</code>.</p><br><br>condition.isModelLevelEvaluable<br>condition.result.specializesFromLibrary('ScalarValues::Boolean')

description: <p><code>ElementFilterMembership</code> is a <code>Membership</code> between a <code>Namespace</code> and a model-level evaluable <code><em>Boolean</em></code>-valued <code>Expression</code>, asserting that imported <code>members</code> of the <code>Namespace</code> should be filtered using the <code>condition</code> <code>Expression</code>. A general <code>Namespace</code> does not define any specific filtering behavior, but such behavior may be defined for various specialized kinds of <code>Namespaces</code>.</p><br><br>condition.isModelLevelEvaluable<br>condition.result.specializesFromLibrary('ScalarValues::Boolean')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:elementFilterMembershipCondition](https://www.omg.org/spec/KerML/20230201/vocab#elementFilterMembershipCondition)| [1]| [kerml_vocab:Expression](https://www.omg.org/spec/KerML/20230201/vocab#Expression)| <p>The model-level evaluable <code>Boolean</code>-valued <code>Expression</code> used to filter the imported <code>members</code> of the <code>membershipOwningNamespace</code> of this <code>ElementFilterMembership</code>.</p><br>| <p>The model-level evaluable <code>Boolean</code>-valued <code>Expression</code> used to filter the imported <code>members</code> of the <code>membershipOwningNamespace</code> of this <code>ElementFilterMembership</code>.</p><br>|



### BindingConnector

URI: https://www.omg.org/spec/KerML/20230201/shapes#BindingConnector

type: Shape

target class: [kerml_vocab:BindingConnector](https://www.omg.org/spec/KerML/20230201/vocab#BindingConnector)

definition of vocabulary class : <p>A <code>BindingConnector</code> is a binary <code>Connector</code> that requires its <code>relatedFeatures</code> to identify the same things (have the same values).</p><br><br>specializesFromLibrary('Links::selfLinks')<br>relatedFeature->size() = 2

description: <p>A <code>BindingConnector</code> is a binary <code>Connector</code> that requires its <code>relatedFeatures</code> to identify the same things (have the same values).</p><br><br>specializesFromLibrary('Links::selfLinks')<br>relatedFeature->size() = 2

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### LiteralInteger

URI: https://www.omg.org/spec/KerML/20230201/shapes#LiteralInteger

type: Shape

target class: [kerml_vocab:LiteralInteger](https://www.omg.org/spec/KerML/20230201/vocab#LiteralInteger)

definition of vocabulary class : <p>A <code>LiteralInteger</code> is a <code>LiteralExpression</code> that provides an <code><em>Integer</em></code> value as a result. Its <code>result</code> <code>parameter</code> must have the type <code><em>Integer</em></code>.</p><br><br>specializesFromLibrary('Performances::literalIntegerEvaluations')

description: <p>A <code>LiteralInteger</code> is a <code>LiteralExpression</code> that provides an <code><em>Integer</em></code> value as a result. Its <code>result</code> <code>parameter</code> must have the type <code><em>Integer</em></code>.</p><br><br>specializesFromLibrary('Performances::literalIntegerEvaluations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:literalIntegerValue](https://www.omg.org/spec/KerML/20230201/vocab#literalIntegerValue)| [1]| Integer| <p>The <code><em>Integer</em></code> value that is the result of evaluating this <code>LiteralInteger</code>.</p><br><p>The Integer value that is the result of evaluating this Expression.</p><br>| <p>The <code><em>Integer</em></code> value that is the result of evaluating this <code>LiteralInteger</code>.</p><br><p>The Integer value that is the result of evaluating this Expression.</p><br>|



### OwningMembership

URI: https://www.omg.org/spec/KerML/20230201/shapes#OwningMembership

type: Shape

target class: [kerml_vocab:OwningMembership](https://www.omg.org/spec/KerML/20230201/vocab#OwningMembership)

definition of vocabulary class : <p>An <code>OwningMembership</code> is a <code>Membership</code> that owns its <code>memberElement</code> as a <code>ownedRelatedElement</code>. The <code>ownedMemberElement</code> becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code>.</p><br><br>ownedMemberName = ownedMemberElement.name<br>ownedMemberShortName = ownedMemberElement.shortName

description: <p>An <code>OwningMembership</code> is a <code>Membership</code> that owns its <code>memberElement</code> as a <code>ownedRelatedElement</code>. The <code>ownedMemberElement</code> becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code>.</p><br><br>ownedMemberName = ownedMemberElement.name<br>ownedMemberShortName = ownedMemberElement.shortName

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:owningMembershipOwnedMemberElementId](https://www.omg.org/spec/KerML/20230201/vocab#owningMembershipOwnedMemberElementId)| [1]| String| <p>The <code>elementId</code> of the <code>ownedMemberElement</code>.</p>| <p>The <code>elementId</code> of the <code>ownedMemberElement</code>.</p>|
| [kerml_vocab:owningMembershipOwnedMemberShortName](https://www.omg.org/spec/KerML/20230201/vocab#owningMembershipOwnedMemberShortName)| [0..1]| String| <p>The <code>shortName</code> of the <code>ownedMemberElement</code>.</p>| <p>The <code>shortName</code> of the <code>ownedMemberElement</code>.</p>|
| [kerml_vocab:owningMembershipOwnedMemberName](https://www.omg.org/spec/KerML/20230201/vocab#owningMembershipOwnedMemberName)| [0..1]| String| <p>The <code>name</code> of the <code>ownedMemberElement</code>.</p><br>| <p>The <code>name</code> of the <code>ownedMemberElement</code>.</p><br>|
| [kerml_vocab:owningMembershipOwnedMemberElement](https://www.omg.org/spec/KerML/20230201/vocab#owningMembershipOwnedMemberElement)| [1]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The <code>Element</code> that becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code> due to this <code>OwningMembership</code>.</p><br>| <p>The <code>Element</code> that becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code> due to this <code>OwningMembership</code>.</p><br>|



### Annotation

URI: https://www.omg.org/spec/KerML/20230201/shapes#Annotation

type: Shape

target class: [kerml_vocab:Annotation](https://www.omg.org/spec/KerML/20230201/vocab#Annotation)

definition of vocabulary class : <p>An <code>Annotation</code> is a Relationship between an <code>AnnotatingElement</code> and the <code>Element</code> that is annotated by that <code>AnnotatingElement</code>.</p><br>

description: <p>An <code>Annotation</code> is a Relationship between an <code>AnnotatingElement</code> and the <code>Element</code> that is annotated by that <code>AnnotatingElement</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:annotationAnnotatingElement](https://www.omg.org/spec/KerML/20230201/vocab#annotationAnnotatingElement)| [1]| [kerml_vocab:AnnotatingElement](https://www.omg.org/spec/KerML/20230201/vocab#AnnotatingElement)| <p>The <code>AnnotatingElement</code> that annotates the <code>annotatedElement</code> of this <code>Annotation</code>.</p><br>| <p>The <code>AnnotatingElement</code> that annotates the <code>annotatedElement</code> of this <code>Annotation</code>.</p><br>|
| [kerml_vocab:annotationAnnotatedElement](https://www.omg.org/spec/KerML/20230201/vocab#annotationAnnotatedElement)| [1]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The <code>Element</code> that is annotated by the <code>annotatingElement</code> of this Annotation.</p><br>| <p>The <code>Element</code> that is annotated by the <code>annotatingElement</code> of this Annotation.</p><br>|
| [kerml_vocab:annotationOwningAnnotatedElement](https://www.omg.org/spec/KerML/20230201/vocab#annotationOwningAnnotatedElement)| [0..1]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The <code>annotatedElement</code> of this <code>Annotation</code>, when it is also its <code>owningRelatedElement</code>.</p><br>| <p>The <code>annotatedElement</code> of this <code>Annotation</code>, when it is also its <code>owningRelatedElement</code>.</p><br>|
| [kerml_vocab:annotationOwningAnnotatingElement](https://www.omg.org/spec/KerML/20230201/vocab#annotationOwningAnnotatingElement)| [0..1]| [kerml_vocab:AnnotatingElement](https://www.omg.org/spec/KerML/20230201/vocab#AnnotatingElement)| <p>The <code>annotatingElement</code> of this <code>Annotation</code>, when it is also its <code>owningRelatedElement</code>.</p>| <p>The <code>annotatingElement</code> of this <code>Annotation</code>, when it is also its <code>owningRelatedElement</code>.</p>|



### Disjoining

URI: https://www.omg.org/spec/KerML/20230201/shapes#Disjoining

type: Shape

target class: [kerml_vocab:Disjoining](https://www.omg.org/spec/KerML/20230201/vocab#Disjoining)

definition of vocabulary class : <p>A <code>Disjoining</code> is a <code>Relationship</code> between <code>Types</code> asserted to have interpretations that are not shared (disjoint) between them, identified as <code>typeDisjoined</code> and <code>disjoiningType</code>. For example, a <code>Classifier</code> for mammals is disjoint from a <code>Classifier</code> for minerals, and a <code>Feature</code> for people&#39;s parents is disjoint from a <code>Feature</code> for their children.</p><br>

description: <p>A <code>Disjoining</code> is a <code>Relationship</code> between <code>Types</code> asserted to have interpretations that are not shared (disjoint) between them, identified as <code>typeDisjoined</code> and <code>disjoiningType</code>. For example, a <code>Classifier</code> for mammals is disjoint from a <code>Classifier</code> for minerals, and a <code>Feature</code> for people&#39;s parents is disjoint from a <code>Feature</code> for their children.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:disjoiningTypeDisjoined](https://www.omg.org/spec/KerML/20230201/vocab#disjoiningTypeDisjoined)| [1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p><code>Type</code> asserted to be disjoint with the <code>disjoiningType</code>.</p><br>| <p><code>Type</code> asserted to be disjoint with the <code>disjoiningType</code>.</p><br>|
| [kerml_vocab:disjoiningDisjoiningType](https://www.omg.org/spec/KerML/20230201/vocab#disjoiningDisjoiningType)| [1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p><code>Type</code> asserted to be disjoint with the <code>typeDisjoined</code>.</p><br>| <p><code>Type</code> asserted to be disjoint with the <code>typeDisjoined</code>.</p><br>|
| [kerml_vocab:disjoiningOwningType](https://www.omg.org/spec/KerML/20230201/vocab#disjoiningOwningType)| [0..1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>A <code>typeDisjoined</code> that is also an <code>owningRelatedElement</code>.</p>| <p>A <code>typeDisjoined</code> that is also an <code>owningRelatedElement</code>.</p>|



### InvocationExpression

URI: https://www.omg.org/spec/KerML/20230201/shapes#InvocationExpression

type: Shape

target class: [kerml_vocab:InvocationExpression](https://www.omg.org/spec/KerML/20230201/vocab#InvocationExpression)

definition of vocabulary class : <p>An <code>InvocationExpression</code> is an <code>Expression</code> each of whose input <code>parameters</code> are bound to the <code>result</code> of an <code>argument</code> Expression.</p><br><br>not ownedTyping->exists(oclIsKindOf(Behavior)) and<br>not ownedSubsetting.subsettedFeature.type->exists(oclIsKindOf(Behavior)) implies<br>    ownedFeature.selectByKind(BindingConnector)->exists(<br>        relatedFeature->includes(self) and<br>        relatedFeature->includes(result))<br>            <br>TBD<br>ownedFeature-><br>    select(direction = _'in').valuation-><br>    select(v | v <> null).value<br>let features : Set(Feature) = type.feature->asSet() in<br>input->forAll(inp | <br>    inp.ownedRedefinition.redefinedFeature-><br>        intersection(features)->size() = 1)<br>let features : Set(Feature) = type.feature->asSet() in<br>input->forAll(inp1 | input->forAll(inp2 |<br>    inp1 <> inp2 implies<br>        inp1.ownedRedefinition.redefinedFeature-><br>            intersection(inp2.ownedRedefinition.redefinedFeature)-><br>            intersection(features)->isEmpty()))

description: <p>An <code>InvocationExpression</code> is an <code>Expression</code> each of whose input <code>parameters</code> are bound to the <code>result</code> of an <code>argument</code> Expression.</p><br><br>not ownedTyping->exists(oclIsKindOf(Behavior)) and<br>not ownedSubsetting.subsettedFeature.type->exists(oclIsKindOf(Behavior)) implies<br>    ownedFeature.selectByKind(BindingConnector)->exists(<br>        relatedFeature->includes(self) and<br>        relatedFeature->includes(result))<br>            <br>TBD<br>ownedFeature-><br>    select(direction = _'in').valuation-><br>    select(v | v <> null).value<br>let features : Set(Feature) = type.feature->asSet() in<br>input->forAll(inp | <br>    inp.ownedRedefinition.redefinedFeature-><br>        intersection(features)->size() = 1)<br>let features : Set(Feature) = type.feature->asSet() in<br>input->forAll(inp1 | input->forAll(inp2 |<br>    inp1 <> inp2 implies<br>        inp1.ownedRedefinition.redefinedFeature-><br>            intersection(inp2.ownedRedefinition.redefinedFeature)-><br>            intersection(features)->isEmpty()))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:invocationExpressionArgument](https://www.omg.org/spec/KerML/20230201/vocab#invocationExpressionArgument)| [0..*]| [kerml_vocab:Expression](https://www.omg.org/spec/KerML/20230201/vocab#Expression)| <p>The <code>value</code> <code>Expressions</code> of the <code>FeatureValues</code> of the owned input <code>parameters</code> of the <code>InvocationExpression</code>.| <p>The <code>value</code> <code>Expressions</code> of the <code>FeatureValues</code> of the owned input <code>parameters</code> of the <code>InvocationExpression</code>.|



### Classifier

URI: https://www.omg.org/spec/KerML/20230201/shapes#Classifier

type: Shape

target class: [kerml_vocab:Classifier](https://www.omg.org/spec/KerML/20230201/vocab#Classifier)

definition of vocabulary class : <p>A <code>Classifier</code> is a <code>Type</code> that classifies:</p><br><br><ul><br>	<li>Things (in the universe) regardless of how <code>Features</code> relate them. (These are interpreted semantically as sequences of exactly one thing.)</li><br>	<li>How the above things are related by <code>Features.</code> (These are interpreted semantically as sequences of multiple things, such that the last thing in the sequence is also classified by the <code>Classifier</code>. Note that this means that a <code>Classifier</code> modeled as specializing a <code>Feature</code> cannot classify anything.)</li><br></ul><br><br><br>ownedSubclassification = <br>    ownedSpecialization->selectByKind(Subclassification)<br>multiplicity <> null implies multiplicity.featuringType->isEmpty()

description: <p>A <code>Classifier</code> is a <code>Type</code> that classifies:</p><br><br><ul><br>	<li>Things (in the universe) regardless of how <code>Features</code> relate them. (These are interpreted semantically as sequences of exactly one thing.)</li><br>	<li>How the above things are related by <code>Features.</code> (These are interpreted semantically as sequences of multiple things, such that the last thing in the sequence is also classified by the <code>Classifier</code>. Note that this means that a <code>Classifier</code> modeled as specializing a <code>Feature</code> cannot classify anything.)</li><br></ul><br><br><br>ownedSubclassification = <br>    ownedSpecialization->selectByKind(Subclassification)<br>multiplicity <> null implies multiplicity.featuringType->isEmpty()

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:classifierOwnedSubclassification](https://www.omg.org/spec/KerML/20230201/vocab#classifierOwnedSubclassification)| [0..*]| [kerml_vocab:Subclassification](https://www.omg.org/spec/KerML/20230201/vocab#Subclassification)| <p>The <code>ownedSpecializations</code> of this <code>Classifier</code> that are <code>Subclassifications</code>, for which this <code>Classifier</code> is the <code>subclassifier</code>.</p><br>| <p>The <code>ownedSpecializations</code> of this <code>Classifier</code> that are <code>Subclassifications</code>, for which this <code>Classifier</code> is the <code>subclassifier</code>.</p><br>|



### Step

URI: https://www.omg.org/spec/KerML/20230201/shapes#Step

type: Shape

target class: [kerml_vocab:Step](https://www.omg.org/spec/KerML/20230201/vocab#Step)

definition of vocabulary class : <p>A <code>Step</code> is a <code>Feature</code> that is typed by one or more <code>Behaviors</code>. <code>Steps</code> may be used by one <code>Behavior</code> to coordinate the performance of other <code>Behaviors</code>, supporting a steady refinement of behavioral descriptions. <code>Steps</code> can be ordered in time and can be connected using <code>ItemFlows</code> to specify things flowing between their <code>parameters</code>.</p><br><br>specializesFromLibrary('Performances::performances')<br>owningType <> null and<br>    (owningType.oclIsKindOf(Behavior) or<br>     owningType.oclIsKindOf(Step)) implies<br>    specializesFromLibrary('Performances::Performance::enclosedPerformance')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(Structure) or<br> owningType.oclIsKindOf(Feature) and<br> owningType.oclAsType(Feature).type-><br>    exists(oclIsKindOf(Structure)) implies<br>    specializesFromLibrary('Objects::Object::ownedPerformance')<br>owningType <> null and<br>    (owningType.oclIsKindOf(Behavior) or<br>     owningType.oclIsKindOf(Step)) and<br>    self.isComposite implies<br>    specializesFromLibrary('Performances::Performance::subperformance')<br>behavior = type->selectByKind(Behavior)

description: <p>A <code>Step</code> is a <code>Feature</code> that is typed by one or more <code>Behaviors</code>. <code>Steps</code> may be used by one <code>Behavior</code> to coordinate the performance of other <code>Behaviors</code>, supporting a steady refinement of behavioral descriptions. <code>Steps</code> can be ordered in time and can be connected using <code>ItemFlows</code> to specify things flowing between their <code>parameters</code>.</p><br><br>specializesFromLibrary('Performances::performances')<br>owningType <> null and<br>    (owningType.oclIsKindOf(Behavior) or<br>     owningType.oclIsKindOf(Step)) implies<br>    specializesFromLibrary('Performances::Performance::enclosedPerformance')<br>isComposite and owningType <> null and<br>(owningType.oclIsKindOf(Structure) or<br> owningType.oclIsKindOf(Feature) and<br> owningType.oclAsType(Feature).type-><br>    exists(oclIsKindOf(Structure)) implies<br>    specializesFromLibrary('Objects::Object::ownedPerformance')<br>owningType <> null and<br>    (owningType.oclIsKindOf(Behavior) or<br>     owningType.oclIsKindOf(Step)) and<br>    self.isComposite implies<br>    specializesFromLibrary('Performances::Performance::subperformance')<br>behavior = type->selectByKind(Behavior)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:stepBehavior](https://www.omg.org/spec/KerML/20230201/vocab#stepBehavior)| [0..*]| [kerml_vocab:Behavior](https://www.omg.org/spec/KerML/20230201/vocab#Behavior)| <p>The <code>Behaviors</code> that type this <code>Step</code>.</p><br>| <p>The <code>Behaviors</code> that type this <code>Step</code>.</p><br>|
| [kerml_vocab:stepParameter](https://www.omg.org/spec/KerML/20230201/vocab#stepParameter)| [0..*]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>parameters</code> of this <code>Step</code>, which are defined as its <code>directedFeatures</code>, whose values are passed into and/or out of a performance of the <code>Step</code>.</p><br>| <p>The <code>parameters</code> of this <code>Step</code>, which are defined as its <code>directedFeatures</code>, whose values are passed into and/or out of a performance of the <code>Step</code>.</p><br>|



### Type

URI: https://www.omg.org/spec/KerML/20230201/shapes#Type

type: Shape

target class: [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)

definition of vocabulary class : <p>A <code>Type</code> is a <code>Namespace</code> that is the most general kind of <code>Element</code> supporting the semantics of classification. A <code>Type</code> may be a <code>Classifier</code> or a <code>Feature</code>, defining conditions on what is classified by the <code>Type</code> (see also the description of <code>isSufficient</code>).</p><br><br>ownedSpecialization = ownedRelationship->selectByKind(Specialization)-><br>    select(s | s.special = self)<br>    <br>multiplicity = <br>    let ownedMultiplicities: Sequence(Multiplicity) =<br>        ownedMember->selectByKind(Multiplicity) in<br>    if ownedMultiplicities->isEmpty() then null<br>    else ownedMultiplicities->first()<br>    endif<br>ownedFeatureMembership = ownedRelationship->selectByKind(FeatureMembership)<br>ownedConjugator =<br>    let ownedConjugators: Sequence(Conjugator) = <br>        ownedRelationship->selectByKind(Conjugation) in<br>    if ownedConjugators->isEmpty() then null <br>    else ownedConjugators->at(1) endif<br>output = feature->select(f | <br>    let direction: FeatureDirectionKind = directionOf(f) in<br>    direction = FeatureDirectionKind::out or<br>    direction = FeatureDirectionKind::inout)<br>input = feature->select(f | <br>    let direction: FeatureDirectionKind = directionOf(f) in<br>    direction = FeatureDirectionKind::_'in' or<br>    direction = FeatureDirectionKind::inout)<br>inheritedMembership = inheritedMemberships(Set{})<br>specializesFromLibrary('Base::Anything')<br>directedFeature = feature->select(f | directionOf(f) <> null)<br>feature = featureMembership.ownedMemberFeature<br>featureMembership = ownedFeatureMembership->union(<br>    inheritedMembership->selectByKind(FeatureMembership))<br>ownedFeature = ownedFeatureMembership.ownedMemberFeature<br>differencingType = ownedDifferencing.differencingType<br>intersectingType->excludes(self)<br>differencingType->excludes(self)<br>unioningType = ownedUnioning.unioningType<br>unioningType->excludes(self)<br>intersectingType = ownedIntersecting.intersectingType<br>ownedRelationship->selectByKind(Conjugation)->size() <= 1<br>ownedMember->selectByKind(Multiplicity)->size() <= 1<br>endFeature = feature->select(isEnd)<br>ownedDisjoining =<br>    ownedRelationship->selectByKind(Disjoining)<br>ownedUnioning =<br>    ownedRelationship->selectByKind(Unioning)<br>ownedRelationship->selectByKind(Intersecting)<br>ownedDifferencing =<br>    ownedRelationship->selectByKind(Differencing)<br>ownedEndFeature = ownedFeature->select(isEnd)<br>inheritedFeature = inheritedMemberships-><br>    selectByKind(FeatureMembership).memberFeature<br>ownedUnioning->size() <> 1<br>ownedIntersecting->size() <> 1<br>ownedDifferencing->size() <> 1

description: <p>A <code>Type</code> is a <code>Namespace</code> that is the most general kind of <code>Element</code> supporting the semantics of classification. A <code>Type</code> may be a <code>Classifier</code> or a <code>Feature</code>, defining conditions on what is classified by the <code>Type</code> (see also the description of <code>isSufficient</code>).</p><br><br>ownedSpecialization = ownedRelationship->selectByKind(Specialization)-><br>    select(s | s.special = self)<br>    <br>multiplicity = <br>    let ownedMultiplicities: Sequence(Multiplicity) =<br>        ownedMember->selectByKind(Multiplicity) in<br>    if ownedMultiplicities->isEmpty() then null<br>    else ownedMultiplicities->first()<br>    endif<br>ownedFeatureMembership = ownedRelationship->selectByKind(FeatureMembership)<br>ownedConjugator =<br>    let ownedConjugators: Sequence(Conjugator) = <br>        ownedRelationship->selectByKind(Conjugation) in<br>    if ownedConjugators->isEmpty() then null <br>    else ownedConjugators->at(1) endif<br>output = feature->select(f | <br>    let direction: FeatureDirectionKind = directionOf(f) in<br>    direction = FeatureDirectionKind::out or<br>    direction = FeatureDirectionKind::inout)<br>input = feature->select(f | <br>    let direction: FeatureDirectionKind = directionOf(f) in<br>    direction = FeatureDirectionKind::_'in' or<br>    direction = FeatureDirectionKind::inout)<br>inheritedMembership = inheritedMemberships(Set{})<br>specializesFromLibrary('Base::Anything')<br>directedFeature = feature->select(f | directionOf(f) <> null)<br>feature = featureMembership.ownedMemberFeature<br>featureMembership = ownedFeatureMembership->union(<br>    inheritedMembership->selectByKind(FeatureMembership))<br>ownedFeature = ownedFeatureMembership.ownedMemberFeature<br>differencingType = ownedDifferencing.differencingType<br>intersectingType->excludes(self)<br>differencingType->excludes(self)<br>unioningType = ownedUnioning.unioningType<br>unioningType->excludes(self)<br>intersectingType = ownedIntersecting.intersectingType<br>ownedRelationship->selectByKind(Conjugation)->size() <= 1<br>ownedMember->selectByKind(Multiplicity)->size() <= 1<br>endFeature = feature->select(isEnd)<br>ownedDisjoining =<br>    ownedRelationship->selectByKind(Disjoining)<br>ownedUnioning =<br>    ownedRelationship->selectByKind(Unioning)<br>ownedRelationship->selectByKind(Intersecting)<br>ownedDifferencing =<br>    ownedRelationship->selectByKind(Differencing)<br>ownedEndFeature = ownedFeature->select(isEnd)<br>inheritedFeature = inheritedMemberships-><br>    selectByKind(FeatureMembership).memberFeature<br>ownedUnioning->size() <> 1<br>ownedIntersecting->size() <> 1<br>ownedDifferencing->size() <> 1

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:typeIsAbstract](https://www.omg.org/spec/KerML/20230201/vocab#typeIsAbstract)| [1]| Boolean| <p>Indicates whether instances of this <code>Type</code> must also be instances of at least one of its specialized <code>Types</code>.</p><br>| <p>Indicates whether instances of this <code>Type</code> must also be instances of at least one of its specialized <code>Types</code>.</p><br>|
| [kerml_vocab:typeIsSufficient](https://www.omg.org/spec/KerML/20230201/vocab#typeIsSufficient)| [1]| Boolean| <p>Whether all things that meet the classification conditions of this <code>Type</code> must be classified by the <code>Type</code>.</p><br><br><p>(A <code>Type</code>&nbsp;gives conditions that must be met by whatever it classifies, but when <code>isSufficient</code> is false, things may meet those conditions but still not be classified by the <code>Type</code>. For example, a Type <code><em>Car</em></code> that is not sufficient could require everything it classifies to have four wheels, but not all four wheeled things would classify as cars. However, if the <code>Type</code> <code><em>Car</em></code> were sufficient, it would classify all four-wheeled things.)</p><br>| <p>Whether all things that meet the classification conditions of this <code>Type</code> must be classified by the <code>Type</code>.</p><br><br><p>(A <code>Type</code>&nbsp;gives conditions that must be met by whatever it classifies, but when <code>isSufficient</code> is false, things may meet those conditions but still not be classified by the <code>Type</code>. For example, a Type <code><em>Car</em></code> that is not sufficient could require everything it classifies to have four wheels, but not all four wheeled things would classify as cars. However, if the <code>Type</code> <code><em>Car</em></code> were sufficient, it would classify all four-wheeled things.)</p><br>|
| [kerml_vocab:typeIsConjugated](https://www.omg.org/spec/KerML/20230201/vocab#typeIsConjugated)| [1]| Boolean| <p>Indicates whether this <code>Type</code> has an <code>ownedConjugator</code>.</p><br>| <p>Indicates whether this <code>Type</code> has an <code>ownedConjugator</code>.</p><br>|
| [kerml_vocab:typeOwnedFeatureMembership](https://www.omg.org/spec/KerML/20230201/vocab#typeOwnedFeatureMembership)| [0..*]| [kerml_vocab:FeatureMembership](https://www.omg.org/spec/KerML/20230201/vocab#FeatureMembership)| <p>The <code>ownedMemberships</code> of this <code>Type</code> that are <code>FeatureMemberships</code>, for which the <code>Type</code> is the <code>owningType</code>. Each such <code>FeatureMembership</code> identifies an <code>ownedFeature</code> of the <code>Type</code>.</p><br>| <p>The <code>ownedMemberships</code> of this <code>Type</code> that are <code>FeatureMemberships</code>, for which the <code>Type</code> is the <code>owningType</code>. Each such <code>FeatureMembership</code> identifies an <code>ownedFeature</code> of the <code>Type</code>.</p><br>|
| [kerml_vocab:typeOwnedFeature](https://www.omg.org/spec/KerML/20230201/vocab#typeOwnedFeature)| [0..*]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>ownedMemberFeatures</code> of the <code>ownedFeatureMemberships</code> of this <code>Type</code>.</p><br>| <p>The <code>ownedMemberFeatures</code> of the <code>ownedFeatureMemberships</code> of this <code>Type</code>.</p><br>|
| [kerml_vocab:typeOwnedEndFeature](https://www.omg.org/spec/KerML/20230201/vocab#typeOwnedEndFeature)| [0..*]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>All <code>endFeatures</code> of this <code>Type</code> that are <code>ownedFeatures</code>.</p><br>| <p>All <code>endFeatures</code> of this <code>Type</code> that are <code>ownedFeatures</code>.</p><br>|
| [kerml_vocab:typeFeature](https://www.omg.org/spec/KerML/20230201/vocab#typeFeature)| [0..*]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>ownedMemberFeatures</code> of the <code>featureMemberships</code> of this <code>Type</code>.</p><br>| <p>The <code>ownedMemberFeatures</code> of the <code>featureMemberships</code> of this <code>Type</code>.</p><br>|
| [kerml_vocab:typeInput](https://www.omg.org/spec/KerML/20230201/vocab#typeInput)| [0..*]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>All <code>features</code> related to this <code>Type</code> by <code>FeatureMemberships</code> that have <code>direction</code> <code>in<code> or <code>inout<code>.</code></code></code></code></p><br>| <p>All <code>features</code> related to this <code>Type</code> by <code>FeatureMemberships</code> that have <code>direction</code> <code>in<code> or <code>inout<code>.</code></code></code></code></p><br>|
| [kerml_vocab:typeOutput](https://www.omg.org/spec/KerML/20230201/vocab#typeOutput)| [0..*]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>All <code>features</code> related to this <code>Type</code> by <code>FeatureMemberships</code> that have <code>direction</code> <code>out<code> or <code>inout<code>.</code></code></code></code></p><br>| <p>All <code>features</code> related to this <code>Type</code> by <code>FeatureMemberships</code> that have <code>direction</code> <code>out<code> or <code>inout<code>.</code></code></code></code></p><br>|
| [kerml_vocab:typeInheritedMembership](https://www.omg.org/spec/KerML/20230201/vocab#typeInheritedMembership)| [0..*]| [kerml_vocab:Membership](https://www.omg.org/spec/KerML/20230201/vocab#Membership)| <p>All <code>Memberships</code> inherited by this <code>Type</code> via <code>Specialization</code> or <code>Conjugation</code>. These are included in the derived union for the <code>memberships</code> of the <code>Type</code>.</p><br>| <p>All <code>Memberships</code> inherited by this <code>Type</code> via <code>Specialization</code> or <code>Conjugation</code>. These are included in the derived union for the <code>memberships</code> of the <code>Type</code>.</p><br>|
| [kerml_vocab:typeEndFeature](https://www.omg.org/spec/KerML/20230201/vocab#typeEndFeature)| [0..*]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>All <code>features</code> of this <code>Type</code> with <code>isEnd = true</code>.</p>| <p>All <code>features</code> of this <code>Type</code> with <code>isEnd = true</code>.</p>|
| [kerml_vocab:typeOwnedConjugator](https://www.omg.org/spec/KerML/20230201/vocab#typeOwnedConjugator)| [0..1]| [kerml_vocab:Conjugation](https://www.omg.org/spec/KerML/20230201/vocab#Conjugation)| <p>A <code>Conjugation</code> owned by this <code>Type</code> for which the <code>Type</code> is the <code>originalType</code>.</p><br>| <p>A <code>Conjugation</code> owned by this <code>Type</code> for which the <code>Type</code> is the <code>originalType</code>.</p><br>|
| [kerml_vocab:typeInheritedFeature](https://www.omg.org/spec/KerML/20230201/vocab#typeInheritedFeature)| [0..*]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>All the <code>memberFeatures</code> of the <code>inheritedMemberships</code> of this <code>Type</code> that are <code>FeatureMemberships</code>.</p><br>| <p>All the <code>memberFeatures</code> of the <code>inheritedMemberships</code> of this <code>Type</code> that are <code>FeatureMemberships</code>.</p><br>|
| [kerml_vocab:typeMultiplicity](https://www.omg.org/spec/KerML/20230201/vocab#typeMultiplicity)| [0..1]| [kerml_vocab:Multiplicity](https://www.omg.org/spec/KerML/20230201/vocab#Multiplicity)| <p>An <code>ownedMember</code> of this <code>Type</code> that is a <code>Multiplicity</code>, which constraints the cardinality of the <code>Type</code>. If there is no such <code>ownedMember</code>, then the cardinality of this <code>Type</code> is constrained by all the <code>Multiplicity</code> constraints applicable to any direct supertypes.</p><br><br><p>&nbsp;</p><br>| <p>An <code>ownedMember</code> of this <code>Type</code> that is a <code>Multiplicity</code>, which constraints the cardinality of the <code>Type</code>. If there is no such <code>ownedMember</code>, then the cardinality of this <code>Type</code> is constrained by all the <code>Multiplicity</code> constraints applicable to any direct supertypes.</p><br><br><p>&nbsp;</p><br>|
| [kerml_vocab:typeUnioningType](https://www.omg.org/spec/KerML/20230201/vocab#typeUnioningType)| [0..*]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>The interpretations of a <code>Type</code> with <code>unioningTypes</code> are asserted to be the same as those of all the <code>unioningTypes</code> together, which are the <code>Types</code> derived from the <code>unioningType</code> of the <code>ownedUnionings</code> of this <code>Type</code>. For example, a <code>Classifier</code> for people might be the union of <code>Classifiers</code> for all the sexes. Similarly, a feature for people&#39;s children might be the union of features dividing them in the same ways as people in general.</p><br>| <p>The interpretations of a <code>Type</code> with <code>unioningTypes</code> are asserted to be the same as those of all the <code>unioningTypes</code> together, which are the <code>Types</code> derived from the <code>unioningType</code> of the <code>ownedUnionings</code> of this <code>Type</code>. For example, a <code>Classifier</code> for people might be the union of <code>Classifiers</code> for all the sexes. Similarly, a feature for people&#39;s children might be the union of features dividing them in the same ways as people in general.</p><br>|
| [kerml_vocab:typeOwnedIntersecting](https://www.omg.org/spec/KerML/20230201/vocab#typeOwnedIntersecting)| [0..*]| [kerml_vocab:Intersecting](https://www.omg.org/spec/KerML/20230201/vocab#Intersecting)| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Intersectings</code>, have the <code>Type</code> as their <code>typeIntersected</code>.</p><br>| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Intersectings</code>, have the <code>Type</code> as their <code>typeIntersected</code>.</p><br>|
| [kerml_vocab:typeIntersectingType](https://www.omg.org/spec/KerML/20230201/vocab#typeIntersectingType)| [0..*]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>The interpretations of a <code>Type</code> with <code>intersectingTypes</code> are asserted to be those in common among the <code>intersectingTypes</code>, which are the <code>Types</code> derived from the <code>intersectingType</code> of the <code>ownedIntersectings</code> of this <code>Type</code>. For example, a <code>Classifier</code> might be an intersection of <code>Classifiers</code> for people of a particular sex and of a particular nationality. Similarly, a feature for people&#39;s children of a particular sex might be the intersection of a <code>Feature</code> for their children and a <code>Classifier</code> for people of that sex (because the interpretations of the children <code>Feature</code> that identify those of that sex are also interpretations of the Classifier for that sex).</p><br>| <p>The interpretations of a <code>Type</code> with <code>intersectingTypes</code> are asserted to be those in common among the <code>intersectingTypes</code>, which are the <code>Types</code> derived from the <code>intersectingType</code> of the <code>ownedIntersectings</code> of this <code>Type</code>. For example, a <code>Classifier</code> might be an intersection of <code>Classifiers</code> for people of a particular sex and of a particular nationality. Similarly, a feature for people&#39;s children of a particular sex might be the intersection of a <code>Feature</code> for their children and a <code>Classifier</code> for people of that sex (because the interpretations of the children <code>Feature</code> that identify those of that sex are also interpretations of the Classifier for that sex).</p><br>|
| [kerml_vocab:typeOwnedUnioning](https://www.omg.org/spec/KerML/20230201/vocab#typeOwnedUnioning)| [0..*]| [kerml_vocab:Unioning](https://www.omg.org/spec/KerML/20230201/vocab#Unioning)| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Unionings</code>, having the <code>Type</code> as their <code>typeUnioned</code>.</p><br>| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Unionings</code>, having the <code>Type</code> as their <code>typeUnioned</code>.</p><br>|
| [kerml_vocab:typeOwnedDisjoining](https://www.omg.org/spec/KerML/20230201/vocab#typeOwnedDisjoining)| [0..*]| [kerml_vocab:Disjoining](https://www.omg.org/spec/KerML/20230201/vocab#Disjoining)| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Disjoinings</code>, for which the <code>Type</code> is the <code>typeDisjoined</code> <code>Type</code>.</p><br>| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Disjoinings</code>, for which the <code>Type</code> is the <code>typeDisjoined</code> <code>Type</code>.</p><br>|
| [kerml_vocab:typeFeatureMembership](https://www.omg.org/spec/KerML/20230201/vocab#typeFeatureMembership)| [0..*]| [kerml_vocab:FeatureMembership](https://www.omg.org/spec/KerML/20230201/vocab#FeatureMembership)| <p>The <code>FeatureMemberships</code> for <code>features</code> of this <code>Type</code>, which include all <code>ownedFeatureMemberships</code> and those <code>inheritedMemberships</code> that are <code>FeatureMemberships</code> (but does <em>not</em> include any <code>importedMemberships</code>).</p><br>| <p>The <code>FeatureMemberships</code> for <code>features</code> of this <code>Type</code>, which include all <code>ownedFeatureMemberships</code> and those <code>inheritedMemberships</code> that are <code>FeatureMemberships</code> (but does <em>not</em> include any <code>importedMemberships</code>).</p><br>|
| [kerml_vocab:typeDifferencingType](https://www.omg.org/spec/KerML/20230201/vocab#typeDifferencingType)| [0..*]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>The interpretations of a <code>Type</code> with <code>differencingTypes</code> are asserted to be those of the first of those <code>Types</code>, but not including those of the remaining <code>Types</code>. For example, a <code>Classifier</code> might be the difference of a <code>Classifier</code> for people and another for people of a particular nationality, leaving people who are not of that nationality. Similarly, a feature of people might be the difference between a feature for their children and a <code>Classifier</code> for people of a particular sex, identifying their children not of that sex (because the interpretations of the children <code>Feature</code> that identify those of that sex are also interpretations of the <code>Classifier</code> for that sex).</p><br>| <p>The interpretations of a <code>Type</code> with <code>differencingTypes</code> are asserted to be those of the first of those <code>Types</code>, but not including those of the remaining <code>Types</code>. For example, a <code>Classifier</code> might be the difference of a <code>Classifier</code> for people and another for people of a particular nationality, leaving people who are not of that nationality. Similarly, a feature of people might be the difference between a feature for their children and a <code>Classifier</code> for people of a particular sex, identifying their children not of that sex (because the interpretations of the children <code>Feature</code> that identify those of that sex are also interpretations of the <code>Classifier</code> for that sex).</p><br>|
| [kerml_vocab:typeOwnedDifferencing](https://www.omg.org/spec/KerML/20230201/vocab#typeOwnedDifferencing)| [0..*]| [kerml_vocab:Differencing](https://www.omg.org/spec/KerML/20230201/vocab#Differencing)| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Differencings</code>, having this <code>Type</code> as their <code>typeDifferenced</code>.</p><br>| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Differencings</code>, having this <code>Type</code> as their <code>typeDifferenced</code>.</p><br>|
| [kerml_vocab:typeDirectedFeature](https://www.omg.org/spec/KerML/20230201/vocab#typeDirectedFeature)| [0..*]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>features</code> of this <code>Type</code> that have a non-null <code>direction</code>.</p><br>| <p>The <code>features</code> of this <code>Type</code> that have a non-null <code>direction</code>.</p><br>|
| [kerml_vocab:typeOwnedSpecialization](https://www.omg.org/spec/KerML/20230201/vocab#typeOwnedSpecialization)| [0..*]| [kerml_vocab:Specialization](https://www.omg.org/spec/KerML/20230201/vocab#Specialization)| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Specializations</code>, for which the <code>Type</code> is the <code>specific</code> <code>Type</code>.</p><br>| <p>The <code>ownedRelationships</code> of this <code>Type</code> that are <code>Specializations</code>, for which the <code>Type</code> is the <code>specific</code> <code>Type</code>.</p><br>|



### Dependency

URI: https://www.omg.org/spec/KerML/20230201/shapes#Dependency

type: Shape

target class: [kerml_vocab:Dependency](https://www.omg.org/spec/KerML/20230201/vocab#Dependency)

definition of vocabulary class : <p>A <code>Dependency</code> is a <code>Relationship</code> that indicates that one or more <code>client</code> <code>Elements</code> require one more <code>supplier</code> <code>Elements</code> for their complete specification. In general, this means that a change to one of the <code>supplier</code> <code>Elements</code> may necessitate a change to, or re-specification of, the <code>client</code> <code>Elements</code>.</p><br><br><p>Note that a <code>Dependency</code> is entirely a model-level <code>Relationship</code>, without instance-level semantics.</p>

description: <p>A <code>Dependency</code> is a <code>Relationship</code> that indicates that one or more <code>client</code> <code>Elements</code> require one more <code>supplier</code> <code>Elements</code> for their complete specification. In general, this means that a change to one of the <code>supplier</code> <code>Elements</code> may necessitate a change to, or re-specification of, the <code>client</code> <code>Elements</code>.</p><br><br><p>Note that a <code>Dependency</code> is entirely a model-level <code>Relationship</code>, without instance-level semantics.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:dependencyClient](https://www.omg.org/spec/KerML/20230201/vocab#dependencyClient)| [1..*]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The <code>Element</code> or <code>Elements</code> dependent on the <code>supplier</code> <code>Elements</code>.</p>| <p>The <code>Element</code> or <code>Elements</code> dependent on the <code>supplier</code> <code>Elements</code>.</p>|
| [kerml_vocab:dependencySupplier](https://www.omg.org/spec/KerML/20230201/vocab#dependencySupplier)| [1..*]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The <code>Element</code> or <code>Elements</code> on which the <code>client</code> <code>Elements</code> depend in some respect.</p>| <p>The <code>Element</code> or <code>Elements</code> on which the <code>client</code> <code>Elements</code> depend in some respect.</p>|



### Feature

URI: https://www.omg.org/spec/KerML/20230201/shapes#Feature

type: Shape

target class: [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)

definition of vocabulary class : <p>A <code>Feature</code> is a <code>Type</code> that classifies relations between multiple things (in the universe). The domain of the relation is the intersection of the <code>featuringTypes</code> of the <code>Feature</code>. (The domain of a <code>Feature</code> with no <code>featuringTyps</code> is implicitly the most general <code>Type</code> <em><code>Base::Anything</code></em> from the Kernel Semantic Library.) The co-domain of the relation is the intersection of the <code>types</code> of the <code>Feature</code>.<br><br><p>In the simplest cases, the <code>featuringTypes</code> and <code>types</code> are <code>Classifiers</code> and the <code>Feature</code> relates two things, one from the domain and one from the range. Examples include cars paired with wheels, people paired with other people, and cars paired with numbers representing the car length.</p><br><br><p>Since <code>Features</code> are <code>Types</code>, their <code>featuringTypes</code> and <code>types</code> can be <code>Features</code>. In this case, the <code>Feature</code> effectively classifies relations between relations, which can be interpreted as the sequence of things related by the domain <code>Feature</code> concatenated with the sequence of things related by the co-domain <code>Feature</code>.</p><br><br><p>The <em>values</em> of a <code>Feature</code> for a given instance of its domain are all the instances of its co-domain that are related to that domain instance by the <code>Feature</code>. The values of a <code>Feature</code> with <code>chainingFeatures</code> are the same as values of the last <code>Feature</code> in the chain, which can be found by starting with values of the first <code>Feature</code>, then using those values as domain instances to obtain valus of the second <code>Feature</code>, and so on, to values of the last <code>Feature</code>.</p><br><br>ownedRedefinition = ownedSubsetting->selectByKind(Redefinition)<br>ownedTypeFeaturing = ownedRelationship->selectByKind(TypeFeaturing)-><br>    select(tf | tf.featureOfType = self)<br>ownedSubsetting = ownedSpecialization->selectByKind(Subsetting)<br>ownedTyping = ownedGeneralization->selectByKind(FeatureTyping)<br>type = <br>    let types : OrderedSet(Types) = OrderedSet{self}-><br>        -- Note: The closure operation automatically handles circular relationships.<br>        closure(typingFeatures()).typing.type->asOrderedSet() in<br>    types->reject(t1 | types->exist(t2 | t2 <> t1 and t2.specializes(t1)))<br>multiplicity <> null implies multiplicity.featuringType = featuringType <br>specializesFromLibrary('Base::things')<br>chainingFeature->excludes(self)<br>ownedFeatureChaining = ownedRelationship->selectByKind(FeatureChaining)<br>chainingFeature = ownedFeatureChaining.chainingFeature<br>chainingFeature->size() <> 1<br>isEnd and owningType <> null implies<br>    let i : Integer = <br>        owningType.ownedEndFeature->indexOf(self) in<br>    owningType.ownedSpecialization.general-><br>        forAll(supertype |<br>             supertype.endFeature->size() >= i implies<br>                redefines(supertype.endFeature->at(i))<br>direction = null and<br>ownedSpecializations->forAll(isImplied) implies<br>    ownedMembership-><br>        selectByKind(FeatureValue)-><br>        forAll(fv | specializes(fv.value.result))<br>isEnd and owningType <> null and<br>(owningType.oclIsKindOf(Association) or<br> owningType.oclIsKindOf(Connector)) implies<br>    specializesFromLibrary('Links::Link::participant')<br>isComposite and<br>ownedTyping.type->includes(oclIsKindOf(Structure)) and<br>owningType <> null and<br>(owningType.oclIsKindOf(Structure) or<br> owningType.type->includes(oclIsKindOf(Structure))) implies<br>    specializesFromLibrary('Occurrence::Occurrence::suboccurrences')<br>owningType <> null and<br>owningType.oclIsKindOf(FeatureReferenceExpression) and<br>self = owningType.oclAsType(FeatureReferenceExpression).result implies<br>    specializes(owningType.oclAsType(FeatureReferenceExpression).referent)<br><br>ownedTyping.type->exists(selectByKind(Class)) implies<br>    specializesFromLibrary('Occurrences::occurrences')<br>isComposite and<br>ownedTyping.type->includes(oclIsKindOf(Class)) and<br>owningType <> null and<br>(owningType.oclIsKindOf(Class) or<br> owningType.oclIsKindOf(Feature) and<br>    owningType.oclAsType(Feature).type-><br>        exists(oclIsKindOf(Class))) implies<br>    specializesFromLibrary('Occurrence::Occurrence::suboccurrences')<br>ownedTyping.type->exists(selectByKind(DataType)) implies<br>    specializesFromLibrary('Base::dataValues')<br>owningType <> null and<br>owningType.oclIsKindOf(ItemFlowEnd) and<br>owningType.ownedFeature->at(1) = self implies<br>    let flowType : Type = owningType.owningType in<br>    flowType <> null implies<br>        let i : Integer = <br>            flowType.ownedFeature.indexOf(owningType) in<br>        (i = 1 implies <br>            redefinesFromLibrary('Transfers::Transfer::source::sourceOutput')) and<br>        (i = 2 implies<br>            redefinesFromLibrary('Transfers::Transfer::source::targetInput'))<br>                 <br>owningType <> null and<br>(owningType.oclIsKindOf(Behavior) or<br> owningType.oclIsKindOf(Step)) implies<br>    let i : Integer = <br>        owningType.ownedFeature->select(direction <> null) in<br>    owningType.ownedSpecialization.general-><br>        forAll(supertype |<br>            let ownedParameters : Sequence(Feature) = <br>                supertype.ownedFeature->select(direction <> null) in<br>            ownedParameters->size() >= i implies<br>                redefines(ownedParameters->at(i))<br>ownedTyping.type->exists(selectByKind(Structure)) implies<br>    specializesFromLibary('Objects::objects')<br>owningType <> null and<br>(owningType.oclIsKindOf(Function) and<br>    self = owningType.oclAsType(Function).result or<br> owningType.oclIsKindOf(Expression) and<br>    self = owningType.oclAsType(Expression).result) implies<br>    owningType.ownedSpecialization.general-><br>        select(oclIsKindOf(Function) or oclIsKindOf(Expression))-><br>        forAll(supertype |<br>            redefines(<br>                if superType.oclIsKindOf(Function) then<br>                    superType.oclAsType(Function).result<br>                else<br>                    superType.oclAsType(Expression).result<br>                endif)<br>ownedFeatureInverting = ownedRelationship->selectByKind(FeatureInverting)-><br>    select(fi | fi.featureInverted = self)<br>featuringType =<br>    let featuringTypes : OrderedSet(Type) = <br>        featuring.type->asOrderedSet() in<br>    if chainingFeature->isEmpty() then featuringTypes<br>    else<br>        featuringTypes-><br>            union(chainingFeature->first().featuringType)-><br>            asOrderedSet()<br>    endif<br>ownedReferenceSubsetting =<br>    let referenceSubsettings : OrderedSet(ReferenceSubsetting) =<br>        ownedSubsetting->selectByKind(ReferenceSubsetting) in<br>    if referenceSubsettings->isEmpty() then null<br>    else referenceSubsettings->first() endif<br>ownedSubsetting->selectByKind(ReferenceSubsetting)->size() <= 1<br>Sequence{1..chainingFeature->size() - 1}->forAll(i |<br>    chainingFeature->at(i + 1).featuringType->forAll(t | <br>        chainingFeature->at(i).specializes(t)))<br><br>isPortion and<br>ownedTyping.type->includes(oclIsKindOf(Class)) and<br>owningType <> null and<br>(owningType.oclIsKindOf(Class) or<br> owningType.oclIsKindOf(Feature) and<br>    owningType.oclAsType(Feature).type-><br>        exists(oclIsKindOf(Class))) implies<br>    specializesFromLibrary('Occurrence::Occurrence::portions')

description: <p>A <code>Feature</code> is a <code>Type</code> that classifies relations between multiple things (in the universe). The domain of the relation is the intersection of the <code>featuringTypes</code> of the <code>Feature</code>. (The domain of a <code>Feature</code> with no <code>featuringTyps</code> is implicitly the most general <code>Type</code> <em><code>Base::Anything</code></em> from the Kernel Semantic Library.) The co-domain of the relation is the intersection of the <code>types</code> of the <code>Feature</code>.<br><br><p>In the simplest cases, the <code>featuringTypes</code> and <code>types</code> are <code>Classifiers</code> and the <code>Feature</code> relates two things, one from the domain and one from the range. Examples include cars paired with wheels, people paired with other people, and cars paired with numbers representing the car length.</p><br><br><p>Since <code>Features</code> are <code>Types</code>, their <code>featuringTypes</code> and <code>types</code> can be <code>Features</code>. In this case, the <code>Feature</code> effectively classifies relations between relations, which can be interpreted as the sequence of things related by the domain <code>Feature</code> concatenated with the sequence of things related by the co-domain <code>Feature</code>.</p><br><br><p>The <em>values</em> of a <code>Feature</code> for a given instance of its domain are all the instances of its co-domain that are related to that domain instance by the <code>Feature</code>. The values of a <code>Feature</code> with <code>chainingFeatures</code> are the same as values of the last <code>Feature</code> in the chain, which can be found by starting with values of the first <code>Feature</code>, then using those values as domain instances to obtain valus of the second <code>Feature</code>, and so on, to values of the last <code>Feature</code>.</p><br><br>ownedRedefinition = ownedSubsetting->selectByKind(Redefinition)<br>ownedTypeFeaturing = ownedRelationship->selectByKind(TypeFeaturing)-><br>    select(tf | tf.featureOfType = self)<br>ownedSubsetting = ownedSpecialization->selectByKind(Subsetting)<br>ownedTyping = ownedGeneralization->selectByKind(FeatureTyping)<br>type = <br>    let types : OrderedSet(Types) = OrderedSet{self}-><br>        -- Note: The closure operation automatically handles circular relationships.<br>        closure(typingFeatures()).typing.type->asOrderedSet() in<br>    types->reject(t1 | types->exist(t2 | t2 <> t1 and t2.specializes(t1)))<br>multiplicity <> null implies multiplicity.featuringType = featuringType <br>specializesFromLibrary('Base::things')<br>chainingFeature->excludes(self)<br>ownedFeatureChaining = ownedRelationship->selectByKind(FeatureChaining)<br>chainingFeature = ownedFeatureChaining.chainingFeature<br>chainingFeature->size() <> 1<br>isEnd and owningType <> null implies<br>    let i : Integer = <br>        owningType.ownedEndFeature->indexOf(self) in<br>    owningType.ownedSpecialization.general-><br>        forAll(supertype |<br>             supertype.endFeature->size() >= i implies<br>                redefines(supertype.endFeature->at(i))<br>direction = null and<br>ownedSpecializations->forAll(isImplied) implies<br>    ownedMembership-><br>        selectByKind(FeatureValue)-><br>        forAll(fv | specializes(fv.value.result))<br>isEnd and owningType <> null and<br>(owningType.oclIsKindOf(Association) or<br> owningType.oclIsKindOf(Connector)) implies<br>    specializesFromLibrary('Links::Link::participant')<br>isComposite and<br>ownedTyping.type->includes(oclIsKindOf(Structure)) and<br>owningType <> null and<br>(owningType.oclIsKindOf(Structure) or<br> owningType.type->includes(oclIsKindOf(Structure))) implies<br>    specializesFromLibrary('Occurrence::Occurrence::suboccurrences')<br>owningType <> null and<br>owningType.oclIsKindOf(FeatureReferenceExpression) and<br>self = owningType.oclAsType(FeatureReferenceExpression).result implies<br>    specializes(owningType.oclAsType(FeatureReferenceExpression).referent)<br><br>ownedTyping.type->exists(selectByKind(Class)) implies<br>    specializesFromLibrary('Occurrences::occurrences')<br>isComposite and<br>ownedTyping.type->includes(oclIsKindOf(Class)) and<br>owningType <> null and<br>(owningType.oclIsKindOf(Class) or<br> owningType.oclIsKindOf(Feature) and<br>    owningType.oclAsType(Feature).type-><br>        exists(oclIsKindOf(Class))) implies<br>    specializesFromLibrary('Occurrence::Occurrence::suboccurrences')<br>ownedTyping.type->exists(selectByKind(DataType)) implies<br>    specializesFromLibrary('Base::dataValues')<br>owningType <> null and<br>owningType.oclIsKindOf(ItemFlowEnd) and<br>owningType.ownedFeature->at(1) = self implies<br>    let flowType : Type = owningType.owningType in<br>    flowType <> null implies<br>        let i : Integer = <br>            flowType.ownedFeature.indexOf(owningType) in<br>        (i = 1 implies <br>            redefinesFromLibrary('Transfers::Transfer::source::sourceOutput')) and<br>        (i = 2 implies<br>            redefinesFromLibrary('Transfers::Transfer::source::targetInput'))<br>                 <br>owningType <> null and<br>(owningType.oclIsKindOf(Behavior) or<br> owningType.oclIsKindOf(Step)) implies<br>    let i : Integer = <br>        owningType.ownedFeature->select(direction <> null) in<br>    owningType.ownedSpecialization.general-><br>        forAll(supertype |<br>            let ownedParameters : Sequence(Feature) = <br>                supertype.ownedFeature->select(direction <> null) in<br>            ownedParameters->size() >= i implies<br>                redefines(ownedParameters->at(i))<br>ownedTyping.type->exists(selectByKind(Structure)) implies<br>    specializesFromLibary('Objects::objects')<br>owningType <> null and<br>(owningType.oclIsKindOf(Function) and<br>    self = owningType.oclAsType(Function).result or<br> owningType.oclIsKindOf(Expression) and<br>    self = owningType.oclAsType(Expression).result) implies<br>    owningType.ownedSpecialization.general-><br>        select(oclIsKindOf(Function) or oclIsKindOf(Expression))-><br>        forAll(supertype |<br>            redefines(<br>                if superType.oclIsKindOf(Function) then<br>                    superType.oclAsType(Function).result<br>                else<br>                    superType.oclAsType(Expression).result<br>                endif)<br>ownedFeatureInverting = ownedRelationship->selectByKind(FeatureInverting)-><br>    select(fi | fi.featureInverted = self)<br>featuringType =<br>    let featuringTypes : OrderedSet(Type) = <br>        featuring.type->asOrderedSet() in<br>    if chainingFeature->isEmpty() then featuringTypes<br>    else<br>        featuringTypes-><br>            union(chainingFeature->first().featuringType)-><br>            asOrderedSet()<br>    endif<br>ownedReferenceSubsetting =<br>    let referenceSubsettings : OrderedSet(ReferenceSubsetting) =<br>        ownedSubsetting->selectByKind(ReferenceSubsetting) in<br>    if referenceSubsettings->isEmpty() then null<br>    else referenceSubsettings->first() endif<br>ownedSubsetting->selectByKind(ReferenceSubsetting)->size() <= 1<br>Sequence{1..chainingFeature->size() - 1}->forAll(i |<br>    chainingFeature->at(i + 1).featuringType->forAll(t | <br>        chainingFeature->at(i).specializes(t)))<br><br>isPortion and<br>ownedTyping.type->includes(oclIsKindOf(Class)) and<br>owningType <> null and<br>(owningType.oclIsKindOf(Class) or<br> owningType.oclIsKindOf(Feature) and<br>    owningType.oclAsType(Feature).type-><br>        exists(oclIsKindOf(Class))) implies<br>    specializesFromLibrary('Occurrence::Occurrence::portions')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:featureIsUnique](https://www.omg.org/spec/KerML/20230201/vocab#featureIsUnique)| [1]| Boolean| <p>Whether or not values for this <code>Feature</code> must have no duplicates or not.</p><br>| <p>Whether or not values for this <code>Feature</code> must have no duplicates or not.</p><br>|
| [kerml_vocab:featureIsOrdered](https://www.omg.org/spec/KerML/20230201/vocab#featureIsOrdered)| [1]| Boolean| <p>Whether an order exists for the values of this <code>Feature</code> or not.</p>| <p>Whether an order exists for the values of this <code>Feature</code> or not.</p>|
| [kerml_vocab:featureIsComposite](https://www.omg.org/spec/KerML/20230201/vocab#featureIsComposite)| [1]| Boolean| <p>Whether the <code>Feature</code> is a composite <code>feature</code> of its <code>featuringType</code>. If so, the values of the <code>Feature</code> cannot exist after its featuring instance no longer does.</p><br>| <p>Whether the <code>Feature</code> is a composite <code>feature</code> of its <code>featuringType</code>. If so, the values of the <code>Feature</code> cannot exist after its featuring instance no longer does.</p><br>|
| [kerml_vocab:featureIsEnd](https://www.omg.org/spec/KerML/20230201/vocab#featureIsEnd)| [1]| Boolean| <p>Whether or not the this <code>Feature</code> is an end <code>Feature</code>, requiring a different interpretation of the <code>multiplicity</code> of the <code>Feature</code>.</p><br><br><p>An end <code>Feature</code> is always considered to map each domain instance to a single co-domain instance, whether or not a <code>Multiplicity</code> is given for it. If a <code>Multiplicity</code> is given for an end <code>Feature</code>, rather than giving the co-domain cardinality for the <code>Feature</code> as usual, it specifies a cardinality constraint for <em>navigating</em> across the <code>endFeatures</code> of the <code>featuringType</code> of the end <code>Feature</code>. That is, if a <code>Type</code> has <em>n</em> <code>endFeatures</code>, then the <code>Multiplicity</code> of any one of those end <code>Features</code> constrains the cardinality of the set of values of that <code>Feature</code> when the values of the other <em>n-1</em> end <code>Features</code> are held fixed.</p><br>| <p>Whether or not the this <code>Feature</code> is an end <code>Feature</code>, requiring a different interpretation of the <code>multiplicity</code> of the <code>Feature</code>.</p><br><br><p>An end <code>Feature</code> is always considered to map each domain instance to a single co-domain instance, whether or not a <code>Multiplicity</code> is given for it. If a <code>Multiplicity</code> is given for an end <code>Feature</code>, rather than giving the co-domain cardinality for the <code>Feature</code> as usual, it specifies a cardinality constraint for <em>navigating</em> across the <code>endFeatures</code> of the <code>featuringType</code> of the end <code>Feature</code>. That is, if a <code>Type</code> has <em>n</em> <code>endFeatures</code>, then the <code>Multiplicity</code> of any one of those end <code>Features</code> constrains the cardinality of the set of values of that <code>Feature</code> when the values of the other <em>n-1</em> end <code>Features</code> are held fixed.</p><br>|
| [kerml_vocab:featureIsDerived](https://www.omg.org/spec/KerML/20230201/vocab#featureIsDerived)| [1]| Boolean| <p>Whether the values of this <code>Feature</code> can always be computed from the values of other <code>Features</code>.</p><br>| <p>Whether the values of this <code>Feature</code> can always be computed from the values of other <code>Features</code>.</p><br>|
| [kerml_vocab:featureIsReadOnly](https://www.omg.org/spec/KerML/20230201/vocab#featureIsReadOnly)| [1]| Boolean| <p>Whether the values of this <code>Feature</code> can change over the lifetime of an instance of the domain.</p><br>| <p>Whether the values of this <code>Feature</code> can change over the lifetime of an instance of the domain.</p><br>|
| [kerml_vocab:featureIsPortion](https://www.omg.org/spec/KerML/20230201/vocab#featureIsPortion)| [1]| Boolean| <p>Whether the values of this <code>Feature</code> are contained in the space and time of instances of the domain of the <code>Feature</code> and represent the same thing as those instances.</p><br>| <p>Whether the values of this <code>Feature</code> are contained in the space and time of instances of the domain of the <code>Feature</code> and represent the same thing as those instances.</p><br>|
| [kerml_vocab:featureDirection](https://www.omg.org/spec/KerML/20230201/vocab#featureDirection)| [0..1]| String| <p>Indicates how values of this <code>Feature</code> are determined or used (as specified for the <code>FeatureDirectionKind</code>).</p><br>| <p>Indicates how values of this <code>Feature</code> are determined or used (as specified for the <code>FeatureDirectionKind</code>).</p><br>|
| [kerml_vocab:featureOwningType](https://www.omg.org/spec/KerML/20230201/vocab#featureOwningType)| [0..1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>The <code>Type</code> that is the <code>owningType</code> of the <code>owningFeatureMembership</code> of this <code>Feature</code>.</p>| <p>The <code>Type</code> that is the <code>owningType</code> of the <code>owningFeatureMembership</code> of this <code>Feature</code>.</p>|
| [kerml_vocab:featureType](https://www.omg.org/spec/KerML/20230201/vocab#featureType)| [0..*]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p><code>Types</code> that restrict the values of this <code>Feature</code>, such that the values must be instances of all the <code>types</code>. The types of a <code>Feature</code> are derived from its <code>typings</code> and the <code>types</code> of its <code>subsettings</code>. If the <code>Feature</code> is chained, then the <code>types</code> of the last <code>Feature</code> in the chain are also <code>types</code> of the chained <code>Feature</code>.</p><br>| <p><code>Types</code> that restrict the values of this <code>Feature</code>, such that the values must be instances of all the <code>types</code>. The types of a <code>Feature</code> are derived from its <code>typings</code> and the <code>types</code> of its <code>subsettings</code>. If the <code>Feature</code> is chained, then the <code>types</code> of the last <code>Feature</code> in the chain are also <code>types</code> of the chained <code>Feature</code>.</p><br>|
| [kerml_vocab:featureOwnedRedefinition](https://www.omg.org/spec/KerML/20230201/vocab#featureOwnedRedefinition)| [0..*]| [kerml_vocab:Redefinition](https://www.omg.org/spec/KerML/20230201/vocab#Redefinition)| <p>The <code>ownedSubsettings</code> of this <code>Feature</code> that are <code>Redefinitions</code>, for which the <code>Feature</code> is the <code>redefiningFeature</code>.</p><br><br>| <p>The <code>ownedSubsettings</code> of this <code>Feature</code> that are <code>Redefinitions</code>, for which the <code>Feature</code> is the <code>redefiningFeature</code>.</p><br><br>|
| [kerml_vocab:featureOwnedSubsetting](https://www.omg.org/spec/KerML/20230201/vocab#featureOwnedSubsetting)| [0..*]| [kerml_vocab:Subsetting](https://www.omg.org/spec/KerML/20230201/vocab#Subsetting)| <p>The <code>ownedSpecializations</code> of this <code>Feature</code> that are <code>Subsettings</code>, for which the <code>Feature</code> is the <code>subsettingFeature</code>.</p><br>| <p>The <code>ownedSpecializations</code> of this <code>Feature</code> that are <code>Subsettings</code>, for which the <code>Feature</code> is the <code>subsettingFeature</code>.</p><br>|
| [kerml_vocab:featureOwningFeatureMembership](https://www.omg.org/spec/KerML/20230201/vocab#featureOwningFeatureMembership)| [0..1]| [kerml_vocab:FeatureMembership](https://www.omg.org/spec/KerML/20230201/vocab#FeatureMembership)| <p>The <code>FeatureMembership</code> that owns this <code>Feature</code> as an <code>ownedMemberFeature</code>, determining its <code>owningType</code>.</p>| <p>The <code>FeatureMembership</code> that owns this <code>Feature</code> as an <code>ownedMemberFeature</code>, determining its <code>owningType</code>.</p>|
| [kerml_vocab:featureEndOwningType](https://www.omg.org/spec/KerML/20230201/vocab#featureEndOwningType)| [0..1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>The <code>Type</code> that is related to this <code>Feature</code> by an <code>EndFeatureMembership</code> in which the <code>Feature</code> is an <code>ownedMemberFeature</code>.</p>| <p>The <code>Type</code> that is related to this <code>Feature</code> by an <code>EndFeatureMembership</code> in which the <code>Feature</code> is an <code>ownedMemberFeature</code>.</p>|
| [kerml_vocab:featureOwnedTyping](https://www.omg.org/spec/KerML/20230201/vocab#featureOwnedTyping)| [0..*]| [kerml_vocab:FeatureTyping](https://www.omg.org/spec/KerML/20230201/vocab#FeatureTyping)| <p>The <code>ownedSpecializations</code> of this <code>Feature</code> that are <code>FeatureTypings</code>, for which the <code>Feature</code> is the <code>typedFeature</code>.</p>| <p>The <code>ownedSpecializations</code> of this <code>Feature</code> that are <code>FeatureTypings</code>, for which the <code>Feature</code> is the <code>typedFeature</code>.</p>|
| [kerml_vocab:featureFeaturingType](https://www.omg.org/spec/KerML/20230201/vocab#featureFeaturingType)| [0..*]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p><code>Types</code> that feature this <code>Feature</code>, such that any instance in the domain of the <code>Feature</code> must be classified by all of these <code>Types</code>, including at least all the <code>featuringTypes</code> of its <code>typeFeaturings</code>.  If the <code>Feature</code> is chained, then the <code>featuringTypes</code> of the first <code>Feature</code> in the chain are also <code>featuringTypes</code> of the chained <code>Feature</code>.</p>| <p><code>Types</code> that feature this <code>Feature</code>, such that any instance in the domain of the <code>Feature</code> must be classified by all of these <code>Types</code>, including at least all the <code>featuringTypes</code> of its <code>typeFeaturings</code>.  If the <code>Feature</code> is chained, then the <code>featuringTypes</code> of the first <code>Feature</code> in the chain are also <code>featuringTypes</code> of the chained <code>Feature</code>.</p>|
| [kerml_vocab:featureOwnedTypeFeaturing](https://www.omg.org/spec/KerML/20230201/vocab#featureOwnedTypeFeaturing)| [0..*]| [kerml_vocab:TypeFeaturing](https://www.omg.org/spec/KerML/20230201/vocab#TypeFeaturing)| <p>The <code>ownedRelationships</code> of this <code>Feature</code> that are <code>TypeFeaturings</code> and for which the <code>Feature</code> is the <code>featureOfType</code>.</p>| <p>The <code>ownedRelationships</code> of this <code>Feature</code> that are <code>TypeFeaturings</code> and for which the <code>Feature</code> is the <code>featureOfType</code>.</p>|
| [kerml_vocab:featureChainingFeature](https://www.omg.org/spec/KerML/20230201/vocab#featureChainingFeature)| [0..*]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> that are chained together to determine the values of this <code>Feature</code>, derived from the <code>chainingFeatures</code> of the <code>ownedFeatureChainings</code> of this <code>Feature</code>, in the same order. The values of a <code>Feature</code> with <code>chainingFeatures</code> are the same as values of the last <code>Feature</code> in the chain, which can be found by starting with the values of the first <code>Feature</code> (for each instance of the domain of the original <code>Feature</code>), then using each of those as domain instances to find the values of the second <code>Feature</code> in chainingFeatures, and so on, to values of the last <code>Feature</code>.</p>| <p>The <code>Feature</code> that are chained together to determine the values of this <code>Feature</code>, derived from the <code>chainingFeatures</code> of the <code>ownedFeatureChainings</code> of this <code>Feature</code>, in the same order. The values of a <code>Feature</code> with <code>chainingFeatures</code> are the same as values of the last <code>Feature</code> in the chain, which can be found by starting with the values of the first <code>Feature</code> (for each instance of the domain of the original <code>Feature</code>), then using each of those as domain instances to find the values of the second <code>Feature</code> in chainingFeatures, and so on, to values of the last <code>Feature</code>.</p>|
| [kerml_vocab:featureOwnedFeatureInverting](https://www.omg.org/spec/KerML/20230201/vocab#featureOwnedFeatureInverting)| [0..*]| [kerml_vocab:FeatureInverting](https://www.omg.org/spec/KerML/20230201/vocab#FeatureInverting)| <p>The <code>ownedRelationships</code> of this <code>Feature</code> that are <code>FeatureInvertings</code> and for which the <code>Feature</code> is the <code>featureInverted</code>.</p>| <p>The <code>ownedRelationships</code> of this <code>Feature</code> that are <code>FeatureInvertings</code> and for which the <code>Feature</code> is the <code>featureInverted</code>.</p>|
| [kerml_vocab:featureOwnedFeatureChaining](https://www.omg.org/spec/KerML/20230201/vocab#featureOwnedFeatureChaining)| [0..*]| [kerml_vocab:FeatureChaining](https://www.omg.org/spec/KerML/20230201/vocab#FeatureChaining)| <p>The <code>ownedRelationships</code> of this <code>Feature</code> that are <code>FeatureChainings</code>, for which the <code>Feature</code> will be the <code>featureChained</code>.</p>| <p>The <code>ownedRelationships</code> of this <code>Feature</code> that are <code>FeatureChainings</code>, for which the <code>Feature</code> will be the <code>featureChained</code>.</p>|
| [kerml_vocab:featureOwnedReferenceSubsetting](https://www.omg.org/spec/KerML/20230201/vocab#featureOwnedReferenceSubsetting)| [0..1]| [kerml_vocab:ReferenceSubsetting](https://www.omg.org/spec/KerML/20230201/vocab#ReferenceSubsetting)| <p>The one <code>ownedSubsetting</code> of this <code>Feature</code>, if any, that is a <code>ReferenceSubsetting</code>, for which the <code>Feature</code> is the <code>referencingFeature</code>.</p>| <p>The one <code>ownedSubsetting</code> of this <code>Feature</code>, if any, that is a <code>ReferenceSubsetting</code>, for which the <code>Feature</code> is the <code>referencingFeature</code>.</p>|



### FeatureChainExpression

URI: https://www.omg.org/spec/KerML/20230201/shapes#FeatureChainExpression

type: Shape

target class: [kerml_vocab:FeatureChainExpression](https://www.omg.org/spec/KerML/20230201/vocab#FeatureChainExpression)

definition of vocabulary class : <p>A <code>FeatureChainExpression</code> is an <code>OperatorExpression</code> whose operator is <code>"."</code>, which resolves to the <code>Function</code> <em><code>ControlFunctions::'.'</code></em> from the Kernel Functions Library. It evaluates to the result of chaining the <code>result</code> <code>Feature</code> of its single <code>argument</code> <code>Expression</code> with its <code>targetFeature</code>.</p><br>let sourceParameter : Feature = sourceTargetFeature() in<br>sourceTargetFeature <> null and<br>sourceTargetFeature.redefinesFromLibrary('ControlFunctions::'.'::source::target')<br>let sourceParameter : Feature = sourceTargetFeature() in<br>sourceTargetFeature <> null and<br>sourceTargetFeature.redefines(targetFeature)<br>targetFeature =<br>    let nonParameterMemberships : Sequence(Membership) = ownedMembership-><br>        reject(oclIsKindOf(ParameterMembership)) in<br>    if nonParameterMemberships->isEmpty() or<br>       not nonParameterMemberships->first().memberElement.oclIsKindOf(Feature)<br>    then null<br>    else nonParameterMemberships->first().memberElement.oclAsType(Feature)<br>    endif<br>argument->notEmpty() implies<br>    targetFeature.featuringType->forAll(t | <br>        t.specializes(argument->at(1).result))

description: <p>A <code>FeatureChainExpression</code> is an <code>OperatorExpression</code> whose operator is <code>"."</code>, which resolves to the <code>Function</code> <em><code>ControlFunctions::'.'</code></em> from the Kernel Functions Library. It evaluates to the result of chaining the <code>result</code> <code>Feature</code> of its single <code>argument</code> <code>Expression</code> with its <code>targetFeature</code>.</p><br>let sourceParameter : Feature = sourceTargetFeature() in<br>sourceTargetFeature <> null and<br>sourceTargetFeature.redefinesFromLibrary('ControlFunctions::'.'::source::target')<br>let sourceParameter : Feature = sourceTargetFeature() in<br>sourceTargetFeature <> null and<br>sourceTargetFeature.redefines(targetFeature)<br>targetFeature =<br>    let nonParameterMemberships : Sequence(Membership) = ownedMembership-><br>        reject(oclIsKindOf(ParameterMembership)) in<br>    if nonParameterMemberships->isEmpty() or<br>       not nonParameterMemberships->first().memberElement.oclIsKindOf(Feature)<br>    then null<br>    else nonParameterMemberships->first().memberElement.oclAsType(Feature)<br>    endif<br>argument->notEmpty() implies<br>    targetFeature.featuringType->forAll(t | <br>        t.specializes(argument->at(1).result))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:featureChainExpressionTargetFeature](https://www.omg.org/spec/KerML/20230201/vocab#featureChainExpressionTargetFeature)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is accessed by this <code>FeatureChainExpression<code>, which is its first non-<code>parameter</code> <code>member</code>.<p>| <p>The <code>Feature</code> that is accessed by this <code>FeatureChainExpression<code>, which is its first non-<code>parameter</code> <code>member</code>.<p>|



### Predicate

URI: https://www.omg.org/spec/KerML/20230201/shapes#Predicate

type: Shape

target class: [kerml_vocab:Predicate](https://www.omg.org/spec/KerML/20230201/vocab#Predicate)

definition of vocabulary class : <p>A <code>Predicate</code> is a <code>Function</code> whose <code>result</code> <code>parameter</code> has type <code><em>Boolean</em></code> and multiplicity <code>1..1</code>.</p><br><br>specializesFromLibrary('Performances::BooleanEvaluation')

description: <p>A <code>Predicate</code> is a <code>Function</code> whose <code>result</code> <code>parameter</code> has type <code><em>Boolean</em></code> and multiplicity <code>1..1</code>.</p><br><br>specializesFromLibrary('Performances::BooleanEvaluation')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### ResultExpressionMembership

URI: https://www.omg.org/spec/KerML/20230201/shapes#ResultExpressionMembership

type: Shape

target class: [kerml_vocab:ResultExpressionMembership](https://www.omg.org/spec/KerML/20230201/vocab#ResultExpressionMembership)

definition of vocabulary class : <p>A <code>ResultExpressionMembership</code> is a <code>FeatureMembership</code> that indicates that the <code>ownedResultExpression</code> provides the result values for the <code>Function</code> or <code>Expression</code> that owns it. The owning <code>Function</code> or <code>Expression</code> must contain a <code>BindingConnector</code> between the <code>result</code> <code>parameter</code> of the <code>ownedResultExpression</code> and the <code>result</code> <code>parameter</code> of the owning <code>Function</code> or <code>Expression</code>.</p><br><br>owningType.oclIsKindOf(Function) or owningType.oclIsKindOf(Expression)

description: <p>A <code>ResultExpressionMembership</code> is a <code>FeatureMembership</code> that indicates that the <code>ownedResultExpression</code> provides the result values for the <code>Function</code> or <code>Expression</code> that owns it. The owning <code>Function</code> or <code>Expression</code> must contain a <code>BindingConnector</code> between the <code>result</code> <code>parameter</code> of the <code>ownedResultExpression</code> and the <code>result</code> <code>parameter</code> of the owning <code>Function</code> or <code>Expression</code>.</p><br><br>owningType.oclIsKindOf(Function) or owningType.oclIsKindOf(Expression)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:resultExpressionMembershipOwnedResultExpression](https://www.omg.org/spec/KerML/20230201/vocab#resultExpressionMembershipOwnedResultExpression)| [1]| [kerml_vocab:Expression](https://www.omg.org/spec/KerML/20230201/vocab#Expression)| <p>The <code>Expression</code> that provides the result for the owner of the <code>ResultExpressionMembership</code>.</p><br>| <p>The <code>Expression</code> that provides the result for the owner of the <code>ResultExpressionMembership</code>.</p><br>|



### FeatureMembership

URI: https://www.omg.org/spec/KerML/20230201/shapes#FeatureMembership

type: Shape

target class: [kerml_vocab:FeatureMembership](https://www.omg.org/spec/KerML/20230201/vocab#FeatureMembership)

definition of vocabulary class : <p>A <code>FeatureMembership</code> is an <code>OwningMembership</code> between a <code>Feature</code> in an <code>owningType</code> that is also a <code>Featuring</code> <code>Relationship<code> between the <code>Feature</code> and the <code>Type</code>, in which the <code>featuringType</code> is the <code>source</code> and the <code>featureOfType</code> is the <code>target</code>. A <code>FeatureMembership</code> is always owned by its <code>owningType</code>, which is the <code>featuringType</code> for the <code>FeatureMembership</code> considered as a <code>Featuring</code>.</p><br>

description: <p>A <code>FeatureMembership</code> is an <code>OwningMembership</code> between a <code>Feature</code> in an <code>owningType</code> that is also a <code>Featuring</code> <code>Relationship<code> between the <code>Feature</code> and the <code>Type</code>, in which the <code>featuringType</code> is the <code>source</code> and the <code>featureOfType</code> is the <code>target</code>. A <code>FeatureMembership</code> is always owned by its <code>owningType</code>, which is the <code>featuringType</code> for the <code>FeatureMembership</code> considered as a <code>Featuring</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:featureMembershipOwnedMemberFeature](https://www.omg.org/spec/KerML/20230201/vocab#featureMembershipOwnedMemberFeature)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> that this <code>FeatureMembership</code> relates to its <code>owningType</code>, making it an <code>ownedFeature</code> of the <code>owningType</code>.</p><br>| <p>The <code>Feature</code> that this <code>FeatureMembership</code> relates to its <code>owningType</code>, making it an <code>ownedFeature</code> of the <code>owningType</code>.</p><br>|
| [kerml_vocab:featureMembershipOwningType](https://www.omg.org/spec/KerML/20230201/vocab#featureMembershipOwningType)| [1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>The <code>Type</code> that owns this <code>FeatureMembership</code>.</p><br>| <p>The <code>Type</code> that owns this <code>FeatureMembership</code>.</p><br>|



### TypeFeaturing

URI: https://www.omg.org/spec/KerML/20230201/shapes#TypeFeaturing

type: Shape

target class: [kerml_vocab:TypeFeaturing](https://www.omg.org/spec/KerML/20230201/vocab#TypeFeaturing)

definition of vocabulary class : <p>A <code>TypeFeaturing</code> is a <code>Featuring</code> <code>Relationship</code> in which the <code>featureOfType</code> is the <code>source</code> and the <code>featuringType</code> is the <code>target</code>.</p>

description: <p>A <code>TypeFeaturing</code> is a <code>Featuring</code> <code>Relationship</code> in which the <code>featureOfType</code> is the <code>source</code> and the <code>featuringType</code> is the <code>target</code>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:typeFeaturingFeatureOfType](https://www.omg.org/spec/KerML/20230201/vocab#typeFeaturingFeatureOfType)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is featured by the <code>featuringType</code>. It is the <code>source</code> of the <code>TypeFeaturing</code>.</p>| <p>The <code>Feature</code> that is featured by the <code>featuringType</code>. It is the <code>source</code> of the <code>TypeFeaturing</code>.</p>|
| [kerml_vocab:typeFeaturingFeaturingType](https://www.omg.org/spec/KerML/20230201/vocab#typeFeaturingFeaturingType)| [1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>The <code>Type</code> that features the <code>featureOfType</code>. It is the <code>target</code> of the <code>TypeFeaturing</code>.</p>| <p>The <code>Type</code> that features the <code>featureOfType</code>. It is the <code>target</code> of the <code>TypeFeaturing</code>.</p>|
| [kerml_vocab:typeFeaturingOwningFeatureOfType](https://www.omg.org/spec/KerML/20230201/vocab#typeFeaturingOwningFeatureOfType)| [0..1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>A <code>featureOfType</code> that is also the <code>owningRelatedElement</code> of this <code>TypeFeaturing</code>.</p>| <p>A <code>featureOfType</code> that is also the <code>owningRelatedElement</code> of this <code>TypeFeaturing</code>.</p>|



### Redefinition

URI: https://www.omg.org/spec/KerML/20230201/shapes#Redefinition

type: Shape

target class: [kerml_vocab:Redefinition](https://www.omg.org/spec/KerML/20230201/vocab#Redefinition)

definition of vocabulary class : <p><code>Redefinition</code> is a kind of <code>Subsetting</code> that requires the <code>redefinedFeature</code> and the <code>redefiningFeature</code> to have the same values (on each instance of the domain of the <code>redefiningFeature</code>). This means any restrictions on the <code>redefiningFeature</code>, such as <code>type</code> or <code>multiplicity</code>, also apply to the <code>redefinedFeature</code> (on each instance of the domain of the <code>redefiningFeature</code>), and vice versa. The <code>redefinedFeature</code> might have values for instances of the domain of the <code>redefiningFeature</code>, but only as instances of the domain of the <code>redefinedFeature</code> that happen to also be instances of the domain of the <code>redefiningFeature</code>. This is supported by the constraints inherited from <code>Subsetting</code> on the domains of the <code>redefiningFeature</code> and <code>redefinedFeature</code>. However, these constraints are narrowed for <code>Redefinition</code> to require the <code>owningTypes</code> of the <code>redefiningFeature</code> and <code>redefinedFeature</code> to be different and the <code>redefinedFeature</code> to not be inherited into the <code>owningNamespace</code> of the <code>redefiningFeature</code>.This enables the <code>redefiningFeature</code> to have the same name as the <code>redefinedFeature</code>, if desired.</p><br><br>let anythingType: Type =<br>    redefiningFeature.resolveGlobal('Base::Anything').modelElement.oclAsType(Type) in <br>-- Including "Anything" accounts for implicit featuringType of Features<br>-- with no explicit featuringType.<br>let redefiningFeaturingTypes: Set(Type) =<br>    redefiningFeature.featuringTypes->asSet()->including(anythingType) in<br>let redefinedFeaturingTypes: Set(Type) =<br>    redefinedFeature.featuringTypes->asSet()->including(anythingType) in<br>redefiningFeaturingTypes <> redefinedFeaturingType<br>featuringType->forAll(t |<br>    let direction : FeatureDirectionKind = t.directionOf(redefinedFeature) in<br>    ((direction = FeatureDirectionKind::_'in' or <br>      direction = FeatureDirectionKind::out) implies<br>         redefiningFeature.direction = direction)<br>    and <br>    (direction = FeatureDirectionKind::inout implies<br>        redefiningFeature.direction <> null))

description: <p><code>Redefinition</code> is a kind of <code>Subsetting</code> that requires the <code>redefinedFeature</code> and the <code>redefiningFeature</code> to have the same values (on each instance of the domain of the <code>redefiningFeature</code>). This means any restrictions on the <code>redefiningFeature</code>, such as <code>type</code> or <code>multiplicity</code>, also apply to the <code>redefinedFeature</code> (on each instance of the domain of the <code>redefiningFeature</code>), and vice versa. The <code>redefinedFeature</code> might have values for instances of the domain of the <code>redefiningFeature</code>, but only as instances of the domain of the <code>redefinedFeature</code> that happen to also be instances of the domain of the <code>redefiningFeature</code>. This is supported by the constraints inherited from <code>Subsetting</code> on the domains of the <code>redefiningFeature</code> and <code>redefinedFeature</code>. However, these constraints are narrowed for <code>Redefinition</code> to require the <code>owningTypes</code> of the <code>redefiningFeature</code> and <code>redefinedFeature</code> to be different and the <code>redefinedFeature</code> to not be inherited into the <code>owningNamespace</code> of the <code>redefiningFeature</code>.This enables the <code>redefiningFeature</code> to have the same name as the <code>redefinedFeature</code>, if desired.</p><br><br>let anythingType: Type =<br>    redefiningFeature.resolveGlobal('Base::Anything').modelElement.oclAsType(Type) in <br>-- Including "Anything" accounts for implicit featuringType of Features<br>-- with no explicit featuringType.<br>let redefiningFeaturingTypes: Set(Type) =<br>    redefiningFeature.featuringTypes->asSet()->including(anythingType) in<br>let redefinedFeaturingTypes: Set(Type) =<br>    redefinedFeature.featuringTypes->asSet()->including(anythingType) in<br>redefiningFeaturingTypes <> redefinedFeaturingType<br>featuringType->forAll(t |<br>    let direction : FeatureDirectionKind = t.directionOf(redefinedFeature) in<br>    ((direction = FeatureDirectionKind::_'in' or <br>      direction = FeatureDirectionKind::out) implies<br>         redefiningFeature.direction = direction)<br>    and <br>    (direction = FeatureDirectionKind::inout implies<br>        redefiningFeature.direction <> null))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:redefinitionRedefiningFeature](https://www.omg.org/spec/KerML/20230201/vocab#redefinitionRedefiningFeature)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is redefining the <code>redefinedFeature</code> of this <code>Redefinition</code>.</p><br>| <p>The <code>Feature</code> that is redefining the <code>redefinedFeature</code> of this <code>Redefinition</code>.</p><br>|
| [kerml_vocab:redefinitionRedefinedFeature](https://www.omg.org/spec/KerML/20230201/vocab#redefinitionRedefinedFeature)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is redefined by the <code>redefiningFeature</code> of this <code>Redefinition</code>.</p><br>| <p>The <code>Feature</code> that is redefined by the <code>redefiningFeature</code> of this <code>Redefinition</code>.</p><br>|



### Invariant

URI: https://www.omg.org/spec/KerML/20230201/shapes#Invariant

type: Shape

target class: [kerml_vocab:Invariant](https://www.omg.org/spec/KerML/20230201/vocab#Invariant)

definition of vocabulary class : <p>An <code>Invariant</code> is a <code>BooleanExpression</code> that is asserted to have a specific <code><em>Boolean</em></code> result value. If <code>isNegated = false</code>, then the result is asserted to be true. If <code>isNegated = true</code>, then the result is asserted to be false.</p><br><br>if isNegated then<br>    specializesFromLibrary('Performances::falseEvaluations')<br>else<br>    specializesFromLibrary('Performances::trueEvaluations')<br>endif

description: <p>An <code>Invariant</code> is a <code>BooleanExpression</code> that is asserted to have a specific <code><em>Boolean</em></code> result value. If <code>isNegated = false</code>, then the result is asserted to be true. If <code>isNegated = true</code>, then the result is asserted to be false.</p><br><br>if isNegated then<br>    specializesFromLibrary('Performances::falseEvaluations')<br>else<br>    specializesFromLibrary('Performances::trueEvaluations')<br>endif

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:invariantIsNegated](https://www.omg.org/spec/KerML/20230201/vocab#invariantIsNegated)| [1]| Boolean| <p>Whether this <code>Invariant</code> is asserted to be false rather than true.</p><br>| <p>Whether this <code>Invariant</code> is asserted to be false rather than true.</p><br>|



### Differencing

URI: https://www.omg.org/spec/KerML/20230201/shapes#Differencing

type: Shape

target class: [kerml_vocab:Differencing](https://www.omg.org/spec/KerML/20230201/vocab#Differencing)

definition of vocabulary class : <p><code>Differencing</code> is a <code>Relationship</code> that makes its <code>differencingType</code> one of the <code>differencingTypes</code> of its <code>typeDifferenced</code>.</p><br>

description: <p><code>Differencing</code> is a <code>Relationship</code> that makes its <code>differencingType</code> one of the <code>differencingTypes</code> of its <code>typeDifferenced</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:differencingDifferencingType](https://www.omg.org/spec/KerML/20230201/vocab#differencingDifferencingType)| [1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p><code>Type</code> that partly determines interpretations of <code>typeDifferenced</code>, as described in <code>Type::differencingType</code>.</p><br>| <p><code>Type</code> that partly determines interpretations of <code>typeDifferenced</code>, as described in <code>Type::differencingType</code>.</p><br>|
| [kerml_vocab:differencingTypeDifferenced](https://www.omg.org/spec/KerML/20230201/vocab#differencingTypeDifferenced)| [1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p><code>Type</code> with interpretations partly determined by <code>differencingType</code>, as described in <code>Type::differencingType</code>.</p><br>| <p><code>Type</code> with interpretations partly determined by <code>differencingType</code>, as described in <code>Type::differencingType</code>.</p><br>|



### Multiplicity

URI: https://www.omg.org/spec/KerML/20230201/shapes#Multiplicity

type: Shape

target class: [kerml_vocab:Multiplicity](https://www.omg.org/spec/KerML/20230201/vocab#Multiplicity)

definition of vocabulary class : <p>A <code>Multiplicity</code> is a <code>Feature</code> whose co-domain is a set of natural numbers giving the allowed cardinalities of each <code>typeWithMultiplicity</code>. The <em>cardinality</em> of a <code>Type</code> is defined as follows, depending on whether the <code>Type</code> is a <code>Classifier</code> or <code>Feature</code>.<br><ul><br><li><code>Classifier</code> – The number of basic instances of the <code>Classifier</code>, that is, those instances representing things, which are not instances of any subtypes of the <code>Classifier</code> that are <code>Features</code>.<br><li><code>Features</code> – The number of instances with the same featuring instances. In the case of a <code>Feature</code> with a <code>Classifier</code> as its <code>featuringType</code>, this is the number of values of <code>Feature</code> for each basic instance of the <code>Classifier</code>. Note that, for non-unique <code>Features</code>, all duplicate values are included in this count.</li><br></ul><br><br><p><code>Multiplicity</code> co-domains (in models) can be specified by <code>Expression</code> that might vary in their results. If the <code>typeWithMultiplicity</code> is a <code>Classifier</code>, the domain of the <code>Multiplicity</code> shall be <em><code>Base::Anything</code></em>.  If the <code>typeWithMultiplicity</code> is a <code>Feature</code>,  the <code>Multiplicity</code> shall have the same domain as the <code>typeWithMultiplicity</code>.</p><br><br>if owningType <> null and owningType.oclIsKindOf(Feature) then<br>    featuringType = <br>        owningType.oclAsType(Feature).featuringType<br>else<br>    featuringType->isEmpty()<br>endif<br>specializesFromLibrary('Base::naturals')

description: <p>A <code>Multiplicity</code> is a <code>Feature</code> whose co-domain is a set of natural numbers giving the allowed cardinalities of each <code>typeWithMultiplicity</code>. The <em>cardinality</em> of a <code>Type</code> is defined as follows, depending on whether the <code>Type</code> is a <code>Classifier</code> or <code>Feature</code>.<br><ul><br><li><code>Classifier</code> – The number of basic instances of the <code>Classifier</code>, that is, those instances representing things, which are not instances of any subtypes of the <code>Classifier</code> that are <code>Features</code>.<br><li><code>Features</code> – The number of instances with the same featuring instances. In the case of a <code>Feature</code> with a <code>Classifier</code> as its <code>featuringType</code>, this is the number of values of <code>Feature</code> for each basic instance of the <code>Classifier</code>. Note that, for non-unique <code>Features</code>, all duplicate values are included in this count.</li><br></ul><br><br><p><code>Multiplicity</code> co-domains (in models) can be specified by <code>Expression</code> that might vary in their results. If the <code>typeWithMultiplicity</code> is a <code>Classifier</code>, the domain of the <code>Multiplicity</code> shall be <em><code>Base::Anything</code></em>.  If the <code>typeWithMultiplicity</code> is a <code>Feature</code>,  the <code>Multiplicity</code> shall have the same domain as the <code>typeWithMultiplicity</code>.</p><br><br>if owningType <> null and owningType.oclIsKindOf(Feature) then<br>    featuringType = <br>        owningType.oclAsType(Feature).featuringType<br>else<br>    featuringType->isEmpty()<br>endif<br>specializesFromLibrary('Base::naturals')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### NamespaceImport

URI: https://www.omg.org/spec/KerML/20230201/shapes#NamespaceImport

type: Shape

target class: [kerml_vocab:NamespaceImport](https://www.omg.org/spec/KerML/20230201/vocab#NamespaceImport)

definition of vocabulary class : <p>A <code>NamespaceImport</code> is an Import that imports <code>Memberships</code> from its <code>importedNamespace</code> into the <code>importOwningNamespace</code>. If <code> isRecursive = false</code>, then only the visible <code>Memberships</code> of the <code>importedNamespace</code> are imported. If <code> isRecursive = true</code>, then, in addition, <code>Memberships</code> are recursively imported from any <code>ownedMembers</code> of the <code>importedNamespace</code> that are <code>Namespaces</code>.</p><br><br>importedElement = importedNamespace

description: <p>A <code>NamespaceImport</code> is an Import that imports <code>Memberships</code> from its <code>importedNamespace</code> into the <code>importOwningNamespace</code>. If <code> isRecursive = false</code>, then only the visible <code>Memberships</code> of the <code>importedNamespace</code> are imported. If <code> isRecursive = true</code>, then, in addition, <code>Memberships</code> are recursively imported from any <code>ownedMembers</code> of the <code>importedNamespace</code> that are <code>Namespaces</code>.</p><br><br>importedElement = importedNamespace

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:namespaceImportImportedNamespace](https://www.omg.org/spec/KerML/20230201/vocab#namespaceImportImportedNamespace)| [1]| [kerml_vocab:Namespace](https://www.omg.org/spec/KerML/20230201/vocab#Namespace)| <p>The <code>Namespace</code> whose visible <code>Memberships</code> are imported by this <code>NamespaceImport</code>.</p><br>| <p>The <code>Namespace</code> whose visible <code>Memberships</code> are imported by this <code>NamespaceImport</code>.</p><br>|



### LiteralBoolean

URI: https://www.omg.org/spec/KerML/20230201/shapes#LiteralBoolean

type: Shape

target class: [kerml_vocab:LiteralBoolean](https://www.omg.org/spec/KerML/20230201/vocab#LiteralBoolean)

definition of vocabulary class : <p><code>LiteralBoolean</code> is a <code>LiteralExpression</code> that provides a <code><em>Boolean</em></code> value as a result. Its <code>result</code> <code>parameter</code> must have type <code><em>Boolean</em></code>.</p><br><br>specializesFromLibrary('Performances::literalBooleanEvaluations')

description: <p><code>LiteralBoolean</code> is a <code>LiteralExpression</code> that provides a <code><em>Boolean</em></code> value as a result. Its <code>result</code> <code>parameter</code> must have type <code><em>Boolean</em></code>.</p><br><br>specializesFromLibrary('Performances::literalBooleanEvaluations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:literalBooleanValue](https://www.omg.org/spec/KerML/20230201/vocab#literalBooleanValue)| [1]| Boolean| <p>The <code><em>Boolean</em></code> value that is the result of evaluating this <code>LiteralBoolean</code>.</p><br><p>The Boolean value that is the result of evaluating this Expression.</p><br>| <p>The <code><em>Boolean</em></code> value that is the result of evaluating this <code>LiteralBoolean</code>.</p><br><p>The Boolean value that is the result of evaluating this Expression.</p><br>|



### ReferenceSubsetting

URI: https://www.omg.org/spec/KerML/20230201/shapes#ReferenceSubsetting

type: Shape

target class: [kerml_vocab:ReferenceSubsetting](https://www.omg.org/spec/KerML/20230201/vocab#ReferenceSubsetting)

definition of vocabulary class : <p><code>ReferenceSubsetting</code> is a kind of <code>Subsetting</code> in which the <code>referencedFeature</code> is syntactically distinguished from other <code>Features</code> subsetted by the <code>referencingFeature</code>. <code>ReferenceSubsetting</code> has the same semantics as <code>Subsetting</code>, but the <code>referenceFeature</code> may have a special purpose relative to the <code>referencingFeature</code>. For instance, <code>ReferenceSubsetting</code> is used to identify the <code>relatedFeatures</code> of a <code>Connector</code>.</p><br><br><p><code>ReferenceSubsetting</code> is always an <code>ownedRelationship</code> of its <code>referencingFeature</code>. A <code>Feature</code> can have at most one <code>ownedReferenceSubsetting</code>.</p><br>

description: <p><code>ReferenceSubsetting</code> is a kind of <code>Subsetting</code> in which the <code>referencedFeature</code> is syntactically distinguished from other <code>Features</code> subsetted by the <code>referencingFeature</code>. <code>ReferenceSubsetting</code> has the same semantics as <code>Subsetting</code>, but the <code>referenceFeature</code> may have a special purpose relative to the <code>referencingFeature</code>. For instance, <code>ReferenceSubsetting</code> is used to identify the <code>relatedFeatures</code> of a <code>Connector</code>.</p><br><br><p><code>ReferenceSubsetting</code> is always an <code>ownedRelationship</code> of its <code>referencingFeature</code>. A <code>Feature</code> can have at most one <code>ownedReferenceSubsetting</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:referenceSubsettingReferencedFeature](https://www.omg.org/spec/KerML/20230201/vocab#referenceSubsettingReferencedFeature)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is referenced by the <code>referencingFeature</code> of this <code>ReferenceSubsetting</code>.</p><br>| <p>The <code>Feature</code> that is referenced by the <code>referencingFeature</code> of this <code>ReferenceSubsetting</code>.</p><br>|
| [kerml_vocab:referenceSubsettingReferencingFeature](https://www.omg.org/spec/KerML/20230201/vocab#referenceSubsettingReferencingFeature)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> that owns this <code>ReferenceSubsetting</code> relationship, which is also its <code>subsettingFeature</code>.</p><br>| <p>The <code>Feature</code> that owns this <code>ReferenceSubsetting</code> relationship, which is also its <code>subsettingFeature</code>.</p><br>|



### Subsetting

URI: https://www.omg.org/spec/KerML/20230201/shapes#Subsetting

type: Shape

target class: [kerml_vocab:Subsetting](https://www.omg.org/spec/KerML/20230201/vocab#Subsetting)

definition of vocabulary class : <p><code>Subsetting</code> is <code>Specialization</code> in which the <code>specific</code> and <code>general</code> <code>Types</code> are <code>Features</code>. This means all values of the <code>subsettingFeature</code> (on instances of its domain, i.e., the intersection of its <code>featuringTypes</code>) are values of the <code>subsettedFeature</code> on instances of its domain. To support this the domain of the <code>subsettingFeature</code> must be the same or specialize (at least indirectly) the domain of the <code>subsettedFeature</code> (via <code>Specialization</code>), and the co-domain (intersection of the <code>types</code>) of the <code>subsettingFeature</code> must specialize the co-domain of the <code>subsettedFeature</code>.</p><br><br>let subsettingFeaturingTypes: OrderedSet(Type) =<br>    subsettingFeature.featuringTypes in<br>let subsettedFeaturingTypes: OrderedSet(Type) =<br>    subsettedFeature.featuringTypes in<br>let anythingType: Element =<br>    subsettingFeature.resolveGlobal('Base::Anything').memberElement in <br>subsettedFeaturingTypes->forAll(t |<br>    subsettingFeaturingTypes->isEmpty() and t = anythingType or<br>    subsettingFeaturingTypes->exists(specializes(t))<br>subsettedFeature.isUnique implies subsettingFeature.isUnique

description: <p><code>Subsetting</code> is <code>Specialization</code> in which the <code>specific</code> and <code>general</code> <code>Types</code> are <code>Features</code>. This means all values of the <code>subsettingFeature</code> (on instances of its domain, i.e., the intersection of its <code>featuringTypes</code>) are values of the <code>subsettedFeature</code> on instances of its domain. To support this the domain of the <code>subsettingFeature</code> must be the same or specialize (at least indirectly) the domain of the <code>subsettedFeature</code> (via <code>Specialization</code>), and the co-domain (intersection of the <code>types</code>) of the <code>subsettingFeature</code> must specialize the co-domain of the <code>subsettedFeature</code>.</p><br><br>let subsettingFeaturingTypes: OrderedSet(Type) =<br>    subsettingFeature.featuringTypes in<br>let subsettedFeaturingTypes: OrderedSet(Type) =<br>    subsettedFeature.featuringTypes in<br>let anythingType: Element =<br>    subsettingFeature.resolveGlobal('Base::Anything').memberElement in <br>subsettedFeaturingTypes->forAll(t |<br>    subsettingFeaturingTypes->isEmpty() and t = anythingType or<br>    subsettingFeaturingTypes->exists(specializes(t))<br>subsettedFeature.isUnique implies subsettingFeature.isUnique

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:subsettingSubsettedFeature](https://www.omg.org/spec/KerML/20230201/vocab#subsettingSubsettedFeature)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is subsetted by the <code>subsettingFeature</code> of this <code>Subsetting</code>.</p><br>| <p>The <code>Feature</code> that is subsetted by the <code>subsettingFeature</code> of this <code>Subsetting</code>.</p><br>|
| [kerml_vocab:subsettingSubsettingFeature](https://www.omg.org/spec/KerML/20230201/vocab#subsettingSubsettingFeature)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is a subset of the <code>subsettedFeature</code> of this <code>Subsetting</code>.</p><br>| <p>The <code>Feature</code> that is a subset of the <code>subsettedFeature</code> of this <code>Subsetting</code>.</p><br>|
| [kerml_vocab:subsettingOwningFeature](https://www.omg.org/spec/KerML/20230201/vocab#subsettingOwningFeature)| [0..1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>A <code>subsettingFeature</code> that is also the <code>owningRelatedElement</code> of this <code>Subsetting</code>.</p><br><br>| <p>A <code>subsettingFeature</code> that is also the <code>owningRelatedElement</code> of this <code>Subsetting</code>.</p><br><br>|



### FeatureChaining

URI: https://www.omg.org/spec/KerML/20230201/shapes#FeatureChaining

type: Shape

target class: [kerml_vocab:FeatureChaining](https://www.omg.org/spec/KerML/20230201/vocab#FeatureChaining)

definition of vocabulary class : <p><code>FeatureChaining</code> is a <code>Relationship</code> that makes its target <code>Feature</code> one of the <code>chainingFeatures</code> of its owning <code>Feature</code>.</p>

description: <p><code>FeatureChaining</code> is a <code>Relationship</code> that makes its target <code>Feature</code> one of the <code>chainingFeatures</code> of its owning <code>Feature</code>.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:featureChainingChainingFeature](https://www.omg.org/spec/KerML/20230201/vocab#featureChainingChainingFeature)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> whose values partly determine values of <code>featureChained</code>, as described in <code>Feature::chainingFeature</code>.</p><br>| <p>The <code>Feature</code> whose values partly determine values of <code>featureChained</code>, as described in <code>Feature::chainingFeature</code>.</p><br>|
| [kerml_vocab:featureChainingFeatureChained](https://www.omg.org/spec/KerML/20230201/vocab#featureChainingFeatureChained)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> whose values are partly determined by values of the <code>chainingFeature</code>, as described in <code>Feature::chainingFeature</code>.</p><br>| <p>The <code>Feature</code> whose values are partly determined by values of the <code>chainingFeature</code>, as described in <code>Feature::chainingFeature</code>.</p><br>|



### BooleanExpression

URI: https://www.omg.org/spec/KerML/20230201/shapes#BooleanExpression

type: Shape

target class: [kerml_vocab:BooleanExpression](https://www.omg.org/spec/KerML/20230201/vocab#BooleanExpression)

definition of vocabulary class : <p>A <code>BooleanExpression</code> is a <em><code>Boolean</code></em>-valued <code>Expression</code> whose type is a <code>Predicate</code>. It represents a logical condition resulting from the evaluation of the <code>Predicate</code>.</p><br><br>specializesFromLibrary('Performances::booleanEvaluations')

description: <p>A <code>BooleanExpression</code> is a <em><code>Boolean</code></em>-valued <code>Expression</code> whose type is a <code>Predicate</code>. It represents a logical condition resulting from the evaluation of the <code>Predicate</code>.</p><br><br>specializesFromLibrary('Performances::booleanEvaluations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:booleanExpressionPredicate](https://www.omg.org/spec/KerML/20230201/vocab#booleanExpressionPredicate)| [0..1]| [kerml_vocab:Predicate](https://www.omg.org/spec/KerML/20230201/vocab#Predicate)| <p>The <code>Predicate</code> that types this <code>BooleanExpression</code>.</p><br><p>The Predicate that types the Expression.</p><br>| <p>The <code>Predicate</code> that types this <code>BooleanExpression</code>.</p><br><p>The Predicate that types the Expression.</p><br>|



### Featuring

URI: https://www.omg.org/spec/KerML/20230201/shapes#Featuring

type: Shape

target class: [kerml_vocab:Featuring](https://www.omg.org/spec/KerML/20230201/vocab#Featuring)

definition of vocabulary class : <p><code>Featuring</code> is a <code>Relationship</code> between a <code>Type</code> and a <code>Feature</code> that is featured by that <code>Type</code>. It asserts that every instance in the domain of the <code>feature</code> must be classified by the <code>type</code>.</p><br><br><p><code>Featuring</code> is abstract and does not commit to which of <code>feature</code> or <code>type</code> are the <code>source</code> or <code>target</code> of the <code>Relationship</code>. This commitment is made in the subclasses of <code>Featuring</code>, <code>TypeFeaturing</code> and <code>FeatureMembership</code>, which have opposite directions.</p>

description: <p><code>Featuring</code> is a <code>Relationship</code> between a <code>Type</code> and a <code>Feature</code> that is featured by that <code>Type</code>. It asserts that every instance in the domain of the <code>feature</code> must be classified by the <code>type</code>.</p><br><br><p><code>Featuring</code> is abstract and does not commit to which of <code>feature</code> or <code>type</code> are the <code>source</code> or <code>target</code> of the <code>Relationship</code>. This commitment is made in the subclasses of <code>Featuring</code>, <code>TypeFeaturing</code> and <code>FeatureMembership</code>, which have opposite directions.</p>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:featuringType](https://www.omg.org/spec/KerML/20230201/vocab#featuringType)| [1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>The <code>Type<code> that features the <code>featureOfType</code>.</p>| <p>The <code>Type<code> that features the <code>featureOfType</code>.</p>|
| [kerml_vocab:featuringFeature](https://www.omg.org/spec/KerML/20230201/vocab#featuringFeature)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is featured by the <code>featuringType</code>.</p>| <p>The <code>Feature</code> that is featured by the <code>featuringType</code>.</p>|



### Unioning

URI: https://www.omg.org/spec/KerML/20230201/shapes#Unioning

type: Shape

target class: [kerml_vocab:Unioning](https://www.omg.org/spec/KerML/20230201/vocab#Unioning)

definition of vocabulary class : <p><code>Unioning</code> is a <code>Relationship</code> that makes its <code>unioningType</code> one of the <code>unioningTypes</code> of its <code>typeUnioned</code>.</p><br>

description: <p><code>Unioning</code> is a <code>Relationship</code> that makes its <code>unioningType</code> one of the <code>unioningTypes</code> of its <code>typeUnioned</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:unioningUnioningType](https://www.omg.org/spec/KerML/20230201/vocab#unioningUnioningType)| [1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p><code>Type</code> that partly determines interpretations of <code>typeUnioned</code>, as described in <code>Type::unioningType</code>.</p><br>| <p><code>Type</code> that partly determines interpretations of <code>typeUnioned</code>, as described in <code>Type::unioningType</code>.</p><br>|
| [kerml_vocab:unioningTypeUnioned](https://www.omg.org/spec/KerML/20230201/vocab#unioningTypeUnioned)| [1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p><code>Type</code> with interpretations partly determined by <code>unioningType</code>, as described in <code>Type::unioningType</code>.</p><br>| <p><code>Type</code> with interpretations partly determined by <code>unioningType</code>, as described in <code>Type::unioningType</code>.</p><br>|



### Comment

URI: https://www.omg.org/spec/KerML/20230201/shapes#Comment

type: Shape

target class: [kerml_vocab:Comment](https://www.omg.org/spec/KerML/20230201/vocab#Comment)

definition of vocabulary class : <p>A <code>Comment</code> is an <code>AnnotatingElement</code> whose <code>body</code> in some way describes its <code>annotatedElements</code>.</p><br>

description: <p>A <code>Comment</code> is an <code>AnnotatingElement</code> whose <code>body</code> in some way describes its <code>annotatedElements</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:commentLocale](https://www.omg.org/spec/KerML/20230201/vocab#commentLocale)| [0..1]| String| <p>Identification of the language of the <code>body</code> text and, optionally, the region and/or encoding. The format shall be a POSIX locale conformant to ISO/IEC 15897, with the format <code>[language[_territory][.codeset][@modifier]]</code>.</p>| <p>Identification of the language of the <code>body</code> text and, optionally, the region and/or encoding. The format shall be a POSIX locale conformant to ISO/IEC 15897, with the format <code>[language[_territory][.codeset][@modifier]]</code>.</p>|
| [kerml_vocab:commentBody](https://www.omg.org/spec/KerML/20230201/vocab#commentBody)| [1]| String| <p>The annotation text for the <code>Comment</code>.</p><br>| <p>The annotation text for the <code>Comment</code>.</p><br>|



### NullExpression

URI: https://www.omg.org/spec/KerML/20230201/shapes#NullExpression

type: Shape

target class: [kerml_vocab:NullExpression](https://www.omg.org/spec/KerML/20230201/vocab#NullExpression)

definition of vocabulary class : <p>A <code>NullExpression</code> is an <code>Expression</code> that results in a null value.</p><br><br>specializesFromLibrary('Performances::nullEvaluations')

description: <p>A <code>NullExpression</code> is an <code>Expression</code> that results in a null value.</p><br><br>specializesFromLibrary('Performances::nullEvaluations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### Element

URI: https://www.omg.org/spec/KerML/20230201/shapes#Element

type: Shape

target class: [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)

definition of vocabulary class : <p>An <code>Element</code> is a constituent of a model that is uniquely identified relative to all other <code>Elements</code>. It can have <code>Relationships</code> with other <code>Elements</code>. Some of these <code>Relationships</code> might imply ownership of other <code>Elements</code>, which means that if an <code>Element</code> is deleted from a model, then so are all the <code>Elements</code> that it owns.</p><br><br>ownedElement = ownedRelationship.ownedRelatedElement<br>owner = owningRelationship.owningRelatedElement<br>qualifiedName =<br>    if owningNamespace = null then null<br>    else if owningNamespace.owner = null then escapedName()<br>    else if owningNamespace.qualifiedName = null or <br>            escapedName() = null then null<br>    else owningNamespace.qualifiedName + '::' + escapedName()<br>    endif endif endif<br>documentation = ownedElement->selectByKind(Documentation)<br>ownedAnnotation = ownedRelationship-><br>    selectByKind(Annotation)-><br>    select(a | a.annotatedElement = self)<br>name = effectiveName()<br>ownedRelationship->exists(isImplied) implies isImpliedIncluded<br>isLibraryElement = libraryNamespace() <> null<br><br>shortName = effectiveShortName()<br>owningNamespace =<br>    if owningMembership = null then null<br>    else owningMembership.membershipOwningNamespace<br>    endif<br>textualRepresentation = ownedElement->selectByKind(TextualRepresentation)

description: <p>An <code>Element</code> is a constituent of a model that is uniquely identified relative to all other <code>Elements</code>. It can have <code>Relationships</code> with other <code>Elements</code>. Some of these <code>Relationships</code> might imply ownership of other <code>Elements</code>, which means that if an <code>Element</code> is deleted from a model, then so are all the <code>Elements</code> that it owns.</p><br><br>ownedElement = ownedRelationship.ownedRelatedElement<br>owner = owningRelationship.owningRelatedElement<br>qualifiedName =<br>    if owningNamespace = null then null<br>    else if owningNamespace.owner = null then escapedName()<br>    else if owningNamespace.qualifiedName = null or <br>            escapedName() = null then null<br>    else owningNamespace.qualifiedName + '::' + escapedName()<br>    endif endif endif<br>documentation = ownedElement->selectByKind(Documentation)<br>ownedAnnotation = ownedRelationship-><br>    selectByKind(Annotation)-><br>    select(a | a.annotatedElement = self)<br>name = effectiveName()<br>ownedRelationship->exists(isImplied) implies isImpliedIncluded<br>isLibraryElement = libraryNamespace() <> null<br><br>shortName = effectiveShortName()<br>owningNamespace =<br>    if owningMembership = null then null<br>    else owningMembership.membershipOwningNamespace<br>    endif<br>textualRepresentation = ownedElement->selectByKind(TextualRepresentation)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [dcterms:identifier](http://purl.org/dc/terms/identifier)| [1]| String| n/a| <p>The globally unique identifier for this Element. This is intended to be set by tooling, and it must not change during the lifetime of the Element.</p>|
| [kerml_vocab:elementAliasIds](https://www.omg.org/spec/KerML/20230201/vocab#elementAliasIds)| [0..*]| String| <p>Various alternative identifiers for this Element. Generally, these will be set by tools.</p>| <p>Various alternative identifiers for this Element. Generally, these will be set by tools.</p>|
| [kerml_vocab:elementDeclaredShortName](https://www.omg.org/spec/KerML/20230201/vocab#elementDeclaredShortName)| [0..1]| String| <p>An optional alternative name for the <code>Element</code> that is intended to be shorter or in some way more succinct than its primary <code>name</code>. It may act as a modeler-specified identifier for the <code>Element</code>, though it is then the responsibility of the modeler to maintain the uniqueness of this identifier within a model or relative to some other context.</p> <br>| <p>An optional alternative name for the <code>Element</code> that is intended to be shorter or in some way more succinct than its primary <code>name</code>. It may act as a modeler-specified identifier for the <code>Element</code>, though it is then the responsibility of the modeler to maintain the uniqueness of this identifier within a model or relative to some other context.</p> <br>|
| [kerml_vocab:elementDeclaredName](https://www.omg.org/spec/KerML/20230201/vocab#elementDeclaredName)| [0..1]| String| <p>The declared name of this <code>Element</code>.</p><br>| <p>The declared name of this <code>Element</code>.</p><br>|
| [kerml_vocab:elementShortName](https://www.omg.org/spec/KerML/20230201/vocab#elementShortName)| [0..1]| String| <p>The short name to be used for this <code>Element</code> during name resolution within its <code>owningNamespace</code>. This is derived using the <code>effectiveShortName()</code> operation. By default, it is the same as the <code>declaredShortName</code>, but this is overridden for certain kinds of <code>Elements</code> to compute a <code>shortName</code> even when the <code>declaredName</code> is null.</p>| <p>The short name to be used for this <code>Element</code> during name resolution within its <code>owningNamespace</code>. This is derived using the <code>effectiveShortName()</code> operation. By default, it is the same as the <code>declaredShortName</code>, but this is overridden for certain kinds of <code>Elements</code> to compute a <code>shortName</code> even when the <code>declaredName</code> is null.</p>|
| [dcterms:title](http://purl.org/dc/terms/title)| [0..1]| String| n/a| <p>The name to be used for this <code>Element</code> during name resolution within its <code>owningNamespace</code>. This is derived using the <code>effectiveName()</code> operation. By default, it is the same as the <code>declaredName</code>, but this is overridden for certain kinds of <code>Elements</code> to compute a <code>name</code> even when the <code>declaredName</code> is null.</p>|
| [kerml_vocab:elementQualifiedName](https://www.omg.org/spec/KerML/20230201/vocab#elementQualifiedName)| [0..1]| String| <p>The full ownership-qualified name of this <code>Element</code>, represented in a form that is valid according to the KerML textual concrete syntax for qualified names (including use of unrestricted name notation and escaped characters, as necessary). The <code>qualifiedName</code> is null if this <code>Element</code> has no <code>owningNamespace</code> or if there is not a complete ownership chain of named <code>Namespaces</code> from a root <code>Namespace</code> to this <code>Element</code>.</p>| <p>The full ownership-qualified name of this <code>Element</code>, represented in a form that is valid according to the KerML textual concrete syntax for qualified names (including use of unrestricted name notation and escaped characters, as necessary). The <code>qualifiedName</code> is null if this <code>Element</code> has no <code>owningNamespace</code> or if there is not a complete ownership chain of named <code>Namespaces</code> from a root <code>Namespace</code> to this <code>Element</code>.</p>|
| [kerml_vocab:elementIsImpliedIncluded](https://www.omg.org/spec/KerML/20230201/vocab#elementIsImpliedIncluded)| [1]| Boolean| <p>Whether all necessary implied Relationships have been included in the <code>ownedRelationships</code> of this Element. This property may be true, even if there are not actually any <code>ownedRelationships</code> with <code>isImplied = true</code>, meaning that no such Relationships are actually implied for this Element. However, if it is false, then <code>ownedRelationships</code> may <em>not</em> contain any implied Relationships. That is, either <em>all</em> required implied Relationships must be included, or none of them.</p>| <p>Whether all necessary implied Relationships have been included in the <code>ownedRelationships</code> of this Element. This property may be true, even if there are not actually any <code>ownedRelationships</code> with <code>isImplied = true</code>, meaning that no such Relationships are actually implied for this Element. However, if it is false, then <code>ownedRelationships</code> may <em>not</em> contain any implied Relationships. That is, either <em>all</em> required implied Relationships must be included, or none of them.</p>|
| [kerml_vocab:elementIsLibraryElement](https://www.omg.org/spec/KerML/20230201/vocab#elementIsLibraryElement)| [1]| Boolean| <p>Whether this Element is contained in the ownership tree of a library model.</p>| <p>Whether this Element is contained in the ownership tree of a library model.</p>|
| [kerml_vocab:elementOwningMembership](https://www.omg.org/spec/KerML/20230201/vocab#elementOwningMembership)| [0..1]| [kerml_vocab:OwningMembership](https://www.omg.org/spec/KerML/20230201/vocab#OwningMembership)| <p>The <code>owningRelationship</code> of this <code>Element</code>, if that <code>Relationship</code> is a <code>Membership</code>.</p><br>| <p>The <code>owningRelationship</code> of this <code>Element</code>, if that <code>Relationship</code> is a <code>Membership</code>.</p><br>|
| [kerml_vocab:elementOwningNamespace](https://www.omg.org/spec/KerML/20230201/vocab#elementOwningNamespace)| [0..1]| [kerml_vocab:Namespace](https://www.omg.org/spec/KerML/20230201/vocab#Namespace)| <p>The <code>Namespace</code> that owns this <code>Element</code>, which is the <code>membershipOwningNamespace</code> of the <code>owningMembership</code> of this <code>Element</code>, if any.</p><br>| <p>The <code>Namespace</code> that owns this <code>Element</code>, which is the <code>membershipOwningNamespace</code> of the <code>owningMembership</code> of this <code>Element</code>, if any.</p><br>|
| [kerml_vocab:elementOwningRelationship](https://www.omg.org/spec/KerML/20230201/vocab#elementOwningRelationship)| [0..1]| [kerml_vocab:Relationship](https://www.omg.org/spec/KerML/20230201/vocab#Relationship)| <p>The Relationship for which this Element is an <tt>ownedRelatedElement</tt>, if any.</p><br>| <p>The Relationship for which this Element is an <tt>ownedRelatedElement</tt>, if any.</p><br>|
| [kerml_vocab:elementOwnedRelationship](https://www.omg.org/spec/KerML/20230201/vocab#elementOwnedRelationship)| [0..*]| [kerml_vocab:Relationship](https://www.omg.org/spec/KerML/20230201/vocab#Relationship)| <p>The Relationships for which this Element is the <tt>owningRelatedElement</tt>.</p>| <p>The Relationships for which this Element is the <tt>owningRelatedElement</tt>.</p>|
| [kerml_vocab:elementOwner](https://www.omg.org/spec/KerML/20230201/vocab#elementOwner)| [0..1]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The owner of this Element, derived as the <code>owningRelatedElement</code> of the <code>owningRelationship</code> of this Element, if any.</p>| <p>The owner of this Element, derived as the <code>owningRelatedElement</code> of the <code>owningRelationship</code> of this Element, if any.</p>|
| [kerml_vocab:elementOwnedElement](https://www.omg.org/spec/KerML/20230201/vocab#elementOwnedElement)| [0..*]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The Elements owned by this Element, derived as the <tt>ownedRelatedElements</tt> of the <tt>ownedRelationships</tt> of this Element.</p><br>| <p>The Elements owned by this Element, derived as the <tt>ownedRelatedElements</tt> of the <tt>ownedRelationships</tt> of this Element.</p><br>|
| [kerml_vocab:elementDocumentation](https://www.omg.org/spec/KerML/20230201/vocab#elementDocumentation)| [0..*]| [kerml_vocab:Documentation](https://www.omg.org/spec/KerML/20230201/vocab#Documentation)| <p>The Documentation owned by this Element.</p>| <p>The Documentation owned by this Element.</p>|
| [kerml_vocab:elementOwnedAnnotation](https://www.omg.org/spec/KerML/20230201/vocab#elementOwnedAnnotation)| [0..*]| [kerml_vocab:Annotation](https://www.omg.org/spec/KerML/20230201/vocab#Annotation)| <p>The <code>ownedRelationships</code> of this <code>Element</code> that are <code>Annotations</code>, for which this <code>Element</code> is the <code>annotatedElement</code>.</code>| <p>The <code>ownedRelationships</code> of this <code>Element</code> that are <code>Annotations</code>, for which this <code>Element</code> is the <code>annotatedElement</code>.</code>|
| [kerml_vocab:elementTextualRepresentation](https://www.omg.org/spec/KerML/20230201/vocab#elementTextualRepresentation)| [0..*]| [kerml_vocab:TextualRepresentation](https://www.omg.org/spec/KerML/20230201/vocab#TextualRepresentation)| <p>The <code>TextualRepresentations</code> that annotate this <code>Element</code>.</p>| <p>The <code>TextualRepresentations</code> that annotate this <code>Element</code>.</p>|



### Subclassification

URI: https://www.omg.org/spec/KerML/20230201/shapes#Subclassification

type: Shape

target class: [kerml_vocab:Subclassification](https://www.omg.org/spec/KerML/20230201/vocab#Subclassification)

definition of vocabulary class : <p><code>Subclassification</code> is <code>Specialization</code> in which both the <code>specific</code> and <code>general</code> <code>Types</code> are <code>Classifier</code>. This means all instances of the specific <code>Classifier</code> are also instances of the general <code>Classifier</code>.</p><br>

description: <p><code>Subclassification</code> is <code>Specialization</code> in which both the <code>specific</code> and <code>general</code> <code>Types</code> are <code>Classifier</code>. This means all instances of the specific <code>Classifier</code> are also instances of the general <code>Classifier</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:subclassificationSuperclassifier](https://www.omg.org/spec/KerML/20230201/vocab#subclassificationSuperclassifier)| [1]| [kerml_vocab:Classifier](https://www.omg.org/spec/KerML/20230201/vocab#Classifier)| <p>The more <code>general</code> Classifier in this <code>Subclassification</code>.</p><br>| <p>The more <code>general</code> Classifier in this <code>Subclassification</code>.</p><br>|
| [kerml_vocab:subclassificationSubclassifier](https://www.omg.org/spec/KerML/20230201/vocab#subclassificationSubclassifier)| [1]| [kerml_vocab:Classifier](https://www.omg.org/spec/KerML/20230201/vocab#Classifier)| <p>The more specific <code>Classifier</code> in this <code>Subclassification</code>.</p><br>| <p>The more specific <code>Classifier</code> in this <code>Subclassification</code>.</p><br>|
| [kerml_vocab:subclassificationOwningClassifier](https://www.omg.org/spec/KerML/20230201/vocab#subclassificationOwningClassifier)| [0..1]| [kerml_vocab:Classifier](https://www.omg.org/spec/KerML/20230201/vocab#Classifier)| <p>The <code>Classifier</code> that owns this <code>Subclassification</code> relationship, which must also be its <code>subclassifier</code>.</p><br>| <p>The <code>Classifier</code> that owns this <code>Subclassification</code> relationship, which must also be its <code>subclassifier</code>.</p><br>|



### Behavior

URI: https://www.omg.org/spec/KerML/20230201/shapes#Behavior

type: Shape

target class: [kerml_vocab:Behavior](https://www.omg.org/spec/KerML/20230201/vocab#Behavior)

definition of vocabulary class : <p>A <code>Behavior </code>coordinates occurrences of other <code>Behaviors</code>, as well as changes in objects. <code>Behaviors</code> can be decomposed into <code>Steps</code> and be characterized by <code>parameters</code>.</p><br><br>specializesFromLibrary('Performances::Performance')<br>step = feature->selectByKind(Step)<br>ownedSpecialization.general->forAll(not oclIsKindOf(Structure))

description: <p>A <code>Behavior </code>coordinates occurrences of other <code>Behaviors</code>, as well as changes in objects. <code>Behaviors</code> can be decomposed into <code>Steps</code> and be characterized by <code>parameters</code>.</p><br><br>specializesFromLibrary('Performances::Performance')<br>step = feature->selectByKind(Step)<br>ownedSpecialization.general->forAll(not oclIsKindOf(Structure))

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:behaviorStep](https://www.omg.org/spec/KerML/20230201/vocab#behaviorStep)| [0..*]| [kerml_vocab:Step](https://www.omg.org/spec/KerML/20230201/vocab#Step)| <p>The <code>Steps</code> that make up this <code>Behavior</code>.</p><br>| <p>The <code>Steps</code> that make up this <code>Behavior</code>.</p><br>|
| [kerml_vocab:behaviorParameter](https://www.omg.org/spec/KerML/20230201/vocab#behaviorParameter)| [0..*]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The parameters of this <code>Behavior</code>, which are defined as its <code>directedFeatures</code>, whose values are passed into and/or out of a performance of the <code>Behavior</code>.</p><br>| <p>The parameters of this <code>Behavior</code>, which are defined as its <code>directedFeatures</code>, whose values are passed into and/or out of a performance of the <code>Behavior</code>.</p><br>|



### Interaction

URI: https://www.omg.org/spec/KerML/20230201/shapes#Interaction

type: Shape

target class: [kerml_vocab:Interaction](https://www.omg.org/spec/KerML/20230201/vocab#Interaction)

definition of vocabulary class : <p>An <code>Interaction</code> is a <code>Behavior</code> that is also an <code>Association</code>, providing a context for multiple objects that have behaviors that impact one another.</p><br>

description: <p>An <code>Interaction</code> is a <code>Behavior</code> that is also an <code>Association</code>, providing a context for multiple objects that have behaviors that impact one another.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### AnnotatingElement

URI: https://www.omg.org/spec/KerML/20230201/shapes#AnnotatingElement

type: Shape

target class: [kerml_vocab:AnnotatingElement](https://www.omg.org/spec/KerML/20230201/vocab#AnnotatingElement)

definition of vocabulary class : <p>An <code>AnnotatingElement</code> is an <code>Element</code> that provides additional description of or metadata on some other <code>Element</code>. An <code>AnnotatingElement</code> is either attached to its <code>annotatedElements</code> by <code>Annotation</code> <code>Relationships</code>, or it implicitly annotates its <code>owningNamespace</code>.</p><br><br>annotatedElement = <br> if annotation->notEmpty() then annotation.annotatedElement<br> else Sequence{owningNamespace} endif<br>ownedAnnotatingRelationship = ownedRelationship-><br>    selectByKind(Annotation)-><br>    select(a | a.annotatingElement = self)

description: <p>An <code>AnnotatingElement</code> is an <code>Element</code> that provides additional description of or metadata on some other <code>Element</code>. An <code>AnnotatingElement</code> is either attached to its <code>annotatedElements</code> by <code>Annotation</code> <code>Relationships</code>, or it implicitly annotates its <code>owningNamespace</code>.</p><br><br>annotatedElement = <br> if annotation->notEmpty() then annotation.annotatedElement<br> else Sequence{owningNamespace} endif<br>ownedAnnotatingRelationship = ownedRelationship-><br>    selectByKind(Annotation)-><br>    select(a | a.annotatingElement = self)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:annotatingElementAnnotatedElement](https://www.omg.org/spec/KerML/20230201/vocab#annotatingElementAnnotatedElement)| [1..*]| [kerml_vocab:Element](https://www.omg.org/spec/KerML/20230201/vocab#Element)| <p>The <code>Elements</code> that are annotated by this <code>AnnotatingElement</code>. If <code>annotation</code> is not empty, these are the <code>annotatedElements</code> of the <code>annotations</code>. If <code>annotation</code> is empty, then it is the <code>owningNamespace</code> of the <code>AnnotatingElement</code>.</p><br>| <p>The <code>Elements</code> that are annotated by this <code>AnnotatingElement</code>. If <code>annotation</code> is not empty, these are the <code>annotatedElements</code> of the <code>annotations</code>. If <code>annotation</code> is empty, then it is the <code>owningNamespace</code> of the <code>AnnotatingElement</code>.</p><br>|
| [kerml_vocab:annotatingElementOwnedAnnotatingRelationship](https://www.omg.org/spec/KerML/20230201/vocab#annotatingElementOwnedAnnotatingRelationship)| [0..*]| [kerml_vocab:Annotation](https://www.omg.org/spec/KerML/20230201/vocab#Annotation)| <p>The <code>ownedRelationships</code> of this <code>AnnotatingElement</code> that are <code>Annotations</code>, for which this <code>AnnotatingElement</code> is the <code>annotatingElement</code>.</p>| <p>The <code>ownedRelationships</code> of this <code>AnnotatingElement</code> that are <code>Annotations</code>, for which this <code>AnnotatingElement</code> is the <code>annotatingElement</code>.</p>|
| [kerml_vocab:annotatingElementAnnotation](https://www.omg.org/spec/KerML/20230201/vocab#annotatingElementAnnotation)| [0..*]| [kerml_vocab:Annotation](https://www.omg.org/spec/KerML/20230201/vocab#Annotation)| <p>The <code>Annotations</code> that relate this <code>AnnotatingElement</code> to its <code>annotatedElements</code>.</p><br>| <p>The <code>Annotations</code> that relate this <code>AnnotatingElement</code> to its <code>annotatedElements</code>.</p><br>|



### FeatureTyping

URI: https://www.omg.org/spec/KerML/20230201/shapes#FeatureTyping

type: Shape

target class: [kerml_vocab:FeatureTyping](https://www.omg.org/spec/KerML/20230201/vocab#FeatureTyping)

definition of vocabulary class : <p><code>FeatureTyping</code> is <code>Specialization</code> in which the <code>specific</code> <code>Type</code> is a <code>Feature</code>. This means the set of instances of the (specific) <code>typedFeature</code> is a subset of the set of instances of the (general) <code>type</code>. In the simplest case, the <code>type</code> is a <code>Classifier</code>, whereupon the <code>typedFeature</code> has values that are instances of the <code>Classifier</code>.</p><br>

description: <p><code>FeatureTyping</code> is <code>Specialization</code> in which the <code>specific</code> <code>Type</code> is a <code>Feature</code>. This means the set of instances of the (specific) <code>typedFeature</code> is a subset of the set of instances of the (general) <code>type</code>. In the simplest case, the <code>type</code> is a <code>Classifier</code>, whereupon the <code>typedFeature</code> has values that are instances of the <code>Classifier</code>.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:featureTypingOwningFeature](https://www.omg.org/spec/KerML/20230201/vocab#featureTypingOwningFeature)| [0..1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>A <code>typedFeature</code> that is also the <code>owningRelatedElement</code> of this <code>FeatureTyping</code>.</p>| <p>A <code>typedFeature</code> that is also the <code>owningRelatedElement</code> of this <code>FeatureTyping</code>.</p>|
| [kerml_vocab:featureTypingTypedFeature](https://www.omg.org/spec/KerML/20230201/vocab#featureTypingTypedFeature)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> that has a <code>type</code> determined by this <code>FeatureTyping</code>.</p>| <p>The <code>Feature</code> that has a <code>type</code> determined by this <code>FeatureTyping</code>.</p>|
| [kerml_vocab:featureTypingType](https://www.omg.org/spec/KerML/20230201/vocab#featureTypingType)| [1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>The <code>Type</code> that is being applied by this <code>FeatureTyping</code>.</p><br>| <p>The <code>Type</code> that is being applied by this <code>FeatureTyping</code>.</p><br>|



### FeatureInverting

URI: https://www.omg.org/spec/KerML/20230201/shapes#FeatureInverting

type: Shape

target class: [kerml_vocab:FeatureInverting](https://www.omg.org/spec/KerML/20230201/vocab#FeatureInverting)

definition of vocabulary class : <p>A <code>FeatureInverting</code> is a <code>Relationship</code> between <code>Features</code> asserting that their interpretations (sequences) are the reverse of each other, identified as <code>featureInverted</code> and <code>invertingFeature</code>. For example, a <code>Feature</code> identifying each person&#39;s parents is the inverse of a <code>Feature</code> identifying each person&#39;s children. A person identified as a parent of another will identify that other as one of their children.</p><br>

description: <p>A <code>FeatureInverting</code> is a <code>Relationship</code> between <code>Features</code> asserting that their interpretations (sequences) are the reverse of each other, identified as <code>featureInverted</code> and <code>invertingFeature</code>. For example, a <code>Feature</code> identifying each person&#39;s parents is the inverse of a <code>Feature</code> identifying each person&#39;s children. A person identified as a parent of another will identify that other as one of their children.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:featureInvertingFeatureInverted](https://www.omg.org/spec/KerML/20230201/vocab#featureInvertingFeatureInverted)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is an inverse of the <code>invertingFeature</code>.</p>| <p>The <code>Feature</code> that is an inverse of the <code>invertingFeature</code>.</p>|
| [kerml_vocab:featureInvertingInvertingFeature](https://www.omg.org/spec/KerML/20230201/vocab#featureInvertingInvertingFeature)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is an inverse of the <code>invertedFeature</code>.</p>| <p>The <code>Feature</code> that is an inverse of the <code>invertedFeature</code>.</p>|
| [kerml_vocab:featureInvertingOwningFeature](https://www.omg.org/spec/KerML/20230201/vocab#featureInvertingOwningFeature)| [0..1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>A <code>featureInverted</code> that is also the <code>owningRelatedElement</code> of this <code>FeatureInverting</code>.</p><br>| <p>A <code>featureInverted</code> that is also the <code>owningRelatedElement</code> of this <code>FeatureInverting</code>.</p><br>|



### EndFeatureMembership

URI: https://www.omg.org/spec/KerML/20230201/shapes#EndFeatureMembership

type: Shape

target class: [kerml_vocab:EndFeatureMembership](https://www.omg.org/spec/KerML/20230201/vocab#EndFeatureMembership)

definition of vocabulary class : <p><code>EndFeatureMembership</code> is a <code>FeatureMembership</code> that requires its <code>memberFeature</code> be owned and have <code>isEnd = true</code>.</p><br><br>ownedMemberFeature.isEnd

description: <p><code>EndFeatureMembership</code> is a <code>FeatureMembership</code> that requires its <code>memberFeature</code> be owned and have <code>isEnd = true</code>.</p><br><br>ownedMemberFeature.isEnd

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### LiteralString

URI: https://www.omg.org/spec/KerML/20230201/shapes#LiteralString

type: Shape

target class: [kerml_vocab:LiteralString](https://www.omg.org/spec/KerML/20230201/vocab#LiteralString)

definition of vocabulary class : <p>A <code>LiteralString</code> is a <code>LiteralExpression</code> that provides a <code><em>String</em></code> value as a result. Its <code>result</code> <code>parameter</code> must have the type <code><em>String</em></code>.</p><br><br>specializesFromLibrary('Performances::literalStringEvaluations')

description: <p>A <code>LiteralString</code> is a <code>LiteralExpression</code> that provides a <code><em>String</em></code> value as a result. Its <code>result</code> <code>parameter</code> must have the type <code><em>String</em></code>.</p><br><br>specializesFromLibrary('Performances::literalStringEvaluations')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:literalStringValue](https://www.omg.org/spec/KerML/20230201/vocab#literalStringValue)| [1]| String| <p>The <code><em>String</em></code> value that is the result of evaluating this <code>LiteralString</code>.</p><br><br><p>The String value that is the result of evaluating this Expression.</p>| <p>The <code><em>String</em></code> value that is the result of evaluating this <code>LiteralString</code>.</p><br><br><p>The String value that is the result of evaluating this Expression.</p>|



### FeatureReferenceExpression

URI: https://www.omg.org/spec/KerML/20230201/shapes#FeatureReferenceExpression

type: Shape

target class: [kerml_vocab:FeatureReferenceExpression](https://www.omg.org/spec/KerML/20230201/vocab#FeatureReferenceExpression)

definition of vocabulary class : <p>A <code>FeatureReferenceExpression</code> is an <code>Expression</code> whose <code>result</code> is bound to a <code>referent</code> <code>Feature</code>.</p><br>referent =<br>    let nonParameterMemberships : Sequence(Membership) = ownedMembership-><br>        reject(oclIsKindOf(ParameterMembership)) in<br>    if nonParameterMemberships->isEmpty() or<br>       not nonParameterMemberships->first().memberElement.oclIsKindOf(Feature)<br>    then null<br>    else nonParameterMemberships->first().memberElement.oclAsType(Feature)<br>    endif<br>ownedMember->selectByKind(BindingConnector)->exists(b |<br>    b.relatedFeatures->includes(targetFeature) and<br>    b.relatedFeatures->includes(result))<br>let membership : Membership = <br>    ownedMembership->reject(m | m.oclIsKindOf(ParameterMembership)) in<br>membership->notEmpty() and<br>membership->at(1).memberElement.oclIsKindOf(Feature)

description: <p>A <code>FeatureReferenceExpression</code> is an <code>Expression</code> whose <code>result</code> is bound to a <code>referent</code> <code>Feature</code>.</p><br>referent =<br>    let nonParameterMemberships : Sequence(Membership) = ownedMembership-><br>        reject(oclIsKindOf(ParameterMembership)) in<br>    if nonParameterMemberships->isEmpty() or<br>       not nonParameterMemberships->first().memberElement.oclIsKindOf(Feature)<br>    then null<br>    else nonParameterMemberships->first().memberElement.oclAsType(Feature)<br>    endif<br>ownedMember->selectByKind(BindingConnector)->exists(b |<br>    b.relatedFeatures->includes(targetFeature) and<br>    b.relatedFeatures->includes(result))<br>let membership : Membership = <br>    ownedMembership->reject(m | m.oclIsKindOf(ParameterMembership)) in<br>membership->notEmpty() and<br>membership->at(1).memberElement.oclIsKindOf(Feature)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:featureReferenceExpressionReferent](https://www.omg.org/spec/KerML/20230201/vocab#featureReferenceExpressionReferent)| [1]| [kerml_vocab:Feature](https://www.omg.org/spec/KerML/20230201/vocab#Feature)| <p>The <code>Feature</code> that is referenced by this <code>FeatureReferenceExpression</code>, which is its first non-<code>parameter</code> <code>member</code>.<p>| <p>The <code>Feature</code> that is referenced by this <code>FeatureReferenceExpression</code>, which is its first non-<code>parameter</code> <code>member</code>.<p>|



### ReturnParameterMembership

URI: https://www.omg.org/spec/KerML/20230201/shapes#ReturnParameterMembership

type: Shape

target class: [kerml_vocab:ReturnParameterMembership](https://www.omg.org/spec/KerML/20230201/vocab#ReturnParameterMembership)

definition of vocabulary class : <p>A <code>ReturnParameterMembership</code> is a <code>ParameterMembership</code> that indicates that the <code>ownedMemberParameter</code> is the <code>result</code> <code>parameter</code> of a <code>Function</code> or <code>Expression</code>. The <code>direction</code> of the <code>ownedMemberParameter</code> must be <code>out</code>.</p><br><br>owningType.oclIsKindOf(Function) or owningType.oclIsKindOf(Expression)

description: <p>A <code>ReturnParameterMembership</code> is a <code>ParameterMembership</code> that indicates that the <code>ownedMemberParameter</code> is the <code>result</code> <code>parameter</code> of a <code>Function</code> or <code>Expression</code>. The <code>direction</code> of the <code>ownedMemberParameter</code> must be <code>out</code>.</p><br><br>owningType.oclIsKindOf(Function) or owningType.oclIsKindOf(Expression)

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### MetadataFeature

URI: https://www.omg.org/spec/KerML/20230201/shapes#MetadataFeature

type: Shape

target class: [kerml_vocab:MetadataFeature](https://www.omg.org/spec/KerML/20230201/vocab#MetadataFeature)

definition of vocabulary class : <p>A <code>MetadataFeature</code> is a <code>Feature</code> that is an <code>AnnotatingElement</code> used to annotate another <code>Element</code> with metadata. It is typed by a <code>Metaclass</code>. All its <code>ownedFeatures</code> must redefine <code>features</code> of its <code>metaclass</code> and any feature bindings must be model-level evaluable.</p><br><br><br>specializesFromLibrary('Metaobjects::metaobjects')<br>isSemantic() implies<br>    let annotatedTypes : Sequence(Type) = <br>        annotatedElement->selectAsKind(Type) in<br>    let baseTypes : Sequence(MetadataFeature) = <br>        evaluateFeature(resolveGlobal(<br>            'Metaobjects::SemanticMetadata::baseType').<br>            memberElement.<br>            oclAsType(Feature))-><br>        selectAsKind(MetadataFeature) in<br>    annotatedTypes->notEmpty() and <br>    baseTypes()->notEmpty() and <br>    baseTypes()->first().isSyntactic() implies<br>        let annotatedType : Type = annotatedTypes->first() in<br>        let baseType : Element = baseTypes->first().syntaxElement() in<br>        if annotatedType.oclIsKindOf(Classifier) and <br>            baseType.oclIsKindOf(Feature) then<br>            baseType.oclAsType(Feature).type-><br>                forAll(t | annotatedType.specializes(t))<br>        else if baseType.oclIsKindOf(Type) then<br>            annotatedType.specializes(baseType.oclAsType(Type))<br>        else<br>            true<br>        endif<br>not metaclass.isAbstract<br>let baseAnnotatedElementFeature : Feature =<br>    resolveGlobal('Metaobjects::Metaobject::annotatedElement').memberElement.<br>    oclAsType(Feature) in<br>let annotatedElementFeatures : OrderedSet(Feature) = feature-><br>    select(specializes(baseAnnotatedElementFeature))-><br>    excluding(baseAnnotatedElementFeature) in<br>annotatedElementFeatures->notEmpty() implies<br>    let annotatedElementTypes : Set(Feature) =<br>        annotatedElementFeatures.typing.type->asSet() in<br>    let metaclasses : Set(Metaclass) =<br>        annotatedElement.oclType().qualifiedName->collect(qn | <br>            resolveGlobal(qn).memberElement.oclAsType(Metaclass)) in<br>   metaclasses->forAll(m | annotatedElementTypes->exists(t | m.specializes(t)))<br>ownedFeature->closure(ownedFeature)->forAll(f |<br>    f.declaredName = null and f.declaredShortName = null and<br>    f.valuation <> null implies f.valuation.value.isModelLevelEvaluable and<br>    f.redefinition.redefinedFeature->size() = 1)<br>metaclass = <br>    let metaclassTypes : Sequence(Type) = type->selectByKind(Metaclass) in<br>    if metaclassTypes->isEmpty() then null<br>    else metaClassTypes->first()<br>    endif<br>type->selectByKind(Metaclass).size() = 1

description: <p>A <code>MetadataFeature</code> is a <code>Feature</code> that is an <code>AnnotatingElement</code> used to annotate another <code>Element</code> with metadata. It is typed by a <code>Metaclass</code>. All its <code>ownedFeatures</code> must redefine <code>features</code> of its <code>metaclass</code> and any feature bindings must be model-level evaluable.</p><br><br><br>specializesFromLibrary('Metaobjects::metaobjects')<br>isSemantic() implies<br>    let annotatedTypes : Sequence(Type) = <br>        annotatedElement->selectAsKind(Type) in<br>    let baseTypes : Sequence(MetadataFeature) = <br>        evaluateFeature(resolveGlobal(<br>            'Metaobjects::SemanticMetadata::baseType').<br>            memberElement.<br>            oclAsType(Feature))-><br>        selectAsKind(MetadataFeature) in<br>    annotatedTypes->notEmpty() and <br>    baseTypes()->notEmpty() and <br>    baseTypes()->first().isSyntactic() implies<br>        let annotatedType : Type = annotatedTypes->first() in<br>        let baseType : Element = baseTypes->first().syntaxElement() in<br>        if annotatedType.oclIsKindOf(Classifier) and <br>            baseType.oclIsKindOf(Feature) then<br>            baseType.oclAsType(Feature).type-><br>                forAll(t | annotatedType.specializes(t))<br>        else if baseType.oclIsKindOf(Type) then<br>            annotatedType.specializes(baseType.oclAsType(Type))<br>        else<br>            true<br>        endif<br>not metaclass.isAbstract<br>let baseAnnotatedElementFeature : Feature =<br>    resolveGlobal('Metaobjects::Metaobject::annotatedElement').memberElement.<br>    oclAsType(Feature) in<br>let annotatedElementFeatures : OrderedSet(Feature) = feature-><br>    select(specializes(baseAnnotatedElementFeature))-><br>    excluding(baseAnnotatedElementFeature) in<br>annotatedElementFeatures->notEmpty() implies<br>    let annotatedElementTypes : Set(Feature) =<br>        annotatedElementFeatures.typing.type->asSet() in<br>    let metaclasses : Set(Metaclass) =<br>        annotatedElement.oclType().qualifiedName->collect(qn | <br>            resolveGlobal(qn).memberElement.oclAsType(Metaclass)) in<br>   metaclasses->forAll(m | annotatedElementTypes->exists(t | m.specializes(t)))<br>ownedFeature->closure(ownedFeature)->forAll(f |<br>    f.declaredName = null and f.declaredShortName = null and<br>    f.valuation <> null implies f.valuation.value.isModelLevelEvaluable and<br>    f.redefinition.redefinedFeature->size() = 1)<br>metaclass = <br>    let metaclassTypes : Sequence(Type) = type->selectByKind(Metaclass) in<br>    if metaclassTypes->isEmpty() then null<br>    else metaClassTypes->first()<br>    endif<br>type->selectByKind(Metaclass).size() = 1

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:metadataFeatureMetaclass](https://www.omg.org/spec/KerML/20230201/vocab#metadataFeatureMetaclass)| [0..1]| [kerml_vocab:Metaclass](https://www.omg.org/spec/KerML/20230201/vocab#Metaclass)| <p>The <code>type</code> of this <code>MetadataFeature</code>, which must be a <code>Metaclass</code>.</p>| <p>The <code>type</code> of this <code>MetadataFeature</code>, which must be a <code>Metaclass</code>.</p>|



### Package

URI: https://www.omg.org/spec/KerML/20230201/shapes#Package

type: Shape

target class: [kerml_vocab:Package](https://www.omg.org/spec/KerML/20230201/vocab#Package)

definition of vocabulary class : <p>A <code>Package</code> is a <code>Namespace</code> used to group <code>Elements</code>, without any instance-level semantics. It may have one or more model-level evaluable <code>filterCondition</code> <code>Expressions</code> used to filter its <code>importedMemberships</code>. Any imported <code>member</code> must meet all of the <code>filterConditions</code>.</p><br>filterCondition = ownedMembership-><br>    selectByKind(ElementFilterMembership).condition

description: <p>A <code>Package</code> is a <code>Namespace</code> used to group <code>Elements</code>, without any instance-level semantics. It may have one or more model-level evaluable <code>filterCondition</code> <code>Expressions</code> used to filter its <code>importedMemberships</code>. Any imported <code>member</code> must meet all of the <code>filterConditions</code>.</p><br>filterCondition = ownedMembership-><br>    selectByKind(ElementFilterMembership).condition

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:packageFilterCondition](https://www.omg.org/spec/KerML/20230201/vocab#packageFilterCondition)| [0..*]| [kerml_vocab:Expression](https://www.omg.org/spec/KerML/20230201/vocab#Expression)| <p>The model-level evaluable <code><em>Boolean</em></code>-valued <code>Expression</code> used to filter the <code>members</code> of this <code>Package</code>, which are owned by the <code>Package</code> are via <code>ElementFilterMemberships</code>.</p><br>| <p>The model-level evaluable <code><em>Boolean</em></code>-valued <code>Expression</code> used to filter the <code>members</code> of this <code>Package</code>, which are owned by the <code>Package</code> are via <code>ElementFilterMemberships</code>.</p><br>|



### Conjugation

URI: https://www.omg.org/spec/KerML/20230201/shapes#Conjugation

type: Shape

target class: [kerml_vocab:Conjugation](https://www.omg.org/spec/KerML/20230201/vocab#Conjugation)

definition of vocabulary class : <p><code>Conjugation</code> is a <code>Relationship</code> between two types in which the <code>conjugatedType</code> inherits all the <code>Features</code> of the <code>originalType</code>, but with all <code>input</code> and <code>output</code> <code>Features</code> reversed. That is, any <code>Features</code> with a <code>direction</code> <em>in</em> relative to the <code>originalType</code> are considered to have an effective <code>direction</code> of <em>out</em> relative to the <code>conjugatedType</code> and, similarly, <code>Features</code> with <code>direction</code> <em>out</em> in the <code>originalType</code> are considered to have an effective <code>direction</code> of <em>in</em> in the <code>conjugatedType</code>. <code>Features</code> with <code>direction</code> <em>inout</em>, or with no <code>direction</code>, in the <code>originalType</code>, are inherited without change.</p><br><br><p>A <code>Type</code> may participate as a <code>conjugatedType</code> in at most one <code>Conjugation</code> relationship, and such a <code>Type</code> may not also be the <code>specific</code> <code>Type</code> in any <code>Specialization</code> relationship.</p><br>

description: <p><code>Conjugation</code> is a <code>Relationship</code> between two types in which the <code>conjugatedType</code> inherits all the <code>Features</code> of the <code>originalType</code>, but with all <code>input</code> and <code>output</code> <code>Features</code> reversed. That is, any <code>Features</code> with a <code>direction</code> <em>in</em> relative to the <code>originalType</code> are considered to have an effective <code>direction</code> of <em>out</em> relative to the <code>conjugatedType</code> and, similarly, <code>Features</code> with <code>direction</code> <em>out</em> in the <code>originalType</code> are considered to have an effective <code>direction</code> of <em>in</em> in the <code>conjugatedType</code>. <code>Features</code> with <code>direction</code> <em>inout</em>, or with no <code>direction</code>, in the <code>originalType</code>, are inherited without change.</p><br><br><p>A <code>Type</code> may participate as a <code>conjugatedType</code> in at most one <code>Conjugation</code> relationship, and such a <code>Type</code> may not also be the <code>specific</code> <code>Type</code> in any <code>Specialization</code> relationship.</p><br>

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:conjugationOriginalType](https://www.omg.org/spec/KerML/20230201/vocab#conjugationOriginalType)| [1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>The <code>Type</code> to be conjugated.</p><br>| <p>The <code>Type</code> to be conjugated.</p><br>|
| [kerml_vocab:conjugationConjugatedType](https://www.omg.org/spec/KerML/20230201/vocab#conjugationConjugatedType)| [1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>The <code>Type</code> that is the result of applying <code>Conjugation</code> to the <code>originalType</code>.</p><br>| <p>The <code>Type</code> that is the result of applying <code>Conjugation</code> to the <code>originalType</code>.</p><br>|
| [kerml_vocab:conjugationOwningType](https://www.omg.org/spec/KerML/20230201/vocab#conjugationOwningType)| [0..1]| [kerml_vocab:Type](https://www.omg.org/spec/KerML/20230201/vocab#Type)| <p>The <code>conjugatedType</code> of this <code>Conjugation</code> that is also its <code>owningRelatedElement</code>.</p><br>| <p>The <code>conjugatedType</code> of this <code>Conjugation</code> that is also its <code>owningRelatedElement</code>.</p><br>|



### AssociationStructure

URI: https://www.omg.org/spec/KerML/20230201/shapes#AssociationStructure

type: Shape

target class: [kerml_vocab:AssociationStructure](https://www.omg.org/spec/KerML/20230201/vocab#AssociationStructure)

definition of vocabulary class : <p>An <code>AssociationStructure</code> is an <code>Association</code> that is also a <code>Structure</code>, classifying link objects that are both links and objects. As objects, link objects can be created and destroyed, and their non-end <code>Features</code> can change over time. However, the values of the end <code>Features</code> of a link object are fixed and cannot change over its lifetime.</p><br>specializesFromLibrary('Objects::LinkObject')<br>endFeature->size() = 2 implies<br>    specializesFromLibrary('Objects::BinaryLinkObject')

description: <p>An <code>AssociationStructure</code> is an <code>Association</code> that is also a <code>Structure</code>, classifying link objects that are both links and objects. As objects, link objects can be created and destroyed, and their non-end <code>Features</code> can change over time. However, the values of the end <code>Features</code> of a link object are fixed and cannot change over its lifetime.</p><br>specializesFromLibrary('Objects::LinkObject')<br>endFeature->size() = 2 implies<br>    specializesFromLibrary('Objects::BinaryLinkObject')

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|



### MembershipImport

URI: https://www.omg.org/spec/KerML/20230201/shapes#MembershipImport

type: Shape

target class: [kerml_vocab:MembershipImport](https://www.omg.org/spec/KerML/20230201/vocab#MembershipImport)

definition of vocabulary class : <p>A <code>MembershipImport</code> is an <code>Import</code> that imports its <code>importedMembership</code> into the <code>importOwningNamespace</code>. If <code>isRecursive = true</code> and the <code>memberElement</code> of the <code>importedMembership</code> is a <code>Namespace</code>, then the equivalent of a recursive <code>NamespaceImport</code> is also performed on that <code>Namespace</code>.</p><br><br>importedElement = importedMembership.memberElement

description: <p>A <code>MembershipImport</code> is an <code>Import</code> that imports its <code>importedMembership</code> into the <code>importOwningNamespace</code>. If <code>isRecursive = true</code> and the <code>memberElement</code> of the <code>importedMembership</code> is a <code>Namespace</code>, then the equivalent of a recursive <code>NamespaceImport</code> is also performed on that <code>Namespace</code>.</p><br><br>importedElement = importedMembership.memberElement

| Prefixed Name | Cardinality | Value-type | Definition of Vocabulary Property | Definition |
|:-------|:--------|:---------|:-----------|:-----------|
| [kerml_vocab:membershipImportImportedMembership](https://www.omg.org/spec/KerML/20230201/vocab#membershipImportImportedMembership)| [1]| [kerml_vocab:Membership](https://www.omg.org/spec/KerML/20230201/vocab#Membership)| <p>The <code>Membership</code> to be imported.</p><br>| <p>The <code>Membership</code> to be imported.</p><br>|




