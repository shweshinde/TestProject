package com.assignment_10Aug;

public class Job {
	int jobId;
	String profile;
	JoiningDate jd;
	
	public Job (int jobId, String profile,JoiningDate jd)
	{
		this.jobId= jobId;
		this.profile= profile;
		this.jd=jd;
	}
	public void show()
	{
		System.out.println("Job ID is..:" +jobId);
		System.out.println("Job Profile is..:"+profile);
		jd.show1();
	}

}
