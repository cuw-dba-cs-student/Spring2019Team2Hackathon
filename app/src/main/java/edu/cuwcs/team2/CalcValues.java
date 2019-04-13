package edu.cuwcs.team2;

public class CalcValues
{
    public int presentVal;
    public int intRate;
    public int numYears;
    public int futureVal;
    //private String key;
    //private DatabaseReference ref;


    public CalcValues()
    {
        this.presentVal = 0;
        this.intRate = 0;
        this.numYears = 0;
        this.futureVal = 0;
    }

    public CalcValues(int presentVal, int intRate, int numYears, int futureVal)
    {
        this.presentVal = presentVal;
        this.intRate = intRate;
        this.numYears = numYears;
        this.futureVal = futureVal;
    }

    //no argument constructor required for de-serialization
    //public CalcValues()
    {

    }


    public String toString()
    {
        return this.presentVal + " " + this.intRate + " " + this.numYears + "" + this.futureVal;
    }

    public void display()
    {
        System.out.println("****" + this.presentVal + " " + this.intRate + " " + this.numYears + "" + this.futureVal);
    }
}
