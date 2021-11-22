public class Main {
    public static void main(String[] args) {

//        arrayPractice();
//        arrayPractice2();
        arrayPractice4();


    }

    /*
        •Create an array that holds 20 positions, give each index a
        random value between 1-6, then use a for loop to count
        how many 1's were randomly generated in  the array
    */

    public static void arrayPractice(){
        int count = 0;
        int[] intList = new int[20];
        for (int i = 0; i < intList.length; i++) {
            intList[i] = (int) (6*(Math.random())+1);
            if (intList[i] == 1){
                count++;
            }
        }
        System.out.println(count);
    }

    /*
        •Create another array holds 10 positions, give each index
        a random value between 1 and 100, then find the average
        of all the values in the array
     */

    public static void arrayPractice2(){
        int sum = 0;
        int[] intList = new int[10];
        for (int i = 0; i < intList.length; i++) {
            intList[i] = (int) (100*(Math.random())+1);
            sum = sum + intList[i];
        }
        System.out.println(sum/100);
    }

    /*
        •Take the last array you made and swap 2 different index
        positions
     */

    public static void arrayPractice3(){
        int record = 0;
        int[] intList = new int[10];
        for (int i = 0; i < intList.length; i++) {
            intList[i] = (int) (100*(Math.random())+1);
            record = intList[0];
            intList[0] = intList[1];
            intList[1] = record;
        }
    }


    /*
        •Take the last array you made and completely reverse the
        order of the array
     */

    public static void arrayPractice4(){
        int[] intList = new int[10];
        System.out.println("First Array");
        for (int i = 0; i < intList.length; i++) {
            intList[i] = (int) (6*(Math.random())+1);
            System.out.print(intList[i] + "  ");
            }
        System.out.println();
        System.out.println("Second Array");
        for(int i=intList.length-1 ; i >= 0 ; i--)
            System.out.print(intList[i] + "  ");
        }


}
