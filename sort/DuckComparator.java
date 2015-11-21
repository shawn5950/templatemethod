package com.j2.templatemethod.sort;

import java.util.Comparator;
public class DuckComparator implements Comparator<Duck>{

  public int compare(Duck duck1, Duck duck2) {
    int duckWeight1 = duck1.weight;
    int duckWeight2 = duck2.weight;
    if (duckWeight1 < duckWeight2) {
   return -1;
  } else if (duckWeight1 == duckWeight2) {
   return 0;
  } else {
   return 1;
  }
}
}
   
  

 
 
  
 