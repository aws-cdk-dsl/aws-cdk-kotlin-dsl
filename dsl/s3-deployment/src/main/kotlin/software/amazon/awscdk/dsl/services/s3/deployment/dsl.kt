package software.amazon.awscdk.dsl.services.s3.deployment
/**
 * @see software.amazon.awscdk.services.s3.deployment.BucketDeployment
 */
fun software.amazon.awscdk.Construct.bucketDeployment(id: String,
                     props: software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps? = null,
                     init: (software.amazon.awscdk.services.s3.deployment.BucketDeployment.() -> Unit)? = null)
        : software.amazon.awscdk.services.s3.deployment.BucketDeployment {

    val obj = software.amazon.awscdk.services.s3.deployment.BucketDeployment(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps.Builder
 */
fun bucketDeploymentProps(init: software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps.Builder.() -> Unit): software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps {
    val builder = software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps.Builder.withSource
 */
var software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps.Builder.source: software.amazon.awscdk.services.s3.deployment.ISource
    get() = throw NoSuchFieldException("Get on source is not supported.")
    set(value) { this.withSource(value) }

/**
 * @see software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps.Builder.withDestinationBucket
 */
var software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps.Builder.destinationBucket: software.amazon.awscdk.services.s3.IBucket
    get() = throw NoSuchFieldException("Get on destinationBucket is not supported.")
    set(value) { this.withDestinationBucket(value) }

/**
 * @see software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps.Builder.withDestinationKeyPrefix
 */
var software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps.Builder.destinationKeyPrefix: String
    get() = throw NoSuchFieldException("Get on destinationKeyPrefix is not supported.")
    set(value) { this.withDestinationKeyPrefix(value) }

/**
 * @see software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps.Builder.withRetainOnDelete
 */
var software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps.Builder.retainOnDelete: Boolean
    get() = throw NoSuchFieldException("Get on retainOnDelete is not supported.")
    set(value) { this.withRetainOnDelete(value) }


/**
 * @see software.amazon.awscdk.services.s3.deployment.SourceProps.Builder
 */
fun sourceProps(init: software.amazon.awscdk.services.s3.deployment.SourceProps.Builder.() -> Unit): software.amazon.awscdk.services.s3.deployment.SourceProps {
    val builder = software.amazon.awscdk.services.s3.deployment.SourceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.deployment.SourceProps.Builder.withZipObjectKey
 */
var software.amazon.awscdk.services.s3.deployment.SourceProps.Builder.zipObjectKey: String
    get() = throw NoSuchFieldException("Get on zipObjectKey is not supported.")
    set(value) { this.withZipObjectKey(value) }

/**
 * @see software.amazon.awscdk.services.s3.deployment.SourceProps.Builder.withBucket
 */
var software.amazon.awscdk.services.s3.deployment.SourceProps.Builder.bucket: software.amazon.awscdk.services.s3.IBucket
    get() = throw NoSuchFieldException("Get on bucket is not supported.")
    set(value) { this.withBucket(value) }
