package StudentOOP;

import java.util.ArrayList;

public class StudentInfo {
    String studentName;
    int studentAge;
    boolean studentSingle;
    String studentCity;
    ArrayList<String> studentFriends;

    public StudentInfo(String studentName, int studentAge, boolean studentSingle, String studentCity, ArrayList<String>studentFriends){
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentSingle = studentSingle;
        this.studentCity = studentCity;
        this.studentFriends = studentFriends;
    }
    public void introduce (){
        System.out.println("Hi there,\nMy name is " + studentName + ". I am " + studentAge + " years old.");
        if (studentSingle){
            System.out.println("I am single.");
        }else{
            System.out.println("I am in a relationship.");
        }
        System.out.println("My friends are: ");
        for (String studentFriend: studentFriends){
            System.out.println(studentFriend);
        }
    }
}