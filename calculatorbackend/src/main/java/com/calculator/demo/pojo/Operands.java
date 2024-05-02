package com.calculator.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Operands {
    private int a;
    private int b;

//    Operands(int a,int b){
//        this.a = a;
//        this.b = b;
//    }

//    public int getA(){
//        return this.a;
//    }
//
//    public int getB(){
//        return this.b;
//    }

}
