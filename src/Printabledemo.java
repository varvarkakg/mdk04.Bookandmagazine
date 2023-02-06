public class Printabledemo {
    public static void main(String[] args) {
        Book book1 = new Book("Гарри Поттер");
        Book book2 = new Book("Портрес дориана грея");
        Magazine magazine1 = new Magazine("VOGUE");
        Magazine magazine2 = new Magazine("Журнал");

        Printable[] printables = {book1, book2, magazine1, magazine2};
        {
            for (Printable printable:printables) {
                printable.print();
            }
        }
    }
}