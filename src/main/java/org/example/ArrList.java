package org.example;

import java.util.ArrayList;

public class ArrList {

    public static void liste(){
        ArrayList<String> namen = new ArrayList<String>();
        namen.add("Fangfanf");
        namen.add("Waleed");
        namen.add("Martin");
        namen.add("Sergej");
        namen.add("Florian");

        for (int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i));
        }
        namen.remove("Sergej");
        namen.remove("Florian");
        System.out.println(namen);
    }
}
