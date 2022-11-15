public class MyListRunner {

    public static void main(String[] args) {

        MyList<Integer> nums = new MyList<>();

        nums.add(1000);
        nums.add(500);
        nums.add(1500);
        nums.add(-200);
        nums.add(-120);

        System.out.println("Smallest number of list " + nums.smallest());
        System.out.println("Largest number of list " + nums.largest());
    }

}