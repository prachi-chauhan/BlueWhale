package com.prachauhan.dc.api;

import java.util.logging.Logger;

/**
 * This class provides the implementation for the following cases in Dyncamic connectivity problem:
 * 1. Initialization
 * 2. Add a connection between two sites
 * 3. Identifying the component, given the site
 * 4. Determining whether 2 sites are in the same component
 * 5. Computing number of components
 *
 * @author prachauhan
 */
public class UnionFind {
    
    // here id[] represents the site ids
    private int[] id;
    private int count;
    private static final Logger logger = Logger.getLogger(UnionFind.class.getName());
    
    // initializing the array
    public UnionFind(int N) {
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
        //quick find
        logger.info(String.format("identify the component containing the site %d", s));
        return id[s];
    }
    
    // determine whether two sites are connected
    public boolean isConnected(int p, int q) {
        logger.info(String.format("Checking if the two components %d and %d are connected", p, q));
        return find(p) == find(q);
    }
    
    // add a connection between two sites p and q
    public void union(int p, int q) {
        //quick union
        int idP = find(p);
        int idQ = find(q);
        logger.info(String.format("Analyzing %d and %d for connecting or not based on their current components", p, q));
        if (idP == idQ) {
            return;
        } else {
            logger.info("creating a connection between two sites");
            // renaming p's component to q's component id
            for (int i = 0; i < id.length; i++) {
                if (idP == id[i]) {
                    id[i] = idQ;
                }
            }
            count--;
        }
    }
    
}
