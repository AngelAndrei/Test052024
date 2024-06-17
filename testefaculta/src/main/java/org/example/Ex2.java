package org.example;

import net.datastructures.*;

public class Ex2 {
    public static void main(String[] args) {


 int[] tablou={100, 15, 25, 50, 55, 65, 100, 25, 75, 10, 15, 20};
 AdjacencyMapGraph<Integer,Integer> graf = new AdjacencyMapGraph<>(true);
 Vertex<Integer> v1 = graf.insertVertex(tablou[0]);
 Vertex<Integer> v2 = graf.insertVertex(tablou[1]);
 Vertex<Integer> v3 = graf.insertVertex(tablou[2]);
 Vertex<Integer> v4 = graf.insertVertex(tablou[3]);
 Vertex<Integer> v5 = graf.insertVertex(tablou[4]);
 graf.insertEdge(v1,v2,20);
 graf.insertEdge(v2,v3,15);
 graf.insertEdge(v1,v4,35);
 graf.insertEdge(v3,v4,2);
 graf.insertEdge(v1,v5,10);
    }

    public static <V, E> void DFS(
            Graph<V, E> g, Vertex<V> u,
            Map<Vertex<V>, Integer> known,
            Map<Vertex<V>, Edge<E>> forest) {
        known.put(u, 1); // marcheaza v ca fiind descoperit
        // for e in [muchiile externe de forma e=(u,v)]
        for (Edge<E> e : g.outgoingEdges(u)) {
            Vertex<V> v = g.opposite(u, e);
            // daca v nu a fost parcurs
            if (known.get(v)==null) {
                // retine muchia e ca muchie de descoperire pentru varful v
                forest.put(v, e);
                DFS(g, v, known, forest); // apel recursiv DFS pentru v
            }else // optional
                known.put(v, known.get(v)+1 ); // de câte ori a fost atins v?
        }
    }
    public static <V, E> void BFS(Graph<V, E> g, Vertex<V> s,
                                  Map<Vertex<V>, Integer> known,
                                  Map<Vertex<V>, Edge<E>> forest) {
        PositionalList<Vertex<V>> level = new LinkedPositionalList<>();
        known.put(s, 1); level.addLast(s); // mai intai include s
        while (!level.isEmpty()) {
            PositionalList<Vertex<V>> nextLevel = new LinkedPositionalList<>();
            for (Vertex<V> u : level)
                for (Edge<E> e : g.outgoingEdges(u)) {
                    Vertex<V> v = g.opposite(u, e);
                    if (known.get(v)==null) {
                        known.put(v, 1);
                        forest.put(v, e); // e este muchia prin care v a fost descoperit
                        nextLevel.addLast(v); // v va fi procesat in pasul urmator
                    }else // optional
                        known.put(v, known.get(v)+1 ); // de câte ori a fost atins v?
                }
            level = nextLevel; // nextLevel devine nivelul curent de parcurs
        }
    }








}
