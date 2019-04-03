rootProject.name = "lambda-example"

includeBuild("../../dsl/cdk") {
    dependencySubstitution {
        substitute(module("software.amazon.awscdk.dsl:cdk")).with(project(":"))
    }
}


includeBuild("../../dsl/lambda") {
    dependencySubstitution {
        substitute(module("software.amazon.awscdk.dsl:lambda")).with(project(":"))
    }
}
