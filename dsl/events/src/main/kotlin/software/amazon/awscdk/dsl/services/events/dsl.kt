package software.amazon.awscdk.dsl.services.events
/**
 * @see software.amazon.awscdk.services.events.CfnEventBusPolicy
 */
fun software.amazon.awscdk.Construct.cfnEventBusPolicy(id: String,
                     props: software.amazon.awscdk.services.events.CfnEventBusPolicyProps? = null,
                     init: (software.amazon.awscdk.services.events.CfnEventBusPolicy.() -> Unit)? = null)
        : software.amazon.awscdk.services.events.CfnEventBusPolicy {

    val obj = software.amazon.awscdk.services.events.CfnEventBusPolicy(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.events.EventRule
 */
fun software.amazon.awscdk.Construct.eventRule(id: String,
                     props: software.amazon.awscdk.services.events.EventRuleProps? = null,
                     init: (software.amazon.awscdk.services.events.EventRule.() -> Unit)? = null)
        : software.amazon.awscdk.services.events.EventRule {

    val obj = software.amazon.awscdk.services.events.EventRule(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.events.CfnRule
 */
fun software.amazon.awscdk.Construct.cfnRule(id: String,
                     props: software.amazon.awscdk.services.events.CfnRuleProps? = null,
                     init: (software.amazon.awscdk.services.events.CfnRule.() -> Unit)? = null)
        : software.amazon.awscdk.services.events.CfnRule {

    val obj = software.amazon.awscdk.services.events.CfnRule(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.events.EventRule
 */
fun software.amazon.awscdk.Construct.eventRule(id: String,
                     init: (software.amazon.awscdk.services.events.EventRule.() -> Unit)? = null)
        : software.amazon.awscdk.services.events.EventRule {

    val obj = software.amazon.awscdk.services.events.EventRule(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.events.CfnRule
 */
fun software.amazon.awscdk.Construct.cfnRule(id: String,
                     init: (software.amazon.awscdk.services.events.CfnRule.() -> Unit)? = null)
        : software.amazon.awscdk.services.events.CfnRule {

    val obj = software.amazon.awscdk.services.events.CfnRule(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.events.CfnEventBusPolicyProps.Builder
 */
fun cfnEventBusPolicyProps(init: software.amazon.awscdk.services.events.CfnEventBusPolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.events.CfnEventBusPolicyProps {
    val builder = software.amazon.awscdk.services.events.CfnEventBusPolicyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.events.CfnEventBusPolicyProps.Builder.withCondition
 */
var software.amazon.awscdk.services.events.CfnEventBusPolicyProps.Builder.condition: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on condition is not supported.")
    set(value) { this.withCondition(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnEventBusPolicyProps.Builder.withAction
 */
var software.amazon.awscdk.services.events.CfnEventBusPolicyProps.Builder.action: String
    get() = throw NoSuchFieldException("Get on action is not supported.")
    set(value) { this.withAction(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnEventBusPolicyProps.Builder.withPrincipal
 */
var software.amazon.awscdk.services.events.CfnEventBusPolicyProps.Builder.principal: String
    get() = throw NoSuchFieldException("Get on principal is not supported.")
    set(value) { this.withPrincipal(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnEventBusPolicyProps.Builder.withStatementId
 */
var software.amazon.awscdk.services.events.CfnEventBusPolicyProps.Builder.statementId: String
    get() = throw NoSuchFieldException("Get on statementId is not supported.")
    set(value) { this.withStatementId(value) }


/**
 * @see software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty.Builder
 */
fun sqsParametersProperty(init: software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty.Builder.() -> Unit): software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty {
    val builder = software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty.Builder.withMessageGroupId
 */
var software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty.Builder.messageGroupId: String
    get() = throw NoSuchFieldException("Get on messageGroupId is not supported.")
    set(value) { this.withMessageGroupId(value) }


/**
 * @see software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty.Builder
 */
fun runCommandParametersProperty(init: software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty.Builder.() -> Unit): software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty {
    val builder = software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty.Builder.withRunCommandTargets
 */
var software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty.Builder.runCommandTargets: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on runCommandTargets is not supported.")
    set(value) { this.withRunCommandTargets(value) }


/**
 * @see software.amazon.awscdk.services.events.TargetInputTemplate.Builder
 */
fun targetInputTemplate(init: software.amazon.awscdk.services.events.TargetInputTemplate.Builder.() -> Unit): software.amazon.awscdk.services.events.TargetInputTemplate {
    val builder = software.amazon.awscdk.services.events.TargetInputTemplate.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.events.TargetInputTemplate.Builder.withJsonTemplate
 */
var software.amazon.awscdk.services.events.TargetInputTemplate.Builder.jsonTemplate: Any
    get() = throw NoSuchFieldException("Get on jsonTemplate is not supported.")
    set(value) { this.withJsonTemplate(value) }

/**
 * @see software.amazon.awscdk.services.events.TargetInputTemplate.Builder.withTextTemplate
 */
var software.amazon.awscdk.services.events.TargetInputTemplate.Builder.textTemplate: String
    get() = throw NoSuchFieldException("Get on textTemplate is not supported.")
    set(value) { this.withTextTemplate(value) }


/**
 * @see software.amazon.awscdk.services.events.EventRuleTargetProps.Builder
 */
fun eventRuleTargetProps(init: software.amazon.awscdk.services.events.EventRuleTargetProps.Builder.() -> Unit): software.amazon.awscdk.services.events.EventRuleTargetProps {
    val builder = software.amazon.awscdk.services.events.EventRuleTargetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.events.EventRuleTargetProps.Builder.withId
 */
var software.amazon.awscdk.services.events.EventRuleTargetProps.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.services.events.EventRuleTargetProps.Builder.withEcsParameters
 */
var software.amazon.awscdk.services.events.EventRuleTargetProps.Builder.ecsParameters: software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty
    get() = throw NoSuchFieldException("Get on ecsParameters is not supported.")
    set(value) { this.withEcsParameters(value) }

/**
 * @see software.amazon.awscdk.services.events.EventRuleTargetProps.Builder.withKinesisParameters
 */
var software.amazon.awscdk.services.events.EventRuleTargetProps.Builder.kinesisParameters: software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty
    get() = throw NoSuchFieldException("Get on kinesisParameters is not supported.")
    set(value) { this.withKinesisParameters(value) }

/**
 * @see software.amazon.awscdk.services.events.EventRuleTargetProps.Builder.withRunCommandParameters
 */
var software.amazon.awscdk.services.events.EventRuleTargetProps.Builder.runCommandParameters: software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty
    get() = throw NoSuchFieldException("Get on runCommandParameters is not supported.")
    set(value) { this.withRunCommandParameters(value) }

/**
 * @see software.amazon.awscdk.services.events.EventRuleTargetProps.Builder.withRoleArn
 */
var software.amazon.awscdk.services.events.EventRuleTargetProps.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.events.EventRuleTargetProps.Builder.withArn
 */
var software.amazon.awscdk.services.events.EventRuleTargetProps.Builder.arn: String
    get() = throw NoSuchFieldException("Get on arn is not supported.")
    set(value) { this.withArn(value) }


/**
 * @see software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty.Builder
 */
fun conditionProperty(init: software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty.Builder.() -> Unit): software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty {
    val builder = software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty.Builder.withKey
 */
var software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty.Builder.withValue
 */
var software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty.Builder.withType
 */
var software.amazon.awscdk.services.events.CfnEventBusPolicy.ConditionProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty.Builder
 */
fun inputTransformerProperty(init: software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty.Builder.() -> Unit): software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty {
    val builder = software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty.Builder.withInputPathsMap
 */
var software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty.Builder.inputPathsMap: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on inputPathsMap is not supported.")
    set(value) { this.withInputPathsMap(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty.Builder.withInputTemplate
 */
var software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty.Builder.inputTemplate: String
    get() = throw NoSuchFieldException("Get on inputTemplate is not supported.")
    set(value) { this.withInputTemplate(value) }


/**
 * @see software.amazon.awscdk.services.events.EventPattern.Builder
 */
fun eventPattern(init: software.amazon.awscdk.services.events.EventPattern.Builder.() -> Unit): software.amazon.awscdk.services.events.EventPattern {
    val builder = software.amazon.awscdk.services.events.EventPattern.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.events.EventPattern.Builder.withDetail
 */
var software.amazon.awscdk.services.events.EventPattern.Builder.detail: Any
    get() = throw NoSuchFieldException("Get on detail is not supported.")
    set(value) { this.withDetail(value) }


/**
 * @see software.amazon.awscdk.services.events.CfnRuleProps.Builder
 */
fun cfnRuleProps(init: software.amazon.awscdk.services.events.CfnRuleProps.Builder.() -> Unit): software.amazon.awscdk.services.events.CfnRuleProps {
    val builder = software.amazon.awscdk.services.events.CfnRuleProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.events.CfnRuleProps.Builder.withEventPattern
 */
var software.amazon.awscdk.services.events.CfnRuleProps.Builder.eventPattern: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on eventPattern is not supported.")
    set(value) { this.withEventPattern(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnRuleProps.Builder.withRoleArn
 */
var software.amazon.awscdk.services.events.CfnRuleProps.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnRuleProps.Builder.withScheduleExpression
 */
var software.amazon.awscdk.services.events.CfnRuleProps.Builder.scheduleExpression: String
    get() = throw NoSuchFieldException("Get on scheduleExpression is not supported.")
    set(value) { this.withScheduleExpression(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnRuleProps.Builder.withState
 */
var software.amazon.awscdk.services.events.CfnRuleProps.Builder.state: String
    get() = throw NoSuchFieldException("Get on state is not supported.")
    set(value) { this.withState(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnRuleProps.Builder.withName
 */
var software.amazon.awscdk.services.events.CfnRuleProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnRuleProps.Builder.withTargets
 */
var software.amazon.awscdk.services.events.CfnRuleProps.Builder.targets: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on targets is not supported.")
    set(value) { this.withTargets(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnRuleProps.Builder.withDescription
 */
var software.amazon.awscdk.services.events.CfnRuleProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.events.EventRuleImportProps.Builder
 */
fun eventRuleImportProps(init: software.amazon.awscdk.services.events.EventRuleImportProps.Builder.() -> Unit): software.amazon.awscdk.services.events.EventRuleImportProps {
    val builder = software.amazon.awscdk.services.events.EventRuleImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.events.EventRuleImportProps.Builder.withEventRuleArn
 */
var software.amazon.awscdk.services.events.EventRuleImportProps.Builder.eventRuleArn: String
    get() = throw NoSuchFieldException("Get on eventRuleArn is not supported.")
    set(value) { this.withEventRuleArn(value) }


/**
 * @see software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty.Builder
 */
fun ecsParametersProperty(init: software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty.Builder.() -> Unit): software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty {
    val builder = software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty.Builder.withTaskDefinitionArn
 */
var software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty.Builder.taskDefinitionArn: String
    get() = throw NoSuchFieldException("Get on taskDefinitionArn is not supported.")
    set(value) { this.withTaskDefinitionArn(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty.Builder.withTaskCount
 */
var software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty.Builder.taskCount: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on taskCount is not supported.")
    set(value) { this.withTaskCount(value) }


/**
 * @see software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty.Builder
 */
fun kinesisParametersProperty(init: software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty.Builder.() -> Unit): software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty {
    val builder = software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty.Builder.withPartitionKeyPath
 */
var software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty.Builder.partitionKeyPath: String
    get() = throw NoSuchFieldException("Get on partitionKeyPath is not supported.")
    set(value) { this.withPartitionKeyPath(value) }


/**
 * @see software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder
 */
fun targetProperty(init: software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.() -> Unit): software.amazon.awscdk.services.events.CfnRule.TargetProperty {
    val builder = software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.withId
 */
var software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.withEcsParameters
 */
var software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.ecsParameters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ecsParameters is not supported.")
    set(value) { this.withEcsParameters(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.withKinesisParameters
 */
var software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.kinesisParameters: software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty
    get() = throw NoSuchFieldException("Get on kinesisParameters is not supported.")
    set(value) { this.withKinesisParameters(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.withRunCommandParameters
 */
var software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.runCommandParameters: software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty
    get() = throw NoSuchFieldException("Get on runCommandParameters is not supported.")
    set(value) { this.withRunCommandParameters(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.withArn
 */
var software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.arn: String
    get() = throw NoSuchFieldException("Get on arn is not supported.")
    set(value) { this.withArn(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.withInput
 */
var software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.input: String
    get() = throw NoSuchFieldException("Get on input is not supported.")
    set(value) { this.withInput(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.withInputTransformer
 */
var software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.inputTransformer: software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty
    get() = throw NoSuchFieldException("Get on inputTransformer is not supported.")
    set(value) { this.withInputTransformer(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.withSqsParameters
 */
var software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.sqsParameters: software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty
    get() = throw NoSuchFieldException("Get on sqsParameters is not supported.")
    set(value) { this.withSqsParameters(value) }

/**
 * @see software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.withInputPath
 */
var software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder.inputPath: String
    get() = throw NoSuchFieldException("Get on inputPath is not supported.")
    set(value) { this.withInputPath(value) }


/**
 * @see software.amazon.awscdk.services.events.EventRuleProps.Builder
 */
fun eventRuleProps(init: software.amazon.awscdk.services.events.EventRuleProps.Builder.() -> Unit): software.amazon.awscdk.services.events.EventRuleProps {
    val builder = software.amazon.awscdk.services.events.EventRuleProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.events.EventRuleProps.Builder.withEventPattern
 */
var software.amazon.awscdk.services.events.EventRuleProps.Builder.eventPattern: software.amazon.awscdk.services.events.EventPattern
    get() = throw NoSuchFieldException("Get on eventPattern is not supported.")
    set(value) { this.withEventPattern(value) }

/**
 * @see software.amazon.awscdk.services.events.EventRuleProps.Builder.withScheduleExpression
 */
var software.amazon.awscdk.services.events.EventRuleProps.Builder.scheduleExpression: String
    get() = throw NoSuchFieldException("Get on scheduleExpression is not supported.")
    set(value) { this.withScheduleExpression(value) }

/**
 * @see software.amazon.awscdk.services.events.EventRuleProps.Builder.withEnabled
 */
var software.amazon.awscdk.services.events.EventRuleProps.Builder.enabled: Boolean
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }

/**
 * @see software.amazon.awscdk.services.events.EventRuleProps.Builder.withDescription
 */
var software.amazon.awscdk.services.events.EventRuleProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.events.EventRuleProps.Builder.withRuleName
 */
var software.amazon.awscdk.services.events.EventRuleProps.Builder.ruleName: String
    get() = throw NoSuchFieldException("Get on ruleName is not supported.")
    set(value) { this.withRuleName(value) }


/**
 * @see software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty.Builder
 */
fun runCommandTargetProperty(init: software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty.Builder.() -> Unit): software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty {
    val builder = software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty.Builder.withKey
 */
var software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }
