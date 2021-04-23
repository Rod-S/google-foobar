//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.stream.Collectors;
//
//
//public class braille.Solution {
//
////    private static String str1 = "Code";
//
//    public static List<int[]> letterCollector(int[][] mDArray) {
//        List<int[]> letterCollector = new ArrayList<>();
//        for (int i = 0; i < mDArray.length; i++) {
//            for (int[] array : mDArray) {
//                letterCollector.add(array);
//            }
//        }
//        System.out.println(letterCollector);
//        return letterCollector;
//    }
//    public static List<Integer> brailleEncoder(List<int[]> singleArray){
//        List<Integer> brailleEncoder = new ArrayList<>();
//        for (int i=0; i<2; i++) {
//            for (int j=0; j<3; j++) {
//                brailleEncoder.add(singleArray.get(j)[i]);
//            }
//        }
//        return brailleEncoder;
//    }
//
//    public static String solution(String s) {
//
//        HashMap<Character, int[][]> brailleAlphabet = new HashMap<Character, int[][]>() {{
//            put('a', new int[][]{{1, 0}, {0, 0}, {0, 0}});
//            put('b', new int[][]{{1, 0}, {1, 0}, {0, 0}});
//            put('c', new int[][]{{1, 1}, {0, 0}, {0, 0}});
//            put('d', new int[][]{{1, 1}, {0, 1}, {0, 0}});
//            put('e', new int[][]{{1, 0}, {0, 1}, {0, 0}});
//            put('f', new int[][]{{1, 1}, {1, 0}, {0, 0}});
//            put('g', new int[][]{{1, 1}, {1, 1}, {0, 0}});
//            put('h', new int[][]{{1, 0}, {1, 1}, {0, 0}});
//            put('i', new int[][]{{0, 1}, {1, 0}, {0, 0}});
//            put('j', new int[][]{{0, 1}, {1, 1}, {0, 0}});
//            put('k', new int[][]{{1, 0}, {0, 0}, {1, 0}});
//            put('l', new int[][]{{1, 0}, {1, 0}, {1, 0}});
//            put('m', new int[][]{{1, 1}, {0, 0}, {1, 0}});
//            put('n', new int[][]{{1, 1}, {0, 1}, {1, 0}});
//            put('o', new int[][]{{1, 0}, {0, 1}, {1, 0}});
//            put('p', new int[][]{{1, 1}, {1, 0}, {1, 0}});
//            put('q', new int[][]{{1, 1}, {1, 1}, {1, 0}});
//            put('r', new int[][]{{1, 0}, {1, 1}, {1, 0}});
//            put('s', new int[][]{{0, 1}, {1, 0}, {1, 0}});
//            put('t', new int[][]{{0, 1}, {1, 1}, {1, 0}});
//            put('u', new int[][]{{1, 0}, {0, 0}, {1, 1}});
//            put('v', new int[][]{{1, 0}, {1, 0}, {1, 1}});
//            put('w', new int[][]{{1, 0}, {1, 1}, {1, 0}});
//            put('x', new int[][]{{1, 1}, {0, 0}, {1, 1}});
//            put('y', new int[][]{{1, 1}, {0, 1}, {1, 1}});
//            put('z', new int[][]{{1, 0}, {0, 1}, {1, 1}});
//            put(' ', new int[][]{{0, 0}, {0, 0}, {0, 0}});
//
//
//        }};
//        char[] strArray = s.toCharArray();
//        List<int[][]> charAccumulator = new ArrayList<>();
//        for (char letter : strArray) {
//            if (letter == Character.toUpperCase(letter)){
//                charAccumulator.add(new int[][]{{0, 0}, {0, 0}, {0, 1}});
//            }
//            charAccumulator.add(brailleAlphabet.get(Character.toLowerCase(letter)));
//        }
//        List<List<Integer>> brailleAccumulator = new ArrayList<>();
//        for (int[][] brailleChar : charAccumulator) {
//            brailleAccumulator.add(braille.Solution.brailleEncoder(braille.Solution.letterCollector(brailleChar)));
//        }
//        List<Integer> flattenedArray = brailleAccumulator.stream()
//                .flatMap(list -> list.stream())
//                .collect(Collectors.toList());
//
//        String completeBrailleStr = flattenedArray.stream().map(String::valueOf)
//                .collect(Collectors.joining(""));
//        return completeBrailleStr;
//    }
//    public static void main(String[] args) {
//        braille.Solution.solution(str1);
//    }
//}