package com.company;

public interface Iterator {
    boolean hasNext();
    Integer next();
}

class Collection{
    private static Integer[] array;

    Collection(Integer[] array) {
        Collection.array = array;
    }

    public FirstIterator createFirstIterator() {
        return new FirstIterator();
    }

    public class FirstIterator implements Iterator {
        private int i = 0;
        @Override
        public boolean hasNext() {
            return i < array.length;
        }
        @Override
        public Integer next() {
            return array[i++];
        }
    }


    public EndIterator createEndIterator() {
        return new EndIterator();
    }

    public class EndIterator implements Iterator {
        private int i = array.length - 1;
        @Override
        public boolean hasNext() {
            return i >= 0;
        }
        @Override
        public Integer next() {
            i = i - 2;
            return array[i + 2];
        }
    }



    public AnonymousIterator createAnonymousIterator() {
        return new AnonymousIterator();
    }


    public class AnonymousIterator implements Iterator {
            private int i = array.length - 1;
            @Override
            public boolean hasNext() {
                return i >= 0;
            }
            @Override
            public Integer next() {
                return array[i--];
            }
    }


    public LocalIterator createLocalIterator() {
        return new LocalIterator();
    }

    public class LocalIterator implements Iterator {
            private int i = 0;
            @Override
            public boolean hasNext() {
                return i < array.length;
            }
            @Override
            public Integer next() {
                return array[i++];
            }
    }


    static StaticIterator createStaticIterator() {
        return new StaticIterator();
    }
    static class StaticIterator implements Iterator {
        private int i = 0;
        @Override
        public boolean hasNext() {
            return i < array.length;
        }
        @Override
        public Integer next() {
            return array[i++];
        }
    }




}