class Stack():
    def __init__(self):
        self.stack = list()

    def push(self,element):
        self.stack.append(element)
        self.top = element
        return 0
    
    def pop(self):
        if len(self.stack) != 0:
            return self.stack.pop()
        else:
            return -1

    def isEmpty(self):
        if len(self.stack) != 0:
            return False
        else:
            return True
        
    def size(self):
        return len(self.stack)
    
class Queue():
    def __init__(self):
        self.pushStack = Stack()
        self.popStack = Stack()

    def enqueue(self,data):
        self.pushStack.push(data)

    def dequeue(self):
        if self.popStack.isEmpty():
            while self.pushStack.size() > 0:
                self.popStack.push(self.pushStack.pop())
        return self.popStack.pop()

#INIT
q = Queue()

#enqueue/toString test
arr = []
for x in range(10):
    q.enqueue(x)
    arr.append(x)
print(arr)      

#dequeue
print(q.dequeue())
