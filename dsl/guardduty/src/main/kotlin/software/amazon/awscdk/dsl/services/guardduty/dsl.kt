package software.amazon.awscdk.dsl.services.guardduty
/**
 * @see software.amazon.awscdk.services.guardduty.CfnFilter
 */
fun software.amazon.awscdk.Construct.cfnFilter(id: String,
                     props: software.amazon.awscdk.services.guardduty.CfnFilterProps? = null,
                     init: (software.amazon.awscdk.services.guardduty.CfnFilter.() -> Unit)? = null)
        : software.amazon.awscdk.services.guardduty.CfnFilter {

    val obj = software.amazon.awscdk.services.guardduty.CfnFilter(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.guardduty.CfnThreatIntelSet
 */
fun software.amazon.awscdk.Construct.cfnThreatIntelSet(id: String,
                     props: software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps? = null,
                     init: (software.amazon.awscdk.services.guardduty.CfnThreatIntelSet.() -> Unit)? = null)
        : software.amazon.awscdk.services.guardduty.CfnThreatIntelSet {

    val obj = software.amazon.awscdk.services.guardduty.CfnThreatIntelSet(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.guardduty.CfnMember
 */
fun software.amazon.awscdk.Construct.cfnMember(id: String,
                     props: software.amazon.awscdk.services.guardduty.CfnMemberProps? = null,
                     init: (software.amazon.awscdk.services.guardduty.CfnMember.() -> Unit)? = null)
        : software.amazon.awscdk.services.guardduty.CfnMember {

    val obj = software.amazon.awscdk.services.guardduty.CfnMember(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.guardduty.CfnDetector
 */
fun software.amazon.awscdk.Construct.cfnDetector(id: String,
                     props: software.amazon.awscdk.services.guardduty.CfnDetectorProps? = null,
                     init: (software.amazon.awscdk.services.guardduty.CfnDetector.() -> Unit)? = null)
        : software.amazon.awscdk.services.guardduty.CfnDetector {

    val obj = software.amazon.awscdk.services.guardduty.CfnDetector(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.guardduty.CfnMaster
 */
fun software.amazon.awscdk.Construct.cfnMaster(id: String,
                     props: software.amazon.awscdk.services.guardduty.CfnMasterProps? = null,
                     init: (software.amazon.awscdk.services.guardduty.CfnMaster.() -> Unit)? = null)
        : software.amazon.awscdk.services.guardduty.CfnMaster {

    val obj = software.amazon.awscdk.services.guardduty.CfnMaster(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.guardduty.CfnIPSet
 */
fun software.amazon.awscdk.Construct.cfnIPSet(id: String,
                     props: software.amazon.awscdk.services.guardduty.CfnIPSetProps? = null,
                     init: (software.amazon.awscdk.services.guardduty.CfnIPSet.() -> Unit)? = null)
        : software.amazon.awscdk.services.guardduty.CfnIPSet {

    val obj = software.amazon.awscdk.services.guardduty.CfnIPSet(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.guardduty.CfnDetectorProps.Builder
 */
fun cfnDetectorProps(init: software.amazon.awscdk.services.guardduty.CfnDetectorProps.Builder.() -> Unit): software.amazon.awscdk.services.guardduty.CfnDetectorProps {
    val builder = software.amazon.awscdk.services.guardduty.CfnDetectorProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.guardduty.CfnDetectorProps.Builder.withEnable
 */
var software.amazon.awscdk.services.guardduty.CfnDetectorProps.Builder.enable: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enable is not supported.")
    set(value) { this.withEnable(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnDetectorProps.Builder.withFindingPublishingFrequency
 */
var software.amazon.awscdk.services.guardduty.CfnDetectorProps.Builder.findingPublishingFrequency: String
    get() = throw NoSuchFieldException("Get on findingPublishingFrequency is not supported.")
    set(value) { this.withFindingPublishingFrequency(value) }


/**
 * @see software.amazon.awscdk.services.guardduty.CfnIPSetProps.Builder
 */
fun cfnIPSetProps(init: software.amazon.awscdk.services.guardduty.CfnIPSetProps.Builder.() -> Unit): software.amazon.awscdk.services.guardduty.CfnIPSetProps {
    val builder = software.amazon.awscdk.services.guardduty.CfnIPSetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.guardduty.CfnIPSetProps.Builder.withFormat
 */
var software.amazon.awscdk.services.guardduty.CfnIPSetProps.Builder.format: String
    get() = throw NoSuchFieldException("Get on format is not supported.")
    set(value) { this.withFormat(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnIPSetProps.Builder.withDetectorId
 */
var software.amazon.awscdk.services.guardduty.CfnIPSetProps.Builder.detectorId: String
    get() = throw NoSuchFieldException("Get on detectorId is not supported.")
    set(value) { this.withDetectorId(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnIPSetProps.Builder.withLocation
 */
var software.amazon.awscdk.services.guardduty.CfnIPSetProps.Builder.location: String
    get() = throw NoSuchFieldException("Get on location is not supported.")
    set(value) { this.withLocation(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnIPSetProps.Builder.withName
 */
var software.amazon.awscdk.services.guardduty.CfnIPSetProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnIPSetProps.Builder.withActivate
 */
var software.amazon.awscdk.services.guardduty.CfnIPSetProps.Builder.activate: Boolean
    get() = throw NoSuchFieldException("Get on activate is not supported.")
    set(value) { this.withActivate(value) }


/**
 * @see software.amazon.awscdk.services.guardduty.CfnMasterProps.Builder
 */
fun cfnMasterProps(init: software.amazon.awscdk.services.guardduty.CfnMasterProps.Builder.() -> Unit): software.amazon.awscdk.services.guardduty.CfnMasterProps {
    val builder = software.amazon.awscdk.services.guardduty.CfnMasterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.guardduty.CfnMasterProps.Builder.withDetectorId
 */
var software.amazon.awscdk.services.guardduty.CfnMasterProps.Builder.detectorId: String
    get() = throw NoSuchFieldException("Get on detectorId is not supported.")
    set(value) { this.withDetectorId(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnMasterProps.Builder.withInvitationId
 */
var software.amazon.awscdk.services.guardduty.CfnMasterProps.Builder.invitationId: String
    get() = throw NoSuchFieldException("Get on invitationId is not supported.")
    set(value) { this.withInvitationId(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnMasterProps.Builder.withMasterId
 */
var software.amazon.awscdk.services.guardduty.CfnMasterProps.Builder.masterId: String
    get() = throw NoSuchFieldException("Get on masterId is not supported.")
    set(value) { this.withMasterId(value) }


/**
 * @see software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty.Builder
 */
fun conditionProperty(init: software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty.Builder.() -> Unit): software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty {
    val builder = software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty.Builder.withLt
 */
var software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty.Builder.lt: Number
    get() = throw NoSuchFieldException("Get on lt is not supported.")
    set(value) { this.withLt(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty.Builder.withLte
 */
var software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty.Builder.lte: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on lte is not supported.")
    set(value) { this.withLte(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty.Builder.withGte
 */
var software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty.Builder.gte: Number
    get() = throw NoSuchFieldException("Get on gte is not supported.")
    set(value) { this.withGte(value) }


/**
 * @see software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps.Builder
 */
fun cfnThreatIntelSetProps(init: software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps.Builder.() -> Unit): software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps {
    val builder = software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps.Builder.withFormat
 */
var software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps.Builder.format: String
    get() = throw NoSuchFieldException("Get on format is not supported.")
    set(value) { this.withFormat(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps.Builder.withDetectorId
 */
var software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps.Builder.detectorId: String
    get() = throw NoSuchFieldException("Get on detectorId is not supported.")
    set(value) { this.withDetectorId(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps.Builder.withLocation
 */
var software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps.Builder.location: String
    get() = throw NoSuchFieldException("Get on location is not supported.")
    set(value) { this.withLocation(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps.Builder.withName
 */
var software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps.Builder.withActivate
 */
var software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps.Builder.activate: Boolean
    get() = throw NoSuchFieldException("Get on activate is not supported.")
    set(value) { this.withActivate(value) }


/**
 * @see software.amazon.awscdk.services.guardduty.CfnFilterProps.Builder
 */
fun cfnFilterProps(init: software.amazon.awscdk.services.guardduty.CfnFilterProps.Builder.() -> Unit): software.amazon.awscdk.services.guardduty.CfnFilterProps {
    val builder = software.amazon.awscdk.services.guardduty.CfnFilterProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.guardduty.CfnFilterProps.Builder.withAction
 */
var software.amazon.awscdk.services.guardduty.CfnFilterProps.Builder.action: String
    get() = throw NoSuchFieldException("Get on action is not supported.")
    set(value) { this.withAction(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnFilterProps.Builder.withRank
 */
var software.amazon.awscdk.services.guardduty.CfnFilterProps.Builder.rank: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on rank is not supported.")
    set(value) { this.withRank(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnFilterProps.Builder.withDetectorId
 */
var software.amazon.awscdk.services.guardduty.CfnFilterProps.Builder.detectorId: String
    get() = throw NoSuchFieldException("Get on detectorId is not supported.")
    set(value) { this.withDetectorId(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnFilterProps.Builder.withFindingCriteria
 */
var software.amazon.awscdk.services.guardduty.CfnFilterProps.Builder.findingCriteria: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on findingCriteria is not supported.")
    set(value) { this.withFindingCriteria(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnFilterProps.Builder.withName
 */
var software.amazon.awscdk.services.guardduty.CfnFilterProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnFilterProps.Builder.withDescription
 */
var software.amazon.awscdk.services.guardduty.CfnFilterProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }


/**
 * @see software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder
 */
fun cfnMemberProps(init: software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder.() -> Unit): software.amazon.awscdk.services.guardduty.CfnMemberProps {
    val builder = software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder.withStatus
 */
var software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder.status: String
    get() = throw NoSuchFieldException("Get on status is not supported.")
    set(value) { this.withStatus(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder.withDetectorId
 */
var software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder.detectorId: String
    get() = throw NoSuchFieldException("Get on detectorId is not supported.")
    set(value) { this.withDetectorId(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder.withMessage
 */
var software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder.message: String
    get() = throw NoSuchFieldException("Get on message is not supported.")
    set(value) { this.withMessage(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder.withEmail
 */
var software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder.email: String
    get() = throw NoSuchFieldException("Get on email is not supported.")
    set(value) { this.withEmail(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder.withMemberId
 */
var software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder.memberId: String
    get() = throw NoSuchFieldException("Get on memberId is not supported.")
    set(value) { this.withMemberId(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder.withDisableEmailNotification
 */
var software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder.disableEmailNotification: Boolean
    get() = throw NoSuchFieldException("Get on disableEmailNotification is not supported.")
    set(value) { this.withDisableEmailNotification(value) }


/**
 * @see software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty.Builder
 */
fun findingCriteriaProperty(init: software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty.Builder.() -> Unit): software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty {
    val builder = software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty.Builder.withCriterion
 */
var software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty.Builder.criterion: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on criterion is not supported.")
    set(value) { this.withCriterion(value) }

/**
 * @see software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty.Builder.withItemType
 */
var software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty.Builder.itemType: software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty
    get() = throw NoSuchFieldException("Get on itemType is not supported.")
    set(value) { this.withItemType(value) }
