package at.campus02.AlgorithmenDatenstrukturen.Pruefung.P3_Discount;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Sorter {
    private int[][] graph;
    private int size;
    public void sortInvoice(InvoicePosition[] invoice) {
        //GRAPPH BUBBLE SORT
        boolean swapped = false;
        for (int i = 0; i < invoice.length - 1; i++) {
            for (int j = 0; j < invoice.length - i - 1; j++) {
                if (invoice[j].getAmount() > invoice[j + 1].getAmount()) {
                    InvoicePosition temp = invoice[j];
                    invoice[j] = invoice[j + 1];
                    invoice[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        //GRAPH INSERTION SORT
        for (int i = 0; i < invoice.length; i++) {
            for (int j = i; j > 0; j--) {
                if (invoice[j].getAmount() < invoice[j - 1].getAmount()) {
                    InvoicePosition temp = invoice[j];
                    invoice[j] = invoice[j - 1];
                    invoice[j - 1] = temp;
                }
            }
        }
    }
    // GRAPH TIEFENSUCHE
    public void performDepthSearch(int startVertex, ArrayList<Integer> visited) {

        visited.add(startVertex);
        for (int i = 0; i < size; i++) {
            //wo gibts eine Verbindung siehe oben
            //        graph[from][to] = 1;
            //        graph[to][from] = 1;
            //       also bei Verbindung ist eine 1 eingetrgen
            if (graph[startVertex][i] == 1) {
                if (!visited.contains(i)) {
                    performDepthSearch(i, visited);
                }
            }
        }
    }
    public void performBreadthSearch(int startVertex, ArrayList<Integer> visited) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visitedArray = new boolean[size];

        queue.add(startVertex);
        visitedArray[startVertex] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.remove();
            visited.add(vertex);

            for (int i = 0; i < size; i++) {
                if (graph[vertex][i] == 1 && !visitedArray[i]) {
                    //  graph[vertex][i] > 0 && !visitedArray[i]
                    // wenn edges are weighted
                    queue.add(startVertex);
                    visitedArray[startVertex] = true;
                }
                queue.add(i);
                visitedArray[i] = true;
            }
        }
    }
}
