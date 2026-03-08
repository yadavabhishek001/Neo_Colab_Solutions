import java.util.Scanner;

class Student{
    int totMarks;
    int obtMarks;

    Student(){
        this.totMarks = totMarks;
        this.obtMarks = obtMarks;
    }

    double calculatePercentage(double a, double b){
        return (b / a) * 100;
    }
}
class ScholarshipStudent extends Student {
    double calculatePercentage(double a, double b){
        return ( ( b / a ) * 100 ) + 5;
    }
}

class Unit3_Lec17_Code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        ScholarshipStudent scholarshipStudent = new ScholarshipStudent();

        int totalMarks = sc.nextInt();
        int obtainMarks = sc.nextInt();

        double studentPercentage = student.calculatePercentage(totalMarks, obtainMarks);
        double scholarshipStudentPercentage = scholarshipStudent.calculatePercentage(totalMarks, obtainMarks);

        System.out.printf("Student Percentage: %.2f%%\n",studentPercentage);
        System.out.printf("Scholarship Student Percentage: %.2f%%\n",scholarshipStudentPercentage);
    }
}
