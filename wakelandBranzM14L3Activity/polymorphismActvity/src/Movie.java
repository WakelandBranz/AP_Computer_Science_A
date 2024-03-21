import java.util.Calendar;

public class Movie extends Media {
    private int year;

    public Movie() {
        super(null, null);
        year = 0;
    }

    public Movie(String t, int y, Calendar c) {
        super(t, c);
        year = y;
    }

    public Movie(Movie m) {
        super(m.title, m.today);
        year = m.year;
    }

    // Getters

    public int getYear() {
        return year;
    }

    // Setters

    public void setYear(int y) {
        year = y;
    }

    // Other methods

    public Calendar getReturnData() {
        Calendar dueDate = Calendar.getInstance();
        dueDate.set(today.MONTH, today.get(today.MONTH));
        dueDate.set(today.YEAR, today.get(today.YEAR));
        dueDate.add(today.DATE, 7);
        
        return dueDate;
    }

    public String toString() {
        String str = "\nThe specs of this movie are: ";
        str += "\n\t Ttile: " + title;
        str += "\n\t Year: " + year;
        str += "\n\t Checkout date: " + today;
        return str;
    }
}
