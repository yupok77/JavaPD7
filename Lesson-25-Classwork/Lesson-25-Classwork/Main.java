class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    // Challenge1: Read in the file Original.txt and store it in a variable
    String msg = Input.readFile("Original.txt");
    
    // Encode the message and save to Encode.txt
    String encodedMsg = encode(msg);
    Input.writeFile("Encode.txt", encodedMsg);
    print("Encoded msg: " + encodedMsg);

    // Decode the encoded message and save to Decoded.txt
    encodedMsg = Input.readFile("Encode.txt");
    String decodedMsg = decode(encodedMsg);
    Input.writeFile("Decoded.txt", decodedMsg);
    print("Decoded msg: " + decodedMsg);
    
  }

  
  String encode(String txt){
    String bld = "";
    for(int x = 0; x <= txt.length() - 1; x++){
      char ch = txt.charAt(x);
      int ascii = (int)ch;
      ascii += 3;
      bld += (char)ascii;
    }
    return bld;
  }

  
  String decode(String txt){
    String bld = "";
    for(int x = 0; x <= txt.length() - 1; x++){
      char ch = txt.charAt(x);
      int ascii = (int)ch;
      ascii -= 3;
      bld += (char)ascii;
    }
    return bld;
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}
