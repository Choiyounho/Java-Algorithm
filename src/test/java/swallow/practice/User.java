package swallow.practice;


public class User {

    private int id;
    private String name;
    private int age;
    private boolean permission;

    public User() {
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public boolean isContainsToName(String value) {
        return this.name.contains(value);
    }

    public void addAdminPermission() {
        permission = true;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
