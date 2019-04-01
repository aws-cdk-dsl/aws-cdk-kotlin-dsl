package software.amazon.awscdk.dsl.services.s3.notifications

/**
 * @see software.amazon.awscdk.services.s3.notifications.BucketNotificationDestinationProps.Builder
 */
fun bucketNotificationDestinationProps(init: software.amazon.awscdk.services.s3.notifications.BucketNotificationDestinationProps.Builder.() -> Unit): software.amazon.awscdk.services.s3.notifications.BucketNotificationDestinationProps {
    val builder = software.amazon.awscdk.services.s3.notifications.BucketNotificationDestinationProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.notifications.BucketNotificationDestinationProps.Builder.withType
 */
var software.amazon.awscdk.services.s3.notifications.BucketNotificationDestinationProps.Builder.type: software.amazon.awscdk.services.s3.notifications.BucketNotificationDestinationType
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.s3.notifications.BucketNotificationDestinationProps.Builder.withArn
 */
var software.amazon.awscdk.services.s3.notifications.BucketNotificationDestinationProps.Builder.arn: String
    get() = throw NoSuchFieldException("Get on arn is not supported.")
    set(value) { this.withArn(value) }
