public class Participant extends Person{
    private String name;
    private int age;

    public Participant(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Partisipant: " + name + ", Age: " + age;
    }
}