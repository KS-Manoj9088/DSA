package Hashing;
import java.util.HashMap;
import java.util.Map;

public class HashmapBasics{
    public static void main(String[] args) {
        HashMap<String,Integer> loverCount = new HashMap<>();
        
        loverCount.put("Das",1);
        loverCount.put("Rahul",2);
        loverCount.put("Kowshik",3);


        // Generic way to add data into a hashmap.
        if(loverCount.containsKey("Manoj")){
            int count = loverCount.get("Manoj");
            loverCount.put("Manoj",count+1);
        }
        else{
            loverCount.put("Manoj",1);
        }

        //To obtain all keys of a hashmap

        for(String name : loverCount.keySet()){
            System.out.println(name);
        }

        //To obtain all vales of a hashmap

        for(Integer count : loverCount.values()){
            System.out.println(count);
        }

        // To print live key value pairs - by Function

        for(Map.Entry<String,Integer> entry : loverCount.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        for(String key : loverCount.keySet()){
            System.out.println(key+" "+loverCount.get(key));
        }

        System.out.println(loverCount);

        arrayNumCount(new int[]{1,1,2,2,3,3,4,4,5,5,6,6});
    }

    public static void arrayNumCount(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<arr.length;i++){
            int num = arr[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }

        System.out.println(map);
    }
}
