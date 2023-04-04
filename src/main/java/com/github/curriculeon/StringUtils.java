package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtils {
    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> indicesList =  Arrays.asList(indices);
        for (int i = 0; i < string.length(); i++) {
            Character curr = string.charAt(i);
            String upperCaseCurr = curr.toString().toUpperCase();
            if (indicesList.contains(i)) {
                stringBuilder.append(upperCaseCurr);
            } else {
                stringBuilder.append(curr);
            }


        }
        return stringBuilder.toString();
    }


    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        StringBuilder stringBuilder = new StringBuilder(stringToBeManipulated);
        stringBuilder.insert(index,valueToBeInserted);
        return stringBuilder.toString();
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        String strToReturn = "";
        for (int i = 0; i <stringToBeManipulated.length(); i++) {
            if(i == index) {
                strToReturn+=replacementValue;
            } else {
                strToReturn+=stringToBeManipulated.charAt(i);
            }
        }
        return strToReturn;
    }
}
