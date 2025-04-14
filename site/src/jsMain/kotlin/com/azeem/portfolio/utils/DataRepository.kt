package com.azeem.portfolio.utils

import com.azeem.portfolio.model.*

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
        add(Skill(drawable = Res.Drawable.INTELLIJ, title = "IntelliJ IDEA"))
        add(Skill(drawable = Res.Drawable.POSTMAN, title = "Postman"))
        add(Skill(drawable = Res.Drawable.VSCODE, title = "VSCode"))
    }

    fun getAreaOfInterests() = ArrayList<Interests>().apply {
        add(Interests(drawable = Res.Drawable.COMPOSE_MULTIPLATFORM, title = "Compose Multiplatform", link = "https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-create-first-app.html"))
        add(Interests(drawable = Res.Drawable.FLUTTER, title = "Flutter", link = "https://docs.flutter.dev/get-started/codelab"))
        add(Interests(drawable = Res.Drawable.REACT_NATIVE, title = "React Native", link = "https://reactnative.dev/docs/getting-started"))
        add(Interests(drawable = Res.Drawable.KOBWEB, title = "Kobweb", link = "https://kobweb.varabyte.com/docs/getting-started/what-is-kobweb"))
        add(Interests(drawable = Res.Drawable.KTOR, title = "Ktor", link = "https://ktor.io/docs/server-create-a-new-project.html"))
        add(Interests(drawable = Res.Drawable.SWIFTUI, title = "SwiftUI", link = "https://www.swift.org/getting-started/swiftui/"))
        add(Interests(drawable = Res.Drawable.SPRING_BOOT, title = "Spring Boot using Kotlin", link = "https://spring.io/guides/tutorials/spring-boot-kotlin"))
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
                keyDuties = listOf(
                    "  Developed and maintained mobile applications based on cinema ticket booking system in real time using the dedicated middleware backend system called INJIN.",
                    "  Had done various code reviews and helped others to achieve the standard coding practices.",
                    "  Had worked in multiple cinema ticketing applications based on various countries."
                ),
                projects = listOf(
                    Experience.Projects(
                        name = "AMC Cinemas KSA",
                        description = listOf(
                            "  AMC Cinemas is a mobile application used to book movie tickets for enjoying movies in their cinemas sites across various locations in Saudi Arabia.",
                            "  A user can select preferred seat in preferred theatre and pay for the ticket through application.",
                            "  A user can use points from tickets purchased through loyalty program."
                        ),
                        link = "https://play.google.com/store/apps/details?id=com.amc.cinemas.ksa&hl=en_IN"
                    ),
                    Experience.Projects(
                        name = "CMX Cinemas",
                        description = listOf(
                            "  CMX Cinemas is a mobile application used to book movie tickets for enjoying movies in their cinemas sites across various locations in USA.",
                            "  A user can select preferred seat in preferred theatre and pay for the ticket through application."
                        ),
                        link = "https://play.google.com/store/apps/details?id=com.influx.cinema.cmx&hl=en_IN"
                    ),
                    Experience.Projects(
                        name = "Elevate Entertainment",
                        description = listOf(
                            "  Elevate Entertainment is a mobile application used to book movie tickets for enjoying movies in EVO cinemas' sites across various locations in USA.",
                            "  A user can select preferred seat in preferred theatre and pay for the ticket through application."
                        ),
                        link = "https://play.google.com/store/apps/details?id=com.influx.cinema.evo&hl=en_IN"
                    )
                )
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
                keyDuties = listOf(
                    "  Developed and maintained several mobile applications using the latest technologies of Android development and coding done using Kotlin.",
                    "  Had worked on different types of scenarios and business ideas.",
                    "  Had worked on more than 20 Android projects for this company."
                ),
                projects = listOf(
                    Experience.Projects(
                        name = "Star ATOM",
                        description = listOf(
                            "  Star ATOM is a mobile application for the agents of the Star Health Insurance Private Limited across India.",
                            "  A user can add prospects, create appointments, check the renewals of the customers and can calculate the premium amount for a selected product and share it with the customer."
                        ),
                        link = null
                    ),
                    Experience.Projects(
                        name = "QuikWORK",
                        description = listOf(
                            "  QuikWORK is a mobile application used by candidates for seeking job roles based in different sectors predominantly in UAE",
                            "  A candidate can post their images and video showcasing their talents which can fetch them the suitable job."
                        ),
                        link = null
                    )
                )
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
                keyDuties = listOf(
                    "  Started career as junior Android developer, worked for 6 months as junior developer.",
                    "  Developed and maintained several mobile applications using then latest technologies of Android development and coding done using Java, mostly product type applications inspired from Uber and Airbnb.",
                    "  Developed and maintained mobile application for US based client using then latest technologies of Android development and coding done using Java, inspired from Instagram and Twitter."
                ),
                projects = listOf(
                    Experience.Projects(
                        name = "Hotfuse",
                        description = listOf(
                            "  Hotfuse is a social application which allows the user to connect with the people in the outer world by sharing the " +
                                    "photos and videos and allows them to like, comment and share the posts from the people they follow and allows them " +
                                    "to chat with them and make calls on payment basis."
                        ),
                        link = null
                    )
                )
            )
        )
    }

    fun getCertificates() = ArrayList<Certificates>().apply {
        add(
            Certificates(
                name = "Build a Website from Scratch with Kotlin and Jetpack Compose",
                issueDate = "Issued Mar 2025",
                certificateLogo = Res.Drawable.UDEMY,
                link = "https://www.udemy.com/certificate/UC-aa6a285a-aa7c-443a-a532-638585b8bfb7/"
            )
        )
        add(
            Certificates(
                name = "Flutter & Dart - The Complete Guide [2025 Edition]",
                issueDate = "Issued Feb 2025",
                certificateLogo = Res.Drawable.UDEMY,
                link = "https://www.udemy.com/certificate/UC-beeba971-0e37-4bbb-a2fd-13c7fc3bddfb/"
            )
        )
    }

}