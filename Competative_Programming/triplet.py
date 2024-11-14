def max_product_triplet(arr):
    arr.sort()
    max1 = arr[-1]*arr[-2]*arr[-3]
    triplet1 = (arr[-3],arr[-2],arr[-1])
    max2 = arr[0]*arr[1]*arr[-1]
    triplet2 = (arr[0]*arr[1]*arr[-1])
    
    if max1 > max2:
        print("Maximum product of a Triplet :",max1)
        print("Triplet is:",triplet1)
        return max1, triplet1
    else:
        print("Maximum product of a Triplet :",max2)
        print("Triplet is:",triplet2)
        return max2, triplet2
    
arr = input("Enter list values : ")
max_product_triplet(arr)
        