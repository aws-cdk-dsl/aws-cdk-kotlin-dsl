package software.amazon.awscdk.dsl.services.route53resolver
/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverRule
 */
fun software.amazon.awscdk.Construct.cfnResolverRule(id: String,
                     props: software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps? = null,
                     init: (software.amazon.awscdk.services.route53resolver.CfnResolverRule.() -> Unit)? = null)
        : software.amazon.awscdk.services.route53resolver.CfnResolverRule {

    val obj = software.amazon.awscdk.services.route53resolver.CfnResolverRule(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint
 */
fun software.amazon.awscdk.Construct.cfnResolverEndpoint(id: String,
                     props: software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps? = null,
                     init: (software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.() -> Unit)? = null)
        : software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint {

    val obj = software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation
 */
fun software.amazon.awscdk.Construct.cfnResolverRuleAssociation(id: String,
                     props: software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps? = null,
                     init: (software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation.() -> Unit)? = null)
        : software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation {

    val obj = software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps.Builder
 */
fun cfnResolverEndpointProps(init: software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps.Builder.() -> Unit): software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps {
    val builder = software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps.Builder.withDirection
 */
var software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps.Builder.direction: String
    get() = throw NoSuchFieldException("Get on direction is not supported.")
    set(value) { this.withDirection(value) }

/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps.Builder.withIpAddresses
 */
var software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps.Builder.ipAddresses: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ipAddresses is not supported.")
    set(value) { this.withIpAddresses(value) }

/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps.Builder.withName
 */
var software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty.Builder
 */
fun ipAddressRequestProperty(init: software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty.Builder.() -> Unit): software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty {
    val builder = software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty.Builder.withSubnetId
 */
var software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty.Builder.subnetId: String
    get() = throw NoSuchFieldException("Get on subnetId is not supported.")
    set(value) { this.withSubnetId(value) }

/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty.Builder.withIp
 */
var software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty.Builder.ip: String
    get() = throw NoSuchFieldException("Get on ip is not supported.")
    set(value) { this.withIp(value) }


/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty.Builder
 */
fun targetAddressProperty(init: software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty.Builder.() -> Unit): software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty {
    val builder = software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty.Builder.withIp
 */
var software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty.Builder.ip: String
    get() = throw NoSuchFieldException("Get on ip is not supported.")
    set(value) { this.withIp(value) }

/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty.Builder.withPort
 */
var software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty.Builder.port: String
    get() = throw NoSuchFieldException("Get on port is not supported.")
    set(value) { this.withPort(value) }


/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.Builder
 */
fun cfnResolverRuleProps(init: software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.Builder.() -> Unit): software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps {
    val builder = software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.Builder.withDomainName
 */
var software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.Builder.domainName: String
    get() = throw NoSuchFieldException("Get on domainName is not supported.")
    set(value) { this.withDomainName(value) }

/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.Builder.withName
 */
var software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.Builder.withResolverEndpointId
 */
var software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.Builder.resolverEndpointId: String
    get() = throw NoSuchFieldException("Get on resolverEndpointId is not supported.")
    set(value) { this.withResolverEndpointId(value) }

/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.Builder.withRuleType
 */
var software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.Builder.ruleType: String
    get() = throw NoSuchFieldException("Get on ruleType is not supported.")
    set(value) { this.withRuleType(value) }

/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.Builder.withTargetIps
 */
var software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.Builder.targetIps: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on targetIps is not supported.")
    set(value) { this.withTargetIps(value) }


/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps.Builder
 */
fun cfnResolverRuleAssociationProps(init: software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps.Builder.() -> Unit): software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps {
    val builder = software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps.Builder.withVpcId
 */
var software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps.Builder.vpcId: String
    get() = throw NoSuchFieldException("Get on vpcId is not supported.")
    set(value) { this.withVpcId(value) }

/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps.Builder.withName
 */
var software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps.Builder.withResolverRuleId
 */
var software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps.Builder.resolverRuleId: String
    get() = throw NoSuchFieldException("Get on resolverRuleId is not supported.")
    set(value) { this.withResolverRuleId(value) }
