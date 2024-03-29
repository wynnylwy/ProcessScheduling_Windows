/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpu;

/**
 *
 * @author user
 */
import Items.Cell;
import Items.Job;
import Items.Queue;
import java.util.ArrayList;

/**
 * @author Ahmed Elmowafy
 * Responsible for viewing the ready queue in the GUI frame by setting
 * the place and the color of every job representation
 */
public class ReadyChart {
    private static int readyX = 450; // start drawing point on x-coordinate
    private static final int readyY = 480; // ready queue Chart location on y-coordinate
    public static ArrayList<Cell> List = new ArrayList<Cell>(8); // list of ready queue jobs' represnation  
    
    /**
     * fill the ready queue representation list by the new ready queue jobs.
     * converts jobs to cell representations
     * @param jobList ready queue job list
     */
    public static void update(Queue jobList){
        
        for(int i=0 ; i<jobList.size() ; i++)
        {
            Job temp = jobList.getJob(i);
            List.add(Cell.createReadyQueueCell(readyX, readyY, temp.jobNumber)); // convert jobs to cells
            readyX += 40; // set next job location
        }
    }
    
    /**
     * clear Ready queue representation list out of cell objects, and reset other variables 
     */
    public static void clear(){
         List.clear();
         readyX = 450; // start locatoin on x-coordinate
     }
}
