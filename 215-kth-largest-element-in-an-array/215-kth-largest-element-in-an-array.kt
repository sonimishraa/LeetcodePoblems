class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val heap = PriorityQueue<Int>()
        nums.forEach {
            heap.add(it)
            if (heap.size > k){
                heap.poll()
            }
        }
        return heap.peek()
    }
}