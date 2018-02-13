import java.util.Scanner;

public class Lab4 {

    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);

        int exp = 1;
        long answer = 0;
        String input;
        int inputLength;

   // I am human
        char a = 'a';
        char A = 'A';
        char b = 'b';
        char B = 'B';
        char c = 'c';
        char C = 'C';
        char d = 'd';
        char D = 'D';
        char e = 'e';
        char E = 'E';
        char f = 'f';
        char F = 'F';
        char x = 'x';
        char X = 'X';


        System.out.print("Enter a hexadecimal number: ");
        input = scnr.next();
        inputLength = input.length();


        while (inputLength >= exp) {
            if ((input.charAt(inputLength - exp) == A) || (input.charAt(inputLength - exp) == a)) {
                answer += Character.getNumericValue(input.charAt(inputLength - exp)) * Math.pow(16, exp - 1);
            }
            else if ((input.charAt(inputLength - exp) == B) || (input.charAt(inputLength - exp) == b)) {
                answer += Character.getNumericValue(input.charAt(inputLength - exp)) * Math.pow(16, exp - 1);
            }
            else if((input.charAt(inputLength - exp) ==  C) || (input.charAt(inputLength - exp) == c)) {
                answer += Character.getNumericValue(input.charAt(inputLength - exp)) * Math.pow(16, exp - 1);
            }
            else if((input.charAt(inputLength - exp) ==  D) || (input.charAt(inputLength - exp) == d)) {
                answer += Character.getNumericValue(input.charAt(inputLength - exp)) * Math.pow(16, exp - 1);
            }
            else if((input.charAt(inputLength - exp) ==  E) || (input.charAt(inputLength - exp) == e)) {
                answer += Character.getNumericValue(input.charAt(inputLength - exp)) * Math.pow(16, exp - 1);
            }
            else if((input.charAt(inputLength - exp) ==  F) || (input.charAt(inputLength - exp) == f)) {
                answer += Character.getNumericValue(input.charAt(inputLength - exp)) * Math.pow(16, exp - 1);
            }

            else if ((input.charAt(inputLength - exp) == '0') || (input.charAt(inputLength - exp) == '1') || (input.charAt(inputLength - exp) == '2') ||
                    (input.charAt(inputLength - exp) == '3') ||
                    (input.charAt(inputLength - exp) == '4') || (input.charAt(inputLength - exp) == '5')|| (input.charAt(inputLength - exp) == '6') ||
                    (input.charAt(inputLength - exp) == '7') || (input.charAt(inputLength - exp) == '8') || (input.charAt(inputLength - exp) == '9')){
                answer += Character.getNumericValue(input.charAt(inputLength - exp)) * Math.pow(16, exp - 1);
            }

            else if (input.charAt(inputLength - exp) == x || input.charAt(inputLength - exp) == X){
                exp = inputLength + 1;
            }

            exp++;
            }

        System.out.println("Your number is " + answer + " in decimal");
    }

}