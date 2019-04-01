package software.amazon.awscdk.dsl.services.dms
/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup
 */
fun software.amazon.awscdk.Construct.cfnReplicationSubnetGroup(id: String,
                     props: software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps? = null,
                     init: (software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup {

    val obj = software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint
 */
fun software.amazon.awscdk.Construct.cfnEndpoint(id: String,
                     props: software.amazon.awscdk.services.dms.CfnEndpointProps? = null,
                     init: (software.amazon.awscdk.services.dms.CfnEndpoint.() -> Unit)? = null)
        : software.amazon.awscdk.services.dms.CfnEndpoint {

    val obj = software.amazon.awscdk.services.dms.CfnEndpoint(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationInstance
 */
fun software.amazon.awscdk.Construct.cfnReplicationInstance(id: String,
                     props: software.amazon.awscdk.services.dms.CfnReplicationInstanceProps? = null,
                     init: (software.amazon.awscdk.services.dms.CfnReplicationInstance.() -> Unit)? = null)
        : software.amazon.awscdk.services.dms.CfnReplicationInstance {

    val obj = software.amazon.awscdk.services.dms.CfnReplicationInstance(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.dms.CfnCertificate
 */
fun software.amazon.awscdk.Construct.cfnCertificate(id: String,
                     props: software.amazon.awscdk.services.dms.CfnCertificateProps? = null,
                     init: (software.amazon.awscdk.services.dms.CfnCertificate.() -> Unit)? = null)
        : software.amazon.awscdk.services.dms.CfnCertificate {

    val obj = software.amazon.awscdk.services.dms.CfnCertificate(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationTask
 */
fun software.amazon.awscdk.Construct.cfnReplicationTask(id: String,
                     props: software.amazon.awscdk.services.dms.CfnReplicationTaskProps? = null,
                     init: (software.amazon.awscdk.services.dms.CfnReplicationTask.() -> Unit)? = null)
        : software.amazon.awscdk.services.dms.CfnReplicationTask {

    val obj = software.amazon.awscdk.services.dms.CfnReplicationTask(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.dms.CfnEventSubscription
 */
fun software.amazon.awscdk.Construct.cfnEventSubscription(id: String,
                     props: software.amazon.awscdk.services.dms.CfnEventSubscriptionProps? = null,
                     init: (software.amazon.awscdk.services.dms.CfnEventSubscription.() -> Unit)? = null)
        : software.amazon.awscdk.services.dms.CfnEventSubscription {

    val obj = software.amazon.awscdk.services.dms.CfnEventSubscription(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.dms.CfnCertificate
 */
fun software.amazon.awscdk.Construct.cfnCertificate(id: String,
                     init: (software.amazon.awscdk.services.dms.CfnCertificate.() -> Unit)? = null)
        : software.amazon.awscdk.services.dms.CfnCertificate {

    val obj = software.amazon.awscdk.services.dms.CfnCertificate(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.dms.CfnEndpointProps.Builder
 */
fun cfnEndpointProps(init: software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.() -> Unit): software.amazon.awscdk.services.dms.CfnEndpointProps {
    val builder = software.amazon.awscdk.services.dms.CfnEndpointProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.withEndpointType
 */
var software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.endpointType: String
    get() = throw NoSuchFieldException("Get on endpointType is not supported.")
    set(value) { this.withEndpointType(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.withEngineName
 */
var software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.engineName: String
    get() = throw NoSuchFieldException("Get on engineName is not supported.")
    set(value) { this.withEngineName(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.withCertificateArn
 */
var software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.certificateArn: String
    get() = throw NoSuchFieldException("Get on certificateArn is not supported.")
    set(value) { this.withCertificateArn(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.withDatabaseName
 */
var software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.databaseName: String
    get() = throw NoSuchFieldException("Get on databaseName is not supported.")
    set(value) { this.withDatabaseName(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.withDynamoDbSettings
 */
var software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.dynamoDbSettings: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on dynamoDbSettings is not supported.")
    set(value) { this.withDynamoDbSettings(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.withElasticsearchSettings
 */
var software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.elasticsearchSettings: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on elasticsearchSettings is not supported.")
    set(value) { this.withElasticsearchSettings(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.withEndpointIdentifier
 */
var software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.endpointIdentifier: String
    get() = throw NoSuchFieldException("Get on endpointIdentifier is not supported.")
    set(value) { this.withEndpointIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.withExtraConnectionAttributes
 */
var software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.extraConnectionAttributes: String
    get() = throw NoSuchFieldException("Get on extraConnectionAttributes is not supported.")
    set(value) { this.withExtraConnectionAttributes(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.withKinesisSettings
 */
var software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.kinesisSettings: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on kinesisSettings is not supported.")
    set(value) { this.withKinesisSettings(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.withKmsKeyId
 */
var software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.kmsKeyId: String
    get() = throw NoSuchFieldException("Get on kmsKeyId is not supported.")
    set(value) { this.withKmsKeyId(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.withMongoDbSettings
 */
var software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.mongoDbSettings: software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty
    get() = throw NoSuchFieldException("Get on mongoDbSettings is not supported.")
    set(value) { this.withMongoDbSettings(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.withPassword
 */
var software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.password: String
    get() = throw NoSuchFieldException("Get on password is not supported.")
    set(value) { this.withPassword(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.withS3Settings
 */
var software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.s3Settings: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on s3Settings is not supported.")
    set(value) { this.withS3Settings(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.withServerName
 */
var software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.serverName: String
    get() = throw NoSuchFieldException("Get on serverName is not supported.")
    set(value) { this.withServerName(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.withSslMode
 */
var software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.sslMode: String
    get() = throw NoSuchFieldException("Get on sslMode is not supported.")
    set(value) { this.withSslMode(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.withUsername
 */
var software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.username: String
    get() = throw NoSuchFieldException("Get on username is not supported.")
    set(value) { this.withUsername(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.withPort
 */
var software.amazon.awscdk.services.dms.CfnEndpointProps.Builder.port: Number
    get() = throw NoSuchFieldException("Get on port is not supported.")
    set(value) { this.withPort(value) }


/**
 * @see software.amazon.awscdk.services.dms.CfnEventSubscriptionProps.Builder
 */
fun cfnEventSubscriptionProps(init: software.amazon.awscdk.services.dms.CfnEventSubscriptionProps.Builder.() -> Unit): software.amazon.awscdk.services.dms.CfnEventSubscriptionProps {
    val builder = software.amazon.awscdk.services.dms.CfnEventSubscriptionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dms.CfnEventSubscriptionProps.Builder.withSnsTopicArn
 */
var software.amazon.awscdk.services.dms.CfnEventSubscriptionProps.Builder.snsTopicArn: String
    get() = throw NoSuchFieldException("Get on snsTopicArn is not supported.")
    set(value) { this.withSnsTopicArn(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEventSubscriptionProps.Builder.withSourceType
 */
var software.amazon.awscdk.services.dms.CfnEventSubscriptionProps.Builder.sourceType: String
    get() = throw NoSuchFieldException("Get on sourceType is not supported.")
    set(value) { this.withSourceType(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEventSubscriptionProps.Builder.withSubscriptionName
 */
var software.amazon.awscdk.services.dms.CfnEventSubscriptionProps.Builder.subscriptionName: String
    get() = throw NoSuchFieldException("Get on subscriptionName is not supported.")
    set(value) { this.withSubscriptionName(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEventSubscriptionProps.Builder.withEnabled
 */
var software.amazon.awscdk.services.dms.CfnEventSubscriptionProps.Builder.enabled: Boolean
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }


/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty.Builder
 */
fun dynamoDbSettingsProperty(init: software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty.Builder.() -> Unit): software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty {
    val builder = software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty.Builder.withServiceAccessRoleArn
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty.Builder.serviceAccessRoleArn: String
    get() = throw NoSuchFieldException("Get on serviceAccessRoleArn is not supported.")
    set(value) { this.withServiceAccessRoleArn(value) }


/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder
 */
fun mongoDbSettingsProperty(init: software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.() -> Unit): software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty {
    val builder = software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.withDatabaseName
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.databaseName: String
    get() = throw NoSuchFieldException("Get on databaseName is not supported.")
    set(value) { this.withDatabaseName(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.withPassword
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.password: String
    get() = throw NoSuchFieldException("Get on password is not supported.")
    set(value) { this.withPassword(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.withServerName
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.serverName: String
    get() = throw NoSuchFieldException("Get on serverName is not supported.")
    set(value) { this.withServerName(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.withUsername
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.username: String
    get() = throw NoSuchFieldException("Get on username is not supported.")
    set(value) { this.withUsername(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.withPort
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.port: Number
    get() = throw NoSuchFieldException("Get on port is not supported.")
    set(value) { this.withPort(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.withAuthType
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.authType: String
    get() = throw NoSuchFieldException("Get on authType is not supported.")
    set(value) { this.withAuthType(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.withAuthSource
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.authSource: String
    get() = throw NoSuchFieldException("Get on authSource is not supported.")
    set(value) { this.withAuthSource(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.withDocsToInvestigate
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.docsToInvestigate: String
    get() = throw NoSuchFieldException("Get on docsToInvestigate is not supported.")
    set(value) { this.withDocsToInvestigate(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.withAuthMechanism
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.authMechanism: String
    get() = throw NoSuchFieldException("Get on authMechanism is not supported.")
    set(value) { this.withAuthMechanism(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.withExtractDocId
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.extractDocId: String
    get() = throw NoSuchFieldException("Get on extractDocId is not supported.")
    set(value) { this.withExtractDocId(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.withNestingLevel
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder.nestingLevel: String
    get() = throw NoSuchFieldException("Get on nestingLevel is not supported.")
    set(value) { this.withNestingLevel(value) }


/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps.Builder
 */
fun cfnReplicationSubnetGroupProps(init: software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps {
    val builder = software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps.Builder.withReplicationSubnetGroupIdentifier
 */
var software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps.Builder.replicationSubnetGroupIdentifier: String
    get() = throw NoSuchFieldException("Get on replicationSubnetGroupIdentifier is not supported.")
    set(value) { this.withReplicationSubnetGroupIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps.Builder.withReplicationSubnetGroupDescription
 */
var software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps.Builder.replicationSubnetGroupDescription: String
    get() = throw NoSuchFieldException("Get on replicationSubnetGroupDescription is not supported.")
    set(value) { this.withReplicationSubnetGroupDescription(value) }


/**
 * @see software.amazon.awscdk.services.dms.CfnCertificateProps.Builder
 */
fun cfnCertificateProps(init: software.amazon.awscdk.services.dms.CfnCertificateProps.Builder.() -> Unit): software.amazon.awscdk.services.dms.CfnCertificateProps {
    val builder = software.amazon.awscdk.services.dms.CfnCertificateProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dms.CfnCertificateProps.Builder.withCertificateIdentifier
 */
var software.amazon.awscdk.services.dms.CfnCertificateProps.Builder.certificateIdentifier: String
    get() = throw NoSuchFieldException("Get on certificateIdentifier is not supported.")
    set(value) { this.withCertificateIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnCertificateProps.Builder.withCertificatePem
 */
var software.amazon.awscdk.services.dms.CfnCertificateProps.Builder.certificatePem: String
    get() = throw NoSuchFieldException("Get on certificatePem is not supported.")
    set(value) { this.withCertificatePem(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnCertificateProps.Builder.withCertificateWallet
 */
var software.amazon.awscdk.services.dms.CfnCertificateProps.Builder.certificateWallet: String
    get() = throw NoSuchFieldException("Get on certificateWallet is not supported.")
    set(value) { this.withCertificateWallet(value) }


/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty.Builder
 */
fun kinesisSettingsProperty(init: software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty.Builder.() -> Unit): software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty {
    val builder = software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty.Builder.withServiceAccessRoleArn
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty.Builder.serviceAccessRoleArn: String
    get() = throw NoSuchFieldException("Get on serviceAccessRoleArn is not supported.")
    set(value) { this.withServiceAccessRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty.Builder.withMessageFormat
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty.Builder.messageFormat: String
    get() = throw NoSuchFieldException("Get on messageFormat is not supported.")
    set(value) { this.withMessageFormat(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty.Builder.withStreamArn
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty.Builder.streamArn: String
    get() = throw NoSuchFieldException("Get on streamArn is not supported.")
    set(value) { this.withStreamArn(value) }


/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder
 */
fun s3SettingsProperty(init: software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder.() -> Unit): software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty {
    val builder = software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder.withBucketName
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder.bucketName: String
    get() = throw NoSuchFieldException("Get on bucketName is not supported.")
    set(value) { this.withBucketName(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder.withCsvRowDelimiter
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder.csvRowDelimiter: String
    get() = throw NoSuchFieldException("Get on csvRowDelimiter is not supported.")
    set(value) { this.withCsvRowDelimiter(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder.withExternalTableDefinition
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder.externalTableDefinition: String
    get() = throw NoSuchFieldException("Get on externalTableDefinition is not supported.")
    set(value) { this.withExternalTableDefinition(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder.withServiceAccessRoleArn
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder.serviceAccessRoleArn: String
    get() = throw NoSuchFieldException("Get on serviceAccessRoleArn is not supported.")
    set(value) { this.withServiceAccessRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder.withBucketFolder
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder.bucketFolder: String
    get() = throw NoSuchFieldException("Get on bucketFolder is not supported.")
    set(value) { this.withBucketFolder(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder.withCompressionType
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder.compressionType: String
    get() = throw NoSuchFieldException("Get on compressionType is not supported.")
    set(value) { this.withCompressionType(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder.withCsvDelimiter
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder.csvDelimiter: String
    get() = throw NoSuchFieldException("Get on csvDelimiter is not supported.")
    set(value) { this.withCsvDelimiter(value) }


/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty.Builder
 */
fun elasticsearchSettingsProperty(init: software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty.Builder.() -> Unit): software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty {
    val builder = software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty.Builder.withServiceAccessRoleArn
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty.Builder.serviceAccessRoleArn: String
    get() = throw NoSuchFieldException("Get on serviceAccessRoleArn is not supported.")
    set(value) { this.withServiceAccessRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty.Builder.withFullLoadErrorPercentage
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty.Builder.fullLoadErrorPercentage: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on fullLoadErrorPercentage is not supported.")
    set(value) { this.withFullLoadErrorPercentage(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty.Builder.withEndpointUri
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty.Builder.endpointUri: String
    get() = throw NoSuchFieldException("Get on endpointUri is not supported.")
    set(value) { this.withEndpointUri(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty.Builder.withErrorRetryDuration
 */
var software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty.Builder.errorRetryDuration: Number
    get() = throw NoSuchFieldException("Get on errorRetryDuration is not supported.")
    set(value) { this.withErrorRetryDuration(value) }


/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder
 */
fun cfnReplicationTaskProps(init: software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder.() -> Unit): software.amazon.awscdk.services.dms.CfnReplicationTaskProps {
    val builder = software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder.withTargetEndpointArn
 */
var software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder.targetEndpointArn: String
    get() = throw NoSuchFieldException("Get on targetEndpointArn is not supported.")
    set(value) { this.withTargetEndpointArn(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder.withCdcStartTime
 */
var software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder.cdcStartTime: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on cdcStartTime is not supported.")
    set(value) { this.withCdcStartTime(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder.withSourceEndpointArn
 */
var software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder.sourceEndpointArn: String
    get() = throw NoSuchFieldException("Get on sourceEndpointArn is not supported.")
    set(value) { this.withSourceEndpointArn(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder.withTableMappings
 */
var software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder.tableMappings: String
    get() = throw NoSuchFieldException("Get on tableMappings is not supported.")
    set(value) { this.withTableMappings(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder.withReplicationInstanceArn
 */
var software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder.replicationInstanceArn: String
    get() = throw NoSuchFieldException("Get on replicationInstanceArn is not supported.")
    set(value) { this.withReplicationInstanceArn(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder.withMigrationType
 */
var software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder.migrationType: String
    get() = throw NoSuchFieldException("Get on migrationType is not supported.")
    set(value) { this.withMigrationType(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder.withReplicationTaskIdentifier
 */
var software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder.replicationTaskIdentifier: String
    get() = throw NoSuchFieldException("Get on replicationTaskIdentifier is not supported.")
    set(value) { this.withReplicationTaskIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder.withReplicationTaskSettings
 */
var software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder.replicationTaskSettings: String
    get() = throw NoSuchFieldException("Get on replicationTaskSettings is not supported.")
    set(value) { this.withReplicationTaskSettings(value) }


/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder
 */
fun cfnReplicationInstanceProps(init: software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.() -> Unit): software.amazon.awscdk.services.dms.CfnReplicationInstanceProps {
    val builder = software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.withAllowMajorVersionUpgrade
 */
var software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.allowMajorVersionUpgrade: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on allowMajorVersionUpgrade is not supported.")
    set(value) { this.withAllowMajorVersionUpgrade(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.withAutoMinorVersionUpgrade
 */
var software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.autoMinorVersionUpgrade: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on autoMinorVersionUpgrade is not supported.")
    set(value) { this.withAutoMinorVersionUpgrade(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.withAvailabilityZone
 */
var software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.availabilityZone: String
    get() = throw NoSuchFieldException("Get on availabilityZone is not supported.")
    set(value) { this.withAvailabilityZone(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.withPreferredMaintenanceWindow
 */
var software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.preferredMaintenanceWindow: String
    get() = throw NoSuchFieldException("Get on preferredMaintenanceWindow is not supported.")
    set(value) { this.withPreferredMaintenanceWindow(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.withKmsKeyId
 */
var software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.kmsKeyId: String
    get() = throw NoSuchFieldException("Get on kmsKeyId is not supported.")
    set(value) { this.withKmsKeyId(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.withEngineVersion
 */
var software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.engineVersion: String
    get() = throw NoSuchFieldException("Get on engineVersion is not supported.")
    set(value) { this.withEngineVersion(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.withMultiAz
 */
var software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.multiAz: Boolean
    get() = throw NoSuchFieldException("Get on multiAz is not supported.")
    set(value) { this.withMultiAz(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.withPubliclyAccessible
 */
var software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.publiclyAccessible: Boolean
    get() = throw NoSuchFieldException("Get on publiclyAccessible is not supported.")
    set(value) { this.withPubliclyAccessible(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.withAllocatedStorage
 */
var software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.allocatedStorage: Number
    get() = throw NoSuchFieldException("Get on allocatedStorage is not supported.")
    set(value) { this.withAllocatedStorage(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.withReplicationInstanceClass
 */
var software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.replicationInstanceClass: String
    get() = throw NoSuchFieldException("Get on replicationInstanceClass is not supported.")
    set(value) { this.withReplicationInstanceClass(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.withReplicationInstanceIdentifier
 */
var software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.replicationInstanceIdentifier: String
    get() = throw NoSuchFieldException("Get on replicationInstanceIdentifier is not supported.")
    set(value) { this.withReplicationInstanceIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.withReplicationSubnetGroupIdentifier
 */
var software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder.replicationSubnetGroupIdentifier: String
    get() = throw NoSuchFieldException("Get on replicationSubnetGroupIdentifier is not supported.")
    set(value) { this.withReplicationSubnetGroupIdentifier(value) }
