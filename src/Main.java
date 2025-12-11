public class Main {
    public static void main(String[] args) {
        Organizer o1 = new Organizer("Gaukhar", "Home");
        Event e1 = new Event("Birthday", "20-08-2008", o1.getName());
        Participant p1 = new Participant("Akerke", 2);

        System.out.println(e1);
        System.out.println(o1);
        System.out.println(p1);

        Event e2 = new Event("Birthday", "12-06-2018", o1.getName());

        System.out.println("Next " + e2);

        System.out.println("Is the names of events are the same?");
        if (e1.getName().equals(e2.getName())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println("Is the dates of events are the same?");
        if (e1.getDate().equals(e2.getDate())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println("Is the organizers of events are the same?");
        if (e1.getOrganizer().equals(e2.getOrganizer())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}