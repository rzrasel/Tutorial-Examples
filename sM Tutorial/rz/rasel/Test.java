package com.rz.rasel;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    // method used to count characters in a String
    public void onCountChars(String message) {
        Map<Character, Integer> numCharMap = new HashMap<Character, Integer>();
        for (int i = 0; i < message.length(); i++) {
            // Take one character
            char c = message.charAt(i);
            // We don't need to count spaces
            if (c == ' ')
                continue;
            // If that character is already there in the map
            // then increase the value by 1
            if (numCharMap.containsKey(c)) {
                numCharMap.put(c, numCharMap.get(c) + 1);
            } else {
                // otherwise put that character in the map
                // with the value as 1
                numCharMap.put(c, 1);
            }
        }
        // Displaying the map values
        Set<Map.Entry<Character, Integer>> numSet = numCharMap.entrySet();
        for (Map.Entry<Character, Integer> m : numSet) {
            System.out.println("Char- " + m.getKey() + " Count " + m.getValue());
        }
    }

    public static void main(String[] args) {
        Test cc = new Test();
        cc.onCountChars("Hi I am Rashed - Uz - Zaman In short Rz Rasel");
    }
}
/*
https://netjs.blogspot.com/2015/06/count-total-number-of-times-each-character-appears-in-string-java.html
https://beginnersbook.com/2013/12/how-to-loop-arraylist-in-java/
https://www.callicoder.com/java-arraylist/

*/
/*
https://exchangeratesapi.io/
https://stackoverflow.com/questions/3139879/how-do-i-get-currency-exchange-rates-via-an-api-such-as-google-finance
https://currencylayer.com/documentation
//https://www.similarweb.com/app/google-play/takar.rate.jameeljahangir/statistics#audienceInterests
//https://www.similarweb.com/apps/top/google/store-rank/bd/finance/top-free
*/
/*
How to iterate through Java List
List Iterate In Java
*/
/*
How to Make YouTube Channel Intro - After Effects Tutorial - No Third Party Plugin
https://www.youtube.com/watch?v=dtgbWINw0T0
Make arrows in After Effects FREE Preset
https://www.youtube.com/watch?v=ACyoP--TmFE
Attach Arrow Tips to a Shape Path in After Effects CC 2018
https://www.youtube.com/watch?v=wt1-A0EYvao
After Effects Text Swapper tutorial
https://www.youtube.com/watch?v=vQ4d-koD_3I
https://www.youtube.com/watch?v=0Tpr3Rhctb8
How to Animate an Icon in After Effects
https://www.youtube.com/watch?v=e_W-LlGrREg
How to create a UI jelly animation in After Effects
https://www.youtube.com/watch?v=OgRLQDvJZh4
[TUTO] Animation fluides avec Animate et After Effects
https://www.youtube.com/watch?v=du1rqAZGSiA
[TUTO] Tracés créatifs avec After Effects
https://www.youtube.com/watch?v=Wi72oTsu_VQ
Gold Coin animation After Effects. Lesson 3D Coin Rotation
https://www.youtube.com/watch?v=biS2unhg1lM
After Effects Tutorial: Merge Path Animation
https://www.youtube.com/watch?v=r_A0HMCfhPA
How to Create a Quick and Simple Logo Bumper In After Effects Tutorial No Third Party Plugins
https://www.youtube.com/watch?v=PoHw_eVJJnc
2D Bow And Arrow Creator
https://www.youtube.com/watch?v=AZPJMO_eOPY
HOW TO MAKE 2D WATER IN UNITY - TUTORIAL
https://www.youtube.com/watch?v=siqRJEgSBZs


PostProp bumper (After Effects)
***https://www.youtube.com/watch?v=Qr6W8XYbkZI

Unity Game Effect

*/