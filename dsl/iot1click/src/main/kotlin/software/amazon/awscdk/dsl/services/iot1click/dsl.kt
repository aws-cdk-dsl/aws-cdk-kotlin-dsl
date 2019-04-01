package software.amazon.awscdk.dsl.services.iot1click
/**
 * @see software.amazon.awscdk.services.iot1click.CfnDevice
 */
fun software.amazon.awscdk.Construct.cfnDevice(id: String,
                     props: software.amazon.awscdk.services.iot1click.CfnDeviceProps? = null,
                     init: (software.amazon.awscdk.services.iot1click.CfnDevice.() -> Unit)? = null)
        : software.amazon.awscdk.services.iot1click.CfnDevice {

    val obj = software.amazon.awscdk.services.iot1click.CfnDevice(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.iot1click.CfnProject
 */
fun software.amazon.awscdk.Construct.cfnProject(id: String,
                     props: software.amazon.awscdk.services.iot1click.CfnProjectProps? = null,
                     init: (software.amazon.awscdk.services.iot1click.CfnProject.() -> Unit)? = null)
        : software.amazon.awscdk.services.iot1click.CfnProject {

    val obj = software.amazon.awscdk.services.iot1click.CfnProject(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.iot1click.CfnPlacement
 */
fun software.amazon.awscdk.Construct.cfnPlacement(id: String,
                     props: software.amazon.awscdk.services.iot1click.CfnPlacementProps? = null,
                     init: (software.amazon.awscdk.services.iot1click.CfnPlacement.() -> Unit)? = null)
        : software.amazon.awscdk.services.iot1click.CfnPlacement {

    val obj = software.amazon.awscdk.services.iot1click.CfnPlacement(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty.Builder
 */
fun deviceTemplateProperty(init: software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty {
    val builder = software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty.Builder.withCallbackOverrides
 */
var software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty.Builder.callbackOverrides: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on callbackOverrides is not supported.")
    set(value) { this.withCallbackOverrides(value) }

/**
 * @see software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty.Builder.withDeviceType
 */
var software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty.Builder.deviceType: String
    get() = throw NoSuchFieldException("Get on deviceType is not supported.")
    set(value) { this.withDeviceType(value) }


/**
 * @see software.amazon.awscdk.services.iot1click.CfnProjectProps.Builder
 */
fun cfnProjectProps(init: software.amazon.awscdk.services.iot1click.CfnProjectProps.Builder.() -> Unit): software.amazon.awscdk.services.iot1click.CfnProjectProps {
    val builder = software.amazon.awscdk.services.iot1click.CfnProjectProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot1click.CfnProjectProps.Builder.withProjectName
 */
var software.amazon.awscdk.services.iot1click.CfnProjectProps.Builder.projectName: String
    get() = throw NoSuchFieldException("Get on projectName is not supported.")
    set(value) { this.withProjectName(value) }

/**
 * @see software.amazon.awscdk.services.iot1click.CfnProjectProps.Builder.withDescription
 */
var software.amazon.awscdk.services.iot1click.CfnProjectProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.iot1click.CfnProjectProps.Builder.withPlacementTemplate
 */
var software.amazon.awscdk.services.iot1click.CfnProjectProps.Builder.placementTemplate: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on placementTemplate is not supported.")
    set(value) { this.withPlacementTemplate(value) }


/**
 * @see software.amazon.awscdk.services.iot1click.CfnPlacementProps.Builder
 */
fun cfnPlacementProps(init: software.amazon.awscdk.services.iot1click.CfnPlacementProps.Builder.() -> Unit): software.amazon.awscdk.services.iot1click.CfnPlacementProps {
    val builder = software.amazon.awscdk.services.iot1click.CfnPlacementProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot1click.CfnPlacementProps.Builder.withPlacementName
 */
var software.amazon.awscdk.services.iot1click.CfnPlacementProps.Builder.placementName: String
    get() = throw NoSuchFieldException("Get on placementName is not supported.")
    set(value) { this.withPlacementName(value) }

/**
 * @see software.amazon.awscdk.services.iot1click.CfnPlacementProps.Builder.withProjectName
 */
var software.amazon.awscdk.services.iot1click.CfnPlacementProps.Builder.projectName: String
    get() = throw NoSuchFieldException("Get on projectName is not supported.")
    set(value) { this.withProjectName(value) }

/**
 * @see software.amazon.awscdk.services.iot1click.CfnPlacementProps.Builder.withAttributes
 */
var software.amazon.awscdk.services.iot1click.CfnPlacementProps.Builder.attributes: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on attributes is not supported.")
    set(value) { this.withAttributes(value) }

/**
 * @see software.amazon.awscdk.services.iot1click.CfnPlacementProps.Builder.withAssociatedDevices
 */
var software.amazon.awscdk.services.iot1click.CfnPlacementProps.Builder.associatedDevices: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on associatedDevices is not supported.")
    set(value) { this.withAssociatedDevices(value) }


/**
 * @see software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty.Builder
 */
fun placementTemplateProperty(init: software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty.Builder.() -> Unit): software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty {
    val builder = software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty.Builder.withDefaultAttributes
 */
var software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty.Builder.defaultAttributes: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on defaultAttributes is not supported.")
    set(value) { this.withDefaultAttributes(value) }

/**
 * @see software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty.Builder.withDeviceTemplates
 */
var software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty.Builder.deviceTemplates: software.amazon.awscdk.services.iot1click.CfnProject.DeviceTemplateProperty
    get() = throw NoSuchFieldException("Get on deviceTemplates is not supported.")
    set(value) { this.withDeviceTemplates(value) }


/**
 * @see software.amazon.awscdk.services.iot1click.CfnDeviceProps.Builder
 */
fun cfnDeviceProps(init: software.amazon.awscdk.services.iot1click.CfnDeviceProps.Builder.() -> Unit): software.amazon.awscdk.services.iot1click.CfnDeviceProps {
    val builder = software.amazon.awscdk.services.iot1click.CfnDeviceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.iot1click.CfnDeviceProps.Builder.withDeviceId
 */
var software.amazon.awscdk.services.iot1click.CfnDeviceProps.Builder.deviceId: String
    get() = throw NoSuchFieldException("Get on deviceId is not supported.")
    set(value) { this.withDeviceId(value) }

/**
 * @see software.amazon.awscdk.services.iot1click.CfnDeviceProps.Builder.withEnabled
 */
var software.amazon.awscdk.services.iot1click.CfnDeviceProps.Builder.enabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }
