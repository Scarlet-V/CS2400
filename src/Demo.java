public class Demo {
    public static void main(String[] args) {
        Counter counter =new Counter();
        counter.setCount(1);
        System.out.println("counter: "+counter.getCount());
        counter.increaseCount();
        System.out.println("counter after increse is: "+counter.getCount());
        for (int i = 0; i < 4; i++) {
            counter.decreaseCount();
            System.out.println("counter after decrese is: "+counter.getCount());
        }
        
        System.out.println("Current number in string is: "+counter.toString(counter.getCount()));

        counter.setCount(-99);
    }
}
