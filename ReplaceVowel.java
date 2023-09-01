import java.util.*;
class ReplaceVowel
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
str=str.replaceAll("[aeiou]","cow");

System.out.println(str);

} 
}