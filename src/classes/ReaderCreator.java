/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class ReaderCreator {
    public Reader add(){
        Reader reader = new Reader();
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Добавляем читателя -----");
        System.out.println("Имя: ");
        reader.setName(scanner.nextLine());
        System.out.println("Фамилия: ");
        reader.setSurname(scanner.nextLine());
        System.out.println("Личный код: ");
        reader.setCode(scanner.nextLine());
        return reader;
        
    }
}
