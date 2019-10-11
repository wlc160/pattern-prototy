package com.mytask.prototy.deep;

import java.io.Serializable;

/**
 * 工程名:pattern-prototy
 * 包名:com.mytask.prototy.deep
 * 文件名:Power
 * description:权限
 *
 * @author lcwen
 * @version V1.0: Power.java 2019/10/11 10:39
 **/
public class Power implements Serializable{

    public int promoteLevel;//升职等级

    public int finance;//财务

    //升职加工资
    public void upgrade(){
        this.promoteLevel += 1;
        this.finance += 100;
    }

    public void downgrade(){
        this.promoteLevel -= 1;
        this.finance -= 100;
    }


}
