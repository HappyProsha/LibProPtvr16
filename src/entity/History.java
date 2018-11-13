/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Melnikov
 */
public class History  implements Serializable{
    private Book book;
    private Reader reader;
    private Date dateBegin;
    private Date dateEnd;

    public History() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString() {
        if(dateEnd == null){
          return "History{" + "book=" + book.getName() + ", reader=" + reader.getName()+" "+reader.getSurname() + ", dateBegin=" + dateBegin.toString()+ '}';  
        }else{
          return "History{" + "book=" + book.getName() + ", reader=" + reader.getName()+" "+reader.getSurname() + ", dateBegin=" + dateBegin.toString()+ ", dateEnd=" + dateEnd.toString()+ '}';
        }
            
    }
    
    
}
