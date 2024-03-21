/*
 * Wakeland Branz
 * Date: 3/19/2024
 * Seaforth High School
 *
 * Description:  Create numerous types of objects from one abstract class and modify them.
 * Difficulties:  Following along closely with the videos was difficult at times, especially with consistently comprehending what the presenter was trying to convey.
 * What I Learned:  How to use abstract classes to extend classes with polymorphism
 */

public class testPatron {
    public static void main(String[] args) throws Exception {
        Patron Emily = new Patron();
        Media myBook = new Book();
        Media myMovie = new Movie();
        Media myAudiobook = new AudioBook();

        myBook.setTitle("ABC");
        ((Book)myBook).setAuthor("Suzie Smith");

        myMovie.setTitle("Garden State");
        ((Movie)myMovie).setYear(2008);

        myAudiobook.setTitle("A Modest Proposal");
        ((AudioBook)myAudiobook).setYear(1729);
        ((AudioBook)myAudiobook).setNarrator("Rudy Gobert");

        Book testBook = new Book();
        AudioBook testAudioBook = new AudioBook();
        Movie testMovie = new Movie();

        System.out.print(myBook + "\n" + myMovie + "\n" + myAudiobook + "\n" + testBook + "\n" + testAudioBook + "\n" + testMovie);
    }
}


/*
 * Sample output:
 * The specs of this book are:
 *          Title: ABC
 *          Author: Suzie Smith
 *          Checkout date: java.util.GregorianCalendar[time=1710905172686,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="America/New_York",offset=-18000000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/New_York,offset=-18000000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2024,MONTH=2,WEEK_OF_YEAR=12,WEEK_OF_MONTH=4,DAY_OF_MONTH=19,DAY_OF_YEAR=79,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=26,SECOND=12,MILLISECOND=686,ZONE_OFFSET=-18000000,DST_OFFSET=3600000]
 * 
 * The specs of this movie are:
 *          Ttile: Garden State
 *          Year: 2008
 *          Checkout date: null
 * 
 * The specs of this audiobook are:
 *          Title: A Modest Proposal
 *          Narrator: Rudy Gobert
 *          Year: 1729
 *          Return Date: Tue Apr 02 23:26:12 EDT 2024
 * 
 * The specs of this book are:
 *          Title: null
 *          Author: null
 *          Checkout date: java.util.GregorianCalendar[time=1710905172697,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="America/New_York",offset=-18000000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/New_York,offset=-18000000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2024,MONTH=2,WEEK_OF_YEAR=12,WEEK_OF_MONTH=4,DAY_OF_MONTH=19,DAY_OF_YEAR=79,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=26,SECOND=12,MILLISECOND=697,ZONE_OFFSET=-18000000,DST_OFFSET=3600000]
 * 
 * The specs of this audiobook are:
 *          Title: null
 *          Narrator: null
 *          Year: 0
 *          Return Date: Tue Apr 02 23:26:12 EDT 2024
 * 
 * The specs of this movie are:
 *          Ttile: null
 *          Year: 0
 *          Checkout date: null
 */