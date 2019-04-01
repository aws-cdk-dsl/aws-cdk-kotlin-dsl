package software.amazon.awscdk.dsl.services.autoscaling
/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroup
 */
fun software.amazon.awscdk.Construct.autoScalingGroup(id: String,
                     props: software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps? = null,
                     init: (software.amazon.awscdk.services.autoscaling.AutoScalingGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.autoscaling.AutoScalingGroup {

    val obj = software.amazon.awscdk.services.autoscaling.AutoScalingGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.autoscaling.StepScalingPolicy
 */
fun software.amazon.awscdk.Construct.stepScalingPolicy(id: String,
                     props: software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps? = null,
                     init: (software.amazon.awscdk.services.autoscaling.StepScalingPolicy.() -> Unit)? = null)
        : software.amazon.awscdk.services.autoscaling.StepScalingPolicy {

    val obj = software.amazon.awscdk.services.autoscaling.StepScalingPolicy(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.autoscaling.StepScalingAction
 */
fun software.amazon.awscdk.Construct.stepScalingAction(id: String,
                     props: software.amazon.awscdk.services.autoscaling.StepScalingActionProps? = null,
                     init: (software.amazon.awscdk.services.autoscaling.StepScalingAction.() -> Unit)? = null)
        : software.amazon.awscdk.services.autoscaling.StepScalingAction {

    val obj = software.amazon.awscdk.services.autoscaling.StepScalingAction(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.autoscaling.LifecycleHook
 */
fun software.amazon.awscdk.Construct.lifecycleHook(id: String,
                     props: software.amazon.awscdk.services.autoscaling.LifecycleHookProps? = null,
                     init: (software.amazon.awscdk.services.autoscaling.LifecycleHook.() -> Unit)? = null)
        : software.amazon.awscdk.services.autoscaling.LifecycleHook {

    val obj = software.amazon.awscdk.services.autoscaling.LifecycleHook(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScheduledAction
 */
fun software.amazon.awscdk.Construct.cfnScheduledAction(id: String,
                     props: software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps? = null,
                     init: (software.amazon.awscdk.services.autoscaling.CfnScheduledAction.() -> Unit)? = null)
        : software.amazon.awscdk.services.autoscaling.CfnScheduledAction {

    val obj = software.amazon.awscdk.services.autoscaling.CfnScheduledAction(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy
 */
fun software.amazon.awscdk.Construct.targetTrackingScalingPolicy(id: String,
                     props: software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps? = null,
                     init: (software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy.() -> Unit)? = null)
        : software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy {

    val obj = software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup
 */
fun software.amazon.awscdk.Construct.cfnAutoScalingGroup(id: String,
                     props: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps? = null,
                     init: (software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup {

    val obj = software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy
 */
fun software.amazon.awscdk.Construct.cfnScalingPolicy(id: String,
                     props: software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps? = null,
                     init: (software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.() -> Unit)? = null)
        : software.amazon.awscdk.services.autoscaling.CfnScalingPolicy {

    val obj = software.amazon.awscdk.services.autoscaling.CfnScalingPolicy(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.autoscaling.ScheduledAction
 */
fun software.amazon.awscdk.Construct.scheduledAction(id: String,
                     props: software.amazon.awscdk.services.autoscaling.ScheduledActionProps? = null,
                     init: (software.amazon.awscdk.services.autoscaling.ScheduledAction.() -> Unit)? = null)
        : software.amazon.awscdk.services.autoscaling.ScheduledAction {

    val obj = software.amazon.awscdk.services.autoscaling.ScheduledAction(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration
 */
fun software.amazon.awscdk.Construct.cfnLaunchConfiguration(id: String,
                     props: software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps? = null,
                     init: (software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.() -> Unit)? = null)
        : software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration {

    val obj = software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLifecycleHook
 */
fun software.amazon.awscdk.Construct.cfnLifecycleHook(id: String,
                     props: software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps? = null,
                     init: (software.amazon.awscdk.services.autoscaling.CfnLifecycleHook.() -> Unit)? = null)
        : software.amazon.awscdk.services.autoscaling.CfnLifecycleHook {

    val obj = software.amazon.awscdk.services.autoscaling.CfnLifecycleHook(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder
 */
fun cfnScheduledActionProps(init: software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps {
    val builder = software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder.withEndTime
 */
var software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder.endTime: String
    get() = throw NoSuchFieldException("Get on endTime is not supported.")
    set(value) { this.withEndTime(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder.withStartTime
 */
var software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder.startTime: String
    get() = throw NoSuchFieldException("Get on startTime is not supported.")
    set(value) { this.withStartTime(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder.withDesiredCapacity
 */
var software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder.desiredCapacity: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on desiredCapacity is not supported.")
    set(value) { this.withDesiredCapacity(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder.withMaxSize
 */
var software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder.maxSize: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on maxSize is not supported.")
    set(value) { this.withMaxSize(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder.withMinSize
 */
var software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder.minSize: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on minSize is not supported.")
    set(value) { this.withMinSize(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder.withAutoScalingGroupName
 */
var software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder.autoScalingGroupName: String
    get() = throw NoSuchFieldException("Get on autoScalingGroupName is not supported.")
    set(value) { this.withAutoScalingGroupName(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder.withRecurrence
 */
var software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder.recurrence: String
    get() = throw NoSuchFieldException("Get on recurrence is not supported.")
    set(value) { this.withRecurrence(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder
 */
fun lifecycleHookSpecificationProperty(init: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty {
    val builder = software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder.withLifecycleTransition
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder.lifecycleTransition: String
    get() = throw NoSuchFieldException("Get on lifecycleTransition is not supported.")
    set(value) { this.withLifecycleTransition(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder.withDefaultResult
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder.defaultResult: String
    get() = throw NoSuchFieldException("Get on defaultResult is not supported.")
    set(value) { this.withDefaultResult(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder.withLifecycleHookName
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder.lifecycleHookName: String
    get() = throw NoSuchFieldException("Get on lifecycleHookName is not supported.")
    set(value) { this.withLifecycleHookName(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder.withNotificationMetadata
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder.notificationMetadata: String
    get() = throw NoSuchFieldException("Get on notificationMetadata is not supported.")
    set(value) { this.withNotificationMetadata(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder.withNotificationTargetArn
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder.notificationTargetArn: String
    get() = throw NoSuchFieldException("Get on notificationTargetArn is not supported.")
    set(value) { this.withNotificationTargetArn(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder.withHeartbeatTimeout
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder.heartbeatTimeout: Number
    get() = throw NoSuchFieldException("Get on heartbeatTimeout is not supported.")
    set(value) { this.withHeartbeatTimeout(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.StepScalingActionProps.Builder
 */
fun stepScalingActionProps(init: software.amazon.awscdk.services.autoscaling.StepScalingActionProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.StepScalingActionProps {
    val builder = software.amazon.awscdk.services.autoscaling.StepScalingActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.StepScalingActionProps.Builder.withEstimatedInstanceWarmupSeconds
 */
var software.amazon.awscdk.services.autoscaling.StepScalingActionProps.Builder.estimatedInstanceWarmupSeconds: Number
    get() = throw NoSuchFieldException("Get on estimatedInstanceWarmupSeconds is not supported.")
    set(value) { this.withEstimatedInstanceWarmupSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.StepScalingActionProps.Builder.withCooldownSeconds
 */
var software.amazon.awscdk.services.autoscaling.StepScalingActionProps.Builder.cooldownSeconds: Number
    get() = throw NoSuchFieldException("Get on cooldownSeconds is not supported.")
    set(value) { this.withCooldownSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.StepScalingActionProps.Builder.withMinAdjustmentMagnitude
 */
var software.amazon.awscdk.services.autoscaling.StepScalingActionProps.Builder.minAdjustmentMagnitude: Number
    get() = throw NoSuchFieldException("Get on minAdjustmentMagnitude is not supported.")
    set(value) { this.withMinAdjustmentMagnitude(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.StepScalingActionProps.Builder.withAutoScalingGroup
 */
var software.amazon.awscdk.services.autoscaling.StepScalingActionProps.Builder.autoScalingGroup: software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
    get() = throw NoSuchFieldException("Get on autoScalingGroup is not supported.")
    set(value) { this.withAutoScalingGroup(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.StepScalingActionProps.Builder.withMetricAggregationType
 */
var software.amazon.awscdk.services.autoscaling.StepScalingActionProps.Builder.metricAggregationType: software.amazon.awscdk.services.autoscaling.MetricAggregationType
    get() = throw NoSuchFieldException("Get on metricAggregationType is not supported.")
    set(value) { this.withMetricAggregationType(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.StepScalingActionProps.Builder.withAdjustmentType
 */
var software.amazon.awscdk.services.autoscaling.StepScalingActionProps.Builder.adjustmentType: software.amazon.awscdk.services.autoscaling.AdjustmentType
    get() = throw NoSuchFieldException("Get on adjustmentType is not supported.")
    set(value) { this.withAdjustmentType(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.Builder
 */
fun blockDeviceProperty(init: software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty {
    val builder = software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.Builder.withVolumeType
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.Builder.volumeType: String
    get() = throw NoSuchFieldException("Get on volumeType is not supported.")
    set(value) { this.withVolumeType(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.Builder.withIops
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.Builder.iops: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on iops is not supported.")
    set(value) { this.withIops(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.Builder.withDeleteOnTermination
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.Builder.deleteOnTermination: Boolean
    get() = throw NoSuchFieldException("Get on deleteOnTermination is not supported.")
    set(value) { this.withDeleteOnTermination(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.Builder.withEncrypted
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.Builder.encrypted: Boolean
    get() = throw NoSuchFieldException("Get on encrypted is not supported.")
    set(value) { this.withEncrypted(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.Builder.withSnapshotId
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.Builder.snapshotId: String
    get() = throw NoSuchFieldException("Get on snapshotId is not supported.")
    set(value) { this.withSnapshotId(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.Builder.withVolumeSize
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.Builder.volumeSize: Number
    get() = throw NoSuchFieldException("Get on volumeSize is not supported.")
    set(value) { this.withVolumeSize(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.Builder
 */
fun instancesDistributionProperty(init: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty {
    val builder = software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.Builder.withOnDemandAllocationStrategy
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.Builder.onDemandAllocationStrategy: String
    get() = throw NoSuchFieldException("Get on onDemandAllocationStrategy is not supported.")
    set(value) { this.withOnDemandAllocationStrategy(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.Builder.withOnDemandBaseCapacity
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.Builder.onDemandBaseCapacity: Number
    get() = throw NoSuchFieldException("Get on onDemandBaseCapacity is not supported.")
    set(value) { this.withOnDemandBaseCapacity(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.Builder.withOnDemandPercentageAboveBaseCapacity
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.Builder.onDemandPercentageAboveBaseCapacity: Number
    get() = throw NoSuchFieldException("Get on onDemandPercentageAboveBaseCapacity is not supported.")
    set(value) { this.withOnDemandPercentageAboveBaseCapacity(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.Builder.withSpotAllocationStrategy
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.Builder.spotAllocationStrategy: String
    get() = throw NoSuchFieldException("Get on spotAllocationStrategy is not supported.")
    set(value) { this.withSpotAllocationStrategy(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.Builder.withSpotInstancePools
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.Builder.spotInstancePools: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on spotInstancePools is not supported.")
    set(value) { this.withSpotInstancePools(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.Builder.withSpotMaxPrice
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.Builder.spotMaxPrice: String
    get() = throw NoSuchFieldException("Get on spotMaxPrice is not supported.")
    set(value) { this.withSpotMaxPrice(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty.Builder
 */
fun launchTemplateProperty(init: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty {
    val builder = software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty.Builder.withLaunchTemplateSpecification
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty.Builder.launchTemplateSpecification: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on launchTemplateSpecification is not supported.")
    set(value) { this.withLaunchTemplateSpecification(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty.Builder.withOverrides
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty.Builder.overrides: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on overrides is not supported.")
    set(value) { this.withOverrides(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder
 */
fun metricDimensionProperty(init: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty {
    val builder = software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder.withValue
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder.withName
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder
 */
fun customizedMetricSpecificationProperty(init: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty {
    val builder = software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.withNamespace
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.namespace: String
    get() = throw NoSuchFieldException("Get on namespace is not supported.")
    set(value) { this.withNamespace(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.withUnit
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.unit: String
    get() = throw NoSuchFieldException("Get on unit is not supported.")
    set(value) { this.withUnit(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.withDimensions
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.dimensions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on dimensions is not supported.")
    set(value) { this.withDimensions(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.withStatistic
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.statistic: String
    get() = throw NoSuchFieldException("Get on statistic is not supported.")
    set(value) { this.withStatistic(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.withMetricName
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.metricName: String
    get() = throw NoSuchFieldException("Get on metricName is not supported.")
    set(value) { this.withMetricName(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps.Builder
 */
fun baseTargetTrackingProps(init: software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps {
    val builder = software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps.Builder.withEstimatedInstanceWarmupSeconds
 */
var software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps.Builder.estimatedInstanceWarmupSeconds: Number
    get() = throw NoSuchFieldException("Get on estimatedInstanceWarmupSeconds is not supported.")
    set(value) { this.withEstimatedInstanceWarmupSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps.Builder.withCooldownSeconds
 */
var software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps.Builder.cooldownSeconds: Number
    get() = throw NoSuchFieldException("Get on cooldownSeconds is not supported.")
    set(value) { this.withCooldownSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps.Builder.withDisableScaleIn
 */
var software.amazon.awscdk.services.autoscaling.BaseTargetTrackingProps.Builder.disableScaleIn: Boolean
    get() = throw NoSuchFieldException("Get on disableScaleIn is not supported.")
    set(value) { this.withDisableScaleIn(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.AdjustmentTier.Builder
 */
fun adjustmentTier(init: software.amazon.awscdk.services.autoscaling.AdjustmentTier.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.AdjustmentTier {
    val builder = software.amazon.awscdk.services.autoscaling.AdjustmentTier.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.AdjustmentTier.Builder.withAdjustment
 */
var software.amazon.awscdk.services.autoscaling.AdjustmentTier.Builder.adjustment: Number
    get() = throw NoSuchFieldException("Get on adjustment is not supported.")
    set(value) { this.withAdjustment(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AdjustmentTier.Builder.withLowerBound
 */
var software.amazon.awscdk.services.autoscaling.AdjustmentTier.Builder.lowerBound: Number
    get() = throw NoSuchFieldException("Get on lowerBound is not supported.")
    set(value) { this.withLowerBound(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AdjustmentTier.Builder.withUpperBound
 */
var software.amazon.awscdk.services.autoscaling.AdjustmentTier.Builder.upperBound: Number
    get() = throw NoSuchFieldException("Get on upperBound is not supported.")
    set(value) { this.withUpperBound(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder
 */
fun stepAdjustmentProperty(init: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty {
    val builder = software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder.withScalingAdjustment
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder.scalingAdjustment: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on scalingAdjustment is not supported.")
    set(value) { this.withScalingAdjustment(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder.withMetricIntervalLowerBound
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder.metricIntervalLowerBound: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on metricIntervalLowerBound is not supported.")
    set(value) { this.withMetricIntervalLowerBound(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder.withMetricIntervalUpperBound
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder.metricIntervalUpperBound: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on metricIntervalUpperBound is not supported.")
    set(value) { this.withMetricIntervalUpperBound(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty.Builder
 */
fun mixedInstancesPolicyProperty(init: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty {
    val builder = software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty.Builder.withLaunchTemplate
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty.Builder.launchTemplate: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on launchTemplate is not supported.")
    set(value) { this.withLaunchTemplate(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty.Builder.withInstancesDistribution
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty.Builder.instancesDistribution: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty
    get() = throw NoSuchFieldException("Get on instancesDistribution is not supported.")
    set(value) { this.withInstancesDistribution(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder
 */
fun cfnLifecycleHookProps(init: software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps {
    val builder = software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder.withRoleArn
 */
var software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder.withAutoScalingGroupName
 */
var software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder.autoScalingGroupName: String
    get() = throw NoSuchFieldException("Get on autoScalingGroupName is not supported.")
    set(value) { this.withAutoScalingGroupName(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder.withLifecycleTransition
 */
var software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder.lifecycleTransition: String
    get() = throw NoSuchFieldException("Get on lifecycleTransition is not supported.")
    set(value) { this.withLifecycleTransition(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder.withDefaultResult
 */
var software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder.defaultResult: String
    get() = throw NoSuchFieldException("Get on defaultResult is not supported.")
    set(value) { this.withDefaultResult(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder.withLifecycleHookName
 */
var software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder.lifecycleHookName: String
    get() = throw NoSuchFieldException("Get on lifecycleHookName is not supported.")
    set(value) { this.withLifecycleHookName(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder.withNotificationMetadata
 */
var software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder.notificationMetadata: String
    get() = throw NoSuchFieldException("Get on notificationMetadata is not supported.")
    set(value) { this.withNotificationMetadata(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder.withNotificationTargetArn
 */
var software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder.notificationTargetArn: String
    get() = throw NoSuchFieldException("Get on notificationTargetArn is not supported.")
    set(value) { this.withNotificationTargetArn(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder.withHeartbeatTimeout
 */
var software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder.heartbeatTimeout: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on heartbeatTimeout is not supported.")
    set(value) { this.withHeartbeatTimeout(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder
 */
fun targetTrackingConfigurationProperty(init: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty {
    val builder = software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder.withTargetValue
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder.targetValue: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on targetValue is not supported.")
    set(value) { this.withTargetValue(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder.withDisableScaleIn
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder.disableScaleIn: Boolean
    get() = throw NoSuchFieldException("Get on disableScaleIn is not supported.")
    set(value) { this.withDisableScaleIn(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder.withPredefinedMetricSpecification
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder.predefinedMetricSpecification: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on predefinedMetricSpecification is not supported.")
    set(value) { this.withPredefinedMetricSpecification(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder.withCustomizedMetricSpecification
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder.customizedMetricSpecification: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty
    get() = throw NoSuchFieldException("Get on customizedMetricSpecification is not supported.")
    set(value) { this.withCustomizedMetricSpecification(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder
 */
fun cfnAutoScalingGroupProps(init: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps {
    val builder = software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.withDesiredCapacity
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.desiredCapacity: String
    get() = throw NoSuchFieldException("Get on desiredCapacity is not supported.")
    set(value) { this.withDesiredCapacity(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.withInstanceId
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.instanceId: String
    get() = throw NoSuchFieldException("Get on instanceId is not supported.")
    set(value) { this.withInstanceId(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.withMaxSize
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.maxSize: String
    get() = throw NoSuchFieldException("Get on maxSize is not supported.")
    set(value) { this.withMaxSize(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.withMinSize
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.minSize: String
    get() = throw NoSuchFieldException("Get on minSize is not supported.")
    set(value) { this.withMinSize(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.withAutoScalingGroupName
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.autoScalingGroupName: String
    get() = throw NoSuchFieldException("Get on autoScalingGroupName is not supported.")
    set(value) { this.withAutoScalingGroupName(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.withHealthCheckGracePeriod
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.healthCheckGracePeriod: Number
    get() = throw NoSuchFieldException("Get on healthCheckGracePeriod is not supported.")
    set(value) { this.withHealthCheckGracePeriod(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.withHealthCheckType
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.healthCheckType: String
    get() = throw NoSuchFieldException("Get on healthCheckType is not supported.")
    set(value) { this.withHealthCheckType(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.withLaunchConfigurationName
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.launchConfigurationName: String
    get() = throw NoSuchFieldException("Get on launchConfigurationName is not supported.")
    set(value) { this.withLaunchConfigurationName(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.withLaunchTemplate
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.launchTemplate: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty
    get() = throw NoSuchFieldException("Get on launchTemplate is not supported.")
    set(value) { this.withLaunchTemplate(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.withLifecycleHookSpecificationList
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.lifecycleHookSpecificationList: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on lifecycleHookSpecificationList is not supported.")
    set(value) { this.withLifecycleHookSpecificationList(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.withMetricsCollection
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.metricsCollection: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on metricsCollection is not supported.")
    set(value) { this.withMetricsCollection(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.withMixedInstancesPolicy
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.mixedInstancesPolicy: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty
    get() = throw NoSuchFieldException("Get on mixedInstancesPolicy is not supported.")
    set(value) { this.withMixedInstancesPolicy(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.withNotificationConfigurations
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.notificationConfigurations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on notificationConfigurations is not supported.")
    set(value) { this.withNotificationConfigurations(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.withPlacementGroup
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.placementGroup: String
    get() = throw NoSuchFieldException("Get on placementGroup is not supported.")
    set(value) { this.withPlacementGroup(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.withServiceLinkedRoleArn
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.serviceLinkedRoleArn: String
    get() = throw NoSuchFieldException("Get on serviceLinkedRoleArn is not supported.")
    set(value) { this.withServiceLinkedRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.withCooldown
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroupProps.Builder.cooldown: String
    get() = throw NoSuchFieldException("Get on cooldown is not supported.")
    set(value) { this.withCooldown(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty.Builder
 */
fun tagPropertyProperty(init: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty {
    val builder = software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty.Builder.withKey
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty.Builder.withValue
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty.Builder.withPropagateAtLaunch
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TagPropertyProperty.Builder.propagateAtLaunch: Boolean
    get() = throw NoSuchFieldException("Get on propagateAtLaunch is not supported.")
    set(value) { this.withPropagateAtLaunch(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder
 */
fun targetTrackingScalingPolicyProps(init: software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps {
    val builder = software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder.withEstimatedInstanceWarmupSeconds
 */
var software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder.estimatedInstanceWarmupSeconds: Number
    get() = throw NoSuchFieldException("Get on estimatedInstanceWarmupSeconds is not supported.")
    set(value) { this.withEstimatedInstanceWarmupSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder.withCooldownSeconds
 */
var software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder.cooldownSeconds: Number
    get() = throw NoSuchFieldException("Get on cooldownSeconds is not supported.")
    set(value) { this.withCooldownSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder.withCustomMetric
 */
var software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder.customMetric: software.amazon.awscdk.services.cloudwatch.Metric
    get() = throw NoSuchFieldException("Get on customMetric is not supported.")
    set(value) { this.withCustomMetric(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder.withTargetValue
 */
var software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder.targetValue: Number
    get() = throw NoSuchFieldException("Get on targetValue is not supported.")
    set(value) { this.withTargetValue(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder.withDisableScaleIn
 */
var software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder.disableScaleIn: Boolean
    get() = throw NoSuchFieldException("Get on disableScaleIn is not supported.")
    set(value) { this.withDisableScaleIn(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder.withResourceLabel
 */
var software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder.resourceLabel: String
    get() = throw NoSuchFieldException("Get on resourceLabel is not supported.")
    set(value) { this.withResourceLabel(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder.withPredefinedMetric
 */
var software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder.predefinedMetric: software.amazon.awscdk.services.autoscaling.PredefinedMetric
    get() = throw NoSuchFieldException("Get on predefinedMetric is not supported.")
    set(value) { this.withPredefinedMetric(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder.withAutoScalingGroup
 */
var software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicyProps.Builder.autoScalingGroup: software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
    get() = throw NoSuchFieldException("Get on autoScalingGroup is not supported.")
    set(value) { this.withAutoScalingGroup(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty.Builder
 */
fun metricsCollectionProperty(init: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty {
    val builder = software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty.Builder.withGranularity
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty.Builder.granularity: String
    get() = throw NoSuchFieldException("Get on granularity is not supported.")
    set(value) { this.withGranularity(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder
 */
fun commonAutoScalingGroupProps(init: software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps {
    val builder = software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.withAllowAllOutbound
 */
var software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.allowAllOutbound: Boolean
    get() = throw NoSuchFieldException("Get on allowAllOutbound is not supported.")
    set(value) { this.withAllowAllOutbound(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.withAssociatePublicIpAddress
 */
var software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.associatePublicIpAddress: Boolean
    get() = throw NoSuchFieldException("Get on associatePublicIpAddress is not supported.")
    set(value) { this.withAssociatePublicIpAddress(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.withCooldownSeconds
 */
var software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.cooldownSeconds: Number
    get() = throw NoSuchFieldException("Get on cooldownSeconds is not supported.")
    set(value) { this.withCooldownSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.withDesiredCapacity
 */
var software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.desiredCapacity: Number
    get() = throw NoSuchFieldException("Get on desiredCapacity is not supported.")
    set(value) { this.withDesiredCapacity(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.withIgnoreUnmodifiedSizeProperties
 */
var software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.ignoreUnmodifiedSizeProperties: Boolean
    get() = throw NoSuchFieldException("Get on ignoreUnmodifiedSizeProperties is not supported.")
    set(value) { this.withIgnoreUnmodifiedSizeProperties(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.withKeyName
 */
var software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.keyName: String
    get() = throw NoSuchFieldException("Get on keyName is not supported.")
    set(value) { this.withKeyName(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.withMaxCapacity
 */
var software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.maxCapacity: Number
    get() = throw NoSuchFieldException("Get on maxCapacity is not supported.")
    set(value) { this.withMaxCapacity(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.withMinCapacity
 */
var software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.minCapacity: Number
    get() = throw NoSuchFieldException("Get on minCapacity is not supported.")
    set(value) { this.withMinCapacity(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.withNotificationsTopic
 */
var software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.notificationsTopic: software.amazon.awscdk.services.sns.ITopic
    get() = throw NoSuchFieldException("Get on notificationsTopic is not supported.")
    set(value) { this.withNotificationsTopic(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.withReplacingUpdateMinSuccessfulInstancesPercent
 */
var software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.replacingUpdateMinSuccessfulInstancesPercent: Number
    get() = throw NoSuchFieldException("Get on replacingUpdateMinSuccessfulInstancesPercent is not supported.")
    set(value) { this.withReplacingUpdateMinSuccessfulInstancesPercent(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.withResourceSignalCount
 */
var software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.resourceSignalCount: Number
    get() = throw NoSuchFieldException("Get on resourceSignalCount is not supported.")
    set(value) { this.withResourceSignalCount(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.withResourceSignalTimeoutSec
 */
var software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.resourceSignalTimeoutSec: Number
    get() = throw NoSuchFieldException("Get on resourceSignalTimeoutSec is not supported.")
    set(value) { this.withResourceSignalTimeoutSec(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.withRollingUpdateConfiguration
 */
var software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.rollingUpdateConfiguration: software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration
    get() = throw NoSuchFieldException("Get on rollingUpdateConfiguration is not supported.")
    set(value) { this.withRollingUpdateConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.withUpdateType
 */
var software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.updateType: software.amazon.awscdk.services.autoscaling.UpdateType
    get() = throw NoSuchFieldException("Get on updateType is not supported.")
    set(value) { this.withUpdateType(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.withVpcSubnets
 */
var software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder.vpcSubnets: software.amazon.awscdk.services.ec2.SubnetSelection
    get() = throw NoSuchFieldException("Get on vpcSubnets is not supported.")
    set(value) { this.withVpcSubnets(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps.Builder
 */
fun stepScalingPolicyProps(init: software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps {
    val builder = software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps.Builder.withEstimatedInstanceWarmupSeconds
 */
var software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps.Builder.estimatedInstanceWarmupSeconds: Number
    get() = throw NoSuchFieldException("Get on estimatedInstanceWarmupSeconds is not supported.")
    set(value) { this.withEstimatedInstanceWarmupSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps.Builder.withCooldownSeconds
 */
var software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps.Builder.cooldownSeconds: Number
    get() = throw NoSuchFieldException("Get on cooldownSeconds is not supported.")
    set(value) { this.withCooldownSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps.Builder.withMinAdjustmentMagnitude
 */
var software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps.Builder.minAdjustmentMagnitude: Number
    get() = throw NoSuchFieldException("Get on minAdjustmentMagnitude is not supported.")
    set(value) { this.withMinAdjustmentMagnitude(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps.Builder.withAutoScalingGroup
 */
var software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps.Builder.autoScalingGroup: software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
    get() = throw NoSuchFieldException("Get on autoScalingGroup is not supported.")
    set(value) { this.withAutoScalingGroup(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps.Builder.withAdjustmentType
 */
var software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps.Builder.adjustmentType: software.amazon.awscdk.services.autoscaling.AdjustmentType
    get() = throw NoSuchFieldException("Get on adjustmentType is not supported.")
    set(value) { this.withAdjustmentType(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps.Builder.withMetric
 */
var software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps.Builder.metric: software.amazon.awscdk.services.cloudwatch.Metric
    get() = throw NoSuchFieldException("Get on metric is not supported.")
    set(value) { this.withMetric(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder
 */
fun autoScalingGroupProps(init: software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps {
    val builder = software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withInstanceType
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.instanceType: software.amazon.awscdk.services.ec2.InstanceType
    get() = throw NoSuchFieldException("Get on instanceType is not supported.")
    set(value) { this.withInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withAllowAllOutbound
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.allowAllOutbound: Boolean
    get() = throw NoSuchFieldException("Get on allowAllOutbound is not supported.")
    set(value) { this.withAllowAllOutbound(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withAssociatePublicIpAddress
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.associatePublicIpAddress: Boolean
    get() = throw NoSuchFieldException("Get on associatePublicIpAddress is not supported.")
    set(value) { this.withAssociatePublicIpAddress(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withCooldownSeconds
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.cooldownSeconds: Number
    get() = throw NoSuchFieldException("Get on cooldownSeconds is not supported.")
    set(value) { this.withCooldownSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withDesiredCapacity
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.desiredCapacity: Number
    get() = throw NoSuchFieldException("Get on desiredCapacity is not supported.")
    set(value) { this.withDesiredCapacity(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withIgnoreUnmodifiedSizeProperties
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.ignoreUnmodifiedSizeProperties: Boolean
    get() = throw NoSuchFieldException("Get on ignoreUnmodifiedSizeProperties is not supported.")
    set(value) { this.withIgnoreUnmodifiedSizeProperties(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withKeyName
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.keyName: String
    get() = throw NoSuchFieldException("Get on keyName is not supported.")
    set(value) { this.withKeyName(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withMaxCapacity
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.maxCapacity: Number
    get() = throw NoSuchFieldException("Get on maxCapacity is not supported.")
    set(value) { this.withMaxCapacity(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withMinCapacity
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.minCapacity: Number
    get() = throw NoSuchFieldException("Get on minCapacity is not supported.")
    set(value) { this.withMinCapacity(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withNotificationsTopic
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.notificationsTopic: software.amazon.awscdk.services.sns.ITopic
    get() = throw NoSuchFieldException("Get on notificationsTopic is not supported.")
    set(value) { this.withNotificationsTopic(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withReplacingUpdateMinSuccessfulInstancesPercent
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.replacingUpdateMinSuccessfulInstancesPercent: Number
    get() = throw NoSuchFieldException("Get on replacingUpdateMinSuccessfulInstancesPercent is not supported.")
    set(value) { this.withReplacingUpdateMinSuccessfulInstancesPercent(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withResourceSignalCount
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.resourceSignalCount: Number
    get() = throw NoSuchFieldException("Get on resourceSignalCount is not supported.")
    set(value) { this.withResourceSignalCount(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withResourceSignalTimeoutSec
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.resourceSignalTimeoutSec: Number
    get() = throw NoSuchFieldException("Get on resourceSignalTimeoutSec is not supported.")
    set(value) { this.withResourceSignalTimeoutSec(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withRollingUpdateConfiguration
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.rollingUpdateConfiguration: software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration
    get() = throw NoSuchFieldException("Get on rollingUpdateConfiguration is not supported.")
    set(value) { this.withRollingUpdateConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withUpdateType
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.updateType: software.amazon.awscdk.services.autoscaling.UpdateType
    get() = throw NoSuchFieldException("Get on updateType is not supported.")
    set(value) { this.withUpdateType(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withVpcSubnets
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.vpcSubnets: software.amazon.awscdk.services.ec2.SubnetSelection
    get() = throw NoSuchFieldException("Get on vpcSubnets is not supported.")
    set(value) { this.withVpcSubnets(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withRole
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withVpc
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.vpc: software.amazon.awscdk.services.ec2.IVpcNetwork
    get() = throw NoSuchFieldException("Get on vpc is not supported.")
    set(value) { this.withVpc(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.withMachineImage
 */
var software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder.machineImage: software.amazon.awscdk.services.ec2.IMachineImageSource
    get() = throw NoSuchFieldException("Get on machineImage is not supported.")
    set(value) { this.withMachineImage(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder
 */
fun cfnLaunchConfigurationProps(init: software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps {
    val builder = software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.withInstanceType
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.instanceType: String
    get() = throw NoSuchFieldException("Get on instanceType is not supported.")
    set(value) { this.withInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.withAssociatePublicIpAddress
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.associatePublicIpAddress: Boolean
    get() = throw NoSuchFieldException("Get on associatePublicIpAddress is not supported.")
    set(value) { this.withAssociatePublicIpAddress(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.withKeyName
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.keyName: String
    get() = throw NoSuchFieldException("Get on keyName is not supported.")
    set(value) { this.withKeyName(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.withInstanceId
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.instanceId: String
    get() = throw NoSuchFieldException("Get on instanceId is not supported.")
    set(value) { this.withInstanceId(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.withLaunchConfigurationName
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.launchConfigurationName: String
    get() = throw NoSuchFieldException("Get on launchConfigurationName is not supported.")
    set(value) { this.withLaunchConfigurationName(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.withIamInstanceProfile
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.iamInstanceProfile: String
    get() = throw NoSuchFieldException("Get on iamInstanceProfile is not supported.")
    set(value) { this.withIamInstanceProfile(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.withImageId
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.imageId: String
    get() = throw NoSuchFieldException("Get on imageId is not supported.")
    set(value) { this.withImageId(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.withKernelId
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.kernelId: String
    get() = throw NoSuchFieldException("Get on kernelId is not supported.")
    set(value) { this.withKernelId(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.withRamDiskId
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.ramDiskId: String
    get() = throw NoSuchFieldException("Get on ramDiskId is not supported.")
    set(value) { this.withRamDiskId(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.withUserData
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.userData: String
    get() = throw NoSuchFieldException("Get on userData is not supported.")
    set(value) { this.withUserData(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.withSpotPrice
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.spotPrice: String
    get() = throw NoSuchFieldException("Get on spotPrice is not supported.")
    set(value) { this.withSpotPrice(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.withBlockDeviceMappings
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.blockDeviceMappings: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on blockDeviceMappings is not supported.")
    set(value) { this.withBlockDeviceMappings(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.withEbsOptimized
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.ebsOptimized: Boolean
    get() = throw NoSuchFieldException("Get on ebsOptimized is not supported.")
    set(value) { this.withEbsOptimized(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.withInstanceMonitoring
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.instanceMonitoring: Boolean
    get() = throw NoSuchFieldException("Get on instanceMonitoring is not supported.")
    set(value) { this.withInstanceMonitoring(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.withClassicLinkVpcId
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.classicLinkVpcId: String
    get() = throw NoSuchFieldException("Get on classicLinkVpcId is not supported.")
    set(value) { this.withClassicLinkVpcId(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.withPlacementTenancy
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder.placementTenancy: String
    get() = throw NoSuchFieldException("Get on placementTenancy is not supported.")
    set(value) { this.withPlacementTenancy(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.Builder
 */
fun basicStepScalingPolicyProps(init: software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps {
    val builder = software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.Builder.withEstimatedInstanceWarmupSeconds
 */
var software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.Builder.estimatedInstanceWarmupSeconds: Number
    get() = throw NoSuchFieldException("Get on estimatedInstanceWarmupSeconds is not supported.")
    set(value) { this.withEstimatedInstanceWarmupSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.Builder.withCooldownSeconds
 */
var software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.Builder.cooldownSeconds: Number
    get() = throw NoSuchFieldException("Get on cooldownSeconds is not supported.")
    set(value) { this.withCooldownSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.Builder.withMinAdjustmentMagnitude
 */
var software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.Builder.minAdjustmentMagnitude: Number
    get() = throw NoSuchFieldException("Get on minAdjustmentMagnitude is not supported.")
    set(value) { this.withMinAdjustmentMagnitude(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.Builder.withAdjustmentType
 */
var software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.Builder.adjustmentType: software.amazon.awscdk.services.autoscaling.AdjustmentType
    get() = throw NoSuchFieldException("Get on adjustmentType is not supported.")
    set(value) { this.withAdjustmentType(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.Builder.withMetric
 */
var software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.Builder.metric: software.amazon.awscdk.services.cloudwatch.Metric
    get() = throw NoSuchFieldException("Get on metric is not supported.")
    set(value) { this.withMetric(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps.Builder
 */
fun networkUtilizationScalingProps(init: software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps {
    val builder = software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps.Builder.withEstimatedInstanceWarmupSeconds
 */
var software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps.Builder.estimatedInstanceWarmupSeconds: Number
    get() = throw NoSuchFieldException("Get on estimatedInstanceWarmupSeconds is not supported.")
    set(value) { this.withEstimatedInstanceWarmupSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps.Builder.withCooldownSeconds
 */
var software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps.Builder.cooldownSeconds: Number
    get() = throw NoSuchFieldException("Get on cooldownSeconds is not supported.")
    set(value) { this.withCooldownSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps.Builder.withDisableScaleIn
 */
var software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps.Builder.disableScaleIn: Boolean
    get() = throw NoSuchFieldException("Get on disableScaleIn is not supported.")
    set(value) { this.withDisableScaleIn(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps.Builder.withTargetBytesPerSecond
 */
var software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps.Builder.targetBytesPerSecond: Number
    get() = throw NoSuchFieldException("Get on targetBytesPerSecond is not supported.")
    set(value) { this.withTargetBytesPerSecond(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.RequestCountScalingProps.Builder
 */
fun requestCountScalingProps(init: software.amazon.awscdk.services.autoscaling.RequestCountScalingProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.RequestCountScalingProps {
    val builder = software.amazon.awscdk.services.autoscaling.RequestCountScalingProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.RequestCountScalingProps.Builder.withEstimatedInstanceWarmupSeconds
 */
var software.amazon.awscdk.services.autoscaling.RequestCountScalingProps.Builder.estimatedInstanceWarmupSeconds: Number
    get() = throw NoSuchFieldException("Get on estimatedInstanceWarmupSeconds is not supported.")
    set(value) { this.withEstimatedInstanceWarmupSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.RequestCountScalingProps.Builder.withCooldownSeconds
 */
var software.amazon.awscdk.services.autoscaling.RequestCountScalingProps.Builder.cooldownSeconds: Number
    get() = throw NoSuchFieldException("Get on cooldownSeconds is not supported.")
    set(value) { this.withCooldownSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.RequestCountScalingProps.Builder.withDisableScaleIn
 */
var software.amazon.awscdk.services.autoscaling.RequestCountScalingProps.Builder.disableScaleIn: Boolean
    get() = throw NoSuchFieldException("Get on disableScaleIn is not supported.")
    set(value) { this.withDisableScaleIn(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.RequestCountScalingProps.Builder.withTargetRequestsPerSecond
 */
var software.amazon.awscdk.services.autoscaling.RequestCountScalingProps.Builder.targetRequestsPerSecond: Number
    get() = throw NoSuchFieldException("Get on targetRequestsPerSecond is not supported.")
    set(value) { this.withTargetRequestsPerSecond(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty.Builder
 */
fun blockDeviceMappingProperty(init: software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty {
    val builder = software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty.Builder.withVirtualName
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty.Builder.virtualName: String
    get() = throw NoSuchFieldException("Get on virtualName is not supported.")
    set(value) { this.withVirtualName(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty.Builder.withDeviceName
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty.Builder.deviceName: String
    get() = throw NoSuchFieldException("Get on deviceName is not supported.")
    set(value) { this.withDeviceName(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty.Builder.withEbs
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty.Builder.ebs: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ebs is not supported.")
    set(value) { this.withEbs(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty.Builder.withNoDevice
 */
var software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty.Builder.noDevice: Boolean
    get() = throw NoSuchFieldException("Get on noDevice is not supported.")
    set(value) { this.withNoDevice(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder
 */
fun predefinedMetricSpecificationProperty(init: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty {
    val builder = software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder.withPredefinedMetricType
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder.predefinedMetricType: String
    get() = throw NoSuchFieldException("Get on predefinedMetricType is not supported.")
    set(value) { this.withPredefinedMetricType(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder.withResourceLabel
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder.resourceLabel: String
    get() = throw NoSuchFieldException("Get on resourceLabel is not supported.")
    set(value) { this.withResourceLabel(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps.Builder
 */
fun metricTargetTrackingProps(init: software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps {
    val builder = software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps.Builder.withEstimatedInstanceWarmupSeconds
 */
var software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps.Builder.estimatedInstanceWarmupSeconds: Number
    get() = throw NoSuchFieldException("Get on estimatedInstanceWarmupSeconds is not supported.")
    set(value) { this.withEstimatedInstanceWarmupSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps.Builder.withCooldownSeconds
 */
var software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps.Builder.cooldownSeconds: Number
    get() = throw NoSuchFieldException("Get on cooldownSeconds is not supported.")
    set(value) { this.withCooldownSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps.Builder.withTargetValue
 */
var software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps.Builder.targetValue: Number
    get() = throw NoSuchFieldException("Get on targetValue is not supported.")
    set(value) { this.withTargetValue(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps.Builder.withDisableScaleIn
 */
var software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps.Builder.disableScaleIn: Boolean
    get() = throw NoSuchFieldException("Get on disableScaleIn is not supported.")
    set(value) { this.withDisableScaleIn(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps.Builder.withMetric
 */
var software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps.Builder.metric: software.amazon.awscdk.services.cloudwatch.Metric
    get() = throw NoSuchFieldException("Get on metric is not supported.")
    set(value) { this.withMetric(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder
 */
fun basicScheduledActionProps(init: software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps {
    val builder = software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder.withEndTime
 */
var software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder.endTime: java.time.Instant
    get() = throw NoSuchFieldException("Get on endTime is not supported.")
    set(value) { this.withEndTime(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder.withStartTime
 */
var software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder.startTime: java.time.Instant
    get() = throw NoSuchFieldException("Get on startTime is not supported.")
    set(value) { this.withStartTime(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder.withDesiredCapacity
 */
var software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder.desiredCapacity: Number
    get() = throw NoSuchFieldException("Get on desiredCapacity is not supported.")
    set(value) { this.withDesiredCapacity(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder.withMaxCapacity
 */
var software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder.maxCapacity: Number
    get() = throw NoSuchFieldException("Get on maxCapacity is not supported.")
    set(value) { this.withMaxCapacity(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder.withMinCapacity
 */
var software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder.minCapacity: Number
    get() = throw NoSuchFieldException("Get on minCapacity is not supported.")
    set(value) { this.withMinCapacity(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder.withSchedule
 */
var software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder.schedule: String
    get() = throw NoSuchFieldException("Get on schedule is not supported.")
    set(value) { this.withSchedule(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration.Builder
 */
fun rollingUpdateConfiguration(init: software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration {
    val builder = software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration.Builder.withMinSuccessfulInstancesPercent
 */
var software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration.Builder.minSuccessfulInstancesPercent: Number
    get() = throw NoSuchFieldException("Get on minSuccessfulInstancesPercent is not supported.")
    set(value) { this.withMinSuccessfulInstancesPercent(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration.Builder.withMaxBatchSize
 */
var software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration.Builder.maxBatchSize: Number
    get() = throw NoSuchFieldException("Get on maxBatchSize is not supported.")
    set(value) { this.withMaxBatchSize(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration.Builder.withMinInstancesInService
 */
var software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration.Builder.minInstancesInService: Number
    get() = throw NoSuchFieldException("Get on minInstancesInService is not supported.")
    set(value) { this.withMinInstancesInService(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration.Builder.withPauseTimeSec
 */
var software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration.Builder.pauseTimeSec: Number
    get() = throw NoSuchFieldException("Get on pauseTimeSec is not supported.")
    set(value) { this.withPauseTimeSec(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration.Builder.withWaitOnResourceSignals
 */
var software.amazon.awscdk.services.autoscaling.RollingUpdateConfiguration.Builder.waitOnResourceSignals: Boolean
    get() = throw NoSuchFieldException("Get on waitOnResourceSignals is not supported.")
    set(value) { this.withWaitOnResourceSignals(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.ScalingInterval.Builder
 */
fun scalingInterval(init: software.amazon.awscdk.services.autoscaling.ScalingInterval.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.ScalingInterval {
    val builder = software.amazon.awscdk.services.autoscaling.ScalingInterval.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.ScalingInterval.Builder.withChange
 */
var software.amazon.awscdk.services.autoscaling.ScalingInterval.Builder.change: Number
    get() = throw NoSuchFieldException("Get on change is not supported.")
    set(value) { this.withChange(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.ScalingInterval.Builder.withLower
 */
var software.amazon.awscdk.services.autoscaling.ScalingInterval.Builder.lower: Number
    get() = throw NoSuchFieldException("Get on lower is not supported.")
    set(value) { this.withLower(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.ScalingInterval.Builder.withUpper
 */
var software.amazon.awscdk.services.autoscaling.ScalingInterval.Builder.upper: Number
    get() = throw NoSuchFieldException("Get on upper is not supported.")
    set(value) { this.withUpper(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty.Builder
 */
fun notificationConfigurationProperty(init: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty {
    val builder = software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty.Builder.withTopicArn
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty.Builder.topicArn: String
    get() = throw NoSuchFieldException("Get on topicArn is not supported.")
    set(value) { this.withTopicArn(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder
 */
fun launchTemplateSpecificationProperty(init: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty {
    val builder = software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder.withLaunchTemplateId
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder.launchTemplateId: String
    get() = throw NoSuchFieldException("Get on launchTemplateId is not supported.")
    set(value) { this.withLaunchTemplateId(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder.withLaunchTemplateName
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder.launchTemplateName: String
    get() = throw NoSuchFieldException("Get on launchTemplateName is not supported.")
    set(value) { this.withLaunchTemplateName(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder.withVersion
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty.Builder
 */
fun launchTemplateOverridesProperty(init: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty {
    val builder = software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty.Builder.withInstanceType
 */
var software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty.Builder.instanceType: String
    get() = throw NoSuchFieldException("Get on instanceType is not supported.")
    set(value) { this.withInstanceType(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder
 */
fun scheduledActionProps(init: software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.ScheduledActionProps {
    val builder = software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder.withEndTime
 */
var software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder.endTime: java.time.Instant
    get() = throw NoSuchFieldException("Get on endTime is not supported.")
    set(value) { this.withEndTime(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder.withStartTime
 */
var software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder.startTime: java.time.Instant
    get() = throw NoSuchFieldException("Get on startTime is not supported.")
    set(value) { this.withStartTime(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder.withDesiredCapacity
 */
var software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder.desiredCapacity: Number
    get() = throw NoSuchFieldException("Get on desiredCapacity is not supported.")
    set(value) { this.withDesiredCapacity(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder.withMaxCapacity
 */
var software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder.maxCapacity: Number
    get() = throw NoSuchFieldException("Get on maxCapacity is not supported.")
    set(value) { this.withMaxCapacity(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder.withMinCapacity
 */
var software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder.minCapacity: Number
    get() = throw NoSuchFieldException("Get on minCapacity is not supported.")
    set(value) { this.withMinCapacity(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder.withAutoScalingGroup
 */
var software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder.autoScalingGroup: software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
    get() = throw NoSuchFieldException("Get on autoScalingGroup is not supported.")
    set(value) { this.withAutoScalingGroup(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder.withSchedule
 */
var software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder.schedule: String
    get() = throw NoSuchFieldException("Get on schedule is not supported.")
    set(value) { this.withSchedule(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder
 */
fun basicLifecycleHookProps(init: software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps {
    val builder = software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder.withRole
 */
var software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder.withLifecycleTransition
 */
var software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder.lifecycleTransition: software.amazon.awscdk.services.autoscaling.LifecycleTransition
    get() = throw NoSuchFieldException("Get on lifecycleTransition is not supported.")
    set(value) { this.withLifecycleTransition(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder.withNotificationTarget
 */
var software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder.notificationTarget: software.amazon.awscdk.services.autoscaling.api.ILifecycleHookTarget
    get() = throw NoSuchFieldException("Get on notificationTarget is not supported.")
    set(value) { this.withNotificationTarget(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder.withDefaultResult
 */
var software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder.defaultResult: software.amazon.awscdk.services.autoscaling.DefaultResult
    get() = throw NoSuchFieldException("Get on defaultResult is not supported.")
    set(value) { this.withDefaultResult(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder.withHeartbeatTimeoutSec
 */
var software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder.heartbeatTimeoutSec: Number
    get() = throw NoSuchFieldException("Get on heartbeatTimeoutSec is not supported.")
    set(value) { this.withHeartbeatTimeoutSec(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder.withLifecycleHookName
 */
var software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder.lifecycleHookName: String
    get() = throw NoSuchFieldException("Get on lifecycleHookName is not supported.")
    set(value) { this.withLifecycleHookName(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder.withNotificationMetadata
 */
var software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder.notificationMetadata: String
    get() = throw NoSuchFieldException("Get on notificationMetadata is not supported.")
    set(value) { this.withNotificationMetadata(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder
 */
fun basicTargetTrackingScalingPolicyProps(init: software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps {
    val builder = software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder.withEstimatedInstanceWarmupSeconds
 */
var software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder.estimatedInstanceWarmupSeconds: Number
    get() = throw NoSuchFieldException("Get on estimatedInstanceWarmupSeconds is not supported.")
    set(value) { this.withEstimatedInstanceWarmupSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder.withCooldownSeconds
 */
var software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder.cooldownSeconds: Number
    get() = throw NoSuchFieldException("Get on cooldownSeconds is not supported.")
    set(value) { this.withCooldownSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder.withCustomMetric
 */
var software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder.customMetric: software.amazon.awscdk.services.cloudwatch.Metric
    get() = throw NoSuchFieldException("Get on customMetric is not supported.")
    set(value) { this.withCustomMetric(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder.withTargetValue
 */
var software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder.targetValue: Number
    get() = throw NoSuchFieldException("Get on targetValue is not supported.")
    set(value) { this.withTargetValue(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder.withDisableScaleIn
 */
var software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder.disableScaleIn: Boolean
    get() = throw NoSuchFieldException("Get on disableScaleIn is not supported.")
    set(value) { this.withDisableScaleIn(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder.withResourceLabel
 */
var software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder.resourceLabel: String
    get() = throw NoSuchFieldException("Get on resourceLabel is not supported.")
    set(value) { this.withResourceLabel(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder.withPredefinedMetric
 */
var software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps.Builder.predefinedMetric: software.amazon.awscdk.services.autoscaling.PredefinedMetric
    get() = throw NoSuchFieldException("Get on predefinedMetric is not supported.")
    set(value) { this.withPredefinedMetric(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder
 */
fun cfnScalingPolicyProps(init: software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps {
    val builder = software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.withScalingAdjustment
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.scalingAdjustment: Number
    get() = throw NoSuchFieldException("Get on scalingAdjustment is not supported.")
    set(value) { this.withScalingAdjustment(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.withAutoScalingGroupName
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.autoScalingGroupName: String
    get() = throw NoSuchFieldException("Get on autoScalingGroupName is not supported.")
    set(value) { this.withAutoScalingGroupName(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.withCooldown
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.cooldown: String
    get() = throw NoSuchFieldException("Get on cooldown is not supported.")
    set(value) { this.withCooldown(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.withMinAdjustmentMagnitude
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.minAdjustmentMagnitude: Number
    get() = throw NoSuchFieldException("Get on minAdjustmentMagnitude is not supported.")
    set(value) { this.withMinAdjustmentMagnitude(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.withStepAdjustments
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.stepAdjustments: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on stepAdjustments is not supported.")
    set(value) { this.withStepAdjustments(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.withMetricAggregationType
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.metricAggregationType: String
    get() = throw NoSuchFieldException("Get on metricAggregationType is not supported.")
    set(value) { this.withMetricAggregationType(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.withAdjustmentType
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.adjustmentType: String
    get() = throw NoSuchFieldException("Get on adjustmentType is not supported.")
    set(value) { this.withAdjustmentType(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.withEstimatedInstanceWarmup
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.estimatedInstanceWarmup: Number
    get() = throw NoSuchFieldException("Get on estimatedInstanceWarmup is not supported.")
    set(value) { this.withEstimatedInstanceWarmup(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.withTargetTrackingConfiguration
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.targetTrackingConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on targetTrackingConfiguration is not supported.")
    set(value) { this.withTargetTrackingConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.withPolicyType
 */
var software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder.policyType: String
    get() = throw NoSuchFieldException("Get on policyType is not supported.")
    set(value) { this.withPolicyType(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps.Builder
 */
fun cpuUtilizationScalingProps(init: software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps {
    val builder = software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps.Builder.withEstimatedInstanceWarmupSeconds
 */
var software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps.Builder.estimatedInstanceWarmupSeconds: Number
    get() = throw NoSuchFieldException("Get on estimatedInstanceWarmupSeconds is not supported.")
    set(value) { this.withEstimatedInstanceWarmupSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps.Builder.withTargetUtilizationPercent
 */
var software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps.Builder.targetUtilizationPercent: Number
    get() = throw NoSuchFieldException("Get on targetUtilizationPercent is not supported.")
    set(value) { this.withTargetUtilizationPercent(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps.Builder.withCooldownSeconds
 */
var software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps.Builder.cooldownSeconds: Number
    get() = throw NoSuchFieldException("Get on cooldownSeconds is not supported.")
    set(value) { this.withCooldownSeconds(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps.Builder.withDisableScaleIn
 */
var software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps.Builder.disableScaleIn: Boolean
    get() = throw NoSuchFieldException("Get on disableScaleIn is not supported.")
    set(value) { this.withDisableScaleIn(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder
 */
fun lifecycleHookProps(init: software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.LifecycleHookProps {
    val builder = software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder.withRole
 */
var software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder.withAutoScalingGroup
 */
var software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder.autoScalingGroup: software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
    get() = throw NoSuchFieldException("Get on autoScalingGroup is not supported.")
    set(value) { this.withAutoScalingGroup(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder.withLifecycleTransition
 */
var software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder.lifecycleTransition: software.amazon.awscdk.services.autoscaling.LifecycleTransition
    get() = throw NoSuchFieldException("Get on lifecycleTransition is not supported.")
    set(value) { this.withLifecycleTransition(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder.withNotificationTarget
 */
var software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder.notificationTarget: software.amazon.awscdk.services.autoscaling.api.ILifecycleHookTarget
    get() = throw NoSuchFieldException("Get on notificationTarget is not supported.")
    set(value) { this.withNotificationTarget(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder.withDefaultResult
 */
var software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder.defaultResult: software.amazon.awscdk.services.autoscaling.DefaultResult
    get() = throw NoSuchFieldException("Get on defaultResult is not supported.")
    set(value) { this.withDefaultResult(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder.withHeartbeatTimeoutSec
 */
var software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder.heartbeatTimeoutSec: Number
    get() = throw NoSuchFieldException("Get on heartbeatTimeoutSec is not supported.")
    set(value) { this.withHeartbeatTimeoutSec(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder.withLifecycleHookName
 */
var software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder.lifecycleHookName: String
    get() = throw NoSuchFieldException("Get on lifecycleHookName is not supported.")
    set(value) { this.withLifecycleHookName(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder.withNotificationMetadata
 */
var software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder.notificationMetadata: String
    get() = throw NoSuchFieldException("Get on notificationMetadata is not supported.")
    set(value) { this.withNotificationMetadata(value) }
