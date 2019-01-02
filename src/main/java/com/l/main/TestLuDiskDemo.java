package com.l.main;

import com.l.main.board.domain.Weight;
import com.l.main.board.service.ShowPackageBoxSum;
import com.l.main.board.serviceImpl.PackageBoxSum;

import java.text.DecimalFormat;

public class TestLuDiskDemo {
    public static void main(String[] args){

        ShowPackageBoxSum spbs = new PackageBoxSum();
        Long before = System.currentTimeMillis();
        Weight s = spbs.show_PackageBoxSum("2018-11-30 0:0:0","2018-11-31 23:00:00");
        Long after = System.currentTimeMillis();
        System.out.println("总净重："+s.getWeight()+"吨");
        System.out.println("双a率："+s.getDoubleARate());
        Long cost = after-before;
        System.out.println("耗时："+cost+"毫秒");

       /*int i = 1;
       int j = 2;
        DecimalFormat df = new DecimalFormat("0.00");

        float f = (float)i / j;
       System.out.println(f);*/
    }
}
