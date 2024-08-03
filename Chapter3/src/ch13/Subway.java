package ch13;

public class Subway {

  int subwayNo;
  public int getSubwayNo() {
    return subwayNo;
  }

  public void setSubwayNo(int subwayNo) {
    this.subwayNo = subwayNo;
  }

  int subwayFare;
  int totalIncome;
  int totalPassengers;


  public Subway(int subwayNo, int subwayFare) {
    this.subwayNo = subwayNo;
    this.subwayFare = subwayFare;
  }

  public void totalIncome(int subwayFare) {
    this.totalIncome += subwayFare;
    totalPassengers += 1;
  }

  // 메서드를 분리하면 깔끔해질 수 있다.
  public void showSubwayInfo() {
    System.out.print(subwayNo + "호선 지하철: 현재 수입은 ");
    System.out.println(totalIncome + "원 입니다.");

    System.out.print(subwayNo + "호선 지하철: 현재 승객은 ");
    System.out.println(totalPassengers + "명 입니다.");
  }

}
