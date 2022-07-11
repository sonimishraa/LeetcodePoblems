class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var i = 0
        var j = 0
        var sum = 0
        val n = nums.size
        var min = Int.MAX_VALUE
        while(j<n){
            sum = sum + nums[j]            
            if(sum < target){
                j++
            } else {
                while(sum >= target){
                     sum = sum - nums[i]
                     min = Math.min(min, j-i + 1)
                     i++
                }
                j++
            }
           
        }
        if(min == Int.MAX_VALUE) return 0 else return min
    }
}