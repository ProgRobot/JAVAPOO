package exerciceSondage;

public class Questionnaire {
	
	private int nombreChoix;
	private String question;
	private String[] reponses;
	
	public void afficheQuestionnaire() {
		System.out.println(this.question);
		for(int i=0;i < reponses.length;i++) {
			System.out.println(((i+1)+" - "+reponses[i]));
		}
	}
	
	public Questionnaire(int numQuestion, String question) {
		this.nombreChoix = numQuestion;
		this.question = question;
		this.reponses = new String[nombreChoix];
	}

	public int getNumQuestion() {
		return nombreChoix;
	}

	public void setNumQuestion(int numQuestion) {
		this.nombreChoix = numQuestion;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setReponses(String[] reponses) {
		this.reponses = reponses;
	}
	
}
