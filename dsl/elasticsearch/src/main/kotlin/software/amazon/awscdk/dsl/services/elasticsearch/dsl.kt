package software.amazon.awscdk.dsl.services.elasticsearch
/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain
 */
fun software.amazon.awscdk.Construct.cfnDomain(id: String,
                     props: software.amazon.awscdk.services.elasticsearch.CfnDomainProps? = null,
                     init: (software.amazon.awscdk.services.elasticsearch.CfnDomain.() -> Unit)? = null)
        : software.amazon.awscdk.services.elasticsearch.CfnDomain {

    val obj = software.amazon.awscdk.services.elasticsearch.CfnDomain(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain
 */
fun software.amazon.awscdk.Construct.cfnDomain(id: String,
                     init: (software.amazon.awscdk.services.elasticsearch.CfnDomain.() -> Unit)? = null)
        : software.amazon.awscdk.services.elasticsearch.CfnDomain {

    val obj = software.amazon.awscdk.services.elasticsearch.CfnDomain(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.Builder
 */
fun elasticsearchClusterConfigProperty(init: software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty {
    val builder = software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.Builder.withInstanceType
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.Builder.instanceType: String
    get() = throw NoSuchFieldException("Get on instanceType is not supported.")
    set(value) { this.withInstanceType(value) }

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.Builder.withDedicatedMasterCount
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.Builder.dedicatedMasterCount: Number
    get() = throw NoSuchFieldException("Get on dedicatedMasterCount is not supported.")
    set(value) { this.withDedicatedMasterCount(value) }

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.Builder.withDedicatedMasterEnabled
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.Builder.dedicatedMasterEnabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on dedicatedMasterEnabled is not supported.")
    set(value) { this.withDedicatedMasterEnabled(value) }

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.Builder.withDedicatedMasterType
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.Builder.dedicatedMasterType: String
    get() = throw NoSuchFieldException("Get on dedicatedMasterType is not supported.")
    set(value) { this.withDedicatedMasterType(value) }

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.Builder.withInstanceCount
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.Builder.instanceCount: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on instanceCount is not supported.")
    set(value) { this.withInstanceCount(value) }

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.Builder.withZoneAwarenessEnabled
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.Builder.zoneAwarenessEnabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on zoneAwarenessEnabled is not supported.")
    set(value) { this.withZoneAwarenessEnabled(value) }


/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty.Builder
 */
fun eBSOptionsProperty(init: software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty {
    val builder = software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty.Builder.withVolumeType
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty.Builder.volumeType: String
    get() = throw NoSuchFieldException("Get on volumeType is not supported.")
    set(value) { this.withVolumeType(value) }

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty.Builder.withIops
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty.Builder.iops: Number
    get() = throw NoSuchFieldException("Get on iops is not supported.")
    set(value) { this.withIops(value) }

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty.Builder.withVolumeSize
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty.Builder.volumeSize: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on volumeSize is not supported.")
    set(value) { this.withVolumeSize(value) }

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty.Builder.withEbsEnabled
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty.Builder.ebsEnabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ebsEnabled is not supported.")
    set(value) { this.withEbsEnabled(value) }


/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder
 */
fun cfnDomainProps(init: software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.() -> Unit): software.amazon.awscdk.services.elasticsearch.CfnDomainProps {
    val builder = software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.withNodeToNodeEncryptionOptions
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.nodeToNodeEncryptionOptions: software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty
    get() = throw NoSuchFieldException("Get on nodeToNodeEncryptionOptions is not supported.")
    set(value) { this.withNodeToNodeEncryptionOptions(value) }

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.withAdvancedOptions
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.advancedOptions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on advancedOptions is not supported.")
    set(value) { this.withAdvancedOptions(value) }

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.withElasticsearchVersion
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.elasticsearchVersion: String
    get() = throw NoSuchFieldException("Get on elasticsearchVersion is not supported.")
    set(value) { this.withElasticsearchVersion(value) }

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.withEncryptionAtRestOptions
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.encryptionAtRestOptions: software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty
    get() = throw NoSuchFieldException("Get on encryptionAtRestOptions is not supported.")
    set(value) { this.withEncryptionAtRestOptions(value) }

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.withAccessPolicies
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.accessPolicies: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on accessPolicies is not supported.")
    set(value) { this.withAccessPolicies(value) }

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.withVpcOptions
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.vpcOptions: software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty
    get() = throw NoSuchFieldException("Get on vpcOptions is not supported.")
    set(value) { this.withVpcOptions(value) }

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.withSnapshotOptions
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.snapshotOptions: software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty
    get() = throw NoSuchFieldException("Get on snapshotOptions is not supported.")
    set(value) { this.withSnapshotOptions(value) }

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.withElasticsearchClusterConfig
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.elasticsearchClusterConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on elasticsearchClusterConfig is not supported.")
    set(value) { this.withElasticsearchClusterConfig(value) }

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.withEbsOptions
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.ebsOptions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ebsOptions is not supported.")
    set(value) { this.withEbsOptions(value) }

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.withDomainName
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder.domainName: String
    get() = throw NoSuchFieldException("Get on domainName is not supported.")
    set(value) { this.withDomainName(value) }


/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty.Builder
 */
fun vPCOptionsProperty(init: software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty {
    val builder = software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty.Builder()
    builder.init()
    return builder.build()
}


/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty.Builder
 */
fun snapshotOptionsProperty(init: software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty {
    val builder = software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty.Builder.withAutomatedSnapshotStartHour
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty.Builder.automatedSnapshotStartHour: Number
    get() = throw NoSuchFieldException("Get on automatedSnapshotStartHour is not supported.")
    set(value) { this.withAutomatedSnapshotStartHour(value) }


/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty.Builder
 */
fun encryptionAtRestOptionsProperty(init: software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty {
    val builder = software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty.Builder.withKmsKeyId
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty.Builder.kmsKeyId: String
    get() = throw NoSuchFieldException("Get on kmsKeyId is not supported.")
    set(value) { this.withKmsKeyId(value) }

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty.Builder.enabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }


/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder
 */
fun nodeToNodeEncryptionOptionsProperty(init: software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty {
    val builder = software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder.enabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }
