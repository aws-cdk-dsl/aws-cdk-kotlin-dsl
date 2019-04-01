package software.amazon.awscdk.dsl.services.sam
/**
 * @see software.amazon.awscdk.services.sam.CfnApi
 */
fun software.amazon.awscdk.Construct.cfnApi(id: String,
                     props: software.amazon.awscdk.services.sam.CfnApiProps? = null,
                     init: (software.amazon.awscdk.services.sam.CfnApi.() -> Unit)? = null)
        : software.amazon.awscdk.services.sam.CfnApi {

    val obj = software.amazon.awscdk.services.sam.CfnApi(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sam.CfnSimpleTable
 */
fun software.amazon.awscdk.Construct.cfnSimpleTable(id: String,
                     props: software.amazon.awscdk.services.sam.CfnSimpleTableProps? = null,
                     init: (software.amazon.awscdk.services.sam.CfnSimpleTable.() -> Unit)? = null)
        : software.amazon.awscdk.services.sam.CfnSimpleTable {

    val obj = software.amazon.awscdk.services.sam.CfnSimpleTable(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sam.CfnFunction
 */
fun software.amazon.awscdk.Construct.cfnFunction(id: String,
                     props: software.amazon.awscdk.services.sam.CfnFunctionProps? = null,
                     init: (software.amazon.awscdk.services.sam.CfnFunction.() -> Unit)? = null)
        : software.amazon.awscdk.services.sam.CfnFunction {

    val obj = software.amazon.awscdk.services.sam.CfnFunction(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sam.CfnLayerVersion
 */
fun software.amazon.awscdk.Construct.cfnLayerVersion(id: String,
                     props: software.amazon.awscdk.services.sam.CfnLayerVersionProps? = null,
                     init: (software.amazon.awscdk.services.sam.CfnLayerVersion.() -> Unit)? = null)
        : software.amazon.awscdk.services.sam.CfnLayerVersion {

    val obj = software.amazon.awscdk.services.sam.CfnLayerVersion(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sam.CfnApplication
 */
fun software.amazon.awscdk.Construct.cfnApplication(id: String,
                     props: software.amazon.awscdk.services.sam.CfnApplicationProps? = null,
                     init: (software.amazon.awscdk.services.sam.CfnApplication.() -> Unit)? = null)
        : software.amazon.awscdk.services.sam.CfnApplication {

    val obj = software.amazon.awscdk.services.sam.CfnApplication(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sam.CfnSimpleTable
 */
fun software.amazon.awscdk.Construct.cfnSimpleTable(id: String,
                     init: (software.amazon.awscdk.services.sam.CfnSimpleTable.() -> Unit)? = null)
        : software.amazon.awscdk.services.sam.CfnSimpleTable {

    val obj = software.amazon.awscdk.services.sam.CfnSimpleTable(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sam.CfnLayerVersion
 */
fun software.amazon.awscdk.Construct.cfnLayerVersion(id: String,
                     init: (software.amazon.awscdk.services.sam.CfnLayerVersion.() -> Unit)? = null)
        : software.amazon.awscdk.services.sam.CfnLayerVersion {

    val obj = software.amazon.awscdk.services.sam.CfnLayerVersion(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder
 */
fun cfnFunctionProps(init: software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnFunctionProps {
    val builder = software.amazon.awscdk.services.sam.CfnFunctionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withFunctionName
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.functionName: String
    get() = throw NoSuchFieldException("Get on functionName is not supported.")
    set(value) { this.withFunctionName(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withVpcConfig
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.vpcConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on vpcConfig is not supported.")
    set(value) { this.withVpcConfig(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withPermissionsBoundary
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.permissionsBoundary: String
    get() = throw NoSuchFieldException("Get on permissionsBoundary is not supported.")
    set(value) { this.withPermissionsBoundary(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withPolicies
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.policies: String
    get() = throw NoSuchFieldException("Get on policies is not supported.")
    set(value) { this.withPolicies(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withEnvironment
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.environment: software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty
    get() = throw NoSuchFieldException("Get on environment is not supported.")
    set(value) { this.withEnvironment(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withMemorySize
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.memorySize: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on memorySize is not supported.")
    set(value) { this.withMemorySize(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withKmsKeyArn
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.kmsKeyArn: String
    get() = throw NoSuchFieldException("Get on kmsKeyArn is not supported.")
    set(value) { this.withKmsKeyArn(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withRole
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.role: String
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withTimeout
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.timeout: Number
    get() = throw NoSuchFieldException("Get on timeout is not supported.")
    set(value) { this.withTimeout(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withHandler
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.handler: String
    get() = throw NoSuchFieldException("Get on handler is not supported.")
    set(value) { this.withHandler(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withRuntime
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.runtime: String
    get() = throw NoSuchFieldException("Get on runtime is not supported.")
    set(value) { this.withRuntime(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withDeadLetterQueue
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.deadLetterQueue: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on deadLetterQueue is not supported.")
    set(value) { this.withDeadLetterQueue(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withReservedConcurrentExecutions
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.reservedConcurrentExecutions: Number
    get() = throw NoSuchFieldException("Get on reservedConcurrentExecutions is not supported.")
    set(value) { this.withReservedConcurrentExecutions(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withTracing
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.tracing: String
    get() = throw NoSuchFieldException("Get on tracing is not supported.")
    set(value) { this.withTracing(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withCodeUri
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.codeUri: String
    get() = throw NoSuchFieldException("Get on codeUri is not supported.")
    set(value) { this.withCodeUri(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withAutoPublishAlias
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.autoPublishAlias: String
    get() = throw NoSuchFieldException("Get on autoPublishAlias is not supported.")
    set(value) { this.withAutoPublishAlias(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withDeploymentPreference
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.deploymentPreference: software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty
    get() = throw NoSuchFieldException("Get on deploymentPreference is not supported.")
    set(value) { this.withDeploymentPreference(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withDescription
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.withEvents
 */
var software.amazon.awscdk.services.sam.CfnFunctionProps.Builder.events: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on events is not supported.")
    set(value) { this.withEvents(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty.Builder
 */
fun kinesisEventProperty(init: software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty {
    val builder = software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty.Builder.withStartingPosition
 */
var software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty.Builder.startingPosition: String
    get() = throw NoSuchFieldException("Get on startingPosition is not supported.")
    set(value) { this.withStartingPosition(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty.Builder.withBatchSize
 */
var software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty.Builder.batchSize: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on batchSize is not supported.")
    set(value) { this.withBatchSize(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty.Builder.enabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty.Builder.withStream
 */
var software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty.Builder.stream: String
    get() = throw NoSuchFieldException("Get on stream is not supported.")
    set(value) { this.withStream(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnSimpleTableProps.Builder
 */
fun cfnSimpleTableProps(init: software.amazon.awscdk.services.sam.CfnSimpleTableProps.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnSimpleTableProps {
    val builder = software.amazon.awscdk.services.sam.CfnSimpleTableProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnSimpleTableProps.Builder.withSseSpecification
 */
var software.amazon.awscdk.services.sam.CfnSimpleTableProps.Builder.sseSpecification: software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty
    get() = throw NoSuchFieldException("Get on sseSpecification is not supported.")
    set(value) { this.withSseSpecification(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnSimpleTableProps.Builder.withProvisionedThroughput
 */
var software.amazon.awscdk.services.sam.CfnSimpleTableProps.Builder.provisionedThroughput: software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty
    get() = throw NoSuchFieldException("Get on provisionedThroughput is not supported.")
    set(value) { this.withProvisionedThroughput(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnSimpleTableProps.Builder.withTableName
 */
var software.amazon.awscdk.services.sam.CfnSimpleTableProps.Builder.tableName: String
    get() = throw NoSuchFieldException("Get on tableName is not supported.")
    set(value) { this.withTableName(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnSimpleTableProps.Builder.withPrimaryKey
 */
var software.amazon.awscdk.services.sam.CfnSimpleTableProps.Builder.primaryKey: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on primaryKey is not supported.")
    set(value) { this.withPrimaryKey(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty.Builder
 */
fun sNSEventProperty(init: software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty {
    val builder = software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty.Builder.withTopic
 */
var software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty.Builder.topic: String
    get() = throw NoSuchFieldException("Get on topic is not supported.")
    set(value) { this.withTopic(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty.Builder
 */
fun applicationLocationProperty(init: software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty {
    val builder = software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty.Builder.withSemanticVersion
 */
var software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty.Builder.semanticVersion: String
    get() = throw NoSuchFieldException("Get on semanticVersion is not supported.")
    set(value) { this.withSemanticVersion(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty.Builder.withApplicationId
 */
var software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty.Builder.applicationId: String
    get() = throw NoSuchFieldException("Get on applicationId is not supported.")
    set(value) { this.withApplicationId(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnLayerVersionProps.Builder
 */
fun cfnLayerVersionProps(init: software.amazon.awscdk.services.sam.CfnLayerVersionProps.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnLayerVersionProps {
    val builder = software.amazon.awscdk.services.sam.CfnLayerVersionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnLayerVersionProps.Builder.withDescription
 */
var software.amazon.awscdk.services.sam.CfnLayerVersionProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnLayerVersionProps.Builder.withRetentionPolicy
 */
var software.amazon.awscdk.services.sam.CfnLayerVersionProps.Builder.retentionPolicy: String
    get() = throw NoSuchFieldException("Get on retentionPolicy is not supported.")
    set(value) { this.withRetentionPolicy(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnLayerVersionProps.Builder.withContentUri
 */
var software.amazon.awscdk.services.sam.CfnLayerVersionProps.Builder.contentUri: String
    get() = throw NoSuchFieldException("Get on contentUri is not supported.")
    set(value) { this.withContentUri(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnLayerVersionProps.Builder.withLicenseInfo
 */
var software.amazon.awscdk.services.sam.CfnLayerVersionProps.Builder.licenseInfo: String
    get() = throw NoSuchFieldException("Get on licenseInfo is not supported.")
    set(value) { this.withLicenseInfo(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnLayerVersionProps.Builder.withLayerName
 */
var software.amazon.awscdk.services.sam.CfnLayerVersionProps.Builder.layerName: String
    get() = throw NoSuchFieldException("Get on layerName is not supported.")
    set(value) { this.withLayerName(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty.Builder
 */
fun eventSourceProperty(init: software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty {
    val builder = software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty.Builder.withType
 */
var software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty.Builder.withProperties
 */
var software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty.Builder.properties: software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty
    get() = throw NoSuchFieldException("Get on properties is not supported.")
    set(value) { this.withProperties(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty.Builder
 */
fun cloudWatchEventEventProperty(init: software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty {
    val builder = software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty.Builder.withPattern
 */
var software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty.Builder.pattern: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on pattern is not supported.")
    set(value) { this.withPattern(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty.Builder.withInput
 */
var software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty.Builder.input: String
    get() = throw NoSuchFieldException("Get on input is not supported.")
    set(value) { this.withInput(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty.Builder.withInputPath
 */
var software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty.Builder.inputPath: String
    get() = throw NoSuchFieldException("Get on inputPath is not supported.")
    set(value) { this.withInputPath(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty.Builder
 */
fun functionEnvironmentProperty(init: software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty {
    val builder = software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty.Builder.withVariables
 */
var software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty.Builder.variables: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on variables is not supported.")
    set(value) { this.withVariables(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnApplicationProps.Builder
 */
fun cfnApplicationProps(init: software.amazon.awscdk.services.sam.CfnApplicationProps.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnApplicationProps {
    val builder = software.amazon.awscdk.services.sam.CfnApplicationProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnApplicationProps.Builder.withTimeoutInMinutes
 */
var software.amazon.awscdk.services.sam.CfnApplicationProps.Builder.timeoutInMinutes: Number
    get() = throw NoSuchFieldException("Get on timeoutInMinutes is not supported.")
    set(value) { this.withTimeoutInMinutes(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnApplicationProps.Builder.withLocation
 */
var software.amazon.awscdk.services.sam.CfnApplicationProps.Builder.location: String
    get() = throw NoSuchFieldException("Get on location is not supported.")
    set(value) { this.withLocation(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnApplicationProps.Builder.withParameters
 */
var software.amazon.awscdk.services.sam.CfnApplicationProps.Builder.parameters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on parameters is not supported.")
    set(value) { this.withParameters(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty.Builder
 */
fun deploymentPreferenceProperty(init: software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty {
    val builder = software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty.Builder.enabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty.Builder.withType
 */
var software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnApi.AuthProperty.Builder
 */
fun authProperty(init: software.amazon.awscdk.services.sam.CfnApi.AuthProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnApi.AuthProperty {
    val builder = software.amazon.awscdk.services.sam.CfnApi.AuthProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnApi.AuthProperty.Builder.withAuthorizers
 */
var software.amazon.awscdk.services.sam.CfnApi.AuthProperty.Builder.authorizers: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on authorizers is not supported.")
    set(value) { this.withAuthorizers(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnApi.AuthProperty.Builder.withDefaultAuthorizer
 */
var software.amazon.awscdk.services.sam.CfnApi.AuthProperty.Builder.defaultAuthorizer: String
    get() = throw NoSuchFieldException("Get on defaultAuthorizer is not supported.")
    set(value) { this.withDefaultAuthorizer(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty.Builder
 */
fun s3LocationProperty(init: software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty {
    val builder = software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty.Builder.withKey
 */
var software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty.Builder.withBucket
 */
var software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty.Builder.bucket: String
    get() = throw NoSuchFieldException("Get on bucket is not supported.")
    set(value) { this.withBucket(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty.Builder.withVersion
 */
var software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty.Builder.version: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty.Builder
 */
fun provisionedThroughputProperty(init: software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty {
    val builder = software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty.Builder.withWriteCapacityUnits
 */
var software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty.Builder.writeCapacityUnits: Number
    get() = throw NoSuchFieldException("Get on writeCapacityUnits is not supported.")
    set(value) { this.withWriteCapacityUnits(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty.Builder.withReadCapacityUnits
 */
var software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty.Builder.readCapacityUnits: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on readCapacityUnits is not supported.")
    set(value) { this.withReadCapacityUnits(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnApiProps.Builder
 */
fun cfnApiProps(init: software.amazon.awscdk.services.sam.CfnApiProps.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnApiProps {
    val builder = software.amazon.awscdk.services.sam.CfnApiProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnApiProps.Builder.withStageName
 */
var software.amazon.awscdk.services.sam.CfnApiProps.Builder.stageName: String
    get() = throw NoSuchFieldException("Get on stageName is not supported.")
    set(value) { this.withStageName(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnApiProps.Builder.withAuth
 */
var software.amazon.awscdk.services.sam.CfnApiProps.Builder.auth: software.amazon.awscdk.services.sam.CfnApi.AuthProperty
    get() = throw NoSuchFieldException("Get on auth is not supported.")
    set(value) { this.withAuth(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnApiProps.Builder.withTracingEnabled
 */
var software.amazon.awscdk.services.sam.CfnApiProps.Builder.tracingEnabled: Boolean
    get() = throw NoSuchFieldException("Get on tracingEnabled is not supported.")
    set(value) { this.withTracingEnabled(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnApiProps.Builder.withCacheClusterSize
 */
var software.amazon.awscdk.services.sam.CfnApiProps.Builder.cacheClusterSize: String
    get() = throw NoSuchFieldException("Get on cacheClusterSize is not supported.")
    set(value) { this.withCacheClusterSize(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnApiProps.Builder.withCors
 */
var software.amazon.awscdk.services.sam.CfnApiProps.Builder.cors: String
    get() = throw NoSuchFieldException("Get on cors is not supported.")
    set(value) { this.withCors(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnApiProps.Builder.withCacheClusterEnabled
 */
var software.amazon.awscdk.services.sam.CfnApiProps.Builder.cacheClusterEnabled: Boolean
    get() = throw NoSuchFieldException("Get on cacheClusterEnabled is not supported.")
    set(value) { this.withCacheClusterEnabled(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnApiProps.Builder.withVariables
 */
var software.amazon.awscdk.services.sam.CfnApiProps.Builder.variables: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on variables is not supported.")
    set(value) { this.withVariables(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnApiProps.Builder.withEndpointConfiguration
 */
var software.amazon.awscdk.services.sam.CfnApiProps.Builder.endpointConfiguration: String
    get() = throw NoSuchFieldException("Get on endpointConfiguration is not supported.")
    set(value) { this.withEndpointConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnApiProps.Builder.withDefinitionBody
 */
var software.amazon.awscdk.services.sam.CfnApiProps.Builder.definitionBody: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on definitionBody is not supported.")
    set(value) { this.withDefinitionBody(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnApiProps.Builder.withDefinitionUri
 */
var software.amazon.awscdk.services.sam.CfnApiProps.Builder.definitionUri: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on definitionUri is not supported.")
    set(value) { this.withDefinitionUri(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnApiProps.Builder.withMethodSettings
 */
var software.amazon.awscdk.services.sam.CfnApiProps.Builder.methodSettings: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on methodSettings is not supported.")
    set(value) { this.withMethodSettings(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnApiProps.Builder.withName
 */
var software.amazon.awscdk.services.sam.CfnApiProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty.Builder
 */
fun ioTRuleEventProperty(init: software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty {
    val builder = software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty.Builder.withAwsIotSqlVersion
 */
var software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty.Builder.awsIotSqlVersion: String
    get() = throw NoSuchFieldException("Get on awsIotSqlVersion is not supported.")
    set(value) { this.withAwsIotSqlVersion(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty.Builder.withSql
 */
var software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty.Builder.sql: String
    get() = throw NoSuchFieldException("Get on sql is not supported.")
    set(value) { this.withSql(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty.Builder
 */
fun alexaSkillEventProperty(init: software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty {
    val builder = software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty.Builder.withVariables
 */
var software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty.Builder.variables: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on variables is not supported.")
    set(value) { this.withVariables(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty.Builder
 */
fun apiEventProperty(init: software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty {
    val builder = software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty.Builder.withMethod
 */
var software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty.Builder.method: String
    get() = throw NoSuchFieldException("Get on method is not supported.")
    set(value) { this.withMethod(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty.Builder.withPath
 */
var software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty.Builder.path: String
    get() = throw NoSuchFieldException("Get on path is not supported.")
    set(value) { this.withPath(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty.Builder.withRestApiId
 */
var software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty.Builder.restApiId: String
    get() = throw NoSuchFieldException("Get on restApiId is not supported.")
    set(value) { this.withRestApiId(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty.Builder
 */
fun primaryKeyProperty(init: software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty {
    val builder = software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty.Builder.withType
 */
var software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty.Builder.withName
 */
var software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty.Builder
 */
fun s3EventProperty(init: software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty {
    val builder = software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty.Builder.withBucket
 */
var software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty.Builder.bucket: String
    get() = throw NoSuchFieldException("Get on bucket is not supported.")
    set(value) { this.withBucket(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty.Builder.withFilter
 */
var software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty.Builder.filter: software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty
    get() = throw NoSuchFieldException("Get on filter is not supported.")
    set(value) { this.withFilter(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty.Builder.withEvents
 */
var software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty.Builder.events: String
    get() = throw NoSuchFieldException("Get on events is not supported.")
    set(value) { this.withEvents(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty.Builder
 */
fun deadLetterQueueProperty(init: software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty {
    val builder = software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty.Builder.withType
 */
var software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty.Builder.withTargetArn
 */
var software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty.Builder.targetArn: String
    get() = throw NoSuchFieldException("Get on targetArn is not supported.")
    set(value) { this.withTargetArn(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty.Builder
 */
fun s3NotificationFilterProperty(init: software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty {
    val builder = software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty.Builder.withS3Key
 */
var software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty.Builder.s3Key: String
    get() = throw NoSuchFieldException("Get on s3Key is not supported.")
    set(value) { this.withS3Key(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty.Builder
 */
fun sQSEventProperty(init: software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty {
    val builder = software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty.Builder.withQueue
 */
var software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty.Builder.queue: String
    get() = throw NoSuchFieldException("Get on queue is not supported.")
    set(value) { this.withQueue(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty.Builder.withBatchSize
 */
var software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty.Builder.batchSize: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on batchSize is not supported.")
    set(value) { this.withBatchSize(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty.Builder.enabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty.Builder
 */
fun sSESpecificationProperty(init: software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty {
    val builder = software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty.Builder.withSseEnabled
 */
var software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty.Builder.sseEnabled: Boolean
    get() = throw NoSuchFieldException("Get on sseEnabled is not supported.")
    set(value) { this.withSseEnabled(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty.Builder
 */
fun vpcConfigProperty(init: software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty {
    val builder = software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty.Builder()
    builder.init()
    return builder.build()
}


/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty.Builder
 */
fun scheduleEventProperty(init: software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty {
    val builder = software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty.Builder.withSchedule
 */
var software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty.Builder.schedule: String
    get() = throw NoSuchFieldException("Get on schedule is not supported.")
    set(value) { this.withSchedule(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty.Builder.withInput
 */
var software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty.Builder.input: String
    get() = throw NoSuchFieldException("Get on input is not supported.")
    set(value) { this.withInput(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty.Builder
 */
fun s3LocationProperty(init: software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty {
    val builder = software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty.Builder.withKey
 */
var software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty.Builder.withBucket
 */
var software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty.Builder.bucket: String
    get() = throw NoSuchFieldException("Get on bucket is not supported.")
    set(value) { this.withBucket(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty.Builder.withVersion
 */
var software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty.Builder.version: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty.Builder
 */
fun dynamoDBEventProperty(init: software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty.Builder.() -> Unit): software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty {
    val builder = software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty.Builder.withStartingPosition
 */
var software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty.Builder.startingPosition: String
    get() = throw NoSuchFieldException("Get on startingPosition is not supported.")
    set(value) { this.withStartingPosition(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty.Builder.withBatchSize
 */
var software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty.Builder.batchSize: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on batchSize is not supported.")
    set(value) { this.withBatchSize(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty.Builder.enabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }

/**
 * @see software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty.Builder.withStream
 */
var software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty.Builder.stream: String
    get() = throw NoSuchFieldException("Get on stream is not supported.")
    set(value) { this.withStream(value) }
