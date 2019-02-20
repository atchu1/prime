import java.util.scanner;
public class Java
{
public static void main(string arg[])
{
int n,i,c=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
n=s.nextInt();
for(i=2:i<n:i++)
{
if(num%i==0)
{
c++;
break;
}}
if(c==0)
{
System.out.println("yes");
}
else{
System.out.println("no");
}
