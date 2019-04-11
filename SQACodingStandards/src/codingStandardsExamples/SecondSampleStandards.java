package codingStandardsExamples;

import codingStandardsExamples.SampleStandards.CollegeStuff;

public class SecondSampleStandards implements CollegeStuff{

	@Override
	public void exams() {
		System.out.println("Exams are starting soon...");
		
	}

	@Override
	public void fyp() {
		System.out.println("Final year project is due soon..");
		
	}
}
