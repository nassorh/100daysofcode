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
        #Counts the number of elements in the array
        count = [0] * (max(myList)+1)
        for num in myList:
            count[num] += 1

        #Sort the array
        sortArr = []
        for i in range(len(count)):
            print("I",i,"Count I:",count[i])
            while count[i] != 0:
                print("While")
                print(count[i])
                count[i] -= 1
                sortArr.append(i)

        return sortArr

obj = searchAlgorithms()
array = [2,3,2,7,4,5,8]

print(obj.linearSearch(array,6))
print(obj.linearSearch(array,7))
print(obj.binarySearch(array,6,0,len(array)-1))
print(obj.binarySearch(array,7,0,len(array)-1))
print(obj.countingSort(array))


