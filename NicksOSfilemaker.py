import random
import sys

with open("c_file", "w") as file:
    for i in range(1, int(sys.argv[1])):
        letter = random.choice(['W', 'I', 'D'])
        file.write(f"{i} {letter}\n")
    letter = random.choice(['W', 'I', 'D'])
    file.write(f"{i+1} {letter}")