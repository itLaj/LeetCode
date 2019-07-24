import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println( new Solution().topKFrequent(new int[]{4,1,-1,2,-1,2,3}, 2));
    }
    //内部类 两个成员变量分别代表元素及其出现的频次
    private class Freq implements Comparable<Freq> {
        int e,freq;

        public Freq(int e, int freq) {
            this.e = e;
            this.freq = freq;
        }
        //将频次作为比较的依据
        @Override
        public int compareTo(Freq o) {
            if (this.freq < o.freq) return -1;
            if (this.freq > o.freq) return 1;
            else  return 0;

        }
    }
    public List<Integer> topKFrequent(int[] nums, int k) {
        //数组中元素与出现频次的映射
        Map<Integer, Integer> map = new HashMap<>();
        for (int num:nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        PriorityQueue<Freq> pq = new PriorityQueue<>();
        for (int key : map.keySet()) {
            //优先队列元素个数小于k时直接入队
            if (pq.size() < k)
                pq.offer(new Freq(key, map.get(key)));
            //优先队列元素个数大于k时，比较当前元素频次与堆顶元素频次
            else if(map.get(key) > pq.peek().freq) {
                pq.poll();
                pq.offer(new Freq(key, map.get(key)));
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.poll().e);
        }
        return res;
    }
}
