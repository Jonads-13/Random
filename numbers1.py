#
# numbers1.py: Read in number and echo the number and its type to the screen
#

print('Enter an number...')
numberstr = input()
print('Number =', numberstr, 'Type : ', str(type(numberstr)))

number = int(numberstr)
print('Number =', number, 'Type : ', str(type(number)))