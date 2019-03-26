package cn.teachcourse.link;

public class SingleLink {
    static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static class CalCircle {
        private int stepCount = 0;//记录走过的节点数
        private int visitCount = 0;//记录相遇的次数
        private int lenOfFirstVisit = 0;//首次相遇走过的节点数
        private int lenOfSecondVisit = 0;//第二次相遇走过的节点数

        int length(Node head) {
            if (head == null) return 0;
            Node n1 = head;
            Node n2 = head;
            while (n2.next != null && n2.next.next != null) {
                n1 = n1.next;
                n2 = n2.next.next;
                if (n1 == n2) {
                    visitCount++;
                    if (visitCount == 1) {
                        lenOfFirstVisit = stepCount;
                    }
                    if (visitCount == 2) {
                        lenOfSecondVisit = stepCount;
                    }
                }
                stepCount++;
                if (visitCount == 2) break;
            }
            return lenOfSecondVisit - lenOfFirstVisit;
        }
    }

    public static void main(String[] args) {
        SingleLink link = new SingleLink();
        Node head = link.createSingleList(new Node(0), 10);
        Node head2 = link.createSingleList(new Node(0), 10);
        link.printLink(head);

        //循环法反转单链表
        Node reverseHead = link.reverseLink(head);
        link.printLink(reverseHead);

        //递归法反转单链表
        Node reverseHead2 = link.reverseLink2(head2);
        link.printLink(reverseHead2);

        //创建一个成环的单链表
        head = link.createSingleList(new Node(0), 10, 3);
        System.out.println(link.loopSingleList(head));

        //计算成环单链表的长度
        CalCircle calCircle = new CalCircle();
        System.out.println(calCircle.length(head));

        //计算成环单链表的长度
        int length=link.numOfNode(head,2)-link.numOfNode(head,1);
        System.out.println(length);
    }

    /**
     * 打印出链表的数据
     *
     * @param tail
     */
    void printLink(Node tail) {
        while (tail != null) {
            System.out.print(tail.data + "  ");
            tail = tail.next;
        }
        System.out.print("\n");
    }

    int numOfNode(Node head,int countOfVisit){
        if(head==null) return 0;
        int count=0;//记录相遇的次数
        int stepCount=0;//记录走过的节点数
        Node n1=head;//走得慢的链表
        Node n2=head;//走得快的链表
        while(n2.next!=null&&n2.next.next!=null){
            n1=n1.next;//每次走一个节点
            n2=n2.next.next;//每次走两个节点
            stepCount++;
            if(n1==n2){
                count++;
                if(count==countOfVisit)
                    return stepCount;
            }
        }
        return stepCount;
    }

    /**
     * 判断一条单链表是否成环
     *
     * @param head
     * @return
     */
    boolean loopSingleList(Node head) {
        if (head == null)
            return false;
        Node n1 = head;//慢指针
        Node n2 = head;//快指针
        while (n2.next != null && n2.next.next != null) {
            n1 = n1.next;//每次走一步
            n2 = n2.next.next;//每次走两步
            if (n1 == n2) {//只要有环，会有n1==n2
                return true;
            }
        }
        return false;
    }

    /**
     * 创建一条循环单链表
     *
     * @param head      单链表的起始点
     * @param length    单链表的长度
     * @param circlePos 形成环的位置
     * @return
     */
    public Node createSingleList(Node head, int length, int circlePos) {
        if (head == null) return null;
        Node last = head;//最后一个节点
        Node circleNode = null;
        int i = head.data + 1;
        while (i < length) {
            Node node = new Node(i);
            last.next = node;
            if (i == circlePos) {//记录形成环的节点位置
                circleNode = node;
            }
            last = node;//移动指针到下一个位置
            i++;
        }
        if (last != null) {
            last.next = circleNode;//形成一个环
        }
        return head;
    }

    /**
     * 创建一条单链表
     *
     * @params head 表示单链表开始位置
     * @params length 表示单链表的长度
     */
    public Node createSingleList(Node head, int length) {
        if (head == null) {
            return null;
        }
        Node last = head;//记录开始的内存地址
        int i = head.data + 1;
        while (i < length) {
            Node node = new Node(i);
            last.next = node;//记录持有的引用地址
            last = node;//移动指针到下一个节点
            i++;
        }
        return head;//返回开始的列表地址
    }

    /**
     * 循环算法反转单链表
     *
     * @param head
     * @return
     */
    Node reverseLink(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node next;
        Node prev = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    /**
     * 逆归算法反转单链表
     *
     * @param head
     * @return
     */
    Node reverseLink2(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseLink2(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
