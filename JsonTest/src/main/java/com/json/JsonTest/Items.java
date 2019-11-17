package com.json.JsonTest;

import java.util.Date;

public class Items {

	/**
	 * Variable for collection_id
	 */
	private String collection_id;

	/**
	 * Variable for revision_number
	 */
	private int revision_number;

	/**
	 * Variable for file_name
	 */
	private String file_name;

	/**
	 * Variable for created_date
	 */
	private Date created_date;

	/**
	 * Variable for document_id
	 */
	private String document_id;

	/**
	 * Variable for status
	 */
	private String status;

	/**
	 * @return
	 */
	public String getCollection_id() {
		return collection_id;
	}

	/**
	 * @param collection_id
	 */
	public void setCollection_id(String collection_id) {
		this.collection_id = collection_id;
	}

	/**
	 * @param created_date
	 */
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	/**
	 * @return the created_date
	 */
	public Date getCreated_date() {
		return created_date;
	}

	/**
	 * @return
	 */
	public String getFile_name() {
		return file_name;
	}

	/**
	 * @param file_name
	 */
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	/**
	 * @return
	 */
	public String getDocument_id() {
		return document_id;
	}

	/**
	 * @param document_id
	 */
	public void setDocument_id(String document_id) {
		this.document_id = document_id;
	}

	/**
	 * @return
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the revision_number
	 */
	public int getRevision_number() {
		return revision_number;
	}

	/**
	 * @param revision_number
	 */
	public void setRevision_number(int revision_number) {
		this.revision_number = revision_number;
	}

	@Override
	public String toString() {
		return "Items [collection_id=" + collection_id + ", revision_number=" + revision_number + ", file_name="
				+ file_name + ", created_date=" + created_date + ", document_id=" + document_id + ", status=" + status
				+ "]";
	}

}
