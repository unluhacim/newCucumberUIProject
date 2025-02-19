package example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InterviewQ {

    public static void main(String[] args) {

        //Find the number of non-repeated words in a String?
        String input = "Java is great and Java is powerful, but Python is also great.";

        String[] array=input.toLowerCase().replaceAll("[,.]","").split(" ");

        Map<String,Integer> words=new HashMap<>();

        for(int i=0;i<array.length;i++){
            if(!words.containsKey(array[i])){
                words.put(array[i],1);
            }else{
                words.put(array[i],words.get(array[i])+1);
            }
        }
        System.out.println(words);

        Set<String> set=words.keySet();
        int count=0;
        for(String s:set){
            if(words.get(s)==1){
                System.out.println(s+ " - "+words.get(s));
                count++;
            }
        }

        System.out.println("Number of non-repeated words: "+count);

    }
}
