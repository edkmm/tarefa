package br.ucsal.pooa.lab.tarefa;

import java.time.LocalDate;

import br.ucsal.pooa.lab.tarefa.gui.InterfaceGrafica;


public class Programa {

	
	public static void main(String[] args) {
		
		Lista listaTarefas = new Lista();
		listaTarefas.adicionarTarefa("Estudar OO","Devo estudar OO");
		listaTarefas.adicionarTarefa("Tomar cafe","Tomar cafe",true);
		listaTarefas.adicionarTarefa("Ouvir musica","Ouvir Rock",true);
		listaTarefas.adicionarTarefa(new TarefaPrazo("Tarefa Com Prazo","Tem prazo",LocalDate.now()));

		new InterfaceGrafica(listaTarefas);
		

	}
}