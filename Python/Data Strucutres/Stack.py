#Stack
class Stack():
    def __init__(self,size):
        self.stack = list()
        self.top = -1
        self.maxSize = size
        self.capacity = 0

    def push(self,element):
        if self.capacity < self.maxSize:
            self.stack.append(element)
            self.top = element
            self.capacity += 1
            return 0
        else:
            return -1
    
    def pop(self):
        if self.capacity != 0:
            self.capacity -= 1
            return self.stack.pop()
        else:
            return -1
    
    def isEmpty(self):
        if self.capacity != 0:
            return False
        else:
            return True

    def peek(self):
        return self.stack[-1]

    def toString(self):
        print(self.stack)

#Init
stack = Stack(10)

#Attributes test
print(stack.top)
print(stack.maxSize)
print(stack.capacity)

#Empty test
print(stack.isEmpty())

#Push test/toString test
for x in range(10):
    stack.push(x)
stack.toString()

#Empty test
print(stack.isEmpty())

#Peek test
print(stack.peek())

#Pop test
print(stack.pop())
stack.toString()
