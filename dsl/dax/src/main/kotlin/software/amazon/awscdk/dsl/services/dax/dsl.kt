package software.amazon.awscdk.dsl.services.dax
/**
 * @see software.amazon.awscdk.services.dax.CfnParameterGroup
 */
fun software.amazon.awscdk.Construct.cfnParameterGroup(id: String,
                     props: software.amazon.awscdk.services.dax.CfnParameterGroupProps? = null,
                     init: (software.amazon.awscdk.services.dax.CfnParameterGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.dax.CfnParameterGroup {

    val obj = software.amazon.awscdk.services.dax.CfnParameterGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.dax.CfnCluster
 */
fun software.amazon.awscdk.Construct.cfnCluster(id: String,
                     props: software.amazon.awscdk.services.dax.CfnClusterProps? = null,
                     init: (software.amazon.awscdk.services.dax.CfnCluster.() -> Unit)? = null)
        : software.amazon.awscdk.services.dax.CfnCluster {

    val obj = software.amazon.awscdk.services.dax.CfnCluster(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.dax.CfnSubnetGroup
 */
fun software.amazon.awscdk.Construct.cfnSubnetGroup(id: String,
                     props: software.amazon.awscdk.services.dax.CfnSubnetGroupProps? = null,
                     init: (software.amazon.awscdk.services.dax.CfnSubnetGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.dax.CfnSubnetGroup {

    val obj = software.amazon.awscdk.services.dax.CfnSubnetGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.dax.CfnParameterGroup
 */
fun software.amazon.awscdk.Construct.cfnParameterGroup(id: String,
                     init: (software.amazon.awscdk.services.dax.CfnParameterGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.dax.CfnParameterGroup {

    val obj = software.amazon.awscdk.services.dax.CfnParameterGroup(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.dax.CfnSubnetGroupProps.Builder
 */
fun cfnSubnetGroupProps(init: software.amazon.awscdk.services.dax.CfnSubnetGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.dax.CfnSubnetGroupProps {
    val builder = software.amazon.awscdk.services.dax.CfnSubnetGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dax.CfnSubnetGroupProps.Builder.withDescription
 */
var software.amazon.awscdk.services.dax.CfnSubnetGroupProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.dax.CfnSubnetGroupProps.Builder.withSubnetGroupName
 */
var software.amazon.awscdk.services.dax.CfnSubnetGroupProps.Builder.subnetGroupName: String
    get() = throw NoSuchFieldException("Get on subnetGroupName is not supported.")
    set(value) { this.withSubnetGroupName(value) }


/**
 * @see software.amazon.awscdk.services.dax.CfnParameterGroupProps.Builder
 */
fun cfnParameterGroupProps(init: software.amazon.awscdk.services.dax.CfnParameterGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.dax.CfnParameterGroupProps {
    val builder = software.amazon.awscdk.services.dax.CfnParameterGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dax.CfnParameterGroupProps.Builder.withParameterGroupName
 */
var software.amazon.awscdk.services.dax.CfnParameterGroupProps.Builder.parameterGroupName: String
    get() = throw NoSuchFieldException("Get on parameterGroupName is not supported.")
    set(value) { this.withParameterGroupName(value) }

/**
 * @see software.amazon.awscdk.services.dax.CfnParameterGroupProps.Builder.withDescription
 */
var software.amazon.awscdk.services.dax.CfnParameterGroupProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.dax.CfnParameterGroupProps.Builder.withParameterNameValues
 */
var software.amazon.awscdk.services.dax.CfnParameterGroupProps.Builder.parameterNameValues: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on parameterNameValues is not supported.")
    set(value) { this.withParameterNameValues(value) }


/**
 * @see software.amazon.awscdk.services.dax.CfnCluster.SSESpecificationProperty.Builder
 */
fun sSESpecificationProperty(init: software.amazon.awscdk.services.dax.CfnCluster.SSESpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.dax.CfnCluster.SSESpecificationProperty {
    val builder = software.amazon.awscdk.services.dax.CfnCluster.SSESpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dax.CfnCluster.SSESpecificationProperty.Builder.withSseEnabled
 */
var software.amazon.awscdk.services.dax.CfnCluster.SSESpecificationProperty.Builder.sseEnabled: Boolean
    get() = throw NoSuchFieldException("Get on sseEnabled is not supported.")
    set(value) { this.withSseEnabled(value) }


/**
 * @see software.amazon.awscdk.services.dax.CfnClusterProps.Builder
 */
fun cfnClusterProps(init: software.amazon.awscdk.services.dax.CfnClusterProps.Builder.() -> Unit): software.amazon.awscdk.services.dax.CfnClusterProps {
    val builder = software.amazon.awscdk.services.dax.CfnClusterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dax.CfnClusterProps.Builder.withSseSpecification
 */
var software.amazon.awscdk.services.dax.CfnClusterProps.Builder.sseSpecification: software.amazon.awscdk.services.dax.CfnCluster.SSESpecificationProperty
    get() = throw NoSuchFieldException("Get on sseSpecification is not supported.")
    set(value) { this.withSseSpecification(value) }

/**
 * @see software.amazon.awscdk.services.dax.CfnClusterProps.Builder.withParameterGroupName
 */
var software.amazon.awscdk.services.dax.CfnClusterProps.Builder.parameterGroupName: String
    get() = throw NoSuchFieldException("Get on parameterGroupName is not supported.")
    set(value) { this.withParameterGroupName(value) }

/**
 * @see software.amazon.awscdk.services.dax.CfnClusterProps.Builder.withTags
 */
var software.amazon.awscdk.services.dax.CfnClusterProps.Builder.tags: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on tags is not supported.")
    set(value) { this.withTags(value) }

/**
 * @see software.amazon.awscdk.services.dax.CfnClusterProps.Builder.withPreferredMaintenanceWindow
 */
var software.amazon.awscdk.services.dax.CfnClusterProps.Builder.preferredMaintenanceWindow: String
    get() = throw NoSuchFieldException("Get on preferredMaintenanceWindow is not supported.")
    set(value) { this.withPreferredMaintenanceWindow(value) }

/**
 * @see software.amazon.awscdk.services.dax.CfnClusterProps.Builder.withClusterName
 */
var software.amazon.awscdk.services.dax.CfnClusterProps.Builder.clusterName: String
    get() = throw NoSuchFieldException("Get on clusterName is not supported.")
    set(value) { this.withClusterName(value) }

/**
 * @see software.amazon.awscdk.services.dax.CfnClusterProps.Builder.withNodeType
 */
var software.amazon.awscdk.services.dax.CfnClusterProps.Builder.nodeType: String
    get() = throw NoSuchFieldException("Get on nodeType is not supported.")
    set(value) { this.withNodeType(value) }

/**
 * @see software.amazon.awscdk.services.dax.CfnClusterProps.Builder.withNotificationTopicArn
 */
var software.amazon.awscdk.services.dax.CfnClusterProps.Builder.notificationTopicArn: String
    get() = throw NoSuchFieldException("Get on notificationTopicArn is not supported.")
    set(value) { this.withNotificationTopicArn(value) }

/**
 * @see software.amazon.awscdk.services.dax.CfnClusterProps.Builder.withDescription
 */
var software.amazon.awscdk.services.dax.CfnClusterProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.dax.CfnClusterProps.Builder.withIamRoleArn
 */
var software.amazon.awscdk.services.dax.CfnClusterProps.Builder.iamRoleArn: String
    get() = throw NoSuchFieldException("Get on iamRoleArn is not supported.")
    set(value) { this.withIamRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.dax.CfnClusterProps.Builder.withSubnetGroupName
 */
var software.amazon.awscdk.services.dax.CfnClusterProps.Builder.subnetGroupName: String
    get() = throw NoSuchFieldException("Get on subnetGroupName is not supported.")
    set(value) { this.withSubnetGroupName(value) }

/**
 * @see software.amazon.awscdk.services.dax.CfnClusterProps.Builder.withReplicationFactor
 */
var software.amazon.awscdk.services.dax.CfnClusterProps.Builder.replicationFactor: Number
    get() = throw NoSuchFieldException("Get on replicationFactor is not supported.")
    set(value) { this.withReplicationFactor(value) }
