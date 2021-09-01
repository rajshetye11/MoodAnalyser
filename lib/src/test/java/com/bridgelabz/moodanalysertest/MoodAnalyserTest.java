package com.bridgelabz.moodanalysertest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.moodanalyser.MoodAnalyser;

public class MoodAnalyserTest {
	
	//UC1
	@Test
	public void mood_Whenhappy_ReturnHappy() {
		MoodAnalyser moodAnalyser =new MoodAnalyser("This is a happy mood");
		String mood=moodAnalyser.analyseMood();
		assertEquals("happy",mood);
	}

	
	//TC1
	@Test
	public void mood_WhenSad_ReturnSad() {
		MoodAnalyser moodAnalyser =new MoodAnalyser("This is a sad mood");
		String mood=moodAnalyser.analyseMood();
		assertEquals("sad",mood);
	}
	
	//TC2
	@Test
	public void mood_WhenAnyMood_ReturnHappy() {
		MoodAnalyser moodAnalyser =new MoodAnalyser("This is any mood");
		String mood=moodAnalyser.analyseMood();
		assertEquals("happy",mood);
	}
	
	//UC 2
	@Test
	public void mood_WhenNull_ReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String result = moodAnalyser.analyseMood();
		assertEquals("happy", result);
	}
}

