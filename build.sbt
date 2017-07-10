name := "mbtiles4j"

organization := "mbtiles4j"

scalaVersion := "2.11.8"

resolvers ++= Seq(
  "jcenter repo" at "http://jcenter.bintray.com",
  "jitpack repo" at "https://jitpack.io"
)

libraryDependencies ++= Seq(
  "commons-io" % "commons-io" % "2.4",
  "org.apache.commons" % "commons-lang3" % "3.1",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "org.xerial" % "sqlite-jdbc" % "3.7.2",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "junit" % "junit" % "4.11" % "test"
)

