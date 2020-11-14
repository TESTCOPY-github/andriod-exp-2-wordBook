package com.example.wordbook;

import com.example.wordbook.model.Word;
import com.example.wordbook.model.WordLibrary;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void addword() {
        Word word;
        word = new Word("apple", "苹果", "eat apple");
        //向数据库添加数据，但需要context，待解决。
        word = new Word("banana", "香蕉", "eat banana");
    }

}