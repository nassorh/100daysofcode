#Double Ended Queue 
class doubleEndedQueue():
    """
    Input: N/A
    Ouput: N/A
    """
    def __init__(self):
        self.queue =[]
        self.front = None
        self.rear = None

    """
    Input: data to add to rear
    Ouput: N/A
    """
    def pushBack(self,d):
        if self.size() == 0:
            self.queue.append(d)
            self.front = d
            self.rear = d
        else:
            self.rear = d
            self.queue.append(d)

    """
    Input: data to add to front 
    Ouput: N/A
    """
    def pushFront(self,d):
        if self.size() == 0:
            self.queue.append(d)
            self.front = d
            self.rear = d
        else:
            self.front = d
            self.queue.insert(0,d)

    """
    Input: N/A
    Ouput: returns data that stored in the back of queue and pops 
    """
    def popBack(self):
        self.rear = self.queue[-2]
        return self.queue.pop()

    """
    Input: N/A
    Ouput: returns data that stored in the front and pops 
    """
    def popFront(self):
        front = self.queue[0]
        self.queue = self.queue[1:]
        self.front = self.queue[0]
        return front

    """
    Input: N/A
    Ouput: returns data that stored in the back of queue 
    """
    def getBack(self):
        return self.rear

    """
    Input: N/A
    Ouput: returns data that stored in the front 
    """
    def getFront(self):
        return self.front

    """
    Input: N/A
    Ouput: Returns the count (int)
    """
    def size(self):
        return len(self.queue)

    """
    Input: N/A
    Ouput: prints the linked list in an array and returns the arrayo
    """
    def toString(self):
        print(self.queue)

"""
Test Plan
#INIT
Q = doubleEndedQueue()

print("Empty size test")
print(Q.size())

print("\nPush Back Single test")
Q.pushBack(10)
print("Front",Q.front)
print("Rear",Q.rear)

print("\nPush Front test")
for x in range(5):
    Q.pushFront(x)
Q.toString()
print("Front",Q.front)
print("Rear",Q.rear)

print("\nPop Back test")
print("Pop",Q.popBack())
print("Current rear",Q.rear)
Q.toString()

print("\nPop Front test")
print("Pop",Q.popFront())
print("Front",Q.front)
Q.toString()

print("\nGet Front test")
Q.toString()
print(Q.getFront())

print("\nGet Back test")
Q.toString()
print(Q.getBack())

print("\nSize Test")
Q.toString()
print(Q.size())
"""
