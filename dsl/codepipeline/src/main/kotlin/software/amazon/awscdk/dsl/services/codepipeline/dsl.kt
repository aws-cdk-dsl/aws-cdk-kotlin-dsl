package software.amazon.awscdk.dsl.services.codepipeline
/**
 * @see software.amazon.awscdk.services.codepipeline.CfnWebhook
 */
fun software.amazon.awscdk.Construct.cfnWebhook(id: String,
                     props: software.amazon.awscdk.services.codepipeline.CfnWebhookProps? = null,
                     init: (software.amazon.awscdk.services.codepipeline.CfnWebhook.() -> Unit)? = null)
        : software.amazon.awscdk.services.codepipeline.CfnWebhook {

    val obj = software.amazon.awscdk.services.codepipeline.CfnWebhook(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionType
 */
fun software.amazon.awscdk.Construct.cfnCustomActionType(id: String,
                     props: software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps? = null,
                     init: (software.amazon.awscdk.services.codepipeline.CfnCustomActionType.() -> Unit)? = null)
        : software.amazon.awscdk.services.codepipeline.CfnCustomActionType {

    val obj = software.amazon.awscdk.services.codepipeline.CfnCustomActionType(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline
 */
fun software.amazon.awscdk.Construct.cfnPipeline(id: String,
                     props: software.amazon.awscdk.services.codepipeline.CfnPipelineProps? = null,
                     init: (software.amazon.awscdk.services.codepipeline.CfnPipeline.() -> Unit)? = null)
        : software.amazon.awscdk.services.codepipeline.CfnPipeline {

    val obj = software.amazon.awscdk.services.codepipeline.CfnPipeline(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.codepipeline.Pipeline
 */
fun software.amazon.awscdk.Construct.pipeline(id: String,
                     props: software.amazon.awscdk.services.codepipeline.PipelineProps? = null,
                     init: (software.amazon.awscdk.services.codepipeline.Pipeline.() -> Unit)? = null)
        : software.amazon.awscdk.services.codepipeline.Pipeline {

    val obj = software.amazon.awscdk.services.codepipeline.Pipeline(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsProvider
 */
fun software.amazon.awscdk.Construct.jenkinsProvider(id: String,
                     props: software.amazon.awscdk.services.codepipeline.JenkinsProviderProps? = null,
                     init: (software.amazon.awscdk.services.codepipeline.JenkinsProvider.() -> Unit)? = null)
        : software.amazon.awscdk.services.codepipeline.JenkinsProvider {

    val obj = software.amazon.awscdk.services.codepipeline.JenkinsProvider(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.codepipeline.Pipeline
 */
fun software.amazon.awscdk.Construct.pipeline(id: String,
                     init: (software.amazon.awscdk.services.codepipeline.Pipeline.() -> Unit)? = null)
        : software.amazon.awscdk.services.codepipeline.Pipeline {

    val obj = software.amazon.awscdk.services.codepipeline.Pipeline(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.codepipeline.PipelineProps.Builder
 */
fun pipelineProps(init: software.amazon.awscdk.services.codepipeline.PipelineProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.PipelineProps {
    val builder = software.amazon.awscdk.services.codepipeline.PipelineProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.PipelineProps.Builder.withPipelineName
 */
var software.amazon.awscdk.services.codepipeline.PipelineProps.Builder.pipelineName: String
    get() = throw NoSuchFieldException("Get on pipelineName is not supported.")
    set(value) { this.withPipelineName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.PipelineProps.Builder.withArtifactBucket
 */
var software.amazon.awscdk.services.codepipeline.PipelineProps.Builder.artifactBucket: software.amazon.awscdk.services.s3.IBucket
    get() = throw NoSuchFieldException("Get on artifactBucket is not supported.")
    set(value) { this.withArtifactBucket(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.PipelineProps.Builder.withRestartExecutionOnUpdate
 */
var software.amazon.awscdk.services.codepipeline.PipelineProps.Builder.restartExecutionOnUpdate: Boolean
    get() = throw NoSuchFieldException("Get on restartExecutionOnUpdate is not supported.")
    set(value) { this.withRestartExecutionOnUpdate(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder
 */
fun actionDeclarationProperty(init: software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty {
    val builder = software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder.withConfiguration
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder.configuration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on configuration is not supported.")
    set(value) { this.withConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder.withActionTypeId
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder.actionTypeId: software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty
    get() = throw NoSuchFieldException("Get on actionTypeId is not supported.")
    set(value) { this.withActionTypeId(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder.withInputArtifacts
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder.inputArtifacts: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on inputArtifacts is not supported.")
    set(value) { this.withInputArtifacts(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder.withOutputArtifacts
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder.outputArtifacts: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on outputArtifacts is not supported.")
    set(value) { this.withOutputArtifacts(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder.withRegion
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder.withName
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionDeclarationProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.BasicJenkinsBuildActionProps.Builder
 */
fun basicJenkinsBuildActionProps(init: software.amazon.awscdk.services.codepipeline.BasicJenkinsBuildActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.BasicJenkinsBuildActionProps {
    val builder = software.amazon.awscdk.services.codepipeline.BasicJenkinsBuildActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.BasicJenkinsBuildActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.codepipeline.BasicJenkinsBuildActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.BasicJenkinsBuildActionProps.Builder.withInputArtifact
 */
var software.amazon.awscdk.services.codepipeline.BasicJenkinsBuildActionProps.Builder.inputArtifact: software.amazon.awscdk.services.codepipeline.api.Artifact
    get() = throw NoSuchFieldException("Get on inputArtifact is not supported.")
    set(value) { this.withInputArtifact(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.BasicJenkinsBuildActionProps.Builder.withProjectName
 */
var software.amazon.awscdk.services.codepipeline.BasicJenkinsBuildActionProps.Builder.projectName: String
    get() = throw NoSuchFieldException("Get on projectName is not supported.")
    set(value) { this.withProjectName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.BasicJenkinsBuildActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codepipeline.BasicJenkinsBuildActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.BasicJenkinsBuildActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codepipeline.BasicJenkinsBuildActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty.Builder
 */
fun outputArtifactProperty(init: software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty {
    val builder = software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty.Builder.withName
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.OutputArtifactProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder
 */
fun configurationPropertiesProperty(init: software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty {
    val builder = software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder.withKey
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder.key: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder.withSecret
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder.secret: Boolean
    get() = throw NoSuchFieldException("Get on secret is not supported.")
    set(value) { this.withSecret(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder.withRequired
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder.required: Boolean
    get() = throw NoSuchFieldException("Get on required is not supported.")
    set(value) { this.withRequired(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder.withQueryable
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder.queryable: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on queryable is not supported.")
    set(value) { this.withQueryable(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder.withType
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder.withName
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder.withDescription
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty.Builder
 */
fun settingsProperty(init: software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty {
    val builder = software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty.Builder.withEntityUrlTemplate
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty.Builder.entityUrlTemplate: String
    get() = throw NoSuchFieldException("Get on entityUrlTemplate is not supported.")
    set(value) { this.withEntityUrlTemplate(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty.Builder.withExecutionUrlTemplate
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty.Builder.executionUrlTemplate: String
    get() = throw NoSuchFieldException("Get on executionUrlTemplate is not supported.")
    set(value) { this.withExecutionUrlTemplate(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty.Builder.withRevisionUrlTemplate
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty.Builder.revisionUrlTemplate: String
    get() = throw NoSuchFieldException("Get on revisionUrlTemplate is not supported.")
    set(value) { this.withRevisionUrlTemplate(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty.Builder.withThirdPartyConfigurationUrl
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty.Builder.thirdPartyConfigurationUrl: String
    get() = throw NoSuchFieldException("Get on thirdPartyConfigurationUrl is not supported.")
    set(value) { this.withThirdPartyConfigurationUrl(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty.Builder
 */
fun artifactStoreProperty(init: software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty {
    val builder = software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty.Builder.withEncryptionKey
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty.Builder.encryptionKey: software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty
    get() = throw NoSuchFieldException("Get on encryptionKey is not supported.")
    set(value) { this.withEncryptionKey(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty.Builder.withLocation
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty.Builder.location: String
    get() = throw NoSuchFieldException("Get on location is not supported.")
    set(value) { this.withLocation(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty.Builder.withType
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.ManualApprovalActionProps.Builder
 */
fun manualApprovalActionProps(init: software.amazon.awscdk.services.codepipeline.ManualApprovalActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.ManualApprovalActionProps {
    val builder = software.amazon.awscdk.services.codepipeline.ManualApprovalActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.ManualApprovalActionProps.Builder.withAdditionalInformation
 */
var software.amazon.awscdk.services.codepipeline.ManualApprovalActionProps.Builder.additionalInformation: String
    get() = throw NoSuchFieldException("Get on additionalInformation is not supported.")
    set(value) { this.withAdditionalInformation(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.ManualApprovalActionProps.Builder.withNotificationTopic
 */
var software.amazon.awscdk.services.codepipeline.ManualApprovalActionProps.Builder.notificationTopic: software.amazon.awscdk.services.sns.ITopic
    get() = throw NoSuchFieldException("Get on notificationTopic is not supported.")
    set(value) { this.withNotificationTopic(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.ManualApprovalActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codepipeline.ManualApprovalActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.ManualApprovalActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codepipeline.ManualApprovalActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsBuildActionProps.Builder
 */
fun jenkinsBuildActionProps(init: software.amazon.awscdk.services.codepipeline.JenkinsBuildActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.JenkinsBuildActionProps {
    val builder = software.amazon.awscdk.services.codepipeline.JenkinsBuildActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsBuildActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.codepipeline.JenkinsBuildActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsBuildActionProps.Builder.withJenkinsProvider
 */
var software.amazon.awscdk.services.codepipeline.JenkinsBuildActionProps.Builder.jenkinsProvider: software.amazon.awscdk.services.codepipeline.IJenkinsProvider
    get() = throw NoSuchFieldException("Get on jenkinsProvider is not supported.")
    set(value) { this.withJenkinsProvider(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsBuildActionProps.Builder.withInputArtifact
 */
var software.amazon.awscdk.services.codepipeline.JenkinsBuildActionProps.Builder.inputArtifact: software.amazon.awscdk.services.codepipeline.api.Artifact
    get() = throw NoSuchFieldException("Get on inputArtifact is not supported.")
    set(value) { this.withInputArtifact(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsBuildActionProps.Builder.withProjectName
 */
var software.amazon.awscdk.services.codepipeline.JenkinsBuildActionProps.Builder.projectName: String
    get() = throw NoSuchFieldException("Get on projectName is not supported.")
    set(value) { this.withProjectName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsBuildActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codepipeline.JenkinsBuildActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsBuildActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codepipeline.JenkinsBuildActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsProviderImportProps.Builder
 */
fun jenkinsProviderImportProps(init: software.amazon.awscdk.services.codepipeline.JenkinsProviderImportProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.JenkinsProviderImportProps {
    val builder = software.amazon.awscdk.services.codepipeline.JenkinsProviderImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsProviderImportProps.Builder.withServerUrl
 */
var software.amazon.awscdk.services.codepipeline.JenkinsProviderImportProps.Builder.serverUrl: String
    get() = throw NoSuchFieldException("Get on serverUrl is not supported.")
    set(value) { this.withServerUrl(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsProviderImportProps.Builder.withVersion
 */
var software.amazon.awscdk.services.codepipeline.JenkinsProviderImportProps.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsProviderImportProps.Builder.withProviderName
 */
var software.amazon.awscdk.services.codepipeline.JenkinsProviderImportProps.Builder.providerName: String
    get() = throw NoSuchFieldException("Get on providerName is not supported.")
    set(value) { this.withProviderName(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.BasicJenkinsTestActionProps.Builder
 */
fun basicJenkinsTestActionProps(init: software.amazon.awscdk.services.codepipeline.BasicJenkinsTestActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.BasicJenkinsTestActionProps {
    val builder = software.amazon.awscdk.services.codepipeline.BasicJenkinsTestActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.BasicJenkinsTestActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.codepipeline.BasicJenkinsTestActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.BasicJenkinsTestActionProps.Builder.withInputArtifact
 */
var software.amazon.awscdk.services.codepipeline.BasicJenkinsTestActionProps.Builder.inputArtifact: software.amazon.awscdk.services.codepipeline.api.Artifact
    get() = throw NoSuchFieldException("Get on inputArtifact is not supported.")
    set(value) { this.withInputArtifact(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.BasicJenkinsTestActionProps.Builder.withProjectName
 */
var software.amazon.awscdk.services.codepipeline.BasicJenkinsTestActionProps.Builder.projectName: String
    get() = throw NoSuchFieldException("Get on projectName is not supported.")
    set(value) { this.withProjectName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.BasicJenkinsTestActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codepipeline.BasicJenkinsTestActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.BasicJenkinsTestActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codepipeline.BasicJenkinsTestActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder
 */
fun gitHubSourceActionProps(init: software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps {
    val builder = software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder.withRepo
 */
var software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder.repo: String
    get() = throw NoSuchFieldException("Get on repo is not supported.")
    set(value) { this.withRepo(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder.withOauthToken
 */
var software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder.oauthToken: software.amazon.awscdk.Secret
    get() = throw NoSuchFieldException("Get on oauthToken is not supported.")
    set(value) { this.withOauthToken(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder.withOwner
 */
var software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder.owner: String
    get() = throw NoSuchFieldException("Get on owner is not supported.")
    set(value) { this.withOwner(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder.withBranch
 */
var software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder.branch: String
    get() = throw NoSuchFieldException("Get on branch is not supported.")
    set(value) { this.withBranch(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder.withPollForSourceChanges
 */
var software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder.pollForSourceChanges: Boolean
    get() = throw NoSuchFieldException("Get on pollForSourceChanges is not supported.")
    set(value) { this.withPollForSourceChanges(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codepipeline.GitHubSourceActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty.Builder
 */
fun actionTypeIdProperty(init: software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty {
    val builder = software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty.Builder.withOwner
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty.Builder.owner: String
    get() = throw NoSuchFieldException("Get on owner is not supported.")
    set(value) { this.withOwner(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty.Builder.withProvider
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty.Builder.provider: String
    get() = throw NoSuchFieldException("Get on provider is not supported.")
    set(value) { this.withProvider(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty.Builder.withCategory
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty.Builder.category: String
    get() = throw NoSuchFieldException("Get on category is not supported.")
    set(value) { this.withCategory(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty.Builder.withVersion
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.ActionTypeIdProperty.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty.Builder
 */
fun artifactDetailsProperty(init: software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty {
    val builder = software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty.Builder.withMaximumCount
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty.Builder.maximumCount: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on maximumCount is not supported.")
    set(value) { this.withMaximumCount(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty.Builder.withMinimumCount
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty.Builder.minimumCount: Number
    get() = throw NoSuchFieldException("Get on minimumCount is not supported.")
    set(value) { this.withMinimumCount(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsTestActionProps.Builder
 */
fun jenkinsTestActionProps(init: software.amazon.awscdk.services.codepipeline.JenkinsTestActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.JenkinsTestActionProps {
    val builder = software.amazon.awscdk.services.codepipeline.JenkinsTestActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsTestActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.codepipeline.JenkinsTestActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsTestActionProps.Builder.withJenkinsProvider
 */
var software.amazon.awscdk.services.codepipeline.JenkinsTestActionProps.Builder.jenkinsProvider: software.amazon.awscdk.services.codepipeline.IJenkinsProvider
    get() = throw NoSuchFieldException("Get on jenkinsProvider is not supported.")
    set(value) { this.withJenkinsProvider(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsTestActionProps.Builder.withInputArtifact
 */
var software.amazon.awscdk.services.codepipeline.JenkinsTestActionProps.Builder.inputArtifact: software.amazon.awscdk.services.codepipeline.api.Artifact
    get() = throw NoSuchFieldException("Get on inputArtifact is not supported.")
    set(value) { this.withInputArtifact(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsTestActionProps.Builder.withProjectName
 */
var software.amazon.awscdk.services.codepipeline.JenkinsTestActionProps.Builder.projectName: String
    get() = throw NoSuchFieldException("Get on projectName is not supported.")
    set(value) { this.withProjectName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsTestActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codepipeline.JenkinsTestActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsTestActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codepipeline.JenkinsTestActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder
 */
fun cfnPipelineProps(init: software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CfnPipelineProps {
    val builder = software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder.withRoleArn
 */
var software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder.withArtifactStore
 */
var software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder.artifactStore: software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty
    get() = throw NoSuchFieldException("Get on artifactStore is not supported.")
    set(value) { this.withArtifactStore(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder.withDisableInboundStageTransitions
 */
var software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder.disableInboundStageTransitions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on disableInboundStageTransitions is not supported.")
    set(value) { this.withDisableInboundStageTransitions(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder.withName
 */
var software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder.withRestartExecutionOnUpdate
 */
var software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder.restartExecutionOnUpdate: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on restartExecutionOnUpdate is not supported.")
    set(value) { this.withRestartExecutionOnUpdate(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder.withStages
 */
var software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder.stages: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on stages is not supported.")
    set(value) { this.withStages(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder.withArtifactStores
 */
var software.amazon.awscdk.services.codepipeline.CfnPipelineProps.Builder.artifactStores: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on artifactStores is not supported.")
    set(value) { this.withArtifactStores(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty.Builder
 */
fun artifactStoreMapProperty(init: software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty {
    val builder = software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty.Builder.withRegion
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty.Builder.withArtifactStore
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreMapProperty.Builder.artifactStore: software.amazon.awscdk.services.codepipeline.CfnPipeline.ArtifactStoreProperty
    get() = throw NoSuchFieldException("Get on artifactStore is not supported.")
    set(value) { this.withArtifactStore(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty.Builder
 */
fun stageDeclarationProperty(init: software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty {
    val builder = software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty.Builder.withActions
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty.Builder.actions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on actions is not supported.")
    set(value) { this.withActions(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty.Builder.withName
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty.Builder.withBlockers
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty.Builder.blockers: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on blockers is not supported.")
    set(value) { this.withBlockers(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CrossRegionScaffoldStackProps.Builder
 */
fun crossRegionScaffoldStackProps(init: software.amazon.awscdk.services.codepipeline.CrossRegionScaffoldStackProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CrossRegionScaffoldStackProps {
    val builder = software.amazon.awscdk.services.codepipeline.CrossRegionScaffoldStackProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CrossRegionScaffoldStackProps.Builder.withRegion
 */
var software.amazon.awscdk.services.codepipeline.CrossRegionScaffoldStackProps.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CrossRegionScaffoldStackProps.Builder.withAccount
 */
var software.amazon.awscdk.services.codepipeline.CrossRegionScaffoldStackProps.Builder.account: String
    get() = throw NoSuchFieldException("Get on account is not supported.")
    set(value) { this.withAccount(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.StagePlacement.Builder
 */
fun stagePlacement(init: software.amazon.awscdk.services.codepipeline.StagePlacement.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.StagePlacement {
    val builder = software.amazon.awscdk.services.codepipeline.StagePlacement.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.StagePlacement.Builder.withAtIndex
 */
var software.amazon.awscdk.services.codepipeline.StagePlacement.Builder.atIndex: Number
    get() = throw NoSuchFieldException("Get on atIndex is not supported.")
    set(value) { this.withAtIndex(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.StagePlacement.Builder.withJustAfter
 */
var software.amazon.awscdk.services.codepipeline.StagePlacement.Builder.justAfter: software.amazon.awscdk.services.codepipeline.api.IStage
    get() = throw NoSuchFieldException("Get on justAfter is not supported.")
    set(value) { this.withJustAfter(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.StagePlacement.Builder.withRightBefore
 */
var software.amazon.awscdk.services.codepipeline.StagePlacement.Builder.rightBefore: software.amazon.awscdk.services.codepipeline.api.IStage
    get() = throw NoSuchFieldException("Get on rightBefore is not supported.")
    set(value) { this.withRightBefore(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty.Builder
 */
fun stageTransitionProperty(init: software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty {
    val builder = software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty.Builder.withStageName
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty.Builder.stageName: String
    get() = throw NoSuchFieldException("Get on stageName is not supported.")
    set(value) { this.withStageName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty.Builder.withReason
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty.Builder.reason: String
    get() = throw NoSuchFieldException("Get on reason is not supported.")
    set(value) { this.withReason(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder
 */
fun cfnWebhookProps(init: software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CfnWebhookProps {
    val builder = software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder.withName
 */
var software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder.withFilters
 */
var software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder.filters: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on filters is not supported.")
    set(value) { this.withFilters(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder.withAuthenticationConfiguration
 */
var software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder.authenticationConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on authenticationConfiguration is not supported.")
    set(value) { this.withAuthenticationConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder.withTargetPipelineVersion
 */
var software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder.targetPipelineVersion: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on targetPipelineVersion is not supported.")
    set(value) { this.withTargetPipelineVersion(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder.withRegisterWithThirdParty
 */
var software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder.registerWithThirdParty: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on registerWithThirdParty is not supported.")
    set(value) { this.withRegisterWithThirdParty(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder.withTargetPipeline
 */
var software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder.targetPipeline: String
    get() = throw NoSuchFieldException("Get on targetPipeline is not supported.")
    set(value) { this.withTargetPipeline(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder.withTargetAction
 */
var software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder.targetAction: String
    get() = throw NoSuchFieldException("Get on targetAction is not supported.")
    set(value) { this.withTargetAction(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder.withAuthentication
 */
var software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder.authentication: String
    get() = throw NoSuchFieldException("Get on authentication is not supported.")
    set(value) { this.withAuthentication(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty.Builder
 */
fun webhookAuthConfigurationProperty(init: software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty {
    val builder = software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty.Builder.withAllowedIpRange
 */
var software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty.Builder.allowedIpRange: String
    get() = throw NoSuchFieldException("Get on allowedIpRange is not supported.")
    set(value) { this.withAllowedIpRange(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty.Builder.withSecretToken
 */
var software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty.Builder.secretToken: String
    get() = throw NoSuchFieldException("Get on secretToken is not supported.")
    set(value) { this.withSecretToken(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder
 */
fun cfnCustomActionTypeProps(init: software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps {
    val builder = software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder.withProvider
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder.provider: String
    get() = throw NoSuchFieldException("Get on provider is not supported.")
    set(value) { this.withProvider(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder.withCategory
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder.category: String
    get() = throw NoSuchFieldException("Get on category is not supported.")
    set(value) { this.withCategory(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder.withVersion
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder.withInputArtifactDetails
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder.inputArtifactDetails: software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty
    get() = throw NoSuchFieldException("Get on inputArtifactDetails is not supported.")
    set(value) { this.withInputArtifactDetails(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder.withOutputArtifactDetails
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder.outputArtifactDetails: software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty
    get() = throw NoSuchFieldException("Get on outputArtifactDetails is not supported.")
    set(value) { this.withOutputArtifactDetails(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder.withConfigurationProperties
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder.configurationProperties: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on configurationProperties is not supported.")
    set(value) { this.withConfigurationProperties(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder.withSettings
 */
var software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps.Builder.settings: software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty
    get() = throw NoSuchFieldException("Get on settings is not supported.")
    set(value) { this.withSettings(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.BasicJenkinsActionProps.Builder
 */
fun basicJenkinsActionProps(init: software.amazon.awscdk.services.codepipeline.BasicJenkinsActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.BasicJenkinsActionProps {
    val builder = software.amazon.awscdk.services.codepipeline.BasicJenkinsActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.BasicJenkinsActionProps.Builder.withInputArtifact
 */
var software.amazon.awscdk.services.codepipeline.BasicJenkinsActionProps.Builder.inputArtifact: software.amazon.awscdk.services.codepipeline.api.Artifact
    get() = throw NoSuchFieldException("Get on inputArtifact is not supported.")
    set(value) { this.withInputArtifact(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.BasicJenkinsActionProps.Builder.withProjectName
 */
var software.amazon.awscdk.services.codepipeline.BasicJenkinsActionProps.Builder.projectName: String
    get() = throw NoSuchFieldException("Get on projectName is not supported.")
    set(value) { this.withProjectName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.BasicJenkinsActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codepipeline.BasicJenkinsActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.BasicJenkinsActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codepipeline.BasicJenkinsActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.StageAddToPipelineProps.Builder
 */
fun stageAddToPipelineProps(init: software.amazon.awscdk.services.codepipeline.StageAddToPipelineProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.StageAddToPipelineProps {
    val builder = software.amazon.awscdk.services.codepipeline.StageAddToPipelineProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.StageAddToPipelineProps.Builder.withPlacement
 */
var software.amazon.awscdk.services.codepipeline.StageAddToPipelineProps.Builder.placement: software.amazon.awscdk.services.codepipeline.StagePlacement
    get() = throw NoSuchFieldException("Get on placement is not supported.")
    set(value) { this.withPlacement(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.StageAddToPipelineProps.Builder.withName
 */
var software.amazon.awscdk.services.codepipeline.StageAddToPipelineProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty.Builder
 */
fun webhookFilterRuleProperty(init: software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty {
    val builder = software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty.Builder.withJsonPath
 */
var software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty.Builder.jsonPath: String
    get() = throw NoSuchFieldException("Get on jsonPath is not supported.")
    set(value) { this.withJsonPath(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty.Builder.withMatchEquals
 */
var software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty.Builder.matchEquals: String
    get() = throw NoSuchFieldException("Get on matchEquals is not supported.")
    set(value) { this.withMatchEquals(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty.Builder
 */
fun inputArtifactProperty(init: software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty {
    val builder = software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty.Builder.withName
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsProviderProps.Builder
 */
fun jenkinsProviderProps(init: software.amazon.awscdk.services.codepipeline.JenkinsProviderProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.JenkinsProviderProps {
    val builder = software.amazon.awscdk.services.codepipeline.JenkinsProviderProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsProviderProps.Builder.withServerUrl
 */
var software.amazon.awscdk.services.codepipeline.JenkinsProviderProps.Builder.serverUrl: String
    get() = throw NoSuchFieldException("Get on serverUrl is not supported.")
    set(value) { this.withServerUrl(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsProviderProps.Builder.withForBuild
 */
var software.amazon.awscdk.services.codepipeline.JenkinsProviderProps.Builder.forBuild: Boolean
    get() = throw NoSuchFieldException("Get on forBuild is not supported.")
    set(value) { this.withForBuild(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsProviderProps.Builder.withForTest
 */
var software.amazon.awscdk.services.codepipeline.JenkinsProviderProps.Builder.forTest: Boolean
    get() = throw NoSuchFieldException("Get on forTest is not supported.")
    set(value) { this.withForTest(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsProviderProps.Builder.withVersion
 */
var software.amazon.awscdk.services.codepipeline.JenkinsProviderProps.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.JenkinsProviderProps.Builder.withProviderName
 */
var software.amazon.awscdk.services.codepipeline.JenkinsProviderProps.Builder.providerName: String
    get() = throw NoSuchFieldException("Get on providerName is not supported.")
    set(value) { this.withProviderName(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty.Builder
 */
fun encryptionKeyProperty(init: software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty {
    val builder = software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty.Builder.withId
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty.Builder.withType
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.EncryptionKeyProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.StageProps.Builder
 */
fun stageProps(init: software.amazon.awscdk.services.codepipeline.StageProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.StageProps {
    val builder = software.amazon.awscdk.services.codepipeline.StageProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.StageProps.Builder.withName
 */
var software.amazon.awscdk.services.codepipeline.StageProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty.Builder
 */
fun blockerDeclarationProperty(init: software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty {
    val builder = software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty.Builder.withType
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty.Builder.withName
 */
var software.amazon.awscdk.services.codepipeline.CfnPipeline.BlockerDeclarationProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }
