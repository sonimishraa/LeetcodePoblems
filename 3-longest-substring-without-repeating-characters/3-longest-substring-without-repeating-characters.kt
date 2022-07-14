class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var i = 0
        var j = 0
        var max = 0
        val n = s.length
        var map = HashMap<Char,Int>()
        while(j<n){
            map[s[j]] =  (map.get(s[j]) ?: 0) +1
            
            if(map.size == j-i+1){
                max = Math.max(max,j-i+1)
                j++
            }
            else if(map.size < j-i+1){
                while(map.size<j-i+1){
                    map[s[i]] = (map.get(s[i]) ?: 0)-1
                    if(map[s[i]] == 0){
                        map.remove(s[i])
                    }
                    i++
                }
                j++
            }
        }
        return max
        
    }
}