package software.amazon.awscdk.dsl.services.amazonmq
/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBroker
 */
fun software.amazon.awscdk.Construct.cfnBroker(id: String,
                     props: software.amazon.awscdk.services.amazonmq.CfnBrokerProps? = null,
                     init: (software.amazon.awscdk.services.amazonmq.CfnBroker.() -> Unit)? = null)
        : software.amazon.awscdk.services.amazonmq.CfnBroker {

    val obj = software.amazon.awscdk.services.amazonmq.CfnBroker(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.amazonmq.CfnConfiguration
 */
fun software.amazon.awscdk.Construct.cfnConfiguration(id: String,
                     props: software.amazon.awscdk.services.amazonmq.CfnConfigurationProps? = null,
                     init: (software.amazon.awscdk.services.amazonmq.CfnConfiguration.() -> Unit)? = null)
        : software.amazon.awscdk.services.amazonmq.CfnConfiguration {

    val obj = software.amazon.awscdk.services.amazonmq.CfnConfiguration(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation
 */
fun software.amazon.awscdk.Construct.cfnConfigurationAssociation(id: String,
                     props: software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps? = null,
                     init: (software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.() -> Unit)? = null)
        : software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation {

    val obj = software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.amazonmq.CfnConfigurationProps.Builder
 */
fun cfnConfigurationProps(init: software.amazon.awscdk.services.amazonmq.CfnConfigurationProps.Builder.() -> Unit): software.amazon.awscdk.services.amazonmq.CfnConfigurationProps {
    val builder = software.amazon.awscdk.services.amazonmq.CfnConfigurationProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnConfigurationProps.Builder.withData
 */
var software.amazon.awscdk.services.amazonmq.CfnConfigurationProps.Builder.data: String
    get() = throw NoSuchFieldException("Get on data is not supported.")
    set(value) { this.withData(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnConfigurationProps.Builder.withEngineVersion
 */
var software.amazon.awscdk.services.amazonmq.CfnConfigurationProps.Builder.engineVersion: String
    get() = throw NoSuchFieldException("Get on engineVersion is not supported.")
    set(value) { this.withEngineVersion(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnConfigurationProps.Builder.withName
 */
var software.amazon.awscdk.services.amazonmq.CfnConfigurationProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnConfigurationProps.Builder.withDescription
 */
var software.amazon.awscdk.services.amazonmq.CfnConfigurationProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnConfigurationProps.Builder.withEngineType
 */
var software.amazon.awscdk.services.amazonmq.CfnConfigurationProps.Builder.engineType: String
    get() = throw NoSuchFieldException("Get on engineType is not supported.")
    set(value) { this.withEngineType(value) }


/**
 * @see software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps.Builder
 */
fun cfnConfigurationAssociationProps(init: software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps.Builder.() -> Unit): software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps {
    val builder = software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps.Builder.withConfiguration
 */
var software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps.Builder.configuration: software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty
    get() = throw NoSuchFieldException("Get on configuration is not supported.")
    set(value) { this.withConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps.Builder.withBroker
 */
var software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps.Builder.broker: String
    get() = throw NoSuchFieldException("Get on broker is not supported.")
    set(value) { this.withBroker(value) }


/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty.Builder
 */
fun userProperty(init: software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty.Builder.() -> Unit): software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty {
    val builder = software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty.Builder.withConsoleAccess
 */
var software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty.Builder.consoleAccess: Boolean
    get() = throw NoSuchFieldException("Get on consoleAccess is not supported.")
    set(value) { this.withConsoleAccess(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty.Builder.withPassword
 */
var software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty.Builder.password: String
    get() = throw NoSuchFieldException("Get on password is not supported.")
    set(value) { this.withPassword(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty.Builder.withUsername
 */
var software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty.Builder.username: String
    get() = throw NoSuchFieldException("Get on username is not supported.")
    set(value) { this.withUsername(value) }


/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty.Builder
 */
fun logListProperty(init: software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty.Builder.() -> Unit): software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty {
    val builder = software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty.Builder.withAudit
 */
var software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty.Builder.audit: Boolean
    get() = throw NoSuchFieldException("Get on audit is not supported.")
    set(value) { this.withAudit(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty.Builder.withGeneral
 */
var software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty.Builder.general: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on general is not supported.")
    set(value) { this.withGeneral(value) }


/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty.Builder
 */
fun tagsEntryProperty(init: software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty.Builder.() -> Unit): software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty {
    val builder = software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty.Builder.withKey
 */
var software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty.Builder.withValue
 */
var software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }


/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty.Builder
 */
fun configurationIdProperty(init: software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty.Builder.() -> Unit): software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty {
    val builder = software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty.Builder.withId
 */
var software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty.Builder.withRevision
 */
var software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty.Builder.revision: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on revision is not supported.")
    set(value) { this.withRevision(value) }


/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty.Builder
 */
fun maintenanceWindowProperty(init: software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty.Builder.() -> Unit): software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty {
    val builder = software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty.Builder.withDayOfWeek
 */
var software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty.Builder.dayOfWeek: String
    get() = throw NoSuchFieldException("Get on dayOfWeek is not supported.")
    set(value) { this.withDayOfWeek(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty.Builder.withTimeOfDay
 */
var software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty.Builder.timeOfDay: String
    get() = throw NoSuchFieldException("Get on timeOfDay is not supported.")
    set(value) { this.withTimeOfDay(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty.Builder.withTimeZone
 */
var software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty.Builder.timeZone: String
    get() = throw NoSuchFieldException("Get on timeZone is not supported.")
    set(value) { this.withTimeZone(value) }


/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder
 */
fun cfnBrokerProps(init: software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.() -> Unit): software.amazon.awscdk.services.amazonmq.CfnBrokerProps {
    val builder = software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.withConfiguration
 */
var software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.configuration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on configuration is not supported.")
    set(value) { this.withConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.withAutoMinorVersionUpgrade
 */
var software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.autoMinorVersionUpgrade: Boolean
    get() = throw NoSuchFieldException("Get on autoMinorVersionUpgrade is not supported.")
    set(value) { this.withAutoMinorVersionUpgrade(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.withEngineVersion
 */
var software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.engineVersion: String
    get() = throw NoSuchFieldException("Get on engineVersion is not supported.")
    set(value) { this.withEngineVersion(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.withPubliclyAccessible
 */
var software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.publiclyAccessible: Boolean
    get() = throw NoSuchFieldException("Get on publiclyAccessible is not supported.")
    set(value) { this.withPubliclyAccessible(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.withUsers
 */
var software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.users: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on users is not supported.")
    set(value) { this.withUsers(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.withDeploymentMode
 */
var software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.deploymentMode: String
    get() = throw NoSuchFieldException("Get on deploymentMode is not supported.")
    set(value) { this.withDeploymentMode(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.withLogs
 */
var software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.logs: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on logs is not supported.")
    set(value) { this.withLogs(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.withEngineType
 */
var software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.engineType: String
    get() = throw NoSuchFieldException("Get on engineType is not supported.")
    set(value) { this.withEngineType(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.withBrokerName
 */
var software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.brokerName: String
    get() = throw NoSuchFieldException("Get on brokerName is not supported.")
    set(value) { this.withBrokerName(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.withHostInstanceType
 */
var software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.hostInstanceType: String
    get() = throw NoSuchFieldException("Get on hostInstanceType is not supported.")
    set(value) { this.withHostInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.withMaintenanceWindowStartTime
 */
var software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder.maintenanceWindowStartTime: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on maintenanceWindowStartTime is not supported.")
    set(value) { this.withMaintenanceWindowStartTime(value) }


/**
 * @see software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty.Builder
 */
fun tagsEntryProperty(init: software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty.Builder.() -> Unit): software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty {
    val builder = software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty.Builder.withKey
 */
var software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty.Builder.withValue
 */
var software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }


/**
 * @see software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty.Builder
 */
fun configurationIdProperty(init: software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty.Builder.() -> Unit): software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty {
    val builder = software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty.Builder.withId
 */
var software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty.Builder.withRevision
 */
var software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty.Builder.revision: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on revision is not supported.")
    set(value) { this.withRevision(value) }
