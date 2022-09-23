package fcc_code_example_recursion;

public  class Hanoi {

    public static void main(String[] args) {
        hanoi(3, 'a', 'c', 'b');
    }

    public static void hanoi(int disk, char fromRod, char toRod, char throughRod) {
        if (disk == 1) {
            System.out.println(fromRod + " -> " + toRod);
            return;
        }

        hanoi(disk - 1, fromRod, throughRod, toRod);
        System.out.println(fromRod + " -> " + toRod);
        hanoi(disk - 1, throughRod, toRod, fromRod);
    }
}