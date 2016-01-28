package com.rabib.UnionFinder;

import java.io.*;

import org.apache.commons.io.IOUtils;

/**
 * Hello world!
 *
 */
public class UnionFind {
	public static void main(String[] args) throws IOException {

		InputStream inputStream = UnionFind.class.getResourceAsStream("/tinyUF.txt");
		BufferedReader reader = readInputFile();
		//String theString = IOUtils.toString(inputStream, "UTF-8");
		System.out.println("Hello World!" + reader.toString());

	}
	private  BufferedReader readInputFile(){

		InputStream inputStream = getClass().getResourceAsStream("/tinyUF.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		//String theString = IOUtils.toString(inputStream, "UTF-8");
		return reader ;
	}
}
