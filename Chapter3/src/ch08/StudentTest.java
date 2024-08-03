package ch08;

public class StudentTest {
  /*
   * 두 명의 학생이 각각 두 과목의 수업을 들었습니다.
   * Jeon 학생은 국어 100, 수학 95점 입니다.
   * Kim 학생은 국어 80, 수학 99입니다.
   * 각 두 학생의 총점을 출력하세요
   */

  public static void main(String[] args) {
    Student studentJeon = new Student(100, "yumi");
    Student studentKim = new Student(101, "nana");

    studentJeon.setKorean("국어", 100);
    studentJeon.setMath("수학", 95);

    studentKim.setKorean("국어", 80);
    studentKim.setMath("수학", 99);

    studentJeon.showStudentScore();
    studentKim.showStudentScore();

  }
}
