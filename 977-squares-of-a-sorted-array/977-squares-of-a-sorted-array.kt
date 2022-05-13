class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        var squareArray = IntArray(nums.size) 
        for(i in 0..nums.size-1){
            squareArray[i] = nums[i]*nums[i]
            } 
        squareArray.sort()
        return squareArray
    }
    
}