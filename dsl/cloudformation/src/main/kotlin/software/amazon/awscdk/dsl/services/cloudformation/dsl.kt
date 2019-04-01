package software.amazon.awscdk.dsl.services.cloudformation
/**
 * @see software.amazon.awscdk.services.cloudformation.CfnCustomResource
 */
fun software.amazon.awscdk.Construct.cfnCustomResource(id: String,
                     props: software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps? = null,
                     init: (software.amazon.awscdk.services.cloudformation.CfnCustomResource.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudformation.CfnCustomResource {

    val obj = software.amazon.awscdk.services.cloudformation.CfnCustomResource(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cloudformation.CfnStack
 */
fun software.amazon.awscdk.Construct.cfnStack(id: String,
                     props: software.amazon.awscdk.services.cloudformation.CfnStackProps? = null,
                     init: (software.amazon.awscdk.services.cloudformation.CfnStack.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudformation.CfnStack {

    val obj = software.amazon.awscdk.services.cloudformation.CfnStack(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cloudformation.CfnMacro
 */
fun software.amazon.awscdk.Construct.cfnMacro(id: String,
                     props: software.amazon.awscdk.services.cloudformation.CfnMacroProps? = null,
                     init: (software.amazon.awscdk.services.cloudformation.CfnMacro.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudformation.CfnMacro {

    val obj = software.amazon.awscdk.services.cloudformation.CfnMacro(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cloudformation.CfnWaitCondition
 */
fun software.amazon.awscdk.Construct.cfnWaitCondition(id: String,
                     props: software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps? = null,
                     init: (software.amazon.awscdk.services.cloudformation.CfnWaitCondition.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudformation.CfnWaitCondition {

    val obj = software.amazon.awscdk.services.cloudformation.CfnWaitCondition(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cloudformation.CustomResource
 */
fun software.amazon.awscdk.Construct.customResource(id: String,
                     props: software.amazon.awscdk.services.cloudformation.CustomResourceProps? = null,
                     init: (software.amazon.awscdk.services.cloudformation.CustomResource.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudformation.CustomResource {

    val obj = software.amazon.awscdk.services.cloudformation.CustomResource(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandle
 */
fun software.amazon.awscdk.Construct.cfnWaitConditionHandle(id: String,
                     init: (software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandle.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandle {

    val obj = software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandle(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cloudformation.CfnWaitCondition
 */
fun software.amazon.awscdk.Construct.cfnWaitCondition(id: String,
                     init: (software.amazon.awscdk.services.cloudformation.CfnWaitCondition.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudformation.CfnWaitCondition {

    val obj = software.amazon.awscdk.services.cloudformation.CfnWaitCondition(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.cloudformation.CfnMacroProps.Builder
 */
fun cfnMacroProps(init: software.amazon.awscdk.services.cloudformation.CfnMacroProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudformation.CfnMacroProps {
    val builder = software.amazon.awscdk.services.cloudformation.CfnMacroProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudformation.CfnMacroProps.Builder.withLogGroupName
 */
var software.amazon.awscdk.services.cloudformation.CfnMacroProps.Builder.logGroupName: String
    get() = throw NoSuchFieldException("Get on logGroupName is not supported.")
    set(value) { this.withLogGroupName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.CfnMacroProps.Builder.withFunctionName
 */
var software.amazon.awscdk.services.cloudformation.CfnMacroProps.Builder.functionName: String
    get() = throw NoSuchFieldException("Get on functionName is not supported.")
    set(value) { this.withFunctionName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.CfnMacroProps.Builder.withLogRoleArn
 */
var software.amazon.awscdk.services.cloudformation.CfnMacroProps.Builder.logRoleArn: String
    get() = throw NoSuchFieldException("Get on logRoleArn is not supported.")
    set(value) { this.withLogRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.CfnMacroProps.Builder.withName
 */
var software.amazon.awscdk.services.cloudformation.CfnMacroProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.CfnMacroProps.Builder.withDescription
 */
var software.amazon.awscdk.services.cloudformation.CfnMacroProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationActionProps.Builder
 */
fun pipelineCloudFormationActionProps(init: software.amazon.awscdk.services.cloudformation.PipelineCloudFormationActionProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudformation.PipelineCloudFormationActionProps {
    val builder = software.amazon.awscdk.services.cloudformation.PipelineCloudFormationActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationActionProps.Builder.withStackName
 */
var software.amazon.awscdk.services.cloudformation.PipelineCloudFormationActionProps.Builder.stackName: String
    get() = throw NoSuchFieldException("Get on stackName is not supported.")
    set(value) { this.withStackName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationActionProps.Builder.withOutputFileName
 */
var software.amazon.awscdk.services.cloudformation.PipelineCloudFormationActionProps.Builder.outputFileName: String
    get() = throw NoSuchFieldException("Get on outputFileName is not supported.")
    set(value) { this.withOutputFileName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationActionProps.Builder.withRegion
 */
var software.amazon.awscdk.services.cloudformation.PipelineCloudFormationActionProps.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.cloudformation.PipelineCloudFormationActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationActionProps.Builder.withRole
 */
var software.amazon.awscdk.services.cloudformation.PipelineCloudFormationActionProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.cloudformation.PipelineCloudFormationActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.cloudformation.PipelineCloudFormationActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }


/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder
 */
fun pipelineCreateReplaceChangeSetActionProps(init: software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps {
    val builder = software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.withStackName
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.stackName: String
    get() = throw NoSuchFieldException("Get on stackName is not supported.")
    set(value) { this.withStackName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.withTemplatePath
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.templatePath: software.amazon.awscdk.services.codepipeline.api.ArtifactPath
    get() = throw NoSuchFieldException("Get on templatePath is not supported.")
    set(value) { this.withTemplatePath(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.withDeploymentRole
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.deploymentRole: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on deploymentRole is not supported.")
    set(value) { this.withDeploymentRole(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.withTemplateConfiguration
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.templateConfiguration: software.amazon.awscdk.services.codepipeline.api.ArtifactPath
    get() = throw NoSuchFieldException("Get on templateConfiguration is not supported.")
    set(value) { this.withTemplateConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.withOutputFileName
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.outputFileName: String
    get() = throw NoSuchFieldException("Get on outputFileName is not supported.")
    set(value) { this.withOutputFileName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.withRegion
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.withRole
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.withAdminPermissions
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.adminPermissions: Boolean
    get() = throw NoSuchFieldException("Get on adminPermissions is not supported.")
    set(value) { this.withAdminPermissions(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.withCapabilities
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.capabilities: software.amazon.awscdk.services.cloudformation.CloudFormationCapabilities
    get() = throw NoSuchFieldException("Get on capabilities is not supported.")
    set(value) { this.withCapabilities(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.withChangeSetName
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateReplaceChangeSetActionProps.Builder.changeSetName: String
    get() = throw NoSuchFieldException("Get on changeSetName is not supported.")
    set(value) { this.withChangeSetName(value) }


/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder
 */
fun pipelineCloudFormationDeployActionProps(init: software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps {
    val builder = software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.withStackName
 */
var software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.stackName: String
    get() = throw NoSuchFieldException("Get on stackName is not supported.")
    set(value) { this.withStackName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.withDeploymentRole
 */
var software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.deploymentRole: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on deploymentRole is not supported.")
    set(value) { this.withDeploymentRole(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.withTemplateConfiguration
 */
var software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.templateConfiguration: software.amazon.awscdk.services.codepipeline.api.ArtifactPath
    get() = throw NoSuchFieldException("Get on templateConfiguration is not supported.")
    set(value) { this.withTemplateConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.withOutputFileName
 */
var software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.outputFileName: String
    get() = throw NoSuchFieldException("Get on outputFileName is not supported.")
    set(value) { this.withOutputFileName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.withRegion
 */
var software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.withRole
 */
var software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.withAdminPermissions
 */
var software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.adminPermissions: Boolean
    get() = throw NoSuchFieldException("Get on adminPermissions is not supported.")
    set(value) { this.withAdminPermissions(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.withCapabilities
 */
var software.amazon.awscdk.services.cloudformation.PipelineCloudFormationDeployActionProps.Builder.capabilities: software.amazon.awscdk.services.cloudformation.CloudFormationCapabilities
    get() = throw NoSuchFieldException("Get on capabilities is not supported.")
    set(value) { this.withCapabilities(value) }


/**
 * @see software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps.Builder
 */
fun cfnCustomResourceProps(init: software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps {
    val builder = software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps.Builder.withServiceToken
 */
var software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps.Builder.serviceToken: String
    get() = throw NoSuchFieldException("Get on serviceToken is not supported.")
    set(value) { this.withServiceToken(value) }


/**
 * @see software.amazon.awscdk.services.cloudformation.CustomResourceProps.Builder
 */
fun customResourceProps(init: software.amazon.awscdk.services.cloudformation.CustomResourceProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudformation.CustomResourceProps {
    val builder = software.amazon.awscdk.services.cloudformation.CustomResourceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudformation.CustomResourceProps.Builder.withResourceType
 */
var software.amazon.awscdk.services.cloudformation.CustomResourceProps.Builder.resourceType: String
    get() = throw NoSuchFieldException("Get on resourceType is not supported.")
    set(value) { this.withResourceType(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.CustomResourceProps.Builder.withLambdaProvider
 */
var software.amazon.awscdk.services.cloudformation.CustomResourceProps.Builder.lambdaProvider: software.amazon.awscdk.services.lambda.IFunction
    get() = throw NoSuchFieldException("Get on lambdaProvider is not supported.")
    set(value) { this.withLambdaProvider(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.CustomResourceProps.Builder.withTopicProvider
 */
var software.amazon.awscdk.services.cloudformation.CustomResourceProps.Builder.topicProvider: software.amazon.awscdk.services.sns.ITopic
    get() = throw NoSuchFieldException("Get on topicProvider is not supported.")
    set(value) { this.withTopicProvider(value) }


/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder
 */
fun pipelineDeleteStackActionProps(init: software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps {
    val builder = software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.withStackName
 */
var software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.stackName: String
    get() = throw NoSuchFieldException("Get on stackName is not supported.")
    set(value) { this.withStackName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.withDeploymentRole
 */
var software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.deploymentRole: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on deploymentRole is not supported.")
    set(value) { this.withDeploymentRole(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.withTemplateConfiguration
 */
var software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.templateConfiguration: software.amazon.awscdk.services.codepipeline.api.ArtifactPath
    get() = throw NoSuchFieldException("Get on templateConfiguration is not supported.")
    set(value) { this.withTemplateConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.withOutputFileName
 */
var software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.outputFileName: String
    get() = throw NoSuchFieldException("Get on outputFileName is not supported.")
    set(value) { this.withOutputFileName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.withRegion
 */
var software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.withRole
 */
var software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.withAdminPermissions
 */
var software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.adminPermissions: Boolean
    get() = throw NoSuchFieldException("Get on adminPermissions is not supported.")
    set(value) { this.withAdminPermissions(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.withCapabilities
 */
var software.amazon.awscdk.services.cloudformation.PipelineDeleteStackActionProps.Builder.capabilities: software.amazon.awscdk.services.cloudformation.CloudFormationCapabilities
    get() = throw NoSuchFieldException("Get on capabilities is not supported.")
    set(value) { this.withCapabilities(value) }


/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder
 */
fun pipelineExecuteChangeSetActionProps(init: software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps {
    val builder = software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder.withStackName
 */
var software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder.stackName: String
    get() = throw NoSuchFieldException("Get on stackName is not supported.")
    set(value) { this.withStackName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder.withOutputFileName
 */
var software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder.outputFileName: String
    get() = throw NoSuchFieldException("Get on outputFileName is not supported.")
    set(value) { this.withOutputFileName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder.withRegion
 */
var software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder.withRole
 */
var software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder.withChangeSetName
 */
var software.amazon.awscdk.services.cloudformation.PipelineExecuteChangeSetActionProps.Builder.changeSetName: String
    get() = throw NoSuchFieldException("Get on changeSetName is not supported.")
    set(value) { this.withChangeSetName(value) }


/**
 * @see software.amazon.awscdk.services.cloudformation.CfnStackProps.Builder
 */
fun cfnStackProps(init: software.amazon.awscdk.services.cloudformation.CfnStackProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudformation.CfnStackProps {
    val builder = software.amazon.awscdk.services.cloudformation.CfnStackProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudformation.CfnStackProps.Builder.withTimeoutInMinutes
 */
var software.amazon.awscdk.services.cloudformation.CfnStackProps.Builder.timeoutInMinutes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on timeoutInMinutes is not supported.")
    set(value) { this.withTimeoutInMinutes(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.CfnStackProps.Builder.withParameters
 */
var software.amazon.awscdk.services.cloudformation.CfnStackProps.Builder.parameters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on parameters is not supported.")
    set(value) { this.withParameters(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.CfnStackProps.Builder.withTemplateUrl
 */
var software.amazon.awscdk.services.cloudformation.CfnStackProps.Builder.templateUrl: String
    get() = throw NoSuchFieldException("Get on templateUrl is not supported.")
    set(value) { this.withTemplateUrl(value) }


/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder
 */
fun pipelineCreateUpdateStackActionProps(init: software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps {
    val builder = software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.withStackName
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.stackName: String
    get() = throw NoSuchFieldException("Get on stackName is not supported.")
    set(value) { this.withStackName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.withTemplatePath
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.templatePath: software.amazon.awscdk.services.codepipeline.api.ArtifactPath
    get() = throw NoSuchFieldException("Get on templatePath is not supported.")
    set(value) { this.withTemplatePath(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.withReplaceOnFailure
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.replaceOnFailure: Boolean
    get() = throw NoSuchFieldException("Get on replaceOnFailure is not supported.")
    set(value) { this.withReplaceOnFailure(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.withDeploymentRole
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.deploymentRole: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on deploymentRole is not supported.")
    set(value) { this.withDeploymentRole(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.withTemplateConfiguration
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.templateConfiguration: software.amazon.awscdk.services.codepipeline.api.ArtifactPath
    get() = throw NoSuchFieldException("Get on templateConfiguration is not supported.")
    set(value) { this.withTemplateConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.withOutputFileName
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.outputFileName: String
    get() = throw NoSuchFieldException("Get on outputFileName is not supported.")
    set(value) { this.withOutputFileName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.withRegion
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.withRole
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.withAdminPermissions
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.adminPermissions: Boolean
    get() = throw NoSuchFieldException("Get on adminPermissions is not supported.")
    set(value) { this.withAdminPermissions(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.withCapabilities
 */
var software.amazon.awscdk.services.cloudformation.PipelineCreateUpdateStackActionProps.Builder.capabilities: software.amazon.awscdk.services.cloudformation.CloudFormationCapabilities
    get() = throw NoSuchFieldException("Get on capabilities is not supported.")
    set(value) { this.withCapabilities(value) }


/**
 * @see software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps.Builder
 */
fun cfnWaitConditionProps(init: software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps {
    val builder = software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps.Builder.withCount
 */
var software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps.Builder.count: Number
    get() = throw NoSuchFieldException("Get on count is not supported.")
    set(value) { this.withCount(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps.Builder.withTimeout
 */
var software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps.Builder.timeout: String
    get() = throw NoSuchFieldException("Get on timeout is not supported.")
    set(value) { this.withTimeout(value) }

/**
 * @see software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps.Builder.withHandle
 */
var software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps.Builder.handle: String
    get() = throw NoSuchFieldException("Get on handle is not supported.")
    set(value) { this.withHandle(value) }
