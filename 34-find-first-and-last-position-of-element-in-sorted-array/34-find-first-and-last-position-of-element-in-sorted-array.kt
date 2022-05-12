class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        var arr = IntArray(2)
        val firstOcc = firstOccurance(nums,target)
        arr.set(0,firstOcc)
        val lastOcc = lastOccurance(nums,target)
        arr.set(1,lastOcc)
        return arr
    }
    
    fun firstOccurance(nums:IntArray, target:Int):Int{
        var start = 0
        var end = nums.size-1
        var res:Int = -1
        while(start<=end){
            val mid = start + (end-start)/2
            if(target == nums[mid]){
                res = mid
                end = mid-1
            }
            else if(target > nums[mid]){
                start = mid+1
            }
            else if(target < nums[mid]){
                end = mid-1
            }
               
        }
        return res
    }
    
    fun lastOccurance(nums:IntArray,target:Int):Int{
        var start = 0
        var end = nums.size-1
        var res:Int = -1
         while(start<=end){
            val mid = start + (end-start)/2
            if(target == nums[mid]){
                res = mid
                start = mid+1
            }
            else if(target>nums[mid]){
                start = mid+1
            }
            else if(target<nums[mid]){
                end = mid-1
            }
           
        }
        return res
       
    }
}