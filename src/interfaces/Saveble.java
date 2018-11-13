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
public interface Saveble {
    public void saveHistories(List<History> histories);
    public void saveReaders(List<Reader> readers);
    public void saveBooks(List<Book> books);
    
    public List<History> loadHistories();
    public List<Reader> loadReaders();
    public List<Book> loadBooks();
    
}
