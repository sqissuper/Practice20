import java.util.Arrays;
import java.util.HashMap;

public class TextDemo3 {
    //数组序号转换
//    public static int[] arrayRankTransform(int[] arr) {
//        int[] newArr = new int[arr.length];
//        int[] ret = Arrays.copyOf(arr,arr.length);
//        Arrays.sort(arr);
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int index = 1;
//        for(int i = 0; i  < arr.length; i++) {
//            if(i + 1 < arr.length && arr[i] != arr[i + 1]) {
//                map.put(arr[i],index);
//                index++;
//            } else {
//                map.put(arr[i],index);
//            }
//        }
//        for(int i = 0; i < ret.length; i++) {
//            newArr[i] = map.get(ret[i]);
//        }
//        return newArr;
//    }

    //拼写单词
//    public static int countCharacters(String[] words, String chars) {
//        int[] newArr = new int[26];
//        int count = 0;
//        for(int i = 0; i < chars.length(); i++) {
//            newArr[(chars.charAt(i) - 'a')]++;
//        }
//        for(String tmp : words) {
//            int[] ret = new int[26];
//            boolean f = true;
//            for(int i = 0; i < tmp.length(); i++) {
//                ret[(tmp.charAt(i) - 'a')]++;
//            }
//            for(int i = 0; i < tmp.length(); i++) {
//                if(ret[(tmp.charAt(i) - 'a')] > newArr[(tmp.charAt(i) - 'a')]) f = false;
//            }
//            if(f) {
//                count += tmp.length();
//            }
//        }
//        return count;

        //没有通过全部案例
//        int count = 0;
//        for(String tmp : words) {
//            boolean f = true;
//            for(int i = 0; i < tmp.length(); i++) {
//                if(!chars.contains(tmp.charAt(i) + "")) {
//                    f = false;
//                    break;
//                }
//            }
//            if(f) {
//                count += tmp.length();
//            }
//        }
//        return count;
//    }
    public static void main(String[] args) {
//        int[] arr = {37,12,28,9,100,56,80,5,12};
//        System.out.println(Arrays.toString(arrayRankTransform(arr)));
//        String[] words = {"hello","world","leetcode"};
//        String chars = "welldonehoneyr";
//        System.out.println(countCharacters(words, chars));
    }
}
