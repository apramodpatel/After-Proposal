package stepdefination;

public class Locaters {
	
	//Gerar Proposta

	public static String siteurl 			= "http://corretor7.qa.amil.com.br/login";
	public static String username 			= "//input[@id='login']";
	public static String password 			= "//input[@id='senha']";
	public static String Login 				= "//button[@class='proximo']";
	public static String proposalStatus1 	= "//button[@value='EM_DIGITACAO']";
	public static String proposalStatus2 	= "//button[@value='EM_ANALISE']";
	public static String proposalStatus3 	= "//button[@value='APROVADA']";
	public static String proposalStatus4 	= "//button[@value='IMPLANTADA']";
	public static String NovaProposta 		= "//a[contains(@title,'Nova proposta')]";
	public static String coligadoN 			= "//label[@for='coligacao-nao']";
	public static String coligadoY 			= "//label[@for='coligacao-sim']";
	public static String empresacount 		= "//select[@id='numero-empresas']";
	public static String incio				= "//a[contains(.,'Início')]";
	public static String MEIn				= "//label[contains(@for,'mei-nao-0')]";
	public static String MEIy				= "//label[contains(@for,'mei-sim-0')]";
	public static String CNPJ 				= "//input[@id='cnpj-empresa-0']";
	public static String CNPJVerificar 		= "//button[contains(.,'Verificar')]";
	public static String EmpresaName 		= "//input[contains(@id,'nome-empresa-coligada')]";
	public static String SocialName 		= "//input[contains(@id,'cnpj-empresa-razaosocial')]";
	public static String CEP 				= "//input[@id='cep-empresa-0']";
	public static String CEPSearch			= "//button[contains(.,'Buscar')]";
	public static String SelectProduct 		= "//button[@class='proximo']";
	public static String ProductAmil 		= "//label[contains(@for,'16-0')]";
	public static String ProductAmilLife 	= "//label[contains(.,'Amil Life')]";
	public static String ProductOneHealth 	= "//label[contains(.,'One Health')]";
	public static String ProductNext 		= "//label[contains(.,'Next')]";
	public static String Back 				= "//a[contains(.,'Voltar')]";
	public static String Gerar 				= "//button[contains(.,'Gerar Proposta')]";
	
	//Proposal Specific
	public static String LocateProposal 	= "//td[contains(.,'95357215')]/..//button[@class='visualizar-proposta']";
	public static String NewProposal 		= "//a[@title='Nova proposta']";
	
	
	
	//Dados do produtor
	
	public static String Vincular 				= "//a[contains(.,'Vincular')]";
	public static String corretor 				= "//input[@id='codigo-corretor']";
	public static String corretorVerificar 		= "//button[contains(.,'Verificar')]";
	public static String lebelcorretor 			= "//dt[contains(.,'Corretor:')]";
	public static String supervisor 			= ".//*[@id='supervisores']/div/span";
	public static String supervisor2 			= ".//*[@id='supervisores']/div/div/ul/li[2]";
	public static String ddsupervisor			= ".//*[@id='supervisores']/div/div/ul/li[contains(.,'16 - SUELIVALDO FERNANDES PRIMO')]";
	public static String Submit 				= "//button[contains(.,'Vincular')]";
	
	//Dados da empresa
	public static String Preencher 				= "(//a[contains(.,'Preencher')])[1]";
	public static String reduzido				= "//input[@id='nome-empresa-reduzido']";
	public static String Numero 				= "//input[@id='numero-empresa']";
	public static String complemento 			= "//input[@id='complemento-empresa']";
	public static String ContactName 			= "//input[@id='nome-contato']";
	public static String Cargo			 		= "//input[@id='cargo']";
	public static String telefone			 	= "//input[@id='telefone']";
	public static String email 					= "//input[@id='email']";
	public static String save 					= "//button[contains(.,'Salvar')]";
	public static String Backtomain 			= "//a[contains(.,'Voltar')]";
	public static String allproposal 			= "//a[contains(.,'Lista de propostas')]";
	public static String avancar2 				= "//a[contains(.,'Avançar')]";
	
	//Dados dos beneficiários
	public static String Preencher2 			= "(//a[contains(.,'Preencher')])[2]";
	
}
