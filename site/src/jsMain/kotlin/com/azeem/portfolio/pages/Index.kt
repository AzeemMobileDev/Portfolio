package com.azeem.portfolio.pages

import androidx.compose.runtime.*
import com.azeem.portfolio.sections.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {

    val pageContext = rememberPageContext()
    val breakpoint = rememberBreakpoint()

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HomeSection(ctx = pageContext, breakpoint = breakpoint)
            AboutSection(breakpoint = breakpoint)
            SkillsSection()
            ExperienceSection(breakpoint = breakpoint)
            Surface(modifier = Modifier.height(30.px)) {}
            FooterSection()
        }
    }
}
