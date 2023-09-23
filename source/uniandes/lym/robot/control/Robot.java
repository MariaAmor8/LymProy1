/* Robot.java */
/* Generated By:JavaCC: Do not edit this line. Robot.java */
package uniandes.lym.robot.control;

import uniandes.lym.robot.kernel.*;
import uniandes.lym.robot.view.Console;

import java.awt.Point;
import java.io.*;
import java.util.Vector;
import java.util.LinkedList;

@SuppressWarnings("serial")
public class Robot implements RobotConstants {


        private RobotWorldDec world;


        void setWorld(RobotWorld w) {
                world = (RobotWorldDec) w;
        }

        String salida=new String();

//boolean command(uniandes.lym.robot.view.Console sistema) :
//	boolean command(Console sistema):
//	{	
//		
//		int x,y;
//		salida=new String();	
//	}
//
//	
//	{
//		(
//		  (
//		   <RIGHT> "(" ")" {world.turnRight();salida = "Command: Turnright";}
//		| 	<MOV>  "(" x=num() ")" {world.moveForward(x,false);salida = "Command: Moveforward ";}  
//		| 	<HOP>  "(" x=num() ")" {world.moveForward(x,true);salida = "Command:Jumpforward ";}
//		| 	<GO>  "(" x=num() "," y=num()")" {world.setPostion(x,y);salida = "Command:GO ";}  
//		|  <PUT> "("  put() ")"					  			
//		|  <PICK> "(" get()  ")"	
//	    |  < POP > "(" x=num() ")" {world.popBalloons(x); salida = "Comando:  Pop";}
//		) ";" 
//
//		{
//		    try {
//	    			 Thread.sleep(900);
//	    	    } catch (InterruptedException e) {
//	    			        System.err.format("IOException: %s%n", e);
//	    		    }
//	    			 
//			sistema.printOutput(salida);
//			return true;
//		})+
//
//    	| <EOF> {return false;} 
//	}
  final public 
boolean command(Console sistema) throws ParseException {int x,y;
                salida=new String();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case JUMP:
    case WALK:
    case LEAP:
    case TURN:
    case TURNTO:
    case DROP:
    case GET:
    case GRAB:
    case LETGO:{
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case JUMP:{
          jj_consume_token(JUMP);
          jj_consume_token(38);
          jump();
          jj_consume_token(39);
          break;
          }
        case WALK:{
          jj_consume_token(WALK);
          jj_consume_token(38);
          walk();
          jj_consume_token(39);
          break;
          }
        case LEAP:{
          jj_consume_token(LEAP);
          jj_consume_token(38);
          leap();
          jj_consume_token(39);
          break;
          }
        case TURN:{
          jj_consume_token(TURN);
          jj_consume_token(38);
          turn();
          jj_consume_token(39);
          break;
          }
        case TURNTO:{
          jj_consume_token(TURNTO);
          jj_consume_token(38);
          turnTo();
          jj_consume_token(39);
          break;
          }
        case DROP:{
          jj_consume_token(DROP);
          jj_consume_token(38);
          drop();
          jj_consume_token(39);
          break;
          }
        case GET:{
          jj_consume_token(GET);
          jj_consume_token(38);
          get();
          jj_consume_token(39);
          break;
          }
        case GRAB:{
          jj_consume_token(GRAB);
          jj_consume_token(38);
          grab();
          jj_consume_token(39);
          break;
          }
        case LETGO:{
          jj_consume_token(LETGO);
          jj_consume_token(38);
          letGo();
          jj_consume_token(39);
          break;
          }
        default:
          jj_la1[0] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        jj_consume_token(40);
try {
                                 Thread.sleep(900);
                    } catch (InterruptedException e) {
                                        System.err.format("IOException: %s%n", e);
                            }

                        sistema.printOutput(salida);
                        {if ("" != null) return true;}
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case JUMP:
        case WALK:
        case LEAP:
        case TURN:
        case TURNTO:
        case DROP:
        case GET:
        case GRAB:
        case LETGO:{
          ;
          break;
          }
        default:
          jj_la1[1] = jj_gen;
          break label_1;
        }
      }
      break;
      }
    case 0:{
      jj_consume_token(0);
{if ("" != null) return false;}
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
}

  final public void jump() throws ParseException {int x,y;
    x = num();
    jj_consume_token(41);
    y = num();
world.setPostion(x,y);salida = "Command: Jump";
}

  final public void walk() throws ParseException {int x;
    x = num();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 41:{
      jj_consume_token(41);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case FRONT:{
        jj_consume_token(FRONT);
world.moveForward(x, false);salida = "Command: Walk F";
        break;
        }
      case BACK:{
        jj_consume_token(BACK);
world.moveForward(-x, false);salida = "Command: Walk B";
        break;
        }
      case RIGHT:{
        jj_consume_token(RIGHT);
world.moveForward(x, false);salida = "Command: Walk R";
        break;
        }
      case LEFT:{
        jj_consume_token(LEFT);
world.moveForward(-x, false);salida = "Command: Walk L";
        break;
        }
      case NORTH:{
        jj_consume_token(NORTH);
world.moveVertically(x, false);salida = "Command: Walk N";
        break;
        }
      case SOUTH:{
        jj_consume_token(SOUTH);
world.moveVertically(-x, false);salida = "Command: Walk S";
        break;
        }
      case EAST:{
        jj_consume_token(EAST);
world.moveHorizontally(x, false);salida = "Command: Walk E";
        break;
        }
      case WEST:{
        jj_consume_token(WEST);
world.moveHorizontally(-x, false);salida = "Command: Walk W";
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      ;
    }
world.moveForward(x,false);salida = "Command: Walk";
}

  final public void leap() throws ParseException {int x;
    x = num();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 41:{
      jj_consume_token(41);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case FRONT:{
        jj_consume_token(FRONT);
world.moveForward(x, true);salida = "Command: Leap F";
        break;
        }
      case BACK:{
        jj_consume_token(BACK);
world.moveForward(-x, true);salida = "Command: Leap B";
        break;
        }
      case RIGHT:{
        jj_consume_token(RIGHT);
world.moveForward(x, true);salida = "Command: Leap R";
        break;
        }
      case LEFT:{
        jj_consume_token(LEFT);
world.moveForward(-x, true);salida = "Command: Leap L";
        break;
        }
      case NORTH:{
        jj_consume_token(NORTH);
world.moveVertically(x, true);salida = "Command: Leap N";
        break;
        }
      case SOUTH:{
        jj_consume_token(SOUTH);
world.moveVertically(-x, true);salida = "Command: Leap S";
        break;
        }
      case EAST:{
        jj_consume_token(EAST);
world.moveHorizontally(x, true);salida = "Command: Leap E";
        break;
        }
      case WEST:{
        jj_consume_token(WEST);
world.moveHorizontally(-x, true);salida = "Command: Leap W";
        break;
        }
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      ;
    }
world.moveForward(x,true);salida = "Command: Leap";
}

  final public void turn() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case RIGHT:{
      jj_consume_token(RIGHT);
world.turnRight();salida = "Command: turn R";
      break;
      }
    case LEFT:{
      jj_consume_token(LEFT);
world.turnRight();salida = "Command: turn L";
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void turnTo() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NORTH:{
      jj_consume_token(NORTH);
world.turnRight();salida = "Command: turnTo N";
      break;
      }
    case SOUTH:{
      jj_consume_token(SOUTH);
world.turnRight();salida = "Command: turnTo S";
      break;
      }
    case EAST:{
      jj_consume_token(EAST);
world.turnRight();salida = "Command: turnTo E";
      break;
      }
    case WEST:{
      jj_consume_token(WEST);
world.turnRight();salida = "Command: turnTo W";
      break;
      }
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void drop() throws ParseException {int x=1;
    x = num();
world.putChips(x);salida = "Command: Drop Chips";
}

  final public void get() throws ParseException {int x=1;
    x = num();
world.pickChips(x);salida = "Command: Pick chips";
}

  final public void grab() throws ParseException {int f=1;
    f = num();
world.grabBalloons(f);salida="Command:  Pick balloons";
}

  final public void letGo() throws ParseException {int f=1;
    f = num();
world.putBalloons(f); salida = "Command: Put Balloons";
}

//boolean command(Console sistema):
//	{	
//		
//		int x,y;
//		salida=new String();	
//	}
//
//	{
//		(
//		  (
//		   <JUMP>  "(" x=num() "," y=num()")" {world.setPostion(x,y);salida = "Command:GO ";}
//		| <TURN> "(right)" {world.turnRight();salida = "Command: Turnright";}
//		| 	<GRAB>  "(" x=num() ")" {world.moveForward(x,false);salida = "Command: Moveforward ";}  
//		| 	<DROP>  "(" x=num() ")" {world.moveForward(x,true);salida = "Command:Jumpforward ";} 
//		) ";" 
//
//		{
//		    try {
//	    			 Thread.sleep(900);
//	    	    } catch (InterruptedException e) {
//	    			        System.err.format("IOException: %s%n", e);
//	    		    }
//	    			 
//			sistema.printOutput(salida);
//			return true;
//		})+
//
//    	| <EOF> {return false;} 
//	}

//	void put() :
//	{
//		int f=1;	
//	}
//	{
//		( <CHIPS>    "," f=num() {world.putChips(f); salida = "Command:  Put Chips"; })
//		|  	  ( <BALLOONS>   "," f=num() {world.putBalloons(f); salida = "Command:  Put Balloons";})	 
//
//	}
//
//	void get() :
//	{
//		int f=1;	
//	}
//	{
//		( <CHIPS>   "," f=num() {world.pickChips(f);salida = "Command:  Pick chips";})
//		|  	  ( <BALLOONS>   "," f=num() {world.grabBalloons(f);salida="Command:  Pick balloons";})	 
//
//	}

//VAMO A HACE UNA NUEVA GRAM
        /**
	
	 * Unsigned decimal number
	 * @return the corresponding value of the string
	 * @error  corresponding value is too large
	 */
  final public 
        int num() throws ParseException, Error {int total=1;
    jj_consume_token(NUM);
try
                        {
                                total = Integer.parseInt(token.image);
                        }
                        catch (NumberFormatException ee)
                        {
                                {if (true) throw new Error("Number out of bounds: "+token.image+" !!");}
                        }
                        {if ("" != null) return total;}
    throw new Error("Missing return statement in function");
}

  /** Generated Token Manager. */
  public RobotTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[9];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x3fe0,0x3fe0,0x3fe1,0xfc000000,0x0,0xfc000000,0x0,0x80000000,0x3c000000,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x0,0x0,0x0,0x3,0x200,0x3,0x200,0x1,0x0,};
	}

  /** Constructor with InputStream. */
  public Robot(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Robot(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new RobotTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Robot(java.io.Reader stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new RobotTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new RobotTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Robot(RobotTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(RobotTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[42];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 9; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 42; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
