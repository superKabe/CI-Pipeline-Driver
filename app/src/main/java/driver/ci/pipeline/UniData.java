package driver.ci.pipeline;
import org.joda.time.*;
import assignment.*;
import assignment.Module;
import java.util.Arrays;

public class UniData {
    public static void main(String[] args) {

        // Declaration of Student Objects & Related Info
        String[] modulesFrog = {"CT417"};
        Student studentFrog = new Student("Frog", "Froggington", "CS", modulesFrog, "11/07/2001", 21, 19270032);

        String[] modulesCat = {"CT417", "MM123", "EE347"};
        Student studentCat = new Student("Cat", "Caterino", "ECE", modulesCat, "08/02/2002", 20, 19325742);

        String[] modulesDog = {"MM123", "EE347"};
        Student studentDog = new Student("Dog", "Doggerson", "EEE", modulesDog, "02/12/2001", 21, 18576732);
        
        Student[] CT417_students = {studentCat, studentDog, studentFrog};
        Student[] MM123_students = {studentCat, studentDog};
        Student[] EE347_students = {studentCat, studentDog};

        // Declaration of Lecturer Objects & Related Info
        String[] modulesTaughtPiggy = {"CT417", "EE347"};
        Lecturer lecturerPiggy = new Lecturer("Pig", "Piggy", modulesTaughtPiggy, "02/01/1968", 53, 21938471);
        String[] modulesTaughtRhino = {"MM123"};
        Lecturer lecturerRhino = new Lecturer("Rhino", "Rhinly", modulesTaughtRhino, "02/01/1981", 41, 20981736);
        
        // Declaration of Module Objects & Related Info
        String[] CT417_AssociatedCourses = {"ECE", "CS"};
        Module CT417 = new Module("Software Eng III", CT417_AssociatedCourses, lecturerPiggy, CT417_students);

        String[] MM123_AssociatedCourses = {"ECE", "EEE"};
        Module MM123 = new Module("Applied Maths II", MM123_AssociatedCourses, lecturerRhino, MM123_students);

        String[] EE347_AssociatedCourses = {"ECE", "EEE"};
        Module EE347 = new Module("System on Chip", EE347_AssociatedCourses, lecturerPiggy, EE347_students);

        Module[] ECE_modules = {CT417, MM123, EE347};
        String[] ECE_modulesStr = {"CT417", "MM123", "EE347"};
        Module[] EEE_modules = {MM123, EE347};
        String[] EEE_modulesStr = {"MM123", "EE347"};
        Module[] CS_modules = {CT417};
        String[] CS_modulesStr = {"CT417"};

        // Declaration of Course Objects & Related Info
        LocalDate ECEstartDate = LocalDate.parse("2022-09-05");
        LocalDate ECEendDate = LocalDate.parse("2022-12-17");
        Student[] ECE_Students = {studentCat};
        Course ECE = new Course("ECE", ECEstartDate, ECEendDate, ECE_modules, ECE_Students);

        LocalDate EEEstartDate = LocalDate.parse("2022-08-04");
        LocalDate EEEendDate = LocalDate.parse("2022-11-16");
        Student[] EEE_Students = {studentDog};
        Course EEE = new Course("EEE", EEEstartDate, EEEendDate, EEE_modules, EEE_Students);

        LocalDate CSstartDate = LocalDate.parse("2022-08-04");
        LocalDate CSendDate = LocalDate.parse("2022-11-16");
        Student[] CS_Students = {studentFrog};
        Course CS = new Course("CS", CSstartDate, CSendDate, CS_modules, CS_Students);

        Course[] allCourses = {ECE, EEE, CS};

        //Print all courses followed by associated modules
        System.out.println(allCourses[0].getCourseName() + ", Courses: " + Arrays.toString(ECE_modulesStr));
        System.out.println(allCourses[1].getCourseName() + ", Courses: " + Arrays.toString(EEE_modulesStr));
        System.out.println(allCourses[2].getCourseName() + ", Courses: " + Arrays.toString(EEE_modulesStr));

        //Print student information for ECE
        for(int i = 0; i < ECE_Students.length; i++) {
            System.out.println("\n" + ECE_Students[i].getForename() + " " + ECE_Students[i].getSurname() + ", " + ECE_Students[i].getUsername() + ", " + Arrays.toString(ECE_modulesStr) + ", " + ECE_Students[i].getCourse());
        }
    
        //Print student information for EEE
        for(int i = 0; i < EEE_Students.length; i++) {
            System.out.println(EEE_Students[i].getForename() + " " + EEE_Students[i].getSurname() + ", " + EEE_Students[i].getUsername() + ", " + Arrays.toString(EEE_modulesStr) + ", " + EEE_Students[i].getCourse());
        }

        //Print student information for CS
        for(int i = 0; i < CS_Students.length; i++) {
            System.out.println(CS_Students[i].getForename() + " " + CS_Students[i].getSurname() + ", " + CS_Students[i].getUsername() + ", " + Arrays.toString(CS_modulesStr) + ", " + CS_Students[i].getCourse());
        }
    }
}
