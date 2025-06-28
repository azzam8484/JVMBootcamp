import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;import java.time.ZoneId;
import java.time.ZonedDateTime;

class CurrentTime
{
    void zoneTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        ZoneId[] zones = {
                ZoneId.of("Asia/Kolkata"),
                ZoneId.of("America/New_York"),
                ZoneId.of("Europe/London")
        };

        System.out.println("\n\nCurrent date and time in different time zones:");
        for (ZoneId zone : zones) {
            ZonedDateTime zdt = ZonedDateTime.now(zone);
            System.out.println(zone + ": " + zdt.format(formatter));
        }
    }
}

public class D5J6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Enter first date (dd-MM-yyyy): ");
        LocalDate date1 = LocalDate.parse(scanner.nextLine(), formatter);

        System.out.println("Enter second date (dd-MM-yyyy): ");
        LocalDate date2 = LocalDate.parse(scanner.nextLine(), formatter);

        if (date1.isBefore(date2)) {
            System.out.println("\n" + date1 + " occurs BEFORE " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println("\n" + date1 + " occurs AFTER " + date2);
        } else {
            System.out.println("\n" + "Both dates are EQUAL");
        }

        CurrentTime ct=new CurrentTime();
        ct.zoneTime();
    }
}
