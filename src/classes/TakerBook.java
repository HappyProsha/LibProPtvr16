/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class TakerBook {
    public History add(List<Book> books,List<Reader> readers){
        History history = new History();
        Scanner scanner = new Scanner(System.in);
        System.out.println("------Выдаем книгу ------");
        System.out.println("Список читателей: ");
        for (int i = 0; i < readers.size(); i++) {
            Reader reader = readers.get(i);
            System.out.println(i+1+". "+reader.getName()+" "+reader.getSurname());
        }
        System.out.println("Список книг: ");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(i+1+". "+book.getName()+". "+book.getAuthor());
        }
        System.out.println("Выбери номер читателя и номер книги.");
        System.out.println("№ читателя:");
        String numReader = scanner.nextLine();
        System.out.println("№ книги:");
        String numBook = scanner.nextLine();
        history.setBook(books.get(new Integer(numBook)-1));
        history.setReader(readers.get(new Integer(numReader)-1));
        Calendar c = new GregorianCalendar();
        history.setDateBegin(c.getTime());
        return history;
    }
}
