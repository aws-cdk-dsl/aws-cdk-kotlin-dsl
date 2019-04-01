package software.amazon.awscdk.dsl.services.neptune
/**
 * @see software.amazon.awscdk.services.neptune.CfnDBSubnetGroup
 */
fun software.amazon.awscdk.Construct.cfnDBSubnetGroup(id: String,
                     props: software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps? = null,
                     init: (software.amazon.awscdk.services.neptune.CfnDBSubnetGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.neptune.CfnDBSubnetGroup {

    val obj = software.amazon.awscdk.services.neptune.CfnDBSubnetGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.neptune.CfnDBCluster
 */
fun software.amazon.awscdk.Construct.cfnDBCluster(id: String,
                     props: software.amazon.awscdk.services.neptune.CfnDBClusterProps? = null,
                     init: (software.amazon.awscdk.services.neptune.CfnDBCluster.() -> Unit)? = null)
        : software.amazon.awscdk.services.neptune.CfnDBCluster {

    val obj = software.amazon.awscdk.services.neptune.CfnDBCluster(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.neptune.CfnDBInstance
 */
fun software.amazon.awscdk.Construct.cfnDBInstance(id: String,
                     props: software.amazon.awscdk.services.neptune.CfnDBInstanceProps? = null,
                     init: (software.amazon.awscdk.services.neptune.CfnDBInstance.() -> Unit)? = null)
        : software.amazon.awscdk.services.neptune.CfnDBInstance {

    val obj = software.amazon.awscdk.services.neptune.CfnDBInstance(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroup
 */
fun software.amazon.awscdk.Construct.cfnDBClusterParameterGroup(id: String,
                     props: software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps? = null,
                     init: (software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroup {

    val obj = software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.neptune.CfnDBParameterGroup
 */
fun software.amazon.awscdk.Construct.cfnDBParameterGroup(id: String,
                     props: software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps? = null,
                     init: (software.amazon.awscdk.services.neptune.CfnDBParameterGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.neptune.CfnDBParameterGroup {

    val obj = software.amazon.awscdk.services.neptune.CfnDBParameterGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.neptune.CfnDBCluster
 */
fun software.amazon.awscdk.Construct.cfnDBCluster(id: String,
                     init: (software.amazon.awscdk.services.neptune.CfnDBCluster.() -> Unit)? = null)
        : software.amazon.awscdk.services.neptune.CfnDBCluster {

    val obj = software.amazon.awscdk.services.neptune.CfnDBCluster(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder
 */
fun cfnDBInstanceProps(init: software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.() -> Unit): software.amazon.awscdk.services.neptune.CfnDBInstanceProps {
    val builder = software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.withDbInstanceClass
 */
var software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.dbInstanceClass: String
    get() = throw NoSuchFieldException("Get on dbInstanceClass is not supported.")
    set(value) { this.withDbInstanceClass(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.withAllowMajorVersionUpgrade
 */
var software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.allowMajorVersionUpgrade: Boolean
    get() = throw NoSuchFieldException("Get on allowMajorVersionUpgrade is not supported.")
    set(value) { this.withAllowMajorVersionUpgrade(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.withAutoMinorVersionUpgrade
 */
var software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.autoMinorVersionUpgrade: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on autoMinorVersionUpgrade is not supported.")
    set(value) { this.withAutoMinorVersionUpgrade(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.withAvailabilityZone
 */
var software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.availabilityZone: String
    get() = throw NoSuchFieldException("Get on availabilityZone is not supported.")
    set(value) { this.withAvailabilityZone(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.withDbClusterIdentifier
 */
var software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.dbClusterIdentifier: String
    get() = throw NoSuchFieldException("Get on dbClusterIdentifier is not supported.")
    set(value) { this.withDbClusterIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.withDbInstanceIdentifier
 */
var software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.dbInstanceIdentifier: String
    get() = throw NoSuchFieldException("Get on dbInstanceIdentifier is not supported.")
    set(value) { this.withDbInstanceIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.withDbParameterGroupName
 */
var software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.dbParameterGroupName: String
    get() = throw NoSuchFieldException("Get on dbParameterGroupName is not supported.")
    set(value) { this.withDbParameterGroupName(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.withDbSnapshotIdentifier
 */
var software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.dbSnapshotIdentifier: String
    get() = throw NoSuchFieldException("Get on dbSnapshotIdentifier is not supported.")
    set(value) { this.withDbSnapshotIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.withDbSubnetGroupName
 */
var software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.dbSubnetGroupName: String
    get() = throw NoSuchFieldException("Get on dbSubnetGroupName is not supported.")
    set(value) { this.withDbSubnetGroupName(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.withPreferredMaintenanceWindow
 */
var software.amazon.awscdk.services.neptune.CfnDBInstanceProps.Builder.preferredMaintenanceWindow: String
    get() = throw NoSuchFieldException("Get on preferredMaintenanceWindow is not supported.")
    set(value) { this.withPreferredMaintenanceWindow(value) }


/**
 * @see software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps.Builder
 */
fun cfnDBSubnetGroupProps(init: software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps {
    val builder = software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps.Builder.withDbSubnetGroupName
 */
var software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps.Builder.dbSubnetGroupName: String
    get() = throw NoSuchFieldException("Get on dbSubnetGroupName is not supported.")
    set(value) { this.withDbSubnetGroupName(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps.Builder.withDbSubnetGroupDescription
 */
var software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps.Builder.dbSubnetGroupDescription: String
    get() = throw NoSuchFieldException("Get on dbSubnetGroupDescription is not supported.")
    set(value) { this.withDbSubnetGroupDescription(value) }


/**
 * @see software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps.Builder
 */
fun cfnDBParameterGroupProps(init: software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps {
    val builder = software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps.Builder.withFamily
 */
var software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps.Builder.family: String
    get() = throw NoSuchFieldException("Get on family is not supported.")
    set(value) { this.withFamily(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps.Builder.withName
 */
var software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps.Builder.withParameters
 */
var software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps.Builder.parameters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on parameters is not supported.")
    set(value) { this.withParameters(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps.Builder.withDescription
 */
var software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder
 */
fun cfnDBClusterProps(init: software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.() -> Unit): software.amazon.awscdk.services.neptune.CfnDBClusterProps {
    val builder = software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.withDbClusterIdentifier
 */
var software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.dbClusterIdentifier: String
    get() = throw NoSuchFieldException("Get on dbClusterIdentifier is not supported.")
    set(value) { this.withDbClusterIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.withDbSubnetGroupName
 */
var software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.dbSubnetGroupName: String
    get() = throw NoSuchFieldException("Get on dbSubnetGroupName is not supported.")
    set(value) { this.withDbSubnetGroupName(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.withPreferredMaintenanceWindow
 */
var software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.preferredMaintenanceWindow: String
    get() = throw NoSuchFieldException("Get on preferredMaintenanceWindow is not supported.")
    set(value) { this.withPreferredMaintenanceWindow(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.withKmsKeyId
 */
var software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.kmsKeyId: String
    get() = throw NoSuchFieldException("Get on kmsKeyId is not supported.")
    set(value) { this.withKmsKeyId(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.withBackupRetentionPeriod
 */
var software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.backupRetentionPeriod: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on backupRetentionPeriod is not supported.")
    set(value) { this.withBackupRetentionPeriod(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.withDbClusterParameterGroupName
 */
var software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.dbClusterParameterGroupName: String
    get() = throw NoSuchFieldException("Get on dbClusterParameterGroupName is not supported.")
    set(value) { this.withDbClusterParameterGroupName(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.withPreferredBackupWindow
 */
var software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.preferredBackupWindow: String
    get() = throw NoSuchFieldException("Get on preferredBackupWindow is not supported.")
    set(value) { this.withPreferredBackupWindow(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.withSnapshotIdentifier
 */
var software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.snapshotIdentifier: String
    get() = throw NoSuchFieldException("Get on snapshotIdentifier is not supported.")
    set(value) { this.withSnapshotIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.withStorageEncrypted
 */
var software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.storageEncrypted: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on storageEncrypted is not supported.")
    set(value) { this.withStorageEncrypted(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.withPort
 */
var software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.port: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on port is not supported.")
    set(value) { this.withPort(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.withIamAuthEnabled
 */
var software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder.iamAuthEnabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on iamAuthEnabled is not supported.")
    set(value) { this.withIamAuthEnabled(value) }


/**
 * @see software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps.Builder
 */
fun cfnDBClusterParameterGroupProps(init: software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps {
    val builder = software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps.Builder.withFamily
 */
var software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps.Builder.family: String
    get() = throw NoSuchFieldException("Get on family is not supported.")
    set(value) { this.withFamily(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps.Builder.withName
 */
var software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps.Builder.withParameters
 */
var software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps.Builder.parameters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on parameters is not supported.")
    set(value) { this.withParameters(value) }

/**
 * @see software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps.Builder.withDescription
 */
var software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }
