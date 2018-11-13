/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.History;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class BackerBook {
    public History add(List<History> histories){
        History history = new History();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < histories.size(); i++) {
            History h = histories.get(i);
            System.out.println(i+1+". "+h.getReader().getName()
                    +" "+h.getReader().getSurname()
                    +": "+h.getBook().getName());
        }
            System.out.println("Выберите номер строки с возвращаемой книгой: ");
            String numHistory = scanner.nextLine();
            history = histories.get((int) (new Long(numHistory)-1));
            histories.remove(history);
            Calendar c = new GregorianCalendar();
            history.setDateEnd(c.getTime());
        return history;
    }
}
