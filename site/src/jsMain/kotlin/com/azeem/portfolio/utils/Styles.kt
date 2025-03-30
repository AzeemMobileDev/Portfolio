package com.azeem.portfolio.utils

import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.forms.ButtonStyle
import com.varabyte.kobweb.silk.components.forms.ButtonVars
import com.varabyte.kobweb.silk.style.*
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.palette.color
import com.varabyte.kobweb.silk.theme.colors.palette.toPalette
import org.jetbrains.compose.web.css.*

val PageContentStyle = CssStyle {
    base { Modifier.fillMaxSize().padding(leftRight = 2.cssRem, top = 2.cssRem) }
    Breakpoint.MD { Modifier.maxWidth(60.cssRem) }
}

val NavHeaderStyle = CssStyle {
    base {
        Modifier
            .background(rgba(255, 255, 255, 0f))
            .gap(1.5.cssRem)
            .fillMaxWidth().padding(1.cssRem)
    }
}

val CircleButtonVariant = ButtonStyle.addVariantBase {
    Modifier.padding(0.px).borderRadius(50.percent)
}

val UncoloredButtonVariant = ButtonStyle.addVariantBase {
    Modifier.setVariable(ButtonVars.BackgroundDefaultColor, Colors.Transparent)
}

val HoverBgStyle = CssStyle {
    hover {
        Modifier.background(when (colorMode) {
            ColorMode.LIGHT -> Res.Colors.HOME_BG
            ColorMode.DARK -> Res.Colors.DARK
        })
    }
}

val ShareButtonStyle = CssStyle {
    hover {
        Modifier.cursor(Cursor.Pointer).scale(1.2)
    }
}

val HoverCursorStyle = CssStyle {
    hover {
        Modifier.cursor(Cursor.Pointer)
    }
}

val FooterStyle = CssStyle.base {
    Modifier.padding(topBottom = 1.5.cssRem, leftRight = 10.percent)
}

val BackToTopButtonStyle = CssStyle {
    base {
        Modifier
            .size(30.px)
            .borderRadius(100.percent)
            .margin(
                right = 7.5.px,
                bottom = 30.px
            )
            .cursor(Cursor.Pointer)
            .styleModifier {
                property("pointer-events", "auto")
            }

    }

    Breakpoint.SM {
        Modifier
            .size(30.px)
            .borderRadius(100.percent)
            .margin(
                right = 15.px,
                bottom = 30.px
            )
            .styleModifier {
                property("pointer-events", "auto")
            }
            .transition(
                Transition.of(
                    property = "translate",
                    duration = 200.ms, timingFunction = AnimationTimingFunction.Ease,
                    delay = null
                )
            )
    }
    Breakpoint.MD {
        Modifier
            .size(40.px)
            .borderRadius(100.percent)
            .margin(
                right = 20.px,
                bottom = 30.px
            )
            .styleModifier {
                property("pointer-events", "auto")
            }
            .transition(
                Transition.of(
                    property = "translate",
                    duration = 200.ms, timingFunction = AnimationTimingFunction.Ease,
                    delay = null
                )
            )
    }
    Breakpoint.LG {
        Modifier
            .size(50.px)
            .borderRadius(100.percent)
            .margin(
                right = 40.px,
                bottom = 40.px
            )
            .styleModifier {
                property("pointer-events", "auto")
            }
            .transition(
                Transition.of(
                    property = "translate",
                    duration = 200.ms, timingFunction = AnimationTimingFunction.Ease,
                    delay = null
                )
            )
    }

    hover {
        Modifier.translateY((-10).px)
    }
}

val SubHeadLineTextStyle = CssStyle.base {
    Modifier
        .fontSize(1.cssRem)
        .textAlign(TextAlign.Start)
        .color(colorMode.toPalette().color.toRgb())
}

val SectionTitleStyle = CssStyle {
    base {
        Modifier.fontSize(FontSize.Large)
    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.Large)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.XLarge)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.XLarge)
    }
}

val SectionDescriptionStyle = CssStyle {
    base {
        Modifier.fontSize(FontSize.XSmall)
            .margin(topBottom = 0.75.cssRem)
    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.Small)
            .margin(topBottom = 0.75.cssRem)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.Medium)
            .margin(topBottom = 1.cssRem)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.Large)
            .margin(topBottom = 2.cssRem)
    }
}

val ProfileImageStyle = CssStyle {
    base {
        Modifier
            .size(250.px)
            .borderRadius(100.percent)
            .margin(0.px)
            .objectFit(ObjectFit.Cover)
            .opacity(100.percent)
    }
    Breakpoint.SM {
        Modifier.size(250.px).opacity(100.percent)

    }
    Breakpoint.MD {
        Modifier.size(275.px).opacity(100.percent)

    }
    Breakpoint.LG {
        Modifier.size(375.px).opacity(100.percent)

    }
}

val HoverProfileImageArtStyle = CssStyle {
    base {
        Modifier.size(250.px)
            .borderRadius(100.percent)
            .margin(0.px)
            .objectFit(ObjectFit.Cover)
            .opacity(100.percent)
            .transition(
                Transition.of(
                    property = "opacity",
                    duration = 200.ms,
                    delay = null
                )
            )
    }
    Breakpoint.SM {
        Modifier.size(250.px).opacity(100.percent)

    }
    Breakpoint.MD {
        Modifier.size(275.px).opacity(100.percent)

    }
    Breakpoint.LG {
        Modifier.size(375.px).opacity(100.percent)

    }
    hover {
        Modifier
            .opacity(0.percent)
    }
    cssRule("onClick") {
        Modifier
            .opacity(0.percent)
    }
}

val AboutProfileImageStyle = CssStyle {
    Breakpoint.ZERO {
        Modifier
            .height(280.px)
            .width(240.px)
            .objectFit(ObjectFit.Cover)
    }
    Breakpoint.SM {
        Modifier
            .height(300.px)
            .width(250.px)
            .objectFit(ObjectFit.Cover)
    }
    Breakpoint.MD {
        Modifier
            .height(400.px)
            .width(350.px)
            .objectFit(ObjectFit.Cover)
    }
    Breakpoint.LG {
        Modifier
            .height(450.px)
            .width(400.px)
            .objectFit(ObjectFit.Cover)
    }
}


val ProfileHeadingStyle = CssStyle {
    base {
        Modifier
            .fontSize(20.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(25.px)
    }
    Breakpoint.MD {
        Modifier.fontSize(30.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(40.px)
    }
}

val AboutSectionHeadingStyle = CssStyle {
    base {
        Modifier
            .fontSize(20.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(20.px)
    }
    Breakpoint.MD {
        Modifier.fontSize(25.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(35.px)
    }
}

val DesignationStyle = CssStyle {
    base {
        Modifier
            .fontSize(15.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(18.px)
    }
    Breakpoint.MD {
        Modifier.fontSize(22.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(25.px)
    }
}

val AboutSectionDesignationStyle = CssStyle {
    base {
        Modifier
            .fontSize(14.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(14.px)
    }
    Breakpoint.MD {
        Modifier.fontSize(16.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(18.px)
    }
}

val AboutTextStyle = CssStyle {
    base {
        Modifier
            .fontSize(14.5.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(14.5.px)
    }
    Breakpoint.MD {
        Modifier.fontSize(15.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(16.px)
    }
}

val ResumeButtonStyle = CssStyle {
    base {
        Modifier
            .width(115.px)
            .height(35.px)
            .fontSize(12.px)
    }
    Breakpoint.SM {
        Modifier.width(125.px)
            .height(40.px)
            .fontSize(12.px)

    }
    Breakpoint.MD {
        Modifier.width(135.px)
            .height(45.px)
            .fontSize(13.px)
    }
    Breakpoint.LG {
        Modifier.width(145.px)
            .height(50.px)
            .fontSize(14.px)
    }

    hover {
        Modifier.scale(1.1).cursor(Cursor.Pointer)
    }
}

val SkillIconStyle = CssStyle {
    base {
        Modifier.size(34.px)
    }
    Breakpoint.SM {
        Modifier.size(34.px)

    }
    Breakpoint.MD {
        Modifier.size(38.px)
    }
    Breakpoint.LG {
        Modifier.width(42.px)
    }
}

val ResumeIconStyle = CssStyle {
    base {
        Modifier.size(22.px)
    }
    Breakpoint.SM {
        Modifier.size(22.px)

    }
    Breakpoint.MD {
        Modifier.size(24.px)
    }
    Breakpoint.LG {
        Modifier.width(28.px)
    }
}

val SkillTitleStyle = CssStyle {
    Breakpoint.ZERO {
        Modifier
            .fontSize(12.5.px)
    }
    Breakpoint.SM {
        Modifier
            .fontSize(12.5.px)
    }
    Breakpoint.MD {
        Modifier
            .fontSize(13.px)
    }
    Breakpoint.LG {
        Modifier
            .fontSize(14.px)
    }
}

val NavigationMenuStyle = CssStyle {
    base {
        Modifier.fontSize(12.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(12.px)

    }
    Breakpoint.MD {
        Modifier.fontSize(14.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(16.px)
    }
    Breakpoint.XL {
        Modifier.fontSize(18.px)
    }
}

val SurfaceStyle = CssStyle {
    base {
        Modifier.height(25.px)
    }
    Breakpoint.ZERO {
        Modifier.height(25.px)
    }
    Breakpoint.SM {
        Modifier.height(25.px)
    }
    Breakpoint.MD {
        Modifier.height(45.px)
    }
    Breakpoint.LG {
        Modifier.height(45.px)
    }
}

val HoverImageStyle = CssStyle {
    base {
        Modifier
            .opacity(100.percent)
    }
}

val HoverImageArtStyle = CssStyle {
    base {
        Modifier.opacity(100.percent)
            .transition(
                Transition.of(
                    property = "opacity",
                    duration = 200.ms,
                    delay = null
                )
            )
    }
    hover {
        Modifier
            .opacity(0.percent)
    }
    cssRule("onClick") {
        Modifier
            .opacity(0.percent)
    }
}

val HeroSectionStyle = CssStyle {
    base {
        Modifier
            .width(95.percent)
            .fontSize(3.cssRem)
            .padding(top = 2.cssRem)
    }
    Breakpoint.ZERO {
        Modifier
            .width(90.percent)
            .fontSize(2.5.cssRem)
            .padding(top = 2.cssRem)
    }
    Breakpoint.SM {
        Modifier
            .width(90.percent)
            .fontSize(2.5.cssRem)
            .padding(top = 2.cssRem)
    }
    Breakpoint.MD {
        Modifier
            .width(95.percent)
            .fontSize(2.75.cssRem)
            .padding(top = 3.cssRem)
    }
    Breakpoint.LG {
        Modifier
            .width(80.percent)
            .fontSize(3.cssRem)
            .padding(top = 3.cssRem)
    }
}

val HomeSectionStyle = CssStyle {
    base {
        Modifier
            .width(100.percent)
            .height(600.px)
    }
    Breakpoint.ZERO {
        Modifier
            .width(100.percent)
            .height(550.px)
    }
    Breakpoint.SM {
        Modifier
            .width(100.percent)
            .height(550.px)
    }
    Breakpoint.MD {
        Modifier
            .width(100.percent)
            .height(625.px)
    }
    Breakpoint.LG {
        Modifier
            .width(100.percent)
            .height(725.px)
    }
}

val AboutStyle = CssStyle {
    base {
        Modifier
            .width(100.percent)
            .fontSize(3.cssRem)
            .height(100.vh)
    }
    Breakpoint.ZERO {
        Modifier
            .width(100.percent)
            .fontSize(2.5.cssRem)
            .height(50.vh)
    }
    Breakpoint.SM {
        Modifier
            .width(100.percent)
            .fontSize(2.5.cssRem)
            .height(50.vh)
    }
    Breakpoint.MD {
        Modifier
            .width(100.percent)
            .fontSize(2.75.cssRem)
            .height(85.vh)
    }
    Breakpoint.LG {
        Modifier
            .width(100.percent)
            .fontSize(3.cssRem)
            .height(100.vh)
    }
}

val EmployerTextStyle = CssStyle {
    base {
        Modifier
            .fontSize(15.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(15.px)
    }
    Breakpoint.MD {
        Modifier.fontSize(16.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(17.px)
    }
}

val EmployerLocationTextStyle = CssStyle {
    base {
        Modifier
            .fontSize(14.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(14.px)
    }
    Breakpoint.MD {
        Modifier.fontSize(15.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(16.px)
    }
}