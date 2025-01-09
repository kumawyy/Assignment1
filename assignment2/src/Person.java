public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void printInfo();

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Person) {
            Person other = (Person) obj;
            return this.name.equals(other.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}
