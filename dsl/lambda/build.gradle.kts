
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

project.group = "software.amazon.awscdk.dsl"
project.version = "0.27.0_1.0"

plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.20")
    `maven-publish`
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    api("software.amazon.awscdk:lambda:0.27.0")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
}


tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
