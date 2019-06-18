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


    public void characterOutputWord() {
        int size_word = word.length();
        for (int n = 0; n < size_word; n++) {
            System.out.println(word.charAt(n));
        }

    }

    public void textFiltering(String textFilter) {
        int size_word = word.length();
        int m = 0;
        int size_text = textFilter.length();
        for (int i = 0; i < size_text; i++) {
            i = m;
            for (int j = 0; j < size_word; j++) {

                if (word.charAt(j) == textFilter.charAt(i)) {
                    i++;
                    System.out.println("Слово - " );

                    if (j == size_word - 1) {
                        System.out.println("Слово - " + word + " есть в тексте:" + textFilter);
                        break;
                    }
                }
                else {
                    i++;
                    m = i;
                    System.out.println("Слово - " );
                }

            }
        }

    }


}
