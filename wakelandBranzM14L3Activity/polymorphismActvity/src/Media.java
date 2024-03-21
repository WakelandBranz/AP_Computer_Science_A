import java.util.Calendar;

public abstract class Media {
    // Instance variables
    public String title;
    public Calendar today;

    public Media() {
        title = null;
        today = Calendar.getInstance();
    }

    public Media(String t, Calendar c) {
        title = t;
        today = c;
    }

    // Setters

    public void setTitle(String t) {
        title = t;
    }

    public void setToday(Calendar c) {
        today = c;
    }

    public abstract Calendar getReturnData();
}
