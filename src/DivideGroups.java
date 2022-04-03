package src;

import java.util.*;

public class DivideGroups {

    public static void divideIntoGroups() {

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
            // １回目のsccan が無視されてしまうバグ
            String m = scanner.nextLine();
            originalNamesList.add(m);
        }

        String[] shuffleList = ShuffleList.shuffleList(originalNamesList);

        System.out.println("何人ずつに分けますか？");
        Integer listCntsystemIn = scanner.nextInt();

        for (int i = 0; i < shuffleList.length; i += listCntsystemIn) {
            String[] dst = Arrays.copyOfRange(shuffleList, i, i + listCntsystemIn);
            System.out.println(Arrays.toString(dst));

        }

        scanner.close();

    }

}
