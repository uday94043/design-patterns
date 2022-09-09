package behavioralPatterns.iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        String names[] = {"Robert", "John", "Julie", "Lora"};
        NameRepository namesRepository = new NameRepository(names);

        for (Iterator iter = namesRepository.getIterator(0); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
