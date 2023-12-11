def isPalindrome(s: str):
    # 1. Remove all whitespaces and non-alphanumeric letters
    s = ''.join(c.lower() if c.isalnum() else '' for c in s if not c.isspace())
    fs = s[::-1]

    if s == fs:
        return True

    return False


class Solution:
    def __init__(self):
        pass


o1 = Solution()
print(isPalindrome(" "))
