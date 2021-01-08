import java.util.*
import kotlin.reflect.typeOf

object Sort {
    fun bubbleSort(array: Array<Int>): String {
        //Loop through the array
        for (i in 0 until array.size) {
            //Loop through array size - 1 this is to compare adjacent items
            for (x in 0 until array.size-1) {
                //Compare the first and second element
                //If the first element is greater than the second element
                if (array[x] > array[x+1]) {
                    //swap them
                    val temp = array[x]
                    array[x] = array[x + 1]
                    array[x + 1] = temp
                //else move to the next element
                }
            }
        }
        return Arrays.toString(array)
    }

    fun bubbleSortFlag(array: Array<Int>):String {
        var flag = false
        var time = 0.0
        //Loop through array while swapping is true
        do{
            //Loop through array size -1
            for (x in 0 until array.size-1){
                //Compare the first and second element
                //If the first element is greater than the second element
                if(array[x] > array[x+1]){
                    //swap them and set swapping to true
                    val temp = array[x]
                    array[x] = array[x + 1]
                    array[x + 1] = temp
                    flag = true
                }
                //else move to the next element
            }

        }while(flag)
        return Arrays.toString(array)
    }
    fun insertionSort (array: Array<Int>):String {
        for (i in 0 until array.size){
            var j = i
            while(j>0 && array[j-1] > array[j]){
                var key = array[j]
                array[j] = array[j-1]
                array[j-1] = key
                j--
            }
        }
        return Arrays.toString(array)
    }
}
fun main(args: Array<String>) {
    //Unsorted Array
    val unSorted = arrayOf(1,4,5,6,1,2)
    println(String.format("Bubble Sort Without the Flag\nUnsorted Array: %s",Arrays.toString(unSorted)))

    //Bubble sort withouht the flag
    val startTimeBBS = System.nanoTime()
    val sortedBBS = Sort.bubbleSort(unSorted)
    val totalTimeBBS = System.nanoTime() - startTimeBBS

    //Bubble sort with the flag
    val startTimeBBSF = System.nanoTime()
    val sortedBBSF = Sort.bubbleSort(unSorted)
    val totalTimeBBSF = System.nanoTime() - startTimeBBSF

    //Insertion sort with the flag
    val startTimeIS= System.nanoTime()
    val sortedIS = Sort.bubbleSort(unSorted)
    val totalTimeIS = System.nanoTime() - startTimeIS

    //Time Taken
    println("Sorted Array: $sortedBBS Time taken in milliseconds to complete Bubble Sort without the " +
            "Flag: $totalTimeBBS")
    println("Sorted Array: $sortedBBSF Time taken in milliseconds to complete Bubble Sort with the "+
            "Flag: $totalTimeBBSF")
    println("Sorted Array: $sortedIS Time taken in milliseconds to complete Insertion Sort with the Flag: $startTimeIS")
}