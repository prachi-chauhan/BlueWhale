package com.prachauhan.dc.impl;

import com.prachauhan.dc.api.UnionFind;

import java.util.logging.Logger;

public class FastImplementation1 {
    // in this case, id[] represents the parent link of a site
    private int[] id;
    private int count;
    private static final Logger logger = Logger.getLogger(UnionFind.class.getName());
    
    // initializing the array
    public FastImplementation1(int N) {
        setCount(N);
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }
    
    public int getCount() {
        return count;
    }
    
    private void setCount(int count) {
        this.count = count;
    }
    
    // identify the component containing the site s
    private int find(int s) {
        // find : when we reach the root we have found all the sites in the component with site s
        logger.info(String.format("identify the component containing the site %d", s));
        while (s != id[s])
            s = id[s];
        return s;
    }
    
    // determine whether two sites are connected
    public boolean isConnected(int p, int q) {
        logger.info(String.format("Checking if the two components %d and %d are connected", p, q));
        return find(p) == find(q);
    }
    
    // add a connection between two sites p and q
    public void union(int p, int q) {
        //quick union
        int rootP = find(p);
        int rootQ = find(q);
        logger.info(String.format("Analyzing %d and %d for connected or not based on their current components", p, q));
        if (rootP == rootQ) {
            return;
        } else {
            logger.info("creating a connection between two sites by connecting their components");
            // poitning p's parent link to q, such that q is a parent of p
            id[rootP] = rootQ;
            count--;
        }
    }
}
