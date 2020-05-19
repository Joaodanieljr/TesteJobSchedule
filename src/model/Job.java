package model;

public class Job implements Comparable<Job> {
	
	        public int id;

	        public String descricao;

	        public Long dataConclusao;

	        public Long tempoEstimado;


	        @Override
			public int compareTo(Job j){
				return getDataConclusao().compareTo(j.dataConclusao);
			}
	        
	        public Job() {}
	        
	        public Job(int id, String descricao, Long dataConclusao, Long tempoEstimado) {
				this.id = id;
				this.descricao = descricao;
				this.dataConclusao = dataConclusao;
				this.tempoEstimado = tempoEstimado;
				
			}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getDescricao() {
				return descricao;
			}

			public void setDescricao(String descricao) {
				this.descricao = descricao;
			}

			public Long getDataConclusao() {
				return dataConclusao;
			}

			public void setDataConclusao(Long dataConclusao) {
				this.dataConclusao = dataConclusao;
			}

			public Long getTempoEstimado() {
				return tempoEstimado;
			}

			public void setTempoEstimado(Long tempoEstimado) {
				this.tempoEstimado = tempoEstimado;
			}

      
}
