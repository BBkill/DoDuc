// package WordSet;


// import java.util.*;
// public class WordSet  {
//     private String res;
//     WordSet(String res)
//     {
//         this.res=res.toLowerCase();
//     }

//     private String getRes() 
//     {
//         return res.toLowerCase();
//     }
//     public String union(WordSet o) 
//     {
//         String[] s1= getRes().trim().split("\\s+");
//         String[] s2= o.getRes().trim().split("\\s+");
//         TreeSet<String> set = new TreeSet<>();
//         for (String word : s1) {
//             set.add(word);
//         }
//         for (String word : s2) {
//             set.add(word);
//         }
//         StringBuilder result = new StringBuilder();
//         for (String string : set) {
//             result.append(string+" ");
//         }
//         return result.toString().trim();
//     }

//     public String intersection(WordSet o) 
//     {
//         String[] s1= getRes().trim().split("\\s+");
//         String[] s2= o.getRes().trim().split("\\s+");        
//         TreeSet<String> set = new TreeSet<>();
//         for (String word : s1) {
//             set.add(word);
//         }
//         StringBuilder result = new StringBuilder();     
//         for (String word : s2) {
//             if(set.contains(word))
//             {
//                 result.append(word+" ");
//                 set.remove(word);
//             }
//         } 
        
        
//         return result.toString().trim();          
        
//     }

//     @Override
//     public String toString() {
//         return "";
//     }
    
// }
