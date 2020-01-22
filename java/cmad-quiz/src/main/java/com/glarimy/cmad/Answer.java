package com.glarimy.cmad;

public class Answer {
	private int qid;
	private String option;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	@Override
	public String toString() {
		return "Answer [qid=" + qid + ", option=" + option + "]";
	}

}
