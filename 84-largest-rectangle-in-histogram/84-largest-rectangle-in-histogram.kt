class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
       val nSL =  findNextSmallerLeft(heights)
       val nSR = findNextSmallerRight(heights)
       var area = IntArray(heights.size)
       val lastAreaIndex = heights.size-1
       for(i in heights.indices){
           val width = nSR[i]-nSL[i]-1
           area[i]= heights[i]*width
       }
       //area.sort()
       
    var largest = area[0]
    for (num in area) {
        if (largest < num)
            largest = num
      }
     return largest
    }
    
    fun findNextSmallerLeft(heights:IntArray):IntArray{
        var vLeft = IntArray(heights.size)
        var stack = Stack<Pair<Int,Int>>()
        val psudoIndex = -1
        for(i in heights.indices){
            if(stack.isEmpty()){
                vLeft[i] = psudoIndex
            }
            
            else if(stack.peek().first < heights[i]){
                vLeft[i] = stack.peek().second
            }
            else if(stack.peek().first>=heights[i]){
                while(stack.size>0 && stack.peek().first>=heights[i]){
                    stack.pop()
                }
                if(stack.isEmpty()){
                  
                    vLeft[i] = psudoIndex
                }
                else{
                    vLeft[i] = stack.peek().second
                }
            }
            
            stack.push(Pair(heights[i],i))
            
           }
        return vLeft
    }
    
    fun findNextSmallerRight(heights:IntArray):IntArray{
        var vRight = IntArray(heights.size)
        var stack = Stack<Pair<Int,Int>>()
        val psudoIndex = heights.size
        for(i in heights.size-1 downTo 0){
            if(stack.isEmpty()){
                vRight[i] = psudoIndex
            }
            
            else if(stack.peek().first < heights[i]){
                vRight[i] = stack.peek().second
            }
            else if(stack.peek().first>=heights[i]){
                while(stack.size>0 && stack.peek().first>=heights[i]){
                    stack.pop()
                }
              
                if(stack.isEmpty()){
                
                    vRight[i] = psudoIndex
                }
                else{
                    vRight[i] = stack.peek().second
                }
            }
            
            stack.push(Pair(heights[i],i))
            
           }
        return vRight
    }
}