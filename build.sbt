Global / onChangedBuildSource := ReloadOnSourceChanges

name := "se1-scala"
version := "0.0.1-SNAPSHOT"

scalaVersion := "2.13.7"

scalacOptions ++= Seq(
  "-deprecation",
  "-Xfatal-warnings",
  "-Wunused",
)

libraryDependencies ++= Seq(
  "com.lihaoyi"    %% "pprint"                   % "0.7.1",
  "com.lihaoyi"    %% "fansi"                    % "0.3.0",
  "com.lihaoyi"    %% "upickle"                  % "1.4.3",
  "org.scalatest"  %% "scalatest-shouldmatchers" % "3.2.10",
  "org.scalatest"  %% "scalatest-funspec"        % "3.2.10",
  "org.scalacheck" %% "scalacheck"               % "1.15.4",
)
