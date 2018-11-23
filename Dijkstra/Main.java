import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main {
    static Node s, e;

    public static void main(String[] args)
    {
        createTestMap();
        //ArrayList<Node> fastest = Dijkstra.getShortestPath();
        new Dijkstra(s, e).getShortestPath();
    }


    public static void createTestMap() {
        s = new Node("S");
        s.distance = 0;

        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");

        s.addEdge(a, 7); // s is connected to a,b,c
        s.addEdge(b, 2);
        s.addEdge(c, 3);

        Node d = new Node("D");

        a.addEdge(b, 3); // a is connected to b, d
        a.addEdge(d, 4);

        Node l = new Node("L");

        c.addEdge(l, 2); // c is connected to f

        Node g = new Node("G");
        Node h = new Node("H");
        Node f = new Node("F");

        b.addEdge(h, 1); // b is connected to h and d
        b.addEdge(d, 4);

        d.addEdge(f, 5); //d is connected to f

        f.addEdge(h, 3); // f is connected to h

        Node i = new Node("I");
        Node j = new Node("J");

        l.addEdge(i, 4); // f is connected to i, j
        l.addEdge(j, 4);

        Node k = new Node("K");

        i.addEdge(k, 4); // i is connected to j and k
        i.addEdge(j, 6);

        j.addEdge(k, 4);

        e = new Node("E");

        h.addEdge(g, 2);

        g.addEdge(e, 2);

        k.addEdge(e, 5);
    }
}
