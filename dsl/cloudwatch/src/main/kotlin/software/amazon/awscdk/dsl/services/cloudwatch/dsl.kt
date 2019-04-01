package software.amazon.awscdk.dsl.services.cloudwatch
/**
 * @see software.amazon.awscdk.services.cloudwatch.Alarm
 */
fun software.amazon.awscdk.Construct.alarm(id: String,
                     props: software.amazon.awscdk.services.cloudwatch.AlarmProps? = null,
                     init: (software.amazon.awscdk.services.cloudwatch.Alarm.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudwatch.Alarm {

    val obj = software.amazon.awscdk.services.cloudwatch.Alarm(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm
 */
fun software.amazon.awscdk.Construct.cfnAlarm(id: String,
                     props: software.amazon.awscdk.services.cloudwatch.CfnAlarmProps? = null,
                     init: (software.amazon.awscdk.services.cloudwatch.CfnAlarm.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudwatch.CfnAlarm {

    val obj = software.amazon.awscdk.services.cloudwatch.CfnAlarm(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cloudwatch.Dashboard
 */
fun software.amazon.awscdk.Construct.dashboard(id: String,
                     props: software.amazon.awscdk.services.cloudwatch.DashboardProps? = null,
                     init: (software.amazon.awscdk.services.cloudwatch.Dashboard.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudwatch.Dashboard {

    val obj = software.amazon.awscdk.services.cloudwatch.Dashboard(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnDashboard
 */
fun software.amazon.awscdk.Construct.cfnDashboard(id: String,
                     props: software.amazon.awscdk.services.cloudwatch.CfnDashboardProps? = null,
                     init: (software.amazon.awscdk.services.cloudwatch.CfnDashboard.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudwatch.CfnDashboard {

    val obj = software.amazon.awscdk.services.cloudwatch.CfnDashboard(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cloudwatch.Dashboard
 */
fun software.amazon.awscdk.Construct.dashboard(id: String,
                     init: (software.amazon.awscdk.services.cloudwatch.Dashboard.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudwatch.Dashboard {

    val obj = software.amazon.awscdk.services.cloudwatch.Dashboard(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder
 */
fun cfnAlarmProps(init: software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.CfnAlarmProps {
    val builder = software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.withNamespace
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.namespace: String
    get() = throw NoSuchFieldException("Get on namespace is not supported.")
    set(value) { this.withNamespace(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.withUnit
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.unit: String
    get() = throw NoSuchFieldException("Get on unit is not supported.")
    set(value) { this.withUnit(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.withDimensions
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.dimensions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on dimensions is not supported.")
    set(value) { this.withDimensions(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.withPeriod
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.period: Number
    get() = throw NoSuchFieldException("Get on period is not supported.")
    set(value) { this.withPeriod(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.withActionsEnabled
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.actionsEnabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on actionsEnabled is not supported.")
    set(value) { this.withActionsEnabled(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.withAlarmDescription
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.alarmDescription: String
    get() = throw NoSuchFieldException("Get on alarmDescription is not supported.")
    set(value) { this.withAlarmDescription(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.withAlarmName
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.alarmName: String
    get() = throw NoSuchFieldException("Get on alarmName is not supported.")
    set(value) { this.withAlarmName(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.withComparisonOperator
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.comparisonOperator: String
    get() = throw NoSuchFieldException("Get on comparisonOperator is not supported.")
    set(value) { this.withComparisonOperator(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.withDatapointsToAlarm
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.datapointsToAlarm: Number
    get() = throw NoSuchFieldException("Get on datapointsToAlarm is not supported.")
    set(value) { this.withDatapointsToAlarm(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.withEvaluateLowSampleCountPercentile
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.evaluateLowSampleCountPercentile: String
    get() = throw NoSuchFieldException("Get on evaluateLowSampleCountPercentile is not supported.")
    set(value) { this.withEvaluateLowSampleCountPercentile(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.withStatistic
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.statistic: String
    get() = throw NoSuchFieldException("Get on statistic is not supported.")
    set(value) { this.withStatistic(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.withTreatMissingData
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.treatMissingData: String
    get() = throw NoSuchFieldException("Get on treatMissingData is not supported.")
    set(value) { this.withTreatMissingData(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.withThreshold
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.threshold: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on threshold is not supported.")
    set(value) { this.withThreshold(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.withMetrics
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.metrics: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on metrics is not supported.")
    set(value) { this.withMetrics(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.withMetricName
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.metricName: String
    get() = throw NoSuchFieldException("Get on metricName is not supported.")
    set(value) { this.withMetricName(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.withEvaluationPeriods
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.evaluationPeriods: Number
    get() = throw NoSuchFieldException("Get on evaluationPeriods is not supported.")
    set(value) { this.withEvaluationPeriods(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.withExtendedStatistic
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarmProps.Builder.extendedStatistic: String
    get() = throw NoSuchFieldException("Get on extendedStatistic is not supported.")
    set(value) { this.withExtendedStatistic(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.Dimension.Builder
 */
fun dimension(init: software.amazon.awscdk.services.cloudwatch.Dimension.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.Dimension {
    val builder = software.amazon.awscdk.services.cloudwatch.Dimension.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.Dimension.Builder.withValue
 */
var software.amazon.awscdk.services.cloudwatch.Dimension.Builder.value: Any
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.Dimension.Builder.withName
 */
var software.amazon.awscdk.services.cloudwatch.Dimension.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.Builder
 */
fun alarmWidgetProps(init: software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps {
    val builder = software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.Builder.withRegion
 */
var software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.Builder.withHeight
 */
var software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.Builder.height: Number
    get() = throw NoSuchFieldException("Get on height is not supported.")
    set(value) { this.withHeight(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.Builder.withTitle
 */
var software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.Builder.title: String
    get() = throw NoSuchFieldException("Get on title is not supported.")
    set(value) { this.withTitle(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.Builder.withWidth
 */
var software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.Builder.width: Number
    get() = throw NoSuchFieldException("Get on width is not supported.")
    set(value) { this.withWidth(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.Builder.withLeftAxisRange
 */
var software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.Builder.leftAxisRange: software.amazon.awscdk.services.cloudwatch.YAxisRange
    get() = throw NoSuchFieldException("Get on leftAxisRange is not supported.")
    set(value) { this.withLeftAxisRange(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.Builder.withAlarm
 */
var software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.Builder.alarm: software.amazon.awscdk.services.cloudwatch.Alarm
    get() = throw NoSuchFieldException("Get on alarm is not supported.")
    set(value) { this.withAlarm(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricProps.Builder
 */
fun metricProps(init: software.amazon.awscdk.services.cloudwatch.MetricProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.MetricProps {
    val builder = software.amazon.awscdk.services.cloudwatch.MetricProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricProps.Builder.withNamespace
 */
var software.amazon.awscdk.services.cloudwatch.MetricProps.Builder.namespace: String
    get() = throw NoSuchFieldException("Get on namespace is not supported.")
    set(value) { this.withNamespace(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricProps.Builder.withUnit
 */
var software.amazon.awscdk.services.cloudwatch.MetricProps.Builder.unit: software.amazon.awscdk.services.cloudwatch.Unit
    get() = throw NoSuchFieldException("Get on unit is not supported.")
    set(value) { this.withUnit(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricProps.Builder.withLabel
 */
var software.amazon.awscdk.services.cloudwatch.MetricProps.Builder.label: String
    get() = throw NoSuchFieldException("Get on label is not supported.")
    set(value) { this.withLabel(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricProps.Builder.withColor
 */
var software.amazon.awscdk.services.cloudwatch.MetricProps.Builder.color: String
    get() = throw NoSuchFieldException("Get on color is not supported.")
    set(value) { this.withColor(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricProps.Builder.withPeriodSec
 */
var software.amazon.awscdk.services.cloudwatch.MetricProps.Builder.periodSec: Number
    get() = throw NoSuchFieldException("Get on periodSec is not supported.")
    set(value) { this.withPeriodSec(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricProps.Builder.withStatistic
 */
var software.amazon.awscdk.services.cloudwatch.MetricProps.Builder.statistic: String
    get() = throw NoSuchFieldException("Get on statistic is not supported.")
    set(value) { this.withStatistic(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricProps.Builder.withMetricName
 */
var software.amazon.awscdk.services.cloudwatch.MetricProps.Builder.metricName: String
    get() = throw NoSuchFieldException("Get on metricName is not supported.")
    set(value) { this.withMetricName(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.Builder
 */
fun horizontalAnnotation(init: software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation {
    val builder = software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.Builder.withValue
 */
var software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.Builder.value: Number
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.Builder.withLabel
 */
var software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.Builder.label: String
    get() = throw NoSuchFieldException("Get on label is not supported.")
    set(value) { this.withLabel(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.Builder.withColor
 */
var software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.Builder.color: String
    get() = throw NoSuchFieldException("Get on color is not supported.")
    set(value) { this.withColor(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.Builder.withFill
 */
var software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.Builder.fill: software.amazon.awscdk.services.cloudwatch.Shading
    get() = throw NoSuchFieldException("Get on fill is not supported.")
    set(value) { this.withFill(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.Builder.withVisible
 */
var software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.Builder.visible: Boolean
    get() = throw NoSuchFieldException("Get on visible is not supported.")
    set(value) { this.withVisible(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder
 */
fun alarmProps(init: software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.AlarmProps {
    val builder = software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.withActionsEnabled
 */
var software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.actionsEnabled: Boolean
    get() = throw NoSuchFieldException("Get on actionsEnabled is not supported.")
    set(value) { this.withActionsEnabled(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.withAlarmDescription
 */
var software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.alarmDescription: String
    get() = throw NoSuchFieldException("Get on alarmDescription is not supported.")
    set(value) { this.withAlarmDescription(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.withAlarmName
 */
var software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.alarmName: String
    get() = throw NoSuchFieldException("Get on alarmName is not supported.")
    set(value) { this.withAlarmName(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.withComparisonOperator
 */
var software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.comparisonOperator: software.amazon.awscdk.services.cloudwatch.ComparisonOperator
    get() = throw NoSuchFieldException("Get on comparisonOperator is not supported.")
    set(value) { this.withComparisonOperator(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.withDatapointsToAlarm
 */
var software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.datapointsToAlarm: Number
    get() = throw NoSuchFieldException("Get on datapointsToAlarm is not supported.")
    set(value) { this.withDatapointsToAlarm(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.withEvaluateLowSampleCountPercentile
 */
var software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.evaluateLowSampleCountPercentile: String
    get() = throw NoSuchFieldException("Get on evaluateLowSampleCountPercentile is not supported.")
    set(value) { this.withEvaluateLowSampleCountPercentile(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.withPeriodSec
 */
var software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.periodSec: Number
    get() = throw NoSuchFieldException("Get on periodSec is not supported.")
    set(value) { this.withPeriodSec(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.withStatistic
 */
var software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.statistic: String
    get() = throw NoSuchFieldException("Get on statistic is not supported.")
    set(value) { this.withStatistic(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.withTreatMissingData
 */
var software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.treatMissingData: software.amazon.awscdk.services.cloudwatch.TreatMissingData
    get() = throw NoSuchFieldException("Get on treatMissingData is not supported.")
    set(value) { this.withTreatMissingData(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.withThreshold
 */
var software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.threshold: Number
    get() = throw NoSuchFieldException("Get on threshold is not supported.")
    set(value) { this.withThreshold(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.withEvaluationPeriods
 */
var software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.evaluationPeriods: Number
    get() = throw NoSuchFieldException("Get on evaluationPeriods is not supported.")
    set(value) { this.withEvaluationPeriods(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.withMetric
 */
var software.amazon.awscdk.services.cloudwatch.AlarmProps.Builder.metric: software.amazon.awscdk.services.cloudwatch.Metric
    get() = throw NoSuchFieldException("Get on metric is not supported.")
    set(value) { this.withMetric(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.DashboardProps.Builder
 */
fun dashboardProps(init: software.amazon.awscdk.services.cloudwatch.DashboardProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.DashboardProps {
    val builder = software.amazon.awscdk.services.cloudwatch.DashboardProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.DashboardProps.Builder.withDashboardName
 */
var software.amazon.awscdk.services.cloudwatch.DashboardProps.Builder.dashboardName: String
    get() = throw NoSuchFieldException("Get on dashboardName is not supported.")
    set(value) { this.withDashboardName(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnDashboardProps.Builder
 */
fun cfnDashboardProps(init: software.amazon.awscdk.services.cloudwatch.CfnDashboardProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.CfnDashboardProps {
    val builder = software.amazon.awscdk.services.cloudwatch.CfnDashboardProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnDashboardProps.Builder.withDashboardName
 */
var software.amazon.awscdk.services.cloudwatch.CfnDashboardProps.Builder.dashboardName: String
    get() = throw NoSuchFieldException("Get on dashboardName is not supported.")
    set(value) { this.withDashboardName(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnDashboardProps.Builder.withDashboardBody
 */
var software.amazon.awscdk.services.cloudwatch.CfnDashboardProps.Builder.dashboardBody: String
    get() = throw NoSuchFieldException("Get on dashboardBody is not supported.")
    set(value) { this.withDashboardBody(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty.Builder
 */
fun metricDataQueryProperty(init: software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty {
    val builder = software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty.Builder.withId
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty.Builder.withExpression
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty.Builder.expression: String
    get() = throw NoSuchFieldException("Get on expression is not supported.")
    set(value) { this.withExpression(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty.Builder.withLabel
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty.Builder.label: String
    get() = throw NoSuchFieldException("Get on label is not supported.")
    set(value) { this.withLabel(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty.Builder.withMetricStat
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty.Builder.metricStat: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on metricStat is not supported.")
    set(value) { this.withMetricStat(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty.Builder.withReturnData
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricDataQueryProperty.Builder.returnData: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on returnData is not supported.")
    set(value) { this.withReturnData(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricWidgetProps.Builder
 */
fun metricWidgetProps(init: software.amazon.awscdk.services.cloudwatch.MetricWidgetProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.MetricWidgetProps {
    val builder = software.amazon.awscdk.services.cloudwatch.MetricWidgetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricWidgetProps.Builder.withRegion
 */
var software.amazon.awscdk.services.cloudwatch.MetricWidgetProps.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricWidgetProps.Builder.withHeight
 */
var software.amazon.awscdk.services.cloudwatch.MetricWidgetProps.Builder.height: Number
    get() = throw NoSuchFieldException("Get on height is not supported.")
    set(value) { this.withHeight(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricWidgetProps.Builder.withTitle
 */
var software.amazon.awscdk.services.cloudwatch.MetricWidgetProps.Builder.title: String
    get() = throw NoSuchFieldException("Get on title is not supported.")
    set(value) { this.withTitle(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricWidgetProps.Builder.withWidth
 */
var software.amazon.awscdk.services.cloudwatch.MetricWidgetProps.Builder.width: Number
    get() = throw NoSuchFieldException("Get on width is not supported.")
    set(value) { this.withWidth(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty.Builder
 */
fun dimensionProperty(init: software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty {
    val builder = software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty.Builder.withValue
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty.Builder.withName
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.YAxisRange.Builder
 */
fun yAxisRange(init: software.amazon.awscdk.services.cloudwatch.YAxisRange.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.YAxisRange {
    val builder = software.amazon.awscdk.services.cloudwatch.YAxisRange.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.YAxisRange.Builder.withMin
 */
var software.amazon.awscdk.services.cloudwatch.YAxisRange.Builder.min: Number
    get() = throw NoSuchFieldException("Get on min is not supported.")
    set(value) { this.withMin(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.YAxisRange.Builder.withMax
 */
var software.amazon.awscdk.services.cloudwatch.YAxisRange.Builder.max: Number
    get() = throw NoSuchFieldException("Get on max is not supported.")
    set(value) { this.withMax(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder
 */
fun metricAlarmProps(init: software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.MetricAlarmProps {
    val builder = software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.withActionsEnabled
 */
var software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.actionsEnabled: Boolean
    get() = throw NoSuchFieldException("Get on actionsEnabled is not supported.")
    set(value) { this.withActionsEnabled(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.withAlarmDescription
 */
var software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.alarmDescription: String
    get() = throw NoSuchFieldException("Get on alarmDescription is not supported.")
    set(value) { this.withAlarmDescription(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.withAlarmName
 */
var software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.alarmName: String
    get() = throw NoSuchFieldException("Get on alarmName is not supported.")
    set(value) { this.withAlarmName(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.withComparisonOperator
 */
var software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.comparisonOperator: software.amazon.awscdk.services.cloudwatch.ComparisonOperator
    get() = throw NoSuchFieldException("Get on comparisonOperator is not supported.")
    set(value) { this.withComparisonOperator(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.withDatapointsToAlarm
 */
var software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.datapointsToAlarm: Number
    get() = throw NoSuchFieldException("Get on datapointsToAlarm is not supported.")
    set(value) { this.withDatapointsToAlarm(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.withEvaluateLowSampleCountPercentile
 */
var software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.evaluateLowSampleCountPercentile: String
    get() = throw NoSuchFieldException("Get on evaluateLowSampleCountPercentile is not supported.")
    set(value) { this.withEvaluateLowSampleCountPercentile(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.withPeriodSec
 */
var software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.periodSec: Number
    get() = throw NoSuchFieldException("Get on periodSec is not supported.")
    set(value) { this.withPeriodSec(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.withStatistic
 */
var software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.statistic: String
    get() = throw NoSuchFieldException("Get on statistic is not supported.")
    set(value) { this.withStatistic(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.withTreatMissingData
 */
var software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.treatMissingData: software.amazon.awscdk.services.cloudwatch.TreatMissingData
    get() = throw NoSuchFieldException("Get on treatMissingData is not supported.")
    set(value) { this.withTreatMissingData(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.withThreshold
 */
var software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.threshold: Number
    get() = throw NoSuchFieldException("Get on threshold is not supported.")
    set(value) { this.withThreshold(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.withEvaluationPeriods
 */
var software.amazon.awscdk.services.cloudwatch.MetricAlarmProps.Builder.evaluationPeriods: Number
    get() = throw NoSuchFieldException("Get on evaluationPeriods is not supported.")
    set(value) { this.withEvaluationPeriods(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps.Builder
 */
fun singleValueWidgetProps(init: software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps {
    val builder = software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps.Builder.withRegion
 */
var software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps.Builder.withHeight
 */
var software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps.Builder.height: Number
    get() = throw NoSuchFieldException("Get on height is not supported.")
    set(value) { this.withHeight(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps.Builder.withTitle
 */
var software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps.Builder.title: String
    get() = throw NoSuchFieldException("Get on title is not supported.")
    set(value) { this.withTitle(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps.Builder.withWidth
 */
var software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps.Builder.width: Number
    get() = throw NoSuchFieldException("Get on width is not supported.")
    set(value) { this.withWidth(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty.Builder
 */
fun metricProperty(init: software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty {
    val builder = software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty.Builder.withNamespace
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty.Builder.namespace: String
    get() = throw NoSuchFieldException("Get on namespace is not supported.")
    set(value) { this.withNamespace(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty.Builder.withDimensions
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty.Builder.dimensions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on dimensions is not supported.")
    set(value) { this.withDimensions(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty.Builder.withMetricName
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty.Builder.metricName: String
    get() = throw NoSuchFieldException("Get on metricName is not supported.")
    set(value) { this.withMetricName(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.SpacerProps.Builder
 */
fun spacerProps(init: software.amazon.awscdk.services.cloudwatch.SpacerProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.SpacerProps {
    val builder = software.amazon.awscdk.services.cloudwatch.SpacerProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.SpacerProps.Builder.withHeight
 */
var software.amazon.awscdk.services.cloudwatch.SpacerProps.Builder.height: Number
    get() = throw NoSuchFieldException("Get on height is not supported.")
    set(value) { this.withHeight(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.SpacerProps.Builder.withWidth
 */
var software.amazon.awscdk.services.cloudwatch.SpacerProps.Builder.width: Number
    get() = throw NoSuchFieldException("Get on width is not supported.")
    set(value) { this.withWidth(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricCustomization.Builder
 */
fun metricCustomization(init: software.amazon.awscdk.services.cloudwatch.MetricCustomization.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.MetricCustomization {
    val builder = software.amazon.awscdk.services.cloudwatch.MetricCustomization.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricCustomization.Builder.withUnit
 */
var software.amazon.awscdk.services.cloudwatch.MetricCustomization.Builder.unit: software.amazon.awscdk.services.cloudwatch.Unit
    get() = throw NoSuchFieldException("Get on unit is not supported.")
    set(value) { this.withUnit(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricCustomization.Builder.withLabel
 */
var software.amazon.awscdk.services.cloudwatch.MetricCustomization.Builder.label: String
    get() = throw NoSuchFieldException("Get on label is not supported.")
    set(value) { this.withLabel(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricCustomization.Builder.withColor
 */
var software.amazon.awscdk.services.cloudwatch.MetricCustomization.Builder.color: String
    get() = throw NoSuchFieldException("Get on color is not supported.")
    set(value) { this.withColor(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricCustomization.Builder.withPeriodSec
 */
var software.amazon.awscdk.services.cloudwatch.MetricCustomization.Builder.periodSec: Number
    get() = throw NoSuchFieldException("Get on periodSec is not supported.")
    set(value) { this.withPeriodSec(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.MetricCustomization.Builder.withStatistic
 */
var software.amazon.awscdk.services.cloudwatch.MetricCustomization.Builder.statistic: String
    get() = throw NoSuchFieldException("Get on statistic is not supported.")
    set(value) { this.withStatistic(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmMetricJson.Builder
 */
fun alarmMetricJson(init: software.amazon.awscdk.services.cloudwatch.AlarmMetricJson.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.AlarmMetricJson {
    val builder = software.amazon.awscdk.services.cloudwatch.AlarmMetricJson.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmMetricJson.Builder.withNamespace
 */
var software.amazon.awscdk.services.cloudwatch.AlarmMetricJson.Builder.namespace: String
    get() = throw NoSuchFieldException("Get on namespace is not supported.")
    set(value) { this.withNamespace(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmMetricJson.Builder.withUnit
 */
var software.amazon.awscdk.services.cloudwatch.AlarmMetricJson.Builder.unit: software.amazon.awscdk.services.cloudwatch.Unit
    get() = throw NoSuchFieldException("Get on unit is not supported.")
    set(value) { this.withUnit(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmMetricJson.Builder.withPeriod
 */
var software.amazon.awscdk.services.cloudwatch.AlarmMetricJson.Builder.period: Number
    get() = throw NoSuchFieldException("Get on period is not supported.")
    set(value) { this.withPeriod(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmMetricJson.Builder.withStatistic
 */
var software.amazon.awscdk.services.cloudwatch.AlarmMetricJson.Builder.statistic: software.amazon.awscdk.services.cloudwatch.Statistic
    get() = throw NoSuchFieldException("Get on statistic is not supported.")
    set(value) { this.withStatistic(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmMetricJson.Builder.withMetricName
 */
var software.amazon.awscdk.services.cloudwatch.AlarmMetricJson.Builder.metricName: String
    get() = throw NoSuchFieldException("Get on metricName is not supported.")
    set(value) { this.withMetricName(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.AlarmMetricJson.Builder.withExtendedStatistic
 */
var software.amazon.awscdk.services.cloudwatch.AlarmMetricJson.Builder.extendedStatistic: String
    get() = throw NoSuchFieldException("Get on extendedStatistic is not supported.")
    set(value) { this.withExtendedStatistic(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty.Builder
 */
fun metricStatProperty(init: software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty {
    val builder = software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty.Builder.withUnit
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty.Builder.unit: String
    get() = throw NoSuchFieldException("Get on unit is not supported.")
    set(value) { this.withUnit(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty.Builder.withPeriod
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty.Builder.period: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on period is not supported.")
    set(value) { this.withPeriod(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty.Builder.withMetric
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty.Builder.metric: software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty
    get() = throw NoSuchFieldException("Get on metric is not supported.")
    set(value) { this.withMetric(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty.Builder.withStat
 */
var software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricStatProperty.Builder.stat: String
    get() = throw NoSuchFieldException("Get on stat is not supported.")
    set(value) { this.withStat(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.TextWidgetProps.Builder
 */
fun textWidgetProps(init: software.amazon.awscdk.services.cloudwatch.TextWidgetProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.TextWidgetProps {
    val builder = software.amazon.awscdk.services.cloudwatch.TextWidgetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.TextWidgetProps.Builder.withMarkdown
 */
var software.amazon.awscdk.services.cloudwatch.TextWidgetProps.Builder.markdown: String
    get() = throw NoSuchFieldException("Get on markdown is not supported.")
    set(value) { this.withMarkdown(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.TextWidgetProps.Builder.withHeight
 */
var software.amazon.awscdk.services.cloudwatch.TextWidgetProps.Builder.height: Number
    get() = throw NoSuchFieldException("Get on height is not supported.")
    set(value) { this.withHeight(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.TextWidgetProps.Builder.withWidth
 */
var software.amazon.awscdk.services.cloudwatch.TextWidgetProps.Builder.width: Number
    get() = throw NoSuchFieldException("Get on width is not supported.")
    set(value) { this.withWidth(value) }


/**
 * @see software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder
 */
fun graphWidgetProps(init: software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudwatch.GraphWidgetProps {
    val builder = software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder.withRegion
 */
var software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder.withHeight
 */
var software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder.height: Number
    get() = throw NoSuchFieldException("Get on height is not supported.")
    set(value) { this.withHeight(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder.withTitle
 */
var software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder.title: String
    get() = throw NoSuchFieldException("Get on title is not supported.")
    set(value) { this.withTitle(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder.withWidth
 */
var software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder.width: Number
    get() = throw NoSuchFieldException("Get on width is not supported.")
    set(value) { this.withWidth(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder.withLeftAxisRange
 */
var software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder.leftAxisRange: software.amazon.awscdk.services.cloudwatch.YAxisRange
    get() = throw NoSuchFieldException("Get on leftAxisRange is not supported.")
    set(value) { this.withLeftAxisRange(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder.withRightAxisRange
 */
var software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder.rightAxisRange: software.amazon.awscdk.services.cloudwatch.YAxisRange
    get() = throw NoSuchFieldException("Get on rightAxisRange is not supported.")
    set(value) { this.withRightAxisRange(value) }

/**
 * @see software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder.withStacked
 */
var software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder.stacked: Boolean
    get() = throw NoSuchFieldException("Get on stacked is not supported.")
    set(value) { this.withStacked(value) }
