package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int userCount;
    static int ladderHeight;
    static String[][] ladder;
    
    public static void main(String[] args) {
        getGameDate();
        makeLadder();
        printLadder();
    }

    private static void printLadder() {
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                System.out.print(ladder[i][j]);
            }
            System.out.println();
        }
    }

    private static void makeLadder() {
        ladder = new String[ladderHeight][];
        for (int i = 0; i < ladderHeight; i++) {
            ladder[i] = makeLine();
        }
    }

    private static String[] makeLine() {
        String[] line = new String[userCount * 2 - 1];
        for (int j = 0; j < userCount * 2 - 1; j++) {
            line[j] = makePoll(j);
        }
        return line;
    }

    private static String makePoll(int j) {
        if (j % 2 == 0) {
            return "|";
        }
        boolean randomLine = new Random().nextBoolean();
        return  randomLine ? "-" : " ";
    }

    static void getGameDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("참여할 사람은 몇 명인가요?");
        userCount = sc.nextInt();
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        ladderHeight = sc.nextInt();
    }
}
