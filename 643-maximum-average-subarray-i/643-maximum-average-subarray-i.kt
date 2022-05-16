class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        val n = nums.size
        var i = 0
        var j = 0
        var sum = 0.0
        var av = ArrayList<Double>()
        while(j<n){
            sum = sum +nums[j]
           
        
        if(j-i+1 < k){
            j++
        }
        else if(j-i+1 == k){
            val average:Double = sum/k
            av.add(average)
            sum = sum-nums[i]
            i++
            j++
           
          }
        }
        
        return findMax(av)
    
    }
    fun findMax(av:ArrayList<Double>):Double{
        var largest:Double = av[0]
        for(i in av.indices){
           if(largest<av[i]){
            largest = av[i]
          }
        }
           return largest
    }
}
        
     
