import java.util.Objects;

public class Organizer extends Person{
    private String company;
    private String name;

    public Organizer(String name, String company) {
        super(name);
        this.company = company;
    }

    public String getCompany() { return company; }

    public void detName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Organizer: " + name + ", Company: " +  company;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Organizer))
            return false;
        Organizer o = (Organizer) obj;
        return name.equals(o.name) && company.equals(o.company);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + company.hashCode();
    }
}