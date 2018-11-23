import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Node implements Comparable<Node>, Comparator<Node> {
    PriorityQueue<Connection> connections;
    int count;
    int distance;
    String value;
    String previous;

    public Node (String value)
    {
        connections = new PriorityQueue<Connection>();
        count = 0;
        distance = Integer.MAX_VALUE;
        this.value = value;
    }

    public void addEdge(Node to, int weight)
    {
        Connection n = new Connection(this, to, weight);
        to.connections.add(n);
        connections.add(n);
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.distance, o.distance);
    }

    public int compare(Node a, Node b)
    {
        return a.value.compareTo(b.value);
    }
}
