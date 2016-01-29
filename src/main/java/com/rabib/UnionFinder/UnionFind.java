package com.rabib.UnionFinder;

import java.io.*;

import org.apache.commons.io.IOUtils;

/**
 * Hello world!
 *
 */
public class UnionFind {
	int[] L;
	UnionFind(int n){
		for(int i = 0; i< n;i++) {
			L[i] = i;
		}
	}
	
	public static void main(String[] args) throws IOException {


		InputStream inputStream = UnionFind.class.getResourceAsStream("/tinyUF.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		int N = Integer.parseInt(reader.readLine()),first,second;
		UnionFind uf = new UnionFind(N);
		int counter =0;
		String temp;
		while(counter < N) {
			temp = reader.readLine();
			first = Integer.parseInt(temp.split(" ")[0]);
			second = Integer.parseInt(temp.split(" ")[1]);
			if(uf.isconnect(first,second)) {
				uf.union(first,second);
			}
			System.out.println(first);
			System.out.println(second);
			counter++;
		}
		//String theString = IOUtils.toString(inputStream, "UTF-8");
		//System.out.println("Hello World!" + theString);

	}

}
