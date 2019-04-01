package software.amazon.awscdk.dsl.services.redshift
/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress
 */
fun software.amazon.awscdk.Construct.cfnClusterSecurityGroupIngress(id: String,
                     props: software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps? = null,
                     init: (software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress.() -> Unit)? = null)
        : software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress {

    val obj = software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup
 */
fun software.amazon.awscdk.Construct.cfnClusterSubnetGroup(id: String,
                     props: software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps? = null,
                     init: (software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup {

    val obj = software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.redshift.CfnCluster
 */
fun software.amazon.awscdk.Construct.cfnCluster(id: String,
                     props: software.amazon.awscdk.services.redshift.CfnClusterProps? = null,
                     init: (software.amazon.awscdk.services.redshift.CfnCluster.() -> Unit)? = null)
        : software.amazon.awscdk.services.redshift.CfnCluster {

    val obj = software.amazon.awscdk.services.redshift.CfnCluster(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterParameterGroup
 */
fun software.amazon.awscdk.Construct.cfnClusterParameterGroup(id: String,
                     props: software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps? = null,
                     init: (software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.redshift.CfnClusterParameterGroup {

    val obj = software.amazon.awscdk.services.redshift.CfnClusterParameterGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup
 */
fun software.amazon.awscdk.Construct.cfnClusterSecurityGroup(id: String,
                     props: software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps? = null,
                     init: (software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup {

    val obj = software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps.Builder
 */
fun cfnClusterSecurityGroupIngressProps(init: software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps.Builder.() -> Unit): software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps {
    val builder = software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps.Builder.withEc2SecurityGroupName
 */
var software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps.Builder.ec2SecurityGroupName: String
    get() = throw NoSuchFieldException("Get on ec2SecurityGroupName is not supported.")
    set(value) { this.withEc2SecurityGroupName(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps.Builder.withEc2SecurityGroupOwnerId
 */
var software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps.Builder.ec2SecurityGroupOwnerId: String
    get() = throw NoSuchFieldException("Get on ec2SecurityGroupOwnerId is not supported.")
    set(value) { this.withEc2SecurityGroupOwnerId(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps.Builder.withCidrip
 */
var software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps.Builder.cidrip: String
    get() = throw NoSuchFieldException("Get on cidrip is not supported.")
    set(value) { this.withCidrip(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps.Builder.withClusterSecurityGroupName
 */
var software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps.Builder.clusterSecurityGroupName: String
    get() = throw NoSuchFieldException("Get on clusterSecurityGroupName is not supported.")
    set(value) { this.withClusterSecurityGroupName(value) }


/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps.Builder
 */
fun cfnClusterParameterGroupProps(init: software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps {
    val builder = software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps.Builder.withParameters
 */
var software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps.Builder.parameters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on parameters is not supported.")
    set(value) { this.withParameters(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps.Builder.withDescription
 */
var software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps.Builder.withParameterGroupFamily
 */
var software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps.Builder.parameterGroupFamily: String
    get() = throw NoSuchFieldException("Get on parameterGroupFamily is not supported.")
    set(value) { this.withParameterGroupFamily(value) }


/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder
 */
fun cfnClusterProps(init: software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.() -> Unit): software.amazon.awscdk.services.redshift.CfnClusterProps {
    val builder = software.amazon.awscdk.services.redshift.CfnClusterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withAvailabilityZone
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.availabilityZone: String
    get() = throw NoSuchFieldException("Get on availabilityZone is not supported.")
    set(value) { this.withAvailabilityZone(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withPreferredMaintenanceWindow
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.preferredMaintenanceWindow: String
    get() = throw NoSuchFieldException("Get on preferredMaintenanceWindow is not supported.")
    set(value) { this.withPreferredMaintenanceWindow(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withKmsKeyId
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.kmsKeyId: String
    get() = throw NoSuchFieldException("Get on kmsKeyId is not supported.")
    set(value) { this.withKmsKeyId(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withMasterUsername
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.masterUsername: String
    get() = throw NoSuchFieldException("Get on masterUsername is not supported.")
    set(value) { this.withMasterUsername(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withMasterUserPassword
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.masterUserPassword: String
    get() = throw NoSuchFieldException("Get on masterUserPassword is not supported.")
    set(value) { this.withMasterUserPassword(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withSnapshotIdentifier
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.snapshotIdentifier: String
    get() = throw NoSuchFieldException("Get on snapshotIdentifier is not supported.")
    set(value) { this.withSnapshotIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withDbName
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.dbName: String
    get() = throw NoSuchFieldException("Get on dbName is not supported.")
    set(value) { this.withDbName(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withPubliclyAccessible
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.publiclyAccessible: Boolean
    get() = throw NoSuchFieldException("Get on publiclyAccessible is not supported.")
    set(value) { this.withPubliclyAccessible(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withElasticIp
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.elasticIp: String
    get() = throw NoSuchFieldException("Get on elasticIp is not supported.")
    set(value) { this.withElasticIp(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withAllowVersionUpgrade
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.allowVersionUpgrade: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on allowVersionUpgrade is not supported.")
    set(value) { this.withAllowVersionUpgrade(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withAutomatedSnapshotRetentionPeriod
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.automatedSnapshotRetentionPeriod: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on automatedSnapshotRetentionPeriod is not supported.")
    set(value) { this.withAutomatedSnapshotRetentionPeriod(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withHsmClientCertificateIdentifier
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.hsmClientCertificateIdentifier: String
    get() = throw NoSuchFieldException("Get on hsmClientCertificateIdentifier is not supported.")
    set(value) { this.withHsmClientCertificateIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withClusterSubnetGroupName
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.clusterSubnetGroupName: String
    get() = throw NoSuchFieldException("Get on clusterSubnetGroupName is not supported.")
    set(value) { this.withClusterSubnetGroupName(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withClusterVersion
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.clusterVersion: String
    get() = throw NoSuchFieldException("Get on clusterVersion is not supported.")
    set(value) { this.withClusterVersion(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withClusterType
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.clusterType: String
    get() = throw NoSuchFieldException("Get on clusterType is not supported.")
    set(value) { this.withClusterType(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withNodeType
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.nodeType: String
    get() = throw NoSuchFieldException("Get on nodeType is not supported.")
    set(value) { this.withNodeType(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withClusterParameterGroupName
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.clusterParameterGroupName: String
    get() = throw NoSuchFieldException("Get on clusterParameterGroupName is not supported.")
    set(value) { this.withClusterParameterGroupName(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withLoggingProperties
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.loggingProperties: software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty
    get() = throw NoSuchFieldException("Get on loggingProperties is not supported.")
    set(value) { this.withLoggingProperties(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withHsmConfigurationIdentifier
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.hsmConfigurationIdentifier: String
    get() = throw NoSuchFieldException("Get on hsmConfigurationIdentifier is not supported.")
    set(value) { this.withHsmConfigurationIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withNumberOfNodes
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.numberOfNodes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on numberOfNodes is not supported.")
    set(value) { this.withNumberOfNodes(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withOwnerAccount
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.ownerAccount: String
    get() = throw NoSuchFieldException("Get on ownerAccount is not supported.")
    set(value) { this.withOwnerAccount(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withSnapshotClusterIdentifier
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.snapshotClusterIdentifier: String
    get() = throw NoSuchFieldException("Get on snapshotClusterIdentifier is not supported.")
    set(value) { this.withSnapshotClusterIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withPort
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.port: Number
    get() = throw NoSuchFieldException("Get on port is not supported.")
    set(value) { this.withPort(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withEncrypted
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.encrypted: Boolean
    get() = throw NoSuchFieldException("Get on encrypted is not supported.")
    set(value) { this.withEncrypted(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.withClusterIdentifier
 */
var software.amazon.awscdk.services.redshift.CfnClusterProps.Builder.clusterIdentifier: String
    get() = throw NoSuchFieldException("Get on clusterIdentifier is not supported.")
    set(value) { this.withClusterIdentifier(value) }


/**
 * @see software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty.Builder
 */
fun loggingPropertiesProperty(init: software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty.Builder.() -> Unit): software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty {
    val builder = software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty.Builder.withBucketName
 */
var software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty.Builder.bucketName: String
    get() = throw NoSuchFieldException("Get on bucketName is not supported.")
    set(value) { this.withBucketName(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty.Builder.withS3KeyPrefix
 */
var software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty.Builder.s3KeyPrefix: String
    get() = throw NoSuchFieldException("Get on s3KeyPrefix is not supported.")
    set(value) { this.withS3KeyPrefix(value) }


/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps.Builder
 */
fun cfnClusterSubnetGroupProps(init: software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps {
    val builder = software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps.Builder.withDescription
 */
var software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps.Builder
 */
fun cfnClusterSecurityGroupProps(init: software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps {
    val builder = software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps.Builder.withDescription
 */
var software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.ParameterProperty.Builder
 */
fun parameterProperty(init: software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.ParameterProperty.Builder.() -> Unit): software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.ParameterProperty {
    val builder = software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.ParameterProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.ParameterProperty.Builder.withParameterName
 */
var software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.ParameterProperty.Builder.parameterName: String
    get() = throw NoSuchFieldException("Get on parameterName is not supported.")
    set(value) { this.withParameterName(value) }

/**
 * @see software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.ParameterProperty.Builder.withParameterValue
 */
var software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.ParameterProperty.Builder.parameterValue: String
    get() = throw NoSuchFieldException("Get on parameterValue is not supported.")
    set(value) { this.withParameterValue(value) }
