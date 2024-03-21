import java.util.Calendar;

public class AudioBook extends Media {
    // Instance variables
    private String narr;
    private int year;

    // Constructors
    public AudioBook() {
        super();
        narr = null;
        year = 0;
    }

    public AudioBook(String title, Calendar today, String narr, int year) {
        super(title, today);
        this.narr = narr;
        this.year = year;
    }

    // Getters
    public String getNarrator() {
        return narr;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setNarrator(String narr) {
        this.narr = narr;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Other methods
    public String toString() {
        String str = "\nThe specs of this audiobook are: ";
        str += "\n\t Title: " + title;
        str += "\n\t Narrator: " + narr;
        str += "\n\t Year: " + year;
        str += "\n\t Return Date: " + getReturnData().getTime();
        return str;
    }

    public Calendar getReturnData() {
        Calendar dueDate = Calendar.getInstance();
        dueDate.set(today.MONTH, today.get(today.MONTH));
        dueDate.set(today.YEAR, today.get(today.YEAR));
        dueDate.add(today.DATE, 14);
        
        return dueDate;
    }
}