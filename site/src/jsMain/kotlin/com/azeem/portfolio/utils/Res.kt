package com.azeem.portfolio.utils

import com.varabyte.kobweb.compose.ui.graphics.Color

object Res {
    object Colors {
        val PROFILE_BG = Color.rgb(0xbbdbe6)
        val HOME_BG = Color.rgb(0xdbecf2)
        val DARK = Color.rgb(0x377292)
        val DARK_BLUE = Color.rgb(0x293f50)
        val WHITE = Color.rgb(0xffffff)
        val BLACK = Color.rgb(0x000000)
        val GREY = Color.rgb(0x9ca7b8)
        val GREY_DARK = Color.rgb(0x606060)
    }

    object String {
        const val INTRO = "Hi, I am Mohamed Azeem"
        const val NAME = "Mohamed Azeem"
        const val HOME_TITLE = "home"
        const val ABOUT_TITLE = "about"
        const val SKILLS_TITLE = "skills"
        const val AREA_OF_INTEREST_TITLE = "Area of Interest"
        const val TOOLS_TITLE = "tools"
        const val EXPERIENCE_TITLE = "experience"
        const val PROJECTS_TITLE = "projects"
        const val PROFESSION = "Native Android Developer"
        const val YEAR_OF_EXP = "8+ years of experience"
        val ABOUT_ME = listOf(
            "  Sr. Application Developer specialized in writing code with Java and Kotlin for creating Android applications with total experience of 8+ years.",
            "  Developed applications with Kotlin, Core Java, Android and Jetpack components.",
            "  5 months of experience in Designing UI using Jetpack Compose.",
            "  Basic Cross Platform application development by using Flutter and React Native.",
            "  Experience of developing applications with MVP, MVVM and Clean architecture.",
            "  Knowledge of Offline Storage (Room), Threading and Networking.",
            "  Good knowledge of Firebase Push Notifications, Crashlytics, Dynamic Link, Analytics.",
            "  Good knowledge of Version Control System SVN and Git(Github, Gitlab)."
        )
        const val KEY_DUTIES = "Key Duties:"
        const val GITHUB_URL = "https://github.com/AzeemMobileDev"
        const val LINKEDIN_URL = "https://www.linkedin.com/in/mohamed-azeem-m/"
        const val RESUME = "https://drive.google.com/file/d/1a55FTPQEH30ckbAKJNEXYWhXsvZLeL6Z/view?usp=sharing"
        const val VERSION = "Version: 1.0.0"
        const val MADE_WITH = "Made with"
        const val REVEAL_PROFILE_IMAGE = "Tap or hover to reveal my profile image"
    }

    object Drawable {
        // Profile image
        const val IMAGE_1 = "/image1.png"
        const val IMAGE_2 = "/image2.png"
        const val IMAGE_ART = "/image-art.webp"
        const val PROFILE_IMAGE_ART = "/profile-pic-art.png"

        // Skills and Tools
        const val ANDROID = "/images/android.svg"
        const val FIREBASE = "/images/firebase.svg"
        const val FLUTTER = "/images/flutter.svg"
        const val GIT = "/images/git.svg"
        const val INTELLIJ = "/images/intellij.svg"
        const val POSTMAN = "/images/postman.svg"
        const val VSCODE = "/images/vs-code.svg"
        const val KOTLIN = "/images/kotlin.svg"
        const val KOBWEB_LOGO = "/images/kobweb_logo.png"
        const val KOBWEB = "/images/kobweb.png"
        const val KTOR = "/images/ktor-logo.png"
        const val COMPOSE_MULTIPLATFORM = "/images/compose-multiplatform.png"
        const val REACT_NATIVE = "/images/react-native.svg"
        const val SWIFTUI = "/images/swiftui.png"
        const val JETPACK_COMPOSE = "/images/jetpack-compose.png"
        const val ANDROID_JETPACK = "/images/android-jetpack.svg"
        const val ANDROID_STUDIO = "/images/android-studio.svg"
        const val JSON = "/images/json.png"
        const val RESUME = "/images/resume.svg"

        // Experience
        const val COGZIDEL = "/images/cogzidel_logo.jpeg"
        const val DOODLEBLUE = "/images/doodleblue_logo.jpeg"
        const val INFLUX = "/images/influxww_logo.jpeg"

        // Projects
        const val PLAY_STORE = "/images/play-store.svg"
        const val GITHUB = "/images/github.svg"
        const val GITHUB_WHITE = "/images/github-white.svg"

    }

    object Font {
        const val LATO_BOLD = "Lato-Bold"
        const val LATO_BLACK = "Lato-Black"
        const val LATO_REGULAR = "Lato-Regular"
        const val LATO_LIGHT = "Lato-Light"
    }
}