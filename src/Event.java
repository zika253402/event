public class Event {
    private String name;
    private String date;
    private Organizer organizer;

    public Event(String name, String date, Organizer organizer) {
        this.name = name;
        this.date = date;
        this.organizer = organizer;
    }

    public String getName() {
        return name;
    }
    public String getDate() {

        return date;
    }
    public Organizer getOrganizer() {
        return organizer;
    }

    @Override
    public String toString() {
        return "Event: " + name + ", Date: " + date + ", Organizer: " + organizer.getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Event))
            return false;
        Event e = (Event) obj;
        return name.equals(e.name) && date.equals(e.date);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + date.hashCode();
    }
}