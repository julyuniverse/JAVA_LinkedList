public class MySinglyLinkedListTest {
    public static void main(String[] args) {
        MySinglyLinkedList myLinkedList = new MySinglyLinkedList();

        myLinkedList.showSinglyLinkedList();
        myLinkedList.addNode("A");
        myLinkedList.addNode("B");
        myLinkedList.addNode("C");
        myLinkedList.showSinglyLinkedList();

        // 결과
        // 출력할 노드가 없어요.
        // "A" 노드가 추가됐어요.
        // ----------------------------
        // head: MyNode@3b9a45b3
        // tmpNode: MyNode@3b9a45b3
        // head와 tmpNode의 주솟값이 같다.
        // ----------------------------
        // "B" 노드가 추가됐어요.
        // "C" 노드가 추가됐어요.
        // A->B->C
    }
}
