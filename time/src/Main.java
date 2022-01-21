public class Main {
    public static void main(String[] args) {
        Time clock1 = new Time(0,0,0);
        System.out.println(clock1);
        clock1.previousSecond();
        System.out.println(clock1);
    }
}
