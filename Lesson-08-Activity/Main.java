class Main {

    public static void main(String[] args) {
        (new Main()).init();
    }

    void init() {
        
       
        System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheit = Input.readDouble();
        double celsius = FtoC(fahrenheit);
        System.out.println("The value in Celsius is: " + celsius + "");

        // --- Challenge 3: Volume of a Sphere ---
        System.out.println("Enter sphere radius:");
        double radius = Input.readDouble();
        double sVolume = sphereVolume(radius);
        System.out.println("The volume of the sphere is: " + sVolume + "");

        // --- Challenge 4: Volume of a Cone ---
        System.out.println("Enter cone radius:");
        double coneRadius = Input.readDouble();
        System.out.println("Enter cone height:");
        double coneHeight = Input.readDouble();
        double cVolume = coneVolume(coneRadius, coneHeight);
        System.out.println("The volume of the cone is: " + cVolume + "");

        // --- Challenge 5: Distance Formula ---
        System.out.println("Enter x1:");
        double x11 = Input.readDouble();

        System.out.println("Enter x2:");
        double x22 = Input.readDouble();

        System.out.println("Enter y1:");
        double y11 = Input.readDouble();

        System.out.println("Enter y2:");
        double y22 = Input.readDouble();

        double d = distance(x11, y11, x22, y22);
        System.out.println("The value of d is: " + d);
    }

    
    void print(String message) {
        System.out.println(message);
    }

   
    double FtoC(double fahrenheit) {
        double result = (fahrenheit - 32) * 5.0 / 9.0;
        return result;
    }

    
    double sphereVolume(double radius) {
        double result = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return result;
    }

   
    double coneVolume(double radius, double height) {
        double result = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
        return result;
    }

    
    double distance(double x1, double y1, double x2, double y2) {
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return result;
    }
}
