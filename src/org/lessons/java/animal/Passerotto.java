package org.lessons.java.animal;

public class Passerotto extends AbstractAnimale implements IVolante{

    public Passerotto(String verso,String mangia ){
        super( verso, mangia);
    }

    @Override
    public String Volando() {
        return "Sta Volando";
    }
}