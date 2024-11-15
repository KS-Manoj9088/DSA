import math

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


def find_first_set_bit_1(num):
    if num == 0:
        return 0   
    n = num & (num - 1)
    m = n ^ num
    
    bit = (int)(math.log(m)/math.log(2))
    
    return bit+1          #return m.bit_length

num = 18
print("Position of first set bit : ", find_first_set_bit(num))
print("Position of first set bit : ", find_first_set_bit_1(32))        #100000