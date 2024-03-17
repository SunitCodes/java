import java .util.*;
class InsertionSort
{
    static void main(){
        Scanner in=new Scanner(System.in);       
        int a[]=new int[5];
        int i,t=0,j,l=0;
        
        System.out.println("Enter the array elements:");
        
        for(i=0;i<5;i++)
            a[i]=in.nextInt();
        
        for(i=1;i<5;i++)
        {
            
            t=a[i];  //Storing value 
            
            if(a[i]<a[(i-1)]) //If next element is lower than the previous, it will swap
            {
                
                a[i]=a[i-1];  //swapping
                a[i-1]=t;
                
                if(i>1)
                {
                    
                    
                    for(j=i-1;j>=1;j--)
                    {
                        l=a[j];
                        
                        
                        if(a[j]<a[(j-1)])
                        {
                            a[j]=a[j-1];
                            a[j-1]=l;
                        }
                        
                    }
                }
            }
        }
       
        System.out.println("After sorting:");
        
        for(i=0;i<5;i++)
            System.out.println(a[i]);
    }
}