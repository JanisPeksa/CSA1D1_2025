package Semester_2;

import java.util.*;

// Not Completed Yet.....

public class Task_2 {
    public static void runTask() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of classes: ");
        int n = sc.nextInt();

        int[] start = new int[n];
        int[] duration = new int[n];
        int[] end = new int[n];

        System.out.println("Enter start times:");
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
        }

        System.out.println("Enter durations:");
        for (int i = 0; i < n; i++) {
            duration[i] = sc.nextInt();
        }

        // calculate end times
        for (int i = 0; i < n; i++) {
            end[i] = start[i] + duration[i];
        }

        ArrayList<String> overlappingPairs = new ArrayList<>();
        ArrayList<ArrayList<Integer>> conflictsPerClass = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            conflictsPerClass.add(new ArrayList<>());
        }

        // check for overlaps
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // check if intervals [start[i], end[i]) and [start[j], end[j]) overlap
                if (start[i] < end[j] && start[j] < end[i]) {
                    overlappingPairs.add("(" + i + "," + j + ")");
                    conflictsPerClass.get(i).add(j);
                    conflictsPerClass.get(j).add(i);
                }
            }
        }

        // output results
        System.out.println("\noverlapping pairs:");
        if (overlappingPairs.isEmpty()) {
            System.out.println("none");
        } else {
            for (int i = 0; i < overlappingPairs.size(); i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(overlappingPairs.get(i));
            }
            System.out.println();
        }

        System.out.println("conflicts per class:");
        for (int i = 0; i < n; i++) {
            System.out.print(i + ": [");
            for (int j = 0; j < conflictsPerClass.get(i).size(); j++) {
                if (j > 0) System.out.print(", ");
                System.out.print(conflictsPerClass.get(i).get(j));
            }
            System.out.println("]");
        }

        sc.close();
    }
}