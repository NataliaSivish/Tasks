package com.company.grep;

public class text {

    private String word;

    public text() {
    }

    public text(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void textFiltering(String textFilter) {
        int size_word = word.length();
        for (int n = 0; n < size_word; n++) {
            System.out.println(word.charAt(n));
        }

    }


}
