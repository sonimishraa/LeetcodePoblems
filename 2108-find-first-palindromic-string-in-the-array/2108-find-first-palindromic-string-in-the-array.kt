class Solution {
    fun firstPalindrome(words: Array<String>): String {
        val n = words.size-1
        var char = ""
        for(w in words){
           val bool = checkPalindrom(w)
           if(bool== true){
               char = w
               return char
           }
        } 
        return char
        
    }
    
    fun checkPalindrom(w:String):Boolean{
        val n = w.length-1
        var bool = true
        for(i in 0..n){
            if(w[i] != w[n-i]){
                bool = false
                return bool
            }
        }
        return bool
        
    }
}