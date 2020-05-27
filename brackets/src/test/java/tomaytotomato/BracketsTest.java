package tomaytotomato;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BracketsTest {

    @Test
    public void isParenthesisMatch_WhenValidExpressionsThenTrue() {
        assertThat(Brackets.isParenthesisMatch("(()())")).isTrue();
        assertThat(Brackets.isParenthesisMatch("(())")).isTrue();
        assertThat(Brackets.isParenthesisMatch("(((())))")).isTrue();
        assertThat(Brackets.isParenthesisMatch("()()()()()()")).isTrue();

    }

    @Test
    public void isParenthesisMatch_WhenInvalidExpressionsThenFalse() {
        assertThat(Brackets.isParenthesisMatch("")).isFalse();
        assertThat(Brackets.isParenthesisMatch(null)).isFalse();
        assertThat(Brackets.isParenthesisMatch("")).isFalse();
        assertThat(Brackets.isParenthesisMatch("(()()")).isFalse();
        assertThat(Brackets.isParenthesisMatch("(((((((")).isFalse();
        assertThat(Brackets.isParenthesisMatch(")))")).isFalse();

    }
}
