public class Adam {


    public static void main(String[] args){
        SumOfNumbers sumOfNumbers = new SumOfNumbers();

        int input = 5;
        int input1 = 3;
        int input2 = 687;
        int input3 = 234;
        int input4 = 1100;
        int input5 = 0;

        System.out.println("The sum of numbers for " + input + " is: " + sumOfNumbers.calcSum(input));
        System.out.println("The sum of numbers for " + input1 + " is: " + sumOfNumbers.calcSum(input1));
        System.out.println("The sum of numbers for " + input2 + " is: " + sumOfNumbers.calcSum(input2));
        System.out.println("The sum of numbers for " + input3 + " is: " + sumOfNumbers.calcSum(input3));
        System.out.println("The sum of numbers for " + input4 + " is: " + sumOfNumbers.calcSum(input4));
        System.out.println("The sum of numbers for " + input5 + " is: " + sumOfNumbers.calcSum(input5));
        System.out.println();
        System.out.println("The sum of digits in " + input + " is: " + sumOfNumbers.digitSum(input));
        System.out.println("The sum of digits in " + input1 + " is: " + sumOfNumbers.digitSum(input1));
        System.out.println("The sum of digits in " + input2 + " is: " + sumOfNumbers.digitSum(input2));
        System.out.println("The sum of digits in " + input3 + " is: " + sumOfNumbers.digitSum(input3));
        System.out.println("The sum of digits in " + input4 + " is: " + sumOfNumbers.digitSum(input4));
        System.out.println("The sum of digits in " + input5 + " is: " + sumOfNumbers.digitSum(input5));
        System.out.println();

        Combinations combo = new Combinations();
        combo.preRun("123");

    }

}
