package org.lessons.java.animal;

public abstract class AbstractAnimale {
 protected String dormi;
 protected String verso;
 protected String mangia;
    
public AbstractAnimale (String dormi,String verso, String mangia){
    this.dormi = "zzZZZzz";
    this.verso = verso;
    this.mangia = mangia;
}

public void setDormi(String dormi){
    this.dormi = dormi;
}

public String getDormi(){
    return this.dormi;
}


public void setMangia( String mangia){
    this.mangia = mangia;
}

public String getMangia(){
    return this.mangia;
}

public void setVerso( String verso){
    this.verso = verso;
}

public String getVerso(){
    return this.verso;
}



}
