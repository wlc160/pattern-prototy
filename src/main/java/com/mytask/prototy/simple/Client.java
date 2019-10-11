package com.mytask.prototy.simple;

/**
 * 工程名:pattern-prototy
 * 包名:com.mytask.prototy.simple
 * 文件名:Client
 * description:
 *
 * @author lcwen
 * @version V1.0: Client.java 2019/10/11 9:23
 **/
public class Client {

    private Prototype prototype;

    public Client(Prototype prototype){
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype pt){
        return pt.clone();
    }

}
