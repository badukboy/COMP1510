package submission;
import java.util.Scanner;
/**.
 * <p>This program validates if a date is a real date.</p>
 * @author Leon Ho A00879122 Set 1B
 * @version 1.0
 *
 */
public class Date {
    /**.
     * <p>This is the number months there are in a year</p>
     */
    public static final int NUM_OF_MONTHS = 12;
    /**.
     * <p>This is the lower end of acceptble years</p> 
     */
    public static final int YEAR_LOW_RANGE = 1000;
    /**.
     * <p>This is the higher end of accpetable years</p>
     */
    public static final int YEAR_HIGH_RANGE = 1999;
    /**.
     * The days in the month when they are 31
     */
    public static final int DAYS_IN_MONTH = 31;
    /**.
     * The days in the month when they are 30
     */
    public static final int DAYS_IN_MONTH2 = 30;
    /**.
     * The days in the month when they are 29
     */
    public static final int DAYS_IN_MONTH3 = 29;
    /**.
     * The days in month when they are 28
     */
    public static final int DAYS_IN_MONTH4 = 28;
    public static void main(String[] args) {
        int month, day, year;
        int daysInMonth;
        boolean monthValid, yearValid, dayValid;
        boolean leapYear;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the month, date, and year in one line seperated with spaces");
        month = scan.nextInt();
        day = scan.nextInt();
        year = scan.nextInt();
        if ((month / NUM_OF_MONTHS) == 0) {
            monthValid = true;
        } else {
            monthValid = false;
        }
        if (year >= YEAR_LOW_RANGE && year <= YEAR_HIGH_RANGE) {
            yearValid = true;
        } else {
            yearValid = false;
        }
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            leapYear = true;
        }
        else {
            leapYear = false;
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 
                || month == 10 || month == 12) {
            daysInMonth = DAYS_IN_MONTH;
        } else if(month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = DAYS_IN_MONTH2;
        } else if(leapYear == true) {
            daysInMonth = DAYS_IN_MONTH3;
        } else {
            daysInMonth = DAYS_IN_MONTH4;
        }
        if (day > daysInMonth || day < 1) {
            dayValid = false;
        } else {
            dayValid = true;
        }
        if(dayValid == true && monthValid == true && yearValid == true) {
            System.out.println("Date is valid");
            System.out.println("Leap year: " + leapYear);
        } else {
            System.out.println("Date is not valid");
        }
    }
}
