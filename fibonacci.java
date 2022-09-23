import java.util.*;

class fibonacci{
    public static void main(String args[]){
        int a=0,b=1,c;



        System.out.println("Enter the number of terms");   
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        System.out.print(a + " " + b + " " );

        while((i-2)> 0){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+ " ");

            i--;
        }
    }
}