/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.PersonList;
import view.Menu;

/**
 *
 * @author HP
 */
public class PersonManager extends Menu<String> {

    private PersonList list = new PersonList();

    public PersonManager(String title, String[] s) {
        super(title, s);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                list.findPersonInfo();
                break;
            case 2:
                list.coppyNewFile();
                break;
            case 3:
                System.exit(0);
        }
    }
}
