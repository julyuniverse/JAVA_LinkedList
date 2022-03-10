public class MyNode {
    // 멤버 변수
    private String data; // 자료
    public MyNode nextLink; // 다음 노드를 가리키는 링크

    // 생성자
    public MyNode() {
        data = null;
        nextLink = null;
    }

    // 생성자 (data 인자만 받아서 생성)
    public MyNode(String data) {
        this.data = data;
        this.nextLink = null;
    }

    // 생성자 (인자가 data, nextLink므로 해당 생성자는 해당 노드의 data와 다음 노드를 생성)
    public MyNode(String data, MyNode nextLink) {
        this.data = data;
        this.nextLink = nextLink;
    }

    public String getData() {
        return data;
    }
}
