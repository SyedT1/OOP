/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniutilities;

/**
 *
 * @author thinker
 */
public class UniInfo {

    //static and final
    private final String name;
    private static String Notice;

    public UniInfo(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void viewNotice() {
        System.out.println(Notice);
    }

    public void setNotice(String Notice) {
        this.Notice = Notice;
    }
}
