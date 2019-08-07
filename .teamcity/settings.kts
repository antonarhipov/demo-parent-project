import jetbrains.buildServer.configs.kotlin.v2018_2.*

version = "2019.1"

project {
    subProject(A)
}


object A: Project({
    name = "A"

    buildType(Build)
})

object Build : BuildType({
    name = "Build"

})
