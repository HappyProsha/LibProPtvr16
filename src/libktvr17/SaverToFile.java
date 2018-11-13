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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Melnikov
 */
public class SaverToFile implements Saveble{

    @Override
    public void saveHistories(List<History> histories) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {    
            fos = new FileOutputStream("Histories.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(histories);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не могу записать в файл", ex);
        }
    }

    @Override
    public void saveReaders(List<Reader> readers) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {    
            fos = new FileOutputStream("Readers.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(readers);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не могу записать в файл", ex);
        }
    }

    @Override
    public void saveBooks(List<Book> books) {
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {    
            fos = new FileOutputStream("Books.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(books);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не могу записать в файл", ex);
        }
        
    }

    @Override
    public List<History> loadHistories() {
        List<History> histories = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream oin = null;
        try {    
            fis = new FileInputStream("Histories.txt");
            oin = new ObjectInputStream(fis);
            histories = (List<History>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не могу отрыть файл", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не могу прочесть файл", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        return histories;
    }

    @Override
    public List<Reader> loadReaders() {
        List<Reader> readers = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream oin = null;
        try {    
            fis = new FileInputStream("Readers.txt");
            oin = new ObjectInputStream(fis);
            readers = (List<Reader>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не могу отрыть файл", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не могу прочесть файл", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        return readers;
    }

    @Override
    public List<Book> loadBooks() {
        List<Book> books = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream oin = null;
        try {    
            fis = new FileInputStream("Books.txt");
            oin = new ObjectInputStream(fis);
            books = (List<Book>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не могу отрыть файл", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не могу прочесть файл", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        return books;
    }
    
}
