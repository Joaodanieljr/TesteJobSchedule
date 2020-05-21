package service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import model.Job;
import repository.RepositoryJob;

public class ScheduleJob {

	public ArrayList<Job> schedule() throws ParseException{
		
		RepositoryJob repository = new RepositoryJob();

		List<Job> jobs = repository.getListaJobs();
		ArrayList<Job> schedule = new ArrayList<>();
    
        	
    	for(Job n: jobs) {
    		if (n.tempoEstimado <= 28800000L //8horas
    			&& n.dataConclusao <= n.dataFinalJob 
    			&& (n.dataInicialJob + n.tempoEstimado) <= n.dataFinalJob )
    		{
    			schedule.add(n);
    		}
    	}
        
    return schedule;
	}
	
	
	
}
