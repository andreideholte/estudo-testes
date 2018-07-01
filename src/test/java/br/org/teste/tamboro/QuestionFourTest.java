package br.org.teste.tamboro;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.org.teste.tamboro.questions.QuestionFour;

public class QuestionFourTest {

    QuestionFour questionFour;

    @Before
    public void instanciarRecurso() {
        questionFour = new QuestionFour();
    }

    @Test
    public void matchSimpleText() {
        Boolean check = questionFour.match("a", "a");
        assertTrue(check);
    }

    @Test
    public void matchSimpleRepeatChar() {
        Boolean check = questionFour.match("a", "a*");
        assertTrue(check);
    }

    @Test
    public void matchSimpleRepeatCharBlankInput() {
        Boolean check = questionFour.match("", "a*");
        assertTrue(check);
    }

    @Test
    public void matchWrongSimpleRepeatCharBlankInput() {
        Boolean check = questionFour.match("", "a*a");
        assertFalse(check);
    } 

    @Test
    public void matchSimpleAnyChar() {
        Boolean check = questionFour.match("a", ".");
        assertTrue(check);
    }

    @Test
    public void matchSimpleRepeatWithAnyChar() {
        Boolean check = questionFour.match("a", ".*");
        assertTrue(check);
    }

    @Test
    public void matchComplexRepeatChars() {
        Boolean check = questionFour.match("ab", "a*b*");
        assertTrue(check);
    }

    @Test
    public void matchComplextRepeatWithAnyChars() {
        Boolean check = questionFour.match("ab", "a*.*b");
        assertTrue(check);
    }

    @Test
    public void matchComplexWrongRepeatChars() {
        Boolean check = questionFour.match("ab", "a*c");
        assertFalse(check);
    }
}