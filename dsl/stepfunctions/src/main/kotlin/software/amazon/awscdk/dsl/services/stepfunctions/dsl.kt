package software.amazon.awscdk.dsl.services.stepfunctions
/**
 * @see software.amazon.awscdk.services.stepfunctions.Succeed
 */
fun software.amazon.awscdk.Construct.succeed(id: String,
                     props: software.amazon.awscdk.services.stepfunctions.SucceedProps? = null,
                     init: (software.amazon.awscdk.services.stepfunctions.Succeed.() -> Unit)? = null)
        : software.amazon.awscdk.services.stepfunctions.Succeed {

    val obj = software.amazon.awscdk.services.stepfunctions.Succeed(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.stepfunctions.Task
 */
fun software.amazon.awscdk.Construct.task(id: String,
                     props: software.amazon.awscdk.services.stepfunctions.TaskProps? = null,
                     init: (software.amazon.awscdk.services.stepfunctions.Task.() -> Unit)? = null)
        : software.amazon.awscdk.services.stepfunctions.Task {

    val obj = software.amazon.awscdk.services.stepfunctions.Task(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.stepfunctions.CfnStateMachine
 */
fun software.amazon.awscdk.Construct.cfnStateMachine(id: String,
                     props: software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps? = null,
                     init: (software.amazon.awscdk.services.stepfunctions.CfnStateMachine.() -> Unit)? = null)
        : software.amazon.awscdk.services.stepfunctions.CfnStateMachine {

    val obj = software.amazon.awscdk.services.stepfunctions.CfnStateMachine(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.stepfunctions.CfnActivity
 */
fun software.amazon.awscdk.Construct.cfnActivity(id: String,
                     props: software.amazon.awscdk.services.stepfunctions.CfnActivityProps? = null,
                     init: (software.amazon.awscdk.services.stepfunctions.CfnActivity.() -> Unit)? = null)
        : software.amazon.awscdk.services.stepfunctions.CfnActivity {

    val obj = software.amazon.awscdk.services.stepfunctions.CfnActivity(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.stepfunctions.Choice
 */
fun software.amazon.awscdk.Construct.choice(id: String,
                     props: software.amazon.awscdk.services.stepfunctions.ChoiceProps? = null,
                     init: (software.amazon.awscdk.services.stepfunctions.Choice.() -> Unit)? = null)
        : software.amazon.awscdk.services.stepfunctions.Choice {

    val obj = software.amazon.awscdk.services.stepfunctions.Choice(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.stepfunctions.Activity
 */
fun software.amazon.awscdk.Construct.activity(id: String,
                     props: software.amazon.awscdk.services.stepfunctions.ActivityProps? = null,
                     init: (software.amazon.awscdk.services.stepfunctions.Activity.() -> Unit)? = null)
        : software.amazon.awscdk.services.stepfunctions.Activity {

    val obj = software.amazon.awscdk.services.stepfunctions.Activity(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.stepfunctions.Wait
 */
fun software.amazon.awscdk.Construct.wait(id: String,
                     props: software.amazon.awscdk.services.stepfunctions.WaitProps? = null,
                     init: (software.amazon.awscdk.services.stepfunctions.Wait.() -> Unit)? = null)
        : software.amazon.awscdk.services.stepfunctions.Wait {

    val obj = software.amazon.awscdk.services.stepfunctions.Wait(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.stepfunctions.StateMachine
 */
fun software.amazon.awscdk.Construct.stateMachine(id: String,
                     props: software.amazon.awscdk.services.stepfunctions.StateMachineProps? = null,
                     init: (software.amazon.awscdk.services.stepfunctions.StateMachine.() -> Unit)? = null)
        : software.amazon.awscdk.services.stepfunctions.StateMachine {

    val obj = software.amazon.awscdk.services.stepfunctions.StateMachine(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.stepfunctions.Pass
 */
fun software.amazon.awscdk.Construct.pass(id: String,
                     props: software.amazon.awscdk.services.stepfunctions.PassProps? = null,
                     init: (software.amazon.awscdk.services.stepfunctions.Pass.() -> Unit)? = null)
        : software.amazon.awscdk.services.stepfunctions.Pass {

    val obj = software.amazon.awscdk.services.stepfunctions.Pass(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.stepfunctions.Parallel
 */
fun software.amazon.awscdk.Construct.parallel(id: String,
                     props: software.amazon.awscdk.services.stepfunctions.ParallelProps? = null,
                     init: (software.amazon.awscdk.services.stepfunctions.Parallel.() -> Unit)? = null)
        : software.amazon.awscdk.services.stepfunctions.Parallel {

    val obj = software.amazon.awscdk.services.stepfunctions.Parallel(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.stepfunctions.Fail
 */
fun software.amazon.awscdk.Construct.fail(id: String,
                     props: software.amazon.awscdk.services.stepfunctions.FailProps? = null,
                     init: (software.amazon.awscdk.services.stepfunctions.Fail.() -> Unit)? = null)
        : software.amazon.awscdk.services.stepfunctions.Fail {

    val obj = software.amazon.awscdk.services.stepfunctions.Fail(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.stepfunctions.Succeed
 */
fun software.amazon.awscdk.Construct.succeed(id: String,
                     init: (software.amazon.awscdk.services.stepfunctions.Succeed.() -> Unit)? = null)
        : software.amazon.awscdk.services.stepfunctions.Succeed {

    val obj = software.amazon.awscdk.services.stepfunctions.Succeed(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.stepfunctions.Choice
 */
fun software.amazon.awscdk.Construct.choice(id: String,
                     init: (software.amazon.awscdk.services.stepfunctions.Choice.() -> Unit)? = null)
        : software.amazon.awscdk.services.stepfunctions.Choice {

    val obj = software.amazon.awscdk.services.stepfunctions.Choice(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.stepfunctions.Activity
 */
fun software.amazon.awscdk.Construct.activity(id: String,
                     init: (software.amazon.awscdk.services.stepfunctions.Activity.() -> Unit)? = null)
        : software.amazon.awscdk.services.stepfunctions.Activity {

    val obj = software.amazon.awscdk.services.stepfunctions.Activity(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.stepfunctions.Pass
 */
fun software.amazon.awscdk.Construct.pass(id: String,
                     init: (software.amazon.awscdk.services.stepfunctions.Pass.() -> Unit)? = null)
        : software.amazon.awscdk.services.stepfunctions.Pass {

    val obj = software.amazon.awscdk.services.stepfunctions.Pass(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.stepfunctions.Parallel
 */
fun software.amazon.awscdk.Construct.parallel(id: String,
                     init: (software.amazon.awscdk.services.stepfunctions.Parallel.() -> Unit)? = null)
        : software.amazon.awscdk.services.stepfunctions.Parallel {

    val obj = software.amazon.awscdk.services.stepfunctions.Parallel(this, id)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.stepfunctions.Fail
 */
fun software.amazon.awscdk.Construct.fail(id: String,
                     init: (software.amazon.awscdk.services.stepfunctions.Fail.() -> Unit)? = null)
        : software.amazon.awscdk.services.stepfunctions.Fail {

    val obj = software.amazon.awscdk.services.stepfunctions.Fail(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.stepfunctions.ParallelProps.Builder
 */
fun parallelProps(init: software.amazon.awscdk.services.stepfunctions.ParallelProps.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.ParallelProps {
    val builder = software.amazon.awscdk.services.stepfunctions.ParallelProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.ParallelProps.Builder.withResultPath
 */
var software.amazon.awscdk.services.stepfunctions.ParallelProps.Builder.resultPath: String
    get() = throw NoSuchFieldException("Get on resultPath is not supported.")
    set(value) { this.withResultPath(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.ParallelProps.Builder.withComment
 */
var software.amazon.awscdk.services.stepfunctions.ParallelProps.Builder.comment: String
    get() = throw NoSuchFieldException("Get on comment is not supported.")
    set(value) { this.withComment(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.ParallelProps.Builder.withInputPath
 */
var software.amazon.awscdk.services.stepfunctions.ParallelProps.Builder.inputPath: String
    get() = throw NoSuchFieldException("Get on inputPath is not supported.")
    set(value) { this.withInputPath(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.ParallelProps.Builder.withOutputPath
 */
var software.amazon.awscdk.services.stepfunctions.ParallelProps.Builder.outputPath: String
    get() = throw NoSuchFieldException("Get on outputPath is not supported.")
    set(value) { this.withOutputPath(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.FindStateOptions.Builder
 */
fun findStateOptions(init: software.amazon.awscdk.services.stepfunctions.FindStateOptions.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.FindStateOptions {
    val builder = software.amazon.awscdk.services.stepfunctions.FindStateOptions.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.FindStateOptions.Builder.withIncludeErrorHandlers
 */
var software.amazon.awscdk.services.stepfunctions.FindStateOptions.Builder.includeErrorHandlers: Boolean
    get() = throw NoSuchFieldException("Get on includeErrorHandlers is not supported.")
    set(value) { this.withIncludeErrorHandlers(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.StepFunctionsTaskResourceProps.Builder
 */
fun stepFunctionsTaskResourceProps(init: software.amazon.awscdk.services.stepfunctions.StepFunctionsTaskResourceProps.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.StepFunctionsTaskResourceProps {
    val builder = software.amazon.awscdk.services.stepfunctions.StepFunctionsTaskResourceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.StepFunctionsTaskResourceProps.Builder.withMetricPrefixSingular
 */
var software.amazon.awscdk.services.stepfunctions.StepFunctionsTaskResourceProps.Builder.metricPrefixSingular: String
    get() = throw NoSuchFieldException("Get on metricPrefixSingular is not supported.")
    set(value) { this.withMetricPrefixSingular(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.StepFunctionsTaskResourceProps.Builder.withMetricPrefixPlural
 */
var software.amazon.awscdk.services.stepfunctions.StepFunctionsTaskResourceProps.Builder.metricPrefixPlural: String
    get() = throw NoSuchFieldException("Get on metricPrefixPlural is not supported.")
    set(value) { this.withMetricPrefixPlural(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.StepFunctionsTaskResourceProps.Builder.withResourceArn
 */
var software.amazon.awscdk.services.stepfunctions.StepFunctionsTaskResourceProps.Builder.resourceArn: String
    get() = throw NoSuchFieldException("Get on resourceArn is not supported.")
    set(value) { this.withResourceArn(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.TaskProps.Builder
 */
fun taskProps(init: software.amazon.awscdk.services.stepfunctions.TaskProps.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.TaskProps {
    val builder = software.amazon.awscdk.services.stepfunctions.TaskProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.TaskProps.Builder.withResultPath
 */
var software.amazon.awscdk.services.stepfunctions.TaskProps.Builder.resultPath: String
    get() = throw NoSuchFieldException("Get on resultPath is not supported.")
    set(value) { this.withResultPath(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.TaskProps.Builder.withComment
 */
var software.amazon.awscdk.services.stepfunctions.TaskProps.Builder.comment: String
    get() = throw NoSuchFieldException("Get on comment is not supported.")
    set(value) { this.withComment(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.TaskProps.Builder.withInputPath
 */
var software.amazon.awscdk.services.stepfunctions.TaskProps.Builder.inputPath: String
    get() = throw NoSuchFieldException("Get on inputPath is not supported.")
    set(value) { this.withInputPath(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.TaskProps.Builder.withOutputPath
 */
var software.amazon.awscdk.services.stepfunctions.TaskProps.Builder.outputPath: String
    get() = throw NoSuchFieldException("Get on outputPath is not supported.")
    set(value) { this.withOutputPath(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.TaskProps.Builder.withResource
 */
var software.amazon.awscdk.services.stepfunctions.TaskProps.Builder.resource: software.amazon.awscdk.services.stepfunctions.IStepFunctionsTaskResource
    get() = throw NoSuchFieldException("Get on resource is not supported.")
    set(value) { this.withResource(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.TaskProps.Builder.withHeartbeatSeconds
 */
var software.amazon.awscdk.services.stepfunctions.TaskProps.Builder.heartbeatSeconds: Number
    get() = throw NoSuchFieldException("Get on heartbeatSeconds is not supported.")
    set(value) { this.withHeartbeatSeconds(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.TaskProps.Builder.withTimeoutSeconds
 */
var software.amazon.awscdk.services.stepfunctions.TaskProps.Builder.timeoutSeconds: Number
    get() = throw NoSuchFieldException("Get on timeoutSeconds is not supported.")
    set(value) { this.withTimeoutSeconds(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.StateMachineImportProps.Builder
 */
fun stateMachineImportProps(init: software.amazon.awscdk.services.stepfunctions.StateMachineImportProps.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.StateMachineImportProps {
    val builder = software.amazon.awscdk.services.stepfunctions.StateMachineImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.StateMachineImportProps.Builder.withStateMachineArn
 */
var software.amazon.awscdk.services.stepfunctions.StateMachineImportProps.Builder.stateMachineArn: String
    get() = throw NoSuchFieldException("Get on stateMachineArn is not supported.")
    set(value) { this.withStateMachineArn(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.SucceedProps.Builder
 */
fun succeedProps(init: software.amazon.awscdk.services.stepfunctions.SucceedProps.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.SucceedProps {
    val builder = software.amazon.awscdk.services.stepfunctions.SucceedProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.SucceedProps.Builder.withComment
 */
var software.amazon.awscdk.services.stepfunctions.SucceedProps.Builder.comment: String
    get() = throw NoSuchFieldException("Get on comment is not supported.")
    set(value) { this.withComment(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.SucceedProps.Builder.withInputPath
 */
var software.amazon.awscdk.services.stepfunctions.SucceedProps.Builder.inputPath: String
    get() = throw NoSuchFieldException("Get on inputPath is not supported.")
    set(value) { this.withInputPath(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.SucceedProps.Builder.withOutputPath
 */
var software.amazon.awscdk.services.stepfunctions.SucceedProps.Builder.outputPath: String
    get() = throw NoSuchFieldException("Get on outputPath is not supported.")
    set(value) { this.withOutputPath(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.CfnActivityProps.Builder
 */
fun cfnActivityProps(init: software.amazon.awscdk.services.stepfunctions.CfnActivityProps.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.CfnActivityProps {
    val builder = software.amazon.awscdk.services.stepfunctions.CfnActivityProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.CfnActivityProps.Builder.withName
 */
var software.amazon.awscdk.services.stepfunctions.CfnActivityProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty.Builder
 */
fun tagsEntryProperty(init: software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty {
    val builder = software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty.Builder.withKey
 */
var software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty.Builder.withValue
 */
var software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.AfterwardsOptions.Builder
 */
fun afterwardsOptions(init: software.amazon.awscdk.services.stepfunctions.AfterwardsOptions.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.AfterwardsOptions {
    val builder = software.amazon.awscdk.services.stepfunctions.AfterwardsOptions.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.AfterwardsOptions.Builder.withIncludeErrorHandlers
 */
var software.amazon.awscdk.services.stepfunctions.AfterwardsOptions.Builder.includeErrorHandlers: Boolean
    get() = throw NoSuchFieldException("Get on includeErrorHandlers is not supported.")
    set(value) { this.withIncludeErrorHandlers(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.AfterwardsOptions.Builder.withIncludeOtherwise
 */
var software.amazon.awscdk.services.stepfunctions.AfterwardsOptions.Builder.includeOtherwise: Boolean
    get() = throw NoSuchFieldException("Get on includeOtherwise is not supported.")
    set(value) { this.withIncludeOtherwise(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.StateProps.Builder
 */
fun stateProps(init: software.amazon.awscdk.services.stepfunctions.StateProps.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.StateProps {
    val builder = software.amazon.awscdk.services.stepfunctions.StateProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.StateProps.Builder.withResultPath
 */
var software.amazon.awscdk.services.stepfunctions.StateProps.Builder.resultPath: String
    get() = throw NoSuchFieldException("Get on resultPath is not supported.")
    set(value) { this.withResultPath(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.StateProps.Builder.withComment
 */
var software.amazon.awscdk.services.stepfunctions.StateProps.Builder.comment: String
    get() = throw NoSuchFieldException("Get on comment is not supported.")
    set(value) { this.withComment(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.StateProps.Builder.withInputPath
 */
var software.amazon.awscdk.services.stepfunctions.StateProps.Builder.inputPath: String
    get() = throw NoSuchFieldException("Get on inputPath is not supported.")
    set(value) { this.withInputPath(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.StateProps.Builder.withOutputPath
 */
var software.amazon.awscdk.services.stepfunctions.StateProps.Builder.outputPath: String
    get() = throw NoSuchFieldException("Get on outputPath is not supported.")
    set(value) { this.withOutputPath(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.CatchProps.Builder
 */
fun catchProps(init: software.amazon.awscdk.services.stepfunctions.CatchProps.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.CatchProps {
    val builder = software.amazon.awscdk.services.stepfunctions.CatchProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.CatchProps.Builder.withResultPath
 */
var software.amazon.awscdk.services.stepfunctions.CatchProps.Builder.resultPath: String
    get() = throw NoSuchFieldException("Get on resultPath is not supported.")
    set(value) { this.withResultPath(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.ActivityProps.Builder
 */
fun activityProps(init: software.amazon.awscdk.services.stepfunctions.ActivityProps.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.ActivityProps {
    val builder = software.amazon.awscdk.services.stepfunctions.ActivityProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.ActivityProps.Builder.withActivityName
 */
var software.amazon.awscdk.services.stepfunctions.ActivityProps.Builder.activityName: String
    get() = throw NoSuchFieldException("Get on activityName is not supported.")
    set(value) { this.withActivityName(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.ChoiceProps.Builder
 */
fun choiceProps(init: software.amazon.awscdk.services.stepfunctions.ChoiceProps.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.ChoiceProps {
    val builder = software.amazon.awscdk.services.stepfunctions.ChoiceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.ChoiceProps.Builder.withComment
 */
var software.amazon.awscdk.services.stepfunctions.ChoiceProps.Builder.comment: String
    get() = throw NoSuchFieldException("Get on comment is not supported.")
    set(value) { this.withComment(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.ChoiceProps.Builder.withInputPath
 */
var software.amazon.awscdk.services.stepfunctions.ChoiceProps.Builder.inputPath: String
    get() = throw NoSuchFieldException("Get on inputPath is not supported.")
    set(value) { this.withInputPath(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.ChoiceProps.Builder.withOutputPath
 */
var software.amazon.awscdk.services.stepfunctions.ChoiceProps.Builder.outputPath: String
    get() = throw NoSuchFieldException("Get on outputPath is not supported.")
    set(value) { this.withOutputPath(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty.Builder
 */
fun tagsEntryProperty(init: software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty {
    val builder = software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty.Builder.withKey
 */
var software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty.Builder.key: String
    get() = throw NoSuchFieldException("Get on key is not supported.")
    set(value) { this.withKey(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty.Builder.withValue
 */
var software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty.Builder.value: String
    get() = throw NoSuchFieldException("Get on value is not supported.")
    set(value) { this.withValue(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.SingleStateOptions.Builder
 */
fun singleStateOptions(init: software.amazon.awscdk.services.stepfunctions.SingleStateOptions.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.SingleStateOptions {
    val builder = software.amazon.awscdk.services.stepfunctions.SingleStateOptions.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.SingleStateOptions.Builder.withResultPath
 */
var software.amazon.awscdk.services.stepfunctions.SingleStateOptions.Builder.resultPath: String
    get() = throw NoSuchFieldException("Get on resultPath is not supported.")
    set(value) { this.withResultPath(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.SingleStateOptions.Builder.withComment
 */
var software.amazon.awscdk.services.stepfunctions.SingleStateOptions.Builder.comment: String
    get() = throw NoSuchFieldException("Get on comment is not supported.")
    set(value) { this.withComment(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.SingleStateOptions.Builder.withPrefixStates
 */
var software.amazon.awscdk.services.stepfunctions.SingleStateOptions.Builder.prefixStates: String
    get() = throw NoSuchFieldException("Get on prefixStates is not supported.")
    set(value) { this.withPrefixStates(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.SingleStateOptions.Builder.withStateId
 */
var software.amazon.awscdk.services.stepfunctions.SingleStateOptions.Builder.stateId: String
    get() = throw NoSuchFieldException("Get on stateId is not supported.")
    set(value) { this.withStateId(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.SingleStateOptions.Builder.withInputPath
 */
var software.amazon.awscdk.services.stepfunctions.SingleStateOptions.Builder.inputPath: String
    get() = throw NoSuchFieldException("Get on inputPath is not supported.")
    set(value) { this.withInputPath(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.SingleStateOptions.Builder.withOutputPath
 */
var software.amazon.awscdk.services.stepfunctions.SingleStateOptions.Builder.outputPath: String
    get() = throw NoSuchFieldException("Get on outputPath is not supported.")
    set(value) { this.withOutputPath(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.StateMachineProps.Builder
 */
fun stateMachineProps(init: software.amazon.awscdk.services.stepfunctions.StateMachineProps.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.StateMachineProps {
    val builder = software.amazon.awscdk.services.stepfunctions.StateMachineProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.StateMachineProps.Builder.withStateMachineName
 */
var software.amazon.awscdk.services.stepfunctions.StateMachineProps.Builder.stateMachineName: String
    get() = throw NoSuchFieldException("Get on stateMachineName is not supported.")
    set(value) { this.withStateMachineName(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.StateMachineProps.Builder.withRole
 */
var software.amazon.awscdk.services.stepfunctions.StateMachineProps.Builder.role: software.amazon.awscdk.services.iam.Role
    get() = throw NoSuchFieldException("Get on role is not supported.")
    set(value) { this.withRole(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.StateMachineProps.Builder.withDefinition
 */
var software.amazon.awscdk.services.stepfunctions.StateMachineProps.Builder.definition: software.amazon.awscdk.services.stepfunctions.IChainable
    get() = throw NoSuchFieldException("Get on definition is not supported.")
    set(value) { this.withDefinition(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.StateMachineProps.Builder.withTimeoutSec
 */
var software.amazon.awscdk.services.stepfunctions.StateMachineProps.Builder.timeoutSec: Number
    get() = throw NoSuchFieldException("Get on timeoutSec is not supported.")
    set(value) { this.withTimeoutSec(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.PassProps.Builder
 */
fun passProps(init: software.amazon.awscdk.services.stepfunctions.PassProps.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.PassProps {
    val builder = software.amazon.awscdk.services.stepfunctions.PassProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.PassProps.Builder.withResultPath
 */
var software.amazon.awscdk.services.stepfunctions.PassProps.Builder.resultPath: String
    get() = throw NoSuchFieldException("Get on resultPath is not supported.")
    set(value) { this.withResultPath(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.PassProps.Builder.withComment
 */
var software.amazon.awscdk.services.stepfunctions.PassProps.Builder.comment: String
    get() = throw NoSuchFieldException("Get on comment is not supported.")
    set(value) { this.withComment(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.PassProps.Builder.withResult
 */
var software.amazon.awscdk.services.stepfunctions.PassProps.Builder.result: Any
    get() = throw NoSuchFieldException("Get on result is not supported.")
    set(value) { this.withResult(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.PassProps.Builder.withInputPath
 */
var software.amazon.awscdk.services.stepfunctions.PassProps.Builder.inputPath: String
    get() = throw NoSuchFieldException("Get on inputPath is not supported.")
    set(value) { this.withInputPath(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.PassProps.Builder.withOutputPath
 */
var software.amazon.awscdk.services.stepfunctions.PassProps.Builder.outputPath: String
    get() = throw NoSuchFieldException("Get on outputPath is not supported.")
    set(value) { this.withOutputPath(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.FailProps.Builder
 */
fun failProps(init: software.amazon.awscdk.services.stepfunctions.FailProps.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.FailProps {
    val builder = software.amazon.awscdk.services.stepfunctions.FailProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.FailProps.Builder.withCause
 */
var software.amazon.awscdk.services.stepfunctions.FailProps.Builder.cause: String
    get() = throw NoSuchFieldException("Get on cause is not supported.")
    set(value) { this.withCause(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.FailProps.Builder.withError
 */
var software.amazon.awscdk.services.stepfunctions.FailProps.Builder.error: String
    get() = throw NoSuchFieldException("Get on error is not supported.")
    set(value) { this.withError(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.FailProps.Builder.withComment
 */
var software.amazon.awscdk.services.stepfunctions.FailProps.Builder.comment: String
    get() = throw NoSuchFieldException("Get on comment is not supported.")
    set(value) { this.withComment(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.WaitProps.Builder
 */
fun waitProps(init: software.amazon.awscdk.services.stepfunctions.WaitProps.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.WaitProps {
    val builder = software.amazon.awscdk.services.stepfunctions.WaitProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.WaitProps.Builder.withComment
 */
var software.amazon.awscdk.services.stepfunctions.WaitProps.Builder.comment: String
    get() = throw NoSuchFieldException("Get on comment is not supported.")
    set(value) { this.withComment(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.WaitProps.Builder.withSecondsPath
 */
var software.amazon.awscdk.services.stepfunctions.WaitProps.Builder.secondsPath: String
    get() = throw NoSuchFieldException("Get on secondsPath is not supported.")
    set(value) { this.withSecondsPath(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.WaitProps.Builder.withSeconds
 */
var software.amazon.awscdk.services.stepfunctions.WaitProps.Builder.seconds: Number
    get() = throw NoSuchFieldException("Get on seconds is not supported.")
    set(value) { this.withSeconds(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.WaitProps.Builder.withTimestamp
 */
var software.amazon.awscdk.services.stepfunctions.WaitProps.Builder.timestamp: String
    get() = throw NoSuchFieldException("Get on timestamp is not supported.")
    set(value) { this.withTimestamp(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.WaitProps.Builder.withTimestampPath
 */
var software.amazon.awscdk.services.stepfunctions.WaitProps.Builder.timestampPath: String
    get() = throw NoSuchFieldException("Get on timestampPath is not supported.")
    set(value) { this.withTimestampPath(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps.Builder
 */
fun cfnStateMachineProps(init: software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps {
    val builder = software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps.Builder.withDefinitionString
 */
var software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps.Builder.definitionString: String
    get() = throw NoSuchFieldException("Get on definitionString is not supported.")
    set(value) { this.withDefinitionString(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps.Builder.withStateMachineName
 */
var software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps.Builder.stateMachineName: String
    get() = throw NoSuchFieldException("Get on stateMachineName is not supported.")
    set(value) { this.withStateMachineName(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps.Builder.withRoleArn
 */
var software.amazon.awscdk.services.stepfunctions.CfnStateMachineProps.Builder.roleArn: String
    get() = throw NoSuchFieldException("Get on roleArn is not supported.")
    set(value) { this.withRoleArn(value) }


/**
 * @see software.amazon.awscdk.services.stepfunctions.RetryProps.Builder
 */
fun retryProps(init: software.amazon.awscdk.services.stepfunctions.RetryProps.Builder.() -> Unit): software.amazon.awscdk.services.stepfunctions.RetryProps {
    val builder = software.amazon.awscdk.services.stepfunctions.RetryProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.stepfunctions.RetryProps.Builder.withBackoffRate
 */
var software.amazon.awscdk.services.stepfunctions.RetryProps.Builder.backoffRate: Number
    get() = throw NoSuchFieldException("Get on backoffRate is not supported.")
    set(value) { this.withBackoffRate(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.RetryProps.Builder.withIntervalSeconds
 */
var software.amazon.awscdk.services.stepfunctions.RetryProps.Builder.intervalSeconds: Number
    get() = throw NoSuchFieldException("Get on intervalSeconds is not supported.")
    set(value) { this.withIntervalSeconds(value) }

/**
 * @see software.amazon.awscdk.services.stepfunctions.RetryProps.Builder.withMaxAttempts
 */
var software.amazon.awscdk.services.stepfunctions.RetryProps.Builder.maxAttempts: Number
    get() = throw NoSuchFieldException("Get on maxAttempts is not supported.")
    set(value) { this.withMaxAttempts(value) }
