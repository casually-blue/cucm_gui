plugins {
    id("org.gradle.playframework") version "0.12"
    id("org.gradle.playframework-routes") version "0.12"
    id("org.gradle.playframework-twirl") version "0.12"

    scala
}

dependencies {
    implementation("commons-lang:commons-lang:20030203.000129")
    implementation("com.typesafe.play:play-guice_2.12:2.8.8")
    implementation("io.github.casually-blue:cucm-11:1.6")
    implementation("com.sun.xml.ws:jaxws-rt:2.3.3")
}

repositories {
    mavenCentral()
}

play {
    platform{
        playVersion.set("2.8.8")
        scalaVersion.set("2.12")
        javaVersion.set(JavaVersion.VERSION_11)
    }

    injectedRoutesGenerator.set(true)
}