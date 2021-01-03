//Collection of data and instruction which have a name
class AppUser(
	//Class constructor
	//Attributes 
	val name: String,
    val joinData: String,
    val proVersion: Boolean
) {
    //Class body
    fun getFirstInitial(): Char{
        return name[0]
    }
}

//A data class - you should not manipulate data 
data class User(
	val uid: String,
    val name: String
    val url: String = "N/A"
)

//Automatically generated functions that you can override and change
// equals(), hashcode(), toString(), copy()

fun main(args: Array<String>){
    //How to create a class (The layout is just to make it easier to read)
    val aUser = AppUser(
    	"Hamad",
        "Now",
        false
    )
    
    val user = User(
    	"12355",
        "Jeremy"
    )
    
    val otherUser = User(
    	"13141",
        "Bob",
        "selfie.jpg" //Able to overwrite default value
    )
    
    val otherUser2 = User(
    	"13141",
        url = "selfie.jpg" //Writes to url instead of name
    )
}

//Cohesion: The degree to whcih things belong together 