package ch18;

public class DeepCopy {

  public static void main(String[] args) {
    
    Book[] library = new Book[5];
    Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");

    // 깊은 복사ㅣ 각각의 객체를 생성하여 그 객체의 값을 복사하고 배열이 서로 다른 객체를 가리키도록 함
		for(int i= 0; i<library.length; i++) {
			copyLibrary[i] = new Book();
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
    
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
