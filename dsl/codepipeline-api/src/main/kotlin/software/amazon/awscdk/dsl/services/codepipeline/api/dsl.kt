package software.amazon.awscdk.dsl.services.codepipeline.api

/**
 * @see software.amazon.awscdk.services.codepipeline.api.DeployActionProps.Builder
 */
fun deployActionProps(init: software.amazon.awscdk.services.codepipeline.api.DeployActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.api.DeployActionProps {
    val builder = software.amazon.awscdk.services.codepipeline.api.DeployActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.api.DeployActionProps.Builder.withConfiguration
 */
var software.amazon.awscdk.services.codepipeline.api.DeployActionProps.Builder.configuration: Any
    get() = throw NoSuchFieldException("Get on configuration is not supported.")
    set(value) { this.withConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.DeployActionProps.Builder.withArtifactBounds
 */
var software.amazon.awscdk.services.codepipeline.api.DeployActionProps.Builder.artifactBounds: software.amazon.awscdk.services.codepipeline.api.ActionArtifactBounds
    get() = throw NoSuchFieldException("Get on artifactBounds is not supported.")
    set(value) { this.withArtifactBounds(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.DeployActionProps.Builder.withOwner
 */
var software.amazon.awscdk.services.codepipeline.api.DeployActionProps.Builder.owner: String
    get() = throw NoSuchFieldException("Get on owner is not supported.")
    set(value) { this.withOwner(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.DeployActionProps.Builder.withProvider
 */
var software.amazon.awscdk.services.codepipeline.api.DeployActionProps.Builder.provider: String
    get() = throw NoSuchFieldException("Get on provider is not supported.")
    set(value) { this.withProvider(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.DeployActionProps.Builder.withInputArtifact
 */
var software.amazon.awscdk.services.codepipeline.api.DeployActionProps.Builder.inputArtifact: software.amazon.awscdk.services.codepipeline.api.Artifact
    get() = throw NoSuchFieldException("Get on inputArtifact is not supported.")
    set(value) { this.withInputArtifact(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.DeployActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codepipeline.api.DeployActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.DeployActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codepipeline.api.DeployActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder
 */
fun actionProps(init: software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.api.ActionProps {
    val builder = software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.withConfiguration
 */
var software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.configuration: Any
    get() = throw NoSuchFieldException("Get on configuration is not supported.")
    set(value) { this.withConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.withArtifactBounds
 */
var software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.artifactBounds: software.amazon.awscdk.services.codepipeline.api.ActionArtifactBounds
    get() = throw NoSuchFieldException("Get on artifactBounds is not supported.")
    set(value) { this.withArtifactBounds(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.withRegion
 */
var software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.withOwner
 */
var software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.owner: String
    get() = throw NoSuchFieldException("Get on owner is not supported.")
    set(value) { this.withOwner(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.withProvider
 */
var software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.provider: String
    get() = throw NoSuchFieldException("Get on provider is not supported.")
    set(value) { this.withProvider(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.withCategory
 */
var software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.category: software.amazon.awscdk.services.codepipeline.api.ActionCategory
    get() = throw NoSuchFieldException("Get on category is not supported.")
    set(value) { this.withCategory(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.withRole
 */
var software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.role: software.amazon.awscdk.services.iam.IRole
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.withVersion
 */
var software.amazon.awscdk.services.codepipeline.api.ActionProps.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder
 */
fun buildActionProps(init: software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.api.BuildActionProps {
    val builder = software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.withConfiguration
 */
var software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.configuration: Any
    get() = throw NoSuchFieldException("Get on configuration is not supported.")
    set(value) { this.withConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.withArtifactBounds
 */
var software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.artifactBounds: software.amazon.awscdk.services.codepipeline.api.ActionArtifactBounds
    get() = throw NoSuchFieldException("Get on artifactBounds is not supported.")
    set(value) { this.withArtifactBounds(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.withOwner
 */
var software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.owner: String
    get() = throw NoSuchFieldException("Get on owner is not supported.")
    set(value) { this.withOwner(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.withProvider
 */
var software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.provider: String
    get() = throw NoSuchFieldException("Get on provider is not supported.")
    set(value) { this.withProvider(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.withInputArtifact
 */
var software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.inputArtifact: software.amazon.awscdk.services.codepipeline.api.Artifact
    get() = throw NoSuchFieldException("Get on inputArtifact is not supported.")
    set(value) { this.withInputArtifact(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.withVersion
 */
var software.amazon.awscdk.services.codepipeline.api.BuildActionProps.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder
 */
fun testActionProps(init: software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.api.TestActionProps {
    val builder = software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.withConfiguration
 */
var software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.configuration: Any
    get() = throw NoSuchFieldException("Get on configuration is not supported.")
    set(value) { this.withConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.withArtifactBounds
 */
var software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.artifactBounds: software.amazon.awscdk.services.codepipeline.api.ActionArtifactBounds
    get() = throw NoSuchFieldException("Get on artifactBounds is not supported.")
    set(value) { this.withArtifactBounds(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.withOwner
 */
var software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.owner: String
    get() = throw NoSuchFieldException("Get on owner is not supported.")
    set(value) { this.withOwner(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.withProvider
 */
var software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.provider: String
    get() = throw NoSuchFieldException("Get on provider is not supported.")
    set(value) { this.withProvider(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.withInputArtifact
 */
var software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.inputArtifact: software.amazon.awscdk.services.codepipeline.api.Artifact
    get() = throw NoSuchFieldException("Get on inputArtifact is not supported.")
    set(value) { this.withInputArtifact(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.withVersion
 */
var software.amazon.awscdk.services.codepipeline.api.TestActionProps.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.api.CommonActionProps.Builder
 */
fun commonActionProps(init: software.amazon.awscdk.services.codepipeline.api.CommonActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.api.CommonActionProps {
    val builder = software.amazon.awscdk.services.codepipeline.api.CommonActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.api.CommonActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codepipeline.api.CommonActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.CommonActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codepipeline.api.CommonActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.api.ActionArtifactBounds.Builder
 */
fun actionArtifactBounds(init: software.amazon.awscdk.services.codepipeline.api.ActionArtifactBounds.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.api.ActionArtifactBounds {
    val builder = software.amazon.awscdk.services.codepipeline.api.ActionArtifactBounds.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.api.ActionArtifactBounds.Builder.withMaxOutputs
 */
var software.amazon.awscdk.services.codepipeline.api.ActionArtifactBounds.Builder.maxOutputs: Number
    get() = throw NoSuchFieldException("Get on maxOutputs is not supported.")
    set(value) { this.withMaxOutputs(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.ActionArtifactBounds.Builder.withMinInputs
 */
var software.amazon.awscdk.services.codepipeline.api.ActionArtifactBounds.Builder.minInputs: Number
    get() = throw NoSuchFieldException("Get on minInputs is not supported.")
    set(value) { this.withMinInputs(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.ActionArtifactBounds.Builder.withMinOutputs
 */
var software.amazon.awscdk.services.codepipeline.api.ActionArtifactBounds.Builder.minOutputs: Number
    get() = throw NoSuchFieldException("Get on minOutputs is not supported.")
    set(value) { this.withMinOutputs(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.ActionArtifactBounds.Builder.withMaxInputs
 */
var software.amazon.awscdk.services.codepipeline.api.ActionArtifactBounds.Builder.maxInputs: Number
    get() = throw NoSuchFieldException("Get on maxInputs is not supported.")
    set(value) { this.withMaxInputs(value) }


/**
 * @see software.amazon.awscdk.services.codepipeline.api.SourceActionProps.Builder
 */
fun sourceActionProps(init: software.amazon.awscdk.services.codepipeline.api.SourceActionProps.Builder.() -> Unit): software.amazon.awscdk.services.codepipeline.api.SourceActionProps {
    val builder = software.amazon.awscdk.services.codepipeline.api.SourceActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.codepipeline.api.SourceActionProps.Builder.withConfiguration
 */
var software.amazon.awscdk.services.codepipeline.api.SourceActionProps.Builder.configuration: Any
    get() = throw NoSuchFieldException("Get on configuration is not supported.")
    set(value) { this.withConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.SourceActionProps.Builder.withOutputArtifactName
 */
var software.amazon.awscdk.services.codepipeline.api.SourceActionProps.Builder.outputArtifactName: String
    get() = throw NoSuchFieldException("Get on outputArtifactName is not supported.")
    set(value) { this.withOutputArtifactName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.SourceActionProps.Builder.withOwner
 */
var software.amazon.awscdk.services.codepipeline.api.SourceActionProps.Builder.owner: String
    get() = throw NoSuchFieldException("Get on owner is not supported.")
    set(value) { this.withOwner(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.SourceActionProps.Builder.withProvider
 */
var software.amazon.awscdk.services.codepipeline.api.SourceActionProps.Builder.provider: String
    get() = throw NoSuchFieldException("Get on provider is not supported.")
    set(value) { this.withProvider(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.SourceActionProps.Builder.withActionName
 */
var software.amazon.awscdk.services.codepipeline.api.SourceActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.SourceActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.services.codepipeline.api.SourceActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.services.codepipeline.api.SourceActionProps.Builder.withVersion
 */
var software.amazon.awscdk.services.codepipeline.api.SourceActionProps.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }
