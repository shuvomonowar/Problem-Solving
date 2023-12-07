from typing import List


class Solution:
    def __init__(self, nums: List[int]):
        self.nums = nums

    def removeDuplicates(self) -> int:
        s = 0

        # List solution method
        for i in range(len(self.nums) - 1):
            if self.nums[i] != 101:
                for j in range(i + 1, len(self.nums)):
                    if self.nums[j] == self.nums[i]:
                        self.nums[j] = 101
                        s += 1

        k = len(self.nums) - s
        self.nums.sort()

        return k

    # List show method
    def showList(self) -> None:
        for i in self.nums:
            print(i, end=' ')

        print(len(self.nums))


# Create object of class Solution
obj = Solution([1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7])
print(obj.removeDuplicates())
print(obj.showList())
