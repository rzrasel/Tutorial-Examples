package com.rz.rasel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/*
{DELAY=200}
{ENTER}
{ENTER}
//Create list{ENTER}
Li{ENTER}<Str{ENTER}{END} languageList = new Al{ENTER}{LEFT}{LEFT}Str{ENTER}{END};{ENTER}
{ENTER}
//Add values into list
l.a{ENTER}"Java{END};{ENTER}
l.a{ENTER}"Swift{END};{ENTER}
l.a{ENTER}"Unity{END};{ENTER}
l.a{ENTER}"Python{END};{ENTER}
l.a{ENTER}"Php{END};{ENTER}
{ENTER}
//Iterate list via "for loop"{ENTER}
S.o{ENTER}.{ENTER}{LEFT}{LEFT}"For Loop Example:"{END}{ENTER}
fo{ENTER}int i = 0; i < l.s{ENTER}; i{+}{+}{END} {{}{ENTER}
S.o{ENTER}.{ENTER}{LEFT}{LEFT}l.g{ENTER}i{END}{DOWN}{ENTER}
{ENTER}
//Iterate via "foreach loop"{ENTER}
S.o{ENTER}.{ENTER}{LEFT}{LEFT}"Foreach Loop Example:"{END}{ENTER}
fo{ENTER}Str{ENTER} item : ll{ENTER}{)} {{}{ENTER}
S.o{ENTER}.{ENTER}{LEFT}{LEFT}item{END}{DOWN}{ENTER}
{ENTER}
//Iterate via "iterator loop"{ENTER}
S.o{ENTER}.{ENTER}{LEFT}{LEFT}"Iterator Example:"{END}{ENTER}
It{ENTER}<Str{ENTER}{END} i{ENTER} = l.i{ENTER};{ENTER}
wh{ENTER}i.h{ENTER}{END} {{}{ENTER}
S.o{ENTER}.{ENTER}{LEFT}{LEFT}i.n{ENTER}{END}{DOWN}{ENTER}
{ENTER}
//Iterate via "while loop"{ENTER}
S.o{ENTER}.{ENTER}{LEFT}{LEFT}"While Loop Example:"{END}{ENTER}
in{ENTER} i = 0;{ENTER}
wh{ENTER}i < l.s{ENTER}{END} {{}{ENTER}
S.o{ENTER}.{ENTER}{LEFT}{LEFT}l.g{ENTER}i{END}{ENTER}
i{+}{+};{DOWN}{ENTER}
{ENTER}
//Enumerate through the list elements{ENTER}
En{ENTER}<Str{ENTER} e{ENTER} = Col.e{ENTER}ll{ENTER}{)};{ENTER}
S.o{ENTER}.{ENTER}{LEFT}{LEFT}"Enumeration Example:{END}{ENTER}
wh{ENTER}e.h{ENTER}{END} {{}{ENTER}
S.o{ENTER}.{ENTER}{LEFT}{LEFT}e.n{ENTER}{END}{DOWN}{ENTER}
{ENTER}
//Collection stream{ENTER}
S.o{ENTER}.{ENTER}{LEFT}{LEFT}"Collection Example:{END}{ENTER}
ll{ENTER}.fo{ENTER}{(}item -> {{}{ENTER}
S.o{ENTER}.{ENTER}{LEFT}{LEFT}it{ENTER}{END}{DOWN}
*/
public class ListIterate {

    public static void main(String[] argv) {

        //Create list
        List<String> languageList = new ArrayList<String>();

        //Add 4 different values to list
        languageList.add("Java");
        languageList.add("Swift");
        languageList.add("Unity");
        languageList.add("Python");
        languageList.add("Php");

        for (int i = 0; i < languageList.size(); i++) {
            System.out.println(languageList.get(i));
        }

        //Iterate via "for loop"
        System.out.println("==> For Loop Example.");
        for (int i = 0; i < languageList.size(); i++) {
            System.out.println(languageList.get(i));
        }

        //Iterate via "New way to loop"
        System.out.println("\n==> Advance For Loop Example..");
        for (String temp : languageList) {
            System.out.println(temp);
        }

        //Iterate via "iterator loop"
        System.out.println("\n==> Iterator Example...");
        Iterator<String> crunchifyIterator = languageList.iterator();
        while (crunchifyIterator.hasNext()) {
            System.out.println(crunchifyIterator.next());
        }

        //Iterate via "while loop"
        System.out.println("\n==> While Loop Example....");
        int i = 0;
        while (i < languageList.size()) {
            System.out.println(languageList.get(i));
            i++;
        }

        //Collection stream() util: Returns a sequential Stream with this collection as its source
        /*System.out.println("\n==> collection stream() util....");
        languageList.forEach((temp) -> {
            System.out.println(temp);
        });*/
    }
}
//https://crunchify.com/how-to-iterate-through-java-list-4-way-to-iterate-through-loop/