public interface StringList {

    String add(int index, String item);

    String remove(String item);
    boolean contains(String item);
    int indexOf(String item);
    int lastIndexOf(String item);
    String get(int index);
    boolean equals(StringList otherList);
    int size();
    boolean isEmpty();
    void clear();
    String[] toArray();
}