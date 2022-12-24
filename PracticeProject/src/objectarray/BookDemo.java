package objectarray;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
	 
		 int BookId ,count=0;
		String BookName;
		 String authorName = null;
	     int price;  
		int operation;
		Scanner sc = new Scanner(System.in);
		Book book [] = new Book[2];
		while(true) {
			
			System.out.println("1 . Add Book ");
			System.out.println("2 . Update Book ");
			System.out.println("3 . Delete Book ");
			System.out.println("4 . Search Book ");
			System.out.println("5 . Get All Book");
			System.out.println("6 . Exit ");
			System.out.println(" ");
			System.out.println("Enter the Choice");
			operation = sc.nextInt();
			switch(operation) {
			case 1:
				System.out.println("add book");
				System.out.println("enter number of book");
				int a =sc.nextInt();
				for (int i=0;i<a;i++)
				{
					System.out.println("enter book id");
					BookId=sc.nextInt();
					System.out.println("Enter The Book Name");
				    BookName=sc.next();
				    System.out.println("enter The AuthorName");
				    authorName=sc.next();
				    System.out.println("enter price");
				    price=sc.nextInt();
                    book[count]=new Book(BookId,BookName,authorName,price);
                    count++;
				}
				    System.out.println("add successfully");
					break;
			case 2:
				 System.out.println("Update Book");
				 System.out.println("enter book Id for Update book");
				 BookId=sc.nextInt();
				 for(int i=0;i<count;i++) 
				 {	 
					 if(book[i]!=null&&book[i].getBookId()==BookId)
					 {
						 
						 System.out.println(" Enter Book Name ");
						 BookName=sc.next();
						 book[i].setBookName(BookName);
						 System.out.println(" Enter Book Author Name ");
						 authorName=sc.next();
;						 book[i].setAuthorName(authorName);
						 System.out.println("Enter Book price For Update");
						 price =sc.nextInt();
						 book[i].setPrice(price);
						 
					 }
				 }
				System.out.println("Bookn Update Successfully");
				break;
				
			case 3:
				System.out.println("Delete BOOK fROM list");
				System.out.println("Enter Book Id for delete");
				BookId = sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(book[i]!=null&&book[i].getBookId()==BookId)
					{
						book[i]=null;
				    }
				 
				}
				System.out.println("delete book successfully");
				break;
			case 4:
				System.out.println("Search Book");
				System.out.println("enter book id for search book");
				BookId= sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(book[i]!=null&&book[i].getBookId()==BookId)
					{
						System.out.println(book[i]);
					}
				}
				System.out.println("search book from id successfully");
				break;
			case 5:
				System.out.println("All book in stock");
				System.out.println("all bbok are as bellow");
				for(int i=0;i<count;i++)
				{
					System.out.println(book[i]);
				}
				System.out.println("all  book display success ");
				break;
				
			case 6:
				//System.exit(0);
				break;
				default:
					System.out.println("enter right choice");
			}
		}
		
	}
	}


