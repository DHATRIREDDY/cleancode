package cleancode.task;
import java.io.PrintStream;
import java.util.*;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
public class userInterface {
	public static void main(String args[])
    {
  	  Scanner sc=new Scanner(System.in);
  	  PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
  	  int principal_amount;
  	  double rate_of_interest;
  	  int no_of_times;
  	  int time;
  	  out.print("SIMPLE AND COMPOUND INTEREST");
  	  out.print("\nEnter principal amount:");
  	  principal_amount=sc.nextInt();
  	  out.print("\nEnter rate of interest:");
  	  rate_of_interest=sc.nextDouble();
  	  out.print("\nEnter time in years:");
  	  time=sc.nextInt();
  	  out.print("\nEnter no. of times interest applied");
  	  no_of_times=sc.nextInt();
  	  interest myinterest=new interest();
  	  double simplevalue=myinterest.SimpleInterest(principal_amount, rate_of_interest, time);
  	  out.print("\nSimple interest"+simplevalue);
  	  double compoundvalue=myinterest.CompoundInterest(principal_amount, rate_of_interest, time, no_of_times);
  	  out.print("\ncompound interest"+compoundvalue);
  	  
    }
}
