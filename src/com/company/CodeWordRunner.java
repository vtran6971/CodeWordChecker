package com.company;

public class CodeWordRunner implements CodeWordChecker{
    public static void main(String[] args)
    {
        StringChecker sc1 = new CodeWordChecker(5, 6, "$");
        StringChecker sc2 = new CodeWordChecker("pass");

        System.out.println(sc1.isValid("happy"));
        System.out.println(sc1.isValid("happy$"));
        System.out.println(sc1.isValid("Code"));
        System.out.println(sc1.isValid("hppyCode"));

        System.out.println(sc2.isValid("MyPass"));
        System.out.println(sc2.isValid("MypassPort"));
        System.out.println(sc2.isValid("happy"));
        System.out.println(sc2.isValid("1,000,000,000,000,000"));
    }
}
