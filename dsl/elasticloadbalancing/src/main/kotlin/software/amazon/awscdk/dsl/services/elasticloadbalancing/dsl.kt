package software.amazon.awscdk.dsl.services.elasticloadbalancing
/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer
 */
fun software.amazon.awscdk.Construct.cfnLoadBalancer(id: String,
                     props: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps? = null,
                     init: (software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.() -> Unit)? = null)
        : software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer {

    val obj = software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer
 */
fun software.amazon.awscdk.Construct.loadBalancer(id: String,
                     props: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps? = null,
                     init: (software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer.() -> Unit)? = null)
        : software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer {

    val obj = software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps.Builder
 */
fun loadBalancerProps(init: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps.Builder.() -> Unit): software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps {
    val builder = software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps.Builder.withInternetFacing
 */
var software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps.Builder.internetFacing: Boolean
    get() = throw NoSuchFieldException("Get on internetFacing is not supported.")
    set(value) { this.withInternetFacing(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps.Builder.withVpc
 */
var software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps.Builder.vpc: software.amazon.awscdk.services.ec2.IVpcNetwork
    get() = throw NoSuchFieldException("Get on vpc is not supported.")
    set(value) { this.withVpc(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps.Builder.withHealthCheck
 */
var software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps.Builder.healthCheck: software.amazon.awscdk.services.elasticloadbalancing.HealthCheck
    get() = throw NoSuchFieldException("Get on healthCheck is not supported.")
    set(value) { this.withHealthCheck(value) }


/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.Builder
 */
fun healthCheckProperty(init: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty {
    val builder = software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.Builder.withTarget
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.Builder.target: String
    get() = throw NoSuchFieldException("Get on target is not supported.")
    set(value) { this.withTarget(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.Builder.withHealthyThreshold
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.Builder.healthyThreshold: String
    get() = throw NoSuchFieldException("Get on healthyThreshold is not supported.")
    set(value) { this.withHealthyThreshold(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.Builder.withInterval
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.Builder.interval: String
    get() = throw NoSuchFieldException("Get on interval is not supported.")
    set(value) { this.withInterval(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.Builder.withTimeout
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.Builder.timeout: String
    get() = throw NoSuchFieldException("Get on timeout is not supported.")
    set(value) { this.withTimeout(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.Builder.withUnhealthyThreshold
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.Builder.unhealthyThreshold: String
    get() = throw NoSuchFieldException("Get on unhealthyThreshold is not supported.")
    set(value) { this.withUnhealthyThreshold(value) }


/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty.Builder
 */
fun lBCookieStickinessPolicyProperty(init: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty {
    val builder = software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty.Builder.withPolicyName
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty.Builder.policyName: String
    get() = throw NoSuchFieldException("Get on policyName is not supported.")
    set(value) { this.withPolicyName(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty.Builder.withCookieExpirationPeriod
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty.Builder.cookieExpirationPeriod: String
    get() = throw NoSuchFieldException("Get on cookieExpirationPeriod is not supported.")
    set(value) { this.withCookieExpirationPeriod(value) }


/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty.Builder
 */
fun connectionSettingsProperty(init: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty {
    val builder = software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty.Builder.withIdleTimeout
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty.Builder.idleTimeout: Number
    get() = throw NoSuchFieldException("Get on idleTimeout is not supported.")
    set(value) { this.withIdleTimeout(value) }


/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty.Builder
 */
fun accessLoggingPolicyProperty(init: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty {
    val builder = software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.enabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.withS3BucketName
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.s3BucketName: String
    get() = throw NoSuchFieldException("Get on s3BucketName is not supported.")
    set(value) { this.withS3BucketName(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.withEmitInterval
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.emitInterval: Number
    get() = throw NoSuchFieldException("Get on emitInterval is not supported.")
    set(value) { this.withEmitInterval(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.withS3BucketPrefix
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.s3BucketPrefix: String
    get() = throw NoSuchFieldException("Get on s3BucketPrefix is not supported.")
    set(value) { this.withS3BucketPrefix(value) }


/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder
 */
fun cfnLoadBalancerProps(init: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.() -> Unit): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps {
    val builder = software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.withPolicies
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.policies: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on policies is not supported.")
    set(value) { this.withPolicies(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.withListeners
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.listeners: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on listeners is not supported.")
    set(value) { this.withListeners(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.withScheme
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.scheme: String
    get() = throw NoSuchFieldException("Get on scheme is not supported.")
    set(value) { this.withScheme(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.withHealthCheck
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.healthCheck: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on healthCheck is not supported.")
    set(value) { this.withHealthCheck(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.withLoadBalancerName
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.loadBalancerName: String
    get() = throw NoSuchFieldException("Get on loadBalancerName is not supported.")
    set(value) { this.withLoadBalancerName(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.withAccessLoggingPolicy
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.accessLoggingPolicy: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty
    get() = throw NoSuchFieldException("Get on accessLoggingPolicy is not supported.")
    set(value) { this.withAccessLoggingPolicy(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.withAppCookieStickinessPolicy
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.appCookieStickinessPolicy: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on appCookieStickinessPolicy is not supported.")
    set(value) { this.withAppCookieStickinessPolicy(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.withConnectionDrainingPolicy
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.connectionDrainingPolicy: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on connectionDrainingPolicy is not supported.")
    set(value) { this.withConnectionDrainingPolicy(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.withConnectionSettings
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.connectionSettings: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty
    get() = throw NoSuchFieldException("Get on connectionSettings is not supported.")
    set(value) { this.withConnectionSettings(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.withCrossZone
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.crossZone: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on crossZone is not supported.")
    set(value) { this.withCrossZone(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.withLbCookieStickinessPolicy
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder.lbCookieStickinessPolicy: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on lbCookieStickinessPolicy is not supported.")
    set(value) { this.withLbCookieStickinessPolicy(value) }


/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.Builder
 */
fun listenersProperty(init: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty {
    val builder = software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.Builder.withInstancePort
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.Builder.instancePort: String
    get() = throw NoSuchFieldException("Get on instancePort is not supported.")
    set(value) { this.withInstancePort(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.Builder.withLoadBalancerPort
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.Builder.loadBalancerPort: String
    get() = throw NoSuchFieldException("Get on loadBalancerPort is not supported.")
    set(value) { this.withLoadBalancerPort(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.Builder.withInstanceProtocol
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.Builder.instanceProtocol: String
    get() = throw NoSuchFieldException("Get on instanceProtocol is not supported.")
    set(value) { this.withInstanceProtocol(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.Builder.withSslCertificateId
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.Builder.sslCertificateId: String
    get() = throw NoSuchFieldException("Get on sslCertificateId is not supported.")
    set(value) { this.withSslCertificateId(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.Builder.withProtocol
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.Builder.protocol: String
    get() = throw NoSuchFieldException("Get on protocol is not supported.")
    set(value) { this.withProtocol(value) }


/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener.Builder
 */
fun loadBalancerListener(init: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener.Builder.() -> Unit): software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener {
    val builder = software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener.Builder.withSslCertificateId
 */
var software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener.Builder.sslCertificateId: String
    get() = throw NoSuchFieldException("Get on sslCertificateId is not supported.")
    set(value) { this.withSslCertificateId(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener.Builder.withInternalProtocol
 */
var software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener.Builder.internalProtocol: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol
    get() = throw NoSuchFieldException("Get on internalProtocol is not supported.")
    set(value) { this.withInternalProtocol(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener.Builder.withExternalPort
 */
var software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener.Builder.externalPort: Number
    get() = throw NoSuchFieldException("Get on externalPort is not supported.")
    set(value) { this.withExternalPort(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener.Builder.withInternalPort
 */
var software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener.Builder.internalPort: Number
    get() = throw NoSuchFieldException("Get on internalPort is not supported.")
    set(value) { this.withInternalPort(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener.Builder.withExternalProtocol
 */
var software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener.Builder.externalProtocol: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol
    get() = throw NoSuchFieldException("Get on externalProtocol is not supported.")
    set(value) { this.withExternalProtocol(value) }


/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty.Builder
 */
fun connectionDrainingPolicyProperty(init: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty {
    val builder = software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty.Builder.enabled: Boolean
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty.Builder.withTimeout
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty.Builder.timeout: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on timeout is not supported.")
    set(value) { this.withTimeout(value) }


/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty.Builder
 */
fun policiesProperty(init: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty {
    val builder = software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty.Builder.withPolicyName
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty.Builder.policyName: String
    get() = throw NoSuchFieldException("Get on policyName is not supported.")
    set(value) { this.withPolicyName(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty.Builder.withPolicyType
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty.Builder.policyType: String
    get() = throw NoSuchFieldException("Get on policyType is not supported.")
    set(value) { this.withPolicyType(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty.Builder.withAttributes
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty.Builder.attributes: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on attributes is not supported.")
    set(value) { this.withAttributes(value) }


/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty.Builder
 */
fun appCookieStickinessPolicyProperty(init: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty.Builder.() -> Unit): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty {
    val builder = software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty.Builder.withPolicyName
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty.Builder.policyName: String
    get() = throw NoSuchFieldException("Get on policyName is not supported.")
    set(value) { this.withPolicyName(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty.Builder.withCookieName
 */
var software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty.Builder.cookieName: String
    get() = throw NoSuchFieldException("Get on cookieName is not supported.")
    set(value) { this.withCookieName(value) }


/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder
 */
fun healthCheck(init: software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder.() -> Unit): software.amazon.awscdk.services.elasticloadbalancing.HealthCheck {
    val builder = software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder.withPath
 */
var software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder.path: String
    get() = throw NoSuchFieldException("Get on path is not supported.")
    set(value) { this.withPath(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder.withHealthyThreshold
 */
var software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder.healthyThreshold: Number
    get() = throw NoSuchFieldException("Get on healthyThreshold is not supported.")
    set(value) { this.withHealthyThreshold(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder.withInterval
 */
var software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder.interval: Number
    get() = throw NoSuchFieldException("Get on interval is not supported.")
    set(value) { this.withInterval(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder.withTimeout
 */
var software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder.timeout: Number
    get() = throw NoSuchFieldException("Get on timeout is not supported.")
    set(value) { this.withTimeout(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder.withUnhealthyThreshold
 */
var software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder.unhealthyThreshold: Number
    get() = throw NoSuchFieldException("Get on unhealthyThreshold is not supported.")
    set(value) { this.withUnhealthyThreshold(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder.withPort
 */
var software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder.port: Number
    get() = throw NoSuchFieldException("Get on port is not supported.")
    set(value) { this.withPort(value) }

/**
 * @see software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder.withProtocol
 */
var software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder.protocol: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol
    get() = throw NoSuchFieldException("Get on protocol is not supported.")
    set(value) { this.withProtocol(value) }
