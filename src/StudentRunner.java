public class StudentRunner
{
    public static void main(String[] args)
    {
        Student student = new Student("Benny", "Gudman", 2020, 94.5, true);
        System.out.println(student);
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getGradYear());
        System.out.println(student.getGpa());
        System.out.println(student.isInClub());
        student.setFirstName("Benjamin");
        student.setLastName("Goodman");
        student.setGradYear(2021);
        student.setGpa(64.5);
        student.setInClub(false);
        System.out.println(student);
    }
}
