package src;

import java.util.*;

public class ShuffleList {
    public static String[] shuffleList(List<String> originalNamesList) {

        Collections.shuffle(originalNamesList);
        return originalNamesList.toArray(new String[originalNamesList.size()]);

    }
}
