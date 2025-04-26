plugins {
    java
}

description = providers.gradleProperty("description").get()
group = providers.gradleProperty("group").get()
version = providers.gradleProperty("version").get()

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}