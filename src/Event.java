public class Event {
    private String name;
    private String date;
    private String organizer;

    public Event(String name, String date, String organizer) {
        this.name = name;
        this.date = date;
        this.organizer = organizer;
    }

    public String getName() { return name; }
    public String getDate() { return date; }
    public String getOrganizer() { return organizer; }

    public void setName(String name) { this.name = name; }
    public void setDate(String date) { this.date = date; }
    public void setOrganizer(String organizer) { this.organizer = organizer; }

    @Override
    public String toString() {
        return "Event: " + name + ", Date: " + date + ", Organizer: " + organizer;
    }
}