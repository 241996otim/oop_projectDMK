/*
    STUDENT NAME                REG. NUMBER
 1. Thomas Otim Dominic         19/766/BIT-S
 2. Kirinya Moses Aventore      19/589/BSCS-S

 */

package org.iuea.oop.modall;

import java.lang.reflect.Array;

/**
 *
 * @author DMK
 */
public class HelperClass {
    
    //method to resize an array..
    public static Object resizeArray(Object oldArray, int newSize){
        int oldSize = Array.getLength(oldArray);
        Class elementType = oldArray.getClass().getComponentType();
        Object newArray = Array.newInstance(elementType, newSize);
        int len = Math.min(oldSize, newSize);
        if(len > 0){
            System.arraycopy(oldArray, 0, newArray, 0, len);
        }
        return newArray;
    }
    
}
