package src.scenario1;

public class Person {

  String name;
  int totalMoney;

  public Person(String name, int totalMoney) {
    this.name = name;
    this.totalMoney = totalMoney;
  }

  public void buyInStarCafe(StarCafe starCafe, int money) {
    String message = starCafe.brewing(money);
    if(message != null) {
      totalMoney -= money;
      System.out.println(name = " 님이" + money + " 원으로" + message);
    }
  }

  public void buyInKongCafe(KongCafe kongCafe, int money) {
    String message = kongCafe.brewing(money);
    if(message != null) {
      totalMoney -= money;
      System.out.println(name = " 님이" + money + " 원으로" + message);
    }
  }
}
