package com.azeem.portfolio.sections

import androidx.compose.runtime.Composable
import com.azeem.portfolio.model.Experience
import com.azeem.portfolio.utils.*
import com.azeem.portfolio.utils.Res.String.EXPERIENCE_TITLE
import com.azeem.portfolio.widgets.SectionTitle
import com.varabyte.kobweb.browser.util.kebabCaseToTitleCamelCase
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun ExperienceSection(breakpoint: Breakpoint) {
    Column(
        modifier = HeroSectionStyle.toModifier().id(EXPERIENCE_TITLE),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        SectionTitle(EXPERIENCE_TITLE.kebabCaseToTitleCamelCase())

        Surface(modifier = SurfaceStyle.toModifier()) {}

        SimpleGrid(
            numColumns = numColumns(base = 1, md = 2),
            modifier = Modifier.fillMaxWidth()
        ) {
            DataRepository.getExperiences().forEach { experienceItem ->
                ExperienceItem(experience = experienceItem, breakpoint = breakpoint)
            }
        }
    }
}

@Composable
fun ExperienceItem(experience: Experience, breakpoint: Breakpoint, modifier: Modifier = Modifier) {
    Column(
        modifier = HoverBgStyle.toModifier().then(
            modifier.border(
                0.1.px, LineStyle.Solid, Res.Colors.DARK
            ).borderRadius(r = 8.px).padding(10.px).margin(bottom = 20.px)
                .thenIf(
                    condition = breakpoint > Breakpoint.MD && experience.id % 2 == 1,
                    other = Modifier.margin(right = 20.px, bottom = 20.px)
                )
        )
    ) {
        Column(modifier = Modifier.padding(10.px)) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.padding(5.px)
            ) {

                Image(
                    modifier = Modifier.width(60.px).objectFit(ObjectFit.Contain).padding(right = 8.px),
                    src = experience.companyLogo,
                )

                Column {
                    SpanText(
                        text = experience.employerName,
                        modifier = Modifier
                            .color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Res.Colors.DARK
                                    ColorMode.DARK -> Res.Colors.WHITE
                                }
                            )
                            .fontFamily(Res.Font.LATO_BOLD)
                            .fontSize(15.px)
                    )

                    SpanText(
                        text = experience.workLocation,
                        modifier = Modifier
                            .color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Res.Colors.DARK
                                    ColorMode.DARK -> Res.Colors.WHITE
                                }
                            )
                            .fontFamily(Res.Font.LATO_REGULAR)
                            .fontSize(14.px).margin(top = 4.px)
                    )
                }

            }

            SpanText(
                text = experience.designation + " (${experience.workDuration})",
                modifier = Modifier
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.DARK
                            ColorMode.DARK -> Res.Colors.WHITE
                        }
                    )
                    .fontFamily(Res.Font.LATO_BOLD)
                    .fontSize(13.5.px)
                    .margin(top = 5.px)
            )

            SpanText(
                text = Res.String.KEY_DUTIES.kebabCaseToTitleCamelCase(),
                modifier = Modifier
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.DARK
                            ColorMode.DARK -> Res.Colors.WHITE
                        }
                    )
                    .fontFamily(Res.Font.LATO_BLACK)
                    .fontSize(13.5.px)
                    .margin(top = 20.px)
            )

            SpanText(
                text = experience.keyDuties,
                modifier = Modifier
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.DARK
                            ColorMode.DARK -> Res.Colors.WHITE
                        }
                    )
                    .fontFamily(Res.Font.LATO_BOLD)
                    .fontSize(12.5.px).margin(top = 5.px).textAlign(
                        TextAlign.Justify
                    )
            )
        }
    }
}