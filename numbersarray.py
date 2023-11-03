#
# numbers2.py: Read in 10 numbers and give the sum of the numbers
#
import numpy as np
import matplotlib.pyplot as plt

numarray = np.zeros(10)
index = np.arange(0,10)

print('Enter 10 numbers...')

for i in range(len(numarray)):
    print('Enter a number (',i,')...')
    numarray[i] = int(input())

print('Total is ', numarray.sum())
print('Min is: ', numarray.min())
print('Max is: ', numarray.max())
print('Mean is: ', numarray.mean())

plt.plot(index, numarray)
plt.title('Random user numbers')
plt.ylabel('Numbers')
plt.xlabel('Index')
plt.show()


