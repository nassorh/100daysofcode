//	Modifiers 

//Complied time constant
const val ERROR = "An error has occured." //This improves the efficiency because it doesnt need to be recreated

//Visibility modifier for when its needed to be used in module of the program that it is written in
//This is safer than the public modifer
internal const val Error = "An error has occured"

//Constant values that have specific places to use
private const val Name = "Hamad"

//Read-only reference (This does not mean that the data cant be change)
//These values might be created in run time
val heightInCM: Double = 182.0
val userName: String = "Bob"

//Arguments to functions in Kotlin are val by defualt
fun doSomething(argument: String){
    argument = "Blah" //The IDE gives an error: Val cannot be ressinged 
}

//Variables
var playerLocationX: Double = 0.0
var playerLocationY: Double = 0.0
