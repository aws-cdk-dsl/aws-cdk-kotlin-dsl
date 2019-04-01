package software.amazon.awscdk.dsl.services.datapipeline
/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline
 */
fun software.amazon.awscdk.Construct.cfnPipeline(id: String,
                     props: software.amazon.awscdk.services.datapipeline.CfnPipelineProps? = null,
                     init: (software.amazon.awscdk.services.datapipeline.CfnPipeline.() -> Unit)? = null)
        : software.amazon.awscdk.services.datapipeline.CfnPipeline {

    val obj = software.amazon.awscdk.services.datapipeline.CfnPipeline(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty.Builder
 */
fun pipelineTagProperty(init: software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty.Builder.() -> Unit): software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty {
    val builder = software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty.Builder.withKey
 */
var software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty.Builder.withValue
 */
var software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }


/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty.Builder
 */
fun pipelineObjectProperty(init: software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty.Builder.() -> Unit): software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty {
    val builder = software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty.Builder.withId
 */
var software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty.Builder.withName
 */
var software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty.Builder.withFields
 */
var software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty.Builder.fields: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on fields is not supported.")
    set(value) { this.withFields(value) }


/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty.Builder
 */
fun parameterAttributeProperty(init: software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty.Builder.() -> Unit): software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty {
    val builder = software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty.Builder.withKey
 */
var software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty.Builder.withStringValue
 */
var software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty.Builder.stringValue: String
    get() = throw NoSuchFieldException("Get on stringValue is not supported.")
    set(value) { this.withStringValue(value) }


/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder
 */
fun cfnPipelineProps(init: software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder.() -> Unit): software.amazon.awscdk.services.datapipeline.CfnPipelineProps {
    val builder = software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder.withName
 */
var software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder.withDescription
 */
var software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder.withActivate
 */
var software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder.activate: Boolean
    get() = throw NoSuchFieldException("Get on activate is not supported.")
    set(value) { this.withActivate(value) }

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder.withPipelineObjects
 */
var software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder.pipelineObjects: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on pipelineObjects is not supported.")
    set(value) { this.withPipelineObjects(value) }

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder.withPipelineTags
 */
var software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder.pipelineTags: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on pipelineTags is not supported.")
    set(value) { this.withPipelineTags(value) }

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder.withParameterObjects
 */
var software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder.parameterObjects: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on parameterObjects is not supported.")
    set(value) { this.withParameterObjects(value) }

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder.withParameterValues
 */
var software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder.parameterValues: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on parameterValues is not supported.")
    set(value) { this.withParameterValues(value) }


/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty.Builder
 */
fun parameterObjectProperty(init: software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty.Builder.() -> Unit): software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty {
    val builder = software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty.Builder.withId
 */
var software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty.Builder.withAttributes
 */
var software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty.Builder.attributes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on attributes is not supported.")
    set(value) { this.withAttributes(value) }


/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty.Builder
 */
fun fieldProperty(init: software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty.Builder.() -> Unit): software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty {
    val builder = software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty.Builder.withKey
 */
var software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty.Builder.withStringValue
 */
var software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty.Builder.stringValue: String
    get() = throw NoSuchFieldException("Get on stringValue is not supported.")
    set(value) { this.withStringValue(value) }

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty.Builder.withRefValue
 */
var software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty.Builder.refValue: String
    get() = throw NoSuchFieldException("Get on refValue is not supported.")
    set(value) { this.withRefValue(value) }


/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty.Builder
 */
fun parameterValueProperty(init: software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty.Builder.() -> Unit): software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty {
    val builder = software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty.Builder.withId
 */
var software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty.Builder.withStringValue
 */
var software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty.Builder.stringValue: String
    get() = throw NoSuchFieldException("Get on stringValue is not supported.")
    set(value) { this.withStringValue(value) }
