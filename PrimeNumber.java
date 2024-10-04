import java.util.Scanner;
class PrimeNumber{
    //logic for checking the prime number.
    public static boolean checkPrime(int number) {
        //Checks that wheather given nummber is 1 or less than 1. If so then return false.
        if (number <= 1) {
            return false;
        }
        
        //checking that number is divisible by integer from 2. if the number is divisible by number less than itself then return false.
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        // If above conditions failed then returning true. Number given by user is prime number.
        return true;
    }
    public static void main(String[] args){
        
        // Getting input from user.
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int a = sc.nextInt();
        
        //Object creation to call method
        PrimeNumber obj= new PrimeNumber();
        
        //method calling
        obj.checkPrime(a);
        
        //Printing which number is Prime which is not.
        if(checkPrime(a)){
            System.out.println(a+" is a Prime number");
        }
        else{
            System.out.println(a+" is not a Prime number");
            
        }
    }
}
