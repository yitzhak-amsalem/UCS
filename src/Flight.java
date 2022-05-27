public class Flight {
    private State origin;
    private State destination;
    private int cost;

    public Flight(State origin, State destination, int cost) {
        this.origin = origin;
        this.destination = destination;
        this.cost = cost;
    }

    public Flight flightReverse(){
        return new Flight(this.destination, this.origin, this.cost);
    }

    public State getOrigin() {
        return origin;
    }

    public void setOrigin(State origin) {
        this.origin = origin;
    }

    public State getDestination() {
        return destination;
    }

    public void setDestination(State destination) {
        this.destination = destination;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


}
