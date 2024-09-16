import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String[] letterGrades = {"A", "B", "C", "D", "F"};
        int[] numberGrades = {4,3,2,1,0};

        System.out.print("Please enter your grade: ");
        Scanner sc = new Scanner(System.in);
        theirGrade = sc.next();

        if (theirGrade = letterGrades[0]){
            System.out.println("Crushed it! You got an" + numberGrades[0]);
        }
        else if (theirGRade = letterGrades[1]){
            System.out.println("Well done, you got an" + numberGrades[1]);
        }
        else if (theirGRade = letterGrades[2]){
            System.out.println("A bit more studying wouldnt hurt, but " + numberGrades[2] + "'s get degrees!");
        }
        else if (theirGRade = letterGrades[3]){
            System.out.println("Better luck next time! Your grade is: " + numberGrades[3]);
        }
        else if (theirGRade = letterGrades[4]){
            System.out.println("Oh damn, it takes still to do that poorly. Enjoy your " + numberGrades[4]);
        }

    }
}