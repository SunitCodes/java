import java.util.*;
class Bank_Denomination
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int rev = 0, amount, t, rem,e;//initialising the variables
        int denomination[] = {1000, 500, 100, 50, 20, 10, 5, 2, 1};//Storing the different notes in an array
        String denomiation1[] = {" Zero"," One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine"};
        int i, totalNotes = 0;
        System.out.print("Enter the Amount = ");
        amount=in.nextInt();//Taking the amount from the user
        e=amount;//Storing amount in the variable e
        if(amount >99999)// Checking for the entered amount not more then 100000
        {
            System.out.println("Invalid Amount");
        }
        else
        {
           t = amount;//Storing amount in t 
           while(t !=0)
          {
            rev=rev*10+t%10; // Reverse the amount, example 3456 into 6543
            t=t/10;
          }
          System.out.print("Amount in words :");// Displaying the amount in words
          while(rev!=0)
          {
            rem=rev%10; // Mod division for remainder
            for(i=0;i<10;i++)
            {
                if(rem==i)
                    System.out.print(denomiation1[i]);
            }
            rev=rev/10; // Integer division
          }
          i = 0;//Initialising i eual to zero
          System.out.println();
          System.out.println("=========DENOMINATION===========");
          while (amount!=0)
          {
            rev=amount/denomination[i];
            if(rev!=0)
            {
                System.out.println(denomination[i]+"\t X " + rev + "\t= " + rev*denomination[i]);//Calculating the denomination
                totalNotes+=rev;
            }
            amount=amount % denomination[i];
            i++;
          }
          System.out.println("TOTAL="+e);
          System.out.println("TOTAL NUMBER OF NOTES= " + totalNotes);//Showing the total number of notes in the amount.
       }
    }
}