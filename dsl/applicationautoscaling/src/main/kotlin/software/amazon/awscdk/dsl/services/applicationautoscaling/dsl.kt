package software.amazon.awscdk.dsl.services.applicationautoscaling
/**
 * @see software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy
 */
fun software.amazon.awscdk.Construct.stepScalingPolicy(id: String,
                     props: software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps? = null,
                     init: (software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy.() -> Unit)? = null)
        : software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy {

    val obj = software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy
 */
fun software.amazon.awscdk.Construct.targetTrackingScalingPolicy(id: String,
                     props: software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps? = null,
                     init: (software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy.() -> Unit)? = null)
        : software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy {

    val obj = software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicy(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.ScalableTarget
 */
fun software.amazon.awscdk.Construct.scalableTarget(id: String,
                     props: software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps? = null,
                     init: (software.amazon.awscdk.services.applicationautoscaling.ScalableTarget.() -> Unit)? = null)
        : software.amazon.awscdk.services.applicationautoscaling.ScalableTarget {

    val obj = software.amazon.awscdk.services.applicationautoscaling.ScalableTarget(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.StepScalingAction
 */
fun software.amazon.awscdk.Construct.stepScalingAction(id: String,
                     props: software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps? = null,
                     init: (software.amazon.awscdk.services.applicationautoscaling.StepScalingAction.() -> Unit)? = null)
        : software.amazon.awscdk.services.applicationautoscaling.StepScalingAction {

    val obj = software.amazon.awscdk.services.applicationautoscaling.StepScalingAction(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget
 */
fun software.amazon.awscdk.Construct.cfnScalableTarget(id: String,
                     props: software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps? = null,
                     init: (software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.() -> Unit)? = null)
        : software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget {

    val obj = software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy
 */
fun software.amazon.awscdk.Construct.cfnScalingPolicy(id: String,
                     props: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps? = null,
                     init: (software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.() -> Unit)? = null)
        : software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy {

    val obj = software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder
 */
fun cfnScalableTargetProps(init: software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps {
    val builder = software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder.withMaxCapacity
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder.maxCapacity: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on maxCapacity is not supported.")
    set(value) { this.withMaxCapacity(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder.withMinCapacity
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder.minCapacity: Number
    get() = throw NoSuchFieldException("Get on minCapacity is not supported.")
    set(value) { this.withMinCapacity(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder.withRoleArn
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder.withResourceId
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder.resourceId: String
    get() = throw NoSuchFieldException("Get on resourceId is not supported.")
    set(value) { this.withResourceId(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder.withServiceNamespace
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder.serviceNamespace: String
    get() = throw NoSuchFieldException("Get on serviceNamespace is not supported.")
    set(value) { this.withServiceNamespace(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder.withScalableDimension
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder.scalableDimension: String
    get() = throw NoSuchFieldException("Get on scalableDimension is not supported.")
    set(value) { this.withScalableDimension(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder.withScheduledActions
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder.scheduledActions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on scheduledActions is not supported.")
    set(value) { this.withScheduledActions(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder
 */
fun targetTrackingScalingPolicyConfigurationProperty(init: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty {
    val builder = software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.withTargetValue
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.targetValue: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on targetValue is not supported.")
    set(value) { this.withTargetValue(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.withDisableScaleIn
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.disableScaleIn: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on disableScaleIn is not supported.")
    set(value) { this.withDisableScaleIn(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.withScaleInCooldown
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.scaleInCooldown: Number
    get() = throw NoSuchFieldException("Get on scaleInCooldown is not supported.")
    set(value) { this.withScaleInCooldown(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.withScaleOutCooldown
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.scaleOutCooldown: Number
    get() = throw NoSuchFieldException("Get on scaleOutCooldown is not supported.")
    set(value) { this.withScaleOutCooldown(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.withPredefinedMetricSpecification
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.predefinedMetricSpecification: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty
    get() = throw NoSuchFieldException("Get on predefinedMetricSpecification is not supported.")
    set(value) { this.withPredefinedMetricSpecification(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.withCustomizedMetricSpecification
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.customizedMetricSpecification: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on customizedMetricSpecification is not supported.")
    set(value) { this.withCustomizedMetricSpecification(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder
 */
fun metricDimensionProperty(init: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty {
    val builder = software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder.withValue
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder.withName
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.Builder
 */
fun stepScalingActionProps(init: software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps {
    val builder = software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.Builder.withPolicyName
 */
var software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.Builder.policyName: String
    get() = throw NoSuchFieldException("Get on policyName is not supported.")
    set(value) { this.withPolicyName(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.Builder.withMinAdjustmentMagnitude
 */
var software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.Builder.minAdjustmentMagnitude: Number
    get() = throw NoSuchFieldException("Get on minAdjustmentMagnitude is not supported.")
    set(value) { this.withMinAdjustmentMagnitude(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.Builder.withMetricAggregationType
 */
var software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.Builder.metricAggregationType: software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType
    get() = throw NoSuchFieldException("Get on metricAggregationType is not supported.")
    set(value) { this.withMetricAggregationType(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.Builder.withAdjustmentType
 */
var software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.Builder.adjustmentType: software.amazon.awscdk.services.applicationautoscaling.AdjustmentType
    get() = throw NoSuchFieldException("Get on adjustmentType is not supported.")
    set(value) { this.withAdjustmentType(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.Builder.withScalingTarget
 */
var software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.Builder.scalingTarget: software.amazon.awscdk.services.applicationautoscaling.ScalableTarget
    get() = throw NoSuchFieldException("Get on scalingTarget is not supported.")
    set(value) { this.withScalingTarget(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.Builder.withCooldownSec
 */
var software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.Builder.cooldownSec: Number
    get() = throw NoSuchFieldException("Get on cooldownSec is not supported.")
    set(value) { this.withCooldownSec(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty.Builder
 */
fun scalableTargetActionProperty(init: software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty {
    val builder = software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty.Builder.withMaxCapacity
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty.Builder.maxCapacity: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on maxCapacity is not supported.")
    set(value) { this.withMaxCapacity(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty.Builder.withMinCapacity
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty.Builder.minCapacity: Number
    get() = throw NoSuchFieldException("Get on minCapacity is not supported.")
    set(value) { this.withMinCapacity(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier.Builder
 */
fun adjustmentTier(init: software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier {
    val builder = software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier.Builder.withAdjustment
 */
var software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier.Builder.adjustment: Number
    get() = throw NoSuchFieldException("Get on adjustment is not supported.")
    set(value) { this.withAdjustment(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier.Builder.withLowerBound
 */
var software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier.Builder.lowerBound: Number
    get() = throw NoSuchFieldException("Get on lowerBound is not supported.")
    set(value) { this.withLowerBound(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier.Builder.withUpperBound
 */
var software.amazon.awscdk.services.applicationautoscaling.AdjustmentTier.Builder.upperBound: Number
    get() = throw NoSuchFieldException("Get on upperBound is not supported.")
    set(value) { this.withUpperBound(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder
 */
fun stepAdjustmentProperty(init: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty {
    val builder = software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder.withScalingAdjustment
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder.scalingAdjustment: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on scalingAdjustment is not supported.")
    set(value) { this.withScalingAdjustment(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder.withMetricIntervalLowerBound
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder.metricIntervalLowerBound: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on metricIntervalLowerBound is not supported.")
    set(value) { this.withMetricIntervalLowerBound(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder.withMetricIntervalUpperBound
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder.metricIntervalUpperBound: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on metricIntervalUpperBound is not supported.")
    set(value) { this.withMetricIntervalUpperBound(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder
 */
fun predefinedMetricSpecificationProperty(init: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty {
    val builder = software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder.withPredefinedMetricType
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder.predefinedMetricType: String
    get() = throw NoSuchFieldException("Get on predefinedMetricType is not supported.")
    set(value) { this.withPredefinedMetricType(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder.withResourceLabel
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder.resourceLabel: String
    get() = throw NoSuchFieldException("Get on resourceLabel is not supported.")
    set(value) { this.withResourceLabel(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder
 */
fun stepScalingPolicyConfigurationProperty(init: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty {
    val builder = software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder.withCooldown
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder.cooldown: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on cooldown is not supported.")
    set(value) { this.withCooldown(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder.withMinAdjustmentMagnitude
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder.minAdjustmentMagnitude: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on minAdjustmentMagnitude is not supported.")
    set(value) { this.withMinAdjustmentMagnitude(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder.withStepAdjustments
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder.stepAdjustments: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on stepAdjustments is not supported.")
    set(value) { this.withStepAdjustments(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder.withMetricAggregationType
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder.metricAggregationType: String
    get() = throw NoSuchFieldException("Get on metricAggregationType is not supported.")
    set(value) { this.withMetricAggregationType(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder.withAdjustmentType
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder.adjustmentType: String
    get() = throw NoSuchFieldException("Get on adjustmentType is not supported.")
    set(value) { this.withAdjustmentType(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder
 */
fun basicTargetTrackingScalingPolicyProps(init: software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps {
    val builder = software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder.withPolicyName
 */
var software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder.policyName: String
    get() = throw NoSuchFieldException("Get on policyName is not supported.")
    set(value) { this.withPolicyName(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder.withCustomMetric
 */
var software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder.customMetric: software.amazon.awscdk.services.cloudwatch.Metric
    get() = throw NoSuchFieldException("Get on customMetric is not supported.")
    set(value) { this.withCustomMetric(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder.withScaleOutCooldownSec
 */
var software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder.scaleOutCooldownSec: Number
    get() = throw NoSuchFieldException("Get on scaleOutCooldownSec is not supported.")
    set(value) { this.withScaleOutCooldownSec(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder.withTargetValue
 */
var software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder.targetValue: Number
    get() = throw NoSuchFieldException("Get on targetValue is not supported.")
    set(value) { this.withTargetValue(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder.withScaleInCooldownSec
 */
var software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder.scaleInCooldownSec: Number
    get() = throw NoSuchFieldException("Get on scaleInCooldownSec is not supported.")
    set(value) { this.withScaleInCooldownSec(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder.withDisableScaleIn
 */
var software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder.disableScaleIn: Boolean
    get() = throw NoSuchFieldException("Get on disableScaleIn is not supported.")
    set(value) { this.withDisableScaleIn(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder.withResourceLabel
 */
var software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder.resourceLabel: String
    get() = throw NoSuchFieldException("Get on resourceLabel is not supported.")
    set(value) { this.withResourceLabel(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder.withPredefinedMetric
 */
var software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps.Builder.predefinedMetric: software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric
    get() = throw NoSuchFieldException("Get on predefinedMetric is not supported.")
    set(value) { this.withPredefinedMetric(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder
 */
fun customizedMetricSpecificationProperty(init: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty {
    val builder = software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.withNamespace
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.namespace: String
    get() = throw NoSuchFieldException("Get on namespace is not supported.")
    set(value) { this.withNamespace(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.withUnit
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.unit: String
    get() = throw NoSuchFieldException("Get on unit is not supported.")
    set(value) { this.withUnit(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.withDimensions
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.dimensions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on dimensions is not supported.")
    set(value) { this.withDimensions(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.withStatistic
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.statistic: String
    get() = throw NoSuchFieldException("Get on statistic is not supported.")
    set(value) { this.withStatistic(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.withMetricName
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.metricName: String
    get() = throw NoSuchFieldException("Get on metricName is not supported.")
    set(value) { this.withMetricName(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.Builder
 */
fun scalingSchedule(init: software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule {
    val builder = software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.Builder.withEndTime
 */
var software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.Builder.endTime: java.time.Instant
    get() = throw NoSuchFieldException("Get on endTime is not supported.")
    set(value) { this.withEndTime(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.Builder.withStartTime
 */
var software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.Builder.startTime: java.time.Instant
    get() = throw NoSuchFieldException("Get on startTime is not supported.")
    set(value) { this.withStartTime(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.Builder.withMaxCapacity
 */
var software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.Builder.maxCapacity: Number
    get() = throw NoSuchFieldException("Get on maxCapacity is not supported.")
    set(value) { this.withMaxCapacity(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.Builder.withMinCapacity
 */
var software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.Builder.minCapacity: Number
    get() = throw NoSuchFieldException("Get on minCapacity is not supported.")
    set(value) { this.withMinCapacity(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.Builder.withSchedule
 */
var software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.Builder.schedule: String
    get() = throw NoSuchFieldException("Get on schedule is not supported.")
    set(value) { this.withSchedule(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.Builder
 */
fun scalableTargetProps(init: software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps {
    val builder = software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.Builder.withMaxCapacity
 */
var software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.Builder.maxCapacity: Number
    get() = throw NoSuchFieldException("Get on maxCapacity is not supported.")
    set(value) { this.withMaxCapacity(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.Builder.withMinCapacity
 */
var software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.Builder.minCapacity: Number
    get() = throw NoSuchFieldException("Get on minCapacity is not supported.")
    set(value) { this.withMinCapacity(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.Builder.withResourceId
 */
var software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.Builder.resourceId: String
    get() = throw NoSuchFieldException("Get on resourceId is not supported.")
    set(value) { this.withResourceId(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.Builder.withServiceNamespace
 */
var software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.Builder.serviceNamespace: software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace
    get() = throw NoSuchFieldException("Get on serviceNamespace is not supported.")
    set(value) { this.withServiceNamespace(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.Builder.withScalableDimension
 */
var software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.Builder.scalableDimension: String
    get() = throw NoSuchFieldException("Get on scalableDimension is not supported.")
    set(value) { this.withScalableDimension(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.Builder.withRole
 */
var software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps.Builder
 */
fun baseTargetTrackingProps(init: software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps {
    val builder = software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps.Builder.withPolicyName
 */
var software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps.Builder.policyName: String
    get() = throw NoSuchFieldException("Get on policyName is not supported.")
    set(value) { this.withPolicyName(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps.Builder.withScaleOutCooldownSec
 */
var software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps.Builder.scaleOutCooldownSec: Number
    get() = throw NoSuchFieldException("Get on scaleOutCooldownSec is not supported.")
    set(value) { this.withScaleOutCooldownSec(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps.Builder.withScaleInCooldownSec
 */
var software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps.Builder.scaleInCooldownSec: Number
    get() = throw NoSuchFieldException("Get on scaleInCooldownSec is not supported.")
    set(value) { this.withScaleInCooldownSec(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps.Builder.withDisableScaleIn
 */
var software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps.Builder.disableScaleIn: Boolean
    get() = throw NoSuchFieldException("Get on disableScaleIn is not supported.")
    set(value) { this.withDisableScaleIn(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder
 */
fun cfnScalingPolicyProps(init: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps {
    val builder = software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder.withPolicyName
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder.policyName: String
    get() = throw NoSuchFieldException("Get on policyName is not supported.")
    set(value) { this.withPolicyName(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder.withResourceId
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder.resourceId: String
    get() = throw NoSuchFieldException("Get on resourceId is not supported.")
    set(value) { this.withResourceId(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder.withServiceNamespace
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder.serviceNamespace: String
    get() = throw NoSuchFieldException("Get on serviceNamespace is not supported.")
    set(value) { this.withServiceNamespace(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder.withScalableDimension
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder.scalableDimension: String
    get() = throw NoSuchFieldException("Get on scalableDimension is not supported.")
    set(value) { this.withScalableDimension(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder.withPolicyType
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder.policyType: String
    get() = throw NoSuchFieldException("Get on policyType is not supported.")
    set(value) { this.withPolicyType(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder.withScalingTargetId
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder.scalingTargetId: String
    get() = throw NoSuchFieldException("Get on scalingTargetId is not supported.")
    set(value) { this.withScalingTargetId(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder.withStepScalingPolicyConfiguration
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder.stepScalingPolicyConfiguration: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty
    get() = throw NoSuchFieldException("Get on stepScalingPolicyConfiguration is not supported.")
    set(value) { this.withStepScalingPolicyConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder.withTargetTrackingScalingPolicyConfiguration
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder.targetTrackingScalingPolicyConfiguration: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty
    get() = throw NoSuchFieldException("Get on targetTrackingScalingPolicyConfiguration is not supported.")
    set(value) { this.withTargetTrackingScalingPolicyConfiguration(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.Builder
 */
fun scheduledActionProperty(init: software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty {
    val builder = software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.Builder.withScheduledActionName
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.Builder.scheduledActionName: String
    get() = throw NoSuchFieldException("Get on scheduledActionName is not supported.")
    set(value) { this.withScheduledActionName(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.Builder.withEndTime
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.Builder.endTime: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on endTime is not supported.")
    set(value) { this.withEndTime(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.Builder.withScalableTargetAction
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.Builder.scalableTargetAction: software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty
    get() = throw NoSuchFieldException("Get on scalableTargetAction is not supported.")
    set(value) { this.withScalableTargetAction(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.Builder.withStartTime
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.Builder.startTime: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on startTime is not supported.")
    set(value) { this.withStartTime(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.Builder.withSchedule
 */
var software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.Builder.schedule: String
    get() = throw NoSuchFieldException("Get on schedule is not supported.")
    set(value) { this.withSchedule(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder
 */
fun targetTrackingScalingPolicyProps(init: software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps {
    val builder = software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.withPolicyName
 */
var software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.policyName: String
    get() = throw NoSuchFieldException("Get on policyName is not supported.")
    set(value) { this.withPolicyName(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.withCustomMetric
 */
var software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.customMetric: software.amazon.awscdk.services.cloudwatch.Metric
    get() = throw NoSuchFieldException("Get on customMetric is not supported.")
    set(value) { this.withCustomMetric(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.withScaleOutCooldownSec
 */
var software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.scaleOutCooldownSec: Number
    get() = throw NoSuchFieldException("Get on scaleOutCooldownSec is not supported.")
    set(value) { this.withScaleOutCooldownSec(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.withTargetValue
 */
var software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.targetValue: Number
    get() = throw NoSuchFieldException("Get on targetValue is not supported.")
    set(value) { this.withTargetValue(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.withScaleInCooldownSec
 */
var software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.scaleInCooldownSec: Number
    get() = throw NoSuchFieldException("Get on scaleInCooldownSec is not supported.")
    set(value) { this.withScaleInCooldownSec(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.withDisableScaleIn
 */
var software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.disableScaleIn: Boolean
    get() = throw NoSuchFieldException("Get on disableScaleIn is not supported.")
    set(value) { this.withDisableScaleIn(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.withResourceLabel
 */
var software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.resourceLabel: String
    get() = throw NoSuchFieldException("Get on resourceLabel is not supported.")
    set(value) { this.withResourceLabel(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.withPredefinedMetric
 */
var software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.predefinedMetric: software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric
    get() = throw NoSuchFieldException("Get on predefinedMetric is not supported.")
    set(value) { this.withPredefinedMetric(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.withScalingTarget
 */
var software.amazon.awscdk.services.applicationautoscaling.TargetTrackingScalingPolicyProps.Builder.scalingTarget: software.amazon.awscdk.services.applicationautoscaling.ScalableTarget
    get() = throw NoSuchFieldException("Get on scalingTarget is not supported.")
    set(value) { this.withScalingTarget(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps.Builder
 */
fun stepScalingPolicyProps(init: software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps {
    val builder = software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps.Builder.withMinAdjustmentMagnitude
 */
var software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps.Builder.minAdjustmentMagnitude: Number
    get() = throw NoSuchFieldException("Get on minAdjustmentMagnitude is not supported.")
    set(value) { this.withMinAdjustmentMagnitude(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps.Builder.withAdjustmentType
 */
var software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps.Builder.adjustmentType: software.amazon.awscdk.services.applicationautoscaling.AdjustmentType
    get() = throw NoSuchFieldException("Get on adjustmentType is not supported.")
    set(value) { this.withAdjustmentType(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps.Builder.withScalingTarget
 */
var software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps.Builder.scalingTarget: software.amazon.awscdk.services.applicationautoscaling.ScalableTarget
    get() = throw NoSuchFieldException("Get on scalingTarget is not supported.")
    set(value) { this.withScalingTarget(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps.Builder.withCooldownSec
 */
var software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps.Builder.cooldownSec: Number
    get() = throw NoSuchFieldException("Get on cooldownSec is not supported.")
    set(value) { this.withCooldownSec(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps.Builder.withMetric
 */
var software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps.Builder.metric: software.amazon.awscdk.services.cloudwatch.Metric
    get() = throw NoSuchFieldException("Get on metric is not supported.")
    set(value) { this.withMetric(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps.Builder
 */
fun baseScalableAttributeProps(init: software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps {
    val builder = software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps.Builder.withMaxCapacity
 */
var software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps.Builder.maxCapacity: Number
    get() = throw NoSuchFieldException("Get on maxCapacity is not supported.")
    set(value) { this.withMaxCapacity(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps.Builder.withMinCapacity
 */
var software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps.Builder.minCapacity: Number
    get() = throw NoSuchFieldException("Get on minCapacity is not supported.")
    set(value) { this.withMinCapacity(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps.Builder.withDimension
 */
var software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps.Builder.dimension: String
    get() = throw NoSuchFieldException("Get on dimension is not supported.")
    set(value) { this.withDimension(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps.Builder.withResourceId
 */
var software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps.Builder.resourceId: String
    get() = throw NoSuchFieldException("Get on resourceId is not supported.")
    set(value) { this.withResourceId(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps.Builder.withServiceNamespace
 */
var software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps.Builder.serviceNamespace: software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace
    get() = throw NoSuchFieldException("Get on serviceNamespace is not supported.")
    set(value) { this.withServiceNamespace(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps.Builder.withRole
 */
var software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps.Builder
 */
fun enableScalingProps(init: software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps {
    val builder = software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps.Builder.withMaxCapacity
 */
var software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps.Builder.maxCapacity: Number
    get() = throw NoSuchFieldException("Get on maxCapacity is not supported.")
    set(value) { this.withMaxCapacity(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps.Builder.withMinCapacity
 */
var software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps.Builder.minCapacity: Number
    get() = throw NoSuchFieldException("Get on minCapacity is not supported.")
    set(value) { this.withMinCapacity(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps.Builder
 */
fun basicStepScalingPolicyProps(init: software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps {
    val builder = software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps.Builder.withMinAdjustmentMagnitude
 */
var software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps.Builder.minAdjustmentMagnitude: Number
    get() = throw NoSuchFieldException("Get on minAdjustmentMagnitude is not supported.")
    set(value) { this.withMinAdjustmentMagnitude(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps.Builder.withAdjustmentType
 */
var software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps.Builder.adjustmentType: software.amazon.awscdk.services.applicationautoscaling.AdjustmentType
    get() = throw NoSuchFieldException("Get on adjustmentType is not supported.")
    set(value) { this.withAdjustmentType(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps.Builder.withCooldownSec
 */
var software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps.Builder.cooldownSec: Number
    get() = throw NoSuchFieldException("Get on cooldownSec is not supported.")
    set(value) { this.withCooldownSec(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps.Builder.withMetric
 */
var software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps.Builder.metric: software.amazon.awscdk.services.cloudwatch.Metric
    get() = throw NoSuchFieldException("Get on metric is not supported.")
    set(value) { this.withMetric(value) }


/**
 * @see software.amazon.awscdk.services.applicationautoscaling.ScalingInterval.Builder
 */
fun scalingInterval(init: software.amazon.awscdk.services.applicationautoscaling.ScalingInterval.Builder.() -> Unit): software.amazon.awscdk.services.applicationautoscaling.ScalingInterval {
    val builder = software.amazon.awscdk.services.applicationautoscaling.ScalingInterval.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.ScalingInterval.Builder.withChange
 */
var software.amazon.awscdk.services.applicationautoscaling.ScalingInterval.Builder.change: Number
    get() = throw NoSuchFieldException("Get on change is not supported.")
    set(value) { this.withChange(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.ScalingInterval.Builder.withLower
 */
var software.amazon.awscdk.services.applicationautoscaling.ScalingInterval.Builder.lower: Number
    get() = throw NoSuchFieldException("Get on lower is not supported.")
    set(value) { this.withLower(value) }

/**
 * @see software.amazon.awscdk.services.applicationautoscaling.ScalingInterval.Builder.withUpper
 */
var software.amazon.awscdk.services.applicationautoscaling.ScalingInterval.Builder.upper: Number
    get() = throw NoSuchFieldException("Get on upper is not supported.")
    set(value) { this.withUpper(value) }
