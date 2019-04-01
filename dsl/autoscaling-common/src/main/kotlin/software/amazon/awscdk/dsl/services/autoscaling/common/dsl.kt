package software.amazon.awscdk.dsl.services.autoscaling.common

/**
 * @see software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals.Builder
 */
fun arbitraryIntervals(init: software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals {
    val builder = software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals.Builder.withAbsolute
 */
var software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals.Builder.absolute: Boolean
    get() = throw NoSuchFieldException("Get on absolute is not supported.")
    set(value) { this.withAbsolute(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.common.Alarms.Builder
 */
fun alarms(init: software.amazon.awscdk.services.autoscaling.common.Alarms.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.common.Alarms {
    val builder = software.amazon.awscdk.services.autoscaling.common.Alarms.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.common.Alarms.Builder.withLowerAlarmIntervalIndex
 */
var software.amazon.awscdk.services.autoscaling.common.Alarms.Builder.lowerAlarmIntervalIndex: Number
    get() = throw NoSuchFieldException("Get on lowerAlarmIntervalIndex is not supported.")
    set(value) { this.withLowerAlarmIntervalIndex(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.common.Alarms.Builder.withUpperAlarmIntervalIndex
 */
var software.amazon.awscdk.services.autoscaling.common.Alarms.Builder.upperAlarmIntervalIndex: Number
    get() = throw NoSuchFieldException("Get on upperAlarmIntervalIndex is not supported.")
    set(value) { this.withUpperAlarmIntervalIndex(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval.Builder
 */
fun completeScalingInterval(init: software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval {
    val builder = software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval.Builder.withChange
 */
var software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval.Builder.change: Number
    get() = throw NoSuchFieldException("Get on change is not supported.")
    set(value) { this.withChange(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval.Builder.withLower
 */
var software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval.Builder.lower: Number
    get() = throw NoSuchFieldException("Get on lower is not supported.")
    set(value) { this.withLower(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval.Builder.withUpper
 */
var software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval.Builder.upper: Number
    get() = throw NoSuchFieldException("Get on upper is not supported.")
    set(value) { this.withUpper(value) }


/**
 * @see software.amazon.awscdk.services.autoscaling.common.ScalingInterval.Builder
 */
fun scalingInterval(init: software.amazon.awscdk.services.autoscaling.common.ScalingInterval.Builder.() -> Unit): software.amazon.awscdk.services.autoscaling.common.ScalingInterval {
    val builder = software.amazon.awscdk.services.autoscaling.common.ScalingInterval.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.autoscaling.common.ScalingInterval.Builder.withChange
 */
var software.amazon.awscdk.services.autoscaling.common.ScalingInterval.Builder.change: Number
    get() = throw NoSuchFieldException("Get on change is not supported.")
    set(value) { this.withChange(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.common.ScalingInterval.Builder.withLower
 */
var software.amazon.awscdk.services.autoscaling.common.ScalingInterval.Builder.lower: Number
    get() = throw NoSuchFieldException("Get on lower is not supported.")
    set(value) { this.withLower(value) }

/**
 * @see software.amazon.awscdk.services.autoscaling.common.ScalingInterval.Builder.withUpper
 */
var software.amazon.awscdk.services.autoscaling.common.ScalingInterval.Builder.upper: Number
    get() = throw NoSuchFieldException("Get on upper is not supported.")
    set(value) { this.withUpper(value) }
