package com.example.myapplication;

public class Item {
    private int type; // type - тип инвентаря; 0 - самокат, 1 - велосипед, 2 - лыжи
    private Boolean av; //av это available - свободно или занято
    private int in_id;  //inventory identifier - инвентарный номер

    public Item(int type, int in_id, Boolean av){
        this.in_id = in_id;
        this.av = av;
        this.type = type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setAv(boolean av){
        this.av = av;
    }

    public Boolean getAv() {
        return av;
    }

    public void setIn_id(int in_id){
        this.in_id = in_id;
    }

    public int getIn_id() {
        return in_id;
    }
}
