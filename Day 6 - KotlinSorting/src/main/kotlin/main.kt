import java.util.*
import kotlin.reflect.typeOf

object Sort {//
    //This is breaking the code
    fun swap(array: Array<Int>, firstIndex: Int, secondIndex: Int){
        val temp = array[firstIndex]
        array[firstIndex] = array[secondIndex]
        array[secondIndex] = temp
    }

    fun bubbleSort(array: Array<Int>): String {
        //Loop through the array
        for (i in 0 until array.size) {
            //Loop through array size - 1 this is to compare adjacent items
            for (x in 0 until array.size-1) {
                //Compare the first and second element
                //If the first element is greater than the second element
                if (array[x] > array[x+1]) {
                    //swap themo
                    val temp = array[x]
                    array[x] = array[x+1]
                    array[x+1] = temp
                //else move to the next element
                }
            }
        }
        return Arrays.toString(array)
    }

    //Selection Sort
    fun indexOfMinimum(array: Array<Int>, startIndex: Int): Int {
        var minValue = array[startIndex]
        var minIndex = startIndex
        var loopIndex = minIndex + 1
        while(loopIndex < array.size){
            if (array[loopIndex] < minValue){
                minIndex = loopIndex
                minValue = array[loopIndex]
            }
            loopIndex++
        }
        return minIndex
    }

    fun bubbleSortFlag(array: Array<Int>):String {
        print("New\n")
        //Loop through array while swapping is true
        do{
            var flag = false
            //Loop through array size -1
            for (x in 0 until array.size-1){
                //Compare the first and second element
                //If the first element is greater than the second element
                    println("Loop count $x\n")
                if(array[x] > array[x+1]){
                    print("Swap\n")
                    //swap them and set swapping to true
                    val temp = array[x]
                    array[x] = array[x+1]
                    array[x+1] = temp
                    flag = true
                    val a = Arrays.toString(array)
                    println("$a\n")
                }
                //else move to the next element
            }
        }while(flag)
        return Arrays.toString(array)
    }
    fun insertionSort (array: Array<Int>):String {
        //Loop through the array
        for (i in 0 until array.size){
            var j = i
            val a = Arrays.toString(array)
            //Compare current position with elements to left if the left element is bigger than the current
            while(j>0 && array[j-1] > array[j]){
                //Swap them
                val temp = array[j-1]
                array[j-1] = array[j]
                array[j] = temp
                j--
            }
        }
        return Arrays.toString(array)
    }

    fun selectionSort(array: Array<Int>): String {
        for(i in 0 until array.size){
            val index = indexOfMinimum(array,i)
            val temp = array[i]
            array[i] = array[index]
            array[index] = temp
        }
        return Arrays.toString(array)
    }

    //Quick Sort
    fun quickSort(array: Array<Int>){
        qs(array,0,array.size-1)
    }

    fun qs(array: Array<Int>,left: Int,right: Int){
        if (left>=right){
            return
        }
        val pivotIndex = partition(array,left,right)
        qs(array,left,pivotIndex-1)
        qs(array,pivotIndex+1,right)
    }

    fun partition(array: Array<Int>,left: Int,right: Int):Int{
        val pivot = array[right]
        var i = left - 1
        var loop = left
        while(loop<right){
            if (array[loop] < pivot){
                i++
                val temp = array[i]
                array[i] = array[loop]
                array[loop] = temp

            }//
            loop++
        }
        val temp = array[i+1]
        array[i+1] = array[right]
        array[right] = temp
        return i+1
    }

    fun
}

fun main(args: Array<String>) {
    //Unsorted Array
    val SmallUnsorted = arrayOf(1,2,7,2,9,3,7,8)
    val MediumUnsorted = arrayOf(1,4,5,6,1,2,7,3,6,4,9,0)
    val LargeUnsorted = arrayOf(1,4,5,6,1,2,3,7,8,2,3,5,1,2,7,3,6,4,9,0,5,6,1,2,3,7)
    println(String.format("Unsorted Small Array: %s",Arrays.toString(SmallUnsorted)))
    println(String.format("Unsorted Medium Array: %s",Arrays.toString(MediumUnsorted)))
    println(String.format("Unsorted Large Array: %s",Arrays.toString(LargeUnsorted)))

    /*
    //Bubble sort withouht the flag
    Sort.bubbleSort(SmallUnsorted)
    Sort.bubbleSort(MediumUnsorted)
    Sort.bubbleSort(LargeUnsorted)


    //Bubble sort with the flag
    Sort.bubbleSortFlag(SmallUnsorted)
    Sort.bubbleSortFlag(MediumUnsorted)
    Sort.bubbleSortFlag(LargeUnsorted)



    //Insertion sort
    Sort.insertionSort(SmallUnsorted)
    Sort.insertionSort(MediumUnsorted)
    Sort.insertionSort(LargeUnsorted)


    //Selection sort
    Sort.selectionSort(SmallUnsorted)
    Sort.selectionSort(MediumUnsorted)
    Sort.selectionSort(LargeUnsorted)


    //Quick Sort
    Sort.quickSort(SmallUnsorted)
    Sort.quickSort(MediumUnsorted)
    Sort.quickSort(LargeUnsorted)
    */


    println(String.format("Sorted Small Array: %s",Arrays.toString(SmallUnsorted)))
    println(String.format("Sorted Small Array: %s",Arrays.toString(MediumUnsorted)))
    println(String.format("Sorted Small Array: %s",Arrays.toString(LargeUnsorted)))




}