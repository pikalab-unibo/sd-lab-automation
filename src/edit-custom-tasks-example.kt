// Task `run' is automatically added by the `application' plugin
// It aims at executing the `mainClass' defined into the `application {...}' block
tasks.getByName<JavaExec>("run") {
    // attaches gradle's stdin to the application's stdin
    standardInput = System.`in`
    // provides some default arguments to the application
    args("default", "args", "here")
}
