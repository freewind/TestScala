name := "TestScala"

version := "0.1"

libraryDependencies ++= Seq(
  "commons-codec" % "commons-codec" % "1.9",
  "org.specs2" %% "specs2" % "2.3.10" % "test"
)

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
