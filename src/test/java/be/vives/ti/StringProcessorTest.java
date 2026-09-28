package be.vives.ti;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {
    StringProcessor stringProcessor;
    @BeforeEach
    void setup(){
        stringProcessor = new StringProcessor();
    }

    @Test
    public void suffixNietInStr(){
        String str = "abc";
        String suffix = "xyz";
        assertEquals("abcxyz", stringProcessor.appendIfMissing(str, suffix));
    }

    @Test
    public void suffixInStr(){
        String str = "abc";
        String suffix = "bc";
        assertEquals("abc", stringProcessor.appendIfMissing(str, suffix));
    }

}