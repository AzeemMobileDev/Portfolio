package com.azeem.portfolio.utils

import com.azeem.portfolio.model.Skill

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
    }

    /*fun getExperiences() = ArrayList<ExperienceModel>().apply {
        add(
            ExperienceModel(
                designation = "Senior Software Engineer",
                employerName = "HSBC",
                duration = "Sept 23 - Sept 24",
                logo = Res.Drawable.HSBC,
                roleAndResponsibilities = "At HSBC, I worked as an Acting Team Lead of mobile team that consist of 3 iOS developers and 3 Android developers including me. I had a great experience working on First Direct Banking app. For the first time I worked on Scaled Agile framework. I also led team in quarterly Hackathon event where we won best presentation award 2 times, along with awards in few other categories."
            )
        )
        add(
            ExperienceModel(
                designation = "Senior Software Engineer",
                employerName = "Bajaj Markets",
                duration = "Sept 21 - Sept 23",
                logo = Res.Drawable.BAJAJ_MARKETS,
                roleAndResponsibilities = "At Bajaj Markets, I worked on both in house projects and client projects. Related to in house projects, I specifically worked on developing Insurance SDK that is being used in both Bajaj Markets and Bajaj Finserv Android applications. During last 6 months of tenure, I got an opportunity to work on client project, Ambit Finvest, where I was leading the team of 3 Android developers including me."
            )
        )
        add(
            ExperienceModel(
                designation = "Software Engineer",
                employerName = "Entrata",
                duration = "July 18 - Sept 21",
                logo = Res.Drawable.ENTRATA,
                roleAndResponsibilities = "Working at Entrata has made long lasting impact on my career. At Entrata, I was working as an individual contributor in the team of 3 Android developers. Strictly following coding standards and meeting deadlines made me more disciplined. I worked on Entrata Facilities app, that was my first project built using Kotlin programming language. I worked at Entrata for 3 years and 2 months."
            )
        )
        add(
            ExperienceModel(
                designation = "Software Engineer",
                employerName = "Veracity Software",
                duration = "OCt 17 - June 18",
                logo = Res.Drawable.VERACITY_SOFTWARE,
                roleAndResponsibilities = "At Veracity Software, I worked as an Associate Android Deeveloper. This was the initial phase of my career, where I got to work on one IOT based proof of concept. This POC was being developed for Harmen International. The idea was to collect Car data like current location, speed, fuel status, crash reporting. Sensors from the vehicle were sending data to Firebase database and realtime updates were visible on the app side."
            )
        )
    }*/

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