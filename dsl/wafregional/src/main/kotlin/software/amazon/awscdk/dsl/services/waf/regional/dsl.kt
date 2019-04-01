package software.amazon.awscdk.dsl.services.waf.regional
/**
 * @see software.amazon.awscdk.services.waf.regional.CfnRule
 */
fun software.amazon.awscdk.Construct.cfnRule(id: String,
                     props: software.amazon.awscdk.services.waf.regional.CfnRuleProps? = null,
                     init: (software.amazon.awscdk.services.waf.regional.CfnRule.() -> Unit)? = null)
        : software.amazon.awscdk.services.waf.regional.CfnRule {

    val obj = software.amazon.awscdk.services.waf.regional.CfnRule(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnXssMatchSet
 */
fun software.amazon.awscdk.Construct.cfnXssMatchSet(id: String,
                     props: software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps? = null,
                     init: (software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.() -> Unit)? = null)
        : software.amazon.awscdk.services.waf.regional.CfnXssMatchSet {

    val obj = software.amazon.awscdk.services.waf.regional.CfnXssMatchSet(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet
 */
fun software.amazon.awscdk.Construct.cfnSqlInjectionMatchSet(id: String,
                     props: software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps? = null,
                     init: (software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.() -> Unit)? = null)
        : software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet {

    val obj = software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet
 */
fun software.amazon.awscdk.Construct.cfnSizeConstraintSet(id: String,
                     props: software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps? = null,
                     init: (software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.() -> Unit)? = null)
        : software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet {

    val obj = software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnWebACL
 */
fun software.amazon.awscdk.Construct.cfnWebACL(id: String,
                     props: software.amazon.awscdk.services.waf.regional.CfnWebACLProps? = null,
                     init: (software.amazon.awscdk.services.waf.regional.CfnWebACL.() -> Unit)? = null)
        : software.amazon.awscdk.services.waf.regional.CfnWebACL {

    val obj = software.amazon.awscdk.services.waf.regional.CfnWebACL(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation
 */
fun software.amazon.awscdk.Construct.cfnWebACLAssociation(id: String,
                     props: software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps? = null,
                     init: (software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation.() -> Unit)? = null)
        : software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation {

    val obj = software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnByteMatchSet
 */
fun software.amazon.awscdk.Construct.cfnByteMatchSet(id: String,
                     props: software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps? = null,
                     init: (software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.() -> Unit)? = null)
        : software.amazon.awscdk.services.waf.regional.CfnByteMatchSet {

    val obj = software.amazon.awscdk.services.waf.regional.CfnByteMatchSet(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnIPSet
 */
fun software.amazon.awscdk.Construct.cfnIPSet(id: String,
                     props: software.amazon.awscdk.services.waf.regional.CfnIPSetProps? = null,
                     init: (software.amazon.awscdk.services.waf.regional.CfnIPSet.() -> Unit)? = null)
        : software.amazon.awscdk.services.waf.regional.CfnIPSet {

    val obj = software.amazon.awscdk.services.waf.regional.CfnIPSet(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty.Builder
 */
fun xssMatchTupleProperty(init: software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty {
    val builder = software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty.Builder.withFieldToMatch
 */
var software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty.Builder.fieldToMatch: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on fieldToMatch is not supported.")
    set(value) { this.withFieldToMatch(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty.Builder.withTextTransformation
 */
var software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.XssMatchTupleProperty.Builder.textTransformation: String
    get() = throw NoSuchFieldException("Get on textTransformation is not supported.")
    set(value) { this.withTextTransformation(value) }


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty.Builder
 */
fun sizeConstraintProperty(init: software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty {
    val builder = software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty.Builder.withFieldToMatch
 */
var software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty.Builder.fieldToMatch: software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.FieldToMatchProperty
    get() = throw NoSuchFieldException("Get on fieldToMatch is not supported.")
    set(value) { this.withFieldToMatch(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty.Builder.withTextTransformation
 */
var software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty.Builder.textTransformation: String
    get() = throw NoSuchFieldException("Get on textTransformation is not supported.")
    set(value) { this.withTextTransformation(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty.Builder.withSize
 */
var software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty.Builder.size: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on size is not supported.")
    set(value) { this.withSize(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty.Builder.withComparisonOperator
 */
var software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.SizeConstraintProperty.Builder.comparisonOperator: String
    get() = throw NoSuchFieldException("Get on comparisonOperator is not supported.")
    set(value) { this.withComparisonOperator(value) }


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.FieldToMatchProperty.Builder
 */
fun fieldToMatchProperty(init: software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.FieldToMatchProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.FieldToMatchProperty {
    val builder = software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.FieldToMatchProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.FieldToMatchProperty.Builder.withData
 */
var software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.FieldToMatchProperty.Builder.data: String
    get() = throw NoSuchFieldException("Get on data is not supported.")
    set(value) { this.withData(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.FieldToMatchProperty.Builder.withType
 */
var software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.FieldToMatchProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty.Builder
 */
fun fieldToMatchProperty(init: software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty {
    val builder = software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty.Builder.withData
 */
var software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty.Builder.data: String
    get() = throw NoSuchFieldException("Get on data is not supported.")
    set(value) { this.withData(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty.Builder.withType
 */
var software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.FieldToMatchProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty.Builder
 */
fun ruleProperty(init: software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty {
    val builder = software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty.Builder.withAction
 */
var software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty.Builder.action: software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty
    get() = throw NoSuchFieldException("Get on action is not supported.")
    set(value) { this.withAction(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty.Builder.withRuleId
 */
var software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty.Builder.ruleId: String
    get() = throw NoSuchFieldException("Get on ruleId is not supported.")
    set(value) { this.withRuleId(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty.Builder.withPriority
 */
var software.amazon.awscdk.services.waf.regional.CfnWebACL.RuleProperty.Builder.priority: Number
    get() = throw NoSuchFieldException("Get on priority is not supported.")
    set(value) { this.withPriority(value) }


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnRuleProps.Builder
 */
fun cfnRuleProps(init: software.amazon.awscdk.services.waf.regional.CfnRuleProps.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnRuleProps {
    val builder = software.amazon.awscdk.services.waf.regional.CfnRuleProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnRuleProps.Builder.withMetricName
 */
var software.amazon.awscdk.services.waf.regional.CfnRuleProps.Builder.metricName: String
    get() = throw NoSuchFieldException("Get on metricName is not supported.")
    set(value) { this.withMetricName(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnRuleProps.Builder.withPredicates
 */
var software.amazon.awscdk.services.waf.regional.CfnRuleProps.Builder.predicates: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on predicates is not supported.")
    set(value) { this.withPredicates(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnRuleProps.Builder.withName
 */
var software.amazon.awscdk.services.waf.regional.CfnRuleProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty.Builder
 */
fun byteMatchTupleProperty(init: software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty {
    val builder = software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty.Builder.withFieldToMatch
 */
var software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty.Builder.fieldToMatch: software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty
    get() = throw NoSuchFieldException("Get on fieldToMatch is not supported.")
    set(value) { this.withFieldToMatch(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty.Builder.withTextTransformation
 */
var software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty.Builder.textTransformation: String
    get() = throw NoSuchFieldException("Get on textTransformation is not supported.")
    set(value) { this.withTextTransformation(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty.Builder.withTargetString
 */
var software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty.Builder.targetString: String
    get() = throw NoSuchFieldException("Get on targetString is not supported.")
    set(value) { this.withTargetString(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty.Builder.withTargetStringBase64
 */
var software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty.Builder.targetStringBase64: String
    get() = throw NoSuchFieldException("Get on targetStringBase64 is not supported.")
    set(value) { this.withTargetStringBase64(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty.Builder.withPositionalConstraint
 */
var software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty.Builder.positionalConstraint: String
    get() = throw NoSuchFieldException("Get on positionalConstraint is not supported.")
    set(value) { this.withPositionalConstraint(value) }


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps.Builder
 */
fun cfnByteMatchSetProps(init: software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps {
    val builder = software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps.Builder.withName
 */
var software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps.Builder.withByteMatchTuples
 */
var software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps.Builder.byteMatchTuples: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on byteMatchTuples is not supported.")
    set(value) { this.withByteMatchTuples(value) }


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty.Builder
 */
fun actionProperty(init: software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty {
    val builder = software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty.Builder.withType
 */
var software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps.Builder
 */
fun cfnXssMatchSetProps(init: software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps {
    val builder = software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps.Builder.withName
 */
var software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps.Builder.withXssMatchTuples
 */
var software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps.Builder.xssMatchTuples: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on xssMatchTuples is not supported.")
    set(value) { this.withXssMatchTuples(value) }


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty.Builder
 */
fun fieldToMatchProperty(init: software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty {
    val builder = software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty.Builder.withData
 */
var software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty.Builder.data: String
    get() = throw NoSuchFieldException("Get on data is not supported.")
    set(value) { this.withData(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty.Builder.withType
 */
var software.amazon.awscdk.services.waf.regional.CfnXssMatchSet.FieldToMatchProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnIPSetProps.Builder
 */
fun cfnIPSetProps(init: software.amazon.awscdk.services.waf.regional.CfnIPSetProps.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnIPSetProps {
    val builder = software.amazon.awscdk.services.waf.regional.CfnIPSetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnIPSetProps.Builder.withIpSetDescriptors
 */
var software.amazon.awscdk.services.waf.regional.CfnIPSetProps.Builder.ipSetDescriptors: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ipSetDescriptors is not supported.")
    set(value) { this.withIpSetDescriptors(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnIPSetProps.Builder.withName
 */
var software.amazon.awscdk.services.waf.regional.CfnIPSetProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty.Builder
 */
fun predicateProperty(init: software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty {
    val builder = software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty.Builder.withType
 */
var software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty.Builder.withNegated
 */
var software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty.Builder.negated: Boolean
    get() = throw NoSuchFieldException("Get on negated is not supported.")
    set(value) { this.withNegated(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty.Builder.withDataId
 */
var software.amazon.awscdk.services.waf.regional.CfnRule.PredicateProperty.Builder.dataId: String
    get() = throw NoSuchFieldException("Get on dataId is not supported.")
    set(value) { this.withDataId(value) }


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps.Builder
 */
fun cfnSizeConstraintSetProps(init: software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps {
    val builder = software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps.Builder.withName
 */
var software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps.Builder.withSizeConstraints
 */
var software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps.Builder.sizeConstraints: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on sizeConstraints is not supported.")
    set(value) { this.withSizeConstraints(value) }


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder
 */
fun sqlInjectionMatchTupleProperty(init: software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty {
    val builder = software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder.withFieldToMatch
 */
var software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder.fieldToMatch: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on fieldToMatch is not supported.")
    set(value) { this.withFieldToMatch(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder.withTextTransformation
 */
var software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder.textTransformation: String
    get() = throw NoSuchFieldException("Get on textTransformation is not supported.")
    set(value) { this.withTextTransformation(value) }


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnWebACLProps.Builder
 */
fun cfnWebACLProps(init: software.amazon.awscdk.services.waf.regional.CfnWebACLProps.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnWebACLProps {
    val builder = software.amazon.awscdk.services.waf.regional.CfnWebACLProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnWebACLProps.Builder.withDefaultAction
 */
var software.amazon.awscdk.services.waf.regional.CfnWebACLProps.Builder.defaultAction: software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty
    get() = throw NoSuchFieldException("Get on defaultAction is not supported.")
    set(value) { this.withDefaultAction(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnWebACLProps.Builder.withMetricName
 */
var software.amazon.awscdk.services.waf.regional.CfnWebACLProps.Builder.metricName: String
    get() = throw NoSuchFieldException("Get on metricName is not supported.")
    set(value) { this.withMetricName(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnWebACLProps.Builder.withName
 */
var software.amazon.awscdk.services.waf.regional.CfnWebACLProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnWebACLProps.Builder.withRules
 */
var software.amazon.awscdk.services.waf.regional.CfnWebACLProps.Builder.rules: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on rules is not supported.")
    set(value) { this.withRules(value) }


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps.Builder
 */
fun cfnSqlInjectionMatchSetProps(init: software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps {
    val builder = software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps.Builder.withName
 */
var software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps.Builder.withSqlInjectionMatchTuples
 */
var software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps.Builder.sqlInjectionMatchTuples: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on sqlInjectionMatchTuples is not supported.")
    set(value) { this.withSqlInjectionMatchTuples(value) }


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty.Builder
 */
fun fieldToMatchProperty(init: software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty {
    val builder = software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty.Builder.withData
 */
var software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty.Builder.data: String
    get() = throw NoSuchFieldException("Get on data is not supported.")
    set(value) { this.withData(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty.Builder.withType
 */
var software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps.Builder
 */
fun cfnWebACLAssociationProps(init: software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps.Builder.() -> Unit): software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps {
    val builder = software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps.Builder.withWebAclId
 */
var software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps.Builder.webAclId: String
    get() = throw NoSuchFieldException("Get on webAclId is not supported.")
    set(value) { this.withWebAclId(value) }

/**
 * @see software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps.Builder.withResourceArn
 */
var software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps.Builder.resourceArn: String
    get() = throw NoSuchFieldException("Get on resourceArn is not supported.")
    set(value) { this.withResourceArn(value) }
