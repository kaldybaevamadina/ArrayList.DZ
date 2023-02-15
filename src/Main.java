import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();

        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(11);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(18);
        arrayList.add(21);
        arrayList.add(23);
        arrayList.add(24);
        arrayList.add(30);
        arrayList.add(33);
        arrayList.add(36);
        arrayList.add(37);
        arrayList.add(40);
        arrayList.add(42);

        arrayList.add(49);
        arrayList.add(51);
        arrayList.add(56);
        arrayList.add(60);
        arrayList.add(66);
        arrayList.add(70);
        arrayList.add(75);
        arrayList.add(80);
        arrayList.add(99);
        ArrayList<Integer>even=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            Integer x=arrayList.get(i);
            if (x % 2 == 0) {
                even.add(x);
            }else
            odd.add(x);
            System.out.println(arrayList.get(i));

for (Integer number:even){
    System.out.println(number);
}
for (Integer number:odd){
    System.out.println(number);
}
        }

    }
}