import java.util.Scanner;

class WordEntry {

    String word;

    WordEntry(String word) {
        this.word = word;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof WordEntry))
            return false;

        WordEntry other = (WordEntry) obj;

        String w1 = this.word.replaceAll("\\s+", "").toLowerCase();
        String w2 = other.word.replaceAll("\\s+", "").toLowerCase();

        return w1.equals(w2);
    }
}

class Unit3_Lec19_Code4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        WordEntry word1 = new WordEntry(input1);
        WordEntry word2 = new WordEntry(input2);

        if (word1.equals(word2)) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Player 1 wins!");
        }

        scanner.close();
    }
}