package software.amazon.awscdk.dsl.services.elasticbeanstalk
/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion
 */
fun software.amazon.awscdk.Construct.cfnApplicationVersion(id: String,
                     props: software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps? = null,
                     init: (software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.() -> Unit)? = null)
        : software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion {

    val obj = software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate
 */
fun software.amazon.awscdk.Construct.cfnConfigurationTemplate(id: String,
                     props: software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps? = null,
                     init: (software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.() -> Unit)? = null)
        : software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate {

    val obj = software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment
 */
fun software.amazon.awscdk.Construct.cfnEnvironment(id: String,
                     props: software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps? = null,
                     init: (software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.() -> Unit)? = null)
        : software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment {

    val obj = software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplication
 */
fun software.amazon.awscdk.Construct.cfnApplication(id: String,
                     props: software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps? = null,
                     init: (software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.() -> Unit)? = null)
        : software.amazon.awscdk.services.elasticbeanstalk.CfnApplication {

    val obj = software.amazon.awscdk.services.elasticbeanstalk.CfnApplication(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplication
 */
fun software.amazon.awscdk.Construct.cfnApplication(id: String,
                     init: (software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.() -> Unit)? = null)
        : software.amazon.awscdk.services.elasticbeanstalk.CfnApplication {

    val obj = software.amazon.awscdk.services.elasticbeanstalk.CfnApplication(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty.Builder
 */
fun optionSettingProperty(init: software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty {
    val builder = software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty.Builder.withValue
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty.Builder.withNamespace
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty.Builder.namespace: String
    get() = throw NoSuchFieldException("Get on namespace is not supported.")
    set(value) { this.withNamespace(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty.Builder.withOptionName
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty.Builder.optionName: String
    get() = throw NoSuchFieldException("Get on optionName is not supported.")
    set(value) { this.withOptionName(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty.Builder.withResourceName
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.OptionSettingProperty.Builder.resourceName: String
    get() = throw NoSuchFieldException("Get on resourceName is not supported.")
    set(value) { this.withResourceName(value) }


/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty.Builder
 */
fun configurationOptionSettingProperty(init: software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty {
    val builder = software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty.Builder.withValue
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty.Builder.withNamespace
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty.Builder.namespace: String
    get() = throw NoSuchFieldException("Get on namespace is not supported.")
    set(value) { this.withNamespace(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty.Builder.withOptionName
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty.Builder.optionName: String
    get() = throw NoSuchFieldException("Get on optionName is not supported.")
    set(value) { this.withOptionName(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty.Builder.withResourceName
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.ConfigurationOptionSettingProperty.Builder.resourceName: String
    get() = throw NoSuchFieldException("Get on resourceName is not supported.")
    set(value) { this.withResourceName(value) }


/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty.Builder
 */
fun applicationVersionLifecycleConfigProperty(init: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty {
    val builder = software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty.Builder.withMaxAgeRule
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty.Builder.maxAgeRule: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on maxAgeRule is not supported.")
    set(value) { this.withMaxAgeRule(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty.Builder.withMaxCountRule
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty.Builder.maxCountRule: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty
    get() = throw NoSuchFieldException("Get on maxCountRule is not supported.")
    set(value) { this.withMaxCountRule(value) }


/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty.Builder
 */
fun maxCountRuleProperty(init: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty {
    val builder = software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty.Builder.withMaxCount
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty.Builder.maxCount: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on maxCount is not supported.")
    set(value) { this.withMaxCount(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty.Builder.withDeleteSourceFromS3
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty.Builder.deleteSourceFromS3: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on deleteSourceFromS3 is not supported.")
    set(value) { this.withDeleteSourceFromS3(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty.Builder.enabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }


/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps.Builder
 */
fun cfnApplicationProps(init: software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps.Builder.() -> Unit): software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps {
    val builder = software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps.Builder.withDescription
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps.Builder.withApplicationName
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps.Builder.applicationName: String
    get() = throw NoSuchFieldException("Get on applicationName is not supported.")
    set(value) { this.withApplicationName(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps.Builder.withResourceLifecycleConfig
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps.Builder.resourceLifecycleConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on resourceLifecycleConfig is not supported.")
    set(value) { this.withResourceLifecycleConfig(value) }


/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty.Builder
 */
fun applicationResourceLifecycleConfigProperty(init: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty {
    val builder = software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty.Builder.withServiceRole
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty.Builder.serviceRole: String
    get() = throw NoSuchFieldException("Get on serviceRole is not supported.")
    set(value) { this.withServiceRole(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty.Builder.withVersionLifecycleConfig
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty.Builder.versionLifecycleConfig: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty
    get() = throw NoSuchFieldException("Get on versionLifecycleConfig is not supported.")
    set(value) { this.withVersionLifecycleConfig(value) }


/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder
 */
fun cfnEnvironmentProps(init: software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.() -> Unit): software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps {
    val builder = software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.withOptionSettings
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.optionSettings: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on optionSettings is not supported.")
    set(value) { this.withOptionSettings(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.withDescription
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.withApplicationName
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.applicationName: String
    get() = throw NoSuchFieldException("Get on applicationName is not supported.")
    set(value) { this.withApplicationName(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.withTemplateName
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.templateName: String
    get() = throw NoSuchFieldException("Get on templateName is not supported.")
    set(value) { this.withTemplateName(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.withTier
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.tier: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on tier is not supported.")
    set(value) { this.withTier(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.withCnamePrefix
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.cnamePrefix: String
    get() = throw NoSuchFieldException("Get on cnamePrefix is not supported.")
    set(value) { this.withCnamePrefix(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.withEnvironmentName
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.environmentName: String
    get() = throw NoSuchFieldException("Get on environmentName is not supported.")
    set(value) { this.withEnvironmentName(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.withPlatformArn
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.platformArn: String
    get() = throw NoSuchFieldException("Get on platformArn is not supported.")
    set(value) { this.withPlatformArn(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.withSolutionStackName
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.solutionStackName: String
    get() = throw NoSuchFieldException("Get on solutionStackName is not supported.")
    set(value) { this.withSolutionStackName(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.withVersionLabel
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironmentProps.Builder.versionLabel: String
    get() = throw NoSuchFieldException("Get on versionLabel is not supported.")
    set(value) { this.withVersionLabel(value) }


/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty.Builder
 */
fun maxAgeRuleProperty(init: software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty {
    val builder = software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty.Builder.withDeleteSourceFromS3
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty.Builder.deleteSourceFromS3: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on deleteSourceFromS3 is not supported.")
    set(value) { this.withDeleteSourceFromS3(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty.Builder.enabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty.Builder.withMaxAgeInDays
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty.Builder.maxAgeInDays: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on maxAgeInDays is not supported.")
    set(value) { this.withMaxAgeInDays(value) }


/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder
 */
fun cfnConfigurationTemplateProps(init: software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder.() -> Unit): software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps {
    val builder = software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder.withOptionSettings
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder.optionSettings: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on optionSettings is not supported.")
    set(value) { this.withOptionSettings(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder.withDescription
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder.withApplicationName
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder.applicationName: String
    get() = throw NoSuchFieldException("Get on applicationName is not supported.")
    set(value) { this.withApplicationName(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder.withPlatformArn
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder.platformArn: String
    get() = throw NoSuchFieldException("Get on platformArn is not supported.")
    set(value) { this.withPlatformArn(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder.withSolutionStackName
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder.solutionStackName: String
    get() = throw NoSuchFieldException("Get on solutionStackName is not supported.")
    set(value) { this.withSolutionStackName(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder.withSourceConfiguration
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder.sourceConfiguration: software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty
    get() = throw NoSuchFieldException("Get on sourceConfiguration is not supported.")
    set(value) { this.withSourceConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder.withEnvironmentId
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder.environmentId: String
    get() = throw NoSuchFieldException("Get on environmentId is not supported.")
    set(value) { this.withEnvironmentId(value) }


/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty.Builder
 */
fun sourceConfigurationProperty(init: software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty {
    val builder = software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty.Builder.withApplicationName
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty.Builder.applicationName: String
    get() = throw NoSuchFieldException("Get on applicationName is not supported.")
    set(value) { this.withApplicationName(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty.Builder.withTemplateName
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty.Builder.templateName: String
    get() = throw NoSuchFieldException("Get on templateName is not supported.")
    set(value) { this.withTemplateName(value) }


/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty.Builder
 */
fun tierProperty(init: software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty {
    val builder = software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty.Builder.withType
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty.Builder.withName
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty.Builder.withVersion
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps.Builder
 */
fun cfnApplicationVersionProps(init: software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps.Builder.() -> Unit): software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps {
    val builder = software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps.Builder.withDescription
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps.Builder.withApplicationName
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps.Builder.applicationName: String
    get() = throw NoSuchFieldException("Get on applicationName is not supported.")
    set(value) { this.withApplicationName(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps.Builder.withSourceBundle
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps.Builder.sourceBundle: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on sourceBundle is not supported.")
    set(value) { this.withSourceBundle(value) }


/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty.Builder
 */
fun sourceBundleProperty(init: software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty {
    val builder = software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty.Builder.withS3Bucket
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty.Builder.s3Bucket: String
    get() = throw NoSuchFieldException("Get on s3Bucket is not supported.")
    set(value) { this.withS3Bucket(value) }

/**
 * @see software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty.Builder.withS3Key
 */
var software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty.Builder.s3Key: String
    get() = throw NoSuchFieldException("Get on s3Key is not supported.")
    set(value) { this.withS3Key(value) }
