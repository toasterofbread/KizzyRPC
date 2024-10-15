plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlinx.serialization)
    alias(libs.plugins.vanniktech.mavenpublish)
}

dependencies {
    implementation (libs.kotlinx.coroutine)
    implementation (libs.bundles.network.ktor)
    implementation (libs.ktor.websockets)
}
