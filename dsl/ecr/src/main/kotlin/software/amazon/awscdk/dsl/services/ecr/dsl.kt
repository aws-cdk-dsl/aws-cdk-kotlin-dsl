package software.amazon.awscdk.dsl.services.ecr
/**
 * @see software.amazon.awscdk.services.ecr.CfnRepository
 */
fun software.amazon.awscdk.Construct.cfnRepository(id: String,
                     props: software.amazon.awscdk.services.ecr.CfnRepositoryProps? = null,
                     init: (software.amazon.awscdk.services.ecr.CfnRepository.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecr.CfnRepository {

    val obj = software.amazon.awscdk.services.ecr.CfnRepository(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecr.Repository
 */
fun software.amazon.awscdk.Construct.repository(id: String,
                     props: software.amazon.awscdk.services.ecr.RepositoryProps? = null,
                     init: (software.amazon.awscdk.services.ecr.Repository.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecr.Repository {

    val obj = software.amazon.awscdk.services.ecr.Repository(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecr.CfnRepository
 */
fun software.amazon.awscdk.Construct.cfnRepository(id: String,
                     init: (software.amazon.awscdk.services.ecr.CfnRepository.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecr.CfnRepository {

    val obj = software.amazon.awscdk.services.ecr.CfnRepository(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecr.Repository
 */
fun software.amazon.awscdk.Construct.repository(id: String,
                     init: (software.amazon.awscdk.services.ecr.Repository.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecr.Repository {

    val obj = software.amazon.awscdk.services.ecr.Repository(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.ecr.CommonPipelineSourceActionProps.Builder
 */
fun commonPipelineSourceActionProps(init: software.amazon.awscdk.services.ecr.CommonPipelineSourceActionProps.Builder.() -> Unit): software.amazon.awscdk.services.ecr.CommonPipelineSourceActionProps {
    val builder = software.amazon.awscdk.services.ecr.CommonPipelineSourceActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecr.CommonPipelineSourceActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.ecr.CommonPipelineSourceActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.ecr.CommonPipelineSourceActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.ecr.CommonPipelineSourceActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.ecr.CommonPipelineSourceActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.ecr.CommonPipelineSourceActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.ecr.CommonPipelineSourceActionProps.Builder.withImageTag
 */
var software.amazon.awscdk.services.ecr.CommonPipelineSourceActionProps.Builder.imageTag: String
    get() = throw NoSuchFieldException("Get on imageTag is not supported.")
    set(value) { this.withImageTag(value) }


/**
 * @see software.amazon.awscdk.services.ecr.PipelineSourceActionProps.Builder
 */
fun pipelineSourceActionProps(init: software.amazon.awscdk.services.ecr.PipelineSourceActionProps.Builder.() -> Unit): software.amazon.awscdk.services.ecr.PipelineSourceActionProps {
    val builder = software.amazon.awscdk.services.ecr.PipelineSourceActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecr.PipelineSourceActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.ecr.PipelineSourceActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.ecr.PipelineSourceActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.ecr.PipelineSourceActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.ecr.PipelineSourceActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.ecr.PipelineSourceActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.ecr.PipelineSourceActionProps.Builder.withRepository
 */
var software.amazon.awscdk.services.ecr.PipelineSourceActionProps.Builder.repository: software.amazon.awscdk.services.ecr.IRepository
    get() = throw NoSuchFieldException("Get on repository is not supported.")
    set(value) { this.withRepository(value) }

/**
 * @see software.amazon.awscdk.services.ecr.PipelineSourceActionProps.Builder.withImageTag
 */
var software.amazon.awscdk.services.ecr.PipelineSourceActionProps.Builder.imageTag: String
    get() = throw NoSuchFieldException("Get on imageTag is not supported.")
    set(value) { this.withImageTag(value) }


/**
 * @see software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty.Builder
 */
fun lifecyclePolicyProperty(init: software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty {
    val builder = software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty.Builder.withLifecyclePolicyText
 */
var software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty.Builder.lifecyclePolicyText: String
    get() = throw NoSuchFieldException("Get on lifecyclePolicyText is not supported.")
    set(value) { this.withLifecyclePolicyText(value) }

/**
 * @see software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty.Builder.withRegistryId
 */
var software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty.Builder.registryId: String
    get() = throw NoSuchFieldException("Get on registryId is not supported.")
    set(value) { this.withRegistryId(value) }


/**
 * @see software.amazon.awscdk.services.ecr.RepositoryProps.Builder
 */
fun repositoryProps(init: software.amazon.awscdk.services.ecr.RepositoryProps.Builder.() -> Unit): software.amazon.awscdk.services.ecr.RepositoryProps {
    val builder = software.amazon.awscdk.services.ecr.RepositoryProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecr.RepositoryProps.Builder.withRepositoryName
 */
var software.amazon.awscdk.services.ecr.RepositoryProps.Builder.repositoryName: String
    get() = throw NoSuchFieldException("Get on repositoryName is not supported.")
    set(value) { this.withRepositoryName(value) }

/**
 * @see software.amazon.awscdk.services.ecr.RepositoryProps.Builder.withRetain
 */
var software.amazon.awscdk.services.ecr.RepositoryProps.Builder.retain: Boolean
    get() = throw NoSuchFieldException("Get on retain is not supported.")
    set(value) { this.withRetain(value) }

/**
 * @see software.amazon.awscdk.services.ecr.RepositoryProps.Builder.withLifecycleRegistryId
 */
var software.amazon.awscdk.services.ecr.RepositoryProps.Builder.lifecycleRegistryId: String
    get() = throw NoSuchFieldException("Get on lifecycleRegistryId is not supported.")
    set(value) { this.withLifecycleRegistryId(value) }


/**
 * @see software.amazon.awscdk.services.ecr.LifecycleRule.Builder
 */
fun lifecycleRule(init: software.amazon.awscdk.services.ecr.LifecycleRule.Builder.() -> Unit): software.amazon.awscdk.services.ecr.LifecycleRule {
    val builder = software.amazon.awscdk.services.ecr.LifecycleRule.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecr.LifecycleRule.Builder.withMaxImageAgeDays
 */
var software.amazon.awscdk.services.ecr.LifecycleRule.Builder.maxImageAgeDays: Number
    get() = throw NoSuchFieldException("Get on maxImageAgeDays is not supported.")
    set(value) { this.withMaxImageAgeDays(value) }

/**
 * @see software.amazon.awscdk.services.ecr.LifecycleRule.Builder.withMaxImageCount
 */
var software.amazon.awscdk.services.ecr.LifecycleRule.Builder.maxImageCount: Number
    get() = throw NoSuchFieldException("Get on maxImageCount is not supported.")
    set(value) { this.withMaxImageCount(value) }

/**
 * @see software.amazon.awscdk.services.ecr.LifecycleRule.Builder.withRulePriority
 */
var software.amazon.awscdk.services.ecr.LifecycleRule.Builder.rulePriority: Number
    get() = throw NoSuchFieldException("Get on rulePriority is not supported.")
    set(value) { this.withRulePriority(value) }

/**
 * @see software.amazon.awscdk.services.ecr.LifecycleRule.Builder.withTagStatus
 */
var software.amazon.awscdk.services.ecr.LifecycleRule.Builder.tagStatus: software.amazon.awscdk.services.ecr.TagStatus
    get() = throw NoSuchFieldException("Get on tagStatus is not supported.")
    set(value) { this.withTagStatus(value) }

/**
 * @see software.amazon.awscdk.services.ecr.LifecycleRule.Builder.withDescription
 */
var software.amazon.awscdk.services.ecr.LifecycleRule.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.ecr.CfnRepositoryProps.Builder
 */
fun cfnRepositoryProps(init: software.amazon.awscdk.services.ecr.CfnRepositoryProps.Builder.() -> Unit): software.amazon.awscdk.services.ecr.CfnRepositoryProps {
    val builder = software.amazon.awscdk.services.ecr.CfnRepositoryProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecr.CfnRepositoryProps.Builder.withRepositoryName
 */
var software.amazon.awscdk.services.ecr.CfnRepositoryProps.Builder.repositoryName: String
    get() = throw NoSuchFieldException("Get on repositoryName is not supported.")
    set(value) { this.withRepositoryName(value) }

/**
 * @see software.amazon.awscdk.services.ecr.CfnRepositoryProps.Builder.withLifecyclePolicy
 */
var software.amazon.awscdk.services.ecr.CfnRepositoryProps.Builder.lifecyclePolicy: software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty
    get() = throw NoSuchFieldException("Get on lifecyclePolicy is not supported.")
    set(value) { this.withLifecyclePolicy(value) }

/**
 * @see software.amazon.awscdk.services.ecr.CfnRepositoryProps.Builder.withRepositoryPolicyText
 */
var software.amazon.awscdk.services.ecr.CfnRepositoryProps.Builder.repositoryPolicyText: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on repositoryPolicyText is not supported.")
    set(value) { this.withRepositoryPolicyText(value) }


/**
 * @see software.amazon.awscdk.services.ecr.RepositoryImportProps.Builder
 */
fun repositoryImportProps(init: software.amazon.awscdk.services.ecr.RepositoryImportProps.Builder.() -> Unit): software.amazon.awscdk.services.ecr.RepositoryImportProps {
    val builder = software.amazon.awscdk.services.ecr.RepositoryImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecr.RepositoryImportProps.Builder.withRepositoryName
 */
var software.amazon.awscdk.services.ecr.RepositoryImportProps.Builder.repositoryName: String
    get() = throw NoSuchFieldException("Get on repositoryName is not supported.")
    set(value) { this.withRepositoryName(value) }

/**
 * @see software.amazon.awscdk.services.ecr.RepositoryImportProps.Builder.withRepositoryArn
 */
var software.amazon.awscdk.services.ecr.RepositoryImportProps.Builder.repositoryArn: String
    get() = throw NoSuchFieldException("Get on repositoryArn is not supported.")
    set(value) { this.withRepositoryArn(value) }
