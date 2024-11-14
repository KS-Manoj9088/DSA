def find_first_set_bit(n):
    if n == 0:
        return 0
    
    position = 1
    while n > 0:
        if n & 1:
            return position
        n = n >> 1
        position+= 1
        
    return 0

num = 18
print("Position of first set bit : ", find_first_set_bit(num))