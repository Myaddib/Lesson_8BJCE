package cursor_education_JB;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyList<Integer> list = new MyArrayList<>();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(6);
        list.add(10);
        list.add(45);
        list.add(60);
        list.add(33);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " " );
        }
        System.out.println(" - "+list.size());
        System.out.println();

        list.set(2, 555);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " " );
        }
        System.out.println(" - "+list.size());
        System.out.println();

        list.add(2, 666);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " " );
        }
        System.out.println(" - "+list.size());
        System.out.println();

        list.clear();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " " );
        }
        System.out.println(list);
//        list.remove(2);
//        System.out.println();
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println();
//        System.out.println(list.size());
    }
}
