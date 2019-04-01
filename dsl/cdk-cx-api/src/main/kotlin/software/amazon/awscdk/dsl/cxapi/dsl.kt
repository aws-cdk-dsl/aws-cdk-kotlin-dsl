package software.amazon.awscdk.dsl.cxapi

/**
 * @see software.amazon.awscdk.cxapi.MissingContext.Builder
 */
fun missingContext(init: software.amazon.awscdk.cxapi.MissingContext.Builder.() -> Unit): software.amazon.awscdk.cxapi.MissingContext {
    val builder = software.amazon.awscdk.cxapi.MissingContext.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.cxapi.MissingContext.Builder.withProvider
 */
var software.amazon.awscdk.cxapi.MissingContext.Builder.provider: String
    get() = throw NoSuchFieldException("Get on provider is not supported.")
    set(value) { this.withProvider(value) }


/**
 * @see software.amazon.awscdk.cxapi.AppRuntime.Builder
 */
fun appRuntime(init: software.amazon.awscdk.cxapi.AppRuntime.Builder.() -> Unit): software.amazon.awscdk.cxapi.AppRuntime {
    val builder = software.amazon.awscdk.cxapi.AppRuntime.Builder()
    builder.init()
    return builder.build()
}


/**
 * @see software.amazon.awscdk.cxapi.MetadataEntry.Builder
 */
fun metadataEntry(init: software.amazon.awscdk.cxapi.MetadataEntry.Builder.() -> Unit): software.amazon.awscdk.cxapi.MetadataEntry {
    val builder = software.amazon.awscdk.cxapi.MetadataEntry.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.cxapi.MetadataEntry.Builder.withData
 */
var software.amazon.awscdk.cxapi.MetadataEntry.Builder.data: Any
    get() = throw NoSuchFieldException("Get on data is not supported.")
    set(value) { this.withData(value) }

/**
 * @see software.amazon.awscdk.cxapi.MetadataEntry.Builder.withType
 */
var software.amazon.awscdk.cxapi.MetadataEntry.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.cxapi.SSMParameterContextQuery.Builder
 */
fun sSMParameterContextQuery(init: software.amazon.awscdk.cxapi.SSMParameterContextQuery.Builder.() -> Unit): software.amazon.awscdk.cxapi.SSMParameterContextQuery {
    val builder = software.amazon.awscdk.cxapi.SSMParameterContextQuery.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.cxapi.SSMParameterContextQuery.Builder.withParameterName
 */
var software.amazon.awscdk.cxapi.SSMParameterContextQuery.Builder.parameterName: String
    get() = throw NoSuchFieldException("Get on parameterName is not supported.")
    set(value) { this.withParameterName(value) }

/**
 * @see software.amazon.awscdk.cxapi.SSMParameterContextQuery.Builder.withRegion
 */
var software.amazon.awscdk.cxapi.SSMParameterContextQuery.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.cxapi.SSMParameterContextQuery.Builder.withAccount
 */
var software.amazon.awscdk.cxapi.SSMParameterContextQuery.Builder.account: String
    get() = throw NoSuchFieldException("Get on account is not supported.")
    set(value) { this.withAccount(value) }


/**
 * @see software.amazon.awscdk.cxapi.Artifact.Builder
 */
fun artifact(init: software.amazon.awscdk.cxapi.Artifact.Builder.() -> Unit): software.amazon.awscdk.cxapi.Artifact {
    val builder = software.amazon.awscdk.cxapi.Artifact.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.cxapi.Artifact.Builder.withEnvironment
 */
var software.amazon.awscdk.cxapi.Artifact.Builder.environment: String
    get() = throw NoSuchFieldException("Get on environment is not supported.")
    set(value) { this.withEnvironment(value) }

/**
 * @see software.amazon.awscdk.cxapi.Artifact.Builder.withAutoDeploy
 */
var software.amazon.awscdk.cxapi.Artifact.Builder.autoDeploy: Boolean
    get() = throw NoSuchFieldException("Get on autoDeploy is not supported.")
    set(value) { this.withAutoDeploy(value) }

/**
 * @see software.amazon.awscdk.cxapi.Artifact.Builder.withType
 */
var software.amazon.awscdk.cxapi.Artifact.Builder.type: software.amazon.awscdk.cxapi.ArtifactType
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.cxapi.AvailabilityZonesContextQuery.Builder
 */
fun availabilityZonesContextQuery(init: software.amazon.awscdk.cxapi.AvailabilityZonesContextQuery.Builder.() -> Unit): software.amazon.awscdk.cxapi.AvailabilityZonesContextQuery {
    val builder = software.amazon.awscdk.cxapi.AvailabilityZonesContextQuery.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.cxapi.AvailabilityZonesContextQuery.Builder.withRegion
 */
var software.amazon.awscdk.cxapi.AvailabilityZonesContextQuery.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.cxapi.AvailabilityZonesContextQuery.Builder.withAccount
 */
var software.amazon.awscdk.cxapi.AvailabilityZonesContextQuery.Builder.account: String
    get() = throw NoSuchFieldException("Get on account is not supported.")
    set(value) { this.withAccount(value) }


/**
 * @see software.amazon.awscdk.cxapi.FileAssetMetadataEntry.Builder
 */
fun fileAssetMetadataEntry(init: software.amazon.awscdk.cxapi.FileAssetMetadataEntry.Builder.() -> Unit): software.amazon.awscdk.cxapi.FileAssetMetadataEntry {
    val builder = software.amazon.awscdk.cxapi.FileAssetMetadataEntry.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.cxapi.FileAssetMetadataEntry.Builder.withId
 */
var software.amazon.awscdk.cxapi.FileAssetMetadataEntry.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.cxapi.FileAssetMetadataEntry.Builder.withPath
 */
var software.amazon.awscdk.cxapi.FileAssetMetadataEntry.Builder.path: String
    get() = throw NoSuchFieldException("Get on path is not supported.")
    set(value) { this.withPath(value) }

/**
 * @see software.amazon.awscdk.cxapi.FileAssetMetadataEntry.Builder.withPackaging
 */
var software.amazon.awscdk.cxapi.FileAssetMetadataEntry.Builder.packaging: String
    get() = throw NoSuchFieldException("Get on packaging is not supported.")
    set(value) { this.withPackaging(value) }

/**
 * @see software.amazon.awscdk.cxapi.FileAssetMetadataEntry.Builder.withS3KeyParameter
 */
var software.amazon.awscdk.cxapi.FileAssetMetadataEntry.Builder.s3KeyParameter: String
    get() = throw NoSuchFieldException("Get on s3KeyParameter is not supported.")
    set(value) { this.withS3KeyParameter(value) }

/**
 * @see software.amazon.awscdk.cxapi.FileAssetMetadataEntry.Builder.withS3BucketParameter
 */
var software.amazon.awscdk.cxapi.FileAssetMetadataEntry.Builder.s3BucketParameter: String
    get() = throw NoSuchFieldException("Get on s3BucketParameter is not supported.")
    set(value) { this.withS3BucketParameter(value) }


/**
 * @see software.amazon.awscdk.cxapi.Environment.Builder
 */
fun environment(init: software.amazon.awscdk.cxapi.Environment.Builder.() -> Unit): software.amazon.awscdk.cxapi.Environment {
    val builder = software.amazon.awscdk.cxapi.Environment.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.cxapi.Environment.Builder.withRegion
 */
var software.amazon.awscdk.cxapi.Environment.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.cxapi.Environment.Builder.withAccount
 */
var software.amazon.awscdk.cxapi.Environment.Builder.account: String
    get() = throw NoSuchFieldException("Get on account is not supported.")
    set(value) { this.withAccount(value) }

/**
 * @see software.amazon.awscdk.cxapi.Environment.Builder.withName
 */
var software.amazon.awscdk.cxapi.Environment.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.cxapi.HostedZoneContextQuery.Builder
 */
fun hostedZoneContextQuery(init: software.amazon.awscdk.cxapi.HostedZoneContextQuery.Builder.() -> Unit): software.amazon.awscdk.cxapi.HostedZoneContextQuery {
    val builder = software.amazon.awscdk.cxapi.HostedZoneContextQuery.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.cxapi.HostedZoneContextQuery.Builder.withPrivateZone
 */
var software.amazon.awscdk.cxapi.HostedZoneContextQuery.Builder.privateZone: Boolean
    get() = throw NoSuchFieldException("Get on privateZone is not supported.")
    set(value) { this.withPrivateZone(value) }

/**
 * @see software.amazon.awscdk.cxapi.HostedZoneContextQuery.Builder.withRegion
 */
var software.amazon.awscdk.cxapi.HostedZoneContextQuery.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.cxapi.HostedZoneContextQuery.Builder.withVpcId
 */
var software.amazon.awscdk.cxapi.HostedZoneContextQuery.Builder.vpcId: String
    get() = throw NoSuchFieldException("Get on vpcId is not supported.")
    set(value) { this.withVpcId(value) }

/**
 * @see software.amazon.awscdk.cxapi.HostedZoneContextQuery.Builder.withAccount
 */
var software.amazon.awscdk.cxapi.HostedZoneContextQuery.Builder.account: String
    get() = throw NoSuchFieldException("Get on account is not supported.")
    set(value) { this.withAccount(value) }

/**
 * @see software.amazon.awscdk.cxapi.HostedZoneContextQuery.Builder.withDomainName
 */
var software.amazon.awscdk.cxapi.HostedZoneContextQuery.Builder.domainName: String
    get() = throw NoSuchFieldException("Get on domainName is not supported.")
    set(value) { this.withDomainName(value) }


/**
 * @see software.amazon.awscdk.cxapi.BuildManifest.Builder
 */
fun buildManifest(init: software.amazon.awscdk.cxapi.BuildManifest.Builder.() -> Unit): software.amazon.awscdk.cxapi.BuildManifest {
    val builder = software.amazon.awscdk.cxapi.BuildManifest.Builder()
    builder.init()
    return builder.build()
}


/**
 * @see software.amazon.awscdk.cxapi.SynthesizeResponse.Builder
 */
fun synthesizeResponse(init: software.amazon.awscdk.cxapi.SynthesizeResponse.Builder.() -> Unit): software.amazon.awscdk.cxapi.SynthesizeResponse {
    val builder = software.amazon.awscdk.cxapi.SynthesizeResponse.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.cxapi.SynthesizeResponse.Builder.withRuntime
 */
var software.amazon.awscdk.cxapi.SynthesizeResponse.Builder.runtime: software.amazon.awscdk.cxapi.AppRuntime
    get() = throw NoSuchFieldException("Get on runtime is not supported.")
    set(value) { this.withRuntime(value) }

/**
 * @see software.amazon.awscdk.cxapi.SynthesizeResponse.Builder.withVersion
 */
var software.amazon.awscdk.cxapi.SynthesizeResponse.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.cxapi.VpcContextQuery.Builder
 */
fun vpcContextQuery(init: software.amazon.awscdk.cxapi.VpcContextQuery.Builder.() -> Unit): software.amazon.awscdk.cxapi.VpcContextQuery {
    val builder = software.amazon.awscdk.cxapi.VpcContextQuery.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.cxapi.VpcContextQuery.Builder.withRegion
 */
var software.amazon.awscdk.cxapi.VpcContextQuery.Builder.region: String
    get() = throw NoSuchFieldException("Get on region is not supported.")
    set(value) { this.withRegion(value) }

/**
 * @see software.amazon.awscdk.cxapi.VpcContextQuery.Builder.withAccount
 */
var software.amazon.awscdk.cxapi.VpcContextQuery.Builder.account: String
    get() = throw NoSuchFieldException("Get on account is not supported.")
    set(value) { this.withAccount(value) }


/**
 * @see software.amazon.awscdk.cxapi.AssemblyManifest.Builder
 */
fun assemblyManifest(init: software.amazon.awscdk.cxapi.AssemblyManifest.Builder.() -> Unit): software.amazon.awscdk.cxapi.AssemblyManifest {
    val builder = software.amazon.awscdk.cxapi.AssemblyManifest.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.cxapi.AssemblyManifest.Builder.withRuntime
 */
var software.amazon.awscdk.cxapi.AssemblyManifest.Builder.runtime: software.amazon.awscdk.cxapi.AppRuntime
    get() = throw NoSuchFieldException("Get on runtime is not supported.")
    set(value) { this.withRuntime(value) }

/**
 * @see software.amazon.awscdk.cxapi.AssemblyManifest.Builder.withVersion
 */
var software.amazon.awscdk.cxapi.AssemblyManifest.Builder.version: String
    get() = throw NoSuchFieldException("Get on version is not supported.")
    set(value) { this.withVersion(value) }


/**
 * @see software.amazon.awscdk.cxapi.SynthesizedStack.Builder
 */
fun synthesizedStack(init: software.amazon.awscdk.cxapi.SynthesizedStack.Builder.() -> Unit): software.amazon.awscdk.cxapi.SynthesizedStack {
    val builder = software.amazon.awscdk.cxapi.SynthesizedStack.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.cxapi.SynthesizedStack.Builder.withTemplate
 */
var software.amazon.awscdk.cxapi.SynthesizedStack.Builder.template: Any
    get() = throw NoSuchFieldException("Get on template is not supported.")
    set(value) { this.withTemplate(value) }

/**
 * @see software.amazon.awscdk.cxapi.SynthesizedStack.Builder.withEnvironment
 */
var software.amazon.awscdk.cxapi.SynthesizedStack.Builder.environment: software.amazon.awscdk.cxapi.Environment
    get() = throw NoSuchFieldException("Get on environment is not supported.")
    set(value) { this.withEnvironment(value) }

/**
 * @see software.amazon.awscdk.cxapi.SynthesizedStack.Builder.withAutoDeploy
 */
var software.amazon.awscdk.cxapi.SynthesizedStack.Builder.autoDeploy: Boolean
    get() = throw NoSuchFieldException("Get on autoDeploy is not supported.")
    set(value) { this.withAutoDeploy(value) }

/**
 * @see software.amazon.awscdk.cxapi.SynthesizedStack.Builder.withName
 */
var software.amazon.awscdk.cxapi.SynthesizedStack.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.cxapi.VpcContextResponse.Builder
 */
fun vpcContextResponse(init: software.amazon.awscdk.cxapi.VpcContextResponse.Builder.() -> Unit): software.amazon.awscdk.cxapi.VpcContextResponse {
    val builder = software.amazon.awscdk.cxapi.VpcContextResponse.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.cxapi.VpcContextResponse.Builder.withVpcId
 */
var software.amazon.awscdk.cxapi.VpcContextResponse.Builder.vpcId: String
    get() = throw NoSuchFieldException("Get on vpcId is not supported.")
    set(value) { this.withVpcId(value) }

/**
 * @see software.amazon.awscdk.cxapi.VpcContextResponse.Builder.withVpnGatewayId
 */
var software.amazon.awscdk.cxapi.VpcContextResponse.Builder.vpnGatewayId: String
    get() = throw NoSuchFieldException("Get on vpnGatewayId is not supported.")
    set(value) { this.withVpnGatewayId(value) }


/**
 * @see software.amazon.awscdk.cxapi.BuildStep.Builder
 */
fun buildStep(init: software.amazon.awscdk.cxapi.BuildStep.Builder.() -> Unit): software.amazon.awscdk.cxapi.BuildStep {
    val builder = software.amazon.awscdk.cxapi.BuildStep.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.cxapi.BuildStep.Builder.withType
 */
var software.amazon.awscdk.cxapi.BuildStep.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }


/**
 * @see software.amazon.awscdk.cxapi.ContainerImageAssetMetadataEntry.Builder
 */
fun containerImageAssetMetadataEntry(init: software.amazon.awscdk.cxapi.ContainerImageAssetMetadataEntry.Builder.() -> Unit): software.amazon.awscdk.cxapi.ContainerImageAssetMetadataEntry {
    val builder = software.amazon.awscdk.cxapi.ContainerImageAssetMetadataEntry.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.cxapi.ContainerImageAssetMetadataEntry.Builder.withId
 */
var software.amazon.awscdk.cxapi.ContainerImageAssetMetadataEntry.Builder.id: String
    get() = throw NoSuchFieldException("Get on id is not supported.")
    set(value) { this.withId(value) }

/**
 * @see software.amazon.awscdk.cxapi.ContainerImageAssetMetadataEntry.Builder.withRepositoryName
 */
var software.amazon.awscdk.cxapi.ContainerImageAssetMetadataEntry.Builder.repositoryName: String
    get() = throw NoSuchFieldException("Get on repositoryName is not supported.")
    set(value) { this.withRepositoryName(value) }

/**
 * @see software.amazon.awscdk.cxapi.ContainerImageAssetMetadataEntry.Builder.withPath
 */
var software.amazon.awscdk.cxapi.ContainerImageAssetMetadataEntry.Builder.path: String
    get() = throw NoSuchFieldException("Get on path is not supported.")
    set(value) { this.withPath(value) }

/**
 * @see software.amazon.awscdk.cxapi.ContainerImageAssetMetadataEntry.Builder.withPackaging
 */
var software.amazon.awscdk.cxapi.ContainerImageAssetMetadataEntry.Builder.packaging: String
    get() = throw NoSuchFieldException("Get on packaging is not supported.")
    set(value) { this.withPackaging(value) }

/**
 * @see software.amazon.awscdk.cxapi.ContainerImageAssetMetadataEntry.Builder.withImageNameParameter
 */
var software.amazon.awscdk.cxapi.ContainerImageAssetMetadataEntry.Builder.imageNameParameter: String
    get() = throw NoSuchFieldException("Get on imageNameParameter is not supported.")
    set(value) { this.withImageNameParameter(value) }
