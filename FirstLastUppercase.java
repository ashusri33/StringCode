import java.util.*;
class FirstLastUppercase
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int l=str.length();
String s="";
for(int i=0;i<l;i++)
{
if(i==0||i==l-1)
{
   if(Character.isLowerCase(str.charAt(i)))
   {
    s=s+Character.toUpperCase(str.charAt(i));
   }
   else
{
    s=s+str.charAt(i); 
}
}
else if(str.charAt(i)==' ')
{
     s=s+Character.toUpperCase(str.charAt(i-1))+' '+Character.toUpperCase(str.charAt(i+1));
     i++;
}
else if(i<l&&str.charAt(i+1)!=' ')
{
       s=s+str.charAt(i); 
}


}

System.out.println(s);
} 
}