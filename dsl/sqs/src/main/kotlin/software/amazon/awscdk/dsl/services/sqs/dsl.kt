package software.amazon.awscdk.dsl.services.sqs
/**
 * @see software.amazon.awscdk.services.sqs.QueuePolicy
 */
fun software.amazon.awscdk.Construct.queuePolicy(id: String,
                     props: software.amazon.awscdk.services.sqs.QueuePolicyProps? = null,
                     init: (software.amazon.awscdk.services.sqs.QueuePolicy.() -> Unit)? = null)
        : software.amazon.awscdk.services.sqs.QueuePolicy {

    val obj = software.amazon.awscdk.services.sqs.QueuePolicy(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sqs.CfnQueue
 */
fun software.amazon.awscdk.Construct.cfnQueue(id: String,
                     props: software.amazon.awscdk.services.sqs.CfnQueueProps? = null,
                     init: (software.amazon.awscdk.services.sqs.CfnQueue.() -> Unit)? = null)
        : software.amazon.awscdk.services.sqs.CfnQueue {

    val obj = software.amazon.awscdk.services.sqs.CfnQueue(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sqs.CfnQueuePolicy
 */
fun software.amazon.awscdk.Construct.cfnQueuePolicy(id: String,
                     props: software.amazon.awscdk.services.sqs.CfnQueuePolicyProps? = null,
                     init: (software.amazon.awscdk.services.sqs.CfnQueuePolicy.() -> Unit)? = null)
        : software.amazon.awscdk.services.sqs.CfnQueuePolicy {

    val obj = software.amazon.awscdk.services.sqs.CfnQueuePolicy(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sqs.Queue
 */
fun software.amazon.awscdk.Construct.queue(id: String,
                     props: software.amazon.awscdk.services.sqs.QueueProps? = null,
                     init: (software.amazon.awscdk.services.sqs.Queue.() -> Unit)? = null)
        : software.amazon.awscdk.services.sqs.Queue {

    val obj = software.amazon.awscdk.services.sqs.Queue(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sqs.CfnQueue
 */
fun software.amazon.awscdk.Construct.cfnQueue(id: String,
                     init: (software.amazon.awscdk.services.sqs.CfnQueue.() -> Unit)? = null)
        : software.amazon.awscdk.services.sqs.CfnQueue {

    val obj = software.amazon.awscdk.services.sqs.CfnQueue(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sqs.Queue
 */
fun software.amazon.awscdk.Construct.queue(id: String,
                     init: (software.amazon.awscdk.services.sqs.Queue.() -> Unit)? = null)
        : software.amazon.awscdk.services.sqs.Queue {

    val obj = software.amazon.awscdk.services.sqs.Queue(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.sqs.DeadLetterQueue.Builder
 */
fun deadLetterQueue(init: software.amazon.awscdk.services.sqs.DeadLetterQueue.Builder.() -> Unit): software.amazon.awscdk.services.sqs.DeadLetterQueue {
    val builder = software.amazon.awscdk.services.sqs.DeadLetterQueue.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sqs.DeadLetterQueue.Builder.withMaxReceiveCount
 */
var software.amazon.awscdk.services.sqs.DeadLetterQueue.Builder.maxReceiveCount: Number
    get() = throw NoSuchFieldException("Get on maxReceiveCount is not supported.")
    set(value) { this.withMaxReceiveCount(value) }

/**
 * @see software.amazon.awscdk.services.sqs.DeadLetterQueue.Builder.withQueue
 */
var software.amazon.awscdk.services.sqs.DeadLetterQueue.Builder.queue: software.amazon.awscdk.services.sqs.IQueue
    get() = throw NoSuchFieldException("Get on queue is not supported.")
    set(value) { this.withQueue(value) }


/**
 * @see software.amazon.awscdk.services.sqs.QueueProps.Builder
 */
fun queueProps(init: software.amazon.awscdk.services.sqs.QueueProps.Builder.() -> Unit): software.amazon.awscdk.services.sqs.QueueProps {
    val builder = software.amazon.awscdk.services.sqs.QueueProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sqs.QueueProps.Builder.withDeadLetterQueue
 */
var software.amazon.awscdk.services.sqs.QueueProps.Builder.deadLetterQueue: software.amazon.awscdk.services.sqs.DeadLetterQueue
    get() = throw NoSuchFieldException("Get on deadLetterQueue is not supported.")
    set(value) { this.withDeadLetterQueue(value) }

/**
 * @see software.amazon.awscdk.services.sqs.QueueProps.Builder.withQueueName
 */
var software.amazon.awscdk.services.sqs.QueueProps.Builder.queueName: String
    get() = throw NoSuchFieldException("Get on queueName is not supported.")
    set(value) { this.withQueueName(value) }

/**
 * @see software.amazon.awscdk.services.sqs.QueueProps.Builder.withEncryption
 */
var software.amazon.awscdk.services.sqs.QueueProps.Builder.encryption: software.amazon.awscdk.services.sqs.QueueEncryption
    get() = throw NoSuchFieldException("Get on encryption is not supported.")
    set(value) { this.withEncryption(value) }

/**
 * @see software.amazon.awscdk.services.sqs.QueueProps.Builder.withDeliveryDelaySec
 */
var software.amazon.awscdk.services.sqs.QueueProps.Builder.deliveryDelaySec: Number
    get() = throw NoSuchFieldException("Get on deliveryDelaySec is not supported.")
    set(value) { this.withDeliveryDelaySec(value) }

/**
 * @see software.amazon.awscdk.services.sqs.QueueProps.Builder.withEncryptionMasterKey
 */
var software.amazon.awscdk.services.sqs.QueueProps.Builder.encryptionMasterKey: software.amazon.awscdk.services.kms.IEncryptionKey
    get() = throw NoSuchFieldException("Get on encryptionMasterKey is not supported.")
    set(value) { this.withEncryptionMasterKey(value) }

/**
 * @see software.amazon.awscdk.services.sqs.QueueProps.Builder.withReceiveMessageWaitTimeSec
 */
var software.amazon.awscdk.services.sqs.QueueProps.Builder.receiveMessageWaitTimeSec: Number
    get() = throw NoSuchFieldException("Get on receiveMessageWaitTimeSec is not supported.")
    set(value) { this.withReceiveMessageWaitTimeSec(value) }

/**
 * @see software.amazon.awscdk.services.sqs.QueueProps.Builder.withRetentionPeriodSec
 */
var software.amazon.awscdk.services.sqs.QueueProps.Builder.retentionPeriodSec: Number
    get() = throw NoSuchFieldException("Get on retentionPeriodSec is not supported.")
    set(value) { this.withRetentionPeriodSec(value) }

/**
 * @see software.amazon.awscdk.services.sqs.QueueProps.Builder.withFifo
 */
var software.amazon.awscdk.services.sqs.QueueProps.Builder.fifo: Boolean
    get() = throw NoSuchFieldException("Get on fifo is not supported.")
    set(value) { this.withFifo(value) }

/**
 * @see software.amazon.awscdk.services.sqs.QueueProps.Builder.withContentBasedDeduplication
 */
var software.amazon.awscdk.services.sqs.QueueProps.Builder.contentBasedDeduplication: Boolean
    get() = throw NoSuchFieldException("Get on contentBasedDeduplication is not supported.")
    set(value) { this.withContentBasedDeduplication(value) }

/**
 * @see software.amazon.awscdk.services.sqs.QueueProps.Builder.withDataKeyReuseSec
 */
var software.amazon.awscdk.services.sqs.QueueProps.Builder.dataKeyReuseSec: Number
    get() = throw NoSuchFieldException("Get on dataKeyReuseSec is not supported.")
    set(value) { this.withDataKeyReuseSec(value) }

/**
 * @see software.amazon.awscdk.services.sqs.QueueProps.Builder.withMaxMessageSizeBytes
 */
var software.amazon.awscdk.services.sqs.QueueProps.Builder.maxMessageSizeBytes: Number
    get() = throw NoSuchFieldException("Get on maxMessageSizeBytes is not supported.")
    set(value) { this.withMaxMessageSizeBytes(value) }

/**
 * @see software.amazon.awscdk.services.sqs.QueueProps.Builder.withVisibilityTimeoutSec
 */
var software.amazon.awscdk.services.sqs.QueueProps.Builder.visibilityTimeoutSec: Number
    get() = throw NoSuchFieldException("Get on visibilityTimeoutSec is not supported.")
    set(value) { this.withVisibilityTimeoutSec(value) }


/**
 * @see software.amazon.awscdk.services.sqs.CfnQueueProps.Builder
 */
fun cfnQueueProps(init: software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.() -> Unit): software.amazon.awscdk.services.sqs.CfnQueueProps {
    val builder = software.amazon.awscdk.services.sqs.CfnQueueProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.withKmsMasterKeyId
 */
var software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.kmsMasterKeyId: String
    get() = throw NoSuchFieldException("Get on kmsMasterKeyId is not supported.")
    set(value) { this.withKmsMasterKeyId(value) }

/**
 * @see software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.withQueueName
 */
var software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.queueName: String
    get() = throw NoSuchFieldException("Get on queueName is not supported.")
    set(value) { this.withQueueName(value) }

/**
 * @see software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.withContentBasedDeduplication
 */
var software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.contentBasedDeduplication: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on contentBasedDeduplication is not supported.")
    set(value) { this.withContentBasedDeduplication(value) }

/**
 * @see software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.withDelaySeconds
 */
var software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.delaySeconds: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on delaySeconds is not supported.")
    set(value) { this.withDelaySeconds(value) }

/**
 * @see software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.withFifoQueue
 */
var software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.fifoQueue: Boolean
    get() = throw NoSuchFieldException("Get on fifoQueue is not supported.")
    set(value) { this.withFifoQueue(value) }

/**
 * @see software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.withKmsDataKeyReusePeriodSeconds
 */
var software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.kmsDataKeyReusePeriodSeconds: Number
    get() = throw NoSuchFieldException("Get on kmsDataKeyReusePeriodSeconds is not supported.")
    set(value) { this.withKmsDataKeyReusePeriodSeconds(value) }

/**
 * @see software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.withMaximumMessageSize
 */
var software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.maximumMessageSize: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on maximumMessageSize is not supported.")
    set(value) { this.withMaximumMessageSize(value) }

/**
 * @see software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.withMessageRetentionPeriod
 */
var software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.messageRetentionPeriod: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on messageRetentionPeriod is not supported.")
    set(value) { this.withMessageRetentionPeriod(value) }

/**
 * @see software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.withReceiveMessageWaitTimeSeconds
 */
var software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.receiveMessageWaitTimeSeconds: Number
    get() = throw NoSuchFieldException("Get on receiveMessageWaitTimeSeconds is not supported.")
    set(value) { this.withReceiveMessageWaitTimeSeconds(value) }

/**
 * @see software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.withRedrivePolicy
 */
var software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.redrivePolicy: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on redrivePolicy is not supported.")
    set(value) { this.withRedrivePolicy(value) }

/**
 * @see software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.withVisibilityTimeout
 */
var software.amazon.awscdk.services.sqs.CfnQueueProps.Builder.visibilityTimeout: Number
    get() = throw NoSuchFieldException("Get on visibilityTimeout is not supported.")
    set(value) { this.withVisibilityTimeout(value) }


/**
 * @see software.amazon.awscdk.services.sqs.CfnQueuePolicyProps.Builder
 */
fun cfnQueuePolicyProps(init: software.amazon.awscdk.services.sqs.CfnQueuePolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.sqs.CfnQueuePolicyProps {
    val builder = software.amazon.awscdk.services.sqs.CfnQueuePolicyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sqs.CfnQueuePolicyProps.Builder.withPolicyDocument
 */
var software.amazon.awscdk.services.sqs.CfnQueuePolicyProps.Builder.policyDocument: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on policyDocument is not supported.")
    set(value) { this.withPolicyDocument(value) }


/**
 * @see software.amazon.awscdk.services.sqs.QueueImportProps.Builder
 */
fun queueImportProps(init: software.amazon.awscdk.services.sqs.QueueImportProps.Builder.() -> Unit): software.amazon.awscdk.services.sqs.QueueImportProps {
    val builder = software.amazon.awscdk.services.sqs.QueueImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sqs.QueueImportProps.Builder.withQueueUrl
 */
var software.amazon.awscdk.services.sqs.QueueImportProps.Builder.queueUrl: String
    get() = throw NoSuchFieldException("Get on queueUrl is not supported.")
    set(value) { this.withQueueUrl(value) }

/**
 * @see software.amazon.awscdk.services.sqs.QueueImportProps.Builder.withQueueArn
 */
var software.amazon.awscdk.services.sqs.QueueImportProps.Builder.queueArn: String
    get() = throw NoSuchFieldException("Get on queueArn is not supported.")
    set(value) { this.withQueueArn(value) }

/**
 * @see software.amazon.awscdk.services.sqs.QueueImportProps.Builder.withKeyArn
 */
var software.amazon.awscdk.services.sqs.QueueImportProps.Builder.keyArn: String
    get() = throw NoSuchFieldException("Get on keyArn is not supported.")
    set(value) { this.withKeyArn(value) }

/**
 * @see software.amazon.awscdk.services.sqs.QueueImportProps.Builder.withQueueName
 */
var software.amazon.awscdk.services.sqs.QueueImportProps.Builder.queueName: String
    get() = throw NoSuchFieldException("Get on queueName is not supported.")
    set(value) { this.withQueueName(value) }


/**
 * @see software.amazon.awscdk.services.sqs.QueuePolicyProps.Builder
 */
fun queuePolicyProps(init: software.amazon.awscdk.services.sqs.QueuePolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.sqs.QueuePolicyProps {
    val builder = software.amazon.awscdk.services.sqs.QueuePolicyProps.Builder()
    builder.init()
    return builder.build()
}
