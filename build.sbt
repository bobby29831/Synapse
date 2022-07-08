ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.1.3"

lazy val root = (project in file("."))
  .settings(
    name := "Synapse",
    idePackagePrefix := Some("com.bobby29831")
  )

resolvers += "papermc" at "https://repo.papermc.io/repository/maven-public/"

libraryDependencies += "io.papermc.paper" % "paper-api" % "1.19-R0.1-SNAPSHOT"
libraryDependencies += "com.github.ben-manes.caffeine" % "caffeine" % "3.1.1"

javacOptions ++= Seq("-source", "17", "-target", "17")

ThisBuild / assemblyMergeStrategy := (x => MergeStrategy.discard)
ThisBuild / assemblyShadeRules := Seq(
  ShadeRule.rename("com.github.benmanes.caffeine" -> "com.bobby29831.libraries.caffeine").inAll
)



