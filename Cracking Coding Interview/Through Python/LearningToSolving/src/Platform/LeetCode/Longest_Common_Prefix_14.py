from typing import List


class Solution:
    def __init__(self):
        pass

    def longestCommonPrefix(self, strs: List[str]) -> str:
        nstrs = ""
        strs.sort()

        for i in range(min(len(strs[0]), len(strs[len(strs)-1]))):
            if strs[0][i] == strs[len(strs)-1][i]:
                nstrs += strs[0][i]
            else:
                return nstrs

        return nstrs


obj1 = Solution()
print(obj1.longestCommonPrefix(["dog", "racecar", "car"]))
