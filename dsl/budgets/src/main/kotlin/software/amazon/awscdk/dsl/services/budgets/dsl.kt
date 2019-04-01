package software.amazon.awscdk.dsl.services.budgets
/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget
 */
fun software.amazon.awscdk.Construct.cfnBudget(id: String,
                     props: software.amazon.awscdk.services.budgets.CfnBudgetProps? = null,
                     init: (software.amazon.awscdk.services.budgets.CfnBudget.() -> Unit)? = null)
        : software.amazon.awscdk.services.budgets.CfnBudget {

    val obj = software.amazon.awscdk.services.budgets.CfnBudget(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty.Builder
 */
fun spendProperty(init: software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty.Builder.() -> Unit): software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty {
    val builder = software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty.Builder.withUnit
 */
var software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty.Builder.unit: String
    get() = throw NoSuchFieldException("Get on unit is not supported.")
    set(value) { this.withUnit(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty.Builder.withAmount
 */
var software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty.Builder.amount: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on amount is not supported.")
    set(value) { this.withAmount(value) }


/**
 * @see software.amazon.awscdk.services.budgets.CfnBudgetProps.Builder
 */
fun cfnBudgetProps(init: software.amazon.awscdk.services.budgets.CfnBudgetProps.Builder.() -> Unit): software.amazon.awscdk.services.budgets.CfnBudgetProps {
    val builder = software.amazon.awscdk.services.budgets.CfnBudgetProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudgetProps.Builder.withNotificationsWithSubscribers
 */
var software.amazon.awscdk.services.budgets.CfnBudgetProps.Builder.notificationsWithSubscribers: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on notificationsWithSubscribers is not supported.")
    set(value) { this.withNotificationsWithSubscribers(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudgetProps.Builder.withBudget
 */
var software.amazon.awscdk.services.budgets.CfnBudgetProps.Builder.budget: software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty
    get() = throw NoSuchFieldException("Get on budget is not supported.")
    set(value) { this.withBudget(value) }


/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty.Builder
 */
fun subscriberProperty(init: software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty.Builder.() -> Unit): software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty {
    val builder = software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty.Builder.withAddress
 */
var software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty.Builder.address: String
    get() = throw NoSuchFieldException("Get on address is not supported.")
    set(value) { this.withAddress(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty.Builder.withSubscriptionType
 */
var software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty.Builder.subscriptionType: String
    get() = throw NoSuchFieldException("Get on subscriptionType is not supported.")
    set(value) { this.withSubscriptionType(value) }


/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty.Builder
 */
fun timePeriodProperty(init: software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty.Builder.() -> Unit): software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty {
    val builder = software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty.Builder.withStart
 */
var software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty.Builder.start: String
    get() = throw NoSuchFieldException("Get on start is not supported.")
    set(value) { this.withStart(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty.Builder.withEnd
 */
var software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty.Builder.end: String
    get() = throw NoSuchFieldException("Get on end is not supported.")
    set(value) { this.withEnd(value) }


/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder
 */
fun budgetDataProperty(init: software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder.() -> Unit): software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty {
    val builder = software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder.withBudgetName
 */
var software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder.budgetName: String
    get() = throw NoSuchFieldException("Get on budgetName is not supported.")
    set(value) { this.withBudgetName(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder.withCostFilters
 */
var software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder.costFilters: com.fasterxml.jackson.databind.node.ObjectNode
    get() = throw NoSuchFieldException("Get on costFilters is not supported.")
    set(value) { this.withCostFilters(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder.withBudgetType
 */
var software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder.budgetType: String
    get() = throw NoSuchFieldException("Get on budgetType is not supported.")
    set(value) { this.withBudgetType(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder.withBudgetLimit
 */
var software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder.budgetLimit: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on budgetLimit is not supported.")
    set(value) { this.withBudgetLimit(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder.withTimeUnit
 */
var software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder.timeUnit: String
    get() = throw NoSuchFieldException("Get on timeUnit is not supported.")
    set(value) { this.withTimeUnit(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder.withCostTypes
 */
var software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder.costTypes: software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty
    get() = throw NoSuchFieldException("Get on costTypes is not supported.")
    set(value) { this.withCostTypes(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder.withTimePeriod
 */
var software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder.timePeriod: software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty
    get() = throw NoSuchFieldException("Get on timePeriod is not supported.")
    set(value) { this.withTimePeriod(value) }


/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty.Builder
 */
fun notificationWithSubscribersProperty(init: software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty.Builder.() -> Unit): software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty {
    val builder = software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty.Builder.withNotification
 */
var software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty.Builder.notification: software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty
    get() = throw NoSuchFieldException("Get on notification is not supported.")
    set(value) { this.withNotification(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty.Builder.withSubscribers
 */
var software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty.Builder.subscribers: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on subscribers is not supported.")
    set(value) { this.withSubscribers(value) }


/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder
 */
fun costTypesProperty(init: software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.() -> Unit): software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty {
    val builder = software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.withIncludeCredit
 */
var software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.includeCredit: Boolean
    get() = throw NoSuchFieldException("Get on includeCredit is not supported.")
    set(value) { this.withIncludeCredit(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.withIncludeDiscount
 */
var software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.includeDiscount: Boolean
    get() = throw NoSuchFieldException("Get on includeDiscount is not supported.")
    set(value) { this.withIncludeDiscount(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.withIncludeOtherSubscription
 */
var software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.includeOtherSubscription: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on includeOtherSubscription is not supported.")
    set(value) { this.withIncludeOtherSubscription(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.withIncludeRecurring
 */
var software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.includeRecurring: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on includeRecurring is not supported.")
    set(value) { this.withIncludeRecurring(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.withIncludeRefund
 */
var software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.includeRefund: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on includeRefund is not supported.")
    set(value) { this.withIncludeRefund(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.withIncludeSubscription
 */
var software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.includeSubscription: Boolean
    get() = throw NoSuchFieldException("Get on includeSubscription is not supported.")
    set(value) { this.withIncludeSubscription(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.withIncludeSupport
 */
var software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.includeSupport: Boolean
    get() = throw NoSuchFieldException("Get on includeSupport is not supported.")
    set(value) { this.withIncludeSupport(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.withIncludeTax
 */
var software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.includeTax: Boolean
    get() = throw NoSuchFieldException("Get on includeTax is not supported.")
    set(value) { this.withIncludeTax(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.withIncludeUpfront
 */
var software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.includeUpfront: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on includeUpfront is not supported.")
    set(value) { this.withIncludeUpfront(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.withUseAmortized
 */
var software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.useAmortized: Boolean
    get() = throw NoSuchFieldException("Get on useAmortized is not supported.")
    set(value) { this.withUseAmortized(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.withUseBlended
 */
var software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder.useBlended: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on useBlended is not supported.")
    set(value) { this.withUseBlended(value) }


/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty.Builder
 */
fun notificationProperty(init: software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty.Builder.() -> Unit): software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty {
    val builder = software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty.Builder.withComparisonOperator
 */
var software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty.Builder.comparisonOperator: String
    get() = throw NoSuchFieldException("Get on comparisonOperator is not supported.")
    set(value) { this.withComparisonOperator(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty.Builder.withThreshold
 */
var software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty.Builder.threshold: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on threshold is not supported.")
    set(value) { this.withThreshold(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty.Builder.withNotificationType
 */
var software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty.Builder.notificationType: String
    get() = throw NoSuchFieldException("Get on notificationType is not supported.")
    set(value) { this.withNotificationType(value) }

/**
 * @see software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty.Builder.withThresholdType
 */
var software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty.Builder.thresholdType: String
    get() = throw NoSuchFieldException("Get on thresholdType is not supported.")
    set(value) { this.withThresholdType(value) }
