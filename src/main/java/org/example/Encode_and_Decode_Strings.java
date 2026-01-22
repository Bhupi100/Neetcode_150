package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Design an algorithm to encode a list of strings to a string.
// The encoded string is then sent over the network and is decoded back to the original list of strings.
//
//Machine 1 (sender) has the function:
//
//string encode(vector<string> strs) {
//    // ... your code
//    return encoded_string;
//}
//Machine 2 (receiver) has the function:
//
//vector<string> decode(string s) {
//    //... your code
//    return strs;
//}
//So Machine 1 does:
//
//string encoded_string = encode(strs);
//and Machine 2 does:
//
//vector<string> strs2 = decode(encoded_string);
//strs2 in Machine 2 should be the same as strs in Machine 1.
//
//Implement the encode and decode methods.
//
//Example 1:
//
//Input: dummy_input = ["Hello","World"]
//
//Output: ["Hello","World"]
//
//Explanation:
//Machine 1:
//Codec encoder = new Codec();
//String msg = encoder.encode(strs);
//Machine 1 ---msg---> Machine 2
//
//Machine 2:
//Codec decoder = new Codec();
//String[] strs = decoder.decode(msg);

public class Encode_and_Decode_Strings {
    public static void main(String[] args) {
        Encode_and_Decode_Strings obj = new Encode_and_Decode_Strings();
        List<String> str = new ArrayList<>(Arrays.asList("Hello","World"));
        System.out.println("Original: " + str);
        String encoded1 = obj.encode(str);
        System.out.println("Encoded: " + encoded1);
        List<String> decoded1 = obj.decode(encoded1);
        System.out.println("Decoded: " + decoded1);
        System.out.println("Match: " + str.equals(decoded1));
        System.out.println();
    }
    public String encode(List<String> strs) {
        StringBuilder encoder = new StringBuilder();
        for(String str : strs){
            encoder.append(str.length()).append("#").append(str);
        }
        return encoder.toString();
    }
    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#') j++;

            int len = Integer.parseInt(str.substring(i,j));
            i=j+1;
            list.add(str.substring(i,i+len));
            i += len;
        }
        return list;
    }
}
