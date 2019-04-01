package software.amazon.awscdk.dsl.services.kinesisfirehose
/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
 */
fun software.amazon.awscdk.Construct.cfnDeliveryStream(id: String,
                     props: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps? = null,
                     init: (software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.() -> Unit)? = null)
        : software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream {

    val obj = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
 */
fun software.amazon.awscdk.Construct.cfnDeliveryStream(id: String,
                     init: (software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.() -> Unit)? = null)
        : software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream {

    val obj = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty.Builder
 */
fun elasticsearchRetryOptionsProperty(init: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty {
    val builder = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty.Builder.withDurationInSeconds
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchRetryOptionsProperty.Builder.durationInSeconds: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on durationInSeconds is not supported.")
    set(value) { this.withDurationInSeconds(value) }


/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty.Builder
 */
fun elasticsearchBufferingHintsProperty(init: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty {
    val builder = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty.Builder.withSizeInMBs
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty.Builder.sizeInMBs: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on sizeInMBs is not supported.")
    set(value) { this.withSizeInMBs(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty.Builder.withIntervalInSeconds
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchBufferingHintsProperty.Builder.intervalInSeconds: Number
    get() = throw NoSuchFieldException("Get on intervalInSeconds is not supported.")
    set(value) { this.withIntervalInSeconds(value) }


/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder
 */
fun s3DestinationConfigurationProperty(init: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty {
    val builder = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.withCompressionFormat
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.compressionFormat: String
    get() = throw NoSuchFieldException("Get on compressionFormat is not supported.")
    set(value) { this.withCompressionFormat(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.withCloudWatchLoggingOptions
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.cloudWatchLoggingOptions: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty
    get() = throw NoSuchFieldException("Get on cloudWatchLoggingOptions is not supported.")
    set(value) { this.withCloudWatchLoggingOptions(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.withEncryptionConfiguration
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.encryptionConfiguration: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty
    get() = throw NoSuchFieldException("Get on encryptionConfiguration is not supported.")
    set(value) { this.withEncryptionConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.withBucketArn
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.bucketArn: String
    get() = throw NoSuchFieldException("Get on bucketArn is not supported.")
    set(value) { this.withBucketArn(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.withBufferingHints
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.bufferingHints: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on bufferingHints is not supported.")
    set(value) { this.withBufferingHints(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.withPrefix
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder.prefix: String
    get() = throw NoSuchFieldException("Get on prefix is not supported.")
    set(value) { this.withPrefix(value) }


/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty.Builder
 */
fun processorProperty(init: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty {
    val builder = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty.Builder.withType
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty.Builder.withParameters
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty.Builder.parameters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on parameters is not supported.")
    set(value) { this.withParameters(value) }


/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder
 */
fun cfnDeliveryStreamProps(init: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder.() -> Unit): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps {
    val builder = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder.withDeliveryStreamName
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder.deliveryStreamName: String
    get() = throw NoSuchFieldException("Get on deliveryStreamName is not supported.")
    set(value) { this.withDeliveryStreamName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder.withDeliveryStreamType
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder.deliveryStreamType: String
    get() = throw NoSuchFieldException("Get on deliveryStreamType is not supported.")
    set(value) { this.withDeliveryStreamType(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder.withElasticsearchDestinationConfiguration
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder.elasticsearchDestinationConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on elasticsearchDestinationConfiguration is not supported.")
    set(value) { this.withElasticsearchDestinationConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder.withExtendedS3DestinationConfiguration
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder.extendedS3DestinationConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on extendedS3DestinationConfiguration is not supported.")
    set(value) { this.withExtendedS3DestinationConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder.withKinesisStreamSourceConfiguration
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder.kinesisStreamSourceConfiguration: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty
    get() = throw NoSuchFieldException("Get on kinesisStreamSourceConfiguration is not supported.")
    set(value) { this.withKinesisStreamSourceConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder.withRedshiftDestinationConfiguration
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder.redshiftDestinationConfiguration: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty
    get() = throw NoSuchFieldException("Get on redshiftDestinationConfiguration is not supported.")
    set(value) { this.withRedshiftDestinationConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder.withS3DestinationConfiguration
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder.s3DestinationConfiguration: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty
    get() = throw NoSuchFieldException("Get on s3DestinationConfiguration is not supported.")
    set(value) { this.withS3DestinationConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder.withSplunkDestinationConfiguration
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder.splunkDestinationConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on splunkDestinationConfiguration is not supported.")
    set(value) { this.withSplunkDestinationConfiguration(value) }


/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty.Builder
 */
fun copyCommandProperty(init: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty {
    val builder = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty.Builder.withDataTableName
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty.Builder.dataTableName: String
    get() = throw NoSuchFieldException("Get on dataTableName is not supported.")
    set(value) { this.withDataTableName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty.Builder.withCopyOptions
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty.Builder.copyOptions: String
    get() = throw NoSuchFieldException("Get on copyOptions is not supported.")
    set(value) { this.withCopyOptions(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty.Builder.withDataTableColumns
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty.Builder.dataTableColumns: String
    get() = throw NoSuchFieldException("Get on dataTableColumns is not supported.")
    set(value) { this.withDataTableColumns(value) }


/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty.Builder
 */
fun kMSEncryptionConfigProperty(init: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty {
    val builder = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty.Builder.withAwskmsKeyArn
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty.Builder.awskmsKeyArn: String
    get() = throw NoSuchFieldException("Get on awskmsKeyArn is not supported.")
    set(value) { this.withAwskmsKeyArn(value) }


/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder
 */
fun elasticsearchDestinationConfigurationProperty(init: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty {
    val builder = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.withIndexRotationPeriod
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.indexRotationPeriod: String
    get() = throw NoSuchFieldException("Get on indexRotationPeriod is not supported.")
    set(value) { this.withIndexRotationPeriod(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.withRetryOptions
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.retryOptions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on retryOptions is not supported.")
    set(value) { this.withRetryOptions(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.withS3Configuration
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.s3Configuration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on s3Configuration is not supported.")
    set(value) { this.withS3Configuration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.withCloudWatchLoggingOptions
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.cloudWatchLoggingOptions: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty
    get() = throw NoSuchFieldException("Get on cloudWatchLoggingOptions is not supported.")
    set(value) { this.withCloudWatchLoggingOptions(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.withDomainArn
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.domainArn: String
    get() = throw NoSuchFieldException("Get on domainArn is not supported.")
    set(value) { this.withDomainArn(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.withIndexName
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.indexName: String
    get() = throw NoSuchFieldException("Get on indexName is not supported.")
    set(value) { this.withIndexName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.withS3BackupMode
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.s3BackupMode: String
    get() = throw NoSuchFieldException("Get on s3BackupMode is not supported.")
    set(value) { this.withS3BackupMode(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.withProcessingConfiguration
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.processingConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on processingConfiguration is not supported.")
    set(value) { this.withProcessingConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.withBufferingHints
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.bufferingHints: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on bufferingHints is not supported.")
    set(value) { this.withBufferingHints(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.withTypeName
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.typeName: String
    get() = throw NoSuchFieldException("Get on typeName is not supported.")
    set(value) { this.withTypeName(value) }


/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder
 */
fun redshiftDestinationConfigurationProperty(init: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty {
    val builder = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.withPassword
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.password: String
    get() = throw NoSuchFieldException("Get on password is not supported.")
    set(value) { this.withPassword(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.withUsername
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.username: String
    get() = throw NoSuchFieldException("Get on username is not supported.")
    set(value) { this.withUsername(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.withS3Configuration
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.s3Configuration: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty
    get() = throw NoSuchFieldException("Get on s3Configuration is not supported.")
    set(value) { this.withS3Configuration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.withCloudWatchLoggingOptions
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.cloudWatchLoggingOptions: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty
    get() = throw NoSuchFieldException("Get on cloudWatchLoggingOptions is not supported.")
    set(value) { this.withCloudWatchLoggingOptions(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.withProcessingConfiguration
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.processingConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on processingConfiguration is not supported.")
    set(value) { this.withProcessingConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.withCopyCommand
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.copyCommand: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on copyCommand is not supported.")
    set(value) { this.withCopyCommand(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.withClusterJdbcurl
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.clusterJdbcurl: String
    get() = throw NoSuchFieldException("Get on clusterJdbcurl is not supported.")
    set(value) { this.withClusterJdbcurl(value) }


/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty.Builder
 */
fun processorParameterProperty(init: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty {
    val builder = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty.Builder.withParameterName
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty.Builder.parameterName: String
    get() = throw NoSuchFieldException("Get on parameterName is not supported.")
    set(value) { this.withParameterName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty.Builder.withParameterValue
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty.Builder.parameterValue: String
    get() = throw NoSuchFieldException("Get on parameterValue is not supported.")
    set(value) { this.withParameterValue(value) }


/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.Builder
 */
fun kinesisStreamSourceConfigurationProperty(init: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty {
    val builder = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.Builder.withKinesisStreamArn
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.Builder.kinesisStreamArn: String
    get() = throw NoSuchFieldException("Get on kinesisStreamArn is not supported.")
    set(value) { this.withKinesisStreamArn(value) }


/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder
 */
fun extendedS3DestinationConfigurationProperty(init: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty {
    val builder = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.withCompressionFormat
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.compressionFormat: String
    get() = throw NoSuchFieldException("Get on compressionFormat is not supported.")
    set(value) { this.withCompressionFormat(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.withCloudWatchLoggingOptions
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.cloudWatchLoggingOptions: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty
    get() = throw NoSuchFieldException("Get on cloudWatchLoggingOptions is not supported.")
    set(value) { this.withCloudWatchLoggingOptions(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.withEncryptionConfiguration
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.encryptionConfiguration: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty
    get() = throw NoSuchFieldException("Get on encryptionConfiguration is not supported.")
    set(value) { this.withEncryptionConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.withS3BackupMode
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.s3BackupMode: String
    get() = throw NoSuchFieldException("Get on s3BackupMode is not supported.")
    set(value) { this.withS3BackupMode(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.withProcessingConfiguration
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.processingConfiguration: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty
    get() = throw NoSuchFieldException("Get on processingConfiguration is not supported.")
    set(value) { this.withProcessingConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.withBucketArn
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.bucketArn: String
    get() = throw NoSuchFieldException("Get on bucketArn is not supported.")
    set(value) { this.withBucketArn(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.withBufferingHints
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.bufferingHints: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on bufferingHints is not supported.")
    set(value) { this.withBufferingHints(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.withS3BackupConfiguration
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.s3BackupConfiguration: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty
    get() = throw NoSuchFieldException("Get on s3BackupConfiguration is not supported.")
    set(value) { this.withS3BackupConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.withPrefix
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder.prefix: String
    get() = throw NoSuchFieldException("Get on prefix is not supported.")
    set(value) { this.withPrefix(value) }


/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty.Builder
 */
fun bufferingHintsProperty(init: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty {
    val builder = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty.Builder.withSizeInMBs
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty.Builder.sizeInMBs: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on sizeInMBs is not supported.")
    set(value) { this.withSizeInMBs(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty.Builder.withIntervalInSeconds
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty.Builder.intervalInSeconds: Number
    get() = throw NoSuchFieldException("Get on intervalInSeconds is not supported.")
    set(value) { this.withIntervalInSeconds(value) }


/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder
 */
fun splunkDestinationConfigurationProperty(init: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty {
    val builder = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.withRetryOptions
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.retryOptions: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty
    get() = throw NoSuchFieldException("Get on retryOptions is not supported.")
    set(value) { this.withRetryOptions(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.withS3Configuration
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.s3Configuration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on s3Configuration is not supported.")
    set(value) { this.withS3Configuration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.withCloudWatchLoggingOptions
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.cloudWatchLoggingOptions: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty
    get() = throw NoSuchFieldException("Get on cloudWatchLoggingOptions is not supported.")
    set(value) { this.withCloudWatchLoggingOptions(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.withS3BackupMode
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.s3BackupMode: String
    get() = throw NoSuchFieldException("Get on s3BackupMode is not supported.")
    set(value) { this.withS3BackupMode(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.withProcessingConfiguration
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.processingConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on processingConfiguration is not supported.")
    set(value) { this.withProcessingConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.withHecEndpoint
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.hecEndpoint: String
    get() = throw NoSuchFieldException("Get on hecEndpoint is not supported.")
    set(value) { this.withHecEndpoint(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.withHecEndpointType
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.hecEndpointType: String
    get() = throw NoSuchFieldException("Get on hecEndpointType is not supported.")
    set(value) { this.withHecEndpointType(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.withHecToken
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.hecToken: String
    get() = throw NoSuchFieldException("Get on hecToken is not supported.")
    set(value) { this.withHecToken(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.withHecAcknowledgmentTimeoutInSeconds
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder.hecAcknowledgmentTimeoutInSeconds: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on hecAcknowledgmentTimeoutInSeconds is not supported.")
    set(value) { this.withHecAcknowledgmentTimeoutInSeconds(value) }


/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty.Builder
 */
fun splunkRetryOptionsProperty(init: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty {
    val builder = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty.Builder.withDurationInSeconds
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty.Builder.durationInSeconds: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on durationInSeconds is not supported.")
    set(value) { this.withDurationInSeconds(value) }


/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty.Builder
 */
fun encryptionConfigurationProperty(init: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty {
    val builder = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty.Builder.withKmsEncryptionConfig
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty.Builder.kmsEncryptionConfig: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KMSEncryptionConfigProperty
    get() = throw NoSuchFieldException("Get on kmsEncryptionConfig is not supported.")
    set(value) { this.withKmsEncryptionConfig(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty.Builder.withNoEncryptionConfig
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty.Builder.noEncryptionConfig: String
    get() = throw NoSuchFieldException("Get on noEncryptionConfig is not supported.")
    set(value) { this.withNoEncryptionConfig(value) }


/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty.Builder
 */
fun processingConfigurationProperty(init: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty {
    val builder = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty.Builder.enabled: Boolean
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty.Builder.withProcessors
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty.Builder.processors: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on processors is not supported.")
    set(value) { this.withProcessors(value) }


/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty.Builder
 */
fun cloudWatchLoggingOptionsProperty(init: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty {
    val builder = software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty.Builder.withLogGroupName
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty.Builder.logGroupName: String
    get() = throw NoSuchFieldException("Get on logGroupName is not supported.")
    set(value) { this.withLogGroupName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty.Builder.withLogStreamName
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty.Builder.logStreamName: String
    get() = throw NoSuchFieldException("Get on logStreamName is not supported.")
    set(value) { this.withLogStreamName(value) }

/**
 * @see software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty.Builder.enabled: Boolean
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }
