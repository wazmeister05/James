import java.util.ArrayList;

public class Combinations {

    public void preRun(String input){
        char[] chars = new char[input.length() * 2];
        System.out.println(run(input, chars, 0));
    }

    public char[] run(String input, char[] chars, int loop){
        if(input.equals("")){
            printString(chars);
        }
        else{
            chars[loop] = input.charAt(0);
            return run(input.substring(1), chars,loop + 1);
        }
        return chars;
    }

    private void printString(char[] chars) {
        for (int i = 0; i < chars.length; i++){
            System.out.print(chars[i]);
        }
        System.out.println();
    }

}
