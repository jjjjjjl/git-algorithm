import javax.swing.*;
import java.util.Scanner;
import static java.lang.Math.abs;


class data
{
    int q[] = new int [20];
    int count = 0;

}

class Queen extends data
{
    void dispasolution(int n)
    {
       // System.out.print("第"+ ++count+"个解：");
       // for (int i =1;i<=n;i++)
       // {
        //    System.out.print("("+ i +"," + q[i] +")");
       //}
       // System.out.print("\n");
    }

    boolean place (int i ,int j)
    {
        if (i ==1) return true;
        int k =1;
        while(k<i)
        {
            if ((q[k]==j) || (abs(q[k]-j) == abs(i-k)))
            {
                return false;
            }
            k++;
        }
        return true;
    }

    void queen (int i,int n)
    {
        if (i>n)
        {
            dispasolution(n);
        }
        else
        {
            for (int j = 1;j<=n;j++)
            {
                if (place(i,j))
                {
                    q[i] = j;
                    queen(i+1,n);
                }
            }
        }
    }

}


public class n_queen {
    public static void main(String[] args)
    {
        int n;

        System.out.println("皇后问题求解如下：");
        Queen q = new Queen();
        for (n =1;n<20;n++)
        {
            long start = System.currentTimeMillis();
            q.queen(1, n);
            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.printf(n+ "皇后问题耗时：" + time + "毫秒\n");
        }


    }
}