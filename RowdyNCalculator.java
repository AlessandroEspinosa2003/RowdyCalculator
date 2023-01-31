import java.util.Scanner;
class RowdyNCalculator{
public static void main(String[] args){

  Scanner scnr = new Scanner(System.in); //scanner variable
  int numOps; //variable for number of calculations
  double sum = 0.0; //variable for sum of all calculations

  System.out.println("UTSA - Fall 2022 - CS1083 - Section 005 - Project I - RowdyNCalculator - written by ALESSANDRO ESPINOSA");
  System.out.println();

  System.out.println("Please, input the number of calculations you want to perform: "); //number of calculations are prompted to the user and inputed
  numOps = scnr.nextInt();
    
  for(int i = 1; i <= numOps; i++){
    int intOne; //int variables for if integers are called for calculations
    int intTwo;
    double doubleOne; //double variables for if doubles are called for calculations
    double doubleTwo;
    char dataSymbol; //chars for assigning datatype and operations
    char opSymbol;

    System.out.println("Operation number " + i);
    
    System.out.println("Please, select your choice of datatype of operation (i-integer, d-double): "); //datatype is selected by user
    dataSymbol = scnr.next().charAt(0);

    if(dataSymbol == 'i'){//branch for integer datatype
      System.out.println("Please, input the first integer value: ");
      intOne = scnr.nextInt(); //int number one is inputed

      System.out.println("Please, input the character of operation (+, -, *, /, %):");
      opSymbol = scnr.next().charAt(0); //operation type is inputed
      
      System.out.println("Please, input the second integer value: ");
      intTwo = scnr.nextInt(); //int number two is inputed

      if(opSymbol == '+'){//integer addition
        int total = intOne + intTwo;
        System.out.println("The result of adding " + intOne + " and " + intTwo + " is: " + total);
        sum = sum + total;  // all "sum =" lines add the end calculation of each operation branch to overall summation for int and double datatypes
      }
      else
        if(opSymbol == '-'){//integer subtraction
          int difference = intOne - intTwo;
          System.out.println("The result of subtracting " + intOne + " from " + intTwo + " is: " + difference);
          sum = sum + difference;  
        }
        else
        if(opSymbol == '*'){//integer multiplication
          int product = intOne * intTwo;
          System.out.println("The result of multiplying " + intOne + " and " + intTwo + " is: " + product);
          sum = sum + product;  
        }
        else
        if(opSymbol == '/'){//integer division
          int quotient = intOne / intTwo;
          System.out.println("The result of dividing " + intOne + " by " + intTwo + " is: " + quotient);
          sum = sum + quotient;  
        }
        else
        if(opSymbol == '%'){//integer modulo
          int modProd = intOne % intTwo;
          System.out.println("The result of modulo operation of " + intOne + " by " + intTwo + " is: " + modProd);
          sum = sum + modProd; 
        }
        else
        System.out.println("An incorrect operator has been inputed.");  // error print for wrong datatype char input
      
    } 
    else
    if(dataSymbol == 'd'){//double datatype branch
      System.out.println("Please, input the first double value: ");
      doubleOne = scnr.nextDouble();//first double is  inputed

      System.out.println("Please, input the character of operation (+, -, *, /, %):");
      opSymbol = scnr.next().charAt(0);//operation char is inputed
      
      System.out.println("Please, input the second double value: ");
      doubleTwo = scnr.nextDouble();//second double is inputed

      if(opSymbol == '+'){//double addition
        double total = doubleOne + doubleTwo;
        System.out.print("The result of adding " + doubleOne + " and " + doubleTwo + " is: ");
        System.out.printf("%,.3f", total);
        System.out.println();  
        sum = sum + total;  
      }
      else
      if(opSymbol == '-'){//double subtraction
          double difference = doubleOne - doubleTwo;
          System.out.println("The result of subtracting " + doubleOne + " from " + doubleTwo + " is: " + difference);
          System.out.printf("%,.3f", difference);
          System.out.println();
          sum = sum + difference;  
        }
        else
        if(opSymbol == '*'){//double multiplication
          double product = doubleOne * doubleTwo;
          System.out.println("The result of multiplying " + doubleOne + " and " + doubleTwo + " is: " + product);
          System.out.printf("%,.3f", product);
          System.out.println(); 
          sum = sum + product;  
        }
        else
        if(opSymbol == '/'){//double division
          double quotient = doubleOne / doubleTwo;
          System.out.println("The result of dividing " + doubleOne + " by " + doubleTwo + " with only 3 decimal is: ");
          System.out.printf("%,.3f", quotient);
          System.out.println();
          sum = sum + quotient;  
        }
        else
        if(opSymbol == '%'){//double modulo
          double modProd = doubleOne % doubleTwo;
          System.out.println("The result of modulo operation of " + doubleOne + " by " + doubleTwo + " is: " + modProd);
          System.out.printf("%,.3f", modProd);
          System.out.println();
          sum = sum + modProd; 
        }
        else
        System.out.println("An incorrect operator has been inputed."); //wrong char input for operations print       
    }
    else{
      System.out.println("An incorrect datatype has been inputed."); //wrong datatype error print
    }
    
  }
  
  System.out.println("Thank you for using the RowdyNCalculator");//end message
  System.out.print("The sum result of all " + numOps + " operations is: "); //prints overall sum of calculations
  System.out.printf("%,.3f", sum);
  }
}