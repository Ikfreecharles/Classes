package StudentOOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Request student1Info = new Request();
        StudentInfo student1 = new StudentInfo(student1Info.name(), student1Info.age(), student1Info.isSingle(), student1Info.city(), student1Info.friends());
        student1.introduce();

        Request student2Info = new Request();
        StudentInfo student2 = new StudentInfo(student2Info.name(), student2Info.age(), student2Info.isSingle(), student2Info.city(), student2Info.friends());
        student2.introduce();
    }
}
