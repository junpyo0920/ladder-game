package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int userCount;
    static int ladderHeight;

    public static void main(String[] args) {
        getGameDate();

        for (int i = 0; i < ladderHeight; i++) {
            for (int j = 0; j < userCount * 2 - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("|");
                    continue;
                }
                boolean randomLine = new Random().nextBoolean();
                System.out.print(randomLine ? "-" : " ");
            }
            System.out.println();
        }
    }

    static void getGameDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("참여할 사람은 몇 명인가요?");
        userCount = sc.nextInt();
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        ladderHeight = sc.nextInt();
    }
}