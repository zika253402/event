public class Organizer {
    public String name;
    public String company;

    public Organizer(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() { return name; }
    public String getCompany() { return company; }

    public void detName(String name) { this.name = name; }
    public void setCompany(String company) { this.company = company; }

    @Override
    public String toString() {
        return "Organizer: " + name + ", Company: " +  company;
    }
}