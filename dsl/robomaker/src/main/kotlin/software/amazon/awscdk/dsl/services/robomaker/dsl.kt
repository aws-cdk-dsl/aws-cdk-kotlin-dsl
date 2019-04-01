package software.amazon.awscdk.dsl.services.robomaker
/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion
 */
fun software.amazon.awscdk.Construct.cfnSimulationApplicationVersion(id: String,
                     props: software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps? = null,
                     init: (software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion.() -> Unit)? = null)
        : software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion {

    val obj = software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobot
 */
fun software.amazon.awscdk.Construct.cfnRobot(id: String,
                     props: software.amazon.awscdk.services.robomaker.CfnRobotProps? = null,
                     init: (software.amazon.awscdk.services.robomaker.CfnRobot.() -> Unit)? = null)
        : software.amazon.awscdk.services.robomaker.CfnRobot {

    val obj = software.amazon.awscdk.services.robomaker.CfnRobot(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplication
 */
fun software.amazon.awscdk.Construct.cfnSimulationApplication(id: String,
                     props: software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps? = null,
                     init: (software.amazon.awscdk.services.robomaker.CfnSimulationApplication.() -> Unit)? = null)
        : software.amazon.awscdk.services.robomaker.CfnSimulationApplication {

    val obj = software.amazon.awscdk.services.robomaker.CfnSimulationApplication(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.robomaker.CfnFleet
 */
fun software.amazon.awscdk.Construct.cfnFleet(id: String,
                     props: software.amazon.awscdk.services.robomaker.CfnFleetProps? = null,
                     init: (software.amazon.awscdk.services.robomaker.CfnFleet.() -> Unit)? = null)
        : software.amazon.awscdk.services.robomaker.CfnFleet {

    val obj = software.amazon.awscdk.services.robomaker.CfnFleet(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotApplication
 */
fun software.amazon.awscdk.Construct.cfnRobotApplication(id: String,
                     props: software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps? = null,
                     init: (software.amazon.awscdk.services.robomaker.CfnRobotApplication.() -> Unit)? = null)
        : software.amazon.awscdk.services.robomaker.CfnRobotApplication {

    val obj = software.amazon.awscdk.services.robomaker.CfnRobotApplication(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion
 */
fun software.amazon.awscdk.Construct.cfnRobotApplicationVersion(id: String,
                     props: software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps? = null,
                     init: (software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion.() -> Unit)? = null)
        : software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion {

    val obj = software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.robomaker.CfnFleet
 */
fun software.amazon.awscdk.Construct.cfnFleet(id: String,
                     init: (software.amazon.awscdk.services.robomaker.CfnFleet.() -> Unit)? = null)
        : software.amazon.awscdk.services.robomaker.CfnFleet {

    val obj = software.amazon.awscdk.services.robomaker.CfnFleet(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotProps.Builder
 */
fun cfnRobotProps(init: software.amazon.awscdk.services.robomaker.CfnRobotProps.Builder.() -> Unit): software.amazon.awscdk.services.robomaker.CfnRobotProps {
    val builder = software.amazon.awscdk.services.robomaker.CfnRobotProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotProps.Builder.withTags
 */
var software.amazon.awscdk.services.robomaker.CfnRobotProps.Builder.tags: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on tags is not supported.")
    set(value) { this.withTags(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotProps.Builder.withArchitecture
 */
var software.amazon.awscdk.services.robomaker.CfnRobotProps.Builder.architecture: String
    get() = throw NoSuchFieldException("Get on architecture is not supported.")
    set(value) { this.withArchitecture(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotProps.Builder.withName
 */
var software.amazon.awscdk.services.robomaker.CfnRobotProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotProps.Builder.withGreengrassGroupId
 */
var software.amazon.awscdk.services.robomaker.CfnRobotProps.Builder.greengrassGroupId: String
    get() = throw NoSuchFieldException("Get on greengrassGroupId is not supported.")
    set(value) { this.withGreengrassGroupId(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotProps.Builder.withFleet
 */
var software.amazon.awscdk.services.robomaker.CfnRobotProps.Builder.fleet: String
    get() = throw NoSuchFieldException("Get on fleet is not supported.")
    set(value) { this.withFleet(value) }


/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty.Builder
 */
fun robotSoftwareSuiteProperty(init: software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty.Builder.() -> Unit): software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty {
    val builder = software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty.Builder.withName
 */
var software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty.Builder.withVersion
 */
var software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty.Builder
 */
fun simulationSoftwareSuiteProperty(init: software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty.Builder.() -> Unit): software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty {
    val builder = software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty.Builder.withName
 */
var software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty.Builder.withVersion
 */
var software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotApplication.SourceConfigProperty.Builder
 */
fun sourceConfigProperty(init: software.amazon.awscdk.services.robomaker.CfnRobotApplication.SourceConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.robomaker.CfnRobotApplication.SourceConfigProperty {
    val builder = software.amazon.awscdk.services.robomaker.CfnRobotApplication.SourceConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotApplication.SourceConfigProperty.Builder.withS3Bucket
 */
var software.amazon.awscdk.services.robomaker.CfnRobotApplication.SourceConfigProperty.Builder.s3Bucket: String
    get() = throw NoSuchFieldException("Get on s3Bucket is not supported.")
    set(value) { this.withS3Bucket(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotApplication.SourceConfigProperty.Builder.withArchitecture
 */
var software.amazon.awscdk.services.robomaker.CfnRobotApplication.SourceConfigProperty.Builder.architecture: String
    get() = throw NoSuchFieldException("Get on architecture is not supported.")
    set(value) { this.withArchitecture(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotApplication.SourceConfigProperty.Builder.withS3Key
 */
var software.amazon.awscdk.services.robomaker.CfnRobotApplication.SourceConfigProperty.Builder.s3Key: String
    get() = throw NoSuchFieldException("Get on s3Key is not supported.")
    set(value) { this.withS3Key(value) }


/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder
 */
fun cfnSimulationApplicationProps(init: software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder.() -> Unit): software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps {
    val builder = software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder.withTags
 */
var software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder.tags: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on tags is not supported.")
    set(value) { this.withTags(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder.withRenderingEngine
 */
var software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder.renderingEngine: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on renderingEngine is not supported.")
    set(value) { this.withRenderingEngine(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder.withSimulationSoftwareSuite
 */
var software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder.simulationSoftwareSuite: software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SimulationSoftwareSuiteProperty
    get() = throw NoSuchFieldException("Get on simulationSoftwareSuite is not supported.")
    set(value) { this.withSimulationSoftwareSuite(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder.withName
 */
var software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder.withCurrentRevisionId
 */
var software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder.currentRevisionId: String
    get() = throw NoSuchFieldException("Get on currentRevisionId is not supported.")
    set(value) { this.withCurrentRevisionId(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder.withRobotSoftwareSuite
 */
var software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder.robotSoftwareSuite: software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty
    get() = throw NoSuchFieldException("Get on robotSoftwareSuite is not supported.")
    set(value) { this.withRobotSoftwareSuite(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder.withSources
 */
var software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps.Builder.sources: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on sources is not supported.")
    set(value) { this.withSources(value) }


/**
 * @see software.amazon.awscdk.services.robomaker.CfnFleetProps.Builder
 */
fun cfnFleetProps(init: software.amazon.awscdk.services.robomaker.CfnFleetProps.Builder.() -> Unit): software.amazon.awscdk.services.robomaker.CfnFleetProps {
    val builder = software.amazon.awscdk.services.robomaker.CfnFleetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.robomaker.CfnFleetProps.Builder.withTags
 */
var software.amazon.awscdk.services.robomaker.CfnFleetProps.Builder.tags: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on tags is not supported.")
    set(value) { this.withTags(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnFleetProps.Builder.withName
 */
var software.amazon.awscdk.services.robomaker.CfnFleetProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty.Builder
 */
fun sourceConfigProperty(init: software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty {
    val builder = software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty.Builder.withS3Bucket
 */
var software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty.Builder.s3Bucket: String
    get() = throw NoSuchFieldException("Get on s3Bucket is not supported.")
    set(value) { this.withS3Bucket(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty.Builder.withArchitecture
 */
var software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty.Builder.architecture: String
    get() = throw NoSuchFieldException("Get on architecture is not supported.")
    set(value) { this.withArchitecture(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty.Builder.withS3Key
 */
var software.amazon.awscdk.services.robomaker.CfnSimulationApplication.SourceConfigProperty.Builder.s3Key: String
    get() = throw NoSuchFieldException("Get on s3Key is not supported.")
    set(value) { this.withS3Key(value) }


/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty.Builder
 */
fun renderingEngineProperty(init: software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty.Builder.() -> Unit): software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty {
    val builder = software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty.Builder.withName
 */
var software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty.Builder.withVersion
 */
var software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RenderingEngineProperty.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps.Builder
 */
fun cfnSimulationApplicationVersionProps(init: software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps.Builder.() -> Unit): software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps {
    val builder = software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps.Builder.withApplication
 */
var software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps.Builder.application: String
    get() = throw NoSuchFieldException("Get on application is not supported.")
    set(value) { this.withApplication(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps.Builder.withCurrentRevisionId
 */
var software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps.Builder.currentRevisionId: String
    get() = throw NoSuchFieldException("Get on currentRevisionId is not supported.")
    set(value) { this.withCurrentRevisionId(value) }


/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty.Builder
 */
fun robotSoftwareSuiteProperty(init: software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty.Builder.() -> Unit): software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty {
    val builder = software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty.Builder.withName
 */
var software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty.Builder.withVersion
 */
var software.amazon.awscdk.services.robomaker.CfnSimulationApplication.RobotSoftwareSuiteProperty.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.Builder
 */
fun cfnRobotApplicationProps(init: software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.Builder.() -> Unit): software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps {
    val builder = software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.Builder.withTags
 */
var software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.Builder.tags: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on tags is not supported.")
    set(value) { this.withTags(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.Builder.withName
 */
var software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.Builder.withCurrentRevisionId
 */
var software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.Builder.currentRevisionId: String
    get() = throw NoSuchFieldException("Get on currentRevisionId is not supported.")
    set(value) { this.withCurrentRevisionId(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.Builder.withRobotSoftwareSuite
 */
var software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.Builder.robotSoftwareSuite: software.amazon.awscdk.services.robomaker.CfnRobotApplication.RobotSoftwareSuiteProperty
    get() = throw NoSuchFieldException("Get on robotSoftwareSuite is not supported.")
    set(value) { this.withRobotSoftwareSuite(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.Builder.withSources
 */
var software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps.Builder.sources: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on sources is not supported.")
    set(value) { this.withSources(value) }


/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps.Builder
 */
fun cfnRobotApplicationVersionProps(init: software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps.Builder.() -> Unit): software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps {
    val builder = software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps.Builder.withApplication
 */
var software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps.Builder.application: String
    get() = throw NoSuchFieldException("Get on application is not supported.")
    set(value) { this.withApplication(value) }

/**
 * @see software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps.Builder.withCurrentRevisionId
 */
var software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps.Builder.currentRevisionId: String
    get() = throw NoSuchFieldException("Get on currentRevisionId is not supported.")
    set(value) { this.withCurrentRevisionId(value) }
