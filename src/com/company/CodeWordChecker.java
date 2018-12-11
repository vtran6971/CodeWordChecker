package com.company;

public class CodeWordChecker implements Word
{
    private int min;
    private int max;
    private String symbol;

    public CodeWordChecker(int min, int max, String symbol)
    {
        this.min = min;
        this.max = max;
        this.symbol = symbol;
    }

    public CodeWordChecker(String symbol)
    {
        this.symbol = symbol;
        this.min = 0;
        this.max = 100;
    }

    public Boolean isValid(String value)
    {
        //System.out.println(value);
        //System.out.println(symbol);

        for (int i = 0; i< value.length() && value.length()-i >= symbol.length(); i++)
        {
            //System.out.println("yes");
            if (value.substring(i,symbol.length()+i).equals(symbol))
            {
                return true;
            }
        }
        return false;
    }

}
