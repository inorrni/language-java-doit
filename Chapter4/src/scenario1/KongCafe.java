package src.scenario1;

public class KongCafe {

  int totalMoney;

  public String brewing(int money) {

    totalMoney += money;
    if(money == Menu.KONGAMERICANO) {
      return "콩카페 아메리카노를 구매했습니다.";
    }
    else if(money == Menu.KONGLATTE) {
      return "콩카페 라떼를 구매했습니다.";
    }
    else return null;
  }

}
