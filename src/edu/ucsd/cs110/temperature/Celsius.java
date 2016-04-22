package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {
    public Celsius(float t)
        {
            super(t);
        }

    @Override
    public Temperature toFahrenheit() {
        float temp = ((this.getValue())*(float)(9.0/5.0))+(float)32;
        return new Fahrenheit(temp);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    public String toString()
        {
            // TODO: Complete this method
            return this.getValue()+ " C";
        }
}
