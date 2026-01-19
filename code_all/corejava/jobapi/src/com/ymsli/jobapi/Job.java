package com.ymsli.jobapi;

final public class Job implements Comparable<Job>{
	int jobId;
	int priority;

	Job(int jobId, int priority) {
		this.jobId = jobId;
		this.priority = priority;
	}
	

	public int getJobId() {
		return jobId;
	}


	public int getPriority() {
		return priority;
	}



	public void setPriority(int priority) {
		this.priority = priority;
	}



	@Override
	public String toString() {
		return "Job{id=" + jobId + ", priority=" + priority + "}";
	}

	@Override
	public int compareTo(Job o) {
		return Integer.compare(this.getPriority(), o.getPriority());
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
}