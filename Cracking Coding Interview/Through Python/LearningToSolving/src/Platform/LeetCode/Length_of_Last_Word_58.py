def lengthOfLastWord(s: str) -> int:
        cnt = 0

        if s[-1] != ' ':
            for i in range(len(s)-1, -1, -1):
                if s[i] == ' ':
                    break
                else:
                    cnt += 1
        else:
            for i in range(len(s)-1, -1, -1):
                if s[i] != ' ':
                    for j in range(i, -1, -1):
                        if s[j] == ' ':
                            break
                        else:
                            cnt += 1
                    break
        return cnt
                  

print(lengthOfLastWord('   fly me   to   the moon  '))
                            