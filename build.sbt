name := "java-koans"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  //"com.tasktop.koans" % "koans-runner" % "0.0.1" % "test",
  //"junit" % "junit" % "4.11" % "test",
  "com.google.guava" % "guava" % "18.0" % "test",
  "org.fusesource.jansi" % "jansi" % "1.11" % "test",
  "org.javassist" % "javassist" % "3.20.0-GA" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v", "--tests=findAboutKoansFile")