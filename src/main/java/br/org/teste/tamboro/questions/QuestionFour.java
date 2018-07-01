package br.org.teste.tamboro.questions;

public class QuestionFour {
    
    private final Character REPEAT_CHAR = '*';
    private final Character ANY_CHAR = '.';
 
    public Boolean match(String input, String pattern) {
        char[] patternChars = pattern.toCharArray();
        char[] inputChars = input.toCharArray();
        Integer lastIndexInput = null;

        return this.checkPatternInput(lastIndexInput, patternChars, inputChars);
    }

    private Boolean checkPatternInput(Integer lastIndexInput, char[] patternChars, char[] inputChars) {
        for (int i=0; i<patternChars.length; i++) {

            /* Cobre pattern de qualquer caracter [.] */
            if (patternChars[i] == ANY_CHAR) {
                continue;

            /* Cobre pattern de repeticao [*] */
            } else if ((i+1 < patternChars.length) && (patternChars[i+1] == REPEAT_CHAR)) {

                if (lastIndexInput == null) {
                    lastIndexInput = i;

                } else if (lastIndexInput+1 < inputChars.length) {
                    lastIndexInput++;
                }

                if ((lastIndexInput < inputChars.length) && (inputChars[lastIndexInput] != patternChars[i])) {
                    return false;
                }

            /* Cobre match simples */
            } else if (patternChars[i] != REPEAT_CHAR) {
                if (lastIndexInput == null) {
                    lastIndexInput = i;

                } else if (lastIndexInput+1 < inputChars.length) {
                    lastIndexInput++;

                } else {
                    return false;
                }

                if (inputChars[lastIndexInput] != patternChars[i]) {
                    return false;
                }
            }
        }

        return true;
    }
}