
tasks.register("build") {
    dependsOn(gradle.includedBuilds.map{it.task(":build")})
}

tasks.register("clean") {
    dependsOn(gradle.includedBuilds.map{it.task(":clean")})
}