addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.8")
resolvers += Resolver.url("play-sbt-plugins", url("https://dl.bintray.com/playframework/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.typesafe.sbt" % "sbt-play-soap" % "1.1.5")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.5")