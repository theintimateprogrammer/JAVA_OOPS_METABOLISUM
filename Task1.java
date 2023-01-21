public class Task1{

    public static void main(String[] args){
           

           Book b = new Book();
           Book b1 = new Book(1,"Nothing","writer");
           b1.print();
    } 
}

class Book{

       int bookID;
       String title,author;

       Book(){
        System.out.println("Default");
    
       }

     Book(int bid, String t, String a){

        bookID = bid;
        title = t;
        author = a;
     }
       void print(){
        System.out.println("BookId = "+bookID);
        System.out.println("BookTitle = "+title);
        System.out.println("BookAuthor = "+author);
       }
} 
