import java.util.*;
class CharacterFrequency
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int l=str.length();
Map<Character,Integer> map=new HashMap<>();
for(int i=0;i<l;i++)
{
  char c=str.charAt(i);
  if(map.containsKey(c))
   {
      map.put(c,map.get(c)+1); 
   }
  else
   {
       map.put(c,1);
   }
}
for(int i=0;i<l;i++)
{
   if(map.get(str.charAt(i))==1)
    System.out.println(str.charAt(i));
}
} 
}