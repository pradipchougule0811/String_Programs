package com.ascentpro;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        String s = "This is my test string";
        char[] arr = s.toCharArray();
        int size = arr.length;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int i=0;
        while(i != size)
        {
            if(map.containsKey(arr[i])==false)
            {
                map.put(arr[i],1);
            }
            else
            {
                int ov = map.get(arr[i]);
                int nv = ov+1;
                map.put(arr[i],nv);
            }
            i++;
        }
        map.entrySet().forEach(e->{
            System.out.println(e.getKey()+"    "+e.getValue());
        });
        System.out.println(map);
    }
}
