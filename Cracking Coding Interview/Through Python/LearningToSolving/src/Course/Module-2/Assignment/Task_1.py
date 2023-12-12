class Task_1:
    def __init__(self, nums, target):
        self.nums = nums
        self.target = target
        self.brk = False

    def solution(self):
        # Solution of the task-1 started here
        print(len(self.nums))
        # for i in range(len(self.nums)-1):
        #     for j in range(i+1, len(self.nums)):
        #         if self.nums[i]+self.nums[j] == self.target:
        #             print('[', end='')
        #             print(i, end=',')
        #             print(j, end=']')
        #             self.brk = True
        #             break
        #     if self.brk:
        #         break


# From here execution should be started
size = int(input('Enter the size of the list: '))
lst = []

print('Enter the elements of the list: ')
for k in range(size):
    elm = int(input())
    lst.append(elm)

goal = int(input('Enter the target number: '))

obj = Task_1(lst, goal)


# Time Complexity: O(n^2)
# Space Complexity: O(n)

