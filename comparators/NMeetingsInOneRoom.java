package comparators;

//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

//class GFG {
//  public static void main(String args[]) throws IOException {
//      BufferedReader br =
//          new BufferedReader(new InputStreamReader(System.in));
//      int t = Integer.parseInt(br.readLine().trim());
//
//      while (t-- > 0) {
//          String inputLine[] = br.readLine().trim().split(" ");
//          int n = Integer.parseInt(inputLine[0]);
//
//          int start[] = new int[n];
//          int end[] = new int[n];
//
//          inputLine = br.readLine().trim().split(" ");
//          for (int i = 0; i < n; i++)
//              start[i] = Integer.parseInt(inputLine[i]);
//
//          inputLine = br.readLine().trim().split(" ");
//          for (int i = 0; i < n; i++) 
//              end[i] = Integer.parseInt(inputLine[i]);
//              
//          int ans = new Solution().maxMeetings(start, end, n);
//          System.out.println(ans);
//      }
//  }
//}

//} Driver Code Ends

class meeting{
  int start;
  int end;
  int pos;
  meeting(int start , int end , int pos){
      this.start =start;
      this.end = end;
      this.pos = pos;
  }
}

class meetingComparator implements Comparator<meeting>{
  public int compare(meeting o1 , meeting o2){
      if(o1.end < o2.end) return -1;
      else if(o1.end > o2.end) return 1;
      else if( o1.pos < o2.pos) return -1;
      return 1;
  }
}

class Solution 
{
  //Function to find the maximum number of meetings that can
  //be performed in a meeting room.
  public static int maxMeetings(int start[], int end[], int n)
  {
      // add your code here
      ArrayList<meeting> al = new ArrayList<>();
      for(int i =0;i<start.length;i++){
          al.add(new meeting(start[i],end[i],i+1));
      }
      
      comp mc = new comp();//creating an object 
      Collections.sort(al , mc);
      ArrayList<Integer> res = new ArrayList<>();
      res.add(al.get(0).pos);
      int prev_end_time = al.get(0).end;
      for(int i =1;i<start.length;i++){
          if(prev_end_time < al.get(i).end){
              res.add(al.get(i).pos);
              prev_end_time = al.get(i).end;
          }
      }return res.size();
  }
}

