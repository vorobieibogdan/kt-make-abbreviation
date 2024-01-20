package mate.academy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MakeAbbreviationTest {

    @Test
    fun makeAbbr_MultiWordString_CorrectAbbreviation() {
        // given
        val input = "national aeronautics space administration"

        // when
        val result = makeAbbr(input)

        // then
        assertEquals("NASA", result)
    }

    @Test
    fun makeAbbr_ShortMultiWordString_CorrectAbbreviation() {
        // given
        val input = "central processing unit"

        // when
        val result = makeAbbr(input)

        // then
        assertEquals("CPU", result)
    }

    @Test
    fun makeAbbr_LongMultiWordString_CorrectAbbreviation() {
        // given
        val input = "simplified molecular input line entry specification"

        // when
        val result = makeAbbr(input)

        // then
        assertEquals("SMILES", result)
    }

    @Test
    fun makeAbbr_SingleWordString_SingleLetter() {
        // given
        val input = "word"

        // when
        val result = makeAbbr(input)

        // then
        assertEquals("W", result)
    }

}
