package software.amazon.awscdk.dsl.services.efs
/**
 * @see software.amazon.awscdk.services.efs.CfnFileSystem
 */
fun software.amazon.awscdk.Construct.cfnFileSystem(id: String,
                     props: software.amazon.awscdk.services.efs.CfnFileSystemProps? = null,
                     init: (software.amazon.awscdk.services.efs.CfnFileSystem.() -> Unit)? = null)
        : software.amazon.awscdk.services.efs.CfnFileSystem {

    val obj = software.amazon.awscdk.services.efs.CfnFileSystem(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.efs.CfnMountTarget
 */
fun software.amazon.awscdk.Construct.cfnMountTarget(id: String,
                     props: software.amazon.awscdk.services.efs.CfnMountTargetProps? = null,
                     init: (software.amazon.awscdk.services.efs.CfnMountTarget.() -> Unit)? = null)
        : software.amazon.awscdk.services.efs.CfnMountTarget {

    val obj = software.amazon.awscdk.services.efs.CfnMountTarget(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.efs.CfnFileSystem
 */
fun software.amazon.awscdk.Construct.cfnFileSystem(id: String,
                     init: (software.amazon.awscdk.services.efs.CfnFileSystem.() -> Unit)? = null)
        : software.amazon.awscdk.services.efs.CfnFileSystem {

    val obj = software.amazon.awscdk.services.efs.CfnFileSystem(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.efs.CfnFileSystemProps.Builder
 */
fun cfnFileSystemProps(init: software.amazon.awscdk.services.efs.CfnFileSystemProps.Builder.() -> Unit): software.amazon.awscdk.services.efs.CfnFileSystemProps {
    val builder = software.amazon.awscdk.services.efs.CfnFileSystemProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.efs.CfnFileSystemProps.Builder.withKmsKeyId
 */
var software.amazon.awscdk.services.efs.CfnFileSystemProps.Builder.kmsKeyId: String
    get() = throw NoSuchFieldException("Get on kmsKeyId is not supported.")
    set(value) { this.withKmsKeyId(value) }

/**
 * @see software.amazon.awscdk.services.efs.CfnFileSystemProps.Builder.withEncrypted
 */
var software.amazon.awscdk.services.efs.CfnFileSystemProps.Builder.encrypted: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on encrypted is not supported.")
    set(value) { this.withEncrypted(value) }

/**
 * @see software.amazon.awscdk.services.efs.CfnFileSystemProps.Builder.withThroughputMode
 */
var software.amazon.awscdk.services.efs.CfnFileSystemProps.Builder.throughputMode: String
    get() = throw NoSuchFieldException("Get on throughputMode is not supported.")
    set(value) { this.withThroughputMode(value) }

/**
 * @see software.amazon.awscdk.services.efs.CfnFileSystemProps.Builder.withFileSystemTags
 */
var software.amazon.awscdk.services.efs.CfnFileSystemProps.Builder.fileSystemTags: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on fileSystemTags is not supported.")
    set(value) { this.withFileSystemTags(value) }

/**
 * @see software.amazon.awscdk.services.efs.CfnFileSystemProps.Builder.withPerformanceMode
 */
var software.amazon.awscdk.services.efs.CfnFileSystemProps.Builder.performanceMode: String
    get() = throw NoSuchFieldException("Get on performanceMode is not supported.")
    set(value) { this.withPerformanceMode(value) }

/**
 * @see software.amazon.awscdk.services.efs.CfnFileSystemProps.Builder.withProvisionedThroughputInMibps
 */
var software.amazon.awscdk.services.efs.CfnFileSystemProps.Builder.provisionedThroughputInMibps: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on provisionedThroughputInMibps is not supported.")
    set(value) { this.withProvisionedThroughputInMibps(value) }


/**
 * @see software.amazon.awscdk.services.efs.CfnMountTargetProps.Builder
 */
fun cfnMountTargetProps(init: software.amazon.awscdk.services.efs.CfnMountTargetProps.Builder.() -> Unit): software.amazon.awscdk.services.efs.CfnMountTargetProps {
    val builder = software.amazon.awscdk.services.efs.CfnMountTargetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.efs.CfnMountTargetProps.Builder.withSubnetId
 */
var software.amazon.awscdk.services.efs.CfnMountTargetProps.Builder.subnetId: String
    get() = throw NoSuchFieldException("Get on subnetId is not supported.")
    set(value) { this.withSubnetId(value) }

/**
 * @see software.amazon.awscdk.services.efs.CfnMountTargetProps.Builder.withIpAddress
 */
var software.amazon.awscdk.services.efs.CfnMountTargetProps.Builder.ipAddress: String
    get() = throw NoSuchFieldException("Get on ipAddress is not supported.")
    set(value) { this.withIpAddress(value) }

/**
 * @see software.amazon.awscdk.services.efs.CfnMountTargetProps.Builder.withFileSystemId
 */
var software.amazon.awscdk.services.efs.CfnMountTargetProps.Builder.fileSystemId: String
    get() = throw NoSuchFieldException("Get on fileSystemId is not supported.")
    set(value) { this.withFileSystemId(value) }


/**
 * @see software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty.Builder
 */
fun elasticFileSystemTagProperty(init: software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty.Builder.() -> Unit): software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty {
    val builder = software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty.Builder.withKey
 */
var software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty.Builder.withValue
 */
var software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }
