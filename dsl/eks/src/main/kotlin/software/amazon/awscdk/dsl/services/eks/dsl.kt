package software.amazon.awscdk.dsl.services.eks
/**
 * @see software.amazon.awscdk.services.eks.CfnCluster
 */
fun software.amazon.awscdk.Construct.cfnCluster(id: String,
                     props: software.amazon.awscdk.services.eks.CfnClusterProps? = null,
                     init: (software.amazon.awscdk.services.eks.CfnCluster.() -> Unit)? = null)
        : software.amazon.awscdk.services.eks.CfnCluster {

    val obj = software.amazon.awscdk.services.eks.CfnCluster(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.eks.Cluster
 */
fun software.amazon.awscdk.Construct.cluster(id: String,
                     props: software.amazon.awscdk.services.eks.ClusterProps? = null,
                     init: (software.amazon.awscdk.services.eks.Cluster.() -> Unit)? = null)
        : software.amazon.awscdk.services.eks.Cluster {

    val obj = software.amazon.awscdk.services.eks.Cluster(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty.Builder
 */
fun resourcesVpcConfigProperty(init: software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty {
    val builder = software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty.Builder()
    builder.init()
    return builder.build()
}


/**
 * @see software.amazon.awscdk.services.eks.EksOptimizedAmiProps.Builder
 */
fun eksOptimizedAmiProps(init: software.amazon.awscdk.services.eks.EksOptimizedAmiProps.Builder.() -> Unit): software.amazon.awscdk.services.eks.EksOptimizedAmiProps {
    val builder = software.amazon.awscdk.services.eks.EksOptimizedAmiProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.eks.EksOptimizedAmiProps.Builder.withNodeType
 */
var software.amazon.awscdk.services.eks.EksOptimizedAmiProps.Builder.nodeType: software.amazon.awscdk.services.eks.NodeType
    get() = throw NoSuchFieldException("Get on nodeType is not supported.")
    set(value) { this.withNodeType(value) }

/**
 * @see software.amazon.awscdk.services.eks.EksOptimizedAmiProps.Builder.withKubernetesVersion
 */
var software.amazon.awscdk.services.eks.EksOptimizedAmiProps.Builder.kubernetesVersion: String
    get() = throw NoSuchFieldException("Get on kubernetesVersion is not supported.")
    set(value) { this.withKubernetesVersion(value) }


/**
 * @see software.amazon.awscdk.services.eks.ClusterImportProps.Builder
 */
fun clusterImportProps(init: software.amazon.awscdk.services.eks.ClusterImportProps.Builder.() -> Unit): software.amazon.awscdk.services.eks.ClusterImportProps {
    val builder = software.amazon.awscdk.services.eks.ClusterImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.eks.ClusterImportProps.Builder.withClusterName
 */
var software.amazon.awscdk.services.eks.ClusterImportProps.Builder.clusterName: String
    get() = throw NoSuchFieldException("Get on clusterName is not supported.")
    set(value) { this.withClusterName(value) }

/**
 * @see software.amazon.awscdk.services.eks.ClusterImportProps.Builder.withClusterArn
 */
var software.amazon.awscdk.services.eks.ClusterImportProps.Builder.clusterArn: String
    get() = throw NoSuchFieldException("Get on clusterArn is not supported.")
    set(value) { this.withClusterArn(value) }

/**
 * @see software.amazon.awscdk.services.eks.ClusterImportProps.Builder.withVpc
 */
var software.amazon.awscdk.services.eks.ClusterImportProps.Builder.vpc: software.amazon.awscdk.services.ec2.VpcNetworkImportProps
    get() = throw NoSuchFieldException("Get on vpc is not supported.")
    set(value) { this.withVpc(value) }

/**
 * @see software.amazon.awscdk.services.eks.ClusterImportProps.Builder.withClusterCertificateAuthorityData
 */
var software.amazon.awscdk.services.eks.ClusterImportProps.Builder.clusterCertificateAuthorityData: String
    get() = throw NoSuchFieldException("Get on clusterCertificateAuthorityData is not supported.")
    set(value) { this.withClusterCertificateAuthorityData(value) }

/**
 * @see software.amazon.awscdk.services.eks.ClusterImportProps.Builder.withClusterEndpoint
 */
var software.amazon.awscdk.services.eks.ClusterImportProps.Builder.clusterEndpoint: String
    get() = throw NoSuchFieldException("Get on clusterEndpoint is not supported.")
    set(value) { this.withClusterEndpoint(value) }


/**
 * @see software.amazon.awscdk.services.eks.ClusterProps.Builder
 */
fun clusterProps(init: software.amazon.awscdk.services.eks.ClusterProps.Builder.() -> Unit): software.amazon.awscdk.services.eks.ClusterProps {
    val builder = software.amazon.awscdk.services.eks.ClusterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.eks.ClusterProps.Builder.withSecurityGroup
 */
var software.amazon.awscdk.services.eks.ClusterProps.Builder.securityGroup: software.amazon.awscdk.services.ec2.ISecurityGroup
    get() = throw NoSuchFieldException("Get on securityGroup is not supported.")
    set(value) { this.withSecurityGroup(value) }

/**
 * @see software.amazon.awscdk.services.eks.ClusterProps.Builder.withRole
 */
var software.amazon.awscdk.services.eks.ClusterProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.eks.ClusterProps.Builder.withClusterName
 */
var software.amazon.awscdk.services.eks.ClusterProps.Builder.clusterName: String
    get() = throw NoSuchFieldException("Get on clusterName is not supported.")
    set(value) { this.withClusterName(value) }

/**
 * @see software.amazon.awscdk.services.eks.ClusterProps.Builder.withVpc
 */
var software.amazon.awscdk.services.eks.ClusterProps.Builder.vpc: software.amazon.awscdk.services.ec2.IVpcNetwork
    get() = throw NoSuchFieldException("Get on vpc is not supported.")
    set(value) { this.withVpc(value) }

/**
 * @see software.amazon.awscdk.services.eks.ClusterProps.Builder.withVersion
 */
var software.amazon.awscdk.services.eks.ClusterProps.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.services.eks.AddAutoScalingGroupOptions.Builder
 */
fun addAutoScalingGroupOptions(init: software.amazon.awscdk.services.eks.AddAutoScalingGroupOptions.Builder.() -> Unit): software.amazon.awscdk.services.eks.AddAutoScalingGroupOptions {
    val builder = software.amazon.awscdk.services.eks.AddAutoScalingGroupOptions.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.eks.AddAutoScalingGroupOptions.Builder.withMaxPods
 */
var software.amazon.awscdk.services.eks.AddAutoScalingGroupOptions.Builder.maxPods: Number
    get() = throw NoSuchFieldException("Get on maxPods is not supported.")
    set(value) { this.withMaxPods(value) }


/**
 * @see software.amazon.awscdk.services.eks.CfnClusterProps.Builder
 */
fun cfnClusterProps(init: software.amazon.awscdk.services.eks.CfnClusterProps.Builder.() -> Unit): software.amazon.awscdk.services.eks.CfnClusterProps {
    val builder = software.amazon.awscdk.services.eks.CfnClusterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.eks.CfnClusterProps.Builder.withRoleArn
 */
var software.amazon.awscdk.services.eks.CfnClusterProps.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.eks.CfnClusterProps.Builder.withName
 */
var software.amazon.awscdk.services.eks.CfnClusterProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.eks.CfnClusterProps.Builder.withVersion
 */
var software.amazon.awscdk.services.eks.CfnClusterProps.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }

/**
 * @see software.amazon.awscdk.services.eks.CfnClusterProps.Builder.withResourcesVpcConfig
 */
var software.amazon.awscdk.services.eks.CfnClusterProps.Builder.resourcesVpcConfig: software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty
    get() = throw NoSuchFieldException("Get on resourcesVpcConfig is not supported.")
    set(value) { this.withResourcesVpcConfig(value) }


/**
 * @see software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder
 */
fun addWorkerNodesOptions(init: software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.() -> Unit): software.amazon.awscdk.services.eks.AddWorkerNodesOptions {
    val builder = software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.withInstanceType
 */
var software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.instanceType: software.amazon.awscdk.services.ec2.InstanceType
    get() = throw NoSuchFieldException("Get on instanceType is not supported.")
    set(value) { this.withInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.withAllowAllOutbound
 */
var software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.allowAllOutbound: Boolean
    get() = throw NoSuchFieldException("Get on allowAllOutbound is not supported.")
    set(value) { this.withAllowAllOutbound(value) }

/**
 * @see software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.withAssociatePublicIpAddress
 */
var software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.associatePublicIpAddress: Boolean
    get() = throw NoSuchFieldException("Get on associatePublicIpAddress is not supported.")
    set(value) { this.withAssociatePublicIpAddress(value) }

/**
 * @see software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.withCooldownSeconds
 */
var software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.cooldownSeconds: Number
    get() = throw NoSuchFieldException("Get on cooldownSeconds is not supported.")
    set(value) { this.withCooldownSeconds(value) }

/**
 * @see software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.withDesiredCapacity
 */
var software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.desiredCapacity: Number
    get() = throw NoSuchFieldException("Get on desiredCapacity is not supported.")
    set(value) { this.withDesiredCapacity(value) }

/**
 * @see software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.withIgnoreUnmodifiedSizeProperties
 */
var software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.ignoreUnmodifiedSizeProperties: Boolean
    get() = throw NoSuchFieldException("Get on ignoreUnmodifiedSizeProperties is not supported.")
    set(value) { this.withIgnoreUnmodifiedSizeProperties(value) }

/**
 * @see software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.withKeyName
 */
var software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.keyName: String
    get() = throw NoSuchFieldException("Get on keyName is not supported.")
    set(value) { this.withKeyName(value) }

/**
 * @see software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.withMaxCapacity
 */
var software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.maxCapacity: Number
    get() = throw NoSuchFieldException("Get on maxCapacity is not supported.")
    set(value) { this.withMaxCapacity(value) }

/**
 * @see software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.withMinCapacity
 */
var software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.minCapacity: Number
    get() = throw NoSuchFieldException("Get on minCapacity is not supported.")
    set(value) { this.withMinCapacity(value) }

/**
 * @see software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.withNotificationsTopic
 */
var software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.notificationsTopic: software.amazon.awscdk.services.sns.ITopic
    get() = throw NoSuchFieldException("Get on notificationsTopic is not supported.")
    set(value) { this.withNotificationsTopic(value) }

/**
 * @see software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.withReplacingUpdateMinSuccessfulInstancesPercent
 */
var software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.replacingUpdateMinSuccessfulInstancesPercent: Number
    get() = throw NoSuchFieldException("Get on replacingUpdateMinSuccessfulInstancesPercent is not supported.")
    set(value) { this.withReplacingUpdateMinSuccessfulInstancesPercent(value) }

/**
 * @see software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.withResourceSignalCount
 */
var software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.resourceSignalCount: Number
    get() = throw NoSuchFieldException("Get on resourceSignalCount is not supported.")
    set(value) { this.withResourceSignalCount(value) }

/**
 * @see software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.withResourceSignalTimeoutSec
 */
var software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.resourceSignalTimeoutSec: Number
    get() = throw NoSuchFieldException("Get on resourceSignalTimeoutSec is not supported.")
    set(value) { this.withResourceSignalTimeoutSec(value) }

/**
 * @see software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.withRollingUpdateConfiguration
 */
var software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.rollingUpdateConfiguration: software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration
    get() = throw NoSuchFieldException("Get on rollingUpdateConfiguration is not supported.")
    set(value) { this.withRollingUpdateConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.withUpdateType
 */
var software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.updateType: software.amazon.awscdk.services.autoscaling.UpdateType
    get() = throw NoSuchFieldException("Get on updateType is not supported.")
    set(value) { this.withUpdateType(value) }

/**
 * @see software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.withVpcSubnets
 */
var software.amazon.awscdk.services.eks.AddWorkerNodesOptions.Builder.vpcSubnets: software.amazon.awscdk.services.ec2.SubnetSelection
    get() = throw NoSuchFieldException("Get on vpcSubnets is not supported.")
    set(value) { this.withVpcSubnets(value) }
