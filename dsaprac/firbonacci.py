def fibonacci(n,memo={}):
    if n in memo:
        return memo[n]
    if(n==0 or n==1):
        return n
    else:
        memo[n] = fibonacci(n-1,memo)+fibonacci(n-2,memo)
        print(memo)
        return memo[n]
print(fibonacci(5))

# 0 1 1  2 3 5 8 13 21 34 55 89 144