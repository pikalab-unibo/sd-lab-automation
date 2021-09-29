tasks.getByName<JavaExec>("run") {
    // attaches gradle's stdin to the application's stdin
    standardInput = System.`in`

    // pass the value of property `key1' as the first argument of the application
    // if `key1' is missing, use "default-value-1" instead
    if (project.hasProperty("key1")) {
        args(project.property("key1"))
    } else {
        args("default-value-1")
    }

    // pass the value of property `key2' as the first argument of the application
    // if `key1' is missing, use "default-value-2" instead
    if (project.hasProperty("key2")) {
        args(project.property("key2"))
    } else {
        args("default-value-2")
    }
}
