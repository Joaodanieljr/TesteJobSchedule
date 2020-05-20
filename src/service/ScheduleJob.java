package service;

import java.util.ArrayList;
import java.util.List;

import model.Job;
import repository.RepositoryJob;

public class ScheduleJob {

	public List<Job> schedule(){
		
		RepositoryJob repository = new RepositoryJob();

		List<Job> jobs = repository.getListaJobs();
		List<Job> schedule = new ArrayList<>();
    
        	
    	for(Job n: jobs) {
    		if (n.dataConclusao <= 8L 
    			&& n.dataConclusao <= n.dataFinalJob 
    			&& (n.dataInicialJob + n.tempoEstimado) <= n.dataFinalJob )
    		{
    			
    			schedule.add(n);
    		}
    	}
    	
    	
    	for(Job n: schedule) {
    		
    		System.out.println(n.getId());
    	}
    
    
    return jobs;
	}
}
