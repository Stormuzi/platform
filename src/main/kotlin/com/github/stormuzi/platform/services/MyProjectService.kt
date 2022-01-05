package com.github.stormuzi.platform.services

import com.intellij.openapi.project.Project
import com.github.stormuzi.platform.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
