package software.amazon.awscdk.dsl.services.autoscalingplans
/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
 */
fun software.amazon.awscdk.Construct.cfnScalingPlan(id: String,
                     props: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps? = null,
                     init: (software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.() -> Unit)? = null)
        : software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan {

    val obj = software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty.Builder
 */
fun tagFilterProperty(init: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty {
    val builder = software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty.Builder.withKey
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }


/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.Builder
 */
fun customizedScalingMetricSpecificationProperty(init: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty {
    val builder = software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.Builder.withNamespace
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.Builder.namespace: String
    get() = throw NoSuchFieldException("Get on namespace is not supported.")
    set(value) { this.withNamespace(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.Builder.withUnit
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.Builder.unit: String
    get() = throw NoSuchFieldException("Get on unit is not supported.")
    set(value) { this.withUnit(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.Builder.withDimensions
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.Builder.dimensions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on dimensions is not supported.")
    set(value) { this.withDimensions(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.Builder.withStatistic
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.Builder.statistic: String
    get() = throw NoSuchFieldException("Get on statistic is not supported.")
    set(value) { this.withStatistic(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.Builder.withMetricName
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.Builder.metricName: String
    get() = throw NoSuchFieldException("Get on metricName is not supported.")
    set(value) { this.withMetricName(value) }


/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder
 */
fun targetTrackingConfigurationProperty(init: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty {
    val builder = software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder.withTargetValue
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder.targetValue: Number
    get() = throw NoSuchFieldException("Get on targetValue is not supported.")
    set(value) { this.withTargetValue(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder.withDisableScaleIn
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder.disableScaleIn: Boolean
    get() = throw NoSuchFieldException("Get on disableScaleIn is not supported.")
    set(value) { this.withDisableScaleIn(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder.withCustomizedScalingMetricSpecification
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder.customizedScalingMetricSpecification: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on customizedScalingMetricSpecification is not supported.")
    set(value) { this.withCustomizedScalingMetricSpecification(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder.withEstimatedInstanceWarmup
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder.estimatedInstanceWarmup: Number
    get() = throw NoSuchFieldException("Get on estimatedInstanceWarmup is not supported.")
    set(value) { this.withEstimatedInstanceWarmup(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder.withPredefinedScalingMetricSpecification
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder.predefinedScalingMetricSpecification: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on predefinedScalingMetricSpecification is not supported.")
    set(value) { this.withPredefinedScalingMetricSpecification(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder.withScaleInCooldown
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder.scaleInCooldown: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on scaleInCooldown is not supported.")
    set(value) { this.withScaleInCooldown(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder.withScaleOutCooldown
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TargetTrackingConfigurationProperty.Builder.scaleOutCooldown: Number
    get() = throw NoSuchFieldException("Get on scaleOutCooldown is not supported.")
    set(value) { this.withScaleOutCooldown(value) }


/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps.Builder
 */
fun cfnScalingPlanProps(init: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps.Builder.() -> Unit): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps {
    val builder = software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps.Builder.withApplicationSource
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps.Builder.applicationSource: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on applicationSource is not supported.")
    set(value) { this.withApplicationSource(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps.Builder.withScalingInstructions
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps.Builder.scalingInstructions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on scalingInstructions is not supported.")
    set(value) { this.withScalingInstructions(value) }


/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder
 */
fun scalingInstructionProperty(init: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty {
    val builder = software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.withMaxCapacity
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.maxCapacity: Number
    get() = throw NoSuchFieldException("Get on maxCapacity is not supported.")
    set(value) { this.withMaxCapacity(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.withMinCapacity
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.minCapacity: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on minCapacity is not supported.")
    set(value) { this.withMinCapacity(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.withResourceId
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.resourceId: String
    get() = throw NoSuchFieldException("Get on resourceId is not supported.")
    set(value) { this.withResourceId(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.withServiceNamespace
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.serviceNamespace: String
    get() = throw NoSuchFieldException("Get on serviceNamespace is not supported.")
    set(value) { this.withServiceNamespace(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.withScalableDimension
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.scalableDimension: String
    get() = throw NoSuchFieldException("Get on scalableDimension is not supported.")
    set(value) { this.withScalableDimension(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.withTargetTrackingConfigurations
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.targetTrackingConfigurations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on targetTrackingConfigurations is not supported.")
    set(value) { this.withTargetTrackingConfigurations(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.withCustomizedLoadMetricSpecification
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.customizedLoadMetricSpecification: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty
    get() = throw NoSuchFieldException("Get on customizedLoadMetricSpecification is not supported.")
    set(value) { this.withCustomizedLoadMetricSpecification(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.withDisableDynamicScaling
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.disableDynamicScaling: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on disableDynamicScaling is not supported.")
    set(value) { this.withDisableDynamicScaling(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.withPredefinedLoadMetricSpecification
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.predefinedLoadMetricSpecification: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on predefinedLoadMetricSpecification is not supported.")
    set(value) { this.withPredefinedLoadMetricSpecification(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.withPredictiveScalingMaxCapacityBehavior
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.predictiveScalingMaxCapacityBehavior: String
    get() = throw NoSuchFieldException("Get on predictiveScalingMaxCapacityBehavior is not supported.")
    set(value) { this.withPredictiveScalingMaxCapacityBehavior(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.withPredictiveScalingMaxCapacityBuffer
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.predictiveScalingMaxCapacityBuffer: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on predictiveScalingMaxCapacityBuffer is not supported.")
    set(value) { this.withPredictiveScalingMaxCapacityBuffer(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.withPredictiveScalingMode
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.predictiveScalingMode: String
    get() = throw NoSuchFieldException("Get on predictiveScalingMode is not supported.")
    set(value) { this.withPredictiveScalingMode(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.withScalingPolicyUpdateBehavior
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.scalingPolicyUpdateBehavior: String
    get() = throw NoSuchFieldException("Get on scalingPolicyUpdateBehavior is not supported.")
    set(value) { this.withScalingPolicyUpdateBehavior(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.withScheduledActionBufferTime
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder.scheduledActionBufferTime: Number
    get() = throw NoSuchFieldException("Get on scheduledActionBufferTime is not supported.")
    set(value) { this.withScheduledActionBufferTime(value) }


/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty.Builder
 */
fun metricDimensionProperty(init: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty {
    val builder = software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty.Builder.withValue
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty.Builder.withName
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.MetricDimensionProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty.Builder
 */
fun predefinedScalingMetricSpecificationProperty(init: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty {
    val builder = software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty.Builder.withResourceLabel
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty.Builder.resourceLabel: String
    get() = throw NoSuchFieldException("Get on resourceLabel is not supported.")
    set(value) { this.withResourceLabel(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty.Builder.withPredefinedScalingMetricType
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedScalingMetricSpecificationProperty.Builder.predefinedScalingMetricType: String
    get() = throw NoSuchFieldException("Get on predefinedScalingMetricType is not supported.")
    set(value) { this.withPredefinedScalingMetricType(value) }


/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty.Builder
 */
fun applicationSourceProperty(init: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty {
    val builder = software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty.Builder.withTagFilters
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty.Builder.tagFilters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on tagFilters is not supported.")
    set(value) { this.withTagFilters(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty.Builder.withCloudFormationStackArn
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty.Builder.cloudFormationStackArn: String
    get() = throw NoSuchFieldException("Get on cloudFormationStackArn is not supported.")
    set(value) { this.withCloudFormationStackArn(value) }


/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty.Builder
 */
fun predefinedLoadMetricSpecificationProperty(init: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty {
    val builder = software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty.Builder.withResourceLabel
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty.Builder.resourceLabel: String
    get() = throw NoSuchFieldException("Get on resourceLabel is not supported.")
    set(value) { this.withResourceLabel(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty.Builder.withPredefinedLoadMetricType
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty.Builder.predefinedLoadMetricType: String
    get() = throw NoSuchFieldException("Get on predefinedLoadMetricType is not supported.")
    set(value) { this.withPredefinedLoadMetricType(value) }


/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder
 */
fun customizedLoadMetricSpecificationProperty(init: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty {
    val builder = software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder.withNamespace
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder.namespace: String
    get() = throw NoSuchFieldException("Get on namespace is not supported.")
    set(value) { this.withNamespace(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder.withUnit
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder.unit: String
    get() = throw NoSuchFieldException("Get on unit is not supported.")
    set(value) { this.withUnit(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder.withDimensions
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder.dimensions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on dimensions is not supported.")
    set(value) { this.withDimensions(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder.withStatistic
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder.statistic: String
    get() = throw NoSuchFieldException("Get on statistic is not supported.")
    set(value) { this.withStatistic(value) }

/**
 * @see software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder.withMetricName
 */
var software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder.metricName: String
    get() = throw NoSuchFieldException("Get on metricName is not supported.")
    set(value) { this.withMetricName(value) }
