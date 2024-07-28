package ch06;

public class Double {
  public static void main(String[] args) {
    
    double dNum = 3.14;
    float fNum = 3.14f;

    System.out.println(dNum);
    System.out.println(fNum);

    double myNum = 1;
    for(int i=0; i<10000; i++) {
      myNum = myNum + 0.1;
    }

    System.out.println(myNum); // 1001.000000000159

  }
}
