package com.rabib.UnionFinder;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

/**
 * Hello world!
 *
 */
public class UnionFind {
	public static void main(String[] args) throws IOException {

		InputStream inputStream = UnionFind.class.getResourceAsStream("/tinyUF.txt");
		String theString = IOUtils.toString(inputStream, "UTF-8");
		System.out.println("Hello World!" + theString);

	}
}
