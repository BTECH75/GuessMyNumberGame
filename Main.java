import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int myNumber =(int) (Math.random()*100);
        int userNumber = 0;

        do {
            System.out.println("GUESS MY NUMBER (1-100)");
            userNumber = sc.nextInt();

            if (userNumber == myNumber){
                System.out.println("woohoo.. CORRECT NUMMBER!!");
                break;
            }
            else if (userNumber  > myNumber) {
                System.out.println("YOUR NUMBER IS TOO LARGE");

            }
            else{
                System.out.println("YOUR NUMBER IS TOO SMALL");
            }
        }while (userNumber >= 0);
        System.out.print("MY NUMBER WAS : ");
        System.out.println(myNumber);


    }
}
