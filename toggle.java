import java.util.*;
class Toggle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int l=str.length();
String t="";
for(int i=0;i<l;i++)
{
if(str.charAt(i)>='a'&&str.charAt(i)<='z')
{
  t=t+(char)(str.charAt(i)-32);
}
else
{
   t=t+(char)(str.charAt(i)+32);
}
}

System.out.println(t);
} 
}