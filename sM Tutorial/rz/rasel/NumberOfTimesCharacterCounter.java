package com.rz.rasel;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
{DELAY=200}{ENTER}
{ENTER}
// Method used to count characters in a String{ENTER}
pu{ENTER}vo{ENTER}countChars{(}Str{ENTER} argMessage{END} {{}{ENTER}
Ma{ENTER}{<}Ch{ENTER}, Int{ENTER}{END} charCounterMap = new Hm{ENTER}{END};{ENTER}
fo{ENTER}in{ENTER} i = 0; i < ar{ENTER}.le{ENTER}; i{+}{+}{END} {{}{ENTER}
// Take one character at a time{ENTER}
char c = ar{ENTER}.ch{ENTER}i{END};{ENTER}
// We are skip to count spaces characters{ENTER}
if{ENTER}c == ' {END} {{}{ENTER}
co{ENTER}{DOWN}{ENTER{ENTER}
// If character is already in the map then increase the value by 1{ENTER}
if{ENTER}ccm{ENTER}.cok{ENTER}c{END} {{}{ENTER}
ccm{ENTER}.p{ENTER}c, ccm{ENTER}.g{ENTER}i{)} {+} 1{)};{DOWN} el{ENTER}{{}{ENTER}
// Otherwise put the character in the map with initially count value 1{ENTER}
ccm{ENTER}.p{ENTER}c, 1{)};{DOWN}{DOWN}{ENTER}{ENTER}
// Displaying the character counter map values{ENTER}
Set<M{ENTER}.En{ENTER}<Ch{ENTER}, Int{ENTER}>> counterSet = ccm.ens{ENTER};{ENTER}
for{ENTER}M{ENTER}.En{ENTER}<Ch{ENTER}, Int{ENTER}> item : cs{ENTER}{END} {{}{ENTER}
S.o{ENTER}.{ENTER}{LEFT}{LEFT}"Char- " {+} it{ENTER}.gk{ENTER} {+} " Count- " {+} it{ENTER}.gv{ENTER}{END}{DOWN}{DOWN}{ENTER}{ENTER}

pu{ENTER}st{ENTER}v{ENTER} main{(}Str{ENTER}{[} args{END} {{}{ENTER}
NOTC{ENTER} ch{ENTER} = new NOTC{ENTER};{ENTER}
cc{ENTER}.cc{ENTER}"Hi I am Rashed - Uz - Zaman In short Rz Rasel. Please subscribe and like my channel BADGE MATE"{)};{ENTER}
//A BADGE MATE Tutorial
*/
public class NumberOfTimesCharacterCounter {
    public void countChars(String argMessage) {
        Map<Character, Integer> charCounterMap = new HashMap<>();
        for (int i = 0; i < argMessage.length(); i++) {
            char c = argMessage.charAt(i);
            if (c == ' ') {
                continue;
            }
            if (charCounterMap.containsKey(c)) {
                charCounterMap.put(c, charCounterMap.get(i) + 1);
            } else {
                charCounterMap.put(c, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> counterSet = charCounterMap.entrySet();
        for (Map.Entry<Character, Integer> item : counterSet) {
            System.out.println("Char- " + item.getKey() + " Count- " + item.getValue());
        }
    }
    public static void main(String[] args) {
        NumberOfTimesCharacterCounter characterCounter = new NumberOfTimesCharacterCounter();
        characterCounter.countChars("Hi I am Rashed - Uz - Zaman In short Rz Rasel. Please subscribe and like my channel BADGE MATE");
    }
}
/*

*/
/*
TimesCharacterCounter
Count Total Number of Times Each Character Appears in a String - Java
*/
//https://www.geeksforgeeks.org/count-occurrences-elements-list-java/
//https://www.baeldung.com/java-count-chars
//https://www.youtube.com/watch?v=ruYy57whS4Y
/*
Modern Instagram Stories in After Effects | After Effects Tutorial | Effect For You
https://www.youtube.com/watch?v=XrH76lzGytU
After Effects Tutorial - NBA Lights - EASY!
https://www.youtube.com/watch?v=X37S5qFH1cE
https://www.youtube.com/watch?v=Z56CGm0rLpQ
3D Ink Drop Slideshow in after effect | After Effects Tutorial | Effect For You.
https://www.youtube.com/watch?v=Re0PMVz3-rg
After Effects Tutorial - NBA Lights - EASY!
https://www.youtube.com/watch?v=X37S5qFH1cE
Elegant Blocks Slideshow in after effects | After Effects Tutorial | Effect For You
https://www.youtube.com/watch?v=tZ-fRc1ufGw
3D Motion Poster in After Effects | After Effects Tutorial | Effect for you
https://www.youtube.com/watch?v=PysSzwJZixc
Minimal Corporate Slideshow in After Effect | After Effects Tutorial | Effect For You
https://www.youtube.com/watch?v=UfOBkQCARf4
Search Logo Reveal in After Effect | After Effect Tutorial | Effect For You
https://www.youtube.com/watch?v=I_JSgOe9l0U
Website Presentation in After Effects | After Effects Tutorial | Effect For You
https://www.youtube.com/watch?v=VB9tOoIfYro
After Effects Tutorial - Ink Watercolor Reveal
https://www.youtube.com/watch?v=YCr0Flw91tw
Minimal Modern Instagram Stories | After Effects Tutorial | Effect For You
https://www.youtube.com/watch?v=4oNLFp-3q3Q
Tutorial - Watercolor and Paint After Effects
https://www.youtube.com/watch?v=K2i6TLXKUWc
After Effects Parallax Slideshow Tutorial
https://www.youtube.com/watch?v=7eRqc88D5gc
AFTER EFFECTS TUTORIAL : Cinematic Title Animation in After Effects - No Plugin |
https://www.youtube.com/watch?v=-XJMvoiBvKI
How to Make a Paint Splatter Effect in After Effects EASY [After Effects CS6 & CC]
https://www.youtube.com/watch?v=i3oLRTWN2OQ
AFTER EFFECTS TUTORIAL : Parallax Photo Effect Image Slideshow Tutorial -After Effects
https://www.youtube.com/watch?v=Ga1WGvsBaLw
After Effects Tutorial - Slideshow
https://www.youtube.com/watch?v=utik_9xAwlw
Polaroid Slideshow & Intro to Graph Editing - Tutorial Adobe After Effects CS6
https://www.youtube.com/watch?v=wswdSr2IffM
After Effects Tutorial - TEXT REVEAL
https://www.youtube.com/watch?v=EJgCk7h3FQ8
FUTURISTIC SLIDESHOW - Adobe After Effects Tutorial !
https://www.youtube.com/watch?v=744y8eLHbSo
After Effects | Smooth Slide Transition
https://www.youtube.com/watch?v=rYyEzxyJUQ0
After Effects | Smooth Zoom In & Zoom Out Transition
https://www.youtube.com/watch?v=MZ-kTVgVjyE
https://www.youtube.com/watch?v=LZRc4L_TZzs
https://www.youtube.com/watch?v=gy-lm5wEzqw
Pad:
https://www.youtube.com/watch?v=Yp6UQXu4rPI&list=PLFBrPBu1Ty_fFTwlZl6JyZGyr5LylDuDY
ICT:
https://www.youtube.com/watch?v=X9kXKtM9nbo
https://www.youtube.com/watch?v=wpGNFGqNfdU
EXAMPLE:
https://www.youtube.com/watch?v=M-mVnrp1dQk

https://www.youtube.com/watch?v=DucyFUXjkUo
http://vfxdownload.com/time-travel-v1-8-timeline-wordpress-theme-free-download/
https://shareae.com/after-effects-project/openers/11647-videohive-vintage-history.html
https://shareae.com/tags/history/page/3/
https://shareae.com/after-effects-project/video-displays/9767-videohive-the-scientific-revolution-parallax-slideshow.html
https://shareae.com/after-effects-project/openers/8989-videohive-seas-of-clouds-history-opener.html
https://shareae.com/after-effects-project/logo-stings/7687-videohive-ink-logo.html
*/
//https://www.youtube.com/watch?v=2alnPBLDELM