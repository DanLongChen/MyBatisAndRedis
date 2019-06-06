package com.entity;

/**
 * Created by Paser on 2019/3/5.
 */
public enum Sex {
    Man(0),Woman(1);
    public String sex;
    Sex(int sex){
        this.sex=String.valueOf(sex);
    }
    public String getSex(){
        return sex;
    }


    @Override
    public String toString() {
        return this.sex;
    }
    public static Sex get(int i){
        for(Sex e:Sex.values()){
            if(e.getSex().equals(String.valueOf(i))){
                return e;
            }
        }
        return null;
    }

}
