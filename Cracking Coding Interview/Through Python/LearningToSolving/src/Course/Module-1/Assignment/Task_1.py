class Task_1:
	def __init__(self, inpt):
		self.inpt = int(inpt)

	def solution(self) -> int:
		res = 1

		while self.inpt > 1:
			res *= self.inpt
			self.inpt -= 1

		return res


inpt = input('Enter number: ')
o1 = Task_1(inpt)
print('The factorial result: ', o1.solution())


# Time Complexity: O(n)
# Space Complexity: O(1)
