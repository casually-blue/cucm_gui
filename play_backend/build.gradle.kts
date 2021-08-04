plugins {
    id("org.gradle.playframework") version "0.12"
    id("org.gradle.playframework-routes") version "0.12"
    id("org.gradle.playframework-twirl") version "0.12"

    kotlin("jvm") version "1.5.21"
}

dependencies {
    implementation("commons-lang:commons-lang:2.6")
    implementation("com.typesafe.play:play-guice_2.12:2.6.15")
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
}

play {
    platform{
        playVersion.set("2.6.15")
        scalaVersion.set("2.12")
        javaVersion.set(JavaVersion.VERSION_1_8)
    }
    injectedRoutesGenerator.set(true)
}

sourceSets {
    named("main") {
        scala.srcDir("app")
        kotlin.sourceSets.named("main").get().kotlin.srcDir("app")
    }
}

tasks.compileScala {
    dependsOn.add(tasks.compileKotlin.get())
    classpath += files(tasks.compileKotlin.get().destinationDirectory)
}