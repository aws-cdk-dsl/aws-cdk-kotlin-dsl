package software.amazon.awscdk.dsl.appdelivery
/**
 * @see software.amazon.awscdk.appdelivery.PipelineDeployStackAction
 */
fun software.amazon.awscdk.Construct.pipelineDeployStackAction(id: String,
                     props: software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps? = null,
                     init: (software.amazon.awscdk.appdelivery.PipelineDeployStackAction.() -> Unit)? = null)
        : software.amazon.awscdk.appdelivery.PipelineDeployStackAction {

    val obj = software.amazon.awscdk.appdelivery.PipelineDeployStackAction(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder
 */
fun pipelineDeployStackActionProps(init: software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.() -> Unit): software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps {
    val builder = software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.withInputArtifact
 */
var software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.inputArtifact: software.amazon.awscdk.services.codepipeline.api.Artifact
    get() = throw NoSuchFieldException("Get on inputArtifact is not supported.")
    set(value) { this.withInputArtifact(value) }

/**
 * @see software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.withRole
 */
var software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.withAdminPermissions
 */
var software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.adminPermissions: Boolean
    get() = throw NoSuchFieldException("Get on adminPermissions is not supported.")
    set(value) { this.withAdminPermissions(value) }

/**
 * @see software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.withStack
 */
var software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.stack: software.amazon.awscdk.Stack
    get() = throw NoSuchFieldException("Get on stack is not supported.")
    set(value) { this.withStack(value) }

/**
 * @see software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.withStage
 */
var software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.stage: software.amazon.awscdk.services.codepipeline.api.IStage
    get() = throw NoSuchFieldException("Get on stage is not supported.")
    set(value) { this.withStage(value) }

/**
 * @see software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.withCapabilities
 */
var software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.capabilities: software.amazon.awscdk.services.cloudformation.CloudFormationCapabilities
    get() = throw NoSuchFieldException("Get on capabilities is not supported.")
    set(value) { this.withCapabilities(value) }

/**
 * @see software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.withChangeSetName
 */
var software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.changeSetName: String
    get() = throw NoSuchFieldException("Get on changeSetName is not supported.")
    set(value) { this.withChangeSetName(value) }

/**
 * @see software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.withCreateChangeSetRunOrder
 */
var software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.createChangeSetRunOrder: Number
    get() = throw NoSuchFieldException("Get on createChangeSetRunOrder is not supported.")
    set(value) { this.withCreateChangeSetRunOrder(value) }

/**
 * @see software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.withExecuteChangeSetRunOrder
 */
var software.amazon.awscdk.appdelivery.PipelineDeployStackActionProps.Builder.executeChangeSetRunOrder: Number
    get() = throw NoSuchFieldException("Get on executeChangeSetRunOrder is not supported.")
    set(value) { this.withExecuteChangeSetRunOrder(value) }
