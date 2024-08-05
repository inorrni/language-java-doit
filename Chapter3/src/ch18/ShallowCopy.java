package ch18;

public class ShallowCopy {
  public static void main(String[] args) {
    
    Book[] library = new Book[5];
    Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");

    // 얕은 복사ㅣ 객체 주소만 복사되어 한쪽 배열의 요소를 수정하면 전체 다 수정 됨.
    System.arraycopy(library, 0, copyLibrary, 0, 5);
    
    System.out.println(" book list -------------------");
    for(Book book : library) {
      book.showBookInfo();
    }

    System.out.println();
    System.out.println(" copy book list -------------------");
    for(Book book : copyLibrary) {
      book.showBookInfo();
    }
    
    library[0].setAuthor("박완서");
    library[0].setTitle("나목");
    
    System.out.println();
    System.out.println("<<<<<<<<< 책 변경 >>>>>>>>>");
    
    System.out.println(" book list -------------------");
    for(Book book : library) {
      book.showBookInfo();
    }
    
    System.out.println();
    System.out.println(" copy book list -------------------");
    for(Book book : copyLibrary) {
      book.showBookInfo();
    }
    
  }
  
}