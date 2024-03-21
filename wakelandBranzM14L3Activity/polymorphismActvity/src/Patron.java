public class Patron {
    private String FName;
    private String LName;
    private String LibNumber;
    private Media myMedia;

    public Patron() {
        FName = null;
        LName = null;
        LibNumber = null;
        myMedia = null;
    }

    public Patron(String f, String l, String ln, Media m) {
        FName = f;
        LName = l;
        LibNumber = ln;
        myMedia = m;
    }

    // Getters
    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }

    public String getLibNumber() {
        return LibNumber;
    }

    public Media getMyMedia() {
        return myMedia;
    }

    // Setters
    public void setFName(String FName) {
        this.FName = FName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public void setLibNumber(String LibNumber) {
        this.LibNumber = LibNumber;
    }

    public void setMyMedia(Media myMedia) {
        this.myMedia = myMedia;
    }

    // Other methods
    public String toString() {
        String str = "The specs of this Patron is: ";
        str += "\n\t First Name: " + FName;
        str += "\n\t Last Name: " + LName;
        str += "\n\t Library Number: " + LibNumber;
        str += "\n\t Media: " + myMedia;
        return str;
    }
}