package software.amazon.awscdk.dsl.services.ram
/**
 * @see software.amazon.awscdk.services.ram.CfnResourceShare
 */
fun software.amazon.awscdk.Construct.cfnResourceShare(id: String,
                     props: software.amazon.awscdk.services.ram.CfnResourceShareProps? = null,
                     init: (software.amazon.awscdk.services.ram.CfnResourceShare.() -> Unit)? = null)
        : software.amazon.awscdk.services.ram.CfnResourceShare {

    val obj = software.amazon.awscdk.services.ram.CfnResourceShare(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.ram.CfnResourceShareProps.Builder
 */
fun cfnResourceShareProps(init: software.amazon.awscdk.services.ram.CfnResourceShareProps.Builder.() -> Unit): software.amazon.awscdk.services.ram.CfnResourceShareProps {
    val builder = software.amazon.awscdk.services.ram.CfnResourceShareProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.ram.CfnResourceShareProps.Builder.withAllowExternalPrincipals
 */
var software.amazon.awscdk.services.ram.CfnResourceShareProps.Builder.allowExternalPrincipals: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on allowExternalPrincipals is not supported.")
    set(value) { this.withAllowExternalPrincipals(value) }

/**
 * @see software.amazon.awscdk.services.ram.CfnResourceShareProps.Builder.withName
 */
var software.amazon.awscdk.services.ram.CfnResourceShareProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }
