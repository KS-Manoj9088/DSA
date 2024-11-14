def extended_euclidean(a, b):
    if a == 0:
        return (0, 1, b)
    else:
        x1, y1, gcd = extended_euclidean(b % a, a)
        x = y1 - (b // a) * x1
        y = x1
        return (x, y, gcd)
    
def solve_euclid_problem(a, b):
    x, y, gcd = extended_euclidean(a, b)
    print(x, y, gcd)
    
a1, b1 = 4, 6
solve_euclid_problem(a1, b1)

a2, b2 = 17, 17
solve_euclid_problem