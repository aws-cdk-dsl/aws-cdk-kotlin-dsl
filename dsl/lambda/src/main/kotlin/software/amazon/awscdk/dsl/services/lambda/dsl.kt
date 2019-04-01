package software.amazon.awscdk.dsl.services.lambda
/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunction
 */
fun software.amazon.awscdk.Construct.singletonFunction(id: String,
                     props: software.amazon.awscdk.services.lambda.SingletonFunctionProps? = null,
                     init: (software.amazon.awscdk.services.lambda.SingletonFunction.() -> Unit)? = null)
        : software.amazon.awscdk.services.lambda.SingletonFunction {

    val obj = software.amazon.awscdk.services.lambda.SingletonFunction(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.lambda.LayerVersion
 */
fun software.amazon.awscdk.Construct.layerVersion(id: String,
                     props: software.amazon.awscdk.services.lambda.LayerVersionProps? = null,
                     init: (software.amazon.awscdk.services.lambda.LayerVersion.() -> Unit)? = null)
        : software.amazon.awscdk.services.lambda.LayerVersion {

    val obj = software.amazon.awscdk.services.lambda.LayerVersion(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.lambda.CfnVersion
 */
fun software.amazon.awscdk.Construct.cfnVersion(id: String,
                     props: software.amazon.awscdk.services.lambda.CfnVersionProps? = null,
                     init: (software.amazon.awscdk.services.lambda.CfnVersion.() -> Unit)? = null)
        : software.amazon.awscdk.services.lambda.CfnVersion {

    val obj = software.amazon.awscdk.services.lambda.CfnVersion(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.lambda.CfnPermission
 */
fun software.amazon.awscdk.Construct.cfnPermission(id: String,
                     props: software.amazon.awscdk.services.lambda.CfnPermissionProps? = null,
                     init: (software.amazon.awscdk.services.lambda.CfnPermission.() -> Unit)? = null)
        : software.amazon.awscdk.services.lambda.CfnPermission {

    val obj = software.amazon.awscdk.services.lambda.CfnPermission(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.lambda.CfnLayerVersionPermission
 */
fun software.amazon.awscdk.Construct.cfnLayerVersionPermission(id: String,
                     props: software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps? = null,
                     init: (software.amazon.awscdk.services.lambda.CfnLayerVersionPermission.() -> Unit)? = null)
        : software.amazon.awscdk.services.lambda.CfnLayerVersionPermission {

    val obj = software.amazon.awscdk.services.lambda.CfnLayerVersionPermission(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.lambda.EventSourceMapping
 */
fun software.amazon.awscdk.Construct.eventSourceMapping(id: String,
                     props: software.amazon.awscdk.services.lambda.EventSourceMappingProps? = null,
                     init: (software.amazon.awscdk.services.lambda.EventSourceMapping.() -> Unit)? = null)
        : software.amazon.awscdk.services.lambda.EventSourceMapping {

    val obj = software.amazon.awscdk.services.lambda.EventSourceMapping(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.lambda.LogRetention
 */
fun software.amazon.awscdk.Construct.logRetention(id: String,
                     props: software.amazon.awscdk.services.lambda.LogRetentionProps? = null,
                     init: (software.amazon.awscdk.services.lambda.LogRetention.() -> Unit)? = null)
        : software.amazon.awscdk.services.lambda.LogRetention {

    val obj = software.amazon.awscdk.services.lambda.LogRetention(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.lambda.CfnEventSourceMapping
 */
fun software.amazon.awscdk.Construct.cfnEventSourceMapping(id: String,
                     props: software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps? = null,
                     init: (software.amazon.awscdk.services.lambda.CfnEventSourceMapping.() -> Unit)? = null)
        : software.amazon.awscdk.services.lambda.CfnEventSourceMapping {

    val obj = software.amazon.awscdk.services.lambda.CfnEventSourceMapping(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.lambda.SingletonLayerVersion
 */
fun software.amazon.awscdk.Construct.singletonLayerVersion(id: String,
                     props: software.amazon.awscdk.services.lambda.SingletonLayerVersionProps? = null,
                     init: (software.amazon.awscdk.services.lambda.SingletonLayerVersion.() -> Unit)? = null)
        : software.amazon.awscdk.services.lambda.SingletonLayerVersion {

    val obj = software.amazon.awscdk.services.lambda.SingletonLayerVersion(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.lambda.Version
 */
fun software.amazon.awscdk.Construct.version(id: String,
                     props: software.amazon.awscdk.services.lambda.VersionProps? = null,
                     init: (software.amazon.awscdk.services.lambda.Version.() -> Unit)? = null)
        : software.amazon.awscdk.services.lambda.Version {

    val obj = software.amazon.awscdk.services.lambda.Version(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.lambda.Alias
 */
fun software.amazon.awscdk.Construct.alias(id: String,
                     props: software.amazon.awscdk.services.lambda.AliasProps? = null,
                     init: (software.amazon.awscdk.services.lambda.Alias.() -> Unit)? = null)
        : software.amazon.awscdk.services.lambda.Alias {

    val obj = software.amazon.awscdk.services.lambda.Alias(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.lambda.ImportedFunction
 */
fun software.amazon.awscdk.Construct.importedFunction(id: String,
                     props: software.amazon.awscdk.services.lambda.FunctionImportProps? = null,
                     init: (software.amazon.awscdk.services.lambda.ImportedFunction.() -> Unit)? = null)
        : software.amazon.awscdk.services.lambda.ImportedFunction {

    val obj = software.amazon.awscdk.services.lambda.ImportedFunction(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.lambda.CfnFunction
 */
fun software.amazon.awscdk.Construct.cfnFunction(id: String,
                     props: software.amazon.awscdk.services.lambda.CfnFunctionProps? = null,
                     init: (software.amazon.awscdk.services.lambda.CfnFunction.() -> Unit)? = null)
        : software.amazon.awscdk.services.lambda.CfnFunction {

    val obj = software.amazon.awscdk.services.lambda.CfnFunction(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.lambda.CfnLayerVersion
 */
fun software.amazon.awscdk.Construct.cfnLayerVersion(id: String,
                     props: software.amazon.awscdk.services.lambda.CfnLayerVersionProps? = null,
                     init: (software.amazon.awscdk.services.lambda.CfnLayerVersion.() -> Unit)? = null)
        : software.amazon.awscdk.services.lambda.CfnLayerVersion {

    val obj = software.amazon.awscdk.services.lambda.CfnLayerVersion(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.lambda.CfnAlias
 */
fun software.amazon.awscdk.Construct.cfnAlias(id: String,
                     props: software.amazon.awscdk.services.lambda.CfnAliasProps? = null,
                     init: (software.amazon.awscdk.services.lambda.CfnAlias.() -> Unit)? = null)
        : software.amazon.awscdk.services.lambda.CfnAlias {

    val obj = software.amazon.awscdk.services.lambda.CfnAlias(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.lambda.Function
 */
fun software.amazon.awscdk.Construct.function(id: String,
                     props: software.amazon.awscdk.services.lambda.FunctionProps? = null,
                     init: (software.amazon.awscdk.services.lambda.Function.() -> Unit)? = null)
        : software.amazon.awscdk.services.lambda.Function {

    val obj = software.amazon.awscdk.services.lambda.Function(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.lambda.AliasProps.Builder
 */
fun aliasProps(init: software.amazon.awscdk.services.lambda.AliasProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.AliasProps {
    val builder = software.amazon.awscdk.services.lambda.AliasProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.AliasProps.Builder.withAliasName
 */
var software.amazon.awscdk.services.lambda.AliasProps.Builder.aliasName: String
    get() = throw NoSuchFieldException("Get on aliasName is not supported.")
    set(value) { this.withAliasName(value) }

/**
 * @see software.amazon.awscdk.services.lambda.AliasProps.Builder.withDescription
 */
var software.amazon.awscdk.services.lambda.AliasProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.lambda.AliasProps.Builder.withVersion
 */
var software.amazon.awscdk.services.lambda.AliasProps.Builder.version: software.amazon.awscdk.services.lambda.Version
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.Builder
 */
fun cfnEventSourceMappingProps(init: software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps {
    val builder = software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.Builder.withEventSourceArn
 */
var software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.Builder.eventSourceArn: String
    get() = throw NoSuchFieldException("Get on eventSourceArn is not supported.")
    set(value) { this.withEventSourceArn(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.Builder.withFunctionName
 */
var software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.Builder.functionName: String
    get() = throw NoSuchFieldException("Get on functionName is not supported.")
    set(value) { this.withFunctionName(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.Builder.withStartingPosition
 */
var software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.Builder.startingPosition: String
    get() = throw NoSuchFieldException("Get on startingPosition is not supported.")
    set(value) { this.withStartingPosition(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.Builder.withBatchSize
 */
var software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.Builder.batchSize: Number
    get() = throw NoSuchFieldException("Get on batchSize is not supported.")
    set(value) { this.withBatchSize(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.Builder.withEnabled
 */
var software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.Builder.enabled: Boolean
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }


/**
 * @see software.amazon.awscdk.services.lambda.FunctionProps.Builder
 */
fun functionProps(init: software.amazon.awscdk.services.lambda.FunctionProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.FunctionProps {
    val builder = software.amazon.awscdk.services.lambda.FunctionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.FunctionProps.Builder.withFunctionName
 */
var software.amazon.awscdk.services.lambda.FunctionProps.Builder.functionName: String
    get() = throw NoSuchFieldException("Get on functionName is not supported.")
    set(value) { this.withFunctionName(value) }

/**
 * @see software.amazon.awscdk.services.lambda.FunctionProps.Builder.withCode
 */
var software.amazon.awscdk.services.lambda.FunctionProps.Builder.code: software.amazon.awscdk.services.lambda.Code
    get() = throw NoSuchFieldException("Get on code is not supported.")
    set(value) { this.withCode(value) }

/**
 * @see software.amazon.awscdk.services.lambda.FunctionProps.Builder.withAllowAllOutbound
 */
var software.amazon.awscdk.services.lambda.FunctionProps.Builder.allowAllOutbound: Boolean
    get() = throw NoSuchFieldException("Get on allowAllOutbound is not supported.")
    set(value) { this.withAllowAllOutbound(value) }

/**
 * @see software.amazon.awscdk.services.lambda.FunctionProps.Builder.withVpcSubnets
 */
var software.amazon.awscdk.services.lambda.FunctionProps.Builder.vpcSubnets: software.amazon.awscdk.services.ec2.SubnetSelection
    get() = throw NoSuchFieldException("Get on vpcSubnets is not supported.")
    set(value) { this.withVpcSubnets(value) }

/**
 * @see software.amazon.awscdk.services.lambda.FunctionProps.Builder.withSecurityGroup
 */
var software.amazon.awscdk.services.lambda.FunctionProps.Builder.securityGroup: software.amazon.awscdk.services.ec2.ISecurityGroup
    get() = throw NoSuchFieldException("Get on securityGroup is not supported.")
    set(value) { this.withSecurityGroup(value) }

/**
 * @see software.amazon.awscdk.services.lambda.FunctionProps.Builder.withMemorySize
 */
var software.amazon.awscdk.services.lambda.FunctionProps.Builder.memorySize: Number
    get() = throw NoSuchFieldException("Get on memorySize is not supported.")
    set(value) { this.withMemorySize(value) }

/**
 * @see software.amazon.awscdk.services.lambda.FunctionProps.Builder.withRole
 */
var software.amazon.awscdk.services.lambda.FunctionProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.lambda.FunctionProps.Builder.withTimeout
 */
var software.amazon.awscdk.services.lambda.FunctionProps.Builder.timeout: Number
    get() = throw NoSuchFieldException("Get on timeout is not supported.")
    set(value) { this.withTimeout(value) }

/**
 * @see software.amazon.awscdk.services.lambda.FunctionProps.Builder.withHandler
 */
var software.amazon.awscdk.services.lambda.FunctionProps.Builder.handler: String
    get() = throw NoSuchFieldException("Get on handler is not supported.")
    set(value) { this.withHandler(value) }

/**
 * @see software.amazon.awscdk.services.lambda.FunctionProps.Builder.withRuntime
 */
var software.amazon.awscdk.services.lambda.FunctionProps.Builder.runtime: software.amazon.awscdk.services.lambda.Runtime
    get() = throw NoSuchFieldException("Get on runtime is not supported.")
    set(value) { this.withRuntime(value) }

/**
 * @see software.amazon.awscdk.services.lambda.FunctionProps.Builder.withDeadLetterQueue
 */
var software.amazon.awscdk.services.lambda.FunctionProps.Builder.deadLetterQueue: software.amazon.awscdk.services.sqs.IQueue
    get() = throw NoSuchFieldException("Get on deadLetterQueue is not supported.")
    set(value) { this.withDeadLetterQueue(value) }

/**
 * @see software.amazon.awscdk.services.lambda.FunctionProps.Builder.withDeadLetterQueueEnabled
 */
var software.amazon.awscdk.services.lambda.FunctionProps.Builder.deadLetterQueueEnabled: Boolean
    get() = throw NoSuchFieldException("Get on deadLetterQueueEnabled is not supported.")
    set(value) { this.withDeadLetterQueueEnabled(value) }

/**
 * @see software.amazon.awscdk.services.lambda.FunctionProps.Builder.withLogRetentionDays
 */
var software.amazon.awscdk.services.lambda.FunctionProps.Builder.logRetentionDays: software.amazon.awscdk.services.logs.RetentionDays
    get() = throw NoSuchFieldException("Get on logRetentionDays is not supported.")
    set(value) { this.withLogRetentionDays(value) }

/**
 * @see software.amazon.awscdk.services.lambda.FunctionProps.Builder.withReservedConcurrentExecutions
 */
var software.amazon.awscdk.services.lambda.FunctionProps.Builder.reservedConcurrentExecutions: Number
    get() = throw NoSuchFieldException("Get on reservedConcurrentExecutions is not supported.")
    set(value) { this.withReservedConcurrentExecutions(value) }

/**
 * @see software.amazon.awscdk.services.lambda.FunctionProps.Builder.withTracing
 */
var software.amazon.awscdk.services.lambda.FunctionProps.Builder.tracing: software.amazon.awscdk.services.lambda.Tracing
    get() = throw NoSuchFieldException("Get on tracing is not supported.")
    set(value) { this.withTracing(value) }

/**
 * @see software.amazon.awscdk.services.lambda.FunctionProps.Builder.withVpc
 */
var software.amazon.awscdk.services.lambda.FunctionProps.Builder.vpc: software.amazon.awscdk.services.ec2.IVpcNetwork
    get() = throw NoSuchFieldException("Get on vpc is not supported.")
    set(value) { this.withVpc(value) }

/**
 * @see software.amazon.awscdk.services.lambda.FunctionProps.Builder.withDescription
 */
var software.amazon.awscdk.services.lambda.FunctionProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty.Builder
 */
fun deadLetterConfigProperty(init: software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty {
    val builder = software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty.Builder.withTargetArn
 */
var software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty.Builder.targetArn: String
    get() = throw NoSuchFieldException("Get on targetArn is not supported.")
    set(value) { this.withTargetArn(value) }


/**
 * @see software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty.Builder
 */
fun contentProperty(init: software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty.Builder.() -> Unit): software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty {
    val builder = software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty.Builder.withS3Bucket
 */
var software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty.Builder.s3Bucket: String
    get() = throw NoSuchFieldException("Get on s3Bucket is not supported.")
    set(value) { this.withS3Bucket(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty.Builder.withS3ObjectVersion
 */
var software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty.Builder.s3ObjectVersion: String
    get() = throw NoSuchFieldException("Get on s3ObjectVersion is not supported.")
    set(value) { this.withS3ObjectVersion(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty.Builder.withS3Key
 */
var software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty.Builder.s3Key: String
    get() = throw NoSuchFieldException("Get on s3Key is not supported.")
    set(value) { this.withS3Key(value) }


/**
 * @see software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty.Builder
 */
fun vpcConfigProperty(init: software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty {
    val builder = software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty.Builder()
    builder.init()
    return builder.build()
}


/**
 * @see software.amazon.awscdk.services.lambda.CommonPipelineInvokeActionProps.Builder
 */
fun commonPipelineInvokeActionProps(init: software.amazon.awscdk.services.lambda.CommonPipelineInvokeActionProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.CommonPipelineInvokeActionProps {
    val builder = software.amazon.awscdk.services.lambda.CommonPipelineInvokeActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.CommonPipelineInvokeActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.lambda.CommonPipelineInvokeActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CommonPipelineInvokeActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.lambda.CommonPipelineInvokeActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CommonPipelineInvokeActionProps.Builder.withAddPutJobResultPolicy
 */
var software.amazon.awscdk.services.lambda.CommonPipelineInvokeActionProps.Builder.addPutJobResultPolicy: Boolean
    get() = throw NoSuchFieldException("Get on addPutJobResultPolicy is not supported.")
    set(value) { this.withAddPutJobResultPolicy(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CommonPipelineInvokeActionProps.Builder.withUserParameters
 */
var software.amazon.awscdk.services.lambda.CommonPipelineInvokeActionProps.Builder.userParameters: Any
    get() = throw NoSuchFieldException("Get on userParameters is not supported.")
    set(value) { this.withUserParameters(value) }


/**
 * @see software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty.Builder
 */
fun aliasRoutingConfigurationProperty(init: software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty {
    val builder = software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty.Builder.withAdditionalVersionWeights
 */
var software.amazon.awscdk.services.lambda.CfnAlias.AliasRoutingConfigurationProperty.Builder.additionalVersionWeights: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on additionalVersionWeights is not supported.")
    set(value) { this.withAdditionalVersionWeights(value) }


/**
 * @see software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty.Builder
 */
fun environmentProperty(init: software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty.Builder.() -> Unit): software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty {
    val builder = software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty.Builder.withVariables
 */
var software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty.Builder.variables: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on variables is not supported.")
    set(value) { this.withVariables(value) }


/**
 * @see software.amazon.awscdk.services.lambda.PipelineInvokeActionProps.Builder
 */
fun pipelineInvokeActionProps(init: software.amazon.awscdk.services.lambda.PipelineInvokeActionProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.PipelineInvokeActionProps {
    val builder = software.amazon.awscdk.services.lambda.PipelineInvokeActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.PipelineInvokeActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.lambda.PipelineInvokeActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.lambda.PipelineInvokeActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.lambda.PipelineInvokeActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.lambda.PipelineInvokeActionProps.Builder.withLambda
 */
var software.amazon.awscdk.services.lambda.PipelineInvokeActionProps.Builder.lambda: software.amazon.awscdk.services.lambda.IFunction
    get() = throw NoSuchFieldException("Get on lambda is not supported.")
    set(value) { this.withLambda(value) }

/**
 * @see software.amazon.awscdk.services.lambda.PipelineInvokeActionProps.Builder.withAddPutJobResultPolicy
 */
var software.amazon.awscdk.services.lambda.PipelineInvokeActionProps.Builder.addPutJobResultPolicy: Boolean
    get() = throw NoSuchFieldException("Get on addPutJobResultPolicy is not supported.")
    set(value) { this.withAddPutJobResultPolicy(value) }

/**
 * @see software.amazon.awscdk.services.lambda.PipelineInvokeActionProps.Builder.withUserParameters
 */
var software.amazon.awscdk.services.lambda.PipelineInvokeActionProps.Builder.userParameters: Any
    get() = throw NoSuchFieldException("Get on userParameters is not supported.")
    set(value) { this.withUserParameters(value) }


/**
 * @see software.amazon.awscdk.services.lambda.SingletonLayerVersionProps.Builder
 */
fun singletonLayerVersionProps(init: software.amazon.awscdk.services.lambda.SingletonLayerVersionProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.SingletonLayerVersionProps {
    val builder = software.amazon.awscdk.services.lambda.SingletonLayerVersionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.SingletonLayerVersionProps.Builder.withCode
 */
var software.amazon.awscdk.services.lambda.SingletonLayerVersionProps.Builder.code: software.amazon.awscdk.services.lambda.Code
    get() = throw NoSuchFieldException("Get on code is not supported.")
    set(value) { this.withCode(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonLayerVersionProps.Builder.withName
 */
var software.amazon.awscdk.services.lambda.SingletonLayerVersionProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonLayerVersionProps.Builder.withDescription
 */
var software.amazon.awscdk.services.lambda.SingletonLayerVersionProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonLayerVersionProps.Builder.withLicense
 */
var software.amazon.awscdk.services.lambda.SingletonLayerVersionProps.Builder.license: String
    get() = throw NoSuchFieldException("Get on license is not supported.")
    set(value) { this.withLicense(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonLayerVersionProps.Builder.withUuid
 */
var software.amazon.awscdk.services.lambda.SingletonLayerVersionProps.Builder.uuid: String
    get() = throw NoSuchFieldException("Get on uuid is not supported.")
    set(value) { this.withUuid(value) }


/**
 * @see software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty.Builder
 */
fun tracingConfigProperty(init: software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty {
    val builder = software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty.Builder.withMode
 */
var software.amazon.awscdk.services.lambda.CfnFunction.TracingConfigProperty.Builder.mode: String
    get() = throw NoSuchFieldException("Get on mode is not supported.")
    set(value) { this.withMode(value) }


/**
 * @see software.amazon.awscdk.services.lambda.LayerVersionProps.Builder
 */
fun layerVersionProps(init: software.amazon.awscdk.services.lambda.LayerVersionProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.LayerVersionProps {
    val builder = software.amazon.awscdk.services.lambda.LayerVersionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.LayerVersionProps.Builder.withCode
 */
var software.amazon.awscdk.services.lambda.LayerVersionProps.Builder.code: software.amazon.awscdk.services.lambda.Code
    get() = throw NoSuchFieldException("Get on code is not supported.")
    set(value) { this.withCode(value) }

/**
 * @see software.amazon.awscdk.services.lambda.LayerVersionProps.Builder.withName
 */
var software.amazon.awscdk.services.lambda.LayerVersionProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.lambda.LayerVersionProps.Builder.withDescription
 */
var software.amazon.awscdk.services.lambda.LayerVersionProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.lambda.LayerVersionProps.Builder.withLicense
 */
var software.amazon.awscdk.services.lambda.LayerVersionProps.Builder.license: String
    get() = throw NoSuchFieldException("Get on license is not supported.")
    set(value) { this.withLicense(value) }


/**
 * @see software.amazon.awscdk.services.lambda.EventSourceMappingProps.Builder
 */
fun eventSourceMappingProps(init: software.amazon.awscdk.services.lambda.EventSourceMappingProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.EventSourceMappingProps {
    val builder = software.amazon.awscdk.services.lambda.EventSourceMappingProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.EventSourceMappingProps.Builder.withEventSourceArn
 */
var software.amazon.awscdk.services.lambda.EventSourceMappingProps.Builder.eventSourceArn: String
    get() = throw NoSuchFieldException("Get on eventSourceArn is not supported.")
    set(value) { this.withEventSourceArn(value) }

/**
 * @see software.amazon.awscdk.services.lambda.EventSourceMappingProps.Builder.withStartingPosition
 */
var software.amazon.awscdk.services.lambda.EventSourceMappingProps.Builder.startingPosition: software.amazon.awscdk.services.lambda.StartingPosition
    get() = throw NoSuchFieldException("Get on startingPosition is not supported.")
    set(value) { this.withStartingPosition(value) }

/**
 * @see software.amazon.awscdk.services.lambda.EventSourceMappingProps.Builder.withTarget
 */
var software.amazon.awscdk.services.lambda.EventSourceMappingProps.Builder.target: software.amazon.awscdk.services.lambda.IFunction
    get() = throw NoSuchFieldException("Get on target is not supported.")
    set(value) { this.withTarget(value) }

/**
 * @see software.amazon.awscdk.services.lambda.EventSourceMappingProps.Builder.withBatchSize
 */
var software.amazon.awscdk.services.lambda.EventSourceMappingProps.Builder.batchSize: Number
    get() = throw NoSuchFieldException("Get on batchSize is not supported.")
    set(value) { this.withBatchSize(value) }

/**
 * @see software.amazon.awscdk.services.lambda.EventSourceMappingProps.Builder.withEnabled
 */
var software.amazon.awscdk.services.lambda.EventSourceMappingProps.Builder.enabled: Boolean
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }


/**
 * @see software.amazon.awscdk.services.lambda.CfnLayerVersionProps.Builder
 */
fun cfnLayerVersionProps(init: software.amazon.awscdk.services.lambda.CfnLayerVersionProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.CfnLayerVersionProps {
    val builder = software.amazon.awscdk.services.lambda.CfnLayerVersionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.CfnLayerVersionProps.Builder.withContent
 */
var software.amazon.awscdk.services.lambda.CfnLayerVersionProps.Builder.content: software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty
    get() = throw NoSuchFieldException("Get on content is not supported.")
    set(value) { this.withContent(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnLayerVersionProps.Builder.withDescription
 */
var software.amazon.awscdk.services.lambda.CfnLayerVersionProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnLayerVersionProps.Builder.withLicenseInfo
 */
var software.amazon.awscdk.services.lambda.CfnLayerVersionProps.Builder.licenseInfo: String
    get() = throw NoSuchFieldException("Get on licenseInfo is not supported.")
    set(value) { this.withLicenseInfo(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnLayerVersionProps.Builder.withLayerName
 */
var software.amazon.awscdk.services.lambda.CfnLayerVersionProps.Builder.layerName: String
    get() = throw NoSuchFieldException("Get on layerName is not supported.")
    set(value) { this.withLayerName(value) }


/**
 * @see software.amazon.awscdk.services.lambda.VersionProps.Builder
 */
fun versionProps(init: software.amazon.awscdk.services.lambda.VersionProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.VersionProps {
    val builder = software.amazon.awscdk.services.lambda.VersionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.VersionProps.Builder.withLambda
 */
var software.amazon.awscdk.services.lambda.VersionProps.Builder.lambda: software.amazon.awscdk.services.lambda.IFunction
    get() = throw NoSuchFieldException("Get on lambda is not supported.")
    set(value) { this.withLambda(value) }

/**
 * @see software.amazon.awscdk.services.lambda.VersionProps.Builder.withDescription
 */
var software.amazon.awscdk.services.lambda.VersionProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.lambda.VersionProps.Builder.withCodeSha256
 */
var software.amazon.awscdk.services.lambda.VersionProps.Builder.codeSha256: String
    get() = throw NoSuchFieldException("Get on codeSha256 is not supported.")
    set(value) { this.withCodeSha256(value) }


/**
 * @see software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder
 */
fun cfnPermissionProps(init: software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.CfnPermissionProps {
    val builder = software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder.withAction
 */
var software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder.action: String
    get() = throw NoSuchFieldException("Get on action is not supported.")
    set(value) { this.withAction(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder.withPrincipal
 */
var software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder.principal: String
    get() = throw NoSuchFieldException("Get on principal is not supported.")
    set(value) { this.withPrincipal(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder.withFunctionName
 */
var software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder.functionName: String
    get() = throw NoSuchFieldException("Get on functionName is not supported.")
    set(value) { this.withFunctionName(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder.withEventSourceToken
 */
var software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder.eventSourceToken: String
    get() = throw NoSuchFieldException("Get on eventSourceToken is not supported.")
    set(value) { this.withEventSourceToken(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder.withSourceAccount
 */
var software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder.sourceAccount: String
    get() = throw NoSuchFieldException("Get on sourceAccount is not supported.")
    set(value) { this.withSourceAccount(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder.withSourceArn
 */
var software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder.sourceArn: String
    get() = throw NoSuchFieldException("Get on sourceArn is not supported.")
    set(value) { this.withSourceArn(value) }


/**
 * @see software.amazon.awscdk.services.lambda.LayerVersionUsageGrantee.Builder
 */
fun layerVersionUsageGrantee(init: software.amazon.awscdk.services.lambda.LayerVersionUsageGrantee.Builder.() -> Unit): software.amazon.awscdk.services.lambda.LayerVersionUsageGrantee {
    val builder = software.amazon.awscdk.services.lambda.LayerVersionUsageGrantee.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.LayerVersionUsageGrantee.Builder.withOrganizationId
 */
var software.amazon.awscdk.services.lambda.LayerVersionUsageGrantee.Builder.organizationId: String
    get() = throw NoSuchFieldException("Get on organizationId is not supported.")
    set(value) { this.withOrganizationId(value) }

/**
 * @see software.amazon.awscdk.services.lambda.LayerVersionUsageGrantee.Builder.withAccountId
 */
var software.amazon.awscdk.services.lambda.LayerVersionUsageGrantee.Builder.accountId: String
    get() = throw NoSuchFieldException("Get on accountId is not supported.")
    set(value) { this.withAccountId(value) }


/**
 * @see software.amazon.awscdk.services.lambda.VersionWeight.Builder
 */
fun versionWeight(init: software.amazon.awscdk.services.lambda.VersionWeight.Builder.() -> Unit): software.amazon.awscdk.services.lambda.VersionWeight {
    val builder = software.amazon.awscdk.services.lambda.VersionWeight.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.VersionWeight.Builder.withVersion
 */
var software.amazon.awscdk.services.lambda.VersionWeight.Builder.version: software.amazon.awscdk.services.lambda.Version
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }

/**
 * @see software.amazon.awscdk.services.lambda.VersionWeight.Builder.withWeight
 */
var software.amazon.awscdk.services.lambda.VersionWeight.Builder.weight: Number
    get() = throw NoSuchFieldException("Get on weight is not supported.")
    set(value) { this.withWeight(value) }


/**
 * @see software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps.Builder
 */
fun cfnLayerVersionPermissionProps(init: software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps {
    val builder = software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps.Builder.withAction
 */
var software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps.Builder.action: String
    get() = throw NoSuchFieldException("Get on action is not supported.")
    set(value) { this.withAction(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps.Builder.withPrincipal
 */
var software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps.Builder.principal: String
    get() = throw NoSuchFieldException("Get on principal is not supported.")
    set(value) { this.withPrincipal(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps.Builder.withOrganizationId
 */
var software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps.Builder.organizationId: String
    get() = throw NoSuchFieldException("Get on organizationId is not supported.")
    set(value) { this.withOrganizationId(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps.Builder.withLayerVersionArn
 */
var software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps.Builder.layerVersionArn: String
    get() = throw NoSuchFieldException("Get on layerVersionArn is not supported.")
    set(value) { this.withLayerVersionArn(value) }


/**
 * @see software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder
 */
fun cfnFunctionProps(init: software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.CfnFunctionProps {
    val builder = software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.withFunctionName
 */
var software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.functionName: String
    get() = throw NoSuchFieldException("Get on functionName is not supported.")
    set(value) { this.withFunctionName(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.withCode
 */
var software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.code: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on code is not supported.")
    set(value) { this.withCode(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.withVpcConfig
 */
var software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.vpcConfig: software.amazon.awscdk.services.lambda.CfnFunction.VpcConfigProperty
    get() = throw NoSuchFieldException("Get on vpcConfig is not supported.")
    set(value) { this.withVpcConfig(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.withEnvironment
 */
var software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.environment: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on environment is not supported.")
    set(value) { this.withEnvironment(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.withMemorySize
 */
var software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.memorySize: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on memorySize is not supported.")
    set(value) { this.withMemorySize(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.withKmsKeyArn
 */
var software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.kmsKeyArn: String
    get() = throw NoSuchFieldException("Get on kmsKeyArn is not supported.")
    set(value) { this.withKmsKeyArn(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.withRole
 */
var software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.role: String
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.withTimeout
 */
var software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.timeout: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on timeout is not supported.")
    set(value) { this.withTimeout(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.withHandler
 */
var software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.handler: String
    get() = throw NoSuchFieldException("Get on handler is not supported.")
    set(value) { this.withHandler(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.withRuntime
 */
var software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.runtime: String
    get() = throw NoSuchFieldException("Get on runtime is not supported.")
    set(value) { this.withRuntime(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.withReservedConcurrentExecutions
 */
var software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.reservedConcurrentExecutions: Number
    get() = throw NoSuchFieldException("Get on reservedConcurrentExecutions is not supported.")
    set(value) { this.withReservedConcurrentExecutions(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.withDescription
 */
var software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.withDeadLetterConfig
 */
var software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.deadLetterConfig: software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty
    get() = throw NoSuchFieldException("Get on deadLetterConfig is not supported.")
    set(value) { this.withDeadLetterConfig(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.withTracingConfig
 */
var software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder.tracingConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on tracingConfig is not supported.")
    set(value) { this.withTracingConfig(value) }


/**
 * @see software.amazon.awscdk.services.lambda.CfnAliasProps.Builder
 */
fun cfnAliasProps(init: software.amazon.awscdk.services.lambda.CfnAliasProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.CfnAliasProps {
    val builder = software.amazon.awscdk.services.lambda.CfnAliasProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.CfnAliasProps.Builder.withFunctionName
 */
var software.amazon.awscdk.services.lambda.CfnAliasProps.Builder.functionName: String
    get() = throw NoSuchFieldException("Get on functionName is not supported.")
    set(value) { this.withFunctionName(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnAliasProps.Builder.withFunctionVersion
 */
var software.amazon.awscdk.services.lambda.CfnAliasProps.Builder.functionVersion: String
    get() = throw NoSuchFieldException("Get on functionVersion is not supported.")
    set(value) { this.withFunctionVersion(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnAliasProps.Builder.withRoutingConfig
 */
var software.amazon.awscdk.services.lambda.CfnAliasProps.Builder.routingConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on routingConfig is not supported.")
    set(value) { this.withRoutingConfig(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnAliasProps.Builder.withName
 */
var software.amazon.awscdk.services.lambda.CfnAliasProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnAliasProps.Builder.withDescription
 */
var software.amazon.awscdk.services.lambda.CfnAliasProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.lambda.LambdaRuntimeProps.Builder
 */
fun lambdaRuntimeProps(init: software.amazon.awscdk.services.lambda.LambdaRuntimeProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.LambdaRuntimeProps {
    val builder = software.amazon.awscdk.services.lambda.LambdaRuntimeProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.LambdaRuntimeProps.Builder.withSupportsInlineCode
 */
var software.amazon.awscdk.services.lambda.LambdaRuntimeProps.Builder.supportsInlineCode: Boolean
    get() = throw NoSuchFieldException("Get on supportsInlineCode is not supported.")
    set(value) { this.withSupportsInlineCode(value) }


/**
 * @see software.amazon.awscdk.services.lambda.FunctionImportProps.Builder
 */
fun functionImportProps(init: software.amazon.awscdk.services.lambda.FunctionImportProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.FunctionImportProps {
    val builder = software.amazon.awscdk.services.lambda.FunctionImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.FunctionImportProps.Builder.withFunctionArn
 */
var software.amazon.awscdk.services.lambda.FunctionImportProps.Builder.functionArn: String
    get() = throw NoSuchFieldException("Get on functionArn is not supported.")
    set(value) { this.withFunctionArn(value) }

/**
 * @see software.amazon.awscdk.services.lambda.FunctionImportProps.Builder.withRole
 */
var software.amazon.awscdk.services.lambda.FunctionImportProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.lambda.FunctionImportProps.Builder.withSecurityGroupId
 */
var software.amazon.awscdk.services.lambda.FunctionImportProps.Builder.securityGroupId: String
    get() = throw NoSuchFieldException("Get on securityGroupId is not supported.")
    set(value) { this.withSecurityGroupId(value) }


/**
 * @see software.amazon.awscdk.services.lambda.LayerVersionImportProps.Builder
 */
fun layerVersionImportProps(init: software.amazon.awscdk.services.lambda.LayerVersionImportProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.LayerVersionImportProps {
    val builder = software.amazon.awscdk.services.lambda.LayerVersionImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.LayerVersionImportProps.Builder.withLayerVersionArn
 */
var software.amazon.awscdk.services.lambda.LayerVersionImportProps.Builder.layerVersionArn: String
    get() = throw NoSuchFieldException("Get on layerVersionArn is not supported.")
    set(value) { this.withLayerVersionArn(value) }


/**
 * @see software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty.Builder
 */
fun codeProperty(init: software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty.Builder.() -> Unit): software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty {
    val builder = software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty.Builder.withS3Bucket
 */
var software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty.Builder.s3Bucket: String
    get() = throw NoSuchFieldException("Get on s3Bucket is not supported.")
    set(value) { this.withS3Bucket(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty.Builder.withS3ObjectVersion
 */
var software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty.Builder.s3ObjectVersion: String
    get() = throw NoSuchFieldException("Get on s3ObjectVersion is not supported.")
    set(value) { this.withS3ObjectVersion(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty.Builder.withS3Key
 */
var software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty.Builder.s3Key: String
    get() = throw NoSuchFieldException("Get on s3Key is not supported.")
    set(value) { this.withS3Key(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty.Builder.withZipFile
 */
var software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty.Builder.zipFile: String
    get() = throw NoSuchFieldException("Get on zipFile is not supported.")
    set(value) { this.withZipFile(value) }


/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder
 */
fun singletonFunctionProps(init: software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.SingletonFunctionProps {
    val builder = software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withFunctionName
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.functionName: String
    get() = throw NoSuchFieldException("Get on functionName is not supported.")
    set(value) { this.withFunctionName(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withCode
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.code: software.amazon.awscdk.services.lambda.Code
    get() = throw NoSuchFieldException("Get on code is not supported.")
    set(value) { this.withCode(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withAllowAllOutbound
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.allowAllOutbound: Boolean
    get() = throw NoSuchFieldException("Get on allowAllOutbound is not supported.")
    set(value) { this.withAllowAllOutbound(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withVpcSubnets
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.vpcSubnets: software.amazon.awscdk.services.ec2.SubnetSelection
    get() = throw NoSuchFieldException("Get on vpcSubnets is not supported.")
    set(value) { this.withVpcSubnets(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withSecurityGroup
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.securityGroup: software.amazon.awscdk.services.ec2.ISecurityGroup
    get() = throw NoSuchFieldException("Get on securityGroup is not supported.")
    set(value) { this.withSecurityGroup(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withMemorySize
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.memorySize: Number
    get() = throw NoSuchFieldException("Get on memorySize is not supported.")
    set(value) { this.withMemorySize(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withRole
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withTimeout
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.timeout: Number
    get() = throw NoSuchFieldException("Get on timeout is not supported.")
    set(value) { this.withTimeout(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withHandler
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.handler: String
    get() = throw NoSuchFieldException("Get on handler is not supported.")
    set(value) { this.withHandler(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withRuntime
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.runtime: software.amazon.awscdk.services.lambda.Runtime
    get() = throw NoSuchFieldException("Get on runtime is not supported.")
    set(value) { this.withRuntime(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withDeadLetterQueue
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.deadLetterQueue: software.amazon.awscdk.services.sqs.IQueue
    get() = throw NoSuchFieldException("Get on deadLetterQueue is not supported.")
    set(value) { this.withDeadLetterQueue(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withDeadLetterQueueEnabled
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.deadLetterQueueEnabled: Boolean
    get() = throw NoSuchFieldException("Get on deadLetterQueueEnabled is not supported.")
    set(value) { this.withDeadLetterQueueEnabled(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withLogRetentionDays
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.logRetentionDays: software.amazon.awscdk.services.logs.RetentionDays
    get() = throw NoSuchFieldException("Get on logRetentionDays is not supported.")
    set(value) { this.withLogRetentionDays(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withReservedConcurrentExecutions
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.reservedConcurrentExecutions: Number
    get() = throw NoSuchFieldException("Get on reservedConcurrentExecutions is not supported.")
    set(value) { this.withReservedConcurrentExecutions(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withTracing
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.tracing: software.amazon.awscdk.services.lambda.Tracing
    get() = throw NoSuchFieldException("Get on tracing is not supported.")
    set(value) { this.withTracing(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withVpc
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.vpc: software.amazon.awscdk.services.ec2.IVpcNetwork
    get() = throw NoSuchFieldException("Get on vpc is not supported.")
    set(value) { this.withVpc(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withDescription
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withUuid
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.uuid: String
    get() = throw NoSuchFieldException("Get on uuid is not supported.")
    set(value) { this.withUuid(value) }

/**
 * @see software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.withLambdaPurpose
 */
var software.amazon.awscdk.services.lambda.SingletonFunctionProps.Builder.lambdaPurpose: String
    get() = throw NoSuchFieldException("Get on lambdaPurpose is not supported.")
    set(value) { this.withLambdaPurpose(value) }


/**
 * @see software.amazon.awscdk.services.lambda.CfnVersionProps.Builder
 */
fun cfnVersionProps(init: software.amazon.awscdk.services.lambda.CfnVersionProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.CfnVersionProps {
    val builder = software.amazon.awscdk.services.lambda.CfnVersionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.CfnVersionProps.Builder.withFunctionName
 */
var software.amazon.awscdk.services.lambda.CfnVersionProps.Builder.functionName: String
    get() = throw NoSuchFieldException("Get on functionName is not supported.")
    set(value) { this.withFunctionName(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnVersionProps.Builder.withDescription
 */
var software.amazon.awscdk.services.lambda.CfnVersionProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnVersionProps.Builder.withCodeSha256
 */
var software.amazon.awscdk.services.lambda.CfnVersionProps.Builder.codeSha256: String
    get() = throw NoSuchFieldException("Get on codeSha256 is not supported.")
    set(value) { this.withCodeSha256(value) }


/**
 * @see software.amazon.awscdk.services.lambda.Permission.Builder
 */
fun permission(init: software.amazon.awscdk.services.lambda.Permission.Builder.() -> Unit): software.amazon.awscdk.services.lambda.Permission {
    val builder = software.amazon.awscdk.services.lambda.Permission.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.Permission.Builder.withAction
 */
var software.amazon.awscdk.services.lambda.Permission.Builder.action: String
    get() = throw NoSuchFieldException("Get on action is not supported.")
    set(value) { this.withAction(value) }

/**
 * @see software.amazon.awscdk.services.lambda.Permission.Builder.withPrincipal
 */
var software.amazon.awscdk.services.lambda.Permission.Builder.principal: software.amazon.awscdk.services.iam.PolicyPrincipal
    get() = throw NoSuchFieldException("Get on principal is not supported.")
    set(value) { this.withPrincipal(value) }

/**
 * @see software.amazon.awscdk.services.lambda.Permission.Builder.withEventSourceToken
 */
var software.amazon.awscdk.services.lambda.Permission.Builder.eventSourceToken: String
    get() = throw NoSuchFieldException("Get on eventSourceToken is not supported.")
    set(value) { this.withEventSourceToken(value) }

/**
 * @see software.amazon.awscdk.services.lambda.Permission.Builder.withSourceAccount
 */
var software.amazon.awscdk.services.lambda.Permission.Builder.sourceAccount: String
    get() = throw NoSuchFieldException("Get on sourceAccount is not supported.")
    set(value) { this.withSourceAccount(value) }

/**
 * @see software.amazon.awscdk.services.lambda.Permission.Builder.withSourceArn
 */
var software.amazon.awscdk.services.lambda.Permission.Builder.sourceArn: String
    get() = throw NoSuchFieldException("Get on sourceArn is not supported.")
    set(value) { this.withSourceArn(value) }


/**
 * @see software.amazon.awscdk.services.lambda.LogRetentionProps.Builder
 */
fun logRetentionProps(init: software.amazon.awscdk.services.lambda.LogRetentionProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.LogRetentionProps {
    val builder = software.amazon.awscdk.services.lambda.LogRetentionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.LogRetentionProps.Builder.withLogGroupName
 */
var software.amazon.awscdk.services.lambda.LogRetentionProps.Builder.logGroupName: String
    get() = throw NoSuchFieldException("Get on logGroupName is not supported.")
    set(value) { this.withLogGroupName(value) }

/**
 * @see software.amazon.awscdk.services.lambda.LogRetentionProps.Builder.withRetentionDays
 */
var software.amazon.awscdk.services.lambda.LogRetentionProps.Builder.retentionDays: software.amazon.awscdk.services.logs.RetentionDays
    get() = throw NoSuchFieldException("Get on retentionDays is not supported.")
    set(value) { this.withRetentionDays(value) }


/**
 * @see software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty.Builder
 */
fun versionWeightProperty(init: software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty.Builder.() -> Unit): software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty {
    val builder = software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty.Builder.withFunctionVersion
 */
var software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty.Builder.functionVersion: String
    get() = throw NoSuchFieldException("Get on functionVersion is not supported.")
    set(value) { this.withFunctionVersion(value) }

/**
 * @see software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty.Builder.withFunctionWeight
 */
var software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty.Builder.functionWeight: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on functionWeight is not supported.")
    set(value) { this.withFunctionWeight(value) }
