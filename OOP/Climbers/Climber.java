
package OOP.Climbers;

public class Climber {

    private String name;

    private String age;

    private String address;

    public Climber(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return " Имя " + name  + " Возраст " + age + " Адрес " + address;
    }
}
