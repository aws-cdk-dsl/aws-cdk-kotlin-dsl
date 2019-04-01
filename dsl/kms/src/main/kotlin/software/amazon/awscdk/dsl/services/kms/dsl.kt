package software.amazon.awscdk.dsl.services.kms
/**
 * @see software.amazon.awscdk.services.kms.EncryptionKeyAlias
 */
fun software.amazon.awscdk.Construct.encryptionKeyAlias(id: String,
                     props: software.amazon.awscdk.services.kms.EncryptionKeyAliasProps? = null,
                     init: (software.amazon.awscdk.services.kms.EncryptionKeyAlias.() -> Unit)? = null)
        : software.amazon.awscdk.services.kms.EncryptionKeyAlias {

    val obj = software.amazon.awscdk.services.kms.EncryptionKeyAlias(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.kms.CfnAlias
 */
fun software.amazon.awscdk.Construct.cfnAlias(id: String,
                     props: software.amazon.awscdk.services.kms.CfnAliasProps? = null,
                     init: (software.amazon.awscdk.services.kms.CfnAlias.() -> Unit)? = null)
        : software.amazon.awscdk.services.kms.CfnAlias {

    val obj = software.amazon.awscdk.services.kms.CfnAlias(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.kms.EncryptionKey
 */
fun software.amazon.awscdk.Construct.encryptionKey(id: String,
                     props: software.amazon.awscdk.services.kms.EncryptionKeyProps? = null,
                     init: (software.amazon.awscdk.services.kms.EncryptionKey.() -> Unit)? = null)
        : software.amazon.awscdk.services.kms.EncryptionKey {

    val obj = software.amazon.awscdk.services.kms.EncryptionKey(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.kms.CfnKey
 */
fun software.amazon.awscdk.Construct.cfnKey(id: String,
                     props: software.amazon.awscdk.services.kms.CfnKeyProps? = null,
                     init: (software.amazon.awscdk.services.kms.CfnKey.() -> Unit)? = null)
        : software.amazon.awscdk.services.kms.CfnKey {

    val obj = software.amazon.awscdk.services.kms.CfnKey(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.kms.EncryptionKey
 */
fun software.amazon.awscdk.Construct.encryptionKey(id: String,
                     init: (software.amazon.awscdk.services.kms.EncryptionKey.() -> Unit)? = null)
        : software.amazon.awscdk.services.kms.EncryptionKey {

    val obj = software.amazon.awscdk.services.kms.EncryptionKey(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.kms.CfnKeyProps.Builder
 */
fun cfnKeyProps(init: software.amazon.awscdk.services.kms.CfnKeyProps.Builder.() -> Unit): software.amazon.awscdk.services.kms.CfnKeyProps {
    val builder = software.amazon.awscdk.services.kms.CfnKeyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kms.CfnKeyProps.Builder.withEnabled
 */
var software.amazon.awscdk.services.kms.CfnKeyProps.Builder.enabled: Boolean
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }

/**
 * @see software.amazon.awscdk.services.kms.CfnKeyProps.Builder.withDescription
 */
var software.amazon.awscdk.services.kms.CfnKeyProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.kms.CfnKeyProps.Builder.withKeyPolicy
 */
var software.amazon.awscdk.services.kms.CfnKeyProps.Builder.keyPolicy: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on keyPolicy is not supported.")
    set(value) { this.withKeyPolicy(value) }

/**
 * @see software.amazon.awscdk.services.kms.CfnKeyProps.Builder.withEnableKeyRotation
 */
var software.amazon.awscdk.services.kms.CfnKeyProps.Builder.enableKeyRotation: Boolean
    get() = throw NoSuchFieldException("Get on enableKeyRotation is not supported.")
    set(value) { this.withEnableKeyRotation(value) }

/**
 * @see software.amazon.awscdk.services.kms.CfnKeyProps.Builder.withKeyUsage
 */
var software.amazon.awscdk.services.kms.CfnKeyProps.Builder.keyUsage: String
    get() = throw NoSuchFieldException("Get on keyUsage is not supported.")
    set(value) { this.withKeyUsage(value) }

/**
 * @see software.amazon.awscdk.services.kms.CfnKeyProps.Builder.withPendingWindowInDays
 */
var software.amazon.awscdk.services.kms.CfnKeyProps.Builder.pendingWindowInDays: Number
    get() = throw NoSuchFieldException("Get on pendingWindowInDays is not supported.")
    set(value) { this.withPendingWindowInDays(value) }


/**
 * @see software.amazon.awscdk.services.kms.EncryptionKeyAliasProps.Builder
 */
fun encryptionKeyAliasProps(init: software.amazon.awscdk.services.kms.EncryptionKeyAliasProps.Builder.() -> Unit): software.amazon.awscdk.services.kms.EncryptionKeyAliasProps {
    val builder = software.amazon.awscdk.services.kms.EncryptionKeyAliasProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kms.EncryptionKeyAliasProps.Builder.withKey
 */
var software.amazon.awscdk.services.kms.EncryptionKeyAliasProps.Builder.key: software.amazon.awscdk.services.kms.IEncryptionKey
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.kms.EncryptionKeyAliasProps.Builder.withAlias
 */
var software.amazon.awscdk.services.kms.EncryptionKeyAliasProps.Builder.alias: String
    get() = throw NoSuchFieldException("Get on alias is not supported.")
    set(value) { this.withAlias(value) }


/**
 * @see software.amazon.awscdk.services.kms.EncryptionKeyImportProps.Builder
 */
fun encryptionKeyImportProps(init: software.amazon.awscdk.services.kms.EncryptionKeyImportProps.Builder.() -> Unit): software.amazon.awscdk.services.kms.EncryptionKeyImportProps {
    val builder = software.amazon.awscdk.services.kms.EncryptionKeyImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kms.EncryptionKeyImportProps.Builder.withKeyArn
 */
var software.amazon.awscdk.services.kms.EncryptionKeyImportProps.Builder.keyArn: String
    get() = throw NoSuchFieldException("Get on keyArn is not supported.")
    set(value) { this.withKeyArn(value) }


/**
 * @see software.amazon.awscdk.services.kms.EncryptionKeyProps.Builder
 */
fun encryptionKeyProps(init: software.amazon.awscdk.services.kms.EncryptionKeyProps.Builder.() -> Unit): software.amazon.awscdk.services.kms.EncryptionKeyProps {
    val builder = software.amazon.awscdk.services.kms.EncryptionKeyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kms.EncryptionKeyProps.Builder.withEnabled
 */
var software.amazon.awscdk.services.kms.EncryptionKeyProps.Builder.enabled: Boolean
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }

/**
 * @see software.amazon.awscdk.services.kms.EncryptionKeyProps.Builder.withPolicy
 */
var software.amazon.awscdk.services.kms.EncryptionKeyProps.Builder.policy: software.amazon.awscdk.services.iam.PolicyDocument
    get() = throw NoSuchFieldException("Get on policy is not supported.")
    set(value) { this.withPolicy(value) }

/**
 * @see software.amazon.awscdk.services.kms.EncryptionKeyProps.Builder.withDescription
 */
var software.amazon.awscdk.services.kms.EncryptionKeyProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.kms.EncryptionKeyProps.Builder.withRetain
 */
var software.amazon.awscdk.services.kms.EncryptionKeyProps.Builder.retain: Boolean
    get() = throw NoSuchFieldException("Get on retain is not supported.")
    set(value) { this.withRetain(value) }

/**
 * @see software.amazon.awscdk.services.kms.EncryptionKeyProps.Builder.withEnableKeyRotation
 */
var software.amazon.awscdk.services.kms.EncryptionKeyProps.Builder.enableKeyRotation: Boolean
    get() = throw NoSuchFieldException("Get on enableKeyRotation is not supported.")
    set(value) { this.withEnableKeyRotation(value) }


/**
 * @see software.amazon.awscdk.services.kms.CfnAliasProps.Builder
 */
fun cfnAliasProps(init: software.amazon.awscdk.services.kms.CfnAliasProps.Builder.() -> Unit): software.amazon.awscdk.services.kms.CfnAliasProps {
    val builder = software.amazon.awscdk.services.kms.CfnAliasProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.kms.CfnAliasProps.Builder.withAliasName
 */
var software.amazon.awscdk.services.kms.CfnAliasProps.Builder.aliasName: String
    get() = throw NoSuchFieldException("Get on aliasName is not supported.")
    set(value) { this.withAliasName(value) }

/**
 * @see software.amazon.awscdk.services.kms.CfnAliasProps.Builder.withTargetKeyId
 */
var software.amazon.awscdk.services.kms.CfnAliasProps.Builder.targetKeyId: String
    get() = throw NoSuchFieldException("Get on targetKeyId is not supported.")
    set(value) { this.withTargetKeyId(value) }
