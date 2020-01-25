import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.List;

public class TestDijkstra extends Dijkstra
{
    public static void main(String[] args)
    {
        //ADD NODES
        Node USD = new Node("USD");
        Node AUD = new Node("AUD");
        Node CAD = new Node("CAD");
        Node CHF = new Node("CHF");
        Node EUR = new Node("EUR");
        Node GBP = new Node("GBP");

        //ADD WEIGHT/CONNECT NODES

        //From the currency on the left column to USD
        AUD.addDestination(USD, 0.73133);
        CAD.addDestination(USD, 0.75369);
        CHF.addDestination(USD, 1.00814);
        //EUR.addDestination(USD, 1.13881);
        GBP.addDestination(USD, 1.31);

        //From the currency on the left column to
        //                  other currency in top row
        CHF.addDestination(EUR, 0.88533);
        EUR.addDestination(CHF, 1.12972);
        EUR.addDestination(GBP, 0.88671);
        GBP.addDestination(EUR, 1.12796);


        //From USD to another currency
        USD.addDestination(AUD, 1.3676);
        USD.addDestination(CAD, 1.32697);
        USD.addDestination(CHF, 0.99209);
        USD.addDestination(EUR, 0.8782);
        USD.addDestination(GBP, 0.77864);

       //PUT NODES AND PATH WEIGHTS IN GRAPH

        Graph graph = new Graph();
        Graph graph1 = new Graph();
        Graph graph2 = new Graph();
        Graph graph3 = new Graph();
        Graph graph4 = new Graph();
        Graph graph5 = new Graph();

        graph.addNode(USD);
        graph.addNode(AUD);
        graph.addNode(CAD);
        graph.addNode(CHF);
        graph.addNode(EUR);
        graph.addNode(GBP);

        //ADD NODES
        Node USD1 = new Node("USD");
        Node AUD1 = new Node("AUD");
        Node CAD1 = new Node("CAD");
        Node CHF1 = new Node("CHF");
        Node EUR1 = new Node("EUR");
        Node GBP1 = new Node("GBP");

        //ADD WEIGHT/CONNECT NODES

        //From the currency on the left column to USD
        AUD1.addDestination(USD1, 0.73133);
        CAD1.addDestination(USD1, 0.75369);
        CHF1.addDestination(USD1, 1.00814);
        //EUR.addDestination(USD1, 1.13881);
        GBP1.addDestination(USD1, 1.31);

        //From the currency on the left column to
        //                  other currency in top row
        CHF1.addDestination(EUR1, 0.88533);
        EUR1.addDestination(CHF1, 1.12972);
        EUR1.addDestination(GBP1, 0.88671);
        GBP1.addDestination(EUR1, 1.12796);


        //From USD to another currency
        USD1.addDestination(AUD1, 1.3676);
        USD1.addDestination(CAD1, 1.32697);
        USD1.addDestination(CHF1, 0.99209);
        USD1.addDestination(EUR1, 0.8782);
        USD1.addDestination(GBP1, 0.77864);

        //put weight in graph1
        graph1.addNode(USD1);
        graph1.addNode(AUD1);
        graph1.addNode(CAD1);
        graph1.addNode(CHF1);
        graph1.addNode(EUR1);
        graph1.addNode(GBP1);


        //ADD NODES
        Node USD2 = new Node("USD");
        Node AUD2 = new Node("AUD");
        Node CAD2 = new Node("CAD");
        Node CHF2 = new Node("CHF");
        Node EUR2 = new Node("EUR");
        Node GBP2 = new Node("GBP");

        //ADD WEIGHT/CONNECT NODES

        //From the currency on the left column to USD
        AUD2.addDestination(USD2, 0.73133);
        CAD2.addDestination(USD2, 0.75369);
        CHF2.addDestination(USD2, 1.00814);
        //EUR.addDestination(USD, 1.13881);
        GBP2.addDestination(USD2, 1.31);

        //From the currency on the left column to
        //                  other currency in top row
        CHF2.addDestination(EUR2, 0.88533);
        EUR2.addDestination(CHF2, 1.12972);
        EUR2.addDestination(GBP2, 0.88671);
        GBP2.addDestination(EUR2, 1.12796);


        //From USD to another currency
        USD2.addDestination(AUD2, 1.3676);
        USD2.addDestination(CAD2, 1.32697);
        USD2.addDestination(CHF2, 0.99209);
        USD2.addDestination(EUR2, 0.8782);
        USD2.addDestination(GBP2, 0.77864);

        //put nodes in graph2
        graph2.addNode(USD2);
        graph2.addNode(AUD2);
        graph2.addNode(CAD2);
        graph2.addNode(CHF2);
        graph2.addNode(EUR2);
        graph2.addNode(GBP2);

        //ADD NODES
        Node USD3 = new Node("USD");
        Node AUD3 = new Node("AUD");
        Node CAD3 = new Node("CAD");
        Node CHF3 = new Node("CHF");
        Node EUR3 = new Node("EUR");
        Node GBP3 = new Node("GBP");

        //ADD WEIGHT/CONNECT NODES

        //From the currency on the left column to USD
        AUD3.addDestination(USD3, 0.73133);
        CAD3.addDestination(USD3, 0.75369);
        CHF3.addDestination(USD3, 1.00814);
        //EUR.addDestination(USD, 1.13881);
        GBP3.addDestination(USD3, 1.31);

        //From the currency on the left column to
        //                  other currency in top row
        CHF3.addDestination(EUR3, 0.88533);
        EUR3.addDestination(CHF3, 1.12972);
        EUR3.addDestination(GBP3, 0.88671);
        GBP3.addDestination(EUR3, 1.12796);


        //From USD to another currency
        USD3.addDestination(AUD3, 1.3676);
        USD3.addDestination(CAD3, 1.32697);
        USD3.addDestination(CHF3, 0.99209);
        USD3.addDestination(EUR3, 0.8782);
        USD3.addDestination(GBP3, 0.77864);

        //put nodes in graph3
        graph3.addNode(USD3);
        graph3.addNode(AUD3);
        graph3.addNode(CAD3);
        graph3.addNode(CHF3);
        graph3.addNode(EUR3);
        graph3.addNode(GBP3);

        //ADD NODES
        Node USD4 = new Node("USD");
        Node AUD4 = new Node("AUD");
        Node CAD4 = new Node("CAD");
        Node CHF4 = new Node("CHF");
        Node EUR4 = new Node("EUR");
        Node GBP4 = new Node("GBP");

        //ADD WEIGHT/CONNECT NODES

        //From the currency on the left column to USD
        AUD4.addDestination(USD4, 0.73133);
        CAD4.addDestination(USD4, 0.75369);
        CHF4.addDestination(USD4, 1.00814);
        //EUR.addDestination(USD, 1.13881);
        GBP4.addDestination(USD4, 1.31);

        //From the currency on the left column to
        //                  other currency in top row
        CHF4.addDestination(EUR4, 0.88533);
        EUR4.addDestination(CHF4, 1.12972);
        EUR4.addDestination(GBP4, 0.88671);
        GBP4.addDestination(EUR4, 1.12796);


        //From USD to another currency
        USD4.addDestination(AUD4, 1.3676);
        USD4.addDestination(CAD4, 1.32697);
        USD4.addDestination(CHF4, 0.99209);
        USD4.addDestination(EUR4, 0.8782);
        USD4.addDestination(GBP4, 0.77864);

        //put nodes in graph4
        graph4.addNode(USD4);
        graph4.addNode(AUD4);
        graph4.addNode(CAD4);
        graph4.addNode(CHF4);
        graph4.addNode(EUR4);
        graph4.addNode(GBP4);

        //ADD NODES
        Node USD5 = new Node("USD");
        Node AUD5 = new Node("AUD");
        Node CAD5 = new Node("CAD");
        Node CHF5 = new Node("CHF");
        Node EUR5 = new Node("EUR");
        Node GBP5 = new Node("GBP");

        //ADD WEIGHT/CONNECT NODES

        //From the currency on the left column to USD
        AUD5.addDestination(USD5, 0.73133);
        CAD5.addDestination(USD5, 0.75369);
        CHF5.addDestination(USD5, 1.00814);
        //EUR.addDestination(USD, 1.13881);
        GBP5.addDestination(USD5, 1.31);

        //From the currency on the left column to
        //                  other currency in top row
        CHF5.addDestination(EUR5, 0.88533);
        EUR5.addDestination(CHF5, 1.12972);
        EUR5.addDestination(GBP5, 0.88671);
        GBP5.addDestination(EUR5, 1.12796);


        //From USD to another currency
        USD5.addDestination(AUD5, 1.3676);
        USD5.addDestination(CAD5, 1.32697);
        USD5.addDestination(CHF5, 0.99209);
        USD5.addDestination(EUR5, 0.8782);
        USD5.addDestination(GBP5, 0.77864);

        //put nodes in graph5
        graph5.addNode(USD5);
        graph5.addNode(AUD5);
        graph5.addNode(CAD5);
        graph5.addNode(CHF5);
        graph5.addNode(EUR5);
        graph5.addNode(GBP5);

        graph = Dijkstra.calculateShortestPathFromSource(graph, USD);
        graph1 = Dijkstra.calculateShortestPathFromSource(graph1, GBP1);
        graph2 = Dijkstra.calculateShortestPathFromSource(graph2, AUD2);
        graph3 = Dijkstra.calculateShortestPathFromSource(graph3, CHF3);
        graph4 = Dijkstra.calculateShortestPathFromSource(graph4, CAD4);
        graph5 = Dijkstra.calculateShortestPathFromSource(graph5, EUR5);

        //His code:

//        for (Node dest : graph.getNodes()) {
//            System.out.println("Shortest path and weight from: " + USD.getName() + " to " + dest.getName());
//            for (Node path : dest.getShortestPath()) {
//                System.out.print(path.getName() + ": " + path.getDistance() + ", ");
//            }
//            System.out.println(dest.getName() + ": " + dest.getDistance());
//        }

//frank to euro to lbs to usd

        System.out.println("*********************************");
        System.out.println("From USD: ");
        System.out.println();

            //Where does the $100 get entered to play around with? or is it just at the end??

        //initialize dollar amount
        //double dollar = 100.00;

        //initialize distance
        //double totalDistance = 0;
        //double distance = 0;

        //calculates the shortest paths from USD to other currency
        for (Node dest : graph.getNodes()) {

            System.out.println("Shortest path and weight from: " + USD.getName() + " to " + dest.getName());
            for (Node path : dest.getShortestPath()) {
                //distance = path.getDistance();

                System.out.print(path.getName() + ": " + path.getDistance() + ", ");
                //distance = path.getDistance();
            }
              System.out.println(dest.getName() + ": " + dest.getDistance());
//            totalDistance = dest.getDistance() * distance;

//            System.out.println(totalDistance);
//            System.out.println();
        }

        //not sure how to use this in the code I have written.
        Graph soltn = new Graph();
        for (Node src : graph.getNodes()) {
            System.out.println("src: " + src.getName());
            //clearing shortest paths from any previous solution
            for (Node n : graph.getNodes()) {
                n.setShortestPath(new LinkedList<>());
                n.setDistance(999999999.9);
            }
        }


        System.out.println("************************************************");
        System.out.println("From Brittish Currency: ");
        System.out.println();

        //I attempted to create a count distance in the for loops, and in the Dijkstra.java class. It failed.
        //What I needed to do was to change the conditions in the calculateMinimum().



        //double dist = 0;
        //double totalDist = 0;

        for(Node end : graph1.getNodes())
        {
            System.out.println("Shortest path and weight from: " + GBP1.getName() + " to " + end.getName());
            for (Node route : end.getShortestPath())
            {
                System.out.println(route.getName() + ": " + route.getDistance() + ", ");
                //dist = route.getDistance();
            }
            System.out.println(end.getName() + ": " + end.getDistance());
//            totalDist = end.getDistance() * dist;
//            System.out.println(totalDist);
//            System.out.println();
        }

        System.out.println("************************************************");
        System.out.println("From Austrailian Currency: ");
        System.out.println();

        for(Node end : graph2.getNodes())
        {
        System.out.println("Shortest path and weight from: " + AUD2.getName() + " to " + end.getName());
        for (Node route : end.getShortestPath())
        {
            System.out.println(route.getName() + ": " + route.getDistance() + ", ");

        }
        System.out.println(end.getName() + ": " + end.getDistance());
        }

        System.out.println("************************************************");
        System.out.println("From Swiss Currency: ");
        System.out.println();

        for(Node end : graph3.getNodes())
        {
            System.out.println("Shortest path and weight from: " + CHF3.getName() + " to " + end.getName());
            for (Node route : end.getShortestPath())
            {
                System.out.println(route.getName() + ": " + route.getDistance() + ", ");

            }
            System.out.println(end.getName() + ": " + end.getDistance());
        }

        System.out.println("************************************************");
        System.out.println("From Canadian(I think) Currency: ");
        System.out.println();

        for(Node end : graph4.getNodes())
        {
            System.out.println("Shortest path and weight from: " + CAD4.getName() + " to " + end.getName());
            for (Node route : end.getShortestPath())
            {
                System.out.println(route.getName() + ": " + route.getDistance() + ", ");

            }
            System.out.println(end.getName() + ": " + end.getDistance());
        }

        System.out.println("************************************************");
        System.out.println("From Euros: ");
        System.out.println();

        for(Node end : graph5.getNodes())
        {
            System.out.println("Shortest path and weight from: " + EUR5.getName() + " to " + end.getName());
            for (Node route : end.getShortestPath())
            {
                System.out.println(route.getName() + ": " + route.getDistance() + ", ");

            }
            System.out.println(end.getName() + ": " + end.getDistance());
        }

        //how to I get the total Distance and the other total Distance to scope to here to subtract them??
//        double hold = totalDistance - totalDist;
//        System.out.println(hold);

        //Add the two resulting things, per each pair,
        //double total = hold * 100;



        // Multiply by 100 to get a return on the $100 of invested $$.


    }

}
