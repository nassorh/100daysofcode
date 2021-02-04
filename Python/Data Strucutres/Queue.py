#Queues

class Queue():
    def __init__(self):
        self.queue =[]

    def enqueue(self,x):
        self.queue.insert(0,x)

    def dequeue(self):
        if len(self.queue) == 0:
            return -1
        else:
            return self.queue.pop()

    def front(self):
        if len(self.queue) == 0:
            return None
        else:
            return self.queue[-1]

    def rear(self):
        if len(self.queue) == 0:
            return None
        else:
            return self.queue[0]

    def toString(self):
        print(self.queue)

    def isEmpty(self):
        if len(self.queue) == 0:
            return True
        else:
            return False
#INIT
q = Queue()

#Empty test
print(q.isEmpty())

#enqueue/toString test
for x in range(10):
    q.enqueue(x)
q.toString()

#Empty test
print(q.isEmpty())

#front
print(q.front())
q.toString()

#rear
print(q.rear())
q.toString()

#dequeue
print(q.dequeue())
q.toString()


