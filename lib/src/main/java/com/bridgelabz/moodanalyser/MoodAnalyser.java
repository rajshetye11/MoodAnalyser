package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	public String analyseMood(String message) {
		if(message.contains(("happy"))) {
			return "happy";
		}else if(message.contains(("sad"))){
			return "sad";
		}else {
			return "happy";
		}
	}
}
