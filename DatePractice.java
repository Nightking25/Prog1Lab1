import java.util.Date;
// import java.util.*; imports all the classes

public class DatePractice{

    public static void main(String[] args){

        System.out.print("*****Date Practice*****");

        Date today = new Date();
        Date afterToday = new Date();
        afterToday.setHours(11);

        Date nextYear = new Date();
        nextYear.setYear(121);

        System.out.println("TODAY " + today);
        System.out.println("After_today " + afterToday);
        System.out.println("Next_year " + nextYear);

        System.out.println("Is today after afterToday?" + today.after(afterToday));
        System.out.println("Is today before beforeToday?" + today.before(afterToday));
        System.out.println("Is today before nextYear?" + today.before(nextYear));
        System.out.println("Is today after nextYear?" + today.after(nextYear));

        System.out.println("Today's day of the week is " + today.getDay());
        System.out.println("Today's month is " + today.getMonth());
        System.out.println("Today's time since 1970's is" + today.getTime());

        Date copyToday = today;
        System.out.println("\nCOPY_TODAY " + copyToday);
        today.setHours(11);
        System.out.println("\nCOPY_TODAY " + copyToday);

        Date cloneToday = (Date) today.clone();
        System.out.println("\nCLONE_TODAY " + cloneToday);
        today.setHours(13);
        System.out.println("\nCLONE_TODAY " + cloneToday);

    }
}
