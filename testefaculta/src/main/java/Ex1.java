import net.datastructures.ArrayList;
import net.datastructures.ArrayStack;

import javax.swing.*;
import java.util.PriorityQueue;

public class Ex1 {
    static int[] tablou={100, 15, 25, 50, 55, 65, 100, 25, 75, 10, 15, 20};
    static   ArrayList<Integer> lista=new ArrayList<>();
    static     ArrayStack<Integer> stack = new ArrayStack<>();
    public static void main(String[] args) {

            int j=0;
            for(int i = 0;i<tablou.length;i++){
                if(tablou[i]%2==0){
                    lista.add(j++,tablou[i]);
                }else
                {
                    stack.push(tablou[i]);
                }
            }
        PriorityQueue<Integer> deR = new PriorityQueue<>();
        java.util.ArrayList deLucru = new java.util.ArrayList<>();


                for(int i=0;i<lista.size();i++){
                    if(!deLucru.contains(lista.get(i))){
                        deLucru.add(lista.get(i));
                    }
                }

                for(int i =0;i<stack.size();i++){
                    int nr = stack.pop();
                    if(!deLucru.contains(nr)){
                        deLucru.add(nr);
                    }
                }
                for(int i =0;i<deLucru.size();i++){
                    deR.add((int)deLucru.get(i));
                }

        System.out.println(deR.toString());


    }

}
