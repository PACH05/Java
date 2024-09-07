package javaDSA.graphs;
public class DisjointSetUnion {

    static int parent[] = new int[10];    
    public static void main(String[] args) {
        make(1);
        make(2);
        make(3);
        make(4);
        make(5);
        find(4);
        unionSet(1,2);
        unionSet(3,4);
        unionSet(2, 4);
    }

    //Creates an independent node of the Disjoint Set and sets itself as the parent node
    private static void make(int v){
        parent[v] = v;
    }

    //Finds the parent of a given node, 
    //if the node is independent then the node itself is the parent
    private  static int find(int v){

        if(parent[v] == v) return v;
        return find(parent[v]);
    }

    // Combines two sets and forms a union, the root of the second set is then set to
    //root of the first set
    private static void unionSet(int a, int b){
        a = find(a);
        b = find(b);
        if(a != b){
            parent[b] = a;
        }
    }
    
}
