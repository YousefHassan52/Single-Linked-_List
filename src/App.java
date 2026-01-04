public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SingleLinkedList list=new SingleLinkedList();



        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);
        list.print();
        System.out.println();
        SingleLinkedList list2=new SingleLinkedList();
        list2.append(60);
        list2.append(70);
        list2.append(80);
        list2.append(90);
        list2.append(100);
        list2.print();
        System.out.println();

        list.merge(list2);
        list.print();
    }
}
