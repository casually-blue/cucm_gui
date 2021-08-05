plugins {
    id("org.gradle.playframework") version "0.12"
    id("org.gradle.playframework-routes") version "0.12"
    id("org.gradle.playframework-twirl") version "0.12"

    kotlin("jvm") version "1.5.21"
}

dependencies {
    implementation("commons-lang:commons-lang:20030203.000129")
    implementation("com.typesafe.play:play-guice_2.12:2.8.8")
}

repositories {
    mavenCentral()
    maven {
        name = "lightbend-maven-release"
        url = uri("https://repo.lightbend.com/lightbend/maven-releases")
    }
    ivy {
        name = "lightbend-ivy-release"
        url = uri("https://repo.lightbend.com/lightbend/ivy-releases")
        layout("ivy")
    }
    maven {
        name = "gradle-js"
        url = uri("https://repo.gradle.org/gradle/javascript-public")
    }

    maven {
        url = uri("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven")
    }
}

play {
    platform{
        playVersion.set("2.8.8")
        scalaVersion.set("2.12")
        javaVersion.set(JavaVersion.VERSION_1_8)
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
            kotlin.srcDir("app")
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