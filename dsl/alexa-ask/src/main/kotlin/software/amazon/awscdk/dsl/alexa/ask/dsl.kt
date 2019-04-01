package software.amazon.awscdk.dsl.alexa.ask
/**
 * @see software.amazon.awscdk.alexa.ask.CfnSkill
 */
fun software.amazon.awscdk.Construct.cfnSkill(id: String,
                     props: software.amazon.awscdk.alexa.ask.CfnSkillProps? = null,
                     init: (software.amazon.awscdk.alexa.ask.CfnSkill.() -> Unit)? = null)
        : software.amazon.awscdk.alexa.ask.CfnSkill {

    val obj = software.amazon.awscdk.alexa.ask.CfnSkill(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.alexa.ask.CfnSkillProps.Builder
 */
fun cfnSkillProps(init: software.amazon.awscdk.alexa.ask.CfnSkillProps.Builder.() -> Unit): software.amazon.awscdk.alexa.ask.CfnSkillProps {
    val builder = software.amazon.awscdk.alexa.ask.CfnSkillProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.alexa.ask.CfnSkillProps.Builder.withSkillPackage
 */
var software.amazon.awscdk.alexa.ask.CfnSkillProps.Builder.skillPackage: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on skillPackage is not supported.")
    set(value) { this.withSkillPackage(value) }

/**
 * @see software.amazon.awscdk.alexa.ask.CfnSkillProps.Builder.withVendorId
 */
var software.amazon.awscdk.alexa.ask.CfnSkillProps.Builder.vendorId: String
    get() = throw NoSuchFieldException("Get on vendorId is not supported.")
    set(value) { this.withVendorId(value) }

/**
 * @see software.amazon.awscdk.alexa.ask.CfnSkillProps.Builder.withAuthenticationConfiguration
 */
var software.amazon.awscdk.alexa.ask.CfnSkillProps.Builder.authenticationConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on authenticationConfiguration is not supported.")
    set(value) { this.withAuthenticationConfiguration(value) }


/**
 * @see software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty.Builder
 */
fun authenticationConfigurationProperty(init: software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty {
    val builder = software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty.Builder.withClientId
 */
var software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty.Builder.clientId: String
    get() = throw NoSuchFieldException("Get on clientId is not supported.")
    set(value) { this.withClientId(value) }

/**
 * @see software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty.Builder.withClientSecret
 */
var software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty.Builder.clientSecret: String
    get() = throw NoSuchFieldException("Get on clientSecret is not supported.")
    set(value) { this.withClientSecret(value) }

/**
 * @see software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty.Builder.withRefreshToken
 */
var software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty.Builder.refreshToken: String
    get() = throw NoSuchFieldException("Get on refreshToken is not supported.")
    set(value) { this.withRefreshToken(value) }


/**
 * @see software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty.Builder
 */
fun overridesProperty(init: software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty.Builder.() -> Unit): software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty {
    val builder = software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty.Builder.withManifest
 */
var software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty.Builder.manifest: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on manifest is not supported.")
    set(value) { this.withManifest(value) }


/**
 * @see software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder
 */
fun alexaSkillDeployActionProps(init: software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder.() -> Unit): software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps {
    val builder = software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder.withClientId
 */
var software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder.clientId: software.amazon.awscdk.Secret
    get() = throw NoSuchFieldException("Get on clientId is not supported.")
    set(value) { this.withClientId(value) }

/**
 * @see software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder.withClientSecret
 */
var software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder.clientSecret: software.amazon.awscdk.Secret
    get() = throw NoSuchFieldException("Get on clientSecret is not supported.")
    set(value) { this.withClientSecret(value) }

/**
 * @see software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder.withInputArtifact
 */
var software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder.inputArtifact: software.amazon.awscdk.services.codepipeline.api.Artifact
    get() = throw NoSuchFieldException("Get on inputArtifact is not supported.")
    set(value) { this.withInputArtifact(value) }

/**
 * @see software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder.withActionName
 */
var software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder.actionName: String
    get() = throw NoSuchFieldException("Get on actionName is not supported.")
    set(value) { this.withActionName(value) }

/**
 * @see software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder.withRunOrder
 */
var software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder.runOrder: Number
    get() = throw NoSuchFieldException("Get on runOrder is not supported.")
    set(value) { this.withRunOrder(value) }

/**
 * @see software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder.withRefreshToken
 */
var software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder.refreshToken: software.amazon.awscdk.Secret
    get() = throw NoSuchFieldException("Get on refreshToken is not supported.")
    set(value) { this.withRefreshToken(value) }

/**
 * @see software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder.withSkillId
 */
var software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder.skillId: String
    get() = throw NoSuchFieldException("Get on skillId is not supported.")
    set(value) { this.withSkillId(value) }

/**
 * @see software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder.withParameterOverridesArtifact
 */
var software.amazon.awscdk.alexa.ask.AlexaSkillDeployActionProps.Builder.parameterOverridesArtifact: software.amazon.awscdk.services.codepipeline.api.Artifact
    get() = throw NoSuchFieldException("Get on parameterOverridesArtifact is not supported.")
    set(value) { this.withParameterOverridesArtifact(value) }


/**
 * @see software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty.Builder
 */
fun skillPackageProperty(init: software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty.Builder.() -> Unit): software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty {
    val builder = software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty.Builder.withS3Bucket
 */
var software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty.Builder.s3Bucket: String
    get() = throw NoSuchFieldException("Get on s3Bucket is not supported.")
    set(value) { this.withS3Bucket(value) }

/**
 * @see software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty.Builder.withS3BucketRole
 */
var software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty.Builder.s3BucketRole: String
    get() = throw NoSuchFieldException("Get on s3BucketRole is not supported.")
    set(value) { this.withS3BucketRole(value) }

/**
 * @see software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty.Builder.withS3ObjectVersion
 */
var software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty.Builder.s3ObjectVersion: String
    get() = throw NoSuchFieldException("Get on s3ObjectVersion is not supported.")
    set(value) { this.withS3ObjectVersion(value) }

/**
 * @see software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty.Builder.withOverrides
 */
var software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty.Builder.overrides: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on overrides is not supported.")
    set(value) { this.withOverrides(value) }

/**
 * @see software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty.Builder.withS3Key
 */
var software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty.Builder.s3Key: String
    get() = throw NoSuchFieldException("Get on s3Key is not supported.")
    set(value) { this.withS3Key(value) }
