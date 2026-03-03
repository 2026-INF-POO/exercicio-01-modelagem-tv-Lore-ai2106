Class TV {
  int tamanho;
  int volume;
  String marca;
  int voltagem;
  int canal;
  int consumo;

  void ligar () {
    consumo = tamanho * voltagem;
    IO.print("Consumo é: " + consumo);
  }
  void desligar() {

  }
  void volumeaumentar() {
    if(volume<10){
      volume++;
    }
    
  }
  void volumediminuir() {
    if(volume>1){
      volume--;
    }
    
  }
  void canalmais() {
    canal++;
  }
  void canalmenos() {
    canal--;
  }

}
    
