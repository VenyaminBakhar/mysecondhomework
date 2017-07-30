package task3;

/**
 * Created by Вениамин on 7/6/2017.
 */
class Book extends Paper{

    private String autor;

    private String bookTitle;

    Book(double productCost, String description, int countOfLists,String autor,String bookTitle) {
        super(productCost, description, countOfLists);
        this.autor = autor;
        this.bookTitle = bookTitle;
    }
}
