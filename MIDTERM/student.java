package Students;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student sOne = new Student();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your First name: ");
        String newFirstName = scanner.nextLine();
        sOne.setFirstname(newFirstName);

        System.out.print("Enter your Middle name: ");
        String newMiddleName = scanner.nextLine();
        sOne.setMiddlename(newMiddleName);

        System.out.print("Enter your Last name: ");
        String newLastName = scanner.nextLine();
        sOne.setLastname(newLastName);

        System.out.print("Enter your Suffix: ");
        String newSuffix = scanner.nextLine();
        sOne.setSuffix(newSuffix);

        String studentID = sOne.getFirstname();
        String firstName = sOne.getMiddlename();
        String middleName = sOne.getLastname();
        String lastName = sOne.getSuffix();
        String suffix = sOne.getFirstname();
        String age = sOne.getMiddlename();
        String yearLevel = sOne.getLastname();
        String phoneNumber = sOne.getSuffix();
        String email = sOne.getSuffix();

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
        System.out.println("Suffix: " + suffix);

        
    }
}
 

class Student {

    String studentID = studentID;
    String firstName = firstName;
    String middleName = middleName;
    String lastName = lastName;
    String suffix = suffix;
    int age = age;
    int yearLevel = yearLevel;
    String phoneNumber = phoneNumber;
    String email = email;

    public Student() {
    }

    public String getstudentID() {
        return student_ID;
    }

    public void setFirstname(String firstname) {
        this.First_Name = firstname;
    }

    public String getMiddlename() {
        return Middle_Name;
    }

    public void setMiddlename(String middlename) {
        this.Middle_Name = middlename;
    }

    public String getLastname() {
        return Last_Name;
    }

    public void setLastname(String lastname) {
        this.Last_Name = lastname;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFullName() {
        return First_Name + " " + Middle_Name + " " + Last_Name + " " + suffix;
    }
}
