package lesson4b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Voting2 {
    private static class Party implements Comparable<Party> {
        String name;
        int vote;
        double div;
        double mod;

        Party(String n, int v) {
            this.name = n;
            this.vote = v;
        }

        @Override
        public int compareTo(Party o) {
            if (this.mod > o.mod) {
                return 1;
            }
            if (this.mod < o.mod) {
                return -1;
            }
            if (this.vote > o.vote) {
                return 1;
            }
            if (this.vote < o.vote) {
                return 1;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        File file = new File("input.txt");
        int sumVote = 0;
        List<Party> names = new ArrayList<>();
        List<Party> partiesList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String d;
            while ((d = br.readLine()) != null) {
                String[] splited = d.split(" ");
                int vote = Integer.parseInt(splited[splited.length - 1]);
                sumVote += vote;
                d = d.substring(0, d.length() - splited[splited.length - 1].length() - 1);
                Party p = new Party(d, vote);
                partiesList.add(p);
                names.add(p);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        double q = sumVote / 450.0;
        int ost = 450;

        for (Party party : partiesList) {
            party.div = Math.floor(party.vote / q);
            party.mod = party.vote % q;
            ost -= party.div;
        }
        if (ost != 0) {
            partiesList.sort((o1, o2) -> -o1.compareTo(o2));
            for (int i = 0; ost > 0; i++) {
                Party p = partiesList.get(i);
                p.div++;
                ost--;
            }
        }
        for (Party p : names) {
            System.out.println(p.name + " " + (int) p.div);
        }
    }
}
