class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val nNums = reArrange(nums)
        return findMissingElement(nNums)
        
    }
    
    fun reArrange(nums:IntArray):IntArray{
     var i =0
     while(i<nums.size){
         val correctIndex = nums[i]-1 
         if(nums[i] != nums[correctIndex]){
             var temp = 0
             temp = nums[i]
             nums[i] = nums[correctIndex]
             nums[correctIndex] = temp
         }
         else
          i = i+1
     }
     return nums
        
    }
    
    fun findMissingElement(nNums:IntArray):ArrayList<Int>{
        var missArr = ArrayList<Int>()
        for(i in nNums.indices){
            if(nNums[i] != i+1){
                val missEle = i+1
                missArr.add(missEle)
            }
        }
        return missArr
    }
}