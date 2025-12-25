import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Participant("Akerke",2);
        Person p2 = new Organizer("Gaukhar","Home");

        Organizer o1 = (Organizer) p2;

        Event e1 = new Event("Birthday", "20-08-2008", o1);
        Event e2 = new Event("Birthday", "12-06-2018", o1);
        Event e3 = new Event("Meeting", "10-01-2025", o1);

        ArrayList<Event> events = new ArrayList<>();
        events.add(e1);
        events.add(e2);
        events.add(e3);

        System.out.println("All events: ");
        for (Event e : events) {
            System.out.println(e);
        }

        System.out.println("\nSearching for Birthday events: ");
        for (Event e : events) {
            if (e.getDate().endsWith("2025")) {
                System.out.println(e);
            }
        }

        events.sort((a, b) -> a.getName().compareTo(b.getName()));
        System.out.println("\nSorted events by name:");
        for (Event e : events) {
            System.out.println(e);
        }

        // equals demonstration
        System.out.println("\nAre e1 and e2 equal?");
        System.out.println(e1.equals(e2) ? "Yes" : "No");
    }
}