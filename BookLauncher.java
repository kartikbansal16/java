import java.util.InputMismatchException;
import java.util.Scanner;


public class BookLauncher{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        
        BookStore bookStore = new BookStore();
        
        do {
            System.out.println("MAIN MENU \n=========");
            System.out.println("1. Add Books: ");
            System.out.println("2. Search Book: ");
            System.out.println("3. Return Book: ");
            System.out.println("4. Receive Rating: ");
            System.out.println("5. List Inventory: ");
            System.out.println("6. Exit: ");
            System.out.print("Enter your choice(1..6): ");
            
            choice=input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the book you want to add: ");
                    bookStore.addBook(input.next());
                    break;
                case 2:
                    System.out.print("Enter the name of the book you want to check out: ");
                    bookStore.doCheckout(input.next());
                    break;
                case 3:
                    System.out.print("Enter the name of the book you want to Return: ");
                    bookStore.doReturn(input.next());;
                    break;
                case 4:
                    System.out.println("Enter the name of the book you want to Rate: ");
                    bookStore.receiveRating(input.next(), input.nextInt());
                    break;
                case 5:
                    bookStore.listInventory();
                    break;
                case 6:
                    System.err.println("Enter ...!! Thanks for using the application");
                    System.exit(1);
                    break;
            }
        }

        while(!(choice==6));
            input.close();
        }
}


 class BookStore {


        book[] store;
        public BookStore() {

            System.out.println("WELCOME TO LIBRARY MANAGEMENT SYSTEM");
            store=new book[5];

    }
        
    public void addBook(String name) 
    {
        store[0]=new book(name);
        System.err.println("book "+'"'+store[0].getName()+'"'+" added successfully");
    }
    
    public void doCheckout(String name)
    {
        if(store[0].bookName.equals(name))
        {
            store[0].doCheckout();
        }
    }
    
    public void doReturn(String name)
    {
        if(store[0].bookName.equals(name))
        {
            store[0].doReturn();
        }
    }   

    public void receiveRating(String name, int rating) throws InputMismatchException {
        if(store[0].bookName.equals(name))
        {   
            store[0].receiveRating(rating);
        }

        System.err.println("Rating "+'"'+store[0].getRating()+'"'+" has been mapped to the book ''"+store[0].getName()+'"');
    }
    
    public void listInventory() {
        System.out.println("------------------------------------------");
        System.out.println("book Name | Checkout Status | Rating");
        System.out.println(store[0].getName()+"|" +store[0].getCheckout()+ "|"+ 
        store[0].getRating());
        System.out.println("------------------------------------------");
    }

}

 class book extends BookStore{

    String bookName;
    boolean checkout;
    int rating;
        public book() {
            super();
        }
        public book(String name)
        {
            bookName=name;
        }
        public String getName()
        {
            return bookName;
        }
        public void doCheckout()
        {   
            System.err.println("book "+'"'+ getName()+'"' +" checked out successfully.");
        }
        public void doReturn()
        {
            checkout=true;
            System.err.println("book "+'"'+ getName()+'"' +" returned successfully.");
        }
        public void receiveRating(int rating)
        {
            this.rating=rating;
        }
        public int getRating()
        {
            return rating;
        }
        public boolean getCheckout()
        {
        return checkout;
        }
} 