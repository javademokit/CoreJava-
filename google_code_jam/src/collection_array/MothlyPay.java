package collection_array;

import java.text.NumberFormat;
import java.util.Scanner;

public class MothlyPay {

   public static double calculateMonthlyPayment(
      int loanAmount, int termInYears, double interestRate) {

      // Convert interest rate into a decimal
      // eg. 6.5% = 0.065

      interestRate /= 100.0;

      // Monthly interest rate 
      // is the yearly rate divided by 12

      double monthlyRate = interestRate / 12.0;

      // The length of the term in months 
      // is the number of years times 12

      int termInMonths = termInYears * 12;

      // Calculate the monthly payment
      // Typically this formula is provided so 
      // we won't go into the details

      // The Math.pow() method is used calculate values raised to a power

      double monthlyPayment = 
         (loanAmount*monthlyRate) / 
            (1-Math.pow(1+monthlyRate, -termInMonths));

      return monthlyPayment;
   }

   public static void main(String[] args) {

      // Scanner is a great class for getting 
      // console input from the user

      Scanner scanner = new Scanner(System.in);

      // Prompt user for details of loan

      System.out.print("Enter loan amount: ");
      int loanAmount = scanner.nextInt();

      System.out.print("Enter loan term (in years): ");
      int termInYears = scanner.nextInt();

      System.out.print("Enter interest rate: ");
      double interestRate = scanner.nextDouble();

      // Display details of loan

      double monthlyPayment = calculateMonthlyPayment(loanAmount, termInYears, interestRate);
      double totalPayed = 0;
      int month = 1;
      double loanAmountRemaining = 0;
      // NumberFormat is useful for formatting numbers
      // In our case we'll use it for 
      // formatting currency and percentage values
      while(totalPayed <= loanAmount){
          totalPayed = totalPayed + monthlyPayment;
          double totalLoanAmount =  loanAmount + interestRate;
          loanAmountRemaining = totalLoanAmount - totalPayed;
          month ++;
      }
      if(monthlyPayment > loanAmount)
          totalPayed = totalPayed + loanAmountRemaining;
  

      // Display details of the loan
 //HERE IS THE ISSUE BELOW, I CANT GET IT TO DISPLAY THE AMOUNT OF PAYMENTS FOR (x) MONTHS AND FOR IT TO DISPLAY THE REST OF THE INFO WITH IT FOR THE FOLLOWING VARIABLE LISTED IN THE PRINTF STATEMENT.
 
  System.out.println( monthlyPayment +", "+ interestRate + ", "+loanAmount+", "+ loanAmountRemaining + ",");
   }
}