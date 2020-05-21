package repository;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import model.Job;

public class RepositoryJob {
	


	public List<Job> getListaJobs() throws ParseException{
		
		
		
		
		List<Job> listaJobs = new ArrayList<>();
		
		Job job1 = new Job ( 1,"Importação de arquivos de fundos", dataLong("2019-11-10 12:00:00"),HoraMili(2),dataLong("2019-11-10 09:00:00"),dataLong("2019-11-11 12:00:00"));

	    Job job2 = new Job (2,"Importação de dados da Base Legada",dataLong("2019-11-11 12:00:00,"),HoraMili(4),dataLong("2019-11-10 09:00:00"),dataLong("2019-11-11 12:00:00"));

	    Job job3 = new Job (3,"Importação de dados de integração",dataLong("2019-11-11 08:00:00"),HoraMili(6),dataLong("2019-11-10 09:00:00"),dataLong("2019-11-11 12:00:00") );
	    
	    listaJobs.add(job1);
	    listaJobs.add(job2);
	    listaJobs.add(job3);
		
	    Collections.sort(listaJobs);
	    
	    return listaJobs;
		
		}
	
	//func: transformar Date para Long
	public Long dataLong(String d) throws ParseException{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		df.setLenient(false);
		Date a = df.parse(d);
		return a.getTime();
	}
	
	//func: transformar hora para Long
		public Long HoraMili (int hora){
			return hora*3600000L;
		}
}


