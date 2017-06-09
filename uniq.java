import java.io.*;
import java.util.*;
import java.util.Arrays;
public class uniq
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int l=scan.nextInt();
int[] arr=new int[l];
for(int i=0;i<l;i++)
{
arr[i]=scan.nextInt();
}
Arrays.sort(arr);
for(int i=0;i<l;i++)
{
if(arr[i]==arr[(i+1)%l])
{
}
else if(arr[i]==arr[(i-1)%l])
{
}
else
{
System.out.println(arr[i]);
}
}
}
}
