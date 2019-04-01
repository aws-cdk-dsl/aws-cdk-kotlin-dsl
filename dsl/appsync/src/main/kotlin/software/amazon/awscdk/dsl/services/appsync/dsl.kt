package software.amazon.awscdk.dsl.services.appsync
/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLSchema
 */
fun software.amazon.awscdk.Construct.cfnGraphQLSchema(id: String,
                     props: software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps? = null,
                     init: (software.amazon.awscdk.services.appsync.CfnGraphQLSchema.() -> Unit)? = null)
        : software.amazon.awscdk.services.appsync.CfnGraphQLSchema {

    val obj = software.amazon.awscdk.services.appsync.CfnGraphQLSchema(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.appsync.CfnResolver
 */
fun software.amazon.awscdk.Construct.cfnResolver(id: String,
                     props: software.amazon.awscdk.services.appsync.CfnResolverProps? = null,
                     init: (software.amazon.awscdk.services.appsync.CfnResolver.() -> Unit)? = null)
        : software.amazon.awscdk.services.appsync.CfnResolver {

    val obj = software.amazon.awscdk.services.appsync.CfnResolver(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.appsync.CfnApiKey
 */
fun software.amazon.awscdk.Construct.cfnApiKey(id: String,
                     props: software.amazon.awscdk.services.appsync.CfnApiKeyProps? = null,
                     init: (software.amazon.awscdk.services.appsync.CfnApiKey.() -> Unit)? = null)
        : software.amazon.awscdk.services.appsync.CfnApiKey {

    val obj = software.amazon.awscdk.services.appsync.CfnApiKey(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApi
 */
fun software.amazon.awscdk.Construct.cfnGraphQLApi(id: String,
                     props: software.amazon.awscdk.services.appsync.CfnGraphQLApiProps? = null,
                     init: (software.amazon.awscdk.services.appsync.CfnGraphQLApi.() -> Unit)? = null)
        : software.amazon.awscdk.services.appsync.CfnGraphQLApi {

    val obj = software.amazon.awscdk.services.appsync.CfnGraphQLApi(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource
 */
fun software.amazon.awscdk.Construct.cfnDataSource(id: String,
                     props: software.amazon.awscdk.services.appsync.CfnDataSourceProps? = null,
                     init: (software.amazon.awscdk.services.appsync.CfnDataSource.() -> Unit)? = null)
        : software.amazon.awscdk.services.appsync.CfnDataSource {

    val obj = software.amazon.awscdk.services.appsync.CfnDataSource(this, id, props)
    init?.invoke(obj)
    return obj
}


/**
 * @see software.amazon.awscdk.services.appsync.CfnFunctionConfiguration
 */
fun software.amazon.awscdk.Construct.cfnFunctionConfiguration(id: String,
                     props: software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps? = null,
                     init: (software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.() -> Unit)? = null)
        : software.amazon.awscdk.services.appsync.CfnFunctionConfiguration {

    val obj = software.amazon.awscdk.services.appsync.CfnFunctionConfiguration(this, id, props)
    init?.invoke(obj)
    return obj
}



/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty.Builder
 */
fun userPoolConfigProperty(init: software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty {
    val builder = software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty.Builder.withDefaultAction
 */
var software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty.Builder.defaultAction: String
    get() = throw NoSuchFieldException("Get on defaultAction is not supported.")
    set(value) { this.withDefaultAction(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty.Builder.withUserPoolId
 */
var software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty.Builder.userPoolId: String
    get() = throw NoSuchFieldException("Get on userPoolId is not supported.")
    set(value) { this.withUserPoolId(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty.Builder.withAppIdClientRegex
 */
var software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty.Builder.appIdClientRegex: String
    get() = throw NoSuchFieldException("Get on appIdClientRegex is not supported.")
    set(value) { this.withAppIdClientRegex(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty.Builder.withAwsRegion
 */
var software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty.Builder.awsRegion: String
    get() = throw NoSuchFieldException("Get on awsRegion is not supported.")
    set(value) { this.withAwsRegion(value) }


/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder
 */
fun cfnDataSourceProps(init: software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.() -> Unit): software.amazon.awscdk.services.appsync.CfnDataSourceProps {
    val builder = software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.withServiceRoleArn
 */
var software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.serviceRoleArn: String
    get() = throw NoSuchFieldException("Get on serviceRoleArn is not supported.")
    set(value) { this.withServiceRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.withType
 */
var software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.type: String
    get() = throw NoSuchFieldException("Get on type is not supported.")
    set(value) { this.withType(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.withName
 */
var software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.withDescription
 */
var software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.withApiId
 */
var software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.apiId: String
    get() = throw NoSuchFieldException("Get on apiId is not supported.")
    set(value) { this.withApiId(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.withDynamoDbConfig
 */
var software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.dynamoDbConfig: software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty
    get() = throw NoSuchFieldException("Get on dynamoDbConfig is not supported.")
    set(value) { this.withDynamoDbConfig(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.withElasticsearchConfig
 */
var software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.elasticsearchConfig: software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty
    get() = throw NoSuchFieldException("Get on elasticsearchConfig is not supported.")
    set(value) { this.withElasticsearchConfig(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.withHttpConfig
 */
var software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.httpConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on httpConfig is not supported.")
    set(value) { this.withHttpConfig(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.withLambdaConfig
 */
var software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.lambdaConfig: software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty
    get() = throw NoSuchFieldException("Get on lambdaConfig is not supported.")
    set(value) { this.withLambdaConfig(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.withRelationalDatabaseConfig
 */
var software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder.relationalDatabaseConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on relationalDatabaseConfig is not supported.")
    set(value) { this.withRelationalDatabaseConfig(value) }


/**
 * @see software.amazon.awscdk.services.appsync.CfnApiKeyProps.Builder
 */
fun cfnApiKeyProps(init: software.amazon.awscdk.services.appsync.CfnApiKeyProps.Builder.() -> Unit): software.amazon.awscdk.services.appsync.CfnApiKeyProps {
    val builder = software.amazon.awscdk.services.appsync.CfnApiKeyProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appsync.CfnApiKeyProps.Builder.withExpires
 */
var software.amazon.awscdk.services.appsync.CfnApiKeyProps.Builder.expires: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on expires is not supported.")
    set(value) { this.withExpires(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnApiKeyProps.Builder.withDescription
 */
var software.amazon.awscdk.services.appsync.CfnApiKeyProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnApiKeyProps.Builder.withApiId
 */
var software.amazon.awscdk.services.appsync.CfnApiKeyProps.Builder.apiId: String
    get() = throw NoSuchFieldException("Get on apiId is not supported.")
    set(value) { this.withApiId(value) }


/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.Builder
 */
fun rdsHttpEndpointConfigProperty(init: software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty {
    val builder = software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.Builder.withDbClusterIdentifier
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.Builder.dbClusterIdentifier: String
    get() = throw NoSuchFieldException("Get on dbClusterIdentifier is not supported.")
    set(value) { this.withDbClusterIdentifier(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.Builder.withDatabaseName
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.Builder.databaseName: String
    get() = throw NoSuchFieldException("Get on databaseName is not supported.")
    set(value) { this.withDatabaseName(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.Builder.withSchema
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.Builder.schema: String
    get() = throw NoSuchFieldException("Get on schema is not supported.")
    set(value) { this.withSchema(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.Builder.withAwsRegion
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.Builder.awsRegion: String
    get() = throw NoSuchFieldException("Get on awsRegion is not supported.")
    set(value) { this.withAwsRegion(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.Builder.withAwsSecretStoreArn
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.Builder.awsSecretStoreArn: String
    get() = throw NoSuchFieldException("Get on awsSecretStoreArn is not supported.")
    set(value) { this.withAwsSecretStoreArn(value) }


/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty.Builder
 */
fun logConfigProperty(init: software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty {
    val builder = software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty.Builder.withCloudWatchLogsRoleArn
 */
var software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty.Builder.cloudWatchLogsRoleArn: String
    get() = throw NoSuchFieldException("Get on cloudWatchLogsRoleArn is not supported.")
    set(value) { this.withCloudWatchLogsRoleArn(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty.Builder.withFieldLogLevel
 */
var software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty.Builder.fieldLogLevel: String
    get() = throw NoSuchFieldException("Get on fieldLogLevel is not supported.")
    set(value) { this.withFieldLogLevel(value) }


/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty.Builder
 */
fun elasticsearchConfigProperty(init: software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty {
    val builder = software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty.Builder.withEndpoint
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty.Builder.endpoint: String
    get() = throw NoSuchFieldException("Get on endpoint is not supported.")
    set(value) { this.withEndpoint(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty.Builder.withAwsRegion
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty.Builder.awsRegion: String
    get() = throw NoSuchFieldException("Get on awsRegion is not supported.")
    set(value) { this.withAwsRegion(value) }


/**
 * @see software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty.Builder
 */
fun pipelineConfigProperty(init: software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty {
    val builder = software.amazon.awscdk.services.appsync.CfnResolver.PipelineConfigProperty.Builder()
    builder.init()
    return builder.build()
}


/**
 * @see software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder
 */
fun cfnFunctionConfigurationProps(init: software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.() -> Unit): software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps {
    val builder = software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.withFunctionVersion
 */
var software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.functionVersion: String
    get() = throw NoSuchFieldException("Get on functionVersion is not supported.")
    set(value) { this.withFunctionVersion(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.withName
 */
var software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.withDescription
 */
var software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.description: String
    get() = throw NoSuchFieldException("Get on description is not supported.")
    set(value) { this.withDescription(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.withApiId
 */
var software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.apiId: String
    get() = throw NoSuchFieldException("Get on apiId is not supported.")
    set(value) { this.withApiId(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.withDataSourceName
 */
var software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.dataSourceName: String
    get() = throw NoSuchFieldException("Get on dataSourceName is not supported.")
    set(value) { this.withDataSourceName(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.withRequestMappingTemplate
 */
var software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.requestMappingTemplate: String
    get() = throw NoSuchFieldException("Get on requestMappingTemplate is not supported.")
    set(value) { this.withRequestMappingTemplate(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.withRequestMappingTemplateS3Location
 */
var software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.requestMappingTemplateS3Location: String
    get() = throw NoSuchFieldException("Get on requestMappingTemplateS3Location is not supported.")
    set(value) { this.withRequestMappingTemplateS3Location(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.withResponseMappingTemplate
 */
var software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.responseMappingTemplate: String
    get() = throw NoSuchFieldException("Get on responseMappingTemplate is not supported.")
    set(value) { this.withResponseMappingTemplate(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.withResponseMappingTemplateS3Location
 */
var software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps.Builder.responseMappingTemplateS3Location: String
    get() = throw NoSuchFieldException("Get on responseMappingTemplateS3Location is not supported.")
    set(value) { this.withResponseMappingTemplateS3Location(value) }


/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty.Builder
 */
fun authorizationConfigProperty(init: software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty {
    val builder = software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty.Builder.withAuthorizationType
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty.Builder.authorizationType: String
    get() = throw NoSuchFieldException("Get on authorizationType is not supported.")
    set(value) { this.withAuthorizationType(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty.Builder.withAwsIamConfig
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty.Builder.awsIamConfig: software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty
    get() = throw NoSuchFieldException("Get on awsIamConfig is not supported.")
    set(value) { this.withAwsIamConfig(value) }


/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty.Builder
 */
fun openIDConnectConfigProperty(init: software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty {
    val builder = software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty.Builder.withClientId
 */
var software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty.Builder.clientId: String
    get() = throw NoSuchFieldException("Get on clientId is not supported.")
    set(value) { this.withClientId(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty.Builder.withIssuer
 */
var software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty.Builder.issuer: String
    get() = throw NoSuchFieldException("Get on issuer is not supported.")
    set(value) { this.withIssuer(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty.Builder.withAuthTtl
 */
var software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty.Builder.authTtl: Number
    get() = throw NoSuchFieldException("Get on authTtl is not supported.")
    set(value) { this.withAuthTtl(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty.Builder.withIatTtl
 */
var software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty.Builder.iatTtl: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on iatTtl is not supported.")
    set(value) { this.withIatTtl(value) }


/**
 * @see software.amazon.awscdk.services.appsync.CfnResolverProps.Builder
 */
fun cfnResolverProps(init: software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.() -> Unit): software.amazon.awscdk.services.appsync.CfnResolverProps {
    val builder = software.amazon.awscdk.services.appsync.CfnResolverProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.withTypeName
 */
var software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.typeName: String
    get() = throw NoSuchFieldException("Get on typeName is not supported.")
    set(value) { this.withTypeName(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.withKind
 */
var software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.kind: String
    get() = throw NoSuchFieldException("Get on kind is not supported.")
    set(value) { this.withKind(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.withApiId
 */
var software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.apiId: String
    get() = throw NoSuchFieldException("Get on apiId is not supported.")
    set(value) { this.withApiId(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.withFieldName
 */
var software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.fieldName: String
    get() = throw NoSuchFieldException("Get on fieldName is not supported.")
    set(value) { this.withFieldName(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.withDataSourceName
 */
var software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.dataSourceName: String
    get() = throw NoSuchFieldException("Get on dataSourceName is not supported.")
    set(value) { this.withDataSourceName(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.withPipelineConfig
 */
var software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.pipelineConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on pipelineConfig is not supported.")
    set(value) { this.withPipelineConfig(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.withRequestMappingTemplate
 */
var software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.requestMappingTemplate: String
    get() = throw NoSuchFieldException("Get on requestMappingTemplate is not supported.")
    set(value) { this.withRequestMappingTemplate(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.withRequestMappingTemplateS3Location
 */
var software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.requestMappingTemplateS3Location: String
    get() = throw NoSuchFieldException("Get on requestMappingTemplateS3Location is not supported.")
    set(value) { this.withRequestMappingTemplateS3Location(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.withResponseMappingTemplate
 */
var software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.responseMappingTemplate: String
    get() = throw NoSuchFieldException("Get on responseMappingTemplate is not supported.")
    set(value) { this.withResponseMappingTemplate(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.withResponseMappingTemplateS3Location
 */
var software.amazon.awscdk.services.appsync.CfnResolverProps.Builder.responseMappingTemplateS3Location: String
    get() = throw NoSuchFieldException("Get on responseMappingTemplateS3Location is not supported.")
    set(value) { this.withResponseMappingTemplateS3Location(value) }


/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty.Builder
 */
fun lambdaConfigProperty(init: software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty {
    val builder = software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty.Builder.withLambdaFunctionArn
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty.Builder.lambdaFunctionArn: String
    get() = throw NoSuchFieldException("Get on lambdaFunctionArn is not supported.")
    set(value) { this.withLambdaFunctionArn(value) }


/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty.Builder
 */
fun httpConfigProperty(init: software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty {
    val builder = software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty.Builder.withEndpoint
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty.Builder.endpoint: String
    get() = throw NoSuchFieldException("Get on endpoint is not supported.")
    set(value) { this.withEndpoint(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty.Builder.withAuthorizationConfig
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty.Builder.authorizationConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on authorizationConfig is not supported.")
    set(value) { this.withAuthorizationConfig(value) }


/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApiProps.Builder
 */
fun cfnGraphQLApiProps(init: software.amazon.awscdk.services.appsync.CfnGraphQLApiProps.Builder.() -> Unit): software.amazon.awscdk.services.appsync.CfnGraphQLApiProps {
    val builder = software.amazon.awscdk.services.appsync.CfnGraphQLApiProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApiProps.Builder.withAuthenticationType
 */
var software.amazon.awscdk.services.appsync.CfnGraphQLApiProps.Builder.authenticationType: String
    get() = throw NoSuchFieldException("Get on authenticationType is not supported.")
    set(value) { this.withAuthenticationType(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApiProps.Builder.withLogConfig
 */
var software.amazon.awscdk.services.appsync.CfnGraphQLApiProps.Builder.logConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on logConfig is not supported.")
    set(value) { this.withLogConfig(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApiProps.Builder.withOpenIdConnectConfig
 */
var software.amazon.awscdk.services.appsync.CfnGraphQLApiProps.Builder.openIdConnectConfig: software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty
    get() = throw NoSuchFieldException("Get on openIdConnectConfig is not supported.")
    set(value) { this.withOpenIdConnectConfig(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApiProps.Builder.withUserPoolConfig
 */
var software.amazon.awscdk.services.appsync.CfnGraphQLApiProps.Builder.userPoolConfig: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on userPoolConfig is not supported.")
    set(value) { this.withUserPoolConfig(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLApiProps.Builder.withName
 */
var software.amazon.awscdk.services.appsync.CfnGraphQLApiProps.Builder.name: String
    get() = throw NoSuchFieldException("Get on name is not supported.")
    set(value) { this.withName(value) }


/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty.Builder
 */
fun dynamoDBConfigProperty(init: software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty {
    val builder = software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty.Builder.withTableName
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty.Builder.tableName: String
    get() = throw NoSuchFieldException("Get on tableName is not supported.")
    set(value) { this.withTableName(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty.Builder.withAwsRegion
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty.Builder.awsRegion: String
    get() = throw NoSuchFieldException("Get on awsRegion is not supported.")
    set(value) { this.withAwsRegion(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty.Builder.withUseCallerCredentials
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty.Builder.useCallerCredentials: software.amazon.awscdk.Token
    get() = throw NoSuchFieldException("Get on useCallerCredentials is not supported.")
    set(value) { this.withUseCallerCredentials(value) }


/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty.Builder
 */
fun awsIamConfigProperty(init: software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty {
    val builder = software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty.Builder.withSigningServiceName
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty.Builder.signingServiceName: String
    get() = throw NoSuchFieldException("Get on signingServiceName is not supported.")
    set(value) { this.withSigningServiceName(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty.Builder.withSigningRegion
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty.Builder.signingRegion: String
    get() = throw NoSuchFieldException("Get on signingRegion is not supported.")
    set(value) { this.withSigningRegion(value) }


/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty.Builder
 */
fun relationalDatabaseConfigProperty(init: software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty.Builder.() -> Unit): software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty {
    val builder = software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty.Builder.withRelationalDatabaseSourceType
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty.Builder.relationalDatabaseSourceType: String
    get() = throw NoSuchFieldException("Get on relationalDatabaseSourceType is not supported.")
    set(value) { this.withRelationalDatabaseSourceType(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty.Builder.withRdsHttpEndpointConfig
 */
var software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty.Builder.rdsHttpEndpointConfig: software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty
    get() = throw NoSuchFieldException("Get on rdsHttpEndpointConfig is not supported.")
    set(value) { this.withRdsHttpEndpointConfig(value) }


/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps.Builder
 */
fun cfnGraphQLSchemaProps(init: software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps.Builder.() -> Unit): software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps {
    val builder = software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps.Builder()
    builder.init()
    return builder.build()
}

/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps.Builder.withApiId
 */
var software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps.Builder.apiId: String
    get() = throw NoSuchFieldException("Get on apiId is not supported.")
    set(value) { this.withApiId(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps.Builder.withDefinition
 */
var software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps.Builder.definition: String
    get() = throw NoSuchFieldException("Get on definition is not supported.")
    set(value) { this.withDefinition(value) }

/**
 * @see software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps.Builder.withDefinitionS3Location
 */
var software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps.Builder.definitionS3Location: String
    get() = throw NoSuchFieldException("Get on definitionS3Location is not supported.")
    set(value) { this.withDefinitionS3Location(value) }
