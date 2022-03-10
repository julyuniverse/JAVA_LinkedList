public class MySinglyLinkedList {
    // 멤버 변수
    private MyNode head; // 첫 번째 노드
    int size; // 단일 연결 리스트 크기

    // 생성자
    public MySinglyLinkedList() {
        head = null;
        size = 0;
    }

    // 순차적인 노드 추가
    public void addNode(String data) {
        MyNode newNode;

        if (head == null) { // head가 null이면 (첫 삽입이라면)
            newNode = new MyNode(data);
            head = newNode;
        } else {
            newNode = new MyNode(data); // data를 넣고 노드를 생성
            MyNode tmpNode = head; // 임시 노드에 head를 대입
            while (tmpNode.nextLink != null) { // MyNode type 인스턴스의 다음 인스턴스가 없을 때까지 반복
                tmpNode = tmpNode.nextLink;
            }
            tmpNode.nextLink = newNode;

            /**
             * 여기서 의문이 들 수 있다.
             * MyNode 타입의 tmpNode 변수를 만드는 데 반복적으로 노드를 추가하고 난 뒤, tmpNode는 어떻게 찾나요?
             *
             * 반복적으로 노드를 추가할 때마다 MyNode 타입의 tmpNode 변수가 각각 다른 주솟값으로 메모리에 올라가고, 이 변수들은 프로그램이 종료될 때까지 메모리에 남아 있다.
             * 최초에 head 변수를 설정하였고 head가 가리키는 다음 노드를 찾아내고 또 그 노드가 가리키는 다음 노드를 반복적으로 찾아낸다.
             *
             * addNode() 메서드를 2번 째 실행될 때 head와 tmpNode의 주솟값이 같다는 걸 알 수 있다.
             */
            if (size == 1) {
                System.out.println("----------------------------");
                System.out.println("head: " + head);
                System.out.println("tmpNode: " + tmpNode);
                System.out.println("head와 tmpNode의 주솟값이 같다.");
                System.out.println("----------------------------");
            }
        }
        size++;
        System.out.println("\"" + data + "\" " + "노드가 추가됐어요.");
    }

    public void showSinglyLinkedList() {
        if (size == 0) {
            System.out.println("출력할 노드가 없어요.");
            return;
        }

        MyNode tmpNode = head;
        while (tmpNode != null) {
            System.out.print(tmpNode.getData());
            tmpNode = tmpNode.nextLink;
            if (tmpNode != null) {
                System.out.print("->");
            }
        }
        System.out.println("");
    }
}
