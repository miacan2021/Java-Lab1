class Number1 {
public static void main(String agrs[]) {
       totalSum(1,4);
}
public static void totalSum(int a, int b){
    System.out.println(a + b);
}
}

class Number2 {
    public static void main(String agrs[]) {
        getGrades(88);
 }
    public static void getGrades(int n){
        if(n > 90) {
                System.out.println("A+");}
            else if(n > 80) {
                System.out.println("A-");
            }else if(n > 70){
                System.out.println("B+");
            }else if(n > 60){
                System.out.println("B-");
            }else if(n > 50){
                System.out.println("C+");
            }else if(n > 40){
                System.out.println("D-");
            }else{
                System.out.println("Fail");
            }
    }
}

class Number3 {
    public static void main(String agrs[]) {
        System.out.println(factorial(5));
    }
  
    public static int factorial(int n){
       if (n <= 2) {
           return n;
       }
       return n * factorial(n-1);   
    }
}

class Number4 {
    public static void main(String agrs[]) {
        System.out.println(pentagon(5,5));
    }
    public static double pentagon(int n, double a){
        return  (n * a * a) / (4 * Math.tan(Math.PI/n));
    }
}