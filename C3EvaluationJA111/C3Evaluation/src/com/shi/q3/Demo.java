package com.shi.q3;

import java.time.Month;

public class Demo {

	public static void main(String[] args) {
		Demo demo = new Demo();
		
		demo.valuesMethod();
		
    }

    public void valuesMethod() {
        for (Month m: Month.values()) {
            System.out.println(m);
        }
    }

}
