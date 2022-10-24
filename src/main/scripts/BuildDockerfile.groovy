
// This reads the docker file template and converts it to a String
String template = new File("${project.basedir}/src/main/docker/DockerfileTemplate".toString()).getText()

// This builds up a template engine to modify text
// it also substitutes each template literal ie ${fileName} with the project.build.finalName which is a global variable
def dockerFileText = new groovy.text.SimpleTemplateEngine().createTemplate(template)
        .make([fileName: project.build.finalName])

println "writing dir " + "${project.basedir}/target/dockerfile"
// This creates a directory named dockerFile in target dir
new File("${project.basedir}/target/dockerfile/".toString()).mkdirs()

println "writing file"
// This gets the appropriate file name
File dockerFile = new File("${project.basedir}/target/dockerfile/Dockerfile".toString())

// This writes the modified text to the newly created file
dockerFile.withWriter('UTF-8') { writer ->
    writer.write(dockerFileText)
}