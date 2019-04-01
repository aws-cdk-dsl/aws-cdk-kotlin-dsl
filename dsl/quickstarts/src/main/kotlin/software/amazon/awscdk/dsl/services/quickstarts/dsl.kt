package software.amazon.awscdk.dsl.services.quickstarts
/**
 * @see software.amazon.awscdk.services.quickstarts.SqlServer
 */
fun software.amazon.awscdk.Construct.sqlServer(id: String,
                     props: software.amazon.awscdk.services.quickstarts.SqlServerProps? = null,
                     init: (software.amazon.awscdk.services.quickstarts.SqlServer.() -> Unit)? = null)
        : software.amazon.awscdk.services.quickstarts.SqlServer {

    val obj = software.amazon.awscdk.services.quickstarts.SqlServer(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.quickstarts.RemoteDesktopGateway
 */
fun software.amazon.awscdk.Construct.remoteDesktopGateway(id: String,
                     props: software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps? = null,
                     init: (software.amazon.awscdk.services.quickstarts.RemoteDesktopGateway.() -> Unit)? = null)
        : software.amazon.awscdk.services.quickstarts.RemoteDesktopGateway {

    val obj = software.amazon.awscdk.services.quickstarts.RemoteDesktopGateway(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder
 */
fun remoteDesktopGatewayProps(init: software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.() -> Unit): software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps {
    val builder = software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.withAdminPassword
 */
var software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.adminPassword: String
    get() = throw NoSuchFieldException("Get on adminPassword is not supported.")
    set(value) { this.withAdminPassword(value) }

/**
 * @see software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.withKeyPairName
 */
var software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.keyPairName: String
    get() = throw NoSuchFieldException("Get on keyPairName is not supported.")
    set(value) { this.withKeyPairName(value) }

/**
 * @see software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.withRdgwCidr
 */
var software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.rdgwCidr: String
    get() = throw NoSuchFieldException("Get on rdgwCidr is not supported.")
    set(value) { this.withRdgwCidr(value) }

/**
 * @see software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.withAdminUser
 */
var software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.adminUser: String
    get() = throw NoSuchFieldException("Get on adminUser is not supported.")
    set(value) { this.withAdminUser(value) }

/**
 * @see software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.withDomainDnsName
 */
var software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.domainDnsName: String
    get() = throw NoSuchFieldException("Get on domainDnsName is not supported.")
    set(value) { this.withDomainDnsName(value) }

/**
 * @see software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.withNumberOfRdgwHosts
 */
var software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.numberOfRdgwHosts: Number
    get() = throw NoSuchFieldException("Get on numberOfRdgwHosts is not supported.")
    set(value) { this.withNumberOfRdgwHosts(value) }

/**
 * @see software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.withQss3BucketName
 */
var software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.qss3BucketName: String
    get() = throw NoSuchFieldException("Get on qss3BucketName is not supported.")
    set(value) { this.withQss3BucketName(value) }

/**
 * @see software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.withQss3KeyPrefix
 */
var software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.qss3KeyPrefix: String
    get() = throw NoSuchFieldException("Get on qss3KeyPrefix is not supported.")
    set(value) { this.withQss3KeyPrefix(value) }

/**
 * @see software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.withRdgwInstanceType
 */
var software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.rdgwInstanceType: String
    get() = throw NoSuchFieldException("Get on rdgwInstanceType is not supported.")
    set(value) { this.withRdgwInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.withVpc
 */
var software.amazon.awscdk.services.quickstarts.RemoteDesktopGatewayProps.Builder.vpc: software.amazon.awscdk.services.ec2.IVpcNetwork
    get() = throw NoSuchFieldException("Get on vpc is not supported.")
    set(value) { this.withVpc(value) }


/**
 * @see software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder
 */
fun sqlServerProps(init: software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder.() -> Unit): software.amazon.awscdk.services.quickstarts.SqlServerProps {
    val builder = software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder.withEngine
 */
var software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder.engine: String
    get() = throw NoSuchFieldException("Get on engine is not supported.")
    set(value) { this.withEngine(value) }

/**
 * @see software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder.withEngineVersion
 */
var software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder.engineVersion: String
    get() = throw NoSuchFieldException("Get on engineVersion is not supported.")
    set(value) { this.withEngineVersion(value) }

/**
 * @see software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder.withMasterUsername
 */
var software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder.masterUsername: String
    get() = throw NoSuchFieldException("Get on masterUsername is not supported.")
    set(value) { this.withMasterUsername(value) }

/**
 * @see software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder.withVpc
 */
var software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder.vpc: software.amazon.awscdk.services.ec2.IVpcNetwork
    get() = throw NoSuchFieldException("Get on vpc is not supported.")
    set(value) { this.withVpc(value) }

/**
 * @see software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder.withMasterPassword
 */
var software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder.masterPassword: String
    get() = throw NoSuchFieldException("Get on masterPassword is not supported.")
    set(value) { this.withMasterPassword(value) }

/**
 * @see software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder.withAllocatedStorage
 */
var software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder.allocatedStorage: Number
    get() = throw NoSuchFieldException("Get on allocatedStorage is not supported.")
    set(value) { this.withAllocatedStorage(value) }

/**
 * @see software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder.withInstanceClass
 */
var software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder.instanceClass: String
    get() = throw NoSuchFieldException("Get on instanceClass is not supported.")
    set(value) { this.withInstanceClass(value) }

/**
 * @see software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder.withLicenseModel
 */
var software.amazon.awscdk.services.quickstarts.SqlServerProps.Builder.licenseModel: String
    get() = throw NoSuchFieldException("Get on licenseModel is not supported.")
    set(value) { this.withLicenseModel(value) }
