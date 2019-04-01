package software.amazon.awscdk.dsl.services.sns
/**
 * @see software.amazon.awscdk.services.sns.CfnTopic
 */
fun software.amazon.awscdk.Construct.cfnTopic(id: String,
                     props: software.amazon.awscdk.services.sns.CfnTopicProps? = null,
                     init: (software.amazon.awscdk.services.sns.CfnTopic.() -> Unit)? = null)
        : software.amazon.awscdk.services.sns.CfnTopic {

    val obj = software.amazon.awscdk.services.sns.CfnTopic(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sns.CfnTopicPolicy
 */
fun software.amazon.awscdk.Construct.cfnTopicPolicy(id: String,
                     props: software.amazon.awscdk.services.sns.CfnTopicPolicyProps? = null,
                     init: (software.amazon.awscdk.services.sns.CfnTopicPolicy.() -> Unit)? = null)
        : software.amazon.awscdk.services.sns.CfnTopicPolicy {

    val obj = software.amazon.awscdk.services.sns.CfnTopicPolicy(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sns.CfnSubscription
 */
fun software.amazon.awscdk.Construct.cfnSubscription(id: String,
                     props: software.amazon.awscdk.services.sns.CfnSubscriptionProps? = null,
                     init: (software.amazon.awscdk.services.sns.CfnSubscription.() -> Unit)? = null)
        : software.amazon.awscdk.services.sns.CfnSubscription {

    val obj = software.amazon.awscdk.services.sns.CfnSubscription(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sns.TopicPolicy
 */
fun software.amazon.awscdk.Construct.topicPolicy(id: String,
                     props: software.amazon.awscdk.services.sns.TopicPolicyProps? = null,
                     init: (software.amazon.awscdk.services.sns.TopicPolicy.() -> Unit)? = null)
        : software.amazon.awscdk.services.sns.TopicPolicy {

    val obj = software.amazon.awscdk.services.sns.TopicPolicy(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sns.Topic
 */
fun software.amazon.awscdk.Construct.topic(id: String,
                     props: software.amazon.awscdk.services.sns.TopicProps? = null,
                     init: (software.amazon.awscdk.services.sns.Topic.() -> Unit)? = null)
        : software.amazon.awscdk.services.sns.Topic {

    val obj = software.amazon.awscdk.services.sns.Topic(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sns.Subscription
 */
fun software.amazon.awscdk.Construct.subscription(id: String,
                     props: software.amazon.awscdk.services.sns.SubscriptionProps? = null,
                     init: (software.amazon.awscdk.services.sns.Subscription.() -> Unit)? = null)
        : software.amazon.awscdk.services.sns.Subscription {

    val obj = software.amazon.awscdk.services.sns.Subscription(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sns.CfnTopic
 */
fun software.amazon.awscdk.Construct.cfnTopic(id: String,
                     init: (software.amazon.awscdk.services.sns.CfnTopic.() -> Unit)? = null)
        : software.amazon.awscdk.services.sns.CfnTopic {

    val obj = software.amazon.awscdk.services.sns.CfnTopic(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sns.Topic
 */
fun software.amazon.awscdk.Construct.topic(id: String,
                     init: (software.amazon.awscdk.services.sns.Topic.() -> Unit)? = null)
        : software.amazon.awscdk.services.sns.Topic {

    val obj = software.amazon.awscdk.services.sns.Topic(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.sns.TopicPolicyProps.Builder
 */
fun topicPolicyProps(init: software.amazon.awscdk.services.sns.TopicPolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.sns.TopicPolicyProps {
    val builder = software.amazon.awscdk.services.sns.TopicPolicyProps.Builder()
    builder.init()
    return builder.build()
}


/**
 * @see software.amazon.awscdk.services.sns.TopicImportProps.Builder
 */
fun topicImportProps(init: software.amazon.awscdk.services.sns.TopicImportProps.Builder.() -> Unit): software.amazon.awscdk.services.sns.TopicImportProps {
    val builder = software.amazon.awscdk.services.sns.TopicImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sns.TopicImportProps.Builder.withTopicArn
 */
var software.amazon.awscdk.services.sns.TopicImportProps.Builder.topicArn: String
    get() = throw NoSuchFieldException("Get on topicArn is not supported.")
    set(value) { this.withTopicArn(value) }

/**
 * @see software.amazon.awscdk.services.sns.TopicImportProps.Builder.withTopicName
 */
var software.amazon.awscdk.services.sns.TopicImportProps.Builder.topicName: String
    get() = throw NoSuchFieldException("Get on topicName is not supported.")
    set(value) { this.withTopicName(value) }


/**
 * @see software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder
 */
fun cfnSubscriptionProps(init: software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder.() -> Unit): software.amazon.awscdk.services.sns.CfnSubscriptionProps {
    val builder = software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder.withTopicArn
 */
var software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder.topicArn: String
    get() = throw NoSuchFieldException("Get on topicArn is not supported.")
    set(value) { this.withTopicArn(value) }

/**
 * @see software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder.withEndpoint
 */
var software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder.endpoint: String
    get() = throw NoSuchFieldException("Get on endpoint is not supported.")
    set(value) { this.withEndpoint(value) }

/**
 * @see software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder.withRegion
 */
var software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder.withProtocol
 */
var software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder.protocol: String
    get() = throw NoSuchFieldException("Get on protocol is not supported.")
    set(value) { this.withProtocol(value) }

/**
 * @see software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder.withDeliveryPolicy
 */
var software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder.deliveryPolicy: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on deliveryPolicy is not supported.")
    set(value) { this.withDeliveryPolicy(value) }

/**
 * @see software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder.withFilterPolicy
 */
var software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder.filterPolicy: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on filterPolicy is not supported.")
    set(value) { this.withFilterPolicy(value) }

/**
 * @see software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder.withRawMessageDelivery
 */
var software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder.rawMessageDelivery: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on rawMessageDelivery is not supported.")
    set(value) { this.withRawMessageDelivery(value) }


/**
 * @see software.amazon.awscdk.services.sns.TopicProps.Builder
 */
fun topicProps(init: software.amazon.awscdk.services.sns.TopicProps.Builder.() -> Unit): software.amazon.awscdk.services.sns.TopicProps {
    val builder = software.amazon.awscdk.services.sns.TopicProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sns.TopicProps.Builder.withTopicName
 */
var software.amazon.awscdk.services.sns.TopicProps.Builder.topicName: String
    get() = throw NoSuchFieldException("Get on topicName is not supported.")
    set(value) { this.withTopicName(value) }

/**
 * @see software.amazon.awscdk.services.sns.TopicProps.Builder.withDisplayName
 */
var software.amazon.awscdk.services.sns.TopicProps.Builder.displayName: String
    get() = throw NoSuchFieldException("Get on displayName is not supported.")
    set(value) { this.withDisplayName(value) }


/**
 * @see software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty.Builder
 */
fun subscriptionProperty(init: software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty.Builder.() -> Unit): software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty {
    val builder = software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty.Builder.withEndpoint
 */
var software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty.Builder.endpoint: String
    get() = throw NoSuchFieldException("Get on endpoint is not supported.")
    set(value) { this.withEndpoint(value) }

/**
 * @see software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty.Builder.withProtocol
 */
var software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty.Builder.protocol: String
    get() = throw NoSuchFieldException("Get on protocol is not supported.")
    set(value) { this.withProtocol(value) }


/**
 * @see software.amazon.awscdk.services.sns.SubscriptionProps.Builder
 */
fun subscriptionProps(init: software.amazon.awscdk.services.sns.SubscriptionProps.Builder.() -> Unit): software.amazon.awscdk.services.sns.SubscriptionProps {
    val builder = software.amazon.awscdk.services.sns.SubscriptionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sns.SubscriptionProps.Builder.withEndpoint
 */
var software.amazon.awscdk.services.sns.SubscriptionProps.Builder.endpoint: Any
    get() = throw NoSuchFieldException("Get on endpoint is not supported.")
    set(value) { this.withEndpoint(value) }

/**
 * @see software.amazon.awscdk.services.sns.SubscriptionProps.Builder.withTopic
 */
var software.amazon.awscdk.services.sns.SubscriptionProps.Builder.topic: software.amazon.awscdk.services.sns.ITopic
    get() = throw NoSuchFieldException("Get on topic is not supported.")
    set(value) { this.withTopic(value) }

/**
 * @see software.amazon.awscdk.services.sns.SubscriptionProps.Builder.withProtocol
 */
var software.amazon.awscdk.services.sns.SubscriptionProps.Builder.protocol: software.amazon.awscdk.services.sns.SubscriptionProtocol
    get() = throw NoSuchFieldException("Get on protocol is not supported.")
    set(value) { this.withProtocol(value) }

/**
 * @see software.amazon.awscdk.services.sns.SubscriptionProps.Builder.withRawMessageDelivery
 */
var software.amazon.awscdk.services.sns.SubscriptionProps.Builder.rawMessageDelivery: Boolean
    get() = throw NoSuchFieldException("Get on rawMessageDelivery is not supported.")
    set(value) { this.withRawMessageDelivery(value) }


/**
 * @see software.amazon.awscdk.services.sns.CfnTopicPolicyProps.Builder
 */
fun cfnTopicPolicyProps(init: software.amazon.awscdk.services.sns.CfnTopicPolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.sns.CfnTopicPolicyProps {
    val builder = software.amazon.awscdk.services.sns.CfnTopicPolicyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sns.CfnTopicPolicyProps.Builder.withPolicyDocument
 */
var software.amazon.awscdk.services.sns.CfnTopicPolicyProps.Builder.policyDocument: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on policyDocument is not supported.")
    set(value) { this.withPolicyDocument(value) }


/**
 * @see software.amazon.awscdk.services.sns.CfnTopicProps.Builder
 */
fun cfnTopicProps(init: software.amazon.awscdk.services.sns.CfnTopicProps.Builder.() -> Unit): software.amazon.awscdk.services.sns.CfnTopicProps {
    val builder = software.amazon.awscdk.services.sns.CfnTopicProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sns.CfnTopicProps.Builder.withKmsMasterKeyId
 */
var software.amazon.awscdk.services.sns.CfnTopicProps.Builder.kmsMasterKeyId: String
    get() = throw NoSuchFieldException("Get on kmsMasterKeyId is not supported.")
    set(value) { this.withKmsMasterKeyId(value) }

/**
 * @see software.amazon.awscdk.services.sns.CfnTopicProps.Builder.withSubscription
 */
var software.amazon.awscdk.services.sns.CfnTopicProps.Builder.subscription: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on subscription is not supported.")
    set(value) { this.withSubscription(value) }

/**
 * @see software.amazon.awscdk.services.sns.CfnTopicProps.Builder.withTopicName
 */
var software.amazon.awscdk.services.sns.CfnTopicProps.Builder.topicName: String
    get() = throw NoSuchFieldException("Get on topicName is not supported.")
    set(value) { this.withTopicName(value) }

/**
 * @see software.amazon.awscdk.services.sns.CfnTopicProps.Builder.withDisplayName
 */
var software.amazon.awscdk.services.sns.CfnTopicProps.Builder.displayName: String
    get() = throw NoSuchFieldException("Get on displayName is not supported.")
    set(value) { this.withDisplayName(value) }


/**
 * @see software.amazon.awscdk.services.sns.EmailSubscriptionOptions.Builder
 */
fun emailSubscriptionOptions(init: software.amazon.awscdk.services.sns.EmailSubscriptionOptions.Builder.() -> Unit): software.amazon.awscdk.services.sns.EmailSubscriptionOptions {
    val builder = software.amazon.awscdk.services.sns.EmailSubscriptionOptions.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sns.EmailSubscriptionOptions.Builder.withJson
 */
var software.amazon.awscdk.services.sns.EmailSubscriptionOptions.Builder.json: Boolean
    get() = throw NoSuchFieldException("Get on json is not supported.")
    set(value) { this.withJson(value) }
