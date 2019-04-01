package software.amazon.awscdk.dsl.services.waf
/**
 * @see software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet
 */
fun software.amazon.awscdk.Construct.cfnSqlInjectionMatchSet(id: String,
                     props: software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSetProps? = null,
                     init: (software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.() -> Unit)? = null)
        : software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet {

    val obj = software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.waf.CfnXssMatchSet
 */
fun software.amazon.awscdk.Construct.cfnXssMatchSet(id: String,
                     props: software.amazon.awscdk.services.waf.CfnXssMatchSetProps? = null,
                     init: (software.amazon.awscdk.services.waf.CfnXssMatchSet.() -> Unit)? = null)
        : software.amazon.awscdk.services.waf.CfnXssMatchSet {

    val obj = software.amazon.awscdk.services.waf.CfnXssMatchSet(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.waf.CfnByteMatchSet
 */
fun software.amazon.awscdk.Construct.cfnByteMatchSet(id: String,
                     props: software.amazon.awscdk.services.waf.CfnByteMatchSetProps? = null,
                     init: (software.amazon.awscdk.services.waf.CfnByteMatchSet.() -> Unit)? = null)
        : software.amazon.awscdk.services.waf.CfnByteMatchSet {

    val obj = software.amazon.awscdk.services.waf.CfnByteMatchSet(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.waf.CfnIPSet
 */
fun software.amazon.awscdk.Construct.cfnIPSet(id: String,
                     props: software.amazon.awscdk.services.waf.CfnIPSetProps? = null,
                     init: (software.amazon.awscdk.services.waf.CfnIPSet.() -> Unit)? = null)
        : software.amazon.awscdk.services.waf.CfnIPSet {

    val obj = software.amazon.awscdk.services.waf.CfnIPSet(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.waf.CfnWebACL
 */
fun software.amazon.awscdk.Construct.cfnWebACL(id: String,
                     props: software.amazon.awscdk.services.waf.CfnWebACLProps? = null,
                     init: (software.amazon.awscdk.services.waf.CfnWebACL.() -> Unit)? = null)
        : software.amazon.awscdk.services.waf.CfnWebACL {

    val obj = software.amazon.awscdk.services.waf.CfnWebACL(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.waf.CfnRule
 */
fun software.amazon.awscdk.Construct.cfnRule(id: String,
                     props: software.amazon.awscdk.services.waf.CfnRuleProps? = null,
                     init: (software.amazon.awscdk.services.waf.CfnRule.() -> Unit)? = null)
        : software.amazon.awscdk.services.waf.CfnRule {

    val obj = software.amazon.awscdk.services.waf.CfnRule(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.waf.CfnSizeConstraintSet
 */
fun software.amazon.awscdk.Construct.cfnSizeConstraintSet(id: String,
                     props: software.amazon.awscdk.services.waf.CfnSizeConstraintSetProps? = null,
                     init: (software.amazon.awscdk.services.waf.CfnSizeConstraintSet.() -> Unit)? = null)
        : software.amazon.awscdk.services.waf.CfnSizeConstraintSet {

    val obj = software.amazon.awscdk.services.waf.CfnSizeConstraintSet(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty.Builder
 */
fun sizeConstraintProperty(init: software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty {
    val builder = software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty.Builder.withFieldToMatch
 */
var software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty.Builder.fieldToMatch: software.amazon.awscdk.services.waf.CfnSizeConstraintSet.FieldToMatchProperty
    get() = throw NoSuchFieldException("Get on fieldToMatch is not supported.")
    set(value) { this.withFieldToMatch(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty.Builder.withTextTransformation
 */
var software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty.Builder.textTransformation: String
    get() = throw NoSuchFieldException("Get on textTransformation is not supported.")
    set(value) { this.withTextTransformation(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty.Builder.withSize
 */
var software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty.Builder.size: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on size is not supported.")
    set(value) { this.withSize(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty.Builder.withComparisonOperator
 */
var software.amazon.awscdk.services.waf.CfnSizeConstraintSet.SizeConstraintProperty.Builder.comparisonOperator: String
    get() = throw NoSuchFieldException("Get on comparisonOperator is not supported.")
    set(value) { this.withComparisonOperator(value) }


/**
 * @see software.amazon.awscdk.services.waf.CfnRule.PredicateProperty.Builder
 */
fun predicateProperty(init: software.amazon.awscdk.services.waf.CfnRule.PredicateProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.CfnRule.PredicateProperty {
    val builder = software.amazon.awscdk.services.waf.CfnRule.PredicateProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.CfnRule.PredicateProperty.Builder.withType
 */
var software.amazon.awscdk.services.waf.CfnRule.PredicateProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnRule.PredicateProperty.Builder.withNegated
 */
var software.amazon.awscdk.services.waf.CfnRule.PredicateProperty.Builder.negated: Boolean
    get() = throw NoSuchFieldException("Get on negated is not supported.")
    set(value) { this.withNegated(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnRule.PredicateProperty.Builder.withDataId
 */
var software.amazon.awscdk.services.waf.CfnRule.PredicateProperty.Builder.dataId: String
    get() = throw NoSuchFieldException("Get on dataId is not supported.")
    set(value) { this.withDataId(value) }


/**
 * @see software.amazon.awscdk.services.waf.CfnIPSetProps.Builder
 */
fun cfnIPSetProps(init: software.amazon.awscdk.services.waf.CfnIPSetProps.Builder.() -> Unit): software.amazon.awscdk.services.waf.CfnIPSetProps {
    val builder = software.amazon.awscdk.services.waf.CfnIPSetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.CfnIPSetProps.Builder.withIpSetDescriptors
 */
var software.amazon.awscdk.services.waf.CfnIPSetProps.Builder.ipSetDescriptors: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ipSetDescriptors is not supported.")
    set(value) { this.withIpSetDescriptors(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnIPSetProps.Builder.withName
 */
var software.amazon.awscdk.services.waf.CfnIPSetProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.waf.CfnSizeConstraintSetProps.Builder
 */
fun cfnSizeConstraintSetProps(init: software.amazon.awscdk.services.waf.CfnSizeConstraintSetProps.Builder.() -> Unit): software.amazon.awscdk.services.waf.CfnSizeConstraintSetProps {
    val builder = software.amazon.awscdk.services.waf.CfnSizeConstraintSetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.CfnSizeConstraintSetProps.Builder.withName
 */
var software.amazon.awscdk.services.waf.CfnSizeConstraintSetProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnSizeConstraintSetProps.Builder.withSizeConstraints
 */
var software.amazon.awscdk.services.waf.CfnSizeConstraintSetProps.Builder.sizeConstraints: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on sizeConstraints is not supported.")
    set(value) { this.withSizeConstraints(value) }


/**
 * @see software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty.Builder
 */
fun byteMatchTupleProperty(init: software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty {
    val builder = software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty.Builder.withFieldToMatch
 */
var software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty.Builder.fieldToMatch: software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty
    get() = throw NoSuchFieldException("Get on fieldToMatch is not supported.")
    set(value) { this.withFieldToMatch(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty.Builder.withTextTransformation
 */
var software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty.Builder.textTransformation: String
    get() = throw NoSuchFieldException("Get on textTransformation is not supported.")
    set(value) { this.withTextTransformation(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty.Builder.withTargetString
 */
var software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty.Builder.targetString: String
    get() = throw NoSuchFieldException("Get on targetString is not supported.")
    set(value) { this.withTargetString(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty.Builder.withTargetStringBase64
 */
var software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty.Builder.targetStringBase64: String
    get() = throw NoSuchFieldException("Get on targetStringBase64 is not supported.")
    set(value) { this.withTargetStringBase64(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty.Builder.withPositionalConstraint
 */
var software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty.Builder.positionalConstraint: String
    get() = throw NoSuchFieldException("Get on positionalConstraint is not supported.")
    set(value) { this.withPositionalConstraint(value) }


/**
 * @see software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.FieldToMatchProperty.Builder
 */
fun fieldToMatchProperty(init: software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.FieldToMatchProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.FieldToMatchProperty {
    val builder = software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.FieldToMatchProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.FieldToMatchProperty.Builder.withData
 */
var software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.FieldToMatchProperty.Builder.data: String
    get() = throw NoSuchFieldException("Get on data is not supported.")
    set(value) { this.withData(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.FieldToMatchProperty.Builder.withType
 */
var software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.FieldToMatchProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.waf.CfnByteMatchSetProps.Builder
 */
fun cfnByteMatchSetProps(init: software.amazon.awscdk.services.waf.CfnByteMatchSetProps.Builder.() -> Unit): software.amazon.awscdk.services.waf.CfnByteMatchSetProps {
    val builder = software.amazon.awscdk.services.waf.CfnByteMatchSetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.CfnByteMatchSetProps.Builder.withName
 */
var software.amazon.awscdk.services.waf.CfnByteMatchSetProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnByteMatchSetProps.Builder.withByteMatchTuples
 */
var software.amazon.awscdk.services.waf.CfnByteMatchSetProps.Builder.byteMatchTuples: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on byteMatchTuples is not supported.")
    set(value) { this.withByteMatchTuples(value) }


/**
 * @see software.amazon.awscdk.services.waf.CfnSizeConstraintSet.FieldToMatchProperty.Builder
 */
fun fieldToMatchProperty(init: software.amazon.awscdk.services.waf.CfnSizeConstraintSet.FieldToMatchProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.CfnSizeConstraintSet.FieldToMatchProperty {
    val builder = software.amazon.awscdk.services.waf.CfnSizeConstraintSet.FieldToMatchProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.CfnSizeConstraintSet.FieldToMatchProperty.Builder.withData
 */
var software.amazon.awscdk.services.waf.CfnSizeConstraintSet.FieldToMatchProperty.Builder.data: String
    get() = throw NoSuchFieldException("Get on data is not supported.")
    set(value) { this.withData(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnSizeConstraintSet.FieldToMatchProperty.Builder.withType
 */
var software.amazon.awscdk.services.waf.CfnSizeConstraintSet.FieldToMatchProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder
 */
fun sqlInjectionMatchTupleProperty(init: software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty {
    val builder = software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder.withFieldToMatch
 */
var software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder.fieldToMatch: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on fieldToMatch is not supported.")
    set(value) { this.withFieldToMatch(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder.withTextTransformation
 */
var software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder.textTransformation: String
    get() = throw NoSuchFieldException("Get on textTransformation is not supported.")
    set(value) { this.withTextTransformation(value) }


/**
 * @see software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty.Builder
 */
fun activatedRuleProperty(init: software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty {
    val builder = software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty.Builder.withAction
 */
var software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty.Builder.action: software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty
    get() = throw NoSuchFieldException("Get on action is not supported.")
    set(value) { this.withAction(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty.Builder.withRuleId
 */
var software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty.Builder.ruleId: String
    get() = throw NoSuchFieldException("Get on ruleId is not supported.")
    set(value) { this.withRuleId(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty.Builder.withPriority
 */
var software.amazon.awscdk.services.waf.CfnWebACL.ActivatedRuleProperty.Builder.priority: Number
    get() = throw NoSuchFieldException("Get on priority is not supported.")
    set(value) { this.withPriority(value) }


/**
 * @see software.amazon.awscdk.services.waf.CfnXssMatchSet.XssMatchTupleProperty.Builder
 */
fun xssMatchTupleProperty(init: software.amazon.awscdk.services.waf.CfnXssMatchSet.XssMatchTupleProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.CfnXssMatchSet.XssMatchTupleProperty {
    val builder = software.amazon.awscdk.services.waf.CfnXssMatchSet.XssMatchTupleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.CfnXssMatchSet.XssMatchTupleProperty.Builder.withFieldToMatch
 */
var software.amazon.awscdk.services.waf.CfnXssMatchSet.XssMatchTupleProperty.Builder.fieldToMatch: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on fieldToMatch is not supported.")
    set(value) { this.withFieldToMatch(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnXssMatchSet.XssMatchTupleProperty.Builder.withTextTransformation
 */
var software.amazon.awscdk.services.waf.CfnXssMatchSet.XssMatchTupleProperty.Builder.textTransformation: String
    get() = throw NoSuchFieldException("Get on textTransformation is not supported.")
    set(value) { this.withTextTransformation(value) }


/**
 * @see software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty.Builder
 */
fun fieldToMatchProperty(init: software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty {
    val builder = software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty.Builder.withData
 */
var software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty.Builder.data: String
    get() = throw NoSuchFieldException("Get on data is not supported.")
    set(value) { this.withData(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty.Builder.withType
 */
var software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.waf.CfnRuleProps.Builder
 */
fun cfnRuleProps(init: software.amazon.awscdk.services.waf.CfnRuleProps.Builder.() -> Unit): software.amazon.awscdk.services.waf.CfnRuleProps {
    val builder = software.amazon.awscdk.services.waf.CfnRuleProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.CfnRuleProps.Builder.withMetricName
 */
var software.amazon.awscdk.services.waf.CfnRuleProps.Builder.metricName: String
    get() = throw NoSuchFieldException("Get on metricName is not supported.")
    set(value) { this.withMetricName(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnRuleProps.Builder.withPredicates
 */
var software.amazon.awscdk.services.waf.CfnRuleProps.Builder.predicates: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on predicates is not supported.")
    set(value) { this.withPredicates(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnRuleProps.Builder.withName
 */
var software.amazon.awscdk.services.waf.CfnRuleProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.waf.CfnXssMatchSetProps.Builder
 */
fun cfnXssMatchSetProps(init: software.amazon.awscdk.services.waf.CfnXssMatchSetProps.Builder.() -> Unit): software.amazon.awscdk.services.waf.CfnXssMatchSetProps {
    val builder = software.amazon.awscdk.services.waf.CfnXssMatchSetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.CfnXssMatchSetProps.Builder.withName
 */
var software.amazon.awscdk.services.waf.CfnXssMatchSetProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnXssMatchSetProps.Builder.withXssMatchTuples
 */
var software.amazon.awscdk.services.waf.CfnXssMatchSetProps.Builder.xssMatchTuples: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on xssMatchTuples is not supported.")
    set(value) { this.withXssMatchTuples(value) }


/**
 * @see software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSetProps.Builder
 */
fun cfnSqlInjectionMatchSetProps(init: software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSetProps.Builder.() -> Unit): software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSetProps {
    val builder = software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSetProps.Builder.withName
 */
var software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSetProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSetProps.Builder.withSqlInjectionMatchTuples
 */
var software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSetProps.Builder.sqlInjectionMatchTuples: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on sqlInjectionMatchTuples is not supported.")
    set(value) { this.withSqlInjectionMatchTuples(value) }


/**
 * @see software.amazon.awscdk.services.waf.CfnWebACLProps.Builder
 */
fun cfnWebACLProps(init: software.amazon.awscdk.services.waf.CfnWebACLProps.Builder.() -> Unit): software.amazon.awscdk.services.waf.CfnWebACLProps {
    val builder = software.amazon.awscdk.services.waf.CfnWebACLProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.CfnWebACLProps.Builder.withDefaultAction
 */
var software.amazon.awscdk.services.waf.CfnWebACLProps.Builder.defaultAction: software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty
    get() = throw NoSuchFieldException("Get on defaultAction is not supported.")
    set(value) { this.withDefaultAction(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnWebACLProps.Builder.withMetricName
 */
var software.amazon.awscdk.services.waf.CfnWebACLProps.Builder.metricName: String
    get() = throw NoSuchFieldException("Get on metricName is not supported.")
    set(value) { this.withMetricName(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnWebACLProps.Builder.withName
 */
var software.amazon.awscdk.services.waf.CfnWebACLProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnWebACLProps.Builder.withRules
 */
var software.amazon.awscdk.services.waf.CfnWebACLProps.Builder.rules: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on rules is not supported.")
    set(value) { this.withRules(value) }


/**
 * @see software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty.Builder
 */
fun wafActionProperty(init: software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty {
    val builder = software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty.Builder.withType
 */
var software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty.Builder
 */
fun fieldToMatchProperty(init: software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty.Builder.() -> Unit): software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty {
    val builder = software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty.Builder.withData
 */
var software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty.Builder.data: String
    get() = throw NoSuchFieldException("Get on data is not supported.")
    set(value) { this.withData(value) }

/**
 * @see software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty.Builder.withType
 */
var software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }
