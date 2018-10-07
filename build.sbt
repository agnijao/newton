scalaVersion := "2.12.6"

libraryDependencies += "org.scastie" %% "runtime-scala" % "0.27.0+2d1a6f3a68a500d5b2ff0c0e897cfec85fe58f8a"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked"
)
