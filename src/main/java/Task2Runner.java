public class Task2Runner {
    public static void main(String[] args) {

        Task2<Integer> numbers = new Task2<>();
        Task2<String> str = new Task2<>();

        numbers.add(120);
        numbers.add(100);
        numbers.add(45);

        str.add("Masha");
        str.add("Misha");
        str.add("Dima");

        numbers.printArray();
        str.printArray();

    }
}
