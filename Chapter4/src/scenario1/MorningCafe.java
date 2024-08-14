package src.scenario1;

/*
 * 아침 출근길에 김씨는 4,000원을 내고 별다방에서 아메리카노를 사 마셨습니다. 
 * 이씨는 콩다방에서 4,500원을 내고 라테를 사 마셨습니다. 
 * 이 과정을 객체간의 협력을 기반으로 구현해보세요.
 */
public class MorningCafe {
  public static void main(String[] args) {

    Person personKim = new Person("Kim", 10000);
    Person personLee = new Person("Lee", 15000);

    StarCafe starCafe = new StarCafe();
    KongCafe kongCafe = new KongCafe();

    personKim.buyInStarCafe(starCafe, Menu.STARAMERICANO);
    personLee.buyInKongCafe(kongCafe, Menu.KONGLATTE);
    
  }
}
