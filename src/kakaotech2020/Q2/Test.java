package kakaotech2020.Q2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Tests {

    @Test
    void solution1() {
        Main m = new Main();
        long start = System.nanoTime();
        assertEquals(60420, m.solution("100-200*300-500+20"));
        long end = System.nanoTime();
        System.out.println("time: " +(end - start) +"ns");

    }

    @Test
    void solution2() {
        Main m = new Main();
        long start = System.nanoTime();
        assertEquals(300, m.solution("50*6-3*2"));
        long end = System.nanoTime();
        System.out.println("time: " +(end - start) +"ns");

    }


}
