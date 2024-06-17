package org.example;

import com.sun.jdi.IntegerValue;
import net.datastructures.AdjacencyMapGraph;
import net.datastructures.LinkedBinaryTree;
import net.datastructures.Position;
import net.datastructures.Vertex;

public class t2 {


    public static void main(String[] args) {
      //graf :O
        int[] tablou={1,5,6,7,2,4,5,7,9,10};
        AdjacencyMapGraph<Integer,Integer>  graf = new AdjacencyMapGraph<>(true);

        Vertex<Integer> v1 = graf.insertVertex(tablou[0]);
        Vertex<Integer> v2 = graf.insertVertex(tablou[1]);
        Vertex<Integer> v3 = graf.insertVertex(tablou[2]);
        Vertex<Integer> v4 = graf.insertVertex(tablou[3]);
        Vertex<Integer> v5 = graf.insertVertex(tablou[4]);
        graf.insertEdge(v1,v2,10);

        //arbore

        LinkedBinaryTree<Integer> arbore = new LinkedBinaryTree<>();
        Position<Integer> root = arbore.addRoot(1);
        Position<Integer>[] firstLevel= new Position[2];
        firstLevel[0]=arbore.addLeft(root,5);



    }
}


for(int i = 0;i<lista.size();i++){
        if(!deLucru.contains(lista.get(i))){
        deLucru.add(lista.get(i));
        }
        }
        for(int i = 0;i<stack.size();i++){
int nr = stack.pop();
            if(!deLucru.contains(nr)){
        deLucru.add(nr);
            }
                    }
                    for(int i = 0 ;i<deLucru.size();i++)
        deR.add((int)deLucru.get(i));


