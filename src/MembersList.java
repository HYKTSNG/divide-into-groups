package src;

import java.util.*;

public class MembersList {

    public static List<String> createMembersList() {
        Scanner scanner = new Scanner(System.in);

        // List<String> originalNamesList = new ArrayList<>(
        // Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
        // "M", "N"));
        List<String> originalNamesList = new ArrayList<>();

        System.out.println("何人のグループですか？");
        Integer originalMembers = scanner.nextInt();

        for (int i = 1; i <= originalMembers; i++) {
            System.out.println("メンバーの名前を入力してください。");
            System.out.println(i + "人目");
            String m = scanner.next();
            originalNamesList.add(m);
        }

        return originalNamesList;

    }
}
