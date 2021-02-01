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
        self.capacity -= 1 
    
    def isEmpty(self):
        pass

    def peek(self):
        pass

    def toString(self):
        pass
