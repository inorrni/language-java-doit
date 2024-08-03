package ch04;

public class Student { // 생성자()

  int studentId;
  String studentName;
  String studentAddress;

  // public Student(int studentId, String studentName) {
  //   this.studentId = studentId;
  // }

  /*
   * 오버로딩
   * : 생성자, 메소드 등 매게변수를 다르게해서 여러개 가질 수 있다.
   */

  public Student() {}

  public Student(int id, String name) {
    studentId = id;
    studentName = name;
  }

  public Student(int id, String name, String address) {
    studentId = id;
    studentName = name;
    studentAddress = address;
  }

  public void showStudentInfo() {
    System.out.println(studentId + ", " + studentName + ", " + studentAddress);
  }

  public String getStudentName() {
    return studentName;
  }
}
