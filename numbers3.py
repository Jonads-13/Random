#
# numbers2.py: Read in a list of numbers (negative to exit) 
# and give the sum of the numbers
#

print('Enter your numbers...')
total = 0
count = 0

number = int(input())

while number >= 0:
    count+= 1
    total+= number
    print('Next number...')
    number = int(input())

print('Total is ', total, " and count is ", count)
