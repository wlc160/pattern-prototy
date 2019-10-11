package com.mytask.prototy.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 工程名:pattern-prototy
 * 包名:com.mytask.prototy.simple
 * 文件名:SimplePrototyTest
 * description:
 *
 * @author lcwen
 * @version V1.0: SimplePrototyTest.java 2019/10/11 9:27
 **/
public class SimplePrototyTest {

    public static void main(String[] args) {
        ConcretePrototype cpt = new ConcretePrototype();
        cpt.setName("lcwen");
        cpt.setAge(18);
        cpt.setHobbies(new ArrayList<String>());

        System.out.println("ConcretePrototype==>" + cpt);

        Client client = new Client(cpt);
        ConcretePrototype clone_cpt = (ConcretePrototype) client.startClone(cpt);

        System.out.println("Clone-ConcretePrototype==>" + clone_cpt);


        System.out.println("克隆对象中的引用类型地址：" + clone_cpt.getHobbies());
        System.out.println("原对象中的引用类型地址：" + cpt.getHobbies());
        System.out.println("对象地址比较：" + (clone_cpt.getHobbies() == cpt.getHobbies()));


        /** 结果为：
         * ConcretePrototype==>com.mytask.prototy.simple.ConcretePrototype@1b6d3586
            Clone-ConcretePrototype==>com.mytask.prototy.simple.ConcretePrototype@4554617c
            克隆对象中的引用类型地址：[]
            原对象中的引用类型地址：[]
            对象地址比较：true

            得出结论：简单克隆复制的是引用地址，而不是引用对象的值；
            容易出现的问题就是修改其中一个对象的属性值，克隆对象和原对象的引用对象都会改变；
            这种克隆简称浅克隆：只是完整复制了值类型数据，没有赋值引用对象
            也可以这样说，所有的引用对象仍然指向原来的对象，显然不是我们想要的结果。
         */
    }
}
