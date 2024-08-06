import java.util.*;
public class Q5{
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        String str;
        int n;
        do{
            System.out.println("Enter the number:");
            n=sc.nextInt();
            str=Integer.toString(n);
            System.out.println(str);
        }while(str.length()!=4);
        if((n%4==0 && ((n%100==0 && n%400==0) || (n%100!=0 && n%400!=0)))) {
            System.out.println("It is a leap year");
        }
            else{
                System.out.println("It is not a leap year");
            }
        }
}
