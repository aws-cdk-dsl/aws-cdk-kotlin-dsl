package software.amazon.awscdk.dsl.assets.docker
/**
 * @see software.amazon.awscdk.assets.docker.DockerImageAsset
 */
fun software.amazon.awscdk.Construct.dockerImageAsset(id: String,
                     props: software.amazon.awscdk.assets.docker.DockerImageAssetProps? = null,
                     init: (software.amazon.awscdk.assets.docker.DockerImageAsset.() -> Unit)? = null)
        : software.amazon.awscdk.assets.docker.DockerImageAsset {

    val obj = software.amazon.awscdk.assets.docker.DockerImageAsset(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.assets.docker.DockerImageAssetProps.Builder
 */
fun dockerImageAssetProps(init: software.amazon.awscdk.assets.docker.DockerImageAssetProps.Builder.() -> Unit): software.amazon.awscdk.assets.docker.DockerImageAssetProps {
    val builder = software.amazon.awscdk.assets.docker.DockerImageAssetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.assets.docker.DockerImageAssetProps.Builder.withRepositoryName
 */
var software.amazon.awscdk.assets.docker.DockerImageAssetProps.Builder.repositoryName: String
    get() = throw NoSuchFieldException("Get on repositoryName is not supported.")
    set(value) { this.withRepositoryName(value) }

/**
 * @see software.amazon.awscdk.assets.docker.DockerImageAssetProps.Builder.withDirectory
 */
var software.amazon.awscdk.assets.docker.DockerImageAssetProps.Builder.directory: String
    get() = throw NoSuchFieldException("Get on directory is not supported.")
    set(value) { this.withDirectory(value) }
