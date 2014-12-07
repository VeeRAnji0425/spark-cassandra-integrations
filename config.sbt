name := "Spark Cassandra Integration"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.1.0"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.1.0"

libraryDependencies += "org.apache.spark" %% "spark-catalyst" % "1.1.0"

libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % "1.1.0-rc1" withSources() withJavadoc()

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"