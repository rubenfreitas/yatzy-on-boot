package com.yatzy.on.grails.core.roller;

import java.util.Random;

/**
 * Created by rfreitas
 */
public class Roller {

    public int roll(){
        return new Random().nextInt(6) + 1;
    }
}
