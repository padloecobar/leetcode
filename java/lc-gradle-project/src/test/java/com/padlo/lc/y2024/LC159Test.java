package com.padlo.lc.y2024;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LC159Test {


    @Test
    void lengthOfLongestSubstringTwoDistinct_singleCharacter() {
        assertEquals(1, LC159.lengthOfLongestSubstringTwoDistinct("a"));
    }

    @Test
    void lengthOfLongestSubstringTwoDistinct_twoDistinctCharacters() {
        assertEquals(2, LC159.lengthOfLongestSubstringTwoDistinct("ab"));
    }

    @Test
    void lengthOfLongestSubstringTwoDistinct_multipleCharacters() {
        assertEquals(3, LC159.lengthOfLongestSubstringTwoDistinct("eceba"));
    }

    @Test
    void lengthOfLongestSubstringTwoDistinct_allSameCharacters() {
        assertEquals(5, LC159.lengthOfLongestSubstringTwoDistinct("aaaaa"));
    }

    @Test
    void lengthOfLongestSubstringTwoDistinct_longString() {
        assertEquals(5, LC159.lengthOfLongestSubstringTwoDistinct("ccaabbb"));
    }
}