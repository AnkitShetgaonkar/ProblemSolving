package com.company;

import java.util.*;

public class Main {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<TreeMap<Character,Integer>,List<String>> result = new HashMap<>();
        for (String str:
             strs) {
            TreeMap<Character,Integer> map = runAnaHash(str);
            if(result.containsKey(map)){
                result.get(map).add(str);
            }else{
                List<String> grp = new ArrayList<>();
                grp.add(str);
                result.put(map,grp);
            }
        }
        List<List<String >> output = new ArrayList<>();
        Collection<List<String>> set  =  result.values();
        output.addAll(set);
        return output;
    }

    public TreeMap<Character,Integer> runAnaHash(String str){
        TreeMap<Character,Integer> map  = new TreeMap<>();
        char[] arr  = str.toCharArray();
        for(int i =0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Main main = new Main();
        //String[]  l  = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] l = {"","",""};
        System.out.println("Group Anagram "+ main.groupAnagrams(l));
    }
}
