package datastructures.tree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(47);
        binarySearchTree.insert(21);
        binarySearchTree.insert(76);
        binarySearchTree.insert(18);
        binarySearchTree.insert(27);
        binarySearchTree.insert(52);
        binarySearchTree.insert(82);

//        System.out.println(binarySearchTree.root);

//        System.out.println(binarySearchTree.contains(83));
//        System.out.println(binarySearchTree.rContains(27));
//        binarySearchTree.deleteNode(27);
//        System.out.println(binarySearchTree.rContains(27));

        System.out.println("Breath first Order" + binarySearchTree.BFS());
//        System.out.println("PreOrder" + binarySearchTree.DPSPreOrder());
//        System.out.println("PreOrder" + binarySearchTree.DPSPostOrder());
//        System.out.println("PreOrder" + binarySearchTree.DPSInOrder());
    }
}
