package io.algorithm.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ColumnMain {

	/**
	 * 
	 * 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String entrada = "";

        int i=0;
        int len = 0;
    	String [][] table = null;
        while((entrada = br.readLine()) != null) {
        	String[] colume = entrada.split(",");

        	if(i==0) {
        		len = colume.length;
            	table = new String[len][len];
        	} else {
        		for(int k=0; k <len; k++) {
            		table[i][k] = colume[k];
        		}
        	}

    		i++;
            //System.out.println("column => " + word);
        }

        for(int m=0; m < table.length; m++) {
    		for(int n=0; n < table[0].length; n++) {
        		System.out.println(table[m][n]);
    		}
        }

        System.out.println();
	}

}