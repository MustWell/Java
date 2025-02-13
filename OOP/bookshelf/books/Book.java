
package OOP.bookshelf.books;

public class Book {

    public String title;
    private int pageCount;






    public void setPageCount(int count) {
        if (count < 10) {
            throw  new IllegalArgumentException("значение не может быть меньше 10"); // программа сгенерирует ошибку
        }
        pageCount = count;
    }

    public int getPageCount() {
        return pageCount;
    }



    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author=" +
                '}';
    }
}
