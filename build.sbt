Global / onChangedBuildSource := ReloadOnSourceChanges

name := "se2-scala"
version := "0.0.1-SNAPSHOT"

scalaVersion := "2.13.7"

scalacOptions ++= Seq(
  "-deprecation",
  "-Xfatal-warnings",
  "-Wunused",
)

libraryDependencies ++= Seq(
  "com.lihaoyi"    %% "pprint"                   % "0.7.3",
  "com.lihaoyi"    %% "fansi"                    % "0.3.1",
  "com.lihaoyi"    %% "upickle"                  % "1.5.0",
  "org.scalatest"  %% "scalatest-shouldmatchers" % "3.2.11",
  "org.scalatest"  %% "scalatest-funspec"        % "3.2.11",
  "org.scalacheck" %% "scalacheck"               % "1.15.4",
)
