 class Studentinfo {
    String course;
    int sem;
    float marks;

    Studentinfo(String course, int sem, float marks) {
        this.course = course;
        this.sem = sem;
        this.marks = marks;
    }

    void displayInfo() {
        System.out.println("Course Name: " + course + ", Sem: " + sem + ", Marks: " + marks);
    }
}

public class Demo {
    public static void main(String[] args) {
        Studentinfo s1 = new Studentinfo("Java", 4, 30);
        Studentinfo s2 = new Studentinfo("Devops", 4, 30);
        Studentinfo s3 = new Studentinfo("BigData", 4, 30);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}
