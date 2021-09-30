package exerciceSondage;

public class EssaiSondage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Questionnaire s1 = new Questionnaire(5,"Quel-est-il le grand monument au monde ?");
		
		String[] reponses = new String[5];
		reponses[0]="Youbi";
		reponses[1]="Mini";
		reponses[2]="Filo";
		reponses[3]="mirna";
		reponses[4]="fati";
		
		
		s1.setReponses(reponses);
		
		s1.afficheQuestionnaire();
	}

}
