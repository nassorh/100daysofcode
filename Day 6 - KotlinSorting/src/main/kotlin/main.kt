import java.util.*
import kotlin.reflect.typeOf

object Sort {
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
                    swap(array,x,x+1)
                //else move to the next element
                }
            }
        }
        return Arrays.toString(array)
    }

    fun indexOfMinimum(array: Array<Int>, startIndex: Int): Int {
        var minValue = array[startIndex]
        var minIndex = startIndex
        var loopIndex = minIndex + 1
        while(loopIndex < array.size){
            if (array[loopIndex] < minValue){
                minIndex = loopIndex
                minValue = array[loopIndex]
            }
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
                    swap(array,x,x+1)
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
                swap(array,j,j-1)
                //Decrement by one
                j--
            }
        }
        return Arrays.toString(array)
    }

    fun selectionSort(array: Array<Int>){
        for(i in 0 until array.size){
            val index = indexOfMinimum(array,i)
            swap(array,i,index)
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

    //Bubble sort withouht the flag
    val smallStartTimeBBS = System.nanoTime()
    val smallSortedBBS = Sort.bubbleSort(SmallUnsorted)
    val smallTimeBBS = System.nanoTime() - smallStartTimeBBS

    val mediumStartTimeBBS = System.nanoTime()
    val mediumSortedBBS = Sort.bubbleSort(SmallUnsorted)
    val mediumTimeBBS = System.nanoTime() - mediumStartTimeBBS

    val largeStartTimeBBS = System.nanoTime()
    val largeSortedBBS = Sort.bubbleSort(SmallUnsorted)
    val largeTimeBBS = System.nanoTime() - largeStartTimeBBS


    //Bubble sort with the flag
    val smallStartTimeBBSF = System.nanoTime()
    val smallSortedBBSF = Sort.bubbleSort(SmallUnsorted)
    val smallTimeBBSF = System.nanoTime() - smallStartTimeBBSF

    val mediumStartTimeBBSF = System.nanoTime()
    val mediumSortedBBSF = Sort.bubbleSort(SmallUnsorted)
    val mediumTimeBBSF = System.nanoTime() - mediumStartTimeBBSF

    val largeStartTimeBBSF = System.nanoTime()
    val largeSortedBBSF = Sort.bubbleSort(SmallUnsorted)
    val largeTimeBBSF = System.nanoTime() - largeStartTimeBBSF

    //Insertion sort
    val smallStartTimeIS= System.nanoTime()
    val smallSortedIS = Sort.bubbleSort(SmallUnsorted)
    val smallTimeIS = System.nanoTime() - smallStartTimeIS

    val mediumStartTimeIS= System.nanoTime()
    val mediumSortedIS = Sort.bubbleSort(SmallUnsorted)
    val mediumTimeIS = System.nanoTime() - mediumStartTimeIS

    val largeStartTimeIS= System.nanoTime()
    val largeSortedIS = Sort.bubbleSort(SmallUnsorted)
    val largeTimeIS = System.nanoTime() - largeStartTimeIS

    //Selection sort
    val smallStartTimeSS= System.nanoTime()
    val smallSortedSS = Sort.bubbleSort(SmallUnsorted)
    val smallTimeSS = System.nanoTime() - smallStartTimeSS

    val mediumStartTimeSS= System.nanoTime()
    val mediumSortedSS = Sort.bubbleSort(SmallUnsorted)
    val mediumTimeSS = System.nanoTime() - mediumStartTimeSS

    val largeStartTimeSS= System.nanoTime()
    val largeSortedSS = Sort.bubbleSort(SmallUnsorted)
    val largeTimeSS = System.nanoTime() - largeStartTimeSS

    //Time Taken

    //Bubble Sort without the flag
    print("\nBubble Sort without the flag\n")
    println("Sorted Array: $smallSortedBBS Time taken in milliseconds to complete small array without the " +
            "Flag: $smallTimeBBS")
    println("Sorted Array: $mediumSortedBBS Time taken in milliseconds to complete medium array without the " +
            "Flag: $mediumTimeBBS")
    println("Sorted Array: $largeSortedBBS Time taken in milliseconds to complete large array without the " +
            "Flag: $largeTimeBBS\n")

    //Bubble Sort with the flag
    print("Bubble Sort with the flag\n")
    println("Sorted Array: $smallSortedBBSF Time taken in milliseconds to complete small array with the "+
            "Flag: $smallTimeBBSF")
    println("Sorted Array: $mediumSortedBBSF Time taken in milliseconds to complete medium array with the "+
            "Flag: $mediumTimeBBSF")
    println("Sorted Array: $largeSortedBBSF Time taken in milliseconds to complete large array with the "+
            "Flag: $largeTimeBBSF\n")

    //Insertion Sort
    print("Insertion Sort\n")
    println("Sorted Array: $smallSortedIS Time taken in milliseconds to complete small"+
        "array: $smallTimeIS")
    println("Sorted Array: $mediumSortedIS Time taken in milliseconds to complete small"+
            "array: $mediumTimeIS")
    println("Sorted Array: $largeSortedIS Time taken in milliseconds to complete small"+
            "array: $largeTimeIS\n")

    //Selection Sort
    print("Selection Sort\n")
    println("Sorted Array: $smallSortedSS Time taken in milliseconds to complete small array with the Flag: " +
            "$smallStartTimeSS")
    println("Sorted Array: $mediumSortedSS Time taken in milliseconds to complete medium array with the"+
        "Flag: $mediumStartTimeSS")
    println("Sorted Array: $largeSortedSS Time taken in milliseconds to complete medium array with the"+
            "Flag: $largeStartTimeSS\n")

}