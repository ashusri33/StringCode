import java.util.*;
class Anagram
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
int l=s1.length();
char c1[]=s1.toCharArray();
char c2[]=s1.toCharArray();
Arrays.sort(c1);
Arrays.sort(c2);
boolean flag=;
for(int i=0;i<l;i++)
{
if(c1[i]!=c2[i])
{
    
}
else
{
System.out.println("false");
}
}

} 
}