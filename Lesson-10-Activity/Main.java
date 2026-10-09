
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init() {
    System.out.println(gpa(95));

    if (isGraduating(12, 44))
      System.out.println("Student is Graduating");
    else
      System.out.println("Student is NOT Graduating");

    System.out.println(BMI(150, 68));

    System.out.println(shippingCost(30));

    System.out.println(blueOrViolet(650));
  }

  double gpa(double gpa) {
    if (gpa > 90)
      return gpa * 1.1;
    else
      return gpa;
  }

  
  boolean isGraduating(int grade, int credits) {
    if (grade == 12 && credits >= 44)
      return true;
    else
      return false;
  }

  String BMI(double weight, double height) {
    double bmi = (weight * 703) / (height * height);

    if (bmi <= 18.4)
      return "Underweight";
    else if (bmi <= 24.9)
      return "Normal";
    else if (bmi <= 39.9)
      return "Overweight";
    else
      return "Obese";
  }

  
  double shippingCost(double weight) {
    if (weight <= 10)
      return 0.00;
    else if (weight <= 15)
      return 5.00;
    else if (weight <= 25)
      return 10.00;
    else
      return 10.00 + (weight - 25) * 0.02;
  }

  boolean blueOrViolet(double frequency) {
    if ((frequency >= 600 && frequency <= 670) ||
        (frequency >= 700 && frequency <= 750))
      return true;
    else
      return false;
  }
}

