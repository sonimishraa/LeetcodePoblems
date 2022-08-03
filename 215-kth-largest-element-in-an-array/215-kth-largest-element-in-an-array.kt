class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val heap = PriorityQueue<Int>()
        val n = nums.size-1
        for(i in 0..n){
            heap.add(nums[i])
            if (heap.size > k){
                heap.poll()
            }
        }
        return heap.peek()
    }
}