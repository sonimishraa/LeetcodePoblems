class Solution {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var start = 1
        val n = arr.size
        var end = n-2
        while(start<=end){
            val mid = start + (end-start)/2
             if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                    return mid
                }
                else if(arr[mid]<arr[mid-1]){
                    end = mid-1
                }
                else if(arr[mid]<arr[mid+1]){
                    start = mid+1
                }
               
        }
        return -1 
        
    }
}