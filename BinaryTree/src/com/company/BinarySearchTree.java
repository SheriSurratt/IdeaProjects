package com.company;

public class BinarySearchTree {
    Node root;

    public Node insertNode(Node current, int key){
        if(current == null){
            return new Node(key);
        }else if(key < current.getKey()){


        }else if(key < current.getKey()){
            current.setLeftNode(insertNode((current.getLeftNode(), key));

        }else if(key < current.getKey()){
            current.setRightNode(insertNode((current.getLRightNode(), key));
        }else{
            return current;
        }
        return  current;
    }
    public void add(int key){
        root = insertNode(root,key);
    }
}
