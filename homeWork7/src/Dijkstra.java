import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class Dijkstra extends Graph{

    public static Graph calculateShortestPathFromSource(Graph graph, Node source) {

        source.setDistance(0.0);

        Set<Node> settledNodes = new HashSet<>();
        Set<Node> unsettledNodes = new HashSet<>();
        unsettledNodes.add(source);

        while (unsettledNodes.size() != 0) {
            Node currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for (Entry<Node, Double> adjacencyPair : currentNode.getAdjacentNodes().entrySet()) {
                Node adjacentNode = adjacencyPair.getKey();
                Double edgeWeigh = adjacencyPair.getValue();

                if (!settledNodes.contains(adjacentNode)) {
                    CalculateMinimumDistance(adjacentNode, edgeWeigh, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return graph;
    }

    private static void CalculateMinimumDistance(Node evaluationNode, Double edgeWeigh, Node sourceNode) {
        Double sourceDistance = sourceNode.getDistance(); //add weight to source node...??
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }

    private static Node getLowestDistanceNode(Set<Node> unsettledNodes) {
        Node lowestDistanceNode = null;
        double lowestDistance = Integer.MAX_VALUE;
        for (Node node : unsettledNodes) {
            double nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

//    public static void main(String[] args) {
//        Node nodeA = new Node("A");
//        Node nodeB = new Node("B");
//        Node nodeC = new Node("C");
//        Node nodeD = new Node("D");
//        Node nodeE = new Node("E");
//        Node nodeF = new Node("F");
//
//        nodeA.addDestination(nodeB, 0.10789);
//        nodeA.addDestination(nodeC, 15.809);
//
//        nodeB.addDestination(nodeD, 1.2890);
//        nodeB.addDestination(nodeF, 15.0);
//
//        nodeC.addDestination(nodeE, 10.7985);
//
//        nodeD.addDestination(nodeE, 0.2);
//        nodeD.addDestination(nodeF, 1.89);
//
//        nodeF.addDestination(nodeE, 5.697530);
//
//        Graph graph = new Graph();
//
//        graph.addNode(nodeA);
//        graph.addNode(nodeB);
//        graph.addNode(nodeC);
//        graph.addNode(nodeD);
//        graph.addNode(nodeE);
//        graph.addNode(nodeF);
//
//        graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);
//        for (Node dest : graph.getNodes()) {
//            System.out.println("Shortest path and weight from: " + nodeA.getName() + " to " + dest.getName());
//            for (Node path : dest.getShortestPath()) {
//                System.out.print(path.getName() + ": " + path.getDistance() + ", ");
//            }
//            System.out.println(dest.getName() + ": " + dest.getDistance());
//        }

//    }
}