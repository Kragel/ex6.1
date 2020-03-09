/*Create a class in a package. Create an instance of your class outside of that
package. */
package com.company;

public class Main {

    public static void main(String[] args) {
        com.mypackage.MyPackagedClass m = new com.mypackage.MyPackagedClass();
    }
}
