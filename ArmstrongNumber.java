package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 153, a, b , c= 0;

        a = num;
        while (a!= 0)
        {
            b = a % 10;
            c =c + b*b*b;
            a /= 10;
        }

        if(c == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}
