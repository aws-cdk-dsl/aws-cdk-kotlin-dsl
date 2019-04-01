package software.amazon.awscdk.dsl.services.kinesisanalytics
/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2
 */
fun software.amazon.awscdk.Construct.cfnApplicationOutputV2(id: String,
                     props: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props? = null,
                     init: (software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.() -> Unit)? = null)
        : software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2 {

    val obj = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication
 */
fun software.amazon.awscdk.Construct.cfnApplication(id: String,
                     props: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps? = null,
                     init: (software.amazon.awscdk.services.kinesisanalytics.CfnApplication.() -> Unit)? = null)
        : software.amazon.awscdk.services.kinesisanalytics.CfnApplication {

    val obj = software.amazon.awscdk.services.kinesisanalytics.CfnApplication(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource
 */
fun software.amazon.awscdk.Construct.cfnApplicationReferenceDataSource(id: String,
                     props: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps? = null,
                     init: (software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.() -> Unit)? = null)
        : software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource {

    val obj = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput
 */
fun software.amazon.awscdk.Construct.cfnApplicationOutput(id: String,
                     props: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps? = null,
                     init: (software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.() -> Unit)? = null)
        : software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput {

    val obj = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2
 */
fun software.amazon.awscdk.Construct.cfnApplicationCloudWatchLoggingOptionV2(id: String,
                     props: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props? = null,
                     init: (software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.() -> Unit)? = null)
        : software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2 {

    val obj = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2
 */
fun software.amazon.awscdk.Construct.cfnApplicationReferenceDataSourceV2(id: String,
                     props: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props? = null,
                     init: (software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.() -> Unit)? = null)
        : software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2 {

    val obj = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
 */
fun software.amazon.awscdk.Construct.cfnApplicationV2(id: String,
                     props: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props? = null,
                     init: (software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.() -> Unit)? = null)
        : software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2 {

    val obj = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.Builder
 */
fun s3ReferenceDataSourceProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.Builder.withBucketArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.Builder.bucketArn: String
    get() = throw NoSuchFieldException("Get on bucketArn is not supported.")
    set(value) { this.withBucketArn(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.Builder.withFileKey
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.Builder.fileKey: String
    get() = throw NoSuchFieldException("Get on fileKey is not supported.")
    set(value) { this.withFileKey(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputParallelismProperty.Builder
 */
fun inputParallelismProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputParallelismProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputParallelismProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputParallelismProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputParallelismProperty.Builder.withCount
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputParallelismProperty.Builder.count: Number
    get() = throw NoSuchFieldException("Get on count is not supported.")
    set(value) { this.withCount(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty.Builder
 */
fun cSVMappingParametersProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty.Builder.withRecordColumnDelimiter
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty.Builder.recordColumnDelimiter: String
    get() = throw NoSuchFieldException("Get on recordColumnDelimiter is not supported.")
    set(value) { this.withRecordColumnDelimiter(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty.Builder.withRecordRowDelimiter
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty.Builder.recordRowDelimiter: String
    get() = throw NoSuchFieldException("Get on recordRowDelimiter is not supported.")
    set(value) { this.withRecordRowDelimiter(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty.Builder
 */
fun parallelismConfigurationProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty.Builder.withConfigurationType
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty.Builder.configurationType: String
    get() = throw NoSuchFieldException("Get on configurationType is not supported.")
    set(value) { this.withConfigurationType(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty.Builder.withAutoScalingEnabled
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty.Builder.autoScalingEnabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on autoScalingEnabled is not supported.")
    set(value) { this.withAutoScalingEnabled(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty.Builder.withParallelism
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty.Builder.parallelism: Number
    get() = throw NoSuchFieldException("Get on parallelism is not supported.")
    set(value) { this.withParallelism(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty.Builder.withParallelismPerKpu
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty.Builder.parallelismPerKpu: Number
    get() = throw NoSuchFieldException("Get on parallelismPerKpu is not supported.")
    set(value) { this.withParallelismPerKpu(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.JSONMappingParametersProperty.Builder
 */
fun jSONMappingParametersProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.JSONMappingParametersProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.JSONMappingParametersProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplication.JSONMappingParametersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.JSONMappingParametersProperty.Builder.withRecordRowPath
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.JSONMappingParametersProperty.Builder.recordRowPath: String
    get() = throw NoSuchFieldException("Get on recordRowPath is not supported.")
    set(value) { this.withRecordRowPath(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordColumnProperty.Builder
 */
fun recordColumnProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordColumnProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordColumnProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordColumnProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordColumnProperty.Builder.withName
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordColumnProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordColumnProperty.Builder.withSqlType
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordColumnProperty.Builder.sqlType: String
    get() = throw NoSuchFieldException("Get on sqlType is not supported.")
    set(value) { this.withSqlType(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordColumnProperty.Builder.withMapping
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordColumnProperty.Builder.mapping: String
    get() = throw NoSuchFieldException("Get on mapping is not supported.")
    set(value) { this.withMapping(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty.Builder
 */
fun kinesisFirehoseInputProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty.Builder.withResourceArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty.Builder.resourceArn: String
    get() = throw NoSuchFieldException("Get on resourceArn is not supported.")
    set(value) { this.withResourceArn(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.CSVMappingParametersProperty.Builder
 */
fun cSVMappingParametersProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.CSVMappingParametersProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.CSVMappingParametersProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.CSVMappingParametersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.CSVMappingParametersProperty.Builder.withRecordColumnDelimiter
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.CSVMappingParametersProperty.Builder.recordColumnDelimiter: String
    get() = throw NoSuchFieldException("Get on recordColumnDelimiter is not supported.")
    set(value) { this.withRecordColumnDelimiter(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.CSVMappingParametersProperty.Builder.withRecordRowDelimiter
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.CSVMappingParametersProperty.Builder.recordRowDelimiter: String
    get() = throw NoSuchFieldException("Get on recordRowDelimiter is not supported.")
    set(value) { this.withRecordRowDelimiter(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty.Builder
 */
fun environmentPropertiesProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty.Builder.withPropertyGroups
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty.Builder.propertyGroups: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on propertyGroups is not supported.")
    set(value) { this.withPropertyGroups(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty.Builder
 */
fun destinationSchemaProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty.Builder.withRecordFormatType
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty.Builder.recordFormatType: String
    get() = throw NoSuchFieldException("Get on recordFormatType is not supported.")
    set(value) { this.withRecordFormatType(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder
 */
fun inputProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder.withInputSchema
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder.inputSchema: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty
    get() = throw NoSuchFieldException("Get on inputSchema is not supported.")
    set(value) { this.withInputSchema(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder.withNamePrefix
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder.namePrefix: String
    get() = throw NoSuchFieldException("Get on namePrefix is not supported.")
    set(value) { this.withNamePrefix(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder.withInputParallelism
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder.inputParallelism: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty
    get() = throw NoSuchFieldException("Get on inputParallelism is not supported.")
    set(value) { this.withInputParallelism(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder.withInputProcessingConfiguration
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder.inputProcessingConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on inputProcessingConfiguration is not supported.")
    set(value) { this.withInputProcessingConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder.withKinesisFirehoseInput
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder.kinesisFirehoseInput: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty
    get() = throw NoSuchFieldException("Get on kinesisFirehoseInput is not supported.")
    set(value) { this.withKinesisFirehoseInput(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder.withKinesisStreamsInput
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder.kinesisStreamsInput: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty
    get() = throw NoSuchFieldException("Get on kinesisStreamsInput is not supported.")
    set(value) { this.withKinesisStreamsInput(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.Builder
 */
fun referenceDataSourceProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.Builder.withTableName
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.Builder.tableName: String
    get() = throw NoSuchFieldException("Get on tableName is not supported.")
    set(value) { this.withTableName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.Builder.withReferenceSchema
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.Builder.referenceSchema: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty
    get() = throw NoSuchFieldException("Get on referenceSchema is not supported.")
    set(value) { this.withReferenceSchema(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.Builder.withS3ReferenceDataSource
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.Builder.s3ReferenceDataSource: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty
    get() = throw NoSuchFieldException("Get on s3ReferenceDataSource is not supported.")
    set(value) { this.withS3ReferenceDataSource(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty.Builder
 */
fun kinesisStreamsInputProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty.Builder.withResourceArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty.Builder.resourceArn: String
    get() = throw NoSuchFieldException("Get on resourceArn is not supported.")
    set(value) { this.withResourceArn(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty.Builder
 */
fun applicationCodeConfigurationProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty.Builder.withCodeContent
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty.Builder.codeContent: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty
    get() = throw NoSuchFieldException("Get on codeContent is not supported.")
    set(value) { this.withCodeContent(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty.Builder.withCodeContentType
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty.Builder.codeContentType: String
    get() = throw NoSuchFieldException("Get on codeContentType is not supported.")
    set(value) { this.withCodeContentType(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty.Builder
 */
fun kinesisFirehoseInputProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty.Builder.withResourceArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty.Builder.resourceArn: String
    get() = throw NoSuchFieldException("Get on resourceArn is not supported.")
    set(value) { this.withResourceArn(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps.Builder
 */
fun cfnApplicationProps(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps.Builder.withApplicationCode
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps.Builder.applicationCode: String
    get() = throw NoSuchFieldException("Get on applicationCode is not supported.")
    set(value) { this.withApplicationCode(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps.Builder.withApplicationDescription
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps.Builder.applicationDescription: String
    get() = throw NoSuchFieldException("Get on applicationDescription is not supported.")
    set(value) { this.withApplicationDescription(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps.Builder.withApplicationName
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps.Builder.applicationName: String
    get() = throw NoSuchFieldException("Get on applicationName is not supported.")
    set(value) { this.withApplicationName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps.Builder.withInputs
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps.Builder.inputs: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on inputs is not supported.")
    set(value) { this.withInputs(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty.Builder
 */
fun codeContentProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty.Builder.withS3ContentLocation
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty.Builder.s3ContentLocation: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty
    get() = throw NoSuchFieldException("Get on s3ContentLocation is not supported.")
    set(value) { this.withS3ContentLocation(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty.Builder.withTextContent
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty.Builder.textContent: String
    get() = throw NoSuchFieldException("Get on textContent is not supported.")
    set(value) { this.withTextContent(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty.Builder.withZipFileContent
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty.Builder.zipFileContent: String
    get() = throw NoSuchFieldException("Get on zipFileContent is not supported.")
    set(value) { this.withZipFileContent(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty.Builder
 */
fun flinkApplicationConfigurationProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty.Builder.withMonitoringConfiguration
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty.Builder.monitoringConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on monitoringConfiguration is not supported.")
    set(value) { this.withMonitoringConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty.Builder.withCheckpointConfiguration
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty.Builder.checkpointConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on checkpointConfiguration is not supported.")
    set(value) { this.withCheckpointConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty.Builder.withParallelismConfiguration
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty.Builder.parallelismConfiguration: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty
    get() = throw NoSuchFieldException("Get on parallelismConfiguration is not supported.")
    set(value) { this.withParallelismConfiguration(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty.Builder
 */
fun recordColumnProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty.Builder.withName
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty.Builder.withSqlType
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty.Builder.sqlType: String
    get() = throw NoSuchFieldException("Get on sqlType is not supported.")
    set(value) { this.withSqlType(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty.Builder.withMapping
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty.Builder.mapping: String
    get() = throw NoSuchFieldException("Get on mapping is not supported.")
    set(value) { this.withMapping(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.Builder
 */
fun referenceDataSourceProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.Builder.withTableName
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.Builder.tableName: String
    get() = throw NoSuchFieldException("Get on tableName is not supported.")
    set(value) { this.withTableName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.Builder.withReferenceSchema
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.Builder.referenceSchema: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty
    get() = throw NoSuchFieldException("Get on referenceSchema is not supported.")
    set(value) { this.withReferenceSchema(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.Builder.withS3ReferenceDataSource
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.Builder.s3ReferenceDataSource: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty
    get() = throw NoSuchFieldException("Get on s3ReferenceDataSource is not supported.")
    set(value) { this.withS3ReferenceDataSource(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty.Builder
 */
fun propertyGroupProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty.Builder.withPropertyGroupId
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty.Builder.propertyGroupId: String
    get() = throw NoSuchFieldException("Get on propertyGroupId is not supported.")
    set(value) { this.withPropertyGroupId(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty.Builder.withPropertyMap
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty.Builder.propertyMap: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on propertyMap is not supported.")
    set(value) { this.withPropertyMap(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty.Builder
 */
fun inputLambdaProcessorProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty.Builder.withResourceArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty.Builder.resourceArn: String
    get() = throw NoSuchFieldException("Get on resourceArn is not supported.")
    set(value) { this.withResourceArn(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty.Builder
 */
fun kinesisFirehoseOutputProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty.Builder.withResourceArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty.Builder.resourceArn: String
    get() = throw NoSuchFieldException("Get on resourceArn is not supported.")
    set(value) { this.withResourceArn(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props.Builder
 */
fun cfnApplicationOutputV2Props(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props.Builder.withApplicationName
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props.Builder.applicationName: String
    get() = throw NoSuchFieldException("Get on applicationName is not supported.")
    set(value) { this.withApplicationName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props.Builder.withOutput
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props.Builder.output: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty
    get() = throw NoSuchFieldException("Get on output is not supported.")
    set(value) { this.withOutput(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty.Builder
 */
fun lambdaOutputProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty.Builder.withResourceArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty.Builder.resourceArn: String
    get() = throw NoSuchFieldException("Get on resourceArn is not supported.")
    set(value) { this.withResourceArn(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty.Builder
 */
fun kinesisStreamsOutputProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty.Builder.withResourceArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty.Builder.resourceArn: String
    get() = throw NoSuchFieldException("Get on resourceArn is not supported.")
    set(value) { this.withResourceArn(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProcessingConfigurationProperty.Builder
 */
fun inputProcessingConfigurationProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProcessingConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProcessingConfigurationProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProcessingConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProcessingConfigurationProperty.Builder.withInputLambdaProcessor
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProcessingConfigurationProperty.Builder.inputLambdaProcessor: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on inputLambdaProcessor is not supported.")
    set(value) { this.withInputLambdaProcessor(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty.Builder
 */
fun cloudWatchLoggingOptionProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty.Builder.withLogStreamArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty.Builder.logStreamArn: String
    get() = throw NoSuchFieldException("Get on logStreamArn is not supported.")
    set(value) { this.withLogStreamArn(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.Builder
 */
fun outputProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.Builder.withName
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.Builder.withDestinationSchema
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.Builder.destinationSchema: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on destinationSchema is not supported.")
    set(value) { this.withDestinationSchema(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.Builder.withKinesisStreamsOutput
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.Builder.kinesisStreamsOutput: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty
    get() = throw NoSuchFieldException("Get on kinesisStreamsOutput is not supported.")
    set(value) { this.withKinesisStreamsOutput(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.Builder.withKinesisFirehoseOutput
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.Builder.kinesisFirehoseOutput: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on kinesisFirehoseOutput is not supported.")
    set(value) { this.withKinesisFirehoseOutput(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.Builder.withLambdaOutput
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.Builder.lambdaOutput: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on lambdaOutput is not supported.")
    set(value) { this.withLambdaOutput(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty.Builder
 */
fun applicationConfigurationProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty.Builder.withApplicationCodeConfiguration
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty.Builder.applicationCodeConfiguration: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty
    get() = throw NoSuchFieldException("Get on applicationCodeConfiguration is not supported.")
    set(value) { this.withApplicationCodeConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty.Builder.withApplicationSnapshotConfiguration
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty.Builder.applicationSnapshotConfiguration: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty
    get() = throw NoSuchFieldException("Get on applicationSnapshotConfiguration is not supported.")
    set(value) { this.withApplicationSnapshotConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty.Builder.withEnvironmentProperties
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty.Builder.environmentProperties: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty
    get() = throw NoSuchFieldException("Get on environmentProperties is not supported.")
    set(value) { this.withEnvironmentProperties(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty.Builder.withFlinkApplicationConfiguration
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty.Builder.flinkApplicationConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on flinkApplicationConfiguration is not supported.")
    set(value) { this.withFlinkApplicationConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty.Builder.withSqlApplicationConfiguration
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty.Builder.sqlApplicationConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on sqlApplicationConfiguration is not supported.")
    set(value) { this.withSqlApplicationConfiguration(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty.Builder
 */
fun recordFormatProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty.Builder.withMappingParameters
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty.Builder.mappingParameters: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty
    get() = throw NoSuchFieldException("Get on mappingParameters is not supported.")
    set(value) { this.withMappingParameters(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty.Builder.withRecordFormatType
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty.Builder.recordFormatType: String
    get() = throw NoSuchFieldException("Get on recordFormatType is not supported.")
    set(value) { this.withRecordFormatType(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty.Builder
 */
fun recordFormatProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty.Builder.withMappingParameters
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty.Builder.mappingParameters: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty
    get() = throw NoSuchFieldException("Get on mappingParameters is not supported.")
    set(value) { this.withMappingParameters(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty.Builder.withRecordFormatType
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty.Builder.recordFormatType: String
    get() = throw NoSuchFieldException("Get on recordFormatType is not supported.")
    set(value) { this.withRecordFormatType(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty.Builder
 */
fun kinesisStreamsOutputProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty.Builder.withResourceArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty.Builder.resourceArn: String
    get() = throw NoSuchFieldException("Get on resourceArn is not supported.")
    set(value) { this.withResourceArn(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props.Builder
 */
fun cfnApplicationCloudWatchLoggingOptionV2Props(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props.Builder.withApplicationName
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props.Builder.applicationName: String
    get() = throw NoSuchFieldException("Get on applicationName is not supported.")
    set(value) { this.withApplicationName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props.Builder.withCloudWatchLoggingOption
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props.Builder.cloudWatchLoggingOption: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty
    get() = throw NoSuchFieldException("Get on cloudWatchLoggingOption is not supported.")
    set(value) { this.withCloudWatchLoggingOption(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty.Builder
 */
fun s3ContentLocationProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty.Builder.withObjectVersion
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty.Builder.objectVersion: String
    get() = throw NoSuchFieldException("Get on objectVersion is not supported.")
    set(value) { this.withObjectVersion(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty.Builder.withBucketArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty.Builder.bucketArn: String
    get() = throw NoSuchFieldException("Get on bucketArn is not supported.")
    set(value) { this.withBucketArn(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty.Builder.withFileKey
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty.Builder.fileKey: String
    get() = throw NoSuchFieldException("Get on fileKey is not supported.")
    set(value) { this.withFileKey(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty.Builder
 */
fun inputSchemaProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty.Builder.withRecordColumns
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty.Builder.recordColumns: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on recordColumns is not supported.")
    set(value) { this.withRecordColumns(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty.Builder.withRecordFormat
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty.Builder.recordFormat: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on recordFormat is not supported.")
    set(value) { this.withRecordFormat(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty.Builder.withRecordEncoding
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty.Builder.recordEncoding: String
    get() = throw NoSuchFieldException("Get on recordEncoding is not supported.")
    set(value) { this.withRecordEncoding(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty.Builder
 */
fun recordFormatProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty.Builder.withMappingParameters
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty.Builder.mappingParameters: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty
    get() = throw NoSuchFieldException("Get on mappingParameters is not supported.")
    set(value) { this.withMappingParameters(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty.Builder.withRecordFormatType
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty.Builder.recordFormatType: String
    get() = throw NoSuchFieldException("Get on recordFormatType is not supported.")
    set(value) { this.withRecordFormatType(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty.Builder
 */
fun checkpointConfigurationProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty.Builder.withConfigurationType
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty.Builder.configurationType: String
    get() = throw NoSuchFieldException("Get on configurationType is not supported.")
    set(value) { this.withConfigurationType(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty.Builder.withMinPauseBetweenCheckpoints
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty.Builder.minPauseBetweenCheckpoints: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on minPauseBetweenCheckpoints is not supported.")
    set(value) { this.withMinPauseBetweenCheckpoints(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty.Builder.withCheckpointingEnabled
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty.Builder.checkpointingEnabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on checkpointingEnabled is not supported.")
    set(value) { this.withCheckpointingEnabled(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty.Builder.withCheckpointInterval
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty.Builder.checkpointInterval: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on checkpointInterval is not supported.")
    set(value) { this.withCheckpointInterval(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty.Builder
 */
fun applicationSnapshotConfigurationProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty.Builder.withSnapshotsEnabled
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty.Builder.snapshotsEnabled: Boolean
    get() = throw NoSuchFieldException("Get on snapshotsEnabled is not supported.")
    set(value) { this.withSnapshotsEnabled(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty.Builder
 */
fun inputProcessingConfigurationProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty.Builder.withInputLambdaProcessor
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty.Builder.inputLambdaProcessor: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on inputLambdaProcessor is not supported.")
    set(value) { this.withInputLambdaProcessor(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.CSVMappingParametersProperty.Builder
 */
fun cSVMappingParametersProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.CSVMappingParametersProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.CSVMappingParametersProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplication.CSVMappingParametersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.CSVMappingParametersProperty.Builder.withRecordColumnDelimiter
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.CSVMappingParametersProperty.Builder.recordColumnDelimiter: String
    get() = throw NoSuchFieldException("Get on recordColumnDelimiter is not supported.")
    set(value) { this.withRecordColumnDelimiter(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.CSVMappingParametersProperty.Builder.withRecordRowDelimiter
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.CSVMappingParametersProperty.Builder.recordRowDelimiter: String
    get() = throw NoSuchFieldException("Get on recordRowDelimiter is not supported.")
    set(value) { this.withRecordRowDelimiter(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty.Builder
 */
fun mappingParametersProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty.Builder.withCsvMappingParameters
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty.Builder.csvMappingParameters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on csvMappingParameters is not supported.")
    set(value) { this.withCsvMappingParameters(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty.Builder.withJsonMappingParameters
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty.Builder.jsonMappingParameters: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty
    get() = throw NoSuchFieldException("Get on jsonMappingParameters is not supported.")
    set(value) { this.withJsonMappingParameters(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty.Builder
 */
fun jSONMappingParametersProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty.Builder.withRecordRowPath
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty.Builder.recordRowPath: String
    get() = throw NoSuchFieldException("Get on recordRowPath is not supported.")
    set(value) { this.withRecordRowPath(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty.Builder
 */
fun monitoringConfigurationProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty.Builder.withConfigurationType
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty.Builder.configurationType: String
    get() = throw NoSuchFieldException("Get on configurationType is not supported.")
    set(value) { this.withConfigurationType(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty.Builder.withLogLevel
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty.Builder.logLevel: String
    get() = throw NoSuchFieldException("Get on logLevel is not supported.")
    set(value) { this.withLogLevel(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty.Builder.withMetricsLevel
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty.Builder.metricsLevel: String
    get() = throw NoSuchFieldException("Get on metricsLevel is not supported.")
    set(value) { this.withMetricsLevel(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.Builder
 */
fun inputProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.Builder.withInputSchema
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.Builder.inputSchema: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty
    get() = throw NoSuchFieldException("Get on inputSchema is not supported.")
    set(value) { this.withInputSchema(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.Builder.withNamePrefix
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.Builder.namePrefix: String
    get() = throw NoSuchFieldException("Get on namePrefix is not supported.")
    set(value) { this.withNamePrefix(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.Builder.withInputParallelism
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.Builder.inputParallelism: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputParallelismProperty
    get() = throw NoSuchFieldException("Get on inputParallelism is not supported.")
    set(value) { this.withInputParallelism(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.Builder.withInputProcessingConfiguration
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.Builder.inputProcessingConfiguration: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProcessingConfigurationProperty
    get() = throw NoSuchFieldException("Get on inputProcessingConfiguration is not supported.")
    set(value) { this.withInputProcessingConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.Builder.withKinesisFirehoseInput
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.Builder.kinesisFirehoseInput: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on kinesisFirehoseInput is not supported.")
    set(value) { this.withKinesisFirehoseInput(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.Builder.withKinesisStreamsInput
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.Builder.kinesisStreamsInput: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisStreamsInputProperty
    get() = throw NoSuchFieldException("Get on kinesisStreamsInput is not supported.")
    set(value) { this.withKinesisStreamsInput(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty.Builder
 */
fun sqlApplicationConfigurationProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty.Builder.withInputs
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty.Builder.inputs: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on inputs is not supported.")
    set(value) { this.withInputs(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.Builder
 */
fun s3ReferenceDataSourceProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.Builder.withBucketArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.Builder.bucketArn: String
    get() = throw NoSuchFieldException("Get on bucketArn is not supported.")
    set(value) { this.withBucketArn(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.Builder.withFileKey
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.Builder.fileKey: String
    get() = throw NoSuchFieldException("Get on fileKey is not supported.")
    set(value) { this.withFileKey(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.Builder.withReferenceRoleArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.Builder.referenceRoleArn: String
    get() = throw NoSuchFieldException("Get on referenceRoleArn is not supported.")
    set(value) { this.withReferenceRoleArn(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty.Builder
 */
fun referenceSchemaProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty.Builder.withRecordColumns
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty.Builder.recordColumns: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on recordColumns is not supported.")
    set(value) { this.withRecordColumns(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty.Builder.withRecordFormat
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty.Builder.recordFormat: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on recordFormat is not supported.")
    set(value) { this.withRecordFormat(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty.Builder.withRecordEncoding
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty.Builder.recordEncoding: String
    get() = throw NoSuchFieldException("Get on recordEncoding is not supported.")
    set(value) { this.withRecordEncoding(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty.Builder
 */
fun recordFormatProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty.Builder.withMappingParameters
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty.Builder.mappingParameters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on mappingParameters is not supported.")
    set(value) { this.withMappingParameters(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty.Builder.withRecordFormatType
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty.Builder.recordFormatType: String
    get() = throw NoSuchFieldException("Get on recordFormatType is not supported.")
    set(value) { this.withRecordFormatType(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisStreamsInputProperty.Builder
 */
fun kinesisStreamsInputProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisStreamsInputProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisStreamsInputProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisStreamsInputProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisStreamsInputProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisStreamsInputProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisStreamsInputProperty.Builder.withResourceArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisStreamsInputProperty.Builder.resourceArn: String
    get() = throw NoSuchFieldException("Get on resourceArn is not supported.")
    set(value) { this.withResourceArn(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty.Builder
 */
fun kinesisFirehoseOutputProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty.Builder.withResourceArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty.Builder.resourceArn: String
    get() = throw NoSuchFieldException("Get on resourceArn is not supported.")
    set(value) { this.withResourceArn(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty.Builder
 */
fun recordColumnProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty.Builder.withName
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty.Builder.withSqlType
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty.Builder.sqlType: String
    get() = throw NoSuchFieldException("Get on sqlType is not supported.")
    set(value) { this.withSqlType(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty.Builder.withMapping
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty.Builder.mapping: String
    get() = throw NoSuchFieldException("Get on mapping is not supported.")
    set(value) { this.withMapping(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props.Builder
 */
fun cfnApplicationReferenceDataSourceV2Props(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props.Builder.withReferenceDataSource
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props.Builder.referenceDataSource: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty
    get() = throw NoSuchFieldException("Get on referenceDataSource is not supported.")
    set(value) { this.withReferenceDataSource(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props.Builder.withApplicationName
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props.Builder.applicationName: String
    get() = throw NoSuchFieldException("Get on applicationName is not supported.")
    set(value) { this.withApplicationName(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty.Builder
 */
fun destinationSchemaProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty.Builder.withRecordFormatType
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty.Builder.recordFormatType: String
    get() = throw NoSuchFieldException("Get on recordFormatType is not supported.")
    set(value) { this.withRecordFormatType(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty.Builder
 */
fun cSVMappingParametersProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty.Builder.withRecordColumnDelimiter
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty.Builder.recordColumnDelimiter: String
    get() = throw NoSuchFieldException("Get on recordColumnDelimiter is not supported.")
    set(value) { this.withRecordColumnDelimiter(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty.Builder.withRecordRowDelimiter
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty.Builder.recordRowDelimiter: String
    get() = throw NoSuchFieldException("Get on recordRowDelimiter is not supported.")
    set(value) { this.withRecordRowDelimiter(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty.Builder
 */
fun mappingParametersProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty.Builder.withCsvMappingParameters
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty.Builder.csvMappingParameters: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty
    get() = throw NoSuchFieldException("Get on csvMappingParameters is not supported.")
    set(value) { this.withCsvMappingParameters(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty.Builder.withJsonMappingParameters
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty.Builder.jsonMappingParameters: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.JSONMappingParametersProperty
    get() = throw NoSuchFieldException("Get on jsonMappingParameters is not supported.")
    set(value) { this.withJsonMappingParameters(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty.Builder
 */
fun outputProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty.Builder.withName
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty.Builder.withDestinationSchema
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty.Builder.destinationSchema: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty
    get() = throw NoSuchFieldException("Get on destinationSchema is not supported.")
    set(value) { this.withDestinationSchema(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty.Builder.withKinesisStreamsOutput
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty.Builder.kinesisStreamsOutput: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on kinesisStreamsOutput is not supported.")
    set(value) { this.withKinesisStreamsOutput(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty.Builder.withKinesisFirehoseOutput
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty.Builder.kinesisFirehoseOutput: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on kinesisFirehoseOutput is not supported.")
    set(value) { this.withKinesisFirehoseOutput(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty.Builder.withLambdaOutput
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty.Builder.lambdaOutput: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty
    get() = throw NoSuchFieldException("Get on lambdaOutput is not supported.")
    set(value) { this.withLambdaOutput(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty.Builder
 */
fun inputParallelismProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty.Builder.withCount
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty.Builder.count: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on count is not supported.")
    set(value) { this.withCount(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty.Builder
 */
fun inputSchemaProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty.Builder.withRecordColumns
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty.Builder.recordColumns: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on recordColumns is not supported.")
    set(value) { this.withRecordColumns(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty.Builder.withRecordFormat
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty.Builder.recordFormat: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on recordFormat is not supported.")
    set(value) { this.withRecordFormat(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty.Builder.withRecordEncoding
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty.Builder.recordEncoding: String
    get() = throw NoSuchFieldException("Get on recordEncoding is not supported.")
    set(value) { this.withRecordEncoding(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.JSONMappingParametersProperty.Builder
 */
fun jSONMappingParametersProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.JSONMappingParametersProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.JSONMappingParametersProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.JSONMappingParametersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.JSONMappingParametersProperty.Builder.withRecordRowPath
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.JSONMappingParametersProperty.Builder.recordRowPath: String
    get() = throw NoSuchFieldException("Get on recordRowPath is not supported.")
    set(value) { this.withRecordRowPath(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty.Builder
 */
fun recordColumnProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty.Builder.withName
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty.Builder.withSqlType
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty.Builder.sqlType: String
    get() = throw NoSuchFieldException("Get on sqlType is not supported.")
    set(value) { this.withSqlType(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty.Builder.withMapping
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty.Builder.mapping: String
    get() = throw NoSuchFieldException("Get on mapping is not supported.")
    set(value) { this.withMapping(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty.Builder
 */
fun lambdaOutputProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty.Builder.withResourceArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty.Builder.resourceArn: String
    get() = throw NoSuchFieldException("Get on resourceArn is not supported.")
    set(value) { this.withResourceArn(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty.Builder
 */
fun inputLambdaProcessorProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty.Builder.withResourceArn
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty.Builder.resourceArn: String
    get() = throw NoSuchFieldException("Get on resourceArn is not supported.")
    set(value) { this.withResourceArn(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.JSONMappingParametersProperty.Builder
 */
fun jSONMappingParametersProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.JSONMappingParametersProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.JSONMappingParametersProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.JSONMappingParametersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.JSONMappingParametersProperty.Builder.withRecordRowPath
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.JSONMappingParametersProperty.Builder.recordRowPath: String
    get() = throw NoSuchFieldException("Get on recordRowPath is not supported.")
    set(value) { this.withRecordRowPath(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps.Builder
 */
fun cfnApplicationReferenceDataSourceProps(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps.Builder.withReferenceDataSource
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps.Builder.referenceDataSource: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty
    get() = throw NoSuchFieldException("Get on referenceDataSource is not supported.")
    set(value) { this.withReferenceDataSource(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps.Builder.withApplicationName
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps.Builder.applicationName: String
    get() = throw NoSuchFieldException("Get on applicationName is not supported.")
    set(value) { this.withApplicationName(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty.Builder
 */
fun mappingParametersProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty.Builder.withCsvMappingParameters
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty.Builder.csvMappingParameters: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.CSVMappingParametersProperty
    get() = throw NoSuchFieldException("Get on csvMappingParameters is not supported.")
    set(value) { this.withCsvMappingParameters(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty.Builder.withJsonMappingParameters
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty.Builder.jsonMappingParameters: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.JSONMappingParametersProperty
    get() = throw NoSuchFieldException("Get on jsonMappingParameters is not supported.")
    set(value) { this.withJsonMappingParameters(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps.Builder
 */
fun cfnApplicationOutputProps(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps.Builder.withApplicationName
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps.Builder.applicationName: String
    get() = throw NoSuchFieldException("Get on applicationName is not supported.")
    set(value) { this.withApplicationName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps.Builder.withOutput
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputProps.Builder.output: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty
    get() = throw NoSuchFieldException("Get on output is not supported.")
    set(value) { this.withOutput(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.Builder
 */
fun cfnApplicationV2Props(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.Builder.withApplicationDescription
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.Builder.applicationDescription: String
    get() = throw NoSuchFieldException("Get on applicationDescription is not supported.")
    set(value) { this.withApplicationDescription(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.Builder.withApplicationName
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.Builder.applicationName: String
    get() = throw NoSuchFieldException("Get on applicationName is not supported.")
    set(value) { this.withApplicationName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.Builder.withServiceExecutionRole
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.Builder.serviceExecutionRole: String
    get() = throw NoSuchFieldException("Get on serviceExecutionRole is not supported.")
    set(value) { this.withServiceExecutionRole(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.Builder.withRuntimeEnvironment
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.Builder.runtimeEnvironment: String
    get() = throw NoSuchFieldException("Get on runtimeEnvironment is not supported.")
    set(value) { this.withRuntimeEnvironment(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.Builder.withApplicationConfiguration
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props.Builder.applicationConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on applicationConfiguration is not supported.")
    set(value) { this.withApplicationConfiguration(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.Builder
 */
fun referenceSchemaProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.Builder.withRecordColumns
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.Builder.recordColumns: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on recordColumns is not supported.")
    set(value) { this.withRecordColumns(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.Builder.withRecordFormat
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.Builder.recordFormat: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on recordFormat is not supported.")
    set(value) { this.withRecordFormat(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.Builder.withRecordEncoding
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.Builder.recordEncoding: String
    get() = throw NoSuchFieldException("Get on recordEncoding is not supported.")
    set(value) { this.withRecordEncoding(value) }


/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty.Builder
 */
fun mappingParametersProperty(init: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty {
    val builder = software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty.Builder.withCsvMappingParameters
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty.Builder.csvMappingParameters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on csvMappingParameters is not supported.")
    set(value) { this.withCsvMappingParameters(value) }

/**
 * @see software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty.Builder.withJsonMappingParameters
 */
var software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty.Builder.jsonMappingParameters: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.JSONMappingParametersProperty
    get() = throw NoSuchFieldException("Get on jsonMappingParameters is not supported.")
    set(value) { this.withJsonMappingParameters(value) }
