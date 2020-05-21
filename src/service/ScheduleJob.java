package service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import model.Job;
import repository.RepositoryJob;

public class ScheduleJob {

	public List<Job> schedule() throws ParseException{
		
		RepositoryJob repository = new RepositoryJob();

		List<Job> jobs = repository.getListaJobs();
		List<Job> schedule = new ArrayList<>();
    
        	
    	for(Job n: jobs) {
    		if (n.tempoEstimado <= 28800000L //8horas
    			&& n.dataConclusao <= n.dataFinalJob 
    			&& (n.dataInicialJob + n.tempoEstimado) <= n.dataFinalJob )
    		{
    			
    			schedule.add(n);
    			
    		}
    	}
    	
    	 	
    	for(Job n: schedule) {
    		
    		System.out.println(n.getId());
    	}
    
    
    return schedule;
	}
}
