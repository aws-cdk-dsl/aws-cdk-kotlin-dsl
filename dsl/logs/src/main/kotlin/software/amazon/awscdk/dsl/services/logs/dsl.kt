package software.amazon.awscdk.dsl.services.logs
/**
 * @see software.amazon.awscdk.services.logs.CfnMetricFilter
 */
fun software.amazon.awscdk.Construct.cfnMetricFilter(id: String,
                     props: software.amazon.awscdk.services.logs.CfnMetricFilterProps? = null,
                     init: (software.amazon.awscdk.services.logs.CfnMetricFilter.() -> Unit)? = null)
        : software.amazon.awscdk.services.logs.CfnMetricFilter {

    val obj = software.amazon.awscdk.services.logs.CfnMetricFilter(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.logs.CfnLogStream
 */
fun software.amazon.awscdk.Construct.cfnLogStream(id: String,
                     props: software.amazon.awscdk.services.logs.CfnLogStreamProps? = null,
                     init: (software.amazon.awscdk.services.logs.CfnLogStream.() -> Unit)? = null)
        : software.amazon.awscdk.services.logs.CfnLogStream {

    val obj = software.amazon.awscdk.services.logs.CfnLogStream(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.logs.CfnSubscriptionFilter
 */
fun software.amazon.awscdk.Construct.cfnSubscriptionFilter(id: String,
                     props: software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps? = null,
                     init: (software.amazon.awscdk.services.logs.CfnSubscriptionFilter.() -> Unit)? = null)
        : software.amazon.awscdk.services.logs.CfnSubscriptionFilter {

    val obj = software.amazon.awscdk.services.logs.CfnSubscriptionFilter(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.logs.CfnLogGroup
 */
fun software.amazon.awscdk.Construct.cfnLogGroup(id: String,
                     props: software.amazon.awscdk.services.logs.CfnLogGroupProps? = null,
                     init: (software.amazon.awscdk.services.logs.CfnLogGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.logs.CfnLogGroup {

    val obj = software.amazon.awscdk.services.logs.CfnLogGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.logs.MetricFilter
 */
fun software.amazon.awscdk.Construct.metricFilter(id: String,
                     props: software.amazon.awscdk.services.logs.MetricFilterProps? = null,
                     init: (software.amazon.awscdk.services.logs.MetricFilter.() -> Unit)? = null)
        : software.amazon.awscdk.services.logs.MetricFilter {

    val obj = software.amazon.awscdk.services.logs.MetricFilter(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.logs.CrossAccountDestination
 */
fun software.amazon.awscdk.Construct.crossAccountDestination(id: String,
                     props: software.amazon.awscdk.services.logs.CrossAccountDestinationProps? = null,
                     init: (software.amazon.awscdk.services.logs.CrossAccountDestination.() -> Unit)? = null)
        : software.amazon.awscdk.services.logs.CrossAccountDestination {

    val obj = software.amazon.awscdk.services.logs.CrossAccountDestination(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.logs.LogGroup
 */
fun software.amazon.awscdk.Construct.logGroup(id: String,
                     props: software.amazon.awscdk.services.logs.LogGroupProps? = null,
                     init: (software.amazon.awscdk.services.logs.LogGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.logs.LogGroup {

    val obj = software.amazon.awscdk.services.logs.LogGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.logs.SubscriptionFilter
 */
fun software.amazon.awscdk.Construct.subscriptionFilter(id: String,
                     props: software.amazon.awscdk.services.logs.SubscriptionFilterProps? = null,
                     init: (software.amazon.awscdk.services.logs.SubscriptionFilter.() -> Unit)? = null)
        : software.amazon.awscdk.services.logs.SubscriptionFilter {

    val obj = software.amazon.awscdk.services.logs.SubscriptionFilter(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.logs.CfnDestination
 */
fun software.amazon.awscdk.Construct.cfnDestination(id: String,
                     props: software.amazon.awscdk.services.logs.CfnDestinationProps? = null,
                     init: (software.amazon.awscdk.services.logs.CfnDestination.() -> Unit)? = null)
        : software.amazon.awscdk.services.logs.CfnDestination {

    val obj = software.amazon.awscdk.services.logs.CfnDestination(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.logs.LogStream
 */
fun software.amazon.awscdk.Construct.logStream(id: String,
                     props: software.amazon.awscdk.services.logs.LogStreamProps? = null,
                     init: (software.amazon.awscdk.services.logs.LogStream.() -> Unit)? = null)
        : software.amazon.awscdk.services.logs.LogStream {

    val obj = software.amazon.awscdk.services.logs.LogStream(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.logs.CfnLogGroup
 */
fun software.amazon.awscdk.Construct.cfnLogGroup(id: String,
                     init: (software.amazon.awscdk.services.logs.CfnLogGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.logs.CfnLogGroup {

    val obj = software.amazon.awscdk.services.logs.CfnLogGroup(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.logs.LogGroup
 */
fun software.amazon.awscdk.Construct.logGroup(id: String,
                     init: (software.amazon.awscdk.services.logs.LogGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.logs.LogGroup {

    val obj = software.amazon.awscdk.services.logs.LogGroup(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.logs.CfnLogGroupProps.Builder
 */
fun cfnLogGroupProps(init: software.amazon.awscdk.services.logs.CfnLogGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.logs.CfnLogGroupProps {
    val builder = software.amazon.awscdk.services.logs.CfnLogGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.logs.CfnLogGroupProps.Builder.withLogGroupName
 */
var software.amazon.awscdk.services.logs.CfnLogGroupProps.Builder.logGroupName: String
    get() = throw NoSuchFieldException("Get on logGroupName is not supported.")
    set(value) { this.withLogGroupName(value) }

/**
 * @see software.amazon.awscdk.services.logs.CfnLogGroupProps.Builder.withRetentionInDays
 */
var software.amazon.awscdk.services.logs.CfnLogGroupProps.Builder.retentionInDays: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on retentionInDays is not supported.")
    set(value) { this.withRetentionInDays(value) }


/**
 * @see software.amazon.awscdk.services.logs.LogGroupImportProps.Builder
 */
fun logGroupImportProps(init: software.amazon.awscdk.services.logs.LogGroupImportProps.Builder.() -> Unit): software.amazon.awscdk.services.logs.LogGroupImportProps {
    val builder = software.amazon.awscdk.services.logs.LogGroupImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.logs.LogGroupImportProps.Builder.withLogGroupArn
 */
var software.amazon.awscdk.services.logs.LogGroupImportProps.Builder.logGroupArn: String
    get() = throw NoSuchFieldException("Get on logGroupArn is not supported.")
    set(value) { this.withLogGroupArn(value) }


/**
 * @see software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps.Builder
 */
fun cfnSubscriptionFilterProps(init: software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps.Builder.() -> Unit): software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps {
    val builder = software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps.Builder.withDestinationArn
 */
var software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps.Builder.destinationArn: String
    get() = throw NoSuchFieldException("Get on destinationArn is not supported.")
    set(value) { this.withDestinationArn(value) }

/**
 * @see software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps.Builder.withFilterPattern
 */
var software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps.Builder.filterPattern: String
    get() = throw NoSuchFieldException("Get on filterPattern is not supported.")
    set(value) { this.withFilterPattern(value) }

/**
 * @see software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps.Builder.withLogGroupName
 */
var software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps.Builder.logGroupName: String
    get() = throw NoSuchFieldException("Get on logGroupName is not supported.")
    set(value) { this.withLogGroupName(value) }

/**
 * @see software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps.Builder.withRoleArn
 */
var software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }


/**
 * @see software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty.Builder
 */
fun metricTransformationProperty(init: software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty.Builder.() -> Unit): software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty {
    val builder = software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty.Builder.withMetricNamespace
 */
var software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty.Builder.metricNamespace: String
    get() = throw NoSuchFieldException("Get on metricNamespace is not supported.")
    set(value) { this.withMetricNamespace(value) }

/**
 * @see software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty.Builder.withDefaultValue
 */
var software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty.Builder.defaultValue: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on defaultValue is not supported.")
    set(value) { this.withDefaultValue(value) }

/**
 * @see software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty.Builder.withMetricValue
 */
var software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty.Builder.metricValue: String
    get() = throw NoSuchFieldException("Get on metricValue is not supported.")
    set(value) { this.withMetricValue(value) }

/**
 * @see software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty.Builder.withMetricName
 */
var software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty.Builder.metricName: String
    get() = throw NoSuchFieldException("Get on metricName is not supported.")
    set(value) { this.withMetricName(value) }


/**
 * @see software.amazon.awscdk.services.logs.MetricFilterProps.Builder
 */
fun metricFilterProps(init: software.amazon.awscdk.services.logs.MetricFilterProps.Builder.() -> Unit): software.amazon.awscdk.services.logs.MetricFilterProps {
    val builder = software.amazon.awscdk.services.logs.MetricFilterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.logs.MetricFilterProps.Builder.withFilterPattern
 */
var software.amazon.awscdk.services.logs.MetricFilterProps.Builder.filterPattern: software.amazon.awscdk.services.logs.IFilterPattern
    get() = throw NoSuchFieldException("Get on filterPattern is not supported.")
    set(value) { this.withFilterPattern(value) }

/**
 * @see software.amazon.awscdk.services.logs.MetricFilterProps.Builder.withMetricNamespace
 */
var software.amazon.awscdk.services.logs.MetricFilterProps.Builder.metricNamespace: String
    get() = throw NoSuchFieldException("Get on metricNamespace is not supported.")
    set(value) { this.withMetricNamespace(value) }

/**
 * @see software.amazon.awscdk.services.logs.MetricFilterProps.Builder.withDefaultValue
 */
var software.amazon.awscdk.services.logs.MetricFilterProps.Builder.defaultValue: Number
    get() = throw NoSuchFieldException("Get on defaultValue is not supported.")
    set(value) { this.withDefaultValue(value) }

/**
 * @see software.amazon.awscdk.services.logs.MetricFilterProps.Builder.withMetricValue
 */
var software.amazon.awscdk.services.logs.MetricFilterProps.Builder.metricValue: String
    get() = throw NoSuchFieldException("Get on metricValue is not supported.")
    set(value) { this.withMetricValue(value) }

/**
 * @see software.amazon.awscdk.services.logs.MetricFilterProps.Builder.withMetricName
 */
var software.amazon.awscdk.services.logs.MetricFilterProps.Builder.metricName: String
    get() = throw NoSuchFieldException("Get on metricName is not supported.")
    set(value) { this.withMetricName(value) }

/**
 * @see software.amazon.awscdk.services.logs.MetricFilterProps.Builder.withLogGroup
 */
var software.amazon.awscdk.services.logs.MetricFilterProps.Builder.logGroup: software.amazon.awscdk.services.logs.ILogGroup
    get() = throw NoSuchFieldException("Get on logGroup is not supported.")
    set(value) { this.withLogGroup(value) }


/**
 * @see software.amazon.awscdk.services.logs.CfnLogStreamProps.Builder
 */
fun cfnLogStreamProps(init: software.amazon.awscdk.services.logs.CfnLogStreamProps.Builder.() -> Unit): software.amazon.awscdk.services.logs.CfnLogStreamProps {
    val builder = software.amazon.awscdk.services.logs.CfnLogStreamProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.logs.CfnLogStreamProps.Builder.withLogGroupName
 */
var software.amazon.awscdk.services.logs.CfnLogStreamProps.Builder.logGroupName: String
    get() = throw NoSuchFieldException("Get on logGroupName is not supported.")
    set(value) { this.withLogGroupName(value) }

/**
 * @see software.amazon.awscdk.services.logs.CfnLogStreamProps.Builder.withLogStreamName
 */
var software.amazon.awscdk.services.logs.CfnLogStreamProps.Builder.logStreamName: String
    get() = throw NoSuchFieldException("Get on logStreamName is not supported.")
    set(value) { this.withLogStreamName(value) }


/**
 * @see software.amazon.awscdk.services.logs.LogGroupProps.Builder
 */
fun logGroupProps(init: software.amazon.awscdk.services.logs.LogGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.logs.LogGroupProps {
    val builder = software.amazon.awscdk.services.logs.LogGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.logs.LogGroupProps.Builder.withLogGroupName
 */
var software.amazon.awscdk.services.logs.LogGroupProps.Builder.logGroupName: String
    get() = throw NoSuchFieldException("Get on logGroupName is not supported.")
    set(value) { this.withLogGroupName(value) }

/**
 * @see software.amazon.awscdk.services.logs.LogGroupProps.Builder.withRetainLogGroup
 */
var software.amazon.awscdk.services.logs.LogGroupProps.Builder.retainLogGroup: Boolean
    get() = throw NoSuchFieldException("Get on retainLogGroup is not supported.")
    set(value) { this.withRetainLogGroup(value) }

/**
 * @see software.amazon.awscdk.services.logs.LogGroupProps.Builder.withRetentionDays
 */
var software.amazon.awscdk.services.logs.LogGroupProps.Builder.retentionDays: software.amazon.awscdk.services.logs.RetentionDays
    get() = throw NoSuchFieldException("Get on retentionDays is not supported.")
    set(value) { this.withRetentionDays(value) }


/**
 * @see software.amazon.awscdk.services.logs.CrossAccountDestinationProps.Builder
 */
fun crossAccountDestinationProps(init: software.amazon.awscdk.services.logs.CrossAccountDestinationProps.Builder.() -> Unit): software.amazon.awscdk.services.logs.CrossAccountDestinationProps {
    val builder = software.amazon.awscdk.services.logs.CrossAccountDestinationProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.logs.CrossAccountDestinationProps.Builder.withRole
 */
var software.amazon.awscdk.services.logs.CrossAccountDestinationProps.Builder.role: software.amazon.awscdk.services.iam.Role
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.logs.CrossAccountDestinationProps.Builder.withTargetArn
 */
var software.amazon.awscdk.services.logs.CrossAccountDestinationProps.Builder.targetArn: String
    get() = throw NoSuchFieldException("Get on targetArn is not supported.")
    set(value) { this.withTargetArn(value) }

/**
 * @see software.amazon.awscdk.services.logs.CrossAccountDestinationProps.Builder.withDestinationName
 */
var software.amazon.awscdk.services.logs.CrossAccountDestinationProps.Builder.destinationName: String
    get() = throw NoSuchFieldException("Get on destinationName is not supported.")
    set(value) { this.withDestinationName(value) }


/**
 * @see software.amazon.awscdk.services.logs.NewLogStreamProps.Builder
 */
fun newLogStreamProps(init: software.amazon.awscdk.services.logs.NewLogStreamProps.Builder.() -> Unit): software.amazon.awscdk.services.logs.NewLogStreamProps {
    val builder = software.amazon.awscdk.services.logs.NewLogStreamProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.logs.NewLogStreamProps.Builder.withLogStreamName
 */
var software.amazon.awscdk.services.logs.NewLogStreamProps.Builder.logStreamName: String
    get() = throw NoSuchFieldException("Get on logStreamName is not supported.")
    set(value) { this.withLogStreamName(value) }


/**
 * @see software.amazon.awscdk.services.logs.CfnDestinationProps.Builder
 */
fun cfnDestinationProps(init: software.amazon.awscdk.services.logs.CfnDestinationProps.Builder.() -> Unit): software.amazon.awscdk.services.logs.CfnDestinationProps {
    val builder = software.amazon.awscdk.services.logs.CfnDestinationProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.logs.CfnDestinationProps.Builder.withRoleArn
 */
var software.amazon.awscdk.services.logs.CfnDestinationProps.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.logs.CfnDestinationProps.Builder.withTargetArn
 */
var software.amazon.awscdk.services.logs.CfnDestinationProps.Builder.targetArn: String
    get() = throw NoSuchFieldException("Get on targetArn is not supported.")
    set(value) { this.withTargetArn(value) }

/**
 * @see software.amazon.awscdk.services.logs.CfnDestinationProps.Builder.withDestinationName
 */
var software.amazon.awscdk.services.logs.CfnDestinationProps.Builder.destinationName: String
    get() = throw NoSuchFieldException("Get on destinationName is not supported.")
    set(value) { this.withDestinationName(value) }

/**
 * @see software.amazon.awscdk.services.logs.CfnDestinationProps.Builder.withDestinationPolicy
 */
var software.amazon.awscdk.services.logs.CfnDestinationProps.Builder.destinationPolicy: String
    get() = throw NoSuchFieldException("Get on destinationPolicy is not supported.")
    set(value) { this.withDestinationPolicy(value) }


/**
 * @see software.amazon.awscdk.services.logs.ColumnRestriction.Builder
 */
fun columnRestriction(init: software.amazon.awscdk.services.logs.ColumnRestriction.Builder.() -> Unit): software.amazon.awscdk.services.logs.ColumnRestriction {
    val builder = software.amazon.awscdk.services.logs.ColumnRestriction.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.logs.ColumnRestriction.Builder.withStringValue
 */
var software.amazon.awscdk.services.logs.ColumnRestriction.Builder.stringValue: String
    get() = throw NoSuchFieldException("Get on stringValue is not supported.")
    set(value) { this.withStringValue(value) }

/**
 * @see software.amazon.awscdk.services.logs.ColumnRestriction.Builder.withComparison
 */
var software.amazon.awscdk.services.logs.ColumnRestriction.Builder.comparison: String
    get() = throw NoSuchFieldException("Get on comparison is not supported.")
    set(value) { this.withComparison(value) }

/**
 * @see software.amazon.awscdk.services.logs.ColumnRestriction.Builder.withNumberValue
 */
var software.amazon.awscdk.services.logs.ColumnRestriction.Builder.numberValue: Number
    get() = throw NoSuchFieldException("Get on numberValue is not supported.")
    set(value) { this.withNumberValue(value) }


/**
 * @see software.amazon.awscdk.services.logs.SubscriptionFilterProps.Builder
 */
fun subscriptionFilterProps(init: software.amazon.awscdk.services.logs.SubscriptionFilterProps.Builder.() -> Unit): software.amazon.awscdk.services.logs.SubscriptionFilterProps {
    val builder = software.amazon.awscdk.services.logs.SubscriptionFilterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.logs.SubscriptionFilterProps.Builder.withDestination
 */
var software.amazon.awscdk.services.logs.SubscriptionFilterProps.Builder.destination: software.amazon.awscdk.services.logs.ILogSubscriptionDestination
    get() = throw NoSuchFieldException("Get on destination is not supported.")
    set(value) { this.withDestination(value) }

/**
 * @see software.amazon.awscdk.services.logs.SubscriptionFilterProps.Builder.withFilterPattern
 */
var software.amazon.awscdk.services.logs.SubscriptionFilterProps.Builder.filterPattern: software.amazon.awscdk.services.logs.IFilterPattern
    get() = throw NoSuchFieldException("Get on filterPattern is not supported.")
    set(value) { this.withFilterPattern(value) }

/**
 * @see software.amazon.awscdk.services.logs.SubscriptionFilterProps.Builder.withLogGroup
 */
var software.amazon.awscdk.services.logs.SubscriptionFilterProps.Builder.logGroup: software.amazon.awscdk.services.logs.ILogGroup
    get() = throw NoSuchFieldException("Get on logGroup is not supported.")
    set(value) { this.withLogGroup(value) }


/**
 * @see software.amazon.awscdk.services.logs.LogSubscriptionDestination.Builder
 */
fun logSubscriptionDestination(init: software.amazon.awscdk.services.logs.LogSubscriptionDestination.Builder.() -> Unit): software.amazon.awscdk.services.logs.LogSubscriptionDestination {
    val builder = software.amazon.awscdk.services.logs.LogSubscriptionDestination.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.logs.LogSubscriptionDestination.Builder.withRole
 */
var software.amazon.awscdk.services.logs.LogSubscriptionDestination.Builder.role: software.amazon.awscdk.services.iam.Role
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.logs.LogSubscriptionDestination.Builder.withArn
 */
var software.amazon.awscdk.services.logs.LogSubscriptionDestination.Builder.arn: String
    get() = throw NoSuchFieldException("Get on arn is not supported.")
    set(value) { this.withArn(value) }


/**
 * @see software.amazon.awscdk.services.logs.LogStreamImportProps.Builder
 */
fun logStreamImportProps(init: software.amazon.awscdk.services.logs.LogStreamImportProps.Builder.() -> Unit): software.amazon.awscdk.services.logs.LogStreamImportProps {
    val builder = software.amazon.awscdk.services.logs.LogStreamImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.logs.LogStreamImportProps.Builder.withLogStreamName
 */
var software.amazon.awscdk.services.logs.LogStreamImportProps.Builder.logStreamName: String
    get() = throw NoSuchFieldException("Get on logStreamName is not supported.")
    set(value) { this.withLogStreamName(value) }


/**
 * @see software.amazon.awscdk.services.logs.CfnMetricFilterProps.Builder
 */
fun cfnMetricFilterProps(init: software.amazon.awscdk.services.logs.CfnMetricFilterProps.Builder.() -> Unit): software.amazon.awscdk.services.logs.CfnMetricFilterProps {
    val builder = software.amazon.awscdk.services.logs.CfnMetricFilterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.logs.CfnMetricFilterProps.Builder.withFilterPattern
 */
var software.amazon.awscdk.services.logs.CfnMetricFilterProps.Builder.filterPattern: String
    get() = throw NoSuchFieldException("Get on filterPattern is not supported.")
    set(value) { this.withFilterPattern(value) }

/**
 * @see software.amazon.awscdk.services.logs.CfnMetricFilterProps.Builder.withLogGroupName
 */
var software.amazon.awscdk.services.logs.CfnMetricFilterProps.Builder.logGroupName: String
    get() = throw NoSuchFieldException("Get on logGroupName is not supported.")
    set(value) { this.withLogGroupName(value) }

/**
 * @see software.amazon.awscdk.services.logs.CfnMetricFilterProps.Builder.withMetricTransformations
 */
var software.amazon.awscdk.services.logs.CfnMetricFilterProps.Builder.metricTransformations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on metricTransformations is not supported.")
    set(value) { this.withMetricTransformations(value) }


/**
 * @see software.amazon.awscdk.services.logs.NewSubscriptionFilterProps.Builder
 */
fun newSubscriptionFilterProps(init: software.amazon.awscdk.services.logs.NewSubscriptionFilterProps.Builder.() -> Unit): software.amazon.awscdk.services.logs.NewSubscriptionFilterProps {
    val builder = software.amazon.awscdk.services.logs.NewSubscriptionFilterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.logs.NewSubscriptionFilterProps.Builder.withDestination
 */
var software.amazon.awscdk.services.logs.NewSubscriptionFilterProps.Builder.destination: software.amazon.awscdk.services.logs.ILogSubscriptionDestination
    get() = throw NoSuchFieldException("Get on destination is not supported.")
    set(value) { this.withDestination(value) }

/**
 * @see software.amazon.awscdk.services.logs.NewSubscriptionFilterProps.Builder.withFilterPattern
 */
var software.amazon.awscdk.services.logs.NewSubscriptionFilterProps.Builder.filterPattern: software.amazon.awscdk.services.logs.IFilterPattern
    get() = throw NoSuchFieldException("Get on filterPattern is not supported.")
    set(value) { this.withFilterPattern(value) }


/**
 * @see software.amazon.awscdk.services.logs.NewMetricFilterProps.Builder
 */
fun newMetricFilterProps(init: software.amazon.awscdk.services.logs.NewMetricFilterProps.Builder.() -> Unit): software.amazon.awscdk.services.logs.NewMetricFilterProps {
    val builder = software.amazon.awscdk.services.logs.NewMetricFilterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.logs.NewMetricFilterProps.Builder.withFilterPattern
 */
var software.amazon.awscdk.services.logs.NewMetricFilterProps.Builder.filterPattern: software.amazon.awscdk.services.logs.IFilterPattern
    get() = throw NoSuchFieldException("Get on filterPattern is not supported.")
    set(value) { this.withFilterPattern(value) }

/**
 * @see software.amazon.awscdk.services.logs.NewMetricFilterProps.Builder.withMetricNamespace
 */
var software.amazon.awscdk.services.logs.NewMetricFilterProps.Builder.metricNamespace: String
    get() = throw NoSuchFieldException("Get on metricNamespace is not supported.")
    set(value) { this.withMetricNamespace(value) }

/**
 * @see software.amazon.awscdk.services.logs.NewMetricFilterProps.Builder.withDefaultValue
 */
var software.amazon.awscdk.services.logs.NewMetricFilterProps.Builder.defaultValue: Number
    get() = throw NoSuchFieldException("Get on defaultValue is not supported.")
    set(value) { this.withDefaultValue(value) }

/**
 * @see software.amazon.awscdk.services.logs.NewMetricFilterProps.Builder.withMetricValue
 */
var software.amazon.awscdk.services.logs.NewMetricFilterProps.Builder.metricValue: String
    get() = throw NoSuchFieldException("Get on metricValue is not supported.")
    set(value) { this.withMetricValue(value) }

/**
 * @see software.amazon.awscdk.services.logs.NewMetricFilterProps.Builder.withMetricName
 */
var software.amazon.awscdk.services.logs.NewMetricFilterProps.Builder.metricName: String
    get() = throw NoSuchFieldException("Get on metricName is not supported.")
    set(value) { this.withMetricName(value) }


/**
 * @see software.amazon.awscdk.services.logs.LogStreamProps.Builder
 */
fun logStreamProps(init: software.amazon.awscdk.services.logs.LogStreamProps.Builder.() -> Unit): software.amazon.awscdk.services.logs.LogStreamProps {
    val builder = software.amazon.awscdk.services.logs.LogStreamProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.logs.LogStreamProps.Builder.withLogStreamName
 */
var software.amazon.awscdk.services.logs.LogStreamProps.Builder.logStreamName: String
    get() = throw NoSuchFieldException("Get on logStreamName is not supported.")
    set(value) { this.withLogStreamName(value) }

/**
 * @see software.amazon.awscdk.services.logs.LogStreamProps.Builder.withLogGroup
 */
var software.amazon.awscdk.services.logs.LogStreamProps.Builder.logGroup: software.amazon.awscdk.services.logs.ILogGroup
    get() = throw NoSuchFieldException("Get on logGroup is not supported.")
    set(value) { this.withLogGroup(value) }

/**
 * @see software.amazon.awscdk.services.logs.LogStreamProps.Builder.withRetainLogStream
 */
var software.amazon.awscdk.services.logs.LogStreamProps.Builder.retainLogStream: Boolean
    get() = throw NoSuchFieldException("Get on retainLogStream is not supported.")
    set(value) { this.withRetainLogStream(value) }
