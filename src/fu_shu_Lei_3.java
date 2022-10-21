import java.util.PriorityQueue;
import java.util.Scanner;

public class fu_shu_Lei_3
{
    /*
    public static void main(String[] args)
    {
        double shi = 0;
        double xu = 0;
        double temp = 0;
        int flag = 0;


        int n;
        String str;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int loop = 0; loop < n; loop++)
        {
            str = input.next();
            char[] s = str.toCharArray();
            for (int i = 0; i < s.length; i++)
            {
                if ('0' <= s[i] && s[i] <= '9')
                {
                    if (flag == 0)
                    {
                        temp *= 10;
                        temp += s[i] - '0';
                    } else
                    {
                        temp += (s[i] - '0') * Math.pow(10, -flag);
                        flag++;
                    }

                } else if (s[i] == 'i')
                {
                    if (temp != 0) xu += temp;
                    else xu += 1;
                    temp = 0;
                    flag = 0;
                    i++;
                } else if (s[i] == '+')
                {
                    shi += temp;
                    temp = 0;
                    flag = 0;
                } else if (s[i] == '.')
                {
                    flag = 1;
                }
            }
            if (s[s.length - 1] == 'i') xu += temp;
            else shi += temp;

        }
        System.out.println(shi+ "+" +xu+"i");
    }


     */
/*
    public static void main(String[] args) {

        int ans = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
       // queue.add(4);
        Scanner input = new Scanner(System.in);
       // System.out.println(queue.element());


        int n;
        n = input.nextInt();
        for (int i = 0; i < n; i++)
        {
            int tmp;
            tmp = input.nextInt();
            queue.add(tmp);
        }
        while (queue.size()!=1)
        {
            int x =queue.element();
            queue.poll();
            int y = queue.element();
            queue.poll();
            queue.add(x+y);
            ans +=x+y;
        }

        System.out.println(ans);

    }*/


    public static void main(String[] args)
    {
        String s,t;
        Scanner input = new Scanner(System.in);
        s = input.next();
        t = input.next();

        int result = 0;
        int sLength = s.length();
        int tLength = t.length();
        int[][] dp = new int[sLength][tLength];
        for (int i = 0; i < sLength; i++) {
            for (int k = 0; k < tLength; k++) {
                if (s.charAt(i) == t.charAt(k)) {
                    if (i == 0 || k == 0) {
                        dp[i][k] = 1;
                    } else {
                        dp[i][k] = dp[i - 1][k - 1] + 1;
                    }
                    result = Math.max(dp[i][k], result);
                } else {
                    dp[i][k] = 0;
                }
            }
        }
        System.out.println(result);
    }
}
