fun main(args: Array<String>){
    ////Arrays
    val namesArray = arrayOf("Hamad","Nassor")
    val firstName = namesArray[0]
    namesArray[0] = "Ali" //Cannnot add or reomve only overwrite
    //Lists
    val cards = mutableListOf("Jack", "Queen", "King")
    cards.add("NewItem")
    cards.remove("Jack")
    cards.clear()
    cards.addAll("Jack","Queen","Ace","King")
    //Maps
    val cardsCount = mapOf("Jack" to 11,"Queen" to 12,"King" to 13)
    val jackCount = cardsCount["Jack"]
    //How to add items
    //First convert into a mutableMap
    val cardsCountMuable = cards.toMutableMap()
    cardsCountMuable["Ace"] = 1
    //Looping
    //For loop of a list
    val names = mutableListOf("Jack", "Queen", "King")
    for (card in cards) {
        println(card)
    }
    //For loop count print numbers 1 through 10 
    for (i in 1..10) {
   		println(i)
	}
    //Loop from 10 to 1
    for (i in 10 downTo 1) {
   		println(i)
	}
    //Loop throuhg a map
    val cardsName = mapOf("Jack" to 11, "Queen" to 12, "King" to 13)
    for ((name, value) in cardsName) {
        println("$name, $value")
    }
    //While loop
    var stillDownloading = true
    while (stillDownloading) {
       println("Downloading…")
	}
}
