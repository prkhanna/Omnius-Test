package com.json.JsonTest;

import java.util.List;


public class Payload {

	/**
	 * Variable for total
	 */
	private int total;
	/**
	 * Variable for size
	 */
	private int size;
	/**
	 * Variable for limit
	 */
	private int limit;
	/**
	 * Variable for from
	 */
	private int from;
	/**
	 * Variable for page
	 */
	private int page;
	/**
	 * Variable for items
	 */
	private List<Items> items;

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the limit
	 */
	public int getLimit() {
		return limit;
	}

	/**
	 * @param limit
	 */
	public void setLimit(int limit) {
		this.limit = limit;
	}

	/**
	 * @return the from
	 */
	public int getFrom() {
		return from;
	}

	/**
	 * @param from
	 */
	public void setFrom(int from) {
		this.from = from;
	}

	/**
	 * @return the page
	 */
	public int getPage() {
		return page;
	}

	/**
	 * @param page
	 */
	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * @return the items
	 */
	public List<Items> getItems() {
		return items;
	}

	/**
	 * @param items
	 */
	public void setItems(List<Items> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Payload [total=" + total + ", size=" + size + ", limit=" + limit + ", from=" + from + ", page=" + page
				+ ", items=" + items + "]";
	}

}
