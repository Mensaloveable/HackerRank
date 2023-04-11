package com.loveable.WarmupChallenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class SalesByMatchTest {
    /**
     * Method under test: {@link SalesByMatch#sockMerchant(int, List)}
     */
    @Test
    void testSockMerchant() {
        // Arrange, Act and Assert
        assertEquals(0, SalesByMatch.sockMerchant(1, new ArrayList<>()));
        assertEquals(2, SalesByMatch.sockMerchant(1, new int[]{1, 0, 1, 0}));
    }

    /**
     * Method under test: {@link SalesByMatch#sockMerchant(int, List)}
     */
    @Test
    void testSockMerchant2() {
        // Arrange
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(2);

        // Act and Assert
        assertEquals(0, SalesByMatch.sockMerchant(1, integerList));
    }

    /**
     * Method under test: {@link SalesByMatch#sockMerchant2(int, List)}
     */
    @Test
    void testSockMerchant22() {
        // Arrange, Act and Assert
        assertEquals(0, SalesByMatch.sockMerchant2(1, new ArrayList<>()));
    }

    /**
     * Method under test: {@link SalesByMatch#sockMerchant2(int, List)}
     */
    @Test
    void testSockMerchant23() {
        // Arrange
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);

        // Act and Assert
        assertEquals(0, SalesByMatch.sockMerchant2(1, integerList));
    }

    /**
     * Method under test: {@link SalesByMatch#sockMerchant2(int, List)}
     */
    @Test
    void testSockMerchant25() {
        // Arrange
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(1, 2);

        // Act and Assert
        assertEquals(1, SalesByMatch.sockMerchant2(1, integerList));
    }
}

