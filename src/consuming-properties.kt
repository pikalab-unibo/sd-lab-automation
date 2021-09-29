// project is pre-defined variable referencing the local project
if (project.hasProperty("property-name")) {
    val propertyValue = project.property("property-name")
    // use property value
}

// rootProject is pre-defined variable referencing the root project
if (rootProject.hasProperty("property-name")) {
    val propertyValue = rootProject.property("property-name")
    // use property value
}
