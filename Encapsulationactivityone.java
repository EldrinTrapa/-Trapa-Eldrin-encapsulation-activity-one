



public class Encapsulationactivityone {
    public static void main(String[] args) {
        Person p = new Person("Eldrin", "Argomido", "Trapa", 21, "2002-10-02", "Sitio Ipil Basak San Nicolas Cebu City");
        p.displayCredentials();
    }
 }

  class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String birthday;
    private String address;

    public Person(String firstName, String middleName, String lastName, int age, String birthday, String address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
    }
       // setters and getters 
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

      // Accessing attributes using getters
    public void displayCredentials() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Middle Name: " + getMiddleName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Birthday: " + getBirthday());
        System.out.println("Address: " + getAddress());
    }
}
