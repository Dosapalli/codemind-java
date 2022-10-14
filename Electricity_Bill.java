import java.util.Scanner;
class Sample
{
    public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        int k;
        String n,p;
        p=sc.nextLine();
        n=sc.nextLine();
        double s=0;
        k=sc.nextInt();
        if (k>0 && k<=199)
          s=k*1.2;
          else if(k>=200&& k<400)
          s=k*1.50;
          else if (k>=400 && k<600)
          s=k*1.80;
          else
          s=k*2.00;
          if(s>400)
          s=s+s*0.15;
          else
          s=s+100;
          System.out.format("%.2f",s);
    }
}
    
        