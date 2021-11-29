public class Main {
    public static void main(String[] args) {


        String string1 = "azcbobobegghakl";
        String string2 = "bobxdfboboobobobcgvhbjbbobkn";

//        System.out.println(manyVowels(string1));
        System.out.println(manyBob(string1));


    }

    /*
    Problem 1

    Assume s is a string of lower case characters.

    Write a program that counts up the number of vowels contained in the string s.
    Valid vowels are: 'a', 'e', 'i', 'o', and 'u'. For example, if s = 'azcbobobegghakl',
    your program should print:

    Number of vowels: 5
     */

    public static int manyVowels(String str){
        int count = 0;
        int stringLength = str.length();
        for (int i = 0; i < stringLength; i++) {
            if (str.substring(i, i + 1).equals("a")){
                count++;
            }
            else if (str.substring(i, i + 1).equals("e")){
                count++;
            }
            else if (str.substring(i, i + 1).equals("i")){
                count++;
            }
            else if (str.substring(i, i + 1).equals("o")){
                count++;
            }
            else if (str.substring(i, i + 1).equals("u")){
                count++;
            }
        }
        return count;
    }


    public static int manyBob(String str){
        int count = 0;
        int stringLength = str.length();
        for (int i = 0; i < stringLength-2; i++) {
            if (str.substring(i, i + 3).equals("bob")){
                count++;
            }
        }
        return count;
    }


}
