plugins {
    java
}

description = "Minecraft plugin making crossbows configurable"
group = providers.gradleProperty("group").get()
version = providers.gradleProperty("version").get()

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}