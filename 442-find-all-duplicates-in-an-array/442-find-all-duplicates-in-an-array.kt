class Solution {
    fun findDuplicates(nums: IntArray): List<Int> {
        val mNums = reArrangeArray(nums)
        return findDuplicate(mNums)
        
    }
    
    fun reArrangeArray(nums:IntArray):IntArray{
        var i= 0
        val arrSize = nums.size
        while(i<arrSize){
            val correctIndex = nums[i]-1
            if(nums[i] != nums[correctIndex]){
                var temp:Int =0
               temp = nums[i]
               nums[i] = nums[correctIndex]
               nums[correctIndex] = temp
            }
            else
             i = i+1
        }
        print("ArrayUpdated:$nums[0]")
        return nums
    }

    fun findDuplicate(nNums:IntArray):ArrayList<Int>{
        val size = nNums.size
        var dupArr = ArrayList<Int>()
        for( i in nNums.indices){
           if(nNums[i] != i+1){
               val dupNum = nNums[i]
               dupArr.add(dupNum)
           } 
            
        }
        return dupArr
    }
    
   
}