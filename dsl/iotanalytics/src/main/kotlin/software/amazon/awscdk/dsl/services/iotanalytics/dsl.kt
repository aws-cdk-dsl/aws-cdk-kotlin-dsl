package software.amazon.awscdk.dsl.services.iotanalytics
/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDatastore
 */
fun software.amazon.awscdk.Construct.cfnDatastore(id: String,
                     props: software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps? = null,
                     init: (software.amazon.awscdk.services.iotanalytics.CfnDatastore.() -> Unit)? = null)
        : software.amazon.awscdk.services.iotanalytics.CfnDatastore {

    val obj = software.amazon.awscdk.services.iotanalytics.CfnDatastore(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset
 */
fun software.amazon.awscdk.Construct.cfnDataset(id: String,
                     props: software.amazon.awscdk.services.iotanalytics.CfnDatasetProps? = null,
                     init: (software.amazon.awscdk.services.iotanalytics.CfnDataset.() -> Unit)? = null)
        : software.amazon.awscdk.services.iotanalytics.CfnDataset {

    val obj = software.amazon.awscdk.services.iotanalytics.CfnDataset(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnChannel
 */
fun software.amazon.awscdk.Construct.cfnChannel(id: String,
                     props: software.amazon.awscdk.services.iotanalytics.CfnChannelProps? = null,
                     init: (software.amazon.awscdk.services.iotanalytics.CfnChannel.() -> Unit)? = null)
        : software.amazon.awscdk.services.iotanalytics.CfnChannel {

    val obj = software.amazon.awscdk.services.iotanalytics.CfnChannel(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline
 */
fun software.amazon.awscdk.Construct.cfnPipeline(id: String,
                     props: software.amazon.awscdk.services.iotanalytics.CfnPipelineProps? = null,
                     init: (software.amazon.awscdk.services.iotanalytics.CfnPipeline.() -> Unit)? = null)
        : software.amazon.awscdk.services.iotanalytics.CfnPipeline {

    val obj = software.amazon.awscdk.services.iotanalytics.CfnPipeline(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDatastore
 */
fun software.amazon.awscdk.Construct.cfnDatastore(id: String,
                     init: (software.amazon.awscdk.services.iotanalytics.CfnDatastore.() -> Unit)? = null)
        : software.amazon.awscdk.services.iotanalytics.CfnDatastore {

    val obj = software.amazon.awscdk.services.iotanalytics.CfnDatastore(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnChannel
 */
fun software.amazon.awscdk.Construct.cfnChannel(id: String,
                     init: (software.amazon.awscdk.services.iotanalytics.CfnChannel.() -> Unit)? = null)
        : software.amazon.awscdk.services.iotanalytics.CfnChannel {

    val obj = software.amazon.awscdk.services.iotanalytics.CfnChannel(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty.Builder
 */
fun filterProperty(init: software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty.Builder.withDeltaTime
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty.Builder.deltaTime: software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty
    get() = throw NoSuchFieldException("Get on deltaTime is not supported.")
    set(value) { this.withDeltaTime(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty.Builder
 */
fun actionProperty(init: software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty.Builder.withActionName
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty.Builder.withQueryAction
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty.Builder.queryAction: software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty
    get() = throw NoSuchFieldException("Get on queryAction is not supported.")
    set(value) { this.withQueryAction(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty.Builder.withContainerAction
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty.Builder.containerAction: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on containerAction is not supported.")
    set(value) { this.withContainerAction(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty.Builder
 */
fun outputFileUriValueProperty(init: software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty.Builder.withFileName
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty.Builder.fileName: String
    get() = throw NoSuchFieldException("Get on fileName is not supported.")
    set(value) { this.withFileName(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty.Builder
 */
fun datasetContentVersionValueProperty(init: software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty.Builder.withDatasetName
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty.Builder.datasetName: String
    get() = throw NoSuchFieldException("Get on datasetName is not supported.")
    set(value) { this.withDatasetName(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.Builder
 */
fun deviceShadowEnrichProperty(init: software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.Builder.withThingName
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.Builder.thingName: String
    get() = throw NoSuchFieldException("Get on thingName is not supported.")
    set(value) { this.withThingName(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.Builder.withNext
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.Builder.next: String
    get() = throw NoSuchFieldException("Get on next is not supported.")
    set(value) { this.withNext(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.Builder.withAttribute
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.Builder.attribute: String
    get() = throw NoSuchFieldException("Get on attribute is not supported.")
    set(value) { this.withAttribute(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.Builder.withName
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty.Builder
 */
fun filterProperty(init: software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty.Builder.withNext
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty.Builder.next: String
    get() = throw NoSuchFieldException("Get on next is not supported.")
    set(value) { this.withNext(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty.Builder.withFilter
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty.Builder.filter: String
    get() = throw NoSuchFieldException("Get on filter is not supported.")
    set(value) { this.withFilter(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty.Builder.withName
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty.Builder
 */
fun resourceConfigurationProperty(init: software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty.Builder.withComputeType
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty.Builder.computeType: String
    get() = throw NoSuchFieldException("Get on computeType is not supported.")
    set(value) { this.withComputeType(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty.Builder.withVolumeSizeInGb
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty.Builder.volumeSizeInGb: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on volumeSizeInGb is not supported.")
    set(value) { this.withVolumeSizeInGb(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDatasetProps.Builder
 */
fun cfnDatasetProps(init: software.amazon.awscdk.services.iotanalytics.CfnDatasetProps.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnDatasetProps {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnDatasetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDatasetProps.Builder.withDatasetName
 */
var software.amazon.awscdk.services.iotanalytics.CfnDatasetProps.Builder.datasetName: String
    get() = throw NoSuchFieldException("Get on datasetName is not supported.")
    set(value) { this.withDatasetName(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDatasetProps.Builder.withActions
 */
var software.amazon.awscdk.services.iotanalytics.CfnDatasetProps.Builder.actions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on actions is not supported.")
    set(value) { this.withActions(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDatasetProps.Builder.withRetentionPeriod
 */
var software.amazon.awscdk.services.iotanalytics.CfnDatasetProps.Builder.retentionPeriod: software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty
    get() = throw NoSuchFieldException("Get on retentionPeriod is not supported.")
    set(value) { this.withRetentionPeriod(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDatasetProps.Builder.withTriggers
 */
var software.amazon.awscdk.services.iotanalytics.CfnDatasetProps.Builder.triggers: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on triggers is not supported.")
    set(value) { this.withTriggers(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty.Builder
 */
fun retentionPeriodProperty(init: software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty.Builder.withUnlimited
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty.Builder.unlimited: Boolean
    get() = throw NoSuchFieldException("Get on unlimited is not supported.")
    set(value) { this.withUnlimited(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty.Builder.withNumberOfDays
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty.Builder.numberOfDays: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on numberOfDays is not supported.")
    set(value) { this.withNumberOfDays(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty.Builder
 */
fun channelProperty(init: software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty.Builder.withNext
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty.Builder.next: String
    get() = throw NoSuchFieldException("Get on next is not supported.")
    set(value) { this.withNext(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty.Builder.withChannelName
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty.Builder.channelName: String
    get() = throw NoSuchFieldException("Get on channelName is not supported.")
    set(value) { this.withChannelName(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty.Builder.withName
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder
 */
fun activityProperty(init: software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.withFilter
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.filter: software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty
    get() = throw NoSuchFieldException("Get on filter is not supported.")
    set(value) { this.withFilter(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.withLambda
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.lambda: software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty
    get() = throw NoSuchFieldException("Get on lambda is not supported.")
    set(value) { this.withLambda(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.withAddAttributes
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.addAttributes: software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty
    get() = throw NoSuchFieldException("Get on addAttributes is not supported.")
    set(value) { this.withAddAttributes(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.withDatastore
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.datastore: software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty
    get() = throw NoSuchFieldException("Get on datastore is not supported.")
    set(value) { this.withDatastore(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.withDeviceRegistryEnrich
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.deviceRegistryEnrich: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on deviceRegistryEnrich is not supported.")
    set(value) { this.withDeviceRegistryEnrich(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.withDeviceShadowEnrich
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.deviceShadowEnrich: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on deviceShadowEnrich is not supported.")
    set(value) { this.withDeviceShadowEnrich(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.withMath
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.math: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on math is not supported.")
    set(value) { this.withMath(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.withRemoveAttributes
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.removeAttributes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on removeAttributes is not supported.")
    set(value) { this.withRemoveAttributes(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.withChannel
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.channel: software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty
    get() = throw NoSuchFieldException("Get on channel is not supported.")
    set(value) { this.withChannel(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.withSelectAttributes
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder.selectAttributes: software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty
    get() = throw NoSuchFieldException("Get on selectAttributes is not supported.")
    set(value) { this.withSelectAttributes(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty.Builder
 */
fun containerActionProperty(init: software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty.Builder.withVariables
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty.Builder.variables: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on variables is not supported.")
    set(value) { this.withVariables(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty.Builder.withExecutionRoleArn
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty.Builder.executionRoleArn: String
    get() = throw NoSuchFieldException("Get on executionRoleArn is not supported.")
    set(value) { this.withExecutionRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty.Builder.withImage
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty.Builder.image: String
    get() = throw NoSuchFieldException("Get on image is not supported.")
    set(value) { this.withImage(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty.Builder.withResourceConfiguration
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty.Builder.resourceConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on resourceConfiguration is not supported.")
    set(value) { this.withResourceConfiguration(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty.Builder
 */
fun scheduleProperty(init: software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty.Builder.withScheduleExpression
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty.Builder.scheduleExpression: String
    get() = throw NoSuchFieldException("Get on scheduleExpression is not supported.")
    set(value) { this.withScheduleExpression(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty.Builder
 */
fun datastoreProperty(init: software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty.Builder.withDatastoreName
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty.Builder.datastoreName: String
    get() = throw NoSuchFieldException("Get on datastoreName is not supported.")
    set(value) { this.withDatastoreName(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty.Builder.withName
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps.Builder
 */
fun cfnDatastoreProps(init: software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps.Builder.withDatastoreName
 */
var software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps.Builder.datastoreName: String
    get() = throw NoSuchFieldException("Get on datastoreName is not supported.")
    set(value) { this.withDatastoreName(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps.Builder.withRetentionPeriod
 */
var software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps.Builder.retentionPeriod: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on retentionPeriod is not supported.")
    set(value) { this.withRetentionPeriod(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty.Builder
 */
fun selectAttributesProperty(init: software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty.Builder.withNext
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty.Builder.next: String
    get() = throw NoSuchFieldException("Get on next is not supported.")
    set(value) { this.withNext(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty.Builder.withName
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.Builder
 */
fun variableProperty(init: software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.Builder.withStringValue
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.Builder.stringValue: String
    get() = throw NoSuchFieldException("Get on stringValue is not supported.")
    set(value) { this.withStringValue(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.Builder.withDatasetContentVersionValue
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.Builder.datasetContentVersionValue: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on datasetContentVersionValue is not supported.")
    set(value) { this.withDatasetContentVersionValue(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.Builder.withVariableName
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.Builder.variableName: String
    get() = throw NoSuchFieldException("Get on variableName is not supported.")
    set(value) { this.withVariableName(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.Builder.withOutputFileUriValue
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.Builder.outputFileUriValue: software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty
    get() = throw NoSuchFieldException("Get on outputFileUriValue is not supported.")
    set(value) { this.withOutputFileUriValue(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.Builder.withDoubleValue
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.Builder.doubleValue: Number
    get() = throw NoSuchFieldException("Get on doubleValue is not supported.")
    set(value) { this.withDoubleValue(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty.Builder
 */
fun retentionPeriodProperty(init: software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty.Builder.withUnlimited
 */
var software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty.Builder.unlimited: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on unlimited is not supported.")
    set(value) { this.withUnlimited(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty.Builder.withNumberOfDays
 */
var software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty.Builder.numberOfDays: Number
    get() = throw NoSuchFieldException("Get on numberOfDays is not supported.")
    set(value) { this.withNumberOfDays(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty.Builder
 */
fun retentionPeriodProperty(init: software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty.Builder.withUnlimited
 */
var software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty.Builder.unlimited: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on unlimited is not supported.")
    set(value) { this.withUnlimited(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty.Builder.withNumberOfDays
 */
var software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty.Builder.numberOfDays: Number
    get() = throw NoSuchFieldException("Get on numberOfDays is not supported.")
    set(value) { this.withNumberOfDays(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnChannelProps.Builder
 */
fun cfnChannelProps(init: software.amazon.awscdk.services.iotanalytics.CfnChannelProps.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnChannelProps {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnChannelProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnChannelProps.Builder.withRetentionPeriod
 */
var software.amazon.awscdk.services.iotanalytics.CfnChannelProps.Builder.retentionPeriod: software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty
    get() = throw NoSuchFieldException("Get on retentionPeriod is not supported.")
    set(value) { this.withRetentionPeriod(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnChannelProps.Builder.withChannelName
 */
var software.amazon.awscdk.services.iotanalytics.CfnChannelProps.Builder.channelName: String
    get() = throw NoSuchFieldException("Get on channelName is not supported.")
    set(value) { this.withChannelName(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty.Builder
 */
fun queryActionProperty(init: software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty.Builder.withSqlQuery
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty.Builder.sqlQuery: String
    get() = throw NoSuchFieldException("Get on sqlQuery is not supported.")
    set(value) { this.withSqlQuery(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty.Builder.withFilters
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty.Builder.filters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on filters is not supported.")
    set(value) { this.withFilters(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty.Builder
 */
fun triggerProperty(init: software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty.Builder.withSchedule
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty.Builder.schedule: software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty
    get() = throw NoSuchFieldException("Get on schedule is not supported.")
    set(value) { this.withSchedule(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty.Builder.withTriggeringDataset
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty.Builder.triggeringDataset: software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty
    get() = throw NoSuchFieldException("Get on triggeringDataset is not supported.")
    set(value) { this.withTriggeringDataset(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty.Builder
 */
fun lambdaProperty(init: software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty.Builder.withBatchSize
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty.Builder.batchSize: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on batchSize is not supported.")
    set(value) { this.withBatchSize(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty.Builder.withNext
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty.Builder.next: String
    get() = throw NoSuchFieldException("Get on next is not supported.")
    set(value) { this.withNext(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty.Builder.withName
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty.Builder.withLambdaName
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty.Builder.lambdaName: String
    get() = throw NoSuchFieldException("Get on lambdaName is not supported.")
    set(value) { this.withLambdaName(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty.Builder
 */
fun addAttributesProperty(init: software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty.Builder.withNext
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty.Builder.next: String
    get() = throw NoSuchFieldException("Get on next is not supported.")
    set(value) { this.withNext(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty.Builder.withName
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty.Builder.withAttributes
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty.Builder.attributes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on attributes is not supported.")
    set(value) { this.withAttributes(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipelineProps.Builder
 */
fun cfnPipelineProps(init: software.amazon.awscdk.services.iotanalytics.CfnPipelineProps.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnPipelineProps {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnPipelineProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipelineProps.Builder.withPipelineActivities
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipelineProps.Builder.pipelineActivities: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on pipelineActivities is not supported.")
    set(value) { this.withPipelineActivities(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipelineProps.Builder.withPipelineName
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipelineProps.Builder.pipelineName: String
    get() = throw NoSuchFieldException("Get on pipelineName is not supported.")
    set(value) { this.withPipelineName(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty.Builder
 */
fun triggeringDatasetProperty(init: software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty.Builder.withDatasetName
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty.Builder.datasetName: String
    get() = throw NoSuchFieldException("Get on datasetName is not supported.")
    set(value) { this.withDatasetName(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty.Builder
 */
fun deltaTimeProperty(init: software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty.Builder.withOffsetSeconds
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty.Builder.offsetSeconds: Number
    get() = throw NoSuchFieldException("Get on offsetSeconds is not supported.")
    set(value) { this.withOffsetSeconds(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty.Builder.withTimeExpression
 */
var software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty.Builder.timeExpression: String
    get() = throw NoSuchFieldException("Get on timeExpression is not supported.")
    set(value) { this.withTimeExpression(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty.Builder
 */
fun removeAttributesProperty(init: software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty.Builder.withNext
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty.Builder.next: String
    get() = throw NoSuchFieldException("Get on next is not supported.")
    set(value) { this.withNext(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty.Builder.withName
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty.Builder
 */
fun mathProperty(init: software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty.Builder.withNext
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty.Builder.next: String
    get() = throw NoSuchFieldException("Get on next is not supported.")
    set(value) { this.withNext(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty.Builder.withMath
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty.Builder.math: String
    get() = throw NoSuchFieldException("Get on math is not supported.")
    set(value) { this.withMath(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty.Builder.withAttribute
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty.Builder.attribute: String
    get() = throw NoSuchFieldException("Get on attribute is not supported.")
    set(value) { this.withAttribute(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty.Builder.withName
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty.Builder
 */
fun deviceRegistryEnrichProperty(init: software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty.Builder.() -> Unit): software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty {
    val builder = software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty.Builder.withThingName
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty.Builder.thingName: String
    get() = throw NoSuchFieldException("Get on thingName is not supported.")
    set(value) { this.withThingName(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty.Builder.withNext
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty.Builder.next: String
    get() = throw NoSuchFieldException("Get on next is not supported.")
    set(value) { this.withNext(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty.Builder.withAttribute
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty.Builder.attribute: String
    get() = throw NoSuchFieldException("Get on attribute is not supported.")
    set(value) { this.withAttribute(value) }

/**
 * @see software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty.Builder.withName
 */
var software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }
