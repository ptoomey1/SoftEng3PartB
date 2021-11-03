package SoftEng1PartB;

import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        //create sample modules

        Module module1 = new Module ("Chemistry","CH282");
        Module module2 = new Module ("Physics", "PY229");
        Module module3 = new Module ("Digital Signals", "EE298");
        Module module4 = new Module ("Object Oriented Programming","CT202");
        Module module5 = new Module ("Software Engineering 1", "CT209");

        //create sample courses

        Course course1 = new Course("Science",new ArrayList<>(),new LocalDate(2020,9,28), new LocalDate(2020,12,18));
        Course course2 = new Course("Electronic Enginering",new ArrayList<>(),new LocalDate(2020,9,28), new LocalDate(2020,12,18));
        Course course3 = new Course("Computer Science",new ArrayList<>(),new LocalDate(2020,9,28), new LocalDate(2020,12,18));

        //add modules to course 1
        course1.addModule(module1);
        course1.addModule(module2);

        //add modules to course 2
        course2.addModule(module3);
        course2.addModule(module4);

        //add modules to course 3
        course3.addModule(module4);
        course3.addModule(module5);

        //create array list of courses and add courses for ease of iteration
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        //create sample students with disney character names
        Student student1 = new Student("Mickey Mouse", new LocalDate(1994,10,8),13374927,new ArrayList<>());
        Student student2 =  new Student("Minney Mouse", new LocalDate(1997,2,13),163287390,new ArrayList<>());
        Student student3 =  new Student("Donald Duck", new LocalDate(1998,7,30),174583904,new ArrayList<>());
        Student student4 =  new Student("Daisy Duck", new LocalDate(1996,5,23),15894632,new ArrayList<>());

        //enroll students to courses
        student1.addCourse(course1);
        student2.addCourse(course2);
        student3.addCourse(course3);
        student4.addCourse(course2);
        student4.addCourse(course3);

        //create array list of students and add students for ease of iteration
        ArrayList<Student> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        //print out list of courses and the modules of each
        System.out.println("Courses:");
        for (Course course: courses) {
            System.out.println(course.getName()+"\nModules:");
            for (Module module : course.getModules()) {
                System.out.println('\t'+module.getName());

            }
        }
        //print out a list of students, their courses and the modules in each course
        System.out.println("\nStudents");
        for (Student student : students){
            System.out.println(student.getName()+"\tUsername:\t"+student.getUsername()+"\nCourses:");
            for (Course course: student.getCourses()) {
                System.out.println("\t"+course.getName()+"\n\tModules:");
                for (Module module : course.getModules()) {
                    System.out.println("\t\t"+module.getName());
                }
            }
        }

    }
}
