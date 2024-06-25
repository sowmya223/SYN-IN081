import java.util.Scanner;
class{
public static void main(String[] args){
Scanner sc=new Scanner();
int c=0;
int n=sc.nextInt();
for(int i=0;i<n;i++){
if(n%i==0)
c++;
}
if(c==2)
System.out.println("Given number is Prime");
else
System.out.println("Given number is not a Prime");
}
}