package software.amazon.awscdk.dsl.services.inspector
/**
 * @see software.amazon.awscdk.services.inspector.CfnResourceGroup
 */
fun software.amazon.awscdk.Construct.cfnResourceGroup(id: String,
                     props: software.amazon.awscdk.services.inspector.CfnResourceGroupProps? = null,
                     init: (software.amazon.awscdk.services.inspector.CfnResourceGroup.() -> Unit)? = null)
        : software.amazon.awscdk.services.inspector.CfnResourceGroup {

    val obj = software.amazon.awscdk.services.inspector.CfnResourceGroup(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.inspector.CfnAssessmentTarget
 */
fun software.amazon.awscdk.Construct.cfnAssessmentTarget(id: String,
                     props: software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps? = null,
                     init: (software.amazon.awscdk.services.inspector.CfnAssessmentTarget.() -> Unit)? = null)
        : software.amazon.awscdk.services.inspector.CfnAssessmentTarget {

    val obj = software.amazon.awscdk.services.inspector.CfnAssessmentTarget(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.inspector.CfnAssessmentTemplate
 */
fun software.amazon.awscdk.Construct.cfnAssessmentTemplate(id: String,
                     props: software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps? = null,
                     init: (software.amazon.awscdk.services.inspector.CfnAssessmentTemplate.() -> Unit)? = null)
        : software.amazon.awscdk.services.inspector.CfnAssessmentTemplate {

    val obj = software.amazon.awscdk.services.inspector.CfnAssessmentTemplate(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.inspector.CfnAssessmentTarget
 */
fun software.amazon.awscdk.Construct.cfnAssessmentTarget(id: String,
                     init: (software.amazon.awscdk.services.inspector.CfnAssessmentTarget.() -> Unit)? = null)
        : software.amazon.awscdk.services.inspector.CfnAssessmentTarget {

    val obj = software.amazon.awscdk.services.inspector.CfnAssessmentTarget(this, id)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.inspector.CfnResourceGroupProps.Builder
 */
fun cfnResourceGroupProps(init: software.amazon.awscdk.services.inspector.CfnResourceGroupProps.Builder.() -> Unit): software.amazon.awscdk.services.inspector.CfnResourceGroupProps {
    val builder = software.amazon.awscdk.services.inspector.CfnResourceGroupProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.inspector.CfnResourceGroupProps.Builder.withResourceGroupTags
 */
var software.amazon.awscdk.services.inspector.CfnResourceGroupProps.Builder.resourceGroupTags: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on resourceGroupTags is not supported.")
    set(value) { this.withResourceGroupTags(value) }


/**
 * @see software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps.Builder
 */
fun cfnAssessmentTargetProps(init: software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps.Builder.() -> Unit): software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps {
    val builder = software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps.Builder.withAssessmentTargetName
 */
var software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps.Builder.assessmentTargetName: String
    get() = throw NoSuchFieldException("Get on assessmentTargetName is not supported.")
    set(value) { this.withAssessmentTargetName(value) }

/**
 * @see software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps.Builder.withResourceGroupArn
 */
var software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps.Builder.resourceGroupArn: String
    get() = throw NoSuchFieldException("Get on resourceGroupArn is not supported.")
    set(value) { this.withResourceGroupArn(value) }


/**
 * @see software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps.Builder
 */
fun cfnAssessmentTemplateProps(init: software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps.Builder.() -> Unit): software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps {
    val builder = software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps.Builder.withAssessmentTargetArn
 */
var software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps.Builder.assessmentTargetArn: String
    get() = throw NoSuchFieldException("Get on assessmentTargetArn is not supported.")
    set(value) { this.withAssessmentTargetArn(value) }

/**
 * @see software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps.Builder.withDurationInSeconds
 */
var software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps.Builder.durationInSeconds: Number
    get() = throw NoSuchFieldException("Get on durationInSeconds is not supported.")
    set(value) { this.withDurationInSeconds(value) }

/**
 * @see software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps.Builder.withAssessmentTemplateName
 */
var software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps.Builder.assessmentTemplateName: String
    get() = throw NoSuchFieldException("Get on assessmentTemplateName is not supported.")
    set(value) { this.withAssessmentTemplateName(value) }

/**
 * @see software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps.Builder.withUserAttributesForFindings
 */
var software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps.Builder.userAttributesForFindings: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on userAttributesForFindings is not supported.")
    set(value) { this.withUserAttributesForFindings(value) }
