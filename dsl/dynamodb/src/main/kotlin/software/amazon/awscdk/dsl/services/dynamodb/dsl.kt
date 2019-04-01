package software.amazon.awscdk.dsl.services.dynamodb
/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable
 */
fun software.amazon.awscdk.Construct.cfnTable(id: String,
                     props: software.amazon.awscdk.services.dynamodb.CfnTableProps? = null,
                     init: (software.amazon.awscdk.services.dynamodb.CfnTable.() -> Unit)? = null)
        : software.amazon.awscdk.services.dynamodb.CfnTable {

    val obj = software.amazon.awscdk.services.dynamodb.CfnTable(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.dynamodb.Table
 */
fun software.amazon.awscdk.Construct.table(id: String,
                     props: software.amazon.awscdk.services.dynamodb.TableProps? = null,
                     init: (software.amazon.awscdk.services.dynamodb.Table.() -> Unit)? = null)
        : software.amazon.awscdk.services.dynamodb.Table {

    val obj = software.amazon.awscdk.services.dynamodb.Table(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty.Builder
 */
fun pointInTimeRecoverySpecificationProperty(init: software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty {
    val builder = software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty.Builder.withPointInTimeRecoveryEnabled
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty.Builder.pointInTimeRecoveryEnabled: Boolean
    get() = throw NoSuchFieldException("Get on pointInTimeRecoveryEnabled is not supported.")
    set(value) { this.withPointInTimeRecoveryEnabled(value) }


/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty.Builder
 */
fun attributeDefinitionProperty(init: software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty.Builder.() -> Unit): software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty {
    val builder = software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty.Builder.withAttributeType
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty.Builder.attributeType: String
    get() = throw NoSuchFieldException("Get on attributeType is not supported.")
    set(value) { this.withAttributeType(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty.Builder.withAttributeName
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty.Builder.attributeName: String
    get() = throw NoSuchFieldException("Get on attributeName is not supported.")
    set(value) { this.withAttributeName(value) }


/**
 * @see software.amazon.awscdk.services.dynamodb.SecondaryIndexProps.Builder
 */
fun secondaryIndexProps(init: software.amazon.awscdk.services.dynamodb.SecondaryIndexProps.Builder.() -> Unit): software.amazon.awscdk.services.dynamodb.SecondaryIndexProps {
    val builder = software.amazon.awscdk.services.dynamodb.SecondaryIndexProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dynamodb.SecondaryIndexProps.Builder.withIndexName
 */
var software.amazon.awscdk.services.dynamodb.SecondaryIndexProps.Builder.indexName: String
    get() = throw NoSuchFieldException("Get on indexName is not supported.")
    set(value) { this.withIndexName(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.SecondaryIndexProps.Builder.withProjectionType
 */
var software.amazon.awscdk.services.dynamodb.SecondaryIndexProps.Builder.projectionType: software.amazon.awscdk.services.dynamodb.ProjectionType
    get() = throw NoSuchFieldException("Get on projectionType is not supported.")
    set(value) { this.withProjectionType(value) }


/**
 * @see software.amazon.awscdk.services.dynamodb.Attribute.Builder
 */
fun attribute(init: software.amazon.awscdk.services.dynamodb.Attribute.Builder.() -> Unit): software.amazon.awscdk.services.dynamodb.Attribute {
    val builder = software.amazon.awscdk.services.dynamodb.Attribute.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dynamodb.Attribute.Builder.withType
 */
var software.amazon.awscdk.services.dynamodb.Attribute.Builder.type: software.amazon.awscdk.services.dynamodb.AttributeType
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.Attribute.Builder.withName
 */
var software.amazon.awscdk.services.dynamodb.Attribute.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.dynamodb.UtilizationScalingProps.Builder
 */
fun utilizationScalingProps(init: software.amazon.awscdk.services.dynamodb.UtilizationScalingProps.Builder.() -> Unit): software.amazon.awscdk.services.dynamodb.UtilizationScalingProps {
    val builder = software.amazon.awscdk.services.dynamodb.UtilizationScalingProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dynamodb.UtilizationScalingProps.Builder.withTargetUtilizationPercent
 */
var software.amazon.awscdk.services.dynamodb.UtilizationScalingProps.Builder.targetUtilizationPercent: Number
    get() = throw NoSuchFieldException("Get on targetUtilizationPercent is not supported.")
    set(value) { this.withTargetUtilizationPercent(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.UtilizationScalingProps.Builder.withPolicyName
 */
var software.amazon.awscdk.services.dynamodb.UtilizationScalingProps.Builder.policyName: String
    get() = throw NoSuchFieldException("Get on policyName is not supported.")
    set(value) { this.withPolicyName(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.UtilizationScalingProps.Builder.withScaleOutCooldownSec
 */
var software.amazon.awscdk.services.dynamodb.UtilizationScalingProps.Builder.scaleOutCooldownSec: Number
    get() = throw NoSuchFieldException("Get on scaleOutCooldownSec is not supported.")
    set(value) { this.withScaleOutCooldownSec(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.UtilizationScalingProps.Builder.withScaleInCooldownSec
 */
var software.amazon.awscdk.services.dynamodb.UtilizationScalingProps.Builder.scaleInCooldownSec: Number
    get() = throw NoSuchFieldException("Get on scaleInCooldownSec is not supported.")
    set(value) { this.withScaleInCooldownSec(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.UtilizationScalingProps.Builder.withDisableScaleIn
 */
var software.amazon.awscdk.services.dynamodb.UtilizationScalingProps.Builder.disableScaleIn: Boolean
    get() = throw NoSuchFieldException("Get on disableScaleIn is not supported.")
    set(value) { this.withDisableScaleIn(value) }


/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty.Builder
 */
fun projectionProperty(init: software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty.Builder.() -> Unit): software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty {
    val builder = software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty.Builder.withProjectionType
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty.Builder.projectionType: String
    get() = throw NoSuchFieldException("Get on projectionType is not supported.")
    set(value) { this.withProjectionType(value) }


/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty.Builder
 */
fun streamSpecificationProperty(init: software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty {
    val builder = software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty.Builder.withStreamViewType
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty.Builder.streamViewType: String
    get() = throw NoSuchFieldException("Get on streamViewType is not supported.")
    set(value) { this.withStreamViewType(value) }


/**
 * @see software.amazon.awscdk.services.dynamodb.EnableScalingProps.Builder
 */
fun enableScalingProps(init: software.amazon.awscdk.services.dynamodb.EnableScalingProps.Builder.() -> Unit): software.amazon.awscdk.services.dynamodb.EnableScalingProps {
    val builder = software.amazon.awscdk.services.dynamodb.EnableScalingProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dynamodb.EnableScalingProps.Builder.withMaxCapacity
 */
var software.amazon.awscdk.services.dynamodb.EnableScalingProps.Builder.maxCapacity: Number
    get() = throw NoSuchFieldException("Get on maxCapacity is not supported.")
    set(value) { this.withMaxCapacity(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.EnableScalingProps.Builder.withMinCapacity
 */
var software.amazon.awscdk.services.dynamodb.EnableScalingProps.Builder.minCapacity: Number
    get() = throw NoSuchFieldException("Get on minCapacity is not supported.")
    set(value) { this.withMinCapacity(value) }


/**
 * @see software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps.Builder
 */
fun localSecondaryIndexProps(init: software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps.Builder.() -> Unit): software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps {
    val builder = software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps.Builder.withSortKey
 */
var software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps.Builder.sortKey: software.amazon.awscdk.services.dynamodb.Attribute
    get() = throw NoSuchFieldException("Get on sortKey is not supported.")
    set(value) { this.withSortKey(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps.Builder.withIndexName
 */
var software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps.Builder.indexName: String
    get() = throw NoSuchFieldException("Get on indexName is not supported.")
    set(value) { this.withIndexName(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps.Builder.withProjectionType
 */
var software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps.Builder.projectionType: software.amazon.awscdk.services.dynamodb.ProjectionType
    get() = throw NoSuchFieldException("Get on projectionType is not supported.")
    set(value) { this.withProjectionType(value) }


/**
 * @see software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.Builder
 */
fun globalSecondaryIndexProps(init: software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.Builder.() -> Unit): software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps {
    val builder = software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.Builder.withPartitionKey
 */
var software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.Builder.partitionKey: software.amazon.awscdk.services.dynamodb.Attribute
    get() = throw NoSuchFieldException("Get on partitionKey is not supported.")
    set(value) { this.withPartitionKey(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.Builder.withReadCapacity
 */
var software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.Builder.readCapacity: Number
    get() = throw NoSuchFieldException("Get on readCapacity is not supported.")
    set(value) { this.withReadCapacity(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.Builder.withSortKey
 */
var software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.Builder.sortKey: software.amazon.awscdk.services.dynamodb.Attribute
    get() = throw NoSuchFieldException("Get on sortKey is not supported.")
    set(value) { this.withSortKey(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.Builder.withWriteCapacity
 */
var software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.Builder.writeCapacity: Number
    get() = throw NoSuchFieldException("Get on writeCapacity is not supported.")
    set(value) { this.withWriteCapacity(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.Builder.withIndexName
 */
var software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.Builder.indexName: String
    get() = throw NoSuchFieldException("Get on indexName is not supported.")
    set(value) { this.withIndexName(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.Builder.withProjectionType
 */
var software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.Builder.projectionType: software.amazon.awscdk.services.dynamodb.ProjectionType
    get() = throw NoSuchFieldException("Get on projectionType is not supported.")
    set(value) { this.withProjectionType(value) }


/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty.Builder
 */
fun provisionedThroughputProperty(init: software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty.Builder.() -> Unit): software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty {
    val builder = software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty.Builder.withWriteCapacityUnits
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty.Builder.writeCapacityUnits: Number
    get() = throw NoSuchFieldException("Get on writeCapacityUnits is not supported.")
    set(value) { this.withWriteCapacityUnits(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty.Builder.withReadCapacityUnits
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty.Builder.readCapacityUnits: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on readCapacityUnits is not supported.")
    set(value) { this.withReadCapacityUnits(value) }


/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty.Builder
 */
fun sSESpecificationProperty(init: software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty {
    val builder = software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty.Builder.withSseEnabled
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty.Builder.sseEnabled: Boolean
    get() = throw NoSuchFieldException("Get on sseEnabled is not supported.")
    set(value) { this.withSseEnabled(value) }


/**
 * @see software.amazon.awscdk.services.dynamodb.TableProps.Builder
 */
fun tableProps(init: software.amazon.awscdk.services.dynamodb.TableProps.Builder.() -> Unit): software.amazon.awscdk.services.dynamodb.TableProps {
    val builder = software.amazon.awscdk.services.dynamodb.TableProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dynamodb.TableProps.Builder.withBillingMode
 */
var software.amazon.awscdk.services.dynamodb.TableProps.Builder.billingMode: software.amazon.awscdk.services.dynamodb.BillingMode
    get() = throw NoSuchFieldException("Get on billingMode is not supported.")
    set(value) { this.withBillingMode(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.TableProps.Builder.withStreamSpecification
 */
var software.amazon.awscdk.services.dynamodb.TableProps.Builder.streamSpecification: software.amazon.awscdk.services.dynamodb.StreamViewType
    get() = throw NoSuchFieldException("Get on streamSpecification is not supported.")
    set(value) { this.withStreamSpecification(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.TableProps.Builder.withTableName
 */
var software.amazon.awscdk.services.dynamodb.TableProps.Builder.tableName: String
    get() = throw NoSuchFieldException("Get on tableName is not supported.")
    set(value) { this.withTableName(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.TableProps.Builder.withPartitionKey
 */
var software.amazon.awscdk.services.dynamodb.TableProps.Builder.partitionKey: software.amazon.awscdk.services.dynamodb.Attribute
    get() = throw NoSuchFieldException("Get on partitionKey is not supported.")
    set(value) { this.withPartitionKey(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.TableProps.Builder.withReadCapacity
 */
var software.amazon.awscdk.services.dynamodb.TableProps.Builder.readCapacity: Number
    get() = throw NoSuchFieldException("Get on readCapacity is not supported.")
    set(value) { this.withReadCapacity(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.TableProps.Builder.withSortKey
 */
var software.amazon.awscdk.services.dynamodb.TableProps.Builder.sortKey: software.amazon.awscdk.services.dynamodb.Attribute
    get() = throw NoSuchFieldException("Get on sortKey is not supported.")
    set(value) { this.withSortKey(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.TableProps.Builder.withWriteCapacity
 */
var software.amazon.awscdk.services.dynamodb.TableProps.Builder.writeCapacity: Number
    get() = throw NoSuchFieldException("Get on writeCapacity is not supported.")
    set(value) { this.withWriteCapacity(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.TableProps.Builder.withPitrEnabled
 */
var software.amazon.awscdk.services.dynamodb.TableProps.Builder.pitrEnabled: Boolean
    get() = throw NoSuchFieldException("Get on pitrEnabled is not supported.")
    set(value) { this.withPitrEnabled(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.TableProps.Builder.withTtlAttributeName
 */
var software.amazon.awscdk.services.dynamodb.TableProps.Builder.ttlAttributeName: String
    get() = throw NoSuchFieldException("Get on ttlAttributeName is not supported.")
    set(value) { this.withTtlAttributeName(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.TableProps.Builder.withSseEnabled
 */
var software.amazon.awscdk.services.dynamodb.TableProps.Builder.sseEnabled: Boolean
    get() = throw NoSuchFieldException("Get on sseEnabled is not supported.")
    set(value) { this.withSseEnabled(value) }


/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty.Builder
 */
fun localSecondaryIndexProperty(init: software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty.Builder.() -> Unit): software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty {
    val builder = software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty.Builder.withKeySchema
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty.Builder.keySchema: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on keySchema is not supported.")
    set(value) { this.withKeySchema(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty.Builder.withIndexName
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty.Builder.indexName: String
    get() = throw NoSuchFieldException("Get on indexName is not supported.")
    set(value) { this.withIndexName(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty.Builder.withProjection
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty.Builder.projection: software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty
    get() = throw NoSuchFieldException("Get on projection is not supported.")
    set(value) { this.withProjection(value) }


/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty.Builder
 */
fun globalSecondaryIndexProperty(init: software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty.Builder.() -> Unit): software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty {
    val builder = software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty.Builder.withKeySchema
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty.Builder.keySchema: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on keySchema is not supported.")
    set(value) { this.withKeySchema(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty.Builder.withProvisionedThroughput
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty.Builder.provisionedThroughput: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on provisionedThroughput is not supported.")
    set(value) { this.withProvisionedThroughput(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty.Builder.withIndexName
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty.Builder.indexName: String
    get() = throw NoSuchFieldException("Get on indexName is not supported.")
    set(value) { this.withIndexName(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty.Builder.withProjection
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty.Builder.projection: software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty
    get() = throw NoSuchFieldException("Get on projection is not supported.")
    set(value) { this.withProjection(value) }


/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty.Builder
 */
fun keySchemaProperty(init: software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty.Builder.() -> Unit): software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty {
    val builder = software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty.Builder.withKeyType
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty.Builder.keyType: String
    get() = throw NoSuchFieldException("Get on keyType is not supported.")
    set(value) { this.withKeyType(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty.Builder.withAttributeName
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty.Builder.attributeName: String
    get() = throw NoSuchFieldException("Get on attributeName is not supported.")
    set(value) { this.withAttributeName(value) }


/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty.Builder
 */
fun timeToLiveSpecificationProperty(init: software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty {
    val builder = software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty.Builder.enabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty.Builder.withAttributeName
 */
var software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty.Builder.attributeName: String
    get() = throw NoSuchFieldException("Get on attributeName is not supported.")
    set(value) { this.withAttributeName(value) }


/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder
 */
fun cfnTableProps(init: software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.() -> Unit): software.amazon.awscdk.services.dynamodb.CfnTableProps {
    val builder = software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.withKeySchema
 */
var software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.keySchema: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on keySchema is not supported.")
    set(value) { this.withKeySchema(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.withAttributeDefinitions
 */
var software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.attributeDefinitions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on attributeDefinitions is not supported.")
    set(value) { this.withAttributeDefinitions(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.withBillingMode
 */
var software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.billingMode: String
    get() = throw NoSuchFieldException("Get on billingMode is not supported.")
    set(value) { this.withBillingMode(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.withSseSpecification
 */
var software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.sseSpecification: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on sseSpecification is not supported.")
    set(value) { this.withSseSpecification(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.withGlobalSecondaryIndexes
 */
var software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.globalSecondaryIndexes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on globalSecondaryIndexes is not supported.")
    set(value) { this.withGlobalSecondaryIndexes(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.withLocalSecondaryIndexes
 */
var software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.localSecondaryIndexes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on localSecondaryIndexes is not supported.")
    set(value) { this.withLocalSecondaryIndexes(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.withPointInTimeRecoverySpecification
 */
var software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.pointInTimeRecoverySpecification: software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty
    get() = throw NoSuchFieldException("Get on pointInTimeRecoverySpecification is not supported.")
    set(value) { this.withPointInTimeRecoverySpecification(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.withProvisionedThroughput
 */
var software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.provisionedThroughput: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on provisionedThroughput is not supported.")
    set(value) { this.withProvisionedThroughput(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.withStreamSpecification
 */
var software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.streamSpecification: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on streamSpecification is not supported.")
    set(value) { this.withStreamSpecification(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.withTableName
 */
var software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.tableName: String
    get() = throw NoSuchFieldException("Get on tableName is not supported.")
    set(value) { this.withTableName(value) }

/**
 * @see software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.withTimeToLiveSpecification
 */
var software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder.timeToLiveSpecification: software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty
    get() = throw NoSuchFieldException("Get on timeToLiveSpecification is not supported.")
    set(value) { this.withTimeToLiveSpecification(value) }
