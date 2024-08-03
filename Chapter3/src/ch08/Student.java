package ch08;

public class Student {

  int studentId;
  String studentName;
  
  // 참조변수
  Subject korean;
  Subject math;
  
  public Student(int id, String name) {
    studentId = id;
    studentName = name;

    korean = new Subject();
    math = new Subject();
  }

  public void setKorean(String name, int score) {
    korean.subjectName = name;
    korean.subjectScore = score;
  }

  public void setMath(String name, int score) {
    math.subjectName = name;
    math.subjectScore = score;
  }

  public void showStudentScore() {
    int total = korean.subjectScore + math.subjectScore;
    System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
  }

}
