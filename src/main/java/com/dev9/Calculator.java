package com.dev9;

import java.util.EventListener;
import java.util.StringTokenizer;

public class Calculator {

    private double state;

    public Calculator add(double value) {
        state += value;
        return this;
    }

    public Calculator subtract(double value) {
        state -= value;
        return this;
    }

    public Calculator multiply(double value) {
        state = state * value;
        return this;
    }

    public Calculator divide(double value) {
        state = state / value;
        return this;
    }

    public double value() {
        return state;
    }

    // TODO figure out the transwarp requirements.
    public double transwarp(double value) {
        throw new UnsupportedOperationException("No transwarp defined.");
    }

    /**
     * Method intended to trip the PMD violations error. Hopefully you find this method as horrifying as I do even without PMD.
     */
    public int arbitrarilyComplexMethod(String foo, int bar, Object spam, EventListener eventListener, StringTokenizer stringTokenizer) {

        try {
            System.out.println(foo);
        } catch (Exception e) {

        }

        try {
            System.out.println(foo);
        } catch (Exception e) {

        }


        if (foo == "bar")
            return 0;

        if (bar++ == -100)
            return Long.BYTES;

        return Integer.valueOf(foo + bar + spam.toString() + eventListener.toString() + stringTokenizer.toString());
    }

    /**
     * Method intended to trip the CPM violations error
     */
    public int arbitrarilyComplexMethodPart2(String foo, int bar, Object spam, EventListener eventListener, StringTokenizer stringTokenizer) {
        try {
            System.out.println(foo);
        } catch (Exception e) {

        }

        try {
            System.out.println(foo);
        } catch (Exception e) {

        }

        if (foo == "bar")
            return 0;

        if (bar++ == -100)
            return Long.BYTES;

        return Integer.valueOf(foo + bar + spam.toString() + eventListener.toString() + stringTokenizer.toString());
    }

}
