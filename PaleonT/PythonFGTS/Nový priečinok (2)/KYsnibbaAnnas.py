count = 0
palindrome = 99999
erst = 999
print(palindrome)
while palindrome != 10001:
    temp = ""
    erst -= 1
    temp = str(erst)
    temp = temp + temp[1] + temp[0]
    palindrome = int(temp)
    print(palindrome)
