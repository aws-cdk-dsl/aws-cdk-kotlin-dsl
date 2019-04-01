package software.amazon.awscdk.dsl.runtimevalues
/**
 * @see software.amazon.awscdk.runtimevalues.RuntimeValue
 */
fun software.amazon.awscdk.Construct.runtimeValue(id: String,
                     props: software.amazon.awscdk.runtimevalues.RuntimeValueProps? = null,
                     init: (software.amazon.awscdk.runtimevalues.RuntimeValue.() -> Unit)? = null)
        : software.amazon.awscdk.runtimevalues.RuntimeValue {

    val obj = software.amazon.awscdk.runtimevalues.RuntimeValue(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.runtimevalues.RuntimeValueProps.Builder
 */
fun runtimeValueProps(init: software.amazon.awscdk.runtimevalues.RuntimeValueProps.Builder.() -> Unit): software.amazon.awscdk.runtimevalues.RuntimeValueProps {
    val builder = software.amazon.awscdk.runtimevalues.RuntimeValueProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.runtimevalues.RuntimeValueProps.Builder.withValue
 */
var software.amazon.awscdk.runtimevalues.RuntimeValueProps.Builder.value: Any
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }

/**
 * @see software.amazon.awscdk.runtimevalues.RuntimeValueProps.Builder.withPackage
 */
var software.amazon.awscdk.runtimevalues.RuntimeValueProps.Builder.`package`: String
    get() = throw NoSuchFieldException("Get on `package` is not supported.")
    set(value) { this.withPackage(value) }
