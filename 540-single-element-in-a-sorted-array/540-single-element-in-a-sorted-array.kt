class Solution {
    fun singleNonDuplicate(nums: IntArray): Int {
        var start = 0
        val n = nums.size
        var end = n-1
        if(n==1){
            return nums[0]
        }
        if(n==2){
            if(nums[0] != nums[1]){
                return nums[0]
            }
        }
        if(n==3){
            if(nums[0] == nums[1]){
                return nums[2]
            }
            else return nums[0]
        }
        while(start<=end){
            val mid = start + (end-start)/2
            if(mid>0 && mid<nums.size-1){
                if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid]
                }
                else if(mid%2==0 && nums[mid] != nums[mid+1]){
                   end = mid-1
                }
                else if(mid%2 != 0 && nums[mid] == nums[mid+1]){
                    end = mid-1
                   }
                else if(mid%2 != 0 && nums[mid] == nums[mid+1]){
                     end = mid-1  
                }
                else  if(mid%2 != 0 && nums[mid] != nums[mid+1]){
                   start = mid+1
                }
                else {
                  start = mid+1
                  }
            }
            else if(mid == nums.size-1){
                return nums[n-1]
            }
            else if(mid == 0){
                return nums[0]
            }
        }
            
        return -1
        
    }
}