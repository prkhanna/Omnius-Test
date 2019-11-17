package com.json.JsonTest;

public class Main {
	/**
	 * Variable for duration
	 */
	private String duration;
	/**
	 * Variable for error_message
	 */
	private String error_message;
	/**
	 * Variable for status_code
	 */
	private int status_code;
	/**
	 * Variable for payload
	 */
	private Payload payload;
	/**
	 * Variable for success
	 */
	private boolean success;

	/**
	 * @return duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 * @return error_message
	 */
	public String getError_message() {
		return error_message;
	}

	/**
	 * @param error_message
	 */
	public void setError_message(String error_message) {
		this.error_message = error_message;
	}

	/**
	 * @return status_code
	 */
	public int getStatus_code() {
		return status_code;
	}

	/**
	 * @param status_code
	 */
	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}

	/**
	 * @return payload
	 */
	public Payload getPayload() {
		return payload;
	}

	/**
	 * @param payload
	 */
	public void setPayload(Payload payload) {
		this.payload = payload;
	}

	/**
	 * @return success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	@Override
	public String toString() {
		return "Main [duration=" + duration + ", error_message=" + error_message + ", status_code=" + status_code
				+ ", payload=" + payload + ", success=" + success + "]";
	}

}
