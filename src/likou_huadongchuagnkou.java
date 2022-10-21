import java.util.PriorityQueue;

public class likou_huadongchuagnkou
{
    public static void main(String[] args)
    {
        int ans[] = new int[8];
        int nums[] = {1,3,-1,-3,5,3,6,7};
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->nums[b]-nums[a]);
        for(int i =0;i<3;i++)
        {
            pq.add(i);
        }
        ans[0] = nums[pq.peek()];
        int index = 1;
        for (int i=3;i<8;i++)
        {
            pq.add(i);
            while (pq.peek()<=i-3)
                pq.poll();
            ans[index++] = nums[pq.peek()];
        }
    }
}
