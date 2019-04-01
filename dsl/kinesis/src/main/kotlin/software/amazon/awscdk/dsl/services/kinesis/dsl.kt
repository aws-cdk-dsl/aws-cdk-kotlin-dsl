package software.amazon.awscdk.dsl.services.kinesis
/**
 * @see software.amazon.awscdk.services.kinesis.CfnStreamConsumer
 */
fun software.amazon.awscdk.Construct.cfnStreamConsumer(id: String,
                     props: software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps? = null,
                     init: (software.amazon.awscdk.services.kinesis.CfnStreamConsumer.() -> Unit)? = null)
        : software.amazon.awscdk.services.kinesis.CfnStreamConsumer {

    val obj = software.amazon.awscdk.services.kinesis.CfnStreamConsumer(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.kinesis.Stream
 */
fun software.amazon.awscdk.Construct.stream(id: String,
                     props: software.amazon.awscdk.services.kinesis.StreamProps? = null,
                     init: (software.amazon.awscdk.services.kinesis.Stream.() -> Unit)? = null)
        : software.amazon.awscdk.services.kinesis.Stream {

    val obj = software.amazon.awscdk.services.kinesis.Stream(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.kinesis.CfnStream
 */
fun software.amazon.awscdk.Construct.cfnStream(id: String,
                     props: software.amazon.awscdk.services.kinesis.CfnStreamProps? = null,
                     init: (software.amazon.awscdk.services.kinesis.CfnStream.() -> Unit)? = null)
        : software.amazon.awscdk.services.kinesis.CfnStream {

    val obj = software.amazon.awscdk.services.kinesis.CfnStream(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.kinesis.Stream
 */
fun software.amazon.awscdk.Construct.stream(id: String,
                     init: (software.amazon.awscdk.services.kinesis.Stream.() -> Unit)? = null)
        : software.amazon.awscdk.services.kinesis.Stream {

    val obj = software.amazon.awscdk.services.kinesis.Stream(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty.Builder
 */
fun streamEncryptionProperty(init: software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty.Builder.() -> Unit): software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty {
    val builder = software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty.Builder.withEncryptionType
 */
var software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty.Builder.encryptionType: String
    get() = throw NoSuchFieldException("Get on encryptionType is not supported.")
    set(value) { this.withEncryptionType(value) }

/**
 * @see software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty.Builder.withKeyId
 */
var software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty.Builder.keyId: String
    get() = throw NoSuchFieldException("Get on keyId is not supported.")
    set(value) { this.withKeyId(value) }


/**
 * @see software.amazon.awscdk.services.kinesis.StreamProps.Builder
 */
fun streamProps(init: software.amazon.awscdk.services.kinesis.StreamProps.Builder.() -> Unit): software.amazon.awscdk.services.kinesis.StreamProps {
    val builder = software.amazon.awscdk.services.kinesis.StreamProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesis.StreamProps.Builder.withEncryptionKey
 */
var software.amazon.awscdk.services.kinesis.StreamProps.Builder.encryptionKey: software.amazon.awscdk.services.kms.IEncryptionKey
    get() = throw NoSuchFieldException("Get on encryptionKey is not supported.")
    set(value) { this.withEncryptionKey(value) }

/**
 * @see software.amazon.awscdk.services.kinesis.StreamProps.Builder.withRetentionPeriodHours
 */
var software.amazon.awscdk.services.kinesis.StreamProps.Builder.retentionPeriodHours: Number
    get() = throw NoSuchFieldException("Get on retentionPeriodHours is not supported.")
    set(value) { this.withRetentionPeriodHours(value) }

/**
 * @see software.amazon.awscdk.services.kinesis.StreamProps.Builder.withShardCount
 */
var software.amazon.awscdk.services.kinesis.StreamProps.Builder.shardCount: Number
    get() = throw NoSuchFieldException("Get on shardCount is not supported.")
    set(value) { this.withShardCount(value) }

/**
 * @see software.amazon.awscdk.services.kinesis.StreamProps.Builder.withStreamName
 */
var software.amazon.awscdk.services.kinesis.StreamProps.Builder.streamName: String
    get() = throw NoSuchFieldException("Get on streamName is not supported.")
    set(value) { this.withStreamName(value) }

/**
 * @see software.amazon.awscdk.services.kinesis.StreamProps.Builder.withEncryption
 */
var software.amazon.awscdk.services.kinesis.StreamProps.Builder.encryption: software.amazon.awscdk.services.kinesis.StreamEncryption
    get() = throw NoSuchFieldException("Get on encryption is not supported.")
    set(value) { this.withEncryption(value) }


/**
 * @see software.amazon.awscdk.services.kinesis.StreamImportProps.Builder
 */
fun streamImportProps(init: software.amazon.awscdk.services.kinesis.StreamImportProps.Builder.() -> Unit): software.amazon.awscdk.services.kinesis.StreamImportProps {
    val builder = software.amazon.awscdk.services.kinesis.StreamImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesis.StreamImportProps.Builder.withEncryptionKey
 */
var software.amazon.awscdk.services.kinesis.StreamImportProps.Builder.encryptionKey: software.amazon.awscdk.services.kms.EncryptionKeyImportProps
    get() = throw NoSuchFieldException("Get on encryptionKey is not supported.")
    set(value) { this.withEncryptionKey(value) }

/**
 * @see software.amazon.awscdk.services.kinesis.StreamImportProps.Builder.withStreamArn
 */
var software.amazon.awscdk.services.kinesis.StreamImportProps.Builder.streamArn: String
    get() = throw NoSuchFieldException("Get on streamArn is not supported.")
    set(value) { this.withStreamArn(value) }


/**
 * @see software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps.Builder
 */
fun cfnStreamConsumerProps(init: software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps.Builder.() -> Unit): software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps {
    val builder = software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps.Builder.withConsumerName
 */
var software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps.Builder.consumerName: String
    get() = throw NoSuchFieldException("Get on consumerName is not supported.")
    set(value) { this.withConsumerName(value) }

/**
 * @see software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps.Builder.withStreamArn
 */
var software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps.Builder.streamArn: String
    get() = throw NoSuchFieldException("Get on streamArn is not supported.")
    set(value) { this.withStreamArn(value) }


/**
 * @see software.amazon.awscdk.services.kinesis.CfnStreamProps.Builder
 */
fun cfnStreamProps(init: software.amazon.awscdk.services.kinesis.CfnStreamProps.Builder.() -> Unit): software.amazon.awscdk.services.kinesis.CfnStreamProps {
    val builder = software.amazon.awscdk.services.kinesis.CfnStreamProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kinesis.CfnStreamProps.Builder.withRetentionPeriodHours
 */
var software.amazon.awscdk.services.kinesis.CfnStreamProps.Builder.retentionPeriodHours: Number
    get() = throw NoSuchFieldException("Get on retentionPeriodHours is not supported.")
    set(value) { this.withRetentionPeriodHours(value) }

/**
 * @see software.amazon.awscdk.services.kinesis.CfnStreamProps.Builder.withShardCount
 */
var software.amazon.awscdk.services.kinesis.CfnStreamProps.Builder.shardCount: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on shardCount is not supported.")
    set(value) { this.withShardCount(value) }

/**
 * @see software.amazon.awscdk.services.kinesis.CfnStreamProps.Builder.withName
 */
var software.amazon.awscdk.services.kinesis.CfnStreamProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.kinesis.CfnStreamProps.Builder.withStreamEncryption
 */
var software.amazon.awscdk.services.kinesis.CfnStreamProps.Builder.streamEncryption: software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty
    get() = throw NoSuchFieldException("Get on streamEncryption is not supported.")
    set(value) { this.withStreamEncryption(value) }
