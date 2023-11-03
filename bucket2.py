# bucket list builder

bucket = []

choice = input('Enter a selection e(X)it, (A)dd, (D)elete, (L)ist...')
choice = choice.upper()

while choice[0] != 'X':
    if choice[0]=='A':
        newitem = input()
        bucket.append(newitem)
    elif choice[0] == 'L':
        for item in bucket:
            print(item)
    elif choice[0] == 'D':
        del bucket[int(input())]
    else:
        print('Invalid selection')
    choice = input('Enter a selection e(X)it, (A)dd, (D)elete, (L)ist...')
    choice = choice.upper()

print('\nGOODBYE\n')