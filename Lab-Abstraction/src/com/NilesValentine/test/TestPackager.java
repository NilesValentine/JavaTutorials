package com.NilesValentine.test;

import com.NilesValentine.builders.Assembler;
import com.NilesValentine.interfaces.Packager;

public class TestPackager {
	
    public static void main(String[] args) {
        Packager packager = new Assembler();
        Package myPackage = packager.assemblePackage();

        System.out.println(myPackage);
    }

}
