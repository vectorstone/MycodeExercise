package lambdaSimple;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/9/2023 9:37 PM
 */
public class Person {
    private String name;
    private String city;
    private int age;

    public Person() {
    }

    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

    public static void foo(int m, int n) {
        System.out.println("m = " + m + "n = " + n);
    }
}
