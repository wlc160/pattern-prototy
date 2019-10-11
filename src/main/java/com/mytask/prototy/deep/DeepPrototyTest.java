package com.mytask.prototy.deep;

/**
 * 工程名:pattern-prototy
 * 包名:com.mytask.prototy.deep
 * 文件名:DeepPrototyTest
 * description:
 *
 * @author lcwen
 * @version V1.0: DeepPrototyTest.java 2019/10/11 11:15
 **/
public class DeepPrototyTest {

    public static void main(String[] args) {

        President deep = new President();
        try{
            President copyDeep = (President)deep.clone();
            System.out.println("深克隆比较：" + (copyDeep.power == deep.power));
        }catch(Exception e){
            e.printStackTrace();
        }

        President shallow = new President();
        President copyShallow = shallow.shallowClone(shallow);
        System.out.println("浅克隆比较：" + (shallow.power == copyShallow.power));

        /**
         * 结果：深克隆比较：false
                浅克隆比较：true
           结论：深克隆破坏单例；
           要防止克隆破坏单例
          （1）禁止深克隆
          （2）单例类不实现 Cloneable 接口
          （3）重写 clone()方法，在 clone方法中返回单例对象
           如 @Override protected Object clone() throws CloneNotSupportedException { return INSTANCE; }
         */
    }
}
