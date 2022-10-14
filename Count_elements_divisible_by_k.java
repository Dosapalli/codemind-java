import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        int k=sc.nextInt();
        for(int i=0;i<N;i++)
        arr[i]=sc.nextInt();
        for(int i=0;i<N;i++)
        {
            if(arr[i]%k==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}