package baileylu.tcd.ie;

public class Actor {
    private String name;
    private String dateOfBirth;
    private String nationality;
    private int age;

    public Actor(String name, String dateOfBirth, String nationality, int age) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s (DOB: %s, Nationality: %s, Age: %d)",
                name, dateOfBirth, nationality, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Actor))
            return false;
        Actor actor = (Actor) o;
        // For equality, we might check both name and DOB, or all fields,
        // depending on how you define "same person."
        return this.name.equals(actor.name) &&
                this.dateOfBirth.equals(actor.dateOfBirth);
    }

}
