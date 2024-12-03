import java.util.Scanner;
public class swap1
{
    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    a=a+b;
    b=a-b;
    a=a-b;
    String res = String.format("afterswapp\nboy=%d\ngirl=%d",a,b);
    System.out.println(res);
}
}