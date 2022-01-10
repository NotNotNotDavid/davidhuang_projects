public class Main {
    public static void main(String[] args) {
        Time clock1 = new Time(23,59,59);
        System.out.println(clock1);
        clock1.nextSecond();
        System.out.println(clock1);
    }
}
