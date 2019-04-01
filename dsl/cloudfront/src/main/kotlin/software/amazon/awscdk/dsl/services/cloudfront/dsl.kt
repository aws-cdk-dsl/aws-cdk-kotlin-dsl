package software.amazon.awscdk.dsl.services.cloudfront
/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution
 */
fun software.amazon.awscdk.Construct.cfnDistribution(id: String,
                     props: software.amazon.awscdk.services.cloudfront.CfnDistributionProps? = null,
                     init: (software.amazon.awscdk.services.cloudfront.CfnDistribution.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudfront.CfnDistribution {

    val obj = software.amazon.awscdk.services.cloudfront.CfnDistribution(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity
 */
fun software.amazon.awscdk.Construct.cfnCloudFrontOriginAccessIdentity(id: String,
                     props: software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps? = null,
                     init: (software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity {

    val obj = software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution
 */
fun software.amazon.awscdk.Construct.cloudFrontWebDistribution(id: String,
                     props: software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps? = null,
                     init: (software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution {

    val obj = software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution
 */
fun software.amazon.awscdk.Construct.cfnStreamingDistribution(id: String,
                     props: software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps? = null,
                     init: (software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.() -> Unit)? = null)
        : software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution {

    val obj = software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.cloudfront.AliasConfiguration.Builder
 */
fun aliasConfiguration(init: software.amazon.awscdk.services.cloudfront.AliasConfiguration.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.AliasConfiguration {
    val builder = software.amazon.awscdk.services.cloudfront.AliasConfiguration.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.AliasConfiguration.Builder.withSslMethod
 */
var software.amazon.awscdk.services.cloudfront.AliasConfiguration.Builder.sslMethod: software.amazon.awscdk.services.cloudfront.SSLMethod
    get() = throw NoSuchFieldException("Get on sslMethod is not supported.")
    set(value) { this.withSslMethod(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.AliasConfiguration.Builder.withSecurityPolicy
 */
var software.amazon.awscdk.services.cloudfront.AliasConfiguration.Builder.securityPolicy: software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol
    get() = throw NoSuchFieldException("Get on securityPolicy is not supported.")
    set(value) { this.withSecurityPolicy(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.AliasConfiguration.Builder.withAcmCertRef
 */
var software.amazon.awscdk.services.cloudfront.AliasConfiguration.Builder.acmCertRef: String
    get() = throw NoSuchFieldException("Get on acmCertRef is not supported.")
    set(value) { this.withAcmCertRef(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty.Builder
 */
fun lambdaFunctionAssociationProperty(init: software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty.Builder.withLambdaFunctionArn
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty.Builder.lambdaFunctionArn: String
    get() = throw NoSuchFieldException("Get on lambdaFunctionArn is not supported.")
    set(value) { this.withLambdaFunctionArn(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty.Builder.withEventType
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty.Builder.eventType: String
    get() = throw NoSuchFieldException("Get on eventType is not supported.")
    set(value) { this.withEventType(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty.Builder
 */
fun customErrorResponseProperty(init: software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty.Builder.withErrorCode
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty.Builder.errorCode: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on errorCode is not supported.")
    set(value) { this.withErrorCode(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty.Builder.withErrorCachingMinTtl
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty.Builder.errorCachingMinTtl: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on errorCachingMinTtl is not supported.")
    set(value) { this.withErrorCachingMinTtl(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty.Builder.withResponseCode
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty.Builder.responseCode: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on responseCode is not supported.")
    set(value) { this.withResponseCode(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty.Builder.withResponsePagePath
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty.Builder.responsePagePath: String
    get() = throw NoSuchFieldException("Get on responsePagePath is not supported.")
    set(value) { this.withResponsePagePath(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder
 */
fun cacheBehaviorProperty(init: software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.withPathPattern
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.pathPattern: String
    get() = throw NoSuchFieldException("Get on pathPattern is not supported.")
    set(value) { this.withPathPattern(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.withForwardedValues
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.forwardedValues: software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty
    get() = throw NoSuchFieldException("Get on forwardedValues is not supported.")
    set(value) { this.withForwardedValues(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.withTargetOriginId
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.targetOriginId: String
    get() = throw NoSuchFieldException("Get on targetOriginId is not supported.")
    set(value) { this.withTargetOriginId(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.withViewerProtocolPolicy
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.viewerProtocolPolicy: String
    get() = throw NoSuchFieldException("Get on viewerProtocolPolicy is not supported.")
    set(value) { this.withViewerProtocolPolicy(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.withCompress
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.compress: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on compress is not supported.")
    set(value) { this.withCompress(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.withDefaultTtl
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.defaultTtl: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on defaultTtl is not supported.")
    set(value) { this.withDefaultTtl(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.withFieldLevelEncryptionId
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.fieldLevelEncryptionId: String
    get() = throw NoSuchFieldException("Get on fieldLevelEncryptionId is not supported.")
    set(value) { this.withFieldLevelEncryptionId(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.withLambdaFunctionAssociations
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.lambdaFunctionAssociations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on lambdaFunctionAssociations is not supported.")
    set(value) { this.withLambdaFunctionAssociations(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.withMaxTtl
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.maxTtl: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on maxTtl is not supported.")
    set(value) { this.withMaxTtl(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.withMinTtl
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.minTtl: Number
    get() = throw NoSuchFieldException("Get on minTtl is not supported.")
    set(value) { this.withMinTtl(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.withSmoothStreaming
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder.smoothStreaming: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on smoothStreaming is not supported.")
    set(value) { this.withSmoothStreaming(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty.Builder
 */
fun s3OriginProperty(init: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty.Builder.withOriginAccessIdentity
 */
var software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty.Builder.originAccessIdentity: String
    get() = throw NoSuchFieldException("Get on originAccessIdentity is not supported.")
    set(value) { this.withOriginAccessIdentity(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty.Builder.withDomainName
 */
var software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty.Builder.domainName: String
    get() = throw NoSuchFieldException("Get on domainName is not supported.")
    set(value) { this.withDomainName(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.ErrorConfiguration.Builder
 */
fun errorConfiguration(init: software.amazon.awscdk.services.cloudfront.ErrorConfiguration.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.ErrorConfiguration {
    val builder = software.amazon.awscdk.services.cloudfront.ErrorConfiguration.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.ErrorConfiguration.Builder.withOriginErrorCode
 */
var software.amazon.awscdk.services.cloudfront.ErrorConfiguration.Builder.originErrorCode: Number
    get() = throw NoSuchFieldException("Get on originErrorCode is not supported.")
    set(value) { this.withOriginErrorCode(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.ErrorConfiguration.Builder.withRespondWithErrorCode
 */
var software.amazon.awscdk.services.cloudfront.ErrorConfiguration.Builder.respondWithErrorCode: Number
    get() = throw NoSuchFieldException("Get on respondWithErrorCode is not supported.")
    set(value) { this.withRespondWithErrorCode(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.ErrorConfiguration.Builder.withRespondWithPage
 */
var software.amazon.awscdk.services.cloudfront.ErrorConfiguration.Builder.respondWithPage: String
    get() = throw NoSuchFieldException("Get on respondWithPage is not supported.")
    set(value) { this.withRespondWithPage(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.ErrorConfiguration.Builder.withCacheTtl
 */
var software.amazon.awscdk.services.cloudfront.ErrorConfiguration.Builder.cacheTtl: Number
    get() = throw NoSuchFieldException("Get on cacheTtl is not supported.")
    set(value) { this.withCacheTtl(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty.Builder
 */
fun viewerCertificateProperty(init: software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty.Builder.withCloudFrontDefaultCertificate
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty.Builder.cloudFrontDefaultCertificate: Boolean
    get() = throw NoSuchFieldException("Get on cloudFrontDefaultCertificate is not supported.")
    set(value) { this.withCloudFrontDefaultCertificate(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty.Builder.withAcmCertificateArn
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty.Builder.acmCertificateArn: String
    get() = throw NoSuchFieldException("Get on acmCertificateArn is not supported.")
    set(value) { this.withAcmCertificateArn(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty.Builder.withIamCertificateId
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty.Builder.iamCertificateId: String
    get() = throw NoSuchFieldException("Get on iamCertificateId is not supported.")
    set(value) { this.withIamCertificateId(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty.Builder.withMinimumProtocolVersion
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty.Builder.minimumProtocolVersion: String
    get() = throw NoSuchFieldException("Get on minimumProtocolVersion is not supported.")
    set(value) { this.withMinimumProtocolVersion(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty.Builder.withSslSupportMethod
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty.Builder.sslSupportMethod: String
    get() = throw NoSuchFieldException("Get on sslSupportMethod is not supported.")
    set(value) { this.withSslSupportMethod(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder
 */
fun defaultCacheBehaviorProperty(init: software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.withForwardedValues
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.forwardedValues: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on forwardedValues is not supported.")
    set(value) { this.withForwardedValues(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.withTargetOriginId
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.targetOriginId: String
    get() = throw NoSuchFieldException("Get on targetOriginId is not supported.")
    set(value) { this.withTargetOriginId(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.withViewerProtocolPolicy
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.viewerProtocolPolicy: String
    get() = throw NoSuchFieldException("Get on viewerProtocolPolicy is not supported.")
    set(value) { this.withViewerProtocolPolicy(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.withCompress
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.compress: Boolean
    get() = throw NoSuchFieldException("Get on compress is not supported.")
    set(value) { this.withCompress(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.withDefaultTtl
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.defaultTtl: Number
    get() = throw NoSuchFieldException("Get on defaultTtl is not supported.")
    set(value) { this.withDefaultTtl(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.withFieldLevelEncryptionId
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.fieldLevelEncryptionId: String
    get() = throw NoSuchFieldException("Get on fieldLevelEncryptionId is not supported.")
    set(value) { this.withFieldLevelEncryptionId(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.withLambdaFunctionAssociations
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.lambdaFunctionAssociations: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on lambdaFunctionAssociations is not supported.")
    set(value) { this.withLambdaFunctionAssociations(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.withMaxTtl
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.maxTtl: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on maxTtl is not supported.")
    set(value) { this.withMaxTtl(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.withMinTtl
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.minTtl: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on minTtl is not supported.")
    set(value) { this.withMinTtl(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.withSmoothStreaming
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder.smoothStreaming: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on smoothStreaming is not supported.")
    set(value) { this.withSmoothStreaming(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.Builder
 */
fun customOriginConfigProperty(init: software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.Builder.withHttpPort
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.Builder.httpPort: Number
    get() = throw NoSuchFieldException("Get on httpPort is not supported.")
    set(value) { this.withHttpPort(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.Builder.withHttpsPort
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.Builder.httpsPort: Number
    get() = throw NoSuchFieldException("Get on httpsPort is not supported.")
    set(value) { this.withHttpsPort(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.Builder.withOriginProtocolPolicy
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.Builder.originProtocolPolicy: String
    get() = throw NoSuchFieldException("Get on originProtocolPolicy is not supported.")
    set(value) { this.withOriginProtocolPolicy(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.Builder.withOriginReadTimeout
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.Builder.originReadTimeout: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on originReadTimeout is not supported.")
    set(value) { this.withOriginReadTimeout(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.Builder.withOriginKeepaliveTimeout
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.Builder.originKeepaliveTimeout: Number
    get() = throw NoSuchFieldException("Get on originKeepaliveTimeout is not supported.")
    set(value) { this.withOriginKeepaliveTimeout(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.LoggingConfiguration.Builder
 */
fun loggingConfiguration(init: software.amazon.awscdk.services.cloudfront.LoggingConfiguration.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.LoggingConfiguration {
    val builder = software.amazon.awscdk.services.cloudfront.LoggingConfiguration.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.LoggingConfiguration.Builder.withBucket
 */
var software.amazon.awscdk.services.cloudfront.LoggingConfiguration.Builder.bucket: software.amazon.awscdk.services.s3.IBucket
    get() = throw NoSuchFieldException("Get on bucket is not supported.")
    set(value) { this.withBucket(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.LoggingConfiguration.Builder.withPrefix
 */
var software.amazon.awscdk.services.cloudfront.LoggingConfiguration.Builder.prefix: String
    get() = throw NoSuchFieldException("Get on prefix is not supported.")
    set(value) { this.withPrefix(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.LoggingConfiguration.Builder.withIncludeCookies
 */
var software.amazon.awscdk.services.cloudfront.LoggingConfiguration.Builder.includeCookies: Boolean
    get() = throw NoSuchFieldException("Get on includeCookies is not supported.")
    set(value) { this.withIncludeCookies(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.S3OriginConfig.Builder
 */
fun s3OriginConfig(init: software.amazon.awscdk.services.cloudfront.S3OriginConfig.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.S3OriginConfig {
    val builder = software.amazon.awscdk.services.cloudfront.S3OriginConfig.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.S3OriginConfig.Builder.withOriginAccessIdentity
 */
var software.amazon.awscdk.services.cloudfront.S3OriginConfig.Builder.originAccessIdentity: software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity
    get() = throw NoSuchFieldException("Get on originAccessIdentity is not supported.")
    set(value) { this.withOriginAccessIdentity(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.S3OriginConfig.Builder.withS3BucketSource
 */
var software.amazon.awscdk.services.cloudfront.S3OriginConfig.Builder.s3BucketSource: software.amazon.awscdk.services.s3.IBucket
    get() = throw NoSuchFieldException("Get on s3BucketSource is not supported.")
    set(value) { this.withS3BucketSource(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CustomOriginConfig.Builder
 */
fun customOriginConfig(init: software.amazon.awscdk.services.cloudfront.CustomOriginConfig.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CustomOriginConfig {
    val builder = software.amazon.awscdk.services.cloudfront.CustomOriginConfig.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CustomOriginConfig.Builder.withDomainName
 */
var software.amazon.awscdk.services.cloudfront.CustomOriginConfig.Builder.domainName: String
    get() = throw NoSuchFieldException("Get on domainName is not supported.")
    set(value) { this.withDomainName(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CustomOriginConfig.Builder.withHttpPort
 */
var software.amazon.awscdk.services.cloudfront.CustomOriginConfig.Builder.httpPort: Number
    get() = throw NoSuchFieldException("Get on httpPort is not supported.")
    set(value) { this.withHttpPort(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CustomOriginConfig.Builder.withHttpsPort
 */
var software.amazon.awscdk.services.cloudfront.CustomOriginConfig.Builder.httpsPort: Number
    get() = throw NoSuchFieldException("Get on httpsPort is not supported.")
    set(value) { this.withHttpsPort(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CustomOriginConfig.Builder.withOriginKeepaliveTimeoutSeconds
 */
var software.amazon.awscdk.services.cloudfront.CustomOriginConfig.Builder.originKeepaliveTimeoutSeconds: Number
    get() = throw NoSuchFieldException("Get on originKeepaliveTimeoutSeconds is not supported.")
    set(value) { this.withOriginKeepaliveTimeoutSeconds(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CustomOriginConfig.Builder.withOriginProtocolPolicy
 */
var software.amazon.awscdk.services.cloudfront.CustomOriginConfig.Builder.originProtocolPolicy: software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy
    get() = throw NoSuchFieldException("Get on originProtocolPolicy is not supported.")
    set(value) { this.withOriginProtocolPolicy(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CustomOriginConfig.Builder.withOriginReadTimeoutSeconds
 */
var software.amazon.awscdk.services.cloudfront.CustomOriginConfig.Builder.originReadTimeoutSeconds: Number
    get() = throw NoSuchFieldException("Get on originReadTimeoutSeconds is not supported.")
    set(value) { this.withOriginReadTimeoutSeconds(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty.Builder
 */
fun originCustomHeaderProperty(init: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty.Builder.withHeaderName
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty.Builder.headerName: String
    get() = throw NoSuchFieldException("Get on headerName is not supported.")
    set(value) { this.withHeaderName(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty.Builder.withHeaderValue
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty.Builder.headerValue: String
    get() = throw NoSuchFieldException("Get on headerValue is not supported.")
    set(value) { this.withHeaderValue(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty.Builder
 */
fun geoRestrictionProperty(init: software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty.Builder.withRestrictionType
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty.Builder.restrictionType: String
    get() = throw NoSuchFieldException("Get on restrictionType is not supported.")
    set(value) { this.withRestrictionType(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty.Builder
 */
fun forwardedValuesProperty(init: software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty.Builder.withQueryString
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty.Builder.queryString: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on queryString is not supported.")
    set(value) { this.withQueryString(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty.Builder.withCookies
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty.Builder.cookies: software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty
    get() = throw NoSuchFieldException("Get on cookies is not supported.")
    set(value) { this.withCookies(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps.Builder
 */
fun cfnStreamingDistributionProps(init: software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps {
    val builder = software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps.Builder.withStreamingDistributionConfig
 */
var software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps.Builder.streamingDistributionConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on streamingDistributionConfig is not supported.")
    set(value) { this.withStreamingDistributionConfig(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty.Builder
 */
fun s3OriginConfigProperty(init: software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty.Builder.withOriginAccessIdentity
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty.Builder.originAccessIdentity: String
    get() = throw NoSuchFieldException("Get on originAccessIdentity is not supported.")
    set(value) { this.withOriginAccessIdentity(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.SourceConfiguration.Builder
 */
fun sourceConfiguration(init: software.amazon.awscdk.services.cloudfront.SourceConfiguration.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.SourceConfiguration {
    val builder = software.amazon.awscdk.services.cloudfront.SourceConfiguration.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.SourceConfiguration.Builder.withCustomOriginSource
 */
var software.amazon.awscdk.services.cloudfront.SourceConfiguration.Builder.customOriginSource: software.amazon.awscdk.services.cloudfront.CustomOriginConfig
    get() = throw NoSuchFieldException("Get on customOriginSource is not supported.")
    set(value) { this.withCustomOriginSource(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.SourceConfiguration.Builder.withS3OriginSource
 */
var software.amazon.awscdk.services.cloudfront.SourceConfiguration.Builder.s3OriginSource: software.amazon.awscdk.services.cloudfront.S3OriginConfig
    get() = throw NoSuchFieldException("Get on s3OriginSource is not supported.")
    set(value) { this.withS3OriginSource(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.SourceConfiguration.Builder.withOriginPath
 */
var software.amazon.awscdk.services.cloudfront.SourceConfiguration.Builder.originPath: String
    get() = throw NoSuchFieldException("Get on originPath is not supported.")
    set(value) { this.withOriginPath(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty.Builder
 */
fun trustedSignersProperty(init: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.TrustedSignersProperty.Builder.enabled: Boolean
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty.Builder
 */
fun restrictionsProperty(init: software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty.Builder.withGeoRestriction
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty.Builder.geoRestriction: software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty
    get() = throw NoSuchFieldException("Get on geoRestriction is not supported.")
    set(value) { this.withGeoRestriction(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder
 */
fun cloudFrontWebDistributionProps(init: software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps {
    val builder = software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.withComment
 */
var software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.comment: String
    get() = throw NoSuchFieldException("Get on comment is not supported.")
    set(value) { this.withComment(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.withPriceClass
 */
var software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.priceClass: software.amazon.awscdk.services.cloudfront.PriceClass
    get() = throw NoSuchFieldException("Get on priceClass is not supported.")
    set(value) { this.withPriceClass(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.withWebAclId
 */
var software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.webAclId: String
    get() = throw NoSuchFieldException("Get on webAclId is not supported.")
    set(value) { this.withWebAclId(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.withDefaultRootObject
 */
var software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.defaultRootObject: String
    get() = throw NoSuchFieldException("Get on defaultRootObject is not supported.")
    set(value) { this.withDefaultRootObject(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.withHttpVersion
 */
var software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.httpVersion: software.amazon.awscdk.services.cloudfront.HttpVersion
    get() = throw NoSuchFieldException("Get on httpVersion is not supported.")
    set(value) { this.withHttpVersion(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.withViewerProtocolPolicy
 */
var software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.viewerProtocolPolicy: software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy
    get() = throw NoSuchFieldException("Get on viewerProtocolPolicy is not supported.")
    set(value) { this.withViewerProtocolPolicy(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.withAliasConfiguration
 */
var software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.aliasConfiguration: software.amazon.awscdk.services.cloudfront.AliasConfiguration
    get() = throw NoSuchFieldException("Get on aliasConfiguration is not supported.")
    set(value) { this.withAliasConfiguration(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.withEnableIpV6
 */
var software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.enableIpV6: Boolean
    get() = throw NoSuchFieldException("Get on enableIpV6 is not supported.")
    set(value) { this.withEnableIpV6(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.withLoggingConfig
 */
var software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder.loggingConfig: software.amazon.awscdk.services.cloudfront.LoggingConfiguration
    get() = throw NoSuchFieldException("Get on loggingConfig is not supported.")
    set(value) { this.withLoggingConfig(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder
 */
fun distributionConfigProperty(init: software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.withComment
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.comment: String
    get() = throw NoSuchFieldException("Get on comment is not supported.")
    set(value) { this.withComment(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.withLogging
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.logging: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on logging is not supported.")
    set(value) { this.withLogging(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.withPriceClass
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.priceClass: String
    get() = throw NoSuchFieldException("Get on priceClass is not supported.")
    set(value) { this.withPriceClass(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.enabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.withCacheBehaviors
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.cacheBehaviors: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on cacheBehaviors is not supported.")
    set(value) { this.withCacheBehaviors(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.withCustomErrorResponses
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.customErrorResponses: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on customErrorResponses is not supported.")
    set(value) { this.withCustomErrorResponses(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.withIpv6Enabled
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.ipv6Enabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on ipv6Enabled is not supported.")
    set(value) { this.withIpv6Enabled(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.withOrigins
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.origins: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on origins is not supported.")
    set(value) { this.withOrigins(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.withRestrictions
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.restrictions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on restrictions is not supported.")
    set(value) { this.withRestrictions(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.withViewerCertificate
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.viewerCertificate: software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty
    get() = throw NoSuchFieldException("Get on viewerCertificate is not supported.")
    set(value) { this.withViewerCertificate(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.withDefaultCacheBehavior
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.defaultCacheBehavior: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on defaultCacheBehavior is not supported.")
    set(value) { this.withDefaultCacheBehavior(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.withWebAclId
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.webAclId: String
    get() = throw NoSuchFieldException("Get on webAclId is not supported.")
    set(value) { this.withWebAclId(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.withDefaultRootObject
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.defaultRootObject: String
    get() = throw NoSuchFieldException("Get on defaultRootObject is not supported.")
    set(value) { this.withDefaultRootObject(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.withHttpVersion
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder.httpVersion: String
    get() = throw NoSuchFieldException("Get on httpVersion is not supported.")
    set(value) { this.withHttpVersion(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.Behavior.Builder
 */
fun behavior(init: software.amazon.awscdk.services.cloudfront.Behavior.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.Behavior {
    val builder = software.amazon.awscdk.services.cloudfront.Behavior.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.Behavior.Builder.withAllowedMethods
 */
var software.amazon.awscdk.services.cloudfront.Behavior.Builder.allowedMethods: software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods
    get() = throw NoSuchFieldException("Get on allowedMethods is not supported.")
    set(value) { this.withAllowedMethods(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.Behavior.Builder.withPathPattern
 */
var software.amazon.awscdk.services.cloudfront.Behavior.Builder.pathPattern: String
    get() = throw NoSuchFieldException("Get on pathPattern is not supported.")
    set(value) { this.withPathPattern(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.Behavior.Builder.withForwardedValues
 */
var software.amazon.awscdk.services.cloudfront.Behavior.Builder.forwardedValues: software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty
    get() = throw NoSuchFieldException("Get on forwardedValues is not supported.")
    set(value) { this.withForwardedValues(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.Behavior.Builder.withCachedMethods
 */
var software.amazon.awscdk.services.cloudfront.Behavior.Builder.cachedMethods: software.amazon.awscdk.services.cloudfront.CloudFrontAllowedCachedMethods
    get() = throw NoSuchFieldException("Get on cachedMethods is not supported.")
    set(value) { this.withCachedMethods(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.Behavior.Builder.withCompress
 */
var software.amazon.awscdk.services.cloudfront.Behavior.Builder.compress: Boolean
    get() = throw NoSuchFieldException("Get on compress is not supported.")
    set(value) { this.withCompress(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.Behavior.Builder.withDefaultTtlSeconds
 */
var software.amazon.awscdk.services.cloudfront.Behavior.Builder.defaultTtlSeconds: Number
    get() = throw NoSuchFieldException("Get on defaultTtlSeconds is not supported.")
    set(value) { this.withDefaultTtlSeconds(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.Behavior.Builder.withIsDefaultBehavior
 */
var software.amazon.awscdk.services.cloudfront.Behavior.Builder.isDefaultBehavior: Boolean
    get() = throw NoSuchFieldException("Get on isDefaultBehavior is not supported.")
    set(value) { this.withIsDefaultBehavior(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.Behavior.Builder.withMaxTtlSeconds
 */
var software.amazon.awscdk.services.cloudfront.Behavior.Builder.maxTtlSeconds: Number
    get() = throw NoSuchFieldException("Get on maxTtlSeconds is not supported.")
    set(value) { this.withMaxTtlSeconds(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.Behavior.Builder.withMinTtlSeconds
 */
var software.amazon.awscdk.services.cloudfront.Behavior.Builder.minTtlSeconds: Number
    get() = throw NoSuchFieldException("Get on minTtlSeconds is not supported.")
    set(value) { this.withMinTtlSeconds(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps.Builder
 */
fun cfnCloudFrontOriginAccessIdentityProps(init: software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps {
    val builder = software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps.Builder.withCloudFrontOriginAccessIdentityConfig
 */
var software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps.Builder.cloudFrontOriginAccessIdentityConfig: software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty
    get() = throw NoSuchFieldException("Get on cloudFrontOriginAccessIdentityConfig is not supported.")
    set(value) { this.withCloudFrontOriginAccessIdentityConfig(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty.Builder
 */
fun loggingProperty(init: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty.Builder.withBucket
 */
var software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty.Builder.bucket: String
    get() = throw NoSuchFieldException("Get on bucket is not supported.")
    set(value) { this.withBucket(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty.Builder.enabled: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty.Builder.withPrefix
 */
var software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.LoggingProperty.Builder.prefix: String
    get() = throw NoSuchFieldException("Get on prefix is not supported.")
    set(value) { this.withPrefix(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistributionProps.Builder
 */
fun cfnDistributionProps(init: software.amazon.awscdk.services.cloudfront.CfnDistributionProps.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnDistributionProps {
    val builder = software.amazon.awscdk.services.cloudfront.CfnDistributionProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistributionProps.Builder.withDistributionConfig
 */
var software.amazon.awscdk.services.cloudfront.CfnDistributionProps.Builder.distributionConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on distributionConfig is not supported.")
    set(value) { this.withDistributionConfig(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder
 */
fun originProperty(init: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder.withId
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder.withOriginPath
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder.originPath: String
    get() = throw NoSuchFieldException("Get on originPath is not supported.")
    set(value) { this.withOriginPath(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder.withS3OriginConfig
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder.s3OriginConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on s3OriginConfig is not supported.")
    set(value) { this.withS3OriginConfig(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder.withOriginCustomHeaders
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder.originCustomHeaders: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on originCustomHeaders is not supported.")
    set(value) { this.withOriginCustomHeaders(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder.withDomainName
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder.domainName: String
    get() = throw NoSuchFieldException("Get on domainName is not supported.")
    set(value) { this.withDomainName(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder.withCustomOriginConfig
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder.customOriginConfig: software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty
    get() = throw NoSuchFieldException("Get on customOriginConfig is not supported.")
    set(value) { this.withCustomOriginConfig(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder
 */
fun streamingDistributionConfigProperty(init: software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.withComment
 */
var software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.comment: String
    get() = throw NoSuchFieldException("Get on comment is not supported.")
    set(value) { this.withComment(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.withS3Origin
 */
var software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.s3Origin: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on s3Origin is not supported.")
    set(value) { this.withS3Origin(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.withTrustedSigners
 */
var software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.trustedSigners: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on trustedSigners is not supported.")
    set(value) { this.withTrustedSigners(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.withLogging
 */
var software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.logging: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on logging is not supported.")
    set(value) { this.withLogging(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.withPriceClass
 */
var software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.priceClass: String
    get() = throw NoSuchFieldException("Get on priceClass is not supported.")
    set(value) { this.withPriceClass(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.withEnabled
 */
var software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.enabled: Boolean
    get() = throw NoSuchFieldException("Get on enabled is not supported.")
    set(value) { this.withEnabled(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty.Builder
 */
fun cookiesProperty(init: software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty.Builder.withForward
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty.Builder.forward: String
    get() = throw NoSuchFieldException("Get on forward is not supported.")
    set(value) { this.withForward(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.Builder
 */
fun cloudFrontOriginAccessIdentityConfigProperty(init: software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.Builder.withComment
 */
var software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.Builder.comment: String
    get() = throw NoSuchFieldException("Get on comment is not supported.")
    set(value) { this.withComment(value) }


/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty.Builder
 */
fun loggingProperty(init: software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty.Builder.() -> Unit): software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty {
    val builder = software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty.Builder.withBucket
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty.Builder.bucket: String
    get() = throw NoSuchFieldException("Get on bucket is not supported.")
    set(value) { this.withBucket(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty.Builder.withPrefix
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty.Builder.prefix: String
    get() = throw NoSuchFieldException("Get on prefix is not supported.")
    set(value) { this.withPrefix(value) }

/**
 * @see software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty.Builder.withIncludeCookies
 */
var software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty.Builder.includeCookies: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on includeCookies is not supported.")
    set(value) { this.withIncludeCookies(value) }
