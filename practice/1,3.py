n = int(input("Input List size"))
a = []
for i in range(n):
    val = int(input("Enter Number"))
    a.append(val)
print("umSorted List is : ")
print(a)
for i in range(n+1):
    min = i
    for j in range(i+1,n):
        if a[j] < a[min]:
            min = j
        temp = a[i]
        a[i] = a[min]
        a[min]= temp
print("Sorted List is : ")
print(a)