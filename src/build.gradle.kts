plugins {
  java // this is a java project
  application // the project is runnable (task `run' is implicitly defined here)
}

repositories {
  mavenCentral() // look for dependencies on the MCR
  jcenter() // DEPRECATED
  maven("https://path/to/custom/repo.com")
}

application {
    // Main class to be launched by task `run'
    mainClassName = "it.unibo.my.app.App"
}

dependencies {
    // Test dependencies for running tests
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")

    // Main dependencies for the application
    implementation("com.google.guava:guava:33.1.0-jre")
}
(*@\framebreak@*)
java {
    // sources are parsed according to Java 8 syntax
    sourceCompatibility = JavaVersion.VERSION_1_8
    // bytecode shall be compiled for Java 8 compatibility
    targetCompatibility = JavaVersion.VERSION_1_8
}

// Implicitly defined tasks: build, test, assemble, jar, run, ...
