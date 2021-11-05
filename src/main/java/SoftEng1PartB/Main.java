/**
 *
 * @author Pádraic Toomey 17316616 4th ECE
 */
package SoftEng1PartB;

import org.joda.time.*;

import java.util.ArrayList;
import SoftEng1.Student;
import SoftEng1.Module;
import SoftEng1.Course;


public class Main {
    public static void main(String[] args){


        //Make courses

        Course courseA = new Course("Maths",new ArrayList<>(),new LocalDate(2020,9,28), new LocalDate(2020,12,18));
        Course courseB = new Course("Electronic/Computer Enginering",new ArrayList<>(),new LocalDate(2020,9,28), new LocalDate(2020,12,18));
        Course courseC = new Course("Physics",new ArrayList<>(),new LocalDate(2020,9,28), new LocalDate(2020,12,18));

        //Make modules

        Module moduleA = new Module ("Software Engineering 3", "CT417");
        Module moduleB = new Module ("Mobile Networks", "EE4101");
        Module moduleC = new Module ("Digital Signals Processing", "EE445");
        Module moduleD = new Module ("Maths 4","MT101");
        Module moduleE = new Module ("Physics 2", "PY1234");
        
        //add modules
        courseA.addModule(moduleD);
        courseA.addModule(moduleE);

        courseB.addModule(moduleA);
        courseB.addModule(moduleB);
        courseB.addModule(moduleC);

        courseC.addModule(moduleE);
        courseC.addModule(moduleB);

        //Make array list for courses and add courses
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(courseA);
        courses.add(courseB);
        courses.add(courseC);

        //Make students
        Student studentA = new Student("Padraic", new LocalDate(1991,1,1),12345678,new ArrayList<>(),new ArrayList<>());
        Student studentB =  new Student("Johnny", new LocalDate(1992,2,2),87654321,new ArrayList<>(),new ArrayList<>());
        Student studentC =  new Student("Manny", new LocalDate(1993,3,3),1357924,new ArrayList<>(),new ArrayList<>());
        Student studentD =  new Student("Sarah", new LocalDate(1994,4,4),9754212,new ArrayList<>(),new ArrayList<>());
        Student studentE =  new Student("Eve", new LocalDate(1995,5,5),1231231,new ArrayList<>(),new ArrayList<>());


        //Add students to courses
        studentA.addCourse(courseA);
        studentA.addCourse(courseC);
        studentB.addCourse(courseB);
        studentC.addCourse(courseC);
        studentD.addCourse(courseB);
        studentE.addCourse(courseA);
        

        //Make array list of students and add students
        ArrayList<Student> students=new ArrayList<>();
        students.add(studentA);
        students.add(studentB);
        students.add(studentC);
        students.add(studentD);
        students.add(studentE);

         //print students with their courses and modules
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
        
        //print courses with modules
        System.out.println("Courses:");
        for (Course course: courses) {
            System.out.println(course.getName()+"\nModules:");
            for (Module module : course.getModules()) {
                System.out.println('\t'+module.getName());

            }
        }
 
    }
}
