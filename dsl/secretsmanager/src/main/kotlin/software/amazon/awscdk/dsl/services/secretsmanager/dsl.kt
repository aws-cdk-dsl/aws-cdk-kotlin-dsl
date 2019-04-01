package software.amazon.awscdk.dsl.services.secretsmanager
/**
 * @see software.amazon.awscdk.services.secretsmanager.RotationSchedule
 */
fun software.amazon.awscdk.Construct.rotationSchedule(id: String,
                     props: software.amazon.awscdk.services.secretsmanager.RotationScheduleProps? = null,
                     init: (software.amazon.awscdk.services.secretsmanager.RotationSchedule.() -> Unit)? = null)
        : software.amazon.awscdk.services.secretsmanager.RotationSchedule {

    val obj = software.amazon.awscdk.services.secretsmanager.RotationSchedule(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.secretsmanager.AttachedSecret
 */
fun software.amazon.awscdk.Construct.attachedSecret(id: String,
                     props: software.amazon.awscdk.services.secretsmanager.AttachedSecretProps? = null,
                     init: (software.amazon.awscdk.services.secretsmanager.AttachedSecret.() -> Unit)? = null)
        : software.amazon.awscdk.services.secretsmanager.AttachedSecret {

    val obj = software.amazon.awscdk.services.secretsmanager.AttachedSecret(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule
 */
fun software.amazon.awscdk.Construct.cfnRotationSchedule(id: String,
                     props: software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps? = null,
                     init: (software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.() -> Unit)? = null)
        : software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule {

    val obj = software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecret
 */
fun software.amazon.awscdk.Construct.cfnSecret(id: String,
                     props: software.amazon.awscdk.services.secretsmanager.CfnSecretProps? = null,
                     init: (software.amazon.awscdk.services.secretsmanager.CfnSecret.() -> Unit)? = null)
        : software.amazon.awscdk.services.secretsmanager.CfnSecret {

    val obj = software.amazon.awscdk.services.secretsmanager.CfnSecret(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretString
 */
fun software.amazon.awscdk.Construct.secretString(id: String,
                     props: software.amazon.awscdk.services.secretsmanager.SecretStringProps? = null,
                     init: (software.amazon.awscdk.services.secretsmanager.SecretString.() -> Unit)? = null)
        : software.amazon.awscdk.services.secretsmanager.SecretString {

    val obj = software.amazon.awscdk.services.secretsmanager.SecretString(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy
 */
fun software.amazon.awscdk.Construct.cfnResourcePolicy(id: String,
                     props: software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps? = null,
                     init: (software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy.() -> Unit)? = null)
        : software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy {

    val obj = software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment
 */
fun software.amazon.awscdk.Construct.cfnSecretTargetAttachment(id: String,
                     props: software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps? = null,
                     init: (software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment.() -> Unit)? = null)
        : software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment {

    val obj = software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.secretsmanager.Secret
 */
fun software.amazon.awscdk.Construct.secret(id: String,
                     props: software.amazon.awscdk.services.secretsmanager.SecretProps? = null,
                     init: (software.amazon.awscdk.services.secretsmanager.Secret.() -> Unit)? = null)
        : software.amazon.awscdk.services.secretsmanager.Secret {

    val obj = software.amazon.awscdk.services.secretsmanager.Secret(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecret
 */
fun software.amazon.awscdk.Construct.cfnSecret(id: String,
                     init: (software.amazon.awscdk.services.secretsmanager.CfnSecret.() -> Unit)? = null)
        : software.amazon.awscdk.services.secretsmanager.CfnSecret {

    val obj = software.amazon.awscdk.services.secretsmanager.CfnSecret(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.secretsmanager.Secret
 */
fun software.amazon.awscdk.Construct.secret(id: String,
                     init: (software.amazon.awscdk.services.secretsmanager.Secret.() -> Unit)? = null)
        : software.amazon.awscdk.services.secretsmanager.Secret {

    val obj = software.amazon.awscdk.services.secretsmanager.Secret(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.secretsmanager.AttachedSecretProps.Builder
 */
fun attachedSecretProps(init: software.amazon.awscdk.services.secretsmanager.AttachedSecretProps.Builder.() -> Unit): software.amazon.awscdk.services.secretsmanager.AttachedSecretProps {
    val builder = software.amazon.awscdk.services.secretsmanager.AttachedSecretProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.secretsmanager.AttachedSecretProps.Builder.withSecret
 */
var software.amazon.awscdk.services.secretsmanager.AttachedSecretProps.Builder.secret: software.amazon.awscdk.services.secretsmanager.ISecret
    get() = throw NoSuchFieldException("Get on secret is not supported.")
    set(value) { this.withSecret(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.AttachedSecretProps.Builder.withTarget
 */
var software.amazon.awscdk.services.secretsmanager.AttachedSecretProps.Builder.target: software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget
    get() = throw NoSuchFieldException("Get on target is not supported.")
    set(value) { this.withTarget(value) }


/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps.Builder
 */
fun secretAttachmentTargetProps(init: software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps.Builder.() -> Unit): software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps {
    val builder = software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps.Builder.withTargetType
 */
var software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps.Builder.targetType: software.amazon.awscdk.services.secretsmanager.AttachmentTargetType
    get() = throw NoSuchFieldException("Get on targetType is not supported.")
    set(value) { this.withTargetType(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps.Builder.withTargetId
 */
var software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps.Builder.targetId: String
    get() = throw NoSuchFieldException("Get on targetId is not supported.")
    set(value) { this.withTargetId(value) }


/**
 * @see software.amazon.awscdk.services.secretsmanager.RotationScheduleProps.Builder
 */
fun rotationScheduleProps(init: software.amazon.awscdk.services.secretsmanager.RotationScheduleProps.Builder.() -> Unit): software.amazon.awscdk.services.secretsmanager.RotationScheduleProps {
    val builder = software.amazon.awscdk.services.secretsmanager.RotationScheduleProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.secretsmanager.RotationScheduleProps.Builder.withSecret
 */
var software.amazon.awscdk.services.secretsmanager.RotationScheduleProps.Builder.secret: software.amazon.awscdk.services.secretsmanager.ISecret
    get() = throw NoSuchFieldException("Get on secret is not supported.")
    set(value) { this.withSecret(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.RotationScheduleProps.Builder.withAutomaticallyAfterDays
 */
var software.amazon.awscdk.services.secretsmanager.RotationScheduleProps.Builder.automaticallyAfterDays: Number
    get() = throw NoSuchFieldException("Get on automaticallyAfterDays is not supported.")
    set(value) { this.withAutomaticallyAfterDays(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.RotationScheduleProps.Builder.withRotationLambda
 */
var software.amazon.awscdk.services.secretsmanager.RotationScheduleProps.Builder.rotationLambda: software.amazon.awscdk.services.lambda.IFunction
    get() = throw NoSuchFieldException("Get on rotationLambda is not supported.")
    set(value) { this.withRotationLambda(value) }


/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty.Builder
 */
fun rotationRulesProperty(init: software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty.Builder.() -> Unit): software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty {
    val builder = software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty.Builder.withAutomaticallyAfterDays
 */
var software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty.Builder.automaticallyAfterDays: Number
    get() = throw NoSuchFieldException("Get on automaticallyAfterDays is not supported.")
    set(value) { this.withAutomaticallyAfterDays(value) }


/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretImportProps.Builder
 */
fun secretImportProps(init: software.amazon.awscdk.services.secretsmanager.SecretImportProps.Builder.() -> Unit): software.amazon.awscdk.services.secretsmanager.SecretImportProps {
    val builder = software.amazon.awscdk.services.secretsmanager.SecretImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretImportProps.Builder.withEncryptionKey
 */
var software.amazon.awscdk.services.secretsmanager.SecretImportProps.Builder.encryptionKey: software.amazon.awscdk.services.kms.IEncryptionKey
    get() = throw NoSuchFieldException("Get on encryptionKey is not supported.")
    set(value) { this.withEncryptionKey(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretImportProps.Builder.withSecretArn
 */
var software.amazon.awscdk.services.secretsmanager.SecretImportProps.Builder.secretArn: String
    get() = throw NoSuchFieldException("Get on secretArn is not supported.")
    set(value) { this.withSecretArn(value) }


/**
 * @see software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions.Builder
 */
fun rotationScheduleOptions(init: software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions.Builder.() -> Unit): software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions {
    val builder = software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions.Builder.withAutomaticallyAfterDays
 */
var software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions.Builder.automaticallyAfterDays: Number
    get() = throw NoSuchFieldException("Get on automaticallyAfterDays is not supported.")
    set(value) { this.withAutomaticallyAfterDays(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions.Builder.withRotationLambda
 */
var software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions.Builder.rotationLambda: software.amazon.awscdk.services.lambda.IFunction
    get() = throw NoSuchFieldException("Get on rotationLambda is not supported.")
    set(value) { this.withRotationLambda(value) }


/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretProps.Builder
 */
fun secretProps(init: software.amazon.awscdk.services.secretsmanager.SecretProps.Builder.() -> Unit): software.amazon.awscdk.services.secretsmanager.SecretProps {
    val builder = software.amazon.awscdk.services.secretsmanager.SecretProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretProps.Builder.withEncryptionKey
 */
var software.amazon.awscdk.services.secretsmanager.SecretProps.Builder.encryptionKey: software.amazon.awscdk.services.kms.IEncryptionKey
    get() = throw NoSuchFieldException("Get on encryptionKey is not supported.")
    set(value) { this.withEncryptionKey(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretProps.Builder.withGenerateSecretString
 */
var software.amazon.awscdk.services.secretsmanager.SecretProps.Builder.generateSecretString: software.amazon.awscdk.services.secretsmanager.SecretStringGenerator
    get() = throw NoSuchFieldException("Get on generateSecretString is not supported.")
    set(value) { this.withGenerateSecretString(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretProps.Builder.withName
 */
var software.amazon.awscdk.services.secretsmanager.SecretProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretProps.Builder.withDescription
 */
var software.amazon.awscdk.services.secretsmanager.SecretProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions.Builder
 */
fun attachedSecretOptions(init: software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions.Builder.() -> Unit): software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions {
    val builder = software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions.Builder.withTarget
 */
var software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions.Builder.target: software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget
    get() = throw NoSuchFieldException("Get on target is not supported.")
    set(value) { this.withTarget(value) }


/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps.Builder
 */
fun cfnRotationScheduleProps(init: software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps.Builder.() -> Unit): software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps {
    val builder = software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps.Builder.withSecretId
 */
var software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps.Builder.secretId: String
    get() = throw NoSuchFieldException("Get on secretId is not supported.")
    set(value) { this.withSecretId(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps.Builder.withRotationLambdaArn
 */
var software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps.Builder.rotationLambdaArn: String
    get() = throw NoSuchFieldException("Get on rotationLambdaArn is not supported.")
    set(value) { this.withRotationLambdaArn(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps.Builder.withRotationRules
 */
var software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps.Builder.rotationRules: software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty
    get() = throw NoSuchFieldException("Get on rotationRules is not supported.")
    set(value) { this.withRotationRules(value) }


/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps.Builder
 */
fun cfnResourcePolicyProps(init: software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps.Builder.() -> Unit): software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps {
    val builder = software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps.Builder.withSecretId
 */
var software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps.Builder.secretId: String
    get() = throw NoSuchFieldException("Get on secretId is not supported.")
    set(value) { this.withSecretId(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps.Builder.withResourcePolicy
 */
var software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps.Builder.resourcePolicy: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on resourcePolicy is not supported.")
    set(value) { this.withResourcePolicy(value) }


/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretStringProps.Builder
 */
fun secretStringProps(init: software.amazon.awscdk.services.secretsmanager.SecretStringProps.Builder.() -> Unit): software.amazon.awscdk.services.secretsmanager.SecretStringProps {
    val builder = software.amazon.awscdk.services.secretsmanager.SecretStringProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretStringProps.Builder.withSecretId
 */
var software.amazon.awscdk.services.secretsmanager.SecretStringProps.Builder.secretId: String
    get() = throw NoSuchFieldException("Get on secretId is not supported.")
    set(value) { this.withSecretId(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretStringProps.Builder.withVersionId
 */
var software.amazon.awscdk.services.secretsmanager.SecretStringProps.Builder.versionId: String
    get() = throw NoSuchFieldException("Get on versionId is not supported.")
    set(value) { this.withVersionId(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretStringProps.Builder.withVersionStage
 */
var software.amazon.awscdk.services.secretsmanager.SecretStringProps.Builder.versionStage: String
    get() = throw NoSuchFieldException("Get on versionStage is not supported.")
    set(value) { this.withVersionStage(value) }


/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder
 */
fun secretStringGenerator(init: software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.() -> Unit): software.amazon.awscdk.services.secretsmanager.SecretStringGenerator {
    val builder = software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.withExcludeCharacters
 */
var software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.excludeCharacters: String
    get() = throw NoSuchFieldException("Get on excludeCharacters is not supported.")
    set(value) { this.withExcludeCharacters(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.withExcludeLowercase
 */
var software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.excludeLowercase: Boolean
    get() = throw NoSuchFieldException("Get on excludeLowercase is not supported.")
    set(value) { this.withExcludeLowercase(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.withExcludeNumbers
 */
var software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.excludeNumbers: Boolean
    get() = throw NoSuchFieldException("Get on excludeNumbers is not supported.")
    set(value) { this.withExcludeNumbers(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.withExcludePunctuation
 */
var software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.excludePunctuation: Boolean
    get() = throw NoSuchFieldException("Get on excludePunctuation is not supported.")
    set(value) { this.withExcludePunctuation(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.withExcludeUppercase
 */
var software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.excludeUppercase: Boolean
    get() = throw NoSuchFieldException("Get on excludeUppercase is not supported.")
    set(value) { this.withExcludeUppercase(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.withGenerateStringKey
 */
var software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.generateStringKey: String
    get() = throw NoSuchFieldException("Get on generateStringKey is not supported.")
    set(value) { this.withGenerateStringKey(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.withIncludeSpace
 */
var software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.includeSpace: Boolean
    get() = throw NoSuchFieldException("Get on includeSpace is not supported.")
    set(value) { this.withIncludeSpace(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.withPasswordLength
 */
var software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.passwordLength: Number
    get() = throw NoSuchFieldException("Get on passwordLength is not supported.")
    set(value) { this.withPasswordLength(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.withRequireEachIncludedType
 */
var software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.requireEachIncludedType: Boolean
    get() = throw NoSuchFieldException("Get on requireEachIncludedType is not supported.")
    set(value) { this.withRequireEachIncludedType(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.withSecretStringTemplate
 */
var software.amazon.awscdk.services.secretsmanager.SecretStringGenerator.Builder.secretStringTemplate: String
    get() = throw NoSuchFieldException("Get on secretStringTemplate is not supported.")
    set(value) { this.withSecretStringTemplate(value) }


/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps.Builder
 */
fun cfnSecretTargetAttachmentProps(init: software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps.Builder.() -> Unit): software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps {
    val builder = software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps.Builder.withSecretId
 */
var software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps.Builder.secretId: String
    get() = throw NoSuchFieldException("Get on secretId is not supported.")
    set(value) { this.withSecretId(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps.Builder.withTargetType
 */
var software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps.Builder.targetType: String
    get() = throw NoSuchFieldException("Get on targetType is not supported.")
    set(value) { this.withTargetType(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps.Builder.withTargetId
 */
var software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps.Builder.targetId: String
    get() = throw NoSuchFieldException("Get on targetId is not supported.")
    set(value) { this.withTargetId(value) }


/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder
 */
fun generateSecretStringProperty(init: software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.() -> Unit): software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty {
    val builder = software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.withExcludeCharacters
 */
var software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.excludeCharacters: String
    get() = throw NoSuchFieldException("Get on excludeCharacters is not supported.")
    set(value) { this.withExcludeCharacters(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.withExcludeLowercase
 */
var software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.excludeLowercase: Boolean
    get() = throw NoSuchFieldException("Get on excludeLowercase is not supported.")
    set(value) { this.withExcludeLowercase(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.withExcludeNumbers
 */
var software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.excludeNumbers: Boolean
    get() = throw NoSuchFieldException("Get on excludeNumbers is not supported.")
    set(value) { this.withExcludeNumbers(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.withExcludePunctuation
 */
var software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.excludePunctuation: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on excludePunctuation is not supported.")
    set(value) { this.withExcludePunctuation(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.withExcludeUppercase
 */
var software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.excludeUppercase: Boolean
    get() = throw NoSuchFieldException("Get on excludeUppercase is not supported.")
    set(value) { this.withExcludeUppercase(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.withGenerateStringKey
 */
var software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.generateStringKey: String
    get() = throw NoSuchFieldException("Get on generateStringKey is not supported.")
    set(value) { this.withGenerateStringKey(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.withIncludeSpace
 */
var software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.includeSpace: Boolean
    get() = throw NoSuchFieldException("Get on includeSpace is not supported.")
    set(value) { this.withIncludeSpace(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.withPasswordLength
 */
var software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.passwordLength: Number
    get() = throw NoSuchFieldException("Get on passwordLength is not supported.")
    set(value) { this.withPasswordLength(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.withRequireEachIncludedType
 */
var software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.requireEachIncludedType: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on requireEachIncludedType is not supported.")
    set(value) { this.withRequireEachIncludedType(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.withSecretStringTemplate
 */
var software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty.Builder.secretStringTemplate: String
    get() = throw NoSuchFieldException("Get on secretStringTemplate is not supported.")
    set(value) { this.withSecretStringTemplate(value) }


/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecretProps.Builder
 */
fun cfnSecretProps(init: software.amazon.awscdk.services.secretsmanager.CfnSecretProps.Builder.() -> Unit): software.amazon.awscdk.services.secretsmanager.CfnSecretProps {
    val builder = software.amazon.awscdk.services.secretsmanager.CfnSecretProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecretProps.Builder.withGenerateSecretString
 */
var software.amazon.awscdk.services.secretsmanager.CfnSecretProps.Builder.generateSecretString: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on generateSecretString is not supported.")
    set(value) { this.withGenerateSecretString(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecretProps.Builder.withKmsKeyId
 */
var software.amazon.awscdk.services.secretsmanager.CfnSecretProps.Builder.kmsKeyId: String
    get() = throw NoSuchFieldException("Get on kmsKeyId is not supported.")
    set(value) { this.withKmsKeyId(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecretProps.Builder.withSecretString
 */
var software.amazon.awscdk.services.secretsmanager.CfnSecretProps.Builder.secretString: String
    get() = throw NoSuchFieldException("Get on secretString is not supported.")
    set(value) { this.withSecretString(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecretProps.Builder.withName
 */
var software.amazon.awscdk.services.secretsmanager.CfnSecretProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.secretsmanager.CfnSecretProps.Builder.withDescription
 */
var software.amazon.awscdk.services.secretsmanager.CfnSecretProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }
