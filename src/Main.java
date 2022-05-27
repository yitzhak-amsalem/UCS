import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        State n1 = new State("Slovakia");
        State n2 = new State("Austria");
        State n3 = new State("Switzerland");
        State n4 = new State("Croatia");
        State n5 = new State("Ukraine");
        State n6 = new State("Poland");
        State n7 = new State("Latvia");
        State n8 = new State("Germany");
        State n9 = new State("Bosnia");
        State n10 = new State("UK");
        State n11 = new State("Serbia");
        State n12 = new State("Italy");
        State n13 = new State("France");
        State n14 = new State("Bulgaria");
        State n15 = new State("Romania");
        State n16 = new State("Spain");
        State n17 = new State("Turkey");
        State n18 = new State("Greece");

        Route route = new Route();

        Flight flight1A = new Flight(n1, n2, 120);
        Flight flight1B = flight1A.flightReverse();
        route.getFlights().add(flight1A);
        route.getFlights().add(flight1B);
        n1.getNeighboringFlights().add(flight1A);
        n2.getNeighboringFlights().add(flight1B);

        Flight flight2A = new Flight(n1, n5, 297);
        Flight flight2B = flight2A.flightReverse();
        route.getFlights().add(flight2A);
        route.getFlights().add(flight2B);
        n1.getNeighboringFlights().add(flight2A);
        n5.getNeighboringFlights().add(flight2B);

        Flight flight3A = new Flight(n1, n6, 534);
        Flight flight3B = flight3A.flightReverse();
        route.getFlights().add(flight3A);
        route.getFlights().add(flight3B);
        n1.getNeighboringFlights().add(flight3A);
        n6.getNeighboringFlights().add(flight3B);

        Flight flight4A = new Flight(n5, n2, 241);
        Flight flight4B = flight4A.flightReverse();
        route.getFlights().add(flight4A);
        route.getFlights().add(flight4B);
        n5.getNeighboringFlights().add(flight4A);
        n2.getNeighboringFlights().add(flight4B);

        Flight flight5A = new Flight(n5, n6, 372);
        Flight flight5B = flight5A.flightReverse();
        route.getFlights().add(flight5A);
        route.getFlights().add(flight5B);
        n5.getNeighboringFlights().add(flight5A);
        n6.getNeighboringFlights().add(flight5B);

        Flight flight6A = new Flight(n5, n8, 313);
        Flight flight6B = flight6A.flightReverse();
        route.getFlights().add(flight6A);
        route.getFlights().add(flight6B);
        n5.getNeighboringFlights().add(flight6A);
        n8.getNeighboringFlights().add(flight6B);

        Flight flight7A = new Flight(n6, n7, 145);
        Flight flight7B = flight7A.flightReverse();
        route.getFlights().add(flight7A);
        route.getFlights().add(flight7B);
        n6.getNeighboringFlights().add(flight7A);
        n7.getNeighboringFlights().add(flight7B);

        Flight flight8A = new Flight(n8, n7, 335);
        Flight flight8B = flight8A.flightReverse();
        route.getFlights().add(flight8A);
        route.getFlights().add(flight8B);
        n8.getNeighboringFlights().add(flight8A);
        n7.getNeighboringFlights().add(flight8B);

        Flight flight9A = new Flight(n6, n8, 201);
        Flight flight9B = flight9A.flightReverse();
        route.getFlights().add(flight9A);
        route.getFlights().add(flight9B);
        n6.getNeighboringFlights().add(flight9A);
        n8.getNeighboringFlights().add(flight9B);

        Flight flight10A = new Flight(n2, n4, 176);
        Flight flight10B = flight10A.flightReverse();
        route.getFlights().add(flight10A);
        route.getFlights().add(flight10B);
        n2.getNeighboringFlights().add(flight10A);
        n4.getNeighboringFlights().add(flight10B);

        Flight flight11A = new Flight(n3, n4, 244);
        Flight flight11B = flight11A.flightReverse();
        route.getFlights().add(flight11A);
        route.getFlights().add(flight11B);
        n3.getNeighboringFlights().add(flight11A);
        n4.getNeighboringFlights().add(flight11B);

        Flight flight12A = new Flight(n4, n9, 107);
        Flight flight12B = flight12A.flightReverse();
        route.getFlights().add(flight12A);
        route.getFlights().add(flight12B);
        n4.getNeighboringFlights().add(flight12A);
        n9.getNeighboringFlights().add(flight12B);

        Flight flight13A = new Flight(n9, n10, 329);
        Flight flight13B = flight13A.flightReverse();
        route.getFlights().add(flight13A);
        route.getFlights().add(flight13B);
        n9.getNeighboringFlights().add(flight13A);
        n10.getNeighboringFlights().add(flight13B);

        Flight flight14A = new Flight(n5, n4, 348);
        Flight flight14B = flight14A.flightReverse();
        route.getFlights().add(flight14A);
        route.getFlights().add(flight14B);
        n5.getNeighboringFlights().add(flight14A);
        n4.getNeighboringFlights().add(flight14B);

        Flight flight15A = new Flight(n5, n10, 396);
        Flight flight15B = flight15A.flightReverse();
        route.getFlights().add(flight15A);
        route.getFlights().add(flight15B);
        n5.getNeighboringFlights().add(flight15A);
        n10.getNeighboringFlights().add(flight15B);

        Flight flight16A = new Flight(n10, n13, 389);
        Flight flight16B = flight16A.flightReverse();
        route.getFlights().add(flight16A);
        route.getFlights().add(flight16B);
        n10.getNeighboringFlights().add(flight16A);
        n13.getNeighboringFlights().add(flight16B);

        Flight flight17A = new Flight(n8, n13, 192);
        Flight flight17B = flight17A.flightReverse();
        route.getFlights().add(flight17A);
        route.getFlights().add(flight17B);
        n8.getNeighboringFlights().add(flight17A);
        n13.getNeighboringFlights().add(flight17B);

        Flight flight18A = new Flight(n11, n9, 329);
        Flight flight18B = flight18A.flightReverse();
        route.getFlights().add(flight18A);
        route.getFlights().add(flight18B);
        n11.getNeighboringFlights().add(flight18A);
        n9.getNeighboringFlights().add(flight18B);

        Flight flight19A = new Flight(n11, n10, 220);
        Flight flight19B = flight19A.flightReverse();
        route.getFlights().add(flight19A);
        route.getFlights().add(flight19B);
        n11.getNeighboringFlights().add(flight19A);
        n10.getNeighboringFlights().add(flight19B);

        Flight flight20A = new Flight(n11, n12, 253);
        Flight flight20B = flight20A.flightReverse();
        route.getFlights().add(flight20A);
        route.getFlights().add(flight20B);
        n11.getNeighboringFlights().add(flight20A);
        n12.getNeighboringFlights().add(flight20B);

        Flight flight21A = new Flight(n10, n12, 313);
        Flight flight21B = flight21A.flightReverse();
        route.getFlights().add(flight21A);
        route.getFlights().add(flight21B);
        n10.getNeighboringFlights().add(flight21A);
        n12.getNeighboringFlights().add(flight21B);

        Flight flight22A = new Flight(n12, n14, 240);
        Flight flight22B = flight22A.flightReverse();
        route.getFlights().add(flight22A);
        route.getFlights().add(flight22B);
        n12.getNeighboringFlights().add(flight22A);
        n14.getNeighboringFlights().add(flight22B);

        Flight flight23A = new Flight(n14, n15, 121);
        Flight flight23B = flight23A.flightReverse();
        route.getFlights().add(flight23A);
        route.getFlights().add(flight23B);
        n14.getNeighboringFlights().add(flight23A);
        n15.getNeighboringFlights().add(flight23B);

        Flight flight24A = new Flight(n15, n13, 216);
        Flight flight24B = flight24A.flightReverse();
        route.getFlights().add(flight24A);
        route.getFlights().add(flight24B);
        n15.getNeighboringFlights().add(flight24A);
        n13.getNeighboringFlights().add(flight24B);

        Flight flight25A = new Flight(n15, n16, 227);
        Flight flight25B = flight25A.flightReverse();
        route.getFlights().add(flight25A);
        route.getFlights().add(flight25B);
        n15.getNeighboringFlights().add(flight25A);
        n16.getNeighboringFlights().add(flight25B);

        Flight flight26A = new Flight(n13, n16, 104);
        Flight flight26B = flight26A.flightReverse();
        route.getFlights().add(flight26A);
        route.getFlights().add(flight26B);
        n13.getNeighboringFlights().add(flight26A);
        n16.getNeighboringFlights().add(flight26B);

        Flight flight27A = new Flight(n15, n17, 99);
        Flight flight27B = flight27A.flightReverse();
        route.getFlights().add(flight27A);
        route.getFlights().add(flight27B);
        n15.getNeighboringFlights().add(flight27A);
        n17.getNeighboringFlights().add(flight27B);

        Flight flight28A = new Flight(n17, n18, 188);
        Flight flight28B = flight28A.flightReverse();
        route.getFlights().add(flight28A);
        route.getFlights().add(flight28B);
        n17.getNeighboringFlights().add(flight28A);
        n18.getNeighboringFlights().add(flight28B);

        Scanner scanner = new Scanner(System.in);
        int questionNumber;
        System.out.println("Welcome to the solution.");
        System.out.println("Enter the question number and get the solution: ");
        questionNumber = scanner.nextInt();
        switch (questionNumber){
            case 1:
                route.UCS(n1, n12);
                System.out.println("The path to goal is:");
                System.out.println(route.printPath(n12));
                System.out.println("The global cost is: " + n12.getCost());
                break;
            case 2:
                int oldRoute = 0;
                int newRoute = 0;
                route.UCS(n2, n12);
                oldRoute += n12.getCost();
                System.out.println("The Italy cost is: " + n12.getCost());
                route.getPath().clear();
                route.getPriorityQueue().clear();

                route.UCS(n2, n17);
                oldRoute += n17.getCost();
                System.out.println("The Turkey cost is: " + n17.getCost());
                route.getPath().clear();
                route.getPriorityQueue().clear();

                route.UCS(n2, n7);
                oldRoute += n7.getCost();
                System.out.println("The Latvia cost is: " + n7.getCost());
                System.out.println("oldRoute sum: " + oldRoute);
                route.getPath().clear();
                route.getPriorityQueue().clear();

                System.out.println("------");
                System.out.println("The destination of 'StarsFlight' can be Italy, Bulgaria, Turkey or Romania");
                System.out.println("------");

                Flight starsFlightA = new Flight(n2, n17, 100); // You can change the destination state to s12, s14, s15
                route.getFlights().add(starsFlightA);
                n2.getNeighboringFlights().add(starsFlightA);

                route.UCS(n2, n12);
                newRoute += n12.getCost();
                System.out.println("The Italy cost is: " + n12.getCost());
                route.getPath().clear();
                route.getPriorityQueue().clear();

                route.UCS(n2, n17);
                newRoute += n17.getCost();
                System.out.println("The Turkey cost is: " + n17.getCost());
                route.getPath().clear();
                route.getPriorityQueue().clear();

                route.UCS(n2, n7);
                newRoute += n7.getCost();
                System.out.println("The Latvia cost is: " + n7.getCost());
                System.out.println("newRoute sum: " + (newRoute));
                break;
            case 3:
                route.UCS(n1,n14);
                System.out.println("The cost before connection fee is: " + n14.getCost());
                int finalCost =  n14.getCost() + connectionFee(route.printPath(n14).size()-2, 27);
                System.out.println("The cost after connection fee is: " + finalCost);
                System.out.println("The short route cost is(after connection fee): 1408");
                System.out.println("The minimum connection fee is: 27");
        }
    }

    public static int connectionFee(int connectionNumber, int connectionFee){
        int connection = 0;
        for (int i = 1; i <= connectionNumber; i++){
            connection += (i * connectionFee);
        }
        return connection;
    }
}
