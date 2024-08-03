package ch04;

public class StudentTest {
  public static void main(String[] args) {

    Student studentZero = new Student(); // 인스턴스: 각각 다른 주소를 가진다.
    
    Student studentJeon = new Student(100, "yumi");
    studentJeon.studentAddress = "Seoul";

    Student studentKim = new Student(101, "nana", "Ulsan");
    
    studentZero.showStudentInfo(); // 0, null, null
    studentJeon.showStudentInfo(); // 100, yumi, Seoul
    studentKim.showStudentInfo(); // 101, nana, Ulsan

    System.out.println(studentZero); // ch04.Student@15db9742 참조변수@참조값(주소)
    System.out.println(studentJeon); // ch04.Student@15db9742 참조변수@참조값(주소)
    System.out.println(studentKim); // ch04.Student@6bc7c054 참조변수@참조값(주소)
  }
}
