package io.test;

public class Deletable implements Cloneable{

    private String str;
    public Deletable(){
    }
    public void setStr(String str){
        this.str = str;
    }
    public void display(){
        System.out.println("The String is "+str);
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}