public class MySinglyLinkedListTest {
    public static void main(String[] args) {
        MySinglyLinkedList myLinkedList = new MySinglyLinkedList();

        myLinkedList.addNode("A");
        myLinkedList.addNode("B");
        myLinkedList.addNode("C");
        myLinkedList.addPositioningNode(1, "D");
        myLinkedList.showSinglyLinkedList();
        myLinkedList.deletePositioningNode(3);

        myLinkedList.showSinglyLinkedList();

        // 결과
        // "A" 노드가 추가됐어요.
        // ----------------------------
        // head: MyNode@3b9a45b3
        // tmpNode: MyNode@3b9a45b3
        // head와 tmpNode의 주솟값이 같다.
        // ----------------------------
        // "B" 노드가 추가됐어요.
        // "C" 노드가 추가됐어요.
        // 1번째 index에 "D" 노드가 추가됐어요.
        // A->D->B->C
        // 3번째 index가 삭제됐어요.
        // A->D->B
    }
}
