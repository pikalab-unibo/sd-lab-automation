// Tasks of type `Exec' aim at executing a custom program
tasks.create<Exec>("my-custom-exec-task") {
    group = "custom"
    description = "Synchronously executes a program"

    // executes the `ls -la' program
    commandLine("ls", "-la")
}
