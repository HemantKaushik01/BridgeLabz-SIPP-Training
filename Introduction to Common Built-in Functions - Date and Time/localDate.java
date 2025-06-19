import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.*;

public class localDate {
    public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	String dateString = input.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDate date = LocalDate.parse(dateString,formatter);
	LocalDate dayUpdate = date.plusDays(07);
        LocalDate monthsUpdate = date.plusMonths(01);
	LocalDate yearsUpdate = date.plusYears(02);
	LocalDate weeksUpdate = date.minusWeeks(03);
	System.out.println("Day update in date by 7 days is : "+ dayUpdate);
	System.out.println("Month update in date by 1 months is : "+ monthsUpdate);
	System.out.println("Year update in date by 2 years is : "+ yearsUpdate);
	System.out.println("Week update in date by minus 3 weeks is : "+ weeksUpdate);

	
	

            }
}