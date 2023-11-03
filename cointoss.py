import random

coin = ['heads', 'tails']

heads = 0
tails = 0
trials = int(input('Enter the number of tosses to simulate... '))

print('\nCOIN TOSS\n')

for index in range(trials):
    if random.choice(coin) == 'heads':
        heads += 1
    else:
        tails += 1

print('\nThere were ', heads, ' heads & ', tails, ' tails\n')
