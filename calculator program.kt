/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */


//Simple Calculator Program 

//Constants
val ADD = "+"
val SUBTRACT = "-"
val MULTIPLY = "*"
val DIVIDE = "-"
val ERROR = "An error has occured."

// Test Plan
val test1 = 5.0
val test2 = 4.0

fun main(args: Array<String>){
    val operatorSymbol = args[0]
    start(operatorSymbol)
}

fun start(operatorSymbol: String){
    if (checkArugments(operatorSymbol)){
        distplayResult ( evaluateBinomail(test1,test2,operatorSymbol) )
    }else{
        distplayResult( ERROR )
    }
}



//Return boolean value based on if the opertor mathches our constants 
fun checkArugments(opertorSymbol: String): Boolean{
    return when (opertorSymbol){
        //equals
        ADD -> true
        SUBTRACT -> true
        MULTIPLY -> true
        DIVIDE -> true
        //Otherwise
        else -> false 
    }
}

//Carrys out the operation
fun evaluateBinomail(opOne: Double, opTwo: Double, sym: String): String{
    return when (sym){
        //equals
        ADD -> (opOne + opTwo).toString()
        SUBTRACT -> (opOne - opTwo).toString()
        MULTIPLY -> (opOne * opTwo).toString()
        DIVIDE -> (opOne / opTwo).toString()
        //Otherwise
        else ->  ERROR
	}
}

//Display the restult
fun distplayResult(result: String) = System.out.println(result)



