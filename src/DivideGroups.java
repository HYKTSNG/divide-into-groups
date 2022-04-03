package src;

import java.util.*;

public class DivideGroups {

    public static void divideIntoGroups() {

        Scanner scanner = new Scanner(System.in);

        String[] shuffleList = ShuffleList.shuffleList(MembersList.createMembersList());

        System.out.println("何人ずつに分けますか？");
        // Integer listCntsystemIn = scanner.nextInt();
        Integer listCntsystemIn = 3;

        for (int i = 0; i < shuffleList.length; i += listCntsystemIn) {
            String[] dst = Arrays.copyOfRange(shuffleList, i, i + listCntsystemIn);
            System.out.println(Arrays.toString(dst));

        }

        scanner.close();

    }

}
