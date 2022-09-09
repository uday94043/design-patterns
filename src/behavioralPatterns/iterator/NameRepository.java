package behavioralPatterns.iterator;

public class NameRepository implements Container {

    public String names[];

    public NameRepository(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator getIterator(int startIndex) {
        return new NameIterator(startIndex);
    }

    private class NameIterator implements Iterator {

        int index;

        public NameIterator(int index) {
            this.index = index;
        }

        @Override
        public boolean hasNext() {

            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
