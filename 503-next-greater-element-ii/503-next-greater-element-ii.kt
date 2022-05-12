class Solution {
    fun nextGreaterElements(nums: IntArray): IntArray {
       return findNextGreater(nums)
    }
    
    fun findNextGreater(nums:IntArray):IntArray{
        var v = IntArray(nums.size)
        var s = Stack<Int>()
        val n = nums.size
        var n1 = 2*n-1
        for(i in n1 downTo 0){
            println(i%n)
            val index = i%n
            if(s.size == 0){
                v.set(index,-1)
            }
            else if( s.size>0 && s[ s.size-1]>nums[index]){
                v.set(index, s[ s.size-1])
            }
            
            else if( s.size>0 && s[ s.size-1]<=nums[index]){
                println("NumsIndex:${nums[index]}")
                while( s.size>0 && s[ s.size-1]<=nums[index]){
                    s.remove(s[ s.size-1])
                }
                if( s.size == 0){
                    v.set(index,-1)
                }
                else{
                    v.set(index, s[ s.size-1])
                }
                
            }
            s.add(nums[index])
        }
        return v
    }
}