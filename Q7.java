class Student {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", level=" + level +
                '}';
    }

    String name;
    int id;
    int level;

    public Student(String name, int id, int level) {
        this.name = name;
        this.id = id;
        this.level = level;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


}
public class Q7 {
    public static void main(String[] args) {
        Student stu[] = new Student[]{
                new Student("mohamad",1,3),
                new Student("sam",2,3),
                new Student("Hassan",3,3)
        };
        Student input[]=stu;
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);

        }

    }
}
