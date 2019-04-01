package software.amazon.awscdk.dsl.services.sdb
/**
 * @see software.amazon.awscdk.services.sdb.CfnDomain
 */
fun software.amazon.awscdk.Construct.cfnDomain(id: String,
                     props: software.amazon.awscdk.services.sdb.CfnDomainProps? = null,
                     init: (software.amazon.awscdk.services.sdb.CfnDomain.() -> Unit)? = null)
        : software.amazon.awscdk.services.sdb.CfnDomain {

    val obj = software.amazon.awscdk.services.sdb.CfnDomain(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sdb.CfnDomain
 */
fun software.amazon.awscdk.Construct.cfnDomain(id: String,
                     init: (software.amazon.awscdk.services.sdb.CfnDomain.() -> Unit)? = null)
        : software.amazon.awscdk.services.sdb.CfnDomain {

    val obj = software.amazon.awscdk.services.sdb.CfnDomain(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.sdb.CfnDomainProps.Builder
 */
fun cfnDomainProps(init: software.amazon.awscdk.services.sdb.CfnDomainProps.Builder.() -> Unit): software.amazon.awscdk.services.sdb.CfnDomainProps {
    val builder = software.amazon.awscdk.services.sdb.CfnDomainProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sdb.CfnDomainProps.Builder.withDescription
 */
var software.amazon.awscdk.services.sdb.CfnDomainProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }
