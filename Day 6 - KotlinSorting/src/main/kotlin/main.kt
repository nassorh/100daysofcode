import java.util.*
import kotlin.reflect.typeOf

object Sort {
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
                    //swap them
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
                    array[x] = array[x+1]
                    array[x+1] = temp
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
            //Compare current position with elements to left if the left element is bigger than the current
            while(j>0 && array[j-1] > array[j]){
                //Swap them
                val temp = array[j]
                array[j] = array[j+1]
                array[j+1] = temp
                //Decrement by one
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
    fun parition (array:Array<Int>,startIndex: Int,endIndex: Int){
    }

    fun quickSort(array:Array<Int>,startIndex: Int,endIndex: Int): String {
        if (startIndex>endIndex){
            return Arrays.toString(array)
        }else{
            val pivotIndex = parition(array,startIndex,endIndex-1)
            quickSort(array,startIndex,pivotIndex-1)
            quickSort(array,pivotIndex+1,endIndex)
            return Arrays.toString(array)
        }
    }
}

fun main(args: Array<String>) {
    //Unsorted Array
    //val SmallUnsorted = arrayOf(1,4,5,6,1,2)
    val SmallUnsorted = arrayOf(1,2,7,2,3,7,8)
    val MediumUnsorted = arrayOf(1,4,5,6,1,2,7,3,6,4,9,0)
    val LargeUnsorted = arrayOf(1,4,5,6,1,2,3,7,8,2,3,5,1,2,7,3,6,4,9,0,5,6,1,2,3,7)
    println(String.format("Unsorted Small Array: %s",Arrays.toString(SmallUnsorted)))
    println(String.format("Unsorted Medium Array: %s",Arrays.toString(MediumUnsorted)))
    println(String.format("Unsorted Large Array: %s",Arrays.toString(LargeUnsorted)))

    /*
    //Bubble sort withouht the flag
    val smallStartTimeBBS = System.nanoTime()
    val smallSortedBBS = Sort.bubbleSort(SmallUnsorted)
    val smallTimeBBS = System.nanoTime() - smallStartTimeBBS

    val mediumStartTimeBBS = System.nanoTime()
    val mediumSortedBBS = Sort.bubbleSort(MediumUnsorted)
    val mediumTimeBBS = System.nanoTime() - mediumStartTimeBBS

    val largeStartTimeBBS = System.nanoTime()
    val largeSortedBBS = Sort.bubbleSort(LargeUnsorted)
    val largeTimeBBS = System.nanoTime() - largeStartTimeBBS

    //Bubble Sort without the flag
    println("\nBubble Sort without the flag\n")
    println("Sorted Array: $smallSortedBBS Time taken in milliseconds to complete small array without the " +
            "Flag: $smallTimeBBS")
    println("Sorted Array: $mediumSortedBBS Time taken in milliseconds to complete medium array without the " +
            "Flag: $mediumTimeBBS")
    println("Sorted Array: $largeSortedBBS Time taken in milliseconds to complete large array without the " +
            "Flag: $largeTimeBBS\n")

    //Bubble sort with the flag
    val smallStartTimeBBSF = System.nanoTime()
    val smallSortedBBSF = Sort.bubbleSortFlag(SmallUnsorted)
    val smallTimeBBSF = System.nanoTime() - smallStartTimeBBSF

    val mediumStartTimeBBSF = System.nanoTime()
    val mediumSortedBBSF = Sort.bubbleSortFlag(MediumUnsorted)
    val mediumTimeBBSF = System.nanoTime() - mediumStartTimeBBSF

    val largeStartTimeBBSF = System.nanoTime()
    val largeSortedBBSF = Sort.bubbleSortFlag(LargeUnsorted)
    val largeTimeBBSF = System.nanoTime() - largeStartTimeBBSF

    //Bubble Sort with the flag
    println("Bubble Sort with the flag\n")
    println("Sorted Array: $smallSortedBBSF Time taken in milliseconds to complete small array with the "+
            "Flag: $smallTimeBBSF")
    println("Sorted Array: $mediumSortedBBSF Time taken in milliseconds to complete medium array with the "+
            "Flag: $mediumTimeBBSF")
    println("Sorted Array: $largeSortedBBSF Time taken in milliseconds to complete large array with the "+
            "Flag: $largeTimeBBSF\n")

    //Insertion sort
    val smallStartTimeIS= System.nanoTime()
    val smallSortedIS = Sort.insertionSort(SmallUnsorted)
    val smallTimeIS = System.nanoTime() - smallStartTimeIS

    val mediumStartTimeIS= System.nanoTime()
    val mediumSortedIS = Sort.insertionSort(MediumUnsorted)
    val mediumTimeIS = System.nanoTime() - mediumStartTimeIS

    val largeStartTimeIS= System.nanoTime()
    val largeSortedIS = Sort.insertionSort(LargeUnsorted)
    val largeTimeIS = System.nanoTime() - largeStartTimeIS

    //Insertion Sort
    println("Insertion Sort\n")
    println("Sorted Array: $smallSortedIS Time taken in milliseconds to complete small"+
            "array: $smallTimeIS")
    println("Sorted Array: $mediumSortedIS Time taken in milliseconds to complete small"+
            "array: $mediumTimeIS")
    println("Sorted Array: $largeSortedIS Time taken in milliseconds to complete small"+
            "array: $largeTimeIS\n")

    //Selection sort
    val smallStartTimeSS= System.nanoTime()
    val smallSortedSS = Sort.selectionSort(SmallUnsorted)
    val smallTimeSS = System.nanoTime() - smallStartTimeSS

    val mediumStartTimeSS= System.nanoTime()
    val mediumSortedSS = Sort.selectionSort(MediumUnsorted)
    val mediumTimeSS = System.nanoTime() - mediumStartTimeSS

    val largeStartTimeSS= System.nanoTime()
    val largeSortedSS = Sort.selectionSort(LargeUnsorted)
    val largeTimeSS = System.nanoTime() - largeStartTimeSS

    //Selection Sort
    println("Selection Sort\n")
    println("Sorted Array: $smallSortedSS Time taken in milliseconds to complete small array with the Flag: " +
            "$smallTimeSS")
    println("Sorted Array: $mediumSortedSS Time taken in milliseconds to complete medium array with the"+
            "Flag: $mediumTimeSS")
    println("Sorted Array: $largeSortedSS Time taken in milliseconds to complete medium array with the"+
            "Flag: $largeTimeSS\n")
    */
    //Quick Sort
    val smallQS = System.nanoTime()
    val smallSortedQS = Sort.quickSort(SmallUnsorted,0,SmallUnsorted.size)
    val smallTimeQS = System.nanoTime() - smallQS

    val mediumQS = System.nanoTime()
    val mediumSortedQS = Sort.quickSort(MediumUnsorted,0,MediumUnsorted.size)
    val mediumTimeQS = System.nanoTime() - mediumQS

    val largeQS = System.nanoTime()
    val largeSortedQS = Sort.quickSort(LargeUnsorted,0,SmallUnsorted.size)
    val largeTimeQS = System.nanoTime() - largeQS

    //Quick Sort
    println("Quick Sort\n")
    println("Sorted Array: $smallSortedQS Time taken in milliseconds to complete small array with the Flag: " +
            "$smallTimeQS")
    println("Sorted Array: $mediumSortedQS Time taken in milliseconds to complete medium array with the"+
            "Flag: $mediumTimeQS")
    println("Sorted Array: $largeSortedQS Time taken in milliseconds to complete medium array with the"+
            "Flag: $largeTimeQS\n")








}