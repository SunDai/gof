package sundai.gof.structures.composite;

import sundai.gof.structures.bridge.Test;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by xh on 2015/10/16.
 */
public class TreeNode {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<TreeNode>();//一般我这个都喜欢用点 map啥的

    public TreeNode(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public void add(TreeNode node){
        children.add(node);
    }

    public void remove(TreeNode node){
        children.remove(node);
    }

    public Enumeration<TreeNode> getChildren(){
        return children.elements();
    }
}
