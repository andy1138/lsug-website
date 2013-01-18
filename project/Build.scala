import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "lsug"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "com.github.tmingos" % "casbah_2.10" % "2.5.0-SNAPSHOT",
      "se.radley" %% "play-plugins-salat" % "1.2-SNAPSHOT"
      )

  val main = play.Project(appName, appVersion, appDependencies).settings(
      lessEntryPoints <<= baseDirectory(_ / "app" / "assets" / "stylesheets" ** "main.less")
  )

}
