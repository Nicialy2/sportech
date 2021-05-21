package com.example.maptest;

public class Employee {
    private int ID;
    
    private Shop shop;
    //Конструктор
    public Employee (int ID){
        this.ID = ID;
        //etc.
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    //Разрешение на использование
   /* public boolean givePermission(){
        if (){
            return true;
        }
        else
            return false;
    }*/
}
