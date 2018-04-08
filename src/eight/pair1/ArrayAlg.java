package eight.pair1;


public class ArrayAlg {public ArrayAlg() {
}

    public static ArrayAlg.Pair<String> minmax(String[] a) {
        if(a != null && a.length != 0) {
            String min = a[0];
            String max = a[0];

            for(int i = 1; i < a.length; ++i) {
                if(min.compareTo(a[i]) > 0) {
                    min = a[i];
                }

                if(max.compareTo(a[i]) < 0) {
                    max = a[i];
                }
            }

            return new ArrayAlg.Pair(min, max);
        } else {
            return null;
        }
    }

    public static class Pair<T> {
        private T first;
        private T second;

        public Pair() {
            this.first = null;
            this.second = null;
        }

        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return this.first;
        }

        public T getSecond() {
            return this.second;
        }

        public void setFirst(T first) {
            this.first = first;
        }

        public void setSecond(T second) {
            this.second = second;
        }
    }
}
