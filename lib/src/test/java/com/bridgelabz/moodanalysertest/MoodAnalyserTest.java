package com.bridgelabz.moodanalysertest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.moodanalyser.MoodAnalyser;

public class MoodAnalyserTest {
	@Test
	public void testMoodAnalysis() {
		MoodAnalyser moodAnalyser =new MoodAnalyser();
		String mood=moodAnalyser.analyseMood("This is a happy message");
	
		assertEquals("happy",mood);
		
	}
}
