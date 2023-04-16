package question22;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
    private final int value;
    private final String name;
    private final List<Integer> numbers;

    public ImmutableClass(int value, String name, List<Integer> numbers) {
        this.value = value;
        this.name = name;
        // defensive copy to ensure that the original list is not modified
        this.numbers = new ArrayList<>(numbers);
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getNumbers() {
        // defensive copy to ensure that the original list is not modified
        return new ArrayList<>(numbers);
    }
}

