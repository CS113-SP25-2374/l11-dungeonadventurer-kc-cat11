public class Node implements Comparable<Node> {
    int x,y;
    char item;
    boolean visited;
    public int g;
    public int h;
    public Node parent;

    public Node(int x, int y, char item)
    {
        this.x = x;
        this.y = y;
        this.item = item;
        this.visited = false;
    }

    public void calcH(Node goal)
    {
        h = Math.abs(this.x - goal.x) + Math.abs(this.y - goal.y);
    }

    public int f()
    {
        return g + h;
    }

    @Override
    public String toString()
    {
        return "" + item + "(" + x + "," + y + ")";
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.f(), o.f());
    }

    @Override
    public boolean equals(Object o)
    {
        if(!(o instanceof Node other)) return false;
        return  this.x == other.x && this.y == other.y;
    }

    @Override
    public int hashCode()
    {
        return x * y + h + g;
    }

}
