package com.prachauhan.dc.app.service;

import com.prachauhan.dc.api.UnionFind;
import com.prachauhan.dc.impl.FastImplementation1;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DcMain {
    public static final Logger logger = Logger.getLogger(DcMain.class.getName());
    
    public static void main(String[] args) {
        logger.log(Level.INFO, "Starting...");
//        int N = Integer.parseInt(args[0]);
        int count = 0, N = 0;
        Scanner sc = null;
        
        try {
            File file = new File("/Users/prachichauhan/Desktop/MFAANG/HeadFirst/BlueWhale/DynamicConnectivityProblem/src/main/resources/tinyUF.txt");
            sc = new Scanner(file);
            N = Integer.parseInt(sc.next());
        } catch (Exception e) {
            logger.info("Error reading the file");
        }
        count = N;
        
        // slower method
//        UnionFind unionFind = new UnionFind(N);
//        while (sc.next() != null) {
//            int p = sc.nextInt();
//            int q = sc.nextInt();
//            if (unionFind.isConnected(p, q)) {
//                logger.info(String.format("%d and %d are connected", p, q));
//                return;
//            }
//            unionFind.union(p, q);
//        }
        
        //faster array access
        FastImplementation1 fastImplementation1=new FastImplementation1(N);
        while (sc.next() != null) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            if (fastImplementation1.isConnected(p, q)) {
                logger.info(String.format("%d and %d are connected", p, q));
                return;
            }
            fastImplementation1.union(p, q);
        }
        
        
        logger.info(String.format("Number of components: %d", count));
        
    }
}
