package org.example;


import net.datastructures.LinkedBinaryTree;
import net.datastructures.Position;

public class Arbori {


    public static void main(String[] args) {
        String[] tablou ={"123","132","asd","dsa","snu","asx","axx"};

   LinkedBinaryTree<String> tree =new LinkedBinaryTree<>();
   Position<String> root = tree.addRoot("123");
   Position<String>[] firstlevel = new Position[2];

   firstlevel[0]=tree.addLeft(root,"132");
        firstlevel[1]=tree.addRight(root,"asd");

        Position<String>[] secondlevel = new Position[4];
        secondlevel[0]=tree.addLeft(firstlevel[0],"dsa");
        secondlevel[1]=tree.addRight(firstlevel[0],"snu");
        secondlevel[2]=tree.addLeft(firstlevel[1],"asx");
        secondlevel[3]=tree.addRight(firstlevel[1],"axx");
    }
}
