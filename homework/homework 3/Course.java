private String courseName;
private String[] students;
private int numberOfStudents;

public Course(String courseName) {
    this.courseName = courseName;
    this.students = new String[0]; 
}
public void addStudent(String student) {

    if (numberOfStudents >= students.length) {
        String[] newStudents = new String[students.length + 1];
        
        System.arraycopy(students, 0, newStudents, 0, students.length);
        students = newStudents;
    }
    
    students[numberOfStudents] = student;
    numberOfStudents++;
}

public String[] getStudents() {
    return students;
}

public int getNumberOfStudents() {
    return numberOfStudents;
}

public String getCourseName() {
    return courseName;
}

public void dropStudent(String student) {
    int index = -1;
    for (int i = 0; i < numberOfStudents; i++) {
        if (students[i].equals(student)) {
            index = i;
            break;
        }
    }
    
    if (index != -1) {
        for (int i = index; i < numberOfStudents - 1; i++) {
            students[i] = students[i + 1];
        }
        
        students[numberOfStudents - 1] = null;
        numberOfStudents--;
        
        if (numberOfStudents == 0) {
            students = new String[0];
        }
    }
}

public void clear() {
    students = new String[0];
    numberOfStudents = 0;
}

public static void printStudents(Course course) {
    String[] students = course.getStudents();
    int numberOfStudents = course.getNumberOfStudents();
    
    if (students == null || numberOfStudents == 0) {
        System.out.println("No students are currently enrolled.");
    } else {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i]);
        }
    }
}

public static void main(String[] args) {
    Course course = new Course("Java Programming");
    
    course.addStudent("Peter Jones");
    course.addStudent("Kim Smith");
    course.addStudent("Anne Kennedy");
    
    System.out.println("Students in the course before dropping: ");
    printStudents(course);
    
    System.out.println();
    
    course.dropStudent("Kim Smith");
    
    System.out.println("Students in the course after dropping Kim Smith: ");
    printStudents(course);
}