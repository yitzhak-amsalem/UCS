import java.util.*;

public class Route {
    private List<Flight> flights;
    private HashMap<State, State> path;
    private PriorityQueue<State> priorityQueue;

    public Route() {
        this.flights = new ArrayList<>();
        this.path = new HashMap<>();
        this.priorityQueue = new PriorityQueue<>(20, new State());
    }

    public void UCS(State start, State goal){
        for (Flight flight: flights){
            flight.getOrigin().setCost(State.MAX_DIST);
        }
        for (Flight flight: flights){
            flight.getOrigin().setVisited(false);
        }
        for (Flight flight: flights){
            path.put(flight.getOrigin(), null);
        }
        priorityQueue.add(start);
        start.setCost(0);
        start.setVisited(true);

        while (!priorityQueue.isEmpty()){
            State currentState = priorityQueue.poll();
            currentState.setVisited(true);
            if (currentState.equals(goal)){
                break;
            }
            for (Flight flight: currentState.getNeighboringFlights()){
                if (!flight.getDestination().isVisited() &&
                        currentState.getCost() + flight.getCost() < flight.getDestination().getCost()){
                    path.put(flight.getDestination(), currentState);
                    flight.getDestination().setCost(currentState.getCost() + flight.getCost());
                    priorityQueue.add(flight.getDestination());
                }
            }
        }
    }

    public List<State> printPath(State goal){
        List<State> pathToGoal = new ArrayList<>();
        for(State state = goal; state!=null; state = this.path.get(state)){
            pathToGoal.add(state);
        }
        Collections.reverse(pathToGoal);

        return pathToGoal;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public HashMap<State, State> getPath() {
        return path;
    }

    public PriorityQueue<State> getPriorityQueue() {
        return priorityQueue;
    }
}
