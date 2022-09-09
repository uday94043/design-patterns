package structuralPatterns.proxy;

public class RealImage implements Image {
    String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDist(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    void loadFromDist(String fileName) {
        System.out.println("Loading from disk " + fileName);
    }

}
