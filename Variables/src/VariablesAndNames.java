public class VariablesAndNames
{
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;


        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );



        int number = 113;
        double doubleNumber = 2.71828;
        String string = "Computer Science";

        System.out.println("This is room # " + number);
        System.out.println("e is close to " + doubleNumber);
        System.out.println("I am learning about " + string);

        String firstClass = "P.E.";
        String secondClass = "English";
        String thirdClass = "Physics";
        String forthClass = "Computer Science";
        String class5 = "French";
        String class6 = "Pre-Calculus 12";
        String class7 = "Calculus 12";
        String class8 = "Chemistry";

        String firstTeacher = "Mr.Hodgson";
        String secondTeacher = "Ms.Kwan";
        String thirdTeacher = "Mr.Kwong";
        String forthTeacher = "Mr.Zaremba";
        String teacher5 = "Mr.Matthews";
        String teacher6 = "Ms.Reed";
        String teacher7 = "Ms.Reed";
        String teacher8 = "Ms.Kuiper";

        System.out.print("+");
        for (int i = 0; i < 40; i++) {
            System.out.print("=");
        }
        System.out.print("+");
        System.out.println();
        System.out.println("| 1 | " + firstClass + "             | " + firstTeacher);
        System.out.println("| 2 | " + secondClass + "          | " + secondTeacher);
        System.out.println("| 3 | " + thirdClass + "          | " + thirdTeacher);
        System.out.println("| 4 | " + forthClass + " | " + forthTeacher);
        System.out.println("| 5 | " + class5 + "           | " + teacher5);
        System.out.println("| 6 | " + class6 + "  | " + teacher6);
        System.out.println("| 7 | " + class7 + "      | " + teacher7);
        System.out.println("| 8 | " + class8 + "        | " + teacher8);
        System.out.print("+");
        for (int i = 0; i < 40; i++) {
            System.out.print("=");
        }
        System.out.print("+");
    }
}