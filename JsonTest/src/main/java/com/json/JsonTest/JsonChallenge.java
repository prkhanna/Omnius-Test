package com.json.JsonTest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * @author Prince Khanna
 *
 */
public class JsonChallenge {

	static ObjectMapper mapper = new ObjectMapper();

	public static void main(String[] args) {
		
		findItemByStatus("REOPENED");
		findItemsByName("10.pdf") ;

	}

	/**
	 * Method to read Json response
	 * 
	 * @return
	 */
	private static Main readJson() {
		Main main = null;
		try {
			main = mapper.readValue(new File("F:\\workspace\\JsonTest\\response.json"), Main.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return main;

	}

	/**
	 * Problem 1 Method to get the count of all status
	 * 
	 * @return
	 */
	private static Map<String, List<Items>> getStatuswiseDocuments() {
		List<Items> itemList = readJson().getPayload().getItems();
		Map<String, List<Items>> statusDocsCountMap = new HashMap<String, List<Items>>();

		for (Items item : itemList) {
			if (statusDocsCountMap.containsKey(item.getStatus())) {
				List<Items> statuswiseItemList = statusDocsCountMap.get(item.getStatus());
				statuswiseItemList.add(item);
				statusDocsCountMap.put(item.getStatus(), statuswiseItemList);
			} else {
				List<Items> statuswiseItemList = new ArrayList<Items>();
				statuswiseItemList.add(item);
				statusDocsCountMap.put(item.getStatus(), statuswiseItemList);
			}

		}

		statusDocsCountMap
				.forEach((status, statuswiseItemList) -> System.out.println(status + " " + statuswiseItemList.size()));

		return statusDocsCountMap;
	}

	/**
	 * Problem 2 Method to get all the values for a given status
	 * 
	 * @param status
	 * @return
	 */
	private static List<String> findItemByStatus(String status) {
		Map<String, List<Items>> statusDocsCountMap = getStatuswiseDocuments();

		List<Items> abc = statusDocsCountMap.get(status);
		List<String> itmcontents = null;
		for (Items itm : abc) {

			itmcontents = new ArrayList<String>();
			itmcontents.add(itm.getCollection_id());
			itmcontents.add(itm.getDocument_id());
			itmcontents.add(itm.getFile_name());
			itmcontents.add(String.valueOf(itm.getRevision_number()));
			itmcontents.add(itm.getCreated_date().toString());

		}

		return itmcontents;
	}

	/**
	 * Problem 3
	 * Method to find all items by Name
	 * 
	 * @param FileName
	 * @return
	 */
	private static List<String> findItemsByName(String FileName) {
		List<Items> itemList = readJson().getPayload().getItems();
		List<String> itmcontents = null;
		for (Items itm : itemList) {

			if (itm.getFile_name().equalsIgnoreCase(FileName)) {
				itmcontents = new ArrayList<String>();
				itmcontents.add(itm.getCollection_id());
				itmcontents.add(itm.getDocument_id());
				itmcontents.add(String.valueOf(itm.getRevision_number()));
				itmcontents.add(itm.getStatus());
				itmcontents.add(itm.getCreated_date().toString());

			}
		}
		return itmcontents;

	}
}