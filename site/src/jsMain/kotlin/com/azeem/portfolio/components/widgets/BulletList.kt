package com.azeem.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.azeem.portfolio.utils.AboutTextStyle
import com.azeem.portfolio.utils.EmployerLocationTextStyle
import com.azeem.portfolio.utils.Res
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun BulletList(listItems: List<String>) {
    listItems.forEach {
        Row {
            SpanText(
                modifier = AboutTextStyle.toModifier().fontFamily(Res.Font.LATO_REGULAR).color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Res.Colors.DARK_BLUE
                        ColorMode.DARK -> Res.Colors.WHITE
                    }
                ).opacity(75.percent).lineHeight(2).margin(bottom = 6.px).textAlign(
                    TextAlign.Start
                ), text = "●"
            )
            SpanText(
                modifier = AboutTextStyle.toModifier().fontFamily(Res.Font.LATO_REGULAR).color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Res.Colors.DARK_BLUE
                        ColorMode.DARK -> Res.Colors.WHITE
                    }
                ).opacity(75.percent).lineHeight(2).margin(bottom = 6.px).textAlign(
                    TextAlign.Start
                ), text = it
            )
        }
    }
}

@Composable
fun BulletedExpList(listItems: List<String>) {
    listItems.forEach {
        Row {
            SpanText(
                text = "●",
                modifier = EmployerLocationTextStyle.toModifier()
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.DARK
                            ColorMode.DARK -> Res.Colors.WHITE
                        }
                    )
                    .fontFamily(Res.Font.LATO_REGULAR)
                    .margin(top = 15.px).textAlign(
                        TextAlign.Start
                    )
            )
            SpanText(
                text = it,
                modifier = EmployerLocationTextStyle.toModifier()
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.DARK
                            ColorMode.DARK -> Res.Colors.WHITE
                        }
                    )
                    .fontFamily(Res.Font.LATO_REGULAR)
                    .margin(top = 15.px).textAlign(
                        TextAlign.Start
                    )
            )
        }
    }
}