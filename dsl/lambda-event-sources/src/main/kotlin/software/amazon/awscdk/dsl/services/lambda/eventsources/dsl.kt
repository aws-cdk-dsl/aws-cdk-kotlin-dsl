package software.amazon.awscdk.dsl.services.lambda.eventsources

/**
 * @see software.amazon.awscdk.services.lambda.eventsources.KinesisEventSourceProps.Builder
 */
fun kinesisEventSourceProps(init: software.amazon.awscdk.services.lambda.eventsources.KinesisEventSourceProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.eventsources.KinesisEventSourceProps {
    val builder = software.amazon.awscdk.services.lambda.eventsources.KinesisEventSourceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.eventsources.KinesisEventSourceProps.Builder.withStartingPosition
 */
var software.amazon.awscdk.services.lambda.eventsources.KinesisEventSourceProps.Builder.startingPosition: software.amazon.awscdk.services.lambda.StartingPosition
    get() = throw NoSuchFieldException("Get on startingPosition is not supported.")
    set(value) { this.withStartingPosition(value) }

/**
 * @see software.amazon.awscdk.services.lambda.eventsources.KinesisEventSourceProps.Builder.withBatchSize
 */
var software.amazon.awscdk.services.lambda.eventsources.KinesisEventSourceProps.Builder.batchSize: Number
    get() = throw NoSuchFieldException("Get on batchSize is not supported.")
    set(value) { this.withBatchSize(value) }


/**
 * @see software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps.Builder
 */
fun dynamoEventSourceProps(init: software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps {
    val builder = software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps.Builder.withStartingPosition
 */
var software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps.Builder.startingPosition: software.amazon.awscdk.services.lambda.StartingPosition
    get() = throw NoSuchFieldException("Get on startingPosition is not supported.")
    set(value) { this.withStartingPosition(value) }

/**
 * @see software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps.Builder.withBatchSize
 */
var software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps.Builder.batchSize: Number
    get() = throw NoSuchFieldException("Get on batchSize is not supported.")
    set(value) { this.withBatchSize(value) }


/**
 * @see software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps.Builder
 */
fun sqsEventSourceProps(init: software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps {
    val builder = software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps.Builder.withBatchSize
 */
var software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps.Builder.batchSize: Number
    get() = throw NoSuchFieldException("Get on batchSize is not supported.")
    set(value) { this.withBatchSize(value) }


/**
 * @see software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps.Builder
 */
fun s3EventSourceProps(init: software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps.Builder.() -> Unit): software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps {
    val builder = software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps.Builder()
    builder.init()
    return builder.build()
}
