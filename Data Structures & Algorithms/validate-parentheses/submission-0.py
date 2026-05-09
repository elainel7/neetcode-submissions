class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        closeToOpen = { '}' : '{', ')' : '(', ']' : '['}
        for c in s:
            if c in closeToOpen:
                if stack and stack[-1] == closeToOpen[c]: # checks if stack is not empty, and if stack.peek is equal to the mapped opening parenthases
                    stack.pop()
                else:
                    return False
            else:
                stack.append(c)   

        return True if not stack else False
        
         