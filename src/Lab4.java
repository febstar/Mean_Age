import java.util.Scanner;

public class Lab4 {
    public static void main(String args[]){
        int numb = 0;
        Scanner myinput = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        numb = myinput.nextInt();
        System.out.print("The result is: "+mymethod(numb));
    }

    
    static int mymethod(int n){
        int result = 0;
        if (n == 1){
            result = 1;
        }
        else{
            result = n + mymethod(n-1);
        }
        return result;
    }
}
