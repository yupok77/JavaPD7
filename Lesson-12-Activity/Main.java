class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }

  void init() {
    System.out.println(creditCardType("4123456789012345")); 
    System.out.println(creditCardType("341234567890123")); 

    System.out.println(pigLatin("pig"));  

    System.out.println(nycLocate("10023"));

    System.out.println(getMonth("07/21/2023")); 

    System.out.println(validatePswd("abc12!"));
    System.out.println(validatePswd("a*b"));     
  }

  String creditCardType(String ccNum) {
    if (ccNum.substring(0, 1).equals("4")) {
      return "Visa";
    } 
    
    if (ccNum.substring(0, 2).equals("34") || ccNum.substring(0, 2).equals("37")) {
      return "American Express";
    } else if (ccNum.substring(0, 2).equals("36")) {
      return "Diners Club";
    } else if (ccNum.substring(0, 2).equals("51") || ccNum.substring(0, 2).equals("55")) {
      return "Mastercard";
    } else if (ccNum.substring(0, 2).equals("65") || ccNum.substring(0, 4).equals("6011")) {
      return "Discover";
    }
    
    return "Unknown Card Type";
  }

  String pigLatin(String word) {
    String firstLetter = word.substring(0, 1);
    String remainingLetters = word.substring(1);
    return remainingLetters + firstLetter + "ay";
  }

  String nycLocate(String zipCode) {
    String prefix = zipCode.substring(0, 3);
    
    if (prefix.equals("100") || prefix.equals("101") || prefix.equals("102")) {
      return "Manhattan";
    } else if (prefix.equals("103")) {
      return "Staten Island";
    } else if (prefix.equals("104")) {
      return "Bronx";
    } else if (prefix.equals("112")) {
      return "Brooklyn";
    } else if (prefix.equals("113") || prefix.equals("114") || prefix.equals("111")) {
      return "Queens";
    }
    
    return "Unknown NYC Location";
  }

  String getMonth(String date) {
    String monthNum = date.substring(0, 2);
    
    if (monthNum.equals("01")) return "January";
    else if (monthNum.equals("02")) return "February";
    else if (monthNum.equals("03")) return "March";
    else if (monthNum.equals("04")) return "April";
    else if (monthNum.equals("05")) return "May";
    else if (monthNum.equals("06")) return "June";
    else if (monthNum.equals("07")) return "July";
    else if (monthNum.equals("08")) return "August";
    else if (monthNum.equals("09")) return "September";
    else if (monthNum.equals("10")) return "October";
    else if (monthNum.equals("11")) return "November";
    else if (monthNum.equals("12")) return "December";
    
    return "Invalid Month";
  }

  boolean validatePswd(String pswd) {
    if (pswd.length() < 5 || pswd.length() > 8) {
      return false;
    }
    
    if (pswd.indexOf("^") != -1) return false;
    else if (pswd.indexOf("*") != -1) return false;
    else if (pswd.indexOf("(") != -1) return false;
    else if (pswd.indexOf(")") != -1) return false;
    
    return true;
  }
}
