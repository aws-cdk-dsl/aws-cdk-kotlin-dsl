package software.amazon.awscdk.dsl.services.certificatemanager
/**
 * @see software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate
 */
fun software.amazon.awscdk.Construct.dnsValidatedCertificate(id: String,
                     props: software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps? = null,
                     init: (software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate.() -> Unit)? = null)
        : software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate {

    val obj = software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.certificatemanager.CfnCertificate
 */
fun software.amazon.awscdk.Construct.cfnCertificate(id: String,
                     props: software.amazon.awscdk.services.certificatemanager.CfnCertificateProps? = null,
                     init: (software.amazon.awscdk.services.certificatemanager.CfnCertificate.() -> Unit)? = null)
        : software.amazon.awscdk.services.certificatemanager.CfnCertificate {

    val obj = software.amazon.awscdk.services.certificatemanager.CfnCertificate(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.certificatemanager.Certificate
 */
fun software.amazon.awscdk.Construct.certificate(id: String,
                     props: software.amazon.awscdk.services.certificatemanager.CertificateProps? = null,
                     init: (software.amazon.awscdk.services.certificatemanager.Certificate.() -> Unit)? = null)
        : software.amazon.awscdk.services.certificatemanager.Certificate {

    val obj = software.amazon.awscdk.services.certificatemanager.Certificate(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.certificatemanager.CertificateProps.Builder
 */
fun certificateProps(init: software.amazon.awscdk.services.certificatemanager.CertificateProps.Builder.() -> Unit): software.amazon.awscdk.services.certificatemanager.CertificateProps {
    val builder = software.amazon.awscdk.services.certificatemanager.CertificateProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.certificatemanager.CertificateProps.Builder.withDomainName
 */
var software.amazon.awscdk.services.certificatemanager.CertificateProps.Builder.domainName: String
    get() = throw NoSuchFieldException("Get on domainName is not supported.")
    set(value) { this.withDomainName(value) }


/**
 * @see software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps.Builder
 */
fun dnsValidatedCertificateProps(init: software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps.Builder.() -> Unit): software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps {
    val builder = software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps.Builder.withDomainName
 */
var software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps.Builder.domainName: String
    get() = throw NoSuchFieldException("Get on domainName is not supported.")
    set(value) { this.withDomainName(value) }

/**
 * @see software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps.Builder.withHostedZone
 */
var software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps.Builder.hostedZone: software.amazon.awscdk.services.route53.IHostedZone
    get() = throw NoSuchFieldException("Get on hostedZone is not supported.")
    set(value) { this.withHostedZone(value) }


/**
 * @see software.amazon.awscdk.services.certificatemanager.CertificateImportProps.Builder
 */
fun certificateImportProps(init: software.amazon.awscdk.services.certificatemanager.CertificateImportProps.Builder.() -> Unit): software.amazon.awscdk.services.certificatemanager.CertificateImportProps {
    val builder = software.amazon.awscdk.services.certificatemanager.CertificateImportProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.certificatemanager.CertificateImportProps.Builder.withCertificateArn
 */
var software.amazon.awscdk.services.certificatemanager.CertificateImportProps.Builder.certificateArn: String
    get() = throw NoSuchFieldException("Get on certificateArn is not supported.")
    set(value) { this.withCertificateArn(value) }


/**
 * @see software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty.Builder
 */
fun domainValidationOptionProperty(init: software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty.Builder.() -> Unit): software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty {
    val builder = software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty.Builder.withValidationDomain
 */
var software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty.Builder.validationDomain: String
    get() = throw NoSuchFieldException("Get on validationDomain is not supported.")
    set(value) { this.withValidationDomain(value) }

/**
 * @see software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty.Builder.withDomainName
 */
var software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty.Builder.domainName: String
    get() = throw NoSuchFieldException("Get on domainName is not supported.")
    set(value) { this.withDomainName(value) }


/**
 * @see software.amazon.awscdk.services.certificatemanager.CfnCertificateProps.Builder
 */
fun cfnCertificateProps(init: software.amazon.awscdk.services.certificatemanager.CfnCertificateProps.Builder.() -> Unit): software.amazon.awscdk.services.certificatemanager.CfnCertificateProps {
    val builder = software.amazon.awscdk.services.certificatemanager.CfnCertificateProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.certificatemanager.CfnCertificateProps.Builder.withDomainName
 */
var software.amazon.awscdk.services.certificatemanager.CfnCertificateProps.Builder.domainName: String
    get() = throw NoSuchFieldException("Get on domainName is not supported.")
    set(value) { this.withDomainName(value) }

/**
 * @see software.amazon.awscdk.services.certificatemanager.CfnCertificateProps.Builder.withValidationMethod
 */
var software.amazon.awscdk.services.certificatemanager.CfnCertificateProps.Builder.validationMethod: String
    get() = throw NoSuchFieldException("Get on validationMethod is not supported.")
    set(value) { this.withValidationMethod(value) }

/**
 * @see software.amazon.awscdk.services.certificatemanager.CfnCertificateProps.Builder.withDomainValidationOptions
 */
var software.amazon.awscdk.services.certificatemanager.CfnCertificateProps.Builder.domainValidationOptions: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on domainValidationOptions is not supported.")
    set(value) { this.withDomainValidationOptions(value) }
