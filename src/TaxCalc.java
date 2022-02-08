import java.util.Scanner;
import java.text.DecimalFormat;
public class TaxCalc {
	
	public  static void main(String args []) {
	  double income;
	  double salary;
	  final double  taxrate1 = 0.18;
	  final double 	basetax1 = 38916;
	  final double basetax2 = 70532;
	  final double basetax3 = 110739;
	  final double basetax4 = 163335; 
	  final double basetax5 = 229089;
	  final double basetax6 = 587593; 
	  
	  
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
	  System.out.println("Welcome To The SARS Tax Calculator");
	  System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
	  System.out.println("Bare in mind this Tax Calcutalor only used for tax purposes, other funds included");
	  System.out.println("--------------------------------------");
	  System.out.println("--------------------------------------");
	  System.out.println("Enter Your Salary (Annually)");
	  System.out.println("=======================================");
	  
	  try {
		  
		  salary = scan.nextDouble();
		  
	  if (salary <= 0 ) {
		  System.out.println("Insufficent Funds :( ");
		 
	  }else if (salary >= 1 && salary <= 87000) {
		  System.out.println("You do not pay any taxes:");
		  System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		  System.out.println("Thank you for using SARS Tax Calculator");
		  System.out.println("Have a Wonderful Stress Free Day :) ");
	  }
	  else if(salary >= 87001 && salary < 216199) {
		  income = salary * taxrate1;
		  System.out.println("Your salary with deductions are: R" + (salary - income) + " Annually");
		  System.out.println("Your salary with deductions are: R" + (salary / 12) + " Monthly");
		  System.out.println("\n");
		  System.out.println("Your tax is: R"+ income + " annually ");
		  System.out.println("\n");
		  System.out.println("Your tax is: R"+ (income/12) +" monthly ");
		  System.out.println("\n");
		  System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		  System.out.println("Thank you for using SARS Tax Calculator");
		  System.out.println("Have a Wonderful Stress Free Day :) ");
		  
	  }else if (salary > 216200 && salary < 337799) {
		  income = basetax1 + (salary - 216200) * 0.26;
		  System.out.println("Your salary with deductions are: R" + (salary - income) + " Annually");
		  System.out.println("Your salary with deductions are: R" + (salary / 12) + " Monthly");
		  System.out.println("\n");
		  System.out.println("Your tax is: R"+ income + " annually ");
		  System.out.println("\n");
		  System.out.println("Your tax is: R"+ (income/12) +" monthly ");
		  System.out.println("\n");
		  System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		  System.out.println("Thank you for using SARS Tax Calculator");
		  System.out.println("Have a Wonderful Stress Free Day :) ");
		  
	  }else if(salary > 337800 && salary < 467499) {
		  income = basetax2 + (salary - 337800) * 0.31;
		  System.out.println("Your salary with deductions are: R" + (salary - income) + " Annually");
		  System.out.println("Your salary with deductions are: R" + (salary / 12) + " Monthly");
		  System.out.println("\n");
		  System.out.println("Your tax is: R"+ income + " annually ");
		  System.out.println("\n");
		  System.out.println("Your tax is: R"+ (income/12) +" monthly ");
		  System.out.println("\n");
		  System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		  System.out.println("Thank you for using SARS Tax Calculator");
		  System.out.println("Have a Wonderful Stress Free Day :) ");
		  
	  }else if (salary > 467500 && salary < 613599) {
		  income = basetax3 + (salary - 467500)*0.36;
		  System.out.println("Your salary with deductions are: R" + (salary - income) + " Annually");
		  System.out.println("Your salary with deductions are: R" + (salary / 12) + " Monthly");
		  System.out.println("\n");
		  System.out.println("Your tax is: R"+ income + " annually ");
		  System.out.println("\n");
		  System.out.println("Your tax is: R"+ (income/12) +" monthly ");
		  System.out.println("\n");
		  System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		  System.out.println("Thank you for using SARS Tax Calculator");
		  System.out.println("Have a Wonderful Stress Free Day :) ");
		  
	  }else if (salary > 613600 && salary < 782199) {
		  income = basetax4 +(salary - 613600)*0.39;
		  System.out.println("Your salary with deductions are: R" + (salary - income) + " Annually");
		  System.out.println("Your salary with deductions are: R" + (salary / 12) + " Monthly");
		  System.out.println("\n");
		  System.out.println("Your tax is: R"+ income + " annually ");
		  System.out.println("\n");
		  System.out.println("Your tax is: R"+ (income/12) +" monthly ");
		  System.out.println("\n");
		  System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		  System.out.println("Thank you for using SARS Tax Calculator");
		  System.out.println("Have a Wonderful Stress Free Day :) ");

	  }else if (salary > 782200 && salary < 1656599) {
		  income = basetax5 + (salary - 782200)*0.41;
		  System.out.println("Your salary with deductions are: R" + (salary - income) + " Annually");
		  System.out.println("Your salary with deductions are: R" + (salary / 12) + " Monthly");
		  System.out.println("\n");
		  System.out.println("Your tax is: R"+ income + " annually ");
		  System.out.println("\n");
		  System.out.println("Your tax is: R"+ (income/12) +" monthly ");
		  System.out.println("\n");
		  System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		  System.out.println("Thank you for using SARS Tax Calculator");
		  System.out.println("Have a Wonderful Stress Free Day :) ");
		 
	  }else {
		  income = basetax6 + (salary - 1656600)*0.45;
		  System.out.println("Your salary with deductions are: R" + (salary - income)+ " Annually");
		  System.out.println("Your salary with deductions are: R" + (salary / 12) + " Monthly");
		  System.out.println("\n");
		  System.out.println("Your tax is: R"+ income + " annually ");
		  System.out.println("\n");
		  System.out.println("Your tax is: R"+ (income/12) +" monthly ");
		  System.out.println("\n");
		  System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		  System.out.println("Thank you for using SARS Tax Calculator");
		  System.out.println("Have a Wonderful Stress Free Day :) ");
	  }
	  
	  }catch(Exception e) {
		  System.out.println("Invalid Input");
		  System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		  System.out.println("Re-run program & try again");
	  }
 }
}
