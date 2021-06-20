/*package whatever //do not write package name here */

import java.io.*;
import java.util.* ;

public class Graph
{
   HashMap< String ,HashMap<String , Integer>> adjM ;
   
   public Graph(int v , String cities[])
   {
       adjM =  new HashMap< String ,HashMap<String , Integer>>();
       for(int i=0 ;i< v ;i++)
       {
           adjM.put( cities[i] , new HashMap<String , Integer>());
       }
       
   }
   
   public void addEdge(String u , String v , int weight , boolean bidir)
   {
        adjM.get(u).put(v,weight);
        if(bidir)
        {
            adjM.get(v).put( u,weight);
        }
   }
   
   public void printGraph()
   {
       for(Map.Entry < String, HashMap<String , Integer>> m  : adjM.entrySet())
       {
              HashMap<String , Integer> myM = m.getValue();
              System.out.print(m.getKey()+" || ");
              for(Map.Entry<String , Integer> m1 : myM.entrySet())
              {
                  System.out.print("["+m1.getKey()+""+ m1.getValue()+"]"+ "-->") ;
              }
              System.out.println();
       }
   }
}
 
class GFG {
	public static void main (String[] args) {
		String cities[]= {"Delhi", "BBsr", "Ranchi" ,"Mumbai"};
		Graph g = new Graph(4 , cities);
		g.addEdge( "BBsr","Delhi",10 , false);
		g.addEdge("BBsr" ,"Ranchi", 50 , false);
		g.addEdge("Mumbai" ,"Ranchi", 100,  false);
		g.addEdge("Mumbai" , "BBsr" ,30 , false);
		
		g.printGraph();
		
	}
}
