package com.azeem.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.azeem.portfolio.utils.Res
import com.azeem.portfolio.utils.SectionTitleStyle
import com.azeem.portfolio.utils.SubHeadLineTextStyle
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.dom.Div

@Composable
fun SectionTitle(
    sectionTitleText: String
) {
    Row {
        Div(SubHeadLineTextStyle.toAttrs()) {
            SpanText(
                text = sectionTitleText,
                modifier = SectionTitleStyle.toModifier()
                    .align(Alignment.Bottom)
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.DARK_BLUE
                            ColorMode.DARK -> Colors.White
                        }
                    )
                    .fontFamily(Res.Font.LATO_BOLD)
            )
        }
    }
}