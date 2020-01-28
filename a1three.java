import java.util.Scanner;

public class a1three {

    //main method
    public static void main(String[] args) {
        //variable
        int choices;
        int capital;
        int option;
        int total;
        int count=0;

        boolean s;

        Scanner scan = new Scanner(System.in);
        System.out.println("do you want to play the quiz!? type true or false");
        s = scan.nextBoolean();

        if(s) {
        	//scanner for input options

            System.out.println("Q1) What is the capital of India?");

            //choose from these 4 options
            System.out.println("1) Delhi\r\n" + 
            		"2) Mumbai\r\n" + 
            		"3) Chennai\r\n" + 
            		"");
            capital = scan.nextInt();


            if (capital == 1) {
                //if select wrong options
                System.out.println("Congrats you answer is correct");
                capital++;
                count++;
            }
            else{
            	System.out.println("Your answer is incorrect. Delhi is the right answer .");
            }

            //Q2
            System.out.println("Q2) Can you store the value of String ( eg \"dog\" ) in a variable of type int?");

            //choose Yes or No
            System.out.println("1) yes\r\n" + 
            		"2) no\r\n" + 
            		"");
            option = scan.nextInt();

            if (option == 2) {
            	System.out.println("Congrate you answer is correct ");
                option++;
                count++;
            }
            else{
            	System.out.println("Your answer is incorrect. No is the right answer.");
            }  

            //Q3
            System.out.println("Q3) What is the result of 9+9/3?");
            System.out.println("1) 5\r\n" + 
            		"2) 12\r\n" + 
            		"3) 15/3\r\n" + 
            		"");
            total = scan.nextInt();


            if (total == 2) {
            	System.out.println("Congrate you answer is correct");
                total++;
                count++;
            }
            else{
            	System.out.println("Your answer is incorrect. 12 is the right answer.");
            }
            System.out.println(count +"out of 3");
        }
        else {
        	System.out.println("Bye bye");
        }

    }
} 