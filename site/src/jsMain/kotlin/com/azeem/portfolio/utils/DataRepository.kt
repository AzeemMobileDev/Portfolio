package com.azeem.portfolio.utils

import com.azeem.portfolio.model.Experience
import com.azeem.portfolio.model.Skill
import com.varabyte.kobweb.compose.dom.RawHtml
import com.varabyte.kobweb.framework.annotations.DelicateApi
import org.w3c.dom.HTMLBRElement
import org.w3c.dom.HTMLElement

object DataRepository {
    fun getSkills() = ArrayList<Skill>().apply {
        add(Skill(drawable = Res.Drawable.ANDROID, title = "Android"))
        add(Skill(drawable = Res.Drawable.KOTLIN, title = "Kotlin"))
        add(Skill(drawable = Res.Drawable.ANDROID_JETPACK, title = "Jetpack"))
        add(Skill(drawable = Res.Drawable.JETPACK_COMPOSE, title = "Compose"))
        add(Skill(drawable = Res.Drawable.JSON, title = "JSON"))
        add(Skill(drawable = Res.Drawable.FIREBASE, title = "Firebase"))
        add(Skill(drawable = Res.Drawable.GIT, title = "Git"))
        add(Skill(drawable = Res.Drawable.ANDROID_STUDIO, title = "Android Studio"))
        add(Skill(drawable = Res.Drawable.INTELLIJ, title = "IntelliJ"))
        add(Skill(drawable = Res.Drawable.POSTMAN, title = "Postman"))
        add(Skill(drawable = Res.Drawable.VSCODE, title = "VSCode"))
    }

    fun getAreaOfInterests() = ArrayList<Skill>().apply {
        add(Skill(drawable = Res.Drawable.COMPOSE_MULTIPLATFORM, title = "Compose Multiplatform"))
        add(Skill(drawable = Res.Drawable.FLUTTER, title = "Flutter"))
        add(Skill(drawable = Res.Drawable.REACT_NATIVE, title = "React Native"))
        add(Skill(drawable = Res.Drawable.KOBWEB, title = "Kobweb"))
        add(Skill(drawable = Res.Drawable.KTOR, title = "Ktor"))
        add(Skill(drawable = Res.Drawable.SWIFTUI, title = "SwiftUI"))
    }

    fun getExperiences() = ArrayList<Experience>().apply {
        add(
            Experience(
                id = 1,
                designation = "Associate Android Developer",
                employerName = "Influx Integrated Solutions Private Limited.",
                workDuration = "Nov 2019 - Jun 2024",
                workLocation = "Chennai, India",
                companyLogo = Res.Drawable.INFLUX,
                keyDuties = "Developed and maintained mobile applications based on cinema ticket booking system in real time using the dedicated middleware backend system called INJIN. " +
                        "Had done various code reviews and helped others to achieve the standard coding practices. " +
                        "Had worked in multiple cinema ticketing applications based on various countries."
            )
        )
        add(
            Experience(
                id = 2,
                designation = "Android Developer",
                employerName = "doodleblue Innovations Private Limited.",
                workDuration = "Feb 2017 - May 2019",
                workLocation = "Chennai, India",
                companyLogo = Res.Drawable.DOODLEBLUE,
                keyDuties = "Developed and maintained several mobile applications using the latest technologies of Android development and coding done using Kotlin. " +
                        "Had worked on different types of scenarios and business ideas. " +
                        "Had worked on more than 20 Android projects for this company."
            )
        )
        add(
            Experience(
                id = 3,
                designation = "Android Developer",
                employerName = "Cogzidel Technologies Private Limited.",
                workDuration = "Sept 2015 - Oct 2016",
                workLocation = "Madurai, India",
                companyLogo = Res.Drawable.COGZIDEL,
                keyDuties = "Started career as junior Android developer, worked for 6 months as junior developer. Developed and maintained several mobile applications using the latest technologies of Android development and coding done using Java, mostly product type applications inspired from Uber and Airbnb."
            )
        )
    }

    /*fun getProjects() = ArrayList<ProjectModel>().apply {
        add(
            ProjectModel(
                logo = Res.Drawable.FIRST_DIRECT,
                name = "First Direct",
                skills = "Android, Core Java, Kotlin, Firebase, Git, Jira, Confluence, SAFE",
                description = "A MobileBanking app developed for UK based First Direct bank. From checking your balances and viewing transactions to paying family and friends, mobile banking takes all the hassle out of everyday money stuff. User can now do more than ever from the comfort of your own phone. The user can get all updates related to his bank accounts through notifications.",
                appUrl = "https://play.google.com/store/apps/details?id=com.firstdirect.bankingonthego&hl=en_IN"
            )
        )
        add(
            ProjectModel(
                logo = Res.Drawable.BAJAJ_MARKETS,
                name = "Bajaj Markets",
                skills = "Android, Core Java, Kotlin, WebView, Firebase, Material Design, Git",
                description = "Bajaj Markets App from Bajaj Finserv Direct Ltd. is a one stop solution to all financial needs. This online loan app offers 100+ financial products by 80+ top financial institutions in India. With this personal loan app, you get quick loan approval & fast disbursal. The Bajaj Markets loan app offers Instant Loan, Credit Score, Credit Cards, Investments, Insurance & Personal Finance Manager all in one instant loan app.",
                appUrl = "https://play.google.com/store/apps/details?id=in.bajajfinservmarkets.app&hl=en_IN"
            )
        )
        add(
            ProjectModel(
                logo = Res.Drawable.BAJAJ_FINSERV,
                name = "Bajaj Finserv",
                skills = "Android, Core Java, Kotlin, Material Design, Jetpack, Git",
                description = "Bajaj Finserv App is trusted by 50 million+ customers all over India for their financial and payment needs. With this app, you can apply online for personal loan, home loan, gold loan, etc. You can shop offline from 1 million+ products at no-cost EMI, manage investments, get insurance, and do much more. You can also easily pay your utility bills, recharge mobile and transfer money using BHIM UPI.",
                appUrl = "https://play.google.com/store/apps/details?id=org.altruist.BajajExperia&hl=en_IN"
            )
        )
        add(
            ProjectModel(
                logo = Res.Drawable.ENTRATA_FACILITIES,
                name = "Entrata Facilities",
                skills = "Android, Kotlin, Jetpack, Firebase, SVN, Git, Agile",
                description = "Entrata Facilities simplifies your work order management process. Quickly assign, manage, and close work orders while tracking the time it takes to complete them. This app was developed for the maintenance people who work in property management domain. This was my first project developed by using Kotlin programming language. This app also support offline storage.",
                appUrl = "https://play.google.com/store/apps/details?id=com.entrata.facilities&hl=en_IN"
            )
        )
        add(
            ProjectModel(
                logo = Res.Drawable.KOTLIN_MULTIPLATFORM,
                name = "MusicApp KMP",
                skills = "Kotlin, Compose Multiplatform, Media Player, Ktor, Moshi, Decompose",
                description = "This is a music player app built using Kotlin Multiplatform and Compose Multiplatform UI that works on Android, iOS, Desktop, and Web platforms. It uses the spotify api for fetching the top 50 charts and getting the trending albums. This repository has been listed as KMP sample on official website of Jetbrains and I have been working as a open source contributor to this project." ,
                appUrl = "https://github.com/SEAbdulbasit/MusicApp-KMP",
                isOpenSourced = true
            )
        )
        add(
            ProjectModel(
                logo = "",
                name = "",
                skills = "",
                description = "More on GitHub",
                appUrl = Res.String.GITHUB_URL
            )
        )
    }*/

}