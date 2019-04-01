package software.amazon.awscdk.dsl.services.ecs
/**
 * @see software.amazon.awscdk.services.ecs.Cluster
 */
fun software.amazon.awscdk.Construct.cluster(id: String,
                     props: software.amazon.awscdk.services.ecs.ClusterProps? = null,
                     init: (software.amazon.awscdk.services.ecs.Cluster.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.Cluster {

    val obj = software.amazon.awscdk.services.ecs.Cluster(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecs.Ec2TaskDefinition
 */
fun software.amazon.awscdk.Construct.ec2TaskDefinition(id: String,
                     props: software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps? = null,
                     init: (software.amazon.awscdk.services.ecs.Ec2TaskDefinition.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.Ec2TaskDefinition {

    val obj = software.amazon.awscdk.services.ecs.Ec2TaskDefinition(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecs.CfnService
 */
fun software.amazon.awscdk.Construct.cfnService(id: String,
                     props: software.amazon.awscdk.services.ecs.CfnServiceProps? = null,
                     init: (software.amazon.awscdk.services.ecs.CfnService.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.CfnService {

    val obj = software.amazon.awscdk.services.ecs.CfnService(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecs.Ec2Service
 */
fun software.amazon.awscdk.Construct.ec2Service(id: String,
                     props: software.amazon.awscdk.services.ecs.Ec2ServiceProps? = null,
                     init: (software.amazon.awscdk.services.ecs.Ec2Service.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.Ec2Service {

    val obj = software.amazon.awscdk.services.ecs.Ec2Service(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecs.ScalableTaskCount
 */
fun software.amazon.awscdk.Construct.scalableTaskCount(id: String,
                     props: software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps? = null,
                     init: (software.amazon.awscdk.services.ecs.ScalableTaskCount.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.ScalableTaskCount {

    val obj = software.amazon.awscdk.services.ecs.ScalableTaskCount(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecs.FargateTaskDefinition
 */
fun software.amazon.awscdk.Construct.fargateTaskDefinition(id: String,
                     props: software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps? = null,
                     init: (software.amazon.awscdk.services.ecs.FargateTaskDefinition.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.FargateTaskDefinition {

    val obj = software.amazon.awscdk.services.ecs.FargateTaskDefinition(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition
 */
fun software.amazon.awscdk.Construct.cfnTaskDefinition(id: String,
                     props: software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps? = null,
                     init: (software.amazon.awscdk.services.ecs.CfnTaskDefinition.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.CfnTaskDefinition {

    val obj = software.amazon.awscdk.services.ecs.CfnTaskDefinition(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateService
 */
fun software.amazon.awscdk.Construct.loadBalancedFargateService(id: String,
                     props: software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps? = null,
                     init: (software.amazon.awscdk.services.ecs.LoadBalancedFargateService.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.LoadBalancedFargateService {

    val obj = software.amazon.awscdk.services.ecs.LoadBalancedFargateService(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinition
 */
fun software.amazon.awscdk.Construct.containerDefinition(id: String,
                     props: software.amazon.awscdk.services.ecs.ContainerDefinitionProps? = null,
                     init: (software.amazon.awscdk.services.ecs.ContainerDefinition.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.ContainerDefinition {

    val obj = software.amazon.awscdk.services.ecs.ContainerDefinition(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecs.FargateService
 */
fun software.amazon.awscdk.Construct.fargateService(id: String,
                     props: software.amazon.awscdk.services.ecs.FargateServiceProps? = null,
                     init: (software.amazon.awscdk.services.ecs.FargateService.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.FargateService {

    val obj = software.amazon.awscdk.services.ecs.FargateService(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecs.CfnCluster
 */
fun software.amazon.awscdk.Construct.cfnCluster(id: String,
                     props: software.amazon.awscdk.services.ecs.CfnClusterProps? = null,
                     init: (software.amazon.awscdk.services.ecs.CfnCluster.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.CfnCluster {

    val obj = software.amazon.awscdk.services.ecs.CfnCluster(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecs.AwsLogDriver
 */
fun software.amazon.awscdk.Construct.awsLogDriver(id: String,
                     props: software.amazon.awscdk.services.ecs.AwsLogDriverProps? = null,
                     init: (software.amazon.awscdk.services.ecs.AwsLogDriver.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.AwsLogDriver {

    val obj = software.amazon.awscdk.services.ecs.AwsLogDriver(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedEc2Service
 */
fun software.amazon.awscdk.Construct.loadBalancedEc2Service(id: String,
                     props: software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps? = null,
                     init: (software.amazon.awscdk.services.ecs.LoadBalancedEc2Service.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.LoadBalancedEc2Service {

    val obj = software.amazon.awscdk.services.ecs.LoadBalancedEc2Service(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecs.Ec2EventRuleTarget
 */
fun software.amazon.awscdk.Construct.ec2EventRuleTarget(id: String,
                     props: software.amazon.awscdk.services.ecs.Ec2EventRuleTargetProps? = null,
                     init: (software.amazon.awscdk.services.ecs.Ec2EventRuleTarget.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.Ec2EventRuleTarget {

    val obj = software.amazon.awscdk.services.ecs.Ec2EventRuleTarget(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecs.TaskDefinition
 */
fun software.amazon.awscdk.Construct.taskDefinition(id: String,
                     props: software.amazon.awscdk.services.ecs.TaskDefinitionProps? = null,
                     init: (software.amazon.awscdk.services.ecs.TaskDefinition.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.TaskDefinition {

    val obj = software.amazon.awscdk.services.ecs.TaskDefinition(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecs.Ec2TaskDefinition
 */
fun software.amazon.awscdk.Construct.ec2TaskDefinition(id: String,
                     init: (software.amazon.awscdk.services.ecs.Ec2TaskDefinition.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.Ec2TaskDefinition {

    val obj = software.amazon.awscdk.services.ecs.Ec2TaskDefinition(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecs.FargateTaskDefinition
 */
fun software.amazon.awscdk.Construct.fargateTaskDefinition(id: String,
                     init: (software.amazon.awscdk.services.ecs.FargateTaskDefinition.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.FargateTaskDefinition {

    val obj = software.amazon.awscdk.services.ecs.FargateTaskDefinition(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition
 */
fun software.amazon.awscdk.Construct.cfnTaskDefinition(id: String,
                     init: (software.amazon.awscdk.services.ecs.CfnTaskDefinition.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.CfnTaskDefinition {

    val obj = software.amazon.awscdk.services.ecs.CfnTaskDefinition(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.ecs.CfnCluster
 */
fun software.amazon.awscdk.Construct.cfnCluster(id: String,
                     init: (software.amazon.awscdk.services.ecs.CfnCluster.() -> Unit)? = null)
        : software.amazon.awscdk.services.ecs.CfnCluster {

    val obj = software.amazon.awscdk.services.ecs.CfnCluster(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedServiceBaseProps.Builder
 */
fun loadBalancedServiceBaseProps(init: software.amazon.awscdk.services.ecs.LoadBalancedServiceBaseProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.LoadBalancedServiceBaseProps {
    val builder = software.amazon.awscdk.services.ecs.LoadBalancedServiceBaseProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedServiceBaseProps.Builder.withLoadBalancerType
 */
var software.amazon.awscdk.services.ecs.LoadBalancedServiceBaseProps.Builder.loadBalancerType: software.amazon.awscdk.services.ecs.LoadBalancerType
    get() = throw NoSuchFieldException("Get on loadBalancerType is not supported.")
    set(value) { this.withLoadBalancerType(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedServiceBaseProps.Builder.withPublicLoadBalancer
 */
var software.amazon.awscdk.services.ecs.LoadBalancedServiceBaseProps.Builder.publicLoadBalancer: Boolean
    get() = throw NoSuchFieldException("Get on publicLoadBalancer is not supported.")
    set(value) { this.withPublicLoadBalancer(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedServiceBaseProps.Builder.withCertificate
 */
var software.amazon.awscdk.services.ecs.LoadBalancedServiceBaseProps.Builder.certificate: software.amazon.awscdk.services.certificatemanager.ICertificate
    get() = throw NoSuchFieldException("Get on certificate is not supported.")
    set(value) { this.withCertificate(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedServiceBaseProps.Builder.withContainerPort
 */
var software.amazon.awscdk.services.ecs.LoadBalancedServiceBaseProps.Builder.containerPort: Number
    get() = throw NoSuchFieldException("Get on containerPort is not supported.")
    set(value) { this.withContainerPort(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedServiceBaseProps.Builder.withCluster
 */
var software.amazon.awscdk.services.ecs.LoadBalancedServiceBaseProps.Builder.cluster: software.amazon.awscdk.services.ecs.ICluster
    get() = throw NoSuchFieldException("Get on cluster is not supported.")
    set(value) { this.withCluster(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedServiceBaseProps.Builder.withDesiredCount
 */
var software.amazon.awscdk.services.ecs.LoadBalancedServiceBaseProps.Builder.desiredCount: Number
    get() = throw NoSuchFieldException("Get on desiredCount is not supported.")
    set(value) { this.withDesiredCount(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedServiceBaseProps.Builder.withImage
 */
var software.amazon.awscdk.services.ecs.LoadBalancedServiceBaseProps.Builder.image: software.amazon.awscdk.services.ecs.ContainerImage
    get() = throw NoSuchFieldException("Get on image is not supported.")
    set(value) { this.withImage(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty.Builder
 */
fun tmpfsProperty(init: software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty.Builder.withContainerPath
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty.Builder.containerPath: String
    get() = throw NoSuchFieldException("Get on containerPath is not supported.")
    set(value) { this.withContainerPath(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty.Builder.withSize
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty.Builder.size: Number
    get() = throw NoSuchFieldException("Get on size is not supported.")
    set(value) { this.withSize(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty.Builder
 */
fun deviceProperty(init: software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty.Builder.withContainerPath
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty.Builder.containerPath: String
    get() = throw NoSuchFieldException("Get on containerPath is not supported.")
    set(value) { this.withContainerPath(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty.Builder.withHostPath
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty.Builder.hostPath: String
    get() = throw NoSuchFieldException("Get on hostPath is not supported.")
    set(value) { this.withHostPath(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty.Builder
 */
fun loadBalancerProperty(init: software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty.Builder.withContainerPort
 */
var software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty.Builder.containerPort: Number
    get() = throw NoSuchFieldException("Get on containerPort is not supported.")
    set(value) { this.withContainerPort(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty.Builder.withTargetGroupArn
 */
var software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty.Builder.targetGroupArn: String
    get() = throw NoSuchFieldException("Get on targetGroupArn is not supported.")
    set(value) { this.withTargetGroupArn(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty.Builder.withContainerName
 */
var software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty.Builder.containerName: String
    get() = throw NoSuchFieldException("Get on containerName is not supported.")
    set(value) { this.withContainerName(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty.Builder.withLoadBalancerName
 */
var software.amazon.awscdk.services.ecs.CfnService.LoadBalancerProperty.Builder.loadBalancerName: String
    get() = throw NoSuchFieldException("Get on loadBalancerName is not supported.")
    set(value) { this.withLoadBalancerName(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty.Builder
 */
fun placementConstraintProperty(init: software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty.Builder.withExpression
 */
var software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty.Builder.expression: String
    get() = throw NoSuchFieldException("Get on expression is not supported.")
    set(value) { this.withExpression(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty.Builder.withType
 */
var software.amazon.awscdk.services.ecs.CfnService.PlacementConstraintProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder
 */
fun cfnTaskDefinitionProps(init: software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.withFamily
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.family: String
    get() = throw NoSuchFieldException("Get on family is not supported.")
    set(value) { this.withFamily(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.withExecutionRoleArn
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.executionRoleArn: String
    get() = throw NoSuchFieldException("Get on executionRoleArn is not supported.")
    set(value) { this.withExecutionRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.withVolumes
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.volumes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on volumes is not supported.")
    set(value) { this.withVolumes(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.withNetworkMode
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.networkMode: String
    get() = throw NoSuchFieldException("Get on networkMode is not supported.")
    set(value) { this.withNetworkMode(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.withPlacementConstraints
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.placementConstraints: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on placementConstraints is not supported.")
    set(value) { this.withPlacementConstraints(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.withMemory
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.memory: String
    get() = throw NoSuchFieldException("Get on memory is not supported.")
    set(value) { this.withMemory(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.withTaskRoleArn
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.taskRoleArn: String
    get() = throw NoSuchFieldException("Get on taskRoleArn is not supported.")
    set(value) { this.withTaskRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.withContainerDefinitions
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.containerDefinitions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on containerDefinitions is not supported.")
    set(value) { this.withContainerDefinitions(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.withCpu
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder.cpu: String
    get() = throw NoSuchFieldException("Get on cpu is not supported.")
    set(value) { this.withCpu(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.Builder
 */
fun linuxParametersProperty(init: software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.Builder.withDevices
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.Builder.devices: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on devices is not supported.")
    set(value) { this.withDevices(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.Builder.withCapabilities
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.Builder.capabilities: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on capabilities is not supported.")
    set(value) { this.withCapabilities(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.Builder.withTmpfs
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.Builder.tmpfs: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on tmpfs is not supported.")
    set(value) { this.withTmpfs(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.Builder.withSharedMemorySize
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.Builder.sharedMemorySize: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on sharedMemorySize is not supported.")
    set(value) { this.withSharedMemorySize(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.Builder.withInitProcessEnabled
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.Builder.initProcessEnabled: Boolean
    get() = throw NoSuchFieldException("Get on initProcessEnabled is not supported.")
    set(value) { this.withInitProcessEnabled(value) }


/**
 * @see software.amazon.awscdk.services.ecs.Device.Builder
 */
fun device(init: software.amazon.awscdk.services.ecs.Device.Builder.() -> Unit): software.amazon.awscdk.services.ecs.Device {
    val builder = software.amazon.awscdk.services.ecs.Device.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.Device.Builder.withContainerPath
 */
var software.amazon.awscdk.services.ecs.Device.Builder.containerPath: String
    get() = throw NoSuchFieldException("Get on containerPath is not supported.")
    set(value) { this.withContainerPath(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Device.Builder.withHostPath
 */
var software.amazon.awscdk.services.ecs.Device.Builder.hostPath: String
    get() = throw NoSuchFieldException("Get on hostPath is not supported.")
    set(value) { this.withHostPath(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty.Builder
 */
fun volumeProperty(init: software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty.Builder.withHost
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty.Builder.host: software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty
    get() = throw NoSuchFieldException("Get on host is not supported.")
    set(value) { this.withHost(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty.Builder.withDockerVolumeConfiguration
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty.Builder.dockerVolumeConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on dockerVolumeConfiguration is not supported.")
    set(value) { this.withDockerVolumeConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty.Builder.withName
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.ecs.DockerVolumeConfiguration.Builder
 */
fun dockerVolumeConfiguration(init: software.amazon.awscdk.services.ecs.DockerVolumeConfiguration.Builder.() -> Unit): software.amazon.awscdk.services.ecs.DockerVolumeConfiguration {
    val builder = software.amazon.awscdk.services.ecs.DockerVolumeConfiguration.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.DockerVolumeConfiguration.Builder.withScope
 */
var software.amazon.awscdk.services.ecs.DockerVolumeConfiguration.Builder.scope: software.amazon.awscdk.services.ecs.Scope
    get() = throw NoSuchFieldException("Get on scope is not supported.")
    set(value) { this.withScope(value) }

/**
 * @see software.amazon.awscdk.services.ecs.DockerVolumeConfiguration.Builder.withAutoprovision
 */
var software.amazon.awscdk.services.ecs.DockerVolumeConfiguration.Builder.autoprovision: Boolean
    get() = throw NoSuchFieldException("Get on autoprovision is not supported.")
    set(value) { this.withAutoprovision(value) }

/**
 * @see software.amazon.awscdk.services.ecs.DockerVolumeConfiguration.Builder.withDriver
 */
var software.amazon.awscdk.services.ecs.DockerVolumeConfiguration.Builder.driver: String
    get() = throw NoSuchFieldException("Get on driver is not supported.")
    set(value) { this.withDriver(value) }


/**
 * @see software.amazon.awscdk.services.ecs.ClusterImportProps.Builder
 */
fun clusterImportProps(init: software.amazon.awscdk.services.ecs.ClusterImportProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.ClusterImportProps {
    val builder = software.amazon.awscdk.services.ecs.ClusterImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.ClusterImportProps.Builder.withClusterName
 */
var software.amazon.awscdk.services.ecs.ClusterImportProps.Builder.clusterName: String
    get() = throw NoSuchFieldException("Get on clusterName is not supported.")
    set(value) { this.withClusterName(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ClusterImportProps.Builder.withClusterArn
 */
var software.amazon.awscdk.services.ecs.ClusterImportProps.Builder.clusterArn: String
    get() = throw NoSuchFieldException("Get on clusterArn is not supported.")
    set(value) { this.withClusterArn(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ClusterImportProps.Builder.withHasEc2Capacity
 */
var software.amazon.awscdk.services.ecs.ClusterImportProps.Builder.hasEc2Capacity: Boolean
    get() = throw NoSuchFieldException("Get on hasEc2Capacity is not supported.")
    set(value) { this.withHasEc2Capacity(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ClusterImportProps.Builder.withVpc
 */
var software.amazon.awscdk.services.ecs.ClusterImportProps.Builder.vpc: software.amazon.awscdk.services.ec2.VpcNetworkImportProps
    get() = throw NoSuchFieldException("Get on vpc is not supported.")
    set(value) { this.withVpc(value) }


/**
 * @see software.amazon.awscdk.services.ecs.AwsLogDriverProps.Builder
 */
fun awsLogDriverProps(init: software.amazon.awscdk.services.ecs.AwsLogDriverProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.AwsLogDriverProps {
    val builder = software.amazon.awscdk.services.ecs.AwsLogDriverProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.AwsLogDriverProps.Builder.withDatetimeFormat
 */
var software.amazon.awscdk.services.ecs.AwsLogDriverProps.Builder.datetimeFormat: String
    get() = throw NoSuchFieldException("Get on datetimeFormat is not supported.")
    set(value) { this.withDatetimeFormat(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AwsLogDriverProps.Builder.withMultilinePattern
 */
var software.amazon.awscdk.services.ecs.AwsLogDriverProps.Builder.multilinePattern: String
    get() = throw NoSuchFieldException("Get on multilinePattern is not supported.")
    set(value) { this.withMultilinePattern(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AwsLogDriverProps.Builder.withLogGroup
 */
var software.amazon.awscdk.services.ecs.AwsLogDriverProps.Builder.logGroup: software.amazon.awscdk.services.logs.ILogGroup
    get() = throw NoSuchFieldException("Get on logGroup is not supported.")
    set(value) { this.withLogGroup(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AwsLogDriverProps.Builder.withStreamPrefix
 */
var software.amazon.awscdk.services.ecs.AwsLogDriverProps.Builder.streamPrefix: String
    get() = throw NoSuchFieldException("Get on streamPrefix is not supported.")
    set(value) { this.withStreamPrefix(value) }


/**
 * @see software.amazon.awscdk.services.ecs.AssetImageProps.Builder
 */
fun assetImageProps(init: software.amazon.awscdk.services.ecs.AssetImageProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.AssetImageProps {
    val builder = software.amazon.awscdk.services.ecs.AssetImageProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.AssetImageProps.Builder.withDirectory
 */
var software.amazon.awscdk.services.ecs.AssetImageProps.Builder.directory: String
    get() = throw NoSuchFieldException("Get on directory is not supported.")
    set(value) { this.withDirectory(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty.Builder
 */
fun repositoryCredentialsProperty(init: software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty.Builder.withCredentialsParameter
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty.Builder.credentialsParameter: String
    get() = throw NoSuchFieldException("Get on credentialsParameter is not supported.")
    set(value) { this.withCredentialsParameter(value) }


/**
 * @see software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder
 */
fun ec2ServiceProps(init: software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.Ec2ServiceProps {
    val builder = software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.withVpcSubnets
 */
var software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.vpcSubnets: software.amazon.awscdk.services.ec2.SubnetSelection
    get() = throw NoSuchFieldException("Get on vpcSubnets is not supported.")
    set(value) { this.withVpcSubnets(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.withCluster
 */
var software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.cluster: software.amazon.awscdk.services.ecs.ICluster
    get() = throw NoSuchFieldException("Get on cluster is not supported.")
    set(value) { this.withCluster(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.withTaskDefinition
 */
var software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.taskDefinition: software.amazon.awscdk.services.ecs.TaskDefinition
    get() = throw NoSuchFieldException("Get on taskDefinition is not supported.")
    set(value) { this.withTaskDefinition(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.withDaemon
 */
var software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.daemon: Boolean
    get() = throw NoSuchFieldException("Get on daemon is not supported.")
    set(value) { this.withDaemon(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.withPlaceOnDistinctInstances
 */
var software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.placeOnDistinctInstances: Boolean
    get() = throw NoSuchFieldException("Get on placeOnDistinctInstances is not supported.")
    set(value) { this.withPlaceOnDistinctInstances(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.withSecurityGroup
 */
var software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.securityGroup: software.amazon.awscdk.services.ec2.ISecurityGroup
    get() = throw NoSuchFieldException("Get on securityGroup is not supported.")
    set(value) { this.withSecurityGroup(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.withDesiredCount
 */
var software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.desiredCount: Number
    get() = throw NoSuchFieldException("Get on desiredCount is not supported.")
    set(value) { this.withDesiredCount(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.withHealthCheckGracePeriodSeconds
 */
var software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.healthCheckGracePeriodSeconds: Number
    get() = throw NoSuchFieldException("Get on healthCheckGracePeriodSeconds is not supported.")
    set(value) { this.withHealthCheckGracePeriodSeconds(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.withMaximumPercent
 */
var software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.maximumPercent: Number
    get() = throw NoSuchFieldException("Get on maximumPercent is not supported.")
    set(value) { this.withMaximumPercent(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.withMinimumHealthyPercent
 */
var software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.minimumHealthyPercent: Number
    get() = throw NoSuchFieldException("Get on minimumHealthyPercent is not supported.")
    set(value) { this.withMinimumHealthyPercent(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.withServiceName
 */
var software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder.serviceName: String
    get() = throw NoSuchFieldException("Get on serviceName is not supported.")
    set(value) { this.withServiceName(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty.Builder
 */
fun mountPointProperty(init: software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty.Builder.withContainerPath
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty.Builder.containerPath: String
    get() = throw NoSuchFieldException("Get on containerPath is not supported.")
    set(value) { this.withContainerPath(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty.Builder.withReadOnly
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty.Builder.readOnly: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on readOnly is not supported.")
    set(value) { this.withReadOnly(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty.Builder.withSourceVolume
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty.Builder.sourceVolume: String
    get() = throw NoSuchFieldException("Get on sourceVolume is not supported.")
    set(value) { this.withSourceVolume(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty.Builder
 */
fun logConfigurationProperty(init: software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty.Builder.withLogDriver
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty.Builder.logDriver: String
    get() = throw NoSuchFieldException("Get on logDriver is not supported.")
    set(value) { this.withLogDriver(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty.Builder.withOptions
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty.Builder.options: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on options is not supported.")
    set(value) { this.withOptions(value) }


/**
 * @see software.amazon.awscdk.services.ecs.Tmpfs.Builder
 */
fun tmpfs(init: software.amazon.awscdk.services.ecs.Tmpfs.Builder.() -> Unit): software.amazon.awscdk.services.ecs.Tmpfs {
    val builder = software.amazon.awscdk.services.ecs.Tmpfs.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.Tmpfs.Builder.withContainerPath
 */
var software.amazon.awscdk.services.ecs.Tmpfs.Builder.containerPath: String
    get() = throw NoSuchFieldException("Get on containerPath is not supported.")
    set(value) { this.withContainerPath(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Tmpfs.Builder.withSize
 */
var software.amazon.awscdk.services.ecs.Tmpfs.Builder.size: Number
    get() = throw NoSuchFieldException("Get on size is not supported.")
    set(value) { this.withSize(value) }


/**
 * @see software.amazon.awscdk.services.ecs.BaseServiceProps.Builder
 */
fun baseServiceProps(init: software.amazon.awscdk.services.ecs.BaseServiceProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.BaseServiceProps {
    val builder = software.amazon.awscdk.services.ecs.BaseServiceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.BaseServiceProps.Builder.withDesiredCount
 */
var software.amazon.awscdk.services.ecs.BaseServiceProps.Builder.desiredCount: Number
    get() = throw NoSuchFieldException("Get on desiredCount is not supported.")
    set(value) { this.withDesiredCount(value) }

/**
 * @see software.amazon.awscdk.services.ecs.BaseServiceProps.Builder.withHealthCheckGracePeriodSeconds
 */
var software.amazon.awscdk.services.ecs.BaseServiceProps.Builder.healthCheckGracePeriodSeconds: Number
    get() = throw NoSuchFieldException("Get on healthCheckGracePeriodSeconds is not supported.")
    set(value) { this.withHealthCheckGracePeriodSeconds(value) }

/**
 * @see software.amazon.awscdk.services.ecs.BaseServiceProps.Builder.withMaximumPercent
 */
var software.amazon.awscdk.services.ecs.BaseServiceProps.Builder.maximumPercent: Number
    get() = throw NoSuchFieldException("Get on maximumPercent is not supported.")
    set(value) { this.withMaximumPercent(value) }

/**
 * @see software.amazon.awscdk.services.ecs.BaseServiceProps.Builder.withMinimumHealthyPercent
 */
var software.amazon.awscdk.services.ecs.BaseServiceProps.Builder.minimumHealthyPercent: Number
    get() = throw NoSuchFieldException("Get on minimumHealthyPercent is not supported.")
    set(value) { this.withMinimumHealthyPercent(value) }

/**
 * @see software.amazon.awscdk.services.ecs.BaseServiceProps.Builder.withServiceName
 */
var software.amazon.awscdk.services.ecs.BaseServiceProps.Builder.serviceName: String
    get() = throw NoSuchFieldException("Get on serviceName is not supported.")
    set(value) { this.withServiceName(value) }


/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder
 */
fun containerDefinitionOptions(init: software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.() -> Unit): software.amazon.awscdk.services.ecs.ContainerDefinitionOptions {
    val builder = software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.withMemoryLimitMiB
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.memoryLimitMiB: Number
    get() = throw NoSuchFieldException("Get on memoryLimitMiB is not supported.")
    set(value) { this.withMemoryLimitMiB(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.withMemoryReservationMiB
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.memoryReservationMiB: Number
    get() = throw NoSuchFieldException("Get on memoryReservationMiB is not supported.")
    set(value) { this.withMemoryReservationMiB(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.withLogging
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.logging: software.amazon.awscdk.services.ecs.LogDriver
    get() = throw NoSuchFieldException("Get on logging is not supported.")
    set(value) { this.withLogging(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.withHostname
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.hostname: String
    get() = throw NoSuchFieldException("Get on hostname is not supported.")
    set(value) { this.withHostname(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.withDisableNetworking
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.disableNetworking: Boolean
    get() = throw NoSuchFieldException("Get on disableNetworking is not supported.")
    set(value) { this.withDisableNetworking(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.withEssential
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.essential: Boolean
    get() = throw NoSuchFieldException("Get on essential is not supported.")
    set(value) { this.withEssential(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.withWorkingDirectory
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.workingDirectory: String
    get() = throw NoSuchFieldException("Get on workingDirectory is not supported.")
    set(value) { this.withWorkingDirectory(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.withHealthCheck
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.healthCheck: software.amazon.awscdk.services.ecs.HealthCheck
    get() = throw NoSuchFieldException("Get on healthCheck is not supported.")
    set(value) { this.withHealthCheck(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.withUser
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.user: String
    get() = throw NoSuchFieldException("Get on user is not supported.")
    set(value) { this.withUser(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.withImage
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.image: software.amazon.awscdk.services.ecs.ContainerImage
    get() = throw NoSuchFieldException("Get on image is not supported.")
    set(value) { this.withImage(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.withPrivileged
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.privileged: Boolean
    get() = throw NoSuchFieldException("Get on privileged is not supported.")
    set(value) { this.withPrivileged(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.withReadonlyRootFilesystem
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.readonlyRootFilesystem: Boolean
    get() = throw NoSuchFieldException("Get on readonlyRootFilesystem is not supported.")
    set(value) { this.withReadonlyRootFilesystem(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.withCpu
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder.cpu: Number
    get() = throw NoSuchFieldException("Get on cpu is not supported.")
    set(value) { this.withCpu(value) }


/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder
 */
fun loadBalancedEc2ServiceProps(init: software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps {
    val builder = software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.withLoadBalancerType
 */
var software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.loadBalancerType: software.amazon.awscdk.services.ecs.LoadBalancerType
    get() = throw NoSuchFieldException("Get on loadBalancerType is not supported.")
    set(value) { this.withLoadBalancerType(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.withPublicLoadBalancer
 */
var software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.publicLoadBalancer: Boolean
    get() = throw NoSuchFieldException("Get on publicLoadBalancer is not supported.")
    set(value) { this.withPublicLoadBalancer(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.withMemoryLimitMiB
 */
var software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.memoryLimitMiB: Number
    get() = throw NoSuchFieldException("Get on memoryLimitMiB is not supported.")
    set(value) { this.withMemoryLimitMiB(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.withMemoryReservationMiB
 */
var software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.memoryReservationMiB: Number
    get() = throw NoSuchFieldException("Get on memoryReservationMiB is not supported.")
    set(value) { this.withMemoryReservationMiB(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.withCertificate
 */
var software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.certificate: software.amazon.awscdk.services.certificatemanager.ICertificate
    get() = throw NoSuchFieldException("Get on certificate is not supported.")
    set(value) { this.withCertificate(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.withContainerPort
 */
var software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.containerPort: Number
    get() = throw NoSuchFieldException("Get on containerPort is not supported.")
    set(value) { this.withContainerPort(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.withCluster
 */
var software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.cluster: software.amazon.awscdk.services.ecs.ICluster
    get() = throw NoSuchFieldException("Get on cluster is not supported.")
    set(value) { this.withCluster(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.withDesiredCount
 */
var software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.desiredCount: Number
    get() = throw NoSuchFieldException("Get on desiredCount is not supported.")
    set(value) { this.withDesiredCount(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.withImage
 */
var software.amazon.awscdk.services.ecs.LoadBalancedEc2ServiceProps.Builder.image: software.amazon.awscdk.services.ecs.ContainerImage
    get() = throw NoSuchFieldException("Get on image is not supported.")
    set(value) { this.withImage(value) }


/**
 * @see software.amazon.awscdk.services.ecs.PortMapping.Builder
 */
fun portMapping(init: software.amazon.awscdk.services.ecs.PortMapping.Builder.() -> Unit): software.amazon.awscdk.services.ecs.PortMapping {
    val builder = software.amazon.awscdk.services.ecs.PortMapping.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.PortMapping.Builder.withContainerPort
 */
var software.amazon.awscdk.services.ecs.PortMapping.Builder.containerPort: Number
    get() = throw NoSuchFieldException("Get on containerPort is not supported.")
    set(value) { this.withContainerPort(value) }

/**
 * @see software.amazon.awscdk.services.ecs.PortMapping.Builder.withHostPort
 */
var software.amazon.awscdk.services.ecs.PortMapping.Builder.hostPort: Number
    get() = throw NoSuchFieldException("Get on hostPort is not supported.")
    set(value) { this.withHostPort(value) }

/**
 * @see software.amazon.awscdk.services.ecs.PortMapping.Builder.withProtocol
 */
var software.amazon.awscdk.services.ecs.PortMapping.Builder.protocol: software.amazon.awscdk.services.ecs.Protocol
    get() = throw NoSuchFieldException("Get on protocol is not supported.")
    set(value) { this.withProtocol(value) }


/**
 * @see software.amazon.awscdk.services.ecs.Ec2EventRuleTargetProps.Builder
 */
fun ec2EventRuleTargetProps(init: software.amazon.awscdk.services.ecs.Ec2EventRuleTargetProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.Ec2EventRuleTargetProps {
    val builder = software.amazon.awscdk.services.ecs.Ec2EventRuleTargetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.Ec2EventRuleTargetProps.Builder.withCluster
 */
var software.amazon.awscdk.services.ecs.Ec2EventRuleTargetProps.Builder.cluster: software.amazon.awscdk.services.ecs.ICluster
    get() = throw NoSuchFieldException("Get on cluster is not supported.")
    set(value) { this.withCluster(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Ec2EventRuleTargetProps.Builder.withTaskDefinition
 */
var software.amazon.awscdk.services.ecs.Ec2EventRuleTargetProps.Builder.taskDefinition: software.amazon.awscdk.services.ecs.TaskDefinition
    get() = throw NoSuchFieldException("Get on taskDefinition is not supported.")
    set(value) { this.withTaskDefinition(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Ec2EventRuleTargetProps.Builder.withTaskCount
 */
var software.amazon.awscdk.services.ecs.Ec2EventRuleTargetProps.Builder.taskCount: Number
    get() = throw NoSuchFieldException("Get on taskCount is not supported.")
    set(value) { this.withTaskCount(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty.Builder
 */
fun keyValuePairProperty(init: software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty.Builder.withValue
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty.Builder.withName
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps.Builder
 */
fun memoryUtilizationScalingProps(init: software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps {
    val builder = software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps.Builder.withTargetUtilizationPercent
 */
var software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps.Builder.targetUtilizationPercent: Number
    get() = throw NoSuchFieldException("Get on targetUtilizationPercent is not supported.")
    set(value) { this.withTargetUtilizationPercent(value) }

/**
 * @see software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps.Builder.withPolicyName
 */
var software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps.Builder.policyName: String
    get() = throw NoSuchFieldException("Get on policyName is not supported.")
    set(value) { this.withPolicyName(value) }

/**
 * @see software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps.Builder.withScaleOutCooldownSec
 */
var software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps.Builder.scaleOutCooldownSec: Number
    get() = throw NoSuchFieldException("Get on scaleOutCooldownSec is not supported.")
    set(value) { this.withScaleOutCooldownSec(value) }

/**
 * @see software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps.Builder.withScaleInCooldownSec
 */
var software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps.Builder.scaleInCooldownSec: Number
    get() = throw NoSuchFieldException("Get on scaleInCooldownSec is not supported.")
    set(value) { this.withScaleInCooldownSec(value) }

/**
 * @see software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps.Builder.withDisableScaleIn
 */
var software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps.Builder.disableScaleIn: Boolean
    get() = throw NoSuchFieldException("Get on disableScaleIn is not supported.")
    set(value) { this.withDisableScaleIn(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder
 */
fun containerDefinitionProperty(init: software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withEnvironment
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.environment: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on environment is not supported.")
    set(value) { this.withEnvironment(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withHostname
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.hostname: String
    get() = throw NoSuchFieldException("Get on hostname is not supported.")
    set(value) { this.withHostname(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withDisableNetworking
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.disableNetworking: Boolean
    get() = throw NoSuchFieldException("Get on disableNetworking is not supported.")
    set(value) { this.withDisableNetworking(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withDockerLabels
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.dockerLabels: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on dockerLabels is not supported.")
    set(value) { this.withDockerLabels(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withEssential
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.essential: Boolean
    get() = throw NoSuchFieldException("Get on essential is not supported.")
    set(value) { this.withEssential(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withExtraHosts
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.extraHosts: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on extraHosts is not supported.")
    set(value) { this.withExtraHosts(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withWorkingDirectory
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.workingDirectory: String
    get() = throw NoSuchFieldException("Get on workingDirectory is not supported.")
    set(value) { this.withWorkingDirectory(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withName
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withHealthCheck
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.healthCheck: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on healthCheck is not supported.")
    set(value) { this.withHealthCheck(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withUser
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.user: String
    get() = throw NoSuchFieldException("Get on user is not supported.")
    set(value) { this.withUser(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withImage
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.image: String
    get() = throw NoSuchFieldException("Get on image is not supported.")
    set(value) { this.withImage(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withMemory
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.memory: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on memory is not supported.")
    set(value) { this.withMemory(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withMountPoints
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.mountPoints: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on mountPoints is not supported.")
    set(value) { this.withMountPoints(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withPrivileged
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.privileged: Boolean
    get() = throw NoSuchFieldException("Get on privileged is not supported.")
    set(value) { this.withPrivileged(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withReadonlyRootFilesystem
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.readonlyRootFilesystem: Boolean
    get() = throw NoSuchFieldException("Get on readonlyRootFilesystem is not supported.")
    set(value) { this.withReadonlyRootFilesystem(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withUlimits
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.ulimits: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ulimits is not supported.")
    set(value) { this.withUlimits(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withCpu
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.cpu: Number
    get() = throw NoSuchFieldException("Get on cpu is not supported.")
    set(value) { this.withCpu(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withLinuxParameters
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.linuxParameters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on linuxParameters is not supported.")
    set(value) { this.withLinuxParameters(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withLogConfiguration
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.logConfiguration: software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty
    get() = throw NoSuchFieldException("Get on logConfiguration is not supported.")
    set(value) { this.withLogConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withMemoryReservation
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.memoryReservation: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on memoryReservation is not supported.")
    set(value) { this.withMemoryReservation(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withPortMappings
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.portMappings: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on portMappings is not supported.")
    set(value) { this.withPortMappings(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withRepositoryCredentials
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.repositoryCredentials: software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty
    get() = throw NoSuchFieldException("Get on repositoryCredentials is not supported.")
    set(value) { this.withRepositoryCredentials(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.withVolumesFrom
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder.volumesFrom: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on volumesFrom is not supported.")
    set(value) { this.withVolumesFrom(value) }


/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder
 */
fun loadBalancedFargateServiceProps(init: software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps {
    val builder = software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.withLoadBalancerType
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.loadBalancerType: software.amazon.awscdk.services.ecs.LoadBalancerType
    get() = throw NoSuchFieldException("Get on loadBalancerType is not supported.")
    set(value) { this.withLoadBalancerType(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.withPublicLoadBalancer
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.publicLoadBalancer: Boolean
    get() = throw NoSuchFieldException("Get on publicLoadBalancer is not supported.")
    set(value) { this.withPublicLoadBalancer(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.withCertificate
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.certificate: software.amazon.awscdk.services.certificatemanager.ICertificate
    get() = throw NoSuchFieldException("Get on certificate is not supported.")
    set(value) { this.withCertificate(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.withContainerPort
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.containerPort: Number
    get() = throw NoSuchFieldException("Get on containerPort is not supported.")
    set(value) { this.withContainerPort(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.withCluster
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.cluster: software.amazon.awscdk.services.ecs.ICluster
    get() = throw NoSuchFieldException("Get on cluster is not supported.")
    set(value) { this.withCluster(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.withDesiredCount
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.desiredCount: Number
    get() = throw NoSuchFieldException("Get on desiredCount is not supported.")
    set(value) { this.withDesiredCount(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.withDomainName
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.domainName: String
    get() = throw NoSuchFieldException("Get on domainName is not supported.")
    set(value) { this.withDomainName(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.withImage
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.image: software.amazon.awscdk.services.ecs.ContainerImage
    get() = throw NoSuchFieldException("Get on image is not supported.")
    set(value) { this.withImage(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.withCpu
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.cpu: String
    get() = throw NoSuchFieldException("Get on cpu is not supported.")
    set(value) { this.withCpu(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.withCreateLogs
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.createLogs: Boolean
    get() = throw NoSuchFieldException("Get on createLogs is not supported.")
    set(value) { this.withCreateLogs(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.withDomainZone
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.domainZone: software.amazon.awscdk.services.route53.IHostedZone
    get() = throw NoSuchFieldException("Get on domainZone is not supported.")
    set(value) { this.withDomainZone(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.withMemoryMiB
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.memoryMiB: String
    get() = throw NoSuchFieldException("Get on memoryMiB is not supported.")
    set(value) { this.withMemoryMiB(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.withPublicTasks
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceProps.Builder.publicTasks: Boolean
    get() = throw NoSuchFieldException("Get on publicTasks is not supported.")
    set(value) { this.withPublicTasks(value) }


/**
 * @see software.amazon.awscdk.services.ecs.HealthCheck.Builder
 */
fun healthCheck(init: software.amazon.awscdk.services.ecs.HealthCheck.Builder.() -> Unit): software.amazon.awscdk.services.ecs.HealthCheck {
    val builder = software.amazon.awscdk.services.ecs.HealthCheck.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.HealthCheck.Builder.withIntervalSeconds
 */
var software.amazon.awscdk.services.ecs.HealthCheck.Builder.intervalSeconds: Number
    get() = throw NoSuchFieldException("Get on intervalSeconds is not supported.")
    set(value) { this.withIntervalSeconds(value) }

/**
 * @see software.amazon.awscdk.services.ecs.HealthCheck.Builder.withTimeout
 */
var software.amazon.awscdk.services.ecs.HealthCheck.Builder.timeout: Number
    get() = throw NoSuchFieldException("Get on timeout is not supported.")
    set(value) { this.withTimeout(value) }

/**
 * @see software.amazon.awscdk.services.ecs.HealthCheck.Builder.withRetries
 */
var software.amazon.awscdk.services.ecs.HealthCheck.Builder.retries: Number
    get() = throw NoSuchFieldException("Get on retries is not supported.")
    set(value) { this.withRetries(value) }

/**
 * @see software.amazon.awscdk.services.ecs.HealthCheck.Builder.withStartPeriod
 */
var software.amazon.awscdk.services.ecs.HealthCheck.Builder.startPeriod: Number
    get() = throw NoSuchFieldException("Get on startPeriod is not supported.")
    set(value) { this.withStartPeriod(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder
 */
fun dockerVolumeConfigurationProperty(init: software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder.withScope
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder.scope: String
    get() = throw NoSuchFieldException("Get on scope is not supported.")
    set(value) { this.withScope(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder.withAutoprovision
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder.autoprovision: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on autoprovision is not supported.")
    set(value) { this.withAutoprovision(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder.withDriver
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder.driver: String
    get() = throw NoSuchFieldException("Get on driver is not supported.")
    set(value) { this.withDriver(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder.withDriverOpts
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder.driverOpts: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on driverOpts is not supported.")
    set(value) { this.withDriverOpts(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder.withLabels
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder.labels: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on labels is not supported.")
    set(value) { this.withLabels(value) }


/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder
 */
fun loadBalancedFargateServiceAppletProps(init: software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps {
    val builder = software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.withStackName
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.stackName: String
    get() = throw NoSuchFieldException("Get on stackName is not supported.")
    set(value) { this.withStackName(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.withPublicLoadBalancer
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.publicLoadBalancer: Boolean
    get() = throw NoSuchFieldException("Get on publicLoadBalancer is not supported.")
    set(value) { this.withPublicLoadBalancer(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.withCertificate
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.certificate: String
    get() = throw NoSuchFieldException("Get on certificate is not supported.")
    set(value) { this.withCertificate(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.withContainerPort
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.containerPort: Number
    get() = throw NoSuchFieldException("Get on containerPort is not supported.")
    set(value) { this.withContainerPort(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.withDesiredCount
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.desiredCount: Number
    get() = throw NoSuchFieldException("Get on desiredCount is not supported.")
    set(value) { this.withDesiredCount(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.withDomainName
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.domainName: String
    get() = throw NoSuchFieldException("Get on domainName is not supported.")
    set(value) { this.withDomainName(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.withEnv
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.env: software.amazon.awscdk.Environment
    get() = throw NoSuchFieldException("Get on env is not supported.")
    set(value) { this.withEnv(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.withAutoDeploy
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.autoDeploy: Boolean
    get() = throw NoSuchFieldException("Get on autoDeploy is not supported.")
    set(value) { this.withAutoDeploy(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.withNamingScheme
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.namingScheme: software.amazon.awscdk.IAddressingScheme
    get() = throw NoSuchFieldException("Get on namingScheme is not supported.")
    set(value) { this.withNamingScheme(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.withImage
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.image: String
    get() = throw NoSuchFieldException("Get on image is not supported.")
    set(value) { this.withImage(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.withCpu
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.cpu: String
    get() = throw NoSuchFieldException("Get on cpu is not supported.")
    set(value) { this.withCpu(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.withDomainZone
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.domainZone: String
    get() = throw NoSuchFieldException("Get on domainZone is not supported.")
    set(value) { this.withDomainZone(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.withMemoryMiB
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.memoryMiB: String
    get() = throw NoSuchFieldException("Get on memoryMiB is not supported.")
    set(value) { this.withMemoryMiB(value) }

/**
 * @see software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.withPublicTasks
 */
var software.amazon.awscdk.services.ecs.LoadBalancedFargateServiceAppletProps.Builder.publicTasks: Boolean
    get() = throw NoSuchFieldException("Get on publicTasks is not supported.")
    set(value) { this.withPublicTasks(value) }


/**
 * @see software.amazon.awscdk.services.ecs.MountPoint.Builder
 */
fun mountPoint(init: software.amazon.awscdk.services.ecs.MountPoint.Builder.() -> Unit): software.amazon.awscdk.services.ecs.MountPoint {
    val builder = software.amazon.awscdk.services.ecs.MountPoint.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.MountPoint.Builder.withContainerPath
 */
var software.amazon.awscdk.services.ecs.MountPoint.Builder.containerPath: String
    get() = throw NoSuchFieldException("Get on containerPath is not supported.")
    set(value) { this.withContainerPath(value) }

/**
 * @see software.amazon.awscdk.services.ecs.MountPoint.Builder.withReadOnly
 */
var software.amazon.awscdk.services.ecs.MountPoint.Builder.readOnly: Boolean
    get() = throw NoSuchFieldException("Get on readOnly is not supported.")
    set(value) { this.withReadOnly(value) }

/**
 * @see software.amazon.awscdk.services.ecs.MountPoint.Builder.withSourceVolume
 */
var software.amazon.awscdk.services.ecs.MountPoint.Builder.sourceVolume: String
    get() = throw NoSuchFieldException("Get on sourceVolume is not supported.")
    set(value) { this.withSourceVolume(value) }


/**
 * @see software.amazon.awscdk.services.ecs.ScratchSpace.Builder
 */
fun scratchSpace(init: software.amazon.awscdk.services.ecs.ScratchSpace.Builder.() -> Unit): software.amazon.awscdk.services.ecs.ScratchSpace {
    val builder = software.amazon.awscdk.services.ecs.ScratchSpace.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.ScratchSpace.Builder.withSourcePath
 */
var software.amazon.awscdk.services.ecs.ScratchSpace.Builder.sourcePath: String
    get() = throw NoSuchFieldException("Get on sourcePath is not supported.")
    set(value) { this.withSourcePath(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ScratchSpace.Builder.withContainerPath
 */
var software.amazon.awscdk.services.ecs.ScratchSpace.Builder.containerPath: String
    get() = throw NoSuchFieldException("Get on containerPath is not supported.")
    set(value) { this.withContainerPath(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ScratchSpace.Builder.withReadOnly
 */
var software.amazon.awscdk.services.ecs.ScratchSpace.Builder.readOnly: Boolean
    get() = throw NoSuchFieldException("Get on readOnly is not supported.")
    set(value) { this.withReadOnly(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ScratchSpace.Builder.withName
 */
var software.amazon.awscdk.services.ecs.ScratchSpace.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder
 */
fun addCapacityOptions(init: software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.() -> Unit): software.amazon.awscdk.services.ecs.AddCapacityOptions {
    val builder = software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.withInstanceType
 */
var software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.instanceType: software.amazon.awscdk.services.ec2.InstanceType
    get() = throw NoSuchFieldException("Get on instanceType is not supported.")
    set(value) { this.withInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.withContainersAccessInstanceRole
 */
var software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.containersAccessInstanceRole: Boolean
    get() = throw NoSuchFieldException("Get on containersAccessInstanceRole is not supported.")
    set(value) { this.withContainersAccessInstanceRole(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.withTaskDrainTimeSeconds
 */
var software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.taskDrainTimeSeconds: Number
    get() = throw NoSuchFieldException("Get on taskDrainTimeSeconds is not supported.")
    set(value) { this.withTaskDrainTimeSeconds(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.withAllowAllOutbound
 */
var software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.allowAllOutbound: Boolean
    get() = throw NoSuchFieldException("Get on allowAllOutbound is not supported.")
    set(value) { this.withAllowAllOutbound(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.withAssociatePublicIpAddress
 */
var software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.associatePublicIpAddress: Boolean
    get() = throw NoSuchFieldException("Get on associatePublicIpAddress is not supported.")
    set(value) { this.withAssociatePublicIpAddress(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.withCooldownSeconds
 */
var software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.cooldownSeconds: Number
    get() = throw NoSuchFieldException("Get on cooldownSeconds is not supported.")
    set(value) { this.withCooldownSeconds(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.withDesiredCapacity
 */
var software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.desiredCapacity: Number
    get() = throw NoSuchFieldException("Get on desiredCapacity is not supported.")
    set(value) { this.withDesiredCapacity(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.withIgnoreUnmodifiedSizeProperties
 */
var software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.ignoreUnmodifiedSizeProperties: Boolean
    get() = throw NoSuchFieldException("Get on ignoreUnmodifiedSizeProperties is not supported.")
    set(value) { this.withIgnoreUnmodifiedSizeProperties(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.withKeyName
 */
var software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.keyName: String
    get() = throw NoSuchFieldException("Get on keyName is not supported.")
    set(value) { this.withKeyName(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.withMaxCapacity
 */
var software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.maxCapacity: Number
    get() = throw NoSuchFieldException("Get on maxCapacity is not supported.")
    set(value) { this.withMaxCapacity(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.withMinCapacity
 */
var software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.minCapacity: Number
    get() = throw NoSuchFieldException("Get on minCapacity is not supported.")
    set(value) { this.withMinCapacity(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.withNotificationsTopic
 */
var software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.notificationsTopic: software.amazon.awscdk.services.sns.ITopic
    get() = throw NoSuchFieldException("Get on notificationsTopic is not supported.")
    set(value) { this.withNotificationsTopic(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.withReplacingUpdateMinSuccessfulInstancesPercent
 */
var software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.replacingUpdateMinSuccessfulInstancesPercent: Number
    get() = throw NoSuchFieldException("Get on replacingUpdateMinSuccessfulInstancesPercent is not supported.")
    set(value) { this.withReplacingUpdateMinSuccessfulInstancesPercent(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.withResourceSignalCount
 */
var software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.resourceSignalCount: Number
    get() = throw NoSuchFieldException("Get on resourceSignalCount is not supported.")
    set(value) { this.withResourceSignalCount(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.withResourceSignalTimeoutSec
 */
var software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.resourceSignalTimeoutSec: Number
    get() = throw NoSuchFieldException("Get on resourceSignalTimeoutSec is not supported.")
    set(value) { this.withResourceSignalTimeoutSec(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.withRollingUpdateConfiguration
 */
var software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.rollingUpdateConfiguration: software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration
    get() = throw NoSuchFieldException("Get on rollingUpdateConfiguration is not supported.")
    set(value) { this.withRollingUpdateConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.withUpdateType
 */
var software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.updateType: software.amazon.awscdk.services.autoscaling.UpdateType
    get() = throw NoSuchFieldException("Get on updateType is not supported.")
    set(value) { this.withUpdateType(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.withVpcSubnets
 */
var software.amazon.awscdk.services.ecs.AddCapacityOptions.Builder.vpcSubnets: software.amazon.awscdk.services.ec2.SubnetSelection
    get() = throw NoSuchFieldException("Get on vpcSubnets is not supported.")
    set(value) { this.withVpcSubnets(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps.Builder
 */
fun commonTaskDefinitionProps(init: software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps {
    val builder = software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps.Builder.withFamily
 */
var software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps.Builder.family: String
    get() = throw NoSuchFieldException("Get on family is not supported.")
    set(value) { this.withFamily(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps.Builder.withTaskRole
 */
var software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps.Builder.taskRole: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on taskRole is not supported.")
    set(value) { this.withTaskRole(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps.Builder.withExecutionRole
 */
var software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps.Builder.executionRole: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on executionRole is not supported.")
    set(value) { this.withExecutionRole(value) }


/**
 * @see software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps.Builder
 */
fun ec2TaskDefinitionProps(init: software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps {
    val builder = software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps.Builder.withFamily
 */
var software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps.Builder.family: String
    get() = throw NoSuchFieldException("Get on family is not supported.")
    set(value) { this.withFamily(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps.Builder.withTaskRole
 */
var software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps.Builder.taskRole: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on taskRole is not supported.")
    set(value) { this.withTaskRole(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps.Builder.withExecutionRole
 */
var software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps.Builder.executionRole: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on executionRole is not supported.")
    set(value) { this.withExecutionRole(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps.Builder.withNetworkMode
 */
var software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps.Builder.networkMode: software.amazon.awscdk.services.ecs.NetworkMode
    get() = throw NoSuchFieldException("Get on networkMode is not supported.")
    set(value) { this.withNetworkMode(value) }


/**
 * @see software.amazon.awscdk.services.ecs.RepositoryImageProps.Builder
 */
fun repositoryImageProps(init: software.amazon.awscdk.services.ecs.RepositoryImageProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.RepositoryImageProps {
    val builder = software.amazon.awscdk.services.ecs.RepositoryImageProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.RepositoryImageProps.Builder.withCredentials
 */
var software.amazon.awscdk.services.ecs.RepositoryImageProps.Builder.credentials: software.amazon.awscdk.services.secretsmanager.ISecret
    get() = throw NoSuchFieldException("Get on credentials is not supported.")
    set(value) { this.withCredentials(value) }


/**
 * @see software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder
 */
fun requestCountScalingProps(init: software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.RequestCountScalingProps {
    val builder = software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder.withPolicyName
 */
var software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder.policyName: String
    get() = throw NoSuchFieldException("Get on policyName is not supported.")
    set(value) { this.withPolicyName(value) }

/**
 * @see software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder.withScaleOutCooldownSec
 */
var software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder.scaleOutCooldownSec: Number
    get() = throw NoSuchFieldException("Get on scaleOutCooldownSec is not supported.")
    set(value) { this.withScaleOutCooldownSec(value) }

/**
 * @see software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder.withScaleInCooldownSec
 */
var software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder.scaleInCooldownSec: Number
    get() = throw NoSuchFieldException("Get on scaleInCooldownSec is not supported.")
    set(value) { this.withScaleInCooldownSec(value) }

/**
 * @see software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder.withDisableScaleIn
 */
var software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder.disableScaleIn: Boolean
    get() = throw NoSuchFieldException("Get on disableScaleIn is not supported.")
    set(value) { this.withDisableScaleIn(value) }

/**
 * @see software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder.withRequestsPerTarget
 */
var software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder.requestsPerTarget: Number
    get() = throw NoSuchFieldException("Get on requestsPerTarget is not supported.")
    set(value) { this.withRequestsPerTarget(value) }

/**
 * @see software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder.withTargetGroup
 */
var software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder.targetGroup: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup
    get() = throw NoSuchFieldException("Get on targetGroup is not supported.")
    set(value) { this.withTargetGroup(value) }


/**
 * @see software.amazon.awscdk.services.ecs.ClusterProps.Builder
 */
fun clusterProps(init: software.amazon.awscdk.services.ecs.ClusterProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.ClusterProps {
    val builder = software.amazon.awscdk.services.ecs.ClusterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.ClusterProps.Builder.withClusterName
 */
var software.amazon.awscdk.services.ecs.ClusterProps.Builder.clusterName: String
    get() = throw NoSuchFieldException("Get on clusterName is not supported.")
    set(value) { this.withClusterName(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ClusterProps.Builder.withVpc
 */
var software.amazon.awscdk.services.ecs.ClusterProps.Builder.vpc: software.amazon.awscdk.services.ec2.IVpcNetwork
    get() = throw NoSuchFieldException("Get on vpc is not supported.")
    set(value) { this.withVpc(value) }


/**
 * @see software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions.Builder
 */
fun addAutoScalingGroupCapacityOptions(init: software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions.Builder.() -> Unit): software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions {
    val builder = software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions.Builder.withContainersAccessInstanceRole
 */
var software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions.Builder.containersAccessInstanceRole: Boolean
    get() = throw NoSuchFieldException("Get on containersAccessInstanceRole is not supported.")
    set(value) { this.withContainersAccessInstanceRole(value) }

/**
 * @see software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions.Builder.withTaskDrainTimeSeconds
 */
var software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions.Builder.taskDrainTimeSeconds: Number
    get() = throw NoSuchFieldException("Get on taskDrainTimeSeconds is not supported.")
    set(value) { this.withTaskDrainTimeSeconds(value) }


/**
 * @see software.amazon.awscdk.services.ecs.Host.Builder
 */
fun host(init: software.amazon.awscdk.services.ecs.Host.Builder.() -> Unit): software.amazon.awscdk.services.ecs.Host {
    val builder = software.amazon.awscdk.services.ecs.Host.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.Host.Builder.withSourcePath
 */
var software.amazon.awscdk.services.ecs.Host.Builder.sourcePath: String
    get() = throw NoSuchFieldException("Get on sourcePath is not supported.")
    set(value) { this.withSourcePath(value) }


/**
 * @see software.amazon.awscdk.services.ecs.FargateServiceProps.Builder
 */
fun fargateServiceProps(init: software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.FargateServiceProps {
    val builder = software.amazon.awscdk.services.ecs.FargateServiceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.withAssignPublicIp
 */
var software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.assignPublicIp: Boolean
    get() = throw NoSuchFieldException("Get on assignPublicIp is not supported.")
    set(value) { this.withAssignPublicIp(value) }

/**
 * @see software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.withVpcSubnets
 */
var software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.vpcSubnets: software.amazon.awscdk.services.ec2.SubnetSelection
    get() = throw NoSuchFieldException("Get on vpcSubnets is not supported.")
    set(value) { this.withVpcSubnets(value) }

/**
 * @see software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.withCluster
 */
var software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.cluster: software.amazon.awscdk.services.ecs.ICluster
    get() = throw NoSuchFieldException("Get on cluster is not supported.")
    set(value) { this.withCluster(value) }

/**
 * @see software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.withTaskDefinition
 */
var software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.taskDefinition: software.amazon.awscdk.services.ecs.TaskDefinition
    get() = throw NoSuchFieldException("Get on taskDefinition is not supported.")
    set(value) { this.withTaskDefinition(value) }

/**
 * @see software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.withSecurityGroup
 */
var software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.securityGroup: software.amazon.awscdk.services.ec2.ISecurityGroup
    get() = throw NoSuchFieldException("Get on securityGroup is not supported.")
    set(value) { this.withSecurityGroup(value) }

/**
 * @see software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.withDesiredCount
 */
var software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.desiredCount: Number
    get() = throw NoSuchFieldException("Get on desiredCount is not supported.")
    set(value) { this.withDesiredCount(value) }

/**
 * @see software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.withHealthCheckGracePeriodSeconds
 */
var software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.healthCheckGracePeriodSeconds: Number
    get() = throw NoSuchFieldException("Get on healthCheckGracePeriodSeconds is not supported.")
    set(value) { this.withHealthCheckGracePeriodSeconds(value) }

/**
 * @see software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.withMaximumPercent
 */
var software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.maximumPercent: Number
    get() = throw NoSuchFieldException("Get on maximumPercent is not supported.")
    set(value) { this.withMaximumPercent(value) }

/**
 * @see software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.withMinimumHealthyPercent
 */
var software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.minimumHealthyPercent: Number
    get() = throw NoSuchFieldException("Get on minimumHealthyPercent is not supported.")
    set(value) { this.withMinimumHealthyPercent(value) }

/**
 * @see software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.withServiceName
 */
var software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.serviceName: String
    get() = throw NoSuchFieldException("Get on serviceName is not supported.")
    set(value) { this.withServiceName(value) }

/**
 * @see software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.withPlatformVersion
 */
var software.amazon.awscdk.services.ecs.FargateServiceProps.Builder.platformVersion: software.amazon.awscdk.services.ecs.FargatePlatformVersion
    get() = throw NoSuchFieldException("Get on platformVersion is not supported.")
    set(value) { this.withPlatformVersion(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty.Builder
 */
fun hostVolumePropertiesProperty(init: software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty.Builder.withSourcePath
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty.Builder.sourcePath: String
    get() = throw NoSuchFieldException("Get on sourcePath is not supported.")
    set(value) { this.withSourcePath(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty.Builder
 */
fun volumeFromProperty(init: software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty.Builder.withReadOnly
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty.Builder.readOnly: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on readOnly is not supported.")
    set(value) { this.withReadOnly(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty.Builder.withSourceContainer
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty.Builder.sourceContainer: String
    get() = throw NoSuchFieldException("Get on sourceContainer is not supported.")
    set(value) { this.withSourceContainer(value) }


/**
 * @see software.amazon.awscdk.services.ecs.VolumeFrom.Builder
 */
fun volumeFrom(init: software.amazon.awscdk.services.ecs.VolumeFrom.Builder.() -> Unit): software.amazon.awscdk.services.ecs.VolumeFrom {
    val builder = software.amazon.awscdk.services.ecs.VolumeFrom.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.VolumeFrom.Builder.withReadOnly
 */
var software.amazon.awscdk.services.ecs.VolumeFrom.Builder.readOnly: Boolean
    get() = throw NoSuchFieldException("Get on readOnly is not supported.")
    set(value) { this.withReadOnly(value) }

/**
 * @see software.amazon.awscdk.services.ecs.VolumeFrom.Builder.withSourceContainer
 */
var software.amazon.awscdk.services.ecs.VolumeFrom.Builder.sourceContainer: String
    get() = throw NoSuchFieldException("Get on sourceContainer is not supported.")
    set(value) { this.withSourceContainer(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty.Builder
 */
fun kernelCapabilitiesProperty(init: software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty.Builder()
    builder.init()
    return builder.build()
}


/**
 * @see software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps.Builder
 */
fun cpuUtilizationScalingProps(init: software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps {
    val builder = software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps.Builder.withTargetUtilizationPercent
 */
var software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps.Builder.targetUtilizationPercent: Number
    get() = throw NoSuchFieldException("Get on targetUtilizationPercent is not supported.")
    set(value) { this.withTargetUtilizationPercent(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps.Builder.withPolicyName
 */
var software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps.Builder.policyName: String
    get() = throw NoSuchFieldException("Get on policyName is not supported.")
    set(value) { this.withPolicyName(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps.Builder.withScaleOutCooldownSec
 */
var software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps.Builder.scaleOutCooldownSec: Number
    get() = throw NoSuchFieldException("Get on scaleOutCooldownSec is not supported.")
    set(value) { this.withScaleOutCooldownSec(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps.Builder.withScaleInCooldownSec
 */
var software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps.Builder.scaleInCooldownSec: Number
    get() = throw NoSuchFieldException("Get on scaleInCooldownSec is not supported.")
    set(value) { this.withScaleInCooldownSec(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps.Builder.withDisableScaleIn
 */
var software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps.Builder.disableScaleIn: Boolean
    get() = throw NoSuchFieldException("Get on disableScaleIn is not supported.")
    set(value) { this.withDisableScaleIn(value) }


/**
 * @see software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder
 */
fun trackCustomMetricProps(init: software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.TrackCustomMetricProps {
    val builder = software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder.withPolicyName
 */
var software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder.policyName: String
    get() = throw NoSuchFieldException("Get on policyName is not supported.")
    set(value) { this.withPolicyName(value) }

/**
 * @see software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder.withScaleOutCooldownSec
 */
var software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder.scaleOutCooldownSec: Number
    get() = throw NoSuchFieldException("Get on scaleOutCooldownSec is not supported.")
    set(value) { this.withScaleOutCooldownSec(value) }

/**
 * @see software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder.withTargetValue
 */
var software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder.targetValue: Number
    get() = throw NoSuchFieldException("Get on targetValue is not supported.")
    set(value) { this.withTargetValue(value) }

/**
 * @see software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder.withScaleInCooldownSec
 */
var software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder.scaleInCooldownSec: Number
    get() = throw NoSuchFieldException("Get on scaleInCooldownSec is not supported.")
    set(value) { this.withScaleInCooldownSec(value) }

/**
 * @see software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder.withDisableScaleIn
 */
var software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder.disableScaleIn: Boolean
    get() = throw NoSuchFieldException("Get on disableScaleIn is not supported.")
    set(value) { this.withDisableScaleIn(value) }

/**
 * @see software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder.withMetric
 */
var software.amazon.awscdk.services.ecs.TrackCustomMetricProps.Builder.metric: software.amazon.awscdk.services.cloudwatch.Metric
    get() = throw NoSuchFieldException("Get on metric is not supported.")
    set(value) { this.withMetric(value) }


/**
 * @see software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps.Builder
 */
fun fargateTaskDefinitionProps(init: software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps {
    val builder = software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps.Builder.withFamily
 */
var software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps.Builder.family: String
    get() = throw NoSuchFieldException("Get on family is not supported.")
    set(value) { this.withFamily(value) }

/**
 * @see software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps.Builder.withTaskRole
 */
var software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps.Builder.taskRole: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on taskRole is not supported.")
    set(value) { this.withTaskRole(value) }

/**
 * @see software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps.Builder.withExecutionRole
 */
var software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps.Builder.executionRole: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on executionRole is not supported.")
    set(value) { this.withExecutionRole(value) }

/**
 * @see software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps.Builder.withCpu
 */
var software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps.Builder.cpu: String
    get() = throw NoSuchFieldException("Get on cpu is not supported.")
    set(value) { this.withCpu(value) }

/**
 * @see software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps.Builder.withMemoryMiB
 */
var software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps.Builder.memoryMiB: String
    get() = throw NoSuchFieldException("Get on memoryMiB is not supported.")
    set(value) { this.withMemoryMiB(value) }


/**
 * @see software.amazon.awscdk.services.ecs.Ulimit.Builder
 */
fun ulimit(init: software.amazon.awscdk.services.ecs.Ulimit.Builder.() -> Unit): software.amazon.awscdk.services.ecs.Ulimit {
    val builder = software.amazon.awscdk.services.ecs.Ulimit.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.Ulimit.Builder.withName
 */
var software.amazon.awscdk.services.ecs.Ulimit.Builder.name: software.amazon.awscdk.services.ecs.UlimitName
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Ulimit.Builder.withHardLimit
 */
var software.amazon.awscdk.services.ecs.Ulimit.Builder.hardLimit: Number
    get() = throw NoSuchFieldException("Get on hardLimit is not supported.")
    set(value) { this.withHardLimit(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Ulimit.Builder.withSoftLimit
 */
var software.amazon.awscdk.services.ecs.Ulimit.Builder.softLimit: Number
    get() = throw NoSuchFieldException("Get on softLimit is not supported.")
    set(value) { this.withSoftLimit(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty.Builder
 */
fun healthCheckProperty(init: software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty.Builder.withInterval
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty.Builder.interval: Number
    get() = throw NoSuchFieldException("Get on interval is not supported.")
    set(value) { this.withInterval(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty.Builder.withTimeout
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty.Builder.timeout: Number
    get() = throw NoSuchFieldException("Get on timeout is not supported.")
    set(value) { this.withTimeout(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty.Builder.withRetries
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty.Builder.retries: Number
    get() = throw NoSuchFieldException("Get on retries is not supported.")
    set(value) { this.withRetries(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty.Builder.withStartPeriod
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty.Builder.startPeriod: Number
    get() = throw NoSuchFieldException("Get on startPeriod is not supported.")
    set(value) { this.withStartPeriod(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.Builder
 */
fun taskDefinitionPlacementConstraintProperty(init: software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.Builder.withExpression
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.Builder.expression: String
    get() = throw NoSuchFieldException("Get on expression is not supported.")
    set(value) { this.withExpression(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.Builder.withType
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.ecs.Volume.Builder
 */
fun volume(init: software.amazon.awscdk.services.ecs.Volume.Builder.() -> Unit): software.amazon.awscdk.services.ecs.Volume {
    val builder = software.amazon.awscdk.services.ecs.Volume.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.Volume.Builder.withHost
 */
var software.amazon.awscdk.services.ecs.Volume.Builder.host: software.amazon.awscdk.services.ecs.Host
    get() = throw NoSuchFieldException("Get on host is not supported.")
    set(value) { this.withHost(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Volume.Builder.withDockerVolumeConfiguration
 */
var software.amazon.awscdk.services.ecs.Volume.Builder.dockerVolumeConfiguration: software.amazon.awscdk.services.ecs.DockerVolumeConfiguration
    get() = throw NoSuchFieldException("Get on dockerVolumeConfiguration is not supported.")
    set(value) { this.withDockerVolumeConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.ecs.Volume.Builder.withName
 */
var software.amazon.awscdk.services.ecs.Volume.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder
 */
fun taskDefinitionProps(init: software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.TaskDefinitionProps {
    val builder = software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder.withFamily
 */
var software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder.family: String
    get() = throw NoSuchFieldException("Get on family is not supported.")
    set(value) { this.withFamily(value) }

/**
 * @see software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder.withTaskRole
 */
var software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder.taskRole: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on taskRole is not supported.")
    set(value) { this.withTaskRole(value) }

/**
 * @see software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder.withExecutionRole
 */
var software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder.executionRole: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on executionRole is not supported.")
    set(value) { this.withExecutionRole(value) }

/**
 * @see software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder.withCompatibility
 */
var software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder.compatibility: software.amazon.awscdk.services.ecs.Compatibility
    get() = throw NoSuchFieldException("Get on compatibility is not supported.")
    set(value) { this.withCompatibility(value) }

/**
 * @see software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder.withNetworkMode
 */
var software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder.networkMode: software.amazon.awscdk.services.ecs.NetworkMode
    get() = throw NoSuchFieldException("Get on networkMode is not supported.")
    set(value) { this.withNetworkMode(value) }

/**
 * @see software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder.withCpu
 */
var software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder.cpu: String
    get() = throw NoSuchFieldException("Get on cpu is not supported.")
    set(value) { this.withCpu(value) }

/**
 * @see software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder.withMemoryMiB
 */
var software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder.memoryMiB: String
    get() = throw NoSuchFieldException("Get on memoryMiB is not supported.")
    set(value) { this.withMemoryMiB(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnClusterProps.Builder
 */
fun cfnClusterProps(init: software.amazon.awscdk.services.ecs.CfnClusterProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnClusterProps {
    val builder = software.amazon.awscdk.services.ecs.CfnClusterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnClusterProps.Builder.withClusterName
 */
var software.amazon.awscdk.services.ecs.CfnClusterProps.Builder.clusterName: String
    get() = throw NoSuchFieldException("Get on clusterName is not supported.")
    set(value) { this.withClusterName(value) }


/**
 * @see software.amazon.awscdk.services.ecs.PlacementConstraint.Builder
 */
fun placementConstraint(init: software.amazon.awscdk.services.ecs.PlacementConstraint.Builder.() -> Unit): software.amazon.awscdk.services.ecs.PlacementConstraint {
    val builder = software.amazon.awscdk.services.ecs.PlacementConstraint.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.PlacementConstraint.Builder.withExpression
 */
var software.amazon.awscdk.services.ecs.PlacementConstraint.Builder.expression: String
    get() = throw NoSuchFieldException("Get on expression is not supported.")
    set(value) { this.withExpression(value) }

/**
 * @see software.amazon.awscdk.services.ecs.PlacementConstraint.Builder.withType
 */
var software.amazon.awscdk.services.ecs.PlacementConstraint.Builder.type: software.amazon.awscdk.services.ecs.PlacementConstraintType
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.ecs.EcsOptimizedAmiProps.Builder
 */
fun ecsOptimizedAmiProps(init: software.amazon.awscdk.services.ecs.EcsOptimizedAmiProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.EcsOptimizedAmiProps {
    val builder = software.amazon.awscdk.services.ecs.EcsOptimizedAmiProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.EcsOptimizedAmiProps.Builder.withGeneration
 */
var software.amazon.awscdk.services.ecs.EcsOptimizedAmiProps.Builder.generation: software.amazon.awscdk.services.ec2.AmazonLinuxGeneration
    get() = throw NoSuchFieldException("Get on generation is not supported.")
    set(value) { this.withGeneration(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty.Builder
 */
fun ulimitProperty(init: software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty.Builder.withName
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty.Builder.withHardLimit
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty.Builder.hardLimit: Number
    get() = throw NoSuchFieldException("Get on hardLimit is not supported.")
    set(value) { this.withHardLimit(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty.Builder.withSoftLimit
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty.Builder.softLimit: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on softLimit is not supported.")
    set(value) { this.withSoftLimit(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty.Builder
 */
fun hostEntryProperty(init: software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty.Builder.withHostname
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty.Builder.hostname: String
    get() = throw NoSuchFieldException("Get on hostname is not supported.")
    set(value) { this.withHostname(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty.Builder.withIpAddress
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty.Builder.ipAddress: String
    get() = throw NoSuchFieldException("Get on ipAddress is not supported.")
    set(value) { this.withIpAddress(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty.Builder
 */
fun deploymentConfigurationProperty(init: software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty.Builder.withMaximumPercent
 */
var software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty.Builder.maximumPercent: Number
    get() = throw NoSuchFieldException("Get on maximumPercent is not supported.")
    set(value) { this.withMaximumPercent(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty.Builder.withMinimumHealthyPercent
 */
var software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty.Builder.minimumHealthyPercent: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on minimumHealthyPercent is not supported.")
    set(value) { this.withMinimumHealthyPercent(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty.Builder
 */
fun networkConfigurationProperty(init: software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty.Builder.withAwsvpcConfiguration
 */
var software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty.Builder.awsvpcConfiguration: software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty
    get() = throw NoSuchFieldException("Get on awsvpcConfiguration is not supported.")
    set(value) { this.withAwsvpcConfiguration(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty.Builder
 */
fun serviceRegistryProperty(init: software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty.Builder.withContainerPort
 */
var software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty.Builder.containerPort: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on containerPort is not supported.")
    set(value) { this.withContainerPort(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty.Builder.withContainerName
 */
var software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty.Builder.containerName: String
    get() = throw NoSuchFieldException("Get on containerName is not supported.")
    set(value) { this.withContainerName(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty.Builder.withPort
 */
var software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty.Builder.port: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on port is not supported.")
    set(value) { this.withPort(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty.Builder.withRegistryArn
 */
var software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty.Builder.registryArn: String
    get() = throw NoSuchFieldException("Get on registryArn is not supported.")
    set(value) { this.withRegistryArn(value) }


/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder
 */
fun containerDefinitionProps(init: software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.ContainerDefinitionProps {
    val builder = software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.withMemoryLimitMiB
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.memoryLimitMiB: Number
    get() = throw NoSuchFieldException("Get on memoryLimitMiB is not supported.")
    set(value) { this.withMemoryLimitMiB(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.withMemoryReservationMiB
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.memoryReservationMiB: Number
    get() = throw NoSuchFieldException("Get on memoryReservationMiB is not supported.")
    set(value) { this.withMemoryReservationMiB(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.withTaskDefinition
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.taskDefinition: software.amazon.awscdk.services.ecs.TaskDefinition
    get() = throw NoSuchFieldException("Get on taskDefinition is not supported.")
    set(value) { this.withTaskDefinition(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.withLogging
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.logging: software.amazon.awscdk.services.ecs.LogDriver
    get() = throw NoSuchFieldException("Get on logging is not supported.")
    set(value) { this.withLogging(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.withHostname
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.hostname: String
    get() = throw NoSuchFieldException("Get on hostname is not supported.")
    set(value) { this.withHostname(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.withDisableNetworking
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.disableNetworking: Boolean
    get() = throw NoSuchFieldException("Get on disableNetworking is not supported.")
    set(value) { this.withDisableNetworking(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.withEssential
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.essential: Boolean
    get() = throw NoSuchFieldException("Get on essential is not supported.")
    set(value) { this.withEssential(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.withWorkingDirectory
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.workingDirectory: String
    get() = throw NoSuchFieldException("Get on workingDirectory is not supported.")
    set(value) { this.withWorkingDirectory(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.withHealthCheck
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.healthCheck: software.amazon.awscdk.services.ecs.HealthCheck
    get() = throw NoSuchFieldException("Get on healthCheck is not supported.")
    set(value) { this.withHealthCheck(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.withUser
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.user: String
    get() = throw NoSuchFieldException("Get on user is not supported.")
    set(value) { this.withUser(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.withImage
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.image: software.amazon.awscdk.services.ecs.ContainerImage
    get() = throw NoSuchFieldException("Get on image is not supported.")
    set(value) { this.withImage(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.withPrivileged
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.privileged: Boolean
    get() = throw NoSuchFieldException("Get on privileged is not supported.")
    set(value) { this.withPrivileged(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.withReadonlyRootFilesystem
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.readonlyRootFilesystem: Boolean
    get() = throw NoSuchFieldException("Get on readonlyRootFilesystem is not supported.")
    set(value) { this.withReadonlyRootFilesystem(value) }

/**
 * @see software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.withCpu
 */
var software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder.cpu: Number
    get() = throw NoSuchFieldException("Get on cpu is not supported.")
    set(value) { this.withCpu(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty.Builder
 */
fun awsVpcConfigurationProperty(init: software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty.Builder.withAssignPublicIp
 */
var software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty.Builder.assignPublicIp: String
    get() = throw NoSuchFieldException("Get on assignPublicIp is not supported.")
    set(value) { this.withAssignPublicIp(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty.Builder
 */
fun portMappingProperty(init: software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty.Builder.withContainerPort
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty.Builder.containerPort: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on containerPort is not supported.")
    set(value) { this.withContainerPort(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty.Builder.withHostPort
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty.Builder.hostPort: Number
    get() = throw NoSuchFieldException("Get on hostPort is not supported.")
    set(value) { this.withHostPort(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty.Builder.withProtocol
 */
var software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty.Builder.protocol: String
    get() = throw NoSuchFieldException("Get on protocol is not supported.")
    set(value) { this.withProtocol(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnServiceProps.Builder
 */
fun cfnServiceProps(init: software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnServiceProps {
    val builder = software.amazon.awscdk.services.ecs.CfnServiceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.withCluster
 */
var software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.cluster: String
    get() = throw NoSuchFieldException("Get on cluster is not supported.")
    set(value) { this.withCluster(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.withTaskDefinition
 */
var software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.taskDefinition: String
    get() = throw NoSuchFieldException("Get on taskDefinition is not supported.")
    set(value) { this.withTaskDefinition(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.withDesiredCount
 */
var software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.desiredCount: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on desiredCount is not supported.")
    set(value) { this.withDesiredCount(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.withHealthCheckGracePeriodSeconds
 */
var software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.healthCheckGracePeriodSeconds: Number
    get() = throw NoSuchFieldException("Get on healthCheckGracePeriodSeconds is not supported.")
    set(value) { this.withHealthCheckGracePeriodSeconds(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.withServiceName
 */
var software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.serviceName: String
    get() = throw NoSuchFieldException("Get on serviceName is not supported.")
    set(value) { this.withServiceName(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.withRole
 */
var software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.role: String
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.withPlacementConstraints
 */
var software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.placementConstraints: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on placementConstraints is not supported.")
    set(value) { this.withPlacementConstraints(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.withNetworkConfiguration
 */
var software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.networkConfiguration: software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty
    get() = throw NoSuchFieldException("Get on networkConfiguration is not supported.")
    set(value) { this.withNetworkConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.withPlacementStrategies
 */
var software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.placementStrategies: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on placementStrategies is not supported.")
    set(value) { this.withPlacementStrategies(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.withServiceRegistries
 */
var software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.serviceRegistries: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on serviceRegistries is not supported.")
    set(value) { this.withServiceRegistries(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.withPlatformVersion
 */
var software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.platformVersion: String
    get() = throw NoSuchFieldException("Get on platformVersion is not supported.")
    set(value) { this.withPlatformVersion(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.withSchedulingStrategy
 */
var software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.schedulingStrategy: String
    get() = throw NoSuchFieldException("Get on schedulingStrategy is not supported.")
    set(value) { this.withSchedulingStrategy(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.withDeploymentConfiguration
 */
var software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.deploymentConfiguration: software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty
    get() = throw NoSuchFieldException("Get on deploymentConfiguration is not supported.")
    set(value) { this.withDeploymentConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.withLaunchType
 */
var software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.launchType: String
    get() = throw NoSuchFieldException("Get on launchType is not supported.")
    set(value) { this.withLaunchType(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.withLoadBalancers
 */
var software.amazon.awscdk.services.ecs.CfnServiceProps.Builder.loadBalancers: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on loadBalancers is not supported.")
    set(value) { this.withLoadBalancers(value) }


/**
 * @see software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty.Builder
 */
fun placementStrategyProperty(init: software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty.Builder.() -> Unit): software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty {
    val builder = software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty.Builder.withField
 */
var software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty.Builder.field: String
    get() = throw NoSuchFieldException("Get on field is not supported.")
    set(value) { this.withField(value) }

/**
 * @see software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty.Builder.withType
 */
var software.amazon.awscdk.services.ecs.CfnService.PlacementStrategyProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }
