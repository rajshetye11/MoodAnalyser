package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	private String message;
	
	public MoodAnalyser() {
		
	}
	
	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	public String analyseMood() throws MoodAnalyserException {
		try {
			if(message.contains(("happy"))) {
				return "happy";
			}else if(message.contains(("sad"))){
				return "sad";
			}else {
				return "happy";
			}
			}
			catch(NullPointerException ex) {
				throw new MoodAnalyserException("Enter Valid Mood");
			}
		
	}
}
