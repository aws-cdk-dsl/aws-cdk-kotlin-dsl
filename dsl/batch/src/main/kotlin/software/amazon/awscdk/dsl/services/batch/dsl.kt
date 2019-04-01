package software.amazon.awscdk.dsl.services.batch
/**
 * @see software.amazon.awscdk.services.batch.CfnJobQueue
 */
fun software.amazon.awscdk.Construct.cfnJobQueue(id: String,
                     props: software.amazon.awscdk.services.batch.CfnJobQueueProps? = null,
                     init: (software.amazon.awscdk.services.batch.CfnJobQueue.() -> Unit)? = null)
        : software.amazon.awscdk.services.batch.CfnJobQueue {

    val obj = software.amazon.awscdk.services.batch.CfnJobQueue(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition
 */
fun software.amazon.awscdk.Construct.cfnJobDefinition(id: String,
                     props: software.amazon.awscdk.services.batch.CfnJobDefinitionProps? = null,
                     init: (software.amazon.awscdk.services.batch.CfnJobDefinition.() -> Unit)? = null)
        : software.amazon.awscdk.services.batch.CfnJobDefinition {

    val obj = software.amazon.awscdk.services.batch.CfnJobDefinition(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironment
 */
fun software.amazon.awscdk.Construct.cfnComputeEnvironment(id: String,
                     props: software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps? = null,
                     init: (software.amazon.awscdk.services.batch.CfnComputeEnvironment.() -> Unit)? = null)
        : software.amazon.awscdk.services.batch.CfnComputeEnvironment {

    val obj = software.amazon.awscdk.services.batch.CfnComputeEnvironment(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty.Builder
 */
fun mountPointsProperty(init: software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty.Builder.() -> Unit): software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty {
    val builder = software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty.Builder.withContainerPath
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty.Builder.containerPath: String
    get() = throw NoSuchFieldException("Get on containerPath is not supported.")
    set(value) { this.withContainerPath(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty.Builder.withReadOnly
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty.Builder.readOnly: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on readOnly is not supported.")
    set(value) { this.withReadOnly(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty.Builder.withSourceVolume
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty.Builder.sourceVolume: String
    get() = throw NoSuchFieldException("Get on sourceVolume is not supported.")
    set(value) { this.withSourceVolume(value) }


/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty.Builder
 */
fun timeoutProperty(init: software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty.Builder.() -> Unit): software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty {
    val builder = software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty.Builder.withAttemptDurationSeconds
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.TimeoutProperty.Builder.attemptDurationSeconds: Number
    get() = throw NoSuchFieldException("Get on attemptDurationSeconds is not supported.")
    set(value) { this.withAttemptDurationSeconds(value) }


/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty.Builder
 */
fun volumesHostProperty(init: software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty.Builder.() -> Unit): software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty {
    val builder = software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty.Builder.withSourcePath
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty.Builder.sourcePath: String
    get() = throw NoSuchFieldException("Get on sourcePath is not supported.")
    set(value) { this.withSourcePath(value) }


/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty.Builder
 */
fun launchTemplateSpecificationProperty(init: software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty {
    val builder = software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty.Builder.withLaunchTemplateId
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty.Builder.launchTemplateId: String
    get() = throw NoSuchFieldException("Get on launchTemplateId is not supported.")
    set(value) { this.withLaunchTemplateId(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty.Builder.withLaunchTemplateName
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty.Builder.launchTemplateName: String
    get() = throw NoSuchFieldException("Get on launchTemplateName is not supported.")
    set(value) { this.withLaunchTemplateName(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty.Builder.withVersion
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder
 */
fun computeResourcesProperty(init: software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.() -> Unit): software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty {
    val builder = software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.withTags
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.tags: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on tags is not supported.")
    set(value) { this.withTags(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.withLaunchTemplate
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.launchTemplate: software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty
    get() = throw NoSuchFieldException("Get on launchTemplate is not supported.")
    set(value) { this.withLaunchTemplate(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.withPlacementGroup
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.placementGroup: String
    get() = throw NoSuchFieldException("Get on placementGroup is not supported.")
    set(value) { this.withPlacementGroup(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.withImageId
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.imageId: String
    get() = throw NoSuchFieldException("Get on imageId is not supported.")
    set(value) { this.withImageId(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.withType
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.withInstanceRole
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.instanceRole: String
    get() = throw NoSuchFieldException("Get on instanceRole is not supported.")
    set(value) { this.withInstanceRole(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.withMaxvCpus
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.maxvCpus: Number
    get() = throw NoSuchFieldException("Get on maxvCpus is not supported.")
    set(value) { this.withMaxvCpus(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.withMinvCpus
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.minvCpus: Number
    get() = throw NoSuchFieldException("Get on minvCpus is not supported.")
    set(value) { this.withMinvCpus(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.withBidPercentage
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.bidPercentage: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on bidPercentage is not supported.")
    set(value) { this.withBidPercentage(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.withDesiredvCpus
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.desiredvCpus: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on desiredvCpus is not supported.")
    set(value) { this.withDesiredvCpus(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.withEc2KeyPair
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.ec2KeyPair: String
    get() = throw NoSuchFieldException("Get on ec2KeyPair is not supported.")
    set(value) { this.withEc2KeyPair(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.withSpotIamFleetRole
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty.Builder.spotIamFleetRole: String
    get() = throw NoSuchFieldException("Get on spotIamFleetRole is not supported.")
    set(value) { this.withSpotIamFleetRole(value) }


/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder
 */
fun cfnJobDefinitionProps(init: software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder.() -> Unit): software.amazon.awscdk.services.batch.CfnJobDefinitionProps {
    val builder = software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder.withNodeProperties
 */
var software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder.nodeProperties: software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty
    get() = throw NoSuchFieldException("Get on nodeProperties is not supported.")
    set(value) { this.withNodeProperties(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder.withRetryStrategy
 */
var software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder.retryStrategy: software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty
    get() = throw NoSuchFieldException("Get on retryStrategy is not supported.")
    set(value) { this.withRetryStrategy(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder.withContainerProperties
 */
var software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder.containerProperties: software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty
    get() = throw NoSuchFieldException("Get on containerProperties is not supported.")
    set(value) { this.withContainerProperties(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder.withJobDefinitionName
 */
var software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder.jobDefinitionName: String
    get() = throw NoSuchFieldException("Get on jobDefinitionName is not supported.")
    set(value) { this.withJobDefinitionName(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder.withTimeout
 */
var software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder.timeout: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on timeout is not supported.")
    set(value) { this.withTimeout(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder.withType
 */
var software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder.withParameters
 */
var software.amazon.awscdk.services.batch.CfnJobDefinitionProps.Builder.parameters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on parameters is not supported.")
    set(value) { this.withParameters(value) }


/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty.Builder
 */
fun ulimitProperty(init: software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty.Builder.() -> Unit): software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty {
    val builder = software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty.Builder.withName
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty.Builder.withHardLimit
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty.Builder.hardLimit: Number
    get() = throw NoSuchFieldException("Get on hardLimit is not supported.")
    set(value) { this.withHardLimit(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty.Builder.withSoftLimit
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.UlimitProperty.Builder.softLimit: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on softLimit is not supported.")
    set(value) { this.withSoftLimit(value) }


/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty.Builder
 */
fun nodeRangePropertyProperty(init: software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty.Builder.() -> Unit): software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty {
    val builder = software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty.Builder.withTargetNodes
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty.Builder.targetNodes: String
    get() = throw NoSuchFieldException("Get on targetNodes is not supported.")
    set(value) { this.withTargetNodes(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty.Builder.withContainer
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.NodeRangePropertyProperty.Builder.container: software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty
    get() = throw NoSuchFieldException("Get on container is not supported.")
    set(value) { this.withContainer(value) }


/**
 * @see software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty.Builder
 */
fun computeEnvironmentOrderProperty(init: software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty.Builder.() -> Unit): software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty {
    val builder = software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty.Builder.withComputeEnvironment
 */
var software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty.Builder.computeEnvironment: String
    get() = throw NoSuchFieldException("Get on computeEnvironment is not supported.")
    set(value) { this.withComputeEnvironment(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty.Builder.withOrder
 */
var software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty.Builder.order: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on order is not supported.")
    set(value) { this.withOrder(value) }


/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder
 */
fun containerPropertiesProperty(init: software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.() -> Unit): software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty {
    val builder = software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.withInstanceType
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.instanceType: String
    get() = throw NoSuchFieldException("Get on instanceType is not supported.")
    set(value) { this.withInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.withEnvironment
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.environment: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on environment is not supported.")
    set(value) { this.withEnvironment(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.withVolumes
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.volumes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on volumes is not supported.")
    set(value) { this.withVolumes(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.withUser
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.user: String
    get() = throw NoSuchFieldException("Get on user is not supported.")
    set(value) { this.withUser(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.withImage
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.image: String
    get() = throw NoSuchFieldException("Get on image is not supported.")
    set(value) { this.withImage(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.withMemory
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.memory: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on memory is not supported.")
    set(value) { this.withMemory(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.withVcpus
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.vcpus: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on vcpus is not supported.")
    set(value) { this.withVcpus(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.withJobRoleArn
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.jobRoleArn: String
    get() = throw NoSuchFieldException("Get on jobRoleArn is not supported.")
    set(value) { this.withJobRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.withMountPoints
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.mountPoints: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on mountPoints is not supported.")
    set(value) { this.withMountPoints(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.withPrivileged
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.privileged: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on privileged is not supported.")
    set(value) { this.withPrivileged(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.withReadonlyRootFilesystem
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.readonlyRootFilesystem: Boolean
    get() = throw NoSuchFieldException("Get on readonlyRootFilesystem is not supported.")
    set(value) { this.withReadonlyRootFilesystem(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.withUlimits
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder.ulimits: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ulimits is not supported.")
    set(value) { this.withUlimits(value) }


/**
 * @see software.amazon.awscdk.services.batch.CfnJobQueueProps.Builder
 */
fun cfnJobQueueProps(init: software.amazon.awscdk.services.batch.CfnJobQueueProps.Builder.() -> Unit): software.amazon.awscdk.services.batch.CfnJobQueueProps {
    val builder = software.amazon.awscdk.services.batch.CfnJobQueueProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.batch.CfnJobQueueProps.Builder.withState
 */
var software.amazon.awscdk.services.batch.CfnJobQueueProps.Builder.state: String
    get() = throw NoSuchFieldException("Get on state is not supported.")
    set(value) { this.withState(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobQueueProps.Builder.withPriority
 */
var software.amazon.awscdk.services.batch.CfnJobQueueProps.Builder.priority: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on priority is not supported.")
    set(value) { this.withPriority(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobQueueProps.Builder.withComputeEnvironmentOrder
 */
var software.amazon.awscdk.services.batch.CfnJobQueueProps.Builder.computeEnvironmentOrder: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on computeEnvironmentOrder is not supported.")
    set(value) { this.withComputeEnvironmentOrder(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobQueueProps.Builder.withJobQueueName
 */
var software.amazon.awscdk.services.batch.CfnJobQueueProps.Builder.jobQueueName: String
    get() = throw NoSuchFieldException("Get on jobQueueName is not supported.")
    set(value) { this.withJobQueueName(value) }


/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty.Builder
 */
fun retryStrategyProperty(init: software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty.Builder.() -> Unit): software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty {
    val builder = software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty.Builder.withAttempts
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.RetryStrategyProperty.Builder.attempts: Number
    get() = throw NoSuchFieldException("Get on attempts is not supported.")
    set(value) { this.withAttempts(value) }


/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty.Builder
 */
fun environmentProperty(init: software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty.Builder.() -> Unit): software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty {
    val builder = software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty.Builder.withValue
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty.Builder.withName
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.EnvironmentProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps.Builder
 */
fun cfnComputeEnvironmentProps(init: software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps.Builder.() -> Unit): software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps {
    val builder = software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps.Builder.withServiceRole
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps.Builder.serviceRole: String
    get() = throw NoSuchFieldException("Get on serviceRole is not supported.")
    set(value) { this.withServiceRole(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps.Builder.withState
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps.Builder.state: String
    get() = throw NoSuchFieldException("Get on state is not supported.")
    set(value) { this.withState(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps.Builder.withComputeResources
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps.Builder.computeResources: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on computeResources is not supported.")
    set(value) { this.withComputeResources(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps.Builder.withComputeEnvironmentName
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps.Builder.computeEnvironmentName: String
    get() = throw NoSuchFieldException("Get on computeEnvironmentName is not supported.")
    set(value) { this.withComputeEnvironmentName(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps.Builder.withType
 */
var software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty.Builder
 */
fun volumesProperty(init: software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty.Builder.() -> Unit): software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty {
    val builder = software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty.Builder.withHost
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty.Builder.host: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on host is not supported.")
    set(value) { this.withHost(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty.Builder.withName
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty.Builder
 */
fun nodePropertiesProperty(init: software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty.Builder.() -> Unit): software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty {
    val builder = software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty.Builder.withNumNodes
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty.Builder.numNodes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on numNodes is not supported.")
    set(value) { this.withNumNodes(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty.Builder.withMainNode
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty.Builder.mainNode: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on mainNode is not supported.")
    set(value) { this.withMainNode(value) }

/**
 * @see software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty.Builder.withNodeRangeProperties
 */
var software.amazon.awscdk.services.batch.CfnJobDefinition.NodePropertiesProperty.Builder.nodeRangeProperties: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on nodeRangeProperties is not supported.")
    set(value) { this.withNodeRangeProperties(value) }
