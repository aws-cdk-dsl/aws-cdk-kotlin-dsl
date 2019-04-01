package software.amazon.awscdk.dsl.services.sagemaker
/**
 * @see software.amazon.awscdk.services.sagemaker.CfnEndpoint
 */
fun software.amazon.awscdk.Construct.cfnEndpoint(id: String,
                     props: software.amazon.awscdk.services.sagemaker.CfnEndpointProps? = null,
                     init: (software.amazon.awscdk.services.sagemaker.CfnEndpoint.() -> Unit)? = null)
        : software.amazon.awscdk.services.sagemaker.CfnEndpoint {

    val obj = software.amazon.awscdk.services.sagemaker.CfnEndpoint(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sagemaker.CfnEndpointConfig
 */
fun software.amazon.awscdk.Construct.cfnEndpointConfig(id: String,
                     props: software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps? = null,
                     init: (software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.() -> Unit)? = null)
        : software.amazon.awscdk.services.sagemaker.CfnEndpointConfig {

    val obj = software.amazon.awscdk.services.sagemaker.CfnEndpointConfig(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstance
 */
fun software.amazon.awscdk.Construct.cfnNotebookInstance(id: String,
                     props: software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps? = null,
                     init: (software.amazon.awscdk.services.sagemaker.CfnNotebookInstance.() -> Unit)? = null)
        : software.amazon.awscdk.services.sagemaker.CfnNotebookInstance {

    val obj = software.amazon.awscdk.services.sagemaker.CfnNotebookInstance(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sagemaker.CfnModel
 */
fun software.amazon.awscdk.Construct.cfnModel(id: String,
                     props: software.amazon.awscdk.services.sagemaker.CfnModelProps? = null,
                     init: (software.amazon.awscdk.services.sagemaker.CfnModel.() -> Unit)? = null)
        : software.amazon.awscdk.services.sagemaker.CfnModel {

    val obj = software.amazon.awscdk.services.sagemaker.CfnModel(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig
 */
fun software.amazon.awscdk.Construct.cfnNotebookInstanceLifecycleConfig(id: String,
                     props: software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps? = null,
                     init: (software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.() -> Unit)? = null)
        : software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig {

    val obj = software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig
 */
fun software.amazon.awscdk.Construct.cfnNotebookInstanceLifecycleConfig(id: String,
                     init: (software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.() -> Unit)? = null)
        : software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig {

    val obj = software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.sagemaker.CfnModelProps.Builder
 */
fun cfnModelProps(init: software.amazon.awscdk.services.sagemaker.CfnModelProps.Builder.() -> Unit): software.amazon.awscdk.services.sagemaker.CfnModelProps {
    val builder = software.amazon.awscdk.services.sagemaker.CfnModelProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnModelProps.Builder.withVpcConfig
 */
var software.amazon.awscdk.services.sagemaker.CfnModelProps.Builder.vpcConfig: software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty
    get() = throw NoSuchFieldException("Get on vpcConfig is not supported.")
    set(value) { this.withVpcConfig(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnModelProps.Builder.withExecutionRoleArn
 */
var software.amazon.awscdk.services.sagemaker.CfnModelProps.Builder.executionRoleArn: String
    get() = throw NoSuchFieldException("Get on executionRoleArn is not supported.")
    set(value) { this.withExecutionRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnModelProps.Builder.withContainers
 */
var software.amazon.awscdk.services.sagemaker.CfnModelProps.Builder.containers: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on containers is not supported.")
    set(value) { this.withContainers(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnModelProps.Builder.withModelName
 */
var software.amazon.awscdk.services.sagemaker.CfnModelProps.Builder.modelName: String
    get() = throw NoSuchFieldException("Get on modelName is not supported.")
    set(value) { this.withModelName(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnModelProps.Builder.withPrimaryContainer
 */
var software.amazon.awscdk.services.sagemaker.CfnModelProps.Builder.primaryContainer: software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty
    get() = throw NoSuchFieldException("Get on primaryContainer is not supported.")
    set(value) { this.withPrimaryContainer(value) }


/**
 * @see software.amazon.awscdk.services.sagemaker.CfnEndpointProps.Builder
 */
fun cfnEndpointProps(init: software.amazon.awscdk.services.sagemaker.CfnEndpointProps.Builder.() -> Unit): software.amazon.awscdk.services.sagemaker.CfnEndpointProps {
    val builder = software.amazon.awscdk.services.sagemaker.CfnEndpointProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnEndpointProps.Builder.withEndpointConfigName
 */
var software.amazon.awscdk.services.sagemaker.CfnEndpointProps.Builder.endpointConfigName: String
    get() = throw NoSuchFieldException("Get on endpointConfigName is not supported.")
    set(value) { this.withEndpointConfigName(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnEndpointProps.Builder.withEndpointName
 */
var software.amazon.awscdk.services.sagemaker.CfnEndpointProps.Builder.endpointName: String
    get() = throw NoSuchFieldException("Get on endpointName is not supported.")
    set(value) { this.withEndpointName(value) }


/**
 * @see software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder
 */
fun productionVariantProperty(init: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder.() -> Unit): software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty {
    val builder = software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder.withInstanceType
 */
var software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder.instanceType: String
    get() = throw NoSuchFieldException("Get on instanceType is not supported.")
    set(value) { this.withInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder.withModelName
 */
var software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder.modelName: String
    get() = throw NoSuchFieldException("Get on modelName is not supported.")
    set(value) { this.withModelName(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder.withInitialInstanceCount
 */
var software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder.initialInstanceCount: Number
    get() = throw NoSuchFieldException("Get on initialInstanceCount is not supported.")
    set(value) { this.withInitialInstanceCount(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder.withInitialVariantWeight
 */
var software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder.initialVariantWeight: Number
    get() = throw NoSuchFieldException("Get on initialVariantWeight is not supported.")
    set(value) { this.withInitialVariantWeight(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder.withVariantName
 */
var software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder.variantName: String
    get() = throw NoSuchFieldException("Get on variantName is not supported.")
    set(value) { this.withVariantName(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder.withAcceleratorType
 */
var software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder.acceleratorType: String
    get() = throw NoSuchFieldException("Get on acceleratorType is not supported.")
    set(value) { this.withAcceleratorType(value) }


/**
 * @see software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty.Builder
 */
fun vpcConfigProperty(init: software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty {
    val builder = software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty.Builder()
    builder.init()
    return builder.build()
}


/**
 * @see software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty.Builder
 */
fun containerDefinitionProperty(init: software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty.Builder.() -> Unit): software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty {
    val builder = software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty.Builder.withEnvironment
 */
var software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty.Builder.environment: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on environment is not supported.")
    set(value) { this.withEnvironment(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty.Builder.withImage
 */
var software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty.Builder.image: String
    get() = throw NoSuchFieldException("Get on image is not supported.")
    set(value) { this.withImage(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty.Builder.withModelDataUrl
 */
var software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty.Builder.modelDataUrl: String
    get() = throw NoSuchFieldException("Get on modelDataUrl is not supported.")
    set(value) { this.withModelDataUrl(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty.Builder.withContainerHostname
 */
var software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty.Builder.containerHostname: String
    get() = throw NoSuchFieldException("Get on containerHostname is not supported.")
    set(value) { this.withContainerHostname(value) }


/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty.Builder
 */
fun notebookInstanceLifecycleHookProperty(init: software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty.Builder.() -> Unit): software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty {
    val builder = software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty.Builder.withContent
 */
var software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty.Builder.content: String
    get() = throw NoSuchFieldException("Get on content is not supported.")
    set(value) { this.withContent(value) }


/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps.Builder
 */
fun cfnNotebookInstanceLifecycleConfigProps(init: software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps.Builder.() -> Unit): software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps {
    val builder = software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps.Builder.withNotebookInstanceLifecycleConfigName
 */
var software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps.Builder.notebookInstanceLifecycleConfigName: String
    get() = throw NoSuchFieldException("Get on notebookInstanceLifecycleConfigName is not supported.")
    set(value) { this.withNotebookInstanceLifecycleConfigName(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps.Builder.withOnStart
 */
var software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps.Builder.onStart: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on onStart is not supported.")
    set(value) { this.withOnStart(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps.Builder.withOnCreate
 */
var software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps.Builder.onCreate: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on onCreate is not supported.")
    set(value) { this.withOnCreate(value) }


/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder
 */
fun cfnNotebookInstanceProps(init: software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.() -> Unit): software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps {
    val builder = software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.withVolumeSizeInGb
 */
var software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.volumeSizeInGb: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on volumeSizeInGb is not supported.")
    set(value) { this.withVolumeSizeInGb(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.withInstanceType
 */
var software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.instanceType: String
    get() = throw NoSuchFieldException("Get on instanceType is not supported.")
    set(value) { this.withInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.withKmsKeyId
 */
var software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.kmsKeyId: String
    get() = throw NoSuchFieldException("Get on kmsKeyId is not supported.")
    set(value) { this.withKmsKeyId(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.withRoleArn
 */
var software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.withSubnetId
 */
var software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.subnetId: String
    get() = throw NoSuchFieldException("Get on subnetId is not supported.")
    set(value) { this.withSubnetId(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.withDirectInternetAccess
 */
var software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.directInternetAccess: String
    get() = throw NoSuchFieldException("Get on directInternetAccess is not supported.")
    set(value) { this.withDirectInternetAccess(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.withLifecycleConfigName
 */
var software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.lifecycleConfigName: String
    get() = throw NoSuchFieldException("Get on lifecycleConfigName is not supported.")
    set(value) { this.withLifecycleConfigName(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.withNotebookInstanceName
 */
var software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.notebookInstanceName: String
    get() = throw NoSuchFieldException("Get on notebookInstanceName is not supported.")
    set(value) { this.withNotebookInstanceName(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.withRootAccess
 */
var software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder.rootAccess: String
    get() = throw NoSuchFieldException("Get on rootAccess is not supported.")
    set(value) { this.withRootAccess(value) }


/**
 * @see software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps.Builder
 */
fun cfnEndpointConfigProps(init: software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps.Builder.() -> Unit): software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps {
    val builder = software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps.Builder.withEndpointConfigName
 */
var software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps.Builder.endpointConfigName: String
    get() = throw NoSuchFieldException("Get on endpointConfigName is not supported.")
    set(value) { this.withEndpointConfigName(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps.Builder.withKmsKeyId
 */
var software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps.Builder.kmsKeyId: String
    get() = throw NoSuchFieldException("Get on kmsKeyId is not supported.")
    set(value) { this.withKmsKeyId(value) }

/**
 * @see software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps.Builder.withProductionVariants
 */
var software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps.Builder.productionVariants: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on productionVariants is not supported.")
    set(value) { this.withProductionVariants(value) }
