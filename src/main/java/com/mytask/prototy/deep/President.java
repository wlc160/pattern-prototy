package com.mytask.prototy.deep;

import java.io.*;
import java.util.Date;

/**
 * 工程名:pattern-prototy
 * 包名:com.mytask.prototy.deep
 * 文件名:President
 * description:
 *
 * @author lcwen
 * @version V1.0: President.java 2019/10/11 10:54
 **/
public class President extends Staff implements Cloneable,Serializable {

    public Power power;

    public President(){
        this.birthday = new Date();
        this.power = new Power();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    /**
     * 深克隆
     * @return
     */
    public Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            President copy = (President)ois.readObject();

            copy.birthday = new Date();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 浅克隆
     * @return
     */
    public President shallowClone(President target){

        President president = new President();
        president.gender = target.gender;
        president.jobNumber = target.jobNumber;

        president.power = target.power;
        president.birthday = new Date();
        return president;
    }
}
