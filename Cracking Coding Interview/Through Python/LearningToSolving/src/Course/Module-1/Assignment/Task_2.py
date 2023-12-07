class Task_2:
    def __init__(self, a, b):
        self.a = int(a)
        self.b = int(b)
        self.start = None
        self.end = None

    def solution(self):
        # starting and ending range setup
        if self.a > self.b:
            self.start = self.b
            self.end = self.a
        else:
            self.start = self.a
            self.end = self.b

        fs = (self.end * (self.end + 1)) / 2
        ts = ((self.start - 1) * self.start) / 2
        s = fs - ts

        return s


a = input('Enter starting number: ')
b = input('Enter ending number: ')

o1 = Task_2(a, b)
print(f'The sum of all numbers between {a} and {b} : ', o1.solution())


# Time Complexity: O(1)
# Space Complexity: O(1)



