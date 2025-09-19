s,t = "anagram" ,"nagaram"
# def ValidAnagram():

"""
{"char":"count"}
{"a":2,"n":1,"g":1,r:1,m:1}
"""
def ValidAnagram(s,t):
    set1,set2 = {},{}
    for i in s:
        if i in set1: set1[i]+=1
        else:set1[i] =1
    for j in t:
        if j in set2:set2[j] += 1
        else: set2[j] =1
    return set1==set2
    # print(set1,set2)

print(ValidAnagram(s,t))
print(ValidAnagram("rat","car"))