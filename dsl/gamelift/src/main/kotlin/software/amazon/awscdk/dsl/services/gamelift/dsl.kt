package software.amazon.awscdk.dsl.services.gamelift
/**
 * @see software.amazon.awscdk.services.gamelift.CfnBuild
 */
fun software.amazon.awscdk.Construct.cfnBuild(id: String,
                     props: software.amazon.awscdk.services.gamelift.CfnBuildProps? = null,
                     init: (software.amazon.awscdk.services.gamelift.CfnBuild.() -> Unit)? = null)
        : software.amazon.awscdk.services.gamelift.CfnBuild {

    val obj = software.amazon.awscdk.services.gamelift.CfnBuild(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.gamelift.CfnAlias
 */
fun software.amazon.awscdk.Construct.cfnAlias(id: String,
                     props: software.amazon.awscdk.services.gamelift.CfnAliasProps? = null,
                     init: (software.amazon.awscdk.services.gamelift.CfnAlias.() -> Unit)? = null)
        : software.amazon.awscdk.services.gamelift.CfnAlias {

    val obj = software.amazon.awscdk.services.gamelift.CfnAlias(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.gamelift.CfnFleet
 */
fun software.amazon.awscdk.Construct.cfnFleet(id: String,
                     props: software.amazon.awscdk.services.gamelift.CfnFleetProps? = null,
                     init: (software.amazon.awscdk.services.gamelift.CfnFleet.() -> Unit)? = null)
        : software.amazon.awscdk.services.gamelift.CfnFleet {

    val obj = software.amazon.awscdk.services.gamelift.CfnFleet(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.gamelift.CfnBuild
 */
fun software.amazon.awscdk.Construct.cfnBuild(id: String,
                     init: (software.amazon.awscdk.services.gamelift.CfnBuild.() -> Unit)? = null)
        : software.amazon.awscdk.services.gamelift.CfnBuild {

    val obj = software.amazon.awscdk.services.gamelift.CfnBuild(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.gamelift.CfnBuild.S3LocationProperty.Builder
 */
fun s3LocationProperty(init: software.amazon.awscdk.services.gamelift.CfnBuild.S3LocationProperty.Builder.() -> Unit): software.amazon.awscdk.services.gamelift.CfnBuild.S3LocationProperty {
    val builder = software.amazon.awscdk.services.gamelift.CfnBuild.S3LocationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.gamelift.CfnBuild.S3LocationProperty.Builder.withKey
 */
var software.amazon.awscdk.services.gamelift.CfnBuild.S3LocationProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnBuild.S3LocationProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.gamelift.CfnBuild.S3LocationProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnBuild.S3LocationProperty.Builder.withBucket
 */
var software.amazon.awscdk.services.gamelift.CfnBuild.S3LocationProperty.Builder.bucket: String
    get() = throw NoSuchFieldException("Get on bucket is not supported.")
    set(value) { this.withBucket(value) }


/**
 * @see software.amazon.awscdk.services.gamelift.CfnAliasProps.Builder
 */
fun cfnAliasProps(init: software.amazon.awscdk.services.gamelift.CfnAliasProps.Builder.() -> Unit): software.amazon.awscdk.services.gamelift.CfnAliasProps {
    val builder = software.amazon.awscdk.services.gamelift.CfnAliasProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.gamelift.CfnAliasProps.Builder.withName
 */
var software.amazon.awscdk.services.gamelift.CfnAliasProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnAliasProps.Builder.withDescription
 */
var software.amazon.awscdk.services.gamelift.CfnAliasProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnAliasProps.Builder.withRoutingStrategy
 */
var software.amazon.awscdk.services.gamelift.CfnAliasProps.Builder.routingStrategy: software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty
    get() = throw NoSuchFieldException("Get on routingStrategy is not supported.")
    set(value) { this.withRoutingStrategy(value) }


/**
 * @see software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty.Builder
 */
fun routingStrategyProperty(init: software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty.Builder.() -> Unit): software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty {
    val builder = software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty.Builder.withMessage
 */
var software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty.Builder.message: String
    get() = throw NoSuchFieldException("Get on message is not supported.")
    set(value) { this.withMessage(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty.Builder.withType
 */
var software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty.Builder.withFleetId
 */
var software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty.Builder.fleetId: String
    get() = throw NoSuchFieldException("Get on fleetId is not supported.")
    set(value) { this.withFleetId(value) }


/**
 * @see software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty.Builder
 */
fun ipPermissionProperty(init: software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty.Builder.() -> Unit): software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty {
    val builder = software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty.Builder.withProtocol
 */
var software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty.Builder.protocol: String
    get() = throw NoSuchFieldException("Get on protocol is not supported.")
    set(value) { this.withProtocol(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty.Builder.withToPort
 */
var software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty.Builder.toPort: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on toPort is not supported.")
    set(value) { this.withToPort(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty.Builder.withFromPort
 */
var software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty.Builder.fromPort: Number
    get() = throw NoSuchFieldException("Get on fromPort is not supported.")
    set(value) { this.withFromPort(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty.Builder.withIpRange
 */
var software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty.Builder.ipRange: String
    get() = throw NoSuchFieldException("Get on ipRange is not supported.")
    set(value) { this.withIpRange(value) }


/**
 * @see software.amazon.awscdk.services.gamelift.CfnBuildProps.Builder
 */
fun cfnBuildProps(init: software.amazon.awscdk.services.gamelift.CfnBuildProps.Builder.() -> Unit): software.amazon.awscdk.services.gamelift.CfnBuildProps {
    val builder = software.amazon.awscdk.services.gamelift.CfnBuildProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.gamelift.CfnBuildProps.Builder.withStorageLocation
 */
var software.amazon.awscdk.services.gamelift.CfnBuildProps.Builder.storageLocation: software.amazon.awscdk.services.gamelift.CfnBuild.S3LocationProperty
    get() = throw NoSuchFieldException("Get on storageLocation is not supported.")
    set(value) { this.withStorageLocation(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnBuildProps.Builder.withName
 */
var software.amazon.awscdk.services.gamelift.CfnBuildProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnBuildProps.Builder.withVersion
 */
var software.amazon.awscdk.services.gamelift.CfnBuildProps.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder
 */
fun cfnFleetProps(init: software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.() -> Unit): software.amazon.awscdk.services.gamelift.CfnFleetProps {
    val builder = software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.withMaxSize
 */
var software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.maxSize: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on maxSize is not supported.")
    set(value) { this.withMaxSize(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.withMinSize
 */
var software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.minSize: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on minSize is not supported.")
    set(value) { this.withMinSize(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.withName
 */
var software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.withDescription
 */
var software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.withBuildId
 */
var software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.buildId: String
    get() = throw NoSuchFieldException("Get on buildId is not supported.")
    set(value) { this.withBuildId(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.withDesiredEc2Instances
 */
var software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.desiredEc2Instances: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on desiredEc2Instances is not supported.")
    set(value) { this.withDesiredEc2Instances(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.withEc2InstanceType
 */
var software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.ec2InstanceType: String
    get() = throw NoSuchFieldException("Get on ec2InstanceType is not supported.")
    set(value) { this.withEc2InstanceType(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.withServerLaunchPath
 */
var software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.serverLaunchPath: String
    get() = throw NoSuchFieldException("Get on serverLaunchPath is not supported.")
    set(value) { this.withServerLaunchPath(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.withEc2InboundPermissions
 */
var software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.ec2InboundPermissions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ec2InboundPermissions is not supported.")
    set(value) { this.withEc2InboundPermissions(value) }

/**
 * @see software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.withServerLaunchParameters
 */
var software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder.serverLaunchParameters: String
    get() = throw NoSuchFieldException("Get on serverLaunchParameters is not supported.")
    set(value) { this.withServerLaunchParameters(value) }
