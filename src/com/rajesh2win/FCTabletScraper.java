package com.rajesh2win;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class FCTabletScraper {
	public static void main(String[] args) throws IOException {
		Map<String, Object> fkTabletSpec = getFlipkartTabletSpec();
		writeSpecToFile(fkTabletSpec);
	}

	private static void writeSpecToFile(Map<String, Object> fkTabletSpec) throws IOException {
		FileWriter fstream = null;
		BufferedWriter out = null;
		try {
			fstream = new FileWriter("tablet.txt");
			out = new BufferedWriter(fstream); 
			Iterator<Entry<String, Object>> it = fkTabletSpec.entrySet().iterator(); 
			while(it.hasNext()){
				Entry<String, Object> pairs = it.next();
				out.write(pairs.getKey()+"~~~"+pairs.getValue() + "\n"); 
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(out!=null)
				out.close();
			if(fstream !=null)
				fstream.close();
		}
		
	}

	private static Map<String, Object> getFlipkartTabletSpec()
			throws IOException {
		String baseUrl = "http://www.flipkart.com/tablets/pr?sid=tyy,hry&otracker=ch_vn_tablet_filter_Brands_ALL";
		Document doc = Jsoup.connect(baseUrl).timeout(0).get();
		ListIterator<Element> t=doc.select("a.fk-display-block").listIterator();
		String[] spec=doc.select("div.pu-border-top").text().split("Add to compare");
		Map<String,Object> specDetails = new HashMap<String,Object>();
		int l=0;
		while(t.hasNext()){			
			specDetails.put(t.next().text(), spec[l]);
			l++;
		}
		
		return specDetails;
	}

}
