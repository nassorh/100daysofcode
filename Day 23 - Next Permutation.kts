import java.util.*


fun swap(array:MutableList<Int>, firstIndex: Int,secondIndex: Int){
    val temp = array[firstIndex]
    array[firstIndex] = array[secondIndex]
    array[secondIndex] = temp
}
fun nextPermuatation(array: MutableList<Int>){
    /*
    //The next permutation is when you find the first decreasing element looping reverse next you find the largest
    element after the first decreasing element and swap them. Then you reverse all the elements after the index of
    the orginal first decreasing element (now the largest element after the first decreasing element is located)
    */

    //Flag is false
    var Flag = false

    //Loop throught the array in reverse
    for (i in array.size -1 downTo 1){
        //If a[i] < a[i-1]
        if (array.get(i-1) < array.get(i)){
            var ReverseIndex = i-1
            break
        }
    }
    //If the flag is false no next premutation break complete
    if (Flag == false){
        return
    }

    //Find the next largest element after the first decreasing element
    var max = ReverseIndex
    val min = ReverseIndex
    var nextLargestElemenet
    for (i in 0..array.size-1){
        if (array.get(i) > array.get(min) && array.get(i) < array.get(max)){
            nextLargestElemenet
        }
    }


    //Swap this
}

fun main() {
    var a = arrayListOf(1,3,4,5,2) //Output 1,3,5,2,4
    nextPermuatation(a)
    println(a)
}

main()