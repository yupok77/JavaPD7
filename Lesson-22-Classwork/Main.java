class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
    String[] friends = {"Alice", "Bob", "Charlie", "Diana"};
    
    
    double[] celsiusTemps = {0.0, 20.0, 37.0, 100.0};
    double[] fahrenheitTemps = convert(celsiusTemps);
    
   
    for(int x = 0; x <= fahrenheitTemps.length - 1; x++){
      print(fahrenheitTemps[x]);
    }
  }


  double[] convert(double[] temps){
    double[] farh = new double[temps.length];
    
    for(int x = 0; x <= temps.length - 1; x++){
      farh[x] = celsiusToFarhenheit(temps[x]);
    }
    return farh;
  }

  

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
}