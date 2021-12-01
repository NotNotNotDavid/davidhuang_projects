public class Main {


    public static void test(){

//        for (int i = 0; i < problemThree.length; i++) {
//            System.out.println(alphabeticalOrder(problemThree[i]));
//        }

//        for (int i = 0; i < problemTwo.length; i++) {
//            System.out.println(manyBob(problemTwo[i]));
//        }
//
//        for (int i = 0; i < problemOne.length; i++) {
//            System.out.println(manyVowels(problemOne[i]));
//        }

    }
    public static String[] problemOne = {
            "ysqundfruogaxcruaqhieie",
            "wurexc",
            "wiaytixcaigoiaernsi",
            "wdcyxcczoizfaieuoihi",
            "vsiwmbuuoeuizfd",
            "uzdexwiwy",
            "urjuuodceroyaeau",
            "toalhzemaepvidbufioleny",
            "oxfjxup",
            "oitolqwxdmpevzjexfmbise",
            "nlotjiodzrnzbr",
            "njwaaowewlisqmducwwwy",
            "lzxyryxmllshpkt",
            "lluaegmldkhemurk",
            "jifwagsigiokeool",
            "iueuaondjmhoiuxj",
            "ifbzmfmcnubeuidyjltyf",
            "foipguewboiahsem",
            "byxqkwjrqagtfdeqe",
            "aakreisoph",};
    public static int[] problemOneExpected = {
            10,
            2,
            10,
            9,
            7,
            3,
            10,
            10,
            2,
            7,
            3,
            6,
            0,
            5,
            8,
            9,
            5,
            8,
            3,
            5,
    };
    public static String[] problemTwo = {
            "ybovtobboboobcboobbobbbob",
            "xoboobobbobmmbobbb",
            "wpoabobbobobobobbbobbboobbkbobobbooboboobobsbobob",
            "obooobobobobolsyog",
            "obooobbobobtobobv",
            "oboboboobobofbnfbobbobbboobpcbobbobob",
            "geibobobbobb",
            "ebobbyobbbkbo",
            "cbobobobjlboobriobf",
            "cbobbdboobobn",
            "boobwbobobobbobbdbobpbvbobobobooboobbobb",
            "boobubovocobbobbojwox",
            "bobobobobobobobobobobobobobob",
            "bobbzobobooboboboobobobbobboboou",
            "bobbobobolbooboboboyzbk",
            "bicyfybobbkobrbobbbobobkbobbbobbbobbp",
            "bbobbooboojboobobbobobobbeto",
            "bbaboobobobbcboob",
            "aurjaoxjax",
            "aoboboboboobobbboboo",};
    public static int[] problemTwoExpected = {
            3,
            3,
            12,
            3,
            3,
            8,
            3,
            1,
            3,
            2,
            9,
            1,
            14,
            8,
            5,
            7,
            5,
            2,
            0,
            5,
    };
    public static String[] problemThree = {
            "ixysuoizvwwebyyhp",
            "zyxwvutsrqponmlkjihgfedcba",
            "ztapvefsnx",
            "zhmqbbea",
            "yqpnlilestyiwmmqsqpv",
            "usfuitmwigom",
            "unazbnhjzmjdihl",
            "tunivklq",
            "smpmqblmgaanxmlcvhw",
            "sgsndcjsptchiid",
            "pflvvhfqcmgjhgtrwmitab",
            "pagqqbqnufckbjtauacldroe",
            "opgrtupprfwbxsmwonswv",
            "nkdaqlfvkprute",
            "nhnwhowgjhhkj",
            "ncafxxrullo",
            "matnjjjh",
            "hrgtrpbwtxefzur",
            "dmegjmydadjwsdhckjjrydwj",
            "abcdefghijklmnopqrstuvwxyz"};
    public static String[] problemThreeExpected = {

            "ixy",
            "z",
            "apv",
            "hmq",
            "esty",
            "fu",
            "hjz",
            "klq",
            "aanx",
            "chii",
            "flvv",
            "agqq",
            "grtu",
            "kpru",
            "hnw",
            "afxx",
            "jjj",
            "efz",
            "egjmy",
            "abcdefghijklmnopqrstuvwxyz",

    };


    public static void main(String[] args) {

        test();




//        String string1 = "axbobasfbobbobaewbobob";
//        String string2 = "bobxdfboboobobobcgvhbjbbobkn";
//        String string3 = "abcashjlabcdeajfhsl";
//

//        System.out.println(manyVowels(string1));
//        System.out.println(manyBob(string1));
//        System.out.println(alphabeticalOrder(string3));


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
//    a,b,a,c,d,e

    public static String alphabeticalOrder(String str){

        int length = 1;
        String returnString = str.substring(0, 1);
        int stringLength = str.length();
        char[] charArray = str.toCharArray();

        for (int i = 0; i < stringLength - 1; i++) {
            if (charArray[i] <= charArray[i+1]) {
                length++;
            }
            else{
                length = 1;
            }
            if (length > returnString.length()){
                returnString = str.substring(i - length + 2, i + 2);
            }
        }
        return returnString;

    }


}
