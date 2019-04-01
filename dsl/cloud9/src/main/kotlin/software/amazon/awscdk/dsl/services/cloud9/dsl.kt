package software.amazon.awscdk.dsl.services.cloud9
/**
 * @see software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2
 */
fun software.amazon.awscdk.Construct.cfnEnvironmentEC2(id: String,
                     props: software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props? = null,
                     init: (software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2 {

    val obj = software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty.Builder
 */
fun repositoryProperty(init: software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty {
    val builder = software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty.Builder.withRepositoryUrl
 */
var software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty.Builder.repositoryUrl: String
    get() = throw NoSuchFieldException("Get on repositoryUrl is not supported.")
    set(value) { this.withRepositoryUrl(value) }

/**
 * @see software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty.Builder.withPathComponent
 */
var software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.RepositoryProperty.Builder.pathComponent: String
    get() = throw NoSuchFieldException("Get on pathComponent is not supported.")
    set(value) { this.withPathComponent(value) }


/**
 * @see software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder
 */
fun cfnEnvironmentEC2Props(init: software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder.() -> Unit): software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props {
    val builder = software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder.withInstanceType
 */
var software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder.instanceType: String
    get() = throw NoSuchFieldException("Get on instanceType is not supported.")
    set(value) { this.withInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder.withSubnetId
 */
var software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder.subnetId: String
    get() = throw NoSuchFieldException("Get on subnetId is not supported.")
    set(value) { this.withSubnetId(value) }

/**
 * @see software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder.withName
 */
var software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder.withDescription
 */
var software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder.withAutomaticStopTimeMinutes
 */
var software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder.automaticStopTimeMinutes: Number
    get() = throw NoSuchFieldException("Get on automaticStopTimeMinutes is not supported.")
    set(value) { this.withAutomaticStopTimeMinutes(value) }

/**
 * @see software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder.withOwnerArn
 */
var software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder.ownerArn: String
    get() = throw NoSuchFieldException("Get on ownerArn is not supported.")
    set(value) { this.withOwnerArn(value) }

/**
 * @see software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder.withRepositories
 */
var software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder.repositories: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on repositories is not supported.")
    set(value) { this.withRepositories(value) }
