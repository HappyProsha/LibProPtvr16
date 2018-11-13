/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.List;

/**
 *
 * @author Melnikov
 */
public interface Insertable {
    public Book addBook();
    public Reader addReader();
    public History takeBook(List<Book> books, List<Reader>readers);
    public History backBook(List<History> histories);
}
