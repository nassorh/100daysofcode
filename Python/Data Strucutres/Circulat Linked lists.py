#Circular linked list

class Node():
    """
    Input: the data the node holds and the next node it points to
    If none are given the val is set to none
    Ouput: N/A
    """
    def __init__(self,data=None,nextNode=None):
        self.data = data
        self.nextNode = nextNode

    """
    Input: N/A
    Ouput: the data the nodes holds
    """
    def getData(self):
        return self.data

    """
    Input: N/A
    Ouput: the node class that is points to next
    """
    def getNextNode(self):
        return self.nextNode

    """
    Input: Data the node it wants to be set to 
    Output: returns 0
    """
    def setData(self,d):
        self.data = d
        return 0

    """
    Input: the node class of the next node it points to 
    Ouput: returns 0
    """
    def setNextNode(self,nN):
        self.nextNode = nN
        return 0

class LinkedList():
    """
    Input: N/A
    Output: N/A
    """
    def __init__(self):
        self.head = Node()#Start of the linked list
        self.last = Node()#End of the linked list
        self.head.setNextNode(self.last)
        self.last.setNextNode(self.head)

    """
    Input: Data to insert into the linked list
    Output: returns 0
    """
    def insert(self,d):
        #Create a new node
        newNode = Node(d)
        #Check if the list is empty
        if self.head.data is None:       
            #Insert into the start and end
            self.head = newNode
            self.last = newNode
            #Head and tail will point to the new node
            newNode.setNextNode(self.head)
            return 0
        else:
            """
            Since head the last is the same node this points
            the inserts the data in the end and points the head
            to the next data on the second iteration
            """
            self.last.setNextNode(newNode)
            #New node becomes the tail
            self.last = newNode
            #New node now points to the head to make it circular
            self.last.setNextNode(self.head)
            return 0

    """
    Input: Data to be delted
    Output: 
    """
    def delete(self,d):
        current = self.head
        if self.head is None:
            print("List is empty")
        else:
            if d == current.getData():
                print("This is the data to delete: ",d)                

    """
    Input: N/A
    Output: returns the size of the like list
    """        
    def size(self):
        if self.head.getData() != None:
            count = 1
            current = self.head.getNextNode()
            while current != self.head:
                count += 1
                current = current.getNextNode()
            return count
        else:
            return 0
            

    """
    Input: data
    Output: The node object or raise value error data no in list
    """
    def search(self,d):
        found = False 
        if self.size() == 0:
            raise ValueError("Data not in list")
        else:
            current = self.head.getNextNode()
            while current != self.head:
                if current.getData() == d:
                    found = True
                    return current
                else:
                    current = current.getNextNode()
            if found == False:
                raise ValueError("Data not in list")
    
    """
    Input: N/A
    Output: Prints the linked list in an array and returns it
    """
    def toString(self):
        array = []
        #Define the starting point and prints it
        start = self.head
        array.append(start.getData())
        #Fetches the next node
        current = self.head.getNextNode()
        #Starts the loop, loop breaks when we're back to the start
        while current != start:
            array.append(current.getData())
            current = current.getNextNode()
        print(array)
        return(array)
"""
Test Plan
#Init
List = LinkedList()

print("Empty list test")
print(List.size())

print("Insert Test")
arr = []
for x in range(10):
    List.insert(x)
    arr.append(x)    
print(arr)
List.toString()

print("Size")
print(List.size())

print("Search for 5")
a = List.search(5)
print(a.getData())

print("Search for 100")
a = List.search(100)
print(a.getData())
"""
