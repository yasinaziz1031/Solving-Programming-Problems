public class Node {
    int value;
    Node left;
    Node right;

    Node (int value) {
        this.value = value;
        right = null;
        left = null;
    }
    Node (int v, Node j, Node s) {
    value = v;
    left = j;
    right = s;
    }
}