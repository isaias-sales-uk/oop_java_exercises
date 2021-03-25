package com.techreturners.cats;

public class DomesticCat implements Cat{

    public boolean asleep = false;
    public String eat;
    public boolean run = false;
    public int averageHeight;
    public String catType;

    public DomesticCat() {
        this.averageHeight = 23;
        this.catType = "domestic";
        this.eat = "Purrrrrrr";
    }

    public void goToSleep() {
        this.asleep = true;
    }

    public void wakeUp() {
        this.asleep = false;
    }

    public boolean isAsleep(){
        return this.asleep;
    };

    public String getSetting() {
        return this.catType;
    }

    public int getAverageHeight() {
        return this.averageHeight;
    }

    public String eat() {
        return this.eat;
    }

    public void run() {
        this.run = true;
    }

}
