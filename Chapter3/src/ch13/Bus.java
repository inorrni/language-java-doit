package ch13;

public class Bus {
  int busNo;
  int busFare;
  int totalIncome;
  int totalPassengers;
  
  public int getBusNo() {
    return busNo;
  }
  
  public void setBusNo(int busNo) {
    this.busNo = busNo;
  }
  
  public int getBusFare() {
    return busFare;
  }
  
  public void setBusFare(int busFare) {
    this.busFare = busFare;
  }
  
  public int getTotalIncome() {
    return totalIncome;
  }
  
  public void setTotalIncome(int totalIncome) {
    this.totalIncome = totalIncome;
  }
  
  public int getTotalPassengers() {
    return totalPassengers;
  }

  public void setTotalPassengers(int totalPassengers) {
    this.totalPassengers = totalPassengers;
  }
  
  public Bus(int busNo, int busFare) {
    setBusNo(busNo);
    setBusFare(busFare);
  }

  public void totalIncome(int busFare) {
    setTotalIncome(totalIncome + busFare);
    setTotalPassengers(totalPassengers + 1);

    System.out.println("-".repeat(40));
    System.out.print(busNo + "번 버스: 현재 수입은 ");
    System.out.println(totalIncome + "원 입니다.");
    System.out.print(busNo + "번 버스: 현재 승객은 ");
    System.out.println(totalPassengers + "명 입니다.");
    System.out.println();
  }
  
} 