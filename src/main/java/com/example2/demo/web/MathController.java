package com.example2.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example2.demo.service.BstTree;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class MathController {

    @RequestMapping("/compute")
    public String compute(Model m) throws Exception {

        BstTree bstTree = new BstTree();
        int[] arr = {-1,-2,-3,-4,0,1,2,3,4};
        for(int i = 0; i< arr.length; i++) {
            bstTree.buildTree(arr[i]);
        }
        // why cant use root ???? bstTree.inOrder(bstTree.root);
        //bstTree.inOrder(bstTree.root); // 中序编列 由小到大 2 4 6 12  21 45
       // bstTree.preOrder(bstTree.root,0); // 前序便利
       // bstTree.postOrder(bstTree.root); // 前序便利
        // TODO: 2018/7/19
        // 目前 bstTree 中构造顺序是正确的 但是未达到理论上 root 的左侧小于 右侧 ，目前更像一个链表，将第一个元素设置为ROOT
        // BST 二叉排序树  ADT二叉查找树
        /*
        *
        * 非空左子树的所有键值小于其根节点的键值
        * 非空右子树的所有键值大于其根节点的键值
        * */
        // AVL 二叉平衡树
        System.out.println(bstTree);
        m.addAttribute("result", DateFormat.getDateTimeInstance().format(new Date()));
        
        return "compute";
    }

}




//import java.text.DateFormat;
//import java.util.Date;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class HelloController {
//
//    @RequestMapping("/hello")
//    public String hello(Model m) {
//        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
//        return "hello";
//    }
//}

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HelloController {
//
//    @RequestMapping("/hello")
//    public String hello() {
//        return "Hello Spring Boot!";
//    }
//
//}