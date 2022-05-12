class Solution {
    fun search(nums: IntArray, target: Int): Int {
        // accending order
        // find lowest and highest index
        var start = 0
        var end = nums.size-1
        while(start<=end){
            // get mid index 
            val mid = start + (end-start)/2
            if(target == nums[mid]){
                return mid
            }
            else if(target > nums[mid]){
                start = mid +1
            }
            else if(target < nums[mid]){
                end = mid-1
            }
        }
        return -1
    }
}