package LatModul5;

public class Main {
    public static void main(String[] args) {
        BinaryTree pohon = new BinaryTree();

        pohon.NewNode(20);
        pohon.NewNode(2);
        pohon.NewNode(25);
        pohon.NewNode(37);
        pohon.NewNode(16);

        System.out.print("\nPreOrder: ");
        pohon.preOrder(pohon.root);
        System.out.print("\nInOrder: ");
        pohon.inOrder(pohon.root);
        System.out.print("\nPostOrder: ");
        pohon.postOrder(pohon.root);

    }



}
