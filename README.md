# AWS CDK Kotlin DSL
[ ![Kotlin](https://img.shields.io/badge/Kotlin-1.3.20-green.svg) ](https://kotlinlang.org/)
[![Build Status](https://travis-ci.org/aws-cdk-dsl/aws-cdk-kotlin-dsl.svg?branch=master)](https://travis-ci.org/aws-cdk-dsl/aws-cdk-kotlin-dsl) 
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

The [DSL](https://en.wikipedia.org/wiki/Domain-specific_language) wrapper on top of [AWS CDK](https://github.com/awslabs/aws-cdk). The DSL is fully compatible with SDK Java implementation, meanwhile improves readability of infrastructure related code.

## Why AWS CDK Kotlin DSL?

It is a great concept of **infrastructure as code**, however the problem is **what kind of** code should it be?
- `yaml` (or `json`): concise however no type-safety and runtime checks, thus why CDK is developed
- `java` (or other langs provided by CDK): type safe, but less descriptive than `yaml`

The idea of Kotlin DSL is to utilize Kotlin's [type-safe builder](https://kotlinlang.org/docs/reference/type-safe-builders.html) which has been proved as successful in latest Gradle `build.gradle` practice. The benefit of this way is:
- Concise as `yaml`, write less code and easier to diff/review
- Type safety on top of Java
- IDE autocomplete support
- Interoperability with Java, no risk of lacking DSL coverage

A quick example of constructing stack using Kotlin DSL, we could see the benefit easily.
```kotlin
fun main() {

    app {
        stack("myStackId") {
            function("myFunctionId", functionProps {
                functionName = "myFunction"
                runtime = NODE_J_S810
                memorySize = 128
                handler = "index.handler"
                code = Code.inline("""
                    exports.handler = function(event, context, callback) {
                        callback(null, "Hello, World!");
                    }
                """.trimIndent())
            })
        }
    }.run()
}
```

## Quick Start
*(It is not released to `mavenCentral` or `jCenter` yet)* 

Checkout [lambda-example](examples/lambda-example) under `examples` for a quick view!

## Known issues
- `List`, `Map` types on builder is not supported (due to lacking generic type information), use raw `withXxx` method on builder instead.

## License
The AWS CDK Kotlin DSL is distributed under the [MIT License](./LICENSE).