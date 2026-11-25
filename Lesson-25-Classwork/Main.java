class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    
    String msg = Input.readFile("Original.txt");
    
    
    String encodedMsg = encode(msg);
    Input.writeFile("Encode.txt", encodedMsg);
    print("Encoded msg: " + encodedMsg);

    encodedMsg = Input.readFile("Encode.txt");
    String decodedMsg = decode(encodedMsg);
    Input.writeFile("Decoded.txt", decodedMsg);
    print("Decoded msg: " + decodedMsg);

   
    String cycleEncodedMsg = encodeCycle(msg);
    Input.writeFile("EncodeCycle.txt", cycleEncodedMsg);
    print("Cycle Encoded msg: " + cycleEncodedMsg);
    
  }

  
  String encode(String txt){
    String bld = "";
    int ascii = 0;
    for(int x = 0; x <= txt.length() - 1; x++){
      ascii = (int)txt.charAt(x);
      ascii += 3;
      bld += (char)ascii;
    }
    return bld;
  }

  
  String decode(String txt){
    String bld = "";
    int ascii = 0;
    for(int x = 0; x <= txt.length() - 1; x++){
      ascii = (int)txt.charAt(x);
      ascii -= 3;
      bld += (char)ascii;
    }
    return bld;
  }

  
  String encodeCycle(String txt){
    String bld = "";
    int ascii = 0;

    for(int x = 0; x <= txt.length() - 1; x++){
      ascii = (int)txt.charAt(x);

      if(x % 3 == 0){
        ascii += 1;
      }
      else if(x % 3 == 1){
        ascii += 2;
      }
      else{
        ascii += 3;
      }

      bld += (char)ascii;
    }
    return bld;
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}
