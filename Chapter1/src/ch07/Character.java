package ch07;

public class Character {
  public static void main(String[] args) {
    char ch1 = 'A';
    System.out.println(ch1); // A
    System.out.println((int)ch1); // 65

    char ch2 = 66;
    System.out.println(ch2); // B
    
    char ch3 = '한';
    char ch4 = '\uAC00';
    System.out.println(ch3); // 한
    System.out.println(ch4); // 가
  }
}
