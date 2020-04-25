/**
View problem here: https://practiceit.cs.washington.edu/problem/view/bjp4/chapter11/e13-isUnique
*/ 

public boolean isUnique(Map < String, String > map) {
    Set < String > set1 = new HashSet < String > ();
    for (String key: map.keySet()) {
        String value = map.get(key);
        if (set1.contains(value)) {
            return false;
        }
        set1.add(value);
    }
    return true;
}
