package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
    public String getString(){
        System.out.println("Type something: ");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Select y/n");
        String answer = scanner.nextLine();
        return answer.equals("y") ? true : false;
    }

    public int getInt (int min, int max){
        System.out.println("Give me a number between " + min + " "+ max);
        int aNum = Integer.parseInt(scanner.nextLine());
        if(aNum < min || aNum > max){
            System.out.println("Outside of the range, try again.");
            return getInt(min, max);
        }
        return aNum;
    }

    public int getInt(){
        System.out.println("Give me an integer");
        return Integer.parseInt(scanner.nextLine());
    }
}
