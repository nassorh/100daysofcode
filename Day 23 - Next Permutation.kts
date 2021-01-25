import java.util.*

//The next permutation is when you find the first decreasing element looping reverse you then swap this for the next
//Largest element after the first decreasing element and swap them. Then you reverse all the elements after the
//Index of the orginal first decreasing element (now the largest element after the first decreasing element is located)

//Flag is false
//Loop throught the array in reverse
    //If a[i] < a[i-1] swap and flag is true
//If the flag is false no next premutation break complete

//Find the next largest element after the first decreasing element
//Swap this

fun nextPermuatation(array: MutableList<Int>){
    array.add(4)
}

fun main() {
    var a = arrayListOf(1,2,3)
    nextPermuatation(a)
    println(a)
    val test: Short = 10
    println(test)
}

main()