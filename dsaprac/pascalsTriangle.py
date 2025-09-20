# WAF to print pascals triangle up to n rows
def printPascalsTriangle(n):
    for line in range(0, n):
        C = 1  # used to represent C(line, i)
        for i in range(0, line + 1):
            print(C, end=" ")
            C = C * (line - i) // (i + 1)
        print()
# printPascalsTriangle(100)


def maxArea(height):
        if(len(height)<=1): return 0
        l,r = 0, len(height)-1
        water = 0
        while(l<=r):
            water = max(water, (r-l)*min(height[l],height[r]))
            if(height[l]<height[r]): l+=1
            else:r-=1
        return water
print(maxArea([1,8,6,2,5,4,8,3,6]))
print(maxArea([0,0,0,1,0,0,0,0,2,0]))