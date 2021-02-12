#Node
class Node():
    """
    Input: val of the node
    Output: N/A
    """
    def __init__(self,val=None):
        self.l = None
        self.r = None
        self.v = val

    """
    Input: Val of the left
    Output: N/A
    """
    def setLeft(self,val):
        self.l = val

    """
    Input: Val of the right
    Output: N/A
    """
    def setRight(self,val):
        self.r = val

    """
    Input: Val of the node
    Output: N/A
    """
    def setVal(self,val):
        self.v = val

    """
    Input: N/A
    Output: The left node
    """
    def getLeft(self):
        return self.l

    """
    Input: N/A
    Output: The right node
    """
    def getRight(self):
        return self.r

    """
    Input: N/A
    Output: The val of the node
    """    
    def getVal(self):
        return self.v
    
class Tree:
    def __init__(self):
        self.root = None

    """
    Input: N/A
    Output: The root of the node
    """  
    def getRoot(self):
        return self.root

    """
    Input: Data to be added to the tree
    Output: N/A
    """
    def add(self,val):
        #If tree is empty add the root data
        if self.root is None:
            self.root = Node(val)
        else:
            #Recursion algorithm to add the node
            self._add(val, self.root)

    def _add(self,val,node):
        #Left side
        if val<node.getVal():
            #If the left side of current node it not empty work
            #down the left
            if node.l is not None:
                self._add(val,node.l)
            #If it is empty add it
            else:
                node.l = Node(val)
        #Right side
        else:
            #If the right side of current node it not empty work
            #down the right
            if node.r is not None:
                self._add(val,node.r)
            #If it is empty add it    
            else:
                node.r = Node(val)

    """
    Input: Data to be searched in the tree
    Output: The node object 
    """
    def search(self,val):
        if self.root is not None:
             return self._search(val,self.root)
        else:
            return None

    def _search(self,val,node):
        if val == node.getVal():
            return node
        #Search left side
        elif (val<node.getVal() and node.l is not None):
            self._search(val,node.l)
        #Search right side
        elif (val>node.getVal() and node.l is not None):
            self._search(val,node.r)

    """
    Print methods
    """
    def printTree(self):
        if self.root is not None:
            self._printTree(self.root)
        else:
            print("[]")

    #Starts from far left works it way back up with printing the right one as well
    def _printTree(self,node):
        if node is not None:
            self._printTree(node.l)
            print(str(node.getVal())+" ")
            self._printTree(node.r)


tree = Tree()
tree.add(3)
tree.add(4)
tree.add(0)
tree.add(8)
tree.add(2)
tree.printTree()
print(tree.search(3).getVal())
print(tree.search(10))








    
