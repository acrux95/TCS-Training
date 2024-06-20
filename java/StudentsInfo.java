import java.util.Random;

public class StudentsInfo {
        public static void main(String[] args) {
            Student student1 = new Student("Armando", "Leonardo", "Cruz", "15-11-1980");
            Student student2 = new Student("Erick", "Santiago", "Cruz", "17-07-2007");
            Student student3 = new Student("Roxanna", "", "Guzman", "07-07-1982");

            student1.displayInformationStudent();
            student2.displayInformationStudent();
            student3.displayInformationStudent();
        }
        public static class Student {

            int StudentID = 0;
            String firstName = "";
            String middleName = "";
            String lastName = "";
            String birthDate = "";

            public Student(String firstName, String middleName, String lastName, String birthDate) {
                Random random = new Random();

                this.StudentID = random.nextInt(10000);
                this.firstName = firstName;
                this.middleName = middleName;
                this.lastName = lastName;
                this.birthDate = birthDate;
            }
            public void displayInformationStudent() {
                System.out.println("Student ID: " + this.StudentID);
                System.out.println("Name: " + this.firstName + " " + this.middleName + " " + this.lastName);
                System.out.println("Birthdate: " + this.birthDate + "\n");
            }
        }

    }
