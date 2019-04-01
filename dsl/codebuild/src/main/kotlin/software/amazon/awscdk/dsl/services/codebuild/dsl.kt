package software.amazon.awscdk.dsl.services.codebuild
/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject
 */
fun software.amazon.awscdk.Construct.cfnProject(id: String,
                     props: software.amazon.awscdk.services.codebuild.CfnProjectProps? = null,
                     init: (software.amazon.awscdk.services.codebuild.CfnProject.() -> Unit)? = null)
        : software.amazon.awscdk.services.codebuild.CfnProject {

    val obj = software.amazon.awscdk.services.codebuild.CfnProject(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.codebuild.PipelineProject
 */
fun software.amazon.awscdk.Construct.pipelineProject(id: String,
                     props: software.amazon.awscdk.services.codebuild.PipelineProjectProps? = null,
                     init: (software.amazon.awscdk.services.codebuild.PipelineProject.() -> Unit)? = null)
        : software.amazon.awscdk.services.codebuild.PipelineProject {

    val obj = software.amazon.awscdk.services.codebuild.PipelineProject(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.codebuild.Project
 */
fun software.amazon.awscdk.Construct.project(id: String,
                     props: software.amazon.awscdk.services.codebuild.ProjectProps? = null,
                     init: (software.amazon.awscdk.services.codebuild.Project.() -> Unit)? = null)
        : software.amazon.awscdk.services.codebuild.Project {

    val obj = software.amazon.awscdk.services.codebuild.Project(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.codebuild.PipelineProject
 */
fun software.amazon.awscdk.Construct.pipelineProject(id: String,
                     init: (software.amazon.awscdk.services.codebuild.PipelineProject.() -> Unit)? = null)
        : software.amazon.awscdk.services.codebuild.PipelineProject {

    val obj = software.amazon.awscdk.services.codebuild.PipelineProject(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.codebuild.PipelineBuildActionProps.Builder
 */
fun pipelineBuildActionProps(init: software.amazon.awscdk.services.codebuild.PipelineBuildActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.PipelineBuildActionProps {
    val builder = software.amazon.awscdk.services.codebuild.PipelineBuildActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineBuildActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.codebuild.PipelineBuildActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineBuildActionProps.Builder.withInputArtifact
 */
var software.amazon.awscdk.services.codebuild.PipelineBuildActionProps.Builder.inputArtifact: software.amazon.awscdk.services.codepipeline.api.Artifact
    get() = throw NoSuchFieldException("Get on inputArtifact is not supported.")
    set(value) { this.withInputArtifact(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineBuildActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codebuild.PipelineBuildActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineBuildActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codebuild.PipelineBuildActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineBuildActionProps.Builder.withProject
 */
var software.amazon.awscdk.services.codebuild.PipelineBuildActionProps.Builder.project: software.amazon.awscdk.services.codebuild.IProject
    get() = throw NoSuchFieldException("Get on project is not supported.")
    set(value) { this.withProject(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.BuildArtifactsProps.Builder
 */
fun buildArtifactsProps(init: software.amazon.awscdk.services.codebuild.BuildArtifactsProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.BuildArtifactsProps {
    val builder = software.amazon.awscdk.services.codebuild.BuildArtifactsProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.BuildArtifactsProps.Builder.withIdentifier
 */
var software.amazon.awscdk.services.codebuild.BuildArtifactsProps.Builder.identifier: String
    get() = throw NoSuchFieldException("Get on identifier is not supported.")
    set(value) { this.withIdentifier(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty.Builder
 */
fun environmentVariableProperty(init: software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty {
    val builder = software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty.Builder.withValue
 */
var software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty.Builder.withType
 */
var software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty.Builder.withName
 */
var software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps.Builder
 */
fun gitHubEnterpriseSourceProps(init: software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps {
    val builder = software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps.Builder.withOauthToken
 */
var software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps.Builder.oauthToken: software.amazon.awscdk.Secret
    get() = throw NoSuchFieldException("Get on oauthToken is not supported.")
    set(value) { this.withOauthToken(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps.Builder.withHttpsCloneUrl
 */
var software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps.Builder.httpsCloneUrl: String
    get() = throw NoSuchFieldException("Get on httpsCloneUrl is not supported.")
    set(value) { this.withHttpsCloneUrl(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps.Builder.withIgnoreSslErrors
 */
var software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps.Builder.ignoreSslErrors: Boolean
    get() = throw NoSuchFieldException("Get on ignoreSslErrors is not supported.")
    set(value) { this.withIgnoreSslErrors(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps.Builder.withCloneDepth
 */
var software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps.Builder.cloneDepth: Number
    get() = throw NoSuchFieldException("Get on cloneDepth is not supported.")
    set(value) { this.withCloneDepth(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps.Builder.withIdentifier
 */
var software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps.Builder.identifier: String
    get() = throw NoSuchFieldException("Get on identifier is not supported.")
    set(value) { this.withIdentifier(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty.Builder
 */
fun vpcConfigProperty(init: software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty {
    val builder = software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty.Builder.withVpcId
 */
var software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty.Builder.vpcId: String
    get() = throw NoSuchFieldException("Get on vpcId is not supported.")
    set(value) { this.withVpcId(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CommonCodeBuildActionProps.Builder
 */
fun commonCodeBuildActionProps(init: software.amazon.awscdk.services.codebuild.CommonCodeBuildActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CommonCodeBuildActionProps {
    val builder = software.amazon.awscdk.services.codebuild.CommonCodeBuildActionProps.Builder()
    builder.init()
    return builder.build()
}


/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty.Builder
 */
fun webhookFilterProperty(init: software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty {
    val builder = software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty.Builder.withExcludeMatchedPattern
 */
var software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty.Builder.excludeMatchedPattern: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on excludeMatchedPattern is not supported.")
    set(value) { this.withExcludeMatchedPattern(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty.Builder.withType
 */
var software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty.Builder.withPattern
 */
var software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty.Builder.pattern: String
    get() = throw NoSuchFieldException("Get on pattern is not supported.")
    set(value) { this.withPattern(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty.Builder
 */
fun s3LogsConfigProperty(init: software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty {
    val builder = software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty.Builder.withStatus
 */
var software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty.Builder.status: String
    get() = throw NoSuchFieldException("Get on status is not supported.")
    set(value) { this.withStatus(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty.Builder.withLocation
 */
var software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty.Builder.location: String
    get() = throw NoSuchFieldException("Get on location is not supported.")
    set(value) { this.withLocation(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty.Builder.withEncryptionDisabled
 */
var software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty.Builder.encryptionDisabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on encryptionDisabled is not supported.")
    set(value) { this.withEncryptionDisabled(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder
 */
fun commonProjectProps(init: software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CommonProjectProps {
    val builder = software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.withEncryptionKey
 */
var software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.encryptionKey: software.amazon.awscdk.services.kms.IEncryptionKey
    get() = throw NoSuchFieldException("Get on encryptionKey is not supported.")
    set(value) { this.withEncryptionKey(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.withProjectName
 */
var software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.projectName: String
    get() = throw NoSuchFieldException("Get on projectName is not supported.")
    set(value) { this.withProjectName(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.withBuildSpec
 */
var software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.buildSpec: Any
    get() = throw NoSuchFieldException("Get on buildSpec is not supported.")
    set(value) { this.withBuildSpec(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.withCacheBucket
 */
var software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.cacheBucket: software.amazon.awscdk.services.s3.IBucket
    get() = throw NoSuchFieldException("Get on cacheBucket is not supported.")
    set(value) { this.withCacheBucket(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.withCacheDir
 */
var software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.cacheDir: String
    get() = throw NoSuchFieldException("Get on cacheDir is not supported.")
    set(value) { this.withCacheDir(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.withEnvironment
 */
var software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.environment: software.amazon.awscdk.services.codebuild.BuildEnvironment
    get() = throw NoSuchFieldException("Get on environment is not supported.")
    set(value) { this.withEnvironment(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.withBuildScriptAsset
 */
var software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.buildScriptAsset: software.amazon.awscdk.assets.Asset
    get() = throw NoSuchFieldException("Get on buildScriptAsset is not supported.")
    set(value) { this.withBuildScriptAsset(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.withBadge
 */
var software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.badge: Boolean
    get() = throw NoSuchFieldException("Get on badge is not supported.")
    set(value) { this.withBadge(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.withBuildScriptAssetEntrypoint
 */
var software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.buildScriptAssetEntrypoint: String
    get() = throw NoSuchFieldException("Get on buildScriptAssetEntrypoint is not supported.")
    set(value) { this.withBuildScriptAssetEntrypoint(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.withRole
 */
var software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.withTimeout
 */
var software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.timeout: Number
    get() = throw NoSuchFieldException("Get on timeout is not supported.")
    set(value) { this.withTimeout(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.withDescription
 */
var software.amazon.awscdk.services.codebuild.CommonProjectProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty.Builder
 */
fun registryCredentialProperty(init: software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty {
    val builder = software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty.Builder.withCredential
 */
var software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty.Builder.credential: String
    get() = throw NoSuchFieldException("Get on credential is not supported.")
    set(value) { this.withCredential(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty.Builder.withCredentialProvider
 */
var software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty.Builder.credentialProvider: String
    get() = throw NoSuchFieldException("Get on credentialProvider is not supported.")
    set(value) { this.withCredentialProvider(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.BuildSourceProps.Builder
 */
fun buildSourceProps(init: software.amazon.awscdk.services.codebuild.BuildSourceProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.BuildSourceProps {
    val builder = software.amazon.awscdk.services.codebuild.BuildSourceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.BuildSourceProps.Builder.withIdentifier
 */
var software.amazon.awscdk.services.codebuild.BuildSourceProps.Builder.identifier: String
    get() = throw NoSuchFieldException("Get on identifier is not supported.")
    set(value) { this.withIdentifier(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder
 */
fun artifactsProperty(init: software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty {
    val builder = software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.withPath
 */
var software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.path: String
    get() = throw NoSuchFieldException("Get on path is not supported.")
    set(value) { this.withPath(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.withLocation
 */
var software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.location: String
    get() = throw NoSuchFieldException("Get on location is not supported.")
    set(value) { this.withLocation(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.withPackaging
 */
var software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.packaging: String
    get() = throw NoSuchFieldException("Get on packaging is not supported.")
    set(value) { this.withPackaging(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.withEncryptionDisabled
 */
var software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.encryptionDisabled: Boolean
    get() = throw NoSuchFieldException("Get on encryptionDisabled is not supported.")
    set(value) { this.withEncryptionDisabled(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.withOverrideArtifactName
 */
var software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.overrideArtifactName: Boolean
    get() = throw NoSuchFieldException("Get on overrideArtifactName is not supported.")
    set(value) { this.withOverrideArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.withNamespaceType
 */
var software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.namespaceType: String
    get() = throw NoSuchFieldException("Get on namespaceType is not supported.")
    set(value) { this.withNamespaceType(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.withArtifactIdentifier
 */
var software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.artifactIdentifier: String
    get() = throw NoSuchFieldException("Get on artifactIdentifier is not supported.")
    set(value) { this.withArtifactIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.withType
 */
var software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.withName
 */
var software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty.Builder
 */
fun cloudWatchLogsConfigProperty(init: software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty {
    val builder = software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty.Builder.withStatus
 */
var software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty.Builder.status: String
    get() = throw NoSuchFieldException("Get on status is not supported.")
    set(value) { this.withStatus(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty.Builder.withGroupName
 */
var software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty.Builder.groupName: String
    get() = throw NoSuchFieldException("Get on groupName is not supported.")
    set(value) { this.withGroupName(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty.Builder.withStreamName
 */
var software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty.Builder.streamName: String
    get() = throw NoSuchFieldException("Get on streamName is not supported.")
    set(value) { this.withStreamName(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable.Builder
 */
fun buildEnvironmentVariable(init: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable {
    val builder = software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable.Builder.withValue
 */
var software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable.Builder.value: Any
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable.Builder.withType
 */
var software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable.Builder.type: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.S3BucketBuildArtifactsProps.Builder
 */
fun s3BucketBuildArtifactsProps(init: software.amazon.awscdk.services.codebuild.S3BucketBuildArtifactsProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.S3BucketBuildArtifactsProps {
    val builder = software.amazon.awscdk.services.codebuild.S3BucketBuildArtifactsProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.S3BucketBuildArtifactsProps.Builder.withPath
 */
var software.amazon.awscdk.services.codebuild.S3BucketBuildArtifactsProps.Builder.path: String
    get() = throw NoSuchFieldException("Get on path is not supported.")
    set(value) { this.withPath(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.S3BucketBuildArtifactsProps.Builder.withBucket
 */
var software.amazon.awscdk.services.codebuild.S3BucketBuildArtifactsProps.Builder.bucket: software.amazon.awscdk.services.s3.IBucket
    get() = throw NoSuchFieldException("Get on bucket is not supported.")
    set(value) { this.withBucket(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.S3BucketBuildArtifactsProps.Builder.withName
 */
var software.amazon.awscdk.services.codebuild.S3BucketBuildArtifactsProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.S3BucketBuildArtifactsProps.Builder.withIdentifier
 */
var software.amazon.awscdk.services.codebuild.S3BucketBuildArtifactsProps.Builder.identifier: String
    get() = throw NoSuchFieldException("Get on identifier is not supported.")
    set(value) { this.withIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.S3BucketBuildArtifactsProps.Builder.withIncludeBuildId
 */
var software.amazon.awscdk.services.codebuild.S3BucketBuildArtifactsProps.Builder.includeBuildId: Boolean
    get() = throw NoSuchFieldException("Get on includeBuildId is not supported.")
    set(value) { this.withIncludeBuildId(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.S3BucketBuildArtifactsProps.Builder.withPackageZip
 */
var software.amazon.awscdk.services.codebuild.S3BucketBuildArtifactsProps.Builder.packageZip: Boolean
    get() = throw NoSuchFieldException("Get on packageZip is not supported.")
    set(value) { this.withPackageZip(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder
 */
fun environmentProperty(init: software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty {
    val builder = software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder.withCertificate
 */
var software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder.certificate: String
    get() = throw NoSuchFieldException("Get on certificate is not supported.")
    set(value) { this.withCertificate(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder.withComputeType
 */
var software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder.computeType: String
    get() = throw NoSuchFieldException("Get on computeType is not supported.")
    set(value) { this.withComputeType(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder.withEnvironmentVariables
 */
var software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder.environmentVariables: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on environmentVariables is not supported.")
    set(value) { this.withEnvironmentVariables(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder.withImagePullCredentialsType
 */
var software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder.imagePullCredentialsType: String
    get() = throw NoSuchFieldException("Get on imagePullCredentialsType is not supported.")
    set(value) { this.withImagePullCredentialsType(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder.withPrivilegedMode
 */
var software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder.privilegedMode: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on privilegedMode is not supported.")
    set(value) { this.withPrivilegedMode(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder.withRegistryCredential
 */
var software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder.registryCredential: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on registryCredential is not supported.")
    set(value) { this.withRegistryCredential(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder.withType
 */
var software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder.withImage
 */
var software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder.image: String
    get() = throw NoSuchFieldException("Get on image is not supported.")
    set(value) { this.withImage(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty.Builder
 */
fun gitSubmodulesConfigProperty(init: software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty {
    val builder = software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty.Builder.withFetchSubmodules
 */
var software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty.Builder.fetchSubmodules: Boolean
    get() = throw NoSuchFieldException("Get on fetchSubmodules is not supported.")
    set(value) { this.withFetchSubmodules(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.ProjectProps.Builder
 */
fun projectProps(init: software.amazon.awscdk.services.codebuild.ProjectProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.ProjectProps {
    val builder = software.amazon.awscdk.services.codebuild.ProjectProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.ProjectProps.Builder.withEncryptionKey
 */
var software.amazon.awscdk.services.codebuild.ProjectProps.Builder.encryptionKey: software.amazon.awscdk.services.kms.IEncryptionKey
    get() = throw NoSuchFieldException("Get on encryptionKey is not supported.")
    set(value) { this.withEncryptionKey(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.ProjectProps.Builder.withProjectName
 */
var software.amazon.awscdk.services.codebuild.ProjectProps.Builder.projectName: String
    get() = throw NoSuchFieldException("Get on projectName is not supported.")
    set(value) { this.withProjectName(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.ProjectProps.Builder.withArtifacts
 */
var software.amazon.awscdk.services.codebuild.ProjectProps.Builder.artifacts: software.amazon.awscdk.services.codebuild.BuildArtifacts
    get() = throw NoSuchFieldException("Get on artifacts is not supported.")
    set(value) { this.withArtifacts(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.ProjectProps.Builder.withBuildSpec
 */
var software.amazon.awscdk.services.codebuild.ProjectProps.Builder.buildSpec: Any
    get() = throw NoSuchFieldException("Get on buildSpec is not supported.")
    set(value) { this.withBuildSpec(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.ProjectProps.Builder.withCacheBucket
 */
var software.amazon.awscdk.services.codebuild.ProjectProps.Builder.cacheBucket: software.amazon.awscdk.services.s3.IBucket
    get() = throw NoSuchFieldException("Get on cacheBucket is not supported.")
    set(value) { this.withCacheBucket(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.ProjectProps.Builder.withCacheDir
 */
var software.amazon.awscdk.services.codebuild.ProjectProps.Builder.cacheDir: String
    get() = throw NoSuchFieldException("Get on cacheDir is not supported.")
    set(value) { this.withCacheDir(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.ProjectProps.Builder.withEnvironment
 */
var software.amazon.awscdk.services.codebuild.ProjectProps.Builder.environment: software.amazon.awscdk.services.codebuild.BuildEnvironment
    get() = throw NoSuchFieldException("Get on environment is not supported.")
    set(value) { this.withEnvironment(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.ProjectProps.Builder.withBuildScriptAsset
 */
var software.amazon.awscdk.services.codebuild.ProjectProps.Builder.buildScriptAsset: software.amazon.awscdk.assets.Asset
    get() = throw NoSuchFieldException("Get on buildScriptAsset is not supported.")
    set(value) { this.withBuildScriptAsset(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.ProjectProps.Builder.withSource
 */
var software.amazon.awscdk.services.codebuild.ProjectProps.Builder.source: software.amazon.awscdk.services.codebuild.BuildSource
    get() = throw NoSuchFieldException("Get on source is not supported.")
    set(value) { this.withSource(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.ProjectProps.Builder.withBadge
 */
var software.amazon.awscdk.services.codebuild.ProjectProps.Builder.badge: Boolean
    get() = throw NoSuchFieldException("Get on badge is not supported.")
    set(value) { this.withBadge(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.ProjectProps.Builder.withBuildScriptAssetEntrypoint
 */
var software.amazon.awscdk.services.codebuild.ProjectProps.Builder.buildScriptAssetEntrypoint: String
    get() = throw NoSuchFieldException("Get on buildScriptAssetEntrypoint is not supported.")
    set(value) { this.withBuildScriptAssetEntrypoint(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.ProjectProps.Builder.withRole
 */
var software.amazon.awscdk.services.codebuild.ProjectProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.ProjectProps.Builder.withTimeout
 */
var software.amazon.awscdk.services.codebuild.ProjectProps.Builder.timeout: Number
    get() = throw NoSuchFieldException("Get on timeout is not supported.")
    set(value) { this.withTimeout(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.ProjectProps.Builder.withDescription
 */
var software.amazon.awscdk.services.codebuild.ProjectProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty.Builder
 */
fun projectCacheProperty(init: software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty {
    val builder = software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty.Builder.withLocation
 */
var software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty.Builder.location: String
    get() = throw NoSuchFieldException("Get on location is not supported.")
    set(value) { this.withLocation(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty.Builder.withType
 */
var software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder
 */
fun cfnProjectProps(init: software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CfnProjectProps {
    val builder = software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.withTimeoutInMinutes
 */
var software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.timeoutInMinutes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on timeoutInMinutes is not supported.")
    set(value) { this.withTimeoutInMinutes(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.withEncryptionKey
 */
var software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.encryptionKey: String
    get() = throw NoSuchFieldException("Get on encryptionKey is not supported.")
    set(value) { this.withEncryptionKey(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.withServiceRole
 */
var software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.serviceRole: String
    get() = throw NoSuchFieldException("Get on serviceRole is not supported.")
    set(value) { this.withServiceRole(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.withVpcConfig
 */
var software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.vpcConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on vpcConfig is not supported.")
    set(value) { this.withVpcConfig(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.withArtifacts
 */
var software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.artifacts: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on artifacts is not supported.")
    set(value) { this.withArtifacts(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.withSecondarySources
 */
var software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.secondarySources: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on secondarySources is not supported.")
    set(value) { this.withSecondarySources(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.withEnvironment
 */
var software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.environment: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on environment is not supported.")
    set(value) { this.withEnvironment(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.withSecondaryArtifacts
 */
var software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.secondaryArtifacts: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on secondaryArtifacts is not supported.")
    set(value) { this.withSecondaryArtifacts(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.withSource
 */
var software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.source: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on source is not supported.")
    set(value) { this.withSource(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.withName
 */
var software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.withDescription
 */
var software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.withTriggers
 */
var software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.triggers: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on triggers is not supported.")
    set(value) { this.withTriggers(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.withBadgeEnabled
 */
var software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.badgeEnabled: Boolean
    get() = throw NoSuchFieldException("Get on badgeEnabled is not supported.")
    set(value) { this.withBadgeEnabled(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.withCache
 */
var software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.cache: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on cache is not supported.")
    set(value) { this.withCache(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.withLogsConfig
 */
var software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.logsConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on logsConfig is not supported.")
    set(value) { this.withLogsConfig(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.withQueuedTimeoutInMinutes
 */
var software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder.queuedTimeoutInMinutes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on queuedTimeoutInMinutes is not supported.")
    set(value) { this.withQueuedTimeoutInMinutes(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CommonPipelineBuildActionProps.Builder
 */
fun commonPipelineBuildActionProps(init: software.amazon.awscdk.services.codebuild.CommonPipelineBuildActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CommonPipelineBuildActionProps {
    val builder = software.amazon.awscdk.services.codebuild.CommonPipelineBuildActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CommonPipelineBuildActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.codebuild.CommonPipelineBuildActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CommonPipelineBuildActionProps.Builder.withInputArtifact
 */
var software.amazon.awscdk.services.codebuild.CommonPipelineBuildActionProps.Builder.inputArtifact: software.amazon.awscdk.services.codepipeline.api.Artifact
    get() = throw NoSuchFieldException("Get on inputArtifact is not supported.")
    set(value) { this.withInputArtifact(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CommonPipelineBuildActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codebuild.CommonPipelineBuildActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CommonPipelineBuildActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codebuild.CommonPipelineBuildActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.ProjectImportProps.Builder
 */
fun projectImportProps(init: software.amazon.awscdk.services.codebuild.ProjectImportProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.ProjectImportProps {
    val builder = software.amazon.awscdk.services.codebuild.ProjectImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.ProjectImportProps.Builder.withProjectName
 */
var software.amazon.awscdk.services.codebuild.ProjectImportProps.Builder.projectName: String
    get() = throw NoSuchFieldException("Get on projectName is not supported.")
    set(value) { this.withProjectName(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.PipelineTestActionProps.Builder
 */
fun pipelineTestActionProps(init: software.amazon.awscdk.services.codebuild.PipelineTestActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.PipelineTestActionProps {
    val builder = software.amazon.awscdk.services.codebuild.PipelineTestActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineTestActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.codebuild.PipelineTestActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineTestActionProps.Builder.withInputArtifact
 */
var software.amazon.awscdk.services.codebuild.PipelineTestActionProps.Builder.inputArtifact: software.amazon.awscdk.services.codepipeline.api.Artifact
    get() = throw NoSuchFieldException("Get on inputArtifact is not supported.")
    set(value) { this.withInputArtifact(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineTestActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codebuild.PipelineTestActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineTestActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codebuild.PipelineTestActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineTestActionProps.Builder.withProject
 */
var software.amazon.awscdk.services.codebuild.PipelineTestActionProps.Builder.project: software.amazon.awscdk.services.codebuild.IProject
    get() = throw NoSuchFieldException("Get on project is not supported.")
    set(value) { this.withProject(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CodeCommitSourceProps.Builder
 */
fun codeCommitSourceProps(init: software.amazon.awscdk.services.codebuild.CodeCommitSourceProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CodeCommitSourceProps {
    val builder = software.amazon.awscdk.services.codebuild.CodeCommitSourceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CodeCommitSourceProps.Builder.withCloneDepth
 */
var software.amazon.awscdk.services.codebuild.CodeCommitSourceProps.Builder.cloneDepth: Number
    get() = throw NoSuchFieldException("Get on cloneDepth is not supported.")
    set(value) { this.withCloneDepth(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CodeCommitSourceProps.Builder.withRepository
 */
var software.amazon.awscdk.services.codebuild.CodeCommitSourceProps.Builder.repository: software.amazon.awscdk.services.codecommit.IRepository
    get() = throw NoSuchFieldException("Get on repository is not supported.")
    set(value) { this.withRepository(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CodeCommitSourceProps.Builder.withIdentifier
 */
var software.amazon.awscdk.services.codebuild.CodeCommitSourceProps.Builder.identifier: String
    get() = throw NoSuchFieldException("Get on identifier is not supported.")
    set(value) { this.withIdentifier(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder
 */
fun gitHubSourceProps(init: software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.GitHubSourceProps {
    val builder = software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder.withReportBuildStatus
 */
var software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder.reportBuildStatus: Boolean
    get() = throw NoSuchFieldException("Get on reportBuildStatus is not supported.")
    set(value) { this.withReportBuildStatus(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder.withRepo
 */
var software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder.repo: String
    get() = throw NoSuchFieldException("Get on repo is not supported.")
    set(value) { this.withRepo(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder.withOauthToken
 */
var software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder.oauthToken: software.amazon.awscdk.Secret
    get() = throw NoSuchFieldException("Get on oauthToken is not supported.")
    set(value) { this.withOauthToken(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder.withOwner
 */
var software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder.owner: String
    get() = throw NoSuchFieldException("Get on owner is not supported.")
    set(value) { this.withOwner(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder.withCloneDepth
 */
var software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder.cloneDepth: Number
    get() = throw NoSuchFieldException("Get on cloneDepth is not supported.")
    set(value) { this.withCloneDepth(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder.withIdentifier
 */
var software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder.identifier: String
    get() = throw NoSuchFieldException("Get on identifier is not supported.")
    set(value) { this.withIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder.withWebhook
 */
var software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder.webhook: Boolean
    get() = throw NoSuchFieldException("Get on webhook is not supported.")
    set(value) { this.withWebhook(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.BuildEnvironment.Builder
 */
fun buildEnvironment(init: software.amazon.awscdk.services.codebuild.BuildEnvironment.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.BuildEnvironment {
    val builder = software.amazon.awscdk.services.codebuild.BuildEnvironment.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.BuildEnvironment.Builder.withComputeType
 */
var software.amazon.awscdk.services.codebuild.BuildEnvironment.Builder.computeType: software.amazon.awscdk.services.codebuild.ComputeType
    get() = throw NoSuchFieldException("Get on computeType is not supported.")
    set(value) { this.withComputeType(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.BuildEnvironment.Builder.withBuildImage
 */
var software.amazon.awscdk.services.codebuild.BuildEnvironment.Builder.buildImage: software.amazon.awscdk.services.codebuild.IBuildImage
    get() = throw NoSuchFieldException("Get on buildImage is not supported.")
    set(value) { this.withBuildImage(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.BuildEnvironment.Builder.withPrivileged
 */
var software.amazon.awscdk.services.codebuild.BuildEnvironment.Builder.privileged: Boolean
    get() = throw NoSuchFieldException("Get on privileged is not supported.")
    set(value) { this.withPrivileged(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder
 */
fun sourceProperty(init: software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty {
    val builder = software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.withGitCloneDepth
 */
var software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.gitCloneDepth: Number
    get() = throw NoSuchFieldException("Get on gitCloneDepth is not supported.")
    set(value) { this.withGitCloneDepth(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.withGitSubmodulesConfig
 */
var software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.gitSubmodulesConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on gitSubmodulesConfig is not supported.")
    set(value) { this.withGitSubmodulesConfig(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.withInsecureSsl
 */
var software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.insecureSsl: Boolean
    get() = throw NoSuchFieldException("Get on insecureSsl is not supported.")
    set(value) { this.withInsecureSsl(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.withReportBuildStatus
 */
var software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.reportBuildStatus: Boolean
    get() = throw NoSuchFieldException("Get on reportBuildStatus is not supported.")
    set(value) { this.withReportBuildStatus(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.withSourceIdentifier
 */
var software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.sourceIdentifier: String
    get() = throw NoSuchFieldException("Get on sourceIdentifier is not supported.")
    set(value) { this.withSourceIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.withLocation
 */
var software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.location: String
    get() = throw NoSuchFieldException("Get on location is not supported.")
    set(value) { this.withLocation(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.withAuth
 */
var software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.auth: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on auth is not supported.")
    set(value) { this.withAuth(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.withBuildSpec
 */
var software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.buildSpec: String
    get() = throw NoSuchFieldException("Get on buildSpec is not supported.")
    set(value) { this.withBuildSpec(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.withType
 */
var software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.S3BucketSourceProps.Builder
 */
fun s3BucketSourceProps(init: software.amazon.awscdk.services.codebuild.S3BucketSourceProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.S3BucketSourceProps {
    val builder = software.amazon.awscdk.services.codebuild.S3BucketSourceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.S3BucketSourceProps.Builder.withPath
 */
var software.amazon.awscdk.services.codebuild.S3BucketSourceProps.Builder.path: String
    get() = throw NoSuchFieldException("Get on path is not supported.")
    set(value) { this.withPath(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.S3BucketSourceProps.Builder.withBucket
 */
var software.amazon.awscdk.services.codebuild.S3BucketSourceProps.Builder.bucket: software.amazon.awscdk.services.s3.IBucket
    get() = throw NoSuchFieldException("Get on bucket is not supported.")
    set(value) { this.withBucket(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.S3BucketSourceProps.Builder.withIdentifier
 */
var software.amazon.awscdk.services.codebuild.S3BucketSourceProps.Builder.identifier: String
    get() = throw NoSuchFieldException("Get on identifier is not supported.")
    set(value) { this.withIdentifier(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.BitBucketSourceProps.Builder
 */
fun bitBucketSourceProps(init: software.amazon.awscdk.services.codebuild.BitBucketSourceProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.BitBucketSourceProps {
    val builder = software.amazon.awscdk.services.codebuild.BitBucketSourceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.BitBucketSourceProps.Builder.withRepo
 */
var software.amazon.awscdk.services.codebuild.BitBucketSourceProps.Builder.repo: String
    get() = throw NoSuchFieldException("Get on repo is not supported.")
    set(value) { this.withRepo(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.BitBucketSourceProps.Builder.withOwner
 */
var software.amazon.awscdk.services.codebuild.BitBucketSourceProps.Builder.owner: String
    get() = throw NoSuchFieldException("Get on owner is not supported.")
    set(value) { this.withOwner(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.BitBucketSourceProps.Builder.withCloneDepth
 */
var software.amazon.awscdk.services.codebuild.BitBucketSourceProps.Builder.cloneDepth: Number
    get() = throw NoSuchFieldException("Get on cloneDepth is not supported.")
    set(value) { this.withCloneDepth(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.BitBucketSourceProps.Builder.withIdentifier
 */
var software.amazon.awscdk.services.codebuild.BitBucketSourceProps.Builder.identifier: String
    get() = throw NoSuchFieldException("Get on identifier is not supported.")
    set(value) { this.withIdentifier(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CommonPipelineTestActionProps.Builder
 */
fun commonPipelineTestActionProps(init: software.amazon.awscdk.services.codebuild.CommonPipelineTestActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CommonPipelineTestActionProps {
    val builder = software.amazon.awscdk.services.codebuild.CommonPipelineTestActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CommonPipelineTestActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.codebuild.CommonPipelineTestActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CommonPipelineTestActionProps.Builder.withInputArtifact
 */
var software.amazon.awscdk.services.codebuild.CommonPipelineTestActionProps.Builder.inputArtifact: software.amazon.awscdk.services.codepipeline.api.Artifact
    get() = throw NoSuchFieldException("Get on inputArtifact is not supported.")
    set(value) { this.withInputArtifact(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CommonPipelineTestActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codebuild.CommonPipelineTestActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CommonPipelineTestActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codebuild.CommonPipelineTestActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty.Builder
 */
fun logsConfigProperty(init: software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty {
    val builder = software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty.Builder.withS3Logs
 */
var software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty.Builder.s3Logs: software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty
    get() = throw NoSuchFieldException("Get on s3Logs is not supported.")
    set(value) { this.withS3Logs(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty.Builder.withCloudWatchLogs
 */
var software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty.Builder.cloudWatchLogs: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on cloudWatchLogs is not supported.")
    set(value) { this.withCloudWatchLogs(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.GitBuildSourceProps.Builder
 */
fun gitBuildSourceProps(init: software.amazon.awscdk.services.codebuild.GitBuildSourceProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.GitBuildSourceProps {
    val builder = software.amazon.awscdk.services.codebuild.GitBuildSourceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.GitBuildSourceProps.Builder.withCloneDepth
 */
var software.amazon.awscdk.services.codebuild.GitBuildSourceProps.Builder.cloneDepth: Number
    get() = throw NoSuchFieldException("Get on cloneDepth is not supported.")
    set(value) { this.withCloneDepth(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.GitBuildSourceProps.Builder.withIdentifier
 */
var software.amazon.awscdk.services.codebuild.GitBuildSourceProps.Builder.identifier: String
    get() = throw NoSuchFieldException("Get on identifier is not supported.")
    set(value) { this.withIdentifier(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty.Builder
 */
fun projectTriggersProperty(init: software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty {
    val builder = software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty.Builder.withFilterGroups
 */
var software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty.Builder.filterGroups: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on filterGroups is not supported.")
    set(value) { this.withFilterGroups(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty.Builder.withWebhook
 */
var software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty.Builder.webhook: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on webhook is not supported.")
    set(value) { this.withWebhook(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty.Builder
 */
fun sourceAuthProperty(init: software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty {
    val builder = software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty.Builder.withType
 */
var software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty.Builder.withResource
 */
var software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty.Builder.resource: String
    get() = throw NoSuchFieldException("Get on resource is not supported.")
    set(value) { this.withResource(value) }


/**
 * @see software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder
 */
fun pipelineProjectProps(init: software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.() -> Unit): software.amazon.awscdk.services.codebuild.PipelineProjectProps {
    val builder = software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.withEncryptionKey
 */
var software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.encryptionKey: software.amazon.awscdk.services.kms.IEncryptionKey
    get() = throw NoSuchFieldException("Get on encryptionKey is not supported.")
    set(value) { this.withEncryptionKey(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.withProjectName
 */
var software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.projectName: String
    get() = throw NoSuchFieldException("Get on projectName is not supported.")
    set(value) { this.withProjectName(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.withBuildSpec
 */
var software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.buildSpec: Any
    get() = throw NoSuchFieldException("Get on buildSpec is not supported.")
    set(value) { this.withBuildSpec(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.withCacheBucket
 */
var software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.cacheBucket: software.amazon.awscdk.services.s3.IBucket
    get() = throw NoSuchFieldException("Get on cacheBucket is not supported.")
    set(value) { this.withCacheBucket(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.withCacheDir
 */
var software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.cacheDir: String
    get() = throw NoSuchFieldException("Get on cacheDir is not supported.")
    set(value) { this.withCacheDir(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.withEnvironment
 */
var software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.environment: software.amazon.awscdk.services.codebuild.BuildEnvironment
    get() = throw NoSuchFieldException("Get on environment is not supported.")
    set(value) { this.withEnvironment(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.withBuildScriptAsset
 */
var software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.buildScriptAsset: software.amazon.awscdk.assets.Asset
    get() = throw NoSuchFieldException("Get on buildScriptAsset is not supported.")
    set(value) { this.withBuildScriptAsset(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.withBadge
 */
var software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.badge: Boolean
    get() = throw NoSuchFieldException("Get on badge is not supported.")
    set(value) { this.withBadge(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.withBuildScriptAssetEntrypoint
 */
var software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.buildScriptAssetEntrypoint: String
    get() = throw NoSuchFieldException("Get on buildScriptAssetEntrypoint is not supported.")
    set(value) { this.withBuildScriptAssetEntrypoint(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.withRole
 */
var software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.withTimeout
 */
var software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.timeout: Number
    get() = throw NoSuchFieldException("Get on timeout is not supported.")
    set(value) { this.withTimeout(value) }

/**
 * @see software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.withDescription
 */
var software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }
