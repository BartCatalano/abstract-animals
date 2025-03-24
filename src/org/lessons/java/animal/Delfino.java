package org.lessons.java.animal;

public class Delfino extends AbstractAnimale implements INuotante{

    public Delfino( String verso,String mangia ){
        super( verso, mangia);
    }

    @Override
    public String nuotare() {
         return "Sta Nuotando";
    }

}
