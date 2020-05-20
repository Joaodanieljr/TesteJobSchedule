package repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Job;

public class RepositoryJob {

	public List<Job> getListaJobs(){
		
		List<Job> listaJobs = new ArrayList<>();
		
		Job job1 = new Job ( 1,"Importação de arquivos de fundos", 9L,8L,5L,10L);

	    Job job2 = new Job (2,"Importação de dados da Base Legada",5L,5L,5L,10L);

	    Job job3 = new Job (3,"Importação de dados de integração",1L,1L,5L,10L );
	    
	    listaJobs.add(job1);
	    listaJobs.add(job2);
	    listaJobs.add(job3);
		
	    Collections.sort(listaJobs);
	    
	    return listaJobs;
		
		}
}
