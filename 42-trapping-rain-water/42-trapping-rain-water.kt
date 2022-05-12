class Solution {
    fun trap(height: IntArray): Int {
        val n = height.size
        var maxLeft = IntArray(n)
        var maxRight = IntArray(n)
        //for MaxLeft go forward
         maxLeft[0] = height[0]
        for(i in 1..n-1){
               maxLeft[i] = findMax(maxLeft[i-1],height[i])
            
        }
         maxRight[n-1] = height[n-1]
        for(i in n-2 downTo 0){
            maxRight[i] = findMax(maxRight[i+1],height[i])
        }
         var waterheights = IntArray(n)
         var waterTrap = 0
        for(i in 0..n-1){
            waterheights[i] = findMin(maxLeft[i],maxRight[i])- height[i]
            waterTrap = waterTrap + waterheights[i]
        }
        return waterTrap
        
    }
    
    fun findMax(height1:Int,height2:Int):Int{
    
        if(height1>=height2){
            return height1
        }
        else{
            return height2
        }
    }
    
    fun findMin(maxL:Int,maxR:Int):Int{
        
        if(maxL<maxR){
            return maxL
        }
        else{
            return maxR
        }
    }
}