class reve
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int rem=0,rev=0;
while(a>0)
{
rem=a%10;
rev=rev*10+rem;
a=a/10;
}
System.out.println("reverse ="+rev);
}
}
