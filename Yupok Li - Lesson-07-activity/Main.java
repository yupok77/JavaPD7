
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
  System.out.println("Enter value for a:");
    double a = Input.readDouble();

    System.out.println("Enter value for b:");
    double b = Input.readDouble();

    System.out.println("Enter value for c:");
    double c = Input.readDouble();


    double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

    System.out.println("x1 is: " + x1);
    System.out.println("x2 is: " + x2);

/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
  System.out.println("Enter the value of x:");
    double x = Input.readDouble();


    double y = Math.pow(x, 7); 

    System.out.println("The value of y is: " + y);

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/

 System.out.println("Enter the value of z:");
    double z = Input.readDouble();

    double q = Math.pow(z, 3) + 5;

    System.out.println("The value of q is: " + q);


/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/

 System.out.println("Enter the value of t:");
double t = Input.readDouble();

System.out.println("Enter the value of r:");
double r = Input.readDouble();


double s = Math.pow(t, 5) * Math.pow(r + 2, 4);

System.out.println("The value of s is: " + s);

/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/

System.out.println("Enter the value of A:");
double A = Input.readDouble();

System.out.println("Enter the value of B:");
double B = Input.readDouble();


double C = Math.sqrt(A + B);

System.out.println("The value of C is: " + C);


/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/

System.out.println("Enter x1:");
double x11 = Input.readDouble();

System.out.println("Enter x2:");
double x22 = Input.readDouble();

System.out.println("Enter y1:");
double y11 = Input.readDouble();

System.out.println("Enter y2:");
double y22 = Input.readDouble();

double d = Math.sqrt(Math.pow(x22 - x11, 2) + Math.pow(y22 - y11, 2));

System.out.println("The value of d is: " + d);



/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/




/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}