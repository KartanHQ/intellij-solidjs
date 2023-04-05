package com.nekofar.milad.intellij.solidjs.cli

import com.intellij.ide.util.projectWizard.WebTemplateNewProjectWizard
import com.intellij.ide.wizard.GeneratorNewProjectWizardBuilderAdapter

class SolidCliProjectModuleBuilder : GeneratorNewProjectWizardBuilderAdapter(WebTemplateNewProjectWizard(
    SolidCliProjectGenerator()
))
