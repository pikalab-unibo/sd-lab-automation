tasks.test {
    // use JUnit 5 for running tests
    useJUnitPlatform()
}

tasks.compileJava {
    // bytecode is compiled for Java 11 compatibility
    options.release.set(11)
}
