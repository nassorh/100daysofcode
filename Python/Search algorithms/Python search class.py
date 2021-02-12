class searchAlgorithms():

    def linearSearch(self,array,target):
        for index in range(len(array)):
            if array[index] == target:
                return index
        return None

    def binarySearch(self,array,target,start,end):
        if start > end:
            return None
        #Compare to the middle
        mid = (start+end)//2
        #If equal return middle index#
        if target == array[mid]:
            return mid
        #Else compare the size with the middle
        if target < array[mid]:
            #If its greater then only focus on the second half
            return self.binarySearch(array,target,start,mid-1)
        if target > array[mid]:
            #Else focus on the first half
            return self.binarySearch(array,target,mid+1,end)

    def jumpSearch(self):
        #pass
        pass

    def countingSort(self,myList):
        """
        Takes the largest number in the array and uses it as the array size
        to create the array
        """
        count = [0] * (max(myList)+1)
        print("Count",count)
        """
        #Loops throught the unsorted array counts the
        amount of times a number appears
        """
        for num in myList:
            print("num",num)
            count[num] += 1
            print("Count",count)

        #Sorted array
        sortArr = []
        print("Sorted Array",sortArr)
        #Loops through the count array
        for i in range(len(count)):
            print("I",i)
            #While the count is larger than zero 
            while count[i] != 0:
                #Decrease the count by 1
                count[i] -= 1
                print("Count",count)
                #it appends to the sorted array
                sortArr.append(i)
                print("Sorted Array",sortArr)
                 
        #Returns the sorted array
        return sortArr

obj = searchAlgorithms()
array = [2,3,2,7,4,5,8]

print(obj.linearSearch(array,6))
print(obj.linearSearch(array,7))
print(obj.binarySearch(array,6,0,len(array)-1))
print(obj.binarySearch(array,7,0,len(array)-1))
print(obj.countingSort(array))


