package software.amazon.awscdk.dsl.services.elasticache
/**
 * @see software.amazon.awscdk.services.elasticache.CfnSubnetGroup
 */
fun software.amazon.awscdk.Construct.cfnSubnetGroup(id: String,
                     props: software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps? = null,
                     init: (software.amazon.awscdk.services.elasticache.CfnSubnetGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.elasticache.CfnSubnetGroup {

    val obj = software.amazon.awscdk.services.elasticache.CfnSubnetGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress
 */
fun software.amazon.awscdk.Construct.cfnSecurityGroupIngress(id: String,
                     props: software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps? = null,
                     init: (software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress.() -> Unit)? = null)
        : software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress {

    val obj = software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.elasticache.CfnParameterGroup
 */
fun software.amazon.awscdk.Construct.cfnParameterGroup(id: String,
                     props: software.amazon.awscdk.services.elasticache.CfnParameterGroupProps? = null,
                     init: (software.amazon.awscdk.services.elasticache.CfnParameterGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.elasticache.CfnParameterGroup {

    val obj = software.amazon.awscdk.services.elasticache.CfnParameterGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.elasticache.CfnCacheCluster
 */
fun software.amazon.awscdk.Construct.cfnCacheCluster(id: String,
                     props: software.amazon.awscdk.services.elasticache.CfnCacheClusterProps? = null,
                     init: (software.amazon.awscdk.services.elasticache.CfnCacheCluster.() -> Unit)? = null)
        : software.amazon.awscdk.services.elasticache.CfnCacheCluster {

    val obj = software.amazon.awscdk.services.elasticache.CfnCacheCluster(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroup
 */
fun software.amazon.awscdk.Construct.cfnReplicationGroup(id: String,
                     props: software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps? = null,
                     init: (software.amazon.awscdk.services.elasticache.CfnReplicationGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.elasticache.CfnReplicationGroup {

    val obj = software.amazon.awscdk.services.elasticache.CfnReplicationGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.elasticache.CfnSecurityGroup
 */
fun software.amazon.awscdk.Construct.cfnSecurityGroup(id: String,
                     props: software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps? = null,
                     init: (software.amazon.awscdk.services.elasticache.CfnSecurityGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.elasticache.CfnSecurityGroup {

    val obj = software.amazon.awscdk.services.elasticache.CfnSecurityGroup(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder
 */
fun cfnCacheClusterProps(init: software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.() -> Unit): software.amazon.awscdk.services.elasticache.CfnCacheClusterProps {
    val builder = software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.withAutoMinorVersionUpgrade
 */
var software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.autoMinorVersionUpgrade: Boolean
    get() = throw NoSuchFieldException("Get on autoMinorVersionUpgrade is not supported.")
    set(value) { this.withAutoMinorVersionUpgrade(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.withPreferredMaintenanceWindow
 */
var software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.preferredMaintenanceWindow: String
    get() = throw NoSuchFieldException("Get on preferredMaintenanceWindow is not supported.")
    set(value) { this.withPreferredMaintenanceWindow(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.withEngine
 */
var software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.engine: String
    get() = throw NoSuchFieldException("Get on engine is not supported.")
    set(value) { this.withEngine(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.withEngineVersion
 */
var software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.engineVersion: String
    get() = throw NoSuchFieldException("Get on engineVersion is not supported.")
    set(value) { this.withEngineVersion(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.withClusterName
 */
var software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.clusterName: String
    get() = throw NoSuchFieldException("Get on clusterName is not supported.")
    set(value) { this.withClusterName(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.withCacheNodeType
 */
var software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.cacheNodeType: String
    get() = throw NoSuchFieldException("Get on cacheNodeType is not supported.")
    set(value) { this.withCacheNodeType(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.withNumCacheNodes
 */
var software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.numCacheNodes: Number
    get() = throw NoSuchFieldException("Get on numCacheNodes is not supported.")
    set(value) { this.withNumCacheNodes(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.withAzMode
 */
var software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.azMode: String
    get() = throw NoSuchFieldException("Get on azMode is not supported.")
    set(value) { this.withAzMode(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.withCacheParameterGroupName
 */
var software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.cacheParameterGroupName: String
    get() = throw NoSuchFieldException("Get on cacheParameterGroupName is not supported.")
    set(value) { this.withCacheParameterGroupName(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.withCacheSubnetGroupName
 */
var software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.cacheSubnetGroupName: String
    get() = throw NoSuchFieldException("Get on cacheSubnetGroupName is not supported.")
    set(value) { this.withCacheSubnetGroupName(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.withNotificationTopicArn
 */
var software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.notificationTopicArn: String
    get() = throw NoSuchFieldException("Get on notificationTopicArn is not supported.")
    set(value) { this.withNotificationTopicArn(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.withPreferredAvailabilityZone
 */
var software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.preferredAvailabilityZone: String
    get() = throw NoSuchFieldException("Get on preferredAvailabilityZone is not supported.")
    set(value) { this.withPreferredAvailabilityZone(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.withSnapshotName
 */
var software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.snapshotName: String
    get() = throw NoSuchFieldException("Get on snapshotName is not supported.")
    set(value) { this.withSnapshotName(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.withSnapshotRetentionLimit
 */
var software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.snapshotRetentionLimit: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on snapshotRetentionLimit is not supported.")
    set(value) { this.withSnapshotRetentionLimit(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.withSnapshotWindow
 */
var software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.snapshotWindow: String
    get() = throw NoSuchFieldException("Get on snapshotWindow is not supported.")
    set(value) { this.withSnapshotWindow(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.withPort
 */
var software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder.port: Number
    get() = throw NoSuchFieldException("Get on port is not supported.")
    set(value) { this.withPort(value) }


/**
 * @see software.amazon.awscdk.services.elasticache.CfnParameterGroupProps.Builder
 */
fun cfnParameterGroupProps(init: software.amazon.awscdk.services.elasticache.CfnParameterGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.elasticache.CfnParameterGroupProps {
    val builder = software.amazon.awscdk.services.elasticache.CfnParameterGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticache.CfnParameterGroupProps.Builder.withDescription
 */
var software.amazon.awscdk.services.elasticache.CfnParameterGroupProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnParameterGroupProps.Builder.withCacheParameterGroupFamily
 */
var software.amazon.awscdk.services.elasticache.CfnParameterGroupProps.Builder.cacheParameterGroupFamily: String
    get() = throw NoSuchFieldException("Get on cacheParameterGroupFamily is not supported.")
    set(value) { this.withCacheParameterGroupFamily(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnParameterGroupProps.Builder.withProperties
 */
var software.amazon.awscdk.services.elasticache.CfnParameterGroupProps.Builder.properties: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on properties is not supported.")
    set(value) { this.withProperties(value) }


/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty.Builder
 */
fun nodeGroupConfigurationProperty(init: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty {
    val builder = software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty.Builder.withNodeGroupId
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty.Builder.nodeGroupId: String
    get() = throw NoSuchFieldException("Get on nodeGroupId is not supported.")
    set(value) { this.withNodeGroupId(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty.Builder.withPrimaryAvailabilityZone
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty.Builder.primaryAvailabilityZone: String
    get() = throw NoSuchFieldException("Get on primaryAvailabilityZone is not supported.")
    set(value) { this.withPrimaryAvailabilityZone(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty.Builder.withReplicaCount
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty.Builder.replicaCount: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on replicaCount is not supported.")
    set(value) { this.withReplicaCount(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty.Builder.withSlots
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty.Builder.slots: String
    get() = throw NoSuchFieldException("Get on slots is not supported.")
    set(value) { this.withSlots(value) }


/**
 * @see software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps.Builder
 */
fun cfnSecurityGroupIngressProps(init: software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps.Builder.() -> Unit): software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps {
    val builder = software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps.Builder.withCacheSecurityGroupName
 */
var software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps.Builder.cacheSecurityGroupName: String
    get() = throw NoSuchFieldException("Get on cacheSecurityGroupName is not supported.")
    set(value) { this.withCacheSecurityGroupName(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps.Builder.withEc2SecurityGroupName
 */
var software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps.Builder.ec2SecurityGroupName: String
    get() = throw NoSuchFieldException("Get on ec2SecurityGroupName is not supported.")
    set(value) { this.withEc2SecurityGroupName(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps.Builder.withEc2SecurityGroupOwnerId
 */
var software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps.Builder.ec2SecurityGroupOwnerId: String
    get() = throw NoSuchFieldException("Get on ec2SecurityGroupOwnerId is not supported.")
    set(value) { this.withEc2SecurityGroupOwnerId(value) }


/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder
 */
fun cfnReplicationGroupProps(init: software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps {
    val builder = software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withAutoMinorVersionUpgrade
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.autoMinorVersionUpgrade: Boolean
    get() = throw NoSuchFieldException("Get on autoMinorVersionUpgrade is not supported.")
    set(value) { this.withAutoMinorVersionUpgrade(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withPreferredMaintenanceWindow
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.preferredMaintenanceWindow: String
    get() = throw NoSuchFieldException("Get on preferredMaintenanceWindow is not supported.")
    set(value) { this.withPreferredMaintenanceWindow(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withEngine
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.engine: String
    get() = throw NoSuchFieldException("Get on engine is not supported.")
    set(value) { this.withEngine(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withEngineVersion
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.engineVersion: String
    get() = throw NoSuchFieldException("Get on engineVersion is not supported.")
    set(value) { this.withEngineVersion(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withCacheNodeType
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.cacheNodeType: String
    get() = throw NoSuchFieldException("Get on cacheNodeType is not supported.")
    set(value) { this.withCacheNodeType(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withCacheParameterGroupName
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.cacheParameterGroupName: String
    get() = throw NoSuchFieldException("Get on cacheParameterGroupName is not supported.")
    set(value) { this.withCacheParameterGroupName(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withCacheSubnetGroupName
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.cacheSubnetGroupName: String
    get() = throw NoSuchFieldException("Get on cacheSubnetGroupName is not supported.")
    set(value) { this.withCacheSubnetGroupName(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withNotificationTopicArn
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.notificationTopicArn: String
    get() = throw NoSuchFieldException("Get on notificationTopicArn is not supported.")
    set(value) { this.withNotificationTopicArn(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withSnapshotName
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.snapshotName: String
    get() = throw NoSuchFieldException("Get on snapshotName is not supported.")
    set(value) { this.withSnapshotName(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withSnapshotRetentionLimit
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.snapshotRetentionLimit: Number
    get() = throw NoSuchFieldException("Get on snapshotRetentionLimit is not supported.")
    set(value) { this.withSnapshotRetentionLimit(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withSnapshotWindow
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.snapshotWindow: String
    get() = throw NoSuchFieldException("Get on snapshotWindow is not supported.")
    set(value) { this.withSnapshotWindow(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withPort
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.port: Number
    get() = throw NoSuchFieldException("Get on port is not supported.")
    set(value) { this.withPort(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withReplicationGroupDescription
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.replicationGroupDescription: String
    get() = throw NoSuchFieldException("Get on replicationGroupDescription is not supported.")
    set(value) { this.withReplicationGroupDescription(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withAtRestEncryptionEnabled
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.atRestEncryptionEnabled: Boolean
    get() = throw NoSuchFieldException("Get on atRestEncryptionEnabled is not supported.")
    set(value) { this.withAtRestEncryptionEnabled(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withAuthToken
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.authToken: String
    get() = throw NoSuchFieldException("Get on authToken is not supported.")
    set(value) { this.withAuthToken(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withAutomaticFailoverEnabled
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.automaticFailoverEnabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on automaticFailoverEnabled is not supported.")
    set(value) { this.withAutomaticFailoverEnabled(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withNodeGroupConfiguration
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.nodeGroupConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on nodeGroupConfiguration is not supported.")
    set(value) { this.withNodeGroupConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withNumCacheClusters
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.numCacheClusters: Number
    get() = throw NoSuchFieldException("Get on numCacheClusters is not supported.")
    set(value) { this.withNumCacheClusters(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withNumNodeGroups
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.numNodeGroups: Number
    get() = throw NoSuchFieldException("Get on numNodeGroups is not supported.")
    set(value) { this.withNumNodeGroups(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withPrimaryClusterId
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.primaryClusterId: String
    get() = throw NoSuchFieldException("Get on primaryClusterId is not supported.")
    set(value) { this.withPrimaryClusterId(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withReplicasPerNodeGroup
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.replicasPerNodeGroup: Number
    get() = throw NoSuchFieldException("Get on replicasPerNodeGroup is not supported.")
    set(value) { this.withReplicasPerNodeGroup(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withReplicationGroupId
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.replicationGroupId: String
    get() = throw NoSuchFieldException("Get on replicationGroupId is not supported.")
    set(value) { this.withReplicationGroupId(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withSnapshottingClusterId
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.snapshottingClusterId: String
    get() = throw NoSuchFieldException("Get on snapshottingClusterId is not supported.")
    set(value) { this.withSnapshottingClusterId(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.withTransitEncryptionEnabled
 */
var software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder.transitEncryptionEnabled: Boolean
    get() = throw NoSuchFieldException("Get on transitEncryptionEnabled is not supported.")
    set(value) { this.withTransitEncryptionEnabled(value) }


/**
 * @see software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps.Builder
 */
fun cfnSecurityGroupProps(init: software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps {
    val builder = software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps.Builder.withDescription
 */
var software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps.Builder
 */
fun cfnSubnetGroupProps(init: software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps {
    val builder = software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps.Builder.withCacheSubnetGroupName
 */
var software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps.Builder.cacheSubnetGroupName: String
    get() = throw NoSuchFieldException("Get on cacheSubnetGroupName is not supported.")
    set(value) { this.withCacheSubnetGroupName(value) }

/**
 * @see software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps.Builder.withDescription
 */
var software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }
