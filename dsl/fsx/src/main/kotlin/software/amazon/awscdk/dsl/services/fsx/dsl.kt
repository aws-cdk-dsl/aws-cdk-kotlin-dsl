package software.amazon.awscdk.dsl.services.fsx
/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystem
 */
fun software.amazon.awscdk.Construct.cfnFileSystem(id: String,
                     props: software.amazon.awscdk.services.fsx.CfnFileSystemProps? = null,
                     init: (software.amazon.awscdk.services.fsx.CfnFileSystem.() -> Unit)? = null)
        : software.amazon.awscdk.services.fsx.CfnFileSystem {

    val obj = software.amazon.awscdk.services.fsx.CfnFileSystem(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystem
 */
fun software.amazon.awscdk.Construct.cfnFileSystem(id: String,
                     init: (software.amazon.awscdk.services.fsx.CfnFileSystem.() -> Unit)? = null)
        : software.amazon.awscdk.services.fsx.CfnFileSystem {

    val obj = software.amazon.awscdk.services.fsx.CfnFileSystem(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystem.TagEntryProperty.Builder
 */
fun tagEntryProperty(init: software.amazon.awscdk.services.fsx.CfnFileSystem.TagEntryProperty.Builder.() -> Unit): software.amazon.awscdk.services.fsx.CfnFileSystem.TagEntryProperty {
    val builder = software.amazon.awscdk.services.fsx.CfnFileSystem.TagEntryProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystem.TagEntryProperty.Builder.withKey
 */
var software.amazon.awscdk.services.fsx.CfnFileSystem.TagEntryProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystem.TagEntryProperty.Builder.withValue
 */
var software.amazon.awscdk.services.fsx.CfnFileSystem.TagEntryProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }


/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystemProps.Builder
 */
fun cfnFileSystemProps(init: software.amazon.awscdk.services.fsx.CfnFileSystemProps.Builder.() -> Unit): software.amazon.awscdk.services.fsx.CfnFileSystemProps {
    val builder = software.amazon.awscdk.services.fsx.CfnFileSystemProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystemProps.Builder.withBackupId
 */
var software.amazon.awscdk.services.fsx.CfnFileSystemProps.Builder.backupId: String
    get() = throw NoSuchFieldException("Get on backupId is not supported.")
    set(value) { this.withBackupId(value) }

/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystemProps.Builder.withFileSystemType
 */
var software.amazon.awscdk.services.fsx.CfnFileSystemProps.Builder.fileSystemType: String
    get() = throw NoSuchFieldException("Get on fileSystemType is not supported.")
    set(value) { this.withFileSystemType(value) }

/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystemProps.Builder.withLustreConfiguration
 */
var software.amazon.awscdk.services.fsx.CfnFileSystemProps.Builder.lustreConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on lustreConfiguration is not supported.")
    set(value) { this.withLustreConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystemProps.Builder.withStorageCapacity
 */
var software.amazon.awscdk.services.fsx.CfnFileSystemProps.Builder.storageCapacity: Number
    get() = throw NoSuchFieldException("Get on storageCapacity is not supported.")
    set(value) { this.withStorageCapacity(value) }

/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystemProps.Builder.withWindowsConfiguration
 */
var software.amazon.awscdk.services.fsx.CfnFileSystemProps.Builder.windowsConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on windowsConfiguration is not supported.")
    set(value) { this.withWindowsConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystemProps.Builder.withKmsKeyId
 */
var software.amazon.awscdk.services.fsx.CfnFileSystemProps.Builder.kmsKeyId: String
    get() = throw NoSuchFieldException("Get on kmsKeyId is not supported.")
    set(value) { this.withKmsKeyId(value) }


/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty.Builder
 */
fun lustreConfigurationProperty(init: software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty {
    val builder = software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty.Builder.withWeeklyMaintenanceStartTime
 */
var software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty.Builder.weeklyMaintenanceStartTime: String
    get() = throw NoSuchFieldException("Get on weeklyMaintenanceStartTime is not supported.")
    set(value) { this.withWeeklyMaintenanceStartTime(value) }

/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty.Builder.withImportedFileChunkSize
 */
var software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty.Builder.importedFileChunkSize: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on importedFileChunkSize is not supported.")
    set(value) { this.withImportedFileChunkSize(value) }

/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty.Builder.withExportPath
 */
var software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty.Builder.exportPath: String
    get() = throw NoSuchFieldException("Get on exportPath is not supported.")
    set(value) { this.withExportPath(value) }

/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty.Builder.withImportPath
 */
var software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty.Builder.importPath: String
    get() = throw NoSuchFieldException("Get on importPath is not supported.")
    set(value) { this.withImportPath(value) }


/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.Builder
 */
fun windowsConfigurationProperty(init: software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty {
    val builder = software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.Builder.withActiveDirectoryId
 */
var software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.Builder.activeDirectoryId: String
    get() = throw NoSuchFieldException("Get on activeDirectoryId is not supported.")
    set(value) { this.withActiveDirectoryId(value) }

/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.Builder.withAutomaticBackupRetentionDays
 */
var software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.Builder.automaticBackupRetentionDays: Number
    get() = throw NoSuchFieldException("Get on automaticBackupRetentionDays is not supported.")
    set(value) { this.withAutomaticBackupRetentionDays(value) }

/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.Builder.withCopyTagsToBackups
 */
var software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.Builder.copyTagsToBackups: Boolean
    get() = throw NoSuchFieldException("Get on copyTagsToBackups is not supported.")
    set(value) { this.withCopyTagsToBackups(value) }

/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.Builder.withDailyAutomaticBackupStartTime
 */
var software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.Builder.dailyAutomaticBackupStartTime: String
    get() = throw NoSuchFieldException("Get on dailyAutomaticBackupStartTime is not supported.")
    set(value) { this.withDailyAutomaticBackupStartTime(value) }

/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.Builder.withThroughputCapacity
 */
var software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.Builder.throughputCapacity: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on throughputCapacity is not supported.")
    set(value) { this.withThroughputCapacity(value) }

/**
 * @see software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.Builder.withWeeklyMaintenanceStartTime
 */
var software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.Builder.weeklyMaintenanceStartTime: String
    get() = throw NoSuchFieldException("Get on weeklyMaintenanceStartTime is not supported.")
    set(value) { this.withWeeklyMaintenanceStartTime(value) }
