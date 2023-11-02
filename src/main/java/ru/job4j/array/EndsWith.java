package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        int lengthWord = word.length - 1;
        int lengthPost = post.length - 1;

        for (int i = 0; i < lengthWord / 2; i++) {
            if (word[lengthWord - i] != post[lengthPost - i]) {
                return false;
            }
        }
        return true;
    }
}
