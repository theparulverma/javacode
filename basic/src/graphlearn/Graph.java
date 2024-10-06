package graphlearn;
import java.util.*;
public class Graph {
    private HashMap<Integer,HashMap<Integer,Integer>> map;
    public Graph(int v){
        map = new HashMap<>();
        for(int i =1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public boolean ContainsEdge(int v1,int v2){
        return map.get(v1).containsKey(v2);
    }
    public boolean Containsvertex(int v1){
        return map.containsKey(v1);
    }
    public int noofEdge(){
        int sum =0;
        for(int key: map.keySet()){
            sum += map.get(key).size();
        }
        return 0;
    }

}
