package com.bridgelabz.moodanalysertest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.moodanalyser.MoodAnalyser;
import com.bridgelabz.moodanalyser.MoodAnalyserException;

public class MoodAnalyserTest {
	
	//UC1
	@Test
	public void mood_Whenhappy_ReturnHappy() {
		MoodAnalyser moodAnalyser =new MoodAnalyser("This is a happy mood");
		String mood ;
		try {
			mood =  moodAnalyser.analyseMood();
			assertEquals("happy", mood);
		}catch(MoodAnalyserException ex) {

			ex.printStackTrace();
		}
	}

	
	//TC1
	@Test
	public void mood_WhenSad_ReturnSad() {
		MoodAnalyser moodAnalyser =new MoodAnalyser("This is a sad mood");
		String mood ;
		try {
			mood =  moodAnalyser.analyseMood();
			assertEquals("sad", mood);
		}catch(MoodAnalyserException ex) {

			ex.printStackTrace();
		}
	}
	
	//TC2
	@Test
	public void mood_WhenAnyMood_ReturnHappy() {
		MoodAnalyser moodAnalyser =new MoodAnalyser("This is any mood");
		String mood ;
		try {
			mood =  moodAnalyser.analyseMood();
			assertEquals("happy", mood);
		}catch(MoodAnalyserException ex) {
			ex.printStackTrace();
		}
	}
	
	//UC 2
	@Test
	public void mood_WhenNull_ReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood ;
		try {
			mood =  moodAnalyser.analyseMood();
		}catch(MoodAnalyserException ex) {
			assertEquals("Enter Valid Mood", ex.getMessage());
		}
	}
}

