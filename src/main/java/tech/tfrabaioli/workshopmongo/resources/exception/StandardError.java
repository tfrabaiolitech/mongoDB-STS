package tech.tfrabaioli.workshopmongo.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String error;
	private String message;
	private String path;
	private Long timestamp;
	private Integer status;
	
	public StandardError() {
		
	}
	
	public StandardError(String error, String message, String path, Long timestamp, Integer status) {
		super();
		this.error = error;
		this.message = message;
		this.path = path;
		this.timestamp = timestamp;
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	

}
