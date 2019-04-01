package software.amazon.awscdk.dsl.services.cloudtrail
/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrail
 */
fun software.amazon.awscdk.Construct.cfnTrail(id: String,
                     props: software.amazon.awscdk.services.cloudtrail.CfnTrailProps? = null,
                     init: (software.amazon.awscdk.services.cloudtrail.CfnTrail.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudtrail.CfnTrail {

    val obj = software.amazon.awscdk.services.cloudtrail.CfnTrail(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cloudtrail.CloudTrail
 */
fun software.amazon.awscdk.Construct.cloudTrail(id: String,
                     props: software.amazon.awscdk.services.cloudtrail.CloudTrailProps? = null,
                     init: (software.amazon.awscdk.services.cloudtrail.CloudTrail.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudtrail.CloudTrail {

    val obj = software.amazon.awscdk.services.cloudtrail.CloudTrail(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cloudtrail.CloudTrail
 */
fun software.amazon.awscdk.Construct.cloudTrail(id: String,
                     init: (software.amazon.awscdk.services.cloudtrail.CloudTrail.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudtrail.CloudTrail {

    val obj = software.amazon.awscdk.services.cloudtrail.CloudTrail(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty.Builder
 */
fun dataResourceProperty(init: software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty {
    val builder = software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty.Builder.withType
 */
var software.amazon.awscdk.services.cloudtrail.CfnTrail.DataResourceProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder
 */
fun cfnTrailProps(init: software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudtrail.CfnTrailProps {
    val builder = software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.withKmsKeyId
 */
var software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.kmsKeyId: String
    get() = throw NoSuchFieldException("Get on kmsKeyId is not supported.")
    set(value) { this.withKmsKeyId(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.withS3KeyPrefix
 */
var software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.s3KeyPrefix: String
    get() = throw NoSuchFieldException("Get on s3KeyPrefix is not supported.")
    set(value) { this.withS3KeyPrefix(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.withCloudWatchLogsLogGroupArn
 */
var software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.cloudWatchLogsLogGroupArn: String
    get() = throw NoSuchFieldException("Get on cloudWatchLogsLogGroupArn is not supported.")
    set(value) { this.withCloudWatchLogsLogGroupArn(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.withS3BucketName
 */
var software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.s3BucketName: String
    get() = throw NoSuchFieldException("Get on s3BucketName is not supported.")
    set(value) { this.withS3BucketName(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.withCloudWatchLogsRoleArn
 */
var software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.cloudWatchLogsRoleArn: String
    get() = throw NoSuchFieldException("Get on cloudWatchLogsRoleArn is not supported.")
    set(value) { this.withCloudWatchLogsRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.withIncludeGlobalServiceEvents
 */
var software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.includeGlobalServiceEvents: Boolean
    get() = throw NoSuchFieldException("Get on includeGlobalServiceEvents is not supported.")
    set(value) { this.withIncludeGlobalServiceEvents(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.withIsMultiRegionTrail
 */
var software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.isMultiRegionTrail: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on isMultiRegionTrail is not supported.")
    set(value) { this.withIsMultiRegionTrail(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.withTrailName
 */
var software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.trailName: String
    get() = throw NoSuchFieldException("Get on trailName is not supported.")
    set(value) { this.withTrailName(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.withIsLogging
 */
var software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.isLogging: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on isLogging is not supported.")
    set(value) { this.withIsLogging(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.withEnableLogFileValidation
 */
var software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.enableLogFileValidation: Boolean
    get() = throw NoSuchFieldException("Get on enableLogFileValidation is not supported.")
    set(value) { this.withEnableLogFileValidation(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.withEventSelectors
 */
var software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.eventSelectors: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on eventSelectors is not supported.")
    set(value) { this.withEventSelectors(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.withSnsTopicName
 */
var software.amazon.awscdk.services.cloudtrail.CfnTrailProps.Builder.snsTopicName: String
    get() = throw NoSuchFieldException("Get on snsTopicName is not supported.")
    set(value) { this.withSnsTopicName(value) }


/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty.Builder
 */
fun eventSelectorProperty(init: software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty {
    val builder = software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty.Builder.withIncludeManagementEvents
 */
var software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty.Builder.includeManagementEvents: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on includeManagementEvents is not supported.")
    set(value) { this.withIncludeManagementEvents(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty.Builder.withReadWriteType
 */
var software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty.Builder.readWriteType: String
    get() = throw NoSuchFieldException("Get on readWriteType is not supported.")
    set(value) { this.withReadWriteType(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty.Builder.withDataResources
 */
var software.amazon.awscdk.services.cloudtrail.CfnTrail.EventSelectorProperty.Builder.dataResources: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on dataResources is not supported.")
    set(value) { this.withDataResources(value) }


/**
 * @see software.amazon.awscdk.services.cloudtrail.AddS3EventSelectorOptions.Builder
 */
fun addS3EventSelectorOptions(init: software.amazon.awscdk.services.cloudtrail.AddS3EventSelectorOptions.Builder.() -> Unit): software.amazon.awscdk.services.cloudtrail.AddS3EventSelectorOptions {
    val builder = software.amazon.awscdk.services.cloudtrail.AddS3EventSelectorOptions.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudtrail.AddS3EventSelectorOptions.Builder.withIncludeManagementEvents
 */
var software.amazon.awscdk.services.cloudtrail.AddS3EventSelectorOptions.Builder.includeManagementEvents: Boolean
    get() = throw NoSuchFieldException("Get on includeManagementEvents is not supported.")
    set(value) { this.withIncludeManagementEvents(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.AddS3EventSelectorOptions.Builder.withReadWriteType
 */
var software.amazon.awscdk.services.cloudtrail.AddS3EventSelectorOptions.Builder.readWriteType: software.amazon.awscdk.services.cloudtrail.ReadWriteType
    get() = throw NoSuchFieldException("Get on readWriteType is not supported.")
    set(value) { this.withReadWriteType(value) }


/**
 * @see software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder
 */
fun cloudTrailProps(init: software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudtrail.CloudTrailProps {
    val builder = software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.withS3KeyPrefix
 */
var software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.s3KeyPrefix: String
    get() = throw NoSuchFieldException("Get on s3KeyPrefix is not supported.")
    set(value) { this.withS3KeyPrefix(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.withKmsKey
 */
var software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.kmsKey: software.amazon.awscdk.services.kms.IEncryptionKey
    get() = throw NoSuchFieldException("Get on kmsKey is not supported.")
    set(value) { this.withKmsKey(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.withCloudWatchLogsRetentionTimeDays
 */
var software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.cloudWatchLogsRetentionTimeDays: software.amazon.awscdk.services.logs.RetentionDays
    get() = throw NoSuchFieldException("Get on cloudWatchLogsRetentionTimeDays is not supported.")
    set(value) { this.withCloudWatchLogsRetentionTimeDays(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.withEnableFileValidation
 */
var software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.enableFileValidation: Boolean
    get() = throw NoSuchFieldException("Get on enableFileValidation is not supported.")
    set(value) { this.withEnableFileValidation(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.withIncludeGlobalServiceEvents
 */
var software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.includeGlobalServiceEvents: Boolean
    get() = throw NoSuchFieldException("Get on includeGlobalServiceEvents is not supported.")
    set(value) { this.withIncludeGlobalServiceEvents(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.withIsMultiRegionTrail
 */
var software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.isMultiRegionTrail: Boolean
    get() = throw NoSuchFieldException("Get on isMultiRegionTrail is not supported.")
    set(value) { this.withIsMultiRegionTrail(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.withManagementEvents
 */
var software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.managementEvents: software.amazon.awscdk.services.cloudtrail.ReadWriteType
    get() = throw NoSuchFieldException("Get on managementEvents is not supported.")
    set(value) { this.withManagementEvents(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.withSendToCloudWatchLogs
 */
var software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.sendToCloudWatchLogs: Boolean
    get() = throw NoSuchFieldException("Get on sendToCloudWatchLogs is not supported.")
    set(value) { this.withSendToCloudWatchLogs(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.withSnsTopic
 */
var software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.snsTopic: String
    get() = throw NoSuchFieldException("Get on snsTopic is not supported.")
    set(value) { this.withSnsTopic(value) }

/**
 * @see software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.withTrailName
 */
var software.amazon.awscdk.services.cloudtrail.CloudTrailProps.Builder.trailName: String
    get() = throw NoSuchFieldException("Get on trailName is not supported.")
    set(value) { this.withTrailName(value) }
