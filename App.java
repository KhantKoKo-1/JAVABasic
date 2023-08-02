import java.util.Random;
import java.util.Scanner;

public class App {
   public static void main(String [] arg){
     int count = 0;
     Scanner scanner = new Scanner(System.in);
     Random random = new Random();
     int randomNum=random.nextInt(50)+1;
     System.out.println("The number is chosen 1 to 50 by computer.Guess The number withthing" +count+ "times.");

     while(count<5){
        System.out.print("Guess The Number :");
        int Inputnumber =scanner.nextInt();
        if (Inputnumber>randomNum){
         System.out.println("Your Number is Greater than chosen Number");
        }
        else if (Inputnumber<randomNum){
         System.out.println("Your Number is less than chosen Number");
        }
        else{
         break;
        }
      count++;  
     }
   System.out.println(count ==5 ? "You have chosen 5 times":"Congratulations ! You guess The Number");

}
}