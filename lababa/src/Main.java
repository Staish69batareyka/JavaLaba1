
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {



        Student a = new Student("Ann", 1, 2, 3);
        Student b = new Student("Bob", 2, 4, 4);
        Student c = new Student("Cort", 3, 1, 5);
        Student d = new Student("Dan", 4, 2, 1);
        Student e = new Student("Eva", 5, 3, 2);

        ArrayList<Student> list = new ArrayList<>(Arrays.asList(a, b, c, d, e));

//        System.out.println(list);

          Student.printStudents(Student.Sort(list), 3);
//        Student.Sort(list);


    }
}

class Student{
    private String name;
    private int group;
    private int course;
    private int grade;

    public Student(String name, int group, int course, int grade){
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }

    public static ArrayList<Student> Sort(ArrayList<Student> list){
        for(int i = 0; i < list.size(); i++){
            Student student = list.get(i);
            if(student.grade < 3){
                list.remove(student);
                i -= 1;

            }
        }
        return list;
    }

    public static void printStudents(ArrayList<Student> list, int course){
        Iterator<Student> iter = list.iterator();
        while (iter.hasNext()) {
            Student student = iter.next();
            if(course == student.course) {
                System.out.println(student.name + " " + course);
            }
        }
    }
}