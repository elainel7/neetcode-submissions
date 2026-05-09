class MinStack:


    def __init__(self):
        self.stack = []
        self.minStack = [] 

    def push(self, val: int) -> None:
        self.stack.append(val)
        val = min(val, self.minStack[-1] if self.minStack else val) # checks to make sure if minStack is nonempty
        self.minStack.append(val)
        # if (val < minStack[-1]):
        #     minStack.push(val)
        # else:
        #     int track = minStack.pop
        #     minStack.push(val)
        #     self.minStack.push(track)

    def pop(self) -> None:
        self.stack.pop()
        self.minStack.pop()
        

    def top(self) -> int:
        return self.stack[-1] # -1 means the same as stack.peek() in java
        

    def getMin(self) -> int:
        return self.minStack[-1]
        
