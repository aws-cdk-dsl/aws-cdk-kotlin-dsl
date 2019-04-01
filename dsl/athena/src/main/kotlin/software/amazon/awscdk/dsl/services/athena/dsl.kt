package software.amazon.awscdk.dsl.services.athena
/**
 * @see software.amazon.awscdk.services.athena.CfnNamedQuery
 */
fun software.amazon.awscdk.Construct.cfnNamedQuery(id: String,
                     props: software.amazon.awscdk.services.athena.CfnNamedQueryProps? = null,
                     init: (software.amazon.awscdk.services.athena.CfnNamedQuery.() -> Unit)? = null)
        : software.amazon.awscdk.services.athena.CfnNamedQuery {

    val obj = software.amazon.awscdk.services.athena.CfnNamedQuery(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.athena.CfnNamedQueryProps.Builder
 */
fun cfnNamedQueryProps(init: software.amazon.awscdk.services.athena.CfnNamedQueryProps.Builder.() -> Unit): software.amazon.awscdk.services.athena.CfnNamedQueryProps {
    val builder = software.amazon.awscdk.services.athena.CfnNamedQueryProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.athena.CfnNamedQueryProps.Builder.withDatabase
 */
var software.amazon.awscdk.services.athena.CfnNamedQueryProps.Builder.database: String
    get() = throw NoSuchFieldException("Get on database is not supported.")
    set(value) { this.withDatabase(value) }

/**
 * @see software.amazon.awscdk.services.athena.CfnNamedQueryProps.Builder.withQueryString
 */
var software.amazon.awscdk.services.athena.CfnNamedQueryProps.Builder.queryString: String
    get() = throw NoSuchFieldException("Get on queryString is not supported.")
    set(value) { this.withQueryString(value) }

/**
 * @see software.amazon.awscdk.services.athena.CfnNamedQueryProps.Builder.withName
 */
var software.amazon.awscdk.services.athena.CfnNamedQueryProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.athena.CfnNamedQueryProps.Builder.withDescription
 */
var software.amazon.awscdk.services.athena.CfnNamedQueryProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }
