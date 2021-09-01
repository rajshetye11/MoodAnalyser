package com.bridgelabz.moodanalysertest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.moodanalyser.MoodAnalyser;

public class MoodAnalyserTest {
	
	//UC1
	@Test
	public void mood_Whenhappy_ReturnHappy() {
		MoodAnalyser moodAnalyser =new MoodAnalyser();
		String mood=moodAnalyser.analyseMood("This is a happy mood");
		assertEquals("happy",mood);
	}

	
	//TC1
	@Test
	public void mood_WhenSad_ReturnSad() {
		MoodAnalyser moodAnalyser =new MoodAnalyser();
		String mood=moodAnalyser.analyseMood("This is a sad mood");
		assertEquals("sad",mood);
	}
	
	//TC2
	@Test
	public void mood_WhenAnyMood_ReturnHappy() {
		MoodAnalyser moodAnalyser =new MoodAnalyser();
		String mood=moodAnalyser.analyseMood("This is any mood");
		assertEquals("happy",mood);
	}
}

