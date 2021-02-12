#Node class
class Node():
    """
    Input: the data the node holds and the next node it points to
    If none are given the val is set to none
    Ouput: N/A
    """
    def __init__(self,data=None,next_node=None):
        self.data = data
        self.next_node =next_node

    """
    Input: N/A
    Ouput: the data the nodes holds
    """
    def get_data(self):
        return self.data

    """
    Input: N/A
    Ouput: the node class that is points to next
    """
    def get_next(self):
        return self.next_node

    """
    Input: the node class of the next node it points to 
    Ouput: N/A 
    """
    def set_next(self,new_next):
        self.next_node = new_next
        
#Linked List
class LinkedList():
    
    """
    Input: The starting node of the list (Do not mainly input this) 
    Ouput: N/A
    """
    def __init__(self,head=None):
        self.head = head

    """
    Input: The data that wants to be inserted at the start of the linked list
    Ouput: N/A
    """
    def insert(self,data):
        #Creats a new node and inserts the data
        new_node=Node(data)
        #Inserts it at the beginning 
        new_node.set_next(self.head)
        #Updates the list pointer to the start of the code 
        self.head = new_node
        
    """
    Input: N/A
    Ouput: Returns the count (int)
    """
    def size(self):
        #Starts at the start of the linked lis
        current = self.head
        #INIT count
        count = 0
        #Loops through the list, None breaks the while loop
        while current:
            #Increments the count
            count += 1
            #Fetches the next data
            current = current.get_next()
        
        return count

    """
    Input: The data that your searching for in the linked list
    Ouput: The node class of the data found or None
    """
    def search(self,data):
        current = self.head
        found = False
        while current and found == False:
            if current.get_data() == data:
                found = True
            else:
                current = current.get_next()
        if current is None:
            raise ValueError("Data not in list")
        else:
            print("Found")
        return current

    """
    Input: The data that your looking to delete
    Ouput: ValueError if the data is not found or 0 to show the data has been
    deleted
    """
    def delete(self,data):
        current = self.head
        previous = None
        found = False
        while current and found == False:
            if current.get_data() == data:
                found = True
            else:
                previous = current
                current = current.get_next()
        if current is None:
            raise ValueError("Data not in list")
        if previous is None:
            self.head=current.get_next()
        else:
            previous.set_next(current.get_next())
        return 0

    """
    Input: N/A
    Ouput: prints the linked list in an array and returns the arrayo
    """
    def toString(self):
        array = []
        current = self.head
        while current:
            array.append(current.get_data())
            current = current.get_next()
        print(array)
        return(array)
            
"""
Test Plan
print("List init")
List = LinkedList()
arr = []
for x in range(10):
    arr.append(x)
    List.insert(x)
print("\nArray of data inserted\n{}".format(arr))
print("Linked List")
List.toString()

print("\nInserting 12...")
List.insert(12)
List.toString()

print("\nPrinting Size...")
List.size()
List.toString()

print("\nSearching for 12...")
data = List.search(12)
print("Data found is:",data.get_data())

print("\nDeleting 5...")
List.delete(5)
List.toString()
"""
