import java.util.Calendar;

public class Book extends Media {
    // Instance variables
    private String author;

    public Book() {
        super();
        author = null;
    }

    public Book(String t, String a, Calendar c) {
        super(t, c);
    }

    public Book(Book b) {
        super(b.title, b.today);
        author = b.author;
    }

    // Getters

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Calendar getToday() {
        return today;
    }

    // Setters

    public void setAuthor(String a) {
        author = a;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void setToday(Calendar c) {
        today = c;
    }

    // Other methods

    public String toString() {
        String str = "\nThe specs of this book are: ";
        str += "\n\t Title: " + title;
        str += "\n\t Author: " + author;
        str += "\n\t Checkout date: " + today;
        return str;
    }

    public Calendar getReturnData() {
        Calendar dueDate = Calendar.getInstance();
        dueDate.set(today.MONTH, today.get(today.MONTH));
        dueDate.set(today.YEAR, today.get(today.YEAR));
        dueDate.set(today.DATE, today.get(today.DATE + 21));
        
        return dueDate;
    }
}
