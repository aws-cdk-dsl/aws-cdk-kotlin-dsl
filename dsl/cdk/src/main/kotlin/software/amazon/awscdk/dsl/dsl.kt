package software.amazon.awscdk.dsl
/**
 * @see software.amazon.awscdk.App
 */
fun app(props: software.amazon.awscdk.AppProps? = null,
        init: (software.amazon.awscdk.App.() -> Unit)? = null)
        : software.amazon.awscdk.App {

    val obj = software.amazon.awscdk.App(props)
    init?.invoke(obj)
    return obj
}

/**
 * @see software.amazon.awscdk.CfnCondition
 */
fun software.amazon.awscdk.Construct.cfnCondition(id: String,
                     props: software.amazon.awscdk.CfnConditionProps? = null,
                     init: (software.amazon.awscdk.CfnCondition.() -> Unit)? = null)
        : software.amazon.awscdk.CfnCondition {

    val obj = software.amazon.awscdk.CfnCondition(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.SecretParameter
 */
fun software.amazon.awscdk.Construct.secretParameter(id: String,
                     props: software.amazon.awscdk.SecretParameterProps? = null,
                     init: (software.amazon.awscdk.SecretParameter.() -> Unit)? = null)
        : software.amazon.awscdk.SecretParameter {

    val obj = software.amazon.awscdk.SecretParameter(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.CfnParameter
 */
fun software.amazon.awscdk.Construct.cfnParameter(id: String,
                     props: software.amazon.awscdk.CfnParameterProps? = null,
                     init: (software.amazon.awscdk.CfnParameter.() -> Unit)? = null)
        : software.amazon.awscdk.CfnParameter {

    val obj = software.amazon.awscdk.CfnParameter(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.DynamicReference
 */
fun software.amazon.awscdk.Construct.dynamicReference(id: String,
                     props: software.amazon.awscdk.DynamicReferenceProps? = null,
                     init: (software.amazon.awscdk.DynamicReference.() -> Unit)? = null)
        : software.amazon.awscdk.DynamicReference {

    val obj = software.amazon.awscdk.DynamicReference(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.CfnMapping
 */
fun software.amazon.awscdk.Construct.cfnMapping(id: String,
                     props: software.amazon.awscdk.CfnMappingProps? = null,
                     init: (software.amazon.awscdk.CfnMapping.() -> Unit)? = null)
        : software.amazon.awscdk.CfnMapping {

    val obj = software.amazon.awscdk.CfnMapping(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.Include
 */
fun software.amazon.awscdk.Construct.include(id: String,
                     props: software.amazon.awscdk.IncludeProps? = null,
                     init: (software.amazon.awscdk.Include.() -> Unit)? = null)
        : software.amazon.awscdk.Include {

    val obj = software.amazon.awscdk.Include(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.StringListCfnOutput
 */
fun software.amazon.awscdk.Construct.stringListCfnOutput(id: String,
                     props: software.amazon.awscdk.StringListCfnOutputProps? = null,
                     init: (software.amazon.awscdk.StringListCfnOutput.() -> Unit)? = null)
        : software.amazon.awscdk.StringListCfnOutput {

    val obj = software.amazon.awscdk.StringListCfnOutput(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.CfnOutput
 */
fun software.amazon.awscdk.Construct.cfnOutput(id: String,
                     props: software.amazon.awscdk.CfnOutputProps? = null,
                     init: (software.amazon.awscdk.CfnOutput.() -> Unit)? = null)
        : software.amazon.awscdk.CfnOutput {

    val obj = software.amazon.awscdk.CfnOutput(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.CfnRule
 */
fun software.amazon.awscdk.Construct.cfnRule(id: String,
                     props: software.amazon.awscdk.CfnRuleProps? = null,
                     init: (software.amazon.awscdk.CfnRule.() -> Unit)? = null)
        : software.amazon.awscdk.CfnRule {

    val obj = software.amazon.awscdk.CfnRule(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.Stack
 */
fun software.amazon.awscdk.Construct.stack(id: String,
                     props: software.amazon.awscdk.StackProps? = null,
                     init: (software.amazon.awscdk.Stack.() -> Unit)? = null)
        : software.amazon.awscdk.Stack {

    val obj = software.amazon.awscdk.Stack(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.CfnResource
 */
fun software.amazon.awscdk.Construct.cfnResource(id: String,
                     props: software.amazon.awscdk.CfnResourceProps? = null,
                     init: (software.amazon.awscdk.CfnResource.() -> Unit)? = null)
        : software.amazon.awscdk.CfnResource {

    val obj = software.amazon.awscdk.CfnResource(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.CfnCondition
 */
fun software.amazon.awscdk.Construct.cfnCondition(id: String,
                     init: (software.amazon.awscdk.CfnCondition.() -> Unit)? = null)
        : software.amazon.awscdk.CfnCondition {

    val obj = software.amazon.awscdk.CfnCondition(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.Construct
 */
fun software.amazon.awscdk.Construct.construct(id: String,
                     init: (software.amazon.awscdk.Construct.() -> Unit)? = null)
        : software.amazon.awscdk.Construct {

    val obj = software.amazon.awscdk.Construct(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.CfnOutput
 */
fun software.amazon.awscdk.Construct.cfnOutput(id: String,
                     init: (software.amazon.awscdk.CfnOutput.() -> Unit)? = null)
        : software.amazon.awscdk.CfnOutput {

    val obj = software.amazon.awscdk.CfnOutput(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.CfnRule
 */
fun software.amazon.awscdk.Construct.cfnRule(id: String,
                     init: (software.amazon.awscdk.CfnRule.() -> Unit)? = null)
        : software.amazon.awscdk.CfnRule {

    val obj = software.amazon.awscdk.CfnRule(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.Stack
 */
fun software.amazon.awscdk.Construct.stack(id: String,
                     init: (software.amazon.awscdk.Stack.() -> Unit)? = null)
        : software.amazon.awscdk.Stack {

    val obj = software.amazon.awscdk.Stack(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.RuleAssertion.Builder
 */
fun ruleAssertion(init: software.amazon.awscdk.RuleAssertion.Builder.() -> Unit): software.amazon.awscdk.RuleAssertion {
    val builder = software.amazon.awscdk.RuleAssertion.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.RuleAssertion.Builder.withAssert
 */
var software.amazon.awscdk.RuleAssertion.Builder.assert: software.amazon.awscdk.ICfnConditionExpression
    get() = throw NoSuchFieldException("Get on assert is not supported.")
    set(value) { this.withAssert(value) }

/**
 * @see software.amazon.awscdk.RuleAssertion.Builder.withAssertDescription
 */
var software.amazon.awscdk.RuleAssertion.Builder.assertDescription: String
    get() = throw NoSuchFieldException("Get on assertDescription is not supported.")
    set(value) { this.withAssertDescription(value) }


/**
 * @see software.amazon.awscdk.Environment.Builder
 */
fun environment(init: software.amazon.awscdk.Environment.Builder.() -> Unit): software.amazon.awscdk.Environment {
    val builder = software.amazon.awscdk.Environment.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.Environment.Builder.withRegion
 */
var software.amazon.awscdk.Environment.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.Environment.Builder.withAccount
 */
var software.amazon.awscdk.Environment.Builder.account: String
    get() = throw NoSuchFieldException("Get on account is not supported.")
    set(value) { this.withAccount(value) }


/**
 * @see software.amazon.awscdk.AutoScalingScheduledAction.Builder
 */
fun autoScalingScheduledAction(init: software.amazon.awscdk.AutoScalingScheduledAction.Builder.() -> Unit): software.amazon.awscdk.AutoScalingScheduledAction {
    val builder = software.amazon.awscdk.AutoScalingScheduledAction.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.AutoScalingScheduledAction.Builder.withIgnoreUnmodifiedGroupSizeProperties
 */
var software.amazon.awscdk.AutoScalingScheduledAction.Builder.ignoreUnmodifiedGroupSizeProperties: Boolean
    get() = throw NoSuchFieldException("Get on ignoreUnmodifiedGroupSizeProperties is not supported.")
    set(value) { this.withIgnoreUnmodifiedGroupSizeProperties(value) }


/**
 * @see software.amazon.awscdk.CfnResourceProps.Builder
 */
fun cfnResourceProps(init: software.amazon.awscdk.CfnResourceProps.Builder.() -> Unit): software.amazon.awscdk.CfnResourceProps {
    val builder = software.amazon.awscdk.CfnResourceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.CfnResourceProps.Builder.withType
 */
var software.amazon.awscdk.CfnResourceProps.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.CfnResourceProps.Builder.withProperties
 */
var software.amazon.awscdk.CfnResourceProps.Builder.properties: Any
    get() = throw NoSuchFieldException("Get on properties is not supported.")
    set(value) { this.withProperties(value) }


/**
 * @see software.amazon.awscdk.ResolveContext.Builder
 */
fun resolveContext(init: software.amazon.awscdk.ResolveContext.Builder.() -> Unit): software.amazon.awscdk.ResolveContext {
    val builder = software.amazon.awscdk.ResolveContext.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.ResolveContext.Builder.withScope
 */
var software.amazon.awscdk.ResolveContext.Builder.scope: software.amazon.awscdk.IConstruct
    get() = throw NoSuchFieldException("Get on scope is not supported.")
    set(value) { this.withScope(value) }


/**
 * @see software.amazon.awscdk.ResourceSignal.Builder
 */
fun resourceSignal(init: software.amazon.awscdk.ResourceSignal.Builder.() -> Unit): software.amazon.awscdk.ResourceSignal {
    val builder = software.amazon.awscdk.ResourceSignal.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.ResourceSignal.Builder.withCount
 */
var software.amazon.awscdk.ResourceSignal.Builder.count: Number
    get() = throw NoSuchFieldException("Get on count is not supported.")
    set(value) { this.withCount(value) }

/**
 * @see software.amazon.awscdk.ResourceSignal.Builder.withTimeout
 */
var software.amazon.awscdk.ResourceSignal.Builder.timeout: String
    get() = throw NoSuchFieldException("Get on timeout is not supported.")
    set(value) { this.withTimeout(value) }


/**
 * @see software.amazon.awscdk.TagProps.Builder
 */
fun tagProps(init: software.amazon.awscdk.TagProps.Builder.() -> Unit): software.amazon.awscdk.TagProps {
    val builder = software.amazon.awscdk.TagProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.TagProps.Builder.withPriority
 */
var software.amazon.awscdk.TagProps.Builder.priority: Number
    get() = throw NoSuchFieldException("Get on priority is not supported.")
    set(value) { this.withPriority(value) }

/**
 * @see software.amazon.awscdk.TagProps.Builder.withApplyToLaunchedInstances
 */
var software.amazon.awscdk.TagProps.Builder.applyToLaunchedInstances: Boolean
    get() = throw NoSuchFieldException("Get on applyToLaunchedInstances is not supported.")
    set(value) { this.withApplyToLaunchedInstances(value) }


/**
 * @see software.amazon.awscdk.CfnRuleProps.Builder
 */
fun cfnRuleProps(init: software.amazon.awscdk.CfnRuleProps.Builder.() -> Unit): software.amazon.awscdk.CfnRuleProps {
    val builder = software.amazon.awscdk.CfnRuleProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.CfnRuleProps.Builder.withRuleCondition
 */
var software.amazon.awscdk.CfnRuleProps.Builder.ruleCondition: software.amazon.awscdk.ICfnConditionExpression
    get() = throw NoSuchFieldException("Get on ruleCondition is not supported.")
    set(value) { this.withRuleCondition(value) }


/**
 * @see software.amazon.awscdk.SSMParameterProviderProps.Builder
 */
fun sSMParameterProviderProps(init: software.amazon.awscdk.SSMParameterProviderProps.Builder.() -> Unit): software.amazon.awscdk.SSMParameterProviderProps {
    val builder = software.amazon.awscdk.SSMParameterProviderProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.SSMParameterProviderProps.Builder.withParameterName
 */
var software.amazon.awscdk.SSMParameterProviderProps.Builder.parameterName: String
    get() = throw NoSuchFieldException("Get on parameterName is not supported.")
    set(value) { this.withParameterName(value) }


/**
 * @see software.amazon.awscdk.DynamicReferenceProps.Builder
 */
fun dynamicReferenceProps(init: software.amazon.awscdk.DynamicReferenceProps.Builder.() -> Unit): software.amazon.awscdk.DynamicReferenceProps {
    val builder = software.amazon.awscdk.DynamicReferenceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.DynamicReferenceProps.Builder.withService
 */
var software.amazon.awscdk.DynamicReferenceProps.Builder.service: software.amazon.awscdk.DynamicReferenceService
    get() = throw NoSuchFieldException("Get on service is not supported.")
    set(value) { this.withService(value) }

/**
 * @see software.amazon.awscdk.DynamicReferenceProps.Builder.withReferenceKey
 */
var software.amazon.awscdk.DynamicReferenceProps.Builder.referenceKey: String
    get() = throw NoSuchFieldException("Get on referenceKey is not supported.")
    set(value) { this.withReferenceKey(value) }


/**
 * @see software.amazon.awscdk.AutoScalingCreationPolicy.Builder
 */
fun autoScalingCreationPolicy(init: software.amazon.awscdk.AutoScalingCreationPolicy.Builder.() -> Unit): software.amazon.awscdk.AutoScalingCreationPolicy {
    val builder = software.amazon.awscdk.AutoScalingCreationPolicy.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.AutoScalingCreationPolicy.Builder.withMinSuccessfulInstancesPercent
 */
var software.amazon.awscdk.AutoScalingCreationPolicy.Builder.minSuccessfulInstancesPercent: Number
    get() = throw NoSuchFieldException("Get on minSuccessfulInstancesPercent is not supported.")
    set(value) { this.withMinSuccessfulInstancesPercent(value) }


/**
 * @see software.amazon.awscdk.StackProps.Builder
 */
fun stackProps(init: software.amazon.awscdk.StackProps.Builder.() -> Unit): software.amazon.awscdk.StackProps {
    val builder = software.amazon.awscdk.StackProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.StackProps.Builder.withStackName
 */
var software.amazon.awscdk.StackProps.Builder.stackName: String
    get() = throw NoSuchFieldException("Get on stackName is not supported.")
    set(value) { this.withStackName(value) }

/**
 * @see software.amazon.awscdk.StackProps.Builder.withEnv
 */
var software.amazon.awscdk.StackProps.Builder.env: software.amazon.awscdk.Environment
    get() = throw NoSuchFieldException("Get on env is not supported.")
    set(value) { this.withEnv(value) }

/**
 * @see software.amazon.awscdk.StackProps.Builder.withAutoDeploy
 */
var software.amazon.awscdk.StackProps.Builder.autoDeploy: Boolean
    get() = throw NoSuchFieldException("Get on autoDeploy is not supported.")
    set(value) { this.withAutoDeploy(value) }

/**
 * @see software.amazon.awscdk.StackProps.Builder.withNamingScheme
 */
var software.amazon.awscdk.StackProps.Builder.namingScheme: software.amazon.awscdk.IAddressingScheme
    get() = throw NoSuchFieldException("Get on namingScheme is not supported.")
    set(value) { this.withNamingScheme(value) }


/**
 * @see software.amazon.awscdk.UpdatePolicy.Builder
 */
fun updatePolicy(init: software.amazon.awscdk.UpdatePolicy.Builder.() -> Unit): software.amazon.awscdk.UpdatePolicy {
    val builder = software.amazon.awscdk.UpdatePolicy.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.UpdatePolicy.Builder.withUseOnlineResharding
 */
var software.amazon.awscdk.UpdatePolicy.Builder.useOnlineResharding: Boolean
    get() = throw NoSuchFieldException("Get on useOnlineResharding is not supported.")
    set(value) { this.withUseOnlineResharding(value) }

/**
 * @see software.amazon.awscdk.UpdatePolicy.Builder.withAutoScalingReplacingUpdate
 */
var software.amazon.awscdk.UpdatePolicy.Builder.autoScalingReplacingUpdate: software.amazon.awscdk.AutoScalingReplacingUpdate
    get() = throw NoSuchFieldException("Get on autoScalingReplacingUpdate is not supported.")
    set(value) { this.withAutoScalingReplacingUpdate(value) }

/**
 * @see software.amazon.awscdk.UpdatePolicy.Builder.withAutoScalingRollingUpdate
 */
var software.amazon.awscdk.UpdatePolicy.Builder.autoScalingRollingUpdate: software.amazon.awscdk.AutoScalingRollingUpdate
    get() = throw NoSuchFieldException("Get on autoScalingRollingUpdate is not supported.")
    set(value) { this.withAutoScalingRollingUpdate(value) }

/**
 * @see software.amazon.awscdk.UpdatePolicy.Builder.withAutoScalingScheduledAction
 */
var software.amazon.awscdk.UpdatePolicy.Builder.autoScalingScheduledAction: software.amazon.awscdk.AutoScalingScheduledAction
    get() = throw NoSuchFieldException("Get on autoScalingScheduledAction is not supported.")
    set(value) { this.withAutoScalingScheduledAction(value) }

/**
 * @see software.amazon.awscdk.UpdatePolicy.Builder.withCodeDeployLambdaAliasUpdate
 */
var software.amazon.awscdk.UpdatePolicy.Builder.codeDeployLambdaAliasUpdate: software.amazon.awscdk.CodeDeployLambdaAliasUpdate
    get() = throw NoSuchFieldException("Get on codeDeployLambdaAliasUpdate is not supported.")
    set(value) { this.withCodeDeployLambdaAliasUpdate(value) }


/**
 * @see software.amazon.awscdk.AutoScalingRollingUpdate.Builder
 */
fun autoScalingRollingUpdate(init: software.amazon.awscdk.AutoScalingRollingUpdate.Builder.() -> Unit): software.amazon.awscdk.AutoScalingRollingUpdate {
    val builder = software.amazon.awscdk.AutoScalingRollingUpdate.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.AutoScalingRollingUpdate.Builder.withPauseTime
 */
var software.amazon.awscdk.AutoScalingRollingUpdate.Builder.pauseTime: String
    get() = throw NoSuchFieldException("Get on pauseTime is not supported.")
    set(value) { this.withPauseTime(value) }

/**
 * @see software.amazon.awscdk.AutoScalingRollingUpdate.Builder.withMinSuccessfulInstancesPercent
 */
var software.amazon.awscdk.AutoScalingRollingUpdate.Builder.minSuccessfulInstancesPercent: Number
    get() = throw NoSuchFieldException("Get on minSuccessfulInstancesPercent is not supported.")
    set(value) { this.withMinSuccessfulInstancesPercent(value) }

/**
 * @see software.amazon.awscdk.AutoScalingRollingUpdate.Builder.withMaxBatchSize
 */
var software.amazon.awscdk.AutoScalingRollingUpdate.Builder.maxBatchSize: Number
    get() = throw NoSuchFieldException("Get on maxBatchSize is not supported.")
    set(value) { this.withMaxBatchSize(value) }

/**
 * @see software.amazon.awscdk.AutoScalingRollingUpdate.Builder.withMinInstancesInService
 */
var software.amazon.awscdk.AutoScalingRollingUpdate.Builder.minInstancesInService: Number
    get() = throw NoSuchFieldException("Get on minInstancesInService is not supported.")
    set(value) { this.withMinInstancesInService(value) }

/**
 * @see software.amazon.awscdk.AutoScalingRollingUpdate.Builder.withWaitOnResourceSignals
 */
var software.amazon.awscdk.AutoScalingRollingUpdate.Builder.waitOnResourceSignals: Boolean
    get() = throw NoSuchFieldException("Get on waitOnResourceSignals is not supported.")
    set(value) { this.withWaitOnResourceSignals(value) }


/**
 * @see software.amazon.awscdk.CreationPolicy.Builder
 */
fun creationPolicy(init: software.amazon.awscdk.CreationPolicy.Builder.() -> Unit): software.amazon.awscdk.CreationPolicy {
    val builder = software.amazon.awscdk.CreationPolicy.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.CreationPolicy.Builder.withAutoScalingCreationPolicy
 */
var software.amazon.awscdk.CreationPolicy.Builder.autoScalingCreationPolicy: software.amazon.awscdk.AutoScalingCreationPolicy
    get() = throw NoSuchFieldException("Get on autoScalingCreationPolicy is not supported.")
    set(value) { this.withAutoScalingCreationPolicy(value) }

/**
 * @see software.amazon.awscdk.CreationPolicy.Builder.withResourceSignal
 */
var software.amazon.awscdk.CreationPolicy.Builder.resourceSignal: software.amazon.awscdk.ResourceSignal
    get() = throw NoSuchFieldException("Get on resourceSignal is not supported.")
    set(value) { this.withResourceSignal(value) }


/**
 * @see software.amazon.awscdk.CodeDeployLambdaAliasUpdate.Builder
 */
fun codeDeployLambdaAliasUpdate(init: software.amazon.awscdk.CodeDeployLambdaAliasUpdate.Builder.() -> Unit): software.amazon.awscdk.CodeDeployLambdaAliasUpdate {
    val builder = software.amazon.awscdk.CodeDeployLambdaAliasUpdate.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.CodeDeployLambdaAliasUpdate.Builder.withDeploymentGroupName
 */
var software.amazon.awscdk.CodeDeployLambdaAliasUpdate.Builder.deploymentGroupName: String
    get() = throw NoSuchFieldException("Get on deploymentGroupName is not supported.")
    set(value) { this.withDeploymentGroupName(value) }

/**
 * @see software.amazon.awscdk.CodeDeployLambdaAliasUpdate.Builder.withApplicationName
 */
var software.amazon.awscdk.CodeDeployLambdaAliasUpdate.Builder.applicationName: String
    get() = throw NoSuchFieldException("Get on applicationName is not supported.")
    set(value) { this.withApplicationName(value) }

/**
 * @see software.amazon.awscdk.CodeDeployLambdaAliasUpdate.Builder.withAfterAllowTrafficHook
 */
var software.amazon.awscdk.CodeDeployLambdaAliasUpdate.Builder.afterAllowTrafficHook: String
    get() = throw NoSuchFieldException("Get on afterAllowTrafficHook is not supported.")
    set(value) { this.withAfterAllowTrafficHook(value) }

/**
 * @see software.amazon.awscdk.CodeDeployLambdaAliasUpdate.Builder.withBeforeAllowTrafficHook
 */
var software.amazon.awscdk.CodeDeployLambdaAliasUpdate.Builder.beforeAllowTrafficHook: String
    get() = throw NoSuchFieldException("Get on beforeAllowTrafficHook is not supported.")
    set(value) { this.withBeforeAllowTrafficHook(value) }


/**
 * @see software.amazon.awscdk.StringListCfnOutputProps.Builder
 */
fun stringListCfnOutputProps(init: software.amazon.awscdk.StringListCfnOutputProps.Builder.() -> Unit): software.amazon.awscdk.StringListCfnOutputProps {
    val builder = software.amazon.awscdk.StringListCfnOutputProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.StringListCfnOutputProps.Builder.withCondition
 */
var software.amazon.awscdk.StringListCfnOutputProps.Builder.condition: software.amazon.awscdk.CfnCondition
    get() = throw NoSuchFieldException("Get on condition is not supported.")
    set(value) { this.withCondition(value) }

/**
 * @see software.amazon.awscdk.StringListCfnOutputProps.Builder.withDescription
 */
var software.amazon.awscdk.StringListCfnOutputProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.StringListCfnOutputProps.Builder.withDisableExport
 */
var software.amazon.awscdk.StringListCfnOutputProps.Builder.disableExport: Boolean
    get() = throw NoSuchFieldException("Get on disableExport is not supported.")
    set(value) { this.withDisableExport(value) }

/**
 * @see software.amazon.awscdk.StringListCfnOutputProps.Builder.withExport
 */
var software.amazon.awscdk.StringListCfnOutputProps.Builder.export: String
    get() = throw NoSuchFieldException("Get on export is not supported.")
    set(value) { this.withExport(value) }

/**
 * @see software.amazon.awscdk.StringListCfnOutputProps.Builder.withSeparator
 */
var software.amazon.awscdk.StringListCfnOutputProps.Builder.separator: String
    get() = throw NoSuchFieldException("Get on separator is not supported.")
    set(value) { this.withSeparator(value) }


/**
 * @see software.amazon.awscdk.SynthesisOptions.Builder
 */
fun synthesisOptions(init: software.amazon.awscdk.SynthesisOptions.Builder.() -> Unit): software.amazon.awscdk.SynthesisOptions {
    val builder = software.amazon.awscdk.SynthesisOptions.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.SynthesisOptions.Builder.withLegacyManifest
 */
var software.amazon.awscdk.SynthesisOptions.Builder.legacyManifest: Boolean
    get() = throw NoSuchFieldException("Get on legacyManifest is not supported.")
    set(value) { this.withLegacyManifest(value) }

/**
 * @see software.amazon.awscdk.SynthesisOptions.Builder.withRuntimeInformation
 */
var software.amazon.awscdk.SynthesisOptions.Builder.runtimeInformation: Boolean
    get() = throw NoSuchFieldException("Get on runtimeInformation is not supported.")
    set(value) { this.withRuntimeInformation(value) }

/**
 * @see software.amazon.awscdk.SynthesisOptions.Builder.withSkipValidation
 */
var software.amazon.awscdk.SynthesisOptions.Builder.skipValidation: Boolean
    get() = throw NoSuchFieldException("Get on skipValidation is not supported.")
    set(value) { this.withSkipValidation(value) }

/**
 * @see software.amazon.awscdk.SynthesisOptions.Builder.withStore
 */
var software.amazon.awscdk.SynthesisOptions.Builder.store: software.amazon.awscdk.ISessionStore
    get() = throw NoSuchFieldException("Get on store is not supported.")
    set(value) { this.withStore(value) }


/**
 * @see software.amazon.awscdk.AutoScalingReplacingUpdate.Builder
 */
fun autoScalingReplacingUpdate(init: software.amazon.awscdk.AutoScalingReplacingUpdate.Builder.() -> Unit): software.amazon.awscdk.AutoScalingReplacingUpdate {
    val builder = software.amazon.awscdk.AutoScalingReplacingUpdate.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.AutoScalingReplacingUpdate.Builder.withWillReplace
 */
var software.amazon.awscdk.AutoScalingReplacingUpdate.Builder.willReplace: Boolean
    get() = throw NoSuchFieldException("Get on willReplace is not supported.")
    set(value) { this.withWillReplace(value) }


/**
 * @see software.amazon.awscdk.SecretParameterProps.Builder
 */
fun secretParameterProps(init: software.amazon.awscdk.SecretParameterProps.Builder.() -> Unit): software.amazon.awscdk.SecretParameterProps {
    val builder = software.amazon.awscdk.SecretParameterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.SecretParameterProps.Builder.withAllowedPattern
 */
var software.amazon.awscdk.SecretParameterProps.Builder.allowedPattern: String
    get() = throw NoSuchFieldException("Get on allowedPattern is not supported.")
    set(value) { this.withAllowedPattern(value) }

/**
 * @see software.amazon.awscdk.SecretParameterProps.Builder.withDescription
 */
var software.amazon.awscdk.SecretParameterProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.SecretParameterProps.Builder.withConstraintDescription
 */
var software.amazon.awscdk.SecretParameterProps.Builder.constraintDescription: String
    get() = throw NoSuchFieldException("Get on constraintDescription is not supported.")
    set(value) { this.withConstraintDescription(value) }

/**
 * @see software.amazon.awscdk.SecretParameterProps.Builder.withMaxLength
 */
var software.amazon.awscdk.SecretParameterProps.Builder.maxLength: Number
    get() = throw NoSuchFieldException("Get on maxLength is not supported.")
    set(value) { this.withMaxLength(value) }

/**
 * @see software.amazon.awscdk.SecretParameterProps.Builder.withMinLength
 */
var software.amazon.awscdk.SecretParameterProps.Builder.minLength: Number
    get() = throw NoSuchFieldException("Get on minLength is not supported.")
    set(value) { this.withMinLength(value) }

/**
 * @see software.amazon.awscdk.SecretParameterProps.Builder.withSsmParameter
 */
var software.amazon.awscdk.SecretParameterProps.Builder.ssmParameter: String
    get() = throw NoSuchFieldException("Get on ssmParameter is not supported.")
    set(value) { this.withSsmParameter(value) }


/**
 * @see software.amazon.awscdk.MetadataEntry.Builder
 */
fun metadataEntry(init: software.amazon.awscdk.MetadataEntry.Builder.() -> Unit): software.amazon.awscdk.MetadataEntry {
    val builder = software.amazon.awscdk.MetadataEntry.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.MetadataEntry.Builder.withData
 */
var software.amazon.awscdk.MetadataEntry.Builder.data: Any
    get() = throw NoSuchFieldException("Get on data is not supported.")
    set(value) { this.withData(value) }

/**
 * @see software.amazon.awscdk.MetadataEntry.Builder.withType
 */
var software.amazon.awscdk.MetadataEntry.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.Dependency.Builder
 */
fun dependency(init: software.amazon.awscdk.Dependency.Builder.() -> Unit): software.amazon.awscdk.Dependency {
    val builder = software.amazon.awscdk.Dependency.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.Dependency.Builder.withTarget
 */
var software.amazon.awscdk.Dependency.Builder.target: software.amazon.awscdk.IConstruct
    get() = throw NoSuchFieldException("Get on target is not supported.")
    set(value) { this.withTarget(value) }

/**
 * @see software.amazon.awscdk.Dependency.Builder.withSource
 */
var software.amazon.awscdk.Dependency.Builder.source: software.amazon.awscdk.IConstruct
    get() = throw NoSuchFieldException("Get on source is not supported.")
    set(value) { this.withSource(value) }


/**
 * @see software.amazon.awscdk.IncludeProps.Builder
 */
fun includeProps(init: software.amazon.awscdk.IncludeProps.Builder.() -> Unit): software.amazon.awscdk.IncludeProps {
    val builder = software.amazon.awscdk.IncludeProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.IncludeProps.Builder.withTemplate
 */
var software.amazon.awscdk.IncludeProps.Builder.template: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on template is not supported.")
    set(value) { this.withTemplate(value) }


/**
 * @see software.amazon.awscdk.AppProps.Builder
 */
fun appProps(init: software.amazon.awscdk.AppProps.Builder.() -> Unit): software.amazon.awscdk.AppProps {
    val builder = software.amazon.awscdk.AppProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.AppProps.Builder.withAutoRun
 */
var software.amazon.awscdk.AppProps.Builder.autoRun: Boolean
    get() = throw NoSuchFieldException("Get on autoRun is not supported.")
    set(value) { this.withAutoRun(value) }


/**
 * @see software.amazon.awscdk.ManifestOptions.Builder
 */
fun manifestOptions(init: software.amazon.awscdk.ManifestOptions.Builder.() -> Unit): software.amazon.awscdk.ManifestOptions {
    val builder = software.amazon.awscdk.ManifestOptions.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.ManifestOptions.Builder.withLegacyManifest
 */
var software.amazon.awscdk.ManifestOptions.Builder.legacyManifest: Boolean
    get() = throw NoSuchFieldException("Get on legacyManifest is not supported.")
    set(value) { this.withLegacyManifest(value) }

/**
 * @see software.amazon.awscdk.ManifestOptions.Builder.withRuntimeInformation
 */
var software.amazon.awscdk.ManifestOptions.Builder.runtimeInformation: Boolean
    get() = throw NoSuchFieldException("Get on runtimeInformation is not supported.")
    set(value) { this.withRuntimeInformation(value) }


/**
 * @see software.amazon.awscdk.CfnParameterProps.Builder
 */
fun cfnParameterProps(init: software.amazon.awscdk.CfnParameterProps.Builder.() -> Unit): software.amazon.awscdk.CfnParameterProps {
    val builder = software.amazon.awscdk.CfnParameterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.CfnParameterProps.Builder.withAllowedPattern
 */
var software.amazon.awscdk.CfnParameterProps.Builder.allowedPattern: String
    get() = throw NoSuchFieldException("Get on allowedPattern is not supported.")
    set(value) { this.withAllowedPattern(value) }

/**
 * @see software.amazon.awscdk.CfnParameterProps.Builder.withType
 */
var software.amazon.awscdk.CfnParameterProps.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.CfnParameterProps.Builder.withDefault
 */
var software.amazon.awscdk.CfnParameterProps.Builder.default: Any
    get() = throw NoSuchFieldException("Get on default is not supported.")
    set(value) { this.withDefault(value) }

/**
 * @see software.amazon.awscdk.CfnParameterProps.Builder.withDescription
 */
var software.amazon.awscdk.CfnParameterProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.CfnParameterProps.Builder.withConstraintDescription
 */
var software.amazon.awscdk.CfnParameterProps.Builder.constraintDescription: String
    get() = throw NoSuchFieldException("Get on constraintDescription is not supported.")
    set(value) { this.withConstraintDescription(value) }

/**
 * @see software.amazon.awscdk.CfnParameterProps.Builder.withMaxLength
 */
var software.amazon.awscdk.CfnParameterProps.Builder.maxLength: Number
    get() = throw NoSuchFieldException("Get on maxLength is not supported.")
    set(value) { this.withMaxLength(value) }

/**
 * @see software.amazon.awscdk.CfnParameterProps.Builder.withMaxValue
 */
var software.amazon.awscdk.CfnParameterProps.Builder.maxValue: Number
    get() = throw NoSuchFieldException("Get on maxValue is not supported.")
    set(value) { this.withMaxValue(value) }

/**
 * @see software.amazon.awscdk.CfnParameterProps.Builder.withMinLength
 */
var software.amazon.awscdk.CfnParameterProps.Builder.minLength: Number
    get() = throw NoSuchFieldException("Get on minLength is not supported.")
    set(value) { this.withMinLength(value) }

/**
 * @see software.amazon.awscdk.CfnParameterProps.Builder.withMinValue
 */
var software.amazon.awscdk.CfnParameterProps.Builder.minValue: Number
    get() = throw NoSuchFieldException("Get on minValue is not supported.")
    set(value) { this.withMinValue(value) }

/**
 * @see software.amazon.awscdk.CfnParameterProps.Builder.withNoEcho
 */
var software.amazon.awscdk.CfnParameterProps.Builder.noEcho: Boolean
    get() = throw NoSuchFieldException("Get on noEcho is not supported.")
    set(value) { this.withNoEcho(value) }


/**
 * @see software.amazon.awscdk.CfnTag.Builder
 */
fun cfnTag(init: software.amazon.awscdk.CfnTag.Builder.() -> Unit): software.amazon.awscdk.CfnTag {
    val builder = software.amazon.awscdk.CfnTag.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.CfnTag.Builder.withKey
 */
var software.amazon.awscdk.CfnTag.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.CfnTag.Builder.withValue
 */
var software.amazon.awscdk.CfnTag.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }


/**
 * @see software.amazon.awscdk.CfnConditionProps.Builder
 */
fun cfnConditionProps(init: software.amazon.awscdk.CfnConditionProps.Builder.() -> Unit): software.amazon.awscdk.CfnConditionProps {
    val builder = software.amazon.awscdk.CfnConditionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.CfnConditionProps.Builder.withExpression
 */
var software.amazon.awscdk.CfnConditionProps.Builder.expression: software.amazon.awscdk.ICfnConditionExpression
    get() = throw NoSuchFieldException("Get on expression is not supported.")
    set(value) { this.withExpression(value) }


/**
 * @see software.amazon.awscdk.CfnOutputProps.Builder
 */
fun cfnOutputProps(init: software.amazon.awscdk.CfnOutputProps.Builder.() -> Unit): software.amazon.awscdk.CfnOutputProps {
    val builder = software.amazon.awscdk.CfnOutputProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.CfnOutputProps.Builder.withValue
 */
var software.amazon.awscdk.CfnOutputProps.Builder.value: Any
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.CfnOutputProps.Builder.withCondition
 */
var software.amazon.awscdk.CfnOutputProps.Builder.condition: software.amazon.awscdk.CfnCondition
    get() = throw NoSuchFieldException("Get on condition is not supported.")
    set(value) { this.withCondition(value) }

/**
 * @see software.amazon.awscdk.CfnOutputProps.Builder.withDescription
 */
var software.amazon.awscdk.CfnOutputProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.CfnOutputProps.Builder.withDisableExport
 */
var software.amazon.awscdk.CfnOutputProps.Builder.disableExport: Boolean
    get() = throw NoSuchFieldException("Get on disableExport is not supported.")
    set(value) { this.withDisableExport(value) }

/**
 * @see software.amazon.awscdk.CfnOutputProps.Builder.withExport
 */
var software.amazon.awscdk.CfnOutputProps.Builder.export: String
    get() = throw NoSuchFieldException("Get on export is not supported.")
    set(value) { this.withExport(value) }


/**
 * @see software.amazon.awscdk.FileSystemStoreOptions.Builder
 */
fun fileSystemStoreOptions(init: software.amazon.awscdk.FileSystemStoreOptions.Builder.() -> Unit): software.amazon.awscdk.FileSystemStoreOptions {
    val builder = software.amazon.awscdk.FileSystemStoreOptions.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.FileSystemStoreOptions.Builder.withOutdir
 */
var software.amazon.awscdk.FileSystemStoreOptions.Builder.outdir: String
    get() = throw NoSuchFieldException("Get on outdir is not supported.")
    set(value) { this.withOutdir(value) }


/**
 * @see software.amazon.awscdk.ArnComponents.Builder
 */
fun arnComponents(init: software.amazon.awscdk.ArnComponents.Builder.() -> Unit): software.amazon.awscdk.ArnComponents {
    val builder = software.amazon.awscdk.ArnComponents.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.ArnComponents.Builder.withService
 */
var software.amazon.awscdk.ArnComponents.Builder.service: String
    get() = throw NoSuchFieldException("Get on service is not supported.")
    set(value) { this.withService(value) }

/**
 * @see software.amazon.awscdk.ArnComponents.Builder.withRegion
 */
var software.amazon.awscdk.ArnComponents.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.ArnComponents.Builder.withAccount
 */
var software.amazon.awscdk.ArnComponents.Builder.account: String
    get() = throw NoSuchFieldException("Get on account is not supported.")
    set(value) { this.withAccount(value) }

/**
 * @see software.amazon.awscdk.ArnComponents.Builder.withResource
 */
var software.amazon.awscdk.ArnComponents.Builder.resource: String
    get() = throw NoSuchFieldException("Get on resource is not supported.")
    set(value) { this.withResource(value) }

/**
 * @see software.amazon.awscdk.ArnComponents.Builder.withSep
 */
var software.amazon.awscdk.ArnComponents.Builder.sep: String
    get() = throw NoSuchFieldException("Get on sep is not supported.")
    set(value) { this.withSep(value) }

/**
 * @see software.amazon.awscdk.ArnComponents.Builder.withPartition
 */
var software.amazon.awscdk.ArnComponents.Builder.partition: String
    get() = throw NoSuchFieldException("Get on partition is not supported.")
    set(value) { this.withPartition(value) }

/**
 * @see software.amazon.awscdk.ArnComponents.Builder.withResourceName
 */
var software.amazon.awscdk.ArnComponents.Builder.resourceName: String
    get() = throw NoSuchFieldException("Get on resourceName is not supported.")
    set(value) { this.withResourceName(value) }


/**
 * @see software.amazon.awscdk.CfnMappingProps.Builder
 */
fun cfnMappingProps(init: software.amazon.awscdk.CfnMappingProps.Builder.() -> Unit): software.amazon.awscdk.CfnMappingProps {
    val builder = software.amazon.awscdk.CfnMappingProps.Builder()
    builder.init()
    return builder.build()
}


/**
 * @see software.amazon.awscdk.OutgoingReference.Builder
 */
fun outgoingReference(init: software.amazon.awscdk.OutgoingReference.Builder.() -> Unit): software.amazon.awscdk.OutgoingReference {
    val builder = software.amazon.awscdk.OutgoingReference.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.OutgoingReference.Builder.withReference
 */
var software.amazon.awscdk.OutgoingReference.Builder.reference: software.amazon.awscdk.Reference
    get() = throw NoSuchFieldException("Get on reference is not supported.")
    set(value) { this.withReference(value) }

/**
 * @see software.amazon.awscdk.OutgoingReference.Builder.withSource
 */
var software.amazon.awscdk.OutgoingReference.Builder.source: software.amazon.awscdk.IConstruct
    get() = throw NoSuchFieldException("Get on source is not supported.")
    set(value) { this.withSource(value) }
