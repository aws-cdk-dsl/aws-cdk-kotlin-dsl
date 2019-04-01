package software.amazon.awscdk.dsl.services.directoryservice
/**
 * @see software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD
 */
fun software.amazon.awscdk.Construct.cfnMicrosoftAD(id: String,
                     props: software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps? = null,
                     init: (software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.() -> Unit)? = null)
        : software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD {

    val obj = software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.directoryservice.CfnSimpleAD
 */
fun software.amazon.awscdk.Construct.cfnSimpleAD(id: String,
                     props: software.amazon.awscdk.services.directoryservice.CfnSimpleADProps? = null,
                     init: (software.amazon.awscdk.services.directoryservice.CfnSimpleAD.() -> Unit)? = null)
        : software.amazon.awscdk.services.directoryservice.CfnSimpleAD {

    val obj = software.amazon.awscdk.services.directoryservice.CfnSimpleAD(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder
 */
fun cfnSimpleADProps(init: software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder.() -> Unit): software.amazon.awscdk.services.directoryservice.CfnSimpleADProps {
    val builder = software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder.withSize
 */
var software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder.size: String
    get() = throw NoSuchFieldException("Get on size is not supported.")
    set(value) { this.withSize(value) }

/**
 * @see software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder.withVpcSettings
 */
var software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder.vpcSettings: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on vpcSettings is not supported.")
    set(value) { this.withVpcSettings(value) }

/**
 * @see software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder.withCreateAlias
 */
var software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder.createAlias: Boolean
    get() = throw NoSuchFieldException("Get on createAlias is not supported.")
    set(value) { this.withCreateAlias(value) }

/**
 * @see software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder.withEnableSso
 */
var software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder.enableSso: Boolean
    get() = throw NoSuchFieldException("Get on enableSso is not supported.")
    set(value) { this.withEnableSso(value) }

/**
 * @see software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder.withShortName
 */
var software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder.shortName: String
    get() = throw NoSuchFieldException("Get on shortName is not supported.")
    set(value) { this.withShortName(value) }

/**
 * @see software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder.withPassword
 */
var software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder.password: String
    get() = throw NoSuchFieldException("Get on password is not supported.")
    set(value) { this.withPassword(value) }

/**
 * @see software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder.withName
 */
var software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder.withDescription
 */
var software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder
 */
fun cfnMicrosoftADProps(init: software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder.() -> Unit): software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps {
    val builder = software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder.withVpcSettings
 */
var software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder.vpcSettings: software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.VpcSettingsProperty
    get() = throw NoSuchFieldException("Get on vpcSettings is not supported.")
    set(value) { this.withVpcSettings(value) }

/**
 * @see software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder.withCreateAlias
 */
var software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder.createAlias: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on createAlias is not supported.")
    set(value) { this.withCreateAlias(value) }

/**
 * @see software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder.withEnableSso
 */
var software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder.enableSso: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enableSso is not supported.")
    set(value) { this.withEnableSso(value) }

/**
 * @see software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder.withShortName
 */
var software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder.shortName: String
    get() = throw NoSuchFieldException("Get on shortName is not supported.")
    set(value) { this.withShortName(value) }

/**
 * @see software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder.withPassword
 */
var software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder.password: String
    get() = throw NoSuchFieldException("Get on password is not supported.")
    set(value) { this.withPassword(value) }

/**
 * @see software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder.withName
 */
var software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder.withEdition
 */
var software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder.edition: String
    get() = throw NoSuchFieldException("Get on edition is not supported.")
    set(value) { this.withEdition(value) }


/**
 * @see software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty.Builder
 */
fun vpcSettingsProperty(init: software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty.Builder.() -> Unit): software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty {
    val builder = software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty.Builder.withVpcId
 */
var software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty.Builder.vpcId: String
    get() = throw NoSuchFieldException("Get on vpcId is not supported.")
    set(value) { this.withVpcId(value) }


/**
 * @see software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.VpcSettingsProperty.Builder
 */
fun vpcSettingsProperty(init: software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.VpcSettingsProperty.Builder.() -> Unit): software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.VpcSettingsProperty {
    val builder = software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.VpcSettingsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.VpcSettingsProperty.Builder.withVpcId
 */
var software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.VpcSettingsProperty.Builder.vpcId: String
    get() = throw NoSuchFieldException("Get on vpcId is not supported.")
    set(value) { this.withVpcId(value) }
