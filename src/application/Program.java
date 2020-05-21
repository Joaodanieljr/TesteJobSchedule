package application;

import java.text.ParseException;
import java.util.ArrayList;

import model.Job;
import service.ScheduleJob;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		ScheduleJob sc = new ScheduleJob();
		ArrayList<Job> schedule = sc.schedule();
		
		//exibir no terminal		
		for(Job n: schedule ) {
			System.out.println(n.getId());
		}
		
	}

}
