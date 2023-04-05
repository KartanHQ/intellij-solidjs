package com.nekofar.milad.intellij.solidjs.cli

import com.intellij.execution.filters.Filter
import com.intellij.lang.javascript.boilerplate.NpmPackageProjectGenerator
import com.intellij.lang.javascript.boilerplate.NpxPackageDescriptor
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ContentEntry
import com.intellij.openapi.vfs.VirtualFile
import com.nekofar.milad.intellij.solidjs.SolidBundle
import com.nekofar.milad.intellij.solidjs.SolidIcons
import javax.swing.Icon

class SolidCliProjectGenerator : NpmPackageProjectGenerator() {
    private val packageName = "create-solid"
    private val npxCommand = "create-solid"

    override fun getName(): String = SolidBundle.message("solid.project.generator.name")

    override fun getDescription(): String = SolidBundle.message("solid.project.generator.description")

    override fun filters(project: Project, baseDir: VirtualFile): Array<Filter> = emptyArray()

    override fun customizeModule(virtualFile: VirtualFile, contentEntry: ContentEntry?) {}

    override fun packageName(): String = packageName

    override fun presentablePackageName(): String =
        SolidBundle.message("solid.project.generator.presentable.package.name")

    override fun getNpxCommands() = listOf(NpxPackageDescriptor.NpxCommand(packageName, npxCommand))

    override fun generateInTemp(): Boolean = false

    override fun generatorArgs(project: Project?, dir: VirtualFile?, settings: Settings?): Array<String> =
        arrayOf(".")

    override fun getIcon(): Icon = SolidIcons.ProjectGenerator
}
