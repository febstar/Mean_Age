import java.util.Scanner;

public class Lab2 {
    public static void main(String args[]){
        int numb = 0;
        Scanner myinput = new Scanner(System.in);
        System.out.print("Enter an integer number:");
        numb = myinput.nextInt();
        System.out.print("The result is: " +mymethod(numb));
    }

    static int mymethod(int n){
        int result = 0;
        for(int i = 1;i<=n;i++){
            result = result + i;
        }
        return result;
    }
}
