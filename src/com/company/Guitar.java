package com.company;

public class Guitar {

    String color;
    int stringCount;
    int [] tensions;


    public Guitar(String color, int stringCount) {
        this.color = color;
        this.stringCount = stringCount;
        tensions=new int [stringCount];
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStringCount() {
        return stringCount;
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
    }

    public int[] getTensions() {
        return tensions;
    }

    public void setTensions(int[] tensions) {
        this.tensions = tensions;
    }

    public  void  tune(){
        for(int i=0; i>= tensions.length;i++){
            tensions[i]=5;
            System.out.println(tensions[i]+"");
        }
    }
    public  void play(){
        String text = "Песня песня песня песня";
        System.out.println(text);
        unsettle();
    }

    private void unsettle() {
        System.out.println("Натяжение струн после игры");
        for (int j = 0; j < tensions.length; j++) {
            tensions[j] = (int)(Math.random() * (3) + 0);
            System.out.print(tensions[j] + " ");
        }
        System.out.println(" ");
    }
}
