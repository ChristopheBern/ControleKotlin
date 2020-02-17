package com.example.controlekotlincbe.models

class AppModel(
    val nom: String,
    val genre: String,
    val anneeSortie: Int,
    val imageUrl: String
) {
    override fun toString(): String {
        return "AppModel(nom='$nom', genre='$genre', anneeSortie=$anneeSortie)"
    }
}

val listOfApps = listOf(
    AppModel(
        "Fortnite",
        "FPS",
        2018,
        "https://lh3.googleusercontent.com/Yc3-ehYHXE54cbv3uRk7sXNgWFhvvntl7gCEcLgzkaQJ_sPRxmQEiYfUurVgGtPm5BxN"
    ),
    AppModel(
        "Afk Arena",
        "Idler",
        2018,
        "https://www.thewindose.fr/wp-content/uploads/2019/10/afk-arena.png"
    ),
    AppModel(
        "PUBG",
        "FPS",
        2016,
        "https://www.apklinker.com/wp-content/plugins/APKLinker/resize_img.php?u=https://www.apklinker.com/wp-content/uploads/2018/03/PUBGMobile.png&q=9&s=240"
    ),
    AppModel(
        "Candy Crush",
        "Puzzle",
        2000,
        "https://vignette.wikia.nocookie.net/candy-crush-saga/images/c/ce/Candy_Crush_Saga_1.168_icon.png/revision/latest/scale-to-width-down/340?cb=20200123134835"
    ),
    AppModel(
        "Idle Heroes",
        "Idler",
        2015,
        "https://is3-ssl.mzstatic.com/image/thumb/Purple123/v4/38/3b/b7/383bb7ee-1d63-de6d-efea-1570d153af92/AppIcon-0-0-1x_U007emarketing-0-0-0-10-85-220.png/400x400.png"
    ),
    AppModel(
        "Call of Duty",
        "FPS",
        2020,
        "https://d2jcw5q7j4vmo4.cloudfront.net/6lEEhm2WZojAbZ1uqRJb-KEmT24xydDd5I0QjABtlNOeDr9NrNxztXe67AArHUFuqSI=w512"
    )
)