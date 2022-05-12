class Solution {
    fun search(nums: IntArray, target: Int): Int {
        // need to find index of minimum element
        val index =  findMinimumIndex(nums,target)
        if(index != -1){
            val start = 0
            val end = index
            print("Index:$index")
            val targetIndex = findTargetIndex(nums,start,end,target)
            if(targetIndex != -1){
               return targetIndex   
                 }
            else {
               val start = index 
               val end = nums.size-1
               return findTargetIndex(nums,start,end,target)
        }
    }
        else{
            val start= 0
            val end = nums.size-1
            return findTargetIndex(nums,start,end,target)
        }
}
    
    fun findMinimumIndex(nums:IntArray,target:Int):Int{
        var start = 0
        val n = nums.size
        var end = n-1
        while(start<=end){
            val mid = start + (end-start)/2
            if(mid>0 && nums[mid]<nums[mid-1]){
                return mid
            }
            else if(nums[0]<=nums[mid]){
                start = mid+1
            }
            else end = mid-1
        }
        return -1
    }
   
   fun findTargetIndex(nums:IntArray, start:Int, end:Int,target:Int):Int{
       var lo = start
       var hi = end
       
       while(lo<=hi){
           val mid = lo + (hi-lo)/2
           if(target == nums[mid]){
               print("Updated:$mid")
               return mid
               
           }
           
           else if(target<nums[mid]){
               hi = mid-1
           }
           
           else if(target>nums[mid]){
               lo = mid+1
           }
         
       }
       return -1
   }
    
}