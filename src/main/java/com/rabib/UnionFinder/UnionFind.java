package com.rabib.UnionFinder;

import java.io.*;

/**
 * Hello world!
 *
 */
public class UnionFind {
	private int[] L;
	private int[] sz;

	UnionFind(int n) {
		L = new int[n];
		sz = new int[n];
		for (int i = 0; i < n; i++) {
			L[i] = i;
			sz[i] = 1;
		}
	}

	private int root(int item) {
		while (item != L[item])
			item = L[item];
		return item;

	}

	private boolean isconnect(int p, int q) {
		return (root(p) == root(q));
	}

	private void union(int s, int d) {
		int p = root(s);
		int q = root(d);
		if( p == q) return ;
		if(sz[p]> sz[q]){ L[q] = p;	sz[p] += sz[q];	}
		else            { L[p] = q; sz[q] += sz[p];	}
		
	}

	private void displayL() {
		for (int i = 0; i < L.length; i++) {
			System.out.println(L[i]);
		}
	}

	public static void main(String[] args) throws IOException {

		InputStream inputStream = UnionFind.class.getResourceAsStream("/tinyUF.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		int N = Integer.parseInt(reader.readLine()), first, second;
		UnionFind uf = new UnionFind(N);
		int counter = 0;
		String temp;
		while (counter < N) {
			temp = reader.readLine();
			first = Integer.parseInt(temp.split(" ")[0]);
			second = Integer.parseInt(temp.split(" ")[1]);
			if (uf.isconnect(first, second) == false) {
				uf.union(first, second);
			}
			System.out.println(first + " " + second);
			uf.displayL();

			counter++;
		}

		// String theString = IOUtils.toString(inputStream, "UTF-8");
		// System.out.println("Hello World!" + theString);

	}

}
