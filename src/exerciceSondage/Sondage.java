package exerciceSondage;

public class Sondage {
	
	private int nombreChoix;
	private String question;
	
	
	
	private void afficheQuestionnaire() {
		
		
		
		
		
	}
	
	
	
	
	
	public Sondage(int numQuestion, String question) {
		this.nombreChoix = numQuestion;
		this.question = question;
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
	
}
