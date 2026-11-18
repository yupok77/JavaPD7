class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  int allowance(){
    double money = 0.01;
    int days = 1;
    
    while(money < 5.00){
      money = money * 2;
      days++;
    }
    
    return days;
  }


  void addTwoNumbers(){
    int num1 = randInt(1, 50);
    int num2 = randInt(1, 50);
    int correctSum = num1 + num2;
    int guess = 0;
    
    print("What is " + num1 + " + " + num2 + "?");
    print("Answer: ");
    guess = Input.readInt();
    
    while(guess != correctSum){
      print("Incorrect, try again!");
      print("Answer: ");
      guess = Input.readInt();
    }
    
    print("Correct!");
  }

 
  int GCF(int a, int b){
    int gcf = 1;
    int smaller = Math.min(a, b);
    
    for(int i = 1; i <= smaller; i++){
      if(a % i == 0 && b % i == 0){
        gcf = i;
      }
    }
    
    return gcf;
  }

  
  void menu(){
    print("Welcome Looney Tune's System");
    print("Select from the following choices:");
    print("1 - Allowance");
    print("2 - Addition game");
    print("3 - Calculate the GCF of two integers");
    print("4 - Exit Looney Tune System");
    printt("Choice: ");
  }


  void init(){
    int choice = 0;
    
    while(choice != 4){
      menu();
      choice = Input.readInt();
      
      if(choice == 1){
        int days = allowance();
        print("It takes " + days + " days to reach or surpass $5.00.");
      }else if(choice == 2){
        addTwoNumbers();
      }else if(choice == 3){
        printt("Enter first integer: ");
        int n1 = Input.readInt();
        printt("Enter second integer: ");
        int n2 = Input.readInt();
        print("The GCF is: " + GCF(n1, n2));
      }else if(choice == 4){
        print("Goodbye!");
      }else{
        print("Invalid choice. Please select 1-4.");
      }
      print(""); // Blank line for spacing
    }
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}