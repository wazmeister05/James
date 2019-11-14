public class SumOfNumbers {

    public int calcSum(int input){
        if(input == 0){
            return 0;
        }
        return input + calcSum(input - 1);
    }

    public int digitSum(int input){
        if(input == 0){
            return 0;
        }
        return input % 10 + digitSum(input/10);
    }

}
