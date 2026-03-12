package Semester_2;

import java.util.*;

public class Task_1 {
    public static void runTask() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of candidates: ");
        int n = sc.nextInt();
        HashSet<Integer> candidates = new HashSet<>();
        System.out.println("Enter candidate IDs:");
        for (int i = 0; i < n; i++) {
            candidates.add(sc.nextInt());
        }

        System.out.print("Enter number of eligible citizens: ");
        int m = sc.nextInt();
        HashSet<Integer> citizens = new HashSet<>();
        System.out.println("Enter citizen IDs:");
        for (int i = 0; i < m; i++) {
            citizens.add(sc.nextInt());
        }

        System.out.print("Enter number of votes submitted: ");
        int k = sc.nextInt();
        HashMap<Integer, Integer> voteCount = new HashMap<>();
        HashSet<Integer> alreadyVoted = new HashSet<>();

        System.out.println("Enter votes (CitizenID CandidateID):");
        for (int i = 0; i < k; i++) {
            int citizenID = sc.nextInt();
            int candidateID = sc.nextInt();

            // check if citizen is valid
            if (!citizens.contains(citizenID)) {
                continue;
            }

            // check if candidate is valid
            if (!candidates.contains(candidateID)) {
                continue;
            }

            // check if citizen already voted
            if (alreadyVoted.contains(citizenID)) {
                continue;
            }

            alreadyVoted.add(citizenID);
            voteCount.put(candidateID, voteCount.getOrDefault(candidateID, 0) + 1);
        }

        int winner = -1;
        int maxVotes = 0;

        for (int candidateID : voteCount.keySet()) {
            if (voteCount.get(candidateID) > maxVotes) {
                maxVotes = voteCount.get(candidateID);
                winner = candidateID;
            }
        }

        System.out.println("\nResult:");
        if (winner != -1) {
            System.out.println(winner + " won.");
        } else {
            System.out.println("No valid votes.");
        }

        sc.close();
    }
}