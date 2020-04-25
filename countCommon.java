/**
View Problem Here:  https://practiceit.cs.washington.edu/problem/view/bjp4/chapter11/e7-countCommon 
*/ 

public static int countCommon(List<Integer> list1,List<Integer> list2){
Set<Integer> set1 = new HashSet<Integer>(list1); 
Set<Integer> set2 = new HashSet<Integer>(list2);     
int count = 0; 
    for(int d: set2){
    if(set1.contains(d)){
    count++;
     }
    } 
    return count;
}
