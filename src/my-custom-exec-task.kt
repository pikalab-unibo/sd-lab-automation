// Tasks of type `JavaExec' aim at executing a Java program
tasks.create<JavaExec>("my-custom-java-exec-task") {
    group = "custom"
    description = "Synchronously executes a Java program"

    mainClass.set("package.of.my.main.Class") // main class

    // in case the java application should exploit the current project's code
    classpath = project.sourceSets.main.get().runtimeClasspath
    // otherwise, in case the java application exploit some particular jar
    classpath += files("path/to/libs/file1.jar", "path/to/libs/file2.jar")

    // provide arguments to the Java program
    args("default", "args", "here")
    // attaches gradle's stdin to the java application's stdin
    standardInput = System.`in`
}
