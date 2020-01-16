organization := "org.adada"

name := "ada-dream-pd-challenge"

version := "0.0.7"

description := "Ada extension for PD Biomarker DREAM Challenge containing mainly custom MDS, t-SNE, and aggregated correlation (web) visualizations/screens."

isSnapshot := false

scalaVersion := "2.11.12"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers ++= Seq(
  "Sci Java" at "https://maven.scijava.org/content/repositories/public/", // for the T-SNE lib
  "bnd libs" at "https://peterbanda.net/maven2/", // to remove once upgraded to ada-server 0.8.1
  Resolver.mavenLocal
)

routesImport ++= Seq(
  "org.ada.web.controllers.pdchallenge.QueryStringBinders._"
)

libraryDependencies ++= Seq(
  "org.adada" %% "ada-web" % "0.8.0",
  "org.webjars" % "visjs" % "4.21.0"  // interactive graph visualizations
)

// POM settings for Sonatype
homepage := Some(url("https://ada-discovery.github.io"))

publishMavenStyle := true

scmInfo := Some(ScmInfo(url("https://github.com/ada-discovery/ada-dream-pd-challenge"), "scm:git@github.com:ada-discovery/ada-dream-pd-challenge.git"))

developers := List(Developer("bnd", "Peter Banda", "peter.banda@protonmail.com", url("https://peterbanda.net")))

licenses += "Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")

publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)
