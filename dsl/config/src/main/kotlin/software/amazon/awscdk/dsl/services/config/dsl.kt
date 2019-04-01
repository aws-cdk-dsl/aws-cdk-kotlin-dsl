package software.amazon.awscdk.dsl.services.config
/**
 * @see software.amazon.awscdk.services.config.CfnConfigRule
 */
fun software.amazon.awscdk.Construct.cfnConfigRule(id: String,
                     props: software.amazon.awscdk.services.config.CfnConfigRuleProps? = null,
                     init: (software.amazon.awscdk.services.config.CfnConfigRule.() -> Unit)? = null)
        : software.amazon.awscdk.services.config.CfnConfigRule {

    val obj = software.amazon.awscdk.services.config.CfnConfigRule(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.config.CfnConfigurationAggregator
 */
fun software.amazon.awscdk.Construct.cfnConfigurationAggregator(id: String,
                     props: software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps? = null,
                     init: (software.amazon.awscdk.services.config.CfnConfigurationAggregator.() -> Unit)? = null)
        : software.amazon.awscdk.services.config.CfnConfigurationAggregator {

    val obj = software.amazon.awscdk.services.config.CfnConfigurationAggregator(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.config.CfnDeliveryChannel
 */
fun software.amazon.awscdk.Construct.cfnDeliveryChannel(id: String,
                     props: software.amazon.awscdk.services.config.CfnDeliveryChannelProps? = null,
                     init: (software.amazon.awscdk.services.config.CfnDeliveryChannel.() -> Unit)? = null)
        : software.amazon.awscdk.services.config.CfnDeliveryChannel {

    val obj = software.amazon.awscdk.services.config.CfnDeliveryChannel(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.config.CfnConfigurationRecorder
 */
fun software.amazon.awscdk.Construct.cfnConfigurationRecorder(id: String,
                     props: software.amazon.awscdk.services.config.CfnConfigurationRecorderProps? = null,
                     init: (software.amazon.awscdk.services.config.CfnConfigurationRecorder.() -> Unit)? = null)
        : software.amazon.awscdk.services.config.CfnConfigurationRecorder {

    val obj = software.amazon.awscdk.services.config.CfnConfigurationRecorder(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.config.CfnAggregationAuthorization
 */
fun software.amazon.awscdk.Construct.cfnAggregationAuthorization(id: String,
                     props: software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps? = null,
                     init: (software.amazon.awscdk.services.config.CfnAggregationAuthorization.() -> Unit)? = null)
        : software.amazon.awscdk.services.config.CfnAggregationAuthorization {

    val obj = software.amazon.awscdk.services.config.CfnAggregationAuthorization(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder
 */
fun cfnConfigRuleProps(init: software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder.() -> Unit): software.amazon.awscdk.services.config.CfnConfigRuleProps {
    val builder = software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder.withScope
 */
var software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder.scope: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on scope is not supported.")
    set(value) { this.withScope(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder.withSource
 */
var software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder.source: software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty
    get() = throw NoSuchFieldException("Get on source is not supported.")
    set(value) { this.withSource(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder.withDescription
 */
var software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder.withMaximumExecutionFrequency
 */
var software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder.maximumExecutionFrequency: String
    get() = throw NoSuchFieldException("Get on maximumExecutionFrequency is not supported.")
    set(value) { this.withMaximumExecutionFrequency(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder.withConfigRuleName
 */
var software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder.configRuleName: String
    get() = throw NoSuchFieldException("Get on configRuleName is not supported.")
    set(value) { this.withConfigRuleName(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder.withInputParameters
 */
var software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder.inputParameters: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on inputParameters is not supported.")
    set(value) { this.withInputParameters(value) }


/**
 * @see software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty.Builder
 */
fun organizationAggregationSourceProperty(init: software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty.Builder.() -> Unit): software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty {
    val builder = software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty.Builder.withAllAwsRegions
 */
var software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty.Builder.allAwsRegions: Boolean
    get() = throw NoSuchFieldException("Get on allAwsRegions is not supported.")
    set(value) { this.withAllAwsRegions(value) }


/**
 * @see software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty.Builder
 */
fun accountAggregationSourceProperty(init: software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty.Builder.() -> Unit): software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty {
    val builder = software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty.Builder.withAllAwsRegions
 */
var software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty.Builder.allAwsRegions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on allAwsRegions is not supported.")
    set(value) { this.withAllAwsRegions(value) }


/**
 * @see software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps.Builder
 */
fun cfnAggregationAuthorizationProps(init: software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps.Builder.() -> Unit): software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps {
    val builder = software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps.Builder.withAuthorizedAccountId
 */
var software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps.Builder.authorizedAccountId: String
    get() = throw NoSuchFieldException("Get on authorizedAccountId is not supported.")
    set(value) { this.withAuthorizedAccountId(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps.Builder.withAuthorizedAwsRegion
 */
var software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps.Builder.authorizedAwsRegion: String
    get() = throw NoSuchFieldException("Get on authorizedAwsRegion is not supported.")
    set(value) { this.withAuthorizedAwsRegion(value) }


/**
 * @see software.amazon.awscdk.services.config.CfnConfigurationRecorderProps.Builder
 */
fun cfnConfigurationRecorderProps(init: software.amazon.awscdk.services.config.CfnConfigurationRecorderProps.Builder.() -> Unit): software.amazon.awscdk.services.config.CfnConfigurationRecorderProps {
    val builder = software.amazon.awscdk.services.config.CfnConfigurationRecorderProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.config.CfnConfigurationRecorderProps.Builder.withRoleArn
 */
var software.amazon.awscdk.services.config.CfnConfigurationRecorderProps.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnConfigurationRecorderProps.Builder.withRecordingGroup
 */
var software.amazon.awscdk.services.config.CfnConfigurationRecorderProps.Builder.recordingGroup: software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty
    get() = throw NoSuchFieldException("Get on recordingGroup is not supported.")
    set(value) { this.withRecordingGroup(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnConfigurationRecorderProps.Builder.withName
 */
var software.amazon.awscdk.services.config.CfnConfigurationRecorderProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty.Builder
 */
fun recordingGroupProperty(init: software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty.Builder.() -> Unit): software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty {
    val builder = software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty.Builder.withAllSupported
 */
var software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty.Builder.allSupported: Boolean
    get() = throw NoSuchFieldException("Get on allSupported is not supported.")
    set(value) { this.withAllSupported(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty.Builder.withIncludeGlobalResourceTypes
 */
var software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty.Builder.includeGlobalResourceTypes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on includeGlobalResourceTypes is not supported.")
    set(value) { this.withIncludeGlobalResourceTypes(value) }


/**
 * @see software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps.Builder
 */
fun cfnConfigurationAggregatorProps(init: software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps.Builder.() -> Unit): software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps {
    val builder = software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps.Builder.withConfigurationAggregatorName
 */
var software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps.Builder.configurationAggregatorName: String
    get() = throw NoSuchFieldException("Get on configurationAggregatorName is not supported.")
    set(value) { this.withConfigurationAggregatorName(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps.Builder.withAccountAggregationSources
 */
var software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps.Builder.accountAggregationSources: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on accountAggregationSources is not supported.")
    set(value) { this.withAccountAggregationSources(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps.Builder.withOrganizationAggregationSource
 */
var software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps.Builder.organizationAggregationSource: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on organizationAggregationSource is not supported.")
    set(value) { this.withOrganizationAggregationSource(value) }


/**
 * @see software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty.Builder
 */
fun sourceProperty(init: software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty.Builder.() -> Unit): software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty {
    val builder = software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty.Builder.withSourceIdentifier
 */
var software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty.Builder.sourceIdentifier: String
    get() = throw NoSuchFieldException("Get on sourceIdentifier is not supported.")
    set(value) { this.withSourceIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty.Builder.withOwner
 */
var software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty.Builder.owner: String
    get() = throw NoSuchFieldException("Get on owner is not supported.")
    set(value) { this.withOwner(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty.Builder.withSourceDetails
 */
var software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty.Builder.sourceDetails: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on sourceDetails is not supported.")
    set(value) { this.withSourceDetails(value) }


/**
 * @see software.amazon.awscdk.services.config.CfnDeliveryChannelProps.Builder
 */
fun cfnDeliveryChannelProps(init: software.amazon.awscdk.services.config.CfnDeliveryChannelProps.Builder.() -> Unit): software.amazon.awscdk.services.config.CfnDeliveryChannelProps {
    val builder = software.amazon.awscdk.services.config.CfnDeliveryChannelProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.config.CfnDeliveryChannelProps.Builder.withSnsTopicArn
 */
var software.amazon.awscdk.services.config.CfnDeliveryChannelProps.Builder.snsTopicArn: String
    get() = throw NoSuchFieldException("Get on snsTopicArn is not supported.")
    set(value) { this.withSnsTopicArn(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnDeliveryChannelProps.Builder.withS3KeyPrefix
 */
var software.amazon.awscdk.services.config.CfnDeliveryChannelProps.Builder.s3KeyPrefix: String
    get() = throw NoSuchFieldException("Get on s3KeyPrefix is not supported.")
    set(value) { this.withS3KeyPrefix(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnDeliveryChannelProps.Builder.withName
 */
var software.amazon.awscdk.services.config.CfnDeliveryChannelProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnDeliveryChannelProps.Builder.withS3BucketName
 */
var software.amazon.awscdk.services.config.CfnDeliveryChannelProps.Builder.s3BucketName: String
    get() = throw NoSuchFieldException("Get on s3BucketName is not supported.")
    set(value) { this.withS3BucketName(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnDeliveryChannelProps.Builder.withConfigSnapshotDeliveryProperties
 */
var software.amazon.awscdk.services.config.CfnDeliveryChannelProps.Builder.configSnapshotDeliveryProperties: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on configSnapshotDeliveryProperties is not supported.")
    set(value) { this.withConfigSnapshotDeliveryProperties(value) }


/**
 * @see software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty.Builder
 */
fun sourceDetailProperty(init: software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty.Builder.() -> Unit): software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty {
    val builder = software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty.Builder.withMessageType
 */
var software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty.Builder.messageType: String
    get() = throw NoSuchFieldException("Get on messageType is not supported.")
    set(value) { this.withMessageType(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty.Builder.withEventSource
 */
var software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty.Builder.eventSource: String
    get() = throw NoSuchFieldException("Get on eventSource is not supported.")
    set(value) { this.withEventSource(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty.Builder.withMaximumExecutionFrequency
 */
var software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty.Builder.maximumExecutionFrequency: String
    get() = throw NoSuchFieldException("Get on maximumExecutionFrequency is not supported.")
    set(value) { this.withMaximumExecutionFrequency(value) }


/**
 * @see software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty.Builder
 */
fun configSnapshotDeliveryPropertiesProperty(init: software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty.Builder.() -> Unit): software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty {
    val builder = software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty.Builder.withDeliveryFrequency
 */
var software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty.Builder.deliveryFrequency: String
    get() = throw NoSuchFieldException("Get on deliveryFrequency is not supported.")
    set(value) { this.withDeliveryFrequency(value) }


/**
 * @see software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty.Builder
 */
fun scopeProperty(init: software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty.Builder.() -> Unit): software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty {
    val builder = software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty.Builder.withComplianceResourceId
 */
var software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty.Builder.complianceResourceId: String
    get() = throw NoSuchFieldException("Get on complianceResourceId is not supported.")
    set(value) { this.withComplianceResourceId(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty.Builder.withTagKey
 */
var software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty.Builder.tagKey: String
    get() = throw NoSuchFieldException("Get on tagKey is not supported.")
    set(value) { this.withTagKey(value) }

/**
 * @see software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty.Builder.withTagValue
 */
var software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty.Builder.tagValue: String
    get() = throw NoSuchFieldException("Get on tagValue is not supported.")
    set(value) { this.withTagValue(value) }
