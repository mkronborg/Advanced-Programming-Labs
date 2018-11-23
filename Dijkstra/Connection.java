public class Connection implements Comparable<Connection>{
    Node one, two;
    int weight;
    public Connection(Node a, Node b, int weight)
    {
        one = a;
        two = b;
        this.weight = weight;
    }

    public int compareTo(Connection o)
    {
        return Integer.compare(this.weight, o.weight);
    }
}
