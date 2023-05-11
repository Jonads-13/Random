courses = ['History', 'Math', 'Physics', 'CompSci'] # list

# use negative to index backwards
print(courses[-1]) # last item

# range of values
print(courses[0:2]) # upto but not including

courses.append('Art') # add to end

courses.insert(1,'Sport') # add to specific index

courses_2 = ['Education', 'Chemistry']

courses.extend(courses_2) # add items from another list

print(courses)


# courses.sort() # inplace sort

sorted(courses) # returns a new list without modifying the original

print(courses.index('Art'))

