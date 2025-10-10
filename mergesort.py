class MergeSort:
    def merge_two_arrays(self,left, right):
        merged = []
        i = j = 0
        while i < len(left) and j < len(right):
            if left[i] <= right[j]:
                merged.append(left[i])
                i += 1
            else:
                merged.append(right[j])
                j += 1
        while i < len(left):
            merged.append(left[i])
            i += 1
        while j < len(right):
            merged.append(right[j])
            j += 1
        return merged

    def merge_sort(self,arr):
        if len(arr) <= 1:
            return arr
        mid = len(arr) // 2
        left_half = self.merge_sort(arr[:mid])
        right_half = self.merge_sort(arr[mid:])
        return self.merge_two_arrays(left_half, right_half)



first = [1,3,8,9,4,7,2, 3, 4, 6, 6]
obj = MergeSort()
print(obj.merge_sort(first))



# what is inheritance in java
# syntax and special keywords for inheritance in java
# write a code to implement the fundamental operation of addition, sub, mul, div by incoroporation the idea of inheritance in java (create two classes one is parent class and other is child class)
# what is multilevel inheritance in java

# write a java program to implement multiple iheritance as shown below
# class A
# HAVING MEMBER VARIABLES AND MEMBER METHODS-calculate  DA->dearness allowance 35%
# class B->having member variables and member methods-calculate HRA->house rent allowance 18%
# class C extended from class A and class B excepts basic salary and calulate DA and HRA and finally the net salary


