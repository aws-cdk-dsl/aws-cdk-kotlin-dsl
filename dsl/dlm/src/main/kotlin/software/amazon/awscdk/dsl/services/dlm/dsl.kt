package software.amazon.awscdk.dsl.services.dlm
/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicy
 */
fun software.amazon.awscdk.Construct.cfnLifecyclePolicy(id: String,
                     props: software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps? = null,
                     init: (software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.() -> Unit)? = null)
        : software.amazon.awscdk.services.dlm.CfnLifecyclePolicy {

    val obj = software.amazon.awscdk.services.dlm.CfnLifecyclePolicy(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicy
 */
fun software.amazon.awscdk.Construct.cfnLifecyclePolicy(id: String,
                     init: (software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.() -> Unit)? = null)
        : software.amazon.awscdk.services.dlm.CfnLifecyclePolicy {

    val obj = software.amazon.awscdk.services.dlm.CfnLifecyclePolicy(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.Builder
 */
fun scheduleProperty(init: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.Builder.() -> Unit): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty {
    val builder = software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.Builder.withName
 */
var software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.Builder.withCopyTags
 */
var software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.Builder.copyTags: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on copyTags is not supported.")
    set(value) { this.withCopyTags(value) }

/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.Builder.withCreateRule
 */
var software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.Builder.createRule: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty
    get() = throw NoSuchFieldException("Get on createRule is not supported.")
    set(value) { this.withCreateRule(value) }

/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.Builder.withRetainRule
 */
var software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.Builder.retainRule: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on retainRule is not supported.")
    set(value) { this.withRetainRule(value) }

/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.Builder.withTagsToAdd
 */
var software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.Builder.tagsToAdd: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on tagsToAdd is not supported.")
    set(value) { this.withTagsToAdd(value) }


/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps.Builder
 */
fun cfnLifecyclePolicyProps(init: software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps {
    val builder = software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps.Builder.withState
 */
var software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps.Builder.state: String
    get() = throw NoSuchFieldException("Get on state is not supported.")
    set(value) { this.withState(value) }

/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps.Builder.withPolicyDetails
 */
var software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps.Builder.policyDetails: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on policyDetails is not supported.")
    set(value) { this.withPolicyDetails(value) }

/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps.Builder.withExecutionRoleArn
 */
var software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps.Builder.executionRoleArn: String
    get() = throw NoSuchFieldException("Get on executionRoleArn is not supported.")
    set(value) { this.withExecutionRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps.Builder.withDescription
 */
var software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty.Builder
 */
fun policyDetailsProperty(init: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty.Builder.() -> Unit): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty {
    val builder = software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty.Builder.withSchedules
 */
var software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty.Builder.schedules: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on schedules is not supported.")
    set(value) { this.withSchedules(value) }

/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty.Builder.withTargetTags
 */
var software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty.Builder.targetTags: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on targetTags is not supported.")
    set(value) { this.withTargetTags(value) }


/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty.Builder
 */
fun createRuleProperty(init: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty.Builder.() -> Unit): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty {
    val builder = software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty.Builder.withInterval
 */
var software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty.Builder.interval: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on interval is not supported.")
    set(value) { this.withInterval(value) }

/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty.Builder.withIntervalUnit
 */
var software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty.Builder.intervalUnit: String
    get() = throw NoSuchFieldException("Get on intervalUnit is not supported.")
    set(value) { this.withIntervalUnit(value) }


/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty.Builder
 */
fun retainRuleProperty(init: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty.Builder.() -> Unit): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty {
    val builder = software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty.Builder.withCount
 */
var software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty.Builder.count: Number
    get() = throw NoSuchFieldException("Get on count is not supported.")
    set(value) { this.withCount(value) }
