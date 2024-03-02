// First Program in Java
/*public class main{
    public static void main(String args[]) {
        System.out.println("Hello World..!");
        System.out.print("Hello Coders..!");
    }
}*/

// Print the Pattern using println

/*public class main{
    public static void main(String args[]){
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
    }
}*/

//Input in java

/*import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(a);
    }
}*/

//import java.util.Scanner;  // Import the Scanner class

/*public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        int a = sc.nextInt();
        System.out.print("The Number is : " + a);
    }
}*/

// String Input
/*import java.util.Scanner;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Name : ");
        String UserName = sc.nextLine();
        System.out.println("The Username is : " + UserName);
    
    }
}*/

// If lese conditional statements

/*import java.util.*;
public class main{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Age : ");
        int age = sc.nextInt();
        
        if (age >= 18){
            System.out.println("The Person is Adult.");
        }else{
            System.out.println("The Person is Non Adult.");
            
        }
    }
}*/

// Else if

/*import java.util.*;
public class main{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Age : ");
        int age = sc.nextInt();
        
        if (age > 100){
            System.out.println("Invalid Age");
        }else if ( age >= 18) {
            System.out.println("The Person is Adult");
        }else{
            System.out.println("The Person is Not Adult.");
            
        }
    }
}*/

// Swith and break statements in Java

/*import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Button");
        int Button = sc.nextInt();
        
        switch(Button){
            case 1 : System.out.println("Hello");
            break;
            
            case 2 : System.out.println("Namaste");
            break;
            
            case 3 : System.out.println("Bonjure");
            break;
            
            default : System.out.println("Invalide");
        }
    }
}*/

// Loops In java 

// Print Hello Coders 100 times

/*public class main{
    public static void main(String args[]){
        
        for( int i = 0; i < 100; i++){
            System.out.println("Hello Coders..!");
        }
    }
}*/

// Print 1 to 50 numbers 

/*public class main{
    public static void main(String args[]){
        for( int i = 1; i <= 50; i++){
            System.out.println(i);
        }
    }
}*/

// while loop

// Print the numbers 1 to 20
/*public class main{
    public static void main(String args[]){
        int i = 0; 
        while(i <= 20){
            System.out.println(i);
            i++;
        }
    }
}*/

// Do While loop

/*public class main{
    public static void main(String args[]){
        
        int i = 0;
        do{
            System.out.println(i); i++;
        } while( i < 21);
    }
}*/

// Print the sum of first natural numbers

/* import java.util.Scanner;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.print("Plese Enter the N : ");
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i = 0; i <= n; i++){
            sum = sum + i;
            }
            
            System.out.print(sum);
    }
}*/

// Print the table of Number takes by user

/*import java.util.Scanner;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        int n = sc.nextInt();
        //int i = 1;
        for(int i = 1; i <= 10; i++){
        System.out.println(n * i);   
        }
        
    }
}*/

// Patterns Questions In Java
// Solid Rectangle Patterns
/*import java.util.Scanner;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N : ");
        int n = sc.nextInt();
        System.out.println("Enter the M : ");
        int m = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            for( int j = 1; j <=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}*/


// Print the pattern

/*import java.util.Scanner;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}*/

// half Pyramid pattern

/*import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the value of N : ");
        int n = sc.nextInt();
        
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}*/

// Reverse half pyramid pattern

/*import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the value of N : ");
        int n = sc.nextInt();
        
        for(int i = n; i >= 1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}*/

// Print the pattern
/*import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

// Print the pattern

/*public class main{
    public static void main(String args[]){
        int n = 7; 
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}*/

// Print the pattern

/*public class main{
    public static void main(String args[]){
        int n = 7; 
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}*/

// Print the numbers in pattern

/* public class main{
    public static void main(String args[]){
        int n = 5;
        int numbers = 1;
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(numbers + " ");
                numbers++;
            }
            System.out.println();
        }
    }
}*/ 

// Print the pattern

/*public class main{
    public static void main(String args[]){
        int n = 5; 
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                int sum = i +j;
                if( sum % 2 == 0){
                    System.out.print("1" + " ");
                }else{ System.out.print("0" + " ");
                }
            }
            System.out.println();
    
        }
    }
}*/

// Buterfly pattern print

/*import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //int m = sc.nextInt();
        int n = 5;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        }
        
        int spaces = 2 * ( n-i );
        for(int i =1; j<=spaces; j++){
            System.out.print(" "); 
        }
        
        for(int j =1; j<=i; j++){
            System.out.print("*");
        }
        
        System.out.println();
    }
    for (int i = n; i>=1; i--){
        for(int j = 1; j<=i; j++){
            system.out.print("*");
            }
    int spaces = 2 * (n-i);
    for (int j = 1; j<= spaces; j++){
        system.out.print(" ");
            }
            
    for(int j = 1; j<=i; j++){
        system.out.print("*");
            }
            system.out.println();
            }
        }
    }
}*/

// import required classes  
/*import java.util.Scanner;  
// create class ButterFlyPatternExample to design butterfly pattern  
public class main {  
    // create drawButterflyPattern() method that will print Butterfly over n rows  
    public static void drawButterflyPattern(int N) {  
        // declare and initialize variables that helps to print Butterfly pattern  
        int space = 2*N-1;  
        int star = 0;  
        // use for loop   
                for(int j = 1; j <= 2*N-1; j++){  
                        if(j <= N){  
                            space = space - 2;  
                            star++;  
                        }  
                        else {  
                            space = space + 2;  
                            star--;  
                        }  
            // use for loop to print star  
                        for(int m = 1; m <= star; m++){  
                         System.out.print("*");  
                        }  
            // use for loop to print space  
                        for(int n = 1; n <= space; n++){  
                            System.out.print(" ");  
                        }  
            // use for loop to print star for special case  
                        for(int p = 1; p <= star; p++){  
                            if(p != N){  
                    System.out.print("*");  
                }  
                        }  
                        System.out.println();  
                }  
    }  
    // main() method start  
        public static void main(String[] args) {  
        int N;  
        // create Scanner class object to take input from user  
             Scanner sc = new Scanner(System.in);  
                System.out.println("Enter value of N");  
        N = sc.nextInt();  
        // close scanner class object  
        sc.close();  
        // call drawButterflyPattern() method   
        drawButterflyPattern(N);  
        }  
}*/

// Print the pattern solid Raombus

/*public class main{
    public static void main(String args[]){
        int n = 5;
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}*/

// Print the pattern number pyramid

/*public class main{
    public static void main(String args[]){
        int n = 5;
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            
            System.out.println();
        }
    }
}*/

/*public class main{
    public static void main(String args[]){
        int n = 5;
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            
            for(int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }
            
            for(int j =3; j <= i; j++){
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
}*/


// print the pattern diamond star

/*public class main{
    public static void main(String args[]){
        int n = 5;
        
        for(int i =1; i <= n; i++){
            for(int j =1 ; j <= n - i; j++){
                System.out.print(" ");
            }
            
            for(int j =1; j <= 2 * i - 1; j++ ){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        for(int i =n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}*/



// Functions and Methods in JAVA

/*import java.util.*;
public class functions{
    public static void printname(String name){
        System.out.print(name);
        return; 
    }
    
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        
        String name = sc.next();
        
        printname(name);
    }
}*/

// Make a functions to add 2 numbers and return the sum

/*import java.util.*;
public class main{
    public static int cal(int a, int b){
        int sum = a + b;
        return sum;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = cal(a,b);
        System.out.print(sum);
    }
}*/

// Write a function to find a factorial of a number

/*import java.util.*;
public class main{
    public static void factorial(int n){
        if(n < 0){
            System.out.print("Invalid");
            return;
            
        int factorial = 1;
        for(int i = n; i >= 1; i--){
            factorial = factorial * 1;
        }
        
        System.out.println(factorial); 
        return;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        facrorial(n);
        
    }
}*/


// Array in JAVA

/*public class Arrays{
    public static void main(String args[]){
        int [] marks = new int[3];
        marks [0] = 97; 
        marks [1] = 98;
        marks [2] = 99;
        
        for(int i = 0; i <= 3; i++){
            System.out.println(marks[i]);
        }
    }
}*/

// Reverse String code 

/*public class Strings{
    public static void main(String args[]){
        StringBuilder sb =  new StringBuilder ("GeeksforGeeks");
        
        for( int i = 0; i <= sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;
            
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        
        System.out.println(sb);
    }
}*/


// Bubble Sort Array 

/*import java.util.*;

public class Sorting{
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        
    }
    
    public static void main(String args[]){
        int arr[] = { 7,8,3,1,2 };
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if( arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }



    

