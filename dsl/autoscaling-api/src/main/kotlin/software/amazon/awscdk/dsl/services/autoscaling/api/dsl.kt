package software.amazon.awscdk.dsl.services.autoscaling.api

/**
 * @see software.amazon.awscdk.services.autoscaling.api.LifecycleHookTargetProps.Builder
 */
fun lifecycleHookTargetProps(init: software.amazon.awscdk.services.autoscaling.api.LifecycleHookTargetProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.api.LifecycleHookTargetProps {
    val builder = software.amazon.awscdk.services.autoscaling.api.LifecycleHookTargetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.api.LifecycleHookTargetProps.Builder.withNotificationTargetArn
 */
var software.amazon.awscdk.services.autoscaling.api.LifecycleHookTargetProps.Builder.notificationTargetArn: String
    get() = throw NoSuchFieldException("Get on notificationTargetArn is not supported.")
    set(value) { this.withNotificationTargetArn(value) }
