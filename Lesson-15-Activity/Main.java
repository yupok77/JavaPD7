class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){ 

    System.out.println(spaces(5) + "DONE");
    System.out.println(harmonic(4));
    System.out.println("Sine: "+sine(6,Math.PI/6));
    
  }

   String spaces(int N) {
    String str = "";
    for (int i = 0; i < N; i++) {
      str += " ";
    }
    return str;
  }

   double harmonic(int N) {
    double sum = 0.0;
    for (int i = 1; i <= N; i++) {
      sum += 1.0 / i;
    }
    return sum;
  }
    
  double sine(int N, double x){
    double sum=0;
    int sign=1;
    for(int i=1; i<2*N;i+=2){
      sum+= sign * Math.pow(x,i)/fact(i);
      sign*=-1;
    }
    return sum;
  }
  
    double fact(int num) {
    double result = 1.0;
    for (int i = 1; i <= num; i++) {
        result *= i;
    }
    return result;

  
  }
}


