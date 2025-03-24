package org.lessons.java.animal;

public class Aquila extends AbstractAnimale implements IVolante{

    public Aquila( String verso,String mangia ){
        super( verso, mangia);
    }

    @Override
    public String Volando() {
        return "Sta Volando";
    }


    

}
