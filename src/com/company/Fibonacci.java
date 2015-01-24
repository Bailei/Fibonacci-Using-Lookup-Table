package com.company;
import java.net.*;
import java.io.*;

/**
 * Created by Tao on 1/24/15.
 */
public class Fibonacci {
    public static void getFib (int number) throws Exception {
        URL u = new URL("http://mersennus.net/fibonacci/f100.txt");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(u.openStream())
        );

        int count = 0;
        String inputLine;
        while((inputLine = in.readLine()) != null && count != number) {
            count ++;
        }
        System.out.println(inputLine);
        in.close();
    }
}
