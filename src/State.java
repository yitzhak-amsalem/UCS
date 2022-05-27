import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class State implements Comparator<State> {
    private String name;
    private boolean visited;
    private List<Flight> neighboringFlights;
    private int cost;
    public static final int MAX_DIST = 99999;

    public State(){

    }

    public State(String name){
        this.name = name;
        this.visited = false;
        this.neighboringFlights = new ArrayList<>();
        this.cost = MAX_DIST;
    }

    @Override
    public int compare(State s1, State s2) {
        return Integer.compare(s1.cost, s2.cost);
    }

    public String toString(){
        return this.getName();
    }

    public String getName() {
        return name;
    }

    public List<Flight> getNeighboringFlights() {
        return neighboringFlights;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
