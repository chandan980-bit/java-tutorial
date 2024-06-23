import java.util.*;
public class Function{
    //1. Binary number Convert To Decimal number
    public static void BinToDec(int num){
        int temp = num;
        int bin = 0;
        int pow = 0;
        while(num > 0){
            int rem = num % 2;
            bin = bin + rem * (int)Math.pow(10,pow);
            pow++;
            num = num / 2;
        }
        System.out.println(temp+" Number in Decimal form is : " + bin);
    }
    //2. Decimal number Convert To  Binary number

    public static void DecToBin(int num){
        int temp = num;
        int bin = 0;
        int pow = 0;
        while(num > 0){
            int rem = num % 10;
            bin = bin + rem * (int)Math.pow(2,pow);
            pow++;
            num = num / 10;
        }
        System.out.println(temp+" Decimal Number in Binary form is : " + bin);
    }

    //3. Sum of two number
    public static void Sum(int a,int b){
        int c = a + b;
        System.out.println("Sum of the Two Number is : "+c); 
    }
    //4. Swapping between two number
    public static void Swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of First number : " + a);
        System.out.println("Value of Second Number : " + b);
    }
    //5. Product of two number
     public static void Product(int a,int b){
        int mul = a*b;
        System.out.println("Multiplication of two number : "+ mul);
    }
    //6. Factorial of the number
    public static void fact(int a){
        int val = 1;
        for(int i =1;i<=a;i++){
            val = val * i;
        }
        System.out.println("Factorial of " + a + " is : "+ val);
    }

    //7. Binomial Co-efficient            n(C)r      =         n!  / r!(n-r)!
    public static int Fact(int a){
        int val = 1;
        for(int i =1;i<=a;i++){
            val = val * i;
        }
        return val;
    }
    public static void BinoCof(int a,int b){
        int fact_a = Fact(a);
        int fact_b = Fact(b);
        int fact_amb = Fact(a-b);
        int res = fact_a / (fact_b*(fact_amb));
        System.out.println("Binomial Co-efficient is : "+res);
    }

    // 8.Parameter OverLooading
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    // 9.DataType OverFlowing
    public static int add(int a,int b){
        return a+b;
    }
    public static float add(float a,float b){
        return a+b;
    }

    // 10.Prime or Not Prime
    public static void checkPrime(int a){
        if(a == 2){
            System.out.println(a + " is a Prime Number ...");
            return;
        }
        int count = 1;
        for(int i = 2;i < a ;i++){
            if((a % i) == 0){
                count ++;
            } 
        }
        if(count == 1){
            System.out.println(a + " is a Prime Number ...");
        }
        else{
            System.out.println(a + " is not a Prime Number ....");
        }
    }
    // Optimise Process for Prime number
    public static void checkPrimeO(int b){
        if(b == 2){
            System.out.println(b + " is a Prime Number ...");
            return;
        }
        int count = 1;
        for(int i = 2;i < Math.sqrt(b) ;i++){
            if((b % i) == 0){
                count ++;
            } 
        }
        if(count == 1){
            System.out.println(b + " is a Prime Number ...");
        }
        else{
            System.out.println(b + " is not a Prime Number ....");
        }
    }

    // 11. Range of Prime Number 
    public static boolean Prime(int a){
        boolean num = true;
        if(a == 2){
            return true;
        }
        for(int i = 2;i< Math.sqrt(a);i++){
            if(a % 2 == 0){
                return false;
            }
        }
        return true;
    }
    public static void Range(int a){
        System.out.print("The Prime number in "+a+" are : ");
        for(int i = 2; i <= a;i++){
            if(Prime(i) == true){
                System.out.print(i +" ");
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : "); 
        int a = sc.nextInt();
        System.out.println("Enter Second number : "); 
        int b = sc.nextInt();
        System.out.println("Enter Third number : ");
        int c = sc.nextInt();
        BinToDec(8);
        System.out.println();
        DecToBin(111);
        // System.out.println();
        // Sum();
        System.out.println();
        Swap(a,b);
        System.out.println();
        Product(a,b);
        System.out.println();
        fact(a);
        System.out.println();
        BinoCof(a,b);
        System.out.println();
        System.out.println(" Sum of Two number is : "+ sum(a,b));
        System.out.println(" Sum of Three number is : "+ sum(a,b,c));
        System.out.println();
        System.out.println("Addition of two float number is : " + add(a,b));
        System.out.println("Addition of two float number is : " + add(a,b));        //For Float
        System.out.println();
        checkPrime(a);
        checkPrimeO(b);
        System.out.println();
        System.out.println(Prime(a));
        System.out.println();
        Range(a);
    }
}