plugins {
    id("java")
    id("org.openjfx.javafxplugin") version "0.0.13"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    
    //added Google Maps Dependencies
    implementation("com.google.maps:google-maps-services:2.2.0")
    implementation ("org.slf4j:slf4j-simple:1.7.25")

    implementation("org.openjfx:javafx-controls:17")
    implementation("org.openjfx:javafx-graphics:17")
    implementation("org.openjfx:javafx-web:17")

}

javafx {
    version = "17"
    modules = listOf("javafx.controls", "javafx.graphics", "javafx.web","javafx.base","javafx.swing")
}

tasks.test {
    useJUnitPlatform()
}

