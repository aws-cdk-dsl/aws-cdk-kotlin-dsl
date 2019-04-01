package software.amazon.awscdk.dsl.services.cognito
/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolClient
 */
fun software.amazon.awscdk.Construct.cfnUserPoolClient(id: String,
                     props: software.amazon.awscdk.services.cognito.CfnUserPoolClientProps? = null,
                     init: (software.amazon.awscdk.services.cognito.CfnUserPoolClient.() -> Unit)? = null)
        : software.amazon.awscdk.services.cognito.CfnUserPoolClient {

    val obj = software.amazon.awscdk.services.cognito.CfnUserPoolClient(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment
 */
fun software.amazon.awscdk.Construct.cfnIdentityPoolRoleAttachment(id: String,
                     props: software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps? = null,
                     init: (software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.() -> Unit)? = null)
        : software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment {

    val obj = software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolUser
 */
fun software.amazon.awscdk.Construct.cfnUserPoolUser(id: String,
                     props: software.amazon.awscdk.services.cognito.CfnUserPoolUserProps? = null,
                     init: (software.amazon.awscdk.services.cognito.CfnUserPoolUser.() -> Unit)? = null)
        : software.amazon.awscdk.services.cognito.CfnUserPoolUser {

    val obj = software.amazon.awscdk.services.cognito.CfnUserPoolUser(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment
 */
fun software.amazon.awscdk.Construct.cfnUserPoolUserToGroupAttachment(id: String,
                     props: software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps? = null,
                     init: (software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment.() -> Unit)? = null)
        : software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment {

    val obj = software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool
 */
fun software.amazon.awscdk.Construct.cfnUserPool(id: String,
                     props: software.amazon.awscdk.services.cognito.CfnUserPoolProps? = null,
                     init: (software.amazon.awscdk.services.cognito.CfnUserPool.() -> Unit)? = null)
        : software.amazon.awscdk.services.cognito.CfnUserPool {

    val obj = software.amazon.awscdk.services.cognito.CfnUserPool(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolGroup
 */
fun software.amazon.awscdk.Construct.cfnUserPoolGroup(id: String,
                     props: software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps? = null,
                     init: (software.amazon.awscdk.services.cognito.CfnUserPoolGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.cognito.CfnUserPoolGroup {

    val obj = software.amazon.awscdk.services.cognito.CfnUserPoolGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cognito.UserPool
 */
fun software.amazon.awscdk.Construct.userPool(id: String,
                     props: software.amazon.awscdk.services.cognito.UserPoolProps? = null,
                     init: (software.amazon.awscdk.services.cognito.UserPool.() -> Unit)? = null)
        : software.amazon.awscdk.services.cognito.UserPool {

    val obj = software.amazon.awscdk.services.cognito.UserPool(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPool
 */
fun software.amazon.awscdk.Construct.cfnIdentityPool(id: String,
                     props: software.amazon.awscdk.services.cognito.CfnIdentityPoolProps? = null,
                     init: (software.amazon.awscdk.services.cognito.CfnIdentityPool.() -> Unit)? = null)
        : software.amazon.awscdk.services.cognito.CfnIdentityPool {

    val obj = software.amazon.awscdk.services.cognito.CfnIdentityPool(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cognito.UserPoolClient
 */
fun software.amazon.awscdk.Construct.userPoolClient(id: String,
                     props: software.amazon.awscdk.services.cognito.UserPoolClientProps? = null,
                     init: (software.amazon.awscdk.services.cognito.UserPoolClient.() -> Unit)? = null)
        : software.amazon.awscdk.services.cognito.UserPoolClient {

    val obj = software.amazon.awscdk.services.cognito.UserPoolClient(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool
 */
fun software.amazon.awscdk.Construct.cfnUserPool(id: String,
                     init: (software.amazon.awscdk.services.cognito.CfnUserPool.() -> Unit)? = null)
        : software.amazon.awscdk.services.cognito.CfnUserPool {

    val obj = software.amazon.awscdk.services.cognito.CfnUserPool(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty.Builder
 */
fun smsConfigurationProperty(init: software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty {
    val builder = software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty.Builder.withSnsCallerArn
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty.Builder.snsCallerArn: String
    get() = throw NoSuchFieldException("Get on snsCallerArn is not supported.")
    set(value) { this.withSnsCallerArn(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty.Builder.withExternalId
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty.Builder.externalId: String
    get() = throw NoSuchFieldException("Get on externalId is not supported.")
    set(value) { this.withExternalId(value) }


/**
 * @see software.amazon.awscdk.services.cognito.UserPoolProps.Builder
 */
fun userPoolProps(init: software.amazon.awscdk.services.cognito.UserPoolProps.Builder.() -> Unit): software.amazon.awscdk.services.cognito.UserPoolProps {
    val builder = software.amazon.awscdk.services.cognito.UserPoolProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.UserPoolProps.Builder.withLambdaTriggers
 */
var software.amazon.awscdk.services.cognito.UserPoolProps.Builder.lambdaTriggers: software.amazon.awscdk.services.cognito.UserPoolTriggers
    get() = throw NoSuchFieldException("Get on lambdaTriggers is not supported.")
    set(value) { this.withLambdaTriggers(value) }

/**
 * @see software.amazon.awscdk.services.cognito.UserPoolProps.Builder.withPoolName
 */
var software.amazon.awscdk.services.cognito.UserPoolProps.Builder.poolName: String
    get() = throw NoSuchFieldException("Get on poolName is not supported.")
    set(value) { this.withPoolName(value) }

/**
 * @see software.amazon.awscdk.services.cognito.UserPoolProps.Builder.withSignInType
 */
var software.amazon.awscdk.services.cognito.UserPoolProps.Builder.signInType: software.amazon.awscdk.services.cognito.SignInType
    get() = throw NoSuchFieldException("Get on signInType is not supported.")
    set(value) { this.withSignInType(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty.Builder
 */
fun deviceConfigurationProperty(init: software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty {
    val builder = software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty.Builder.withChallengeRequiredOnNewDevice
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty.Builder.challengeRequiredOnNewDevice: Boolean
    get() = throw NoSuchFieldException("Get on challengeRequiredOnNewDevice is not supported.")
    set(value) { this.withChallengeRequiredOnNewDevice(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty.Builder.withDeviceOnlyRememberedOnUserPrompt
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty.Builder.deviceOnlyRememberedOnUserPrompt: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on deviceOnlyRememberedOnUserPrompt is not supported.")
    set(value) { this.withDeviceOnlyRememberedOnUserPrompt(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.Builder
 */
fun cfnUserPoolUserProps(init: software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnUserPoolUserProps {
    val builder = software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.Builder.withUsername
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.Builder.username: String
    get() = throw NoSuchFieldException("Get on username is not supported.")
    set(value) { this.withUsername(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.Builder.withUserPoolId
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.Builder.userPoolId: String
    get() = throw NoSuchFieldException("Get on userPoolId is not supported.")
    set(value) { this.withUserPoolId(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.Builder.withMessageAction
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.Builder.messageAction: String
    get() = throw NoSuchFieldException("Get on messageAction is not supported.")
    set(value) { this.withMessageAction(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.Builder.withForceAliasCreation
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.Builder.forceAliasCreation: Boolean
    get() = throw NoSuchFieldException("Get on forceAliasCreation is not supported.")
    set(value) { this.withForceAliasCreation(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.Builder.withUserAttributes
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.Builder.userAttributes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on userAttributes is not supported.")
    set(value) { this.withUserAttributes(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.Builder.withValidationData
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.Builder.validationData: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on validationData is not supported.")
    set(value) { this.withValidationData(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder
 */
fun cfnIdentityPoolProps(init: software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnIdentityPoolProps {
    val builder = software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder.withAllowUnauthenticatedIdentities
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder.allowUnauthenticatedIdentities: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on allowUnauthenticatedIdentities is not supported.")
    set(value) { this.withAllowUnauthenticatedIdentities(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder.withCognitoEvents
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder.cognitoEvents: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on cognitoEvents is not supported.")
    set(value) { this.withCognitoEvents(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder.withCognitoIdentityProviders
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder.cognitoIdentityProviders: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on cognitoIdentityProviders is not supported.")
    set(value) { this.withCognitoIdentityProviders(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder.withCognitoStreams
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder.cognitoStreams: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on cognitoStreams is not supported.")
    set(value) { this.withCognitoStreams(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder.withDeveloperProviderName
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder.developerProviderName: String
    get() = throw NoSuchFieldException("Get on developerProviderName is not supported.")
    set(value) { this.withDeveloperProviderName(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder.withIdentityPoolName
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder.identityPoolName: String
    get() = throw NoSuchFieldException("Get on identityPoolName is not supported.")
    set(value) { this.withIdentityPoolName(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder.withPushSync
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder.pushSync: software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty
    get() = throw NoSuchFieldException("Get on pushSync is not supported.")
    set(value) { this.withPushSync(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder.withSupportedLoginProviders
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder.supportedLoginProviders: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on supportedLoginProviders is not supported.")
    set(value) { this.withSupportedLoginProviders(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty.Builder
 */
fun pushSyncProperty(init: software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty {
    val builder = software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty.Builder
 */
fun inviteMessageTemplateProperty(init: software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty {
    val builder = software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty.Builder.withEmailMessage
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty.Builder.emailMessage: String
    get() = throw NoSuchFieldException("Get on emailMessage is not supported.")
    set(value) { this.withEmailMessage(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty.Builder.withEmailSubject
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty.Builder.emailSubject: String
    get() = throw NoSuchFieldException("Get on emailSubject is not supported.")
    set(value) { this.withEmailSubject(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty.Builder.withSmsMessage
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty.Builder.smsMessage: String
    get() = throw NoSuchFieldException("Get on smsMessage is not supported.")
    set(value) { this.withSmsMessage(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps.Builder
 */
fun cfnIdentityPoolRoleAttachmentProps(init: software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps {
    val builder = software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps.Builder.withRoles
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps.Builder.roles: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on roles is not supported.")
    set(value) { this.withRoles(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps.Builder.withIdentityPoolId
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps.Builder.identityPoolId: String
    get() = throw NoSuchFieldException("Get on identityPoolId is not supported.")
    set(value) { this.withIdentityPoolId(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps.Builder.withRoleMappings
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps.Builder.roleMappings: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on roleMappings is not supported.")
    set(value) { this.withRoleMappings(value) }


/**
 * @see software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder
 */
fun userPoolTriggers(init: software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder.() -> Unit): software.amazon.awscdk.services.cognito.UserPoolTriggers {
    val builder = software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder.withCreateAuthChallenge
 */
var software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder.createAuthChallenge: software.amazon.awscdk.services.lambda.IFunction
    get() = throw NoSuchFieldException("Get on createAuthChallenge is not supported.")
    set(value) { this.withCreateAuthChallenge(value) }

/**
 * @see software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder.withCustomMessage
 */
var software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder.customMessage: software.amazon.awscdk.services.lambda.IFunction
    get() = throw NoSuchFieldException("Get on customMessage is not supported.")
    set(value) { this.withCustomMessage(value) }

/**
 * @see software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder.withDefineAuthChallenge
 */
var software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder.defineAuthChallenge: software.amazon.awscdk.services.lambda.IFunction
    get() = throw NoSuchFieldException("Get on defineAuthChallenge is not supported.")
    set(value) { this.withDefineAuthChallenge(value) }

/**
 * @see software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder.withPostAuthentication
 */
var software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder.postAuthentication: software.amazon.awscdk.services.lambda.IFunction
    get() = throw NoSuchFieldException("Get on postAuthentication is not supported.")
    set(value) { this.withPostAuthentication(value) }

/**
 * @see software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder.withPostConfirmation
 */
var software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder.postConfirmation: software.amazon.awscdk.services.lambda.IFunction
    get() = throw NoSuchFieldException("Get on postConfirmation is not supported.")
    set(value) { this.withPostConfirmation(value) }

/**
 * @see software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder.withPreAuthentication
 */
var software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder.preAuthentication: software.amazon.awscdk.services.lambda.IFunction
    get() = throw NoSuchFieldException("Get on preAuthentication is not supported.")
    set(value) { this.withPreAuthentication(value) }

/**
 * @see software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder.withPreSignUp
 */
var software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder.preSignUp: software.amazon.awscdk.services.lambda.IFunction
    get() = throw NoSuchFieldException("Get on preSignUp is not supported.")
    set(value) { this.withPreSignUp(value) }

/**
 * @see software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder.withVerifyAuthChallengeResponse
 */
var software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder.verifyAuthChallengeResponse: software.amazon.awscdk.services.lambda.IFunction
    get() = throw NoSuchFieldException("Get on verifyAuthChallengeResponse is not supported.")
    set(value) { this.withVerifyAuthChallengeResponse(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder
 */
fun cfnUserPoolProps(init: software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnUserPoolProps {
    val builder = software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.withSmsConfiguration
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.smsConfiguration: software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty
    get() = throw NoSuchFieldException("Get on smsConfiguration is not supported.")
    set(value) { this.withSmsConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.withSmsAuthenticationMessage
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.smsAuthenticationMessage: String
    get() = throw NoSuchFieldException("Get on smsAuthenticationMessage is not supported.")
    set(value) { this.withSmsAuthenticationMessage(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.withSmsVerificationMessage
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.smsVerificationMessage: String
    get() = throw NoSuchFieldException("Get on smsVerificationMessage is not supported.")
    set(value) { this.withSmsVerificationMessage(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.withUserPoolName
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.userPoolName: String
    get() = throw NoSuchFieldException("Get on userPoolName is not supported.")
    set(value) { this.withUserPoolName(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.withUserPoolTags
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.userPoolTags: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on userPoolTags is not supported.")
    set(value) { this.withUserPoolTags(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.withPolicies
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.policies: software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty
    get() = throw NoSuchFieldException("Get on policies is not supported.")
    set(value) { this.withPolicies(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.withSchema
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.schema: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on schema is not supported.")
    set(value) { this.withSchema(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.withLambdaConfig
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.lambdaConfig: software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty
    get() = throw NoSuchFieldException("Get on lambdaConfig is not supported.")
    set(value) { this.withLambdaConfig(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.withAdminCreateUserConfig
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.adminCreateUserConfig: software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty
    get() = throw NoSuchFieldException("Get on adminCreateUserConfig is not supported.")
    set(value) { this.withAdminCreateUserConfig(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.withEmailVerificationSubject
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.emailVerificationSubject: String
    get() = throw NoSuchFieldException("Get on emailVerificationSubject is not supported.")
    set(value) { this.withEmailVerificationSubject(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.withMfaConfiguration
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.mfaConfiguration: String
    get() = throw NoSuchFieldException("Get on mfaConfiguration is not supported.")
    set(value) { this.withMfaConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.withEmailVerificationMessage
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.emailVerificationMessage: String
    get() = throw NoSuchFieldException("Get on emailVerificationMessage is not supported.")
    set(value) { this.withEmailVerificationMessage(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.withDeviceConfiguration
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.deviceConfiguration: software.amazon.awscdk.services.cognito.CfnUserPool.DeviceConfigurationProperty
    get() = throw NoSuchFieldException("Get on deviceConfiguration is not supported.")
    set(value) { this.withDeviceConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.withEmailConfiguration
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolProps.Builder.emailConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on emailConfiguration is not supported.")
    set(value) { this.withEmailConfiguration(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty.Builder
 */
fun stringAttributeConstraintsProperty(init: software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty {
    val builder = software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty.Builder.withMaxLength
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty.Builder.maxLength: String
    get() = throw NoSuchFieldException("Get on maxLength is not supported.")
    set(value) { this.withMaxLength(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty.Builder.withMinLength
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty.Builder.minLength: String
    get() = throw NoSuchFieldException("Get on minLength is not supported.")
    set(value) { this.withMinLength(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty.Builder
 */
fun cognitoIdentityProviderProperty(init: software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty {
    val builder = software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty.Builder.withClientId
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty.Builder.clientId: String
    get() = throw NoSuchFieldException("Get on clientId is not supported.")
    set(value) { this.withClientId(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty.Builder.withServerSideTokenCheck
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty.Builder.serverSideTokenCheck: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on serverSideTokenCheck is not supported.")
    set(value) { this.withServerSideTokenCheck(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty.Builder.withProviderName
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty.Builder.providerName: String
    get() = throw NoSuchFieldException("Get on providerName is not supported.")
    set(value) { this.withProviderName(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty.Builder
 */
fun roleMappingProperty(init: software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty {
    val builder = software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty.Builder.withAmbiguousRoleResolution
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty.Builder.ambiguousRoleResolution: String
    get() = throw NoSuchFieldException("Get on ambiguousRoleResolution is not supported.")
    set(value) { this.withAmbiguousRoleResolution(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty.Builder.withRulesConfiguration
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty.Builder.rulesConfiguration: software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty
    get() = throw NoSuchFieldException("Get on rulesConfiguration is not supported.")
    set(value) { this.withRulesConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty.Builder.withType
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.services.cognito.UserPoolImportProps.Builder
 */
fun userPoolImportProps(init: software.amazon.awscdk.services.cognito.UserPoolImportProps.Builder.() -> Unit): software.amazon.awscdk.services.cognito.UserPoolImportProps {
    val builder = software.amazon.awscdk.services.cognito.UserPoolImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.UserPoolImportProps.Builder.withUserPoolId
 */
var software.amazon.awscdk.services.cognito.UserPoolImportProps.Builder.userPoolId: String
    get() = throw NoSuchFieldException("Get on userPoolId is not supported.")
    set(value) { this.withUserPoolId(value) }

/**
 * @see software.amazon.awscdk.services.cognito.UserPoolImportProps.Builder.withUserPoolArn
 */
var software.amazon.awscdk.services.cognito.UserPoolImportProps.Builder.userPoolArn: String
    get() = throw NoSuchFieldException("Get on userPoolArn is not supported.")
    set(value) { this.withUserPoolArn(value) }

/**
 * @see software.amazon.awscdk.services.cognito.UserPoolImportProps.Builder.withUserPoolProviderName
 */
var software.amazon.awscdk.services.cognito.UserPoolImportProps.Builder.userPoolProviderName: String
    get() = throw NoSuchFieldException("Get on userPoolProviderName is not supported.")
    set(value) { this.withUserPoolProviderName(value) }

/**
 * @see software.amazon.awscdk.services.cognito.UserPoolImportProps.Builder.withUserPoolProviderUrl
 */
var software.amazon.awscdk.services.cognito.UserPoolImportProps.Builder.userPoolProviderUrl: String
    get() = throw NoSuchFieldException("Get on userPoolProviderUrl is not supported.")
    set(value) { this.withUserPoolProviderUrl(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty.Builder
 */
fun attributeTypeProperty(init: software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty {
    val builder = software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty.Builder.withValue
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty.Builder.withName
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty.Builder
 */
fun rulesConfigurationTypeProperty(init: software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty {
    val builder = software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty.Builder.withRules
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty.Builder.rules: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on rules is not supported.")
    set(value) { this.withRules(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty.Builder
 */
fun policiesProperty(init: software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty {
    val builder = software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty.Builder.withPasswordPolicy
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.PoliciesProperty.Builder.passwordPolicy: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on passwordPolicy is not supported.")
    set(value) { this.withPasswordPolicy(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty.Builder
 */
fun numberAttributeConstraintsProperty(init: software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty {
    val builder = software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty.Builder.withMaxValue
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty.Builder.maxValue: String
    get() = throw NoSuchFieldException("Get on maxValue is not supported.")
    set(value) { this.withMaxValue(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty.Builder.withMinValue
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty.Builder.minValue: String
    get() = throw NoSuchFieldException("Get on minValue is not supported.")
    set(value) { this.withMinValue(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty.Builder
 */
fun mappingRuleProperty(init: software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty {
    val builder = software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty.Builder.withValue
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty.Builder.withClaim
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty.Builder.claim: String
    get() = throw NoSuchFieldException("Get on claim is not supported.")
    set(value) { this.withClaim(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty.Builder.withMatchType
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty.Builder.matchType: String
    get() = throw NoSuchFieldException("Get on matchType is not supported.")
    set(value) { this.withMatchType(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty.Builder
 */
fun cognitoStreamsProperty(init: software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty {
    val builder = software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty.Builder.withRoleArn
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty.Builder.withStreamingStatus
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty.Builder.streamingStatus: String
    get() = throw NoSuchFieldException("Get on streamingStatus is not supported.")
    set(value) { this.withStreamingStatus(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty.Builder.withStreamName
 */
var software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty.Builder.streamName: String
    get() = throw NoSuchFieldException("Get on streamName is not supported.")
    set(value) { this.withStreamName(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty.Builder
 */
fun emailConfigurationProperty(init: software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty {
    val builder = software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty.Builder.withSourceArn
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty.Builder.sourceArn: String
    get() = throw NoSuchFieldException("Get on sourceArn is not supported.")
    set(value) { this.withSourceArn(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty.Builder.withReplyToEmailAddress
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty.Builder.replyToEmailAddress: String
    get() = throw NoSuchFieldException("Get on replyToEmailAddress is not supported.")
    set(value) { this.withReplyToEmailAddress(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.Builder
 */
fun cfnUserPoolGroupProps(init: software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps {
    val builder = software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.Builder.withGroupName
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.Builder.groupName: String
    get() = throw NoSuchFieldException("Get on groupName is not supported.")
    set(value) { this.withGroupName(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.Builder.withRoleArn
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.Builder.withUserPoolId
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.Builder.userPoolId: String
    get() = throw NoSuchFieldException("Get on userPoolId is not supported.")
    set(value) { this.withUserPoolId(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.Builder.withPrecedence
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.Builder.precedence: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on precedence is not supported.")
    set(value) { this.withPrecedence(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.Builder.withDescription
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolClientProps.Builder
 */
fun cfnUserPoolClientProps(init: software.amazon.awscdk.services.cognito.CfnUserPoolClientProps.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnUserPoolClientProps {
    val builder = software.amazon.awscdk.services.cognito.CfnUserPoolClientProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolClientProps.Builder.withGenerateSecret
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolClientProps.Builder.generateSecret: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on generateSecret is not supported.")
    set(value) { this.withGenerateSecret(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolClientProps.Builder.withRefreshTokenValidity
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolClientProps.Builder.refreshTokenValidity: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on refreshTokenValidity is not supported.")
    set(value) { this.withRefreshTokenValidity(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolClientProps.Builder.withUserPoolId
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolClientProps.Builder.userPoolId: String
    get() = throw NoSuchFieldException("Get on userPoolId is not supported.")
    set(value) { this.withUserPoolId(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolClientProps.Builder.withClientName
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolClientProps.Builder.clientName: String
    get() = throw NoSuchFieldException("Get on clientName is not supported.")
    set(value) { this.withClientName(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps.Builder
 */
fun cfnUserPoolUserToGroupAttachmentProps(init: software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps {
    val builder = software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps.Builder.withGroupName
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps.Builder.groupName: String
    get() = throw NoSuchFieldException("Get on groupName is not supported.")
    set(value) { this.withGroupName(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps.Builder.withUsername
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps.Builder.username: String
    get() = throw NoSuchFieldException("Get on username is not supported.")
    set(value) { this.withUsername(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps.Builder.withUserPoolId
 */
var software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps.Builder.userPoolId: String
    get() = throw NoSuchFieldException("Get on userPoolId is not supported.")
    set(value) { this.withUserPoolId(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty.Builder
 */
fun adminCreateUserConfigProperty(init: software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty {
    val builder = software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty.Builder.withAllowAdminCreateUserOnly
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty.Builder.allowAdminCreateUserOnly: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on allowAdminCreateUserOnly is not supported.")
    set(value) { this.withAllowAdminCreateUserOnly(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty.Builder.withInviteMessageTemplate
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty.Builder.inviteMessageTemplate: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on inviteMessageTemplate is not supported.")
    set(value) { this.withInviteMessageTemplate(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty.Builder.withUnusedAccountValidityDays
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty.Builder.unusedAccountValidityDays: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on unusedAccountValidityDays is not supported.")
    set(value) { this.withUnusedAccountValidityDays(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.Builder
 */
fun passwordPolicyProperty(init: software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty {
    val builder = software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.Builder.withRequireLowercase
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.Builder.requireLowercase: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on requireLowercase is not supported.")
    set(value) { this.withRequireLowercase(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.Builder.withRequireNumbers
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.Builder.requireNumbers: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on requireNumbers is not supported.")
    set(value) { this.withRequireNumbers(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.Builder.withRequireSymbols
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.Builder.requireSymbols: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on requireSymbols is not supported.")
    set(value) { this.withRequireSymbols(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.Builder.withRequireUppercase
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.Builder.requireUppercase: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on requireUppercase is not supported.")
    set(value) { this.withRequireUppercase(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.Builder.withMinimumLength
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.PasswordPolicyProperty.Builder.minimumLength: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on minimumLength is not supported.")
    set(value) { this.withMinimumLength(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder
 */
fun schemaAttributeProperty(init: software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty {
    val builder = software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder.withRequired
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder.required: Boolean
    get() = throw NoSuchFieldException("Get on required is not supported.")
    set(value) { this.withRequired(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder.withDeveloperOnlyAttribute
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder.developerOnlyAttribute: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on developerOnlyAttribute is not supported.")
    set(value) { this.withDeveloperOnlyAttribute(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder.withAttributeDataType
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder.attributeDataType: String
    get() = throw NoSuchFieldException("Get on attributeDataType is not supported.")
    set(value) { this.withAttributeDataType(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder.withStringAttributeConstraints
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder.stringAttributeConstraints: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on stringAttributeConstraints is not supported.")
    set(value) { this.withStringAttributeConstraints(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder.withNumberAttributeConstraints
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder.numberAttributeConstraints: software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty
    get() = throw NoSuchFieldException("Get on numberAttributeConstraints is not supported.")
    set(value) { this.withNumberAttributeConstraints(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder.withMutable
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder.mutable: Boolean
    get() = throw NoSuchFieldException("Get on mutable is not supported.")
    set(value) { this.withMutable(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder.withName
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder
 */
fun lambdaConfigProperty(init: software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty {
    val builder = software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder.withCreateAuthChallenge
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder.createAuthChallenge: String
    get() = throw NoSuchFieldException("Get on createAuthChallenge is not supported.")
    set(value) { this.withCreateAuthChallenge(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder.withCustomMessage
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder.customMessage: String
    get() = throw NoSuchFieldException("Get on customMessage is not supported.")
    set(value) { this.withCustomMessage(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder.withDefineAuthChallenge
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder.defineAuthChallenge: String
    get() = throw NoSuchFieldException("Get on defineAuthChallenge is not supported.")
    set(value) { this.withDefineAuthChallenge(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder.withPostAuthentication
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder.postAuthentication: String
    get() = throw NoSuchFieldException("Get on postAuthentication is not supported.")
    set(value) { this.withPostAuthentication(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder.withPostConfirmation
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder.postConfirmation: String
    get() = throw NoSuchFieldException("Get on postConfirmation is not supported.")
    set(value) { this.withPostConfirmation(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder.withPreAuthentication
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder.preAuthentication: String
    get() = throw NoSuchFieldException("Get on preAuthentication is not supported.")
    set(value) { this.withPreAuthentication(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder.withPreSignUp
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder.preSignUp: String
    get() = throw NoSuchFieldException("Get on preSignUp is not supported.")
    set(value) { this.withPreSignUp(value) }

/**
 * @see software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder.withVerifyAuthChallengeResponse
 */
var software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder.verifyAuthChallengeResponse: String
    get() = throw NoSuchFieldException("Get on verifyAuthChallengeResponse is not supported.")
    set(value) { this.withVerifyAuthChallengeResponse(value) }


/**
 * @see software.amazon.awscdk.services.cognito.UserPoolClientProps.Builder
 */
fun userPoolClientProps(init: software.amazon.awscdk.services.cognito.UserPoolClientProps.Builder.() -> Unit): software.amazon.awscdk.services.cognito.UserPoolClientProps {
    val builder = software.amazon.awscdk.services.cognito.UserPoolClientProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cognito.UserPoolClientProps.Builder.withGenerateSecret
 */
var software.amazon.awscdk.services.cognito.UserPoolClientProps.Builder.generateSecret: Boolean
    get() = throw NoSuchFieldException("Get on generateSecret is not supported.")
    set(value) { this.withGenerateSecret(value) }

/**
 * @see software.amazon.awscdk.services.cognito.UserPoolClientProps.Builder.withClientName
 */
var software.amazon.awscdk.services.cognito.UserPoolClientProps.Builder.clientName: String
    get() = throw NoSuchFieldException("Get on clientName is not supported.")
    set(value) { this.withClientName(value) }

/**
 * @see software.amazon.awscdk.services.cognito.UserPoolClientProps.Builder.withUserPool
 */
var software.amazon.awscdk.services.cognito.UserPoolClientProps.Builder.userPool: software.amazon.awscdk.services.cognito.IUserPool
    get() = throw NoSuchFieldException("Get on userPool is not supported.")
    set(value) { this.withUserPool(value) }
