package com.js.patterns;



//it reduce reflection API issue
//it is good in Multithread env 
//using enm is best pratic becaue it is thread safe and reduce issue of reflection api
public enum EnumSingleTone {
	
	INSTANCE;

}


//internal of enum
// private static  EnumSingleTone  INSTANCE = new EnumSingleTone();
   
