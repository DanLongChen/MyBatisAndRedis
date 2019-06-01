package com.entity;

/**
 * Created by Paser on 2019/3/5.
 */
public enum Enum_Sex {
    Man(0),Woman(1);
    public String sex;
    Enum_Sex(int sex){
        this.sex=String.valueOf(sex);
    }
    public String getSex(){
        return sex;
    }


    @Override
    public String toString() {
        return this.sex;
    }
    public static Enum_Sex get(int i){
        for(Enum_Sex e:Enum_Sex.values()){
            if(e.getSex().equals(String.valueOf(i))){
                return e;
            }
        }
        return null;
    }

}
