package com.example2.demo.service;

public class BstTree {
    public Node root = null;
    private class Node {
        private Node left;
        private Node right;
        private int data;
        private Node(int data) {
            this.left = null;
            this.right =null;
            this.data = data;
        }
    }
    public BstTree(){

    }


    public void buildTree (int data) {
       root = buildTree(root,data);
    }
    public Node buildTree (Node node,int data) {
        if(node == null) {
            node = new Node(data);
        }else if( node.data > data ) {
            node.left = buildTree(node.left,data);
//            buildTree(this.root.left,data);
//            this.root.left = new Node(data);
        } else if( node.data < data ) {
            node.right = buildTree(node.right,data);
//            buildTree(this.root.right,data);
//            this.root.right= new Node(data);
        } else {
            node = node;
        }
        return  node;
    }


    /**
     * 中序遍历
     * @param node
     */
    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.println(node.data);
            inOrder(node.right);
        }
    }
    /**
     * 前序遍历
     * @param node
     */
    public void preOrder(Node node,int lev){
        int n = lev;
        if(node != null){
            System.out.println( n + " --- "+ node.data);
            n++;
            preOrder(node.left,n);
            preOrder(node.right,n);
        }
    }

    /**
     * 后序遍历
     * @param node
     */
    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data);
        }

    }

    }
