package software.amazon.awscdk.dsl.services.s3
/**
 * @see software.amazon.awscdk.services.s3.Bucket
 */
fun software.amazon.awscdk.Construct.bucket(id: String,
                     props: software.amazon.awscdk.services.s3.BucketProps? = null,
                     init: (software.amazon.awscdk.services.s3.Bucket.() -> Unit)? = null)
        : software.amazon.awscdk.services.s3.Bucket {

    val obj = software.amazon.awscdk.services.s3.Bucket(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.s3.BucketPolicy
 */
fun software.amazon.awscdk.Construct.bucketPolicy(id: String,
                     props: software.amazon.awscdk.services.s3.BucketPolicyProps? = null,
                     init: (software.amazon.awscdk.services.s3.BucketPolicy.() -> Unit)? = null)
        : software.amazon.awscdk.services.s3.BucketPolicy {

    val obj = software.amazon.awscdk.services.s3.BucketPolicy(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket
 */
fun software.amazon.awscdk.Construct.cfnBucket(id: String,
                     props: software.amazon.awscdk.services.s3.CfnBucketProps? = null,
                     init: (software.amazon.awscdk.services.s3.CfnBucket.() -> Unit)? = null)
        : software.amazon.awscdk.services.s3.CfnBucket {

    val obj = software.amazon.awscdk.services.s3.CfnBucket(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.s3.CfnBucketPolicy
 */
fun software.amazon.awscdk.Construct.cfnBucketPolicy(id: String,
                     props: software.amazon.awscdk.services.s3.CfnBucketPolicyProps? = null,
                     init: (software.amazon.awscdk.services.s3.CfnBucketPolicy.() -> Unit)? = null)
        : software.amazon.awscdk.services.s3.CfnBucketPolicy {

    val obj = software.amazon.awscdk.services.s3.CfnBucketPolicy(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.s3.Bucket
 */
fun software.amazon.awscdk.Construct.bucket(id: String,
                     init: (software.amazon.awscdk.services.s3.Bucket.() -> Unit)? = null)
        : software.amazon.awscdk.services.s3.Bucket {

    val obj = software.amazon.awscdk.services.s3.Bucket(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket
 */
fun software.amazon.awscdk.Construct.cfnBucket(id: String,
                     init: (software.amazon.awscdk.services.s3.CfnBucket.() -> Unit)? = null)
        : software.amazon.awscdk.services.s3.CfnBucket {

    val obj = software.amazon.awscdk.services.s3.CfnBucket(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty.Builder
 */
fun metricsConfigurationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty.Builder.withId
 */
var software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty.Builder.withTagFilters
 */
var software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty.Builder.tagFilters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on tagFilters is not supported.")
    set(value) { this.withTagFilters(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty.Builder.withPrefix
 */
var software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty.Builder.prefix: String
    get() = throw NoSuchFieldException("Get on prefix is not supported.")
    set(value) { this.withPrefix(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder
 */
fun inventoryConfigurationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder.withId
 */
var software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder.withDestination
 */
var software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder.destination: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on destination is not supported.")
    set(value) { this.withDestination(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder.withIncludedObjectVersions
 */
var software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder.includedObjectVersions: String
    get() = throw NoSuchFieldException("Get on includedObjectVersions is not supported.")
    set(value) { this.withIncludedObjectVersions(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder.withScheduleFrequency
 */
var software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder.scheduleFrequency: String
    get() = throw NoSuchFieldException("Get on scheduleFrequency is not supported.")
    set(value) { this.withScheduleFrequency(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder.enabled: Boolean
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder.withPrefix
 */
var software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder.prefix: String
    get() = throw NoSuchFieldException("Get on prefix is not supported.")
    set(value) { this.withPrefix(value) }


/**
 * @see software.amazon.awscdk.services.s3.CommonPipelineSourceActionProps.Builder
 */
fun commonPipelineSourceActionProps(init: software.amazon.awscdk.services.s3.CommonPipelineSourceActionProps.Builder.() -> Unit): software.amazon.awscdk.services.s3.CommonPipelineSourceActionProps {
    val builder = software.amazon.awscdk.services.s3.CommonPipelineSourceActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CommonPipelineSourceActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.s3.CommonPipelineSourceActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.s3.CommonPipelineSourceActionProps.Builder.withPollForSourceChanges
 */
var software.amazon.awscdk.services.s3.CommonPipelineSourceActionProps.Builder.pollForSourceChanges: Boolean
    get() = throw NoSuchFieldException("Get on pollForSourceChanges is not supported.")
    set(value) { this.withPollForSourceChanges(value) }

/**
 * @see software.amazon.awscdk.services.s3.CommonPipelineSourceActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.s3.CommonPipelineSourceActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.s3.CommonPipelineSourceActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.s3.CommonPipelineSourceActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.s3.CommonPipelineSourceActionProps.Builder.withBucketKey
 */
var software.amazon.awscdk.services.s3.CommonPipelineSourceActionProps.Builder.bucketKey: String
    get() = throw NoSuchFieldException("Get on bucketKey is not supported.")
    set(value) { this.withBucketKey(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty.Builder
 */
fun encryptionConfigurationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty.Builder.withReplicaKmsKeyId
 */
var software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty.Builder.replicaKmsKeyId: String
    get() = throw NoSuchFieldException("Get on replicaKmsKeyId is not supported.")
    set(value) { this.withReplicaKmsKeyId(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty.Builder
 */
fun bucketEncryptionProperty(init: software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty.Builder.withServerSideEncryptionConfiguration
 */
var software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty.Builder.serverSideEncryptionConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on serverSideEncryptionConfiguration is not supported.")
    set(value) { this.withServerSideEncryptionConfiguration(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.AbortIncompleteMultipartUploadProperty.Builder
 */
fun abortIncompleteMultipartUploadProperty(init: software.amazon.awscdk.services.s3.CfnBucket.AbortIncompleteMultipartUploadProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.AbortIncompleteMultipartUploadProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.AbortIncompleteMultipartUploadProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.AbortIncompleteMultipartUploadProperty.Builder.withDaysAfterInitiation
 */
var software.amazon.awscdk.services.s3.CfnBucket.AbortIncompleteMultipartUploadProperty.Builder.daysAfterInitiation: Number
    get() = throw NoSuchFieldException("Get on daysAfterInitiation is not supported.")
    set(value) { this.withDaysAfterInitiation(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty.Builder
 */
fun notificationConfigurationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty.Builder.withLambdaConfigurations
 */
var software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty.Builder.lambdaConfigurations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on lambdaConfigurations is not supported.")
    set(value) { this.withLambdaConfigurations(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty.Builder.withQueueConfigurations
 */
var software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty.Builder.queueConfigurations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on queueConfigurations is not supported.")
    set(value) { this.withQueueConfigurations(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty.Builder.withTopicConfigurations
 */
var software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty.Builder.topicConfigurations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on topicConfigurations is not supported.")
    set(value) { this.withTopicConfigurations(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty.Builder
 */
fun loggingConfigurationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty.Builder.withLogFilePrefix
 */
var software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty.Builder.logFilePrefix: String
    get() = throw NoSuchFieldException("Get on logFilePrefix is not supported.")
    set(value) { this.withLogFilePrefix(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty.Builder.withDestinationBucketName
 */
var software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty.Builder.destinationBucketName: String
    get() = throw NoSuchFieldException("Get on destinationBucketName is not supported.")
    set(value) { this.withDestinationBucketName(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty.Builder
 */
fun destinationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty.Builder.withFormat
 */
var software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty.Builder.format: String
    get() = throw NoSuchFieldException("Get on format is not supported.")
    set(value) { this.withFormat(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty.Builder.withBucketAccountId
 */
var software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty.Builder.bucketAccountId: String
    get() = throw NoSuchFieldException("Get on bucketAccountId is not supported.")
    set(value) { this.withBucketAccountId(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty.Builder.withBucketArn
 */
var software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty.Builder.bucketArn: String
    get() = throw NoSuchFieldException("Get on bucketArn is not supported.")
    set(value) { this.withBucketArn(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty.Builder.withPrefix
 */
var software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty.Builder.prefix: String
    get() = throw NoSuchFieldException("Get on prefix is not supported.")
    set(value) { this.withPrefix(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty.Builder
 */
fun replicationDestinationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty.Builder.withStorageClass
 */
var software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty.Builder.storageClass: String
    get() = throw NoSuchFieldException("Get on storageClass is not supported.")
    set(value) { this.withStorageClass(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty.Builder.withAccount
 */
var software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty.Builder.account: String
    get() = throw NoSuchFieldException("Get on account is not supported.")
    set(value) { this.withAccount(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty.Builder.withBucket
 */
var software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty.Builder.bucket: String
    get() = throw NoSuchFieldException("Get on bucket is not supported.")
    set(value) { this.withBucket(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty.Builder.withEncryptionConfiguration
 */
var software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty.Builder.encryptionConfiguration: software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty
    get() = throw NoSuchFieldException("Get on encryptionConfiguration is not supported.")
    set(value) { this.withEncryptionConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty.Builder.withAccessControlTranslation
 */
var software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty.Builder.accessControlTranslation: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on accessControlTranslation is not supported.")
    set(value) { this.withAccessControlTranslation(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty.Builder
 */
fun routingRuleConditionProperty(init: software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty.Builder.withKeyPrefixEquals
 */
var software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty.Builder.keyPrefixEquals: String
    get() = throw NoSuchFieldException("Get on keyPrefixEquals is not supported.")
    set(value) { this.withKeyPrefixEquals(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty.Builder.withHttpErrorCodeReturnedEquals
 */
var software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty.Builder.httpErrorCodeReturnedEquals: String
    get() = throw NoSuchFieldException("Get on httpErrorCodeReturnedEquals is not supported.")
    set(value) { this.withHttpErrorCodeReturnedEquals(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty.Builder
 */
fun corsRuleProperty(init: software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty.Builder.withId
 */
var software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty.Builder.withMaxAge
 */
var software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty.Builder.maxAge: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on maxAge is not supported.")
    set(value) { this.withMaxAge(value) }


/**
 * @see software.amazon.awscdk.services.s3.Transition.Builder
 */
fun transition(init: software.amazon.awscdk.services.s3.Transition.Builder.() -> Unit): software.amazon.awscdk.services.s3.Transition {
    val builder = software.amazon.awscdk.services.s3.Transition.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.Transition.Builder.withTransitionInDays
 */
var software.amazon.awscdk.services.s3.Transition.Builder.transitionInDays: Number
    get() = throw NoSuchFieldException("Get on transitionInDays is not supported.")
    set(value) { this.withTransitionInDays(value) }

/**
 * @see software.amazon.awscdk.services.s3.Transition.Builder.withTransitionDate
 */
var software.amazon.awscdk.services.s3.Transition.Builder.transitionDate: java.time.Instant
    get() = throw NoSuchFieldException("Get on transitionDate is not supported.")
    set(value) { this.withTransitionDate(value) }

/**
 * @see software.amazon.awscdk.services.s3.Transition.Builder.withStorageClass
 */
var software.amazon.awscdk.services.s3.Transition.Builder.storageClass: software.amazon.awscdk.services.s3.StorageClass
    get() = throw NoSuchFieldException("Get on storageClass is not supported.")
    set(value) { this.withStorageClass(value) }


/**
 * @see software.amazon.awscdk.services.s3.PipelineSourceActionProps.Builder
 */
fun pipelineSourceActionProps(init: software.amazon.awscdk.services.s3.PipelineSourceActionProps.Builder.() -> Unit): software.amazon.awscdk.services.s3.PipelineSourceActionProps {
    val builder = software.amazon.awscdk.services.s3.PipelineSourceActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.PipelineSourceActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.s3.PipelineSourceActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.s3.PipelineSourceActionProps.Builder.withPollForSourceChanges
 */
var software.amazon.awscdk.services.s3.PipelineSourceActionProps.Builder.pollForSourceChanges: Boolean
    get() = throw NoSuchFieldException("Get on pollForSourceChanges is not supported.")
    set(value) { this.withPollForSourceChanges(value) }

/**
 * @see software.amazon.awscdk.services.s3.PipelineSourceActionProps.Builder.withBucket
 */
var software.amazon.awscdk.services.s3.PipelineSourceActionProps.Builder.bucket: software.amazon.awscdk.services.s3.IBucket
    get() = throw NoSuchFieldException("Get on bucket is not supported.")
    set(value) { this.withBucket(value) }

/**
 * @see software.amazon.awscdk.services.s3.PipelineSourceActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.s3.PipelineSourceActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.s3.PipelineSourceActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.s3.PipelineSourceActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.s3.PipelineSourceActionProps.Builder.withBucketKey
 */
var software.amazon.awscdk.services.s3.PipelineSourceActionProps.Builder.bucketKey: String
    get() = throw NoSuchFieldException("Get on bucketKey is not supported.")
    set(value) { this.withBucketKey(value) }


/**
 * @see software.amazon.awscdk.services.s3.BucketPolicyProps.Builder
 */
fun bucketPolicyProps(init: software.amazon.awscdk.services.s3.BucketPolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.s3.BucketPolicyProps {
    val builder = software.amazon.awscdk.services.s3.BucketPolicyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.BucketPolicyProps.Builder.withBucket
 */
var software.amazon.awscdk.services.s3.BucketPolicyProps.Builder.bucket: software.amazon.awscdk.services.s3.IBucket
    get() = throw NoSuchFieldException("Get on bucket is not supported.")
    set(value) { this.withBucket(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionRuleProperty.Builder
 */
fun serverSideEncryptionRuleProperty(init: software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionRuleProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionRuleProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionRuleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionRuleProperty.Builder.withServerSideEncryptionByDefault
 */
var software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionRuleProperty.Builder.serverSideEncryptionByDefault: software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty
    get() = throw NoSuchFieldException("Get on serverSideEncryptionByDefault is not supported.")
    set(value) { this.withServerSideEncryptionByDefault(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty.Builder
 */
fun filterRuleProperty(init: software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty.Builder.withValue
 */
var software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty.Builder.withName
 */
var software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty.Builder
 */
fun queueConfigurationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty.Builder.withQueue
 */
var software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty.Builder.queue: String
    get() = throw NoSuchFieldException("Get on queue is not supported.")
    set(value) { this.withQueue(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty.Builder.withEvent
 */
var software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty.Builder.event: String
    get() = throw NoSuchFieldException("Get on event is not supported.")
    set(value) { this.withEvent(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty.Builder.withFilter
 */
var software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty.Builder.filter: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on filter is not supported.")
    set(value) { this.withFilter(value) }


/**
 * @see software.amazon.awscdk.services.s3.NoncurrentVersionTransition.Builder
 */
fun noncurrentVersionTransition(init: software.amazon.awscdk.services.s3.NoncurrentVersionTransition.Builder.() -> Unit): software.amazon.awscdk.services.s3.NoncurrentVersionTransition {
    val builder = software.amazon.awscdk.services.s3.NoncurrentVersionTransition.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.NoncurrentVersionTransition.Builder.withTransitionInDays
 */
var software.amazon.awscdk.services.s3.NoncurrentVersionTransition.Builder.transitionInDays: Number
    get() = throw NoSuchFieldException("Get on transitionInDays is not supported.")
    set(value) { this.withTransitionInDays(value) }

/**
 * @see software.amazon.awscdk.services.s3.NoncurrentVersionTransition.Builder.withStorageClass
 */
var software.amazon.awscdk.services.s3.NoncurrentVersionTransition.Builder.storageClass: software.amazon.awscdk.services.s3.StorageClass
    get() = throw NoSuchFieldException("Get on storageClass is not supported.")
    set(value) { this.withStorageClass(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty.Builder
 */
fun tagFilterProperty(init: software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty.Builder.withKey
 */
var software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty.Builder.withValue
 */
var software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty.Builder
 */
fun replicationConfigurationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty.Builder.withRole
 */
var software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty.Builder.role: String
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty.Builder.withRules
 */
var software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty.Builder.rules: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on rules is not supported.")
    set(value) { this.withRules(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty.Builder
 */
fun publicAccessBlockConfigurationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty.Builder.withIgnorePublicAcls
 */
var software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty.Builder.ignorePublicAcls: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ignorePublicAcls is not supported.")
    set(value) { this.withIgnorePublicAcls(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty.Builder.withRestrictPublicBuckets
 */
var software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty.Builder.restrictPublicBuckets: Boolean
    get() = throw NoSuchFieldException("Get on restrictPublicBuckets is not supported.")
    set(value) { this.withRestrictPublicBuckets(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty.Builder.withBlockPublicAcls
 */
var software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty.Builder.blockPublicAcls: Boolean
    get() = throw NoSuchFieldException("Get on blockPublicAcls is not supported.")
    set(value) { this.withBlockPublicAcls(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty.Builder.withBlockPublicPolicy
 */
var software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty.Builder.blockPublicPolicy: Boolean
    get() = throw NoSuchFieldException("Get on blockPublicPolicy is not supported.")
    set(value) { this.withBlockPublicPolicy(value) }


/**
 * @see software.amazon.awscdk.services.s3.PipelineDeployActionProps.Builder
 */
fun pipelineDeployActionProps(init: software.amazon.awscdk.services.s3.PipelineDeployActionProps.Builder.() -> Unit): software.amazon.awscdk.services.s3.PipelineDeployActionProps {
    val builder = software.amazon.awscdk.services.s3.PipelineDeployActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.PipelineDeployActionProps.Builder.withInputArtifact
 */
var software.amazon.awscdk.services.s3.PipelineDeployActionProps.Builder.inputArtifact: software.amazon.awscdk.services.codepipeline.api.Artifact
    get() = throw NoSuchFieldException("Get on inputArtifact is not supported.")
    set(value) { this.withInputArtifact(value) }

/**
 * @see software.amazon.awscdk.services.s3.PipelineDeployActionProps.Builder.withBucket
 */
var software.amazon.awscdk.services.s3.PipelineDeployActionProps.Builder.bucket: software.amazon.awscdk.services.s3.IBucket
    get() = throw NoSuchFieldException("Get on bucket is not supported.")
    set(value) { this.withBucket(value) }

/**
 * @see software.amazon.awscdk.services.s3.PipelineDeployActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.s3.PipelineDeployActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.s3.PipelineDeployActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.s3.PipelineDeployActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.s3.PipelineDeployActionProps.Builder.withObjectKey
 */
var software.amazon.awscdk.services.s3.PipelineDeployActionProps.Builder.objectKey: String
    get() = throw NoSuchFieldException("Get on objectKey is not supported.")
    set(value) { this.withObjectKey(value) }

/**
 * @see software.amazon.awscdk.services.s3.PipelineDeployActionProps.Builder.withExtract
 */
var software.amazon.awscdk.services.s3.PipelineDeployActionProps.Builder.extract: Boolean
    get() = throw NoSuchFieldException("Get on extract is not supported.")
    set(value) { this.withExtract(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty.Builder
 */
fun corsConfigurationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty.Builder.withCorsRules
 */
var software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty.Builder.corsRules: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on corsRules is not supported.")
    set(value) { this.withCorsRules(value) }


/**
 * @see software.amazon.awscdk.services.s3.BlockPublicAccessOptions.Builder
 */
fun blockPublicAccessOptions(init: software.amazon.awscdk.services.s3.BlockPublicAccessOptions.Builder.() -> Unit): software.amazon.awscdk.services.s3.BlockPublicAccessOptions {
    val builder = software.amazon.awscdk.services.s3.BlockPublicAccessOptions.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.BlockPublicAccessOptions.Builder.withIgnorePublicAcls
 */
var software.amazon.awscdk.services.s3.BlockPublicAccessOptions.Builder.ignorePublicAcls: Boolean
    get() = throw NoSuchFieldException("Get on ignorePublicAcls is not supported.")
    set(value) { this.withIgnorePublicAcls(value) }

/**
 * @see software.amazon.awscdk.services.s3.BlockPublicAccessOptions.Builder.withRestrictPublicBuckets
 */
var software.amazon.awscdk.services.s3.BlockPublicAccessOptions.Builder.restrictPublicBuckets: Boolean
    get() = throw NoSuchFieldException("Get on restrictPublicBuckets is not supported.")
    set(value) { this.withRestrictPublicBuckets(value) }

/**
 * @see software.amazon.awscdk.services.s3.BlockPublicAccessOptions.Builder.withBlockPublicAcls
 */
var software.amazon.awscdk.services.s3.BlockPublicAccessOptions.Builder.blockPublicAcls: Boolean
    get() = throw NoSuchFieldException("Get on blockPublicAcls is not supported.")
    set(value) { this.withBlockPublicAcls(value) }

/**
 * @see software.amazon.awscdk.services.s3.BlockPublicAccessOptions.Builder.withBlockPublicPolicy
 */
var software.amazon.awscdk.services.s3.BlockPublicAccessOptions.Builder.blockPublicPolicy: Boolean
    get() = throw NoSuchFieldException("Get on blockPublicPolicy is not supported.")
    set(value) { this.withBlockPublicPolicy(value) }


/**
 * @see software.amazon.awscdk.services.s3.BucketImportProps.Builder
 */
fun bucketImportProps(init: software.amazon.awscdk.services.s3.BucketImportProps.Builder.() -> Unit): software.amazon.awscdk.services.s3.BucketImportProps {
    val builder = software.amazon.awscdk.services.s3.BucketImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.BucketImportProps.Builder.withBucketName
 */
var software.amazon.awscdk.services.s3.BucketImportProps.Builder.bucketName: String
    get() = throw NoSuchFieldException("Get on bucketName is not supported.")
    set(value) { this.withBucketName(value) }

/**
 * @see software.amazon.awscdk.services.s3.BucketImportProps.Builder.withBucketArn
 */
var software.amazon.awscdk.services.s3.BucketImportProps.Builder.bucketArn: String
    get() = throw NoSuchFieldException("Get on bucketArn is not supported.")
    set(value) { this.withBucketArn(value) }

/**
 * @see software.amazon.awscdk.services.s3.BucketImportProps.Builder.withBucketWebsiteUrl
 */
var software.amazon.awscdk.services.s3.BucketImportProps.Builder.bucketWebsiteUrl: String
    get() = throw NoSuchFieldException("Get on bucketWebsiteUrl is not supported.")
    set(value) { this.withBucketWebsiteUrl(value) }

/**
 * @see software.amazon.awscdk.services.s3.BucketImportProps.Builder.withBucketDomainName
 */
var software.amazon.awscdk.services.s3.BucketImportProps.Builder.bucketDomainName: String
    get() = throw NoSuchFieldException("Get on bucketDomainName is not supported.")
    set(value) { this.withBucketDomainName(value) }

/**
 * @see software.amazon.awscdk.services.s3.BucketImportProps.Builder.withBucketWebsiteNewUrlFormat
 */
var software.amazon.awscdk.services.s3.BucketImportProps.Builder.bucketWebsiteNewUrlFormat: Boolean
    get() = throw NoSuchFieldException("Get on bucketWebsiteNewUrlFormat is not supported.")
    set(value) { this.withBucketWebsiteNewUrlFormat(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty.Builder
 */
fun serverSideEncryptionByDefaultProperty(init: software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty.Builder.withKmsMasterKeyId
 */
var software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty.Builder.kmsMasterKeyId: String
    get() = throw NoSuchFieldException("Get on kmsMasterKeyId is not supported.")
    set(value) { this.withKmsMasterKeyId(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty.Builder.withSseAlgorithm
 */
var software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty.Builder.sseAlgorithm: String
    get() = throw NoSuchFieldException("Get on sseAlgorithm is not supported.")
    set(value) { this.withSseAlgorithm(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder
 */
fun ruleProperty(init: software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.RuleProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.withId
 */
var software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.withStatus
 */
var software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.status: String
    get() = throw NoSuchFieldException("Get on status is not supported.")
    set(value) { this.withStatus(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.withTagFilters
 */
var software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.tagFilters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on tagFilters is not supported.")
    set(value) { this.withTagFilters(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.withPrefix
 */
var software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.prefix: String
    get() = throw NoSuchFieldException("Get on prefix is not supported.")
    set(value) { this.withPrefix(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.withAbortIncompleteMultipartUpload
 */
var software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.abortIncompleteMultipartUpload: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on abortIncompleteMultipartUpload is not supported.")
    set(value) { this.withAbortIncompleteMultipartUpload(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.withExpirationDate
 */
var software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.expirationDate: java.time.Instant
    get() = throw NoSuchFieldException("Get on expirationDate is not supported.")
    set(value) { this.withExpirationDate(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.withExpirationInDays
 */
var software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.expirationInDays: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on expirationInDays is not supported.")
    set(value) { this.withExpirationInDays(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.withNoncurrentVersionExpirationInDays
 */
var software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.noncurrentVersionExpirationInDays: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on noncurrentVersionExpirationInDays is not supported.")
    set(value) { this.withNoncurrentVersionExpirationInDays(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.withNoncurrentVersionTransition
 */
var software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.noncurrentVersionTransition: software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty
    get() = throw NoSuchFieldException("Get on noncurrentVersionTransition is not supported.")
    set(value) { this.withNoncurrentVersionTransition(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.withNoncurrentVersionTransitions
 */
var software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.noncurrentVersionTransitions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on noncurrentVersionTransitions is not supported.")
    set(value) { this.withNoncurrentVersionTransitions(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.withTransition
 */
var software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.transition: software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty
    get() = throw NoSuchFieldException("Get on transition is not supported.")
    set(value) { this.withTransition(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.withTransitions
 */
var software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder.transitions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on transitions is not supported.")
    set(value) { this.withTransitions(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty.Builder
 */
fun dataExportProperty(init: software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty.Builder.withDestination
 */
var software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty.Builder.destination: software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty
    get() = throw NoSuchFieldException("Get on destination is not supported.")
    set(value) { this.withDestination(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty.Builder.withOutputSchemaVersion
 */
var software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty.Builder.outputSchemaVersion: String
    get() = throw NoSuchFieldException("Get on outputSchemaVersion is not supported.")
    set(value) { this.withOutputSchemaVersion(value) }


/**
 * @see software.amazon.awscdk.services.s3.LifecycleRule.Builder
 */
fun lifecycleRule(init: software.amazon.awscdk.services.s3.LifecycleRule.Builder.() -> Unit): software.amazon.awscdk.services.s3.LifecycleRule {
    val builder = software.amazon.awscdk.services.s3.LifecycleRule.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.LifecycleRule.Builder.withId
 */
var software.amazon.awscdk.services.s3.LifecycleRule.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.services.s3.LifecycleRule.Builder.withEnabled
 */
var software.amazon.awscdk.services.s3.LifecycleRule.Builder.enabled: Boolean
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }

/**
 * @see software.amazon.awscdk.services.s3.LifecycleRule.Builder.withPrefix
 */
var software.amazon.awscdk.services.s3.LifecycleRule.Builder.prefix: String
    get() = throw NoSuchFieldException("Get on prefix is not supported.")
    set(value) { this.withPrefix(value) }

/**
 * @see software.amazon.awscdk.services.s3.LifecycleRule.Builder.withExpirationDate
 */
var software.amazon.awscdk.services.s3.LifecycleRule.Builder.expirationDate: java.time.Instant
    get() = throw NoSuchFieldException("Get on expirationDate is not supported.")
    set(value) { this.withExpirationDate(value) }

/**
 * @see software.amazon.awscdk.services.s3.LifecycleRule.Builder.withExpirationInDays
 */
var software.amazon.awscdk.services.s3.LifecycleRule.Builder.expirationInDays: Number
    get() = throw NoSuchFieldException("Get on expirationInDays is not supported.")
    set(value) { this.withExpirationInDays(value) }

/**
 * @see software.amazon.awscdk.services.s3.LifecycleRule.Builder.withNoncurrentVersionExpirationInDays
 */
var software.amazon.awscdk.services.s3.LifecycleRule.Builder.noncurrentVersionExpirationInDays: Number
    get() = throw NoSuchFieldException("Get on noncurrentVersionExpirationInDays is not supported.")
    set(value) { this.withNoncurrentVersionExpirationInDays(value) }

/**
 * @see software.amazon.awscdk.services.s3.LifecycleRule.Builder.withAbortIncompleteMultipartUploadAfterDays
 */
var software.amazon.awscdk.services.s3.LifecycleRule.Builder.abortIncompleteMultipartUploadAfterDays: Number
    get() = throw NoSuchFieldException("Get on abortIncompleteMultipartUploadAfterDays is not supported.")
    set(value) { this.withAbortIncompleteMultipartUploadAfterDays(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucketProps.Builder
 */
fun cfnBucketProps(init: software.amazon.awscdk.services.s3.CfnBucketProps.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucketProps {
    val builder = software.amazon.awscdk.services.s3.CfnBucketProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucketProps.Builder.withBucketName
 */
var software.amazon.awscdk.services.s3.CfnBucketProps.Builder.bucketName: String
    get() = throw NoSuchFieldException("Get on bucketName is not supported.")
    set(value) { this.withBucketName(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucketProps.Builder.withAccelerateConfiguration
 */
var software.amazon.awscdk.services.s3.CfnBucketProps.Builder.accelerateConfiguration: software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty
    get() = throw NoSuchFieldException("Get on accelerateConfiguration is not supported.")
    set(value) { this.withAccelerateConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucketProps.Builder.withAccessControl
 */
var software.amazon.awscdk.services.s3.CfnBucketProps.Builder.accessControl: String
    get() = throw NoSuchFieldException("Get on accessControl is not supported.")
    set(value) { this.withAccessControl(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucketProps.Builder.withAnalyticsConfigurations
 */
var software.amazon.awscdk.services.s3.CfnBucketProps.Builder.analyticsConfigurations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on analyticsConfigurations is not supported.")
    set(value) { this.withAnalyticsConfigurations(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucketProps.Builder.withBucketEncryption
 */
var software.amazon.awscdk.services.s3.CfnBucketProps.Builder.bucketEncryption: software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty
    get() = throw NoSuchFieldException("Get on bucketEncryption is not supported.")
    set(value) { this.withBucketEncryption(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucketProps.Builder.withCorsConfiguration
 */
var software.amazon.awscdk.services.s3.CfnBucketProps.Builder.corsConfiguration: software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty
    get() = throw NoSuchFieldException("Get on corsConfiguration is not supported.")
    set(value) { this.withCorsConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucketProps.Builder.withInventoryConfigurations
 */
var software.amazon.awscdk.services.s3.CfnBucketProps.Builder.inventoryConfigurations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on inventoryConfigurations is not supported.")
    set(value) { this.withInventoryConfigurations(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucketProps.Builder.withLifecycleConfiguration
 */
var software.amazon.awscdk.services.s3.CfnBucketProps.Builder.lifecycleConfiguration: software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty
    get() = throw NoSuchFieldException("Get on lifecycleConfiguration is not supported.")
    set(value) { this.withLifecycleConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucketProps.Builder.withLoggingConfiguration
 */
var software.amazon.awscdk.services.s3.CfnBucketProps.Builder.loggingConfiguration: software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty
    get() = throw NoSuchFieldException("Get on loggingConfiguration is not supported.")
    set(value) { this.withLoggingConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucketProps.Builder.withMetricsConfigurations
 */
var software.amazon.awscdk.services.s3.CfnBucketProps.Builder.metricsConfigurations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on metricsConfigurations is not supported.")
    set(value) { this.withMetricsConfigurations(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucketProps.Builder.withNotificationConfiguration
 */
var software.amazon.awscdk.services.s3.CfnBucketProps.Builder.notificationConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on notificationConfiguration is not supported.")
    set(value) { this.withNotificationConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucketProps.Builder.withPublicAccessBlockConfiguration
 */
var software.amazon.awscdk.services.s3.CfnBucketProps.Builder.publicAccessBlockConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on publicAccessBlockConfiguration is not supported.")
    set(value) { this.withPublicAccessBlockConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucketProps.Builder.withReplicationConfiguration
 */
var software.amazon.awscdk.services.s3.CfnBucketProps.Builder.replicationConfiguration: software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty
    get() = throw NoSuchFieldException("Get on replicationConfiguration is not supported.")
    set(value) { this.withReplicationConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucketProps.Builder.withVersioningConfiguration
 */
var software.amazon.awscdk.services.s3.CfnBucketProps.Builder.versioningConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on versioningConfiguration is not supported.")
    set(value) { this.withVersioningConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucketProps.Builder.withWebsiteConfiguration
 */
var software.amazon.awscdk.services.s3.CfnBucketProps.Builder.websiteConfiguration: software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty
    get() = throw NoSuchFieldException("Get on websiteConfiguration is not supported.")
    set(value) { this.withWebsiteConfiguration(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty.Builder
 */
fun redirectAllRequestsToProperty(init: software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty.Builder.withProtocol
 */
var software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty.Builder.protocol: String
    get() = throw NoSuchFieldException("Get on protocol is not supported.")
    set(value) { this.withProtocol(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty.Builder.withHostName
 */
var software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty.Builder.hostName: String
    get() = throw NoSuchFieldException("Get on hostName is not supported.")
    set(value) { this.withHostName(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.VersioningConfigurationProperty.Builder
 */
fun versioningConfigurationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.VersioningConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.VersioningConfigurationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.VersioningConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.VersioningConfigurationProperty.Builder.withStatus
 */
var software.amazon.awscdk.services.s3.CfnBucket.VersioningConfigurationProperty.Builder.status: String
    get() = throw NoSuchFieldException("Get on status is not supported.")
    set(value) { this.withStatus(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty.Builder
 */
fun sourceSelectionCriteriaProperty(init: software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty.Builder.withSseKmsEncryptedObjects
 */
var software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty.Builder.sseKmsEncryptedObjects: software.amazon.awscdk.services.s3.CfnBucket.SseKmsEncryptedObjectsProperty
    get() = throw NoSuchFieldException("Get on sseKmsEncryptedObjects is not supported.")
    set(value) { this.withSseKmsEncryptedObjects(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty.Builder
 */
fun s3KeyFilterProperty(init: software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty.Builder.withRules
 */
var software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty.Builder.rules: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on rules is not supported.")
    set(value) { this.withRules(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty.Builder
 */
fun lambdaConfigurationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty.Builder.withEvent
 */
var software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty.Builder.event: String
    get() = throw NoSuchFieldException("Get on event is not supported.")
    set(value) { this.withEvent(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty.Builder.withFilter
 */
var software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty.Builder.filter: software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty
    get() = throw NoSuchFieldException("Get on filter is not supported.")
    set(value) { this.withFilter(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty.Builder.withFunction
 */
var software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty.Builder.function: String
    get() = throw NoSuchFieldException("Get on function is not supported.")
    set(value) { this.withFunction(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty.Builder
 */
fun storageClassAnalysisProperty(init: software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty.Builder.withDataExport
 */
var software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty.Builder.dataExport: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on dataExport is not supported.")
    set(value) { this.withDataExport(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucketPolicyProps.Builder
 */
fun cfnBucketPolicyProps(init: software.amazon.awscdk.services.s3.CfnBucketPolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucketPolicyProps {
    val builder = software.amazon.awscdk.services.s3.CfnBucketPolicyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucketPolicyProps.Builder.withPolicyDocument
 */
var software.amazon.awscdk.services.s3.CfnBucketPolicyProps.Builder.policyDocument: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on policyDocument is not supported.")
    set(value) { this.withPolicyDocument(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucketPolicyProps.Builder.withBucket
 */
var software.amazon.awscdk.services.s3.CfnBucketPolicyProps.Builder.bucket: String
    get() = throw NoSuchFieldException("Get on bucket is not supported.")
    set(value) { this.withBucket(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty.Builder
 */
fun accessControlTranslationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty.Builder.withOwner
 */
var software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty.Builder.owner: String
    get() = throw NoSuchFieldException("Get on owner is not supported.")
    set(value) { this.withOwner(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty.Builder
 */
fun transitionProperty(init: software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty.Builder.withTransitionInDays
 */
var software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty.Builder.transitionInDays: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on transitionInDays is not supported.")
    set(value) { this.withTransitionInDays(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty.Builder.withTransitionDate
 */
var software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty.Builder.transitionDate: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on transitionDate is not supported.")
    set(value) { this.withTransitionDate(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty.Builder.withStorageClass
 */
var software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty.Builder.storageClass: String
    get() = throw NoSuchFieldException("Get on storageClass is not supported.")
    set(value) { this.withStorageClass(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.SseKmsEncryptedObjectsProperty.Builder
 */
fun sseKmsEncryptedObjectsProperty(init: software.amazon.awscdk.services.s3.CfnBucket.SseKmsEncryptedObjectsProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.SseKmsEncryptedObjectsProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.SseKmsEncryptedObjectsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.SseKmsEncryptedObjectsProperty.Builder.withStatus
 */
var software.amazon.awscdk.services.s3.CfnBucket.SseKmsEncryptedObjectsProperty.Builder.status: String
    get() = throw NoSuchFieldException("Get on status is not supported.")
    set(value) { this.withStatus(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty.Builder
 */
fun topicConfigurationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty.Builder.withEvent
 */
var software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty.Builder.event: String
    get() = throw NoSuchFieldException("Get on event is not supported.")
    set(value) { this.withEvent(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty.Builder.withTopic
 */
var software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty.Builder.topic: String
    get() = throw NoSuchFieldException("Get on topic is not supported.")
    set(value) { this.withTopic(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty.Builder.withFilter
 */
var software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty.Builder.filter: software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty
    get() = throw NoSuchFieldException("Get on filter is not supported.")
    set(value) { this.withFilter(value) }


/**
 * @see software.amazon.awscdk.services.s3.NotificationKeyFilter.Builder
 */
fun notificationKeyFilter(init: software.amazon.awscdk.services.s3.NotificationKeyFilter.Builder.() -> Unit): software.amazon.awscdk.services.s3.NotificationKeyFilter {
    val builder = software.amazon.awscdk.services.s3.NotificationKeyFilter.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.NotificationKeyFilter.Builder.withSuffix
 */
var software.amazon.awscdk.services.s3.NotificationKeyFilter.Builder.suffix: String
    get() = throw NoSuchFieldException("Get on suffix is not supported.")
    set(value) { this.withSuffix(value) }

/**
 * @see software.amazon.awscdk.services.s3.NotificationKeyFilter.Builder.withPrefix
 */
var software.amazon.awscdk.services.s3.NotificationKeyFilter.Builder.prefix: String
    get() = throw NoSuchFieldException("Get on prefix is not supported.")
    set(value) { this.withPrefix(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty.Builder
 */
fun websiteConfigurationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty.Builder.withRoutingRules
 */
var software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty.Builder.routingRules: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on routingRules is not supported.")
    set(value) { this.withRoutingRules(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty.Builder.withErrorDocument
 */
var software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty.Builder.errorDocument: String
    get() = throw NoSuchFieldException("Get on errorDocument is not supported.")
    set(value) { this.withErrorDocument(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty.Builder.withIndexDocument
 */
var software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty.Builder.indexDocument: String
    get() = throw NoSuchFieldException("Get on indexDocument is not supported.")
    set(value) { this.withIndexDocument(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty.Builder.withRedirectAllRequestsTo
 */
var software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty.Builder.redirectAllRequestsTo: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on redirectAllRequestsTo is not supported.")
    set(value) { this.withRedirectAllRequestsTo(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty.Builder
 */
fun accelerateConfigurationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty.Builder.withAccelerationStatus
 */
var software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty.Builder.accelerationStatus: String
    get() = throw NoSuchFieldException("Get on accelerationStatus is not supported.")
    set(value) { this.withAccelerationStatus(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.Builder
 */
fun replicationRuleProperty(init: software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.Builder.withId
 */
var software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.Builder.withDestination
 */
var software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.Builder.destination: software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty
    get() = throw NoSuchFieldException("Get on destination is not supported.")
    set(value) { this.withDestination(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.Builder.withStatus
 */
var software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.Builder.status: String
    get() = throw NoSuchFieldException("Get on status is not supported.")
    set(value) { this.withStatus(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.Builder.withPrefix
 */
var software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.Builder.prefix: String
    get() = throw NoSuchFieldException("Get on prefix is not supported.")
    set(value) { this.withPrefix(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.Builder.withSourceSelectionCriteria
 */
var software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.Builder.sourceSelectionCriteria: software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty
    get() = throw NoSuchFieldException("Get on sourceSelectionCriteria is not supported.")
    set(value) { this.withSourceSelectionCriteria(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty.Builder
 */
fun notificationFilterProperty(init: software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty.Builder.withS3Key
 */
var software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty.Builder.s3Key: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on s3Key is not supported.")
    set(value) { this.withS3Key(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty.Builder
 */
fun redirectRuleProperty(init: software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty.Builder.withProtocol
 */
var software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty.Builder.protocol: String
    get() = throw NoSuchFieldException("Get on protocol is not supported.")
    set(value) { this.withProtocol(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty.Builder.withHostName
 */
var software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty.Builder.hostName: String
    get() = throw NoSuchFieldException("Get on hostName is not supported.")
    set(value) { this.withHostName(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty.Builder.withReplaceKeyPrefixWith
 */
var software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty.Builder.replaceKeyPrefixWith: String
    get() = throw NoSuchFieldException("Get on replaceKeyPrefixWith is not supported.")
    set(value) { this.withReplaceKeyPrefixWith(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty.Builder.withReplaceKeyWith
 */
var software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty.Builder.replaceKeyWith: String
    get() = throw NoSuchFieldException("Get on replaceKeyWith is not supported.")
    set(value) { this.withReplaceKeyWith(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty.Builder.withHttpRedirectCode
 */
var software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty.Builder.httpRedirectCode: String
    get() = throw NoSuchFieldException("Get on httpRedirectCode is not supported.")
    set(value) { this.withHttpRedirectCode(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty.Builder
 */
fun lifecycleConfigurationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty.Builder.withRules
 */
var software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty.Builder.rules: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on rules is not supported.")
    set(value) { this.withRules(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty.Builder
 */
fun noncurrentVersionTransitionProperty(init: software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty.Builder.withTransitionInDays
 */
var software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty.Builder.transitionInDays: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on transitionInDays is not supported.")
    set(value) { this.withTransitionInDays(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty.Builder.withStorageClass
 */
var software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty.Builder.storageClass: String
    get() = throw NoSuchFieldException("Get on storageClass is not supported.")
    set(value) { this.withStorageClass(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty.Builder
 */
fun routingRuleProperty(init: software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty.Builder.withRoutingRuleCondition
 */
var software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty.Builder.routingRuleCondition: software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty
    get() = throw NoSuchFieldException("Get on routingRuleCondition is not supported.")
    set(value) { this.withRoutingRuleCondition(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty.Builder.withRedirectRule
 */
var software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty.Builder.redirectRule: software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty
    get() = throw NoSuchFieldException("Get on redirectRule is not supported.")
    set(value) { this.withRedirectRule(value) }


/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty.Builder
 */
fun analyticsConfigurationProperty(init: software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty {
    val builder = software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty.Builder.withId
 */
var software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty.Builder.withTagFilters
 */
var software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty.Builder.tagFilters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on tagFilters is not supported.")
    set(value) { this.withTagFilters(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty.Builder.withPrefix
 */
var software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty.Builder.prefix: String
    get() = throw NoSuchFieldException("Get on prefix is not supported.")
    set(value) { this.withPrefix(value) }

/**
 * @see software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty.Builder.withStorageClassAnalysis
 */
var software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty.Builder.storageClassAnalysis: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on storageClassAnalysis is not supported.")
    set(value) { this.withStorageClassAnalysis(value) }


/**
 * @see software.amazon.awscdk.services.s3.CommonPipelineDeployActionProps.Builder
 */
fun commonPipelineDeployActionProps(init: software.amazon.awscdk.services.s3.CommonPipelineDeployActionProps.Builder.() -> Unit): software.amazon.awscdk.services.s3.CommonPipelineDeployActionProps {
    val builder = software.amazon.awscdk.services.s3.CommonPipelineDeployActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.CommonPipelineDeployActionProps.Builder.withInputArtifact
 */
var software.amazon.awscdk.services.s3.CommonPipelineDeployActionProps.Builder.inputArtifact: software.amazon.awscdk.services.codepipeline.api.Artifact
    get() = throw NoSuchFieldException("Get on inputArtifact is not supported.")
    set(value) { this.withInputArtifact(value) }

/**
 * @see software.amazon.awscdk.services.s3.CommonPipelineDeployActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.s3.CommonPipelineDeployActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.s3.CommonPipelineDeployActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.s3.CommonPipelineDeployActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.s3.CommonPipelineDeployActionProps.Builder.withObjectKey
 */
var software.amazon.awscdk.services.s3.CommonPipelineDeployActionProps.Builder.objectKey: String
    get() = throw NoSuchFieldException("Get on objectKey is not supported.")
    set(value) { this.withObjectKey(value) }

/**
 * @see software.amazon.awscdk.services.s3.CommonPipelineDeployActionProps.Builder.withExtract
 */
var software.amazon.awscdk.services.s3.CommonPipelineDeployActionProps.Builder.extract: Boolean
    get() = throw NoSuchFieldException("Get on extract is not supported.")
    set(value) { this.withExtract(value) }


/**
 * @see software.amazon.awscdk.services.s3.BucketProps.Builder
 */
fun bucketProps(init: software.amazon.awscdk.services.s3.BucketProps.Builder.() -> Unit): software.amazon.awscdk.services.s3.BucketProps {
    val builder = software.amazon.awscdk.services.s3.BucketProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.s3.BucketProps.Builder.withEncryptionKey
 */
var software.amazon.awscdk.services.s3.BucketProps.Builder.encryptionKey: software.amazon.awscdk.services.kms.IEncryptionKey
    get() = throw NoSuchFieldException("Get on encryptionKey is not supported.")
    set(value) { this.withEncryptionKey(value) }

/**
 * @see software.amazon.awscdk.services.s3.BucketProps.Builder.withBucketName
 */
var software.amazon.awscdk.services.s3.BucketProps.Builder.bucketName: String
    get() = throw NoSuchFieldException("Get on bucketName is not supported.")
    set(value) { this.withBucketName(value) }

/**
 * @see software.amazon.awscdk.services.s3.BucketProps.Builder.withVersioned
 */
var software.amazon.awscdk.services.s3.BucketProps.Builder.versioned: Boolean
    get() = throw NoSuchFieldException("Get on versioned is not supported.")
    set(value) { this.withVersioned(value) }

/**
 * @see software.amazon.awscdk.services.s3.BucketProps.Builder.withWebsiteErrorDocument
 */
var software.amazon.awscdk.services.s3.BucketProps.Builder.websiteErrorDocument: String
    get() = throw NoSuchFieldException("Get on websiteErrorDocument is not supported.")
    set(value) { this.withWebsiteErrorDocument(value) }

/**
 * @see software.amazon.awscdk.services.s3.BucketProps.Builder.withBlockPublicAccess
 */
var software.amazon.awscdk.services.s3.BucketProps.Builder.blockPublicAccess: software.amazon.awscdk.services.s3.BlockPublicAccess
    get() = throw NoSuchFieldException("Get on blockPublicAccess is not supported.")
    set(value) { this.withBlockPublicAccess(value) }

/**
 * @see software.amazon.awscdk.services.s3.BucketProps.Builder.withPublicReadAccess
 */
var software.amazon.awscdk.services.s3.BucketProps.Builder.publicReadAccess: Boolean
    get() = throw NoSuchFieldException("Get on publicReadAccess is not supported.")
    set(value) { this.withPublicReadAccess(value) }

/**
 * @see software.amazon.awscdk.services.s3.BucketProps.Builder.withRemovalPolicy
 */
var software.amazon.awscdk.services.s3.BucketProps.Builder.removalPolicy: software.amazon.awscdk.RemovalPolicy
    get() = throw NoSuchFieldException("Get on removalPolicy is not supported.")
    set(value) { this.withRemovalPolicy(value) }

/**
 * @see software.amazon.awscdk.services.s3.BucketProps.Builder.withEncryption
 */
var software.amazon.awscdk.services.s3.BucketProps.Builder.encryption: software.amazon.awscdk.services.s3.BucketEncryption
    get() = throw NoSuchFieldException("Get on encryption is not supported.")
    set(value) { this.withEncryption(value) }

/**
 * @see software.amazon.awscdk.services.s3.BucketProps.Builder.withWebsiteIndexDocument
 */
var software.amazon.awscdk.services.s3.BucketProps.Builder.websiteIndexDocument: String
    get() = throw NoSuchFieldException("Get on websiteIndexDocument is not supported.")
    set(value) { this.withWebsiteIndexDocument(value) }
