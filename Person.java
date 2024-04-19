public abstract class Person {
    protected String name;
    protected int age;
    protected String socialSecurityNumber;

    public Person( String name, int age, String socialSecurityNumber) {
        this.age = age;
        this.name = name;
        this.socialSecurityNumber =socialSecurityNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }
}
