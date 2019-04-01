package software.amazon.awscdk.dsl.services.opsworkscm
/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServer
 */
fun software.amazon.awscdk.Construct.cfnServer(id: String,
                     props: software.amazon.awscdk.services.opsworkscm.CfnServerProps? = null,
                     init: (software.amazon.awscdk.services.opsworkscm.CfnServer.() -> Unit)? = null)
        : software.amazon.awscdk.services.opsworkscm.CfnServer {

    val obj = software.amazon.awscdk.services.opsworkscm.CfnServer(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder
 */
fun cfnServerProps(init: software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.() -> Unit): software.amazon.awscdk.services.opsworkscm.CfnServerProps {
    val builder = software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.withServiceRoleArn
 */
var software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.serviceRoleArn: String
    get() = throw NoSuchFieldException("Get on serviceRoleArn is not supported.")
    set(value) { this.withServiceRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.withBackupId
 */
var software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.backupId: String
    get() = throw NoSuchFieldException("Get on backupId is not supported.")
    set(value) { this.withBackupId(value) }

/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.withPreferredMaintenanceWindow
 */
var software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.preferredMaintenanceWindow: String
    get() = throw NoSuchFieldException("Get on preferredMaintenanceWindow is not supported.")
    set(value) { this.withPreferredMaintenanceWindow(value) }

/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.withInstanceType
 */
var software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.instanceType: String
    get() = throw NoSuchFieldException("Get on instanceType is not supported.")
    set(value) { this.withInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.withAssociatePublicIpAddress
 */
var software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.associatePublicIpAddress: Boolean
    get() = throw NoSuchFieldException("Get on associatePublicIpAddress is not supported.")
    set(value) { this.withAssociatePublicIpAddress(value) }

/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.withServerName
 */
var software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.serverName: String
    get() = throw NoSuchFieldException("Get on serverName is not supported.")
    set(value) { this.withServerName(value) }

/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.withEngine
 */
var software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.engine: String
    get() = throw NoSuchFieldException("Get on engine is not supported.")
    set(value) { this.withEngine(value) }

/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.withEngineVersion
 */
var software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.engineVersion: String
    get() = throw NoSuchFieldException("Get on engineVersion is not supported.")
    set(value) { this.withEngineVersion(value) }

/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.withPreferredBackupWindow
 */
var software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.preferredBackupWindow: String
    get() = throw NoSuchFieldException("Get on preferredBackupWindow is not supported.")
    set(value) { this.withPreferredBackupWindow(value) }

/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.withInstanceProfileArn
 */
var software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.instanceProfileArn: String
    get() = throw NoSuchFieldException("Get on instanceProfileArn is not supported.")
    set(value) { this.withInstanceProfileArn(value) }

/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.withBackupRetentionCount
 */
var software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.backupRetentionCount: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on backupRetentionCount is not supported.")
    set(value) { this.withBackupRetentionCount(value) }

/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.withDisableAutomatedBackup
 */
var software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.disableAutomatedBackup: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on disableAutomatedBackup is not supported.")
    set(value) { this.withDisableAutomatedBackup(value) }

/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.withEngineAttributes
 */
var software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.engineAttributes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on engineAttributes is not supported.")
    set(value) { this.withEngineAttributes(value) }

/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.withEngineModel
 */
var software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.engineModel: String
    get() = throw NoSuchFieldException("Get on engineModel is not supported.")
    set(value) { this.withEngineModel(value) }

/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.withKeyPair
 */
var software.amazon.awscdk.services.opsworkscm.CfnServerProps.Builder.keyPair: String
    get() = throw NoSuchFieldException("Get on keyPair is not supported.")
    set(value) { this.withKeyPair(value) }


/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty.Builder
 */
fun engineAttributeProperty(init: software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty.Builder.() -> Unit): software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty {
    val builder = software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty.Builder.withValue
 */
var software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty.Builder.withName
 */
var software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }
