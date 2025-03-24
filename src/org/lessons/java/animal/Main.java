package org.lessons.java.animal;

public class Main {
    public static void main(String[] args) {
        
 Cane Pluto = new Cane("Bau Bau",  "Il Cane sta mangiando");

 System.out.println(Pluto.dormi);
 System.out.println(Pluto.mangia);
 System.out.println(Pluto.verso);

 Aquila Nina = new Aquila("l'Aquila sta Stridendo", "L'Aquila sta mangiando");

System.out.println(Nina.dormi);
 System.out.println(Nina.mangia);
 System.out.println(Nina.verso);
 System.out.println(Nina.Volando());

 Delfino Flipper = new Delfino("fa il verso del delfino", "Il Delfino Mangia");

 System.out.println(Flipper.nuotare());

    }

}
