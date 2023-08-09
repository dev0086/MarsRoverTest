
package testpackage;
import Workspace.Rover;
import java.util.*;
public class RoverTest {
	public static final Integer N = 1;
	public static final Integer E = 2;
	public static final Integer S = 3;
	public static final Integer W = 4;
        public static final  String  e ="E";
	public static final  String  w ="W";
	public static final  String  s ="S";
	public static final  String  n ="N";
        public static  Integer a =null;
        public static  Integer b =null;
        public static  String c =null;
        public static  String vFlag ="Y";
       
        
      public static List<String> mysetPosition = Arrays.asList("1/0/","1/0/E","8/8/W","2/0/E","100/200/S"); 
      public static List<String> myMovingTestCase = Arrays.asList("M", "MM", "MMM", "MMR", "RR", "RRR", "ML", "LL", "LLL", "LLLL", "LLLR", 
				"RLLL", "LRLR", "RM", "LMMLMMLMMLMM", "RMMMMRMMRMMMMRMM", "RMMMMLMMRMMMMLMM", "RLMRLMRLM", "LRMLRMLRMLRM", "LRMRLRMR", 
				"LLLMR", "RRRML");
   
      public static void TestCaseOne(List<String> mysetPosition){               
                  System.out.println("Set position  Test");
                mysetPosition.forEach (n ->{
                    String[] pList = n.split("/");
                    vFlag ="Y";
                    try{
                     a = Integer.valueOf(pList[0]);
                    }
                    catch(ArrayIndexOutOfBoundsException | NullPointerException e){  
                     vFlag ="N";
                    }
                    
                    try{
                         b = Integer.valueOf(pList[1]);
                    }
                    catch(ArrayIndexOutOfBoundsException | NullPointerException e)
                      {
                            vFlag ="N";
                      }
                    
                    try{
                         c = String.valueOf(pList[2]);
                    }
                    catch(ArrayIndexOutOfBoundsException | NullPointerException e)
                      {
                            vFlag ="N";
                      }
                    
                    
                    //System.out.println ("a "+a+"  b "+b+ "   c-"+c+"-");
                         
                        Rover testRover = new Rover();
                    
                         if(vFlag =="Y"){
                                  if (c.equals(e)) {testRover.setPosition (a,b,E);}
                             else if (c.equals(w)) {testRover.setPosition (a,b,W);}
                             else if (c.equals(s)) {testRover.setPosition (a,b,S);}
                             else if (c.equals(n)) {testRover.setPosition (a,b,N);}
                              testRover.printPosition();
                         } else{System.out.println ("Not Run for "+"a "+a+"  b "+b+ "   c "+c+" ");}
                });

      
      
      }  
      private static void TestCaseTwo(List<String> myMovingTestCase){     
      //2. Moving Test
                //Give input in below list
                System.out.println("Moving Test");

		Rover testRover = new Rover();
		testRover.printPosition();// Position               
                myMovingTestCase.forEach(n ->{
                    System.out.println(n);
                    testRover.process(n);
                    testRover.printPosition();
                } );	}  
         
	public static void main(String[] args) {
		
                RoverTest.TestCaseOne(mysetPosition);
                RoverTest.TestCaseTwo (myMovingTestCase);
                Rover TestRover = new Rover();
		// Test Case 3 
                TestRover.setPosition (5,5,N);
                TestRover.printPosition();
                TestRover.setPosition (1,2,N);
                TestRover.printPosition();
                TestRover.process("LMLMLMLMM");
                TestRover.printPosition();
                
                
        }
        
        
}
