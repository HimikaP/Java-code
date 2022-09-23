import java.util.*;

class factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int fact=1;
        System.out.println("Enter the number that you want to find the factorial of :");
        int num = sc.nextInt();

        int i=num;
    while(i>0){
        fact*=i;
        i--;
    }

    System.out.println("The factorial is: " + fact);
    
    }
}