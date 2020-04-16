import java.util.Scanner;

public class Debug {

    private char grade;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your testscore:");
        int testscore = sc.nextInt();
        char grade = 0;

        if(testscore>=90){
            grade = 'A';
        }else if(testscore>=80 && testscore<90){
            grade = 'B';
        }
        else if(testscore>=70 && testscore<80){
            grade = 'C';
                    }
        else if(testscore>=60 && testscore<70)
            grade = 'D';

            else if (testscore>=50 && testscore<60)
                    grade = 'D';

        System.out.println("Grade = " + grade);
    }
        }




//Pseudocode
//If the average of marks is >= 80 then prints Grade ‘A’
//If the average is <80 and >=60 then prints Grade ‘B’
//If the average is <60 and >=40 then prints Grade ‘C’
//else prints Grade ‘D’