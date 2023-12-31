package com.nephew.microservices.limitsservice.bean;

public class Limits {
	private String profile;
	private Integer minimum;
	private Integer maximum;

	public Integer getMinimum() {
		return minimum;
	}

	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}

	public Integer getMaximum() {
		return maximum;
	}

	public void setMaximum(Integer maximum) {
		this.maximum = maximum;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public Limits(String profile, Integer minimum, Integer maximum) {
		super();
		this.profile = profile;
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public Limits() {
		super();
	}

	@Override
	public String toString() {
		return "Limits [profile=" + profile + ", minimum=" + minimum + ", maximum=" + maximum + "]";
	}

	

}
