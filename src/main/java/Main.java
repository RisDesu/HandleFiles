
import controller.PersonManager;
import view.Menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {
        String title = "File Processing";
        String[] s = new String[]{"Find person info", "Copy Text to new file", "Exit"};
        Menu<String> menu = new PersonManager(title, s);
        menu.run();
    }
}
