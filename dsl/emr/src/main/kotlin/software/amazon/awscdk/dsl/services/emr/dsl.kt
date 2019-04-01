package software.amazon.awscdk.dsl.services.emr
/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig
 */
fun software.amazon.awscdk.Construct.cfnInstanceFleetConfig(id: String,
                     props: software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps? = null,
                     init: (software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.() -> Unit)? = null)
        : software.amazon.awscdk.services.emr.CfnInstanceFleetConfig {

    val obj = software.amazon.awscdk.services.emr.CfnInstanceFleetConfig(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig
 */
fun software.amazon.awscdk.Construct.cfnInstanceGroupConfig(id: String,
                     props: software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps? = null,
                     init: (software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.() -> Unit)? = null)
        : software.amazon.awscdk.services.emr.CfnInstanceGroupConfig {

    val obj = software.amazon.awscdk.services.emr.CfnInstanceGroupConfig(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.emr.CfnStep
 */
fun software.amazon.awscdk.Construct.cfnStep(id: String,
                     props: software.amazon.awscdk.services.emr.CfnStepProps? = null,
                     init: (software.amazon.awscdk.services.emr.CfnStep.() -> Unit)? = null)
        : software.amazon.awscdk.services.emr.CfnStep {

    val obj = software.amazon.awscdk.services.emr.CfnStep(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.emr.CfnSecurityConfiguration
 */
fun software.amazon.awscdk.Construct.cfnSecurityConfiguration(id: String,
                     props: software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps? = null,
                     init: (software.amazon.awscdk.services.emr.CfnSecurityConfiguration.() -> Unit)? = null)
        : software.amazon.awscdk.services.emr.CfnSecurityConfiguration {

    val obj = software.amazon.awscdk.services.emr.CfnSecurityConfiguration(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster
 */
fun software.amazon.awscdk.Construct.cfnCluster(id: String,
                     props: software.amazon.awscdk.services.emr.CfnClusterProps? = null,
                     init: (software.amazon.awscdk.services.emr.CfnCluster.() -> Unit)? = null)
        : software.amazon.awscdk.services.emr.CfnCluster {

    val obj = software.amazon.awscdk.services.emr.CfnCluster(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.Builder
 */
fun instanceTypeConfigProperty(init: software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.Builder.withInstanceType
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.Builder.instanceType: String
    get() = throw NoSuchFieldException("Get on instanceType is not supported.")
    set(value) { this.withInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.Builder.withWeightedCapacity
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.Builder.weightedCapacity: Number
    get() = throw NoSuchFieldException("Get on weightedCapacity is not supported.")
    set(value) { this.withWeightedCapacity(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.Builder.withBidPrice
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.Builder.bidPrice: String
    get() = throw NoSuchFieldException("Get on bidPrice is not supported.")
    set(value) { this.withBidPrice(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.Builder.withBidPriceAsPercentageOfOnDemandPrice
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.Builder.bidPriceAsPercentageOfOnDemandPrice: Number
    get() = throw NoSuchFieldException("Get on bidPriceAsPercentageOfOnDemandPrice is not supported.")
    set(value) { this.withBidPriceAsPercentageOfOnDemandPrice(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.Builder.withConfigurations
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.Builder.configurations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on configurations is not supported.")
    set(value) { this.withConfigurations(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.Builder.withEbsConfiguration
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceTypeConfigProperty.Builder.ebsConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ebsConfiguration is not supported.")
    set(value) { this.withEbsConfiguration(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty.Builder
 */
fun scalingActionProperty(init: software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty.Builder.withMarket
 */
var software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty.Builder.market: String
    get() = throw NoSuchFieldException("Get on market is not supported.")
    set(value) { this.withMarket(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty.Builder.withSimpleScalingPolicyConfiguration
 */
var software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty.Builder.simpleScalingPolicyConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on simpleScalingPolicyConfiguration is not supported.")
    set(value) { this.withSimpleScalingPolicyConfiguration(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty.Builder
 */
fun instanceFleetConfigProperty(init: software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty.Builder.withInstanceTypeConfigs
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty.Builder.instanceTypeConfigs: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on instanceTypeConfigs is not supported.")
    set(value) { this.withInstanceTypeConfigs(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty.Builder.withLaunchSpecifications
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty.Builder.launchSpecifications: software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty
    get() = throw NoSuchFieldException("Get on launchSpecifications is not supported.")
    set(value) { this.withLaunchSpecifications(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty.Builder.withTargetOnDemandCapacity
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty.Builder.targetOnDemandCapacity: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on targetOnDemandCapacity is not supported.")
    set(value) { this.withTargetOnDemandCapacity(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty.Builder.withTargetSpotCapacity
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty.Builder.targetSpotCapacity: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on targetSpotCapacity is not supported.")
    set(value) { this.withTargetSpotCapacity(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty.Builder.withName
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty.Builder
 */
fun hadoopJarStepConfigProperty(init: software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty {
    val builder = software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty.Builder.withJar
 */
var software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty.Builder.jar: String
    get() = throw NoSuchFieldException("Get on jar is not supported.")
    set(value) { this.withJar(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty.Builder.withMainClass
 */
var software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty.Builder.mainClass: String
    get() = throw NoSuchFieldException("Get on mainClass is not supported.")
    set(value) { this.withMainClass(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty.Builder.withStepProperties
 */
var software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty.Builder.stepProperties: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on stepProperties is not supported.")
    set(value) { this.withStepProperties(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty.Builder
 */
fun spotProvisioningSpecificationProperty(init: software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty.Builder.withTimeoutAction
 */
var software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty.Builder.timeoutAction: String
    get() = throw NoSuchFieldException("Get on timeoutAction is not supported.")
    set(value) { this.withTimeoutAction(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty.Builder.withTimeoutDurationMinutes
 */
var software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty.Builder.timeoutDurationMinutes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on timeoutDurationMinutes is not supported.")
    set(value) { this.withTimeoutDurationMinutes(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty.Builder.withBlockDurationMinutes
 */
var software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty.Builder.blockDurationMinutes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on blockDurationMinutes is not supported.")
    set(value) { this.withBlockDurationMinutes(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder
 */
fun autoScalingPolicyProperty(init: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder.withConstraints
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder.constraints: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on constraints is not supported.")
    set(value) { this.withConstraints(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder.withRules
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder.rules: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on rules is not supported.")
    set(value) { this.withRules(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty.Builder
 */
fun scriptBootstrapActionConfigProperty(init: software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty.Builder.withPath
 */
var software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty.Builder.path: String
    get() = throw NoSuchFieldException("Get on path is not supported.")
    set(value) { this.withPath(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnStepProps.Builder
 */
fun cfnStepProps(init: software.amazon.awscdk.services.emr.CfnStepProps.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnStepProps {
    val builder = software.amazon.awscdk.services.emr.CfnStepProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnStepProps.Builder.withName
 */
var software.amazon.awscdk.services.emr.CfnStepProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnStepProps.Builder.withActionOnFailure
 */
var software.amazon.awscdk.services.emr.CfnStepProps.Builder.actionOnFailure: String
    get() = throw NoSuchFieldException("Get on actionOnFailure is not supported.")
    set(value) { this.withActionOnFailure(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnStepProps.Builder.withHadoopJarStep
 */
var software.amazon.awscdk.services.emr.CfnStepProps.Builder.hadoopJarStep: software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty
    get() = throw NoSuchFieldException("Get on hadoopJarStep is not supported.")
    set(value) { this.withHadoopJarStep(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnStepProps.Builder.withJobFlowId
 */
var software.amazon.awscdk.services.emr.CfnStepProps.Builder.jobFlowId: String
    get() = throw NoSuchFieldException("Get on jobFlowId is not supported.")
    set(value) { this.withJobFlowId(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty.Builder
 */
fun configurationProperty(init: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty.Builder.withConfigurations
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty.Builder.configurations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on configurations is not supported.")
    set(value) { this.withConfigurations(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty.Builder.withClassification
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty.Builder.classification: String
    get() = throw NoSuchFieldException("Get on classification is not supported.")
    set(value) { this.withClassification(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty.Builder.withConfigurationProperties
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ConfigurationProperty.Builder.configurationProperties: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on configurationProperties is not supported.")
    set(value) { this.withConfigurationProperties(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty.Builder
 */
fun scalingTriggerProperty(init: software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty.Builder.withCloudWatchAlarmDefinition
 */
var software.amazon.awscdk.services.emr.CfnCluster.ScalingTriggerProperty.Builder.cloudWatchAlarmDefinition: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on cloudWatchAlarmDefinition is not supported.")
    set(value) { this.withCloudWatchAlarmDefinition(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty.Builder
 */
fun volumeSpecificationProperty(init: software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty.Builder.withVolumeType
 */
var software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty.Builder.volumeType: String
    get() = throw NoSuchFieldException("Get on volumeType is not supported.")
    set(value) { this.withVolumeType(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty.Builder.withIops
 */
var software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty.Builder.iops: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on iops is not supported.")
    set(value) { this.withIops(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty.Builder.withSizeInGb
 */
var software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty.Builder.sizeInGb: Number
    get() = throw NoSuchFieldException("Get on sizeInGb is not supported.")
    set(value) { this.withSizeInGb(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty.Builder
 */
fun volumeSpecificationProperty(init: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty.Builder.withVolumeType
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty.Builder.volumeType: String
    get() = throw NoSuchFieldException("Get on volumeType is not supported.")
    set(value) { this.withVolumeType(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty.Builder.withIops
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty.Builder.iops: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on iops is not supported.")
    set(value) { this.withIops(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty.Builder.withSizeInGb
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty.Builder.sizeInGb: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on sizeInGb is not supported.")
    set(value) { this.withSizeInGb(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty.Builder
 */
fun spotProvisioningSpecificationProperty(init: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty.Builder.withTimeoutAction
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty.Builder.timeoutAction: String
    get() = throw NoSuchFieldException("Get on timeoutAction is not supported.")
    set(value) { this.withTimeoutAction(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty.Builder.withTimeoutDurationMinutes
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty.Builder.timeoutDurationMinutes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on timeoutDurationMinutes is not supported.")
    set(value) { this.withTimeoutDurationMinutes(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty.Builder.withBlockDurationMinutes
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty.Builder.blockDurationMinutes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on blockDurationMinutes is not supported.")
    set(value) { this.withBlockDurationMinutes(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.Builder
 */
fun scalingRuleProperty(init: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.Builder.withAction
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.Builder.action: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on action is not supported.")
    set(value) { this.withAction(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.Builder.withTrigger
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.Builder.trigger: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on trigger is not supported.")
    set(value) { this.withTrigger(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.Builder.withName
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.Builder.withDescription
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingRuleProperty.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty.Builder
 */
fun placementTypeProperty(init: software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty.Builder.withAvailabilityZone
 */
var software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty.Builder.availabilityZone: String
    get() = throw NoSuchFieldException("Get on availabilityZone is not supported.")
    set(value) { this.withAvailabilityZone(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty.Builder
 */
fun ebsBlockDeviceConfigProperty(init: software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty.Builder.withVolumeSpecification
 */
var software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty.Builder.volumeSpecification: software.amazon.awscdk.services.emr.CfnCluster.VolumeSpecificationProperty
    get() = throw NoSuchFieldException("Get on volumeSpecification is not supported.")
    set(value) { this.withVolumeSpecification(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty.Builder.withVolumesPerInstance
 */
var software.amazon.awscdk.services.emr.CfnCluster.EbsBlockDeviceConfigProperty.Builder.volumesPerInstance: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on volumesPerInstance is not supported.")
    set(value) { this.withVolumesPerInstance(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty.Builder
 */
fun hadoopJarStepConfigProperty(init: software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty.Builder.withJar
 */
var software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty.Builder.jar: String
    get() = throw NoSuchFieldException("Get on jar is not supported.")
    set(value) { this.withJar(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty.Builder.withMainClass
 */
var software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty.Builder.mainClass: String
    get() = throw NoSuchFieldException("Get on mainClass is not supported.")
    set(value) { this.withMainClass(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty.Builder.withStepProperties
 */
var software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty.Builder.stepProperties: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on stepProperties is not supported.")
    set(value) { this.withStepProperties(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty.Builder
 */
fun ebsConfigurationProperty(init: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty.Builder.withEbsBlockDeviceConfigs
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty.Builder.ebsBlockDeviceConfigs: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ebsBlockDeviceConfigs is not supported.")
    set(value) { this.withEbsBlockDeviceConfigs(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty.Builder.withEbsOptimized
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty.Builder.ebsOptimized: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ebsOptimized is not supported.")
    set(value) { this.withEbsOptimized(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder
 */
fun cfnInstanceFleetConfigProps(init: software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder.withClusterId
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder.clusterId: String
    get() = throw NoSuchFieldException("Get on clusterId is not supported.")
    set(value) { this.withClusterId(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder.withInstanceFleetType
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder.instanceFleetType: String
    get() = throw NoSuchFieldException("Get on instanceFleetType is not supported.")
    set(value) { this.withInstanceFleetType(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder.withInstanceTypeConfigs
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder.instanceTypeConfigs: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on instanceTypeConfigs is not supported.")
    set(value) { this.withInstanceTypeConfigs(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder.withLaunchSpecifications
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder.launchSpecifications: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty
    get() = throw NoSuchFieldException("Get on launchSpecifications is not supported.")
    set(value) { this.withLaunchSpecifications(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder.withTargetOnDemandCapacity
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder.targetOnDemandCapacity: Number
    get() = throw NoSuchFieldException("Get on targetOnDemandCapacity is not supported.")
    set(value) { this.withTargetOnDemandCapacity(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder.withTargetSpotCapacity
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder.targetSpotCapacity: Number
    get() = throw NoSuchFieldException("Get on targetSpotCapacity is not supported.")
    set(value) { this.withTargetSpotCapacity(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder.withName
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty.Builder
 */
fun volumeSpecificationProperty(init: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty.Builder.withVolumeType
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty.Builder.volumeType: String
    get() = throw NoSuchFieldException("Get on volumeType is not supported.")
    set(value) { this.withVolumeType(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty.Builder.withIops
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty.Builder.iops: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on iops is not supported.")
    set(value) { this.withIops(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty.Builder.withSizeInGb
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty.Builder.sizeInGb: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on sizeInGb is not supported.")
    set(value) { this.withSizeInGb(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty.Builder
 */
fun scalingConstraintsProperty(init: software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty.Builder.withMaxCapacity
 */
var software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty.Builder.maxCapacity: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on maxCapacity is not supported.")
    set(value) { this.withMaxCapacity(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty.Builder.withMinCapacity
 */
var software.amazon.awscdk.services.emr.CfnCluster.ScalingConstraintsProperty.Builder.minCapacity: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on minCapacity is not supported.")
    set(value) { this.withMinCapacity(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty.Builder
 */
fun configurationProperty(init: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty.Builder.withConfigurations
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty.Builder.configurations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on configurations is not supported.")
    set(value) { this.withConfigurations(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty.Builder.withClassification
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty.Builder.classification: String
    get() = throw NoSuchFieldException("Get on classification is not supported.")
    set(value) { this.withClassification(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty.Builder.withConfigurationProperties
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty.Builder.configurationProperties: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on configurationProperties is not supported.")
    set(value) { this.withConfigurationProperties(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.Builder
 */
fun instanceFleetProvisioningSpecificationsProperty(init: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.Builder.withSpotSpecification
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.Builder.spotSpecification: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on spotSpecification is not supported.")
    set(value) { this.withSpotSpecification(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty.Builder
 */
fun applicationProperty(init: software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty.Builder.withAdditionalInfo
 */
var software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty.Builder.additionalInfo: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on additionalInfo is not supported.")
    set(value) { this.withAdditionalInfo(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty.Builder.withName
 */
var software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty.Builder.withVersion
 */
var software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty.Builder
 */
fun keyValueProperty(init: software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty.Builder.withKey
 */
var software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty.Builder.withValue
 */
var software.amazon.awscdk.services.emr.CfnCluster.KeyValueProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps.Builder
 */
fun cfnSecurityConfigurationProps(init: software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps {
    val builder = software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps.Builder.withName
 */
var software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps.Builder.withSecurityConfiguration
 */
var software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps.Builder.securityConfiguration: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on securityConfiguration is not supported.")
    set(value) { this.withSecurityConfiguration(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder
 */
fun cfnInstanceGroupConfigProps(init: software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.withInstanceType
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.instanceType: String
    get() = throw NoSuchFieldException("Get on instanceType is not supported.")
    set(value) { this.withInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.withInstanceCount
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.instanceCount: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on instanceCount is not supported.")
    set(value) { this.withInstanceCount(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.withBidPrice
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.bidPrice: String
    get() = throw NoSuchFieldException("Get on bidPrice is not supported.")
    set(value) { this.withBidPrice(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.withConfigurations
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.configurations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on configurations is not supported.")
    set(value) { this.withConfigurations(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.withEbsConfiguration
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.ebsConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ebsConfiguration is not supported.")
    set(value) { this.withEbsConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.withMarket
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.market: String
    get() = throw NoSuchFieldException("Get on market is not supported.")
    set(value) { this.withMarket(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.withAutoScalingPolicy
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.autoScalingPolicy: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty
    get() = throw NoSuchFieldException("Get on autoScalingPolicy is not supported.")
    set(value) { this.withAutoScalingPolicy(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.withName
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.withJobFlowId
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.jobFlowId: String
    get() = throw NoSuchFieldException("Get on jobFlowId is not supported.")
    set(value) { this.withJobFlowId(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.withInstanceRole
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder.instanceRole: String
    get() = throw NoSuchFieldException("Get on instanceRole is not supported.")
    set(value) { this.withInstanceRole(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty.Builder
 */
fun ebsBlockDeviceConfigProperty(init: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty.Builder.withVolumeSpecification
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty.Builder.volumeSpecification: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on volumeSpecification is not supported.")
    set(value) { this.withVolumeSpecification(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty.Builder.withVolumesPerInstance
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty.Builder.volumesPerInstance: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on volumesPerInstance is not supported.")
    set(value) { this.withVolumesPerInstance(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder
 */
fun instanceTypeConfigProperty(init: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder.withInstanceType
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder.instanceType: String
    get() = throw NoSuchFieldException("Get on instanceType is not supported.")
    set(value) { this.withInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder.withWeightedCapacity
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder.weightedCapacity: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on weightedCapacity is not supported.")
    set(value) { this.withWeightedCapacity(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder.withBidPrice
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder.bidPrice: String
    get() = throw NoSuchFieldException("Get on bidPrice is not supported.")
    set(value) { this.withBidPrice(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder.withBidPriceAsPercentageOfOnDemandPrice
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder.bidPriceAsPercentageOfOnDemandPrice: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on bidPriceAsPercentageOfOnDemandPrice is not supported.")
    set(value) { this.withBidPriceAsPercentageOfOnDemandPrice(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder.withConfigurations
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder.configurations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on configurations is not supported.")
    set(value) { this.withConfigurations(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder.withEbsConfiguration
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder.ebsConfiguration: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ebsConfiguration is not supported.")
    set(value) { this.withEbsConfiguration(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty.Builder
 */
fun ebsConfigurationProperty(init: software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty.Builder.withEbsBlockDeviceConfigs
 */
var software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty.Builder.ebsBlockDeviceConfigs: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ebsBlockDeviceConfigs is not supported.")
    set(value) { this.withEbsBlockDeviceConfigs(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty.Builder.withEbsOptimized
 */
var software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty.Builder.ebsOptimized: Boolean
    get() = throw NoSuchFieldException("Get on ebsOptimized is not supported.")
    set(value) { this.withEbsOptimized(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.Builder
 */
fun kerberosAttributesProperty(init: software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.Builder.withAdDomainJoinUser
 */
var software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.Builder.adDomainJoinUser: String
    get() = throw NoSuchFieldException("Get on adDomainJoinUser is not supported.")
    set(value) { this.withAdDomainJoinUser(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.Builder.withCrossRealmTrustPrincipalPassword
 */
var software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.Builder.crossRealmTrustPrincipalPassword: String
    get() = throw NoSuchFieldException("Get on crossRealmTrustPrincipalPassword is not supported.")
    set(value) { this.withCrossRealmTrustPrincipalPassword(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.Builder.withRealm
 */
var software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.Builder.realm: String
    get() = throw NoSuchFieldException("Get on realm is not supported.")
    set(value) { this.withRealm(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.Builder.withAdDomainJoinPassword
 */
var software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.Builder.adDomainJoinPassword: String
    get() = throw NoSuchFieldException("Get on adDomainJoinPassword is not supported.")
    set(value) { this.withAdDomainJoinPassword(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.Builder.withKdcAdminPassword
 */
var software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.Builder.kdcAdminPassword: String
    get() = throw NoSuchFieldException("Get on kdcAdminPassword is not supported.")
    set(value) { this.withKdcAdminPassword(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty.Builder
 */
fun ebsConfigurationProperty(init: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty.Builder.withEbsBlockDeviceConfigs
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty.Builder.ebsBlockDeviceConfigs: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ebsBlockDeviceConfigs is not supported.")
    set(value) { this.withEbsBlockDeviceConfigs(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty.Builder.withEbsOptimized
 */
var software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty.Builder.ebsOptimized: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ebsOptimized is not supported.")
    set(value) { this.withEbsOptimized(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty.Builder
 */
fun stepConfigProperty(init: software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty.Builder.withName
 */
var software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty.Builder.withActionOnFailure
 */
var software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty.Builder.actionOnFailure: String
    get() = throw NoSuchFieldException("Get on actionOnFailure is not supported.")
    set(value) { this.withActionOnFailure(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty.Builder.withHadoopJarStep
 */
var software.amazon.awscdk.services.emr.CfnCluster.StepConfigProperty.Builder.hadoopJarStep: software.amazon.awscdk.services.emr.CfnCluster.HadoopJarStepConfigProperty
    get() = throw NoSuchFieldException("Get on hadoopJarStep is not supported.")
    set(value) { this.withHadoopJarStep(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder
 */
fun cloudWatchAlarmDefinitionProperty(init: software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.withNamespace
 */
var software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.namespace: String
    get() = throw NoSuchFieldException("Get on namespace is not supported.")
    set(value) { this.withNamespace(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.withUnit
 */
var software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.unit: String
    get() = throw NoSuchFieldException("Get on unit is not supported.")
    set(value) { this.withUnit(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.withDimensions
 */
var software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.dimensions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on dimensions is not supported.")
    set(value) { this.withDimensions(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.withPeriod
 */
var software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.period: Number
    get() = throw NoSuchFieldException("Get on period is not supported.")
    set(value) { this.withPeriod(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.withComparisonOperator
 */
var software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.comparisonOperator: String
    get() = throw NoSuchFieldException("Get on comparisonOperator is not supported.")
    set(value) { this.withComparisonOperator(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.withStatistic
 */
var software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.statistic: String
    get() = throw NoSuchFieldException("Get on statistic is not supported.")
    set(value) { this.withStatistic(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.withThreshold
 */
var software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.threshold: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on threshold is not supported.")
    set(value) { this.withThreshold(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.withMetricName
 */
var software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.metricName: String
    get() = throw NoSuchFieldException("Get on metricName is not supported.")
    set(value) { this.withMetricName(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.withEvaluationPeriods
 */
var software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder.evaluationPeriods: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on evaluationPeriods is not supported.")
    set(value) { this.withEvaluationPeriods(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty.Builder
 */
fun simpleScalingPolicyConfigurationProperty(init: software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty.Builder.withScalingAdjustment
 */
var software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty.Builder.scalingAdjustment: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on scalingAdjustment is not supported.")
    set(value) { this.withScalingAdjustment(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty.Builder.withCoolDown
 */
var software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty.Builder.coolDown: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on coolDown is not supported.")
    set(value) { this.withCoolDown(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty.Builder.withAdjustmentType
 */
var software.amazon.awscdk.services.emr.CfnCluster.SimpleScalingPolicyConfigurationProperty.Builder.adjustmentType: String
    get() = throw NoSuchFieldException("Get on adjustmentType is not supported.")
    set(value) { this.withAdjustmentType(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty.Builder
 */
fun scalingTriggerProperty(init: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty.Builder.withCloudWatchAlarmDefinition
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingTriggerProperty.Builder.cloudWatchAlarmDefinition: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on cloudWatchAlarmDefinition is not supported.")
    set(value) { this.withCloudWatchAlarmDefinition(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty.Builder
 */
fun scalingActionProperty(init: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty.Builder.withMarket
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty.Builder.market: String
    get() = throw NoSuchFieldException("Get on market is not supported.")
    set(value) { this.withMarket(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty.Builder.withSimpleScalingPolicyConfiguration
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingActionProperty.Builder.simpleScalingPolicyConfiguration: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty
    get() = throw NoSuchFieldException("Get on simpleScalingPolicyConfiguration is not supported.")
    set(value) { this.withSimpleScalingPolicyConfiguration(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty.Builder
 */
fun scalingRuleProperty(init: software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty.Builder.withAction
 */
var software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty.Builder.action: software.amazon.awscdk.services.emr.CfnCluster.ScalingActionProperty
    get() = throw NoSuchFieldException("Get on action is not supported.")
    set(value) { this.withAction(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty.Builder.withTrigger
 */
var software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty.Builder.trigger: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on trigger is not supported.")
    set(value) { this.withTrigger(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty.Builder.withName
 */
var software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty.Builder.withDescription
 */
var software.amazon.awscdk.services.emr.CfnCluster.ScalingRuleProperty.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.Builder
 */
fun simpleScalingPolicyConfigurationProperty(init: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.Builder.withScalingAdjustment
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.Builder.scalingAdjustment: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on scalingAdjustment is not supported.")
    set(value) { this.withScalingAdjustment(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.Builder.withCoolDown
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.Builder.coolDown: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on coolDown is not supported.")
    set(value) { this.withCoolDown(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.Builder.withAdjustmentType
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.Builder.adjustmentType: String
    get() = throw NoSuchFieldException("Get on adjustmentType is not supported.")
    set(value) { this.withAdjustmentType(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty.Builder
 */
fun instanceFleetProvisioningSpecificationsProperty(init: software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty.Builder.withSpotSpecification
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty.Builder.spotSpecification: software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty
    get() = throw NoSuchFieldException("Get on spotSpecification is not supported.")
    set(value) { this.withSpotSpecification(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty.Builder
 */
fun metricDimensionProperty(init: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty.Builder.withKey
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty.Builder.withValue
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.MetricDimensionProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty.Builder
 */
fun keyValueProperty(init: software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty {
    val builder = software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty.Builder.withKey
 */
var software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty.Builder.withValue
 */
var software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty.Builder
 */
fun autoScalingPolicyProperty(init: software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty.Builder.withConstraints
 */
var software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty.Builder.constraints: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on constraints is not supported.")
    set(value) { this.withConstraints(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty.Builder.withRules
 */
var software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty.Builder.rules: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on rules is not supported.")
    set(value) { this.withRules(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder
 */
fun cloudWatchAlarmDefinitionProperty(init: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.withNamespace
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.namespace: String
    get() = throw NoSuchFieldException("Get on namespace is not supported.")
    set(value) { this.withNamespace(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.withUnit
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.unit: String
    get() = throw NoSuchFieldException("Get on unit is not supported.")
    set(value) { this.withUnit(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.withDimensions
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.dimensions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on dimensions is not supported.")
    set(value) { this.withDimensions(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.withPeriod
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.period: Number
    get() = throw NoSuchFieldException("Get on period is not supported.")
    set(value) { this.withPeriod(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.withComparisonOperator
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.comparisonOperator: String
    get() = throw NoSuchFieldException("Get on comparisonOperator is not supported.")
    set(value) { this.withComparisonOperator(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.withStatistic
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.statistic: String
    get() = throw NoSuchFieldException("Get on statistic is not supported.")
    set(value) { this.withStatistic(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.withThreshold
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.threshold: Number
    get() = throw NoSuchFieldException("Get on threshold is not supported.")
    set(value) { this.withThreshold(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.withMetricName
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.metricName: String
    get() = throw NoSuchFieldException("Get on metricName is not supported.")
    set(value) { this.withMetricName(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.withEvaluationPeriods
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.evaluationPeriods: Number
    get() = throw NoSuchFieldException("Get on evaluationPeriods is not supported.")
    set(value) { this.withEvaluationPeriods(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder
 */
fun instanceGroupConfigProperty(init: software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder.withInstanceType
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder.instanceType: String
    get() = throw NoSuchFieldException("Get on instanceType is not supported.")
    set(value) { this.withInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder.withInstanceCount
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder.instanceCount: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on instanceCount is not supported.")
    set(value) { this.withInstanceCount(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder.withBidPrice
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder.bidPrice: String
    get() = throw NoSuchFieldException("Get on bidPrice is not supported.")
    set(value) { this.withBidPrice(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder.withConfigurations
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder.configurations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on configurations is not supported.")
    set(value) { this.withConfigurations(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder.withEbsConfiguration
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder.ebsConfiguration: software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty
    get() = throw NoSuchFieldException("Get on ebsConfiguration is not supported.")
    set(value) { this.withEbsConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder.withMarket
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder.market: String
    get() = throw NoSuchFieldException("Get on market is not supported.")
    set(value) { this.withMarket(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder.withAutoScalingPolicy
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder.autoScalingPolicy: software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty
    get() = throw NoSuchFieldException("Get on autoScalingPolicy is not supported.")
    set(value) { this.withAutoScalingPolicy(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder.withName
 */
var software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.Builder
 */
fun ebsBlockDeviceConfigProperty(init: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.Builder.withVolumeSpecification
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.Builder.volumeSpecification: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.VolumeSpecificationProperty
    get() = throw NoSuchFieldException("Get on volumeSpecification is not supported.")
    set(value) { this.withVolumeSpecification(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.Builder.withVolumesPerInstance
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.Builder.volumesPerInstance: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on volumesPerInstance is not supported.")
    set(value) { this.withVolumesPerInstance(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty.Builder
 */
fun scalingConstraintsProperty(init: software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty {
    val builder = software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty.Builder.withMaxCapacity
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty.Builder.maxCapacity: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on maxCapacity is not supported.")
    set(value) { this.withMaxCapacity(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty.Builder.withMinCapacity
 */
var software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.ScalingConstraintsProperty.Builder.minCapacity: Number
    get() = throw NoSuchFieldException("Get on minCapacity is not supported.")
    set(value) { this.withMinCapacity(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty.Builder
 */
fun configurationProperty(init: software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty.Builder.withConfigurations
 */
var software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty.Builder.configurations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on configurations is not supported.")
    set(value) { this.withConfigurations(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty.Builder.withClassification
 */
var software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty.Builder.classification: String
    get() = throw NoSuchFieldException("Get on classification is not supported.")
    set(value) { this.withClassification(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty.Builder.withConfigurationProperties
 */
var software.amazon.awscdk.services.emr.CfnCluster.ConfigurationProperty.Builder.configurationProperties: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on configurationProperties is not supported.")
    set(value) { this.withConfigurationProperties(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty.Builder
 */
fun bootstrapActionConfigProperty(init: software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty.Builder.withName
 */
var software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty.Builder.withScriptBootstrapAction
 */
var software.amazon.awscdk.services.emr.CfnCluster.BootstrapActionConfigProperty.Builder.scriptBootstrapAction: software.amazon.awscdk.services.emr.CfnCluster.ScriptBootstrapActionConfigProperty
    get() = throw NoSuchFieldException("Get on scriptBootstrapAction is not supported.")
    set(value) { this.withScriptBootstrapAction(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder
 */
fun cfnClusterProps(init: software.amazon.awscdk.services.emr.CfnClusterProps.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnClusterProps {
    val builder = software.amazon.awscdk.services.emr.CfnClusterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder.withServiceRole
 */
var software.amazon.awscdk.services.emr.CfnClusterProps.Builder.serviceRole: String
    get() = throw NoSuchFieldException("Get on serviceRole is not supported.")
    set(value) { this.withServiceRole(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder.withAdditionalInfo
 */
var software.amazon.awscdk.services.emr.CfnClusterProps.Builder.additionalInfo: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on additionalInfo is not supported.")
    set(value) { this.withAdditionalInfo(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder.withConfigurations
 */
var software.amazon.awscdk.services.emr.CfnClusterProps.Builder.configurations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on configurations is not supported.")
    set(value) { this.withConfigurations(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder.withName
 */
var software.amazon.awscdk.services.emr.CfnClusterProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder.withInstances
 */
var software.amazon.awscdk.services.emr.CfnClusterProps.Builder.instances: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on instances is not supported.")
    set(value) { this.withInstances(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder.withJobFlowRole
 */
var software.amazon.awscdk.services.emr.CfnClusterProps.Builder.jobFlowRole: String
    get() = throw NoSuchFieldException("Get on jobFlowRole is not supported.")
    set(value) { this.withJobFlowRole(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder.withApplications
 */
var software.amazon.awscdk.services.emr.CfnClusterProps.Builder.applications: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on applications is not supported.")
    set(value) { this.withApplications(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder.withAutoScalingRole
 */
var software.amazon.awscdk.services.emr.CfnClusterProps.Builder.autoScalingRole: String
    get() = throw NoSuchFieldException("Get on autoScalingRole is not supported.")
    set(value) { this.withAutoScalingRole(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder.withBootstrapActions
 */
var software.amazon.awscdk.services.emr.CfnClusterProps.Builder.bootstrapActions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on bootstrapActions is not supported.")
    set(value) { this.withBootstrapActions(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder.withCustomAmiId
 */
var software.amazon.awscdk.services.emr.CfnClusterProps.Builder.customAmiId: String
    get() = throw NoSuchFieldException("Get on customAmiId is not supported.")
    set(value) { this.withCustomAmiId(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder.withEbsRootVolumeSize
 */
var software.amazon.awscdk.services.emr.CfnClusterProps.Builder.ebsRootVolumeSize: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ebsRootVolumeSize is not supported.")
    set(value) { this.withEbsRootVolumeSize(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder.withKerberosAttributes
 */
var software.amazon.awscdk.services.emr.CfnClusterProps.Builder.kerberosAttributes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on kerberosAttributes is not supported.")
    set(value) { this.withKerberosAttributes(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder.withLogUri
 */
var software.amazon.awscdk.services.emr.CfnClusterProps.Builder.logUri: String
    get() = throw NoSuchFieldException("Get on logUri is not supported.")
    set(value) { this.withLogUri(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder.withReleaseLabel
 */
var software.amazon.awscdk.services.emr.CfnClusterProps.Builder.releaseLabel: String
    get() = throw NoSuchFieldException("Get on releaseLabel is not supported.")
    set(value) { this.withReleaseLabel(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder.withScaleDownBehavior
 */
var software.amazon.awscdk.services.emr.CfnClusterProps.Builder.scaleDownBehavior: String
    get() = throw NoSuchFieldException("Get on scaleDownBehavior is not supported.")
    set(value) { this.withScaleDownBehavior(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder.withSecurityConfiguration
 */
var software.amazon.awscdk.services.emr.CfnClusterProps.Builder.securityConfiguration: String
    get() = throw NoSuchFieldException("Get on securityConfiguration is not supported.")
    set(value) { this.withSecurityConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder.withSteps
 */
var software.amazon.awscdk.services.emr.CfnClusterProps.Builder.steps: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on steps is not supported.")
    set(value) { this.withSteps(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnClusterProps.Builder.withVisibleToAllUsers
 */
var software.amazon.awscdk.services.emr.CfnClusterProps.Builder.visibleToAllUsers: Boolean
    get() = throw NoSuchFieldException("Get on visibleToAllUsers is not supported.")
    set(value) { this.withVisibleToAllUsers(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty.Builder
 */
fun metricDimensionProperty(init: software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty.Builder.withKey
 */
var software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty.Builder.withValue
 */
var software.amazon.awscdk.services.emr.CfnCluster.MetricDimensionProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }


/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder
 */
fun jobFlowInstancesConfigProperty(init: software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty {
    val builder = software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.withPlacement
 */
var software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.placement: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on placement is not supported.")
    set(value) { this.withPlacement(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.withCoreInstanceFleet
 */
var software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.coreInstanceFleet: software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty
    get() = throw NoSuchFieldException("Get on coreInstanceFleet is not supported.")
    set(value) { this.withCoreInstanceFleet(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.withCoreInstanceGroup
 */
var software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.coreInstanceGroup: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on coreInstanceGroup is not supported.")
    set(value) { this.withCoreInstanceGroup(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.withEc2KeyName
 */
var software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.ec2KeyName: String
    get() = throw NoSuchFieldException("Get on ec2KeyName is not supported.")
    set(value) { this.withEc2KeyName(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.withEc2SubnetId
 */
var software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.ec2SubnetId: String
    get() = throw NoSuchFieldException("Get on ec2SubnetId is not supported.")
    set(value) { this.withEc2SubnetId(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.withEmrManagedMasterSecurityGroup
 */
var software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.emrManagedMasterSecurityGroup: String
    get() = throw NoSuchFieldException("Get on emrManagedMasterSecurityGroup is not supported.")
    set(value) { this.withEmrManagedMasterSecurityGroup(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.withEmrManagedSlaveSecurityGroup
 */
var software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.emrManagedSlaveSecurityGroup: String
    get() = throw NoSuchFieldException("Get on emrManagedSlaveSecurityGroup is not supported.")
    set(value) { this.withEmrManagedSlaveSecurityGroup(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.withHadoopVersion
 */
var software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.hadoopVersion: String
    get() = throw NoSuchFieldException("Get on hadoopVersion is not supported.")
    set(value) { this.withHadoopVersion(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.withKeepJobFlowAliveWhenNoSteps
 */
var software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.keepJobFlowAliveWhenNoSteps: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on keepJobFlowAliveWhenNoSteps is not supported.")
    set(value) { this.withKeepJobFlowAliveWhenNoSteps(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.withMasterInstanceFleet
 */
var software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.masterInstanceFleet: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on masterInstanceFleet is not supported.")
    set(value) { this.withMasterInstanceFleet(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.withMasterInstanceGroup
 */
var software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.masterInstanceGroup: software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty
    get() = throw NoSuchFieldException("Get on masterInstanceGroup is not supported.")
    set(value) { this.withMasterInstanceGroup(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.withServiceAccessSecurityGroup
 */
var software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.serviceAccessSecurityGroup: String
    get() = throw NoSuchFieldException("Get on serviceAccessSecurityGroup is not supported.")
    set(value) { this.withServiceAccessSecurityGroup(value) }

/**
 * @see software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.withTerminationProtected
 */
var software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder.terminationProtected: Boolean
    get() = throw NoSuchFieldException("Get on terminationProtected is not supported.")
    set(value) { this.withTerminationProtected(value) }
