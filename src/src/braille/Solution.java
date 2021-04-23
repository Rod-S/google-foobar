package braille;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static String solution(String s) {
        // Your code here
        HashMap<Character, int[][]> brailleAlphabet = new HashMap<Character, int[][]>() {{
            put('a', new int[][]{{1, 0}, {0, 0}, {0, 0}});
            put('b', new int[][]{{1, 0}, {1, 0}, {0, 0}});
            put('c', new int[][]{{1, 1}, {0, 0}, {0, 0}});
            put('d', new int[][]{{1, 1}, {0, 1}, {0, 0}});
            put('e', new int[][]{{1, 0}, {0, 1}, {0, 0}});
            put('f', new int[][]{{1, 1}, {1, 0}, {0, 0}});
            put('g', new int[][]{{1, 1}, {1, 1}, {0, 0}});
            put('h', new int[][]{{1, 0}, {1, 1}, {0, 0}});
            put('i', new int[][]{{0, 1}, {1, 0}, {0, 0}});
            put('j', new int[][]{{0, 1}, {1, 1}, {0, 0}});
            put('k', new int[][]{{1, 0}, {0, 0}, {1, 0}});
            put('l', new int[][]{{1, 0}, {1, 0}, {1, 0}});
            put('m', new int[][]{{1, 1}, {0, 0}, {1, 0}});
            put('n', new int[][]{{1, 1}, {0, 1}, {1, 0}});
            put('o', new int[][]{{1, 0}, {0, 1}, {1, 0}});
            put('p', new int[][]{{1, 1}, {1, 0}, {1, 0}});
            put('q', new int[][]{{1, 1}, {1, 1}, {1, 0}});
            put('r', new int[][]{{1, 0}, {1, 1}, {1, 0}});
            put('s', new int[][]{{0, 1}, {1, 0}, {1, 0}});
            put('t', new int[][]{{0, 1}, {1, 1}, {1, 0}});
            put('u', new int[][]{{1, 0}, {0, 0}, {1, 1}});
            put('v', new int[][]{{1, 0}, {1, 0}, {1, 1}});
            put('w', new int[][]{{0, 1}, {1, 1}, {0, 1}});
            put('x', new int[][]{{1, 1}, {0, 0}, {1, 1}});
            put('y', new int[][]{{1, 1}, {0, 1}, {1, 1}});
            put('z', new int[][]{{1, 0}, {0, 1}, {1, 1}});
            put(' ', new int[][]{{0, 0}, {0, 0}, {0, 0}});


        }};
        char[] strArray = s.toCharArray();
        List<int[][]> charAccumulator = new ArrayList<>();
        for (char letter : strArray) {
            if (letter == Character.toUpperCase(letter) & letter != ' '){
                charAccumulator.add(new int[][]{{0, 0}, {0, 0}, {0, 1}});
                charAccumulator.add(brailleAlphabet.get(Character.toLowerCase(letter)));
            } else {
                charAccumulator.add(brailleAlphabet.get(letter));
            }
        }
        List<List<Integer>> brailleAccumulator = new ArrayList<>();
        for (int[][] brailleChar : charAccumulator) {
            List<int[]> letterCollector = new ArrayList<>();
            for (int i = 0; i < brailleChar.length; i++) {
                for (int[] array : brailleChar) {
                    letterCollector.add(array);
                }
            }
            List<Integer> brailleEncoder = new ArrayList<>();
            for (int i=0; i<2; i++) {
                for (int j=0; j<3; j++) {
                    brailleEncoder.add(letterCollector.get(j)[i]);
                }
            }
            brailleAccumulator.add(brailleEncoder);
        }
        List<Integer> flattenedArray = brailleAccumulator.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        String completeBrailleStr = flattenedArray.stream().map(String::valueOf)
                .collect(Collectors.joining(""));
        System.out.println(completeBrailleStr);
        return completeBrailleStr;
    }
}