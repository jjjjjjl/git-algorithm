import com.sun.xml.internal.bind.v2.model.annotation.Quick;
import sun.text.normalizer.NormalizerBase;

import java.util.Random;

public class kuaipai_test
{
    public static void main(String[] args)
    {
        int n =10000000;
        Random rand = new Random(10);
        int a[]= new int[20000000];
        for(int i =10000000;i>=0;i--)
        {
            a[i] = rand.nextInt(10000000);
        }
        System.out.println("before:");
        quick_sort.disp(a,n);
        quick_sort.QuickSort(a,0,n-1);
        System.out.println("after:");
        quick_sort.disp(a,n);
    }
}

 class quick_sort
{
    static void disp(int a[],int n)
    {
        int i;
        for(i =0;i<n;i++)
        {
            if(i%1000==0)
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }

    static int Partition(int a[],int s,int t)
    {
        int i =s,j =t;
        int temp =a[s];
        while ((i!=j))
        {
            while(j>i && a[j]>=temp)j--;
            a[i] = a[j];
            while (i<j && a[i]<=temp)i++;
            a[j] = a[i];
        }
        a[i] = temp;
        return i;
    }

    static void QuickSort(int a[], int s, int t)
    {
        int i;
        if(s<t)
        {
            i = Partition(a,s,t);
            QuickSort(a,s,i-1);
            QuickSort(a,i+1,t);
        }
    }


}




























































