import java.util.*
import kotlin.reflect.typeOf

object Sort {
    fun swap(array: Array<Int>, firstIndex: Int, secondIndex: Int){
        val temp = array[firstIndex]
        array[firstIndex] = array[secondIndex]
        array[secondIndex] = temp
    }

    fun bubbleSort(array: Array<Int>) {
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
                if(array[x] > array[x+1]){
                    //swap them and set swapping to true
                    val temp = array[x]
                    array[x] = array[x+1]
                    array[x+1] = temp
                    flag = true
                    val a = Arrays.toString(array)
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

    fun merge(list: List<Int>,left_index: Int,right_index: Int,middle: Int){
        //Split into left and right array
        val left_copy = list.subList(left_index,middle)
        val right_copy = list.subList(middle+1,right_index)

        //Pointers
        var left_copy_index = 0
        var right_copy_index = 0
        var sorted_index = left_index //Pointer for the original list

        //Loop through both arrays
        val leftCopy = left_copy.size
        val rightCopy = right_copy.size
        while(left_copy_index<left_copy.size && right_copy_index<right_copy.size){
            //Compare the left side to the right
            if (left_copy[left_copy_index] <= right_copy[right_copy_index]){
                //If the left value is less than right add it to the sorted list
                list.toMutableList().add(sorted_index,left_copy[left_copy_index])
                left_copy_index ++
            }else{
                //If the left value is right than left add it to the sorted list
                list.toMutableList().add(sorted_index,right_copy[right_copy_index])
                right_copy_index ++
            }
            sorted_index ++
        }
        //We ran out of elements either in the left or right not both
        //Therefore add all the remaining elements and add them to the list
        val size1 = list.size
        while (left_copy_index < left_copy.size){
            list.toMutableList().add(sorted_index,left_copy[left_copy_index])
            left_copy_index ++
            sorted_index ++
        }

        while (right_copy_index < right_copy.size){
            list.toMutableList().add(sorted_index,right_copy[right_copy_index])
            right_copy_index ++
            sorted_index ++
        }
    }



    fun mS(list: List<Int>,left_index: Int, right_index: Int){
        if (left_index >= right_index){
            return
        }
        var middle = (left_index+right_index)/ 2 //Middle/
        mS(list,left_index,middle)
        mS(list,middle+1,right_index)
        merge(list,left_index,right_index,middle)
    }

    fun mergeSort(list: List<Int>){
        mS(list,0,list.size-1)
    }
}

fun main(args: Array<String>) {
    //Unsorted Array
    val SmallUnsorted = arrayOf(1,2,7,2,9,3,7,8)
    println(String.format("Unsorted Small Array: %s",Arrays.toString(SmallUnsorted)))
    Sort.bubbleSort(SmallUnsorted)
    println(String.format("Sorted Small Array: %s",Arrays.toString(SmallUnsorted)))


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

    //Merge Sort
    Sort.mergeSort(listOf(*SmallUnsorted))
    Sort.mergeSort(listOf(*MediumUnsorted))
    Sort.mergeSort(listOf(*LargeUnsorted))


    println(String.format("Sorted Small Array: %s",Arrays.toString(SmallUnsorted)))
    println(String.format("Sorted Small Array: %s",Arrays.toString(MediumUnsorted)))
    println(String.format("Sorted Small Array: %s",Arrays.toString(LargeUnsorted)))




}