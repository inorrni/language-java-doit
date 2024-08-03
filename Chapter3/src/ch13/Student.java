package ch13;

public class Student {

  private String name;
  private int money;
  private Bus bus;
  private Subway subway;
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  // 인스턴스 생성
  public Student(String name, int money) {
    setName(name);
    setMoney(money);
  }

  public void takeBus(Bus bus) {
    // bus.setBusNo(bus.busNo); // 이미 생성된 버스 정보라 필요없
    // bus.setBusFare(1000);
    setMoney(money - bus.busFare);

    System.out.println();
    System.out.print(name + ": 현재 탑승한 버스는 ");
    System.out.println(bus.busNo + "번 버스입니다.");

    System.out.print(name + ": 현재 남은 용돈은 ");
    System.out.println(money + "원 입니다.");
  }
  
  // 메서드를 분리하면 깔끔해질 수 있다.
  public void takeSubway(Subway subway) {
    // subway.setSubwayNo(subway.subwayNo); // 미리 생성했기 때문에 필요없는데 자꾸 주입..
    // setMoney(money - subway.subwayFare);
    // money -= subway.subwayFare;
    this.money -= subway.subwayFare;
  }
  
  public void showStudentInfo(Subway subway) {
    System.out.println();
    System.out.print(name + ": 현재 탑승한 지하철은 ");
    System.out.println(subway.subwayNo + "호선 지하철입니다.");
    System.out.print(name + ": 현재 남은 용돈은 ");
    System.out.println(money + "원 입니다.");
  }

}
