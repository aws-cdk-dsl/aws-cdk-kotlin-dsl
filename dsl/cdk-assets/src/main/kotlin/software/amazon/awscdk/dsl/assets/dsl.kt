package software.amazon.awscdk.dsl.assets
/**
 * @see software.amazon.awscdk.assets.ZipDirectoryAsset
 */
fun software.amazon.awscdk.Construct.zipDirectoryAsset(id: String,
                     props: software.amazon.awscdk.assets.ZipDirectoryAssetProps? = null,
                     init: (software.amazon.awscdk.assets.ZipDirectoryAsset.() -> Unit)? = null)
        : software.amazon.awscdk.assets.ZipDirectoryAsset {

    val obj = software.amazon.awscdk.assets.ZipDirectoryAsset(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.assets.Asset
 */
fun software.amazon.awscdk.Construct.asset(id: String,
                     props: software.amazon.awscdk.assets.GenericAssetProps? = null,
                     init: (software.amazon.awscdk.assets.Asset.() -> Unit)? = null)
        : software.amazon.awscdk.assets.Asset {

    val obj = software.amazon.awscdk.assets.Asset(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.assets.FileAsset
 */
fun software.amazon.awscdk.Construct.fileAsset(id: String,
                     props: software.amazon.awscdk.assets.FileAssetProps? = null,
                     init: (software.amazon.awscdk.assets.FileAsset.() -> Unit)? = null)
        : software.amazon.awscdk.assets.FileAsset {

    val obj = software.amazon.awscdk.assets.FileAsset(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.assets.GenericAssetProps.Builder
 */
fun genericAssetProps(init: software.amazon.awscdk.assets.GenericAssetProps.Builder.() -> Unit): software.amazon.awscdk.assets.GenericAssetProps {
    val builder = software.amazon.awscdk.assets.GenericAssetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.assets.GenericAssetProps.Builder.withPath
 */
var software.amazon.awscdk.assets.GenericAssetProps.Builder.path: String
    get() = throw NoSuchFieldException("Get on path is not supported.")
    set(value) { this.withPath(value) }

/**
 * @see software.amazon.awscdk.assets.GenericAssetProps.Builder.withPackaging
 */
var software.amazon.awscdk.assets.GenericAssetProps.Builder.packaging: software.amazon.awscdk.assets.AssetPackaging
    get() = throw NoSuchFieldException("Get on packaging is not supported.")
    set(value) { this.withPackaging(value) }


/**
 * @see software.amazon.awscdk.assets.ZipDirectoryAssetProps.Builder
 */
fun zipDirectoryAssetProps(init: software.amazon.awscdk.assets.ZipDirectoryAssetProps.Builder.() -> Unit): software.amazon.awscdk.assets.ZipDirectoryAssetProps {
    val builder = software.amazon.awscdk.assets.ZipDirectoryAssetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.assets.ZipDirectoryAssetProps.Builder.withPath
 */
var software.amazon.awscdk.assets.ZipDirectoryAssetProps.Builder.path: String
    get() = throw NoSuchFieldException("Get on path is not supported.")
    set(value) { this.withPath(value) }


/**
 * @see software.amazon.awscdk.assets.FileAssetProps.Builder
 */
fun fileAssetProps(init: software.amazon.awscdk.assets.FileAssetProps.Builder.() -> Unit): software.amazon.awscdk.assets.FileAssetProps {
    val builder = software.amazon.awscdk.assets.FileAssetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.assets.FileAssetProps.Builder.withPath
 */
var software.amazon.awscdk.assets.FileAssetProps.Builder.path: String
    get() = throw NoSuchFieldException("Get on path is not supported.")
    set(value) { this.withPath(value) }
