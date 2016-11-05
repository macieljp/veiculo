import java.util.GregorianCalendar;

/**
 * @author Joao Paulo Bernardino Maciel
 * @author Josiel Faleiros Alves
 */
public class Teste{
    public static void main(String[] args) {
		GregorianCalendar data = new GregorianCalendar();
		int dia = data.get(data.DAY_OF_MONTH);		
		int mes = data.get(data.MONTH)+1;
		int ano = data.get(data.YEAR);
		int hora = data.get(data.HOUR_OF_DAY);
		int minuto = data.get(data.MINUTE);
		int segundo = data.get(data.SECOND);

		Passeio passeio;
		Carga carga;
		Leitura input = new Leitura();
        BDVeicVet bd = new BDVeicVet();
        int opcao = 10;
		int opcao2 = 0;
		boolean condicao = true;

        do {
            String entr = input.inDados(
                "\n\t+---------------------------------------------------------------+" +
                "\n\t|\tSistema de Gestão de Veículos - Menu Inicial            |" +
                "\n\t+---------------------------------------------------------------+" +
                "\n\t|\t1)_ Cadastrar Veículo de Passeio                        |" +
                "\n\t|\t2)_ Cadastrar Veículo de Carga                          |" +
                "\n\t|\t3)_ Imprimir Todos os Veículos de Passeio               |" +
                "\n\t|\t4)_ Imprimir Todos os Veículos de Carga                 |" +
                "\n\t|\t5)_ Imprimir Veículo de Passeio pela Placa              |" +
                "\n\t|\t6)_ Imprimir Veículo de Carga pela Placa                |" +
                "\n\t|\t7)_ Alterar dados do Veículo de Passeio pela Placa      |" +
                "\n\t|\t8)_ Alterar dados do Veículo de Carga pela Placa        |" +
                "\n\t|\t9)_ Sair do Sistema                                     |" +
                "\n\t|                                                               |" +
                "\n\t|                                                               |" +
                "\n\t|\tEscolha uma opção:                                      |"
                );
			try{
				opcao = Integer.parseInt(entr);
			}
			catch(NumberFormatException e){
				System.out.println("\n A entrada deve ser um número");
			}
            int result;
            switch(opcao){
				case 1:
	
					do{
	
						passeio = new Passeio();						
						boolean tempbq = true;
						while(tempbq){
							passeio.setPlaca(input.inDados(("\nDigite a placa do veículo: \n\n>")));
							tempbq = false;
						}
						
						
						passeio.setMarca(input.inDados(("\n Digite a marca do veículo: \n")));
						passeio.setModelo(input.inDados(("\n Digite o modelo do veículo: \n")));				
						passeio.setCor(input.inDados(("\n Digite a cor do veículo: \n")));			
						passeio.setQtdePassageiro(Integer.parseInt(input.inDados(("\n Digite a quantidade de passageiros do veículo: \n"))));
						passeio.setQtdRodas(Integer.parseInt(input.inDados(("\n Digite a quantidade de rodas do veículo: \n"))));
						try{
							passeio.setVelocMax(Integer.parseInt(input.inDados(("\n Digite a velocidade maxima do veículo (km/h):\n"))));
						}
						catch(VelocException ve){
							ve.printException();
							try{
								passeio.setVelocMax(150);
							}
							catch(VelocException ve2){
								ve.printException();
							}
						}
						
						passeio.getMotor().setQtdPistoes(Integer.parseInt(input.inDados(("\n Digite a quantidade de pistões do motor do veículo: \n"))));
						passeio.getMotor().setPotencia(Integer.parseInt(input.inDados(("\n Digite a potência do motor do veículo: \n"))));
						
						try{
							bd.cadastrarVeiculoPasseio(passeio);
						}catch(VeicExistException vee){
							vee.printException();
	                    	int opp = Integer.parseInt(input.inDados("\n\nDeseja sobreescrever? [1 - Sim / 2 - Nao]"));
	                    	if(opp == 1){
	        					bd.alterarDadosPasseio(passeio);
	                    	}
	                    }
						
	                    condicao = true;
						while(condicao){
							try{
		                    	opcao2 = Integer.parseInt(input.inDados("\n [Deseja cadastrar outro veículo do mesmo tipo? 1 - Sim / 2 - Nao]"));
		                    	condicao = false;
		                    }
		                    catch(NumberFormatException er_num){
								System.out.println("\n O valor deve ser um número");
							}
						}
	            	}while (opcao2 == 1);
					break;
				case 2:
					do{
						boolean tempbc = true;
	
						carga = new Carga();
						while(tempbc){
								carga.setPlaca(input.inDados(("\nDigite a placa do veículo: \n")));
								tempbc = false;
						}
						carga.setMarca(input.inDados(("\n Digite a marca do veículo: \n")));
						carga.setModelo(input.inDados(("\n Digite o modelo do veículo: \n")));				
						carga.setCor(input.inDados(("\n Digite a cor do veículo: \n")));				
						carga.setQtdRodas(Integer.parseInt(input.inDados(("\n Digite a quantidade de rodas do veículo: \n"))));
						try{
							carga.setVelocMax(Integer.parseInt(input.inDados(("\n Digite a velocidade maxima do veículo (km/h): \n"))));
						}
						catch(VelocException ve){
							ve.printException();
							try{
								carga.setVelocMax(250);
							}catch(VelocException vee){
								vee.printException();
							}
						}
						
						carga.getMotor().setQtdPistoes(Integer.parseInt(input.inDados(("\n Digite a quantidade de pistões do motor do veículo: \n"))));
						carga.getMotor().setPotencia(Integer.parseInt(input.inDados(("\n Digite a potência do motor do veículo: \n"))));
						carga.setTara(Integer.parseInt(input.inDados(("\n Digite a tara do veículo: \n"))));
						carga.setCargaMax(Integer.parseInt(input.inDados(("\n Digite a carga máxima do veículo: \n"))));
					
						
						try{
							bd.cadastrarVeiculoCarga(carga);
	                    }
	                    catch(VeicExistException vee){
							vee.printException();
	                    	int opp = Integer.parseInt(input.inDados(" [Deseja sobreescrever? 1 - Sim / 2 - Não]"));
	                    	if(opp == 1){
	                    		bd.alterarDadosCarga(carga);
	                    		break;
	                    	}
	                    }
	                    condicao = true;
						while(condicao){
							try{
		                    	opcao2 = Integer.parseInt(input.inDados("\n [Deseja cadastrar outro veículo do mesmo tipo? 1 - Sim / 2 - Nao]"));
		                    	condicao = false;
		                    }
		                    catch(NumberFormatException er_num){
								System.out.println("\n O valor deve ser numerico!");
							}
						}
	            	}while (opcao2 == 1);
	            	break;
				case 3:
					System.out.println("\nDATA ATUAL:  "+dia+"/"+mes+"/"+ano+" - " +hora+ ":" +minuto+":" +segundo);
					for(Passeio temp: bd.procurarTodosPasseio()){
						imprimirPasseio(temp);
					}
					break;
				case 4:
					System.out.println("\nDATA ATUAL:  "+dia+"/"+mes+"/"+ano+" - " +hora+ ":" +minuto+":" +segundo);
					for(Carga temp: bd.procurarTodosCarga()){
						imprimirCarga(temp);
					}
					break;
				case 5:
					passeio = new Passeio();
					System.out.println("\n-- Imprimir Veículo de Passeio pela Placa -- \n");
					passeio.setPlaca(input.inDados(("\nDigite a placa do veículo \n")));

					passeio = bd.procurarPasseioPorPlaca(passeio.getPlaca());
	
					if (passeio == null){
						System.out.println("\n[Placa não encontrada!]\n");
					}
					else{
						imprimirPasseio(passeio);
					}
					break;
				case 6:
					carga = new Carga();
					System.out.println("\n-- Imprimir Veículo de Carga pela Placa -- \n");
					carga.setPlaca(input.inDados(("\nDigite a placa do veículo\n")));
					carga = bd.procurarCargaPorPlaca(carga.getPlaca());
					if (carga == null){
						System.out.println("\n[Placa não encontrada!]\n");
					}
					else{
						imprimirCarga(carga);
					}
					break;
				case 7:
					passeio = new Passeio();
					System.out.println("\n-- Alterar dados do Veículo de Passeio pela Placa -- \n");
					passeio.setPlaca(input.inDados(("\nDigite a placa do veículo \n")));

					passeio = bd.procurarPasseioPorPlaca(passeio.getPlaca());
	
					if (passeio == null){
						System.out.println("\nPlaca não encontrada\n");
					}
					else{
						System.out.println("\n-- Digite as novas informações: -- \n");
						passeio.setMarca(input.inDados(("\n Digite a marca do veículo: \n")));
						passeio.setModelo(input.inDados(("\n Digite o modelo do veículo: \n")));				
						passeio.setCor(input.inDados(("\n Digite a cor do veículo: \n")));				
						passeio.setQtdePassageiro(Integer.parseInt(input.inDados(("\n Digite a quantidade de passageiros do veículo: \n"))));
						passeio.setQtdRodas(Integer.parseInt(input.inDados(("\n Digite a quantidade de rodas do veículo: \n"))));
						try{
							passeio.setVelocMax(Integer.parseInt(input.inDados(("\n Digite a velocidade maxima do veículo (km/h):\n"))));
						}
						catch(VelocException ve){
							ve.printException();
							try{
								passeio.setVelocMax(150);
							}
							catch(VelocException ve2){
								ve.printException();
							}
						}
						passeio.getMotor().setQtdPistoes(Integer.parseInt(input.inDados(("\n Digite a quantidade de pistões do motor do veículo: \n"))));
						passeio.getMotor().setPotencia(Integer.parseInt(input.inDados(("\n Digite a potência do motor do veículo: \n"))));
	
						bd.alterarDadosPasseio(passeio);
					}
					break;
				case 8:
					carga = new Carga();
					System.out.println("\n-- Alterar dados do Veículo de Carga pela Placa -- \n");
					carga.setPlaca(input.inDados(("\nDigite a placa do veículo \n")));
					carga = bd.procurarCargaPorPlaca(carga.getPlaca());
	
					if (carga == null){
						System.out.println("\nPlaca não encontrada\n");
					}
					else{
						System.out.println("\n-- Digite as novas informações: -- \n");
						carga.setMarca(input.inDados(("\n Digite a marca do veículo: \n")));
						carga.setModelo(input.inDados(("\n Digite o modelo do veículo: \n")));				
						carga.setCor(input.inDados(("\n Digite a cor do veículo: \n")));				
						carga.setQtdRodas(Integer.parseInt(input.inDados(("\n Digite a quantidade de rodas do veículo: \n"))));
						try{
							carga.setVelocMax(Integer.parseInt(input.inDados(("\n Digite a velocidade maxima do veículo (km/h): \n"))));
						}
						catch(VelocException ve){
							ve.printException();
							try{
								carga.setVelocMax(250);
							}
							catch(VelocException ve2){
								ve.printException();
							}
						}
						carga.getMotor().setQtdPistoes(Integer.parseInt(input.inDados(("\n Digite a quantidade de pistões do motor do veículo: \n"))));
						carga.getMotor().setPotencia(Integer.parseInt(input.inDados(("\n Digite a potência do motor do veículo: \n"))));
						carga.setTara(Integer.parseInt(input.inDados(("\n Digite a tara do veículo: \n"))));
						carga.setCargaMax(Integer.parseInt(input.inDados(("\n Digite a carga máxima do veículo: \n"))));
	
						bd.alterarDadosCarga(carga);
					}
					break;
				case 9:
					System.out.println("Saindo do sistema...");
					break;
				default:
					break;
				}
		}while(opcao != 9);
    }

	private static void imprimirCarga(Carga temp) {
		System.out.println(
				"\nVEICULO DE CARGA............ " +
				"\nPlaca:...................... " +temp.getPlaca() +
				"\nMarca:...................... " +temp.getMarca()+
				"\nModelo:..................... " +temp.getModelo()+
				"\nCor:........................ " +temp.getCor()+
				"\nVelocicdade Máxima (m/h):... " +temp.getVelocMax()+
				"\nTara:....................... " +temp.getTara()+
				"Carga Máxima:................. " +temp.getCargaMax()+
				"\nQuantidade de Rodas:........ " +temp.getQtdRodas()+
				"\nQuantidade de Pistões:...... " +temp.getMotor().getQtdPistoes()+
				"\nPotência:................... " +temp.getMotor().getPotencia()+
				"\nCalculo Val. Numericos:..... " +temp.calcular() + "\n\n"
			);		
	}

	private static void imprimirPasseio(Passeio temp) {
		System.out.println(
				"\nVEICULO DE PASSEIO.......... " +
				"\nPlaca:...................... " +temp.getPlaca() +
				"\nMarca:...................... " +temp.getMarca()+
				"\nModelo:..................... " +temp.getModelo()+
				"\nCor:........................ " +temp.getCor()+
				"\nVelocicdade Máxima (m/h):... " +temp.getVelocMax()+
				"\nQuantidade de Passageiros:.. " +temp.getQtdePassageiro()+
				"\nQuantidade de Rodas:........ " +temp.getQtdRodas()+
				"\nQuantidade de Pistões:...... " +temp.getMotor().getQtdPistoes()+
				"\nPotência:................... " +temp.getMotor().getPotencia()+
				"\nCalculo Strings:............ " +temp.calcular() + "\n\n"
			);
	}

}
