package software.amazon.awscdk.dsl.services.docdb
/**
 * @see software.amazon.awscdk.services.docdb.CfnDBInstance
 */
fun software.amazon.awscdk.Construct.cfnDBInstance(id: String,
                     props: software.amazon.awscdk.services.docdb.CfnDBInstanceProps? = null,
                     init: (software.amazon.awscdk.services.docdb.CfnDBInstance.() -> Unit)? = null)
        : software.amazon.awscdk.services.docdb.CfnDBInstance {

    val obj = software.amazon.awscdk.services.docdb.CfnDBInstance(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.docdb.CfnDBSubnetGroup
 */
fun software.amazon.awscdk.Construct.cfnDBSubnetGroup(id: String,
                     props: software.amazon.awscdk.services.docdb.CfnDBSubnetGroupProps? = null,
                     init: (software.amazon.awscdk.services.docdb.CfnDBSubnetGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.docdb.CfnDBSubnetGroup {

    val obj = software.amazon.awscdk.services.docdb.CfnDBSubnetGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.docdb.CfnDBCluster
 */
fun software.amazon.awscdk.Construct.cfnDBCluster(id: String,
                     props: software.amazon.awscdk.services.docdb.CfnDBClusterProps? = null,
                     init: (software.amazon.awscdk.services.docdb.CfnDBCluster.() -> Unit)? = null)
        : software.amazon.awscdk.services.docdb.CfnDBCluster {

    val obj = software.amazon.awscdk.services.docdb.CfnDBCluster(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup
 */
fun software.amazon.awscdk.Construct.cfnDBClusterParameterGroup(id: String,
                     props: software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps? = null,
                     init: (software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup {

    val obj = software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.docdb.CfnDBCluster
 */
fun software.amazon.awscdk.Construct.cfnDBCluster(id: String,
                     init: (software.amazon.awscdk.services.docdb.CfnDBCluster.() -> Unit)? = null)
        : software.amazon.awscdk.services.docdb.CfnDBCluster {

    val obj = software.amazon.awscdk.services.docdb.CfnDBCluster(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder
 */
fun cfnDBInstanceProps(init: software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder.() -> Unit): software.amazon.awscdk.services.docdb.CfnDBInstanceProps {
    val builder = software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder.withDbInstanceClass
 */
var software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder.dbInstanceClass: String
    get() = throw NoSuchFieldException("Get on dbInstanceClass is not supported.")
    set(value) { this.withDbInstanceClass(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder.withAutoMinorVersionUpgrade
 */
var software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder.autoMinorVersionUpgrade: Boolean
    get() = throw NoSuchFieldException("Get on autoMinorVersionUpgrade is not supported.")
    set(value) { this.withAutoMinorVersionUpgrade(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder.withAvailabilityZone
 */
var software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder.availabilityZone: String
    get() = throw NoSuchFieldException("Get on availabilityZone is not supported.")
    set(value) { this.withAvailabilityZone(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder.withDbClusterIdentifier
 */
var software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder.dbClusterIdentifier: String
    get() = throw NoSuchFieldException("Get on dbClusterIdentifier is not supported.")
    set(value) { this.withDbClusterIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder.withDbInstanceIdentifier
 */
var software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder.dbInstanceIdentifier: String
    get() = throw NoSuchFieldException("Get on dbInstanceIdentifier is not supported.")
    set(value) { this.withDbInstanceIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder.withPreferredMaintenanceWindow
 */
var software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder.preferredMaintenanceWindow: String
    get() = throw NoSuchFieldException("Get on preferredMaintenanceWindow is not supported.")
    set(value) { this.withPreferredMaintenanceWindow(value) }


/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps.Builder
 */
fun cfnDBClusterParameterGroupProps(init: software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps {
    val builder = software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps.Builder.withFamily
 */
var software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps.Builder.family: String
    get() = throw NoSuchFieldException("Get on family is not supported.")
    set(value) { this.withFamily(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps.Builder.withName
 */
var software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps.Builder.withParameters
 */
var software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps.Builder.parameters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on parameters is not supported.")
    set(value) { this.withParameters(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps.Builder.withDescription
 */
var software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder
 */
fun cfnDBClusterProps(init: software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.() -> Unit): software.amazon.awscdk.services.docdb.CfnDBClusterProps {
    val builder = software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.withDbClusterIdentifier
 */
var software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.dbClusterIdentifier: String
    get() = throw NoSuchFieldException("Get on dbClusterIdentifier is not supported.")
    set(value) { this.withDbClusterIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.withDbSubnetGroupName
 */
var software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.dbSubnetGroupName: String
    get() = throw NoSuchFieldException("Get on dbSubnetGroupName is not supported.")
    set(value) { this.withDbSubnetGroupName(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.withPreferredMaintenanceWindow
 */
var software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.preferredMaintenanceWindow: String
    get() = throw NoSuchFieldException("Get on preferredMaintenanceWindow is not supported.")
    set(value) { this.withPreferredMaintenanceWindow(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.withKmsKeyId
 */
var software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.kmsKeyId: String
    get() = throw NoSuchFieldException("Get on kmsKeyId is not supported.")
    set(value) { this.withKmsKeyId(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.withBackupRetentionPeriod
 */
var software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.backupRetentionPeriod: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on backupRetentionPeriod is not supported.")
    set(value) { this.withBackupRetentionPeriod(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.withDbClusterParameterGroupName
 */
var software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.dbClusterParameterGroupName: String
    get() = throw NoSuchFieldException("Get on dbClusterParameterGroupName is not supported.")
    set(value) { this.withDbClusterParameterGroupName(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.withEngineVersion
 */
var software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.engineVersion: String
    get() = throw NoSuchFieldException("Get on engineVersion is not supported.")
    set(value) { this.withEngineVersion(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.withMasterUsername
 */
var software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.masterUsername: String
    get() = throw NoSuchFieldException("Get on masterUsername is not supported.")
    set(value) { this.withMasterUsername(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.withMasterUserPassword
 */
var software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.masterUserPassword: String
    get() = throw NoSuchFieldException("Get on masterUserPassword is not supported.")
    set(value) { this.withMasterUserPassword(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.withPreferredBackupWindow
 */
var software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.preferredBackupWindow: String
    get() = throw NoSuchFieldException("Get on preferredBackupWindow is not supported.")
    set(value) { this.withPreferredBackupWindow(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.withSnapshotIdentifier
 */
var software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.snapshotIdentifier: String
    get() = throw NoSuchFieldException("Get on snapshotIdentifier is not supported.")
    set(value) { this.withSnapshotIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.withStorageEncrypted
 */
var software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.storageEncrypted: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on storageEncrypted is not supported.")
    set(value) { this.withStorageEncrypted(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.withPort
 */
var software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder.port: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on port is not supported.")
    set(value) { this.withPort(value) }


/**
 * @see software.amazon.awscdk.services.docdb.CfnDBSubnetGroupProps.Builder
 */
fun cfnDBSubnetGroupProps(init: software.amazon.awscdk.services.docdb.CfnDBSubnetGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.docdb.CfnDBSubnetGroupProps {
    val builder = software.amazon.awscdk.services.docdb.CfnDBSubnetGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBSubnetGroupProps.Builder.withDbSubnetGroupName
 */
var software.amazon.awscdk.services.docdb.CfnDBSubnetGroupProps.Builder.dbSubnetGroupName: String
    get() = throw NoSuchFieldException("Get on dbSubnetGroupName is not supported.")
    set(value) { this.withDbSubnetGroupName(value) }

/**
 * @see software.amazon.awscdk.services.docdb.CfnDBSubnetGroupProps.Builder.withDbSubnetGroupDescription
 */
var software.amazon.awscdk.services.docdb.CfnDBSubnetGroupProps.Builder.dbSubnetGroupDescription: String
    get() = throw NoSuchFieldException("Get on dbSubnetGroupDescription is not supported.")
    set(value) { this.withDbSubnetGroupDescription(value) }
