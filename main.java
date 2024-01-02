public class main {
    public static void main(String[] args) {
        // Creating a Student object using the Builder pattern
        Student student1 = new Student.Builder("John Doe", "ABC University").age(20).build();
        Student student2 = new Student.Builder("Jane Smith", "XYZ University").build();

        // Displaying information
        System.out.println("Student 1:");
        System.out.println("Name: " + student1.getName());
        System.out.println("University: " + student1.getUniversity());
        System.out.println("Age: " + student1.getAge());

        System.out.println("\nStudent 2:");
        System.out.println("Name: " + student2.getName());
        System.out.println("University: " + student2.getUniversity());
        System.out.println("Age: " + student2.getAge()); // Age will be 0 if not set explicitly
    }
}