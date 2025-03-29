package com.azeem.portfolio.sections

import androidx.compose.runtime.Composable
import com.azeem.portfolio.utils.*
import com.azeem.portfolio.widgets.SectionTitle
import com.varabyte.kobweb.browser.util.kebabCaseToTitleCamelCase
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.shapes.Rect
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

@Composable
fun AboutSection(breakpoint: Breakpoint) {

    Column(
        modifier = HeroSectionStyle.toModifier().id(Res.String.ABOUT_TITLE),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        SectionTitle(Res.String.ABOUT_TITLE.kebabCaseToTitleCamelCase())

        Surface(modifier = SurfaceStyle.toModifier()) {}

        SimpleGrid(
            numColumns = numColumns(base = 1, md = 2), modifier = Modifier.fillMaxWidth().thenIf(
                condition = breakpoint > Breakpoint.MD, other = Modifier.height(600.px)
            ).padding(all = 12.px).border(0.1.px, LineStyle.Solid, Res.Colors.DARK).borderRadius(r = 8.px)
        ) {
            LeftSide(breakpoint = breakpoint)
            RightSide(breakpoint = breakpoint)
        }
    }
}

@Composable
fun LeftSide(
    breakpoint: Breakpoint
) {
    Column(
        modifier = Modifier.fillMaxSize().padding(all = 40.px),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally else Alignment.Start
    ) {
        SpanText(
            text = Res.String.NAME,
            modifier = AboutSectionHeadingStyle.toModifier().margin(bottom = 12.px).fontFamily(Res.Font.LATO_BLACK)
                .color(Res.Colors.DARK_BLUE).fontWeight(FontWeight.Bold).textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )
        SpanText(
            text = Res.String.PROFESSION,
            modifier = AboutSectionDesignationStyle.toModifier().margin(bottom = 12.px).fontFamily(Res.Font.LATO_BOLD)
                .color(Res.Colors.DARK_BLUE)
        )
        SpanText(
            text = Res.String.YEAR_OF_EXP,
            modifier = AboutSectionDesignationStyle.toModifier().margin(bottom = 24.px).fontFamily(Res.Font.LATO_BOLD)
                .color(Res.Colors.DARK_BLUE)
        )

        Surface(
            modifier = Modifier
                .height(2.px)
                .fillMaxWidth()
                .margin(bottom = 24.px)
                .background(
                    Res.Colors.DARK_BLUE
                )
                .align(
                    if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally
                    else Alignment.Start
                )
        ) {}

        SpanText(
            modifier = AboutTextStyle.toModifier().fontFamily(Res.Font.LATO_REGULAR).color(Res.Colors.DARK_BLUE)
                .opacity(75.percent).lineHeight(2).margin(bottom = 36.px).textAlign(
                    TextAlign.Justify
                ), text = Res.String.ABOUT_ME
        )
    }
}

@Composable
fun RightSide(breakpoint: Breakpoint) {
    Box(
        modifier = Modifier.thenIf(
            condition = breakpoint > Breakpoint.MD, other = Modifier.height(576.px)
        )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = AboutProfileImageStyle.toModifier().borderRadius(10.px).clip(shape = Rect(0, 10.px))
                    .align(Alignment.CenterHorizontally)
            ) {
                Image(
                    modifier = HoverImageStyle.toModifier()
                        .then(Modifier.fillMaxWidth().align(Alignment.TopCenter).objectFit(ObjectFit.Cover)).background(
                            Res.Colors.PROFILE_BG
                        ),
                    src = Res.Drawable.IMAGE_2, alt = "Profile image"
                )
                Div(Modifier.fillMaxSize().background(Colors.Transparent).toAttrs())
                Image(
                    modifier = HoverImageArtStyle.toModifier()
                        .then(Modifier.fillMaxWidth().align(Alignment.TopCenter).objectFit(ObjectFit.Cover)).background(
                            Res.Colors.PROFILE_BG
                        ),
                    src = Res.Drawable.IMAGE_ART, alt = "Profile image art"
                )
            }
            SpanText(
                text = Res.String.REVEAL_PROFILE_IMAGE,
                modifier = AboutSectionDesignationStyle.toModifier().margin(topBottom = 12.px)
                    .fontFamily(Res.Font.LATO_REGULAR)
                    .color(Res.Colors.DARK_BLUE)
            )
        }
    }
}