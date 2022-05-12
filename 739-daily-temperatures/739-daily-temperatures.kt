class Solution {
 fun dailyTemperatures(temperatures: IntArray): IntArray {
     var vector = vectorIndex(temperatures)
     // for(i in vector.indices){
     //    vector[i] = vector[i] - i
     // }
     return vector
       
    }
}
fun vectorIndex(tem:IntArray):IntArray{

        var v = IntArray(tem.size)
        var s = Stack<Pair<Int,Int>>()
        for(i in tem.size-1 downTo 0){
            if(s.size == 0){
                v[i] = 0
            }
            else {
                if(s.peek().first> tem[i]){
                    v[i] = s.peek().second - i
                }
                else if(s.peek().first<=tem[i]){
                  while(s.size>0 && s.peek().first<=tem[i]){
                     s.pop() 
                    }
                
                    if(s.size==0 ){
                        v[i] =0
                    }
                    else{
                        v[i] = s.peek().second - i
                    }
                
                }
               
            }
             s.push(Pair(tem[i],i))
        }
        
        
        return v
        
     
 }
 