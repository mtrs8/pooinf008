package prova.model;
public class Gene{
   private int valor;
   
   public Gene(int valor){
       setValor(valor);
   }
   
   public Gene(Gene gene){
       setValor(gene.getValor());
   }
   
   public int getValor(){
       return this.valor;
   }
   
   public void setValor(int valor){
       this.valor = valor;
   }
   
   public Gene clonar(){
       Gene gene = new Gene(this.getValor());
       return gene;
   }
   
   public boolean equals(Gene gene){
       return this.getValor() == gene.getValor();
   }
   
   public int getAfinidade(int valorProteina){
       return Math.abs(this.getValor() - valorProteina);
   }   
   
}
