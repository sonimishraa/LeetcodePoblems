class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
      val numsFilter = findNextGreatestElement(nums2)
     return filter(nums1,nums2,numsFilter)
    }
    fun filter(nums1:IntArray,nums2:IntArray,numsFilter:IntArray):IntArray{
        val arr = ArrayList<Int>()
        for(i in nums1.indices){
            for(j in nums2.indices){
                if(nums1[i]==nums2[j]){
                    arr.add(numsFilter[j])
        
                }
            }
        }
       return arr.toIntArray()
        
    }
    fun findNextGreatestElement(nums2:IntArray):IntArray{
        var v = ArrayList<Int>()
        var s = Stack<Int>()
        val n = nums2.size-1
        for(i in n downTo 0){
            if(s.size == 0){
                v.add(-1)
            }
            else if(s.size>0 && s[s.size-1]>nums2[i]){
                v.add(s[s.size-1])
            }
            else if(s.size>0 && s.peek()<=nums2[i]){
                while(s.size>0 && s.peek() <=nums2[i]){
                    s.pop()
                }
                if(s.size == 0){
                    v.add(-1)
                }
                else if(s.peek() > nums2[i]){
                    v.add(s.peek())
                }
            }
           
            s.push(nums2[i])
        }
        v.reverse()
       return  v.toIntArray()
        
        
    }
}