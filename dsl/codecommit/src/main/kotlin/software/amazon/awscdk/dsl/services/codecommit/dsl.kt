package software.amazon.awscdk.dsl.services.codecommit
/**
 * @see software.amazon.awscdk.services.codecommit.Repository
 */
fun software.amazon.awscdk.Construct.repository(id: String,
                     props: software.amazon.awscdk.services.codecommit.RepositoryProps? = null,
                     init: (software.amazon.awscdk.services.codecommit.Repository.() -> Unit)? = null)
        : software.amazon.awscdk.services.codecommit.Repository {

    val obj = software.amazon.awscdk.services.codecommit.Repository(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.codecommit.CfnRepository
 */
fun software.amazon.awscdk.Construct.cfnRepository(id: String,
                     props: software.amazon.awscdk.services.codecommit.CfnRepositoryProps? = null,
                     init: (software.amazon.awscdk.services.codecommit.CfnRepository.() -> Unit)? = null)
        : software.amazon.awscdk.services.codecommit.CfnRepository {

    val obj = software.amazon.awscdk.services.codecommit.CfnRepository(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions.Builder
 */
fun repositoryTriggerOptions(init: software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions.Builder.() -> Unit): software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions {
    val builder = software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions.Builder.withName
 */
var software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions.Builder.withCustomData
 */
var software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions.Builder.customData: String
    get() = throw NoSuchFieldException("Get on customData is not supported.")
    set(value) { this.withCustomData(value) }


/**
 * @see software.amazon.awscdk.services.codecommit.RepositoryProps.Builder
 */
fun repositoryProps(init: software.amazon.awscdk.services.codecommit.RepositoryProps.Builder.() -> Unit): software.amazon.awscdk.services.codecommit.RepositoryProps {
    val builder = software.amazon.awscdk.services.codecommit.RepositoryProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codecommit.RepositoryProps.Builder.withRepositoryName
 */
var software.amazon.awscdk.services.codecommit.RepositoryProps.Builder.repositoryName: String
    get() = throw NoSuchFieldException("Get on repositoryName is not supported.")
    set(value) { this.withRepositoryName(value) }

/**
 * @see software.amazon.awscdk.services.codecommit.RepositoryProps.Builder.withDescription
 */
var software.amazon.awscdk.services.codecommit.RepositoryProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.codecommit.CommonPipelineSourceActionProps.Builder
 */
fun commonPipelineSourceActionProps(init: software.amazon.awscdk.services.codecommit.CommonPipelineSourceActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codecommit.CommonPipelineSourceActionProps {
    val builder = software.amazon.awscdk.services.codecommit.CommonPipelineSourceActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codecommit.CommonPipelineSourceActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.codecommit.CommonPipelineSourceActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.codecommit.CommonPipelineSourceActionProps.Builder.withBranch
 */
var software.amazon.awscdk.services.codecommit.CommonPipelineSourceActionProps.Builder.branch: String
    get() = throw NoSuchFieldException("Get on branch is not supported.")
    set(value) { this.withBranch(value) }

/**
 * @see software.amazon.awscdk.services.codecommit.CommonPipelineSourceActionProps.Builder.withPollForSourceChanges
 */
var software.amazon.awscdk.services.codecommit.CommonPipelineSourceActionProps.Builder.pollForSourceChanges: Boolean
    get() = throw NoSuchFieldException("Get on pollForSourceChanges is not supported.")
    set(value) { this.withPollForSourceChanges(value) }

/**
 * @see software.amazon.awscdk.services.codecommit.CommonPipelineSourceActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codecommit.CommonPipelineSourceActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codecommit.CommonPipelineSourceActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codecommit.CommonPipelineSourceActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }


/**
 * @see software.amazon.awscdk.services.codecommit.PipelineSourceActionProps.Builder
 */
fun pipelineSourceActionProps(init: software.amazon.awscdk.services.codecommit.PipelineSourceActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codecommit.PipelineSourceActionProps {
    val builder = software.amazon.awscdk.services.codecommit.PipelineSourceActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codecommit.PipelineSourceActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.codecommit.PipelineSourceActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.codecommit.PipelineSourceActionProps.Builder.withBranch
 */
var software.amazon.awscdk.services.codecommit.PipelineSourceActionProps.Builder.branch: String
    get() = throw NoSuchFieldException("Get on branch is not supported.")
    set(value) { this.withBranch(value) }

/**
 * @see software.amazon.awscdk.services.codecommit.PipelineSourceActionProps.Builder.withPollForSourceChanges
 */
var software.amazon.awscdk.services.codecommit.PipelineSourceActionProps.Builder.pollForSourceChanges: Boolean
    get() = throw NoSuchFieldException("Get on pollForSourceChanges is not supported.")
    set(value) { this.withPollForSourceChanges(value) }

/**
 * @see software.amazon.awscdk.services.codecommit.PipelineSourceActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codecommit.PipelineSourceActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codecommit.PipelineSourceActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codecommit.PipelineSourceActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.codecommit.PipelineSourceActionProps.Builder.withRepository
 */
var software.amazon.awscdk.services.codecommit.PipelineSourceActionProps.Builder.repository: software.amazon.awscdk.services.codecommit.IRepository
    get() = throw NoSuchFieldException("Get on repository is not supported.")
    set(value) { this.withRepository(value) }


/**
 * @see software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty.Builder
 */
fun repositoryTriggerProperty(init: software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty.Builder.() -> Unit): software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty {
    val builder = software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty.Builder.withDestinationArn
 */
var software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty.Builder.destinationArn: String
    get() = throw NoSuchFieldException("Get on destinationArn is not supported.")
    set(value) { this.withDestinationArn(value) }

/**
 * @see software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty.Builder.withName
 */
var software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty.Builder.withCustomData
 */
var software.amazon.awscdk.services.codecommit.CfnRepository.RepositoryTriggerProperty.Builder.customData: String
    get() = throw NoSuchFieldException("Get on customData is not supported.")
    set(value) { this.withCustomData(value) }


/**
 * @see software.amazon.awscdk.services.codecommit.RepositoryImportProps.Builder
 */
fun repositoryImportProps(init: software.amazon.awscdk.services.codecommit.RepositoryImportProps.Builder.() -> Unit): software.amazon.awscdk.services.codecommit.RepositoryImportProps {
    val builder = software.amazon.awscdk.services.codecommit.RepositoryImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codecommit.RepositoryImportProps.Builder.withRepositoryName
 */
var software.amazon.awscdk.services.codecommit.RepositoryImportProps.Builder.repositoryName: String
    get() = throw NoSuchFieldException("Get on repositoryName is not supported.")
    set(value) { this.withRepositoryName(value) }


/**
 * @see software.amazon.awscdk.services.codecommit.CfnRepositoryProps.Builder
 */
fun cfnRepositoryProps(init: software.amazon.awscdk.services.codecommit.CfnRepositoryProps.Builder.() -> Unit): software.amazon.awscdk.services.codecommit.CfnRepositoryProps {
    val builder = software.amazon.awscdk.services.codecommit.CfnRepositoryProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codecommit.CfnRepositoryProps.Builder.withRepositoryName
 */
var software.amazon.awscdk.services.codecommit.CfnRepositoryProps.Builder.repositoryName: String
    get() = throw NoSuchFieldException("Get on repositoryName is not supported.")
    set(value) { this.withRepositoryName(value) }

/**
 * @see software.amazon.awscdk.services.codecommit.CfnRepositoryProps.Builder.withRepositoryDescription
 */
var software.amazon.awscdk.services.codecommit.CfnRepositoryProps.Builder.repositoryDescription: String
    get() = throw NoSuchFieldException("Get on repositoryDescription is not supported.")
    set(value) { this.withRepositoryDescription(value) }

/**
 * @see software.amazon.awscdk.services.codecommit.CfnRepositoryProps.Builder.withTriggers
 */
var software.amazon.awscdk.services.codecommit.CfnRepositoryProps.Builder.triggers: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on triggers is not supported.")
    set(value) { this.withTriggers(value) }
