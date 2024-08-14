package src.scenario1;

public class StarCafe {

  int totalMoney;

  public String brewing(int money) {

    totalMoney += money;
    if(money == Menu.STARAMERICANO) {
      return "별카페 아메리카노를 구매했습니다.";
    }
    else if(money == Menu.STARLATTE) {
      return "별카페 라떼를 구매했습니다.";
    }
    else return null;
  }

}
