package com.atguigu.test.abs;

import com.atguigu.test.base.Dog;
import com.atguigu.test.interfaces.Petable;

public class PetableDog extends Dog implements Petable {
    public PetableDog(String name, String color) {
        super(name, color);
    }
}
