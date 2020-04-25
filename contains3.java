/**
View Problem Here: https://practiceit.cs.washington.edu/problem/view/bjp4/chapter11/e12-contains3
*/

public static boolean contains3(List<String> list) {
    Map<String,Integer> occur = new HashMap<String,Integer>();
    Iterator<String> strings = list.iterator();
    while(strings.hasNext()){
       String word = strings.next();
        if(occur.containsKey(word)){
       occur.put(word,occur.get(word)+1);
       } 
        else{
        occur.put(word,1);
        }
    } 
    return occur.containsValue(3);
    
}
