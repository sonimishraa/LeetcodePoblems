class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var l = 1
        val n = nums.size-1
        
        for(r in 1..n){
            if(nums[r] !=nums[r-1]){
                nums[l] = nums[r]
                l++
            }
        }
        return l
    }
}