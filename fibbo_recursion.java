import java.util.*;
class fibbo_recursion
{
    static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of terms");
        int a=in.nextInt();
        for(int i=0;i<a;i++)
        {
            int sol=fibbo(i);
            System.out.println(sol);
        }
    }

    static int fibbo(int n)
    {
        if(n==0)
            return 0;

        else if(n==1)
            return 1;
        else
            return fibbo(n-1)+fibbo(n-2);
    }
}
 