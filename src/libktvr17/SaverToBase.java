/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libktvr17;

import entity.Book;
import entity.History;
import entity.Reader;
import interfaces.Saveble;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pupil
 */
public class SaverToBase implements Saveble{
    private EntityManager em;

    public SaverToBase() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibProPtvr16PU");
    }
    
    @Override
    public void saveHistories(List<History> histories) {
        
    }

    @Override
    public void saveReaders(List<Reader> readers) {
    }

    @Override
    public void saveBooks(List<Book> books) {
    }

    @Override
    public List<History> loadHistories() {
        List<History> listHistory = new ArrayList<>();
        return listHistory;
    }

    @Override
    public List<Reader> loadReaders() {
        List<Reader> listReader = new ArrayList<>();
        return listReader;
    }

    @Override
    public List<Book> loadBooks() {
        List<Book> listBook = new ArrayList<>();
        return listBook;
    }
    
}
