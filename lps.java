import java.util.*;
class PalindromicString
{
static boolean checkPalindrome(String str1)
{
   String str2=new StringBuilder(str1).reverse().toString();
  // String str3=str2.reverse().toString();
   if(str2.equals(str1))
    return true;
   else
    return false;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int l=str.length();
int l1=0;

for(int i=0;i<l;i++)
{
String str1="";
for(int j=i;j<l;j++)
{
str1=str1+str.charAt(j);
int lp=str1.length();
boolean b=checkPalindrome(str1);
System.out.print(str1+" ");
System.out.println(b);
if(b)
{
l1=Math.max(l1,lp);
}
}
}

System.out.println(l1);

} 
}