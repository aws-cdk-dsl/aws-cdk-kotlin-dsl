package software.amazon.awscdk.dsl.services.appstream
/**
 * @see software.amazon.awscdk.services.appstream.CfnImageBuilder
 */
fun software.amazon.awscdk.Construct.cfnImageBuilder(id: String,
                     props: software.amazon.awscdk.services.appstream.CfnImageBuilderProps? = null,
                     init: (software.amazon.awscdk.services.appstream.CfnImageBuilder.() -> Unit)? = null)
        : software.amazon.awscdk.services.appstream.CfnImageBuilder {

    val obj = software.amazon.awscdk.services.appstream.CfnImageBuilder(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.appstream.CfnDirectoryConfig
 */
fun software.amazon.awscdk.Construct.cfnDirectoryConfig(id: String,
                     props: software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps? = null,
                     init: (software.amazon.awscdk.services.appstream.CfnDirectoryConfig.() -> Unit)? = null)
        : software.amazon.awscdk.services.appstream.CfnDirectoryConfig {

    val obj = software.amazon.awscdk.services.appstream.CfnDirectoryConfig(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.appstream.CfnUser
 */
fun software.amazon.awscdk.Construct.cfnUser(id: String,
                     props: software.amazon.awscdk.services.appstream.CfnUserProps? = null,
                     init: (software.amazon.awscdk.services.appstream.CfnUser.() -> Unit)? = null)
        : software.amazon.awscdk.services.appstream.CfnUser {

    val obj = software.amazon.awscdk.services.appstream.CfnUser(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.appstream.CfnStack
 */
fun software.amazon.awscdk.Construct.cfnStack(id: String,
                     props: software.amazon.awscdk.services.appstream.CfnStackProps? = null,
                     init: (software.amazon.awscdk.services.appstream.CfnStack.() -> Unit)? = null)
        : software.amazon.awscdk.services.appstream.CfnStack {

    val obj = software.amazon.awscdk.services.appstream.CfnStack(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.appstream.CfnFleet
 */
fun software.amazon.awscdk.Construct.cfnFleet(id: String,
                     props: software.amazon.awscdk.services.appstream.CfnFleetProps? = null,
                     init: (software.amazon.awscdk.services.appstream.CfnFleet.() -> Unit)? = null)
        : software.amazon.awscdk.services.appstream.CfnFleet {

    val obj = software.amazon.awscdk.services.appstream.CfnFleet(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.appstream.CfnStackFleetAssociation
 */
fun software.amazon.awscdk.Construct.cfnStackFleetAssociation(id: String,
                     props: software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps? = null,
                     init: (software.amazon.awscdk.services.appstream.CfnStackFleetAssociation.() -> Unit)? = null)
        : software.amazon.awscdk.services.appstream.CfnStackFleetAssociation {

    val obj = software.amazon.awscdk.services.appstream.CfnStackFleetAssociation(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.appstream.CfnStackUserAssociation
 */
fun software.amazon.awscdk.Construct.cfnStackUserAssociation(id: String,
                     props: software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps? = null,
                     init: (software.amazon.awscdk.services.appstream.CfnStackUserAssociation.() -> Unit)? = null)
        : software.amazon.awscdk.services.appstream.CfnStackUserAssociation {

    val obj = software.amazon.awscdk.services.appstream.CfnStackUserAssociation(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.appstream.CfnStack
 */
fun software.amazon.awscdk.Construct.cfnStack(id: String,
                     init: (software.amazon.awscdk.services.appstream.CfnStack.() -> Unit)? = null)
        : software.amazon.awscdk.services.appstream.CfnStack {

    val obj = software.amazon.awscdk.services.appstream.CfnStack(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty.Builder
 */
fun storageConnectorProperty(init: software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty.Builder.() -> Unit): software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty {
    val builder = software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty.Builder.withConnectorType
 */
var software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty.Builder.connectorType: String
    get() = throw NoSuchFieldException("Get on connectorType is not supported.")
    set(value) { this.withConnectorType(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty.Builder.withResourceIdentifier
 */
var software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty.Builder.resourceIdentifier: String
    get() = throw NoSuchFieldException("Get on resourceIdentifier is not supported.")
    set(value) { this.withResourceIdentifier(value) }


/**
 * @see software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty.Builder
 */
fun computeCapacityProperty(init: software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty.Builder.() -> Unit): software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty {
    val builder = software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty.Builder.withDesiredInstances
 */
var software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty.Builder.desiredInstances: Number
    get() = throw NoSuchFieldException("Get on desiredInstances is not supported.")
    set(value) { this.withDesiredInstances(value) }


/**
 * @see software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty.Builder
 */
fun serviceAccountCredentialsProperty(init: software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty.Builder.() -> Unit): software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty {
    val builder = software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty.Builder.withAccountName
 */
var software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty.Builder.accountName: String
    get() = throw NoSuchFieldException("Get on accountName is not supported.")
    set(value) { this.withAccountName(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty.Builder.withAccountPassword
 */
var software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty.Builder.accountPassword: String
    get() = throw NoSuchFieldException("Get on accountPassword is not supported.")
    set(value) { this.withAccountPassword(value) }


/**
 * @see software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty.Builder
 */
fun vpcConfigProperty(init: software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty {
    val builder = software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty.Builder()
    builder.init()
    return builder.build()
}


/**
 * @see software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty.Builder
 */
fun vpcConfigProperty(init: software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty {
    val builder = software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty.Builder()
    builder.init()
    return builder.build()
}


/**
 * @see software.amazon.awscdk.services.appstream.CfnStackProps.Builder
 */
fun cfnStackProps(init: software.amazon.awscdk.services.appstream.CfnStackProps.Builder.() -> Unit): software.amazon.awscdk.services.appstream.CfnStackProps {
    val builder = software.amazon.awscdk.services.appstream.CfnStackProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appstream.CfnStackProps.Builder.withName
 */
var software.amazon.awscdk.services.appstream.CfnStackProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnStackProps.Builder.withDescription
 */
var software.amazon.awscdk.services.appstream.CfnStackProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnStackProps.Builder.withDisplayName
 */
var software.amazon.awscdk.services.appstream.CfnStackProps.Builder.displayName: String
    get() = throw NoSuchFieldException("Get on displayName is not supported.")
    set(value) { this.withDisplayName(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnStackProps.Builder.withApplicationSettings
 */
var software.amazon.awscdk.services.appstream.CfnStackProps.Builder.applicationSettings: software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty
    get() = throw NoSuchFieldException("Get on applicationSettings is not supported.")
    set(value) { this.withApplicationSettings(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnStackProps.Builder.withDeleteStorageConnectors
 */
var software.amazon.awscdk.services.appstream.CfnStackProps.Builder.deleteStorageConnectors: Boolean
    get() = throw NoSuchFieldException("Get on deleteStorageConnectors is not supported.")
    set(value) { this.withDeleteStorageConnectors(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnStackProps.Builder.withFeedbackUrl
 */
var software.amazon.awscdk.services.appstream.CfnStackProps.Builder.feedbackUrl: String
    get() = throw NoSuchFieldException("Get on feedbackUrl is not supported.")
    set(value) { this.withFeedbackUrl(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnStackProps.Builder.withRedirectUrl
 */
var software.amazon.awscdk.services.appstream.CfnStackProps.Builder.redirectUrl: String
    get() = throw NoSuchFieldException("Get on redirectUrl is not supported.")
    set(value) { this.withRedirectUrl(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnStackProps.Builder.withStorageConnectors
 */
var software.amazon.awscdk.services.appstream.CfnStackProps.Builder.storageConnectors: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on storageConnectors is not supported.")
    set(value) { this.withStorageConnectors(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnStackProps.Builder.withUserSettings
 */
var software.amazon.awscdk.services.appstream.CfnStackProps.Builder.userSettings: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on userSettings is not supported.")
    set(value) { this.withUserSettings(value) }


/**
 * @see software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty.Builder
 */
fun domainJoinInfoProperty(init: software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty.Builder.() -> Unit): software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty {
    val builder = software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty.Builder.withOrganizationalUnitDistinguishedName
 */
var software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty.Builder.organizationalUnitDistinguishedName: String
    get() = throw NoSuchFieldException("Get on organizationalUnitDistinguishedName is not supported.")
    set(value) { this.withOrganizationalUnitDistinguishedName(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty.Builder.withDirectoryName
 */
var software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty.Builder.directoryName: String
    get() = throw NoSuchFieldException("Get on directoryName is not supported.")
    set(value) { this.withDirectoryName(value) }


/**
 * @see software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps.Builder
 */
fun cfnStackUserAssociationProps(init: software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps.Builder.() -> Unit): software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps {
    val builder = software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps.Builder.withStackName
 */
var software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps.Builder.stackName: String
    get() = throw NoSuchFieldException("Get on stackName is not supported.")
    set(value) { this.withStackName(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps.Builder.withSendEmailNotification
 */
var software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps.Builder.sendEmailNotification: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on sendEmailNotification is not supported.")
    set(value) { this.withSendEmailNotification(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps.Builder.withUserName
 */
var software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps.Builder.userName: String
    get() = throw NoSuchFieldException("Get on userName is not supported.")
    set(value) { this.withUserName(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps.Builder.withAuthenticationType
 */
var software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps.Builder.authenticationType: String
    get() = throw NoSuchFieldException("Get on authenticationType is not supported.")
    set(value) { this.withAuthenticationType(value) }


/**
 * @see software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty.Builder
 */
fun applicationSettingsProperty(init: software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty.Builder.() -> Unit): software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty {
    val builder = software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty.Builder.enabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty.Builder.withSettingsGroup
 */
var software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty.Builder.settingsGroup: String
    get() = throw NoSuchFieldException("Get on settingsGroup is not supported.")
    set(value) { this.withSettingsGroup(value) }


/**
 * @see software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty.Builder
 */
fun domainJoinInfoProperty(init: software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty.Builder.() -> Unit): software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty {
    val builder = software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty.Builder.withOrganizationalUnitDistinguishedName
 */
var software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty.Builder.organizationalUnitDistinguishedName: String
    get() = throw NoSuchFieldException("Get on organizationalUnitDistinguishedName is not supported.")
    set(value) { this.withOrganizationalUnitDistinguishedName(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty.Builder.withDirectoryName
 */
var software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty.Builder.directoryName: String
    get() = throw NoSuchFieldException("Get on directoryName is not supported.")
    set(value) { this.withDirectoryName(value) }


/**
 * @see software.amazon.awscdk.services.appstream.CfnUserProps.Builder
 */
fun cfnUserProps(init: software.amazon.awscdk.services.appstream.CfnUserProps.Builder.() -> Unit): software.amazon.awscdk.services.appstream.CfnUserProps {
    val builder = software.amazon.awscdk.services.appstream.CfnUserProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appstream.CfnUserProps.Builder.withUserName
 */
var software.amazon.awscdk.services.appstream.CfnUserProps.Builder.userName: String
    get() = throw NoSuchFieldException("Get on userName is not supported.")
    set(value) { this.withUserName(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnUserProps.Builder.withAuthenticationType
 */
var software.amazon.awscdk.services.appstream.CfnUserProps.Builder.authenticationType: String
    get() = throw NoSuchFieldException("Get on authenticationType is not supported.")
    set(value) { this.withAuthenticationType(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnUserProps.Builder.withFirstName
 */
var software.amazon.awscdk.services.appstream.CfnUserProps.Builder.firstName: String
    get() = throw NoSuchFieldException("Get on firstName is not supported.")
    set(value) { this.withFirstName(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnUserProps.Builder.withLastName
 */
var software.amazon.awscdk.services.appstream.CfnUserProps.Builder.lastName: String
    get() = throw NoSuchFieldException("Get on lastName is not supported.")
    set(value) { this.withLastName(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnUserProps.Builder.withMessageAction
 */
var software.amazon.awscdk.services.appstream.CfnUserProps.Builder.messageAction: String
    get() = throw NoSuchFieldException("Get on messageAction is not supported.")
    set(value) { this.withMessageAction(value) }


/**
 * @see software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps.Builder
 */
fun cfnDirectoryConfigProps(init: software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps.Builder.() -> Unit): software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps {
    val builder = software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps.Builder.withDirectoryName
 */
var software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps.Builder.directoryName: String
    get() = throw NoSuchFieldException("Get on directoryName is not supported.")
    set(value) { this.withDirectoryName(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps.Builder.withServiceAccountCredentials
 */
var software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps.Builder.serviceAccountCredentials: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on serviceAccountCredentials is not supported.")
    set(value) { this.withServiceAccountCredentials(value) }


/**
 * @see software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty.Builder
 */
fun userSettingProperty(init: software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty.Builder.() -> Unit): software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty {
    val builder = software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty.Builder.withAction
 */
var software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty.Builder.action: String
    get() = throw NoSuchFieldException("Get on action is not supported.")
    set(value) { this.withAction(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty.Builder.withPermission
 */
var software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty.Builder.permission: String
    get() = throw NoSuchFieldException("Get on permission is not supported.")
    set(value) { this.withPermission(value) }


/**
 * @see software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps.Builder
 */
fun cfnStackFleetAssociationProps(init: software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps.Builder.() -> Unit): software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps {
    val builder = software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps.Builder.withFleetName
 */
var software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps.Builder.fleetName: String
    get() = throw NoSuchFieldException("Get on fleetName is not supported.")
    set(value) { this.withFleetName(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps.Builder.withStackName
 */
var software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps.Builder.stackName: String
    get() = throw NoSuchFieldException("Get on stackName is not supported.")
    set(value) { this.withStackName(value) }


/**
 * @see software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder
 */
fun cfnImageBuilderProps(init: software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.() -> Unit): software.amazon.awscdk.services.appstream.CfnImageBuilderProps {
    val builder = software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.withDomainJoinInfo
 */
var software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.domainJoinInfo: software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty
    get() = throw NoSuchFieldException("Get on domainJoinInfo is not supported.")
    set(value) { this.withDomainJoinInfo(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.withEnableDefaultInternetAccess
 */
var software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.enableDefaultInternetAccess: Boolean
    get() = throw NoSuchFieldException("Get on enableDefaultInternetAccess is not supported.")
    set(value) { this.withEnableDefaultInternetAccess(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.withImageArn
 */
var software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.imageArn: String
    get() = throw NoSuchFieldException("Get on imageArn is not supported.")
    set(value) { this.withImageArn(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.withImageName
 */
var software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.imageName: String
    get() = throw NoSuchFieldException("Get on imageName is not supported.")
    set(value) { this.withImageName(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.withVpcConfig
 */
var software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.vpcConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on vpcConfig is not supported.")
    set(value) { this.withVpcConfig(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.withInstanceType
 */
var software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.instanceType: String
    get() = throw NoSuchFieldException("Get on instanceType is not supported.")
    set(value) { this.withInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.withName
 */
var software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.withDescription
 */
var software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.withDisplayName
 */
var software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.displayName: String
    get() = throw NoSuchFieldException("Get on displayName is not supported.")
    set(value) { this.withDisplayName(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.withAppstreamAgentVersion
 */
var software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder.appstreamAgentVersion: String
    get() = throw NoSuchFieldException("Get on appstreamAgentVersion is not supported.")
    set(value) { this.withAppstreamAgentVersion(value) }


/**
 * @see software.amazon.awscdk.services.appstream.CfnFleetProps.Builder
 */
fun cfnFleetProps(init: software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.() -> Unit): software.amazon.awscdk.services.appstream.CfnFleetProps {
    val builder = software.amazon.awscdk.services.appstream.CfnFleetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.withComputeCapacity
 */
var software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.computeCapacity: software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty
    get() = throw NoSuchFieldException("Get on computeCapacity is not supported.")
    set(value) { this.withComputeCapacity(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.withDisconnectTimeoutInSeconds
 */
var software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.disconnectTimeoutInSeconds: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on disconnectTimeoutInSeconds is not supported.")
    set(value) { this.withDisconnectTimeoutInSeconds(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.withDomainJoinInfo
 */
var software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.domainJoinInfo: software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty
    get() = throw NoSuchFieldException("Get on domainJoinInfo is not supported.")
    set(value) { this.withDomainJoinInfo(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.withEnableDefaultInternetAccess
 */
var software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.enableDefaultInternetAccess: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enableDefaultInternetAccess is not supported.")
    set(value) { this.withEnableDefaultInternetAccess(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.withFleetType
 */
var software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.fleetType: String
    get() = throw NoSuchFieldException("Get on fleetType is not supported.")
    set(value) { this.withFleetType(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.withImageArn
 */
var software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.imageArn: String
    get() = throw NoSuchFieldException("Get on imageArn is not supported.")
    set(value) { this.withImageArn(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.withImageName
 */
var software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.imageName: String
    get() = throw NoSuchFieldException("Get on imageName is not supported.")
    set(value) { this.withImageName(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.withMaxUserDurationInSeconds
 */
var software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.maxUserDurationInSeconds: Number
    get() = throw NoSuchFieldException("Get on maxUserDurationInSeconds is not supported.")
    set(value) { this.withMaxUserDurationInSeconds(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.withVpcConfig
 */
var software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.vpcConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on vpcConfig is not supported.")
    set(value) { this.withVpcConfig(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.withInstanceType
 */
var software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.instanceType: String
    get() = throw NoSuchFieldException("Get on instanceType is not supported.")
    set(value) { this.withInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.withName
 */
var software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.withDescription
 */
var software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.withDisplayName
 */
var software.amazon.awscdk.services.appstream.CfnFleetProps.Builder.displayName: String
    get() = throw NoSuchFieldException("Get on displayName is not supported.")
    set(value) { this.withDisplayName(value) }
