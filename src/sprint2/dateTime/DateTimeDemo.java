package sprint2.dateTime;


import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

    public DateTimeDemo(){

        Instant i = Instant.now();
        System.out.println(i);

        LocalTime lt = LocalTime.now();
        LocalTime lt2 = LocalTime.of(13, 14, 15);
        LocalTime lt3 = LocalTime.parse("17:34:25");
        System.out.println(lt3);
        LocalDate ld = LocalDate.now();
        LocalDate ld2 = LocalDate.now().plusDays(90);
        System.out.println(ld);
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.now().plusHours(2);
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY MM dd : HH mm ss");
        System.out.println(dtf.format(ldt));

        Duration d = Duration.between(ldt, ldt2);
        System.out.println(d.getSeconds());

        Period p = Period.between(ld, ld2);
        System.out.println(p.getMonths());

    }


    public static void main (String[] args){
        DateTimeDemo dtd = new DateTimeDemo();
    }
}












/*        String europeanDatePattern = "dd.MM.yyyy";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        System.out.println(europeanDateFormatter.format(lt2));

                Instant i = Instant.now();
        LocalDateTime lt = LocalDateTime.now();
        System.out.println(i);
        System.out.println(lt);

        LocalDateTime lt2 = LocalDateTime.of(12,12,12, 12, 12, 12);
        LocalTime t = LocalTime.of(12,12,12);

        lt2 = lt2.plusHours(3);
        System.out.println(lt2);

        System.out.println(lt2.format(DateTimeFormatter.ofPattern("YYYY.MM.dd")));
        System.out.println(t.format(DateTimeFormatter.ofPattern("HH:mm")));
        System.out.println(lt.isBefore(lt2));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY.MM.dd HH:mm");
        LocalDateTime parsed = LocalDateTime.parse("2021.12.03 07:23", dtf);
        System.out.println("hej "+parsed);

        System.out.println(TimeZone.getDefault());
        ZonedDateTime stockholmZonedDateTime = i.atZone(ZoneId.of("GMT"));
        System.out.println(stockholmZonedDateTime.format(DateTimeFormatter.ofPattern("HH:mm")));

        Duration d = Duration.between(lt2, lt);

 */