import java.util.ArrayList;

public class MyList<T extends Number> {
    private ArrayList<T> arrayList;

    public MyList() {
        arrayList = new ArrayList<>();
    }

    public void add(T value) {
        arrayList.add(value);
    }

    public T getLargest() {
        try {
            if (arrayList.size() != 0) {
                T maxValue = arrayList.get(0);
                for (T value : arrayList) {
                    if (maxValue.longValue() < value.longValue()) {
                        maxValue = value;
                    }
                }
                return maxValue;
            }
        } catch (NullPointerException e) {
            System.out.println("One of values is NULL");
        }
        return null;
    }

    public T getSmallest() {
        if (arrayList.size() != 0) {
            T minValue = arrayList.get(0);
            for (T value : arrayList) {
                if (value.longValue() < minValue.longValue()) {
                    minValue = value;
                }
            }
            return minValue;
        }
        return null;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(" " + arrayList);
        sb.append(" | Maximum value = ").append(getLargest());
        sb.append(" | Minimum value = ").append(getSmallest() + "\n");
        return sb.toString();
    }
}


