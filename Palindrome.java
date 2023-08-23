mport java.util.*;

public class root
{
    public static void main(String[] args)
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the number");
    int num= obj.nextInt();
    int num_copy=num;
    int b =0;
    while(num_copy!=0)
    {
        int a = num_copy%10;
        b = b*10+a;
        num_copy = num_copy/10;
    }
    if(b==num)
    {

    System.out.println(num+" number is palindrome");
    }
    
    else
    {
    System.out.println(num+" number is not a palindrome");

    }
}
