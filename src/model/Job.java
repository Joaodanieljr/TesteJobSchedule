package model;

public class Job {
	
	        public int id;

	        public String descricao;

	        public long dataConclusao;

	        public long tempoEstimado;


	        public Job() {}
	        
	        public Job(int id, String descricao, long dataConclusao, long tempoEstimado) {
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

			public long getDataConclusao() {
				return dataConclusao;
			}

			public void setDataConclusao(long dataConclusao) {
				this.dataConclusao = dataConclusao;
			}

			public long getTempoEstimado() {
				return tempoEstimado;
			}

			public void setTempoEstimado(long tempoEstimado) {
				this.tempoEstimado = tempoEstimado;
			}

      
}
