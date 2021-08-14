plugins {
    id("org.gradle.playframework") version "0.12"
    id("org.gradle.playframework-routes") version "0.12"
    id("org.gradle.playframework-twirl") version "0.12"

    kotlin("jvm") version "1.5.21"
}

dependencies {
    implementation("commons-lang:commons-lang:20030203.000129")
    implementation("com.typesafe.play:play-guice_2.12:2.8.8")
    implementation("io.github.casually-blue:cucm-11:1.6")
    implementation("io.github.casually-blue:web-11:1.7")
    implementation("com.sun.xml.ws:jaxws-rt:2.3.3")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.5.21")
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

sourceSets {
    named("main") {
        scala.srcDir("app")
    }
}

kotlin {
    sourceSets {
        named("main") {
            kotlin.setSrcDirs(files("$projectDir/app"))
        }
    }
}

tasks.compileKotlin{
    classpath += files("$projectDir/build/classes/java/main")
}

tasks.compileScala {
    val compileKotlin = tasks.compileKotlin.get()
    dependsOn.add(compileKotlin)
    classpath += files(compileKotlin.destinationDirectory)
}