package bollean;

import java.util.Scanner;

public class Bollean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("Enter your test score: ");

		Scanner Scan = new Scanner(System.in);
        int score = Scan.nextInt();
        char grade = ' ';//I'm not hopeful
        char plus = ' ';
        if (score > 89){
        	grade = 'A';
        	
        }
     
        else if (score > 79){
        	grade = 'B';
        }
        else if (score > 69){
        	grade = 'C';
        	}
        else if (score > 60 && score <69){
        	grade = 'D';
        	}
        else {
        	grade = 'F';
        	}

        
        
        if (score % 10 >= 0 && score % 10 < 3) {
        	plus = '-';
        	System.out.printf("your grade is %s%s\n", grade, plus);
        	
        }
        if (score % 10 > 6) {
        	plus = '+';
        
        	System.out.printf("your grade is %s%s\n", grade, plus);
        }
        else {
        
        }
        if (score > 69)
        	System.out.println("Very good! You don't have to retake the exam!");
        else
        	System.out.println("Did you even look at the book?");
   
	}

}
