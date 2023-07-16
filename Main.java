abstract class LibraryItem{
    private String title;
    private String itemID;
    private boolean checkedOut;


    LibraryItem(String title,String itemID){
        this.title = title;
        this.itemID = itemID;
        this.checkedOut = false;
    }

    public void checkOut(){
        checkedOut = true;
    }

    public void checkIn(){
        checkedOut = false;
    }

    public void displayItemDetails(){
        System.out.print("Title: " + title + "  ");
        System.out.print("Item ID: " + itemID + "  ");
        System.out.println("Checked Out: " + checkedOut);
    }
}

class Book extends LibraryItem{
    private String author;
    private int numPages;


    public Book(String title,String itemID,String author,int numPages){
        super(title,itemID);
        this.author = author;
        this.numPages = numPages;
    }
}

class Magazine extends LibraryItem{
    private String issueDate;
    private String publisher;

    Magazine(String title,String itemID,String issueDate,String publisher){
        super(title,itemID);
        this.issueDate = issueDate;
        this.publisher = publisher;
    }
}

class LibraryMember{
    private String memberID;
    private String name;

    LibraryMember(String memberID,String name){
        this.memberID = memberID;
        this.name = name;
    }

    public void displayMemberDetails(){
        System.out.print("Member ID: " + memberID + "  ");
        System.out.println("Name: " + name);
    }
}

class Main{
    public static void main(String[] args) {
        Book b1 = new Book("The Catcher in the Rye","B001","J.D.Salinger",240);
        Book b2 = new Book("To kill a Mockingbird","B002","Harper Lee",281);
        Book b3 = new Book("1984","B003","George Orwell",328);
        Book b4 = new Book("Pride and Prejudice","B004","Jane Austen",432);
        Book b5 = new Book("The Hobbit","B005","J.R.R.Tolkien",320);

        Magazine m1 = new Magazine("National Geographic","M001","August 2023","National Geographic Society");
        Magazine m2 = new Magazine("Time","M002","September 2023","Time USA, LLC");
        Magazine m3 = new Magazine("Forbes","M003","June 2023","Forbes Media");
        Magazine m4 = new Magazine("Vogue","M004","July 2023","Code Nast");
        Magazine m5 = new Magazine("Sports Illustrated","M005","July 2023","Maven Coalition");

        LibraryMember mem1 = new LibraryMember("L001","John Doe");
        LibraryMember mem2 = new LibraryMember("L002","Jane Smith");
        LibraryMember mem3 = new LibraryMember("L003","David Johnson");
        LibraryMember mem4 = new LibraryMember("L004","Sarah Williams");
        LibraryMember mem5 = new LibraryMember("L005","Michael Brown");

        b1.checkOut();
        m2.checkIn();

        b3.checkIn();
        m1.checkOut();

        System.out.println("Books:");
        b1.displayItemDetails();
        b2.displayItemDetails();
        b3.displayItemDetails();
        b4.displayItemDetails();
        b5.displayItemDetails();

        System.out.println("\nMagazines:");
        m1.displayItemDetails();
        m2.displayItemDetails();
        m3.displayItemDetails();
        m4.displayItemDetails();
        m5.displayItemDetails();

        System.out.println("\nLibrary Members:");
        mem1.displayMemberDetails();
        mem2.displayMemberDetails();
        mem3.displayMemberDetails();
        mem4.displayMemberDetails();
        mem5.displayMemberDetails();

    }
}