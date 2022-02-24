plugins {
    java
    id("jsonschema2pojo")
}

group = "io.thewokecoder"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

jsonSchema2Pojo{
    targetDirectory = file("$buildDir/generated-sources/js2p")
    targetPackage = "io.thewokecoder.pojo"
    generateBuilders = true
    includeAdditionalProperties = false
    setSource(files("$projectDir/src/main/resources/json"))
    setAnnotationStyle("none")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}