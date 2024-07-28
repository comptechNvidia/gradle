plugins {
    `java-platform`
}

javaPlatform {
    allowDependencies()
}

dependencies {
    constraints {
        api("org.apache.commons:commons-lang3:3.12.0")
        api("com.google.guava:guava:30.1.1-jre")
        api("org.slf4j:slf4j-api:1.7.30")
    }
}
