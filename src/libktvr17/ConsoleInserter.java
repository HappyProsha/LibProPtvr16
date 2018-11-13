/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libktvr17;


import classes.BookCreator;
import classes.ReaderCreator;
import classes.BackerBook;
import classes.TakerBook;
import entity.Book;
import entity.History;
import entity.Reader;
import interfaces.Insertable;
import java.util.List;

/**
 *
 * @author Melnikov
 */
public class ConsoleInserter implements Insertable{

    @Override
    public Book addBook() {
        BookCreator bookCreator = new BookCreator();
        return bookCreator.add();
    }

    @Override
    public Reader addReader() {
        ReaderCreator readerCreator = new ReaderCreator();
        return readerCreator.add();
    }

    @Override
    public History takeBook(List<Book> books, List<Reader> readers) {
        TakerBook takerBook = new TakerBook();
        return takerBook.add(books, readers);
    }

    @Override
    public History backBook(List<History> histories) {
        BackerBook backerBook = new BackerBook();
        return backerBook.add(histories);
    }

    
    
}
