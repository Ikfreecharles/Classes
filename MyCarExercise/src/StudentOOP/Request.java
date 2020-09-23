package StudentOOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Request {
    Scanner scanner = new Scanner(System.in);

    public String name(){
        System.out.println("What is your name?");
        return scanner.nextLine();
    }
    public int age(){
        System.out.println("How old are you?");
        return scanner.nextInt();
    }
    public boolean isSingle(){
        System.out.println("Are you single? true | false");
        return scanner.nextBoolean();
    }
    public String city(){
        System.out.println("Which city do you live in?");
        scanner.next();
        return scanner.nextLine();
    }
    public ArrayList<String> friends(){
        System.out.println("List your friends here. When done, hit '-1'");
        ArrayList<String> friends = new ArrayList<>();
        while(!friends.contains("-1")){
            friends.add(scanner.nextLine());
        }
        friends.remove("-1");
        return friends;
    }
}
