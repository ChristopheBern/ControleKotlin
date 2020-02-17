package com.example.gameapplication.utils

/*suspend fun getImageFromApi(listOfGames: List<Game>) : List<Game>{
    val filter = listOfGames.filter { it.cover != null }
    val size = filter.size
    var counter = 0
    filter.forEach { game ->
        RetrofitHolder.gameService.getGameCover(game.cover!!).also {
            GlobalScope.launch{
                it.await().also {
                    game.coverUrl = "https:${ it.firstOrNull()!!.url!!}"
                }
                counter++
            }
        }
    }
    while(counter < size) {
        delay(150)
    }
    return listOfGames
}*/
