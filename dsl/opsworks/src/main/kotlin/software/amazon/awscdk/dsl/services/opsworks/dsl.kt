package software.amazon.awscdk.dsl.services.opsworks
/**
 * @see software.amazon.awscdk.services.opsworks.CfnVolume
 */
fun software.amazon.awscdk.Construct.cfnVolume(id: String,
                     props: software.amazon.awscdk.services.opsworks.CfnVolumeProps? = null,
                     init: (software.amazon.awscdk.services.opsworks.CfnVolume.() -> Unit)? = null)
        : software.amazon.awscdk.services.opsworks.CfnVolume {

    val obj = software.amazon.awscdk.services.opsworks.CfnVolume(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack
 */
fun software.amazon.awscdk.Construct.cfnStack(id: String,
                     props: software.amazon.awscdk.services.opsworks.CfnStackProps? = null,
                     init: (software.amazon.awscdk.services.opsworks.CfnStack.() -> Unit)? = null)
        : software.amazon.awscdk.services.opsworks.CfnStack {

    val obj = software.amazon.awscdk.services.opsworks.CfnStack(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp
 */
fun software.amazon.awscdk.Construct.cfnApp(id: String,
                     props: software.amazon.awscdk.services.opsworks.CfnAppProps? = null,
                     init: (software.amazon.awscdk.services.opsworks.CfnApp.() -> Unit)? = null)
        : software.amazon.awscdk.services.opsworks.CfnApp {

    val obj = software.amazon.awscdk.services.opsworks.CfnApp(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment
 */
fun software.amazon.awscdk.Construct.cfnElasticLoadBalancerAttachment(id: String,
                     props: software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps? = null,
                     init: (software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment.() -> Unit)? = null)
        : software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment {

    val obj = software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer
 */
fun software.amazon.awscdk.Construct.cfnLayer(id: String,
                     props: software.amazon.awscdk.services.opsworks.CfnLayerProps? = null,
                     init: (software.amazon.awscdk.services.opsworks.CfnLayer.() -> Unit)? = null)
        : software.amazon.awscdk.services.opsworks.CfnLayer {

    val obj = software.amazon.awscdk.services.opsworks.CfnLayer(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance
 */
fun software.amazon.awscdk.Construct.cfnInstance(id: String,
                     props: software.amazon.awscdk.services.opsworks.CfnInstanceProps? = null,
                     init: (software.amazon.awscdk.services.opsworks.CfnInstance.() -> Unit)? = null)
        : software.amazon.awscdk.services.opsworks.CfnInstance {

    val obj = software.amazon.awscdk.services.opsworks.CfnInstance(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.opsworks.CfnUserProfile
 */
fun software.amazon.awscdk.Construct.cfnUserProfile(id: String,
                     props: software.amazon.awscdk.services.opsworks.CfnUserProfileProps? = null,
                     init: (software.amazon.awscdk.services.opsworks.CfnUserProfile.() -> Unit)? = null)
        : software.amazon.awscdk.services.opsworks.CfnUserProfile {

    val obj = software.amazon.awscdk.services.opsworks.CfnUserProfile(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.opsworks.CfnAppProps.Builder
 */
fun cfnAppProps(init: software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnAppProps {
    val builder = software.amazon.awscdk.services.opsworks.CfnAppProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.withEnvironment
 */
var software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.environment: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on environment is not supported.")
    set(value) { this.withEnvironment(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.withStackId
 */
var software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.stackId: String
    get() = throw NoSuchFieldException("Get on stackId is not supported.")
    set(value) { this.withStackId(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.withType
 */
var software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.withName
 */
var software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.withDescription
 */
var software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.withAppSource
 */
var software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.appSource: software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty
    get() = throw NoSuchFieldException("Get on appSource is not supported.")
    set(value) { this.withAppSource(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.withDataSources
 */
var software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.dataSources: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on dataSources is not supported.")
    set(value) { this.withDataSources(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.withEnableSsl
 */
var software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.enableSsl: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enableSsl is not supported.")
    set(value) { this.withEnableSsl(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.withShortname
 */
var software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.shortname: String
    get() = throw NoSuchFieldException("Get on shortname is not supported.")
    set(value) { this.withShortname(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.withSslConfiguration
 */
var software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.sslConfiguration: software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty
    get() = throw NoSuchFieldException("Get on sslConfiguration is not supported.")
    set(value) { this.withSslConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.withAttributes
 */
var software.amazon.awscdk.services.opsworks.CfnAppProps.Builder.attributes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on attributes is not supported.")
    set(value) { this.withAttributes(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty.Builder
 */
fun elasticIpProperty(init: software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty {
    val builder = software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty.Builder.withIp
 */
var software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty.Builder.ip: String
    get() = throw NoSuchFieldException("Get on ip is not supported.")
    set(value) { this.withIp(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty.Builder.withName
 */
var software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.Builder
 */
fun sourceProperty(init: software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty {
    val builder = software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.Builder.withPassword
 */
var software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.Builder.password: String
    get() = throw NoSuchFieldException("Get on password is not supported.")
    set(value) { this.withPassword(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.Builder.withUsername
 */
var software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.Builder.username: String
    get() = throw NoSuchFieldException("Get on username is not supported.")
    set(value) { this.withUsername(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.Builder.withSshKey
 */
var software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.Builder.sshKey: String
    get() = throw NoSuchFieldException("Get on sshKey is not supported.")
    set(value) { this.withSshKey(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.Builder.withType
 */
var software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.Builder.withUrl
 */
var software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.Builder.url: String
    get() = throw NoSuchFieldException("Get on url is not supported.")
    set(value) { this.withUrl(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.Builder.withRevision
 */
var software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.Builder.revision: String
    get() = throw NoSuchFieldException("Get on revision is not supported.")
    set(value) { this.withRevision(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder
 */
fun timeBasedAutoScalingProperty(init: software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty {
    val builder = software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder.withThursday
 */
var software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder.thursday: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on thursday is not supported.")
    set(value) { this.withThursday(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder.withSunday
 */
var software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder.sunday: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on sunday is not supported.")
    set(value) { this.withSunday(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder.withSaturday
 */
var software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder.saturday: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on saturday is not supported.")
    set(value) { this.withSaturday(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder.withFriday
 */
var software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder.friday: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on friday is not supported.")
    set(value) { this.withFriday(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder.withTuesday
 */
var software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder.tuesday: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on tuesday is not supported.")
    set(value) { this.withTuesday(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder.withWednesday
 */
var software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder.wednesday: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on wednesday is not supported.")
    set(value) { this.withWednesday(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder.withMonday
 */
var software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder.monday: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on monday is not supported.")
    set(value) { this.withMonday(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty.Builder
 */
fun dataSourceProperty(init: software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty {
    val builder = software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty.Builder.withDatabaseName
 */
var software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty.Builder.databaseName: String
    get() = throw NoSuchFieldException("Get on databaseName is not supported.")
    set(value) { this.withDatabaseName(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty.Builder.withType
 */
var software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty.Builder.withArn
 */
var software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty.Builder.arn: String
    get() = throw NoSuchFieldException("Get on arn is not supported.")
    set(value) { this.withArn(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty.Builder
 */
fun lifecycleEventConfigurationProperty(init: software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty {
    val builder = software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty.Builder.withShutdownEventConfiguration
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty.Builder.shutdownEventConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on shutdownEventConfiguration is not supported.")
    set(value) { this.withShutdownEventConfiguration(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty.Builder
 */
fun rdsDbInstanceProperty(init: software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty {
    val builder = software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty.Builder.withRdsDbInstanceArn
 */
var software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty.Builder.rdsDbInstanceArn: String
    get() = throw NoSuchFieldException("Get on rdsDbInstanceArn is not supported.")
    set(value) { this.withRdsDbInstanceArn(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty.Builder.withDbPassword
 */
var software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty.Builder.dbPassword: String
    get() = throw NoSuchFieldException("Get on dbPassword is not supported.")
    set(value) { this.withDbPassword(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty.Builder.withDbUser
 */
var software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty.Builder.dbUser: String
    get() = throw NoSuchFieldException("Get on dbUser is not supported.")
    set(value) { this.withDbUser(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder
 */
fun cfnLayerProps(init: software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnLayerProps {
    val builder = software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.withStackId
 */
var software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.stackId: String
    get() = throw NoSuchFieldException("Get on stackId is not supported.")
    set(value) { this.withStackId(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.withInstallUpdatesOnBoot
 */
var software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.installUpdatesOnBoot: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on installUpdatesOnBoot is not supported.")
    set(value) { this.withInstallUpdatesOnBoot(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.withType
 */
var software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.withName
 */
var software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.withShortname
 */
var software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.shortname: String
    get() = throw NoSuchFieldException("Get on shortname is not supported.")
    set(value) { this.withShortname(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.withAttributes
 */
var software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.attributes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on attributes is not supported.")
    set(value) { this.withAttributes(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.withAutoAssignElasticIps
 */
var software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.autoAssignElasticIps: Boolean
    get() = throw NoSuchFieldException("Get on autoAssignElasticIps is not supported.")
    set(value) { this.withAutoAssignElasticIps(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.withAutoAssignPublicIps
 */
var software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.autoAssignPublicIps: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on autoAssignPublicIps is not supported.")
    set(value) { this.withAutoAssignPublicIps(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.withEnableAutoHealing
 */
var software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.enableAutoHealing: Boolean
    get() = throw NoSuchFieldException("Get on enableAutoHealing is not supported.")
    set(value) { this.withEnableAutoHealing(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.withCustomInstanceProfileArn
 */
var software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.customInstanceProfileArn: String
    get() = throw NoSuchFieldException("Get on customInstanceProfileArn is not supported.")
    set(value) { this.withCustomInstanceProfileArn(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.withCustomJson
 */
var software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.customJson: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on customJson is not supported.")
    set(value) { this.withCustomJson(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.withCustomRecipes
 */
var software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.customRecipes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on customRecipes is not supported.")
    set(value) { this.withCustomRecipes(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.withLifecycleEventConfiguration
 */
var software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.lifecycleEventConfiguration: software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty
    get() = throw NoSuchFieldException("Get on lifecycleEventConfiguration is not supported.")
    set(value) { this.withLifecycleEventConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.withLoadBasedAutoScaling
 */
var software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.loadBasedAutoScaling: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on loadBasedAutoScaling is not supported.")
    set(value) { this.withLoadBasedAutoScaling(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.withUseEbsOptimizedInstances
 */
var software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.useEbsOptimizedInstances: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on useEbsOptimizedInstances is not supported.")
    set(value) { this.withUseEbsOptimizedInstances(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.withVolumeConfigurations
 */
var software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder.volumeConfigurations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on volumeConfigurations is not supported.")
    set(value) { this.withVolumeConfigurations(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnVolumeProps.Builder
 */
fun cfnVolumeProps(init: software.amazon.awscdk.services.opsworks.CfnVolumeProps.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnVolumeProps {
    val builder = software.amazon.awscdk.services.opsworks.CfnVolumeProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnVolumeProps.Builder.withMountPoint
 */
var software.amazon.awscdk.services.opsworks.CfnVolumeProps.Builder.mountPoint: String
    get() = throw NoSuchFieldException("Get on mountPoint is not supported.")
    set(value) { this.withMountPoint(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnVolumeProps.Builder.withStackId
 */
var software.amazon.awscdk.services.opsworks.CfnVolumeProps.Builder.stackId: String
    get() = throw NoSuchFieldException("Get on stackId is not supported.")
    set(value) { this.withStackId(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnVolumeProps.Builder.withName
 */
var software.amazon.awscdk.services.opsworks.CfnVolumeProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnVolumeProps.Builder.withEc2VolumeId
 */
var software.amazon.awscdk.services.opsworks.CfnVolumeProps.Builder.ec2VolumeId: String
    get() = throw NoSuchFieldException("Get on ec2VolumeId is not supported.")
    set(value) { this.withEc2VolumeId(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty.Builder
 */
fun loadBasedAutoScalingProperty(init: software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty {
    val builder = software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty.Builder.withDownScaling
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty.Builder.downScaling: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on downScaling is not supported.")
    set(value) { this.withDownScaling(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty.Builder.withEnable
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty.Builder.enable: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enable is not supported.")
    set(value) { this.withEnable(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty.Builder.withUpScaling
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty.Builder.upScaling: software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty
    get() = throw NoSuchFieldException("Get on upScaling is not supported.")
    set(value) { this.withUpScaling(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps.Builder
 */
fun cfnElasticLoadBalancerAttachmentProps(init: software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps {
    val builder = software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps.Builder.withElasticLoadBalancerName
 */
var software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps.Builder.elasticLoadBalancerName: String
    get() = throw NoSuchFieldException("Get on elasticLoadBalancerName is not supported.")
    set(value) { this.withElasticLoadBalancerName(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps.Builder.withLayerId
 */
var software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps.Builder.layerId: String
    get() = throw NoSuchFieldException("Get on layerId is not supported.")
    set(value) { this.withLayerId(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder
 */
fun cfnStackProps(init: software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnStackProps {
    val builder = software.amazon.awscdk.services.opsworks.CfnStackProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withServiceRoleArn
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.serviceRoleArn: String
    get() = throw NoSuchFieldException("Get on serviceRoleArn is not supported.")
    set(value) { this.withServiceRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withVpcId
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.vpcId: String
    get() = throw NoSuchFieldException("Get on vpcId is not supported.")
    set(value) { this.withVpcId(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withAgentVersion
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.agentVersion: String
    get() = throw NoSuchFieldException("Get on agentVersion is not supported.")
    set(value) { this.withAgentVersion(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withElasticIps
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.elasticIps: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on elasticIps is not supported.")
    set(value) { this.withElasticIps(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withName
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withAttributes
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.attributes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on attributes is not supported.")
    set(value) { this.withAttributes(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withDefaultInstanceProfileArn
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.defaultInstanceProfileArn: String
    get() = throw NoSuchFieldException("Get on defaultInstanceProfileArn is not supported.")
    set(value) { this.withDefaultInstanceProfileArn(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withChefConfiguration
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.chefConfiguration: software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty
    get() = throw NoSuchFieldException("Get on chefConfiguration is not supported.")
    set(value) { this.withChefConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withClonePermissions
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.clonePermissions: Boolean
    get() = throw NoSuchFieldException("Get on clonePermissions is not supported.")
    set(value) { this.withClonePermissions(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withConfigurationManager
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.configurationManager: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on configurationManager is not supported.")
    set(value) { this.withConfigurationManager(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withCustomCookbooksSource
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.customCookbooksSource: software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty
    get() = throw NoSuchFieldException("Get on customCookbooksSource is not supported.")
    set(value) { this.withCustomCookbooksSource(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withDefaultAvailabilityZone
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.defaultAvailabilityZone: String
    get() = throw NoSuchFieldException("Get on defaultAvailabilityZone is not supported.")
    set(value) { this.withDefaultAvailabilityZone(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withDefaultOs
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.defaultOs: String
    get() = throw NoSuchFieldException("Get on defaultOs is not supported.")
    set(value) { this.withDefaultOs(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withDefaultRootDeviceType
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.defaultRootDeviceType: String
    get() = throw NoSuchFieldException("Get on defaultRootDeviceType is not supported.")
    set(value) { this.withDefaultRootDeviceType(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withDefaultSshKeyName
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.defaultSshKeyName: String
    get() = throw NoSuchFieldException("Get on defaultSshKeyName is not supported.")
    set(value) { this.withDefaultSshKeyName(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withDefaultSubnetId
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.defaultSubnetId: String
    get() = throw NoSuchFieldException("Get on defaultSubnetId is not supported.")
    set(value) { this.withDefaultSubnetId(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withEcsClusterArn
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.ecsClusterArn: String
    get() = throw NoSuchFieldException("Get on ecsClusterArn is not supported.")
    set(value) { this.withEcsClusterArn(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withHostnameTheme
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.hostnameTheme: String
    get() = throw NoSuchFieldException("Get on hostnameTheme is not supported.")
    set(value) { this.withHostnameTheme(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withRdsDbInstances
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.rdsDbInstances: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on rdsDbInstances is not supported.")
    set(value) { this.withRdsDbInstances(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withSourceStackId
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.sourceStackId: String
    get() = throw NoSuchFieldException("Get on sourceStackId is not supported.")
    set(value) { this.withSourceStackId(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withUseCustomCookbooks
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.useCustomCookbooks: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on useCustomCookbooks is not supported.")
    set(value) { this.withUseCustomCookbooks(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withUseOpsworksSecurityGroups
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.useOpsworksSecurityGroups: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on useOpsworksSecurityGroups is not supported.")
    set(value) { this.withUseOpsworksSecurityGroups(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.withCustomJson
 */
var software.amazon.awscdk.services.opsworks.CfnStackProps.Builder.customJson: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on customJson is not supported.")
    set(value) { this.withCustomJson(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty.Builder
 */
fun blockDeviceMappingProperty(init: software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty {
    val builder = software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty.Builder.withVirtualName
 */
var software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty.Builder.virtualName: String
    get() = throw NoSuchFieldException("Get on virtualName is not supported.")
    set(value) { this.withVirtualName(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty.Builder.withDeviceName
 */
var software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty.Builder.deviceName: String
    get() = throw NoSuchFieldException("Get on deviceName is not supported.")
    set(value) { this.withDeviceName(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty.Builder.withEbs
 */
var software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty.Builder.ebs: software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty
    get() = throw NoSuchFieldException("Get on ebs is not supported.")
    set(value) { this.withEbs(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty.Builder.withNoDevice
 */
var software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty.Builder.noDevice: String
    get() = throw NoSuchFieldException("Get on noDevice is not supported.")
    set(value) { this.withNoDevice(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty.Builder
 */
fun environmentVariableProperty(init: software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty {
    val builder = software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty.Builder.withKey
 */
var software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty.Builder.withValue
 */
var software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty.Builder.withSecure
 */
var software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty.Builder.secure: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on secure is not supported.")
    set(value) { this.withSecure(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.Builder
 */
fun sourceProperty(init: software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty {
    val builder = software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.Builder.withPassword
 */
var software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.Builder.password: String
    get() = throw NoSuchFieldException("Get on password is not supported.")
    set(value) { this.withPassword(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.Builder.withUsername
 */
var software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.Builder.username: String
    get() = throw NoSuchFieldException("Get on username is not supported.")
    set(value) { this.withUsername(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.Builder.withSshKey
 */
var software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.Builder.sshKey: String
    get() = throw NoSuchFieldException("Get on sshKey is not supported.")
    set(value) { this.withSshKey(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.Builder.withType
 */
var software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.Builder.withUrl
 */
var software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.Builder.url: String
    get() = throw NoSuchFieldException("Get on url is not supported.")
    set(value) { this.withUrl(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.Builder.withRevision
 */
var software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.Builder.revision: String
    get() = throw NoSuchFieldException("Get on revision is not supported.")
    set(value) { this.withRevision(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty.Builder
 */
fun sslConfigurationProperty(init: software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty {
    val builder = software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty.Builder.withCertificate
 */
var software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty.Builder.certificate: String
    get() = throw NoSuchFieldException("Get on certificate is not supported.")
    set(value) { this.withCertificate(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty.Builder.withChain
 */
var software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty.Builder.chain: String
    get() = throw NoSuchFieldException("Get on chain is not supported.")
    set(value) { this.withChain(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty.Builder.withPrivateKey
 */
var software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty.Builder.privateKey: String
    get() = throw NoSuchFieldException("Get on privateKey is not supported.")
    set(value) { this.withPrivateKey(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty.Builder
 */
fun ebsBlockDeviceProperty(init: software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty {
    val builder = software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty.Builder.withVolumeType
 */
var software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty.Builder.volumeType: String
    get() = throw NoSuchFieldException("Get on volumeType is not supported.")
    set(value) { this.withVolumeType(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty.Builder.withIops
 */
var software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty.Builder.iops: Number
    get() = throw NoSuchFieldException("Get on iops is not supported.")
    set(value) { this.withIops(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty.Builder.withDeleteOnTermination
 */
var software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty.Builder.deleteOnTermination: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on deleteOnTermination is not supported.")
    set(value) { this.withDeleteOnTermination(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty.Builder.withSnapshotId
 */
var software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty.Builder.snapshotId: String
    get() = throw NoSuchFieldException("Get on snapshotId is not supported.")
    set(value) { this.withSnapshotId(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty.Builder.withVolumeSize
 */
var software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty.Builder.volumeSize: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on volumeSize is not supported.")
    set(value) { this.withVolumeSize(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty.Builder
 */
fun shutdownEventConfigurationProperty(init: software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty {
    val builder = software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty.Builder.withDelayUntilElbConnectionsDrained
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty.Builder.delayUntilElbConnectionsDrained: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on delayUntilElbConnectionsDrained is not supported.")
    set(value) { this.withDelayUntilElbConnectionsDrained(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty.Builder.withExecutionTimeout
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.ShutdownEventConfigurationProperty.Builder.executionTimeout: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on executionTimeout is not supported.")
    set(value) { this.withExecutionTimeout(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty.Builder
 */
fun chefConfigurationProperty(init: software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty {
    val builder = software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty.Builder.withBerkshelfVersion
 */
var software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty.Builder.berkshelfVersion: String
    get() = throw NoSuchFieldException("Get on berkshelfVersion is not supported.")
    set(value) { this.withBerkshelfVersion(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty.Builder.withManageBerkshelf
 */
var software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty.Builder.manageBerkshelf: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on manageBerkshelf is not supported.")
    set(value) { this.withManageBerkshelf(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.Builder
 */
fun autoScalingThresholdsProperty(init: software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty {
    val builder = software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.Builder.withInstanceCount
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.Builder.instanceCount: Number
    get() = throw NoSuchFieldException("Get on instanceCount is not supported.")
    set(value) { this.withInstanceCount(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.Builder.withCpuThreshold
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.Builder.cpuThreshold: Number
    get() = throw NoSuchFieldException("Get on cpuThreshold is not supported.")
    set(value) { this.withCpuThreshold(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.Builder.withIgnoreMetricsTime
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.Builder.ignoreMetricsTime: Number
    get() = throw NoSuchFieldException("Get on ignoreMetricsTime is not supported.")
    set(value) { this.withIgnoreMetricsTime(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.Builder.withLoadThreshold
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.Builder.loadThreshold: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on loadThreshold is not supported.")
    set(value) { this.withLoadThreshold(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.Builder.withMemoryThreshold
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.Builder.memoryThreshold: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on memoryThreshold is not supported.")
    set(value) { this.withMemoryThreshold(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.Builder.withThresholdsWaitTime
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty.Builder.thresholdsWaitTime: Number
    get() = throw NoSuchFieldException("Get on thresholdsWaitTime is not supported.")
    set(value) { this.withThresholdsWaitTime(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnUserProfileProps.Builder
 */
fun cfnUserProfileProps(init: software.amazon.awscdk.services.opsworks.CfnUserProfileProps.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnUserProfileProps {
    val builder = software.amazon.awscdk.services.opsworks.CfnUserProfileProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnUserProfileProps.Builder.withIamUserArn
 */
var software.amazon.awscdk.services.opsworks.CfnUserProfileProps.Builder.iamUserArn: String
    get() = throw NoSuchFieldException("Get on iamUserArn is not supported.")
    set(value) { this.withIamUserArn(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnUserProfileProps.Builder.withAllowSelfManagement
 */
var software.amazon.awscdk.services.opsworks.CfnUserProfileProps.Builder.allowSelfManagement: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on allowSelfManagement is not supported.")
    set(value) { this.withAllowSelfManagement(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnUserProfileProps.Builder.withSshPublicKey
 */
var software.amazon.awscdk.services.opsworks.CfnUserProfileProps.Builder.sshPublicKey: String
    get() = throw NoSuchFieldException("Get on sshPublicKey is not supported.")
    set(value) { this.withSshPublicKey(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnUserProfileProps.Builder.withSshUsername
 */
var software.amazon.awscdk.services.opsworks.CfnUserProfileProps.Builder.sshUsername: String
    get() = throw NoSuchFieldException("Get on sshUsername is not supported.")
    set(value) { this.withSshUsername(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty.Builder
 */
fun stackConfigurationManagerProperty(init: software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty {
    val builder = software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty.Builder.withName
 */
var software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty.Builder.withVersion
 */
var software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty.Builder
 */
fun recipesProperty(init: software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty {
    val builder = software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty.Builder()
    builder.init()
    return builder.build()
}


/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder
 */
fun volumeConfigurationProperty(init: software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty {
    val builder = software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder.withNumberOfDisks
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder.numberOfDisks: Number
    get() = throw NoSuchFieldException("Get on numberOfDisks is not supported.")
    set(value) { this.withNumberOfDisks(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder.withVolumeType
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder.volumeType: String
    get() = throw NoSuchFieldException("Get on volumeType is not supported.")
    set(value) { this.withVolumeType(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder.withRaidLevel
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder.raidLevel: Number
    get() = throw NoSuchFieldException("Get on raidLevel is not supported.")
    set(value) { this.withRaidLevel(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder.withMountPoint
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder.mountPoint: String
    get() = throw NoSuchFieldException("Get on mountPoint is not supported.")
    set(value) { this.withMountPoint(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder.withSize
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder.size: Number
    get() = throw NoSuchFieldException("Get on size is not supported.")
    set(value) { this.withSize(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder.withIops
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder.iops: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on iops is not supported.")
    set(value) { this.withIops(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder.withEncrypted
 */
var software.amazon.awscdk.services.opsworks.CfnLayer.VolumeConfigurationProperty.Builder.encrypted: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on encrypted is not supported.")
    set(value) { this.withEncrypted(value) }


/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder
 */
fun cfnInstanceProps(init: software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.() -> Unit): software.amazon.awscdk.services.opsworks.CfnInstanceProps {
    val builder = software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.withAvailabilityZone
 */
var software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.availabilityZone: String
    get() = throw NoSuchFieldException("Get on availabilityZone is not supported.")
    set(value) { this.withAvailabilityZone(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.withInstanceType
 */
var software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.instanceType: String
    get() = throw NoSuchFieldException("Get on instanceType is not supported.")
    set(value) { this.withInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.withSubnetId
 */
var software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.subnetId: String
    get() = throw NoSuchFieldException("Get on subnetId is not supported.")
    set(value) { this.withSubnetId(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.withOs
 */
var software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.os: String
    get() = throw NoSuchFieldException("Get on os is not supported.")
    set(value) { this.withOs(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.withStackId
 */
var software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.stackId: String
    get() = throw NoSuchFieldException("Get on stackId is not supported.")
    set(value) { this.withStackId(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.withAgentVersion
 */
var software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.agentVersion: String
    get() = throw NoSuchFieldException("Get on agentVersion is not supported.")
    set(value) { this.withAgentVersion(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.withAmiId
 */
var software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.amiId: String
    get() = throw NoSuchFieldException("Get on amiId is not supported.")
    set(value) { this.withAmiId(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.withArchitecture
 */
var software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.architecture: String
    get() = throw NoSuchFieldException("Get on architecture is not supported.")
    set(value) { this.withArchitecture(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.withAutoScalingType
 */
var software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.autoScalingType: String
    get() = throw NoSuchFieldException("Get on autoScalingType is not supported.")
    set(value) { this.withAutoScalingType(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.withBlockDeviceMappings
 */
var software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.blockDeviceMappings: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on blockDeviceMappings is not supported.")
    set(value) { this.withBlockDeviceMappings(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.withEbsOptimized
 */
var software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.ebsOptimized: Boolean
    get() = throw NoSuchFieldException("Get on ebsOptimized is not supported.")
    set(value) { this.withEbsOptimized(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.withHostname
 */
var software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.hostname: String
    get() = throw NoSuchFieldException("Get on hostname is not supported.")
    set(value) { this.withHostname(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.withInstallUpdatesOnBoot
 */
var software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.installUpdatesOnBoot: Boolean
    get() = throw NoSuchFieldException("Get on installUpdatesOnBoot is not supported.")
    set(value) { this.withInstallUpdatesOnBoot(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.withRootDeviceType
 */
var software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.rootDeviceType: String
    get() = throw NoSuchFieldException("Get on rootDeviceType is not supported.")
    set(value) { this.withRootDeviceType(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.withSshKeyName
 */
var software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.sshKeyName: String
    get() = throw NoSuchFieldException("Get on sshKeyName is not supported.")
    set(value) { this.withSshKeyName(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.withTenancy
 */
var software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.tenancy: String
    get() = throw NoSuchFieldException("Get on tenancy is not supported.")
    set(value) { this.withTenancy(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.withTimeBasedAutoScaling
 */
var software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.timeBasedAutoScaling: software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty
    get() = throw NoSuchFieldException("Get on timeBasedAutoScaling is not supported.")
    set(value) { this.withTimeBasedAutoScaling(value) }

/**
 * @see software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.withVirtualizationType
 */
var software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder.virtualizationType: String
    get() = throw NoSuchFieldException("Get on virtualizationType is not supported.")
    set(value) { this.withVirtualizationType(value) }
