import java.util.*;
public class consultadd {
    public static void main(String args[]){
//        String s = "example";
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(int i = 0;i<s.length();i++){
//            char ch = s.charAt(i);
//            map.put(ch,map.getOrDefault(0,i+1));
//        }
//        int sub = 0;
//        for(int j = 1;j<map.size();j++){
//            if(map.get(j-1) == map.get(j)){
//              sub++;
//            }
//        }
//        System.out.println(sub);
        String s = "ccaaffddecee";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Set to store used frequencies
        HashSet<Integer> usedFrequencies = new HashSet<>();
        int deletions = 0;

        // Iterate over the frequency values
        for (int freq : frequencyMap.values()) {
            // Adjust frequency to be unique
            while (freq > 0 && usedFrequencies.contains(freq)) {
                freq--;  // Reduce frequency by 1
                deletions++;  // Increment deletions
            }
            usedFrequencies.add(freq);
        }
        System.out.println(deletions);
    }
}
