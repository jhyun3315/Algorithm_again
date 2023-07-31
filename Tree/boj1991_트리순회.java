/*
 *  백준 - 트리 순회
 *  https://www.acmicpc.net/problem/1991
 */

import java.io.*;
import java.util.*;

public class boj1991_트리순회 {
    static Node[] tree;
    static StringBuilder sb;

    static class Node {
        char lNode;
        char rNode;
        char root;

        Node(char lNode, char rNode, char root) {
            this.lNode = lNode;
            this.rNode = rNode;
            this.root = root;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        tree = new Node[26];
        sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            char root = st.nextToken().charAt(0);
            char L = st.nextToken().charAt(0);
            char R = st.nextToken().charAt(0);

            tree[root - 65] = new Node(L, R, root);
        }

        preOrder(0);
        sb.append('\n');
        inOrder(0);
        sb.append('\n');
        postOrder(0);
        System.out.println(sb);
    }

    // 전위 순회
    private static void preOrder(int index) {
        Node curr = tree[index];
        sb.append(curr.root);
        if (curr.lNode != '.')
            preOrder(curr.lNode - 65);
        if (curr.rNode != '.')
            preOrder(curr.rNode - 65);
    }

    // 중위 순회
    private static void inOrder(int index) {
        Node curr = tree[index];
        if (curr.lNode != '.')
            inOrder(curr.lNode - 65);
        sb.append(curr.root);
        if (curr.rNode != '.')
            inOrder(curr.rNode - 65);
    }

    // 후위 순회회
    private static void postOrder(int index) {
        Node curr = tree[index];
        if (curr.lNode != '.')
            postOrder(curr.lNode - 65);
        if (curr.rNode != '.')
            postOrder(curr.rNode - 65);
        sb.append(curr.root);
    }

}
