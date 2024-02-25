import java.util.Scanner;
public class miniproject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mynumber = (int) (Math.random()*100); //random prints between 0.0 to 0.1
        int n;
        do{
          System.out.println("Guess the number:");
          n = sc.nextInt();
          if(n == mynumber){
            System.out.println("WOHHHU.....CORRECT");
            break;
          }
          else if(n > mynumber){
            System.out.println("The number is larger than actual number!");
          }
          else{
            System.out.println("your number is smaller than actual number!");
          }
        }while(n>0);
        System.out.print("The number was:"+mynumber);
    }
}
