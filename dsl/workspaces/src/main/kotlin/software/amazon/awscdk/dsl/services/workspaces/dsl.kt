package software.amazon.awscdk.dsl.services.workspaces
/**
 * @see software.amazon.awscdk.services.workspaces.CfnWorkspace
 */
fun software.amazon.awscdk.Construct.cfnWorkspace(id: String,
                     props: software.amazon.awscdk.services.workspaces.CfnWorkspaceProps? = null,
                     init: (software.amazon.awscdk.services.workspaces.CfnWorkspace.() -> Unit)? = null)
        : software.amazon.awscdk.services.workspaces.CfnWorkspace {

    val obj = software.amazon.awscdk.services.workspaces.CfnWorkspace(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty.Builder
 */
fun workspacePropertiesProperty(init: software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty.Builder.() -> Unit): software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty {
    val builder = software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty.Builder.withComputeTypeName
 */
var software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty.Builder.computeTypeName: String
    get() = throw NoSuchFieldException("Get on computeTypeName is not supported.")
    set(value) { this.withComputeTypeName(value) }

/**
 * @see software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty.Builder.withRootVolumeSizeGib
 */
var software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty.Builder.rootVolumeSizeGib: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on rootVolumeSizeGib is not supported.")
    set(value) { this.withRootVolumeSizeGib(value) }

/**
 * @see software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty.Builder.withRunningMode
 */
var software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty.Builder.runningMode: String
    get() = throw NoSuchFieldException("Get on runningMode is not supported.")
    set(value) { this.withRunningMode(value) }

/**
 * @see software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty.Builder.withRunningModeAutoStopTimeoutInMinutes
 */
var software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty.Builder.runningModeAutoStopTimeoutInMinutes: Number
    get() = throw NoSuchFieldException("Get on runningModeAutoStopTimeoutInMinutes is not supported.")
    set(value) { this.withRunningModeAutoStopTimeoutInMinutes(value) }

/**
 * @see software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty.Builder.withUserVolumeSizeGib
 */
var software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty.Builder.userVolumeSizeGib: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on userVolumeSizeGib is not supported.")
    set(value) { this.withUserVolumeSizeGib(value) }


/**
 * @see software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder
 */
fun cfnWorkspaceProps(init: software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder.() -> Unit): software.amazon.awscdk.services.workspaces.CfnWorkspaceProps {
    val builder = software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder.withUserName
 */
var software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder.userName: String
    get() = throw NoSuchFieldException("Get on userName is not supported.")
    set(value) { this.withUserName(value) }

/**
 * @see software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder.withVolumeEncryptionKey
 */
var software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder.volumeEncryptionKey: String
    get() = throw NoSuchFieldException("Get on volumeEncryptionKey is not supported.")
    set(value) { this.withVolumeEncryptionKey(value) }

/**
 * @see software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder.withDirectoryId
 */
var software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder.directoryId: String
    get() = throw NoSuchFieldException("Get on directoryId is not supported.")
    set(value) { this.withDirectoryId(value) }

/**
 * @see software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder.withBundleId
 */
var software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder.bundleId: String
    get() = throw NoSuchFieldException("Get on bundleId is not supported.")
    set(value) { this.withBundleId(value) }

/**
 * @see software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder.withRootVolumeEncryptionEnabled
 */
var software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder.rootVolumeEncryptionEnabled: Boolean
    get() = throw NoSuchFieldException("Get on rootVolumeEncryptionEnabled is not supported.")
    set(value) { this.withRootVolumeEncryptionEnabled(value) }

/**
 * @see software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder.withUserVolumeEncryptionEnabled
 */
var software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder.userVolumeEncryptionEnabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on userVolumeEncryptionEnabled is not supported.")
    set(value) { this.withUserVolumeEncryptionEnabled(value) }

/**
 * @see software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder.withWorkspaceProperties
 */
var software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder.workspaceProperties: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on workspaceProperties is not supported.")
    set(value) { this.withWorkspaceProperties(value) }
