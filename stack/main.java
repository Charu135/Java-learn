class Main{
    public static void main(String[]args){
        Stack sc = new Stack(5);

        System.out.println("-- push 10, 20, 30");
        sc.push(10);
        sc.push(20);
        sc.push(30);
        sc.display();

        System.out.println("peek: " + sc.peek());

        System.out.println("pop: " + sc.pop());
        sc.display();

        System.out.println("-- push 40, 50, 60");
        sc.push(40);
        sc.push(50);
        sc.push(60);
        sc.display();

        System.out.println("size: " + sc.size());
        System.out.println("isFull: " + sc.isFull());
        System.out.println("isEmpty: " + sc.isEmpty());

        int value = 20;
        System.out.println("search("+value+"): " + sc.search(value) + " (distance from top, -1 means not found)");

        System.out.println("clearing stack");
        sc.clear();
        sc.display();
    }
}