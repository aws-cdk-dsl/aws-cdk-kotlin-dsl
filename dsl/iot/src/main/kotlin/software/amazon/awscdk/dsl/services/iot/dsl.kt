package software.amazon.awscdk.dsl.services.iot
/**
 * @see software.amazon.awscdk.services.iot.CfnCertificate
 */
fun software.amazon.awscdk.Construct.cfnCertificate(id: String,
                     props: software.amazon.awscdk.services.iot.CfnCertificateProps? = null,
                     init: (software.amazon.awscdk.services.iot.CfnCertificate.() -> Unit)? = null)
        : software.amazon.awscdk.services.iot.CfnCertificate {

    val obj = software.amazon.awscdk.services.iot.CfnCertificate(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment
 */
fun software.amazon.awscdk.Construct.cfnPolicyPrincipalAttachment(id: String,
                     props: software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps? = null,
                     init: (software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment.() -> Unit)? = null)
        : software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment {

    val obj = software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment
 */
fun software.amazon.awscdk.Construct.cfnThingPrincipalAttachment(id: String,
                     props: software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps? = null,
                     init: (software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment.() -> Unit)? = null)
        : software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment {

    val obj = software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.iot.CfnThing
 */
fun software.amazon.awscdk.Construct.cfnThing(id: String,
                     props: software.amazon.awscdk.services.iot.CfnThingProps? = null,
                     init: (software.amazon.awscdk.services.iot.CfnThing.() -> Unit)? = null)
        : software.amazon.awscdk.services.iot.CfnThing {

    val obj = software.amazon.awscdk.services.iot.CfnThing(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule
 */
fun software.amazon.awscdk.Construct.cfnTopicRule(id: String,
                     props: software.amazon.awscdk.services.iot.CfnTopicRuleProps? = null,
                     init: (software.amazon.awscdk.services.iot.CfnTopicRule.() -> Unit)? = null)
        : software.amazon.awscdk.services.iot.CfnTopicRule {

    val obj = software.amazon.awscdk.services.iot.CfnTopicRule(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.iot.CfnPolicy
 */
fun software.amazon.awscdk.Construct.cfnPolicy(id: String,
                     props: software.amazon.awscdk.services.iot.CfnPolicyProps? = null,
                     init: (software.amazon.awscdk.services.iot.CfnPolicy.() -> Unit)? = null)
        : software.amazon.awscdk.services.iot.CfnPolicy {

    val obj = software.amazon.awscdk.services.iot.CfnPolicy(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.iot.CfnThing
 */
fun software.amazon.awscdk.Construct.cfnThing(id: String,
                     init: (software.amazon.awscdk.services.iot.CfnThing.() -> Unit)? = null)
        : software.amazon.awscdk.services.iot.CfnThing {

    val obj = software.amazon.awscdk.services.iot.CfnThing(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty.Builder
 */
fun stepFunctionsActionProperty(init: software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty {
    val builder = software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty.Builder.withStateMachineName
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty.Builder.stateMachineName: String
    get() = throw NoSuchFieldException("Get on stateMachineName is not supported.")
    set(value) { this.withStateMachineName(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty.Builder.withExecutionNamePrefix
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty.Builder.executionNamePrefix: String
    get() = throw NoSuchFieldException("Get on executionNamePrefix is not supported.")
    set(value) { this.withExecutionNamePrefix(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty.Builder
 */
fun putItemInputProperty(init: software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty {
    val builder = software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty.Builder.withTableName
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty.Builder.tableName: String
    get() = throw NoSuchFieldException("Get on tableName is not supported.")
    set(value) { this.withTableName(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty.Builder
 */
fun lambdaActionProperty(init: software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty {
    val builder = software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty.Builder.withFunctionArn
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty.Builder.functionArn: String
    get() = throw NoSuchFieldException("Get on functionArn is not supported.")
    set(value) { this.withFunctionArn(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnPolicyProps.Builder
 */
fun cfnPolicyProps(init: software.amazon.awscdk.services.iot.CfnPolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnPolicyProps {
    val builder = software.amazon.awscdk.services.iot.CfnPolicyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnPolicyProps.Builder.withPolicyDocument
 */
var software.amazon.awscdk.services.iot.CfnPolicyProps.Builder.policyDocument: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on policyDocument is not supported.")
    set(value) { this.withPolicyDocument(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnPolicyProps.Builder.withPolicyName
 */
var software.amazon.awscdk.services.iot.CfnPolicyProps.Builder.policyName: String
    get() = throw NoSuchFieldException("Get on policyName is not supported.")
    set(value) { this.withPolicyName(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnCertificateProps.Builder
 */
fun cfnCertificateProps(init: software.amazon.awscdk.services.iot.CfnCertificateProps.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnCertificateProps {
    val builder = software.amazon.awscdk.services.iot.CfnCertificateProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnCertificateProps.Builder.withCertificateSigningRequest
 */
var software.amazon.awscdk.services.iot.CfnCertificateProps.Builder.certificateSigningRequest: String
    get() = throw NoSuchFieldException("Get on certificateSigningRequest is not supported.")
    set(value) { this.withCertificateSigningRequest(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnCertificateProps.Builder.withStatus
 */
var software.amazon.awscdk.services.iot.CfnCertificateProps.Builder.status: String
    get() = throw NoSuchFieldException("Get on status is not supported.")
    set(value) { this.withStatus(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty.Builder
 */
fun iotAnalyticsActionProperty(init: software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty {
    val builder = software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty.Builder.withChannelName
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty.Builder.channelName: String
    get() = throw NoSuchFieldException("Get on channelName is not supported.")
    set(value) { this.withChannelName(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder
 */
fun cloudwatchMetricActionProperty(init: software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty {
    val builder = software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder.withMetricNamespace
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder.metricNamespace: String
    get() = throw NoSuchFieldException("Get on metricNamespace is not supported.")
    set(value) { this.withMetricNamespace(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder.withMetricValue
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder.metricValue: String
    get() = throw NoSuchFieldException("Get on metricValue is not supported.")
    set(value) { this.withMetricValue(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder.withMetricName
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder.metricName: String
    get() = throw NoSuchFieldException("Get on metricName is not supported.")
    set(value) { this.withMetricName(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder.withMetricTimestamp
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder.metricTimestamp: String
    get() = throw NoSuchFieldException("Get on metricTimestamp is not supported.")
    set(value) { this.withMetricTimestamp(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder.withMetricUnit
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder.metricUnit: String
    get() = throw NoSuchFieldException("Get on metricUnit is not supported.")
    set(value) { this.withMetricUnit(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps.Builder
 */
fun cfnThingPrincipalAttachmentProps(init: software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps {
    val builder = software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps.Builder.withPrincipal
 */
var software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps.Builder.principal: String
    get() = throw NoSuchFieldException("Get on principal is not supported.")
    set(value) { this.withPrincipal(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps.Builder.withThingName
 */
var software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps.Builder.thingName: String
    get() = throw NoSuchFieldException("Get on thingName is not supported.")
    set(value) { this.withThingName(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnThingProps.Builder
 */
fun cfnThingProps(init: software.amazon.awscdk.services.iot.CfnThingProps.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnThingProps {
    val builder = software.amazon.awscdk.services.iot.CfnThingProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnThingProps.Builder.withThingName
 */
var software.amazon.awscdk.services.iot.CfnThingProps.Builder.thingName: String
    get() = throw NoSuchFieldException("Get on thingName is not supported.")
    set(value) { this.withThingName(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnThingProps.Builder.withAttributePayload
 */
var software.amazon.awscdk.services.iot.CfnThingProps.Builder.attributePayload: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on attributePayload is not supported.")
    set(value) { this.withAttributePayload(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder
 */
fun actionProperty(init: software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty {
    val builder = software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.withSns
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.sns: software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty
    get() = throw NoSuchFieldException("Get on sns is not supported.")
    set(value) { this.withSns(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.withSqs
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.sqs: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on sqs is not supported.")
    set(value) { this.withSqs(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.withS3
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.s3: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on s3 is not supported.")
    set(value) { this.withS3(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.withCloudwatchAlarm
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.cloudwatchAlarm: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on cloudwatchAlarm is not supported.")
    set(value) { this.withCloudwatchAlarm(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.withCloudwatchMetric
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.cloudwatchMetric: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on cloudwatchMetric is not supported.")
    set(value) { this.withCloudwatchMetric(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.withDynamoDb
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.dynamoDb: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on dynamoDb is not supported.")
    set(value) { this.withDynamoDb(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.withDynamoDBv2
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.dynamoDBv2: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on dynamoDBv2 is not supported.")
    set(value) { this.withDynamoDBv2(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.withElasticsearch
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.elasticsearch: software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty
    get() = throw NoSuchFieldException("Get on elasticsearch is not supported.")
    set(value) { this.withElasticsearch(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.withFirehose
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.firehose: software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty
    get() = throw NoSuchFieldException("Get on firehose is not supported.")
    set(value) { this.withFirehose(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.withIotAnalytics
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.iotAnalytics: software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty
    get() = throw NoSuchFieldException("Get on iotAnalytics is not supported.")
    set(value) { this.withIotAnalytics(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.withKinesis
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.kinesis: software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty
    get() = throw NoSuchFieldException("Get on kinesis is not supported.")
    set(value) { this.withKinesis(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.withLambda
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.lambda: software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty
    get() = throw NoSuchFieldException("Get on lambda is not supported.")
    set(value) { this.withLambda(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.withRepublish
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.republish: software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty
    get() = throw NoSuchFieldException("Get on republish is not supported.")
    set(value) { this.withRepublish(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.withStepFunctions
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder.stepFunctions: software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty
    get() = throw NoSuchFieldException("Get on stepFunctions is not supported.")
    set(value) { this.withStepFunctions(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty.Builder
 */
fun kinesisActionProperty(init: software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty {
    val builder = software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty.Builder.withPartitionKey
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty.Builder.partitionKey: String
    get() = throw NoSuchFieldException("Get on partitionKey is not supported.")
    set(value) { this.withPartitionKey(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty.Builder.withStreamName
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty.Builder.streamName: String
    get() = throw NoSuchFieldException("Get on streamName is not supported.")
    set(value) { this.withStreamName(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty.Builder
 */
fun republishActionProperty(init: software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty {
    val builder = software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty.Builder.withTopic
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty.Builder.topic: String
    get() = throw NoSuchFieldException("Get on topic is not supported.")
    set(value) { this.withTopic(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty.Builder
 */
fun sqsActionProperty(init: software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty {
    val builder = software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty.Builder.withQueueUrl
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty.Builder.queueUrl: String
    get() = throw NoSuchFieldException("Get on queueUrl is not supported.")
    set(value) { this.withQueueUrl(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty.Builder.withUseBase64
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty.Builder.useBase64: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on useBase64 is not supported.")
    set(value) { this.withUseBase64(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.Builder
 */
fun elasticsearchActionProperty(init: software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty {
    val builder = software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.Builder.withId
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.Builder.withEndpoint
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.Builder.endpoint: String
    get() = throw NoSuchFieldException("Get on endpoint is not supported.")
    set(value) { this.withEndpoint(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.Builder.withIndex
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.Builder.index: String
    get() = throw NoSuchFieldException("Get on index is not supported.")
    set(value) { this.withIndex(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.Builder.withType
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty.Builder
 */
fun attributePayloadProperty(init: software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty {
    val builder = software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty.Builder.withAttributes
 */
var software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty.Builder.attributes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on attributes is not supported.")
    set(value) { this.withAttributes(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty.Builder
 */
fun snsActionProperty(init: software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty {
    val builder = software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty.Builder.withMessageFormat
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty.Builder.messageFormat: String
    get() = throw NoSuchFieldException("Get on messageFormat is not supported.")
    set(value) { this.withMessageFormat(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty.Builder.withTargetArn
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty.Builder.targetArn: String
    get() = throw NoSuchFieldException("Get on targetArn is not supported.")
    set(value) { this.withTargetArn(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRuleProps.Builder
 */
fun cfnTopicRuleProps(init: software.amazon.awscdk.services.iot.CfnTopicRuleProps.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnTopicRuleProps {
    val builder = software.amazon.awscdk.services.iot.CfnTopicRuleProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRuleProps.Builder.withTopicRulePayload
 */
var software.amazon.awscdk.services.iot.CfnTopicRuleProps.Builder.topicRulePayload: software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty
    get() = throw NoSuchFieldException("Get on topicRulePayload is not supported.")
    set(value) { this.withTopicRulePayload(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRuleProps.Builder.withRuleName
 */
var software.amazon.awscdk.services.iot.CfnTopicRuleProps.Builder.ruleName: String
    get() = throw NoSuchFieldException("Get on ruleName is not supported.")
    set(value) { this.withRuleName(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty.Builder
 */
fun s3ActionProperty(init: software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty {
    val builder = software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty.Builder.withKey
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty.Builder.withBucketName
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty.Builder.bucketName: String
    get() = throw NoSuchFieldException("Get on bucketName is not supported.")
    set(value) { this.withBucketName(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps.Builder
 */
fun cfnPolicyPrincipalAttachmentProps(init: software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps {
    val builder = software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps.Builder.withPrincipal
 */
var software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps.Builder.principal: String
    get() = throw NoSuchFieldException("Get on principal is not supported.")
    set(value) { this.withPrincipal(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps.Builder.withPolicyName
 */
var software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps.Builder.policyName: String
    get() = throw NoSuchFieldException("Get on policyName is not supported.")
    set(value) { this.withPolicyName(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.Builder
 */
fun cloudwatchAlarmActionProperty(init: software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty {
    val builder = software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.Builder.withAlarmName
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.Builder.alarmName: String
    get() = throw NoSuchFieldException("Get on alarmName is not supported.")
    set(value) { this.withAlarmName(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.Builder.withStateReason
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.Builder.stateReason: String
    get() = throw NoSuchFieldException("Get on stateReason is not supported.")
    set(value) { this.withStateReason(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.Builder.withStateValue
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.Builder.stateValue: String
    get() = throw NoSuchFieldException("Get on stateValue is not supported.")
    set(value) { this.withStateValue(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty.Builder
 */
fun dynamoDBv2ActionProperty(init: software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty {
    val builder = software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty.Builder.withPutItem
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty.Builder.putItem: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on putItem is not supported.")
    set(value) { this.withPutItem(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder
 */
fun topicRulePayloadProperty(init: software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty {
    val builder = software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder.withAwsIotSqlVersion
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder.awsIotSqlVersion: String
    get() = throw NoSuchFieldException("Get on awsIotSqlVersion is not supported.")
    set(value) { this.withAwsIotSqlVersion(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder.withSql
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder.sql: String
    get() = throw NoSuchFieldException("Get on sql is not supported.")
    set(value) { this.withSql(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder.withActions
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder.actions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on actions is not supported.")
    set(value) { this.withActions(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder.withDescription
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder.withRuleDisabled
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder.ruleDisabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ruleDisabled is not supported.")
    set(value) { this.withRuleDisabled(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder.withErrorAction
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder.errorAction: software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty
    get() = throw NoSuchFieldException("Get on errorAction is not supported.")
    set(value) { this.withErrorAction(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder
 */
fun dynamoDBActionProperty(init: software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty {
    val builder = software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.withTableName
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.tableName: String
    get() = throw NoSuchFieldException("Get on tableName is not supported.")
    set(value) { this.withTableName(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.withRangeKeyType
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.rangeKeyType: String
    get() = throw NoSuchFieldException("Get on rangeKeyType is not supported.")
    set(value) { this.withRangeKeyType(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.withHashKeyField
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.hashKeyField: String
    get() = throw NoSuchFieldException("Get on hashKeyField is not supported.")
    set(value) { this.withHashKeyField(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.withHashKeyValue
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.hashKeyValue: String
    get() = throw NoSuchFieldException("Get on hashKeyValue is not supported.")
    set(value) { this.withHashKeyValue(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.withRangeKeyValue
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.rangeKeyValue: String
    get() = throw NoSuchFieldException("Get on rangeKeyValue is not supported.")
    set(value) { this.withRangeKeyValue(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.withRangeKeyField
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.rangeKeyField: String
    get() = throw NoSuchFieldException("Get on rangeKeyField is not supported.")
    set(value) { this.withRangeKeyField(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.withPayloadField
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.payloadField: String
    get() = throw NoSuchFieldException("Get on payloadField is not supported.")
    set(value) { this.withPayloadField(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.withHashKeyType
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder.hashKeyType: String
    get() = throw NoSuchFieldException("Get on hashKeyType is not supported.")
    set(value) { this.withHashKeyType(value) }


/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty.Builder
 */
fun firehoseActionProperty(init: software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty {
    val builder = software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty.Builder.withDeliveryStreamName
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty.Builder.deliveryStreamName: String
    get() = throw NoSuchFieldException("Get on deliveryStreamName is not supported.")
    set(value) { this.withDeliveryStreamName(value) }

/**
 * @see software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty.Builder.withSeparator
 */
var software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty.Builder.separator: String
    get() = throw NoSuchFieldException("Get on separator is not supported.")
    set(value) { this.withSeparator(value) }
