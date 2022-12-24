package objectarray;

public class Book {

	
		private int BookId;
		private String BookName;
		private String AuthorName;
		private int Price;
		public int getBookId() {
			return BookId;
		}
		public void setBookId(int bookId) {
			BookId = bookId;
		}
		public String getBookName() {
			return BookName;
		}
		public void setBookName(String bookName) {
			BookName = bookName;
		}
		public String getAuthorName() {
			return AuthorName;
		}
		public void setAuthorName(String authorName) {
			AuthorName = authorName;
		}
		public int getPrice() {
			return Price;
		}
		public void setPrice(int price) {
			Price = price;
		}
		public Book(int bookId, String bookName, String authorName, int price) {
			super();
			BookId = bookId;
			BookName = bookName;
			AuthorName = authorName;
			Price = price;
		} 
		@Override
		public String toString() {
			return "Book [BookId=" + BookId + ", BookName=" + BookName + ", AuthorName=" + AuthorName + ", Price="
					+ Price + "]";
		}
		 
		

	
}
