
//mimic an interaction between different compnents of an program 
fun requestData(){
    val result = InputOutputDevice.getData()
    
    when (result){
        is Result.Loading -> UserInterface.showLoadingScreen()
        //is Result.Success -> UserInterface.showData(result.value)
        is Result.Error -> UserInterface.showErrorMessage()
    }
}
//Result Wrapper (Either Monad)
sealed class Result {
    
    //For events, we create a class or object. Object work when we dont need any data
    object Loading: Result()
    object Error: Result()
    data class Success(val value: String): Result()
}

object InputOutputDevice{
    fun getData(): Result{
        //returns the sealed class
        return Result.Success("Oh yeah")
    }
}

object UserInterface{
    fun showLoadingScreen(){
        
    }
    
    fun showData(){
        
    }
    
    fun showErrorMessage(){
        
    }
    
}
//--------------------------------------------------------------------------------------------------
//Enum class
enum class MathematicalOperator(val op: Char){
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
}

//Function Type
fun checkOperator(op: MathematicalOperator): (Double, Double) -> Double{
    return when (op){
        //lambda expression (ARGUMENTS - > body of the lambda expression)
        MathematicalOperator.PLUS -> {x,y -> x + y}
        MathematicalOperator.MINUS -> {x,y -> x - y}
        MathematicalOperator.MULTIPLY -> {x,y -> x * y}
        MathematicalOperator.DIVIDE -> {x,y -> x / y}
    }
}

fun main(args: Array<String>){
    val mathFunction = checkOperator(MathematicalOperator.DIVIDE)
    
    println(
    	mathFunction.invoke(4.0,4.0)
    )
}