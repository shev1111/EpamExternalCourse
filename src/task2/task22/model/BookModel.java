package task2.task22.model;

import task2.task22.model.comparators.AuthorsComparator;
import task2.task22.model.comparators.PublishersComparator;
import task2.task22.model.comparators.YearsComparator;
import task2.task22.model.utils.BooksGenerator;

import java.util.Arrays;
import java.util.Comparator;

public class BookModel {
    private Book[] books;

    public BookModel() {
        this.books = BooksGenerator.getBooksArray(10);
    }

    public Book[] getBooks() {
        return books;
    }

    public Book[] getBooksByCriteria(String searchFor, String criteria ){
        Comparator comparator=null;

        Book[] innerCopyLibrary = Arrays.copyOf(books,books.length);

        switch (criteria){
            case "author": comparator = new AuthorsComparator();break;
            case "publisher": comparator = new PublishersComparator();break;
            case "year": comparator = new YearsComparator();
        }
        if (comparator==null)return new Book[0];

        int[] searchIndexes = getIndexes(searchFor, comparator, innerCopyLibrary);

        return getBooks(innerCopyLibrary,  searchIndexes[0],  searchIndexes[1]);
    }

    private int[] getIndexes(String criteria, Comparator comparator, Book[] innerCopyLibrary) {
        Arrays.sort(innerCopyLibrary, comparator);
        String comparatorType = comparator.getClass().getSimpleName();
        switch (comparatorType){
            case "AuthorsComparator":return getIndexesForAuthor(criteria, innerCopyLibrary);
            case "PublishersComparator":return getIndexesForPublisher(criteria, innerCopyLibrary);
            case "YearsComparator":return getIndexesForYear(criteria, innerCopyLibrary);
            default: return new int[]{-1,-1};
        }
    }

    private int[] getIndexesForAuthor(String criteria, Book[] innerCopyLibrary) {
        int bookIndex =0;
        int firstIndex = -1;
        int lastIndex = -1;
        for(Book elem: innerCopyLibrary){
            if(elem.getAuthor().equalsIgnoreCase(criteria)){
                if(firstIndex==-1){
                    firstIndex=bookIndex;

                }
            }else {
                if(lastIndex==-1){
                    lastIndex=bookIndex;
                }
            }
            bookIndex++;
        }
        return new int[]{firstIndex,lastIndex};
    }

    private int[] getIndexesForPublisher(String criteria, Book[] innerCopyLibrary) {
        int bookIndex =0;
        int firstIndex = -1;
        int lastIndex = -1;
        for(Book elem: innerCopyLibrary){
            if(elem.getPublisher().equalsIgnoreCase(criteria)){
                if(firstIndex==-1){
                    firstIndex=bookIndex;

                }
            }else {
                if(lastIndex==-1){
                    lastIndex=bookIndex;
                }
            }
            bookIndex++;
        }
        return new int[]{firstIndex,lastIndex};
    }

    private int[] getIndexesForYear(String criteria, Book[] innerCopyLibrary) {
        int year = Integer.parseInt(criteria);
        int bookIndex =0;
        int firstIndex = -1;
        int lastIndex = -1;
        for(Book elem: innerCopyLibrary){
            if(elem.getYear()<year){
                if(firstIndex==-1){
                    firstIndex=bookIndex;

                }
            }else {
                if(lastIndex==-1){
                    lastIndex=bookIndex;
                }
            }
            bookIndex++;
        }
        return new int[]{firstIndex,lastIndex};
    }

    private Book[] getBooks(Book[] innerCopyLibrary, int firstIndex, int lastIndex) {
        if(lastIndex>=0&&firstIndex>=0&&firstIndex!=lastIndex){
            return Arrays.copyOfRange(innerCopyLibrary, firstIndex, lastIndex);
        }
        if(firstIndex==lastIndex){
            return new Book[]{innerCopyLibrary[firstIndex]};
        } else {
            return new Book[0];
        }
    }
}
