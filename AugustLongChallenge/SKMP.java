package com.company.AugustLongChallenge;

import java.io.IOException;
import java.util.*;

public class SKMP {
    public static void main(String[] args) throws IOException {
        try{
            Scanner scn = new Scanner(System.in);
            int T = scn.nextInt();
            scn.nextLine();
            for (int i = 0; i < T; i++) {
//                String S = s.nextLine();
//                String P = s.nextLine();
//                HashMap<Character,Integer> map1 = new HashMap<>();
////                HashMap<Character,Integer> map2 = new HashMap<>();
//                for (int j = 0; j < S.length(); j++) {
//                    if(map1.containsKey(S.charAt(j))){
//                        map1.put(S.charAt(j),map1.get(S.charAt(j))+1);
//                    }
//                    else map1.put(S.charAt(j),1);
//                }
//                for (int j = 0; j < P.length(); j++) {
//                    map1.put(P.charAt(j),map1.get(P.charAt(j))-1);
//                }
////                System.out.println(map1);
//                ArrayList<Character> array = new ArrayList<>();
//                for (char j : map1.keySet()) {
//                    for (int k = 0; k < map1.get(j); k++) {
//                        array.add(j);
//                    }
//                }
//                Collections.sort(array);
////                System.out.println("Hello");
////                --------------------------------------------- sorted string constructed without pattern, Now find the correct position to place pattern
//
//                int index = array.size();
//                int firstIndex = array.size();
//                int lastIndex = array.size();
//                for (int j = 0; j <array.size() ; j++) {
//                    if(array.get(j)>P.charAt(0)){
//                        lastIndex = j;
//                        break;
//                    }
//                }
////                System.out.println(map1.get(P.charAt(0)));
//                firstIndex = Math.abs(lastIndex-map1.get(P.charAt(0)));
//                System.out.println(firstIndex +" " + lastIndex + " " + array);
//                for (int j = 0; j <P.length() ; j++) {
//                    if(P.charAt(j)<=array.get(firstIndex))index = firstIndex-1;
//                    else index = lastIndex;
//                }
//                String ans = "";
//                for (int j = 0; j <array.size() ; j++) {
//                    ans+=array.get(j);
//                }
//                ans = ans.substring(0,index)+P+ans.substring(index);
//                System.out.println(ans);
                String[] s = scn.next().split("");
                String p1 = scn.next();
                char[] p = p1.toCharArray();
                HashMap<Character, Integer> map = CountFrequenciesCharacter(p);
                ArrayList<String> charlist = new ArrayList<>();
                Arrays.sort(s);
                int slen = s.length;
                boolean[] doccur = new boolean[slen];
                for (int i1 = 0; i1 < slen; i1++) {
                    char ch = s[i1].charAt(0);
                    if (map.containsKey(ch)) {
                        doccur[i1] = true;
                        map.put(ch, map.get(ch) - 1);
                        if (map.get(ch) == 0) {
                            map.remove(ch);
                        }
                    }
                }
                for (int i1 = 0; i1 < s.length; i1++) {
                    if (!doccur[i1])
                        charlist.add(s[i1]);
                }
                char ch1 = '%';
                char ch2 = '%';
                int pLen = p.length;
                boolean check1 = false;
                if (pLen > 0) {
                    ch1 = p[0];
                    if (pLen > 1) {
                        for (int i1 = 0; i1 < pLen; i1++) {
                            if (p[i1] != ch1) {
                                ch2 = p[i1];
                                check1 = true;
                                break;
                            }
                        }
                    }
                }
                // 1 bcsakjcbsakhcsabkjashcshckjashckjashkjsah sbkkjjsah
                Collections.sort(charlist);
//		System.out.println(charlist);
                if (ch2 != '%') {
                    if (check1 && (int) ch2 < (int) ch1) {
                        int loop1 = charlist.size();
                        for (int i1 = 0; i1 < loop1; i1++) {
                            if ((int) charlist.get(i1).charAt(0) >= (int) p[0]) {
                                charlist.add(i1, p1);
                                break;
                            } else {
                                if (i1 == loop1 - 1) {
                                    charlist.add(i1 + 1, p1);
                                    break;
                                }
                            }
                        }
                    } else {
                        charlist.add(p1);
                        Collections.sort(charlist);
                    }
                } else {
                    charlist.add(p1);
                    Collections.sort(charlist);
                }
                int loop = charlist.size();
                StringBuilder sb = new StringBuilder();
                for (int i1 = 0; i1 < loop; i1++) {
                    sb.append(charlist.get(i1));
                }
                System.out.println(sb);

            }
        }
        catch (Exception e){
            return;
        }
    }
    public static HashMap<Character, Integer> CountFrequenciesCharacter(char[] arr) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            char a = arr[i];
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        return map;
    }
}
