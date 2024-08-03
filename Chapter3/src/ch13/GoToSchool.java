package ch13;

/*
 * James와 Tomas는 각각 버스와 지하철을 "타고" 학교에 갑니다.
 * James는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 "지불"합니다.
 * Tomas는 10000원을 가지고 있었고, 초록색 지하철을 타면서 1200원을 지불합니다.
 * 
 * 두 학생이 버스와 지하철을 타는 상황을 구현해 봅시다.
 */
public class GoToSchool {
  
  public static void main(String[] args) {
    
    /*
     * James는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불합니다.
     * 1. 객체 생성
     *  1-1. 학생 생성
     *    1-1-1. 이름: james
     *    1-1-2. 용돈: 5000원
     *  1-2. 버스 생성
     *    1-2-1. 번호: 100번
     *    1-2-2. 금액: 1000원
     * 2. 행위 생성
     *  2-1. james 로직
     *    2-1-1. 탄 버스 매칭
     *    2-1-2. 버스비 지불: 용돈에서 버스비 차감
     *  2-2. 버스 로직
     *    2-2-1. 탄 승객수 추가
     *    2-2-2. 받은 버스비 추가: 수입에서 버스비 추가
     * 3. 결과 표출
     *  3-1. james 정보
     *    3-1-1. 용돈 잔액
     *  3-2. 버스 정보
     *    3-2-1. 승객수 및 받은 요금 총액
     */

    // Student james = new Student(james, 5000, 1000); 딱!!! 학생에 관련된 정보만 생성해야 한다.
    Student james = new Student("james", 5000); // 5000원을 가진 james.
    Bus busNo100 = new Bus(100, 1000); // 100번 버스
  
    // james.setPaid(1000); 학생이 돈을 지불하는게 먼저가 아니라 대중교통을 탄게 먼저.
    // james.setTakeBus(); // -> 탄 버스에서 금액을 지불. 그런데 버스에 바로 주입하는게 아닌 메서드안에서 진행 필요.
    james.takeBus(busNo100); // 대중교통 메서드 실행
    busNo100.totalIncome(busNo100.busFare);

  
    // Tomas는 10000원을 가지고 있었고, 초록색 지하철을 타면서 1200원을 지불합니다.
    Student tomas = new Student("tomas", 10000);
    Subway subwayNo2 = new Subway(2, 1200);
  
    System.out.println();
    tomas.takeSubway(subwayNo2);
    tomas.showStudentInfo(subwayNo2);
    System.out.println("-".repeat(40));
    subwayNo2.totalIncome(subwayNo2.subwayFare);
    subwayNo2.showSubwayInfo();
    System.out.println();
    
  }

}
